/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ValidationExceptionクラス
 * ValidationException Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.exception;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;

/**
 * バリデーションの例外クラスです。
 * ValidationException Class
 * 
 * @author DENSO CORPORATION
 */
public final class ValidationException extends ApplicationException {

    /**
     * シリアルバージョンID。
     * serialVersionID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ERRORLIST
     */
    private List<MessageDomain> errorList = new ArrayList<MessageDomain>();

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param code エラーコード
     * @param code Error code
     */
    public ValidationException(String code) {
        super(code);
    }

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param code エラーコード
     * @param code Error code
     * @param args メッセージ埋め込みパラメータ
     * @param args Structural argument for message
     */
    public ValidationException(String code, Object[] args) {
        super(code, args);
    }

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param code エラーコード
     * @param code Error code
     * @param cause エラー原因
     * @param cause Cause of error
     */
    public ValidationException(String code, Throwable cause) {
        super(code, cause);
    }

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param cause エラー原因
     * @param cause Cause of error
     */
    public ValidationException(Throwable cause) {
        super(cause);
    }

    /**
     * コンストラクタです。
     * Constructor
     * 
     * @param code エラーコード
     * @param code Error code
     * @param cause エラー原因
     * @param cause Cause of error
     * @param args メッセージ埋め込みパラメータ
     * @param args Structural argument for message
     */
    public ValidationException(String code, Throwable cause, Object[] args) {
        super(code, cause, args);
    }

    /**
     * デフォルトコンストラクタです。
     * Default constructor
     * 
     * @param errorList errorList
     */
    public ValidationException(List<MessageDomain> errorList) {
        super("");
        this.errorList = errorList;
    }

    /**
     * errorList のゲッターメソッドです。
     * Getter method for errorList
     * 
     * @return errorList
     */
    public List<MessageDomain> getErrors() {
        return errorList;
    }

}
