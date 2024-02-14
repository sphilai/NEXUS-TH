/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsB009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaOdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsCigmaOdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class WsB009FacadeServiceImpl extends AbstractCreateFacadeService<ResultDomain, WsB009CriteriaDomain> {

    /**
     * wsCigmaMaMng Service<br />
     * wsCigmaMaMngサービス
     */
    protected WsCigmaOdrRcvService wsCigmaOdrRcvService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public WsB009FacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for wsCigmaOdrRcvService.
     *
     * @param wsCigmaOdrRcvService Set for wsCigmaOdrRcvService
     */
    public void setWsCigmaOdrRcvService(WsCigmaOdrRcvService wsCigmaOdrRcvService) {
        this.wsCigmaOdrRcvService = wsCigmaOdrRcvService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WsB009CriteriaDomain filterDomain(WsB009CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        return criteria;
    }
    
    /**
     * {@inheritDoc}
     * Check a single item.
     * <br />単項目チェックを行います。
     * <pre>
     * No action
     * 処理なし
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WsB009CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * Check a consistency.
     * <br />整合性チェックを行います。
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WsB009CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WsB009CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected ResultDomain callServices(WsB009CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException, ValidationException {


        ResultDomain resultDomain = new ResultDomain(WS_RESULT_SUCCESS);
        
        WsCigmaOdrRcvCriteriaDomain odrRcvCriteria = new WsCigmaOdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(odrRcvCriteria, criteria);
        
        wsCigmaOdrRcvService.createEdiOdrEntryJob(odrRcvCriteria);
        
        return resultDomain;
    }
}
