/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.io.File;

/**
 * It is a common information domain of using it by Transfer to GINV Job.
 * <br />船積書類GINV送信ジョブで使用するの共通情報ドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14033 $
 */
public class T0400TransferToGinvDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Request ID
     * <br />リクエストID
     */
    private String requestId;

    /**
     * Processing Directory
     * <br />作業ディレクトリ
     */
    private File processingDirectory;

    /**
     * Working directory by request
     * <br />リクエスト単位の作業ディレクトリ
     *
     * L005 ADD
     */
    private File requestDirectory;

    /**
     * FTM Send Directory
     * <br />FTM送信ディレクトリ
     */
    private File ftmSendDirectory;

    /**
     * Complete Directory
     * <br />完了ディレクトリ
     */
    private File completeDirectory;

    /**
     * FTM File ID(TACTICS ID)
     * <br />FTMファイルID(TACTICS ID)
     */
    private String ftmFileId;

    /**
     * Command Script Directory
     * <br />コマンドスクリプト配置ディレクトリ
     */
    private File commandDirectory;

    /**
     * Command Script File name(without extension)
     * <br />コマンドスクリプトファイル名（拡張子なし）
     */
    private String commandFileNameNoExt;

    /**
     * FTM send host code
     * <br />FTM送信ホストコード
     */
    private String ftmSendHostCode;

    /**
     * Process type
     * <br />処理区分
     */
    private String processTyp;

    /**
     * constructor.
     * <br />コンストラクタです。
     */
    public T0400TransferToGinvDomain() {
    }

    /**
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for requestId.
     *
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter method for requestId.
     *
     * @param requestId Set for requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter method for processingDirectory.
     *
     * @return the processingDirectory
     */
    public File getProcessingDirectory() {
        return processingDirectory;
    }

    /**
     * Setter method for processingDirectory.
     *
     * @param processingDirectory Set for processingDirectory
     */
    public void setProcessingDirectory(File processingDirectory) {
        this.processingDirectory = processingDirectory;
    }

    /**
     * Getter method for requestDirectory.
     *
     * @return the requestDirectory
     */
    public File getRequestDirectory() {
        return requestDirectory;
    }

    /**
     * Setter method for requestDirectory.
     *
     * @param requestDirectory Set for requestDirectory
     */
    public void setRequestDirectory(File requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    /**
     * Getter method for ftmSendDirectory.
     *
     * @return the ftmSendDirectory
     */
    public File getFtmSendDirectory() {
        return ftmSendDirectory;
    }

    /**
     * Setter method for ftmSendDirectory.
     *
     * @param ftmSendDirectory Set for ftmSendDirectory
     */
    public void setFtmSendDirectory(File ftmSendDirectory) {
        this.ftmSendDirectory = ftmSendDirectory;
    }

    /**
     * Getter method for completeDirectory.
     *
     * @return the completeDirectory
     */
    public File getCompleteDirectory() {
        return completeDirectory;
    }

    /**
     * Setter method for completeDirectory.
     *
     * @param completeDirectory Set for completeDirectory
     */
    public void setCompleteDirectory(File completeDirectory) {
        this.completeDirectory = completeDirectory;
    }

    /**
     * Getter method for ftmFileId.
     *
     * @return the ftmFileId
     */
    public String getFtmFileId() {
        return ftmFileId;
    }

    /**
     * Setter method for ftmFileId.
     *
     * @param ftmFileId Set for ftmFileId
     */
    public void setFtmFileId(String ftmFileId) {
        this.ftmFileId = ftmFileId;
    }

    /**
     * Getter method for commandDirectory.
     *
     * @return the commandDirectory
     */
    public File getCommandDirectory() {
        return commandDirectory;
    }

    /**
     * Setter method for commandDirectory.
     *
     * @param commandDirectory Set for commandDirectory
     */
    public void setCommandDirectory(File commandDirectory) {
        this.commandDirectory = commandDirectory;
    }

    /**
     * Getter method for commandFileNameNoExt.
     *
     * @return the commandFileNameNoExt
     */
    public String getCommandFileNameNoExt() {
        return commandFileNameNoExt;
    }

    /**
     * Setter method for commandFileNameNoExt.
     *
     * @param commandFileNameNoExt Set for commandFileNameNoExt
     */
    public void setCommandFileNameNoExt(String commandFileNameNoExt) {
        this.commandFileNameNoExt = commandFileNameNoExt;
    }

    /**
     * Getter method for ftmSendHostCode.
     *
     * @return the ftmSendHostCode
     */
    public String getFtmSendHostCode() {
        return ftmSendHostCode;
    }

    /**
     * Setter method for ftmSendHostCode.
     *
     * @param ftmSendHostCode Set for ftmSendHostCode
     */
    public void setFtmSendHostCode(String ftmSendHostCode) {
        this.ftmSendHostCode = ftmSendHostCode;
    }

    /**
     * Getter method for processTyp.
     *
     * @return the processTyp
     */
    public String getProcessTyp() {
        return processTyp;
    }

    /**
     * Setter method for processTyp.
     *
     * @param processTyp Set for processTyp
     */
    public void setProcessTyp(String processTyp) {
        this.processTyp = processTyp;
    }


}
