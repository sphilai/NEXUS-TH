/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Initialize action class of Multi Label Register Screen
 * <br />Multi Label Register画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2020.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020InitAction extends W2020AbstractAction {

    /**
     * Init facade service.
     */
    protected SearchFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> w2020InitFacadeService;

    /**
     * constructor.
     */
    public W2020InitAction() {
        super();
    }

    /**
     * Setter method for W2020InitFacadeService.
     *
     * @param initFacadeService Set for W2020InitFacadeService
     */
    public void setW2020InitFacadeService(
        SearchFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> initFacadeService) {
        w2020InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - PL domain registration
     * - To complement the common information
     * - If transition from the PKG Info Detail screen.
     *   - call of service facade
     * - PLドメイン取得
     * - 共通情報を補完
     * - PKG Info Detail画面からの遷移の場合。
     *   - facadeサービスの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2020ActionForm form = (W2020ActionForm)actForm;

        // PL domain registration
        // PLドメイン取得
        W2020CriteriaDomain w2020CriteriaDomain = form.getW2020CriteriaDomain();
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w2020CriteriaDomain, form.getWindowId(), form.getScreenId());

        // If transition from the PKG Info Detail screen.
        // PKG Info Detail画面からの遷移の場合。
        if (SCREEN_ID_W2013.equals(form.getCallScreenId())) {
            // call of service facade
            // facadeサービスの呼び出し
            w2020InitFacadeService.search(w2020CriteriaDomain);
            if (w2020CriteriaDomain.getOverflowFieldList() != null) {
                if (0 < w2020CriteriaDomain.getOverflowFieldList().size()) {
                    ActionMessages errors = new ActionMessages();
                    for (String overflowField : w2020CriteriaDomain.getOverflowFieldList()) {
                        errors.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage(NXS_E7_0157, Arrays.asList(new String[]{ overflowField }))
                        );
                    }
                    if (0 < errors.size()) {
                        saveErrors(request, errors);
                    }
                }
            }

            w2020CriteriaDomain.setPackagingConfirmedFlg(FLAG_Y);
        }

        // 設計書画像作成用。リリース時はここから削除すること。
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperCd", "MMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "customerCd", "99999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "lgcyShipTo", "99");
//        BeanUtils.setProperty(w2020CriteriaDomain, "trnsCd", "S");
//        BeanUtils.setProperty(w2020CriteriaDomain, "plntCd", "MM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "lgcyWhCd", "M");
//        BeanUtils.setProperty(w2020CriteriaDomain, "pltzItemNo", "MMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "pkgCd", "MMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "palletCartonTyp", "P");
//        BeanUtils.setProperty(w2020CriteriaDomain, "customerPoNo", "MMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "manualRegFlg", "N");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipToCd", "MM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "packingWhCompCd", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "packingWhCd", "M");
//        BeanUtils.setProperty(w2020CriteriaDomain, "itemDescription", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "containerSortingKey", "MMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "loadingCd", "M");
//        BeanUtils.setProperty(w2020CriteriaDomain, "containerLooseTyp", "M");
//        BeanUtils.setProperty(w2020CriteriaDomain, "invoiceKey", "MMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "stgInstrItemFlg", "Y");
//        BeanUtils.setProperty(w2020CriteriaDomain, "customTimingTyp", "M");
//        BeanUtils.setProperty(w2020CriteriaDomain, "expLimitTyp", "MMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "expLimitFlg", "Y");
//        BeanUtils.setProperty(w2020CriteriaDomain, "dngrItemFlg", "Y");
//        BeanUtils.setProperty(w2020CriteriaDomain, "originCntryCd", "MM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "pkgFormTyp", "S");
//        BeanUtils.setProperty(w2020CriteriaDomain, "coFlg", "*");
//        BeanUtils.setProperty(w2020CriteriaDomain, "rtUseFlg", "Y");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shippingLot", "9999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "cmlQty", "99");
//        BeanUtils.setProperty(w2020CriteriaDomain, "qtyUnit", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "totalQty", "9999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "orderQty", "9999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "onHandQty", "9999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "boQty", "9999999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "length", "9999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "width", "9999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "height", "9999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "volume", "999999999999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "itemWeight", "1");
//        BeanUtils.setProperty(w2020CriteriaDomain, "netWeight", "9999999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "grossWeight", "9999999.999");
//        BeanUtils.setProperty(w2020CriteriaDomain, "originalItemWeight", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperLengthUnit", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperLengthUnitDisp", "m");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperVolumeUnit", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperVolumeUnitDisp", "m3");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperWeightUnit", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "shipperWeightUnitDisp", "kg");
//        BeanUtils.setProperty(w2020CriteriaDomain, "originalItemWeightUnit", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "currCd", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "fromMainMark", "MMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "toMainMark", "MMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "expPackingDt", "31/12/16");
//        BeanUtils.setProperty(w2020CriteriaDomain, "expPackingIssuerId", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "expPackingIssuerNm", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "usrNmEn", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
//        BeanUtils.setProperty(w2020CriteriaDomain, "consigneeCd", "");
//        BeanUtils.setProperty(w2020CriteriaDomain, "packagingConfirmedFlg", "");
//        w2020CriteriaDomain.setDisplayControlStatus("2");
        // ここまで削除すること。

        return FORWARD_SUCCESS;
    }
}
