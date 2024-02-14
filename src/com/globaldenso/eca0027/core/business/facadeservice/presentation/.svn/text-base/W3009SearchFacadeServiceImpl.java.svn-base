package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_IN_ID_YOURSELF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>Facade Service for W3009 Search Process</p>
 *
 * @author Odd
 * @version 1.00
 */
public class W3009SearchFacadeServiceImpl extends
             AbstractSearchFacadeService<List<? extends W3009ListDomain>, W3009CriteriaDomain> {
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
     * Constructor
     * </p>
     */
    public W3009SearchFacadeServiceImpl() {
        super();
    }

    /**
     * <p>
     * commonService setter
     * </p>
     * 
     * @param commonService commonService set
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>
     * w3TransferService setter
     * </p>
     * 
     * @param transferService w3TransferService set
     */
    public void setW3TransferService(W3TransferService transferService) {
        w3TransferService = transferService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W3009ListDomain> callServices(
        W3009CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        W3TransferCriteriaDomain w3Criteria = createTransferCriteriaDomain(criteriaDomain);
        //Count number of TR result
        int count = w3TransferService.searchCountForPagingOnCarryInMainSearch(w3Criteria);
        //Get Page info
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w3Criteria);
        //Search transfer information
        List<? extends W3TransferDomain> listDomain = searchTransfer(w3Criteria);
        //Convert result to list Domain
        List<? extends W3009ListDomain> w3009ResultList = convertToListDomain(listDomain,
            criteriaDomain.getScreenDateFormat());

        return w3009ResultList;

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3009CriteriaDomain filterDomain(W3009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        String lastTrRcvDtFrom = criteriaDomain.getLastTrRcvDtFrom();
        String lastTrRcvDtTo = criteriaDomain.getLastTrRcvDtTo();

        // get screen date format
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // check from and to
        if (!w3TransferService.validateConsistencyFmTrRcvDateToTrRcvDate(lastTrRcvDtFrom, lastTrRcvDtTo, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.lastTrRcvDt")
            };
            MessageDomain msgLastTrRcvDtFrom = new MessageDomain("criteriaDomain.lastTrRcvDtFrom", GSCM_E0_0031, params);
            MessageDomain msgLastTrRcvDtTo = new MessageDomain("criteriaDomain.lastTrRcvDtTo", null, null);
            
            errList.add(msgLastTrRcvDtFrom);
            errList.add(msgLastTrRcvDtTo);
        }
        
        // if error
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3009CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        Validator<W3009CriteriaDomain> valid = new Validator<W3009CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        //item check
        String[] properties = {
            "fmWhComCd",
            "fmWhCd",
            "toWhComCd",
            "toWhCd",
            "shipperCd",
            "lastTrRcvDtTo",
            "lastTrRcvDtFrom",
            
        };
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3009);
        
        // Error check
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    /**
     * <p>Create transfer criteria</p>
     *
     * @param criteria w3009CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3009CriteriaDomain criteria) {

        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        //Check if search with self information use  DCS ID as criteria
        if (criteria.getCarryInWorker().equals(CARRY_IN_ID_YOURSELF)){
            TransferCriteria.setTrRcvDscId(criteria.getLoginUserDscId());
        }
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        TransferCriteria.setSearchCountCheckFlg(false);
        TransferCriteria.setCarryOutCompCd(criteria.getFmWhComCd());
        TransferCriteria.setCarryOutWhCd(criteria.getFmWhCd());
        TransferCriteria.setCarryInCompCd(criteria.getToWhComCd());
        TransferCriteria.setCarryInWhCd(criteria.getToWhCd());
        TransferCriteria.setShipperCd(criteria.getShipperCd());
        TransferCriteria.setTrStatus(criteria.getStatus());
        TransferCriteria.setTrNo(criteria.getTrNo());
        TransferCriteria.setEditCntFlg(criteria.getEditFlag());
        TransferCriteria.setTrItemTyp(criteria.getTrKind());
        TransferCriteria.setMainMark(criteria.getCmlNo());
        TransferCriteria.setItemNo(criteria.getItemNo());
        TransferCriteria.setPackCD(criteria.getPkgCd());
        TransferCriteria.setLastTrRcvDtFrom(DateUtil.parseDate(criteria.getLastTrRcvDtFrom(),
                                                               criteria.getScreenDateFormat()));
        TransferCriteria.setLastTrRcvDtTo(DateUtil.parseDate(criteria.getLastTrRcvDtTo(),
                                                              criteria.getScreenDateFormat()));
        TransferCriteria.setSearchCountCheckFlg(true);
        TransferCriteria.setLocale(criteria.getLocale());
        TransferCriteria.setUserAuthList(criteria.getUserAuthList());
        return TransferCriteria;
    }
  
    /**
     * <p>Call W3transferService.searchForPagingOnMainSearch</p>
     *
     * @param criteriaDomain criteria
     * @return return return
     * @throws ApplicationException exception
     */
    @SuppressWarnings("unchecked")
    protected  List<? extends W3TransferDomain> searchTransfer(W3TransferCriteriaDomain criteriaDomain) throws ApplicationException{        
        return w3TransferService.searchForPagingOnCarryInMainSearch(criteriaDomain);
    }
    
    /**
     * <p>Set page info</p>
     *
     * @param pageInfoCreator page
     * @param count count
     * @param w3Criteria criteria
     * @throws ApplicationException exception
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count,
        W3TransferCriteriaDomain w3Criteria) throws ApplicationException {
        // Getting information page
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null,
            w3Criteria.getLocale());
        // Set the start and end position in the search condition domain
        w3Criteria.setRowNumFrom(pageInfoData.getFromCount());
        w3Criteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    /**
     * <p>Convert to w3009ListDomain</p>
     *
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3009ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3009ListDomain> listDomainList = new ArrayList<W3009ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3009ListDomain listDomain = new W3009ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer, dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }

}