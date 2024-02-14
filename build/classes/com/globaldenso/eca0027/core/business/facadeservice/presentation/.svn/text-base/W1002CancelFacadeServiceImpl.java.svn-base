/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1002UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of Export Request
 * <br />Export RequestのCancelFacadeサービス実装クラスです。
 * <pre>
 * bean id:W1002CancelFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1002CancelFacadeServiceImpl 
    extends AbstractTransactFacadeService<Void, W1002UpdateDomain> {

    /**
     * W1001ExpRequest service
     * <br />梱包指示サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;

    /**
     * constructor.
     */
    public W1002CancelFacadeServiceImpl() {
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1002UpdateDomain filterDomain(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W1002CriteriaDomain> valid 
            = new Validator<W1002CriteriaDomain>(updateDomain.getCriteriaDomain(), "w1002CriteriaDomain");

        // digit number, an attribute, form check (peculiar to a screen)  
        // 桁数、属性、書式チェック(画面固有)
        String[] properties = {
            "expRequestNo" ,
            "requestStatus" 
        };
        valid.isValidateProperties(properties, SCREEN_ID_W1002);
    
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W1002UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W1001ExpRequestDomain expRequest = createExpRequest(updateDomain);
        
        w1001ExpRequestService.transactOnCancel(expRequest);
       
        return null;
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#createExpRequest(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected W1001ExpRequestDomain createExpRequest(W1002UpdateDomain updateDomain) {
        
        W1001ExpRequestDomain expRequest = new W1001ExpRequestDomain();
        
        // A setting domain
        CommonUtil.copyPropertiesDomainToDomain(expRequest, updateDomain.getCriteriaDomain(), updateDomain.getCriteriaDomain().getScreenDateFormat());
        
        return expRequest;
    }
    
}
