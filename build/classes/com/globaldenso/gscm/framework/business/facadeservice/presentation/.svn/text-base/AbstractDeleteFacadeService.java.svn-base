/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 削除用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for deletion
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
 * 削除用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for deletion
 * <p>
 * 削除用FacadeServiceのAbstractクラスです。
 * Abstract Class of FacadeService for deletion
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public abstract class AbstractDeleteFacadeService<R, A extends AbstractDomain> extends
    AbstractFacadeService<R, A> implements DeleteFacadeService<R, A> {

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService#delete(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    public R delete(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException {
        return super.execute(argDomain);
    }
}
