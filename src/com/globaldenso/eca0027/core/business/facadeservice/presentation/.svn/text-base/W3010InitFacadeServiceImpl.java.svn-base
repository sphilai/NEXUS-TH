/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * FacadeServiceImpl class for Receive CML Transfer Report sreen initialized
 * Action.
 * 
 * <pre>
 * bean id: w3010InitFacadeServiceImpl
 * </pre>
 * 
 * @author SNT Ri
 * @version 1.0.0
 */
public class W3010InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3010ListDomain>, W3010CriteriaDomain> {

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
    public W3010InitFacadeServiceImpl() {
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
    protected List<? extends W3010ListDomain> callServices(
        W3010CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // transfer condition
        W3TransferCriteriaDomain criteria = createTransferCriteriaDomain(criteriaDomain);
        criteria.setTrNo(criteriaDomain.getTrNo());

        // Search transfer information
        List<? extends W3TransferDomain> listDomain = searchTransfer(criteria);

        // Convert result to list Domain
        List<? extends W3010ListDomain> w3010ResultList = convertToListDomain(
            listDomain, criteriaDomain.getScreenDateFormat());

        return w3010ResultList;
    }

    /**
     * <p>
     * Call W3transferService.searchRecieveCmlTransferReportInit
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
            .searchRecieveCmlTransferReportInit(criteriaDomain);
    }

    /**
     * <p>
     * Conver to W3010ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3010ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3010ListDomain> listDomainList = new ArrayList<W3010ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3010ListDomain listDomain = new W3010ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer,
                    dateFormat);

                // Gross weight format setting
                if (transfer.getGrossWeight() == null) {
                    listDomain.setGrossWeight(NO_DATA);
                } else {
                    listDomain.setGrossWeight(NumberUtil.format(transfer.getGrossWeight(), FORMAT_WEIGHT));
                }

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
    protected W3010CriteriaDomain filterDomain(
        W3010CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc} no process
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }
    
    /**
     * <p>Create transfer criteria</p>
     *
     * @param criteria w3010CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3010CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria, criteria.getDateFormat());
        return TransferCriteria;
    }

}
