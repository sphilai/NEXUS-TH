/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0046;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1010CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class of Search action for Export Request screen.
 * <br />船積実績Main画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W1010
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1010UploadAction extends W1010AbstractAction {

    /**
     * Upload FacadeService<br />
     * 検索FacadeService
     */
    protected ProcessFacadeService<String [], W1010CriteriaDomain> w1010UploadFacadeService;

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1010UploadAction() {
        super();
    }

    /**
     * Setter method for w1010UploadFacadeService.
     *
     * @param uploadFacadeService Set for w1010UploadFacadeService
     */
    public void setW1010UploadFacadeService(
        ProcessFacadeService<String [], W1010CriteriaDomain> uploadFacadeService) {
        w1010UploadFacadeService = uploadFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - See the data that matches the criteria you specified in the search condition area.
     *   To display the search results area when search results of 1 or more.
     * </pre>
     * <pre>
     * ‐検索条件エリアで指定した条件に一致するデータを表示する
     *   検索結果が1件以上の場合に検索結果エリアを表示する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W1010ActionForm w1010Form = (W1010ActionForm) form;
        // Set the search criteria domain. 
        W1010CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w1010Form);

        String [] resultList = w1010UploadFacadeService.process(criteriaDomain);

        controlDisplay(w1010Form, request);
        
        // Addition of a message
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, resultList[0]));
        if(!resultList[1].equals("0")){
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_E0_0046, resultList[1]));   
        }
        addMessages(request, messages);

        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping action mapping<br />アクション・マッピング
     * @param form Action Form<br />アクション・フォーム
     * @return Search conditions domain<br />検索条件ドメイン
     * @throws ApplicationException if it fails to set the search criteria domain<br />検索条件ドメインの設定に失敗した場合
     */
    protected W1010CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W1010ActionForm form) 
        throws ApplicationException {
        
        W1010CriteriaDomain criteriaDomain = form.getW1010CriteriaDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1002);
        
        if(screenInfo != null){
            W1002CriteriaDomain w1002CriteriaDomain = ((W1002ActionForm) screenInfo.getActionForm()).getW1002CriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w1002CriteriaDomain);
        }
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setLanguageCd(form.getLanguageCd());
        
        try {
            if (null != form.getFormFileData()) {
                criteriaDomain.setUploadFileData(form.getFormFileData().getInputStream());
                criteriaDomain.setUploadFileName(form.getFormFileData().getFileName());
                criteriaDomain.setUploadFileSize(form.getFormFileData().getFileSize());
            }
        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }

        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W9007AbstractAction#controlDisplay(com.globaldenso.eca0027.core.presentation.W9007ActionForm, javax.servlet.http.HttpServletRequest)
     */
    @Override
    protected void controlDisplay(W1010ActionForm form,
        HttpServletRequest request) {
        super.controlDisplay(form, request);
    }
}
