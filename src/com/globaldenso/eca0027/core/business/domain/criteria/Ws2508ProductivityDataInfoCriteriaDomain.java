/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_2508.
 * <br />ECA0027_WS_2508のパラメータドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class Ws2508ProductivityDataInfoCriteriaDomain extends AbstractDomain {
    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SCREEN ID
     * <br />画面ID
     */
    private String screenId;
    
    /**
     * MESSAGE ID
     * <br />メッセージID
     */
    private String msgId;
    
    /**
     * LOCK FLAG
     * <br />ロックフラグ
     */
    private String lockFlg;
    
    /**
     * WORK START TIME
     * <br />作業開始時間
     */
    private String workTimeStrt;
    
    /**
     * WORK END TIME
     * <br />作業終了時間
     */
    private String workTimeEnd;

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2508ProductivityDataInfoCriteriaDomain() {
    }

    /**
     * Getter method for screenId.
     *
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * Setter method for screenId.
     *
     * @param screenId Set for screenId
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * Getter method for msgId.
     *
     * @return the msgId
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Setter method for msgId.
     *
     * @param msgId Set for msgId
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * Getter method for lockFlg.
     *
     * @return the lockFlg
     */
    public String getLockFlg() {
        return lockFlg;
    }

    /**
     * Setter method for lockFlg.
     *
     * @param lockFlg Set for lockFlg
     */
    public void setLockFlg(String lockFlg) {
        this.lockFlg = lockFlg;
    }

    /**
     * Getter method for workTimeStrt.
     *
     * @return the workTimeStrt
     */
    public String getWorkTimeStrt() {
        return workTimeStrt;
    }

    /**
     * Setter method for workTimeStrt.
     *
     * @param workTimeStrt Set for workTimeStrt
     */
    public void setWorkTimeStrt(String workTimeStrt) {
        this.workTimeStrt = workTimeStrt;
    }

    /**
     * Getter method for workTimeEnd.
     *
     * @return the workTimeEnd
     */
    public String getWorkTimeEnd() {
        return workTimeEnd;
    }

    /**
     * Setter method for workTimeEnd.
     *
     * @param workTimeEnd Set for workTimeEnd
     */
    public void setWorkTimeEnd(String workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

}