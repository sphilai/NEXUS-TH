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

import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6008ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Documentation Invoice Detail (Full Returnable)] l screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)]l画面のアクション・フォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6008ActionForm extends AbstractActionForm {
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6006 search criteria domain
     * <br />W6006検索条件ドメイン
     */
    private W6008CriteriaDomain w6008CriteriaDomain;

    /**
     * List of search results W6006 domain
     * <br />W6006検索結果ドメインのリスト
     */
    private List<? extends W6008ListDomain> listDomainList;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008ActionForm() {
        w6008CriteriaDomain = new W6008CriteriaDomain();
    }

    /**
     * Getter method for serialVersionUID.
     * <br />serialVersionUID のゲッターメソッドです。
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for w6008CriteriaDomain.
     * <br />w6008CriteriaDomain のゲッターメソッドです。
     *
     * @return the w6008CriteriaDomain
     */
    public W6008CriteriaDomain getW6008CriteriaDomain() {
        return w6008CriteriaDomain;
    }

    /**
     * Setter method for w6008CriteriaDomain.
     * <br />w6008CriteriaDomain のセッターメソッドです。
     *
     * @param w6008CriteriaDomain w6008CriteriaDomain に設定する
     */
    public void setW6008CriteriaDomain(W6008CriteriaDomain w6008CriteriaDomain) {
        this.w6008CriteriaDomain = w6008CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     * <br />listDomainList のゲッターメソッドです。
     *
     * @return the listDomainList
     */
    public List<? extends W6008ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     * <br />listDomainList のセッターメソッドです。
     *
     * @param listDomainList listDomainList に設定する
     */
    public void setListDomainList(List<? extends W6008ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index インデックス
     * @return Listドメイン
     */
    public W6008ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6008ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W6008ListDomain());
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
    public void setListDomainList(int index, W6008ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6008ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W6008ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w6008CriteriaDomain != null) {
            w6008CriteriaDomain.setIgnoreWarnings(null);
        }
        if (listDomainList != null) {
            for (W6008ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return {@link #listDomainList}.(Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W6008ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
