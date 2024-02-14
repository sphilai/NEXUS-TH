/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 *    This is a Print Id action class of a Export Request Header screen.
 * <br />梱包指示Register画面のPrint Idアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *    - "success":W1007.jsp
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007PrintIdTagAction extends W1007AbstractAction {

    /**
     * PrintId Facade service
     * <br />PrintId Facadeサービス
     */
    protected ProcessFacadeService<File, W1006UpdateDomain> w1007PrintIdTagFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007PrintIdTagAction() {
        super();
    }
    /**
     * <p>Setter method for w1007PrintIdTagFacadeService.</p>
     *
     * @param printIdTagFacadeService Set for w1007PrintIdTagFacadeService
     */
    public void setW1007PrintIdTagFacadeService(
        ProcessFacadeService<File, W1006UpdateDomain> printIdTagFacadeService) {
        w1007PrintIdTagFacadeService = printIdTagFacadeService;
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

        W1007ActionForm w1007Form = (W1007ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W1006UpdateDomain updateDomain = prepareUpdateDomain(w1007Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1007PrintIdTagFacadeService.process(updateDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = updateDomain.getCriteriaDomain().getExpRequestNo() + "_ID_TAG" +EXT_PDF;
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
    protected W1006UpdateDomain prepareUpdateDomain(W1007ActionForm form) {
        W1007UpdateDomain w1007UpdateDomain = new W1007UpdateDomain();
        W1006UpdateDomain updateDomain = new W1006UpdateDomain();
        W1006CriteriaDomain w1006CriteriaDomain = new W1006CriteriaDomain();
        List<W1006ListDomain> w1006ListDomain =  new ArrayList<W1006ListDomain>();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(w1007UpdateDomain, form.getWindowId(), form.getScreenId());

        // Copy properties domain to domain
        CommonUtil.copyPropertiesDomainToDomain(updateDomain, w1007UpdateDomain);
        CommonUtil.copyPropertiesDomainToDomain(w1006CriteriaDomain, form.getW1007CriteriaDomain());
        for(W1007ListDomain domain : form.getListDomainList()){
            W1006ListDomain w1006Domain = new W1006ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1006Domain, domain);
            w1006ListDomain.add(w1006Domain);
        }
        // Setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(w1006CriteriaDomain);
        updateDomain.setListDomainList(w1006ListDomain);
        return updateDomain;
    }
   
}
