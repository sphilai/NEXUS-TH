/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9004EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * EditOrRefer action class of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面のEditOrReferアクションクラスです。
 *<pre>
 * forward name-path mappings:
 *     - "success":W9004.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9004EditOrReferAction extends W9004AbstractAction {

    /**
     * EditOrRefer Facade Service
     * <br />EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Void, W9004UpdateDomain> w9004EditOrReferFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9004EditOrReferAction() {
        super();
    }
    
    /**
     * Setter method for w9004EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9004EditOrReferFacadeService
     */
    public void setW9004EditOrReferFacadeService(ProcessFacadeService<Void, W9004UpdateDomain> editOrReferFacadeService) {
        w9004EditOrReferFacadeService = editOrReferFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call {@link W9004EditOrReferFacadeServiceImpl}
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W9004EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9004ActionForm w9004Form = (W9004ActionForm) form;
        
        W9004UpdateDomain updateDomain = prepareUpdateDomain(w9004Form);
        
        w9004EditOrReferFacadeService.process(updateDomain);
        
        int index = Integer.parseInt(w9004Form.getW9004CriteriaDomain().getSelected());
        W9004ListDomain selectedDomain = w9004Form.getListDomainList().get(index);
        w9004Form.setDscId(selectedDomain.getDscId());
        w9004Form.setFunctionNo(MODE_EDIT_REF);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9004UpdateDomain}.
     * <br />{@link W9004UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9004UpdateDomain} It created<br />作成した{@link W9004UpdateDomain}
     */
    protected W9004UpdateDomain prepareUpdateDomain(W9004ActionForm form) {
        
        W9004UpdateDomain updateDomain = new W9004UpdateDomain();
        
        updateDomain.setCriteriaDomain(form.getW9004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
