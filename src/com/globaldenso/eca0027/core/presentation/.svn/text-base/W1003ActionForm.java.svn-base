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

import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Export Request Description screen.
 * <br />梱包指示Header画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1003ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * FromScreenId
     * 
     */
    private String fromScreenId;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1003CriteriaDomain w1003CriteriaDomain;
    
    /**
     * Search-results area display flag <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * Search-results area display flag <br />検索結果エリア表示フラグ
     */
    private boolean displayQtyList;
    
    /**
     * Search-results area display flag <br />検索結果エリア表示フラグ
     */
    private boolean displayAmountList;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;

    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1003ListDomain> listDomainList;
    
    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1003CriteriaDomain> qtyList;
    
    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1003CriteriaDomain> amountList;

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1003ActionForm() {
        w1003CriteriaDomain = new W1003CriteriaDomain();
    }

    /**
     * Getter method fromScreenId
     * <br />
     * @return fromScreenId <br />Listドメイン
     */
    public String getFromScreenId() {
        return fromScreenId;
    }

    /**
     * Setter method fromScreenId
     * <br />
     *
     * @param fromScreenId fromScreenId
     */
    public void setFromScreenId(String fromScreenId) {
        this.fromScreenId = fromScreenId;
    }


    /**
     * Getter method w1003CriteriaDomain
     * <br />
     * @return w1003CriteriaDomain <br />Listドメイン
     */
    public W1003CriteriaDomain getW1003CriteriaDomain() {
        return w1003CriteriaDomain;
    }

    /**
     * Setter method w1003CriteriaDomain
     * <br />
     *
     * @param criteriaDomain W1003CriteriaDomain
     */
    public void setW1003CriteriaDomain(W1003CriteriaDomain criteriaDomain) {
        w1003CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for displayList
     * <br />L
     * @return displayList <br />
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList
     * <br />
     *
     * @param displayList boolean
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }
    
    /**
     * Getter method for displayQtyList
     * <br />L
     * @return displayQtyList <br />
     */
    public boolean isDisplayQtyList() {
        return displayQtyList;
    }

    /**
     * Setter method for displayQtyList
     * <br />
     *
     * @param displayQtyList boolean
     */
    public void setDisplayQtyList(boolean displayQtyList) {
        this.displayQtyList = displayQtyList;
    }

    /**
     * Getter method for displayAmountList
     * <br />L
     * @return displayAmountList <br />
     */
    public boolean isDisplayAmountList() {
        return displayAmountList;
    }

    /**
     * Setter method for displayAmountList
     * <br />
     *
     * @param displayAmountList boolean
     */
    public void setDisplayAmountList(boolean displayAmountList) {
        this.displayAmountList = displayAmountList;
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
     * Getter method for listDomainList
     * <br />
     *
     * @return listDomainList <br />
     */
    public List<? extends W1003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param listDomainList W1003ListDomain
     */
    public void setListDomainList(List<? extends W1003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for qtyList
     * <br />
     *
     * @return qtyList <br />
     */
    public List<? extends W1003CriteriaDomain> getQtyList() {
        return qtyList;
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param qtyList W1003CriteriaDomain
     */
    public void setQtyList(List<? extends W1003CriteriaDomain> qtyList) {
        this.qtyList = qtyList;
    }

    /**
     * Getter method for amountList
     * <br />
     *
     * @return amountList <br />
     */
    public List<? extends W1003CriteriaDomain> getAmountList() {
        return amountList;
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param amountList W1003CriteriaDomain
     */
    public void setAmountList(List<? extends W1003CriteriaDomain> amountList) {
        this.amountList = amountList;
    }

    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index <br />インデックス
     * @return listDomain <br />Listドメイン
     */
    public W1003ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1003ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W1003ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, W1003ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1003ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W1003ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W1003ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1003ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
