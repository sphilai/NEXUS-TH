/*
 * PROJECT：NEXUS
 *
 * VtShippfirmMain のService実装クラス
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtShippingFirmDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService;
import com.globaldenso.eca0027.core.auto.business.service.VtShippingFirmService;
import com.globaldenso.eca0027.core.business.dao.WsBhtShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.Ws5502TtPltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5502TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5501ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5502UpdateShippingFirmDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * <p>
 * An implementation class of shipment confirmation service.<BR>
 * 出荷確認サービスの実装クラスです。
 * </p>
 * 
 * @version 1.00
 */
public class WsBhtShippingFirmServiceImpl implements WsBhtShippingFirmService {

    /**
     * <p>
     * Shipping confirm lock service (SACT)<BR>
     * 出荷確認情報ロックサービス
     * </p>
     */
    private VtShippingFirmService vtShippingFirmService;

    /**
     * <p>
     * Shipping confirm update service (SACT)<BR>
     * 出荷確認情報更新サービス
     * </p>
     */
    private TtShippingFirmService ttShippingFirmService;

    /**
     * <p>
     * Palletize update service (SACT)<BR>
     * パレタイズ情報更新サービス
     * </p>
     */
    private TtPltzService ttPltzService;

    /**
     * <p>
     * Palletize lock service<BR>
     * パレタイズ情報ロックサービス
     * </p>
     */
    private WsBhtShippingFirmDao wsBhtShippingFirmDao;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public WsBhtShippingFirmServiceImpl() {
    }

    // ------------------- 依存サービス・DaoのGetter / Setter -------------------

    /**
     * <p>
     * Setter method for Shipping confirm lock service.
     * </p>
     *
     * @param vtShippingFirmService
     *            Set for Shipping confirm lock service
     */
    public void setVtShippingFirmService(VtShippingFirmService vtShippingFirmService) {
        this.vtShippingFirmService = vtShippingFirmService;
    }

    /**
     * <p>
     * Setter method for Shipping confirm update service.
     * </p>
     *
     * @param ttShippingFirmService
     *            Set for Shipping confirm update service
     */
    public void setTtShippingFirmService(
            TtShippingFirmService ttShippingFirmService) {
        this.ttShippingFirmService = ttShippingFirmService;
    }

    /**
     * <p>
     * Setter method for Palletize update service.
     * </p>
     *
     * @param ttPltzService
     *            Set for Palletize update service
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * <p>
     * Setter method for Palletize lock service.
     * </p>
     *
     * @param wsBhtShippingFirmDao
     *            Set for Palletize lock service
     */
    public void setWsBhtShippingFirmDao(
            WsBhtShippingFirmDao wsBhtShippingFirmDao) {
        this.wsBhtShippingFirmDao = wsBhtShippingFirmDao;
    }

    // -------------------------- メソッド ---------------------------
    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.sactsample.auto.business.service.WsBhtShippingFirmService#searchShippingFirm(com.globaldenso.eca0027.core.business.service.criteria.Ws5501ShippingFirmCriteriaDomain)
     */
    public List<VtShippingFirmDomain> searchShippingFirm(
            Ws5501ShippingFirmCriteriaDomain shippingFirmCriteria)
        throws GscmApplicationException, ApplicationException {

        /* 5.1.パレタイズ情報の取得、5.2.まとめパレタイズ情報の取得 */
        VtShippingFirmCriteriaDomain vtShippingFirmCriteria = new VtShippingFirmCriteriaDomain();
        // 出荷確認
        vtShippingFirmCriteria.setShippingFirmNo(shippingFirmCriteria
                .getShippingConfirmNo());
        // MAIN_MARKを降順で取得
        vtShippingFirmCriteria.setPreferredOrder("MAIN_MARK desc");

        List<VtShippingFirmDomain> vtShippingFirmList = vtShippingFirmService
                .searchByCondition(vtShippingFirmCriteria);

        /* 5.4.検索結果判定 */
        if (vtShippingFirmList == null || vtShippingFirmList.size() == 0) {
            throw new GscmApplicationException(
                    NXS_E1_5035,
                    new String[] { shippingFirmCriteria.getShippingConfirmNo() });
        } else {
            // 全てのレコードについて、出荷確認ステータスが10(Issue List)であることをチェック
            for (VtShippingFirmDomain vtShippingFirm : vtShippingFirmList) {
                if (PLTZ_INSTR_STATUS_INSTRUCTION_CREATED
                        .equals(vtShippingFirm.getShippingFirmStatus())) {
                }
                else {
                    throw new GscmApplicationException(NXS_E1_5036,
                            new String[] { shippingFirmCriteria
                                    .getShippingConfirmNo() });
                }
            }
        }

        return vtShippingFirmList;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.sactsample.auto.business.service.WsBhtShippingFirmService#validateDatabaseTtShippingFirmOnShippingFirm(com.globaldenso.eca0027.core.business.service.criteria.Ws5502UpdateShippingFirmDomain)
     */
    public boolean validateDatabaseTtShippingFirmOnShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException {

        // 検索条件の設定
        TtShippingFirmCriteriaDomain ttShippingFirmCriteria = new TtShippingFirmCriteriaDomain();
        ttShippingFirmCriteria.setShippingFirmNo(wsUpdateShippingFirm
                .getShippNo());

        // 出荷確認情報のロック
        TtShippingFirmDomain ttShippingFirm = ttShippingFirmService
                .lockByKeyNoWait(ttShippingFirmCriteria);

        // 出荷確認情報のステータスチェック
        if (PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(ttShippingFirm
                .getShippingFirmStatus())) {
            throw new GscmApplicationException(NXS_E1_5036,
                    new String[] { wsUpdateShippingFirm.getShippNo() });
        }

        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.sactsample.auto.business.service.WsBhtShippingFirmService#validateDatabaseTtPltzOnShippingFirm(com.globaldenso.eca0027.core.business.service.criteria.Ws5502UpdateShippingFirmDomain)
     */
    public boolean validateDatabaseTtPltzOnShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException {

        // 検索条件の設定
        Ws5502TtPltzCriteriaDomain ws5502TtPltzCriteria = new Ws5502TtPltzCriteriaDomain();
        ws5502TtPltzCriteria.setShippingFirmNo(wsUpdateShippingFirm
                .getShippNo());

        // パレタイズ情報のロック
        List<Ws5502TtPltzDomain> ws5502TtPltz = wsBhtShippingFirmDao
                .lockTtPltzByConditionNoWait(ws5502TtPltzCriteria);
        // チェック処理なし（ws5502TtPltzは未使用でOK）
        if(ws5502TtPltz.size() != 0)
        {
        }

        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.sactsample.auto.business.service.WsBhtShippingFirmService#updateShippingFirm(com.globaldenso.eca0027.core.business.service.criteria.Ws5502UpdateShippingFirmDomain)
     */
    public boolean updateShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException {

        /* 7.1.出荷確認テーブル */
        // 更新情報設定
        TtShippingFirmDomain ttShippingFirm = new TtShippingFirmDomain();
        ttShippingFirm
                .setShippingFirmStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        ttShippingFirm.setWorkedDt(DateUtil.convertTime(new Date(),
                wsUpdateShippingFirm.getVmUserInfo().getTimezoneId()));
        ttShippingFirm.setWorkedIssuerNm(wsUpdateShippingFirm.getVmUserInfo()
                .getUsrNmEn());
        ttShippingFirm.setWorkedMethTyp(wsUpdateShippingFirm.getSdankubu());
        // 2014.10.10 DSC-ID追加
        ttShippingFirm.setWorkedIssuerId(wsUpdateShippingFirm.getDscId());
        // 2014.08.10 画面ID追加
        ttShippingFirm.setComUpdateFuncId(wsUpdateShippingFirm.getScreenId());

        // 更新条件設定
        TtShippingFirmCriteriaDomain ttShippingFirmCriteria = new TtShippingFirmCriteriaDomain();
        ttShippingFirmCriteria.setShippingFirmNo(wsUpdateShippingFirm
                .getShippNo());

        // 更新
        ttShippingFirmService.updateByCondition(ttShippingFirm,
                ttShippingFirmCriteria);

        /* 7.2.パレタイズテーブル */
        // 更新情報設定
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setPltzStatus(PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL);
        // 2014.08.10 画面ID追加
        ttPltz.setComUpdateFuncId(wsUpdateShippingFirm.getScreenId());

        // 更新条件設定
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setShippingFirmNo(wsUpdateShippingFirm.getShippNo());

        // 更新
        ttPltzService.updateByCondition(ttPltz, ttPltzCriteria);

        return true;
    }
}