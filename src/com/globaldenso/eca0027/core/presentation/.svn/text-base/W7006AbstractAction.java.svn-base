/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action for Shipping Document Upload screen.
 * <br />船積書類アップロード画面の基底アクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11048 $
 */
public abstract class W7006AbstractAction extends AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006AbstractAction() {
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
        
        W7006ActionForm w7006Form = (W7006ActionForm) form;
        // Set the items in the common information screen in the action form. 
        // 画面共通項目の取得
        setCommonInfo(w7006Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form.
     * 
     * ‐Screen display control
     *     Call {@link #controlDisplay(W7006ActionForm, HttpServletRequest)}.
     * </pre>
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(W7006ActionForm, HttpServletRequest)}を呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form
        , HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        controlDisplay((W7006ActionForm) form, request);
        
        W7006ActionForm w7006Form = (W7006ActionForm) form;
        w7006Form.setCallScreenId(SCREEN_ID_W7006);
        
        W7006CriteriaDomain criteriaDomain = w7006Form.getW7006CriteriaDomain();
        try {
            if (null != criteriaDomain.getUploadCoFileData()) {
                criteriaDomain.getUploadCoFileData().close();
                criteriaDomain.setUploadCoFileData(null);
            }
            if (null != criteriaDomain.getUploadNonWdFileData()) {
                criteriaDomain.getUploadNonWdFileData().close();
                criteriaDomain.setUploadNonWdFileData(null);
            }
            for (int i = 0; i < w7006Form.getListDomainList().size(); i++) {
                if (null != w7006Form.getListDomainList().get(i).getUploadFileData()) {
                    w7006Form.getListDomainList().get(i).getUploadFileData().close();
                    w7006Form.getListDomainList().get(i).setUploadFileData(null);
                }
            }
            
        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        } finally {
            // FormFileの削除を追加
            FormFile coFileForm = w7006Form.getCoFileData();
            FormFile nonWdFileForm = w7006Form.getNonWdFileData();
            boolean hasErr = false;
            hasErr = destroyFormFile(coFileForm);
            hasErr = destroyFormFile(nonWdFileForm);
            if (null != w7006Form.getFileDataList()) {
                for (FormFile othersFormFile : w7006Form.getFileDataList()) {
                    hasErr = destroyFormFile(othersFormFile);
                }
            }

            w7006Form.setCoFileData(null);
            w7006Form.setNonWdFileData(null);
            if (null != w7006Form.getFileDataList()) {
                w7006Form.setFileDataList(null);
            }

            if (hasErr) {
                throw new SystemException(NXS_91_0001);
            }
        }
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     */
    protected void setCommonInfo(W7006ActionForm form) {
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
     * Display control of B / L Update screen.
     * <br />船荷証券更新画面の表示制御を行います。
     * <pre>
     * ‐And controls as described below by the display state of FILE NAME.
     *     If blank, FILE NAME activity below
     *         ‐B/L
     *         ‐Upload
     *     If FILE NAME is not blank, the following activity
     *         ‐Cancel
     *         ‐View
     * </pre>
     * <pre>
     * ‐ファイル名の表示状態によって下記のように制御する
     *     ファイル名が空白の場合、下記を活性
     *         ‐B/L
     *         ‐Upload
     *     ファイル名が空白でない場合、下記を活性
     *         ‐Cancel
     *         ‐View
     * </pre>
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param request <br />
     * HTTPリクエスト
     */
    protected void controlDisplay(W7006ActionForm form, HttpServletRequest request) {
        List<String> disableElementList = new ArrayList<String>();
        
        W7006CriteriaDomain criteriaDomain = form.getW7006CriteriaDomain();
        List<? extends W7006ListDomain> listDomainList = form.getListDomainList();

        disableElementList.add("w7006CriteriaDomain.coFileName");
        disableElementList.add("w7006CriteriaDomain.nonWdFileName");
        for (int i = 0; i < listDomainList.size(); i++) {
            disableElementList.add(String.format("listDomainList[%d].fileName", i));
        }
        
        // C/O
        if (StringUtils.isEmpty(criteriaDomain.getCoFileName())) {
            disableElementList.add("coView");
        }
        // Non Wooden
        if (StringUtils.isEmpty(criteriaDomain.getNonWdFileName())) {
            disableElementList.add("nonWdView");
        }
        // Others
        for (int i = 0; i < listDomainList.size(); i++) {
            if (StringUtils.isEmpty(listDomainList.get(i).getFileName())) {
                disableElementList.add(String.format("othersView%d", i));
            }
        }
        
        if (SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH.equals(criteriaDomain.getShippingActStatus())){
            // C/O
            if (StringUtils.isEmpty(criteriaDomain.getCoFileName())) {
                disableElementList.add("coCancel");
            } else {
                disableElementList.add("coFileData");
                disableElementList.add("coUpload");
            }
            
            // Non Wooden
            if (StringUtils.isEmpty(criteriaDomain.getNonWdFileName())) {
                disableElementList.add("nonWdCancel");
            } else {
                disableElementList.add("nonWdFileData");
                disableElementList.add("nonWdUpload");
            }
            
            // Others
            for (int i = 0; i < listDomainList.size(); i++) {
                if (StringUtils.isEmpty(listDomainList.get(i).getFileName())) {
                    disableElementList.add(String.format("othersCancel%d", i));
                } else {
                    disableElementList.add(String.format("fileDataList[%d]", i));
                    disableElementList.add(String.format("othersUpload%d", i));
                }
            }
        } else {
            disableElementList.add("coCancel");
            disableElementList.add("coFileData");
            disableElementList.add("coUpload");
            disableElementList.add("nonWdCancel");
            disableElementList.add("nonWdFileData");
            disableElementList.add("nonWdUpload");
            for (int i = 0; i < listDomainList.size(); i++) {
                disableElementList.add(String.format("othersCancel%d", i));
                disableElementList.add(String.format("fileDataList[%d]", i));
                disableElementList.add(String.format("othersUpload%d", i));
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
