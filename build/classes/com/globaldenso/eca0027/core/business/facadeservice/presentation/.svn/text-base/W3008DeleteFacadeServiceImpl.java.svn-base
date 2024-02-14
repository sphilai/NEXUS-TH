/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>
 * Delete
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Void, W3008UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3008DeleteFacadeServiceImpl() {
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
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3008UpdateDomain filterDomain(W3008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - delete the records has been checked
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException {
        if (w3008UpdateDomain.getW3008ListDomainList() != null) {
            TwTransferItemItemNoCriteriaDomain twTransferItemItemNoCriteriaDomain = new TwTransferItemItemNoCriteriaDomain();
            for (W3008ListDomain w3008ListDomain : w3008UpdateDomain
                .getW3008ListDomainList()) {
                if (CHECK_ON.equals(w3008ListDomain.getSelected())) {
                    CommonUtil.copyPropertiesDomainToDomain(
                        twTransferItemItemNoCriteriaDomain, w3008ListDomain,
                        w3008UpdateDomain.getScreenDateFormat());
                    twTransferItemItemNoCriteriaDomain.setDscId(w3008ListDomain
                        .getLoginUserDscId());
                    twTransferItemItemNoCriteriaDomain
                        .setItemNo(w3008ListDomain.getItemNo());
                    twTransferItemItemNoCriteriaDomain.setPkgCd(w3008ListDomain
                        .getPkgCd());
                    w3TransferService
                        .deleteOnRegisterPartsTransferReportDelete(twTransferItemItemNoCriteriaDomain);
                }
            }
        }
        return null;
    }
}
