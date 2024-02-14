/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PKG_ITEM_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an Copy Line action class of a Export Request Kit screen.
 * <br />Export Request Kit画面のCopy Lineアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1004.jsp
 *     - "error":W1004.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W1004CopyLineAction extends W1004AbstractAction {
    
    /**
     * constructor.
     */
    public W1004CopyLineAction() {
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
        copyLine(request, w1004Form);
        
        // Display control of a screen
        controlDisplay(request, w1004Form);

        return FORWARD_SUCCESS;
    }

    /**
     *    A line is copy.
     * <br />行を追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param form Action form<br />アクションフォーム
     * @throws ApplicationException When the number of lines of search-results area exceeds the maximum number of lines<br />検索結果エリアの行数が最大行数を越えた場合
     */
    @SuppressWarnings("unchecked")
    protected void copyLine(HttpServletRequest request, W1004ActionForm form) throws ApplicationException {
        
        List<? extends W1004KitListDomain> kitList = form.getKitList();
        int tmpLine = kitList.size() + 1;
        
        List<W1004KitListDomain> copyList = new ArrayList<W1004KitListDomain>();
        for (W1004KitListDomain kitDomain : kitList ) {
            if (!CheckUtil.isBlankOrNull(kitDomain.getSelected())) {
                copyList.add(kitDomain);
            }
        }
        // Addition of a line
        for (int i = 0; i < copyList.size(); i++) {
            if (MAX_PKG_ITEM_COUNT == kitList.size()) {
                throw new GscmApplicationException(NXS_W1_0005);
            } else {
                // The index of additional line is set as a request attribute.
                if (request.getAttribute("first_add_line") == null) {
                    request.setAttribute("first_add_line", kitList.size());
                }
                
                // Create of an additional line
                W1004KitListDomain kitDomain = copyList.get(i);
                W1004KitListDomain copyDomain = new W1004KitListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(copyDomain, kitDomain);
                
                copyDomain.setExpRequestKitId("");
                copyDomain.setKitBrch(tmpLine + i + "");
                
                form.setKitList(kitList.size(), copyDomain);
            }
        }
    }
    
}
