/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of upload action for Order Upload screen.
 * <br />受注アップロード画面のUploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /WB020
 *     ‐"error": /WB020
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13730 $
 */
public class WB020UploadAction extends WB020AbstractAction {

    /**
     * Upload Facade Service
     * <br />Upload Facadeサービス
     */
    protected TransactFacadeService<WB020OdrUploadReqDomain, WB020OdrUploadReqDomain> wb020UploadFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020UploadAction() {
        super();
    }

    /**
     * Setter method for wb020UploadFacadeService.
     *
     * @param uploadFacadeService Set for wb020UploadFacadeService
     */
    public void setWb020UploadFacadeService(
        TransactFacadeService<WB020OdrUploadReqDomain, WB020OdrUploadReqDomain> uploadFacadeService) {
        wb020UploadFacadeService = uploadFacadeService;
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
     * ‐ Set of search criteria domain
     *     Set the {@link WB020OdrUploadReqDomain}.
     *     
     * ‐ File upload, search
     *     Call the {@link WB008UploadFacadeServiceImpl}.
     * 
     * ‐ Set of search results
     * 
     * ‐ Screen display control
     *     Call the {@link #controlDisplay(WB020ActionForm, HttpServletRequest)}.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link WB020OdrUploadReqDomain}を設定します。
     *     
     * ‐ファイルのアップロード、再検索
     *     {@link WB008UploadFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(WB020ActionForm, HttpServletRequest)}を呼出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm, HttpServletRequest request, HttpServletResponse response)
        throws Exception
    {
        WB020ActionForm form = (WB020ActionForm)actForm;
        if (form.getFormFileData() == null) {
            throw new SystemException(NXS_91_0001);
        } else if (form.getFormFileData().getInputStream() == null) {
            throw new SystemException(NXS_91_0001);
        }
        try {
            WB020OdrUploadReqDomain wb020CriteriaDomain = form.getWb020CriteriaDomain();
            ActionUtil.prepareBusinessDomain(wb020CriteriaDomain, form.getWindowId(), form.getScreenId());
            wb020CriteriaDomain.setUploadFileInputStream(form.getFormFileData().getInputStream());
            wb020CriteriaDomain.setUploadFileNm(form.getFormFileData().getFileName());
            wb020CriteriaDomain.setUploadFileSize(form.getFormFileData().getFileSize());

            wb020UploadFacadeService.transact(wb020CriteriaDomain);

        } finally {
            try {
                form.getFormFileData().getInputStream().close();
            } catch (Exception e) {}
            form.getFormFileData().destroy();
            form.setFormFileData(null);
            form.getWb020CriteriaDomain().setUploadFileInputStream(null);
        }

        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0008, 1));
        addMessages(request, messages);

        return FORWARD_SUCCESS;
    }
}
