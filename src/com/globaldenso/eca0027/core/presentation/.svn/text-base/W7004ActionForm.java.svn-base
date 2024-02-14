/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のアクション・フォームです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11636 $
 */
public class W7004ActionForm extends AbstractActionForm {

    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * conditions domain<br />
     * 条件ドメイン
     */
    private W7004CriteriaDomain w7004CriteriaDomain;
    
    /**
     * list of search results domain<br />
     * 検索結果ドメインのリスト
     */
    private List<? extends W7004ListDomain> listDomainList;
    
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
     * B/L No
     */
    private String billdNo;
    
    /**
     * Shipping Actuality No
     */
    private String shippingActNo;
    
    /**
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * INVOICE ISSUE DATE<br />
     * インボイス発行日
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    // There is no meaning the value of the new Date(). It is for exception of Date(null) -> Date avoided in Beanutils.copyProperties().
    // new Date()の値に意味はない。Beanutils.copyProperties()でのDate(null)→Date例外回避のため。
    //private String invoiceIssueDt;
    private Date invoiceIssueDt = new Date();
    
    /**
     * CONTAINER LOOSE TYPE.<br />
     * コンテナルーズ区分(C/L)
     */
    private String containerLooseTyp;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004ActionForm() {
        w7004CriteriaDomain = new W7004CriteriaDomain();
    }

    /**
     * Getter method for w7004CriteriaDomain.
     *
     * @return the w7004CriteriaDomain
     */
    public W7004CriteriaDomain getW7004CriteriaDomain() {
        return w7004CriteriaDomain;
    }

    /**
     * Setter method for w7004CriteriaDomain.
     *
     * @param criteriaDomain Set for w7004CriteriaDomain
     */
    public void setW7004CriteriaDomain(W7004CriteriaDomain criteriaDomain) {
        w7004CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7004ListDomain> listDomainList) {
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
     * Getter method for billdNo.
     *
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * Setter method for billdNo.
     *
     * @param billdNo Set for billdNo
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
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
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for invoiceIssueDt.
     *
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * Getter method for listDomainList.
     * <br />ListドメインリストのGetterです。
     *
     * @param index インデックス
     * @return Listドメイン
     */
    public W7004ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7004ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W7004ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for listDomainList.
     * <br />ListドメインリストのSetterです。
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
    public void setListDomainList(int index, W7004ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7004ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W7004ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W7004ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     *  Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W7004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

    /**
     * <p>containerLooseTyp のゲッターメソッドです。</p>
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * <p>containerLooseTyp のセッターメソッドです。</p>
     *
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }
    
}
