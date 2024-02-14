/*
 * PROJECT：NEXUS
 *
 * TtPltz の検索結果Domainクラス
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * The domain of palletizing table Locking Ws5502.<BR>
 * Ws5502のパレタイズテーブルロック処理のドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws5502TtPltzDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID<BR>
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     */
    public Ws5502TtPltzDomain() {
    }

    /**
     * getter method of mainMark<BR>
     * mainMark のゲッターメソッドです。
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * setter method of mainMark<BR>
     * mainMark のセッターメソッドです。
     *
     * @param mainMark
     *            mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

}
