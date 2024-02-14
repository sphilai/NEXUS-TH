/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Documentation Invoice Detail (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のアクション・フォームです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10564 $
 */
public class W6009ActionForm extends AbstractActionForm {
    
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W6009CriteriaDomain w6009CriteriaDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009ActionForm() {
        w6009CriteriaDomain = new W6009CriteriaDomain();
    }

    /**
     * Getter method for w6009CriteriaDomain.
     *
     * @return the w6009CriteriaDomain
     */
    public W6009CriteriaDomain getW6009CriteriaDomain() {
        return w6009CriteriaDomain;
    }

    /**
     * Setter method for w6009CriteriaDomain.
     *
     * @param criteriaDomain Set for w6009CriteriaDomain
     */
    public void setW6009CriteriaDomain(W6009CriteriaDomain criteriaDomain) {
        w6009CriteriaDomain = criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
        if ("/W6009Register".equals(mapping.getPath())
            || "/W6009Cancel".equals(mapping.getPath())) {
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
        
            if (w6009CriteriaDomain != null) {
                w6009CriteriaDomain.setFree1DispFlg(null);
                w6009CriteriaDomain.setFree2DispFlg(null);
                w6009CriteriaDomain.setFree3DispFlg(null);
                w6009CriteriaDomain.setFree4DispFlg(null);
            }
        // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
        }
        // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    }
}
