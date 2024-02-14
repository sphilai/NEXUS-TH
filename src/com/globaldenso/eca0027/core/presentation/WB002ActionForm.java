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

import com.globaldenso.eca0027.core.business.domain.WB002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB002ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/** 
 * The action form class for Order Registration screen.
 * <br />受注登録画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class WB002ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB002CriteriaDomain wb002CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends WB002ListDomain> wb002ListDomainList; 
    
    /**
     * etdDueDtHidden for the following screen taking over
     * <br />次画面引継ぎ用etdDueDtHidden
     */
    private String etdDueDtHidden;
    
    /**
     * customerItemNoHidden for the following screen taking over
     * <br />次画面引継ぎ用customerItemNoHidden
     */
    private String customerItemNoHidden;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WB002ActionForm() {
        wb002CriteriaDomain = new WB002CriteriaDomain();
    }

    /**
     * Getter method for wb002ListDomainList.
     *
     * @return the wb002ListDomainList
     */
    public List<? extends WB002ListDomain> getWb002ListDomainList() {
        return wb002ListDomainList;
    }

    /**
     * Setter method for wb002ListDomainList.
     *
     * @param wb002ListDomainList Set for wb002ListDomainList
     */
    public void setWb002ListDomainList(List<? extends WB002ListDomain> wb002ListDomainList) {
        this.wb002ListDomainList = wb002ListDomainList;
    }

    /**
     * Getter method for ListDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public WB002ListDomain getWb002ListDomainList(int index) {
        if (wb002ListDomainList == null) {
            wb002ListDomainList = new ArrayList<WB002ListDomain>();
        }

        for (int i = wb002ListDomainList.size(); i <= index; i++ ) {
            wb002ListDomainList().add(new WB002ListDomain());
        }

        return wb002ListDomainList.get(index);
    }

    /**
     * Setter method for ListDomainList
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List domain<br /> Listドメイン
     */
    public void setWb002ListDomainList(int index, WB002ListDomain listDomain) {
        if (wb002ListDomainList == null) {
            wb002ListDomainList = new ArrayList<WB002ListDomain>();
        }

        for (int i = wb002ListDomainList.size(); i < index; i++ ) {
            wb002ListDomainList().add(new WB002ListDomain());
        }

        wb002ListDomainList().add(listDomain);
    }

    /**
     * return {@link #wb002ListDomainList} (Helper method for Generics)
     * <br />{@link #wb002ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> WB002ListDomain
     * @return <T>List<T>
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> wb002ListDomainList() {
        return (List<T>)wb002ListDomainList;
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
     * Getter method for wb002CriteriaDomain.
     *
     * @return the wb002CriteriaDomain
     */
    public WB002CriteriaDomain getWb002CriteriaDomain() {
        return wb002CriteriaDomain;
    }

    /**
     * Setter method for wb002CriteriaDomain.
     *
     * @param wb002CriteriaDomain Set for wb002CriteriaDomain
     */
    public void setWb002CriteriaDomain(WB002CriteriaDomain wb002CriteriaDomain) {
        this.wb002CriteriaDomain = wb002CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        wb002CriteriaDomain.setIgnoreWarnings(null);
        
        if (wb002ListDomainList != null) {
            for (WB002ListDomain listDomain : wb002ListDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
}
