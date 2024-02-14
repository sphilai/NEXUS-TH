/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;

import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Invoice Templetate MA Edit screen. <br />
 * Invoice Templetate MA Edit画面のドメインです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Company
     */
    private String company;

    /**
     * Document No.
     */
    private String docNo;
    
    /**
     * DSC-ID
     */
    private String dscId;

    /**
     * Invoice Category
     */
    private String invoiceCtgry;

    /**
     * Class of Invoice
     */
    private String invoiceClass;

    /**
     * Cannot Upload Files Other than ".bmp"、".png"、".gif"、".jpeg"、".jpg"
     */
    private String noteStatement;

    /**
     * Update File Data Stream(for Master1).
     */
    private InputStream master1FileStream;
    
    /**
     * Update File Name(for Master1).
     */
    private String master1;
    
    /**
     * Update File Size(for Master1).
     */
    private int master1FileSize;
    
    /**
     * Master1 attached FILE NAME<br />
     * Master1添付ファイル名
     */
    private String fileName1;

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
     * Update File Data Stream(for Master5).
     */
    private InputStream master5FileStream;
    
    /**
     * Update File Name(for Master5).
     */
    private String master5;
    
    /**
     * Update File Size(for Master5).
     */
    private int master5FileSize;
    
    /**
     * Master5 attached FILE NAME<br />
     * Master5添付ファイル名
     */
    private String fileName5;

    /**
     * Delete
     */
    private String m5Delete;

    /**
     * Update File Data Stream(for Master6).
     */
    private InputStream master6FileStream;
    
    /**
     * Update File Name(for Master6).
     */
    private String master6;
    
    /**
     * Update File Size(for Master6).
     */
    private int master6FileSize;
    
    /**
     * Master6 attached FILE NAME<br />
     * Master6添付ファイル名
     */
    private String fileName6;

    /**
     * Master7
     */
    private String master7;

    /**
     * Master8
     */
    private String master8;

    /**
     * Update File Data Stream(for Master9).
     */
    private InputStream master9FileStream;
    
    /**
     * Update File Name(for Master9).
     */
    private String master9;
    
    /**
     * Update File Size(for Master9).
     */
    private int master9FileSize;
    
    /**
     * Master9 attached FILE NAME<br />
     * Master9添付ファイル名
     */
    private String fileName9;

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
     * Update File Data Stream(for Master12).
     */
    private InputStream master12FileStream;
    
    /**
     * Update File Name(for Master12).
     */
    private String master12;
    
    /**
     * Update File Size(for Master12).
     */
    private int master12FileSize;
    
    /**
     * Master12 attached FILE NAME<br />
     * Master12添付ファイル名
     */
    private String fileName12;

    /**
     * Delete
     */
    private String m12Delete;

    /**
     * Update File Data Stream(for Master13).
     */
    private InputStream master13FileStream;
    
    /**
     * Update File Name(for Master13).
     */
    private String master13;
    
    /**
     * Update File Size(for Master13).
     */
    private int master13FileSize;
    
    /**
     * Master13 attached FILE NAME<br />
     * Master13添付ファイル名
     */
    private String fileName13;

    /**
     * Delete
     */
    private String m13Delete;

    /**
     * Processing mode<br />
     * 処理モード
     */
    private String procMode;

    /**
     * Update count
     */
    private int updateCount;
    
    /**
     * Create count
     */
    private int createCount;
    
    /**
     * 船積書類テンプレート原単位 取得データ
     */
    private TmInvTplDomain tmInvTplDomain;
    
    /**
     * Default constructor. <br />
     * デフォルトコンストラクタです。
     */
    public W9023CriteriaDomain() {
    }

    /**
     * Getter method for company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param company Set for company
     */
    public void setCompany(String company) {
        this.company = company;
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
     * Getter method for noteStatement.
     *
     * @return the noteStatement
     */
    public String getNoteStatement() {
        return noteStatement;
    }

    /**
     * Setter method for noteStatement.
     *
     * @param noteStatement Set for noteStatement
     */
    public void setNoteStatement(String noteStatement) {
        this.noteStatement = noteStatement;
    }

    /**
     * Getter method for master1FileStream.
     *
     * @return the master1FileStream
     */
    public InputStream getMaster1FileStream() {
        return master1FileStream;
    }

    /**
     * Setter method for master1FileStream.
     *
     * @param master1FileStream Set for master1FileStream
     */
    public void setMaster1FileStream(InputStream master1FileStream) {
        this.master1FileStream = master1FileStream;
    }

    /**
     * Getter method for master1.
     *
     * @return the master1
     */
    public String getMaster1() {
        return master1;
    }

    /**
     * Setter method for master1.
     *
     * @param master1 Set for master1
     */
    public void setMaster1(String master1) {
        this.master1 = master1;
    }

    /**
     * Getter method for master1FileSize.
     *
     * @return the master1FileSize
     */
    public int getMaster1FileSize() {
        return master1FileSize;
    }

    /**
     * Setter method for master1FileSize.
     *
     * @param master1FileSize Set for master1FileSize
     */
    public void setMaster1FileSize(int master1FileSize) {
        this.master1FileSize = master1FileSize;
    }

    /**
     * Getter method for fileName1.
     *
     * @return the fileName1
     */
    public String getFileName1() {
        return fileName1;
    }

    /**
     * Setter method for fileName1.
     *
     * @param fileName1 Set for fileName1
     */
    public void setFileName1(String fileName1) {
        this.fileName1 = fileName1;
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
     * Getter method for master5FileStream.
     *
     * @return the master5FileStream
     */
    public InputStream getMaster5FileStream() {
        return master5FileStream;
    }

    /**
     * Setter method for master5FileStream.
     *
     * @param master5FileStream Set for master5FileStream
     */
    public void setMaster5FileStream(InputStream master5FileStream) {
        this.master5FileStream = master5FileStream;
    }

    /**
     * Getter method for master5.
     *
     * @return the master5
     */
    public String getMaster5() {
        return master5;
    }

    /**
     * Setter method for master5.
     *
     * @param master5 Set for master5
     */
    public void setMaster5(String master5) {
        this.master5 = master5;
    }

    /**
     * Getter method for master5FileSize.
     *
     * @return the master5FileSize
     */
    public int getMaster5FileSize() {
        return master5FileSize;
    }

    /**
     * Setter method for master5FileSize.
     *
     * @param master5FileSize Set for master5FileSize
     */
    public void setMaster5FileSize(int master5FileSize) {
        this.master5FileSize = master5FileSize;
    }

    /**
     * Getter method for fileName5.
     *
     * @return the fileName5
     */
    public String getFileName5() {
        return fileName5;
    }

    /**
     * Setter method for fileName5.
     *
     * @param fileName5 Set for fileName5
     */
    public void setFileName5(String fileName5) {
        this.fileName5 = fileName5;
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
     * Getter method for master6FileStream.
     *
     * @return the master6FileStream
     */
    public InputStream getMaster6FileStream() {
        return master6FileStream;
    }

    /**
     * Setter method for master6FileStream.
     *
     * @param master6FileStream Set for master6FileStream
     */
    public void setMaster6FileStream(InputStream master6FileStream) {
        this.master6FileStream = master6FileStream;
    }

    /**
     * Getter method for master6.
     *
     * @return the master6
     */
    public String getMaster6() {
        return master6;
    }

    /**
     * Setter method for master6.
     *
     * @param master6 Set for master6
     */
    public void setMaster6(String master6) {
        this.master6 = master6;
    }

    /**
     * Getter method for master6FileSize.
     *
     * @return the master6FileSize
     */
    public int getMaster6FileSize() {
        return master6FileSize;
    }

    /**
     * Setter method for master6FileSize.
     *
     * @param master6FileSize Set for master6FileSize
     */
    public void setMaster6FileSize(int master6FileSize) {
        this.master6FileSize = master6FileSize;
    }

    /**
     * Getter method for fileName6.
     *
     * @return the fileName6
     */
    public String getFileName6() {
        return fileName6;
    }

    /**
     * Setter method for fileName6.
     *
     * @param fileName6 Set for fileName6
     */
    public void setFileName6(String fileName6) {
        this.fileName6 = fileName6;
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
     * Getter method for master9FileStream.
     *
     * @return the master9FileStream
     */
    public InputStream getMaster9FileStream() {
        return master9FileStream;
    }

    /**
     * Setter method for master9FileStream.
     *
     * @param master9FileStream Set for master9FileStream
     */
    public void setMaster9FileStream(InputStream master9FileStream) {
        this.master9FileStream = master9FileStream;
    }

    /**
     * Getter method for master9.
     *
     * @return the master9
     */
    public String getMaster9() {
        return master9;
    }

    /**
     * Setter method for master9.
     *
     * @param master9 Set for master9
     */
    public void setMaster9(String master9) {
        this.master9 = master9;
    }

    /**
     * Getter method for master9FileSize.
     *
     * @return the master9FileSize
     */
    public int getMaster9FileSize() {
        return master9FileSize;
    }

    /**
     * Setter method for master9FileSize.
     *
     * @param master9FileSize Set for master9FileSize
     */
    public void setMaster9FileSize(int master9FileSize) {
        this.master9FileSize = master9FileSize;
    }

    /**
     * Getter method for fileName9.
     *
     * @return the fileName9
     */
    public String getFileName9() {
        return fileName9;
    }

    /**
     * Setter method for fileName9.
     *
     * @param fileName9 Set for fileName9
     */
    public void setFileName9(String fileName9) {
        this.fileName9 = fileName9;
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
     * Getter method for master12FileStream.
     *
     * @return the master12FileStream
     */
    public InputStream getMaster12FileStream() {
        return master12FileStream;
    }

    /**
     * Setter method for master12FileStream.
     *
     * @param master12FileStream Set for master12FileStream
     */
    public void setMaster12FileStream(InputStream master12FileStream) {
        this.master12FileStream = master12FileStream;
    }

    /**
     * Getter method for master12.
     *
     * @return the master12
     */
    public String getMaster12() {
        return master12;
    }

    /**
     * Setter method for master12.
     *
     * @param master12 Set for master12
     */
    public void setMaster12(String master12) {
        this.master12 = master12;
    }

    /**
     * Getter method for master12FileSize.
     *
     * @return the master12FileSize
     */
    public int getMaster12FileSize() {
        return master12FileSize;
    }

    /**
     * Setter method for master12FileSize.
     *
     * @param master12FileSize Set for master12FileSize
     */
    public void setMaster12FileSize(int master12FileSize) {
        this.master12FileSize = master12FileSize;
    }

    /**
     * Getter method for fileName12.
     *
     * @return the fileName12
     */
    public String getFileName12() {
        return fileName12;
    }

    /**
     * Setter method for fileName12.
     *
     * @param fileName12 Set for fileName12
     */
    public void setFileName12(String fileName12) {
        this.fileName12 = fileName12;
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
     * Getter method for master13FileStream.
     *
     * @return the master13FileStream
     */
    public InputStream getMaster13FileStream() {
        return master13FileStream;
    }

    /**
     * Setter method for master13FileStream.
     *
     * @param master13FileStream Set for master13FileStream
     */
    public void setMaster13FileStream(InputStream master13FileStream) {
        this.master13FileStream = master13FileStream;
    }

    /**
     * Getter method for master13.
     *
     * @return the master13
     */
    public String getMaster13() {
        return master13;
    }

    /**
     * Setter method for master13.
     *
     * @param master13 Set for master13
     */
    public void setMaster13(String master13) {
        this.master13 = master13;
    }

    /**
     * Getter method for master13FileSize.
     *
     * @return the master13FileSize
     */
    public int getMaster13FileSize() {
        return master13FileSize;
    }

    /**
     * Setter method for master13FileSize.
     *
     * @param master13FileSize Set for master13FileSize
     */
    public void setMaster13FileSize(int master13FileSize) {
        this.master13FileSize = master13FileSize;
    }

    /**
     * Getter method for fileName13.
     *
     * @return the fileName13
     */
    public String getFileName13() {
        return fileName13;
    }

    /**
     * Setter method for fileName13.
     *
     * @param fileName13 Set for fileName13
     */
    public void setFileName13(String fileName13) {
        this.fileName13 = fileName13;
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
     * Getter method for updateCount.
     *
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * Setter method for updateCount.
     *
     * @param updateCount Set for updateCount
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * Getter method for createCount.
     *
     * @return the createCount
     */
    public int getCreateCount() {
        return createCount;
    }

    /**
     * Setter method for createCount.
     *
     * @param createCount Set for createCount
     */
    public void setCreateCount(int createCount) {
        this.createCount = createCount;
    }

    /**
     * Getter method for tmInvTplDomain.
     *
     * @return the tmInvTplDomain
     */
    public TmInvTplDomain getTmInvTplDomain() {
        return tmInvTplDomain;
    }

    /**
     * Setter method for tmInvTplDomain.
     *
     * @param tmInvTplDomain Set for tmInvTplDomain
     */
    public void setTmInvTplDomain(TmInvTplDomain tmInvTplDomain) {
        this.tmInvTplDomain = tmInvTplDomain;
    }
}
