/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PKG_ITEM_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an Add New Line action class of a Export Request Kit screen.
 * <br />Export Request Kit画面のAdd New Lineアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1004.jsp
 *     - "error":W1004.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W1004AddNewLineAction extends W1004AbstractAction {
    
    /**
     * constructor.
     */
    public W1004AddNewLineAction() {
        super();
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // Setting of action form
        W1004ActionForm w1004Form = (W1004ActionForm) form;
        
        // Line addition
        addNewLine(request, w1004Form);
        
        // Display control of a screen
        controlDisplay(request, w1004Form);

        return FORWARD_SUCCESS;
    }

    /**
     *    A line is added.
     * <br />行を追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     * @throws ApplicationException When the number of lines of search-results area exceeds the maximum number of lines<br />検索結果エリアの行数が最大行数を越えた場合
     */
    @SuppressWarnings("unchecked")
    protected void addNewLine(HttpServletRequest request, W1004ActionForm form) throws ApplicationException {
        
        List<? extends W1004KitListDomain> kitList = form.getKitList();
        int tmpLine = kitList.size() + 1;
        
        // Addition of a line
        for (int i = 0; i < 10; i++) {
            if (MAX_PKG_ITEM_COUNT == kitList.size()) {
                throw new GscmApplicationException(NXS_W1_0005);
            } else {
                // The index of additional line is set as a request attribute.
                if (request.getAttribute("first_add_line") == null) {
                    request.setAttribute("first_add_line", kitList.size());
                }
                
                // Create of an additional line
                W1004KitListDomain kitDomain = new W1004KitListDomain();
                
                kitDomain.setDngrGoodsImpExpCtrl("N");
                kitDomain.setExpRequestNo(form.getW1004CriteriaDomain().getExpRequestNo());
                kitDomain.setExpRequestItemId(form.getListDomainList().get(0).getExpRequestItemId());
                kitDomain.setKitBrch(tmpLine + i + "");
                kitDomain.setCurrency(form.getListDomainList().get(0).getCurrCd());
                
                //Issue 077
                kitDomain.setOriginCntryCd(form.getListDomainList().get(0).getOriginCntryCd());
                kitDomain.setQtyUnit(form.getListDomainList().get(0).getQtyUnit());
                
                //Issue 140
                kitDomain.setCommercialFlg(form.getListDomainList().get(0).getCommercialFlg());
                
                form.setKitList(kitList.size(), kitDomain);
            }
        }
    }
    
}
