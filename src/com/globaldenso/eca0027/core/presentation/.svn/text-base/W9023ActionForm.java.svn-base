/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7517 $
 */
public class W9023ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9023CriteriaDomain w9023CriteriaDomain;
    
    /**
     * Company
     */
    private String compCd;

    /**
     * Document No.
     */
    private String docNo;
    
    /**
     * Proc Mode
     */
    private String procMode;
    
    /**
     * Master1
     */
    private FormFile master1;
    
    /**
     * Master5
     */
    private FormFile master5;
    
    /**
     * Master6
     */
    private FormFile master6;
    
    /**
     * Master9
     */
    private FormFile master9;
    
    /**
     * Master12
     */
    private FormFile master12;
    
    /**
     * Master13
     */
    private FormFile master13;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9023ActionForm() {
        w9023CriteriaDomain = new W9023CriteriaDomain();
    }

    /**
     * Getter method for w9023CriteriaDomain.
     *
     * @return the w9023CriteriaDomain
     */
    public W9023CriteriaDomain getW9023CriteriaDomain() {
        return w9023CriteriaDomain;
    }

    /**
     * Setter method for w9023CriteriaDomain.
     *
     * @param criteriaDomain Set for w9023CriteriaDomain
     */
    public void setW9023CriteriaDomain(W9023CriteriaDomain criteriaDomain) {
        w9023CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }
    
    /**
     * Getter method for master1.
     *
     * @return the master1
     */
    public FormFile getMaster1() {
        return master1;
    }

    /**
     * Setter method for master1.
     *
     * @param master1 Set for master1
     */
    public void setMaster1(FormFile master1) {
        this.master1 = master1;
    }

    /**
     * Getter method for master5.
     *
     * @return the master5
     */
    public FormFile getMaster5() {
        return master5;
    }

    /**
     * Setter method for master5.
     *
     * @param master5 Set for master5
     */
    public void setMaster5(FormFile master5) {
        this.master5 = master5;
    }

    /**
     * Getter method for master6.
     *
     * @return the master6
     */
    public FormFile getMaster6() {
        return master6;
    }

    /**
     * Setter method for master6.
     *
     * @param master6 Set for master6
     */
    public void setMaster6(FormFile master6) {
        this.master6 = master6;
    }

    /**
     * Getter method for master9.
     *
     * @return the master9
     */
    public FormFile getMaster9() {
        return master9;
    }

    /**
     * Setter method for master9.
     *
     * @param master9 Set for master9
     */
    public void setMaster9(FormFile master9) {
        this.master9 = master9;
    }

    /**
     * Getter method for master12.
     *
     * @return the master12
     */
    public FormFile getMaster12() {
        return master12;
    }

    /**
     * Setter method for master12.
     *
     * @param master12 Set for master12
     */
    public void setMaster12(FormFile master12) {
        this.master12 = master12;
    }

    /**
     * Getter method for master13.
     *
     * @return the master13
     */
    public FormFile getMaster13() {
        return master13;
    }

    /**
     * Setter method for master13.
     *
     * @param master13 Set for master13
     */
    public void setMaster13(FormFile master13) {
        this.master13 = master13;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w9023CriteriaDomain != null) {
            w9023CriteriaDomain.setM5Delete(null);
            w9023CriteriaDomain.setM9Delete(null);
            w9023CriteriaDomain.setM12Delete(null);
            w9023CriteriaDomain.setM13Delete(null);
        }
    }
}
