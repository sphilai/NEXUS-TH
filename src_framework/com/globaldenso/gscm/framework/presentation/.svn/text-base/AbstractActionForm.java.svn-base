/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ActionFormクラス
 * ActionForm Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import org.apache.struts.action.ActionForm;

/**
 * 共通項目を定義したActionFormです。
 * ActionForm defininig common fields
 */
public class AbstractActionForm extends ActionForm {

    /**
     * シリアルバージョンID。
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 画面ID。
     * Screen id
     */
    private String screenId;

    /**
     * 呼び元画面ID。
     * Invocation screen id
     */
    private String callScreenId;

    /**
     * 戻り先アクション。
     * Returning action
     */
    private String returnAction;

    /**
     * 言語コード。
     * Language code
     */
    private String languageCd;

    /**
     * ページあたり行数
     * Number of lines per page
     */
    private int _countPerPage = 10;

    /**
     * 遷移先ページNo(1 start)
     * Page No to transition(start from 1) 
     */
    private String _currentPageNo = "1";

    /**
     * 件数from
     * From Number of records
     */
    private int fromCount;

    /**
     * 件数to
     * To Number of records
     */
    private int toCount;

    /**
     * 総件数
     * Total number of records
     */
    private int totalCount;

    /**
     * 現在のページ
     * Current page
     */
    private int curPage;

    /**
     * 最初のページ
     * First page
     */
    private Integer firstPage;

    /**
     * 前のXページ
     * Previous page
     */
    private Integer prevPage;

    /**
     * 次のXページ
     * Next page
     */
    private Integer nextPage;

    /**
     * 最後のページ
     * Last page
     */
    private Integer lastPage;

    /**
     * ウィンドウID
     * Window id
     */
    private String windowId;

    /**
     * ページング
     * Page information
     */
    private PageInfo pageInfo = null;

    /**
     * 画面情報保持判断フラグ
     * Judgement flag of screen information maintenance 
     */
    private boolean stackScreenInfoFlg = true;
    
    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public AbstractActionForm() {
        super();
    }

    /**
     * screenId のゲッターメソッドです。
     * Getter method for screenId
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * screenId のセッターメソッドです。
     * Setter method for screenId
     * 
     * @param screenId screenId に設定する
     * @param screenId Set to screenId
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * callScreenId のゲッターメソッドです。
     * Getter method for callScreenId
     * 
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * callScreenId のセッターメソッドです。
     * Setter method for callScreenId
     * 
     * @param callScreenId callScreenId に設定する
     * @param callScreenId Set to callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }

    /**
     * returnAction のゲッターメソッドです。
     * Getter method for returnAction
     * 
     * @return the returnAction
     */
    public String getReturnAction() {
        return returnAction;
    }

    /**
     * returnAction のセッターメソッドです。
     * Setter method for returnAction
     * 
     * @param returnAction returnAction に設定する
     * @param returnAction Set to returnAction
     */
    public void setReturnAction(String returnAction) {
        this.returnAction = returnAction;
    }

    /**
     * languageCd のゲッターメソッドです。
     * Getter method for languageCd
     * 
     * @return the languageCd
     */
    public String getLanguageCd() {
        return languageCd;
    }

    /**
     * languageCd のセッターメソッドです。
     * Setter method for languageCd
     * 
     * @param languageCd languageCd に設定する
     * @param languageCd Set to languageCd
     */
    public void setLanguageCd(String languageCd) {
        this.languageCd = languageCd;
    }

    /**
     * <p>
     * _countPerPage のゲッターメソッドです。
     * Getter method for _countPerPage
     * </p>
     * 
     * @return the _countPerPage
     */
    public int getCountPerPage() {
        return _countPerPage;
    }

    /**
     * <p>
     * _countPerPage のセッターメソッドです。
     * Setter method for _countPerPage
     * </p>
     * 
     * @param perPage _countPerPage に設定する
     * @param perPage Set to _countPerPage
     */
    public void setCountPerPage(int perPage) {
        _countPerPage = perPage;
    }

    /**
     * <p>
     * _currentPageNo のゲッターメソッドです。
     * Getter method for _currentPageNo
     * </p>
     * 
     * @return the _currentPageNo
     */
    public String getCurrentPageNo() {
        return _currentPageNo;
    }

    /**
     * <p>
     * _currentPageNo のセッターメソッドです。
     * Setter method for _currentPageNo
     * </p>
     * 
     * @param pageNo _currentPageNo に設定する
     * @param pageNo Set to _currentPageNo
     */
    public void setCurrentPageNo(String pageNo) {
        _currentPageNo = pageNo;
    }

    /**
     * <p>
     * fromCount のゲッターメソッドです。
     * Getter method for fromCount
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
     * Setter method for fromCount
     * </p>
     * 
     * @param fromCount fromCount に設定する
     * @param fromCount Set to fromCount
     */
    public void setFromCount(int fromCount) {
        this.fromCount = fromCount;
    }

    /**
     * <p>
     * toCount のゲッターメソッドです。
     * Getter method for toCount
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
     * Setter method for toCount
     * </p>
     * 
     * @param toCount toCount に設定する
     * @param toCount Set to toCount
     */
    public void setToCount(int toCount) {
        this.toCount = toCount;
    }

    /**
     * <p>
     * totalCount のゲッターメソッドです。
     * Getter method for totalCount
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
     * Setter method for totalCount
     * </p>
     * 
     * @param totalCount totalCount に設定する
     * @param totalCount Set to totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * curPage のゲッターメソッドです。
     * Getter method for curPage
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
     * Setter method for curPage
     * </p>
     * 
     * @param curPage curPage に設定する
     * @param curPage Set to curPage
     */
    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    /**
     * <p>
     * firstPage のゲッターメソッドです。
     * Getter method for firstPage
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
     * Setter method for firstPage
     * </p>
     * 
     * @param firstPage firstPage に設定する
     * @param firstPage Set to firstPage
     */
    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * <p>
     * prevPage のゲッターメソッドです。
     * Getter method for prevPage
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
     * Setter method for prevPage
     * </p>
     * 
     * @param prevPage prevPage に設定する
     * @param prevPage Set to prevPage
     */
    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    /**
     * <p>
     * nextPage のゲッターメソッドです。
     * Getter method for nextPage
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
     * Setter method for nextPage
     * </p>
     * 
     * @param nextPage nextPage に設定する
     * @param nextPage Set to nextPage
     */
    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * <p>
     * lastPage のゲッターメソッドです。
     * Getter method for lastPage
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
     * Setter method for lastPage
     * </p>
     * 
     * @param lastPage lastPage に設定する
     * @param lastPage Set to lastPage
     */
    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    /**
     * windowId のゲッターメソッドです。
     * Getter method for windowId
     * 
     * @return the windowId
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * windowId のセッターメソッドです。
     * Setter method for windowId
     * 
     * @param windowId windowIdに設定する
     * @param windowId Set to windowId
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * pageInfo のゲッターメソッドです。
     * Getter method for pageInfo
     * 
     * @return the pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * pageInfo のセッターメソッドです。
     * Setter method for pageInfo
     * 
     * @param pageInfo pageInfo に設定する
     * @param pageInfo Set to pageInfo
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * stackScreenInfoFlg のゲッターメソッドです。
     * Getter method for stackScreenInfoFlg
     * 
     * @return the stackScreenInfoFlg
     */
    public boolean isStackScreenInfoFlg() {
        return stackScreenInfoFlg;
    }

    /**
     * stackScreenInfoFlg のセッターメソッドです。
     * Setter method for stackScreenInfoFlg
     * 
     * @param stackScreenInfoFlg stackScreenInfoFlg に設定する
     * @param stackScreenInfoFlg Set to stackScreenInfoFlg
     */
    public void setStackScreenInfoFlg(boolean stackScreenInfoFlg) {
        this.stackScreenInfoFlg = stackScreenInfoFlg;
    }
}
