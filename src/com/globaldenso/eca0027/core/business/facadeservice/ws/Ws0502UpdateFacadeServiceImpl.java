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
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0502CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0502PassCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtPortalService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS0502.<BR>
 * WS0502のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class Ws0502UpdateFacadeServiceImpl extends
        AbstractUpdateFacadeService<ResultDomain, Ws0502CriteriaDomain> {

    /**
     * <p>
     * BHT Portal service<BR>
     * ポータルサービス
     * </p>
     */
    private WsBhtPortalService wsBhtPortalService;

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
    public Ws0502UpdateFacadeServiceImpl() {
    }

    /**
     * <p>
     * setter method of WsBhtPortalService<BR>
     * WsBhtPortalServiceのセッターメソッドです。
     * </p>
     *
     * @param wsBhtPortalService
     *            wsBhtPortalService に設定する
     */
    public void setWsBhtPortalService(WsBhtPortalService wsBhtPortalService) {
        this.wsBhtPortalService = wsBhtPortalService;
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
    public void setVtUserInfoService(VmUserInfoService vmUserInfoService) {
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
    protected Ws0502CriteriaDomain filterDomain(Ws0502CriteriaDomain inputDomain)
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
    protected void validateConsistency(Ws0502CriteriaDomain inputDomain)
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
    protected void validateDatabase(Ws0502CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {
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
    protected void validateItems(Ws0502CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {

        Validator<Ws0502CriteriaDomain> valid = new Validator<Ws0502CriteriaDomain>(
                inputDomain);

        // 単項目チェック
        String[] properties = { "dscId", "oldPinCode", "newPinCode" };

        // 単項目チェック
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS0502);

        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Login password (pin code) change.<BR>
     * パスワード変更。
     * </p>
     * <p>
     * <pre>
     * - Get user information.<BR>
     * - Login password (pin code) change.<BR>
     * - ユーザ情報を取得する。<BR>
     * - パスワード（Pinコード）を変更する。<BR>
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
    protected ResultDomain callServices(Ws0502CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        Ws0502PassCriteriaDomain passCriteriaDomain = new Ws0502PassCriteriaDomain();
        CommonUtil
                .copyPropertiesDomainToDomain(passCriteriaDomain, inputDomain);

        // 4. ユーザ情報の取得
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
        passCriteriaDomain.setVmUserInfo(userInfoList.get(0));

        // サービス呼び出し
        this.wsBhtPortalService.updatePass(passCriteriaDomain);

        // 結果設定
        ResultDomain resultDomain = new ResultDomain();
        resultDomain.setResultCode(WS_RESULT_SUCCESS);

        return resultDomain;
    }

}