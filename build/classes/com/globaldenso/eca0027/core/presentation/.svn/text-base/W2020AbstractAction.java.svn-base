/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Multi Label Register Screen
 * <br />Multi Label Register画面の基底アクションクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public abstract class W2020AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W2020AbstractAction() {
        super();
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
     * {@inheritDoc}.
     *
     * <pre>
     * - Initialization pulldown list
     * - プルダウンリスト初期化処理
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W2020ActionForm form = (W2020ActionForm)actForm;

        form.getW2020CriteriaDomain().setManualRegFlg(
            form.getW2020CriteriaDomain().getManualRegFlgHidden()
        );

        // Considering the case where there is a header portion rewritten by the tool, forcibly restored to the state of the search time.
        // If the premise is not changed by the tool this process is unnecessary.
        // ツールによるヘッダ部書き換えがあった場合を考慮し、強制的に検索時点の状態に復元。
        // ツールによる変更がない前提であれば本処理は不要。
        if (!"/W2020Search".equals(mapping.getPath())) {
            WindowInfoDomain windowInfoDomain = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfoDomain = windowInfoDomain.getScreenInfo().get(SCREEN_ID_W2020);
            if (screenInfoDomain != null) {
                W2020CriteriaDomain w2020CriteriaDomain
                    = ((W2020ActionForm)screenInfoDomain.getActionForm()).getW2020CriteriaDomain();
                form.getW2020CriteriaDomain().setShipperCd(w2020CriteriaDomain.getShipperCd());
                form.getW2020CriteriaDomain().setLgcyShipTo(w2020CriteriaDomain.getLgcyShipTo());
                form.getW2020CriteriaDomain().setTrnsCd(w2020CriteriaDomain.getTrnsCd());
                form.getW2020CriteriaDomain().setPlntCd(w2020CriteriaDomain.getPlntCd());
                form.getW2020CriteriaDomain().setLgcyWhCd(w2020CriteriaDomain.getLgcyWhCd());
                form.getW2020CriteriaDomain().setPltzItemNo(w2020CriteriaDomain.getPltzItemNo());
                form.getW2020CriteriaDomain().setItemDescription(w2020CriteriaDomain.getItemDescription());
                form.getW2020CriteriaDomain().setPkgCd(w2020CriteriaDomain.getPkgCd());
                form.getW2020CriteriaDomain().setPalletCartonTyp(w2020CriteriaDomain.getPalletCartonTyp());
                form.getW2020CriteriaDomain().setCustomerPoNo(w2020CriteriaDomain.getCustomerPoNo());
                form.getW2020CriteriaDomain().setManualRegFlg(w2020CriteriaDomain.getManualRegFlg());
                form.getW2020CriteriaDomain().setManualRegFlgHidden(w2020CriteriaDomain.getManualRegFlgHidden());
            }
        }

        // Initialization pulldown list
        // プルダウンリスト初期化処理

        // Get language code
        // 言語コードを取得
        WindowInfoDomain windowInfoDomain
            = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfoDomain = windowInfoDomain.getCommonInfo();
        String langCd = commonInfoDomain.getLanguageCd();

        // Transportation code list
        List<? extends SelectListItemDomain> transCdList
            = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        request.setAttribute(ATTR_TRANS_CD, transCdList);

        // Pallet/Carton Type code list
        List<? extends SelectListItemDomain> palletCartonTyp
            = commonService.searchPullDownList(CD_TYPE_PALLET_CARTON_TYP, langCd, PULLDOWN_DISP_TYPE_VALUE, false);
        request.setAttribute(ATTR_PALLET_CARTON_TYP, palletCartonTyp);

        return super.preInvokeExecute(mapping, actForm, request, response);
    }

    /**
     * {@inheritDoc}.
     *
     * <pre>
     * - Activation control of the item
     * - 項目の活性化制御
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        W2020ActionForm form = (W2020ActionForm)actForm;

        List<String> disableList = new ArrayList<String>();
        List<String> headerList
            = Arrays.asList(
                    "w2020CriteriaDomain.shipperCd"
                ,   "w2020CriteriaDomain.customerCd"
                ,   "w2020CriteriaDomain.lgcyShipTo"
                ,   "w2020CriteriaDomain.trnsCd"
                ,   "w2020CriteriaDomain.plntCd"
                ,   "w2020CriteriaDomain.lgcyWhCd"
                ,   "w2020CriteriaDomain.pltzItemNo"
                ,   "w2020CriteriaDomain.pkgCd"
                ,   "w2020CriteriaDomain.palletCartonTyp"
                ,   "w2020CriteriaDomain.customerPoNo"
                ,   "w2020CriteriaDomain.manualRegFlg"
                ,   "search"
            );
        // initial
        if ("1".equals(form.getW2020CriteriaDomain().getDisplayControlStatus())) {
            disableList.add("w2020CriteriaDomain.shippingLot");
            disableList.add("pkgMaterials");
            disableList.add("register");
            disableList.add("printCml");
            disableList.add("clear");
        // search done
        } else if ("2".equals(form.getW2020CriteriaDomain().getDisplayControlStatus())) {
            disableList.addAll(headerList);
            disableList.add("printCml");
        // register done
        } else if ("3".equals(form.getW2020CriteriaDomain().getDisplayControlStatus())) {
            disableList.addAll(headerList);
            disableList.add("pkgMaterials");
            disableList.add("register");
        }
        // if overflow
        List<String> overflowFieldList = form.getW2020CriteriaDomain().getOverflowFieldList();
        if (overflowFieldList != null) {
            if (0 < overflowFieldList.size()) {
                disableList.add("register");
            }
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
