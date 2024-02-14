/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.InputStream;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;


/**
 * The domain of search criteria Invoice Template MA screen.
 * Invoice Template MA画面の検索条件ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9022InvTplMaCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * COMPANY CODE/ COMPANY CODE<br />
     * COMPANY CODE/会社コード
     */
    private String compCd;
    
    /**
     * DSC ID
     */
    private String dscId;

    /**
     * DOC NO/ DOC NO<br />
     * DOC NO/ドキュメント番号
     */
    private String docNo;

    /**
     * INVOICE CATEGORY/ INVOICE CATEGORY<br />
     * INVOICE CATEGORY/請求分類
     */
    private String invoiceCtgry;

    /**
     * INVOICE CLASS/ INVOICE CLASS<br />
     * INVOICE CLASS/インボイス種類
     */
    private String invoiceClass;
    
    /**
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * MODE
     */
    private String procMode;
    
    /**
     * Master1<br />
     * FILE DATA<br />
     */
    private InputStream m1FileData;

    /**
     * Master1 attached FILE NAME.<br />
     * Master1添付ファイル名
     */
    private String m1FileName;

    /**
     * Master2
     */
    private String master2;

    /**
     * Master3
     */
    private String master3;

    /**
     * Master4
     */
    private String master4;

    /**
     * Master5<br />
     * FILE DATA<br />
     */
    private InputStream m5FileData;
    
    /**
     * Master5 attached FILE NAME.<br />
     * Master5添付ファイル名
     */
    private String m5FileName;

    /**
     * Delete
     */
    private String m5Delete;

    /**
     * Master6<br />
     * FILE DATA<br />
     */
    private InputStream m6FileData;
    
    /**
     * Master6 attached FILE NAME.<br />
     * Master6添付ファイル名
     */
    private String m6FileName;

    /**
     * Master7
     */
    private String master7;

    /**
     * Master8
     */
    private String master8;

    /**
     * Master9<br />
     * FILE DATA<br />
     */
    private InputStream m9FileData;
    
    /**
     * Master9 attached FILE NAME.<br />
     * Master9添付ファイル名
     */
    private String m9FileName;

    /**
     * Delete
     */
    private String m9Delete;

    /**
     * Master10
     */
    private String master10;

    /**
     * Master11
     */
    private String master11;

    /**
     * Master12<br />
     * FILE DATA<br />
     */
    private InputStream m12FileData;
    
    /**
     * Master12 attached FILE NAME.<br />
     * Master12添付ファイル名
     */
    private String m12FileName;

    /**
     * Delete
     */
    private String m12Delete;

    /**
     * Master13<br />
     * FILE DATA<br />
     */
    private InputStream m13FileData;
    
    /**
     * Master13 attached FILE NAME.<br />
     * Master13添付ファイル名
     */
    private String m13FileName;

    /**
     * Delete
     */
    private String m13Delete;
    
    /**
     * User function use authority.<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * SERVER ID.<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022InvTplMaCriteriaDomain() {
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * Getter method for invoiceClass.
     *
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Setter method for invoiceClass.
     *
     * @param invoiceClass Set for invoiceClass
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
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
     * Getter method for m1FileData.
     *
     * @return the m1FileData
     */
    public InputStream getM1FileData() {
        return m1FileData;
    }

    /**
     * Setter method for m1FileData.
     *
     * @param fileData Set for m1FileData
     */
    public void setM1FileData(InputStream fileData) {
        m1FileData = fileData;
    }

    /**
     * Getter method for m1FileName.
     *
     * @return the m1FileName
     */
    public String getM1FileName() {
        return m1FileName;
    }

    /**
     * Setter method for m1FileName.
     *
     * @param fileName Set for m1FileName
     */
    public void setM1FileName(String fileName) {
        m1FileName = fileName;
    }

    /**
     * Getter method for master2.
     *
     * @return the master2
     */
    public String getMaster2() {
        return master2;
    }

    /**
     * Setter method for master2.
     *
     * @param master2 Set for master2
     */
    public void setMaster2(String master2) {
        this.master2 = master2;
    }

    /**
     * Getter method for master3.
     *
     * @return the master3
     */
    public String getMaster3() {
        return master3;
    }

    /**
     * Setter method for master3.
     *
     * @param master3 Set for master3
     */
    public void setMaster3(String master3) {
        this.master3 = master3;
    }

    /**
     * Getter method for master4.
     *
     * @return the master4
     */
    public String getMaster4() {
        return master4;
    }

    /**
     * Setter method for master4.
     *
     * @param master4 Set for master4
     */
    public void setMaster4(String master4) {
        this.master4 = master4;
    }

    /**
     * Getter method for m5FileData.
     *
     * @return the m5FileData
     */
    public InputStream getM5FileData() {
        return m5FileData;
    }

    /**
     * Setter method for m5FileData.
     *
     * @param fileData Set for m5FileData
     */
    public void setM5FileData(InputStream fileData) {
        m5FileData = fileData;
    }

    /**
     * Getter method for m5FileName.
     *
     * @return the m5FileName
     */
    public String getM5FileName() {
        return m5FileName;
    }

    /**
     * Setter method for m5FileName.
     *
     * @param fileName Set for m5FileName
     */
    public void setM5FileName(String fileName) {
        m5FileName = fileName;
    }

    /**
     * Getter method for m5Delete.
     *
     * @return the m5Delete
     */
    public String getM5Delete() {
        return m5Delete;
    }

    /**
     * Setter method for m5Delete.
     *
     * @param delete Set for m5Delete
     */
    public void setM5Delete(String delete) {
        m5Delete = delete;
    }

    /**
     * Getter method for m6FileData.
     *
     * @return the m6FileData
     */
    public InputStream getM6FileData() {
        return m6FileData;
    }

    /**
     * Setter method for m6FileData.
     *
     * @param fileData Set for m6FileData
     */
    public void setM6FileData(InputStream fileData) {
        m6FileData = fileData;
    }

    /**
     * Getter method for m6FileName.
     *
     * @return the m6FileName
     */
    public String getM6FileName() {
        return m6FileName;
    }

    /**
     * Setter method for m6FileName.
     *
     * @param fileName Set for m6FileName
     */
    public void setM6FileName(String fileName) {
        m6FileName = fileName;
    }

    /**
     * Getter method for master7.
     *
     * @return the master7
     */
    public String getMaster7() {
        return master7;
    }

    /**
     * Setter method for master7.
     *
     * @param master7 Set for master7
     */
    public void setMaster7(String master7) {
        this.master7 = master7;
    }

    /**
     * Getter method for master8.
     *
     * @return the master8
     */
    public String getMaster8() {
        return master8;
    }

    /**
     * Setter method for master8.
     *
     * @param master8 Set for master8
     */
    public void setMaster8(String master8) {
        this.master8 = master8;
    }

    /**
     * Getter method for m9FileData.
     *
     * @return the m9FileData
     */
    public InputStream getM9FileData() {
        return m9FileData;
    }

    /**
     * Setter method for m9FileData.
     *
     * @param fileData Set for m9FileData
     */
    public void setM9FileData(InputStream fileData) {
        m9FileData = fileData;
    }

    /**
     * Getter method for m9FileName.
     *
     * @return the m9FileName
     */
    public String getM9FileName() {
        return m9FileName;
    }

    /**
     * Setter method for m9FileName.
     *
     * @param fileName Set for m9FileName
     */
    public void setM9FileName(String fileName) {
        m9FileName = fileName;
    }

    /**
     * Getter method for m9Delete.
     *
     * @return the m9Delete
     */
    public String getM9Delete() {
        return m9Delete;
    }

    /**
     * Setter method for m9Delete.
     *
     * @param delete Set for m9Delete
     */
    public void setM9Delete(String delete) {
        m9Delete = delete;
    }

    /**
     * Getter method for master10.
     *
     * @return the master10
     */
    public String getMaster10() {
        return master10;
    }

    /**
     * Setter method for master10.
     *
     * @param master10 Set for master10
     */
    public void setMaster10(String master10) {
        this.master10 = master10;
    }

    /**
     * Getter method for master11.
     *
     * @return the master11
     */
    public String getMaster11() {
        return master11;
    }

    /**
     * Setter method for master11.
     *
     * @param master11 Set for master11
     */
    public void setMaster11(String master11) {
        this.master11 = master11;
    }

    /**
     * Getter method for m12FileData.
     *
     * @return the m12FileData
     */
    public InputStream getM12FileData() {
        return m12FileData;
    }

    /**
     * Setter method for m12FileData.
     *
     * @param fileData Set for m12FileData
     */
    public void setM12FileData(InputStream fileData) {
        m12FileData = fileData;
    }

    /**
     * Getter method for m12FileName.
     *
     * @return the m12FileName
     */
    public String getM12FileName() {
        return m12FileName;
    }

    /**
     * Setter method for m12FileName.
     *
     * @param fileName Set for m12FileName
     */
    public void setM12FileName(String fileName) {
        m12FileName = fileName;
    }

    /**
     * Getter method for m12Delete.
     *
     * @return the m12Delete
     */
    public String getM12Delete() {
        return m12Delete;
    }

    /**
     * Setter method for m12Delete.
     *
     * @param delete Set for m12Delete
     */
    public void setM12Delete(String delete) {
        m12Delete = delete;
    }

    /**
     * Getter method for m13FileData.
     *
     * @return the m13FileData
     */
    public InputStream getM13FileData() {
        return m13FileData;
    }

    /**
     * Setter method for m13FileData.
     *
     * @param fileData Set for m13FileData
     */
    public void setM13FileData(InputStream fileData) {
        m13FileData = fileData;
    }

    /**
     * Getter method for m13FileName.
     *
     * @return the m13FileName
     */
    public String getM13FileName() {
        return m13FileName;
    }

    /**
     * Setter method for m13FileName.
     *
     * @param fileName Set for m13FileName
     */
    public void setM13FileName(String fileName) {
        m13FileName = fileName;
    }

    /**
     * Getter method for m13Delete.
     *
     * @return the m13Delete
     */
    public String getM13Delete() {
        return m13Delete;
    }

    /**
     * Setter method for m13Delete.
     *
     * @param delete Set for m13Delete
     */
    public void setM13Delete(String delete) {
        m13Delete = delete;
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
}
