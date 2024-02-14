/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9016UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9016EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;

/**
 * Clone action class of Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面のCloneアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9007.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9016CloneAction extends W9016AbstractAction {

    /**
     * Clone Facade Service
     * <br />Clone Facadeサービス
     */
    protected TransactFacadeService<Void, W9016UpdateDomain> w9016CloneFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016CloneAction() {
        super();
    }

    /**
     * Setter method for w9016CloneFacadeService.
     *
     * @param cloneFacadeService Set for w9016CloneFacadeService
     */
    public void setW9016CloneFacadeService(
        TransactFacadeService<Void, W9016UpdateDomain> cloneFacadeService) {
        w9016CloneFacadeService = cloneFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check, check authorization
     *     Call the {@link W9016EditOrReferFacadeServiceImpl}, I do line item selection check, permission checks
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック, 権限チェック
     *     {@link W9016EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェック, 権限チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9016ActionForm w9016Form = (W9016ActionForm) form;
        
        W9016UpdateDomain updateDomain = prepareUpdateDomain(w9016Form);
        
        w9016CloneFacadeService.transact(updateDomain);
        
        W9016ListDomain listDomain = updateDomain.getListDomainList().get(0);
        w9016Form.setCompCd(listDomain.getCompCd());
        w9016Form.setItemNo(listDomain.getItemNo());
        w9016Form.setPkgCd(listDomain.getPkgCd());
        w9016Form.setCustomerCd(listDomain.getCustomerCd());
        w9016Form.setLgcyShipTo(listDomain.getLgcyShipTo());
        w9016Form.setAplyStrtDt(listDomain.getAplyStrtDt());
        w9016Form.setProcMode(MODE_COPY_NEW);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9016UpdateDomain}.
     * <br />{@link W9016UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9016UpdateDomain} It created<br />作成した{@link W9016UpdateDomain}
     */
    protected W9016UpdateDomain prepareUpdateDomain(W9016ActionForm form) {
        
        W9016UpdateDomain updateDomain = new W9016UpdateDomain();

        updateDomain.setListDomainList(form.getListDomainList());
        
        String selected = form.getW9016CriteriaDomain().getSelected();
        if (selected != null) {
            int index = Integer.parseInt(selected);
            for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
                if (i == index) {
                    updateDomain.getListDomainList().get(i).setSelected(CHECK_ON);
                } else {
                    updateDomain.getListDomainList().get(i).setSelected(CHECK_OFF);
                }
            }
        }
        
        return updateDomain;
    }
}
