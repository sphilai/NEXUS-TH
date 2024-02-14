/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *Class action Init of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のInitアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004InitAction extends W6004AbstractAction {
    /**
     * W6004InitFacadeService
     */
    protected DeleteFacadeService<Void, W6004CriteriaDomain> w6004InitFacadeService;

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004InitAction() {
        super();
    }
    
    /**
     * Setter method for w6004InitFacadeService.
     *
     * @param initFacadeService Set for w6004InitFacadeService
     */
    public void setW6004InitFacadeService(
        DeleteFacadeService<Void, W6004CriteriaDomain> initFacadeService) {
        w6004InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Delete the session information
     *     Delete the information registered in the session in this screen (W6001.Invoice Main Screen screen) or later
     * - Control of the screen
     *     Hide the search results area.
     * </pre>
     * <pre>
     * - セッション情報の削除
     *     本画面(W6001.Invoice Main Screen画面)以降にセッションに登録した情報を削除する
     * - 画面の制御
     *     検索結果エリアを非表示にします。
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Display control of a screen 
        // 画面の表示制御
        controlDisplay((W6004ActionForm) form);
        
        // Acquisition of form 
        // フォームの取得
        W6004ActionForm W6004Form = (W6004ActionForm) form;
        
        // Acquisition of CriteriaDomain 
        // CriteriaDomainの取得
        W6004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, W6004Form);
        
        criteriaDomain.setContainerSortingKey("");
        
        // Delete work
        // ワークの削除
        w6004InitFacadeService.delete(criteriaDomain);

        return FORWARD_SUCCESS;
    }

    /**
     * 
     * <br />Screen display control
     * <pre>
     * ‐Search Results Area hide
     *     Initialize the contents of the list domain search results list.
     * </pre>
     * <pre>
     * ‐検索結果エリア非表示
     *     検索結果リストドメインリストの内容を初期化します。
     * </pre>
     * 
     * @param form W6004のアクションフォーム
     */
    protected void controlDisplay(W6004ActionForm form) {
        // Search-results area is made undisplayed. 
        // 検索結果エリアを非表示にします。
        ((W6004ActionForm) form).setListDomainList(null);
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException Fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W6004ActionForm form) 
        throws ApplicationException {
        
        W6004CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Setup of screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Acquisition of the taking over information from a changing agency screen 
        // 遷移元画面からの引き継ぎ情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6003);
        W6003ActionForm w6003Form = (W6003ActionForm) screenInfo.getActionForm();
        
        CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w6003Form);
        form.setCustomTimingTyp(criteriaDomain.getCustomTimingTyp());
        
        return criteriaDomain;
    }
}
