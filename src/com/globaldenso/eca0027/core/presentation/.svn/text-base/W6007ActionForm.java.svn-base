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

import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のアクション・フォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W6007ActionForm extends AbstractActionForm {
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6007 search criteria domain
     * <br />W6007検索条件ドメイン
     */
    private W6007CriteriaDomain w6007CriteriaDomain;

    /**
     * List of search results W6007 domain
     * <br />W6007検索結果ドメインのリスト
     */
    private List<? extends W6007ListDomain> listDomainList;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007ActionForm() {
        w6007CriteriaDomain = new W6007CriteriaDomain();
    }

    /**
     * Getter method for w6007CriteriaDomain.
     *
     * @return the w6007CriteriaDomain
     */
    public W6007CriteriaDomain getW6007CriteriaDomain() {
        return w6007CriteriaDomain;
    }

    /**
     * Setter method for w6007CriteriaDomain.
     *
     * @param criteriaDomain Set for w6007CriteriaDomain
     */
    public void setW6007CriteriaDomain(W6007CriteriaDomain criteriaDomain) {
        w6007CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W6007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W6007ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     *
     * @param index <br />
     * インデックス
     * @return <br />
     * Listドメイン
     */
    public W6007ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6007ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W6007ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter list for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index <br />
     * インデックス
     * @param listDomain <br />
     * Listドメイン
     */
    public void setListDomainList(int index, W6007ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6007ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W6007ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w6007CriteriaDomain != null) {
            w6007CriteriaDomain.setIgnoreWarnings(null);
        }
        if (listDomainList != null) {
            for (W6007ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * return {@link #listDomainList}.
     * <br />{@link #listDomainList}を返します。
     *
     * @param <T> W6007ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
