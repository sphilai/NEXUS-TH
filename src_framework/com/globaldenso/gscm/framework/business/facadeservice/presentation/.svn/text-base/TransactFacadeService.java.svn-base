/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 複合処理用FacadeServiceのインターフェイス
 * Interface of FacadeService for compound process
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
 * 複合処理用FacadeServiceのインターフェイス
 * Interface of FacadeService for compound process
 * <p>
 * 複合処理用FacadeServiceのインターフェイスです。
 * Interface of FacadeService for compound process
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public interface TransactFacadeService<R, A extends AbstractDomain> {

    /**
     * 複合処理用FacadeServiceの公開メソッド
     * Public method of FacadeService for compound process
     * <p>
     * 複合処理用FacadeServiceの公開メソッドです。
     * Public method of FacadeService for compound process
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
    public R transact(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException;
}
