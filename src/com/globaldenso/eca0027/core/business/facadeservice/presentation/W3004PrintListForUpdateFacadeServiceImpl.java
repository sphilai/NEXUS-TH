/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0351;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3004CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>PrintForUpdate</p>
 * 
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004PrintListForUpdateFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W3004CriteriaDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3004PrintListForUpdateFacadeServiceImpl() {
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
     * call l3002ReportService
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected File callServices(W3004CriteriaDomain w3004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Chonthicha
        // String dscId = w3004CriteriaDomain.getLoginUserDscId();

        L3002ReportDomain l3002ReportDomain = new L3002ReportDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(l3002ReportDomain, w3004CriteriaDomain);

        
        // Create PDF File
        File pdfReport = w3TransferService.printCarryOutListByParts(l3002ReportDomain);

        return pdfReport;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3004CriteriaDomain filterDomain(W3004CriteriaDomain w3004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w3004CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3004CriteriaDomain w3004CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  if there is no record in TW_CARRY_OUT_LIST_ITEM_NO, error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3004CriteriaDomain w3004CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        TwCarryOutListItemNoCriteriaDomain twCarryOutListItemNoCriteriaDomain = new TwCarryOutListItemNoCriteriaDomain();
        twCarryOutListItemNoCriteriaDomain.setDscId(w3004CriteriaDomain.getLoginUserDscId());
        twCarryOutListItemNoCriteriaDomain.setSearchCountCheckFlg(false);
        // TW_CARRY_OUT_LIST_ITEM_NO Check
        int count = w3TransferService
            .validateDatabaseTwCarryOutListItemNo(twCarryOutListItemNoCriteriaDomain);

        if (count == 0) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_0351, null));
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
    protected void validateItems(W3004CriteriaDomain w3004CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
}
