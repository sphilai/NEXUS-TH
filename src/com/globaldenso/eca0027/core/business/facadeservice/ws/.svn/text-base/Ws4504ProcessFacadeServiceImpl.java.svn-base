/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS4504;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4504ProcessFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4504ProcessFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtStgService;

import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Implement Class of Facade Service(WS_4504)
 * WS_4504のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version 1.0
 */
public class Ws4504ProcessFacadeServiceImpl
    extends
    AbstractProcessFacadeService<Ws4504ProcessFacadeServiceResultDomain, Ws4504ProcessFacadeServiceInputDomain> {
    /**
     * Field of WsUpdateStgInstrService
     * WsBhtStgServiceのフィールド
     */
    private WsBhtStgService wsBhtStgService = null;

    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws4504ProcessFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for WsPrintStgActService
     * </p>
     * 
     * @param wsBhtStgService Set for WsBhtStgService
     */
    public void setWsBhtStgService(WsBhtStgService wsBhtStgService) {
        this.wsBhtStgService = wsBhtStgService;
    }


    /**
     * <p>
     * Update Palletize Table to Staging Complete
     * パレタイズテーブルを荷揃え実績済みに更新する。
     * </p>
     * 
     * <pre>
     * 1) Get Print Information from Parameter of HTTP Request        
     * 2) Get Printer Information        
     * 3) Create PDF of Staging Actuality           
     * 4) Output PDF(3) to Printer(2) 
     *     
     * 1) HTTPリクエストのパラメタから、印刷情報を取得する。         
     * 2) プリンタ情報を取得する。            
     * 3) 山作り実績書のPDFを作成する。            
     * 4) (3)で作成したPDFファイルを(2)で取得したプリンタに出力する。          
     * </pre>
     * 
     * @param inputDomain InputDomain 入力値
     * @return Ws4504UpdateFacadeServiceResultDomain Processing Result 処理結果
     * @throws GscmApplicationException Business Error 業務エラー
     * @throws ApplicationException error エラー
     */

    @Override
    public Ws4504ProcessFacadeServiceResultDomain callServices(
        Ws4504ProcessFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        return wsBhtStgService.printStgAct(inputDomain);
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
    public Ws4504ProcessFacadeServiceInputDomain filterDomain(
        Ws4504ProcessFacadeServiceInputDomain argDomain)
        throws GscmApplicationException, ApplicationException {

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
     *  {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    public void validateConsistency(
        Ws4504ProcessFacadeServiceInputDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * <p>
     * Database Check
     * データベースチェックを行う。
     * </p>
     * 
     * <pre>
     * No Processing
     * 現行では処理なし
     * </pre>
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    public void validateDatabase(
        Ws4504ProcessFacadeServiceInputDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * <p>
     * Single Item Check
     * 単項目チェックを行う。
     * </p>
     * 
     * <pre>
     * Common Error Check
     * 
     * 共通エラーチェック
     * 詳細は「画面項目定義」を参照
     * </pre>
     *  {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     * @throws GscmApplicationException GscmApplicationException業務エラー
     * @throws ValidationException ValidationException
     */
    @Override
    protected void validateItems(
        Ws4504ProcessFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<Ws4504ProcessFacadeServiceInputDomain> valid = new Validator<Ws4504ProcessFacadeServiceInputDomain>(
            inputDomain, "inputDomain");

        // Single Item Check 単項目チェック
        String[] properties = {"compCd", "printerId", "stgActNo"};
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS4504);

        // Error Confirm エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

}
