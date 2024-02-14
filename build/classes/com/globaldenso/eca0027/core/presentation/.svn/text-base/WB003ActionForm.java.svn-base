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

import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The Action form class of order two or more P/O registration screen
 * <br />受注複数P/O登録画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class WB003ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB003CriteriaDomain wb003CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends WB003ListDomain> wb003ListDomainList; 
    
    /**
     * etdDueDtHidden for screen taking over
     * <br />画面引継ぎ用etdDueDtHidden
     */
    private String etdDueDtHidden;
    
    /**
     * customerItemNoHidden for screen taking over
     * <br />画面引継ぎ用customerItemNoHidden
     */
    private String customerItemNoHidden;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WB003ActionForm() {
        wb003CriteriaDomain = new WB003CriteriaDomain();
    }


    /**
     * Getter method for wb003CriteriaDomain.
     *
     * @return the wb003CriteriaDomain
     */
    public WB003CriteriaDomain getWb003CriteriaDomain() {
        return wb003CriteriaDomain;
    }


    /**
     * Setter method for wb003CriteriaDomain.
     *
     * @param wb003CriteriaDomain Set for wb003CriteriaDomain
     */
    public void setWb003CriteriaDomain(WB003CriteriaDomain wb003CriteriaDomain) {
        this.wb003CriteriaDomain = wb003CriteriaDomain;
    }


    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB003ListDomain> getWb003ListDomainList() {
        return wb003ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWb003ListDomainList(List<? extends WB003ListDomain> listDomainList) {
        this.wb003ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public WB003ListDomain getWb003ListDomainList(int index) {
        if (wb003ListDomainList == null) {
            wb003ListDomainList = new ArrayList<WB003ListDomain>();
        }

        for (int i = wb003ListDomainList.size(); i <= index; i++ ) {
            wb003ListDomainList().add(new WB003ListDomain());
        }

        return wb003ListDomainList.get(index);
    }

    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setWb003ListDomainList(int index, WB003ListDomain listDomain) {
        if (wb003ListDomainList == null) {
            wb003ListDomainList = new ArrayList<WB003ListDomain>();
        }

        for (int i = wb003ListDomainList.size(); i < index; i++ ) {
            wb003ListDomainList().add(new W2008ListDomain());
        }

        wb003ListDomainList().add(listDomain);
    }

    /**
     * return {@link #wb003ListDomainList} (Helper method for Generics)
     * <br />{@link #wb003ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> WB003ListDomain
     * @return {@link #wb003ListDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> wb003ListDomainList() {
        return (List<T>)wb003ListDomainList;
    }

    /**
     * Getter method for etdDueDtHidden.
     *
     * @return the etdDueDtHidden
     */
    public String getEtdDueDtHidden() {
        return etdDueDtHidden;
    }

    /**
     * Setter method for etdDueDtHidden.
     *
     * @param etdDueDtHidden Set for etdDueDtHidden
     */
    public void setEtdDueDtHidden(String etdDueDtHidden) {
        this.etdDueDtHidden = etdDueDtHidden;
    }

    /**
     * Getter method for customerItemNoHidden.
     *
     * @return the customerItemNoHidden
     */
    public String getCustomerItemNoHidden() {
        return customerItemNoHidden;
    }

    /**
     * Setter method for customerItemNoHidden.
     *
     * @param customerItemNoHidden Set for customerItemNoHidden
     */
    public void setCustomerItemNoHidden(String customerItemNoHidden) {
        this.customerItemNoHidden = customerItemNoHidden;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        wb003CriteriaDomain.setIgnoreWarnings(null);
        
        if (wb003ListDomainList != null) {
            for (WB003ListDomain listDomain : wb003ListDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
}
