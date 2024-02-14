/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Export Packaging screen.
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1007CriteriaDomain w1007CriteriaDomain;
    /**
     * FromScreenId
     * 
     */
    private String fromScreenId;
    /**
     * Exp Request No
     * 
     */
    private String expRequestNo;
    /**
     * Function No
     * 
     */
    private String functionNo;
    /**
     * DSC  ID
     * 
     */
    private String dscId;
    /**
     * Exp Request ItemId
     * 
     */
    private String expRequestItemId;
    /**
     * Login User DSC ID
     * 
     */
    private String loginUserDscId;
    /**
     * UserAuthList
     * 
     */
    private List<? extends UserAuthDomain> userAuthList;
    /**
     * List W1007ListDomain
     * 
     */
    private List<? extends W1007ListDomain> listDomainList;
    /**
     * Owner Company Code
     * 
     */
    private String ownerCompCd;
    /**
     * Checkbox
     * 
     */
    private String chk;
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007ActionForm() {
        w1007CriteriaDomain = new W1007CriteriaDomain();
    }

    /**
     * <p>Getter method for chk.</p>
     *
     * @return the chk
     */
    public String getChk() {
        return chk;
    }

    /**
     * <p>Setter method for chk.</p>
     *
     * @param chk Set for chk
     */
    public void setChk(String chk) {
        this.chk = chk;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * <p>Getter method for functionNo.</p>
     *
     * @return the functionNo
     */
    public String getFunctionNo() {
        return functionNo;
    }

    /**
     * <p>Setter method for functionNo.</p>
     *
     * @param functionNo Set for functionNo
     */
    public void setFunctionNo(String functionNo) {
        this.functionNo = functionNo;
    }

    /**
     * <p>Getter method for dscId.</p>
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>Setter method for dscId.</p>
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * <p>Getter method for loginUserDscId.</p>
     *
     * @return the loginUserDscId
     */
    public String getLoginUserDscId() {
        return loginUserDscId;
    }

    /**
     * <p>Setter method for loginUserDscId.</p>
     *
     * @param loginUserDscId Set for loginUserDscId
     */
    public void setLoginUserDscId(String loginUserDscId) {
        this.loginUserDscId = loginUserDscId;
    }

    /**
     * <p>Getter method for expRequestNo.</p>
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * <p>Setter method for expRequestNo.</p>
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * <p>Getter method for expRequestItemId.</p>
     *
     * @return the expRequestItemId
     */
    public String getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * <p>Setter method for expRequestItemId.</p>
     *
     * @param expRequestItemId Set for expRequestItemId
     */
    public void setExpRequestItemId(String expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
    }

    /**
     * <p>Getter method for w1007CriteriaDomain.</p>
     *
     * @return the w1007CriteriaDomain
     */
    public W1007CriteriaDomain getW1007CriteriaDomain() {
        return w1007CriteriaDomain;
    }

    /**
     * <p>Setter method for w1007CriteriaDomain.</p>
     *
     * @param criteriaDomain Set for w1007CriteriaDomain
     */
    public void setW1007CriteriaDomain(W1007CriteriaDomain criteriaDomain) {
        w1007CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for ownerCompCd.</p>
     *
     * @return the ownerCompCd
     */
    public String getOwnerCompCd() {
        return ownerCompCd;
    }

    /**
     * <p>Setter method for ownerCompCd.</p>
     *
     * @param ownerCompCd Set for ownerCompCd
     */
    public void setOwnerCompCd(String ownerCompCd) {
        this.ownerCompCd = ownerCompCd;
    }

    /**
     * <p>Getter method for listDomainList.</p>
     *
     * @return the listDomainList
     */
    public List<? extends W1007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W1007ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <p>Getter method for fromScreenId.</p>
     *
     * @return the fromScreenId
     */
    public String getFromScreenId() {
        return fromScreenId;
    }

    /**
     * <p>Setter method for fromScreenId.</p>
     *
     * @param fromScreenId Set for fromScreenId
     */
    public void setFromScreenId(String fromScreenId) {
        this.fromScreenId = fromScreenId;
    }

}
