/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * AbstractActionクラス
 * AbstractAction Class
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.REQUEST_KEY_RETURN_ACTION;
import static org.apache.struts.Globals.LOCALE_KEY;
import static org.apache.struts.Globals.TRANSACTION_TOKEN_KEY;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.MessageResources;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.GscmBusinessException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.exception.ValidationWarningException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.ai.common.core.exception.SystemException;

/**
 * GSCM 共通の Action の基底クラスです。
 * Super class of GSCM Common Action
 * <p>
 * Struts の {@link Action} を継承して、 入力値チェックや主処理の処理順を定義するといった拡張を行っています。<br>
 * Extend process of input validation or definition of main process sequence by inheriting {@link Action} of Struts <br>
 * 処理内容の詳細は
 * Refer to under text  when process content of detail is necessary
 * {@link #execute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)}
 * を参照してください。
 * </p>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12404 $
 */
public abstract class AbstractAction extends Action {
    // ------------------------------------------------------------ Constructors
    /**
     * <p>
     * デフォルトコンストラクタ。
     * Default constructor
     * </p>
     */
    public AbstractAction() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * リクエストを処理するメインメソッドです。
     * Main method for processing request
     * <p>
     * すべてのアクションは以下の順で処理されます。
     * All actions process in following sequence
     * <ol>
     * <li>前処理 ({@link #preInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)})</li>
     * <li>Previous process ({@link #preInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)})</li>
     * <li>実行処理 ({@link #invokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)})</li>
     * <li>Execute process ({@link #invokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse)})</li>
     * <li>例外処理 ({@link #error(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, ApplicationException)})</li>
     * <li>Exception process ({@link #error(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, ApplicationException)})</li>
     * <li>後処理 ({@link #postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)})</li>
     * <li>Post process ({@link #postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)})</li>
     * </ol>
     * </p>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return {@link org.apache.struts.action.ActionForward ActionForward}
     * @throws Exception Action の処理で発生した例外です。
     * @Exception at throws Exception Action
     */
    @SuppressWarnings("unchecked")
    public final ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // フォワード先
        // Foward name
        String forwardName = null;

        try {
            AbstractActionForm abstractForm = (AbstractActionForm)form;
            abstractForm.setStackScreenInfoFlg(isScreenInfoStack());

            // デフォルトのロケール情報を設定
            // Set default locale information
            setDefaultLocale(abstractForm, request);
            
            // 不正な画面遷移チェック
            // Validation of invalidate screen transition
            checkScreenTransition(mapping, form, request, response);
            
            // ロケール情報を設定
            // Set locale information
            setLocale(abstractForm, request);

            if (abstractForm.getReturnAction() != null) {
                request.setAttribute(REQUEST_KEY_RETURN_ACTION, abstractForm.getReturnAction());
            } else {
                request.setAttribute(REQUEST_KEY_RETURN_ACTION, "");
            }

            // 前処理
            // Previous process
            forwardName = preInvokeExecute(mapping, form, request, response);

            // 実行処理
            // Execute process
            if (FORWARD_SUCCESS.equals(forwardName)) {
                forwardName = invokeExecute(mapping, form, request, response);
            }

        } catch (Exception e) {
            // 例外処理
            // Exception process
            forwardName = error(mapping, form, request, response, e);
        } finally {
            // 後処理
            // Post process
            postInvokeExecute(mapping, form, request, response, forwardName);
        }

        return mapping.findForward(forwardName);

    }

    // --------------------------------------------------------- Abstract Method
    /**
     * 前処理を行います。
     * Execute previous process
     * <p>
     * 画面共通の初期処理(プルダウンメニュー生成、セッションからフォームへの設定など）があれば本メソッドで実装します。
     * If common initializing process(create pull-down-menu,set from session to form,etc) exists,implement in this method  
     * </p>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return フォワード名
     * @return Forward name
     * @throws ApplicationException 例外
     * @throws ApplicationException ApplicationException
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        return FORWARD_SUCCESS;
    }

    /**
     * 実行処理です。
     * Execute process
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @return リターンコード
     * @return Return code
     * @throws Exception 例外
     * @throws Exception Exception
     */
    protected abstract String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception;

    // ------------------------------------------------------- Protected Methods
    /**
     * 不正な画面遷移をチェックします。
     * Validate invalidate screen transition
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @throws ApplicationException 例外
     * @throws ApplicationException ApplicationException
     */
    protected final void checkScreenTransition(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        // トランザクショントークンによる画面遷移チェック
        // Validate screen transition with transaction token
        if (!isTokenExist(request)) {
            saveToken(request);
        }
        if (isTokenCheck()) {
            synchronized (request.getSession(true)) {
                // トークンが一致するか確認する
                // Comfirm whether token is equal to request
                if (!isTokenValid(request, false)) {
                    throw new GscmBusinessException("GSCM-E1-0001");
                }
            }

        }
    }

    /**
     * トークンをチェックするかどうかを返却するメソッドです。<br />
     * Method for returning whether validating token<br />
     * <p>
     * デフォルトはtrue(チェックする)としています。<br />
     * Default setting is true(validate) <br />
     * チェックが必要な場合は本メソッドをオーバーライドし、trueを返すようにしてください。
     * If validation is necessary,override this method and return true
     * </p>
     * 
     * @return true：チェックする、false：チェックしない。
     * @return true：do validate  false：do not validate
     */
    protected boolean isTokenCheck() {
        return true;
    }

    /**
     * アクション・メソッドの後に実行する処理です。
     * Process executed after action method execute
     * <p>
     * </p>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @param forwardName リターンコード
     * @param forwardName return code
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
    }

    /**
     * アプリケーション例外発生時の処理です。
     * Process at application exception occur
     * <p>
     * 発生したアプリケーション例外のエラーメッセージをActionMessagesに設定します。
     * Set error message of application exception to ActionMessages
     * </p>
     * 
     * @param mapping
     *            {@link org.apache.struts.action.ActionMapping ActionMapping}
     * @param form {@link org.apache.struts.action.ActionForm ActionForm}
     * @param request
     *            {@link javax.servlet.http.HttpServletRequest HttpServletRequest}
     * @param response
     *            {@link javax.servlet.http.HttpServletResponse HttpServletResponse}
     * @param exception 例外
     * @param exception Exception
     * @return リターンコード
     * @return Return code
     * @throws Exception 処理不可能な例外が発生した場合
     * @throws Exception Throw disable execute exception
     */
    protected final String error(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, Exception exception)
        throws Exception {

        ActionMessages errors = new NullSkipActionMessages();
        String forwardName = FORWARD_ERROR;
        // 入力値チェック(validate)エラーの場合
        // If validation of input value is error,execute error process
        if (exception instanceof ValidationException) {
            ValidationException ve = (ValidationException)exception;
            for (MessageDomain error : ve.getErrors()) {
                errors.add(error.getProperty(),
                    new ActionMessage(error.getKey(), error.getParams()));
            }
        } else if (exception instanceof ValidationWarningException) {
            // ワーニングチェック例外
            // Exception of warning validation
            ValidationWarningException error = (ValidationWarningException)exception;
            WindowInfoManager win = new WindowInfoManager(((AbstractActionForm)form).getWindowId());
            MessageResources mr = super.getResources(request);
            // ワーニングダイアログ出力メッセージを取得
            // Get output message of warning dialog
            String warningDialogMsg = mr.getMessage(win.getCommonInfo().getLocale(), error.getCode(), error.getArgs());
            request.setAttribute("gscmWarningDialogMessage", warningDialogMsg);
            return FORWARD_ERROR;
        } else if (exception instanceof GscmApplicationException) {
            // チェック例外(ApplicationException)の場合
            // If GscmApplicationException occurs,execute error process
            GscmApplicationException error = (GscmApplicationException)exception;
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(error.getCode(), error
                .getArgs()));
        } else if (exception.getCause() instanceof GscmApplicationException) {
            // AOPからスローしたチェック例外
            // Exception of validation thrown from AOP
            GscmApplicationException error = (GscmApplicationException)exception.getCause();
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(error.getCode(), error
                .getArgs()));
        } else if (exception instanceof GscmBusinessException) {
            // 業務共通エラー(GscmBusinessException)の場合
            // TODO 英語化
            GscmBusinessException error = (GscmBusinessException)exception;

            // セッション情報削除フラグが設定済の場合、ブラウザの画面情報(画面共通情報も含む)を全て削除する。
            // TODO 英語化
            if (((AbstractActionForm)form).getWindowId() != null && error.isSessionDeleteFlg()) {
                DensoContext.get().removeGeneralArea(((AbstractActionForm)form).getWindowId());
            }
            
            if(!CheckUtil.isBlankOrNull(error.getForwardName())){
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(error.getCode(), error.getArgs()));
                forwardName = error.getForwardName();
            }
        } else if (exception instanceof ApplicationException) {
            // 基盤共通部品からのチェック例外
            // Exception of validation from base common function
            ApplicationException error = (ApplicationException)exception;
            // 一意制約エラーの場合、GSCM共通機能群のメッセージに変更
            // TODO 英語化
            if (IntegrationLayerException.UNIQUE_CONSTRAINT_VIOLATION_CODE.equals(error.getCode())) {
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("GSCM-E0-0020"));
            } else {
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(error.getMessage(), false));
            }
        } else if (exception instanceof SystemException) {
            // ブラウザの画面情報(画面共通情報も含む)を全て削除する。
            // Delete all screen information of browser
            if (((AbstractActionForm)form).getWindowId() != null) {
                DensoContext.get().removeGeneralArea(((AbstractActionForm)form).getWindowId());
            }
        }

        if (errors.size() > 0) {
            saveErrors(request, errors);
        } else {
            throw exception;
        }

        return forwardName;
    }

    /**
     * 画面情報を保持するかどうかを返却するメソッドです。<br />
     * Method for returning value whether maintain screen information <br />
     * <p>
     * デフォルトはtrue(保持する)としています。<br />
     * Default setting is true(maintain) <br />
     * 保持が不要な場合は本メソッドをオーバーライドし、falseを返すようにしてください。
     * If maintenance is unnecessary,override this method and return false
     * </p>
     * 
     * @return true：保持する、false：保持しない。
     * @return true：do maintain,false：do not maintain
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * デフォルトロケール情報設定。
     * Set default locale information
     * <p>
     * デフォルトロケール情報の設定を行う。
     * Set default locale information
     * </p>
     * 
     * @param form フォーム
     * @param form form
     * @param request リクエスト
     * @param request request
     */
    protected final void setDefaultLocale(AbstractActionForm form, HttpServletRequest request) {

        String windowId = form.getWindowId();

        // ブラウザの言語コードよりロケール情報を作成する。
        // Create locale information from language code at browser
        HttpSession session = request.getSession(false);
        Locale locale = new Locale(((Locale)session.getAttribute(LOCALE_KEY)).getLanguage());

        // Strutsタグ(bean:message等)が利用するロケール情報用に、セッションスコープに作成したロケール情報を設定する。
        // Set locale information at session scope for locale information used by Struts tag(bean:message etc.)
        request.getSession(false).setAttribute(windowId + "_locale", locale);
        // Strutsタグ(bean:message等)の「locale」属性に指定するキー値をリクエストスコープに設定する。
        // Set key value, which is specified to locale content type at Struts tag(bean:message etc.),to request scope
        // ウィンドウ毎に利用するロケール情報が異なる可能性があるので、キー値には、ウィンドウIDを含める。
        // Include window id at key value because used locale information is different every window
        request.setAttribute("locale_key", windowId + "_locale");
    }

    /**
     * ロケール情報設定。
     * Set locale information
     * <p>
     * ロケール情報の設定を行う。
     * Set locale information
     * </p>
     * 
     * @param form フォーム
     * @param form form
     * @param request リクエスト
     * @param request request
     * @throws ApplicationException 例外
     * @throws ApplicationException ApplicationException
     */
    protected final void setLocale(AbstractActionForm form, HttpServletRequest request) 
        throws ApplicationException{

        String windowId = form.getWindowId();

        Locale locale = null;
        try{
            // セッションよりロケール情報を取得する。
            // Get locale information from session
            WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
            CommonInfoDomain commonInfoDomain = windowInfo.getCommonInfo();

            // ロケール情報は、CreateCommonInfoフィルタにて設定された情報を利用する。
            // Locale information is created from information set at CreateCommonInfo filter
            locale = commonInfoDomain.getLocale();

        } catch(NullPointerException e){
            throw new GscmBusinessException("GSCM-E1-0001");
        }

        // CommonInfoDomainよりロケール情報が取得できない場合は、ブラウザの言語コードよりロケール情報を作成する。
        // When not get locale information at CommonInfoDomain,create locale information from language code at browser
        if (locale != null) {
            // Strutsタグ(bean:message等)が利用するロケール情報用に、セッションスコープに作成したロケール情報を設定する。
            // Set locale information at session scope for locale information used by Struts tag(bean:message etc.)
            request.getSession(false).setAttribute(windowId + "_locale", locale);
        }
    }

    // ------------------------------------------------------- private Methods
    /**
     * <p>
     * セッション上にトークンが存在するかチェックするメソッドです。
     * Method for validating whether token exist in session
     * </p>
     * 
     * @param req HttpServletRequest
     * @return boolean true:トークンが存在する false:トークンが存在しない
     * @return boolean true:token exist false:token does not exist
     */
    private boolean isTokenExist(HttpServletRequest req) {
        if (req.getSession().getAttribute(TRANSACTION_TOKEN_KEY) != null) {
            return true;
        }
        return false;
    }
}