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

import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <br />Export Request Register。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1003.jsp
 *     - "error":W1003.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1003SaveAction extends W1003AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> w1003SaveFacadeService;
    
    /**
     * constructor.
     */
    public W1003SaveAction() {
        super();
    }

    /**
     * Setter method for w1003SaveFacadeService.
     *
     * @param registerFacadeService Set for registerFacadeService
     */
    public void setW1003SaveFacadeService(
        TransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> registerFacadeService) {
        w1003SaveFacadeService = registerFacadeService;
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

        W1003UpdateDomain resultDomain = w1003SaveFacadeService.transact(updateDomain);
        
        w1003Form.setW1003CriteriaDomain(resultDomain.getCriteriaDomain());
        
        w1003Form.setListDomainList(resultDomain.getListDomainList());
        w1003Form.setQtyList(resultDomain.getQtyList());
        w1003Form.setAmountList(resultDomain.getAmountList());
    
        addGlobalMessage(request, GSCM_I0_0008, getUpdateCount(resultDomain));
        
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

        if (form.getListDomainList() != null) {
            for (W1003ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
            }
        }
        
        updateDomain.setCriteriaDomain(form.getW1003CriteriaDomain());
        updateDomain.getCriteriaDomain().setLanguageCd(form.getLanguageCd());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     * 
     * Get update count
     * <br />更新件数を取得する。
     * 
     * @param updateDomain Update domain<br />Updateドメイン
     * @return Update count<br />更新件数
     */
    protected int getUpdateCount(W1003UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getListDomainList() != null) {
            for (W1003ListDomain listDomain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(listDomain.getExpRequestItemId())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
