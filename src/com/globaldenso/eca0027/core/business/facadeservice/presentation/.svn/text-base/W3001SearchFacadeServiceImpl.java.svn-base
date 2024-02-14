/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUER_ID_YOURSELF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Search TR header
 * </p>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3001ListDomain>, W3001CriteriaDomain> {

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
    public W3001SearchFacadeServiceImpl() {
        super();
    }

    /**
     * setter commonService
     * 
     * @param commonService commonService
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
     * {@inheritDoc} Search TR with criteria -Count number of TR result -Get
     * Page info -Search transfer information -Convert result to list Domain
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected List<? extends W3001ListDomain> callServices(
        W3001CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        W3TransferCriteriaDomain w3Criteria = createTransferCriteriaDomain(criteriaDomain);
        // Count number of TR result
        int count = w3TransferService
            .searchCountForPagingOnCarryOutMainSearch(w3Criteria);
        // Get Page info
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w3Criteria);
        // Search transfer information
        List<? extends W3TransferDomain> listDomain = searchTransfer(w3Criteria);
        // Convert result to list Domain
        List<? extends W3001ListDomain> w3001ResultList = convertToListDomain(
            listDomain, criteriaDomain.getScreenDateFormat());

        return w3001ResultList;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3001CriteriaDomain filterDomain(
        W3001CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        String trIssueDateFrom = criteriaDomain.getFmTrIssueDate();
        String trIssueDateTo = criteriaDomain.getToTrIssueDate();
        String trActvDateFrom = criteriaDomain.getFmTrActivateDate();
        String trActvDateTo = criteriaDomain.getToTrActivateDate();

        String dateFormat = criteriaDomain.getScreenDateFormat();
        // Validate if From issue date > To issue date
        if (!w3TransferService.validateConsistencyFmIssueDateToIssueDate(
            trIssueDateFrom, trIssueDateTo, dateFormat)) {
            Object[] params = {commonService.getResource(criteriaDomain
                .getLocale(), "label.issueDate")};
            MessageDomain msgFromIssueDate = new MessageDomain(
                "criteriaDomain.fmTrIssueDate", GSCM_E0_0031, params);
            MessageDomain msgToIssueDate = new MessageDomain(
                "criteriaDomain.toTrIssueDate", null, null);

            errList.add(msgFromIssueDate);
            errList.add(msgToIssueDate);
        }
        // Validate if From activate date > To activate date
        if (!w3TransferService.validateConsistencyFmActivateDateToActivateDate(
            trActvDateFrom, trActvDateTo, dateFormat)) {
            Object[] params2 = {commonService.getResource(criteriaDomain
                .getLocale(), "label.actDate")};
            MessageDomain msgFromActvDate = new MessageDomain(
                "criteriaDomain.fmTrActivateDate", GSCM_E0_0031, params2);
            MessageDomain msgToActvDate = new MessageDomain(
                "criteriaDomain.toTrActivateDate", null, null);

            errList.add(msgFromActvDate);
            errList.add(msgToActvDate);
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
    protected void validateDatabase(W3001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc} Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W3001CriteriaDomain> valid = new Validator<W3001CriteriaDomain>(
            criteriaDomain, "criteriaDomain");

        // item check
        String[] properties = {"fmWhComCd", "fmWhCd", "toWhComCd", "toWhCd",
            "shipperCd", "status", "trNo", "editCntFlag", "trKind", "trKind",
            "itemNo", "pkgCd", "fmTrIssueDate", "toTrIssueDate",
            "fmTrActivateDate", "toTrActivateDate", "trIssuer"};
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3001);

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
     * @param criteria w3001CriteriaDomain
     * @return transferCriteriaDomain domain
     * @throws ParseException
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3001CriteriaDomain criteria) {

        W3TransferCriteriaDomain TransferCriteria = new W3TransferCriteriaDomain();
        SimpleDateFormat dateFormatter = new SimpleDateFormat(criteria.getScreenDateFormat());
        // Convert to criteria domain
        TransferCriteria.setCarryOutCompCd(criteria.getFmWhComCd());
        TransferCriteria.setCarryOutWhCd(criteria.getFmWhCd());
        TransferCriteria.setCarryInCompCd(criteria.getToWhComCd());
        TransferCriteria.setCarryInWhCd(criteria.getToWhCd());
        TransferCriteria.setShipperCd(criteria.getShipperCd());
        TransferCriteria.setTrStatus(criteria.getStatus());
        TransferCriteria.setEditCntFlg(criteria.getEditCntFlag());
        TransferCriteria.setItemNo(criteria.getItemNo());
        TransferCriteria.setMainMark(criteria.getCmlNo());
        TransferCriteria.setPackCD(criteria.getPkgCd());
        TransferCriteria.setTrNo(criteria.getTrNo());
        TransferCriteria.setTrItemTyp(criteria.getTrKind());
        if (!criteria.getFmTrActivateDate().equals("")) {
            try {
                TransferCriteria.setTrActvDtFrom(dateFormatter
                    .parse(criteria.getFmTrActivateDate()));
                //Set From Time 00:00:00 (min)
                if (TransferCriteria.getTrActvDtFrom() != null) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(TransferCriteria.getTrActvDtFrom());
                    cal.set(Calendar.HOUR, 0);
                    cal.set(Calendar.MINUTE, 0);
                    cal.set(Calendar.SECOND, 0);
                    // New date + time
                    TransferCriteria.setTrActvDtFrom(cal.getTime());
                }
            } catch (ParseException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (!criteria.getToTrActivateDate().equals("")) {
            try {
                TransferCriteria.setTrActvDtTo(dateFormatter.parse(criteria.getToTrActivateDate()));
                //Set To Time 23:59:59 (max)
                if (TransferCriteria.getTrActvDtTo() != null) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(TransferCriteria.getTrActvDtTo());
                    cal.set(Calendar.HOUR, 23);
                    cal.set(Calendar.MINUTE, 59);
                    cal.set(Calendar.SECOND, 59);
                    // New date + time
                    TransferCriteria.setTrActvDtTo(cal.getTime());
                }
            } catch (ParseException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (!criteria.getFmTrIssueDate().equals("")) {
            try {
                TransferCriteria.setTrIssueDtFrom(dateFormatter.parse(criteria.getFmTrIssueDate()));
                //Set From Time 00:00:00 (min)
                if (TransferCriteria.getTrIssueDtFrom() != null) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(TransferCriteria.getTrIssueDtFrom());
                    cal.set(Calendar.HOUR, 0);
                    cal.set(Calendar.MINUTE, 0);
                    cal.set(Calendar.SECOND, 0);
                    // New date + time
                    TransferCriteria.setTrIssueDtFrom(cal.getTime());
                }
            } catch (ParseException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (!criteria.getToTrIssueDate().equals("")) {
            try {
                TransferCriteria.setTrIssueDtTo(dateFormatter.parse(criteria.getToTrIssueDate()));
                //Set From Time 00:00:00 (max)
                if (TransferCriteria.getTrIssueDtTo() != null) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(TransferCriteria.getTrIssueDtTo());
                    cal.set(Calendar.HOUR, 23);
                    cal.set(Calendar.MINUTE, 59);
                    cal.set(Calendar.SECOND, 59);
                    // New date + time
                    TransferCriteria.setTrIssueDtTo(cal.getTime());
                }
            } catch (ParseException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        // If TR issuer = Yourself set User DSCID
        if (criteria.getTrIssuer().equals(ISSUER_ID_YOURSELF)) {
            TransferCriteria.setTrIssuerId(criteria.getLoginUserDscId());
        }

        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        // Not check count = 0
        TransferCriteria.setSearchCountCheckFlg(true);
        TransferCriteria.setUserAuthList(criteria.getUserAuthList());
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
            .searchForPagingOnCarryOutMainSearch(criteriaDomain);
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
     * Conver to w3001ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3001ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3001ListDomain> listDomainList = new ArrayList<W3001ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3001ListDomain listDomain = new W3001ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer,
                    dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }

}
