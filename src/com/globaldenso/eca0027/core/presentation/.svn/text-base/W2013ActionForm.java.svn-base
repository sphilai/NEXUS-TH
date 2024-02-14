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

import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML PKG Info Detail
 * <br />CML PKG Info Detail画面のアクション・フォームです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2013ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2013CriteriaDomain w2013CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2013ListDomain> listDomainList; 
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * MAIN MARK (screen taking over item from W2009)
     * <br />メインマーク(W2009からの画面引継ぎ項目)
     */
    private String mainMark;
    
    /**
     * Processing mode (taking over item from previous transition screen)
     * <br />処理モード (遷移元画面からの引継ぎ項目)
     */
    private String functionMode;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2013ActionForm() {
        w2013CriteriaDomain = new W2013CriteriaDomain();
    }

    /**
     * Getter method for w2013CriteriaDomain.
     *
     * @return the w2013CriteriaDomain
     */
    public W2013CriteriaDomain getW2013CriteriaDomain() {
        return w2013CriteriaDomain;
    }

    /**
     * Setter method for w2013CriteriaDomain.
     *
     * @param w2013CriteriaDomain Set for w2013CriteriaDomain
     */
    public void setW2013CriteriaDomain(W2013CriteriaDomain w2013CriteriaDomain) {
        this.w2013CriteriaDomain = w2013CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2013ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2013ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2013ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2013ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W2013ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, W2013ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2013ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W2013ListDomain());
        }

        listDomainList().add(listDomain);
    }

    /**
     * Getter method for displayList.
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList.
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }
    
    /**
     * Getter method for functionMode.
     *
     * @return the functionMode
     */
    public String getFunctionMode() {
        return functionMode;
    }

    /**
     * Setter method for functionMode.
     *
     * @param functionMode Set for functionMode
     */
    public void setFunctionMode(String functionMode) {
        this.functionMode = functionMode;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2013ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> W2013ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }
}
