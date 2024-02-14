/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The initial display of class action Export Shipping Item Special Information MA Inquiry screen.
 * <br />Export Shipping Item Special Information MA Inquiry画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9016
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W9016InitAction extends W9016AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W9016AbstractAction#controlDisplay(W9016ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * 
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W9016AbstractAction#controlDisplay(W9016ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9016ActionForm w9016Form = (W9016ActionForm) form;
        if (w9016Form.getW9016CriteriaDomain() != null) {
            // Set pushed down status of the Search button.
            // Searchボタンを押下状態にする
            w9016Form.getW9016CriteriaDomain().setSelectCondition("1");
            
            PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(w9016Form, mapping, request);
            w9016Form.getW9016CriteriaDomain().setPageInfoCreator(pageInfoCreator);
        }
        ActionMessages erros = getErrors(request);
        if (erros.size() == 0) {
            w9016Form.setListDomainList(null);
        }

        
        controlDisplay((W9016ActionForm) form, request);
        
        return FORWARD_SUCCESS;
    }
}
