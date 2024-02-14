/*
 * PROJECT：GSCMSample
 * 
 * リソースクリア
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.gscm.framework.constants.Constants;
import com.globaldenso.gscm.framework.util.Resources;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * <p>
 * リソースをリロードするためにクリアする処理です。
 * TM_RESOURCESを更新した場合に使用してください。
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 */
public class W0002ClearResourceAction extends W0002AbstractAction {

    /**
     * デフォルトコンストラクタ。
     */
    public W0002ClearResourceAction() {
        super();
    }

    /**
     * <p>
     * リソースクリア処理。
     * </p>
     * 
     * @param mapping ActionMappingフィールド
     * @param form ActionFormフィールド
     * @param request HttpServletRequestフィールド
     * @param response HttpServletResponseフィールド
     * @return String
     * @throws Exception 処理例外
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        ((Resources)ResourcesFactory.getResources()).clearResources();
        System.out.println("Resource clear done.");

        return Constants.FORWARD_SUCCESS;
    }
}
