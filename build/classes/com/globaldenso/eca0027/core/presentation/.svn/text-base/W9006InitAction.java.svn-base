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
 * The initial action class of NEXUS Ship to MA Inquiry Screen. <br />
 * NEXUS Ship to MA Inquiry画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W9006.jsp
 *     - "error":-
 * </pre>
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 6668 $
 */
public class W9006InitAction extends W9006AbstractAction {

    /**
     * Default constructor.
     */
    public W9006InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * initial-processing.
     * - Clean the contents of the search results.
     * - changes to a NEXUS Ship to MA Inquiry screen. 
     * 
     * 初期表示処理。
     * - 検索結果ドメインを空にする。
     * - NEXUS Ship to MA Inquiry Inquiry画面に遷移する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #invokeExecute(org.apache.struts.action.ActionMapping, 
     *                     org.apache.struts.action.ActionForm, 
     *                     javax.servlet.http.HttpServletRequest,
     *                     javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W9006ActionForm thisForm = (W9006ActionForm)form;

        // Clean the contents of the search results.
        thisForm.setW9006ListDomainList(null);
        thisForm.setW9006CriteriaDomain(null);

        // Go to NEXUS Ship to MA Inquiry screen.
        return FORWARD_SUCCESS;
    }
}
