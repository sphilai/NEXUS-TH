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

import com.globaldenso.eca0027.core.business.domain.W7001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Shipping Actuality Main screen.
 * <br />船積実績Main画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ActionForm extends AbstractActionForm {

    /**
     * serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * conditions domain.<br />
     * 条件ドメイン
     */
    private W7001CriteriaDomain w7001CriteriaDomain;
    
    /**
     * list of search results domain.<br />
     * 検索結果ドメインのリスト
     */
    private List<? extends W7001ListDomain> listDomainList;

    /**
     * NO SHIPPING Actuality that is selected in the Search Results Area.<br />
     * 検索結果エリアで選択された船積実績NO
     */
    private String shippingActNo;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ActionForm() {
        w7001CriteriaDomain = new W7001CriteriaDomain();
    }

    /**
     * Getter method for w7001CriteriaDomain.
     *
     * @return the w7001CriteriaDomain
     */
    public W7001CriteriaDomain getW7001CriteriaDomain() {
        return w7001CriteriaDomain;
    }

    /**
     * Setter method for w7001CriteriaDomain.
     *
     * @param criteriaDomain Set for w7001CriteriaDomain
     */
    public void setW7001CriteriaDomain(W7001CriteriaDomain criteriaDomain) {
        w7001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for shippingActNo.
     *
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * Setter method for shippingActNo.
     *
     * @param shippingActNo Set for shippingActNo
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }
    
    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index<br />
     * インデックス
     * @return List Domain<br />
     * Listドメイン
     */
    public W7001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W7001ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index<br />
     * インデックス
     * @param listDomain List Domain<br />
     * Listドメイン
     */
    public void setListDomainList(int index, W7001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W7001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W7001ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W7003ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
