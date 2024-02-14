/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt006CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractAction;

/**
 * The base action class of Outer Package Search Sub Screen. <br />
 * 外装選択子画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */

public abstract class Wt006AbstractAction extends AbstractAction {

    /**
     * commonService
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     */
    public Wt006AbstractAction() {
        super();
    }

    /**
     * <p>Getter method for commonService.</p>
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
    }

    /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}.
     * 
     * Create the pull-down list.
     * - Create list by comma-separated owner company cd(ownerCompCsv) obtained from the form.
     * - Create pulldown list from owner company cd list.
     * Set request attributes. 
     * 
     * プルダウンリストを作成する
     * - formから取得したカンマ区切りの責任者会社コード(ownerCompCsv)をリスト形式にする
     * - リスト形式にした責任会社コードを元にプルダウンリストを作成する
     * リクエスト属性の設定
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        Wt006ActionForm thisForm = (Wt006ActionForm)form;
        Wt006CriteriaDomain criteriaDomain = thisForm.getWt006CriteriaDomain();
        
        // Create the pull-down list.
        String ownerCompCsv = criteriaDomain.getOwnerCompCsv();
        String[] ownerCompArray = ownerCompCsv.split(",");
        List<String> ownerCompList = Arrays.asList(ownerCompArray);
        
        List<SelectListItemDomain> pullDownList = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        
        for (String ownerComp : ownerCompList) {
            bean = new SelectListItemDomain();
            bean.setId(ownerComp);
            bean.setName(ownerComp);
            pullDownList.add(bean);
        }
        
        // Set request attributes.
        request.setAttribute(Eca0027Constants.ATTR_OWNER_COMP_LIST, pullDownList);
        
        return FORWARD_SUCCESS;
    }

}
