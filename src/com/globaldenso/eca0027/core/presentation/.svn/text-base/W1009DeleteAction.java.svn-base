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

import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1009UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

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
public class W1009DeleteAction extends W1009AbstractAction {

    /**
     * SaveAndDeleteFacade service
     * <br />SaveAndDeleteFacadeサービス
     */
    protected TransactFacadeService<W1009UpdateDomain, W1009UpdateDomain> w1009DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W1009DeleteAction() {
        super();
    }

    /**
     * Setter method for w1009DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w1009DeleteFacadeService
     */
    public void setW1009DeleteFacadeService(
        TransactFacadeService<W1009UpdateDomain, W1009UpdateDomain> deleteFacadeService) {
        w1009DeleteFacadeService = deleteFacadeService;
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

        int delCount = getDeleteCount(updateDomain);
        
        W1009UpdateDomain resultDomain = w1009DeleteFacadeService.transact(updateDomain);
        
        w1009Form.setListDomainList(resultDomain.getListDomainList());
    
        addGlobalMessage(request, GSCM_I0_0007, delCount);
        
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
    
    /**
     * 
     * Get delete count
     * <br />更新件数を取得する。
     * 
     * @param updateDomain Update domain<br />Updateドメイン
     * @return Delete count<br />更新件数
     */
    protected int getDeleteCount(W1009UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getListDomainList() != null) {
            for (W1009ListDomain listDomain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(listDomain.getSelected())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}