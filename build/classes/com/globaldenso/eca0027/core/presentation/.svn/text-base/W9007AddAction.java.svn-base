/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9007EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;

/**
 * The class action Add the Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のAddアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9007AddAction extends W9007AbstractAction {

    /**
     * Add Facade Service
     * <br />Add Facadeサービス
     */
    protected TransactFacadeService<List<W9007ListDomain>, W9007CriteriaDomain> w9007AddFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007AddAction() {
        super();
    }

    /**
     * Setter method for w9007AddFacadeService.
     *
     * @param addFacadeService Set for w9007AddFacadeService
     */
    public void setW9007AddFacadeService(
        TransactFacadeService<List<W9007ListDomain>, W9007CriteriaDomain> addFacadeService) {
        w9007AddFacadeService = addFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check, check authorization
     *     Call the {@link W9007EditOrReferFacadeServiceImpl}, Line item selection check, permission checks
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック, 権限チェック
     *     {@link W9007EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェック, 権限チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9007ActionForm w9007Form = (W9007ActionForm) form;
        
        W9007CriteriaDomain criteriaDomain = prepareUpdateDomain(w9007Form);
        
        w9007AddFacadeService.transact(criteriaDomain);
        
        w9007Form.setShipperCd(criteriaDomain.getShipperCd());
        w9007Form.setShipToCompCd(null);
        w9007Form.setAplyStrtDt(null);
        w9007Form.setProcMode(MODE_NEW);
        
        w9007Form.setSearchFlg(false);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Create a {@link W9007CriteriaDomain}
     * <br />{@link W9007CriteriaDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9007CriteriaDomain} It created <br />作成した{@link W9007CriteriaDomain}
     */
    protected W9007CriteriaDomain prepareUpdateDomain(W9007ActionForm form) {
        
        W9007CriteriaDomain criteriaDomain = form.getW9007CriteriaDomain();
        // Set pushed down status of the Add button.
        // Addボタンを押下状態にする
        criteriaDomain.setSelectCondition("2");

        criteriaDomain.setLanguageCd(form.getLanguageCd());
        
        return criteriaDomain;
    }
}
