/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_FREIGHT_RESPONSIBLE_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PAY_METH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1002UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a Export Request Header screen.
 * <br />梱包指示Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1002.jsp
 *     - "error":W1002.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1002InitAction extends W1002AbstractAction {
    
    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected TransactFacadeService<W1002UpdateDomain, W1002CriteriaDomain> w1002InitFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1002InitAction() {
        super();
    }
    
    /**
     * Setter method for w1002InitFacadeService.
     *
     * @param initFacadeService Set for w1002InitFacadeService
     */
    public void setW1002InitFacadeService(TransactFacadeService<W1002UpdateDomain, W1002CriteriaDomain> initFacadeService) {
        w1002InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        String pageState = request.getParameter("pageState");
        String shipper = request.getParameter("shipperCd");
        String shipTo = request.getParameter("shipToCd");
        String splitShipping = request.getParameter("splitShipping");
        String compCd = request.getParameter("compCd");
        // Setting of action form
        // アクションフォームの設定
        W1002ActionForm w1002Form = (W1002ActionForm) form;
        if (!isBack(request)) {
            if(pageState != null && pageState.equals("ajax"))
            {
                w1002Form.getW1002CriteriaDomain().setShipperCd(shipper);
                w1002Form.getW1002CriteriaDomain().setShipToCd(shipTo);
                w1002Form.getW1002CriteriaDomain().setScreenId("1002");
                w1002Form.getW1002CriteriaDomain().setSplitShippingNgFlg(splitShipping);
                w1002Form.getW1002CriteriaDomain().setCompCd(compCd);
                super.searchContainerSortList(w1002Form, request);
                PrintWriter out = null;
                out = response.getWriter();
                out.write(w1002Form.getW1002CriteriaDomain().getShipToCntryCd() + "&" + w1002Form.getW1002CriteriaDomain().getContainerSortingKey()  );
            }
            else if (!CheckUtil.isBlankOrNull(w1002Form.getW1002CriteriaDomain().getShipperCd()) && !CheckUtil.isBlankOrNull(w1002Form.getW1002CriteriaDomain().getShipToCd())) {
                prepareFrom(w1002Form);
                super.controlDisplay(w1002Form, request);
                super.searchContainerSortList(w1002Form, request);
            }else{
                // Setting of a search-condition domain
                // 検索条件ドメインの設定
                W1002CriteriaDomain criteria = prepareCriteriaDomain(w1002Form);
                W1002UpdateDomain updateDomain = w1002InitFacadeService.transact(criteria);
                
                CommonUtil.copyPropertiesDomainToDomain(w1002Form.getW1002CriteriaDomain(), updateDomain.getCriteriaDomain());
                w1002Form.getW1002CriteriaDomain().setLanguageCd(criteria.getLanguageCd());
                
                // Set Default dropdownList on Init
                if(w1002Form.getW1002CriteriaDomain() != null && w1002Form.getW1002CriteriaDomain().getFreightResponsibleCd() == null)
                {
                    List <? extends SelectListItemDomain> freightResList = (List <? extends SelectListItemDomain> ) request.getAttribute(ATTR_FREIGHT_RESPONSIBLE_CD);
                    if(freightResList != null && freightResList.size() > 0){
                        w1002Form.getW1002CriteriaDomain().setFreightResponsibleCd(((SelectListItemDomain)freightResList.get(freightResList.size() - 1)).getId());
                    }
                }
                if(w1002Form.getW1002CriteriaDomain() != null && w1002Form.getW1002CriteriaDomain().getSplitShippingNgFlg() == null)
                {
                    w1002Form.getW1002CriteriaDomain().setSplitShippingNgFlg("N");
                    
                }
                if(w1002Form.getW1002CriteriaDomain() != null && w1002Form.getW1002CriteriaDomain().getStagingInstructionFlg() == null)
                {
                    w1002Form.getW1002CriteriaDomain().setStagingInstructionFlg("N");
                    
                }
                if(w1002Form.getW1002CriteriaDomain() != null && w1002Form.getW1002CriteriaDomain().getPayMeth() == null)
                {
                    List <? extends SelectListItemDomain> paymentList = (List <? extends SelectListItemDomain> ) request.getAttribute(ATTR_PAY_METH);
                    if(paymentList != null && paymentList.size() > 0){
                        w1002Form.getW1002CriteriaDomain().setPayMeth(((SelectListItemDomain)paymentList.get(paymentList.size() - 1)).getId());
                    }
                    
                }
                //Issue 181
                if(w1002Form.getW1002CriteriaDomain() != null && w1002Form.getW1002CriteriaDomain().getReExpGoodsFlg() == null)
                {
                    w1002Form.getW1002CriteriaDomain().setReExpGoodsFlg("N");
                }
                prepareFrom(w1002Form);
                super.controlDisplay(w1002Form, request);
            }
        }else{
            W1002CriteriaDomain criteria = w1002Form.getW1002CriteriaDomain();
            ActionUtil.prepareBusinessDomain(criteria, w1002Form.getWindowId(), w1002Form.getScreenId());
            W1002UpdateDomain updateDomain = w1002InitFacadeService.transact(criteria);
            CommonUtil.copyPropertiesDomainToDomain(w1002Form.getW1002CriteriaDomain(), updateDomain.getCriteriaDomain());
            super.controlDisplay(w1002Form, request);
        }
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException 
     */
    protected W1002CriteriaDomain prepareCriteriaDomain(W1002ActionForm form){
        W1002CriteriaDomain criteriaDomain = form.getW1002CriteriaDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W1001);
        
        if(screenInfo == null){ //ISSUE 084
            screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W1006);
            if(screenInfo == null){
                // W1006 ->W1003 ->W1002
                screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W1003);
                W1003ActionForm w1003Form = (W1003ActionForm) screenInfo.getActionForm();
                CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w1003Form);
                criteriaDomain.setExpRequestNo(w1003Form.getW1003CriteriaDomain().getExpRequestNo());
            }else{
                W1006ActionForm w1006Form = (W1006ActionForm) screenInfo.getActionForm();
                CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w1006Form);
                criteriaDomain.setExpRequestNo(w1006Form.getW1006CriteriaDomain().getExpRequestNo());
            }
        }else{
            W1001ActionForm w1001Form = (W1001ActionForm) screenInfo.getActionForm();
            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w1001Form);
            
            // Case Select W1007 ->W1006 ->W1003 ->W1002
            if(criteriaDomain.getExpRequestNo() == null || criteriaDomain.getExpRequestNo().trim().length() == 0)
            {
                screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W1006);
                if(screenInfo != null)
                {
                    W1006ActionForm w1006Form = (W1006ActionForm) screenInfo.getActionForm();
                    if(w1006Form.getW1006CriteriaDomain() != null && w1006Form.getW1006CriteriaDomain().getExpRequestNo() != null && w1006Form.getW1006CriteriaDomain().getExpRequestNo().trim().length() > 0  )
                    {
                        criteriaDomain.setExpRequestNo(w1006Form.getW1006CriteriaDomain().getExpRequestNo());
                    }
                }
            }
        }
            
        // Set common information
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        if(criteriaDomain.getProcMode() == null )//ISSUE 084
        {
            criteriaDomain.setProcMode(MODE_EDIT);
        }
        return criteriaDomain;
    }
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param form W1002ActionForm
     */
    protected void prepareFrom(W1002ActionForm form){
        W1002CriteriaDomain criteriaDomain = form.getW1002CriteriaDomain();
        
        if (MODE_NEW.equals(criteriaDomain.getProcMode())
            || MODE_COPY_NEW.equals(criteriaDomain.getProcMode())) {
            form.setRegisterFlg(false);
        } else {
            if (criteriaDomain.getRequestStatus() != null) {
                String status = criteriaDomain.getRequestStatus().split(":")[0].trim();
                if (Integer.parseInt(status) < 10) {
                    form.setRegisterFlg(true);
                }
                if (Integer.parseInt(status) > 40) {
                    form.setCancelFlg(true);
                }else{
                    form.setCancelFlg(false);
                }
            }
        }
        if (!form.getCallScreenId().equals(SCREEN_ID_W1002)) {
            form.setFromScreenId(form.getCallScreenId());
        }
    }
    
    /**
     * Check if the back button was pressed
     * <br />戻るボタンによる画面遷移かどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return true if the back button was pressed, otherwise false<br />戻るボタンによる画面遷移であればtrue、それ以外はfalse
     */
    protected boolean isBack(HttpServletRequest request) {
        return Boolean.valueOf(request.getParameter("back"));
    }

}
