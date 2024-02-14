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
import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.W7007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of B / L upload screen.
 * <br />B/Lアップロード画面のアクションフォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7007ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W7007CriteriaDomain w7007CriteriaDomain;
    
    /**
     * List list of domain
     * <br />Listドメインのリスト
     */
    private List<? extends W7007ListDomain> listDomainList;
    
    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * Consignee
     */
    private String consigneeCd;
    
    /**
     * NEXUS Ship to Com.
     */
    private String shipToCompCd;
    
    /**
     * Trans.
     */
    private String trnsCd;
    
    /**
     * Shipping Actuality No
     */
    private String shippingActNo;
    
    /**
     * C / O (file data)<br />
     * C/O（ファイルデータ）
     */
    private FormFile coFileData;
    
    /**
     * Non Wooden (data file)<br />
     * Non Wooden（ファイルデータ）
     */
    private FormFile nonWdFileData;
    
    /**
     * Others (data file)<br />
     * Others（ファイルデータ）
     */
    private FormFile othersFileData;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7007ActionForm() {
        w7007CriteriaDomain = new W7007CriteriaDomain();
    }

    /**
     * Getter method for w7007CriteriaDomain.
     *
     * @return the w7007CriteriaDomain
     */
    public W7007CriteriaDomain getW7007CriteriaDomain() {
        return w7007CriteriaDomain;
    }

    /**
     * Setter method for w7007CriteriaDomain.
     *
     * @param criteriaDomain Set for w7007CriteriaDomain
     */
    public void setW7007CriteriaDomain(W7007CriteriaDomain criteriaDomain) {
        w7007CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7007ListDomain> listDomainList) {
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
     * Getter method for consigneeCd.
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * Setter method for consigneeCd.
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
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
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for shippingActNo.
     *
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * Setter method for shippingActNo.
     *
     * @param shippingActNo Set for shippingActNo
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
    }
    
    /**
     * Getter method for coFileData.
     *
     * @return the coFileData
     */
    public FormFile getCoFileData() {
        return coFileData;
    }

    /**
     * Setter method for coFileData.
     *
     * @param coFileData Set for coFileData
     */
    public void setCoFileData(FormFile coFileData) {
        this.coFileData = coFileData;
    }

    /**
     * Getter method for nonWdFileData.
     *
     * @return the nonWdFileData
     */
    public FormFile getNonWdFileData() {
        return nonWdFileData;
    }

    /**
     * Setter method for nonWdFileData.
     *
     * @param nonWdFileData Set for nonWdFileData
     */
    public void setNonWdFileData(FormFile nonWdFileData) {
        this.nonWdFileData = nonWdFileData;
    }

    /**
     * Getter method for othersFileData.
     *
     * @return the othersFileData
     */
    public FormFile getOthersFileData() {
        return othersFileData;
    }

    /**
     * Setter method for othersFileData.
     *
     * @param othersFileData Set for othersFileData
     */
    public void setOthersFileData(FormFile othersFileData) {
        this.othersFileData = othersFileData;
    }

    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index<br />
     * インデックス
     * @return List domain<br />
     * Listドメイン
     */
    public W7007ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7007ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W7007ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter list for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index<br />
     * インデックス
     * @param listDomain List domain<br />
     * Listドメイン
     */
    public void setListDomainList(int index, W7007ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7007ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W7007ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W7007ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W7007ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
