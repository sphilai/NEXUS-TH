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

import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <br />Export Request Register。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1004.jsp
 *     - "error":W1004.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W1004SaveAction extends W1004AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<W1004UpdateDomain, W1004UpdateDomain> w1004SaveFacadeService;
    
    /**
     * constructor.
     */
    public W1004SaveAction() {
        super();
    }

    /**
     * Setter method for w1004SaveFacadeService.
     *
     * @param registerFacadeService Set for registerFacadeService
     */
    public void setW1004SaveFacadeService(
        TransactFacadeService<W1004UpdateDomain, W1004UpdateDomain> registerFacadeService) {
        w1004SaveFacadeService = registerFacadeService;
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

        W1004UpdateDomain resultDomain = w1004SaveFacadeService.transact(updateDomain);
        
        w1004Form.setListDomainList(resultDomain.getListDomainList());
        
        w1004Form.setKitList(resultDomain.getKitList());
    
        addGlobalMessage(request, GSCM_I0_0008, getUpdateCount(resultDomain));
        
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

        if (form.getKitList() != null) {
            for (W1004KitListDomain kitDomain : form.getKitList()) {
                kitDomain.setLanguageCd(form.getLanguageCd());
            }
        }
        
        updateDomain.setCriteriaDomain(form.getW1004CriteriaDomain());
        updateDomain.getCriteriaDomain().setLanguageCd(form.getLanguageCd());
        updateDomain.getCriteriaDomain().setRowNumFrom(form.getFromCount());
        updateDomain.getCriteriaDomain().setRowNumTo(form.getToCount());
        updateDomain.setListDomainList(form.getListDomainList());
        //set Kit List
        if(form.getKitList() != null && form.getKitList().size() > 0)
        {
            for(int i = 0; i < form.getKitList().size(); i++){
                W1004KitListDomain domain = form.getKitList().get(i);
                domain.setKitBrch(String.format("%03d", i + 1));
            }
        }
        updateDomain.setKitList(form.getKitList());
        
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
    protected int getUpdateCount(W1004UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getKitList() != null) {
            for (W1004KitListDomain kitDomain : updateDomain.getKitList()) {
                if (!CheckUtil.isBlankOrNull(kitDomain.getExpRequestKitId())) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
