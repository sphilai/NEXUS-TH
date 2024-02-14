/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDomainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

import java.util.List;

/**
 * TtExpRequest のDomainクラスです。<BR>
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/27 14:08:11<BR>
 * 
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1010CriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;
    
    /**
     * CURRENCY CODE/?????
     */
    private String currCd;
   
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;
    
    /**
     * Server ID<br />
     * サーバID
     */
    private String serverId;
    /**
     * Row number.
     */
    private String rowNum;
    
    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * UPLOAD FILE DATA.
     */
    private InputStream uploadFileData;
    
    /**
     * UPLOAD FILE NAME.
     */
    private String uploadFileName;
    
    /**
     * UPLOAD FILE SIZE.
     */
    private int uploadFileSize;
    
    /**
     * Download data<br />
     * ダウンロードデータ
     */
    private OutputStream outStream;
    
    /**
     * File name<br />
     * ファイル名
     */
    private String fileName;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W1010CriteriaDomain() {
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
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }
    
    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }
    
    /**
     * procMode のゲッターメソッドです。
     * 
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * procMode のセッターメソッドです。
     * 
     * @param procMode procMode に設定する
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }
    
    /**
     * <p>Getter method for rowNum.</p>
     *
     * @return the rowNum
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * <p>Setter method for rowNum.</p>
     *
     * @param rowNum Set for rowNum
     */
    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }
    
    /**
     * Getter method for uploadFileData.
     *
     * @return the uploadFileData
     */
    public InputStream getUploadFileData() {
        return uploadFileData;
    }

    /**
     * Setter method for uploadFileData.
     *
     * @param uploadFileData Set for uploadFileData
     */
    public void setUploadFileData(InputStream uploadFileData) {
        this.uploadFileData = uploadFileData;
    }

    /**
     * Getter method for uploadFileName.
     *
     * @return the uploadFileName
     */
    public String getUploadFileName() {
        return uploadFileName;
    }

    /**
     * Setter method for uploadFileName.
     *
     * @param uploadFileName Set for uploadFileName
     */
    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    /**
     * Getter method for uploadFileSize.
     *
     * @return the uploadFileSize
     */
    public int getUploadFileSize() {
        return uploadFileSize;
    }

    /**
     * Setter method for uploadFileSize.
     *
     * @param uploadFileSize Set for uploadFileSize
     */
    public void setUploadFileSize(int uploadFileSize) {
        this.uploadFileSize = uploadFileSize;
    }

    /**
     * Getter method for outStream.
     *
     * @return the outStream
     */
    public OutputStream getOutStream() {
        return outStream;
    }

    /**
     * Setter method for outStream.
     *
     * @param outStream Set for outStream
     */
    public void setOutStream(OutputStream outStream) {
        this.outStream = outStream;
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

}
