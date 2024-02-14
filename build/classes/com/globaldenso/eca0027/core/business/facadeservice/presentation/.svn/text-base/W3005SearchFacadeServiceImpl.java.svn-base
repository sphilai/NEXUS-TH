/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3005;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Search Header
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3005ListDomain>, W3005CriteriaDomain> {

    /**
     * Common Service
     */
    protected CommonService commonService;

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
    public W3005SearchFacadeServiceImpl() {
        super();
    }

    /**
     * <p>
     * Setter method for commonService.
     * </p>
     * 
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * {@inheritDoc} Search with criteria -Count number of TR result -Get Page
     * info -Search transfer information -Convert result to list Domain
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected List<? extends W3005ListDomain> callServices(
        W3005CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        W3TransferCriteriaDomain w3Criteria = createTransferCriteriaDomain(criteriaDomain);
        // Count number of result
        int count = w3TransferService
            .searchCountForPagingOnCreateCmlTrasferReportSearch(w3Criteria);
        // Get Page info
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w3Criteria);
        // Search transfer information
        List<? extends W3TransferDomain> w3TransferResultList = searchTransfer(w3Criteria);
        // Convert result to list Domain
        List<? extends W3005ListDomain> w3005ListDomain = convertToListDomain(
            w3TransferResultList, criteriaDomain.getScreenDateFormat());

        return w3005ListDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3005CriteriaDomain filterDomain(
        W3005CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        String cmlIssueDateFrom = criteriaDomain.getFmCmlIssueDate();
        String cmlIssueDateTo = criteriaDomain.getToCmlIssueDate();

        String dateFormat = criteriaDomain.getScreenDateFormat();
        // Validate if From issue date > To issue date
        if (!w3TransferService.validateConsistencyFmIssueDateToIssueDate(
            cmlIssueDateFrom, cmlIssueDateTo, dateFormat)) {
            Object[] params = {commonService.getResource(criteriaDomain
                .getLocale(), "label.cmlIssueDate")};
            MessageDomain msgFromIssueDate = new MessageDomain(
                "criteriaDomain.fmCmlIssueDate", GSCM_E0_0031, params);
            MessageDomain msgToIssueDate = new MessageDomain(
                "criteriaDomain.toCmlIssueDate", null, null);

            errList.add(msgFromIssueDate);
            errList.add(msgToIssueDate);
        }

        // error check
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc} Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W3005CriteriaDomain> valid = new Validator<W3005CriteriaDomain>(
            criteriaDomain, "criteriaDomain");

        // item check
        String[] properties = {"mainMark", "containerSortingKey",
            "fmCmlIssueDate", "toCmlIssueDate", "expRequestNo"};
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3005);

        // Error check
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Create transfer criteria
     * </p>
     * 
     * @param criteria w3003CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(
        W3005CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria,
            criteria.getScreenDateFormat());
        return TransferCriteria;
    }

    /**
     * <p>
     * Call W3transferService.searchForPagingOnMainSearch
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
            .searchForPagingOnCreateCmlTrasferReportSearch(criteriaDomain);
    }

    /**
     * <p>
     * Set page info
     * </p>
     * 
     * @param pageInfoCreator page
     * @param count count
     * @param w3Criteria criteria
     * @throws ApplicationException exception
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count,
        W3TransferCriteriaDomain w3Criteria) throws ApplicationException {
        // Getting information page
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count,
            null, null, w3Criteria.getLocale());
        // Set the start and end position in the search condition domain
        w3Criteria.setRowNumFrom(pageInfoData.getFromCount());
        w3Criteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * <p>
     * Convert to W3005ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3005ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3005ListDomain> listDomainList = new ArrayList<W3005ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3005ListDomain listDomain = new W3005ListDomain();
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

}
