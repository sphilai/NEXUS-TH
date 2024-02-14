/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.dir.auth.pincode.LdapConnectException;
import com.globaldenso.dir.auth.pincode.PINCodeAuth;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtModuleDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtResourceFileDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtLockMsgMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtModuleCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmBhtResourceFileCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmBhtLockMsgMgtService;
import com.globaldenso.eca0027.core.auto.business.service.TmBhtModuleService;
import com.globaldenso.eca0027.core.auto.business.service.TmBhtResourceFileService;
import com.globaldenso.eca0027.core.auto.business.service.VmGetQrCheckService;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0501LoginInfoItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501LoginInfoItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501ResourceDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0502PassCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * <p>
 * An implementation class of the login menu service.<BR>
 * ログインメニューサービスの実装クラスです。
 * </p>
 *
 * @version 1.00
 */
public class WsBhtPortalServiceImpl implements WsBhtPortalService {

    /**
     * <p>
     * BHT module service (SACT)<BR>
     * BHTモジュール管理原単位
     * </p>
     */
    private TmBhtModuleService bhtModuleService;

    /**
     * <p>
     * BHT resource file service (SACT)<BR>
     * BHTリソースファイル管理原単位
     * </p>
     */
    private TmBhtResourceFileService bhtResourceFileService;

    /**
     * <p>
     * BHT lock target message service (SACT)<BR>
     * BHTロック対象メッセージ管理原単位
     * </p>
     */
    private TmBhtLockMsgMgtService bhtLockMsgMgtService;

    /**
     * <p>
     * QR code check information service (SACT)<BR>
     * QRコードチェック情報
     * </p>
     */
    private VmGetQrCheckService vmGetQrCheckService;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     */
    public WsBhtPortalServiceImpl() {
    }

    // ------------------- 依存サービス・DaoのGetter / Setter -------------------

    /**
     * <p>
     * Setter method for BHT module service.
     * </p>
     *
     * @param bhtModuleService
     *            Set for BHT module service
     */
    public void setTmBhtModuleService(TmBhtModuleService bhtModuleService) {
        this.bhtModuleService = bhtModuleService;
    }

    /**
     * <p>
     * Setter method for BHT resource file service.
     * </p>
     *
     * @param bhtResourceFileService
     *            Set for BHT resource file service
     */
    public void setTmBhtResourceFileService(
            TmBhtResourceFileService bhtResourceFileService) {
        this.bhtResourceFileService = bhtResourceFileService;
    }

    /**
     * <p>
     * Setter method for BHT lock target message service.
     * </p>
     *
     * @param bhtLockMsgMgtService
     *            Set for BHT lock target message service
     */
    public void setTmBhtLockMsgMgtService(
            TmBhtLockMsgMgtService bhtLockMsgMgtService) {
        this.bhtLockMsgMgtService = bhtLockMsgMgtService;
    }

    /**
     * <p>
     * Setter method for QR code check information service.
     * </p>
     *
     * @param vmGetQrCheckService
     *            Set for QR code check information service
     */
    public void setVmGetQrCheckService(VmGetQrCheckService vmGetQrCheckService) {
        this.vmGetQrCheckService = vmGetQrCheckService;
    }


    // -------------------------- メソッド ---------------------------

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.service.WsBhtPortalService#searchLoginInfo(com.globaldenso.eca0027.core.business.domain.criteria.Ws0501LoginInfoItemCriteriaDomain)
     */
    public Ws0501LoginInfoItemDomain searchLoginInfo(
            Ws0501LoginInfoItemCriteriaDomain loginInfoItemCriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        /* 2.内部変数の初期化 */
        // 処理結果ドメイン準備
        Ws0501LoginInfoItemDomain loginInfoItemDomain = new Ws0501LoginInfoItemDomain();
        loginInfoItemDomain.setResultCode(WS_RESULT_SUCCESS);
        loginInfoItemDomain.setUpdateFlg(FLAG_N);

        /* 5.ログイン認証 */
        try {
            // ログイン認証
            int result = PINCodeAuth.auth(loginInfoItemCriteriaDomain
                    .getDscId(), loginInfoItemCriteriaDomain.getPinCode());

            // ログイン認証の結果判定
            if (result == PINCodeAuth.OK) {
                // 認証成功
            } else if (result == PINCodeAuth.NG) {
                // 認証失敗
                throw new GscmApplicationException(NXS_E1_5052,
                        new String[] { loginInfoItemCriteriaDomain.getDscId() });
            } else if (result == PINCodeAuth.RETRY_COUNT_OVER) {
                // BHT用PINコード認証連続失敗エラー
                throw new GscmApplicationException(NXS_E1_5053,
                        new String[] { loginInfoItemCriteriaDomain.getDscId() });
            } else if (result == PINCodeAuth.EXPIRE_DATE) {
                // BHT用PINコード有効期限切れ
                loginInfoItemDomain.setResultCode(WS_RESULT_PW_EXPIRATION);
            } else {
                // 処理なし
            }

        } catch (LdapConnectException e) {
            throw new SystemException(e);
        }

        /* 6.BHTモジュールのバージョンチェック */
        // BHTモジュール管理原単位検索パラメータ
        TmBhtModuleCriteriaDomain bhtModuleCriteria = new TmBhtModuleCriteriaDomain();
        // 国コード(イコール)
        bhtModuleCriteria.setCntryCd(loginInfoItemCriteriaDomain.getCntryCd());
        // タイムゾーン変換日時(小なりイコール)
        Date sysdate = DateUtil.convertTime(new Date(),
                loginInfoItemCriteriaDomain.getTimezoneCode());
        bhtModuleCriteria.setAplyStrtDtLessThanEqual(sysdate);
        // 機種ID(イコール)
        bhtModuleCriteria.setDeviceTypId(loginInfoItemCriteriaDomain
                .getDeviceTypId());
        // 適用開始日時を降順で（最新のものから）取得
        bhtModuleCriteria.setPreferredOrder("APLY_STRT_DT desc");

        // BHTモジュール管理原単位取得
        List<TmBhtModuleDomain> bhtModuleDomainList = bhtModuleService
                .searchByCondition(bhtModuleCriteria);

        // BHTモジュール管理原単位検索結果判定
        if (bhtModuleDomainList == null || bhtModuleDomainList.size() == 0) {
            throw new GscmApplicationException(NXS_E1_5054, new String[] {
                    bhtModuleCriteria.getCntryCd(),
                    bhtModuleCriteria.getDeviceTypId() });
        }

        // 最新モジュール設定
        this.setTmBhtModuleDomain(loginInfoItemDomain,
                loginInfoItemCriteriaDomain, bhtModuleDomainList.get(0));

        /* 7.BHTリソースファイルの取得 */
        // 最新モジュールが設定されている場合
        if (FLAG_Y.equals(loginInfoItemDomain.getUpdateFlg())
                && (loginInfoItemDomain.getMainExe() != null
                        || loginInfoItemDomain.getPalletizeDll() != null
                        || loginInfoItemDomain.getCarryInOutDll() != null
                        || loginInfoItemDomain.getShippingDll() != null
                        || loginInfoItemDomain.getSettingsDll() != null || loginInfoItemDomain
                        .getCommonDll() != null)) {

            // BHTリソース情報検索パラメータ
            TmBhtResourceFileCriteriaDomain bhtResourceFileCriteria
                = new TmBhtResourceFileCriteriaDomain();
            // 国コード(イコール)
            bhtResourceFileCriteria.setCntryCd(loginInfoItemCriteriaDomain
                    .getCntryCd());
            // 機種ID(イコール)
            bhtResourceFileCriteria.setDeviceTypId(loginInfoItemCriteriaDomain
                    .getDeviceTypId());
            // 適用開始日時(イコール)
            bhtResourceFileCriteria.setAplyStrtDt(bhtModuleDomainList.get(0)
                    .getAplyStrtDt());
            // 言語コードを昇順で取得
            bhtResourceFileCriteria.setPreferredOrder("LNG_CD asc");

            // BHTリソースファイル管理原単位取得
            List<TmBhtResourceFileDomain> tmBhtResourceFileList = this.bhtResourceFileService
                    .searchByCondition(bhtResourceFileCriteria);

            // BHTリソースファイル管理原単位検索結果判定
            if (tmBhtResourceFileList == null
                    || tmBhtResourceFileList.size() == 0) {
                throw new GscmApplicationException(NXS_E1_5054, new String[] {
                        bhtResourceFileCriteria.getCntryCd(),
                        bhtResourceFileCriteria.getDeviceTypId() });
            }

            // BHTリソースファイル管理原単位設定
            List<Ws0501ResourceDomain> resourceList = new ArrayList<Ws0501ResourceDomain>();
            for (TmBhtResourceFileDomain tmBhtResourceFile : tmBhtResourceFileList) {
                Ws0501ResourceDomain resource = new Ws0501ResourceDomain();
                this.setTmBhtResourceFile(resource, loginInfoItemDomain,
                        tmBhtResourceFile);
                resourceList.add(resource);
            }
            loginInfoItemDomain.setResourceList(resourceList);
        }

        /* 8.BHTロック対象のメッセージ情報の取得 */
        // BHTロック対象のメッセージ情報検索パラメータ
        TmBhtLockMsgMgtCriteriaDomain bhtLockMsgMgtCriteria = new TmBhtLockMsgMgtCriteriaDomain();
        // NEXUS会社コード(イコール)
        bhtLockMsgMgtCriteria.setCompCd(loginInfoItemCriteriaDomain
                .getVmUserInfo().getCompCd());
        // スクリーンID、メッセージIDを昇順で取得
        bhtLockMsgMgtCriteria.setPreferredOrder("SCREEN_ID asc, MSG_ID asc");

        // BHTロック対象メッセージ管理原単位取得
        List<TmBhtLockMsgMgtDomain> bhtLockMsgMgtList = this.bhtLockMsgMgtService
                .searchByCondition(bhtLockMsgMgtCriteria);

        // BHTロック対象メッセージ管理原単位設定
        loginInfoItemDomain.setTmBhtLockMsgMgtList(bhtLockMsgMgtList);

        return loginInfoItemDomain;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.service.WsBhtPortalService#updatePass(com.globaldenso.eca0027.core.business.domain.criteria.Ws0502PassCriteriaDomain)
     */
    public void updatePass(Ws0502PassCriteriaDomain passCriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        /* 5.パスワード変更処理 */
        try {
            // パスワード更新
            int result = PINCodeAuth.update(passCriteriaDomain.getDscId(),
                    passCriteriaDomain.getOldPinCode(), passCriteriaDomain
                            .getNewPinCode());

            // パスワード更新結果判定
            if(result == PINCodeAuth.OK){
                // 更新成功
            }else if(result == PINCodeAuth.NG){
                // 更新失敗
                throw new GscmApplicationException(NXS_E1_5052,
                        new String[] { passCriteriaDomain.getDscId() });
            }else if(result == PINCodeAuth.PINCODENEW_INVALID){
                // BHT用PINコード(新)の値が不正
                throw new GscmApplicationException(NXS_E1_5055,
                        new String[] { passCriteriaDomain.getDscId() });
            }else{
                // 処理なし
            }

        } catch (LdapConnectException e) {
            throw new SystemException(e);
        }

    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.auto.business.service.WsBhtPortalService#searchQrChkInfo()
     */
    public List<VmGetQrCheckDomain> searchQrChkInfo()
        throws GscmApplicationException, ApplicationException {

        VmGetQrCheckCriteriaDomain vmGetqrCheckCriteria = new VmGetQrCheckCriteriaDomain();
        vmGetqrCheckCriteria
                .setPreferredOrder("FUNC_ID asc, QR_TYP_CD asc, STRT_POS asc");

        List<VmGetQrCheckDomain> vmGetqrCheckList = vmGetQrCheckService
                .searchByCondition(vmGetqrCheckCriteria);

        if (vmGetqrCheckList == null || vmGetqrCheckList.size() == 0) {
            throw new GscmApplicationException(NXS_E1_5065, new String[] {});
        }

        return vmGetqrCheckList;
    }

    /**
     * <p>
     * Set BHT-Module domain.   BHTモジュール情報を設定します。
     * </p>
     * 
     * @param loginInfoItemDomain ログイン情報
     * @param loginInfoItemCriteriaDomain ログイン入力情報
     * @param tmBhtModule BHTモジュール情報
     */
    private void setTmBhtModuleDomain(
            Ws0501LoginInfoItemDomain loginInfoItemDomain,
            Ws0501LoginInfoItemCriteriaDomain loginInfoItemCriteriaDomain,
            TmBhtModuleDomain tmBhtModule) {
    
        // メインモジュールリソース
        if (!loginInfoItemCriteriaDomain.getMainExeVer().equals(
                tmBhtModule.getMainExeVer())) {
            loginInfoItemDomain.setMainExe(tmBhtModule.getMainExe());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
        // パレタイズモジュール
        if (!loginInfoItemCriteriaDomain.getPltzDllVer().equals(
                tmBhtModule.getPltzDllVer())) {
            loginInfoItemDomain.setPalletizeDll(tmBhtModule.getPltzDll());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
        // 搬出入モジュール
        if (!loginInfoItemCriteriaDomain.getCarryIODllVer().equals(
                tmBhtModule.getCarryIODllVer())) {
            loginInfoItemDomain.setCarryInOutDll(tmBhtModule.getCarryIODll());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
        // 出荷モジュール
        if (!loginInfoItemCriteriaDomain.getShippingDllVer().equals(
                tmBhtModule.getShippingDllVer())) {
            loginInfoItemDomain.setShippingDll(tmBhtModule.getShippingDll());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
        // 管理者モジュール
        if (!loginInfoItemCriteriaDomain.getSettingsDllVer().equals(
                tmBhtModule.getSettingsDllVer())) {
            loginInfoItemDomain.setSettingsDll(tmBhtModule.getSettingsDll());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
        // 共通モジュール
        if (!loginInfoItemCriteriaDomain.getCommonDllVer().equals(
                tmBhtModule.getCommonDllVer())) {
            loginInfoItemDomain.setCommonDll(tmBhtModule.getCommonDll());
            loginInfoItemDomain.setUpdateFlg(FLAG_Y);
        }
    }
    
    /**
     * <p>
     * Set BHT-Resource domain.   BHTリソース情報を設定します。
     * </p>
     * 
     * @param resource リソース情報
     * @param loginInfoItemDomain ログイン情報
     * @param tmBhtResourceFile BHTリソース情報
     */
    private void setTmBhtResourceFile(Ws0501ResourceDomain resource,
            Ws0501LoginInfoItemDomain loginInfoItemDomain,
            TmBhtResourceFileDomain tmBhtResourceFile) {
    
        // 言語コード
        resource.setLanguageCode(tmBhtResourceFile.getLngCd());
    
        // メインモジュールリソース
        if (loginInfoItemDomain.getMainExe() != null) {
            resource.setMainResouceDll(tmBhtResourceFile.getMainResouceDll());
        }
        // パレタイズモジュールリソース
        if (loginInfoItemDomain.getPalletizeDll() != null) {
            resource.setPalletizeResouceDll(tmBhtResourceFile
                    .getPltzResouceDll());
        }
        // 搬出入モジュールリソース
        if (loginInfoItemDomain.getCarryInOutDll() != null) {
            resource.setCarryInOutResouceDll(tmBhtResourceFile
                    .getCarryIOResouceDll());
        }
        // 出荷モジュールリソース
        if (loginInfoItemDomain.getShippingDll() != null) {
            resource.setShippingResouceDll(tmBhtResourceFile
                    .getShippingResouceDll());
        }
        // 管理者モジュールリソース
        if (loginInfoItemDomain.getSettingsDll() != null) {
            resource.setSettingsResouceDll(tmBhtResourceFile
                    .getSettingsResouceDll());
        }
        // 共通モジュールリソース
        if (loginInfoItemDomain.getCommonDll() != null) {
            resource.setCommonResouceDll(tmBhtResourceFile
                    .getCommonResouceDll());
        }
    }
}