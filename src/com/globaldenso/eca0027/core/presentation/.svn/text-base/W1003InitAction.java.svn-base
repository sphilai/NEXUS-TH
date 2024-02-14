/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a Export Request Descriptions screen.
 * <br />
 * <pre>
 * forward name-path mappings:
 *     - "success":W1003.jsp
 *     - "error":W1003.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1003InitAction extends W1003AbstractAction {

    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<W1003UpdateDomain, W1003UpdateDomain> w1003InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1003InitAction() {
        super();
    }
    
    /**
     * Setter method for w1003InitFacadeService.
     * 
     * @param initFacadeService Set for w1003InitFacadeService
     */
    public void setW1003InitFacadeService(
        SearchFacadeService<W1003UpdateDomain, W1003UpdateDomain> initFacadeService) {
        w1003InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
  
        if (!isBack(request)) {
            W1003ActionForm w1003Form = prepareForm((W1003ActionForm) form);
            W1003UpdateDomain w1003UpdateDomain = prepareCriteriaDomain(w1003Form);
            W1003UpdateDomain result = w1003InitFacadeService.search(w1003UpdateDomain);
            
            // Setting of search results
            w1003Form.setW1003CriteriaDomain(result.getCriteriaDomain());
            w1003Form.setListDomainList(result.getListDomainList());
            w1003Form.setQtyList(result.getQtyList());
            w1003Form.setAmountList(result.getAmountList());
            // Display control of a Main screen
            controlDisplay(w1003Form, request);
        }
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W1003ActionForm prepareForm(W1003ActionForm form) {
        
        // The clearance of a List domain
        form.setListDomainList(null);
        
        // Backup of Transition-original-screen ID
        if (!form.getCallScreenId().equals(SCREEN_ID_W1003)) {
            form.setFromScreenId(form.getCallScreenId());
        }
        
        return form;
    }
    
    /**
     *    An information is acquired from action form and a session and a search-condition domain is created.
     * <br />アクションフォーム、セッションから情報を取得して検索条件ドメインを作成
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When a business error occurs during processing<br />処理中に業務的なエラーが発生した場合
     */
    protected W1003UpdateDomain prepareCriteriaDomain(W1003ActionForm form) throws GscmApplicationException {
        
        // Acquisition of a search-condition domain
        W1003UpdateDomain w1003UpdateDomain = new W1003UpdateDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1002);
        
        // Acquisition of a search-condition domain
        W1003CriteriaDomain w1003Criteria = form.getW1003CriteriaDomain();
        
        if(screenInfo != null){
            W1002CriteriaDomain w1002CriteriaDomain = ((W1002ActionForm) screenInfo.getActionForm()).getW1002CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1003Criteria, w1002CriteriaDomain);
        }else {
            screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1001);
            if(screenInfo == null)//ISSUE 084
            {
                screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1006);
                W1006CriteriaDomain w1006CriteriaDomain = ((W1006ActionForm) screenInfo.getActionForm()).getW1006CriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(w1003Criteria, w1006CriteriaDomain);
            }else{
                W1001CriteriaDomain w1001CriteriaDomain = ((W1001ActionForm) screenInfo.getActionForm()).getW1001CriteriaDomain();
                if (!CheckUtil.isBlankOrNull(w1001CriteriaDomain.getSelected()) && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList() != null && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() > 0) {
                    int selectedRow = Integer.parseInt(w1001CriteriaDomain.getSelected());
                    if(selectedRow > ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() && ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().size() > 0)//ISSUE 084
                    {
                        W1001ListDomain w100ListDomain = ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().get(0);
                        CommonUtil.copyPropertiesDomainToDomain(w1003Criteria, w100ListDomain);
                    }else{
                        W1001ListDomain w100ListDomain = ((W1001ActionForm) screenInfo.getActionForm()).getListDomainList().get(selectedRow);
                        CommonUtil.copyPropertiesDomainToDomain(w1003Criteria, w100ListDomain);
                    }
                }
            }
        } 
        
        w1003UpdateDomain.setCriteriaDomain(w1003Criteria);
        
        return w1003UpdateDomain;
    }
    
    /**
     * Set screen button attributes. Set screen field attributes.
     * <br />ボタンの表示制御、項目の活性・非活性制御
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @throws ApplicationException When an error occurs in DB processing<br />DB処理でエラーが発生した場合
     */
    protected void controlDisplay(W1003ActionForm form, HttpServletRequest request) throws ApplicationException {
        // Set screen button attributes.
        super.controlDisplay(request, form);
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
