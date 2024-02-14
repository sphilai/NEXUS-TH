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

import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Export Formalities by Item MA Inquiry画面のアクション・フォームです。 
 * <br />Export Formalities by Item MA Inquiry画面のアクション・フォームです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public class W9018ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9018CriteriaDomain w9018CriteriaDomain;
    
    /**
     *Company
     */
    private String compCd;
    
    /**
     * OwnerCompany
     */
    private String ownerCompCd;

    /**
     *Item No.
     */
    private String itemNo;

    /**
     *Apply Start Date
     */
    private String aplyStrtDt;
    
    /**
     *CIGMA Products
     */
    private String cigmaPrdctFlg;
    
    /**
     * Processing mode
     */
    private String mode;
    
    /**
     * Selected Row number
     */
    private int selectedRow;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W9018ListDomain> listDomainList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018ActionForm() {
        w9018CriteriaDomain = new W9018CriteriaDomain();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9018CriteriaDomain getW9018CriteriaDomain() {
        return w9018CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW9018CriteriaDomain(W9018CriteriaDomain criteriaDomain) {
        this.w9018CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9018ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9018ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index インデックス
     * @return Listドメイン
     */
    public W9018ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9018ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W9018ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
    public void setListDomainList(int index, W9018ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9018ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W9018ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W9018ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
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
     * <p>ownerCompCd のゲッターメソッドです。</p>
     *
     * @return the ownerCompCd
     */
    public String getOwnerCompCd() {
        return ownerCompCd;
    }

    /**
     * <p>ownerCompCd のセッターメソッドです。</p>
     *
     * @param ownerCompCd ownerCompCd に設定する
     */
    public void setOwnerCompCd(String ownerCompCd) {
        this.ownerCompCd = ownerCompCd;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for cigmaPrdctFlg.
     *
     * @return the cigmaPrdctFlg
     */
    public String getCigmaPrdctFlg() {
        return cigmaPrdctFlg;
    }

    /**
     * Setter method for cigmaPrdctFlg.
     *
     * @param cigmaPrdctFlg Set for cigmaPrdctFlg
     */
    public void setCigmaPrdctFlg(String cigmaPrdctFlg) {
        this.cigmaPrdctFlg = cigmaPrdctFlg;
    }

    /**
     * Getter method for mode.
     *
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Setter method for mode.
     *
     * @param mode Set for mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Getter method for selectedRow.
     *
     * @return the selectedRow
     */
    public int getSelectedRow() {
        return selectedRow;
    }

    /**
     * Setter method for selectedRow.
     *
     * @param selectedRow Set for selectedRow
     */
    public void setSelectedRow(int selectedRow) {
        this.selectedRow = selectedRow;
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W9018ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
