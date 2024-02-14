/*
 * PROJECT：eca0027
 * 
 * VmServerInfo のDomainクラス
 * テーブル概要：VM_SERVER_INFO
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmServerInfo のDomainクラスです。<BR>
 * テーブル概要：VM_SERVER_INFO<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/20 19:19:06<BR>
 * 
 * テーブル定義から2014/02/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmServerInfoDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SERVER_ID
     */
    private String serverId;

    /**
     * LNG_CD
     */
    private String lngCd;

    /**
     * SERVER_NM
     */
    private String serverNm;

    /**
     * URL
     */
    private String url;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * デフォルトコンストラクタ。
     */
    public VmServerInfoDomain() {
    }

    /**
     * serverId のゲッターメソッドです。
     * 
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * serverId のセッターメソッドです。
     * 
     * @param serverId serverId に設定する
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * lngCd のゲッターメソッドです。
     * 
     * @return the lngCd
     */
    public String getLngCd() {
        return lngCd;
    }

    /**
     * lngCd のセッターメソッドです。
     * 
     * @param lngCd lngCd に設定する
     */
    public void setLngCd(String lngCd) {
        this.lngCd = lngCd;
    }

    /**
     * serverNm のゲッターメソッドです。
     * 
     * @return the serverNm
     */
    public String getServerNm() {
        return serverNm;
    }

    /**
     * serverNm のセッターメソッドです。
     * 
     * @param serverNm serverNm に設定する
     */
    public void setServerNm(String serverNm) {
        this.serverNm = serverNm;
    }

    /**
     * url のゲッターメソッドです。
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url のセッターメソッドです。
     * 
     * @param url url に設定する
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

}
