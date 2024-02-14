/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0362;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3507;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3507TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3507CriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtTransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS3507.<BR>
 * WS3507のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version $Revision: 34 $
 */
public class Ws3507TransactFacadeServiceImpl extends
    AbstractTransactFacadeService<ResultDomain, Ws3507CriteriaDomain> {

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
    public Ws3507TransactFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wsBhtTransferService.
     * </p>
     * 
     * @param wsBhtTransferService Set for wsBhtTransferService
     */
    public void setWsBhtTransferService(
        WsBhtTransferService wsBhtTransferService) {
        this.wsBhtTransferService = wsBhtTransferService;
    }

    /**
     * <p>
     * To investigate the contents of the Domain of the argument, to identify
     * the Domain necessary for the process.<BR>
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @return Processing result 処理結果
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected Ws3507CriteriaDomain filterDomain(Ws3507CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
    }

    /**
     * <p>
     * Consistency check.<BR>
     * 整合性チェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateConsistency(Ws3507CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * <p>
     * Database check.<BR>
     * データベースチェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateDatabase(Ws3507CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // TT_TRANSFER existence check
        TtTransferCriteriaDomain ttTransferCriteria = new TtTransferCriteriaDomain();
        ttTransferCriteria.setTrNo(inputDomain.getTrNo());
        ttTransferCriteria.setSearchCountCheckFlg(false);
        int count = wsBhtTransferService.searchCountTtTransfer(ttTransferCriteria);
        if(count == 0){
            throw new ValidationException(NXS_E1_0362, new String[] {ttTransferCriteria.getTrNo()});
        }
    }

    /**
     * <p>
     * Single item check.<BR>
     * 単項目チェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateItems(Ws3507CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<Ws3507CriteriaDomain> valid = new Validator<Ws3507CriteriaDomain>(
            inputDomain);

        String[] properties = {"trNo", "trItemTyp"};

        // single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3507);

        // if there is an error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * callServices
     * </p>
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @return Processing result   処理結果
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @SuppressWarnings("unused")
    @Override
    protected Ws3507TransactFacadeServiceResultDomain callServices(
        Ws3507CriteriaDomain inputDomain) throws GscmApplicationException,
        ApplicationException {
    
        String trNo = inputDomain.getTrNo();
        String trItemTyp = inputDomain.getTrItemTyp();
        String printerId = inputDomain.getPrinterId();
        String noOfPrint = inputDomain.getNoOfPrint();
    
        File resultFile = null; 
        // In case TR_ITEM_TYP is 1 (CML)
        if (TR_ITEM_TYP_CML.equals(trItemTyp)) {
            // Call L3003 generation function
            //kimura ; not need file in this FS. because print out on service.
            wsBhtTransferService.callPrintByCml(trNo , printerId , noOfPrint);
        // In case TR_ITEM_TYP is 2 (Item No)
        } else if (TR_ITEM_TYP_PARTS.equals(trItemTyp)) {
            // Call L3004 generation function
            //kimura ; not need file in this FS. because print out on service.
            wsBhtTransferService.callPrintByItemNo(trNo , printerId , noOfPrint);
        }
        Ws3507TransactFacadeServiceResultDomain resultDomain = new Ws3507TransactFacadeServiceResultDomain();
        // Initialize return value
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        return resultDomain;
    }
}
