/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDIT_FLG_CONFIRM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MASK_CHAR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * the initial action class of Register CML Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3006.jsp
 *     - &quot;error&quot;:W3006.jsp
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3006InitAction extends W3006AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<List<? extends W3006ListDomain>, W3006CriteriaDomain> w3006InitFacadeService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3006InitAction() {
        super();
    }

    /**
     * <p>
     * Setter method for w3006InitFacadeService.
     * </p>
     * 
     * @param initFacadeService Set for w3006InitFacadeService
     */
    public void setW3006InitFacadeService(
        SearchFacadeService<List<? extends W3006ListDomain>, W3006CriteriaDomain> initFacadeService) {
        w3006InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc} Remove header information Display control Active control of
     * the screen item. ({@link W3001AbstractAction#controlDisplay(W3001ActionForm, HttpServletRequest)})
     * Hide the search results area
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
        W3006ActionForm w3006Form = (W3006ActionForm)form;
        w3006Form.setPrintableFlg(true);
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
            .getGeneralArea(((W3006ActionForm)form).getWindowId());
        ScreenInfoDomain screenInfo = new ScreenInfoDomain();
        W3006CriteriaDomain criteria = prepareCriteriaDomain(request, mapping,
            w3006Form);
        criteria.setSqlInitCheck(w3006Form.isSqlInitCheck());
        criteria.setSessionFlg(w3006Form.isSessionFlg());

        if (SCREEN_ID_W3001.equals(w3006Form.getCallScreenId())) {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W3001);
            W3001ActionForm w3001ActionForm = (W3001ActionForm)screenInfo
                .getActionForm();
            w3006Form.setSqlInitCheck(true);
            criteria.setSqlInitCheck(true);
            criteria.setTrNo(w3001ActionForm.getTrNo());
            if (EDIT_FLG_CONFIRM.equals(w3001ActionForm.getEditFlg())) {
                // To Confirm TR
                w3006Form.setSessionFlg(true);
                criteria.setSessionFlg(true);
            } else {
                // To Edit TR
                w3006Form.setSessionFlg(false);
                criteria.setSessionFlg(false);
            }

        } else if (SCREEN_ID_W3005.equals(w3006Form.getCallScreenId())) {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W3005);
            w3006Form.setSqlInitCheck(false);
            criteria.setSqlInitCheck(false);
        }

        if (w3006Form.getTrNo() != null && !"".equals(w3006Form.getTrNo())) {
            criteria.setTrNo(w3006Form.getTrNo());
        }
        List<? extends W3006ListDomain> listDomainList = w3006InitFacadeService
            .search(criteria);

        // Data mask when there is no reference authority
        // 参照権限がない場合のデータマスク
        if (SCREEN_ID_W3001.equals(w3006Form.getCallScreenId())) {
            for (int i = 0; i < listDomainList.size(); i++ ) {
                // If no RegisterAll, no BrowseAll
                // RegisterAll、BrowseAll共に保有していない場合
                if (!userAuthService.hasBrowseAll()) {
                    if (AUTH_EMPTY_NUMERIC.equals(listDomainList.get(i)
                        .getAuth())) {
                        mask(listDomainList.get(i), Arrays.asList("mainMark",
                            "cmlTyp", "trnsCd", "containerSortingKey",
                            "grossWeight", "expPackingDt", "expRequestNo"));
                        listDomainList.get(i).setMaskFlg(FLAG_Y);
                        // if it contains any masked record, deactivate Print button
                        w3006Form.setPrintableFlg(false);
                    }
                }
            }
        }

        if (CollectionUtils.isEmpty(listDomainList)) {
            if (w3006Form.isSqlInitCheck()) {
                return SCREEN_ID_W3001;
            } else {
                return SCREEN_ID_W3005;
            }
        } else {
            CommonUtil.copyPropertiesDomainToDomain(criteria,
                (W3006ListDomain)listDomainList.get(0), criteria
                    .getDateFormat());
            criteria.setTotalCml(String.valueOf(listDomainList.size()));

            if (SCREEN_ID_W3001.equals(w3006Form.getCallScreenId())) {
                criteria.setCarryOutCompCd(listDomainList.get(0).getCarryOutCompCd());
                criteria.setCarryOutWhCd(listDomainList.get(0).getCarryOutWhCd());
                criteria.setCarryInCompCd(listDomainList.get(0).getCarryInCompCd());
                criteria.setCarryInWhCd(listDomainList.get(0).getCarryInWhCd());
                criteria.setShipperCd(listDomainList.get(0).getShipperCd());
            } else{
                if (SCREEN_ID_W3005.equals(w3006Form.getCallScreenId())) {
                    screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W3005);
                    W3005CriteriaDomain w3005CriteriaDomain = ((W3005ActionForm)screenInfo
                        .getActionForm()).getCriteriaDomain();
                    criteria.setCarryOutCompCd(w3005CriteriaDomain
                        .getCarryOutCompCd());
                    criteria.setCarryOutWhCd(w3005CriteriaDomain.getCarryOutWhCd());
                    criteria.setCarryInCompCd(w3005CriteriaDomain
                        .getCarryInCompCd());
                    criteria.setCarryInWhCd(w3005CriteriaDomain.getCarryInWhCd());
                    criteria.setShipperCd(w3005CriteriaDomain.getShipperCd());
                }else{
                    if (SCREEN_ID_W3006.equals(w3006Form.getCallScreenId())) {
                        screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W3006);
                        W3006CriteriaDomain w3006CriteriaDomain = ((W3006ActionForm)screenInfo
                            .getActionForm()).getCriteriaDomain();
                        criteria.setCarryOutCompCd(w3006CriteriaDomain
                            .getCarryOutCompCd());
                        criteria.setCarryOutWhCd(w3006CriteriaDomain.getCarryOutWhCd());
                        criteria.setCarryInCompCd(w3006CriteriaDomain
                            .getCarryInCompCd());
                        criteria.setCarryInWhCd(w3006CriteriaDomain.getCarryInWhCd());
                        criteria.setShipperCd(w3006CriteriaDomain.getShipperCd());
                    }
                }
            }

            w3006Form.setListDomainList(listDomainList);
            w3006Form.setCriteriaDomain(criteria);
        }

        // Display control of the Main screen
        controlDisplay(w3006Form, request);
        w3006Form.setDisplayList(true);

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
     * @see com.globaldenso.eca0027.core.presentation.W3001AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W3001ActionForm,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W3006ActionForm form,
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
    protected W3006CriteriaDomain prepareCriteriaDomain(
        HttpServletRequest request, ActionMapping mapping, W3006ActionForm form)
        throws ApplicationException {

        W3006CriteriaDomain criteriaDomain = form.getCriteriaDomain();

        // Set of common information screen
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(),
            form.getScreenId());

        // Page control processing
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form,
            mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Setting User Permissions
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            //
            String[] permitFuncIdList = {PERMIT_FUNC_ID_W3001R,
                PERMIT_FUNC_ID_W3001B};
            List<? extends UserAuthDomain> userAuthList = userAuthService
                .getUserAuthList(permitFuncIdList);

            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }

        return criteriaDomain;
    }

    /**
     * Mask processing of field <br />
     * フィールドのマスク処理です。
     * 
     * <pre>
     * usage: mask(listDomain, Arrays
     *     .asList(&quot;loadingCd&quot;, &quot;shipToCd&quot;, &quot;dngrItemFlg&quot;, &quot;mainMark&quot;, &quot;expRequestNo&quot;,
     *         &quot;grossWeight&quot;, &quot;volume&quot;, &quot;lastTrRcvDt&quot;, &quot;dueDt&quot;));
     * </pre>
     * 
     * @param o object
     * @param maskFieldNameList List of mask field name
     */
    protected void mask(Object o, List<String> maskFieldNameList) {
        Class<?> clazz = o.getClass();
        try {
            for (String maskFieldName : maskFieldNameList) {
                Field maskField = clazz.getDeclaredField(maskFieldName);
                maskField.setAccessible(true);
                String value = (String)maskField.get(o);
                if (value != null) {
                    maskField.set(o, value.replaceAll(".", MASK_CHAR));
                }
            }
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
