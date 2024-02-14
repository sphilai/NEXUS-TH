/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W8001CriteriaDomain;

/**
 * Action class of initial display of Progress Control Main screen.
 * <br />進度管理Main画面の初期表示アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
public class W8001InitAction extends W8001AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8001InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Display control
     *     Hide the search results area.
     * </pre>
     * <pre>
     * ‐表示制御
     *     検索結果エリアを非表示にします。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W8001CriteriaDomain criteriaDomain = ((W8001ActionForm) form).getW8001CriteriaDomain();
        if (StringUtils.isEmpty(criteriaDomain.getSelectCondition())) {
            // Set initial data of the radio button.
            // ラジオボタン初期値設定
            criteriaDomain.setSelectCondition("searchItemNo");
        }
        ((W8001ActionForm) form).setW8001ListDomainList(null);
        
        return FORWARD_SUCCESS;
    }
}
