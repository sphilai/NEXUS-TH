/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3010DetailDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * the initial action class of Receive CML Transfer Report
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3010.jsp
 *     - &quot;error&quot;:-
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010InitAction extends W3010AbstractAction {

    /**
     * SearchFacadeService
     */
    protected SearchFacadeService<List<? extends W3010ListDomain>, W3010CriteriaDomain> w3010InitFacadeService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3010InitAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3010InitFacadeService.
     * </p>
     * 
     * @param initFacadeService Set for w3010InitFacadeService
     */
    public void setW3010InitFacadeService(
        SearchFacadeService<List<? extends W3010ListDomain>, W3010CriteriaDomain> initFacadeService) {
        w3010InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc} Remove header information Display control Active control of
     * the screen item. Hide the search results area
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3010ActionForm w3010Form = (W3010ActionForm)form;
        W3010CriteriaDomain criteria = prepareCriteriaDomain(request, mapping,
            w3010Form);

        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(((W3010ActionForm)form).getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
            SCREEN_ID_W3009);
        W3009ActionForm w3009ActionForm = (W3009ActionForm)screenInfo.getActionForm();
        W3009CriteriaDomain w3009criteriaDomain = new W3009CriteriaDomain();
        w3009criteriaDomain = w3009ActionForm.getCriteriaDomain();

        criteria.setCarryOutCompCd(w3009criteriaDomain.getFmWhComCd());
        criteria.setCarryOutWhCd(w3009criteriaDomain.getFmWhCd());
        criteria.setCarryInCompCd(w3009criteriaDomain.getToWhComCd());
        criteria.setCarryInWhCd(w3009criteriaDomain.getToWhCd());
        criteria.setShipperCd(w3009criteriaDomain.getShipperCd());
        criteria.setTrNo(w3009ActionForm.getTrNo());

        List<? extends W3010ListDomain> listDomainList = w3010InitFacadeService
            .search(criteria);
        W3010DetailDomain detailDomain = new W3010DetailDomain();
        if (CollectionUtils.isEmpty(listDomainList)) {
            // return FORWARD_ERROR;
            detailDomain.setCarryOutCompCd(criteria.getCarryOutCompCd());
            detailDomain.setCarryOutWhCd(criteria.getCarryOutWhCd());
            detailDomain.setCarryInCompCd(criteria.getCarryInCompCd());
            detailDomain.setCarryInWhCd(criteria.getCarryInWhCd());
            detailDomain.setShipperCd(criteria.getShipperCd());
            detailDomain.setTrNo(criteria.getTrNo());
            detailDomain.setTotalCml("0");
            detailDomain.setTrIssuerNm("0");
            detailDomain.setTrIssueDt("0");
            detailDomain.setEditFlg("0");
            detailDomain.setTrStatus("0");
            detailDomain.setEditCnt(BigDecimal.valueOf(0));
            detailDomain.setTrItemTyp("0");
            detailDomain.setTrActvDt("0");
            detailDomain.setTrActvMethTyp("0");
            detailDomain.setTrRcvMethTyp("0");
            detailDomain.setTrRcvDt("0");
            w3010Form.setDetailDomain(detailDomain);
        } else {
            CommonUtil.copyPropertiesDomainToDomain(detailDomain,
                (W3010ListDomain)listDomainList.get(0), criteria
                    .getDateFormat());

            detailDomain.setTotalCml(String.valueOf(listDomainList.size()));
            w3010Form.setListDomainList(listDomainList);
            w3010Form.setDetailDomain(detailDomain);
            // Display control of the Main screen
            controlDisplay((W3010ActionForm)form, request);
        }

        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Button activity control. 
     * - Hide search result
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W3010AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3010ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3010ActionForm form,
        HttpServletRequest request) {
        // Active control of the button
        super.controlDisplay(form, request);
    }

    /**
     * Set the search criteria domain.
     * 
     * @param request request
     * @param mapping map
     * @param form action form
     * @return criteriaDomain
     * @throws ApplicationException exception
     */
    protected W3010CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W3010ActionForm form)
        throws ApplicationException {

        W3010CriteriaDomain criteriaDomain = form.getCriteriaDomain();

        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(),
            form.getScreenId());

        // Page control processing
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form,
            mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        return criteriaDomain;
    }

}
