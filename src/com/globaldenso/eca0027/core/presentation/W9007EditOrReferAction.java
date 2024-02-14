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

import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9007UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9007EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * 
 * <br />EditOrRefer action class of Export Ship to Shipping MA Inquiry screen
 * 
 * <br />Export Ship to Shipping MA Inquiry画面のEditOrReferアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9007.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6748 $
 */
public class W9007EditOrReferAction extends W9007AbstractAction {

    /**
     * EditOrRefer Facade Service
     * <br />EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<W9007UpdateDomain, W9007UpdateDomain> w9007EditOrReferFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9007EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9007EditOrReferFacadeService
     */
    public void setW9007EditOrReferFacadeService(ProcessFacadeService<W9007UpdateDomain, W9007UpdateDomain> editOrReferFacadeService) {
        w9007EditOrReferFacadeService = editOrReferFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W9007EditOrReferFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W9007EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9007ActionForm w9007Form = (W9007ActionForm) form;

        // Check selected List Item.
        W9007UpdateDomain updateDomain = prepareUpdateDomain(w9007Form);
        W9007UpdateDomain resultDomain = w9007EditOrReferFacadeService.process(updateDomain);

        W9007ListDomain selectedDomain = resultDomain.getListDomainList().get(0);
        w9007Form.setShipperCd(selectedDomain.getCompCd());
        w9007Form.setShipToCompCd(selectedDomain.getShipToCd());
        w9007Form.setAplyStrtDt(selectedDomain.getAplyStrtDt());
        w9007Form.setProcMode(MODE_EDIT_REF);
    
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9007UpdateDomain}.
     * <br />{@link W9007UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9007UpdateDomain} It created <br />作成した{@link W9007UpdateDomain}
     */
    protected W9007UpdateDomain prepareUpdateDomain(W9007ActionForm form) {
        
        W9007UpdateDomain updateDomain = new W9007UpdateDomain();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
