/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WHITE_SPACE;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9016AddFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;

/**
 * The class action Add the Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面のAddアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9016.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6765 $
 */
public class W9016AddAction extends W9016AbstractAction {

    /**
     * Add Facade Service
     * <br />Add Facadeサービス
     */
    protected TransactFacadeService<List<W9016ListDomain>, W9016CriteriaDomain> w9016AddFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016AddAction() {
        super();
    }

    /**
     * Setter method for w9016AddFacadeService.
     *
     * @param addFacadeService Set for w9016AddFacadeService
     */
    public void setW9016AddFacadeService(
        TransactFacadeService<List<W9016ListDomain>, W9016CriteriaDomain> addFacadeService) {
        w9016AddFacadeService = addFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check, check authorization
     *     Call the {@link W9016AddFacadeServiceImpl}, Line item selection check, permission checks
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック, 権限チェック
     *     {@link W9016AddFacadeServiceImpl}を呼出し、明細行選択チェック, 権限チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9016ActionForm w9016Form = (W9016ActionForm) form;

        W9016CriteriaDomain criteriaDomain = prepareUpdateDomain(w9016Form);
        
        w9016AddFacadeService.transact(criteriaDomain);

        w9016Form.setCompCd(criteriaDomain.getCompCd());
        w9016Form.setItemNo(criteriaDomain.getItemNo());
        
        if (StringUtils.isNotEmpty(criteriaDomain.getPkgCd())) {
            w9016Form.setPkgCd(criteriaDomain.getPkgCd());
        } else {
            w9016Form.setPkgCd(WHITE_SPACE);
        }
        w9016Form.setCustomerCd(criteriaDomain.getCustomerCd());
        w9016Form.setLgcyShipTo(criteriaDomain.getLgcyShipTo());
        w9016Form.setAplyStrtDt(null);
        w9016Form.setProcMode(MODE_NEW);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9016CriteriaDomain}.
     * <br />{@link W9016CriteriaDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9016CriteriaDomain} It created <br />作成した{@link W9016CriteriaDomain}
     */
    protected W9016CriteriaDomain prepareUpdateDomain(W9016ActionForm form) {
        
        W9016CriteriaDomain criteriaDomain = form.getW9016CriteriaDomain();
        // Set pushed down status of the Add button.
        // Addボタンを押下状態にする
        criteriaDomain.setSelectCondition("2");
                
        criteriaDomain.setLanguageCd(form.getLanguageCd());
        
        return criteriaDomain;
    }
}
