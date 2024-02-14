/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0026;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0072;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0073;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0074;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0154;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Register service facade implementation class of Multi Label Register Screen
 * <br />Multi Label Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w2020RegisterFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;

    /**
     * Export Shipping Item No Special Information Master service
     * <br />輸出出荷品目番号原単位サービス
     */
    protected TmExpItemNoSpInfoService tmExpItemNoSpInfoService;

    /**
     * Export Formality Item No Master service
     * <br />輸出手続品目番号原単位サービス
     */
    protected TmExpFormalitiItemNoService tmExpFormalitiItemNoService;

    /**
     * Actual Item Weight Master service 
     * <br />実測製品重量原単位サービス
     */
    protected TmActualItemWeightService tmActualItemWeightService;

    /**
     * Package Specification Revision Master service
     * <br />包装仕様有効リビジョン原単位サービス
     */
    protected TmPkgSpecRevService tmPkgSpecRevService;

    /**
     * NEXUS Company Master Service
     * <br />NEXUS会社原単位 サービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * Constructor.
     */
    public W2020RegisterFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for tmExpItemNoSpInfoService.
     *
     * @param tmExpItemNoSpInfoService Set for tmExpItemNoSpInfoService
     */
    public void setTmExpItemNoSpInfoService(
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService) {
        this.tmExpItemNoSpInfoService = tmExpItemNoSpInfoService;
    }

    /**
     * Setter method for tmExpFormalitiItemNoService.
     *
     * @param tmExpFormalitiItemNoService Set for tmExpFormalitiItemNoService
     */
    public void setTmExpFormalitiItemNoService(
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService) {
        this.tmExpFormalitiItemNoService = tmExpFormalitiItemNoService;
    }

    /**
     * Setter method for tmActualItemWeightService.
     *
     * @param tmActualItemWeightService Set for tmActualItemWeightService
     */
    public void setTmActualItemWeightService(
        TmActualItemWeightService tmActualItemWeightService) {
        this.tmActualItemWeightService = tmActualItemWeightService;
    }

    /**
     * Setter method for tmPkgSpecRevService.
     *
     * @param tmPkgSpecRevService Set for tmPkgSpecRevService
     */
    public void setTmPkgSpecRevService(TmPkgSpecRevService tmPkgSpecRevService) {
        this.tmPkgSpecRevService = tmPkgSpecRevService;
    }

    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2020CriteriaDomain filterDomain(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w2020CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W2020CriteriaDomain> valid
            = new Validator<W2020CriteriaDomain>(w2020CriteriaDomain, "w2020CriteriaDomain");

        List<String> propertyList = new ArrayList<String>();
        propertyList.add("shipperCd");
        propertyList.add("customerCd");
        propertyList.add("lgcyShipTo");
        propertyList.add("trnsCd");
        propertyList.add("plntCd");
        propertyList.add("lgcyWhCd");
        propertyList.add("pltzItemNo");
        propertyList.add("pkgCd");
        propertyList.add("palletCartonTyp");
        propertyList.add("customerPoNo");
        if ("Y".equals(w2020CriteriaDomain.getManualRegFlg())) {
            propertyList.add("shippingLot");
            propertyList.add("cmlQty");
            propertyList.add("length");
            propertyList.add("width");
            propertyList.add("height");
            propertyList.add("volume");
            propertyList.add("grossWeight");
        } else {
            propertyList.add("cmlQty");
        }
        valid.isValidateProperties((String[])propertyList.toArray(new String[0]), SCREEN_ID_W2020);
    
        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     *
     * <pre>
     * - Packaging materials confirmed check
     * - Shipping lot Not 0 check
     * - CML QTY range check
     * - Length Not 0 check
     * - Width Not 0 check
     * - Height Not 0 check
     * - G/W Not 0 check
     *     - if OK
     *         - N/W <= G/W check
     * - Total QTY overflow check
     * - Volume overflow check
     * - N/W overflow check
     *
     * - 包装材確認済みチェック
     * - 出荷ロット ≠0チェック
     * - CML数範囲チェック
     * - Length ≠0チェック
     * - Width ≠0チェック
     * - Height ≠0チェック
     * - G/W ≠0チェック
     *     - OKの場合
     *         - N/W <= G/Wチェック
     * - Total QTYオーバーフローチェック
     * - Volumeオーバーフローチェック
     * - N/Wオーバーフローチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // Packaging materials confirmed check
        // 包装材確認済みチェック
        if (!FLAG_Y.equals(w2020CriteriaDomain.getPackagingConfirmedFlg())) {
            messageDomainList.add(new MessageDomain(NXS_E7_0039, NXS_E7_0039, null));
        }
        // Shipping lot Not 0 check
        // 出荷ロット ≠0チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getShippingLot())) {
            if (BigDecimal.ZERO.compareTo(new BigDecimal(w2020CriteriaDomain.getShippingLot())) == 0) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.shippingLot"),
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shippingLot", GSCM_E0_0034, params));
            }
        }
        // CML QTY range check
        // CML数範囲チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getCmlQty())) {
            int cmlQty = Integer.parseInt(w2020CriteriaDomain.getCmlQty());
            if (!(1 <= cmlQty && cmlQty <= 99)) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.cmlQty"),
                    "1",
                    "99"
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.cmlQty", GSCM_E0_0026, params));
            }
        }
        // Length Not 0 check
        // Length ≠0チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getLength())) {
            if (BigDecimal.ZERO.compareTo(new BigDecimal(w2020CriteriaDomain.getLength())) == 0) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.length"),
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.length", GSCM_E0_0034, params));
            }
        }
        // Width Not 0 check
        // Width ≠0チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getWidth())) {
            if (BigDecimal.ZERO.compareTo(new BigDecimal(w2020CriteriaDomain.getWidth())) == 0) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.width"),
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.width", GSCM_E0_0034, params));
            }
        }
        // Height Not 0 check
        // Height ≠0チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getHeight())) {
            if (BigDecimal.ZERO.compareTo(new BigDecimal(w2020CriteriaDomain.getHeight())) == 0) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.height"),
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.height", GSCM_E0_0034, params));
            }
        }
        // G/W Not 0 check
        // G/W ≠0チェック
        if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getGrossWeight())) {
            if (BigDecimal.ZERO.compareTo(new BigDecimal(w2020CriteriaDomain.getGrossWeight())) == 0) {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.grossWeight"),
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.grossWeight", GSCM_E0_0034, params));
            // OK
            } else {
                if (!CheckUtil.isBlankOrNull(w2020CriteriaDomain.getNetWeight())) {
                    // N/W <= G/W check
                    // N/W <= G/Wチェック
                    if (!(new BigDecimal(w2020CriteriaDomain.getNetWeight())
                        .compareTo(new BigDecimal(w2020CriteriaDomain.getGrossWeight())) <= 0))
                    {
                        messageDomainList.add(new MessageDomain(NXS_E7_0082, NXS_E7_0082, null));
                            // And does not null the first argument for the reason of FW Issue List No.79.
                            // FW修正依頼一覧.xls No.79の理由で第一引数をnullとしない。
                    }
                }
            }
        }
        // Total QTY overflow check
        // Total QTYオーバーフローチェック
        if (CheckUtil.isBlankOrNull(w2020CriteriaDomain.getTotalQty())) {
            String[] params = {
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.totalQty"),
            };
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shippingLot", NXS_E7_0157, params));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.cmlQty", null, null));
        }
        // Volume overflow check
        // Volumeオーバーフローチェック
        if (CheckUtil.isBlankOrNull(w2020CriteriaDomain.getVolume())) {
            String[] params = {
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.volume"),
            };
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.length", NXS_E7_0157, params));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.width", null, null));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.height", null, null));
        }
        // N/W overflow check
        // N/Wオーバーフローチェック
        if (CheckUtil.isBlankOrNull(w2020CriteriaDomain.getNetWeight())) {
            String[] params = {
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.netWeight"),
            };
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shippingLot", NXS_E7_0157, params));
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     *
     * From the point of view of security, perform the same check and again Search.
     * セキュリティーの観点から、再度Searchと同じチェックを実施する。
     *
     * <pre>
     * - Shipper existence check
     * - Get local date of the shipper(time is truncated)
     * - Check SIGMA not during night batch
     * - Shipper/Customer/Ship to combination check
     * - if OK
     *     - TM_NXS_SHIP_TO existence check. If NG, since the XREF exists so that the NEXUS Ship to does not exist.
     *     - TM_EXP_ITEM_NO_SP_INFO existence check
     * - Shipper/Plant/Warehouse combination check
     * - if OK
     *     - Authority check. OK if there is a register authority of CML with the entered shipper/plant.
     * - Consignee existence check
     * - TM_EXP_FORMALITI_ITEM_NO existence check
     * - TM_ACTUAL_ITEM_WEIGHT existence check
     * - If not a trial item, TM_PKG_SPEC_REV existence check
     * - Volume proper check
     *
     * - シッパー存在チェック
     * - シッパーのローカル日付を取得（時刻は切り捨て）
     * - CIGMA夜間中チェック
     * - シッパー・得意先・送荷先組み合わせチェック
     * - OKの場合
     *     - NEXUS送荷先存在チェック。NGの場合、XREFが存在するのでNEXUS送荷先が存在しないことになる。
     *     - 輸出出荷品番存在チェック
     * - シッパー・工場・倉庫組み合わせチェック
     * - OKの場合
     *     - 権限チェック。入力のシッパー・工場でＣＭＬの更新権限を保持していればOK。
     * - 荷受人存在チェック
     * - 輸出手続品番存在チェック
     * - 実測重量存在チェック
     * - 号試品でない場合、包装仕様リビジョン存在チェック
     * - Volume適正チェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // Shipper existence check
        // シッパー存在チェック
        if (!commonService.validateShipper(w2020CriteriaDomain.getShipperCd())) {
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", NXS_E7_0111, null));
            throw new ValidationException(messageDomainList);
        }

        // Get local date of the shipper(time is truncated)
        // シッパーのローカル日付を取得（時刻は切り捨て）
        String timezoneId = commonService.searchTimezone(w2020CriteriaDomain.getShipperCd());
        Date shipperLocalDateTime = DateUtil.convertTime(new Date(), timezoneId);
        Date shipperLocalDate = DateUtils.truncate(shipperLocalDateTime, Calendar.DAY_OF_MONTH);

        // Check SIGMA not during night batch
        // CIGMA夜間中チェック
        if (!commonService.searchCigmaAvailable(true, w2020CriteriaDomain.getShipperCd())) {
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", NXS_E1_0060, null));
        }

        // Shipper/Customer/Ship to combination check
        // シッパー・得意先・送荷先組み合わせチェック
        if (!commonService.validateShipperCustomerShipTo(w2020CriteriaDomain.getShipperCd(),
                w2020CriteriaDomain.getCustomerCd(), w2020CriteriaDomain.getLgcyShipTo()))
        {
            String[] params = {
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.shipperCd"),
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.customerCd"),
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.lgcyShipTo")
            };
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", GSCM_E0_0030, params));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.customerCd", null, null));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.lgcyShipTo", null, null));

        // OK
        } else {
            // TM_NXS_SHIP_TO existence check. If NG, since the XREF exists so that the NEXUS Ship to does not exist.
            // NEXUS送荷先存在チェック。NGの場合、XREFが存在するのでNEXUS送荷先が存在しないことになる。
            if (
                CheckUtil.isBlankOrNull(
                    w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper(w2020CriteriaDomain.getShipperCd(),
                        w2020CriteriaDomain.getCustomerCd(), w2020CriteriaDomain.getLgcyShipTo())
                )
            )
            {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.shipperCd"),
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.customerCd"),
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.lgcyShipTo")
                };
                messageDomainList.add(new MessageDomain(null, NXS_E7_0074, params));
            }

            // TM_EXP_ITEM_NO_SP_INFO existence check
            // 輸出出荷品番存在チェック
            TmExpItemNoSpInfoCriteriaDomain tmExpItemNoSpInfoCriteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
            tmExpItemNoSpInfoCriteriaDomain.setCompCd(w2020CriteriaDomain.getShipperCd());
            tmExpItemNoSpInfoCriteriaDomain.setItemNo(w2020CriteriaDomain.getPltzItemNo());
            tmExpItemNoSpInfoCriteriaDomain.setPkgCd(w2020CriteriaDomain.getPkgCd());
            if ("".equals(w2020CriteriaDomain.getPkgCd())) {
                tmExpItemNoSpInfoCriteriaDomain.setPkgCd(" ");
            }
            tmExpItemNoSpInfoCriteriaDomain.setCustomerCd(w2020CriteriaDomain.getCustomerCd());
            tmExpItemNoSpInfoCriteriaDomain.setLgcyShipTo(w2020CriteriaDomain.getLgcyShipTo());
            tmExpItemNoSpInfoCriteriaDomain.setAplyStrtDtLessThanEqual(shipperLocalDate);
            tmExpItemNoSpInfoCriteriaDomain.setSearchCountCheckFlg(false);
            int resultTmExpItemNoSpInfoCount = tmExpItemNoSpInfoService.searchCount(tmExpItemNoSpInfoCriteriaDomain);
            if (resultTmExpItemNoSpInfoCount < 1) {
                messageDomainList.add(
                    new MessageDomain("w2020CriteriaDomain.pltzItemNo",
                        NXS_E7_0072, new String[]{ w2020CriteriaDomain.getPltzItemNo() })
                );
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.pkgCd", null, null));
            }

            // - Consignee existence check
            // - 荷受人存在チェック
            if (
                CheckUtil.isBlankOrNull(
                    w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByComp(w2020CriteriaDomain.getShipperCd(),
                        w2020CriteriaDomain.getCustomerCd())
                )
            )
            {
                String[] params = {
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.shipperCd"),
                    commonService.getResource(w2020CriteriaDomain.getLocale(), "label.customerCd")
                };
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", GSCM_E0_0029, params));
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.customerCd", null, null));
            }
        }

        // Shipper/Plant/Warehouse combination check
        // シッパー・工場・倉庫組み合わせチェック
        if (!commonService.validateShipperWhPlant(w2020CriteriaDomain.getShipperCd(),
            w2020CriteriaDomain.getLgcyWhCd(), w2020CriteriaDomain.getPlntCd()))
        {
            String[] params = {
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.shipperCd"),
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.plntCd"),
                commonService.getResource(w2020CriteriaDomain.getLocale(), "label.lgcyWhCd")
            };
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", GSCM_E0_0030, params));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.plntCd", null, null));
            messageDomainList.add(new MessageDomain("w2020CriteriaDomain.lgcyWhCd", null, null));

        // OK
        } else {
            // Authority check. OK if there is a register authority of CML with the entered shipper/plant.
            // 権限チェック。入力のシッパー・工場でＣＭＬの更新権限を保持していればOK。
            if (!userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W2009R, w2020CriteriaDomain.getShipperCd(),
                w2020CriteriaDomain.getPlntCd()))
            {
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.shipperCd", GSCM_I0_0009, null));
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.plntCd", null, null));
            }
        }

        // TM_EXP_FORMALITI_ITEM_NO existence check
        // 輸出手続品番存在チェック
        TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteriaDomain = new TmExpFormalitiItemNoCriteriaDomain();
        tmExpFormalitiItemNoCriteriaDomain.setCompCd(w2020CriteriaDomain.getShipperCd());
        tmExpFormalitiItemNoCriteriaDomain.setItemNo(w2020CriteriaDomain.getPltzItemNo());
        tmExpFormalitiItemNoCriteriaDomain.setAplyStrtDtLessThanEqual(shipperLocalDate);
        tmExpFormalitiItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        int resultTmExpFormalitiItemNoCount = tmExpFormalitiItemNoService.searchCount(tmExpFormalitiItemNoCriteriaDomain);
        if (resultTmExpFormalitiItemNoCount < 1) {
            messageDomainList.add(
                new MessageDomain("w2020CriteriaDomain.pltzItemNo",
                    NXS_E7_0073, new String[]{ w2020CriteriaDomain.getPltzItemNo() })
            );
        }

        // TM_ACTUAL_ITEM_WEIGHT existence check
        // 実測重量存在チェック
        TmActualItemWeightCriteriaDomain tmActualItemWeightCriteriaDomain = new TmActualItemWeightCriteriaDomain();
        tmActualItemWeightCriteriaDomain.setOwnerComp(w2020CriteriaDomain.getShipperCd());
        tmActualItemWeightCriteriaDomain.setItemNo(w2020CriteriaDomain.getPltzItemNo());
        tmActualItemWeightCriteriaDomain.setSearchCountCheckFlg(false);
        int resultTmActualItemWeightCount = tmActualItemWeightService.searchCount(tmActualItemWeightCriteriaDomain);
        if (resultTmActualItemWeightCount < 1) {
            messageDomainList.add(
                new MessageDomain("w2020CriteriaDomain.pltzItemNo",
                    NXS_E7_0154, new String[]{ w2020CriteriaDomain.getPltzItemNo() })
            );
        }

        // If not a trial item, TM_PKG_SPEC_REV existence check
        // 号試品でない場合、包装仕様リビジョン存在チェック
        if (!FLAG_Y.equals(w2020CriteriaDomain.getManualRegFlg())) {
            TmPkgSpecRevCriteriaDomain tmPkgSpecRevCriteriaDomain = new TmPkgSpecRevCriteriaDomain();
            tmPkgSpecRevCriteriaDomain.setCompCd(w2020CriteriaDomain.getShipperCd());
            tmPkgSpecRevCriteriaDomain.setItemNo(w2020CriteriaDomain.getPltzItemNo());
            tmPkgSpecRevCriteriaDomain.setPkgCd(w2020CriteriaDomain.getPkgCd());
            if ("".equals(w2020CriteriaDomain.getPkgCd())) {
                tmPkgSpecRevCriteriaDomain.setPkgCd(" ");
            }
            tmPkgSpecRevCriteriaDomain.setTrnsCd(w2020CriteriaDomain.getTrnsCd());
            tmPkgSpecRevCriteriaDomain.setNProc(" ");
            tmPkgSpecRevCriteriaDomain.setSearchCountCheckFlg(false);
            int resultTmPkgSpecRevCount = tmPkgSpecRevService.searchCount(tmPkgSpecRevCriteriaDomain);
            if (resultTmPkgSpecRevCount < 1) {
                messageDomainList.add(
                    new MessageDomain("w2020CriteriaDomain.pltzItemNo",
                        NXS_E1_0040, new String[]{ w2020CriteriaDomain.getPltzItemNo() })
                );
                messageDomainList.add(new MessageDomain("w2020CriteriaDomain.pkgCd", null, null));
            }
        }

        // Volume proper check
        // Volume適正チェック
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(w2020CriteriaDomain.getShipperCd());
        TmNxsCompDomain resultTmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        if (resultTmNxsCompDomain != null) {
            if (resultTmNxsCompDomain.getPltzVolumeMax() != null
                && !CheckUtil.isBlankOrNull(w2020CriteriaDomain.getVolume()))
            {
                if (resultTmNxsCompDomain.getPltzVolumeMax()
                    .compareTo(new BigDecimal(w2020CriteriaDomain.getVolume())) < 0)
                {
                    VtCompMeasureUnitDomain resultVtCompMeasureUnitDomain
                        = commonService.searchMeasureUnit(w2020CriteriaDomain.getShipperCd());
                    String[] params = {
                        resultTmNxsCompDomain.getPltzVolumeMax().toPlainString()
                        + resultVtCompMeasureUnitDomain.getVolumeUnitDisp(),
                    };
                    messageDomainList.add(new MessageDomain("w2020CriteriaDomain.length", NXS_E7_0009, params));
                    messageDomainList.add(new MessageDomain("w2020CriteriaDomain.width", null, null));
                    messageDomainList.add(new MessageDomain("w2020CriteriaDomain.height", null, null));
                }
            }
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     *
     * <pre>
     * - PL domain -> BL domain transfer
     * - Call register service
     * - BL domain -> PL domain transfer.
     * - PLドメイン→BLドメイン移送
     * - 登録サービス呼び出し
     * - BLドメイン→PLドメイン移送
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2020CriteriaDomain callServices(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W2009CmlCriteriaDomain cmlCriteriaDomain = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteriaDomain,
            w2020CriteriaDomain, w2020CriteriaDomain.getScreenDateFormat());
        cmlCriteriaDomain.setLengthUnit(w2020CriteriaDomain.getShipperLengthUnit());
        cmlCriteriaDomain.setVolumeUnit(w2020CriteriaDomain.getShipperVolumeUnit());
        cmlCriteriaDomain.setWeightUnit(w2020CriteriaDomain.getShipperWeightUnit());

        // Call register service
        // 登録サービス呼び出し
        W2009CmlDomain resultCmlDomain = w2009CmlService.registerOnMultiLabelRegister(cmlCriteriaDomain);

        // BL domain -> PL domain transfer.
        // Temporarily to use the copyProperties order to perform the type conversion automatically.
        // BLドメイン→PLドメイン移送
        // 型変換を自動で行うため一時的にcopyPropertiesを使用。
        W2020CriteriaDomain tempW2020CriteriaDomain = null;
        tempW2020CriteriaDomain = new W2020CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tempW2020CriteriaDomain,
            resultCmlDomain, w2020CriteriaDomain.getScreenDateFormat());
        w2020CriteriaDomain.setFromMainMark(resultCmlDomain.getFromMainMark());
        w2020CriteriaDomain.setToMainMark(resultCmlDomain.getToMainMark());
        w2020CriteriaDomain.setExpPackingDt(tempW2020CriteriaDomain.getExpPackingDt());
        w2020CriteriaDomain.setExpPackingIssuerId(resultCmlDomain.getExpPackingIssuerId());
        w2020CriteriaDomain.setExpPackingIssuerNm(resultCmlDomain.getExpPackingIssuerNm());

        return w2020CriteriaDomain;
    }
}
