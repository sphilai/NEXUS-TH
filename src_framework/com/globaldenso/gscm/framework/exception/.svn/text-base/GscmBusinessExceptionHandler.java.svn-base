/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * GscmBusinessExceptionHandlerクラス
 * GscmBusinessExceptionHandler Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

/**
 * GSCM業務共通例外。
 * GSCM Work Common Exception
 * 
 * <p>
 * 例外をスロー→業務共通エラー画面を表示する仕組みを提供します。
 * Throw exception.Provide function displaying work common error window
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class GscmBusinessExceptionHandler extends ExceptionHandler {

    /**
     * シリアルバージョンUID。
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1L; 

    // -------------------------------------------------------------- Properties

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     *
     */
    public GscmBusinessExceptionHandler() {
        super();
    }

    // ------------------------------------------------------------ Constructors

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ExceptionHandler#execute(java.lang.Exception, org.apache.struts.config.ExceptionConfig, org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public ActionForward execute(Exception exception, ExceptionConfig config,
        ActionMapping mapping, ActionForm form, HttpServletRequest request,
        HttpServletResponse response) throws ServletException {
        
        GscmBusinessException businessException = (GscmBusinessException) exception;
        
        //業務共通エラー画面に表示するメッセージIDを例外クラスから取得
        //Get message id displaying at work common error window from exception class
        ActionMessage msg = new ActionMessage(businessException.getCode(), businessException.getArgs());

        // 次画面遷移情報を取得する
        // Get information of next window transfer
        ActionForward forward = super.execute(exception, config, mapping, form, request, response);
        
        String property = Globals.ERROR_KEY;
        String scope = "request";

        //リクエストにエラーメッセージを保存
        //Store error message in request
        storeException(request, property, msg, forward, scope);

        return forward;
    }

}
