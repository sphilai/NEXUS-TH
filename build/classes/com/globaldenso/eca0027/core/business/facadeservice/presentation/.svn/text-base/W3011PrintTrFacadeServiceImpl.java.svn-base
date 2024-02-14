/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ReceiveDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>PrintTr</p>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3011PrintTrFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3011ReceiveDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3011PrintTrFacadeServiceImpl() {
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
     * {@inheritDoc}
     * call l3004ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3011ReceiveDomain w3011ReceiveDomain)
        throws GscmApplicationException, ApplicationException {

        String trNo = w3011ReceiveDomain.getTrNo();
        
        // Create PDF File
        File pdfReport = w3TransferService.createPrintTrByParts(trNo);

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3011ReceiveDomain filterDomain(W3011ReceiveDomain w3011ReceiveDomain)
        throws GscmApplicationException, ApplicationException {

        return w3011ReceiveDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3011ReceiveDomain w3011ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  if TR_STATUS == '20' or '90', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3011ReceiveDomain w3011ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // transfer condition
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(w3011ReceiveDomain.getTrNo());

        // Search transfer information
        List<TtTransferDomain> listDomain = w3TransferService.validateDatabaseTrStatus(criteria); 

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if(listDomain.size() != 0){
            if (TR_STATUS_ISSUED_TR.equals(listDomain.get(0).getTrStatus())){
                messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                    new Object[] {listDomain.get(0).getTrStatus()}));
            }else if(TR_STATUS_CANCEL_TR.equals(listDomain.get(0).getTrStatus())){
                messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                    new Object[] {listDomain.get(0).getTrStatus()}));
            }
        }
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}
     * Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3011ReceiveDomain w3011ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
}
