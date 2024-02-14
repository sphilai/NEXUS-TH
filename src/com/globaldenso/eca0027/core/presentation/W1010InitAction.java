/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1010CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 *    This is an initial display action class of a Export Request Upload.
 * <br />梱包指示Upload画面の初期表示アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1010InitAction extends W1010AbstractAction {

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1010InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        W1010ActionForm w1010Form = (W1010ActionForm) form;
        // Set the search criteria domain. 
        W1010CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w1010Form);
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
}
