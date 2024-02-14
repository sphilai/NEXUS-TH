/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;

/**
 * The Clear action class of Multi Label Register Screen
 * <br />Multi Label Register画面のクリアーアクションクラスです。
 * <pre>
 * <pre>
 * forward name-path mappings:
 *     - "success":W2020.jsp
 *     - "error":W2020.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020ClearAction extends W2020AbstractAction {

    /**
     * Init facade service.
     */
    protected DeleteFacadeService<Integer, W2020CriteriaDomain> w2020ClearFacadeService;

    /**
     * constructor.
     */
    public W2020ClearAction() {
        super();
    }

    /**
     * Setter method for W2020InitFacadeService.
     *
     * @param clearFacadeService Set for W2020InitFacadeService
     */
    public void setW2020ClearFacadeService(
        DeleteFacadeService<Integer, W2020CriteriaDomain> clearFacadeService) {
        w2020ClearFacadeService = clearFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Clear item value other than the header
     * - ヘッダ以外の項目値をクリア
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2020ActionForm form = (W2020ActionForm)actForm;

        W2020CriteriaDomain w2020CriteriaDomain = form.getW2020CriteriaDomain();
        w2020CriteriaDomain.setShipToCd(null);
        w2020CriteriaDomain.setPackingWhCompCd(null);
        w2020CriteriaDomain.setPackingWhCd(null);
        w2020CriteriaDomain.setItemDescription(null);
        w2020CriteriaDomain.setContainerSortingKey(null);
        w2020CriteriaDomain.setLoadingCd(null);
        w2020CriteriaDomain.setContainerLooseTyp(null);
        w2020CriteriaDomain.setInvoiceKey(null);
        w2020CriteriaDomain.setStgInstrItemFlg(null);
        w2020CriteriaDomain.setCustomTimingTyp(null);
        w2020CriteriaDomain.setExpLimitTyp(null);
        w2020CriteriaDomain.setExpLimitFlg(null);
        w2020CriteriaDomain.setDngrItemFlg(null);
        w2020CriteriaDomain.setOriginCntryCd(null);
        w2020CriteriaDomain.setPkgFormTyp(null);
        w2020CriteriaDomain.setCoFlg(null);
        w2020CriteriaDomain.setRtUseFlg(null);
        w2020CriteriaDomain.setShippingLot(null);
        w2020CriteriaDomain.setCmlQty(null);
        w2020CriteriaDomain.setQtyUnit(null);
        w2020CriteriaDomain.setTotalQty(null);
        w2020CriteriaDomain.setOrderQty(null);
        w2020CriteriaDomain.setOnHandQty(null);
        w2020CriteriaDomain.setBoQty(null);
        w2020CriteriaDomain.setLength(null);
        w2020CriteriaDomain.setWidth(null);
        w2020CriteriaDomain.setHeight(null);
        w2020CriteriaDomain.setVolume(null);
        w2020CriteriaDomain.setItemWeight(null);
        w2020CriteriaDomain.setNetWeight(null);
        w2020CriteriaDomain.setGrossWeight(null);
        w2020CriteriaDomain.setOriginalItemWeight(null);
        w2020CriteriaDomain.setShipperLengthUnit(null);
        w2020CriteriaDomain.setShipperLengthUnitDisp(null);
        w2020CriteriaDomain.setShipperVolumeUnit(null);
        w2020CriteriaDomain.setShipperVolumeUnitDisp(null);
        w2020CriteriaDomain.setShipperWeightUnit(null);
        w2020CriteriaDomain.setShipperWeightUnitDisp(null);
        w2020CriteriaDomain.setOriginalItemWeightUnit(null);
        w2020CriteriaDomain.setCurrCd(null);
        w2020CriteriaDomain.setFromMainMark(null);
        w2020CriteriaDomain.setToMainMark(null);
        w2020CriteriaDomain.setExpPackingDt(null);
        w2020CriteriaDomain.setExpPackingIssuerId(null);
        w2020CriteriaDomain.setExpPackingIssuerNm(null);
        w2020CriteriaDomain.setUsrNmEn(null);
        w2020CriteriaDomain.setConsigneeCd(null);
        w2020CriteriaDomain.setPackagingConfirmedFlg(null);
        w2020CriteriaDomain.setOverflowFieldList(null);

        w2020CriteriaDomain.setDisplayControlStatus("1"); // initial

        return FORWARD_SUCCESS;
    }
}
