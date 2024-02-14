/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_RCV_METH_TYP_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ReceiveDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * FacadeServiceImpl class for Receive CML Transfer Report sreen receive function
 * 
 * @author SNT Ri
 * @version 1.0.0
 */
public class W3010ReceiveFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3010ReceiveDomain> {

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
    public W3010ReceiveFacadeServiceImpl() {
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
     * Update TT_PLTZ
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3010ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        criteria.setTrNo(criteriaDomain.getTrNo());

        Date date = new Date();
        ttTransferDomain.setTrStatus(TR_STATUS_RECEIVED_TR);
        ttTransferDomain.setTrRcvDscId(criteriaDomain.getLoginUserDscId());
        ttTransferDomain.setTrRcvDt(date);
        ttTransferDomain.setTrRcvMethTyp(TR_RCV_METH_TYP_TR);
        ttTransferDomain.setTrRcvNm(criteriaDomain.getUserName());
        ttTransferDomain.setComUpdateFuncId(SCREEN_ID_W3010);
        ttTransferDomain.setComUpdateUserId(criteriaDomain.getLoginUserDscId());

        w3TransferService.updateOnReceiveCmlTransferReportReceive(
            ttTransferDomain, criteria);

        for (int i = 0; i < criteriaDomain.getW3010ListDomainList().size(); i++ ) {
            ttPltzDomain.setLastTrStatus(TR_STATUS_RECEIVED_TR);
            ttPltzDomain.setLastTrRcvDt(date);
            ttPltzDomain.setComUpdateFuncId(SCREEN_ID_W3010);
            ttPltzDomain.setComUpdateUserId(criteriaDomain.getLoginUserDscId());
            ttPltzCriteriaDomain.setMainMark(criteriaDomain
                .getW3010ListDomainList().get(i).getMainMark());
            w3TransferService.updateOnReceiveCmlTransferReportReceiveTtPltz(
                ttPltzDomain, ttPltzCriteriaDomain);
        }

        return null;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3010ReceiveDomain filterDomain(W3010ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * if TR_STATUS == '20', '40' or '90', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3010ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        // transfer condition
        W3TransferCriteriaDomain criteria = createTransferCriteriaDomain(criteriaDomain);

        // Search transfer information
        List<? extends W3TransferDomain> listDomain = w3TransferService
            .validateDatabaseTrStatus(criteria);

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if (TR_STATUS_ISSUED_TR.equals(listDomain.get(0).getTrStatus())) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {listDomain.get(0).getTrStatus()}));
        } else if (TR_STATUS_RECEIVED_TR.equals(listDomain.get(0).getTrStatus())) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {listDomain.get(0).getTrStatus()}));
        } else if (TR_STATUS_CANCEL_TR.equals(listDomain.get(0).getTrStatus())) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {listDomain.get(0).getTrStatus()}));
        }
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * <p>
     * Create transfer criteria
     * </p>
     * 
     * @param criteria W3010ReceiveDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(
        W3010ReceiveDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria,
            criteria.getDateFormat());
        return TransferCriteria;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3010ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3010ReceiveDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

}
