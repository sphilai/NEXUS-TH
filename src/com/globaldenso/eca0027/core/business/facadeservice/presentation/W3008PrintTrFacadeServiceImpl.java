/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
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
 * @author SNT riku
 * @version 1.00
 */
public class W3008PrintTrFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3008UpdateDomain> {

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
    public W3008PrintTrFacadeServiceImpl() {
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
     * call l3002ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // Chonthicha.A Start
        //L3002ReportDomain l3002ReportDomain = new L3002ReportDomain();

        //CommonUtil.copyPropertiesDomainToDomain(l3002ReportDomain,
        //    w3008UpdateDomain);
        // Create PDF File
        //File pdfReport = w3TransferService
        //    .printCarryOutListByParts(l3002ReportDomain);
        File pdfReport = w3TransferService.printTransferReportByItemNo(w3008UpdateDomain.getTrNo());
        // Chonthicha.A End

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3008UpdateDomain filterDomain(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w3008UpdateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  if TR_STATUS = '90', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        TtTransferCriteriaDomain ttTransferCriteriaDomain = new TtTransferCriteriaDomain();
        ttTransferCriteriaDomain.setTrNo(w3008UpdateDomain.getTrNo());
        // TT_TRANSFER Check
        TtTransferDomain domain = w3TransferService
            .validateDatabaseTrStatusByKey(ttTransferCriteriaDomain);

        if (TR_STATUS_CANCEL_TR.equals(domain.getTrStatus())) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {domain.getTrStatus()}));
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
    protected void validateItems(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }
}
