/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9018R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial display of class action Export Formalities by Item MA Edit screen.
 * <br />Export Formalities by Item MA Edit画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9008
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9019InitAction extends W9019AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<W9019CriteriaDomain, W9019CriteriaDomain> w9019InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9019InitAction() {
        super();
    }
    
    /**
     * Setter method for w9019InitFacadeService.
     *
     * @param initFacadeService Set for w9019InitFacadeService
     */
    public void setW9019InitFacadeService(SearchFacadeService<W9019CriteriaDomain, W9019CriteriaDomain> initFacadeService) {
        w9019InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9019ActionForm w9019Form = (W9019ActionForm) form;
        W9019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9019Form);
        
        // Setting of domain.
        // ドメイン設定
        w9019Form.setW9019CriteriaDomain(criteriaDomain);
        
        // judgment of processing mode.
        // 処理モード判定
        checkProcMode(w9019Form.getW9019CriteriaDomain());

        // Execution of search and input check.
        // 入力チェックと検索の実行
        w9019Form.setW9019CriteriaDomain(w9019InitFacadeService.search(criteriaDomain));
        
        // Transition to packing instruction Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W9019CriteriaDomain}.
     * <br />{@link W9008CriteriaDomain}を設定します。
     *
     * @param form Action Form of Export Formalities by Item MA Edit screen <br />Export Formalities by Item MA Edit画面のアクション・フォーム
     * @return  {@link W9019CriteriaDomain} It set up. <br />設定した{@link W9019CriteriaDomain}
     */
    protected W9019CriteriaDomain prepareCriteriaDomain (W9019ActionForm form) {
        
        W9019CriteriaDomain criteriaDomain = form.getW9019CriteriaDomain();
        // Set of common information screen.
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        if (SCREEN_ID_W9018.equals(form.getCallScreenId())) { 
            // Set Condition domain.
            // 条件ドメインの設定
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9018);
            
            if (screenInfo != null) {
                // Setting value of the take-over.
                // 引継値の設定
                W9018ActionForm w9018Form = (W9018ActionForm) screenInfo.getActionForm();
                CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w9018Form);
                // (Required for input check) to set up the language code.
                // 言語コードの設定 (入力チェックに必要)
                criteriaDomain.setLanguageCd(w9018Form.getLanguageCd());
                
                if (MODE_EDIT_REF.equals(criteriaDomain.getMode())
                    || MODE_EDIT.equals(criteriaDomain.getMode()) 
                    || MODE_COPY_NEW.equals(criteriaDomain.getMode())) {
                    criteriaDomain.setSelected(Integer.toString(w9018Form.getSelectedRow()));
                }
            }
        }
        return criteriaDomain;
    }
    
    /**
     * <br />Processing mode determination
     * <br />処理モード判定
     * 
     * @param criteria Search conditions domain<br />検索条件ドメイン
     * @throws ApplicationException Not possible to determine the processing mode<br />処理モードの判定ができない場合
     */
    protected void checkProcMode(W9019CriteriaDomain criteria) throws ApplicationException {
        // Get the registration and update authority.
        // 登録・更新権限を取得
        boolean hasUserAuthForComp 
            = userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9018R, criteria.getCompCd());

        if((MODE_NEW.equals(criteria.getMode())) && hasUserAuthForComp){
            // If there is a registration and renewal rights. Company take-over value in the new.
            // 新規で引継値.Companyの登録・更新権限がある場合
            criteria.setMode(MODE_NEW);
        }

        if(MODE_EDIT_REF.equals(criteria.getMode())){
            
            // EDIT mode or REF mode
            // 修正・参照の場合
            if(hasUserAuthForComp){
                // If there is a registration and renewal rights. Company take-over value.
                // 引継値.Companyの登録・更新権限がある場合
                criteria.setMode(MODE_EDIT);
            }else{
                // If you do not have to register and update privileges. Company take-over value.
                // 引継値.Companyの登録・更新権限がない場合
                criteria.setMode(MODE_REF);
            }
        }

        if((MODE_COPY_NEW.equals(criteria.getMode())) && hasUserAuthForComp){
            // If there is a registration and renewal rights. Company take-over value in the new copy.
            // コピー新規で引継値.Companyの登録・更新権限がある場合
            criteria.setMode(MODE_COPY_NEW);
        }
    }
}
