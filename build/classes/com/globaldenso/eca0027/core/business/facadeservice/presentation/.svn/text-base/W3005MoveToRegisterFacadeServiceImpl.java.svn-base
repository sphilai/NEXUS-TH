/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0354;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Move to register
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005MoveToRegisterFacadeServiceImpl extends
    AbstractSearchFacadeService<Integer, W3005CriteriaDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3005MoveToRegisterFacadeServiceImpl() {
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
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3005CriteriaDomain filterDomain(
        W3005CriteriaDomain w3005CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w3005CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3005CriteriaDomain w3005CriteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3005CriteriaDomain w3005CriteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3005CriteriaDomain w3005CriteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * If there is no record in TW_TRANSFER_ITEM_PLTZ, error
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W3005CriteriaDomain w3005CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        TwTransferItemPltzCriteriaDomain twTransferItemPltzCriteriaDomain = new TwTransferItemPltzCriteriaDomain();

        twTransferItemPltzCriteriaDomain.setDscId(w3005CriteriaDomain
            .getLoginUserDscId());
        twTransferItemPltzCriteriaDomain.setLanguageCd(w3005CriteriaDomain
            .getLanguageCd());
        int count = 0;
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        try {
            count = w3TransferService
                .validateDatabaseTwTransferItemPltz(twTransferItemPltzCriteriaDomain);
        } catch (Exception e) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_0354,
                new Object[] {null}));
            throw new ValidationException(messageDomainList);
        }
        return count;
    }
}
