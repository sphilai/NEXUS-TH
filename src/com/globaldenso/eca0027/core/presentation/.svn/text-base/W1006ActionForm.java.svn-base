/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of User ID MA Inquery screen.
 * <br />User ID MA Inquiry画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1006CriteriaDomain w1006CriteriaDomain;
    
    /**
     * From screenId
     * 
     */
    private String fromScreenId;
    
    /**
     * Exp Request No
     * 
     */
    private String expRequestNo;
    
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
     * List W1006ListDomain
     * 
     */
    private List<? extends W1006ListDomain> listDomainList;
    
    /**
     * Owner Company Code
     * 
     */
    private String ownerCompCd;
    
    /**
     * functionNo
     * 
     */
    private String functionNo;
    
    /**
     * dscId
     * 
     */
    private String dscId;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1006ActionForm() {
        w1006CriteriaDomain = new W1006CriteriaDomain();
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
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
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
     * Getter method for w1006CriteriaDomain.
     *
     * @return the w1006CriteriaDomain
     */
    public W1006CriteriaDomain getW1006CriteriaDomain() {
        return w1006CriteriaDomain;
    }

    /**
     * Setter method for w1006CriteriaDomain.
     *
     * @param w1006CriteriaDomain Set for w1006CriteriaDomain
     */
    public void setW1006CriteriaDomain(W1006CriteriaDomain w1006CriteriaDomain) {
        this.w1006CriteriaDomain = w1006CriteriaDomain;
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
    public List<? extends W1006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W1006ListDomain> listDomainList) {
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

    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W1006ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1006ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W1006ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setListDomainList(int index, W1006ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1006ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W1006ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W1006ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1006ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
    
    
}
