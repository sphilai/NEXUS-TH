/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 複合処理用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for compound process
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
 * 複合処理用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for compound process
 * <p>
 * 複合処理用FacadeServiceのAbstractクラスです。
 * Abstract Class of FacadeService for compound process
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public abstract class AbstractTransactFacadeService<R, A extends AbstractDomain> extends
    AbstractFacadeService<R, A> implements TransactFacadeService<R, A> {

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService#transact(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    public R transact(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException {
        return super.execute(argDomain);
    }
}
