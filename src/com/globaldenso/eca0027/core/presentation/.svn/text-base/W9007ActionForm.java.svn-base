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

import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のアクション・フォームです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public class W9007ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9007CriteriaDomain w9007CriteriaDomain;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W9007ListDomain> listDomainList;
    
    /**
     * Search results display area flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * NEXUS Ship to
     */
    private String shipToCompCd;
    
    /**
     * Apply Start Date
     */
    private String aplyStrtDt;

    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;

    /**
     * Search mode flag (for screen)
     * <br />検索モードフラグ (画面用)
     */
    private boolean searchFlg;
    
    /**
     * OwnerCompany
     */
    private String ownerCompCd;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W9007ActionForm() {
        w9007CriteriaDomain = new W9007CriteriaDomain();
    }

    /**
     * Getter method for w9007CriteriaDomain.
     *
     * @return the w9007CriteriaDomain
     */
    public W9007CriteriaDomain getW9007CriteriaDomain() {
        return w9007CriteriaDomain;
    }

    /**
     * Setter method for w9007CriteriaDomain.
     *
     * @param w9007CriteriaDomain Set for w9007CriteriaDomain
     */
    public void setW9007CriteriaDomain(W9007CriteriaDomain w9007CriteriaDomain) {
        this.w9007CriteriaDomain = w9007CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9007ListDomain> listDomainList) {
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
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }
    
    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W9007ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9007ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W9007ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setListDomainList(int index, W9007ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9007ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W9007ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W9007ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Getter method for searchFlg.
     *
     * @return the searchFlg
     */
    public boolean isSearchFlg() {
        return searchFlg;
    }

    /**
     * Setter method for searchFlg.
     *
     * @param searchFlg Set for searchFlg
     */
    public void setSearchFlg(boolean searchFlg) {
        this.searchFlg = searchFlg;
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W9007ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

    /**
     * <p>ownerCompCd のゲッターメソッドです。</p>
     *
     * @return the ownerCompCd
     */
    public String getOwnerCompCd() {
        return ownerCompCd;
    }

    /**
     * <p>ownerCompCd のセッターメソッドです。</p>
     *
     * @param ownerCompCd ownerCompCd に設定する
     */
    public void setOwnerCompCd(String ownerCompCd) {
        this.ownerCompCd = ownerCompCd;
    }
    
}
