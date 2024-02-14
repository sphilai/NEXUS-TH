/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <br />Export Request Detail Delete。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1003.jsp
 *     - "error":W1003.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1003DeleteAction extends W1003AbstractAction {

    /**
     * DeleteFacade service
     * <br />DeleteFacadeサービス
     */
    protected TransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> w1003DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W1003DeleteAction() {
        super();
    }

    /**
     * Setter method for w1003DeleteFacadeService.
     *
     * @param registerFacadeService Set for registerFacadeService
     */
    public void setW1003DeleteFacadeService(
        TransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> registerFacadeService) {
        w1003DeleteFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1003ActionForm w1003Form = (W1003ActionForm) form;
        
        W1003UpdateDomain updateDomain = prepareUpdateDomain(w1003Form);
        
        int delCount = getDeleteCount(updateDomain);

        W1003UpdateDomain resultDomain = w1003DeleteFacadeService.transact(updateDomain);
        
        w1003Form.setW1003CriteriaDomain(resultDomain.getCriteriaDomain());
        
        w1003Form.setListDomainList(resultDomain.getListDomainList());
        w1003Form.setQtyList(resultDomain.getQtyList());
        w1003Form.setAmountList(resultDomain.getAmountList());
    
        addGlobalMessage(request, GSCM_I0_0007, delCount);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1003UpdateDomain} is created.
     * <br />{@link W1003UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1003UpdateDomain}
     */
    protected W1003UpdateDomain prepareUpdateDomain(W1003ActionForm form) {
        W1003UpdateDomain updateDomain = new W1003UpdateDomain();

        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        updateDomain.setCriteriaDomain(form.getW1003CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     * 
     * Get delete count
     * <br />更新件数を取得する。
     * 
     * @param updateDomain Update domain<br />Updateドメイン
     * @return Delete count<br />更新件数
     */
    protected int getDeleteCount(W1003UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getListDomainList() != null) {
            for (W1003ListDomain listDomain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(listDomain.getSelected())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
