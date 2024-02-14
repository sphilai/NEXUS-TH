/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1009UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <br />Export Packaging Returnable PKG  Material Save and Delete。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1009.jsp
 *     - "error":W1009.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1009SaveAction extends W1009AbstractAction {

    /**
     * SaveAndDeleteFacade service
     * <br />SaveAndDeleteFacadeサービス
     */
    protected TransactFacadeService<W1009UpdateDomain, W1009UpdateDomain> w1009SaveFacadeService;
    
    /**
     * constructor.
     */
    public W1009SaveAction() {
        super();
    }

    /**
     * Setter method for w1009SaveFacadeService.
     *
     * @param saveFacadeService Set for w1009SaveFacadeService
     */
    public void setW1009SaveFacadeService(
        TransactFacadeService<W1009UpdateDomain, W1009UpdateDomain> saveFacadeService) {
        w1009SaveFacadeService = saveFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1009ActionForm w1009Form = (W1009ActionForm) form;
        
        W1009UpdateDomain updateDomain = prepareUpdateDomain(w1009Form);

        
        W1009UpdateDomain resultDomain = w1009SaveFacadeService.transact(updateDomain);
        
        w1009Form.setListDomainList(resultDomain.getListDomainList());
    
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getListDomainList().size());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1009UpdateDomain} is created.
     * <br />{@link W1009UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1009UpdateDomain}
     */
    protected W1009UpdateDomain prepareUpdateDomain(W1009ActionForm form) {
        W1009UpdateDomain updateDomain = new W1009UpdateDomain();

        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        if (form.getListDomainList() != null) {
            for (W1009ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
            }
        }
        
        updateDomain.setCriteriaDomain(form.getW1009CriteriaDomain());
        updateDomain.getCriteriaDomain().setLanguageCd(form.getLanguageCd());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
}