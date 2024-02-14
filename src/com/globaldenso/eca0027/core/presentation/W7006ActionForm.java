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
import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のアクションフォームです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11637 $
 */
public class W7006ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W7006CriteriaDomain w7006CriteriaDomain;
    
    /**
     * List domain list (Others FILE DATA storage)
     * <br />リストドメインリスト(Othersファイルデータ格納用)
     */
    private List<? extends W7006ListDomain> listDomainList;
    
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
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * INVOICE ISSUE DATE
     * <br />インボイス発行日
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    // There is no meaning the value of the new Date(). It is for exception of Date(null) -> Date avoided in Beanutils.copyProperties().
    // new Date()の値に意味はない。Beanutils.copyProperties()でのDate(null)→Date例外回避のため。
    //private String invoiceIssueDt;
    private Date invoiceIssueDt = new Date();
    
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
     * List domain list (Others FILE DATA storage)
     * <br />リストドメインリスト(Othersファイルデータ格納用)
     */
    private List<FormFile> fileDataList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006ActionForm() {
        w7006CriteriaDomain = new W7006CriteriaDomain();
        fileDataList = new ArrayList<FormFile>();
    }

    /**
     * Getter method for w7006CriteriaDomain.
     *
     * @return the w7006CriteriaDomain
     */
    public W7006CriteriaDomain getW7006CriteriaDomain() {
        return w7006CriteriaDomain;
    }

    /**
     * Setter method for w7006CriteriaDomain.
     *
     * @param criteriaDomain Set for w7006CriteriaDomain
     */
    public void setW7006CriteriaDomain(W7006CriteriaDomain criteriaDomain) {
        w7006CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7006ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for fileDataList.
     *
     * @return the fileDataList
     */
    public List<FormFile> getFileDataList() {
        return fileDataList;
    }

    /**
     * Setter method for fileDataList.
     *
     * @param fileDataList Set for fileDataList
     */
    public void setFileDataList(List<FormFile> fileDataList) {
        this.fileDataList = fileDataList;
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
     * Getter method for fileDataList.
     *
     * @param index Index
     *
     * @return the fileDataList
     */
    public FormFile getFileDataList(int index) {
        if (fileDataList == null) {
            fileDataList = new ArrayList<FormFile>();
        }

        for (int i = fileDataList.size(); i <= index; i++) {
            fileDataList.add(null);
        }
        
        return fileDataList.get(index);
    }

    /**
     * Setter method for fileDataList.
     * 
     * @param index Index
     * 
     * @param fileData Set for fileData
     */
    public void setFileDataList(int index, FormFile fileData) {
        if (fileDataList == null) {
            fileDataList = new ArrayList<FormFile>();
        }

        for (int i = fileDataList.size(); i < index; i++) {
            fileDataList.add(null);
        }
        
        fileDataList.add(fileData);
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
    public W7006ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7006ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W7006ListDomain());
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
    public void setListDomainList(int index, W7006ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W7006ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W7006ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W7006ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W7006ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
