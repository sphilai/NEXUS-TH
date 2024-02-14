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

import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * This is a Print Id Tag action class of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Register画面のPrint Idアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W1006.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintIdTagAction extends W1006AbstractAction {

    /**
     * PrintIdTag Facade service
     * <br />PrintId Facadeサービス
     */
    protected ProcessFacadeService<File, W1006UpdateDomain> w1006PrintIdTagFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintIdTagAction() {
        super();
    }

    /**
     * <p>Setter method for w1006PrintIdTagFacadeService.</p>
     *
     * @param printIdTagFacadeService Set for w1006PrintIdTagFacadeService
     */
    public void setW1006PrintIdTagFacadeService(
        ProcessFacadeService<File, W1006UpdateDomain> printIdTagFacadeService) {
        w1006PrintIdTagFacadeService = printIdTagFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W1006ActionForm w1006Form = (W1006ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W1006UpdateDomain updateDomain = prepareUpdateDomain(w1006Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1006PrintIdTagFacadeService.process(updateDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = updateDomain.getCriteriaDomain().getExpRequestNo() + "_ID_TAG" + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        
        return null;
        
    }

    /**
     *    {@link W1006UpdateDomain} is created.
     * <br />{@link W1006UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1006UpdateDomain}
     */
    protected W1006UpdateDomain prepareUpdateDomain(W1006ActionForm form) {
        W1006UpdateDomain updateDomain = new W1006UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // Setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1006CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        return updateDomain;
    }
}
