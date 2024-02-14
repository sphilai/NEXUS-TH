/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Packaging Instruction Main Screen.
 * <br />梱包指示Main画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2001ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2001CriteriaDomain w2001CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2001ListDomain> listDomainList; 
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * Packaging Instruction NO selected in search-results area
     * <br />検索結果エリアで選択された梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2001ActionForm() {
        w2001CriteriaDomain = new W2001CriteriaDomain();
    }

    /**
     * Getter method for w2001CriteriaDomain.
     *
     * @return the w2001CriteriaDomain
     */
    public W2001CriteriaDomain getW2001CriteriaDomain() {
        return w2001CriteriaDomain;
    }

    /**
     * Setter method for w2001CriteriaDomain.
     *
     * @param w2001CriteriaDomain Set for w2001CriteriaDomain
     */
    public void setW2001CriteriaDomain(W2001CriteriaDomain w2001CriteriaDomain) {
        this.w2001CriteriaDomain = w2001CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
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
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2001ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain <br />Listドメイン
     */
    public void setListDomainList(int index, W2001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
