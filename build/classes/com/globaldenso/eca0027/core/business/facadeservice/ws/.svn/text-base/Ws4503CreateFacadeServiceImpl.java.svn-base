/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS4503;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4503CreateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4503CreateFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtStgService;

import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Implement Class of Facade Service(WS_4504)
 * ECA0027_WS_4503のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version 1.0
 */
public class Ws4503CreateFacadeServiceImpl
    extends
    AbstractTransactFacadeService<Ws4503CreateFacadeServiceResultDomain, Ws4503CreateFacadeServiceInputDomain> {
    /**
     * Field of WsUpdateStgInstrService
     * WsBhtStgServiceのフィールド
     */
    private WsBhtStgService wsBhtStgService = null;

    /**
     * Default Constructor
     * デフォルトコンストラクタです
     */
    public Ws4503CreateFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for WsCreateStgActService
     * </p>
     * 
     * @param wsBhtStgService Set for WsBhtStgService
     */
    public void setWsBhtStgService(WsBhtStgService wsBhtStgService) {
        this.wsBhtStgService = wsBhtStgService;
    }

    /**
     * <p>
     * Call Business Processing Service
     * 業務処理Serviceの呼び出しを行う。
     * </p>
     * 
     * <pre>
     * 1)Get Registartion Information from Parameter of HTTP Request
     * 2)Check Registration Information (Refer to the Following)
     * 3)Register Staging Actuality Information
     * 4)Update Palletize Information to Staging Complete
     * 5)On Success to Get Search Result : 
     *   Check Status of Staging Instruction and Return It If It is Staging Instruction.
     * 
     * 1)HTTPリクエストのパラメタから、登録情報を取得する。 
     * 2)登録情報をチェックする。(チェック内容は下記参照)   
     * 3)山作り実績情報を登録する。   
     * 4)パレタイズ情報を山作り実績済みに更新する。   
     * 5)取得できた場合、荷揃え指示テーブルのステータスを確認し、荷揃え指示対象の場合のみ検索結果を返す。
     * </pre>
     * 
     * @param inputDomain WS4501InputDomain
     * @return Ws4501ResultDomain Processing Result 処理結果
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected Ws4503CreateFacadeServiceResultDomain callServices(
        Ws4503CreateFacadeServiceInputDomain inputDomain) throws GscmApplicationException,
        ApplicationException {

        return wsBhtStgService.createStgAct(inputDomain);
    }

    /**
     * <p>
     * Examine Domain Contents of Argument, and Specify Domain Necessary for Processing.
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     * 
     * <pre>
     * No Processing
     * 現行では処理なし
     * </pre>
     *  {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws4503CreateFacadeServiceInputDomain filterDomain(
        Ws4503CreateFacadeServiceInputDomain argDomain) throws GscmApplicationException,
        ApplicationException {

        return argDomain;
    }

    /**
     * <p>
     * Consistency Check
     * 整合性チェックを行う。
     * </p>
     * 
     * <pre>
     * No Processing
     * 現行では処理なし
     * </pre>
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    public void validateConsistency(Ws4503CreateFacadeServiceInputDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * <p>
     * Database Check
     * データベースチェックを行う。
     * </p>
     * <p>
     * 
     * <pre>
     * 1)Main Mark Check(Registration Information Check)
     * 2)Palletize Check(Registartion Information Check)
     * 3)Staging Actuality Registartion Check(Registartion Information Check)
     * 4)Transport Type Information Check(Registartion Information Check)
     * </pre>
     * 
     * </p>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     * @param inputDomain Input Domain 入力ドメイン
     * @throws GscmApplicationException GscmApplicationException業務エラー
     * @throws ValidationException ValidationException データベースエラー
     * @throws ApplicationException error エラー
     */
    @Override
    public void validateDatabase(Ws4503CreateFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * <p>
     * Single Item Check
     * 単項目チェックを行う。
     * </p>
     * 
     * <pre>
     * Common Error Check
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws4503CreateFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<Ws4503CreateFacadeServiceInputDomain> valid = 
             new Validator<Ws4503CreateFacadeServiceInputDomain>(inputDomain, "inputDomain");
        
         // Single Item Check 短項目チェック
        String[] properties = {"containerSortingKey", "trnsCd",
            "containerLooseTyp", "mainMark", "transTypCd", "curWhCompCd",
            "curWhCd"};

        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS4503);
        
        // Error Confirm エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

}
