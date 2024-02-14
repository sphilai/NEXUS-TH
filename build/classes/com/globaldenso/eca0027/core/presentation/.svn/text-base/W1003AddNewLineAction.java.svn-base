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
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PKG_ITEM_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an Add New Line action class of a Export Request Detail screen.
 * <br />Export Request Detail画面のAdd New Lineアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1003.jsp
 *     - "error":W1003.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W1003AddNewLineAction extends W1003AbstractAction {
    
    /**
     * constructor.
     */
    public W1003AddNewLineAction() {
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
        W1003ActionForm w1003Form = (W1003ActionForm) form;
        
        // Line addition
        addNewLine(request, w1003Form);
        
        // Display control of a screen
        controlDisplay(request, w1003Form);

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
    protected void addNewLine(HttpServletRequest request, W1003ActionForm form) throws ApplicationException {
        
        List<? extends W1003ListDomain> listDomainList = form.getListDomainList();
        int tmpLine = listDomainList.size() + 1;
        // Addition of a line
        for (int i = 0; i < 10; i++) {
            if (MAX_PKG_ITEM_COUNT == listDomainList.size()) {
                throw new GscmApplicationException(NXS_W1_0005);
            } else {
                // The index of additional line is set as a request attribute.
                if (request.getAttribute("first_add_line") == null) {
                    request.setAttribute("first_add_line", listDomainList.size());
                }
                
                // Create of an additional line
                W1003ListDomain listDomain = new W1003ListDomain();
                
                listDomain.setKitParFlg("N");
                listDomain.setDngrGoodsImpExpCtrl("N");
                listDomain.setExpRequestNo(form.getW1003CriteriaDomain().getExpRequestNo());
                listDomain.setLineNo(String.format("%03d", i + tmpLine));
                listDomain.setCurrCd(form.getW1003CriteriaDomain().getCurrCd());
                listDomain.setOriginCntryCd(form.getW1003CriteriaDomain().getOriginCntryCd());
                listDomain.setQtyUnit(form.getW1003CriteriaDomain().getQtyUnit());
                //Issue 182
                listDomain.setReExpGoodsFlg(form.getW1003CriteriaDomain().getReExpGoodsFlg());
                
                //Issue 188 2016-04-07
                if (form.getW1003CriteriaDomain().getInvoiceCtgry().equalsIgnoreCase("C") || form.getW1003CriteriaDomain().getInvoiceCtgry().equalsIgnoreCase("I")) {
                    listDomain.setCommercialFlg("Y");
                }else{
                    listDomain.setCommercialFlg("N");
                }
                
                // Registration of an additional line
                form.setListDomainList(listDomainList.size(), listDomain);
            }
        }
    }
    
}
