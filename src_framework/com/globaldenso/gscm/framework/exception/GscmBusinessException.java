/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * GscmBusinessApplicationExceptionクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.exception;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * GSCM業務共通例外。
 * 
 * <p>
 * 例外をスロー→業務共通エラー画面を表示する仕組みを提供します。
 * </p>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public class GscmBusinessException extends ApplicationException {

    /**
     * シリアルバージョンUID。
     */
    private static final long serialVersionUID = 1L; 

    // -------------------------------------------------------------- Properties

    /**
     * エラーメッセージ埋め込みパラメータ。
     */
    private Object[] args = null;

    /**
     * 指定遷移先
     */
    private String forwardName = null;

    /**
     * セッション情報削除フラグ(true：削除 false：削除しない)
     */
    private boolean sessionDeleteFlg = true;

    // ------------------------------------------------------------ Constructors

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     */
    public GscmBusinessException(String code) {
        super(code);
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param args メッセージ埋め込みパラメータ
     */
    public GscmBusinessException(String code, Object[] args) {
        super(code, args);
        this.args = args;
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param cause エラー原因
     */
    public GscmBusinessException(String code, Throwable cause) {
        super(code, cause);
    }

    /**
     * コンストラクタです。
     *
     * @param cause エラー原因
     */
    public GscmBusinessException(Throwable cause) {
        super(cause);
    }

    /**
     * コンストラクタです。
     *
     * @param code エラーコード
     * @param cause エラー原因
     * @param args メッセージ埋め込みパラメータ
     */
    public GscmBusinessException(String code, Throwable cause, Object[] args) {
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

    /**
     * forwardName のゲッターメソッドです。
     *
     * @return the forwardName
     */
    public String getForwardName() {
        return forwardName;
    }

    /**
     * forwardName のセッターメソッドです。
     *
     * @param forwardName 指定遷移先
     */
    public void setForwardName(String forwardName) {
        this.forwardName = forwardName;
    }

    /**
     * sessionDeleteFlg のゲッターメソッドです。
     *
     * @return the sessionDeleteFlg
     */
    public boolean isSessionDeleteFlg() {
        return sessionDeleteFlg;
    }

    /**
     * sessionDeleteFlg のセッターメソッドです。
     *
     * @param sessionDeleteFlg セッション情報削除フラグ
     */
    public void setSessionDeleteFlg(boolean sessionDeleteFlg) {
        this.sessionDeleteFlg = sessionDeleteFlg;
    }

    // --------------------------------------------------------------- Accessors
}
