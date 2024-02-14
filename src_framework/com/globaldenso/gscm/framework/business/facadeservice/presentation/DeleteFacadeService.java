/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 削除用FacadeServiceのインターフェイス
 * Interface of FacadeService for deletion
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
 * 削除用FacadeServiceのインターフェイス
 * Interface of FacadeService for deletion
 * <p>
 * 削除用FacadeServiceのインターフェイスです。
 * Interface of FacadeService for deletion
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public interface DeleteFacadeService<R, A extends AbstractDomain> {

    /**
     * 削除用FacadeServiceの公開メソッド
     * Public method of FacadeService for deletion
     * <p>
     * 削除用FacadeServiceの公開メソッドです。
     * Public method of FacadeService for deletion
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
    public R delete(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException;
}
