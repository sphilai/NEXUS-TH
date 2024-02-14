/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ValidationWarningExceptionクラス
 * ValidationWarningException Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.exception;

/**
 * ワーニングチェック例外クラス。
 * ValidationWarningException Class
 * <p>
 * ワーニングチェック用の例外クラスです。
 * ValidationWarningException Class
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ValidationWarningException extends GscmApplicationException {

    /**
     * シリアルバージョンID。
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * エラーメッセージ埋め込みパラメータ。
     * Structural argument for message
     */
    private Object[] args = null;

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param warningDialogMsgId メッセージID
     * @param warningDialogMsgId Message ID
     */
    public ValidationWarningException(String warningDialogMsgId) {
        super(warningDialogMsgId);
    }

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param warningDialogMsgId メッセージID
     * @param warningDialogMsgId Message ID
     * @param msgParams 埋め込みパラメータ
     * @param msgParams Structural argument
     */
    public ValidationWarningException(String warningDialogMsgId, Object[] msgParams) {
        super(warningDialogMsgId, msgParams);
        this.args = msgParams;
    }

    /**
     * arguments のゲッターメソッドです。
     * Getter method for arguments
     * 
     * @return the arguments
     */
    public Object[] getArgs() {
        return args;
    }
}
