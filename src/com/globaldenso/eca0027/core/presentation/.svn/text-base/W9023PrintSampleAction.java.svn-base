/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9023UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of PrintSample of Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面のPrintSampleアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023PrintSampleAction extends W9023AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected ProcessFacadeService<File, W9023UpdateDomain> w9023PrintSampleFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9023PrintSampleAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * Setter method for w9023PrintSampleFacadeService.
     *
     * @param printSampleFacadeService Set for w9023PrintSampleFacadeService
     */
    public void setW9023PrintSampleFacadeService(ProcessFacadeService<File, W9023UpdateDomain> printSampleFacadeService) {
        w9023PrintSampleFacadeService = printSampleFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9023ActionForm w9023Form = (W9023ActionForm) form;
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W9023UpdateDomain updateDomain = prepareUpdateDomain(w9023Form);
        
        // Execution of the document creation process.
        // 帳票作成処理の実行
        File printDoc = w9023PrintSampleFacadeService.process(updateDomain);
        
        // Display of the obtained file.
        // 取得したファイルの表示
        if (printDoc != null) {
            W9023CriteriaDomain criteriaDomain = w9023Form.getW9023CriteriaDomain();
            String fileName = criteriaDomain.getCompany() + criteriaDomain.getDocNo() + EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(printDoc)), fileName, response);
        } else {
            throw new GscmApplicationException("GSCM-E0-0002");
        }
        return null;
    }

    /**
     * Create {@link W9023UpdateDomain}.
     * <br />{@link W9023UpdateDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9023UpdateDomain} <br />作成した{@link W9023UpdateDomain}
     */
    protected W9023UpdateDomain prepareUpdateDomain(W9023ActionForm form) {
        W9023UpdateDomain updateDomain = new W9023UpdateDomain();
    
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Conditions domain.
        // 条件ドメイン
        updateDomain.setCriteriaDomain(form.getW9023CriteriaDomain());
        
        return updateDomain;
    }
}
