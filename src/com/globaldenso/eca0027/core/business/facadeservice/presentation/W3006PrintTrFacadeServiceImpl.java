/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Print TR
 * </p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006PrintTrFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3006UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3006PrintTrFacadeServiceImpl() {
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
     * Print TR
     *  call l3003ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        String trNo = w3006UpdateDomain.getTrNo();

        // Create PDF File
        File pdfReport = w3TransferService
            .printTransferReportByCml(trNo);

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3006UpdateDomain filterDomain(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w3006UpdateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  if TT_PLTZ record does not exist, error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        if (w3006UpdateDomain.getW3006ListDomainList() != null) {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            for (W3006ListDomain w3006ListDomain : w3006UpdateDomain
                .getW3006ListDomainList()) {
                ttPltzCriteriaDomain.setMainMark(w3006ListDomain.getMainMark());
                ttPltzCriteriaDomain.setSearchCountCheckFlg(false); 
                int count = w3TransferService
                    .validateDatabaseTrStatus(ttPltzCriteriaDomain);

                if (count == 0) {
                    messageDomainList.add(new MessageDomain(null, GSCM_E0_0001,
                        new Object[] {"Main Mark"}));
                }
            }
        }

        // If there is an error
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc} Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3006UpdateDomain w3006UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }
}
