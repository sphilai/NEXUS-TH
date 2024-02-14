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

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.business.domain.Ws0501BhtLockListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501BhtLockMessageListItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0501LoginInfoItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501LoginInfoItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501ModuleInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501ResultDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtPortalService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS0501.<BR>
 * WS0501のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version $Revision: 10657 $
 */
public class Ws0501SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<Ws0501ResultDomain, Ws0501CriteriaDomain> {

    /**
     * <p>
     * WsBhtPortalService service<BR>
     * WsBhtPortalServiceサービス
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
    public Ws0501SearchFacadeServiceImpl() {
        super();
    }

    /**
     * <p>
     * setter method of WsBhtPortalService<BR>
     * WsBhtPortalServiceのセッターメソッドです。
     * </p>
     * 
     * @param wsBhtPortalService wsBhtPortalService に設定する
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
     * @param vmUserInfoService vmUserInfoService に設定する
     */
    public void setVmUserInfoService(VmUserInfoService vmUserInfoService) {
        this.vmUserInfoService = vmUserInfoService;
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
    protected Ws0501CriteriaDomain filterDomain(Ws0501CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
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
    protected void validateItems(Ws0501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<Ws0501CriteriaDomain> valid = new Validator<Ws0501CriteriaDomain>(
            inputDomain);

        // 単項目チェック
        String[] properties = {"dscId", "pinCode", "cntryCd", "timezoneCode",
            "deviceTypId", "mainExeVer", "pltzDllVer",
            "carryIODllVer", "shippingDllVer", "settingsDllVer", "commonDllVer"};

        // 単項目チェック
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS0501);

        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
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
    protected void validateConsistency(Ws0501CriteriaDomain inputDomain)
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
    protected void validateDatabase(Ws0501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * <p>
     * Login authentication and Check version of BHT module.<BR>
     * ログイン認証、BHTアプリバージョンチェック。
     * </p>
     * <p>
     * 
     * <pre>
     * - Get user information.
     * <BR>
     * - Login authentication.
     * <BR>
     * - Check version of BHT module.
     * <BR>
     * - If BHT version is not up-to-date, get modules and resource files.
     * <BR>
     * - Get BHT lock target message information.
     * <BR>
     * - ユーザ情報を取得する。
     * <BR>
     * - ログイン認証。
     * <BR>
     * - BHTモジュールのバージョンチェック。
     * <BR>
     * - BHTバージョンが最新でない場合、モジュールおよびリソースファイルを取得。
     * <BR>
     * - BHTロック対象メッセージ情報を取得。
     * <BR>
     * </pre>
     * 
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @return Processing result 処理結果
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected Ws0501ResultDomain callServices(Ws0501CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        Ws0501LoginInfoItemCriteriaDomain loginInfoItemCriteriaDomain = new Ws0501LoginInfoItemCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(loginInfoItemCriteriaDomain,
            inputDomain);

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
                new String[] {userInfoCriteria.getDscId()});
        }

        loginInfoItemCriteriaDomain.setVmUserInfo(userInfoList.get(0));

        // サービス呼び出し
        Ws0501LoginInfoItemDomain loginInfoItemDomain = this.wsBhtPortalService
            .searchLoginInfo(loginInfoItemCriteriaDomain);

        return this.convertToResultDomain(loginInfoItemDomain);
    }

    /**
     * <p>
     * Module and BHT lock message convert To ResultDomain.<BR>
     * モジュール情報およびBHTロック対象メッセージ情報をResultDomainへ設定。
     * </p>
     * 
     * @param loginInfoItemDomain Login Information Item domain ログイン情報ドメイン
     * @return result ResultDomain 処理結果ドメイン
     */
    private Ws0501ResultDomain convertToResultDomain(
        Ws0501LoginInfoItemDomain loginInfoItemDomain) {
        Ws0501ResultDomain resultDomain = new Ws0501ResultDomain();

        resultDomain.setResultCode(loginInfoItemDomain.getResultCode());

        Ws0501ModuleInfoDomain moduleInfo = new Ws0501ModuleInfoDomain();
        
        moduleInfo.setUpdateFlg(loginInfoItemDomain.getUpdateFlg());
        moduleInfo.setMainExe(loginInfoItemDomain.getMainExe());
        moduleInfo.setPalletizeDll(loginInfoItemDomain.getPalletizeDll());
        moduleInfo.setCarryInOutDll(loginInfoItemDomain.getCarryInOutDll());
        moduleInfo.setShippingDll(loginInfoItemDomain.getShippingDll());
        moduleInfo.setSettingsDll(loginInfoItemDomain.getSettingsDll());
        moduleInfo.setCommonDll(loginInfoItemDomain.getCommonDll());
        
        moduleInfo.setResourceList(loginInfoItemDomain.getResourceList());
        resultDomain.setModuleInfo(moduleInfo);

        // BHTロック対象メッセージ設定
        List<TmBhtLockMsgMgtDomain> tmBhtLockMsgMgtList = loginInfoItemDomain
            .getTmBhtLockMsgMgtList();
        List<Ws0501BhtLockListItemDomain> bhtLockList = new ArrayList<Ws0501BhtLockListItemDomain>();
        for (TmBhtLockMsgMgtDomain tmBhtLockMsgMgt : tmBhtLockMsgMgtList) {
            this.setBhtLockListItem(bhtLockList, tmBhtLockMsgMgt);
        }
        resultDomain.setBhtLockList(bhtLockList);

        return resultDomain;
    }

    /**
     * <p>
     * BHT lock list item set.<BR>
     * BHTロック情報設定。
     * </p>
     * 
     * @param bhtLockList BHT lock list domain BHTロック情報リスト
     * @param bhtLockMsgMgt BHT lock message domain BHTロックメッセージ情報ドメイン
     */
    private void setBhtLockListItem(
        List<Ws0501BhtLockListItemDomain> bhtLockList,
        TmBhtLockMsgMgtDomain bhtLockMsgMgt) {

        if (bhtLockList.size() == 0
            || !bhtLockMsgMgt.getScreenId().equals(
                bhtLockList.get(bhtLockList.size() - 1).getScreenId())) {
            Ws0501BhtLockListItemDomain bhtLockListItem = new Ws0501BhtLockListItemDomain();
            bhtLockListItem.setScreenId(bhtLockMsgMgt.getScreenId());
            List<Ws0501BhtLockMessageListItemDomain> bhtLockMessageListItemList = new ArrayList<Ws0501BhtLockMessageListItemDomain>();
            Ws0501BhtLockMessageListItemDomain bhtLockMessageListItem = new Ws0501BhtLockMessageListItemDomain();
            bhtLockMessageListItem.setMsgId(bhtLockMsgMgt.getMsgId());
            bhtLockMessageListItemList.add(bhtLockMessageListItem);
            bhtLockListItem.setBhtLockMessageList(bhtLockMessageListItemList);
            bhtLockList.add(bhtLockListItem);
        } else {
            Ws0501BhtLockListItemDomain bhtLockListItem = bhtLockList
                .get(bhtLockList.size() - 1);
            List<Ws0501BhtLockMessageListItemDomain> bhtLockMessageListItemList = bhtLockListItem
                .getBhtLockMessageList();
            Ws0501BhtLockMessageListItemDomain bhtLockMessageListItem = new Ws0501BhtLockMessageListItemDomain();
            bhtLockMessageListItem.setMsgId(bhtLockMsgMgt.getMsgId());
            bhtLockMessageListItemList.add(bhtLockMessageListItem);
            bhtLockListItem.setBhtLockMessageList(bhtLockMessageListItemList);
            bhtLockList.set(bhtLockList.size() - 1, bhtLockListItem);
        }
    }

}