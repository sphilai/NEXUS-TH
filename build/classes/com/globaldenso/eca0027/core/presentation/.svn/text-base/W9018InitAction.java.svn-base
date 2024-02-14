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
import org.apache.struts.action.ActionMessages;

import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The initial display of class action Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9018
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class W9018InitAction extends W9018AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W9018AbstractAction#controlDisplay(W9018ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * 
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W9018AbstractAction#controlDisplay(W9018ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9018ActionForm w9018Form = (W9018ActionForm) form;
        // Check initial screen.
        // 初期画面ではSearchを初期値選択
        if (StringUtils.isEmpty(w9018Form.getW9018CriteriaDomain().getSelectCondition())) {
            // Set initial data to the Search.
            w9018Form.getW9018CriteriaDomain().setSelectCondition("1");
        } else {
            PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(w9018Form, mapping, request);
            w9018Form.getW9018CriteriaDomain().setPageInfoCreator(pageInfoCreator);
        }
        ActionMessages erros = getErrors(request);
        if (erros.size() == 0) {
            w9018Form.setListDomainList(null);
        }
        
        return FORWARD_SUCCESS;
    }
}
