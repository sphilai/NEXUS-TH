/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * <br />The domain that holds the search criteria Shipping Actuality.
 * <br />船積実績の検索条件を保持するドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13885 $
 */
public class W7001ShippingActCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * DSC-ID
     */
    private String dscId;

    /**
     * B/L NO
     */
    private String billdNo;

    /**
     * BRANCH<br />
     * 枝番
     */
    private BigDecimal brch;

    /**
     * CANCEL FLAG.<br />
     * キャンセルフラグ
     */
    private String cancelFlg;

    /**
     * CARRIER COMPANY CODE.<br />
     * 運送会社コード
     */
    private String carrierCompCd;

    /**
     * CONSIGNEE CODE.<br />
     * 荷受人コード
     */
    private String consigneeCd;

    /**
     * CONTAINER LOOSE TYPE.<br />
     * コンテナルーズ区分(C/L)
     */
    private String containerLooseTyp;

    /**
     * CONTAINER NO.<br />
     * コンテナNO
     */
    private String containerNo;

    /**
     * DOCUMENT TYPE.<br />
     * ドキュメント種別
     */
    private String docTyp;

    /**
     * FILE ID.<br />
     * ファイルID
     */
    private String fileId;

    /**
     * B/L FILE ID.<br />
     * B/LファイルID
     */
    private List<String> billdFileIdList;
    
    /**
     * CLP FILE ID.<br />
     * CLPファイルID
     */
    private List<String> clpFileIdList;
    
    /**
     * ATD<br />
     * 出発日
     */
    private Date atd;
    
    /**
     * ATD(From)<br />
     * 出発日(From)
     */
    private Date fmAtd;

    /**
     * ATD(To)<br />
     * 出発日(To)
     */
    private Date toAtd;

    /**
     * ETD<br />
     * 出発予定日
     */
    private Date etd;
    
    /**
     * ETD(From)<br />
     * 出発予定日(From)
     */
    private Date fmEtd;

    /**
     * ETD(To)<br />
     * 出発予定日(To)
     */
    private Date toEtd;

    /**
     * ETA<br />
     * 到着予定日
     */
    private Date eta;
    
    /**
     * REGISTER DATE.<br />
     * 登録日
     */
    private Date registerDt;
    
    /**
     * REGISTER DATE(From).<br />
     * 登録日(From)
     */
    private Date fmRegisterDt;

    /**
     * REGISTER DATE(To).<br />
     * 登録日(To)
     */
    private Date toRegisterDt;

    /**
     * FREIGHT RESPONSIBLE CODE.<br />
     * 運賃支払いコード(F/R)
     */
    private String freightResponsibleCd;

    /**
     * INVOICE ISSUE DATE.<br />
     * インボイス発行日
     */
    private Date invoiceIssueDt;

    /**
     * INVOICE NO.<br />
     * インボイスNO
     */
    private String invoiceNo;

    /**
     * SHIPPER CODE.<br />
     * 荷主コード
     */
    private String shipperCd;

    /**
     * SHIPPING ACTUALITY NO.<br />
     * 船積実績NO
     */
    private String shippingActNo;

    /**
     * SHIP TO COMPANY CODE.<br />
     * 送荷先会社コード
     */
    private String shipToCompCd;

    /**
     * TRANSPORT CODE.<br />
     * 輸送手段コード
     */
    private String trnsCd;

    /**
     * VESSEL<br />
     * 船
     */
    private String vessel;

    /**
     * B/L Update
     */
    private String blUpdate;
    
    /**
     * SHIPPING ACTUALITY STATUS.<br />
     * 船積実績ステータス
     */
    private String shippingActStatus;
    
    /**
     * Auto Invoice Register
     */
    private String autoInvoiceRegisterFlg;
    
    /**
     * No Of Invoice
     */
    private String noOfInvoice;
    
    /**
     * No Of Container
     */
    private String noOfContainer;
    
    /**
     * Pkg Qty
     */
    private String pkgQty;
    
    /**
     * FILE DATA.<br />
     * ファイルデータ
     */
    private InputStream fileData;
    
    /**
     * FILE NAME.<br />
     * ファイル名
     */
    private String fileName;
    
    /**
     * DELETE FLAG.<br />
     * 削除フラグ
     */
    private String deleteFlag;
    
    /**
     * SERVER ID.<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * User function use authority.<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Invoice domain list.<br />
     * インボイスドメインリスト
     */
    private List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList;

    /**
     * List of Shipping Document domain.<br />
     * 船積書類ドメインのリスト
     */
    private List<? extends W7001ShippingActDocDomain> shippingActDocList;
    
    /**
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Shipping Actuality Receive Order LOCK FLAG. <br />
     * If "Y", which can be locked.<br />
     * 船積実績対象品受注情報ロックフラグ
     * <br />ロックできた場合"Y"
     */
    private String lockFlagForOdr;
    
    /**
     *  Shipping Document LOCK FLAG. <br />
     * If "Y", which can be locked.<br />
     * 船積書類ロックフラグ
     * <br />ロックできた場合"Y"
     */
    private String lockFlagForDoc;
    
    /**
     * The registerd flag of Shipping Actuality invoice works table data.<br />
     * The table is not registered, when the flag is 'N'. 
     * 船積実績対象インボイスワークテーブルデータ登録フラグ
     * <br />'N'の場合登録しません。
     */
    private String createTwShippingActInvoiceFlag;
    
    /**
     * Need other doc.
     */
    private String needOtherDocFlg;
    
    /**
     * CLP Group
     */
    private String clpGroup;
    
    /**
     * Shipping Firm No
     */
    private String shippingFirmNo;

    /**
     * CIGMA EDI status.
     * 
     * 20170314 ADD
     * 
     * It is used to inherit information of CIGMA searched by check.
     * チェックで検索したCIGMAの情報の引き継ぎに使用する。
     */
    private String cigmaEdiStatus;
    
    /**
     * List of domain W7001List<br />
     * W7001Listドメインのリスト
     */
    private List<? extends W7001ListDomain> listDomainList;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActCriteriaDomain() {
        super();
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
     * Getter method for brch.
     *
     * @return the brch
     */
    public BigDecimal getBrch() {
        return brch;
    }

    /**
     * Setter method for brch.
     *
     * @param brch Set for brch
     */
    public void setBrch(BigDecimal brch) {
        this.brch = brch;
    }

    /**
     * Getter method for cancelFlg.
     *
     * @return the cancelFlg
     */
    public String getCancelFlg() {
        return cancelFlg;
    }

    /**
     * Setter method for cancelFlg.
     *
     * @param cancelFlg Set for cancelFlg
     */
    public void setCancelFlg(String cancelFlg) {
        this.cancelFlg = cancelFlg;
    }

    /**
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
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
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for containerNo.
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo.
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for docTyp.
     *
     * @return the docTyp
     */
    public String getDocTyp() {
        return docTyp;
    }

    /**
     * Setter method for docTyp.
     *
     * @param docTyp Set for docTyp
     */
    public void setDocTyp(String docTyp) {
        this.docTyp = docTyp;
    }

    /**
     * Getter method for fileId.
     *
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Setter method for fileId.
     *
     * @param fileId Set for fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Getter method for billdFileIdList.
     *
     * @return the billdFileIdList
     */
    public List<String> getBilldFileIdList() {
        return billdFileIdList;
    }

    /**
     * Setter method for billdFileIdList.
     *
     * @param billdFileIdList Set for billdFileIdList
     */
    public void setBilldFileIdList(List<String> billdFileIdList) {
        this.billdFileIdList = billdFileIdList;
    }

    /**
     * Getter method for clpFileIdList.
     *
     * @return the clpFileIdList
     */
    public List<String> getClpFileIdList() {
        return clpFileIdList;
    }

    /**
     * Setter method for clpFileIdList.
     *
     * @param clpFileIdList Set for clpFileIdList
     */
    public void setClpFileIdList(List<String> clpFileIdList) {
        this.clpFileIdList = clpFileIdList;
    }

    /**
     * Getter method for atd.
     *
     * @return the atd
     */
    public Date getAtd() {
        return atd;
    }

    /**
     * Setter method for atd.
     *
     * @param atd Set for atd
     */
    public void setAtd(Date atd) {
        this.atd = atd;
    }

    /**
     * Getter method for fmAtd.
     *
     * @return the fmAtd
     */
    public Date getFmAtd() {
        return fmAtd;
    }

    /**
     * Setter method for fmAtd.
     *
     * @param fmAtd Set for fmAtd
     */
    public void setFmAtd(Date fmAtd) {
        this.fmAtd = fmAtd;
    }

    /**
     * Getter method for toAtd.
     *
     * @return the toAtd
     */
    public Date getToAtd() {
        return toAtd;
    }

    /**
     * Setter method for toAtd.
     *
     * @param toAtd Set for toAtd
     */
    public void setToAtd(Date toAtd) {
        this.toAtd = toAtd;
    }

    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public Date getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(Date etd) {
        this.etd = etd;
    }

    /**
     * Getter method for fmEtd.
     *
     * @return the fmEtd
     */
    public Date getFmEtd() {
        return fmEtd;
    }

    /**
     * Setter method for fmEtd.
     *
     * @param fmEtd Set for fmEtd
     */
    public void setFmEtd(Date fmEtd) {
        this.fmEtd = fmEtd;
    }

    /**
     * Getter method for toEtd.
     *
     * @return the toEtd
     */
    public Date getToEtd() {
        return toEtd;
    }

    /**
     * Setter method for toEtd.
     *
     * @param toEtd Set for toEtd
     */
    public void setToEtd(Date toEtd) {
        this.toEtd = toEtd;
    }

    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public Date getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(Date eta) {
        this.eta = eta;
    }

    /**
     * Getter method for registerDt.
     *
     * @return the registerDt
     */
    public Date getRegisterDt() {
        return registerDt;
    }

    /**
     * Setter method for registerDt.
     *
     * @param registerDt Set for registerDt
     */
    public void setRegisterDt(Date registerDt) {
        this.registerDt = registerDt;
    }

    /**
     * Getter method for fmRegisterDt.
     *
     * @return the fmRegisterDt
     */
    public Date getFmRegisterDt() {
        return fmRegisterDt;
    }

    /**
     * Setter method for fmRegisterDt.
     *
     * @param fmRegisterDt Set for fmRegisterDt
     */
    public void setFmRegisterDt(Date fmRegisterDt) {
        this.fmRegisterDt = fmRegisterDt;
    }

    /**
     * Getter method for toRegisterDt.
     *
     * @return the toRegisterDt
     */
    public Date getToRegisterDt() {
        return toRegisterDt;
    }

    /**
     * Setter method for toRegisterDt.
     *
     * @param toRegisterDt Set for toRegisterDt
     */
    public void setToRegisterDt(Date toRegisterDt) {
        this.toRegisterDt = toRegisterDt;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
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
     * Getter method for vessel.
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * Setter method for vessel.
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    /**
     * Getter method for blUpdate.
     *
     * @return the blUpdate
     */
    public String getBlUpdate() {
        return blUpdate;
    }

    /**
     * Setter method for blUpdate.
     *
     * @param blUpdate Set for blUpdate
     */
    public void setBlUpdate(String blUpdate) {
        this.blUpdate = blUpdate;
    }

    /**
     * Getter method for shippingActStatus.
     *
     * @return the shippingActStatus
     */
    public String getShippingActStatus() {
        return shippingActStatus;
    }

    /**
     * Setter method for shippingActStatus.
     *
     * @param shippingActStatus Set for shippingActStatus
     */
    public void setShippingActStatus(String shippingActStatus) {
        this.shippingActStatus = shippingActStatus;
    }

    /**
     * Getter method for autoInvoiceRegisterFlg.
     *
     * @return the autoInvoiceRegisterFlg
     */
    public String getAutoInvoiceRegisterFlg() {
        return autoInvoiceRegisterFlg;
    }

    /**
     * Setter method for autoInvoiceRegisterFlg.
     *
     * @param autoInvoiceRegisterFlg Set for autoInvoiceRegisterFlg
     */
    public void setAutoInvoiceRegisterFlg(String autoInvoiceRegisterFlg) {
        this.autoInvoiceRegisterFlg = autoInvoiceRegisterFlg;
    }

    /**
     * Getter method for noOfInvoice.
     *
     * @return the noOfInvoice
     */
    public String getNoOfInvoice() {
        return noOfInvoice;
    }

    /**
     * Setter method for noOfInvoice.
     *
     * @param noOfInvoice Set for noOfInvoice
     */
    public void setNoOfInvoice(String noOfInvoice) {
        this.noOfInvoice = noOfInvoice;
    }

    /**
     * Getter method for noOfContainer.
     *
     * @return the noOfContainer
     */
    public String getNoOfContainer() {
        return noOfContainer;
    }

    /**
     * Setter method for noOfContainer.
     *
     * @param noOfContainer Set for noOfContainer
     */
    public void setNoOfContainer(String noOfContainer) {
        this.noOfContainer = noOfContainer;
    }

    /**
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public String getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(String pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * Getter method for fileData.
     *
     * @return the fileData
     */
    public InputStream getFileData() {
        return fileData;
    }

    /**
     * Setter method for fileData.
     *
     * @param fileData Set for fileData
     */
    public void setFileData(InputStream fileData) {
        this.fileData = fileData;
    }

    /**
     * Getter method for fileName.
     *
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter method for fileName.
     *
     * @param fileName Set for fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Getter method for deleteFlag.
     *
     * @return the deleteFlag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Setter method for deleteFlag.
     *
     * @param deleteFlag Set for deleteFlag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for shippingActInvoiceList.
     *
     * @return the shippingActInvoiceList
     */
    public List<? extends W7001ShippingActInvoiceDomain> getShippingActInvoiceList() {
        return shippingActInvoiceList;
    }

    /**
     * Setter method for shippingActInvoiceList.
     *
     * @param shippingActInvoiceList Set for shippingActInvoiceList
     */
    public void setShippingActInvoiceList(
        List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList) {
        this.shippingActInvoiceList = shippingActInvoiceList;
    }

    /**
     * Getter method for shippingActDocList.
     *
     * @return the shippingActDocList
     */
    public List<? extends W7001ShippingActDocDomain> getShippingActDocList() {
        return shippingActDocList;
    }

    /**
     * Setter method for shippingActDocList.
     *
     * @param shippingActDocList Set for shippingActDocList
     */
    public void setShippingActDocList(
        List<? extends W7001ShippingActDocDomain> shippingActDocList) {
        this.shippingActDocList = shippingActDocList;
    }

    /**
     * Getter method for pageInfoCreator.
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * Setter method for pageInfoCreator.
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * Getter method for lockFlagForOdr.
     *
     * @return the lockFlagForOdr
     */
    public String getLockFlagForOdr() {
        return lockFlagForOdr;
    }

    /**
     * Setter method for lockFlagForOdr.
     *
     * @param lockFlagForOdr Set for lockFlagForOdr
     */
    public void setLockFlagForOdr(String lockFlagForOdr) {
        this.lockFlagForOdr = lockFlagForOdr;
    }

    /**
     * Getter method for lockFlagForDoc.
     *
     * @return the lockFlagForDoc
     */
    public String getLockFlagForDoc() {
        return lockFlagForDoc;
    }

    /**
     * Setter method for lockFlagForDoc.
     *
     * @param lockFlagForDoc Set for lockFlagForDoc
     */
    public void setLockFlagForDoc(String lockFlagForDoc) {
        this.lockFlagForDoc = lockFlagForDoc;
    }

    /**
     * Getter method for createTwShippingActInvoiceFlag.
     *
     * @return the createTwShippingActInvoiceFlag
     */
    public String getCreateTwShippingActInvoiceFlag() {
        return createTwShippingActInvoiceFlag;
    }

    /**
     * Setter method for createTwShippingActInvoiceFlag.
     *
     * @param createTwShippingActInvoiceFlag Set for createTwShippingActInvoiceFlag
     */
    public void setCreateTwShippingActInvoiceFlag(
        String createTwShippingActInvoiceFlag) {
        this.createTwShippingActInvoiceFlag = createTwShippingActInvoiceFlag;
    }

    /**
     * <p>needOtherDocFlg のゲッターメソッドです。</p>
     *
     * @return the needOtherDocFlg
     */
    public String getNeedOtherDocFlg() {
        return needOtherDocFlg;
    }

    /**
     * <p>needOtherDocFlg のセッターメソッドです。</p>
     *
     * @param needOtherDocFlg needOtherDocFlg に設定する
     */
    public void setNeedOtherDocFlg(String needOtherDocFlg) {
        this.needOtherDocFlg = needOtherDocFlg;
    }

    /**
     * <p>clpGroup のゲッターメソッドです。</p>
     *
     * @return the clpGroup
     */
    public String getClpGroup() {
        return clpGroup;
    }

    /**
     * <p>clpGroup のセッターメソッドです。</p>
     *
     * @param clpGroup clpGroup に設定する
     */
    public void setClpGroup(String clpGroup) {
        this.clpGroup = clpGroup;
    }

    /**
     * <p>shippingFirmNo のゲッターメソッドです。</p>
     *
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * <p>shippingFirmNo のセッターメソッドです。</p>
     *
     * @param shippingFirmNo shippingFirmNo に設定する
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
    }

    /**
     * Getter method for cigmaEdiStatus.
     *
     * @return the cigmaEdiStatus
     */
    public String getCigmaEdiStatus() {
        return cigmaEdiStatus;
    }

    /**
     * Setter method for cigmaEdiStatus.
     *
     * @param cigmaEdiStatus Set for cigmaEdiStatus
     */
    public void setCigmaEdiStatus(String cigmaEdiStatus) {
        this.cigmaEdiStatus = cigmaEdiStatus;
    }

    /**
     * <p>listDomainList のゲッターメソッドです。</p>
     *
     * @return the listDomainList
     */
    public List<? extends W7001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>listDomainList のセッターメソッドです。</p>
     *
     * @param listDomainList listDomainList に設定する
     */
    public void setListDomainList(List<? extends W7001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

}
