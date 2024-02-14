/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsT501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WsT501UnlockBhtDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtComnAuxService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WST501.<BR>
 * WST501のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class WsT501SearchFacadeServiceImpl extends
        AbstractSearchFacadeService<ResultDomain, WsT501CriteriaDomain> {

    /**
     * <p>
     * wsBhtComnAux service
     * </p>
     */
    private WsBhtComnAuxService wsBhtComnAuxService;

    /**
     * <p>
     * User information acquisition service<BR>
     * ユーザ情報取得サービス
     * </p>
     */
    private VmUserInfoService vmUserInfoService;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public WsT501SearchFacadeServiceImpl() {
    }

    /**
     * <p>
     * setter method of WsBhtComnAuxService<BR>
     * WsBhtComnAuxServiceのセッターメソッドです。
     * </p>
     *
     * @param wsBhtComnAuxService
     *            wsBhtComnAuxService に設定する
     */
    public void setWsBhtComnAuxService(WsBhtComnAuxService wsBhtComnAuxService) {
        this.wsBhtComnAuxService = wsBhtComnAuxService;
    }

    /**
     * <p>
     * setter method of VmUserInfoService<BR>
     * VmUserInfoServiceのセッターメソッドです。
     * </p>
     *
     * @param vmUserInfoService
     *            vmUserInfoService に設定する
     */
    public void setVmUserInfoService(VmUserInfoService vmUserInfoService) {
        this.vmUserInfoService = vmUserInfoService;
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
    protected WsT501CriteriaDomain filterDomain(WsT501CriteriaDomain inputDomain)
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
    protected void validateConsistency(WsT501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {
    }

    /**
     * <p>
     * Database check.<BR>
     * データベースチェックを行う。
     * </p>
      * <p>
     * <pre>
     * - Get user information.<BR>
     * - Make sure that it is a DSC-ID there is BHT unlocked authority.<BR>
     * - ユーザ情報を取得する。<BR>
     * - BHTロック解除権限があるDSC-IDであることを確認する。<BR>
     * </pre>
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
    protected void validateDatabase(WsT501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {

        // パラメータのコピー
        WsT501UnlockBhtDomain unlockBht = new WsT501UnlockBhtDomain();
        CommonUtil.copyPropertiesDomainToDomain(unlockBht, inputDomain);

        /* 4.ユーザ情報の取得 */
        // ユーザ情報検索パラメータ
        VmUserInfoCriteriaDomain userInfoCriteria = new VmUserInfoCriteriaDomain();
        userInfoCriteria.setDscId(inputDomain.getDscId());

        // ユーザ情報を取得
        vmUserInfoService = (VmUserInfoService) SpringUtil.getBean("vmUserInfoService");
        List<VmUserInfoDomain> userInfoList = this.vmUserInfoService
                .searchByCondition(userInfoCriteria);

        // ユーザ情報取得結果判定
        if (userInfoList == null || userInfoList.size() < 1) {
            throw new GscmApplicationException(NXS_E1_5031,
                    new String[] { userInfoCriteria.getDscId() });
        }

        // ユーザ情報設定
        unlockBht.setVmUserInfo(userInfoList.get(0));

        wsBhtComnAuxService.validateDatabaseVmBhtLockUser(unlockBht);

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
    protected void validateItems(WsT501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {

        Validator<WsT501CriteriaDomain> valid = new Validator<WsT501CriteriaDomain>(
                inputDomain);

        // 単項目チェック
        String[] properties = { "dscId", "mgrDscId" };

        // 単項目チェック
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WST501);

        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Call service.<BR>
     * サービス呼び出し。
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
    protected ResultDomain callServices(WsT501CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        // 結果設定
        ResultDomain result = new ResultDomain();
        result.setResultCode(WS_RESULT_SUCCESS);

        return result;
    }
}
