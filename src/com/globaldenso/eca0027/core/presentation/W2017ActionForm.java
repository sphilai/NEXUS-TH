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

import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of X-Tag Register
 * <br />X-Tag Register画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2017ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Previous transition screen (W2014 or W2016)
     * <br />遷移元画面 (W2014 or W2016)
     */
    private String fromScreenId;
    
    /**
     * criteria
     */
    private W2017CriteriaDomain w2017CriteriaDomain;

    /**
     * detail list
     */
    private List<? extends W2017ListDomain> w2017ListDomainList;

    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;

    /**
     * X-Tag No that is selected in the search-results area of the Main screen.
     * <br />Main画面の検索結果エリアで選択されたX-Tag No.
     */
    private String xmainMark;
    
    /**
     * Download flag
     * <br />ダウンロードフラグ
     */
    private boolean download;
    
    /**
     * constructor.
     */
    public W2017ActionForm() {
        w2017CriteriaDomain = new W2017CriteriaDomain();
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
     * Getter method for w2017CriteriaDomain.
     *
     * @return the w2017CriteriaDomain
     */
    public W2017CriteriaDomain getW2017CriteriaDomain() {
        return w2017CriteriaDomain;
    }

    /**
     * Setter method for w2017CriteriaDomain.
     *
     * @param criteriaDomain Set for w2017CriteriaDomain
     */
    public void setW2017CriteriaDomain(W2017CriteriaDomain criteriaDomain) {
        w2017CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for w2017ListDomainList.
     *
     * @return the w2017ListDomainList
     */
    public List<? extends W2017ListDomain> getW2017ListDomainList() {
        return w2017ListDomainList;
    }

    /**
     * Setter method for w2017ListDomainList.
     *
     * @param listDomainList Set for w2017ListDomainList
     */
    public void setW2017ListDomainList(
        List<? extends W2017ListDomain> listDomainList) {
        w2017ListDomainList = listDomainList;
    }
    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public W2017ListDomain getW2017ListDomainList(int index) {
        if (w2017ListDomainList == null) {
            w2017ListDomainList = new ArrayList<W2017ListDomain>();
        }

        for (int i = w2017ListDomainList.size(); i <= index; i++) {
            w2017ListDomainList().add(new W2017ListDomain());
        }
        
        return w2017ListDomainList.get(index);
    }
    
    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setW2017ListDomainList(int index, W2017ListDomain listDomain) {
        if (w2017ListDomainList == null) {
            w2017ListDomainList = new ArrayList<W2017ListDomain>();
        }

        for (int i = w2017ListDomainList.size(); i < index; i++) {
            w2017ListDomainList().add(new W2017ListDomain());
        }
        
        w2017ListDomainList().add(listDomain);
    }
    
    /**
     * return {@link #w2017ListDomainList} (Helper method for Generics)
     * <br />{@link #w2017ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2017ListDomain
     * @return {@link #w2017ListDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> w2017ListDomainList() {
        return (List<T>) w2017ListDomainList;
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
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
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
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w2017ListDomainList != null) {
            for (W2017ListDomain listDomain : w2017ListDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
}
