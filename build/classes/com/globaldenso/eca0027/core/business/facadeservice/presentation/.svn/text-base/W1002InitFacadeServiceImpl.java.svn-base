/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1002UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  The implementation class for facade service to initial action of Export Request screen.
 * <br />Export Request画面のInitアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1002InitFacadeServiceImpl extends
    AbstractTransactFacadeService<W1002UpdateDomain, W1002CriteriaDomain> {

    /**
     * Export Request service<br />
     */
    protected W1001ExpRequestService w1001ExpRequestService;

    /**
     * Default constructor.<br />
     */
    public W1002InitFacadeServiceImpl() {
    }
   

    /**
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
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
    protected W1002CriteriaDomain filterDomain(W1002CriteriaDomain expRequestDomain)
        throws GscmApplicationException, ApplicationException {
        return expRequestDomain;
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
    protected void validateConsistency(W1002CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
       
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
    protected void validateItems(W1002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
    protected void validateDatabase(W1002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result.
     * </pre>
     * <pre>
     * 検索データの取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1002UpdateDomain callServices(W1002CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W1001ExpRequestCriteriaDomain criteriaDomain = createExpRequestCriteria(criteria);

        W1002CriteriaDomain domain = w1001ExpRequestService.searchOnEditInit(criteriaDomain);
        CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
        
        W1002UpdateDomain updateDomain = new W1002UpdateDomain();
        updateDomain.setCriteriaDomain(criteria);
        
        return updateDomain;
    }
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteriaDomain W1002CriteriaDomain
     * @return expRequestCriteria
     */
    protected W1001ExpRequestCriteriaDomain createExpRequestCriteria(
        W1002CriteriaDomain criteriaDomain) {

        W1001ExpRequestCriteriaDomain expRequestCriteria = new W1001ExpRequestCriteriaDomain();

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        expRequestCriteria.setScreenId(criteriaDomain.getScreenId());
        expRequestCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        CommonUtil
            .copyPropertiesDomainToDomain(expRequestCriteria, criteriaDomain);

        return expRequestCriteria;
    }
}
