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
 * The initial action class of Warehouse Search Screen.
 * <br />倉庫検索画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9013.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9013InitAction extends W9013AbstractAction {

    /**
     * Default constructor.
     */
    public W9013InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * Pre-processing
     * - Clear the contents of the search results.
     *
     * 前処理
     * - 検索結果をクリアする。
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
        
        W9013ActionForm thisForm = (W9013ActionForm)form;

        // Clean the contents of the search results and criteria.
        thisForm.setW9013ListDomainList(null);
        thisForm.setW9013CriteriaDomain(null);
        
        // Go to this screen.
        return FORWARD_SUCCESS;
    }
}
