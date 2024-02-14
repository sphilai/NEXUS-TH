/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_RCV_METH_TYP_TR;

import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ReceiveDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * FacadeServiceImpl class for Receive Parts Transfer Report screen
 * 
 * @author SNT Ri
 * @version 1.0.0
 */
public class W3011ReceiveFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3011ReceiveDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>
     * constructor method.
     * </p>
     */
    public W3011ReceiveFacadeServiceImpl() {
        super();
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
     * {@inheritDoc}
     * Update TT_TRANSFER
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3011ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(criteriaDomain.getTrNo());

        ttTransferDomain.setTrStatus(TR_STATUS_RECEIVED_TR);
        ttTransferDomain.setTrRcvDscId(criteriaDomain.getLoginUserDscId());
        ttTransferDomain.setTrRcvDt(new Date());
        ttTransferDomain.setTrRcvMethTyp(TR_RCV_METH_TYP_TR);
        ttTransferDomain.setTrRcvNm(criteriaDomain.getUserName());
        ttTransferDomain.setComUpdateFuncId(SCREEN_ID_W3011);
        ttTransferDomain.setComUpdateUserId(criteriaDomain.getLoginUserDscId());

        w3TransferService.updateOnReceiveCmlTransferReportReceive(
            ttTransferDomain, criteria);

        return null;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3011ReceiveDomain filterDomain(W3011ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3011ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3011ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3011ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

}
