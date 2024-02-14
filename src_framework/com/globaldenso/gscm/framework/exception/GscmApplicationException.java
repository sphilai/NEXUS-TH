/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * GscmApplicationExceptionクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.exception;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * GSCMアプリケーション例外。
 * 
 * <p>
 * AbstractActionと連携し、例外をスロー→メッセージ表示の仕組みを提供します。
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class GscmApplicationException extends ApplicationException {

    /**
     * シリアルバージョンUID。
     */
    private static final long serialVersionUID = 1L; 

    // -------------------------------------------------------------- Properties

    /**
     * エラーメッセージ埋め込みパラメータ。
     */
    private Object[] args = null;

    // ------------------------------------------------------------ Constructors

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     */
    public GscmApplicationException(String code) {
        super(code);
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param args メッセージ埋め込みパラメータ
     */
    public GscmApplicationException(String code, Object[] args) {
        super(code, args);
        this.args = args;
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param cause エラー原因
     */
    public GscmApplicationException(String code, Throwable cause) {
        super(code, cause);
    }

    /**
     * コンストラクタです。
     *
     * @param cause エラー原因
     */
    public GscmApplicationException(Throwable cause) {
        super(cause);
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param cause エラー原因
     * @param args メッセージ埋め込みパラメータ
     */
    public GscmApplicationException(String code, Throwable cause, Object[] args) {
        super(code, cause, args);
        this.args = args;
    }

    // --------------------------------------------------------------- Accessors
    /**
     * arguments のゲッターメソッドです。
     *
     * @return the arguments
     */
    public Object[] getArgs() {
        return args;
    }
}
