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
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3003CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>PrintForUpdate</p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3003PrintListForUpdateFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3003CriteriaDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3003PrintListForUpdateFacadeServiceImpl() {
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
     * call l3001ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3003CriteriaDomain w3003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        /* Chonthicha start
        String dscId = w3003CriteriaDomain.getLoginUserDscId(); */
        L3001ReportDomain l3001ReportDomain = new L3001ReportDomain();
        CommonUtil.copyPropertiesDomainToDomain(l3001ReportDomain, w3003CriteriaDomain);

        // Create PDF File
        File pdfReport = w3TransferService.printCarryOutListByCml(l3001ReportDomain);
        // Chonthicha end

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3003CriteriaDomain filterDomain(W3003CriteriaDomain w3003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w3003CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3003CriteriaDomain w3003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  if there is no record in TW_CARRY_OUT_LIST_PLTZ, error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3003CriteriaDomain w3003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        TwCarryOutListPltzCriteriaDomain twCarryOutListPltzCriteriaDomain = new TwCarryOutListPltzCriteriaDomain();
        twCarryOutListPltzCriteriaDomain.setDscId(w3003CriteriaDomain.getLoginUserDscId());
        twCarryOutListPltzCriteriaDomain.setSearchCountCheckFlg(false);
        // TW_CARRY_OUT_LIST_MM Check
        int count = w3TransferService
            .validateDatabaseTwCarryOutListPltz(twCarryOutListPltzCriteriaDomain);

        if (count == 0) {
            messageDomainList.add(new MessageDomain(null, GSCM_E0_0001,
                new Object[] {"Main Mark"}));
        }

        // If there is an error
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
    protected void validateItems(W3003CriteriaDomain w3003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
}
