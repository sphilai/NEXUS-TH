/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9004UserIdMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * The implementation class for facade service to initial action of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面のInitアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9004InitFacadeServiceImpl extends AbstractProcessFacadeService<Void, W9004CriteriaDomain> {

    /**
     * User ID MA service<br />
     * User ID MAのサービス
     */
    @SuppressWarnings("unused")
    protected W9004UserIdMaService w9004UserIdMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9004InitFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w9004UserIdMaService.
     *
     * @param userIdMaService Set for w9004UserIdMaService
     */
    public void setW9004UserIdMaService(W9004UserIdMaService userIdMaService) {
        w9004UserIdMaService = userIdMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>    
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W9004CriteriaDomain filterDomain)
        throws GscmApplicationException, ApplicationException {
        return null;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>    
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9004CriteriaDomain filterDomain(W9004CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>    
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9004CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>    
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9004CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>    
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9004CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

}
