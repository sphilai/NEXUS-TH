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

import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * Action class of initial display of  Progress Control detail screen.
 * <br />進度管理詳細画面の初期表示アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8002InitAction extends W8002AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<W8002CriteriaDomain, W8002CriteriaDomain> w8002InitFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8002InitAction() {
        super();
    }

    /**
     * Setter method for w8002InitFacadeService.
     *
     * @param initFacadeService Set for w8002InitFacadeService
     */
    public void setW8002InitFacadeService(
        SearchFacadeService<W8002CriteriaDomain, W8002CriteriaDomain> initFacadeService) {
        w8002InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Display the initial Progress Control detail screen.
     *     
     * </pre>
     * <pre>
     * ‐進度管理詳細画面に初期表示します。
     *     
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W8002AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        W8002ActionForm w8002Form = (W8002ActionForm)form;

        W8002CriteriaDomain criteriaDomain = prepareCriteriaDomain(w8002Form);
        
        W8002CriteriaDomain resultDomain = w8002InitFacadeService.search(criteriaDomain);
        
        resultDomain.setCmlNo(w8002Form.getCmlNo());
        
        w8002Form.setW8002CriteriaDomain(resultDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W8002CriteriaDomain}.
     * <br />{@link W8002CriteriaDomain}を設定します。
     *
     * @param form Action Form of Shipping Document Upload screen<br />
     * 船積書類アップロード画面のアクションフォーム
     * @return  {@link W8002CriteriaDomain} <br />
     * 設定した{@link W8002CriteriaDomain}
     */
    protected W8002CriteriaDomain prepareCriteriaDomain (W8002ActionForm form) {
        W8002CriteriaDomain criteriaDomain = form.getW8002CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, form);
        
        return criteriaDomain;
    }
}
