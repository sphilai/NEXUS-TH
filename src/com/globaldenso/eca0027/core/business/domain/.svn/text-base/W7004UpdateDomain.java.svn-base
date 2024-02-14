/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of mass update for the Register Screen of Shipping Actuality.
 * <br />船積実績Register画面の一括更新ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain of product performance Vessel Register screen<br />
     * 船積実績Register画面の検索条件ドメイン
     */
    private W7004CriteriaDomain criteriaDomain;
    
    /**
     * List domains of Shipping Actuality Register screen<br />
     * 船積実績Register画面のListドメインのリスト
     */
    private List<? extends W7004ListDomain> listDomainList;
    
    // --- Facade Serviceで使用 --------------------------------------------------------------------
    /**
     * List of deleted invoice data 
     * <br />Contains the data that is retrieved from the invoice table when locked.
     * <br />削除対象インボイスデータのリスト
     * <br />ロック時にインボイステーブルから取得したデータを格納します。
     */
    private List<? extends W7004ListDomain> deleteList;
    
    /**
     * List of BILLD file ID<br />
     * BILLDファイルIDのリスト
     */
    private List<String> builldFileIdList;
    
    /**
     * List of file ID of the CLP<br />
     * CLPのファイルIDのリスト
     */
    private List<String> clpFileIdList;
    
    /**
     * ID file to be deleted<br />
     * 削除対象のファイルID
     */
    private List<String> fileIdList;
    
    /**
     * Last updated in the file management<br />
     * ファイル管理の最終更新日
     */
    private List<Timestamp> comUpdateTimeFileList;
    
    /**
     * update Count
     */
    private int updateCount;
    
    /**
     * CLP Group
     */
    private String clpGroup;
    
    /**
     * CONTAINER LOOSE TYPE.<br />
     * コンテナルーズ区分(C/L)
     */
    private String containerLooseTyp;
    
    // ---------------------------------------------------------------------------------------------
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004UpdateDomain() {
        super();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W7004CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W7004CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
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
     * Getter method for deleteList.
     *
     * @return the deleteList
     */
    public List<? extends W7004ListDomain> getDeleteList() {
        return deleteList;
    }

    /**
     * Setter method for deleteList.
     *
     * @param deleteList Set for deleteList
     */
    public void setDeleteList(List<? extends W7004ListDomain> deleteList) {
        this.deleteList = deleteList;
    }

    /**
     * Getter method for builldFileIdList.
     *
     * @return the builldFileIdList
     */
    public List<String> getBuilldFileIdList() {
        return builldFileIdList;
    }

    /**
     * Setter method for builldFileIdList.
     *
     * @param builldFileIdList Set for builldFileIdList
     */
    public void setBuilldFileIdList(List<String> builldFileIdList) {
        this.builldFileIdList = builldFileIdList;
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
     * Getter method for fileIdList.
     *
     * @return the fileIdList
     */
    public List<String> getFileIdList() {
        return fileIdList;
    }

    /**
     * Setter method for fileIdList.
     *
     * @param fileIdList Set for fileIdList
     */
    public void setFileIdList(List<String> fileIdList) {
        this.fileIdList = fileIdList;
    }

    /**
     * Getter method for comUpdateTimeFileList.
     *
     * @return the comUpdateTimeFileList
     */
    public List<Timestamp> getComUpdateTimeFileList() {
        return comUpdateTimeFileList;
    }

    /**
     * Setter method for comUpdateTimeFileList.
     *
     * @param comUpdateTimeFileList Set for comUpdateTimeFileList
     */
    public void setComUpdateTimeFileList(List<Timestamp> comUpdateTimeFileList) {
        this.comUpdateTimeFileList = comUpdateTimeFileList;
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
