/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of initial display action for Shipping Actuality Create screen.
 * <br />船積実績Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W7003
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003InitAction extends W7003AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected DeleteFacadeService<Void, W7003CriteriaDomain> w7003InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7003InitAction() {
        super();
    }

    /**
     * Setter method for w7003InitFacadeService.
     *
     * @param initFacadeService Set for w7003InitFacadeService
     */
    public void setW7003InitFacadeService(DeleteFacadeService<Void, W7003CriteriaDomain> initFacadeService) {
        w7003InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting the initial VALUE
     *     If transition from Header screen to take over the Header condition.
     * 
     * ‐Delete processing of Shipping Actuality Invoice Work
     * </pre>
     * <pre>
     * ‐初期値の設定
     *     Header画面から遷移している場合、Header条件の引き継ぎを行う
     * 
     * ‐船積実績対象インボイスワークの削除処理
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        W7003ActionForm w7003Form = prepareForm((W7003ActionForm) form);
        // Copy search criteria domain Header information. 
        // 初期値の設定
        copyHeaderInfo(w7003Form);
        // Remove the Shipping Actuality Invoice Work. 
        // 船積実績対象インボイスワークの削除
        removeShippingActInvoice(w7003Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Copy search criteria domain Header information.
     * <br />Header情報を検索条件ドメインにコピーします。
     *
     * @param form Action Form of Shipping Actuality Create screen<br />
     * 船積実績Create画面のアクションフォーム
     */
    protected void copyHeaderInfo(W7003ActionForm form) {
        W7003CriteriaDomain criteriaDomain = form.getW7003CriteriaDomain();
        
        if(SCREEN_ID_W7002.equals(form.getCallScreenId())) {
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W7002);
            
            W7002ActionForm w7002Form = (W7002ActionForm) screenInfo.getActionForm();
            W7002CriteriaDomain headerInfo = w7002Form.getW7002CriteriaDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, headerInfo);
        }
    }

    /**
     * Remove the Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークを削除します。
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @throws ApplicationException If do not be able to delete the Shipping Actuality Invoice Work<br />
     * 船積実績対象インボイスワークを削除できなかった場合
     */
    protected void removeShippingActInvoice(W7003ActionForm form) throws ApplicationException {
        W7003CriteriaDomain criteriaDomain = form.getW7003CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        w7003InitFacadeService.delete(criteriaDomain);
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     * 
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W7003ActionForm prepareForm(W7003ActionForm form) {
        form.setListDomainList(null);
        return form;
    }
}
