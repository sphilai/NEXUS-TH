/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 *    The action form of a Multiple Item No. in 1Box PKG number Main screen.
 * <br />小箱内多品番Main画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class WC001ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Shipper CD
     * <br />荷主コード
     */
    private String shipperCd;

    /**
     * SHIP TO CODE
     * <br />送荷先コード
     */
    private String shipToCd;

    /**
     * SHIP TO NAME
     * <br />送荷先名称
     */
    private String shipToNm;

    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WC001CriteriaDomain criteriaDomain;
    
    /**
     * List domain
     * <br />リストドメイン
     */
    private List<? extends WC001ListDomain> listDomainList;
    
    /**
     * After [ Register ] flag
     * <br />Register後フラグ
     */
    private String strAfterRegist;
    
    /**
     * Download flag (CML)
     * <br />ダウンロードフラグ (CML)
     */
    private boolean downloadCml;

    
    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public WC001ActionForm() {
        if (criteriaDomain == null) {
            criteriaDomain = new WC001CriteriaDomain();
        }
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public WC001CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(WC001CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WC001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends WC001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
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
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * Getter method for shipToNm.
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * Setter method for shipToNm.
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetter
     *
     * @param index index<br />インデックス
     * @return List Domain<br />listドメイン
     */
    public WC001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WC001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new WC001ListDomain());
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
    public void setListDomainList(int index, WC001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WC001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new WC001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> WC001ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

    /**
     * Getter method for strAfterRegist.
     *
     * @return the strAfterRegist
     */
    public String getStrAfterRegist() {
        return strAfterRegist;
    }

    /**
     * Setter method for strAfterRegist.
     *
     * @param strAfterRegist Set for strAfterRegist
     */
    public void setStrAfterRegist(String strAfterRegist) {
        this.strAfterRegist = strAfterRegist;
    }

    /**
     * Getter method for downloadCml.
     *
     * @return the downloadCml
     */
    public boolean isDownloadCml() {
        return downloadCml;
    }

    /**
     * Setter method for downloadCml.
     *
     * @param downloadCml Set for downloadCml
     */
    public void setDownloadCml(boolean downloadCml) {
        this.downloadCml = downloadCml;
    }
}
