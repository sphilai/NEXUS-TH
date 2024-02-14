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

import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9018UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9018EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action EditOrRefer of Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のEditOrReferアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9018.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9018EditOrReferAction extends W9018AbstractAction {

    /**
     * EditOrRefer Facade Service
     * <br />EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Void, W9018UpdateDomain> w9018EditOrReferFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9018EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9018EditOrReferFacadeService
     */
    public void setW9018EditOrReferFacadeService(ProcessFacadeService<Void, W9018UpdateDomain> editOrReferFacadeService) {
        w9018EditOrReferFacadeService = editOrReferFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W9018EditOrReferFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W9018EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9018ActionForm w9018Form = (W9018ActionForm) form;
        
        W9018UpdateDomain updateDomain = prepareUpdateDomain(w9018Form);
        
        w9018EditOrReferFacadeService.process(updateDomain);
        
        int selectedRow = Integer.parseInt(w9018Form.getW9018CriteriaDomain().getSelected());
        W9018ListDomain listDomain = w9018Form.getListDomainList(selectedRow);
        w9018Form.setCompCd(listDomain.getCompCd());
        w9018Form.setItemNo(listDomain.getItemNo());
        w9018Form.setAplyStrtDt(listDomain.getAplyStrtDt());
        w9018Form.setSelectedRow(selectedRow);
        
        w9018Form.setMode(MODE_EDIT_REF);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9018UpdateDomain}
     * <br />{@link W9018UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9018UpdateDomain} It created <br />作成した{@link W9018UpdateDomain}
     */
    protected W9018UpdateDomain prepareUpdateDomain(W9018ActionForm form) {
        
        W9018UpdateDomain updateDomain = new W9018UpdateDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9018CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
