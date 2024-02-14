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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractAction;

/**
 * Class action Init of Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のInitアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W6001 *     
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001InitAction extends W6001AbstractAction  {
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     *  - Control of the screen
     * Hide the search results area.
     *
     * - Delete the session information
     * Delete the information registered in the session in this screen (W6001.Invoice Main Screen screen) or later
     * </pre>
     * <pre>
     * - 画面の制御
     *     検索結果エリアを非表示にします。
     * 
     * - セッション情報の削除
     *     本画面(W6001.Invoice Main Screen画面)以降にセッションに登録した情報を削除する
     * </pre>
     * 
     * @see AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        controlDisplay((W6001ActionForm) form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Screen display control
     * <br />画面表示制御
     * <pre>
     * - Search Results Area hide
     * Initialize the contents of the list domain search results list.
     * </pre>
     * <pre>
     * ‐検索結果エリア非表示
     *     検索結果リストドメインリストの内容を初期化します。
     * </pre>
     * 
     * @param form of Action Form W8001<br />W8001のアクションフォーム
     */
    protected void controlDisplay(W6001ActionForm form) {
        // Search Results Area hide.
        // 検索結果エリアを非表示にします。
        ((W6001ActionForm) form).setListDomainList(null);
    }
}
