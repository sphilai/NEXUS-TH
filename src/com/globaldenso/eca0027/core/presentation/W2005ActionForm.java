/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2005ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番梱包Main Screen画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2005ActionForm extends AbstractActionForm {
    
    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /** criteria */
    private W2005CriteriaDomain w2005CriteriaDomain;

    /** detail list */
    private List<? extends W2005ListDomain> listDomainList;
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * The MIX TAG NO selected in search-results area
     * <br />検索結果エリアで選択されたMIXタグNO
     */
    private String mixTagNo;

    /**
     * constructor.
     */
    public W2005ActionForm() {
        w2005CriteriaDomain = new W2005CriteriaDomain();
    }

    /**
     * Getter method for w2005CriteriaDomain.
     *
     * @return the w2005CriteriaDomain
     */
    public W2005CriteriaDomain getW2005CriteriaDomain() {
        return w2005CriteriaDomain;
    }

    /**
     * Setter method for w2005CriteriaDomain.
     *
     * @param criteriaDomain Set for w2005CriteriaDomain
     */
    public void setW2005CriteriaDomain(W2005CriteriaDomain criteriaDomain) {
        w2005CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2005ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2005ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2005ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2005ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2005ListDomain());
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
    public void setListDomainList(int index, W2005ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2005ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2005ListDomain());
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
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2005ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
