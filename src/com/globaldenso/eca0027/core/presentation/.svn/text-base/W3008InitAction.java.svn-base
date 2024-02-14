/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COME_FROM_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COME_FROM_W3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDIT_FLG_CONFIRM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MASK_CHAR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * the initial action class of Register Parts Transfer Report screen
 * 
 * <pre>
 *  forward name-path mappings:
 *     - &quot;success&quot;:W3008.jsp
 *     - &quot;error&quot;:W3008.jsp
 * </pre>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008InitAction extends W3008AbstractAction {

    /**
     * <p>
     * Search facade service
     * </p>
     */
    protected SearchFacadeService<List<? extends W3008ListDomain>, W3008CriteriaDomain> w3008InitFacadeService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3008InitAction() {
        super();
    }

    /**
     * <p>Setter method for w3008InitFacadeService.</p>
     *
     * @param initFacadeService Set for w3008InitFacadeService
     */
    public void setW3008InitFacadeService(
        SearchFacadeService<List<? extends W3008ListDomain>, W3008CriteriaDomain> initFacadeService) {
        w3008InitFacadeService = initFacadeService;
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
        // Hide Search Results Area
        ((W3008ActionForm)form).setDisplayList(false);
        W3008ActionForm w3008Form = (W3008ActionForm)form;
        w3008Form.setPrintableFlg(true);
        W3008CriteriaDomain w3008CriteriaDomain = ((W3008ActionForm)form)
            .getCriteriaDomain();
        if (w3008Form.isRegisterFlg()) {
            w3008Form.setCallScreenId(SCREEN_ID_W3001);
        }

        List<? extends W3008ListDomain> listDomainList = null;
        // from W3001
        if (SCREEN_ID_W3001.equals(w3008Form.getCallScreenId())
            || SCREEN_ID_W3001.equals(w3008CriteriaDomain.getGamenId())) {
            w3008CriteriaDomain.setTransferFlg(COME_FROM_W3001);
            WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
                .getGeneralArea(((W3008ActionForm)form).getWindowId());
            ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
                SCREEN_ID_W3001);
            //Chaiporn modify 2016/01/20
            if(screenInfo != null){            
            //Chaiporn modify 2016/01/20
            List<? extends W3001ListDomain> w3001List = ((W3001ActionForm)screenInfo
                .getActionForm()).getW3001ListDomainList();

            if (!w3008Form.isRegisterFlg()) {
                // CommonUtil.copyPropertiesDomainToDomain(w3008CriteriaDomain,
                // w3001CriteriaDomain);
                // 2014/07/25 tanaka
                w3008CriteriaDomain.setEditFlg(((W3001ActionForm)screenInfo
                    .getActionForm()).getEditFlg());
                if (SCREEN_ID_W3001.equals(w3008Form.getCallScreenId())) {
                    for (int i = 0; i < w3001List.size(); i++ ) {
                        if (w3008Form.getTrNo().equals(
                            w3001List.get(i).getTrNo())) {
                            w3008CriteriaDomain.setCarryInCompCd(w3001List.get(
                                i).getCarryInCompCd());
                            w3008CriteriaDomain.setCarryInWhCd(w3001List.get(i)
                                .getCarryInWhCd());
                        }
                    }
                }
            } else if(w3008Form.isCancelFlg()){ // After Cancel TR
                w3008CriteriaDomain.setEditFlg(EDIT_FLG_CONFIRM);
            }
            ActionUtil.prepareBusinessDomain(w3008CriteriaDomain, w3008Form
                .getWindowId(), w3008Form.getScreenId());
          //Chaiporn modify 2016/01/20
            }
          //Chaiporn modify 2016/01/20
            if (w3008Form.getTrNo() != null && !"".equals(w3008Form.getTrNo())) {
                w3008CriteriaDomain.setTrNo(w3008Form.getTrNo());
            }
            // Setting User Permissions
            if (userAuthService.hasRegisterAll()
                || userAuthService.hasBrowseAll()) {
                w3008CriteriaDomain.setUserAuthList(null);
            } else {
                //
                String[] permitFuncIdList = {PERMIT_FUNC_ID_W3001R,
                    PERMIT_FUNC_ID_W3001B};
                List<? extends UserAuthDomain> userAuthList = userAuthService
                    .getUserAuthList(permitFuncIdList);

                if (userAuthList.size() == 0) {
                    throw new GscmApplicationException(GSCM_I0_0009);
                }

                w3008CriteriaDomain.setUserAuthList(userAuthList);
            }

            try {
                listDomainList = w3008InitFacadeService
                    .search(w3008CriteriaDomain);
            } catch (GscmApplicationException e) {
                return SCREEN_ID_W3001;
            }
            w3008CriteriaDomain.setGamenId(SCREEN_ID_W3001);
            w3008Form.setCallScreenId(SCREEN_ID_W3001);

            // Data mask when there is no reference authority
            // 参照権限がない場合のデータマスク
            for (int i = 0; i < listDomainList.size(); i++ ) {
                // If no RegisterAll, no BrowseAll
                // RegisterAll、BrowseAll共に保有していない場合
                if (!userAuthService.hasBrowseAll()) {
                    if (AUTH_EMPTY_NUMERIC.equals(listDomainList.get(i)
                        .getAuth())) {
                        mask(listDomainList.get(i), Arrays.asList("itemNo",
                            "pkgCd", "actQty", "actTagQty", "soh", "transQty"));
                        listDomainList.get(i).setMaskFlg(FLAG_Y);
                        // if it contains any masked record, deactivate Print button
                        w3008Form.setPrintableFlg(false);
                    }
                }
            }

        } else if (SCREEN_ID_W3007.equals(w3008Form.getCallScreenId())
            || SCREEN_ID_W3007.equals(w3008CriteriaDomain.getGamenId())) {
            w3008CriteriaDomain.setTransferFlg(COME_FROM_W3007);
            WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get()
                .getGeneralArea(((W3008ActionForm)form).getWindowId());
            ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(
                SCREEN_ID_W3007);

            W3007CriteriaDomain w3007criteriaDomain = ((W3007ActionForm)screenInfo
                .getActionForm()).getCriteriaDomain();

            // copy Header information
            CommonUtil.copyPropertiesDomainToDomain(w3008CriteriaDomain,
                w3007criteriaDomain);

            ActionUtil.prepareBusinessDomain(w3008CriteriaDomain, w3008Form
                .getWindowId(), w3008Form.getScreenId());

            try {
                listDomainList = w3008InitFacadeService
                    .search(w3008CriteriaDomain);
            } catch (GscmApplicationException e) {
                return SCREEN_ID_W3007;
            }
            if (listDomainList.size() != 0) {
                w3008CriteriaDomain.setEditCnt("0");
                w3008CriteriaDomain.setTrItemTyp("2");
                w3008CriteriaDomain.setTrIssuerNm(listDomainList.get(0)
                    .getUserName());
            }
            w3008CriteriaDomain.setGamenId(SCREEN_ID_W3007);
        }
        if (listDomainList != null && listDomainList.size() != 0) {
            if (listDomainList.get(0).getCarryInCompCd() != null) {
                CommonUtil.copyPropertiesDomainToDomain(w3008CriteriaDomain,
                    (W3008ListDomain)listDomainList.get(0), w3008CriteriaDomain
                        .getDateFormat());
            }
            w3008CriteriaDomain.setTotalTags(String.valueOf(listDomainList
                .size()));
        }
        w3008Form.setListDomainList(listDomainList);
        w3008Form.setCriteriaDomain(w3008CriteriaDomain);
        // Display control of the Main screen
        controlDisplay((W3008ActionForm)form, request);
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
    protected void controlDisplay(W3008ActionForm form,
        HttpServletRequest request) {
        // Active control of the button
        super.controlDisplay(form, request);

        // Hide Search Results Area
        form.setDisplayList(true);
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
