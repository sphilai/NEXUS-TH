/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * the initial action class of Receive Parts Transfer Report
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3011.jsp
 *     - &quot;error&quot;:-
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3011InitAction extends W3011AbstractAction {

    /**
     * SearchFacadeService
     */
    protected SearchFacadeService<List<? extends W3011ListDomain>, W3011CriteriaDomain> w3011InitFacadeService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3011InitAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3011InitFacadeServices.
     * </p>
     * 
     * @param initFacadeService Set for w3011InitFacadeService
     */
    public void setW3011InitFacadeService(
        SearchFacadeService<List<? extends W3011ListDomain>, W3011CriteriaDomain> initFacadeService) {
        w3011InitFacadeService = initFacadeService;
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

        W3011ActionForm w3011Form = (W3011ActionForm)form;
        W3011CriteriaDomain criteria = prepareCriteriaDomain(request, mapping,
            w3011Form);

        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(((W3011ActionForm)form).getWindowId());
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

        List<? extends W3011ListDomain> listDomainList = w3011InitFacadeService
            .search(criteria);
        W3011CriteriaDomain criteriaDomain = new W3011CriteriaDomain();
        if (CollectionUtils.isEmpty(listDomainList)) {
            // return FORWARD_ERROR;
            criteriaDomain.setCarryOutCompCd(criteria.getCarryOutCompCd());
            criteriaDomain.setCarryOutWhCd(criteria.getCarryOutWhCd());
            criteriaDomain.setCarryInCompCd(criteria.getCarryInCompCd());
            criteriaDomain.setCarryInWhCd(criteria.getCarryInWhCd());
            criteriaDomain.setShipperCd(criteria.getShipperCd());
            criteriaDomain.setTrNo(criteria.getTrNo());
            criteriaDomain.setTotalTags("0");
            criteriaDomain.setTrIssuerNm("0");
            criteriaDomain.setTrIssueDt("0");
            criteriaDomain.setTrStatus("0");
            criteriaDomain.setEditCnt("0");
            criteriaDomain.setTrItemTyp("0");
            criteriaDomain.setTrActvDt("0");
            criteriaDomain.setTrActvMethTyp("0");
            criteriaDomain.setTrRcvMethTyp("0");
            criteriaDomain.setTrRcvDt("0");
            w3011Form.setCriteriaDomain(criteriaDomain);
        } else {
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain,
                (W3011ListDomain)listDomainList.get(0), criteria
                    .getDateFormat());

            criteriaDomain.setTotalTags(String.valueOf(listDomainList.size()));
            w3011Form.setListDomainList(listDomainList);
            w3011Form.setCriteriaDomain(criteriaDomain);

        }
        // Display control of the Main screen
        controlDisplay((W3011ActionForm)form, request);

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
     * @see com.globaldenso.eca0027.core.presentation.W3011AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3011ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3011ActionForm form,
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
    protected W3011CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W3011ActionForm form)
        throws ApplicationException {

        W3011CriteriaDomain criteriaDomain = form.getCriteriaDomain();

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
