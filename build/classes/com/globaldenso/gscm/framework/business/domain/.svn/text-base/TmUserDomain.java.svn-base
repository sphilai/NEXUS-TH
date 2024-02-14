/*
 * PROJECT：GSCM 共通機能群
 * 
 * TmUser のDomainクラス
 * テーブル概要：User Group Master/ユーザ集約原単位  Table to centrally manage user information employees, G company, of temporary staff./社員、G会社、派遣社員のユーザ情報を一元管理するテーブル。
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/03  DNITS  新規作成
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;

/**
 * TmUser のDomainクラスです。<BR>
 * テーブル概要：User Group Master/ユーザ集約原単位  Table to centrally manage user information employees, G company, of temporary staff./社員、G会社、派遣社員のユーザ情報を一元管理するテーブル。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.0<BR>
 * 生成日      ： 2014/03/03 17:23:18<BR>
 * 
 * テーブル定義から2014/03/03に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11113 $
 */
public class TmUserDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC-ID/DSC-ID  "10001"+従業員番号
     */
    private String dscId;

    /**
     * USER NAME/氏名(漢字)  名字 ＋ 「　」（全角スペース） ＋ 名前
     */
    private String usrNm;

    /**
     * USER NAME EN/氏名(英字)  名字 ＋ 「 」（半角スペース） ＋ 名前
     */
    private String usrNmEn;

    /**
     * GRP COMPANY CODE/グループ会社コード  固定値：10001
     */
    private String grpCompCd;

    /**
     * DEPARTMENT NAME/部名
     */
    private String deptName;

    /**
     * ROOM NAME/室名
     */
    private String roomName;

    /**
     * SECTION NAME/課名
     */
    private String sectionNm;

    /**
     * MAIL ADDRESS1/メールアドレス１
     */
    private String mailAdd1;

    /**
     * LAST UPDATE DATE/最終更新日  ワークフローマスタが更新された日
     */
    private Date lastUpdate;

    /**
     * TABLE ID/テーブルID  どのマテビューから情報を取り込んだか判別するため（項目への設定値は要相談）
     */
    private String tableId;

    /**
     * DELETE DATE/削除日  ユーザー原単位から削除された場合に設定し、保存期間を過ぎたらユーザー設定原単位からも削除する
     */
    private Date deleteDt;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUserDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * usrNm のゲッターメソッドです。
     * 
     * @return the usrNm
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * usrNm のセッターメソッドです。
     * 
     * @param usrNm usrNm に設定する
     */
    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    /**
     * usrNmEn のゲッターメソッドです。
     * 
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * usrNmEn のセッターメソッドです。
     * 
     * @param usrNmEn usrNmEn に設定する
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }

    /**
     * grpCompCd のゲッターメソッドです。
     * 
     * @return the grpCompCd
     */
    public String getGrpCompCd() {
        return grpCompCd;
    }

    /**
     * grpCompCd のセッターメソッドです。
     * 
     * @param grpCompCd grpCompCd に設定する
     */
    public void setGrpCompCd(String grpCompCd) {
        this.grpCompCd = grpCompCd;
    }

    /**
     * deptName のゲッターメソッドです。
     * 
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * deptName のセッターメソッドです。
     * 
     * @param deptName deptName に設定する
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * roomName のゲッターメソッドです。
     * 
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * roomName のセッターメソッドです。
     * 
     * @param roomName roomName に設定する
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * sectionNm のゲッターメソッドです。
     * 
     * @return the sectionNm
     */
    public String getSectionNm() {
        return sectionNm;
    }

    /**
     * sectionNm のセッターメソッドです。
     * 
     * @param sectionNm sectionNm に設定する
     */
    public void setSectionNm(String sectionNm) {
        this.sectionNm = sectionNm;
    }

    /**
     * mailAdd1 のゲッターメソッドです。
     * 
     * @return the mailAdd1
     */
    public String getMailAdd1() {
        return mailAdd1;
    }

    /**
     * mailAdd1 のセッターメソッドです。
     * 
     * @param mailAdd1 mailAdd1 に設定する
     */
    public void setMailAdd1(String mailAdd1) {
        this.mailAdd1 = mailAdd1;
    }

    /**
     * lastUpdate のゲッターメソッドです。
     * 
     * @return the lastUpdate
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * lastUpdate のセッターメソッドです。
     * 
     * @param lastUpdate lastUpdate に設定する
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * tableId のゲッターメソッドです。
     * 
     * @return the tableId
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * tableId のセッターメソッドです。
     * 
     * @param tableId tableId に設定する
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * deleteDt のゲッターメソッドです。
     * 
     * @return the deleteDt
     */
    public Date getDeleteDt() {
        return deleteDt;
    }

    /**
     * deleteDt のセッターメソッドです。
     * 
     * @param deleteDt deleteDt に設定する
     */
    public void setDeleteDt(Date deleteDt) {
        this.deleteDt = deleteDt;
    }

}
