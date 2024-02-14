/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Cancel TR
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008CancelTrFacadeServiceImpl extends
    AbstractUpdateFacadeService<W3TransferDomain, W3008CriteriaDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3008CancelTrFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for w3TransferService.
     * </p>
     * 
     * @param transferService Set for w3TransferService
     */
    public void setW3TransferService(W3TransferService transferService) {
        w3TransferService = transferService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3008CriteriaDomain filterDomain(
        W3008CriteriaDomain w3008CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w3008CriteriaDomain;
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
    protected void validateItems(W3008CriteriaDomain w3008CriteriaDomain)
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
    protected void validateConsistency(W3008CriteriaDomain w3008CriteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * if TR_STATUS != '20', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3008CriteriaDomain w3008CriteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        TtTransferCriteriaDomain ttTransferCriteriaDomain = new TtTransferCriteriaDomain();

        ttTransferCriteriaDomain.setTrNo(w3008CriteriaDomain.getTrNo());

        // PLTZ_STATUS Check
        TtTransferDomain domain = w3TransferService
            .validateDatabaseTrStatusByKey(ttTransferCriteriaDomain);

        if (!TR_STATUS_ISSUED_TR.equals(domain.getTrStatus())) {
            messageDomainList.add(new MessageDomain(null, NXS_E7_3009,
                new Object[] {domain.getTrStatus()}));
        }

        // If there is an error
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Update TR_STATUS to '90'
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3TransferDomain callServices(W3008CriteriaDomain w3008CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteriaDomain = new TtTransferCriteriaDomain();
        criteriaDomain.setTrNo(w3008CriteriaDomain.getTrNo());
        ttTransferDomain.setComUpdateFuncId(w3008CriteriaDomain.getScreenId());
        ttTransferDomain.setComUpdateUserId(w3008CriteriaDomain
            .getLoginUserDscId());
        ttTransferDomain.setTrStatus(TR_STATUS_CANCEL_TR);
        // Update TT_TRANSFER.TR_STATUS
        int count = w3TransferService
            .transactOnRegisterPartsTransferReportCancelTr(ttTransferDomain,
                criteriaDomain);
        W3TransferDomain cancelResult = new W3TransferDomain();
        cancelResult.setUpdateCnt(count);
        cancelResult.setTrNo(criteriaDomain.getTrNo());
        return cancelResult;
    }
}
