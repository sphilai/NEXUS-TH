/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3506;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3506CriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtTransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS3506.<BR>
 * WS3506のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 34 $
 */
public class Ws3506TransactFacadeServiceImpl extends
    AbstractTransactFacadeService<ResultDomain, Ws3506CriteriaDomain> {

    /**
     * <p>
     * WsBhtTransferService
     * </p>
     */
    private WsBhtTransferService wsBhtTransferService;

    /**
     * <p>
     * Default constructor
     * </p>
     */
    public Ws3506TransactFacadeServiceImpl() {
    }
    
    /**
     * <p>
     * Setter method for wsBhtTransferService.
     * </p>
     *
     * @param wsBhtTransferService
     *            Set for wsBhtTransferService
     */
    public void setWsBhtTransferService(
            WsBhtTransferService wsBhtTransferService) {
        this.wsBhtTransferService = wsBhtTransferService;
    }

    /**
     * <p>
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary
     * for the process.<BR>
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @return Processing result   処理結果
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected Ws3506CriteriaDomain filterDomain(Ws3506CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
    }

    /**
     * <p>
     * Consistency check.<BR>
     * 整合性チェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateConsistency(Ws3506CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * <p>
     * Database check.<BR>
     * データベースチェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateDatabase(Ws3506CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        // Create an Error List
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        String trNo = inputDomain.getTrNo();
        String editCnt = inputDomain.getEditCnt();
        BigDecimal editCntBigDecimal = null;
        if(editCnt != null && !"".equals(editCnt)){
            editCntBigDecimal = new BigDecimal(editCnt);
        }
        TtTransferCriteriaDomain ttTransferCriteria = new TtTransferCriteriaDomain();
        ttTransferCriteria.setTrNo(trNo);
        
         // TR_STATUS check
        TtTransferDomain ttTransfer = wsBhtTransferService
            .searchTtTransfer(ttTransferCriteria);
        if(ttTransfer == null){
            MessageDomain msgTrStatus = new MessageDomain(
                trNo, NXS_E1_6004, new String[] {ttTransferCriteria.getTrNo()});
            errorList.add(msgTrStatus);
        } else{
            if (!TR_STATUS_ACTIVATE_TR.equals(ttTransfer.getTrStatus())) {
                MessageDomain msgTrStatus = new MessageDomain(
                    trNo, NXS_E1_6010, new String[] {ttTransfer.getTrStatus()});
                errorList.add(msgTrStatus);
            }else{
                //Thalerngsak check edit count equals from BHT 
                if(editCntBigDecimal != null && !editCntBigDecimal.equals(ttTransfer.getEditCnt())){
                    MessageDomain msgTrStatus = new MessageDomain(
                        trNo, NXS_E1_6012, new String[] {ttTransfer.getEditCnt().toString()});
                    errorList.add(msgTrStatus);
                }
            }
        }
        // If there is an error
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * <p>
     * Single item check.<BR>
     * 単項目チェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateItems(Ws3506CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<Ws3506CriteriaDomain> valid = new Validator<Ws3506CriteriaDomain>(
                inputDomain);

        String[] properties = { "dscId", "trNo", "trItemTyp", "trRcvMethTyp", "screenId" };

        // single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3506);

        // if there is an error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * 
     * callServices
     * 
     * 
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @return Processing result   処理結果
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @SuppressWarnings("unchecked")
    @Override
    protected Ws3506TransactFacadeServiceResultDomain callServices(
        Ws3506CriteriaDomain inputDomain) throws GscmApplicationException,
        ApplicationException {

        // obtain user information
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String dscId = inputDomain.getDscId();
        String trNo = inputDomain.getTrNo();
        String trItemTyp = inputDomain.getTrItemTyp();
        String trRcvMethTyp = inputDomain.getTrRcvMethTyp();
        String screenId = inputDomain.getScreenId();
        // obtain user information
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(inputDomain.getDscId());
        // select USR_NM_EN
        TmUserDomain tmUser = wsBhtTransferService.searchUserInfo(tmUserCriteria);
        String userNm = tmUser.getUsrNmEn();
        // set update values
        TtTransferDomain updateDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        updateDomain.setTrStatus(TR_STATUS_RECEIVED_TR);
        updateDomain.setTrRcvDscId(dscId);
        updateDomain.setTrRcvNm(userNm);
        updateDomain.setTrRcvDt(timestamp);
        updateDomain.setTrRcvMethTyp(trRcvMethTyp);
        updateDomain.setComUpdateUserId(dscId);
        updateDomain.setComUpdateFuncId(screenId);
        
        // Update Value Of W/H transfer 
        wsBhtTransferService.updateTtTransfer(updateDomain, criteria);
        
        List<Ws3506UpdateDomain> mainMarkList = new ArrayList<Ws3506UpdateDomain>();
        // In case trItemTyp = 1 (by CML)
        if (TR_ITEM_TYP_CML.equals(trItemTyp)) {
            WsBhtTransferDomain domain = new WsBhtTransferDomain();
            domain.setTrNo(trNo);
            // Get Main Mark list
            mainMarkList = wsBhtTransferService.searchMainMarkList(domain);

            // Loop and Update TT_PLTZ records that belong TR
            TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
            TtPltzDomain ttPltzDomain = new TtPltzDomain();

            for (int i = 0; i < mainMarkList.size(); i++ ) {
                // Set Update Condition Domain
                ttPltzCriteria.setMainMark(mainMarkList.get(i).getMainMark());
                // Set Update Value Domain
                ttPltzDomain.setLastTrStatus(TR_STATUS_RECEIVED_TR);
                ttPltzDomain.setLastTrRcvDt(timestamp);
                ttPltzDomain.setComUpdateUserId(dscId);
                ttPltzDomain.setComUpdateFuncId(screenId);
                
                // Update TT_PLTZ records that belong TR
                wsBhtTransferService.updateTtPltz(ttPltzDomain,
                    ttPltzCriteria);
            }
        }
        
        // Get editCnt from TT_TRANSFER
        TtTransferCriteriaDomain ttTranferCriteria = new TtTransferCriteriaDomain();
        ttTranferCriteria.setTrNo(trNo);
        TtTransferDomain ttTransfer = wsBhtTransferService.searchTtTransfer(ttTranferCriteria);
        
        // Return ws3501ResultDomain
        Ws3506TransactFacadeServiceResultDomain resultDomain = new Ws3506TransactFacadeServiceResultDomain();
        resultDomain.setTrNo(trNo);
        resultDomain.setEditCnt(String.valueOf(ttTransfer.getEditCnt()));
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        return resultDomain;
    }
}
