/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
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
public class W3001ConfirmDetailFacadeServiceImpl extends AbstractProcessFacadeService <Void, W3001ListDomain> {

    /**
     * <p>constructor.</p>
     *
     */
    public W3001ConfirmDetailFacadeServiceImpl() {
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
