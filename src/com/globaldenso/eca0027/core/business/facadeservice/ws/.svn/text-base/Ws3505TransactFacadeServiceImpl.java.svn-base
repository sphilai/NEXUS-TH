/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3508;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ACTV_METH_TYP_TAGS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ACTV_METH_TYP_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3505;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3505ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3505TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3505CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;
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
 * An implementation class of FacadeService of WS3505.<BR>
 * WS3505のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 34 $
 */
public class Ws3505TransactFacadeServiceImpl extends
        AbstractTransactFacadeService<Ws3505TransactFacadeServiceResultDomain, Ws3505CriteriaDomain> {

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
    public Ws3505TransactFacadeServiceImpl() {
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
    protected Ws3505CriteriaDomain filterDomain(Ws3505CriteriaDomain inputDomain)
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
    protected void validateConsistency(Ws3505CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
    protected void validateDatabase(Ws3505CriteriaDomain inputDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create an Error List
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        String trNo = inputDomain.getTrNo();
        String editCnt = inputDomain.getEditCnt();
        BigDecimal editCntBigDecimal = null;
        if(editCnt != null && !"".equals(editCnt)){
            editCntBigDecimal = new BigDecimal(editCnt);
        }
        
        TtTransferCriteriaDomain ttTranferCriteria = new TtTransferCriteriaDomain();
        ttTranferCriteria.setTrNo(trNo);
        
        // TR_STATUS check
        TtTransferDomain ttTransfer = wsBhtTransferService
            .searchTtTransfer(ttTranferCriteria);
        if(ttTransfer == null){
            MessageDomain msgTrStatus = new MessageDomain(
                trNo, NXS_E1_6004, new String[] {ttTranferCriteria.getTrNo()});
            errorList.add(msgTrStatus);
        } else{
            if (!TR_STATUS_ISSUED_TR.equals(ttTransfer.getTrStatus())) {
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
    protected void validateItems(Ws3505CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<Ws3505CriteriaDomain> valid = new Validator<Ws3505CriteriaDomain>(
                inputDomain);

        String[] properties = { "dscId", "trNo", "screenId" };

        // Single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3505);

        // if there is an error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Shipment confirmation information update process.<BR>
     * 出荷確認情報更新処理。
     * </p>
     * <p>
     * <pre>
     * - Get user information.<BR>
     * - Update shipment confirmation information.<BR>
     * - ユーザ情報を取得する。<BR>
     * - 出荷確認情報を更新する。<BR>
     * </pre>
     * </p>
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
    protected Ws3505TransactFacadeServiceResultDomain callServices(Ws3505CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        Date sqlNow = new Date(System.currentTimeMillis());
        String dscId = inputDomain.getDscId();
        String trNo = inputDomain.getTrNo();
        String screenId = inputDomain.getScreenId();
        
        TtTransferCriteriaDomain ttTranferCriteria = new TtTransferCriteriaDomain();
        ttTranferCriteria.setTrNo(trNo);

        // obtain user information
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(dscId);
        // select USR_NM_EN
        TmUserDomain tmUser = wsBhtTransferService.searchUserInfo(tmUserCriteria);

        // judge user information
        if (tmUser == null) {
            throw new GscmApplicationException(NXS_E1_6006,
                    new String[] { tmUserCriteria.getDscId() });
        }
        
        // set update values
        TtTransferDomain updateDomain = new TtTransferDomain();
        updateDomain.setTrNo(trNo);
        updateDomain.setTrStatus(TR_STATUS_ACTIVATE_TR);
        updateDomain.setTrActvDscId(dscId);
        updateDomain.setTrActvDt(sqlNow);
        if(SCREEN_ID_W3508.equals(screenId)){
            updateDomain.setTrActvMethTyp(TR_ACTV_METH_TYP_TR);
        } else {
            updateDomain.setTrActvMethTyp(TR_ACTV_METH_TYP_TAGS);
        }
        updateDomain.setTrActvNm(tmUser.getUsrNmEn());
        updateDomain.setComUpdateUserId(dscId);
        updateDomain.setComUpdateFuncId(screenId);
        
        // search TT_TRANSFER
        TtTransferDomain ttTranfer = wsBhtTransferService.searchTtTransfer(ttTranferCriteria);
        updateDomain.setComUpdateTimestamp(ttTranfer.getComUpdateTimestamp());
        int updateCnt = wsBhtTransferService.updateTrStatus(updateDomain);
        if(updateCnt == 0){
            throw new GscmApplicationException(NXS_E1_6004,
                new String[] { ttTranfer.getTrStatus() });
        }
        
        // select WebService(WS3001) parameter
        String trItemTyp = ttTranfer.getTrItemTyp();
        List<WsBhtTransferDomain> ws3505SearchList = new ArrayList<WsBhtTransferDomain>();
        WsBhtTransferCriteriaDomain wsBhtTransferCriteria = new WsBhtTransferCriteriaDomain();
        wsBhtTransferCriteria.setTrNo(trNo);
        if(TR_ITEM_TYP_CML.equals(trItemTyp)){
            ws3505SearchList = wsBhtTransferService.searchWs3001ParamForCml(wsBhtTransferCriteria);
            // update TT_PLTZ
            for(int i = 0; i < ws3505SearchList.size(); i++){
                TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
                ttPltzCriteria.setMainMark(ws3505SearchList.get(i).getMainMark());
                TtPltzDomain ttPltzDomain = wsBhtTransferService.searchCmlListFromTtPltz(ttPltzCriteria);
                TtPltzDomain updateTtPltzDomain = new TtPltzDomain();
                updateTtPltzDomain.setMainMark(ws3505SearchList.get(i).getMainMark());
                updateTtPltzDomain.setCurLgcyWhCd(ws3505SearchList.get(i).getLgcyWhTo());
                updateTtPltzDomain.setCurWhCompCd(ws3505SearchList.get(i).getCarryInCompCd());
                updateTtPltzDomain.setCurWhCd(ws3505SearchList.get(i).getCarryInWhCd());
                updateTtPltzDomain.setLastTrStatus(TR_STATUS_ACTIVATE_TR);
                updateTtPltzDomain.setComUpdateUserId(dscId);
                updateTtPltzDomain.setComUpdateFuncId(screenId);
                updateTtPltzDomain.setComUpdateTimestamp(ttPltzDomain.getComUpdateTimestamp());
                wsBhtTransferService.updateTtPltzByKey(updateTtPltzDomain);
            }
            wsBhtTransferService.updateTtTmpStock(updateDomain);
        } else if (TR_ITEM_TYP_PARTS.equals(trItemTyp)){
            ws3505SearchList = wsBhtTransferService.searchWs3001ParamForParts(wsBhtTransferCriteria);
        }
        
        // Call WebService(WS3001)
        ResultDomain ws3001ResultDomain = new ResultDomain();
        ws3001ResultDomain = wsBhtTransferService.callWs3001Rest(ws3505SearchList, tmUser.getUsrNmEn());
        // copy ws3001ResultDomain to resultDomain
        Ws3505TransactFacadeServiceResultDomain resultDomain = copyDomainToDomain(ws3001ResultDomain, ws3505SearchList);
        
        return resultDomain;
    }
    
    /**
     * <p>
     * Copy ResultDomain to Ws3505TransactFacadeServiceResultDomain
     * </p>
     * @param fromDomain ResultDomain
     * @param ws3505SearchList List<WsBhtTransferDomain>
     * @return resultDomain Ws3505TransactFacadeServiceResultDomain
     * 
     */
    private Ws3505TransactFacadeServiceResultDomain copyDomainToDomain(ResultDomain fromDomain, List<WsBhtTransferDomain> ws3505SearchList){
        Ws3505TransactFacadeServiceResultDomain toDomain = new Ws3505TransactFacadeServiceResultDomain();
        toDomain.setResultCode(fromDomain.getResultCode());
        toDomain.setErrorList(fromDomain.getErrorList());
        
        Ws3505ResultItemDomain ws3505ResultItemDomain = new Ws3505ResultItemDomain();
        ws3505ResultItemDomain.setEditCnt(ws3505SearchList.get(0).getEditCnt().intValue());
        ws3505ResultItemDomain.setTrActvMethTyp(ws3505SearchList.get(0).getTrActvMethTyp());
        ws3505ResultItemDomain.setTrItemTyp(ws3505SearchList.get(0).getTrItemTyp());
        toDomain.setWs3505ResultItemDomain(ws3505ResultItemDomain);
        
        return toDomain;
    }
}
