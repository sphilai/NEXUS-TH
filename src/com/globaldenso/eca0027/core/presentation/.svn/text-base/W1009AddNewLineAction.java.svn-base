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
import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PKG_ITEM_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an Add New Line action class of a Export Packaging Returnable PKG  Material screen.
 * <br />Export Packaging Returnable PKG  Material画面のAdd New Lineアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1009.jsp
 *     - "error":W1009.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W1009AddNewLineAction extends W1009AbstractAction {
    
    /**
     * constructor.
     */
    public W1009AddNewLineAction() {
        super();
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
        W1009ActionForm w1009Form = (W1009ActionForm) form;
        
        // Line addition
        addNewLine(request, w1009Form);
        
        // Display control of a screen
        controlDisplay(request, w1009Form);

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
    protected void addNewLine(HttpServletRequest request, W1009ActionForm form) throws ApplicationException {
        
        List<? extends W1009ListDomain> listDomainList = form.getListDomainList();
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
                W1009ListDomain listDomain = new W1009ListDomain();
                
                listDomain.setExpRequestNo(form.getW1009CriteriaDomain().getExpRequestNo());
                listDomain.setPalletNo(form.getW1009CriteriaDomain().getPalletNo());
                listDomain.setLengthUnit("MM");
                listDomain.setSelectPkgFlg("Y");
                listDomain.setSelectQtyUnit("EA");
                listDomain.setSelectUnitNetWeight("KG");
                
                listDomain.setNetWeightUnit("KG");
                listDomain.setQtyUnit("EA");
                listDomain.setOriginCntryCd("AD");
                listDomain.setCurrCd("AED");
                
                // Registration of an additional line
                form.setListDomainList(listDomainList.size(), listDomain);
            }
        }
    }
    
}
