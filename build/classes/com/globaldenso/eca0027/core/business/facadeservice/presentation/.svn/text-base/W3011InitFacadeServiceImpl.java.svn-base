/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * FacadeServiceImpl class for Receive Parts Transfer Report screen initialized
 * Action.
 * 
 * <pre>
 * bean id: w3011InitFacadeServiceImpl
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.0.0
 */
public class W3011InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3011ListDomain>, W3011CriteriaDomain> {

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
    public W3011InitFacadeServiceImpl() {
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
     * initial search
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W3011ListDomain> callServices(
        W3011CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // transfer condition
        W3TransferCriteriaDomain criteria = createTransferCriteriaDomain(criteriaDomain);

        // Search transfer information
        List<? extends W3TransferDomain> listDomain = searchTransfer(criteria);

        // Convert result to list Domain
        List<? extends W3011ListDomain> w3011ResultList = convertToListDomain(
            listDomain, criteriaDomain.getScreenDateFormat());

        return w3011ResultList;
    }

    /**
     * <p>
     * Call W3transferService.searchRecievePartsTransferReportInit
     * </p>
     * 
     * @param criteriaDomain criteria
     * @return return return
     * @throws ApplicationException exception
     */
    @SuppressWarnings("unchecked")
    protected List<? extends W3TransferDomain> searchTransfer(
        W3TransferCriteriaDomain criteriaDomain) throws ApplicationException {
        return w3TransferService
            .searchRecievePartsTransferReportInit(criteriaDomain);
    }

    /**
     * <p>
     * Convert to W3011ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3011ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3011ListDomain> listDomainList = new ArrayList<W3011ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3011ListDomain listDomain = new W3011ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer,
                    dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3011CriteriaDomain filterDomain(
        W3011CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }
    
    /**
     * <p>Create transfer criteria</p>
     *
     * @param criteria w3011CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3011CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria, criteria.getDateFormat());
        return TransferCriteria;
    }

}
