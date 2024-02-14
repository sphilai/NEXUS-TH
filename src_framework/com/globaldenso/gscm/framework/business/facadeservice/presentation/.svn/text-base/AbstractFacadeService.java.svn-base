/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * FacadeServiceの基底クラス
 * Super Class of FacadeService
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.exception.ValidationWarningException;

/**
 * FacadeServiceの基底クラス
 * Super Class of FacadeService
 * <p>
 * FacadeServiceの基底クラスです。
 * Super Class of FacadeService
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 公開メソッドの戻り値
 * @param <R> Return value of public method
 * @param <A> 公開メソッドの引数
 * @param <A> Argument of public method
 */
public abstract class AbstractFacadeService<R, A extends AbstractDomain> {
    /**
     * FacadeServiceの処理を実行する。
     * Execute FacadeService
     * <p>
     * FacadeServiceの処理を実行する。<br/>
     * Execute FacadeService<br/>
     * 処理順序は以下のとおり<br/>
     * Process sequence is as below<br/>
     * filterDomain<br/>
     * validateItem<br/>
     * validateConsistency<br/>
     * validateDatabase<br>
     * callService
     * </p>
     * 
     * @param argDomain ドメイン
     * @param argDomain Domain
     * @return 処理結果
     * @return Process result
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ValidationException 検証エラー
     * @throws ValidationException Validation exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected R execute(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException {
        A filterDomain = filterDomain(argDomain);
        validateItems(filterDomain);
        validateConsistency(filterDomain);
        validateDatabase(filterDomain);

        if (null != argDomain && argDomain.isCheckValidateWarning()) {
            validateWarning(filterDomain);
        }
        return callServices(filterDomain);
    }

    /**
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * Check the contents of Domain of the argument and specify Domain for processing 
     * <p>
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * Check the contents of Domain of the argument and specify Domain for processing
     * </p>
     * 
     * @param argDomain ドメイン
     * @param argDomain Domain
     * @return 処理結果
     * @return Process result
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected abstract A filterDomain(A argDomain) throws GscmApplicationException,
        ApplicationException;

    /**
     * 単項目チェックを行う。
     * Validate an item
     * <p>
     * 単項目チェックを行う。
     * Validate an item
     * </p>
     * 
     * @param filterDomain ドメイン
     * @param filterDomain Domain
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ValidationException 検証エラー
     * @throws ValidationException Validation exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected abstract void validateItems(A filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException;

    /**
     * 整合性チェックを行う。
     * Check the consistency
     * <p>
     * 整合性チェックを行う。
     * Check the consistency
     * </p>
     * 
     * @param filterDomain ドメイン
     * @param filterDomain Domain
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ValidationException 検証エラー
     * @throws ValidationException Validation exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected abstract void validateConsistency(A filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException;

    /**
     * データベースチェックを行う。
     * Validate the database
     * <p>
     * データベースチェックを行う。
     * Validate the database
     * </p>
     * 
     * @param filterDomain ドメイン
     * @param filterDomain Domain
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ValidationException 検証エラー
     * @throws ValidationException Validation exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected abstract void validateDatabase(A filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException;

    /**
     * 業務処理Serviceの呼び出しを行う。
     * Invoke the service of work process
     * <p>
     * 業務処理Serviceの呼び出しを行う。
     * Invoke the service of work process
     * </p>
     * 
     * @param filterDomain ドメイン
     * @param filterDomain Domain
     * @return 処理結果
     * @return Process result
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    protected abstract R callServices(A filterDomain) throws GscmApplicationException,
        ApplicationException;

    /**
     * ワーニングチェックを行う。
     * Validate Warning
     * <p>
     * ワーニングチェックを行う。
     * Validate Warning
     * </p>
     * 
     * @param filterDomain ドメイン
     * @param filterDomain Domain
     * @throws ValidationWarningException ワーニング
     * @throws ValidationWarningException Warning exception
     */
    protected void validateWarning(A filterDomain) throws ValidationWarningException {
    }
}
