/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9018AddFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The class action Add the Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のAddアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9018.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W9018AddAction extends W9018AbstractAction {

    /**
     * Add Facade Service
     * <br />Add Facadeサービス
     */
    protected ProcessFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> w9018AddFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018AddAction() {
        super();
    }
    
    /**
     * Setter method for w9018AddFacadeService.
     *
     * @param addFacadeService Set for w9018AddFacadeService
     */
    public void setW9018AddFacadeService(ProcessFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> addFacadeService) {
        w9018AddFacadeService = addFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check, check authorization
     *     Call the {@link W9018AddFacadeServiceImpl}, Line item selection check, permission checks
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック, 権限チェック
     *     {@link W9018AddFacadeServiceImpl}を呼出し、明細行選択チェック, 権限チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9018ActionForm w9018Form = (W9018ActionForm) form;
        
        W9018CriteriaDomain criteriaDomain = prepareUpdateDomain(w9018Form);
        
        w9018AddFacadeService.process(criteriaDomain);
        
        CommonUtil.copyPropertiesDomainToActionForm(w9018Form, w9018Form.getW9018CriteriaDomain());
        w9018Form.setMode(MODE_NEW);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9018CriteriaDomain}.
     * <br />{@link W9018CriteriaDomain}を作成します。s
     *
     * @param form Action Form<br />アクションフォーム
     * @return   {@link W9018CriteriaDomain} It created <br />作成した{@link W9018CriteriaDomain}
     */
    protected W9018CriteriaDomain prepareUpdateDomain(W9018ActionForm form) {
        
        W9018CriteriaDomain criteriaDomain = form.getW9018CriteriaDomain();
        
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setCompCd(form.getW9018CriteriaDomain().getCompCd());
        criteriaDomain.setItemNo(form.getW9018CriteriaDomain().getItemNo());
        criteriaDomain.setCigmaPrdctFlg(form.getW9018CriteriaDomain().getCigmaPrdctFlg());
        
        return criteriaDomain;
    }
}
