/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 検索用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for search
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
 * 検索用FacadeServiceのAbstractクラス
 * Abstract Class of FacadeService for search
 * <p>
 * 検索用FacadeServiceのAbstractクラスです。
 * Abstract Class of FacadeService for search
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @param <R> 戻り値の型
 * @param <R> Type of return value
 * @param <A> 引数の型
 * @param <A> Type of argument
 */
public abstract class AbstractSearchFacadeService<R, A extends AbstractDomain> extends
    AbstractFacadeService<R, A> implements SearchFacadeService<R, A> {

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService#search(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    public R search(A argDomain) throws GscmApplicationException, ValidationException,
        ApplicationException {
        return super.execute(argDomain);
    }
}
