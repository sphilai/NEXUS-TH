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

import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <br />Export Request Kit Delete。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1004.jsp
 *     - "error":W1004.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1004DeleteAction extends W1004AbstractAction {

    /**
     * DeleteFacade service
     * <br />DeleteFacadeサービス
     */
    protected TransactFacadeService<W1004UpdateDomain, W1004UpdateDomain> w1004DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W1004DeleteAction() {
        super();
    }

    /**
     * Setter method for w1004DeleteFacadeService.
     *
     * @param registerFacadeService Set for registerFacadeService
     */
    public void setW1004DeleteFacadeService(
        TransactFacadeService<W1004UpdateDomain, W1004UpdateDomain> registerFacadeService) {
        w1004DeleteFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1004ActionForm w1004Form = (W1004ActionForm) form;
        
        W1004UpdateDomain updateDomain = prepareUpdateDomain(w1004Form);
        
        int delCount = getDeleteCount(updateDomain);
        
        W1004UpdateDomain resultDomain = w1004DeleteFacadeService.transact(updateDomain);
        
        w1004Form.setListDomainList(resultDomain.getListDomainList());
        
        w1004Form.setKitList(resultDomain.getKitList());
        
        addGlobalMessage(request, GSCM_I0_0007, delCount);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1004UpdateDomain} is created.
     * <br />{@link W1004UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1004UpdateDomain}
     */
    protected W1004UpdateDomain prepareUpdateDomain(W1004ActionForm form) {
        W1004UpdateDomain updateDomain = new W1004UpdateDomain();

        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        updateDomain.setCriteriaDomain(form.getW1004CriteriaDomain());
        updateDomain.getCriteriaDomain().setRowNumFrom(form.getFromCount());
        updateDomain.getCriteriaDomain().setRowNumTo(form.getToCount());
        updateDomain.setListDomainList(form.getListDomainList());
        updateDomain.setKitList(form.getKitList());
        
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
    protected int getDeleteCount(W1004UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getKitList() != null) {
            for (W1004KitListDomain kitDomain : updateDomain.getKitList()) {
                if (!CheckUtil.isBlankOrNull(kitDomain.getSelected())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
