/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_0017;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1002UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <br />Export Request Cancel。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1002.jsp
 *     - "error":W1002.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1002CancelAction extends W1002AbstractAction {

    /**
     * CancelFacade service
     * <br />CancelFacadeサービス
     */
    protected TransactFacadeService<W1002UpdateDomain, W1002UpdateDomain> w1002CancelFacadeService;
    
    /**
     * constructor.
     */
    public W1002CancelAction() {
        super();
    }

    /**
     * Setter method for w1002CancelFacadeService.
     *
     * @param cancelFacadeService Set for cancelFacadeService
     */
    public void setW1002CancelFacadeService(
        TransactFacadeService<W1002UpdateDomain, W1002UpdateDomain> cancelFacadeService) {
        w1002CancelFacadeService = cancelFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1002ActionForm w1002Form = (W1002ActionForm) form;
        
        W1002UpdateDomain updateDomain = prepareUpdateDomain(w1002Form);

        w1002CancelFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, NXS_I1_0017);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1002UpdateDomain} is created.
     * <br />{@link W1002UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1002UpdateDomain}
     */
    protected W1002UpdateDomain prepareUpdateDomain(W1002ActionForm form) {
        W1002UpdateDomain updateDomain = new W1002UpdateDomain();

        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        updateDomain.setCriteriaDomain(form.getW1002CriteriaDomain());
        updateDomain.getCriteriaDomain().setLanguageCd(form.getLanguageCd());
        
        return updateDomain;
    }
}
