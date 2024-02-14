/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3010ReceiveDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>PrintTr</p>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010PrintTrFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3010ReceiveDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3010PrintTrFacadeServiceImpl() {
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
     * call l3003ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3010ReceiveDomain w3010ReceiveDomain)
        throws GscmApplicationException, ApplicationException {

        String trNo = w3010ReceiveDomain.getTrNo();
        
        // Create PDF File
        File pdfReport = w3TransferService.createPrintTrByCml(trNo);

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * no process
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3010ReceiveDomain filterDomain(W3010ReceiveDomain w3010ReceiveDomain)
        throws GscmApplicationException, ApplicationException {

        return w3010ReceiveDomain;
    }

    /**
     * {@inheritDoc}
     * no process
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3010ReceiveDomain w3010ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * if TR_STATUS == '20' or '90', error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3010ReceiveDomain w3010ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // transfer condition
        W3TransferCriteriaDomain criteria = createTransferCriteriaDomain(w3010ReceiveDomain);

        // Search transfer information
        List<? extends W3TransferDomain> listDomain = w3TransferService.validateDatabaseTrStatus(criteria); 

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if (TR_STATUS_ISSUED_TR.equals(listDomain.get(0).getTrStatus())){
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {listDomain.get(0).getTrStatus()}));
        }else if(TR_STATUS_CANCEL_TR.equals(listDomain.get(0).getTrStatus())){
            messageDomainList.add(new MessageDomain(null, NXS_E1_3004,
                new Object[] {listDomain.get(0).getTrStatus()}));
        }
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }
    
    /**
     * <p>Create transfer criteria</p>
     *
     * @param criteria W3010ReceiveDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3010ReceiveDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria, criteria.getDateFormat());
        return TransferCriteria;
    }

    /**
     * {@inheritDoc}
     * Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3010ReceiveDomain w3010ReceiveDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
}
