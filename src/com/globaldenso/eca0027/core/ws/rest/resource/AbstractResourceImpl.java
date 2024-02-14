package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.dao.CannotAcquireLockException;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Resource implementation class for abstract class.<br />  
 * Resource実装クラスの基底クラスです。
 *
 * <pre>
 * Defined method below listed.
 * - Create result domain by error message of Helper Method.
 * - Create {@link ErrorParamListItemDomain} by error code, error message of {@link MessageDomain} arguments.
 *   Use throws Exception from Facade Service.
 *   
 * - Get Language CD Helper Method.
 *   Get Language CD by locale info of DensoContext. 
 * </pre>
 * <pre>
 * 以下のヘルパーメソッドを定義しています。
 * 
 * - エラーメッセージからエラー結果ドメインを作成するヘルパーメソッド
 *   {@link MessageDomain}のエラーコードとエラー引数をもとに{@link ErrorParamListItemDomain}を作成する。
 *   Facadeサービスからスローされた例外をResourceクラスでハンドリングするさいに利用する。
 *   
 * - 言語コードを取得するヘルパーメソッド
 *   DensoContextのロケール情報から言語コードを取得する。
 * </pre>
 *  * 
 * @version $Revision: 7416 $
 */
public class AbstractResourceImpl {

    /**
     * Constructor <br />
     * デフォルトコンストラクタです。
     *
     */
    public AbstractResourceImpl() {
        super();
    }

    /**
     * Create WebService Error result by Facade Service Error Message.<br /> 
     * FacadeサービスのエラーメッセージからWebサービスのエラー結果を作成します。
     *
     * 
     * @param messageDomainList Error Message of Facade Service.<br />Facadeサービスのエラーメッセージ
     * @return Error result of WebService.<br />Webサービスのエラー結果
     */
    protected List<ErrorListItemDomain> getErrorList(List<MessageDomain> messageDomainList) {
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        
        for (MessageDomain messageDomain : messageDomainList) {
            String errorCode = messageDomain.getKey();
            List<ErrorParamListItemDomain> paramList = getParamList(messageDomain.getParams());
            
            errorList.add(new ErrorListItemDomain(errorCode, paramList));
        }
        
        return errorList;
    }

    /**
     * Create WebService Error result by Facade Service Error Message.<br /> 
     * FacadeサービスのエラーメッセージからWebサービスのエラー結果を作成します。
     *
     * @param code Message Code.<br />メッセージ・コード
     * @param args Message parameter.<br />メッセージ・パラメータ
     * @return Error result of WebService<br />Webサービスのエラー結果
     */
    protected List<ErrorListItemDomain> getErrorList(String code, Object[] args) {
        return Arrays.asList(new ErrorListItemDomain(code, getParamList(args)));
    }
    
    /**
     * Create WebService Error result by Facade Service Error Message.<br /> 
     * FacadeサービスのエラーメッセージからWebサービスのエラー結果を作成します。
     *
     * @param code Message Code<br />メッセージ・コード
     * @return Error result of WebService<br />Webサービスのエラー結果
     */
    protected List<ErrorListItemDomain> getErrorList(String code) {
        return getErrorList(code, new String[0]);
    }
    
    /**
     * Create Message parameter of WebService Error result.<br />
     * Webサービスのエラー結果に含めるメッセージ・パラメータを作成します。
     *
     * @param args parameter of Message of Facade Service.<br />Facadeサービスのエラーメッセージのパラメータ
     * @return Inner Message by WebService Error result<br />Webサービスのエラー結果に含めるメッセージ・パラメータ
     */
    protected List<ErrorParamListItemDomain> getParamList(Object[] args) {
        List<ErrorParamListItemDomain> paramList = new ArrayList<ErrorParamListItemDomain>();
        
        if (args != null) {
            for (Object arg : args) {
                String param = arg.toString();
                
                paramList.add(new ErrorParamListItemDomain(param));
            }
        }
        
        return paramList;
    }

    /**
     * Get Language CD<br />
     * 言語コードを取得します。
     *
     * @return Language CD<br />言語コード
     */
    protected String getLanguageCd() {
        Locale locale = DensoContext.get().getLocale();

        /*
         * It was transmitted from the client side. "X-DC-LOCALE :  Since the locale is created from the ja_JP" header,
         *   "ja_JP" will be a LANGUAGE CODE.<br />
         * クライアント側から送信された「X-DC-LOCALE: ja_JP」ヘッダからロケールを作成しているので、
         * 「ja_JP」が言語コードとなってしまう。
         * 
         * @see java.util.Locale(String)
         */
        return locale.getLanguage().substring(0, 2);
    }

    /**
     * Processes when ApplicationException has occurred.
     * 
     * @param <T> type of result
     * @param e ApplicationException
     * @param resultType result type
     * @return result domain
     */
    protected <T extends ResultDomain> T processApplicationException(ApplicationException e, Class<T> resultType) {

        T result;

        try {

            result = resultType.newInstance();

        } catch (InstantiationException e1) {
            throw new IllegalArgumentException(e1);
        } catch (IllegalAccessException e1) {
            throw new IllegalArgumentException(e1);
        }

        if (e instanceof ValidationException) {
            result.setResultCode(WS_RESULT_ERROR);
            result.setErrorList(getErrorList(((ValidationException) e).getErrors()));

        } else if (e instanceof GscmApplicationException) {
            result.setResultCode(WS_RESULT_ERROR_SYSTEM);
            result.setErrorList(getErrorList(e.getCode(), ((GscmApplicationException) e).getArgs()));

        } else if (e.getCause() instanceof CannotAcquireLockException) {
            result.setResultCode(WS_RESULT_ERROR);
            result.setErrorList(getErrorList(NXS_E1_5004));

        } else {
            result.setResultCode(WS_RESULT_ERROR_SYSTEM);
            result.setErrorList(getErrorList(e.getCode()));
        }

        return result;
    }
}