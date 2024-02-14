/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W1001EditFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * 
 * <br />Edit action class of Export Request screen
 * 
 * <br />Export Request画面のEditアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1001.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6748 $
 */
public class W1001EditAction extends W1001AbstractAction {

    /**
     * Edit Facade Service
     * <br />Edit Facadeサービス
     */
    protected ProcessFacadeService<W1001UpdateDomain, W1001UpdateDomain> w1001EditFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1001EditAction() {
        super();
    }

    /**
     * Setter method for w1001EditFacadeService.
     *
     * @param editFacadeService Set for w1001EditFacadeService
     */
    public void setW1001EditFacadeService(ProcessFacadeService<W1001UpdateDomain, W1001UpdateDomain> editFacadeService) {
        w1001EditFacadeService = editFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W1001EditFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W1001EditFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W1001ActionForm w1001Form = (W1001ActionForm) form;

        // Check selected List Item.
        W1001UpdateDomain updateDomain = prepareUpdateDomain(w1001Form);
        W1001UpdateDomain resultDomain = w1001EditFacadeService.process(updateDomain);

        int selectedRow = Integer.parseInt(resultDomain.getCriteriaDomain().getSelected());
        W1001ListDomain selectedDomain = resultDomain.getListDomainList().get(selectedRow);
        w1001Form.setExpRequestNo(selectedDomain.getExpRequestNo());
        w1001Form.setProcMode(MODE_EDIT);
    
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W1001UpdateDomain}.
     * <br />{@link W1001UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W1001UpdateDomain} It created <br />作成した{@link W1001UpdateDomain}
     */
    protected W1001UpdateDomain prepareUpdateDomain(W1001ActionForm form) {
        
        W1001UpdateDomain updateDomain = new W1001UpdateDomain();
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW1001CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
