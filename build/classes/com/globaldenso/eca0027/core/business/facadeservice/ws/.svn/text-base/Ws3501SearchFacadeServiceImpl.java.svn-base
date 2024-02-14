/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3501;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501CmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501ItemNoListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501SearchFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtTransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS3501.<BR>
 * WS3501のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 34 $
 */
public class Ws3501SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<ResultDomain, Ws3501CriteriaDomain> {

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
    public Ws3501SearchFacadeServiceImpl() {
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
    protected Ws3501CriteriaDomain filterDomain(Ws3501CriteriaDomain inputDomain)
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
    protected void validateConsistency(Ws3501CriteriaDomain inputDomain)
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
    protected void validateDatabase(Ws3501CriteriaDomain inputDomain)
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

        TtTransferCriteriaDomain ttTranferCriteria = new TtTransferCriteriaDomain();
        ttTranferCriteria.setTrNo(trNo);
        
        // Check TR NO existing In TT_TRANSFER
        if (!wsBhtTransferService.validateDatabaseTtTransfer(ttTranferCriteria)) {
            // Tranfer number from the scaned QR
            MessageDomain msgTrStatus = new MessageDomain("inputDomain.trNo",
                NXS_E1_0010, null);
            errorList.add(msgTrStatus);
        }
      //Thalerngsak check edit count equals from BHT 
     // TR_STATUS check
        TtTransferDomain ttTransfer = wsBhtTransferService
            .searchTtTransfer(ttTranferCriteria);
        if (ttTransfer == null) {
            MessageDomain msgTrStatus = new MessageDomain(trNo, NXS_E1_6004,
                new String[] {ttTranferCriteria.getTrNo()});
            errorList.add(msgTrStatus);
        } else {
            if (TR_STATUS_ISSUED_TR.equals(ttTransfer.getTrStatus())) {
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
    protected void validateItems(Ws3501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<Ws3501CriteriaDomain> valid = new Validator<Ws3501CriteriaDomain>(
            inputDomain);

        String[] properties = {"dscId", "trNo", "trItemTyp"};

        // single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3501);

        // if there is an error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Shipment confirmation information update process.<BR>
     * </p>
     * <p>
     * <pre>
     * - Get user information.<BR>
     * - Update shipment confirmation information.<BR>
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
    @Override
    protected Ws3501SearchFacadeServiceResultDomain callServices(
        Ws3501CriteriaDomain inputDomain) throws GscmApplicationException,
        ApplicationException {
        
        //Get user information
        String trNo = inputDomain.getTrNo();
        String trItemTyp = inputDomain.getTrItemTyp();

        WsBhtTransferCriteriaDomain criteria = new WsBhtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setTrItemTyp(trItemTyp);

        Ws3501SearchFacadeServiceResultDomain resultDomain = new Ws3501SearchFacadeServiceResultDomain();
        if(TR_ITEM_TYP_CML.equals(trItemTyp)){
            List<Ws3501CmlListItemDomain> ws3501CmlListItemDomainList = wsBhtTransferService.searchTransferInfoDetailByCml(criteria);
            // copy ws3501CmlListItemDomainList to resultDomain
            resultDomain.setCmlList(ws3501CmlListItemDomainList);
            // set TR No
            resultDomain.setTrNo(ws3501CmlListItemDomainList.get(0).getTrNo());
        } else if(TR_ITEM_TYP_PARTS.equals(trItemTyp)){
            List<Ws3501ItemNoListItemDomain> ws3501ItemNoListItemDomainList = wsBhtTransferService.searchTransferInfoDetailByItemNo(criteria);
            // copy ws3501ItemNoListItemDomainList to resultDomain
            resultDomain.setItemNoList(ws3501ItemNoListItemDomainList);
            // set TR No
            resultDomain.setTrNo(ws3501ItemNoListItemDomainList.get(0).getTrNo());
        }
        
        // Initialize return value
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        
        return resultDomain;
    }
}
