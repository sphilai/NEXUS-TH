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
 * The Initialize action class of Staging Instruction Main screen <br />
 * 荷揃え指示Main画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W4001.jsp
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4001InitAction extends W4001AbstractAction {

    /**
     * Constructor.
     */
    public W4001InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Erase search results
     *
     * - 検索結果の消去
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W4001ActionForm form = (W4001ActionForm)actForm;

        // Erase search results
        // 検索結果の消去
        form.setW4001ListDomainList(null);

        return FORWARD_SUCCESS;
    }
}
