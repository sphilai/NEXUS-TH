/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The parameter domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502のパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class Ws2502ProductivityDataInfoCriteriaDomain extends AbstractDomain implements Serializable {
    /**
     * Serial version
     * <br />シリアルバージョン
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
     * <br />デフォルトコンストラクタです。
     */
    public Ws2502ProductivityDataInfoCriteriaDomain() {
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
