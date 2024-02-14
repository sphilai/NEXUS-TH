/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0359;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Register TR
 * </p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<W3TransferDomain, W3006UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3006RegisterFacadeServiceImpl() {
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
    protected W3006UpdateDomain filterDomain(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w3006UpdateDomain;
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
    protected void validateItems(W3006UpdateDomain w3006UpdateDomain)
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
    protected void validateConsistency(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * validateDatabase
     *  if TT_PLTZ record does not exist, error
     *  if PLTZ_STATUS != '10', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        TtPltzCriteriaDomain ttPltz = new TtPltzCriteriaDomain();
        TtPltzDomain result = new TtPltzDomain();
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        if (w3006UpdateDomain.getW3006ListDomainList() != null) {
            for (int i = 0; i < w3006UpdateDomain.getW3006ListDomainList()
                .size(); i++ ) {
                ttPltz.setMainMark(w3006UpdateDomain.getW3006ListDomainList()
                    .get(i).getMainMark());
                result = w3TransferService.validateDatabasePltz(ttPltz);

                if (result == null) {
                    messageDomainList.add(new MessageDomain(null, NXS_E1_0359,
                        new Object[] {null}));
                    throw new ValidationException(messageDomainList);
                } else if (!PLTZ_STATUS_PLTZ.equals(result.getPltzStatus())) {
                    messageDomainList.add(new MessageDomain(null, NXS_E1_3010,
                        new Object[] {ttPltz.getMainMark(),
                            result.getPltzStatus()}));
                    throw new ValidationException(messageDomainList);
                }
            }
        }
    }

    /**
     * {@inheritDoc}.
     * Insert TT_TRANSFER
     * Insert TT_TRANSFER_ITEM_PLTZ
     * Update TT_PLTZ.LAST_TR_STATUS to '20'
     * Delete TW_TRANSFER_ITEM_PLTZ
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3TransferDomain callServices(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException {
        return w3TransferService
            .transactOnRegisterCmlTransferReportRegister(w3006UpdateDomain);
    }
}
