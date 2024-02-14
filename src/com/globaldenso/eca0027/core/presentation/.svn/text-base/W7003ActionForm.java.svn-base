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

import com.globaldenso.eca0027.core.business.domain.W7003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Shipping Actuality Create screen.
 * <br />船積実績Create画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W7003ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W7003CriteriaDomain w7003CriteriaDomain;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W7003ListDomain> listDomainList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7003ActionForm() {
        w7003CriteriaDomain = new W7003CriteriaDomain();
    }

    /**
     * Getter method for w7003CriteriaDomain.
     *
     * @return the w7003CriteriaDomain
     */
    public W7003CriteriaDomain getW7003CriteriaDomain() {
        return w7003CriteriaDomain;
    }

    /**
     * Setter method for w7003CriteriaDomain.
     *
     * @param criteriaDomain Set for w7003CriteriaDomain
     */
    public void setW7003CriteriaDomain(W7003CriteriaDomain criteriaDomain) {
        w7003CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter List of domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index<br />
     * インデックス
     * @return List domain<br />
     * Listドメイン
     */
    public W7003ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7003ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W7003ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List of domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index List domain<br />
     * インデックス
     * @param listDomain List domain<br />
     * Listドメイン
     */
    public void setListDomainList(int index, W7003ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7003ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W7003ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W7003ListDomain listDomain : listDomainList) {
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
