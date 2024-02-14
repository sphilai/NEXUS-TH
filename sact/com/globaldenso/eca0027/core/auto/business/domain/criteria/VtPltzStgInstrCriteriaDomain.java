/*
 * PROJECT：eca0027
 * 
 * VtPltzStgInstr の検索条件Domainクラス
 * テーブル概要：VT_PLTZ_STG_INSTR
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VtPltzStgInstr の検索条件Domainクラスです。<BR>
 * テーブル概要：VT_PLTZ_STG_INSTR<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VtPltzStgInstrCriteriaDomain extends AbstractDomain implements Serializable {

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
     * STG_INSTR_NO（大なり）
     */
    private String stgInstrNoGreaterThan;

    /**
     * STG_INSTR_NO（大なりイコール）
     */
    private String stgInstrNoGreaterThanEqual;

    /**
     * STG_INSTR_NO（小なり）
     */
    private String stgInstrNoLessThan;

    /**
     * STG_INSTR_NO（小なりイコール）
     */
    private String stgInstrNoLessThanEqual;

    /**
     * STG_INSTR_NO（前方一致）
     */
    private String stgInstrNoLikeFront;

    /**
     * MAIN_MARK（大なり）
     */
    private String mainMarkGreaterThan;

    /**
     * MAIN_MARK（大なりイコール）
     */
    private String mainMarkGreaterThanEqual;

    /**
     * MAIN_MARK（小なり）
     */
    private String mainMarkLessThan;

    /**
     * MAIN_MARK（小なりイコール）
     */
    private String mainMarkLessThanEqual;

    /**
     * MAIN_MARK（前方一致）
     */
    private String mainMarkLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VtPltzStgInstrCriteriaDomain() {
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

    /**
     * stgInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThan
     */
    public String getStgInstrNoGreaterThan() {
        return stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThan stgInstrNoGreaterThan に設定する
     */
    public void setStgInstrNoGreaterThan(String stgInstrNoGreaterThan) {
        this.stgInstrNoGreaterThan = stgInstrNoGreaterThan;
    }

    /**
     * stgInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoGreaterThanEqual
     */
    public String getStgInstrNoGreaterThanEqual() {
        return stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoGreaterThanEqual stgInstrNoGreaterThanEqual に設定する
     */
    public void setStgInstrNoGreaterThanEqual(String stgInstrNoGreaterThanEqual) {
        this.stgInstrNoGreaterThanEqual = stgInstrNoGreaterThanEqual;
    }

    /**
     * stgInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThan
     */
    public String getStgInstrNoLessThan() {
        return stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThan のセッターメソッドです。
     * 
     * @param stgInstrNoLessThan stgInstrNoLessThan に設定する
     */
    public void setStgInstrNoLessThan(String stgInstrNoLessThan) {
        this.stgInstrNoLessThan = stgInstrNoLessThan;
    }

    /**
     * stgInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the stgInstrNoLessThanEqual
     */
    public String getStgInstrNoLessThanEqual() {
        return stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param stgInstrNoLessThanEqual stgInstrNoLessThanEqual に設定する
     */
    public void setStgInstrNoLessThanEqual(String stgInstrNoLessThanEqual) {
        this.stgInstrNoLessThanEqual = stgInstrNoLessThanEqual;
    }

    /**
     * stgInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the stgInstrNoLikeFront
     */
    public String getStgInstrNoLikeFront() {
        return stgInstrNoLikeFront;
    }

    /**
     * stgInstrNoLikeFront のセッターメソッドです。
     * 
     * @param stgInstrNoLikeFront stgInstrNoLikeFront に設定する
     */
    public void setStgInstrNoLikeFront(String stgInstrNoLikeFront) {
        this.stgInstrNoLikeFront = stgInstrNoLikeFront;
    }

    /**
     * mainMarkGreaterThan のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThan
     */
    public String getMainMarkGreaterThan() {
        return mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThan のセッターメソッドです。
     * 
     * @param mainMarkGreaterThan mainMarkGreaterThan に設定する
     */
    public void setMainMarkGreaterThan(String mainMarkGreaterThan) {
        this.mainMarkGreaterThan = mainMarkGreaterThan;
    }

    /**
     * mainMarkGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkGreaterThanEqual
     */
    public String getMainMarkGreaterThanEqual() {
        return mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkGreaterThanEqual のセッターメソッドです。
     * 
     * @param mainMarkGreaterThanEqual mainMarkGreaterThanEqual に設定する
     */
    public void setMainMarkGreaterThanEqual(String mainMarkGreaterThanEqual) {
        this.mainMarkGreaterThanEqual = mainMarkGreaterThanEqual;
    }

    /**
     * mainMarkLessThan のゲッターメソッドです。
     * 
     * @return the mainMarkLessThan
     */
    public String getMainMarkLessThan() {
        return mainMarkLessThan;
    }

    /**
     * mainMarkLessThan のセッターメソッドです。
     * 
     * @param mainMarkLessThan mainMarkLessThan に設定する
     */
    public void setMainMarkLessThan(String mainMarkLessThan) {
        this.mainMarkLessThan = mainMarkLessThan;
    }

    /**
     * mainMarkLessThanEqual のゲッターメソッドです。
     * 
     * @return the mainMarkLessThanEqual
     */
    public String getMainMarkLessThanEqual() {
        return mainMarkLessThanEqual;
    }

    /**
     * mainMarkLessThanEqual のセッターメソッドです。
     * 
     * @param mainMarkLessThanEqual mainMarkLessThanEqual に設定する
     */
    public void setMainMarkLessThanEqual(String mainMarkLessThanEqual) {
        this.mainMarkLessThanEqual = mainMarkLessThanEqual;
    }

    /**
     * mainMarkLikeFront のゲッターメソッドです。
     * 
     * @return the mainMarkLikeFront
     */
    public String getMainMarkLikeFront() {
        return mainMarkLikeFront;
    }

    /**
     * mainMarkLikeFront のセッターメソッドです。
     * 
     * @param mainMarkLikeFront mainMarkLikeFront に設定する
     */
    public void setMainMarkLikeFront(String mainMarkLikeFront) {
        this.mainMarkLikeFront = mainMarkLikeFront;
    }

}

