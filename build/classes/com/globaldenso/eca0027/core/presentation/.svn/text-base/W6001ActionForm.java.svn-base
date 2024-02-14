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

import com.globaldenso.eca0027.core.business.domain.W6001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Form of action Documentation Invoice Main Screen screen.
 * <br />通関書類作成業務 Invoice Main Screen画面のアクション・フォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001ActionForm extends AbstractActionForm {
    
    /**
     * serial version ID.<br />
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
 
    /**
     * W6001 search criteria domain<br />
     * W6001検索条件ドメイン
     */
    private W6001CriteriaDomain w6001CriteriaDomain;

    /**
     * List of search results W6001 domain<br />
     * W6001検索結果ドメインのリスト
     */
    private List<? extends W6001ListDomain> listDomainList;

    /**
     * Line number to select the Print PDF<br />
     * Print PDFを選択した行番号
     */
    private String printRow;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001ActionForm() {
        w6001CriteriaDomain = new W6001CriteriaDomain();
    }

    /**
     * Getter method for w6001CriteriaDomain.
     *
     * @return the w6001CriteriaDomain
     */
    public W6001CriteriaDomain getW6001CriteriaDomain() {
        return w6001CriteriaDomain;
    }

    /**
     * Setter method for w6001CriteriaDomain.
     *
     * @param criteriaDomain Set for w6001CriteriaDomain
     */
    public void setW6001CriteriaDomain(W6001CriteriaDomain criteriaDomain) {
        w6001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W6001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W6001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for printRow.
     *
     * @return the printRow
     */
    public String getPrintRow() {
        return printRow;
    }

    /**
     * Setter method for printRow.
     *
     * @param printRow Set for printRow
     */
    public void setPrintRow(String printRow) {
        this.printRow = printRow;
    }

    /**
     * Getter method for DomainList.
     * <br />ListドメインリストのGetterです。
     *
     * @param index インデックス
     * @return Listドメイン
     */
    public W6001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W6001ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for DomainList.
     * <br />ListドメインリストのSetterです。
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
    public void setListDomainList(int index, W6001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W6001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W6001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W6001ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return{@link #listDomainList}(Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W6001ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
