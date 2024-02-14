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
import com.globaldenso.eca0027.core.business.domain.W3006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * <p>Search</p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W3006ListDomain>, W3006CriteriaDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3006InitFacadeServiceImpl() {
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
     * Search with criteria
     *      -Count number of TR result
     *      -Get Page info
     *      -Search transfer information
     *      -Convert result to list Domain
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected List<? extends W3006ListDomain> callServices(W3006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // transfer condition
        W3TransferCriteriaDomain criteria = createTransferCriteriaDomain(criteriaDomain);
        List<? extends W3TransferDomain> listDomain;
        // Search transfer information
        if (criteriaDomain.isSqlInitCheck()){
            if (criteriaDomain.isSessionFlg()){
                // transferred from W3001 Confirm Detail
                listDomain = searchTransferConfirm(criteria);
            }else{
                // transferred from W3001 Edit TR
                listDomain = searchTransferEdit(criteria);
            }
        }else{
            // transferred from W3005
            listDomain = searchTransferW3005(criteria);
        }
        
        // Convert result to list Domain
        List<? extends W3006ListDomain> w3006ResultList = convertToListDomain(
            listDomain, criteriaDomain.getScreenDateFormat());

        return w3006ResultList;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3006CriteriaDomain filterDomain(W3006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
  
    /**
     * <p>Call W3transferService.searchRegisterCmlTransferReportFromCreateTrInit</p>
     *
     * @param criteriaDomain criteria
     * @return return return
     * @throws ApplicationException exception
     */
    @SuppressWarnings("unchecked")
    protected  List<? extends W3TransferDomain> searchTransferConfirm(W3TransferCriteriaDomain criteriaDomain) throws ApplicationException{        
        return w3TransferService.searchRegisterCmlTransferReportFromMainConfirmInit(criteriaDomain);
    }
    
    /**
     * <p>Call W3transferService.searchRegisterCmlTransferReportFromCreateTrInit</p>
     *
     * @param criteriaDomain criteria
     * @return return return
     * @throws ApplicationException exception
     */
    @SuppressWarnings("unchecked")
    protected  List<? extends W3TransferDomain> searchTransferEdit(W3TransferCriteriaDomain criteriaDomain) throws ApplicationException{        
        return w3TransferService.searchRegisterCmlTransferReportFromMainEditInit(criteriaDomain);
    }
    
    /**
     * <p>Call W3transferService.searchRegisterCmlTransferReportFromCreateTrInit</p>
     *
     * @param criteriaDomain criteria
     * @return return return
     * @throws ApplicationException exception
     */
    @SuppressWarnings("unchecked")
    protected  List<? extends W3TransferDomain> searchTransferW3005(W3TransferCriteriaDomain criteriaDomain) throws ApplicationException{        
        return w3TransferService.searchRegisterCmlTransferReportFromCreateTrInit(criteriaDomain);
    }
    
    /**
     * <p>Conver to w3006ListDomain</p>
     *
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3006ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        
        List<W3006ListDomain> listDomainList = new ArrayList<W3006ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3006ListDomain listDomain = new W3006ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer, dateFormat);

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
     * <p>Create transfer criteria</p>
     *
     * @param criteria w3006CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3006CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria, criteria.getDateFormat());
        return TransferCriteria;
    }

}
