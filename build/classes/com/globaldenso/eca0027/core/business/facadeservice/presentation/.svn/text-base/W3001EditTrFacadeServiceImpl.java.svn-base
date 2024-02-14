/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author Chaiporn
 * @version 1.00
 */
public class W3001EditTrFacadeServiceImpl extends AbstractProcessFacadeService<Void, W3001ListDomain> {

    /**
     * <p>Implement W3TransferService</p>
     */
    protected W3TransferService w3TransferService;
    

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public W3001EditTrFacadeServiceImpl() {
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
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3001ListDomain filterDomain(W3001ListDomain w3001ListDomain)
        throws GscmApplicationException, ApplicationException {
        //Check if selected TR from screen or not
        if (StringUtils.isEmpty(w3001ListDomain.getTrNo()))  {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        return w3001ListDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3001ListDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3001ListDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String trNo = filterDomain.getTrNo();
        //Validate Authority 
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setTrItemTyp(filterDomain.getTrItemTyp());
        criteria.setUserAuthList(filterDomain.getUserAuthList());
        // Check if user has authority to permit
        if (!w3TransferService.validateDatabaseAuthorityCheckOnCarryOutMain(criteria)) {
            errList.add(new MessageDomain("", GSCM_I0_0009, null));
            throw new ValidationException(errList);
        }
        // Check if status is valid same as activate
        if (!w3TransferService.validateDatabaseTtTransferOnCarryOutMainActivate(trNo)) {
            // If Status is invalid throw exception
            Object[] params = {(String)filterDomain.getTrStatus()};
            errList.add(new MessageDomain("", NXS_E1_3004, params));
            throw new ValidationException(errList);
        }
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3001ListDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3001ListDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        return null;
    }
}
