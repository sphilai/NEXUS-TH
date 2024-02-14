/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * PageInfoクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.io.Serializable;

/**
 * ページング情報保持クラス。
 */
public class PageInfoData implements Serializable {
    
    /**
     * フィールドの役割を記述してください。
     */
    private static final long serialVersionUID = 8323757722042406580L;

    /** 件数from */
    private int fromCount = 0;

    /** 件数to */
    private int toCount = 0;

    /** 総件数 */
    private int totalCount = 0;

    /** 現在のページ */
    private int curPage = 1;

    /** 最初のページ */
    private Integer firstPage = null;

    /** 前のXページ */
    private Integer prevPage = null;

    /** 次のXページ */
    private Integer nextPage = null;

    /** 最後のページ */
    private Integer lastPage = null;

    /**
     * デフォルトコンストラクタ。
     */
    public PageInfoData() {
    }

    /**
     * <p>
     * fromCount のゲッターメソッドです。
     * </p>
     * 
     * @return the fromCount
     */
    public int getFromCount() {
        return fromCount;
    }

    /**
     * <p>
     * fromCount のセッターメソッドです。
     * </p>
     * 
     * @param fromCount fromCount に設定する
     */
    public void setFromCount(int fromCount) {
        this.fromCount = fromCount;
    }

    /**
     * <p>
     * toCount のゲッターメソッドです。
     * </p>
     * 
     * @return the toCount
     */
    public int getToCount() {
        return toCount;
    }

    /**
     * <p>
     * toCount のセッターメソッドです。
     * </p>
     * 
     * @param toCount toCount に設定する
     */
    public void setToCount(int toCount) {
        this.toCount = toCount;
    }

    /**
     * <p>
     * totalCount のゲッターメソッドです。
     * </p>
     * 
     * @return the totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * totalCount のセッターメソッドです。
     * </p>
     * 
     * @param totalCount totalCount に設定する
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * curPage のゲッターメソッドです。
     * </p>
     * 
     * @return the curPage
     */
    public int getCurPage() {
        return curPage;
    }

    /**
     * <p>
     * curPage のセッターメソッドです。
     * </p>
     * 
     * @param curPage curPage に設定する
     */
    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    /**
     * <p>
     * firstPage のゲッターメソッドです。
     * </p>
     * 
     * @return the firstPage
     */
    public Integer getFirstPage() {
        return firstPage;
    }

    /**
     * <p>
     * firstPage のセッターメソッドです。
     * </p>
     * 
     * @param firstPage firstPage に設定する
     */
    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * <p>
     * prevPage のゲッターメソッドです。
     * </p>
     * 
     * @return the prevPage
     */
    public Integer getPrevPage() {
        return prevPage;
    }

    /**
     * <p>
     * prevPage のセッターメソッドです。
     * </p>
     * 
     * @param prevPage prevPage に設定する
     */
    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    /**
     * <p>
     * nextPage のゲッターメソッドです。
     * </p>
     * 
     * @return the nextPage
     */
    public Integer getNextPage() {
        return nextPage;
    }

    /**
     * <p>
     * nextPage のセッターメソッドです。
     * </p>
     * 
     * @param nextPage nextPage に設定する
     */
    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * <p>
     * lastPage のゲッターメソッドです。
     * </p>
     * 
     * @return the lastPage
     */
    public Integer getLastPage() {
        return lastPage;
    }

    /**
     * <p>
     * lastPage のセッターメソッドです。
     * </p>
     * 
     * @param lastPage lastPage に設定する
     */
    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

}
