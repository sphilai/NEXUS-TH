/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9002ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9002UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9002EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Action class of EditOrRefer of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のEditOrReferアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9002.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9002EditOrReferAction extends W9002AbstractAction {

    /**
     * EditOrRefer Facade Service
     * <br />EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Void, W9002UpdateDomain> w9002EditOrReferFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9002EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9002EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9002EditOrReferFacadeService
     */
    public void setW9002EditOrReferFacadeService(
        ProcessFacadeService<Void, W9002UpdateDomain> editOrReferFacadeService) {
        w9002EditOrReferFacadeService = editOrReferFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call {@link W9002EditOrReferFacadeServiceImpl}
     * </pre>
     * <pre>
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W9002EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9002ActionForm w9002Form = (W9002ActionForm) form;
        
        String selected = w9002Form.getW9002CriteriaDomain().getSelected();
        
        int index = -1;
        W9002ListDomain selectedDomain = null;
        if (selected != null) {
            index = Integer.parseInt(selected);
            selectedDomain = w9002Form.getListDomainList().get(index);
        }
        
        W9002UpdateDomain updateDomain = prepareUpdateDomain(w9002Form, index);
        
        w9002EditOrReferFacadeService.process(updateDomain);
        
        if (selectedDomain != null) {
            w9002Form.setOrgCompCd(selectedDomain.getOrgCompCd());
            w9002Form.setAgentCompCd(selectedDomain.getAgentCompCd());
            w9002Form.setFunctionNo(MODE_EDIT);
        }
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9002UpdateDomain}.
     * <br />{@link W9002UpdateDomain}を作成します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param index index
     * @return  {@link W9002UpdateDomain} <br />
     * 作成した{@link W9002UpdateDomain}
     */
    protected W9002UpdateDomain prepareUpdateDomain(W9002ActionForm form, int index) {
        
        W9002UpdateDomain updateDomain = new W9002UpdateDomain();
        
        updateDomain.setListDomainList(form.getListDomainList());
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            if (i == index) {
                updateDomain.getListDomainList().get(i).setSelected(CHECK_ON);
            } else {
                updateDomain.getListDomainList().get(i).setSelected(CHECK_OFF);
            }
        }
        
        return updateDomain;
    }
}
