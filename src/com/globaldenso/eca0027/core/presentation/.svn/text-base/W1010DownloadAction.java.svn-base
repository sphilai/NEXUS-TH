/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Search action for Export Request screen.
 * <br />船積実績Main画面のSearchアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": W1010
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1010DownloadAction extends W1010AbstractAction {

    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1010DownloadAction() {
        super();
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
     * </pre>
     * @throws Exception Exception
     * @throws IOException IOException
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, Exception{
        
        ServletContext sc = request.getSession().getServletContext();
        InputStream stream = sc.getResourceAsStream("/WEB-INF/Export_Detail_template.csv");

        ActionUtil.downloadBinary(IOUtils.toByteArray(stream), "Export_Detail_template.csv", response);

        stream.close();
        
        return null;
    }
}
