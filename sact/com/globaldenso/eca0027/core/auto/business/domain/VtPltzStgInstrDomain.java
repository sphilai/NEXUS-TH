/*
 * PROJECT：eca0027
 * 
 * VtPltzStgInstr のDomainクラス
 * テーブル概要：VT_PLTZ_STG_INSTR
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
 * VtPltzStgInstr のDomainクラスです。<BR>
 * テーブル概要：VT_PLTZ_STG_INSTR<BR>
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
public class VtPltzStgInstrDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * STG_INSTR_NO
     */
    private String stgInstrNo;

    /**
     * MAIN_MARK
     */
    private String mainMark;

    /**
     * デフォルトコンストラクタ。
     */
    public VtPltzStgInstrDomain() {
    }

    /**
     * stgInstrNo のゲッターメソッドです。
     * 
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * stgInstrNo のセッターメソッドです。
     * 
     * @param stgInstrNo stgInstrNo に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
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

}
