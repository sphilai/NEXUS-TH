/*
 * PROJECT：eca0027
 * 
 * VtXpltzStgAct のDomainクラス
 * テーブル概要：VT_XPLTZ_STG_ACT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VtXpltzStgAct のDomainクラスです。<BR>
 * テーブル概要：VT_XPLTZ_STG_ACT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtXpltzStgActDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * XMAIN_MARK
     */
    private String xmainMark;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * CONTAINER_SORTING_KEY
     */
    private String containerSortingKey;

    /**
     * CUR_WH_COMP_CD
     */
    private String curWhCompCd;

    /**
     * CUR_WH_CD
     */
    private String curWhCd;

    /**
     * DNGR_ITEM_FLG
     */
    private String dngrItemFlg;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * CONTAINER_LOOSE_TYP
     */
    private String containerLooseTyp;

    /**
     * PLTZ_STATUS
     */
    private String pltzStatus;

    /**
     * デフォルトコンストラクタ。
     */
    public VtXpltzStgActDomain() {
    }

    /**
     * xmainMark のゲッターメソッドです。
     * 
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * xmainMark のセッターメソッドです。
     * 
     * @param xmainMark xmainMark に設定する
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * curWhCompCd のゲッターメソッドです。
     * 
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * curWhCompCd のセッターメソッドです。
     * 
     * @param curWhCompCd curWhCompCd に設定する
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * curWhCd のゲッターメソッドです。
     * 
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * curWhCd のセッターメソッドです。
     * 
     * @param curWhCd curWhCd に設定する
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * dngrItemFlg のゲッターメソッドです。
     * 
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * dngrItemFlg のセッターメソッドです。
     * 
     * @param dngrItemFlg dngrItemFlg に設定する
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * pltzStatus のゲッターメソッドです。
     * 
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * pltzStatus のセッターメソッドです。
     * 
     * @param pltzStatus pltzStatus に設定する
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

}
