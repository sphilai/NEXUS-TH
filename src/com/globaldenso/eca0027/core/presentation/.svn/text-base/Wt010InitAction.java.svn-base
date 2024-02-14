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


/**
 * The initial action class of Warehouse Search Sub Screen.
 * <br />倉庫選択子画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WT010.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt010InitAction extends Wt010AbstractAction {

    /**
     * Default constructor.
     */
    public Wt010InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Pre-processing
     * - Go to this screen.
     *
     * 前処理
     * - 自画面に移動する。
     * </pre>
     *
     * @see com.globaldenso.gscm.common.presentation.AbstractAction#invokeExec(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Wt010ActionForm thisForm = (Wt010ActionForm)form;

        // Clean the contents of the search results and criteria.
        thisForm.setWt010ListDomainList(null);
        thisForm.setWt010CriteriaDomain(null);
        
        // Go to this screen.
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Screen information stack.
     *     - Return false.
     * - 画面情報を保持するかどうかを返却するメソッドです。
     *     - falseを返却。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
