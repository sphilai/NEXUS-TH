/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;


import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * FacadeServiceImpl class for Carry out Header initialized Action.
 * 
 * <pre>
 * bean id: w3002InitFacadeServiceImpl
 * </pre>
 * 
 * @author TIS Tanaka
 * @version 1.0.0
 */
public class W3002InitFacadeServiceImpl extends AbstractDeleteFacadeService<Integer, W3002CriteriaDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>
     * CommonService
     * </p>
     */
    protected CommonService commonService;
    
    /**
     * <p>
     * constructor method.
     * </p>
     */
    public W3002InitFacadeServiceImpl() {
        super();
    }

    /**
     * <p>Setter method for w3TransferService.</p>
     *
     * @param transferService Set for w3TransferService
     */
    public void setW3TransferService(W3TransferService transferService) {
        w3TransferService = transferService;
    }
    
    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    
    /**
     * {@inheritDoc} Delete Work Tables
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W3002CriteriaDomain filterDomain)
        throws GscmApplicationException, ApplicationException {
        
        int deleteCnt = 0;
        TwCarryOutListPltzCriteriaDomain twCarryOutListPltzCriteriaDomain = new TwCarryOutListPltzCriteriaDomain();
        TwCarryOutListItemNoCriteriaDomain twCarryOutListItemNoCriteriaDomain = new TwCarryOutListItemNoCriteriaDomain();
        TwTransferItemPltzCriteriaDomain twTransferItemPltzCriteriaDomain = new TwTransferItemPltzCriteriaDomain();
        TwTransferItemItemNoCriteriaDomain twTransferItemItemNoCriteriaDomain = new TwTransferItemItemNoCriteriaDomain();
        
        // Obtain DSC-ID from DensoContext
        String dscId = (String)DensoContext.get().getDscId();
        
        twCarryOutListPltzCriteriaDomain.setDscId(dscId);
        twCarryOutListPltzCriteriaDomain.setSearchCountCheckFlg(false);
        twCarryOutListItemNoCriteriaDomain.setDscId(dscId);
        twCarryOutListItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        twTransferItemPltzCriteriaDomain.setDscId(dscId);
        twTransferItemPltzCriteriaDomain.setSearchCountCheckFlg(false);
        twTransferItemItemNoCriteriaDomain.setDscId(dscId);
        twTransferItemItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        
        if(w3TransferService.searchCountTwCarryOutListPltz(twCarryOutListPltzCriteriaDomain) != 0){
            deleteCnt = w3TransferService.deleteTwCarryOutListPltz(twCarryOutListPltzCriteriaDomain);
        }
        if(w3TransferService.searchCountTwCarryOutListItemNo(twCarryOutListItemNoCriteriaDomain) != 0){
            deleteCnt = deleteCnt + w3TransferService.deleteTwCarryOutListItemNo(twCarryOutListItemNoCriteriaDomain);
        }
        if(w3TransferService.searchCountTwTransferItemPltz(twTransferItemPltzCriteriaDomain) != 0){
            deleteCnt = deleteCnt + w3TransferService.deleteTwTransferItemPltz(twTransferItemPltzCriteriaDomain);
        }
        if(w3TransferService.searchCountTwTransferItemItemNo(twTransferItemItemNoCriteriaDomain) != 0){
            deleteCnt = deleteCnt + w3TransferService.deleteTwTransferItemItemNo(twTransferItemItemNoCriteriaDomain);
        }
        return deleteCnt;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3002CriteriaDomain filterDomain(W3002CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No process
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No process
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No process
    }

}
