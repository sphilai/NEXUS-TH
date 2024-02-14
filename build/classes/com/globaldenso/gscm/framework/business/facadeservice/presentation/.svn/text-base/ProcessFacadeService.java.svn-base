/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * その他処理（トランザクション不要）FacadeServiceのインターフェイス
 * Interface of FacadeService for other process(transaction unnecessary)
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

/**
 * その他処理（トランザクション不要）FacadeServiceのインターフェイス
 * Interface of FacadeService for other process(transaction unnecessary)
 * <p>
 * その他処理（トランザクション不要）FacadeServiceのインターフェイスです。
 * Interface of FacadeService for other process(transaction unnecessary)
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public interface ProcessFacadeService<R, A extends AbstractDomain> {

    /**
     * その他処理用FacadeServiceの公開メソッド
     * Public method of FacadeService for other process
     * <p>
     * その他処理用FacadeServiceの公開メソッドです。
     * Public method of FacadeService for other process
     * </p>
     * 
     * @param argDomain 引数
     * @param argDomain Argument
     * @return 処理結果
     * @return Process result
     * @throws GscmApplicationException 業務エラー
     * @throws GscmApplicationException Work exception
     * @throws ValidationException 検査エラー
     * @throws ValidationException Validation exception
     * @throws ApplicationException エラー
     * @throws ApplicationException Application exception
     */
    public R process(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException;
}
