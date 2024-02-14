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
import com.globaldenso.eca0027.core.auto.business.domain.VtShippingFirmDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.business.domain.Ws5501MainMarkDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5501ShippingConfirmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5501ShippingConfirmTypDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5501ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5501ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtShippingFirmService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS5501.<BR>
 * WS5501のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class Ws5501SearchFacadeServiceImpl extends
        AbstractSearchFacadeService<Ws5501ResultDomain, Ws5501CriteriaDomain> {

    /**
     * <p>
     * WsBhtShippingFirmService service<BR>
     * WsBhtShippingFirmServiceサービス
     * </p>
     */
    private WsBhtShippingFirmService wsBhtShippingFirmService;

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
    public Ws5501SearchFacadeServiceImpl() {
    }

    /**
     * <p>
     * setter method of WsBhtShippingFirmService<BR>
     * WsBhtShippingFirmServiceのセッターメソッドです。
     * </p>
     * 
     * @param wsBhtShippingFirmService wsBhtShippingFirmService に設定する
     */
    public void setWsBhtShippingFirmService(
            WsBhtShippingFirmService wsBhtShippingFirmService) {
        this.wsBhtShippingFirmService = wsBhtShippingFirmService;
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
    protected Ws5501CriteriaDomain filterDomain(Ws5501CriteriaDomain inputDomain)
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
    protected void validateConsistency(Ws5501CriteriaDomain inputDomain)
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
    protected void validateDatabase(Ws5501CriteriaDomain inputDomain)
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
    protected void validateItems(Ws5501CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {

        Validator<Ws5501CriteriaDomain> valid = new Validator<Ws5501CriteriaDomain>(
                inputDomain);

        // 単項目チェック
        String[] properties = { "dscId", "shippingConfirmNo" };

        // 単項目チェック
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS5501);

        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }

    }

    /**
     * <p>
     * Shipment confirmation information acquisition process.<BR>
     * 出荷確認情報取得処理。
     * </p>
     * <p>
     * <pre>
     * - Get user information.<BR>
     * - Get shipment confirmation information.<BR>
     * - ユーザ情報を取得する。<BR>
     * - 出荷確認情報を取得する。<BR>
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
    protected Ws5501ResultDomain callServices(Ws5501CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        /* 4.ユーザ情報の取得 */
        // ユーザ情報検索パラメータ
        VmUserInfoCriteriaDomain userInfoCriteria = new VmUserInfoCriteriaDomain();
        userInfoCriteria.setDscId(inputDomain.getDscId());    // 条件設定

        // ユーザ情報を取得
        vmUserInfoService = (VmUserInfoService) SpringUtil.getBean("vmUserInfoService");
        List<VmUserInfoDomain> userInfoList = this.vmUserInfoService
                .searchByCondition(userInfoCriteria);

        // ユーザ情報取得結果判定
        if (userInfoList == null || userInfoList.size() < 1) {
            throw new GscmApplicationException(NXS_E1_5031,
                    new String[] { userInfoCriteria.getDscId() });
        }

        // ユーザ情報を設定
        Ws5501ShippingFirmCriteriaDomain shippingFirmCriteria
            = new Ws5501ShippingFirmCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteria,
                inputDomain);
        shippingFirmCriteria.setVmUserInfo(userInfoList.get(0));

        // サービス呼び出し
        List<VtShippingFirmDomain> vtShippingFirmList = wsBhtShippingFirmService
                .searchShippingFirm(shippingFirmCriteria);

        return this.convertToResultDomain(vtShippingFirmList, userInfoList);
    }

    /**
     * <p>
     * Shipment confirmation convert To ResultDomain.<BR>
     * 出荷確認情報をResultDomainへ設定。
     * </p>
     * @param vtShippingFirmList
     *            Shipment confirmation domain   出荷確認情報ドメイン
     * @param userInfoList
     *            User information domain   ユーザ情報ドメイン
     * @return result   ResultDomain   処理結果ドメイン
     */
    private Ws5501ResultDomain convertToResultDomain(
            List<VtShippingFirmDomain> vtShippingFirmList,
            List<VmUserInfoDomain> userInfoList) {
        Ws5501ResultDomain result = new Ws5501ResultDomain();

        // shippingConfirmTyp
        Ws5501ShippingConfirmTypDomain shippingConfirmTyp
            = new Ws5501ShippingConfirmTypDomain();
        shippingConfirmTyp.setBhtShippingConfirmTyp(userInfoList.get(0)
                .getBhtShippingFirmTyp());
        result.setShippingConfirmTyp(shippingConfirmTyp);

        // shippingConfirmHeader
        Ws5501ShippingConfirmDomain shippingConfirmHeader = new Ws5501ShippingConfirmDomain();

        VtShippingFirmDomain vtShippingFirm = vtShippingFirmList.get(0);

        shippingConfirmHeader.setShippingConfirmNo(vtShippingFirm
                .getShippingFirmNo());
        shippingConfirmHeader.setStgActNo(vtShippingFirm.getStgActNo());
        shippingConfirmHeader.setStgInstrNo(vtShippingFirm.getStgInstrNo());

        List<Ws5501MainMarkDomain> stagingDetail = new ArrayList<Ws5501MainMarkDomain>();

        for (VtShippingFirmDomain workVtShippingFirm : vtShippingFirmList) {
            this.setStagingDetailItem(stagingDetail, workVtShippingFirm);
        }
        shippingConfirmHeader.setStagingDetail(stagingDetail);

        result.setShippingConfirmHeader(shippingConfirmHeader);
        result.setResultCode(WS_RESULT_SUCCESS);

        return result;
    }

    /**
     * <p>
     * Staging detail item set.<BR>
     * 詳細項目設定。
     * </p>
     * @param stagingDetail
     *            Main mark domain   メインマーク情報ドメイン
     * @param vtShippingFirm
     *            Shipping confirmation domain   出荷確認情報ドメイン
     */
    private void setStagingDetailItem(List<Ws5501MainMarkDomain> stagingDetail,
            VtShippingFirmDomain vtShippingFirm) {
        Ws5501MainMarkDomain stagingDetailItem = new Ws5501MainMarkDomain();
        stagingDetailItem.setMainMark(vtShippingFirm.getMainMark());
        stagingDetail.add(stagingDetailItem);
    }
}