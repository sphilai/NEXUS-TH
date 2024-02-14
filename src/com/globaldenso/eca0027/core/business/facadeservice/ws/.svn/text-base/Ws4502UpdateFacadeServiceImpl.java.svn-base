/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_WORKED_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WORKED_METH_TYP_TAGS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS4502;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4502UpdateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4502WsUpdateStgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4502UpdateFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtStgService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Implement Class of Facade Service(ECA0027_WS_4502)
 * ECA0027_WS_4502のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version 1.0
 */
public class Ws4502UpdateFacadeServiceImpl
    extends
    AbstractUpdateFacadeService<Ws4502UpdateFacadeServiceResultDomain, Ws4502UpdateFacadeServiceInputDomain> {

    /** WsUpdateStgInstrServiceのフィールド */
    private WsBhtStgService wsBhtStgService = null;
    
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws4502UpdateFacadeServiceImpl() {
    }
    /**
     * <p>
     * Setter method for WsBhtStgService
     * </p>
     * 
     * @param wsBhtStgService Set for WsBhtStgService
     */
    public void setWsBhtStgService(WsBhtStgService wsBhtStgService) {
        this.wsBhtStgService = wsBhtStgService;
    }

    /**
     * <p>
     * Update Palletize Table to Palletize Complete.
     * パレタイズテーブルを荷揃え実績済みに更新する。
     * </p>
     * 
     * <pre>
     * 1)Get Update Information from Parameter of HTTP Request
     * 2)Get Setting Information(User Information, Current Date) 
     * 3)Check Update Information (Refer to the Following)
     *   ■Confirm Staging Instruction to Update
     *   ■Confirm Staging Instruction Status of Staging Instruction Table is 10(Issue List)
     *   ■Confirm Palletize Status of Palletize Table is 20(Staging Instruction)
     *    No Check Staging Instruction Status of Staging Instruction Table.
     *    (It is Included Palletize Status Check)
     * 4)Update Staging Instruction Table to Palletize Complete.
     * 5)Update Palletize Table to Palletize Complete.
     * 
     * 1)HTTPリクエストのパラメタから、更新情報を取得する。 
     * 2)更新時設定情報(ユーザ情報、現在日付)を取得する。   
     * 3)更新情報をチェックする。(チェック内容は下記参照)   
     *   ■更新対象の荷揃え指示情報が存在すること。   
     *   ■荷揃え指示テーブルの荷揃え指示ステータスが'10'(Issue List)であること 
     *   ■パレタイズテーブルのパレタイズステータスが'20'(荷揃え指示)であること。 
     *   ※荷揃え指示テーブルの荷揃え指示ステータスは上記パレタイズステータスのチェックに包含できるためチェックしない。 
     * 4)荷揃え指示テーブルを荷揃え実績済みに更新する。 
     * 5)パレタイズテーブルを荷揃え実績済みに更新する。 
     * </pre>
     * 
     * @param inputDomain WS4502UpdateInputDomain
     * @return Ws4502ResultDomain 処理結果
     * @throws GscmApplicationException 業務エラー
     * @throws ApplicationException エラー
     */
    @Override
    protected Ws4502UpdateFacadeServiceResultDomain callServices(
        Ws4502UpdateFacadeServiceInputDomain inputDomain) throws GscmApplicationException,
        ApplicationException {
        // Update Information Domain アップデート情報格納ドメイン
        Ws4502WsUpdateStgInstrDomain updateDomain = new Ws4502WsUpdateStgInstrDomain();
        // Update Table テーブル更新
        updateDomain.setStgInstrNo(inputDomain.getStgInstrNo());
        updateDomain.setWorkedMethTyp(WORKED_METH_TYP_TAGS);
        updateDomain.setWorkedId(inputDomain.getDscId());
        updateDomain.setWorkedIssureNm("4.1.USR_NM_EN");
        updateDomain.setPltzStatus(PLTZ_STATUS_WORKED_ACT);
        updateDomain.setStgInstrStatus(STG_INSTR_STATUS_WORKED_DONE);
        updateDomain.setScreenId(inputDomain.getScreenId());
        // Result Domain 結果用ドメイン
        Ws4502UpdateFacadeServiceResultDomain resultDomain = wsBhtStgService.updateStgInstr(updateDomain);
        return resultDomain;
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
     * 
     * @param inputDomain InputDomain ドメイン
     * @return result result 処理結果
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected Ws4502UpdateFacadeServiceInputDomain filterDomain(
        Ws4502UpdateFacadeServiceInputDomain inputDomain) throws GscmApplicationException,
        ApplicationException {

        return inputDomain;
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
    protected void validateConsistency(Ws4502UpdateFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * <p>
     * Database Check
     * データベースチェック
     * </p>
     * <p>
     * 
     * <pre>
     *  Call {@link PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}, and Check It
     *     {@link PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * </p>
     * 
     * @param inputDomain InputDomain ドメイン
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ValidationException ValidationException 検証エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected void validateDatabase(Ws4502UpdateFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * <p>
     * Single Item Check
     * 単項目チェックを行う。
     * </p>
     * <pre> 
     * Refer to Screen Items Definition 
     * - 共通エラーチェック 詳細は「画面項目定義」を参照
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     *      </pre>
     * @param inputDomain InputDomain ドメイン
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ValidationException ValidationException 検証エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected void validateItems(Ws4502UpdateFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Validator<Ws4502UpdateFacadeServiceInputDomain> valid = new
        Validator<Ws4502UpdateFacadeServiceInputDomain>(
            inputDomain, "inputDomain");
        
        // Single Item Check 単項目チェック
        String[] properties = {"stgInstrNo"};
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS4502);
        
         // Error Check エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

}
