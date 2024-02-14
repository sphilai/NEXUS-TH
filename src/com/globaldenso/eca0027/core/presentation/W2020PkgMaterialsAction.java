/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * This is a PkgMaterials action class of a Multi Label Register Screen
 * <br />Multi Label Register画面のPkgMaterialsアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2013Init.do
 *     - "error":W2020.jsp
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020PkgMaterialsAction extends W2020AbstractAction {

    /**
     * constructor.
     */
    public W2020PkgMaterialsAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        request.setAttribute("functionMode", W2009_CML_MODE_EDIT);

        return FORWARD_SUCCESS;
    }
}
