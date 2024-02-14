/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W7007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base class action of B / L upload screen.
 * <br />B/Lアップロード画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11048 $
 */
public abstract class W7007AbstractAction extends AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7007AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form.
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        W7007ActionForm w7007Form = (W7007ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w7007Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form.
     * 
     * ‐Screen display control
     *     Call {@link #controlDisplay(W7007ActionForm, HttpServletRequest)}.
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(W7007ActionForm, HttpServletRequest)}を呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        W7007ActionForm w7007Form = (W7007ActionForm) form;

        w7007Form.setCallScreenId(SCREEN_ID_W7007);
        
        controlDisplay(w7007Form, request);
        
        W7007CriteriaDomain criteriaDomain = ((W7007ActionForm) form).getW7007CriteriaDomain();
        try {

            if (null != criteriaDomain.getUploadCoFileData()) {
                criteriaDomain.getUploadCoFileData().close();
                criteriaDomain.setUploadCoFileData(null);
            }
            if (null != criteriaDomain.getUploadNonWdFileData()) {
                criteriaDomain.getUploadNonWdFileData().close();
                criteriaDomain.setUploadNonWdFileData(null);
            }
            if (null != criteriaDomain.getUploadOthersFileData()) {
                criteriaDomain.getUploadOthersFileData().close();
                criteriaDomain.setUploadOthersFileData(null);
            }

        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        } finally {

            // delete to uploading file data.
            boolean hasErr = destroyFormFile(w7007Form.getCoFileData());
            hasErr = destroyFormFile(w7007Form.getNonWdFileData());
            hasErr = destroyFormFile(w7007Form.getOthersFileData());

            w7007Form.setCoFileData(null);
            w7007Form.setNonWdFileData(null);
            w7007Form.setOthersFileData(null);

            if (hasErr) {
                throw new SystemException(NXS_91_0001);
            }
        }
    }
    
    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W7007ActionForm prepareForm(W7007ActionForm form) {
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W7007ActionForm form) {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
    }
 
    /**
     * Add {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param args Message argument
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
    
    /**
     * Display control of B / L upload screen.
     * <br />B/Lアップロード画面の表示制御を行います。
     * <pre>
     * ‐Active control of CK
     * </pre>
     * <pre>
     * ‐CKの活性制御を行う
     * </pre>
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request<br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W7007ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        List<? extends W7007ListDomain> listDomainList = form.getListDomainList();
        if (!CollectionUtils.isEmpty(listDomainList)) {
            for (int i = 0; i < listDomainList.size(); i++) {
                if (FLAG_Y.equals(listDomainList.get(i).getDisabledFlg())) {
                    disableElementList.add(String.format("listDomainList[%d].selected", i));
                }
            }
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }

    /**
     * Destroy temporary file.
     *
     * @param f FormFile object.
     * @return result If an error occurs return true, otherwise false.
     */
    private boolean destroyFormFile(FormFile f) {
        boolean hasErr = false;
        if (f != null) {
            InputStream in;
            try {
                in = f.getInputStream();
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                // No Action.
                hasErr = true;
            }
            f.destroy();
        }
        return hasErr;
    }
}
