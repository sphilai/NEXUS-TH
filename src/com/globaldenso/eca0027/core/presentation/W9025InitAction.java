/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * <br />Actual Item No Weight MA 画面の初期表示アクションです。
 *
 */
/**
 * Initial display of class action Registration Screen of Actual Item Weight.
 * <br />実測製品重量登録画面の初期表示アクションクラスです。
 * <pre>
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025InitAction extends W9025AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9025InitAction() {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Set the items in the common information screen in the criteria domain.
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W9025CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 言語コード
     *       - 権限付与会社
     *       - システム日付 (権限付与会社)
     * - 初期表示
     *    権限付与会社を出力する
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Set of action form.
        // アクションフォームの設定
        W9025ActionForm w9025Form = (W9025ActionForm) form;

        W9025CriteriaDomain criteriaDomain = w9025Form.getW9025CriteriaDomain();
        
        // Set of screen common information.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, w9025Form.getWindowId(), w9025Form.getScreenId());

        return FORWARD_SUCCESS;
    }
}