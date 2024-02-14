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

import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2008ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MixTagNo
     */
    private String mixTagNo;
    
    /**
     * Download flag
     * <br />ダウンロードフラグ
     */
    private boolean download;
    
    /**
     * Previous transition screen (W2005 or W2007)
     * <br />遷移元画面 (W2005 or W2007)
     */
    private String fromScreenId;

    /**
     * criteria
     */
    private W2008CriteriaDomain w2008CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2008ListDomain> listDomainList;

    /**
     * constructor.
     */
    public W2008ActionForm() {
        w2008CriteriaDomain = new W2008CriteriaDomain();
    }

    /**
     * Getter method for w2008CriteriaDomain.
     *
     * @return the w2008CriteriaDomain
     */
    public W2008CriteriaDomain getW2008CriteriaDomain() {
        return w2008CriteriaDomain;
    }

    /**
     * Setter method for w2008CriteriaDomain.
     *
     * @param criteriaDomain Set for w2008CriteriaDomain
     */
    public void setW2008CriteriaDomain(W2008CriteriaDomain criteriaDomain) {
        w2008CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2008ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2008ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
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
     * Getter method for download.
     *
     * @return the download
     */
    public boolean isDownload() {
        return download;
    }

    /**
     * Setter method for download.
     *
     * @param download Set for download
     */
    public void setDownload(boolean download) {
        this.download = download;
    }

    /**
     * Getter method for fromScreenId.
     *
     * @return the fromScreenId
     */
    public String getFromScreenId() {
        return fromScreenId;
    }

    /**
     * Setter method for fromScreenId.
     *
     * @param fromScreenId Set for fromScreenId
     */
    public void setFromScreenId(String fromScreenId) {
        this.fromScreenId = fromScreenId;
    }

    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index <br />インデックス
     * @return listDomain <br />Listドメイン
     */
    public W2008ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2008ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2008ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, W2008ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2008ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2008ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2008ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
        
        download = false;
    }
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2008ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
