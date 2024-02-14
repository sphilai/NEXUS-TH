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

import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The initial display of class action Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9007
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
public class W9007InitAction extends W9007AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007InitAction() {
        super();
    }

    
    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Sctive control of the screen item ({@link W9007AbstractAction#controlDisplay(W9007ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * 
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W9007AbstractAction#controlDisplay(W9007ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9007ActionForm w9007From = (W9007ActionForm) form;

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(w9007From, mapping, request);
        w9007From.getW9007CriteriaDomain().setPageInfoCreator(pageInfoCreator);
        
        ActionMessages erros = getErrors(request);
        if (erros.size() == 0) {
            w9007From.setListDomainList(null);
        }    
        
        w9007From.setSearchFlg(true);
        
        W9007CriteriaDomain criteriaDomain = w9007From.getW9007CriteriaDomain();
        if(StringUtils.isEmpty(criteriaDomain.getSelectCondition())) {
            criteriaDomain.setSelectCondition("1");
        }
        criteriaDomain.setSelectCondition("1");
        
        return FORWARD_SUCCESS;
    }
}
