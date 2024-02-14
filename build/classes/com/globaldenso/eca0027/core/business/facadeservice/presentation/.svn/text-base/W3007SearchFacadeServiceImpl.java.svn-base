/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0353;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService;
import com.globaldenso.eca0027.core.business.domain.W3007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Search
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3007SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3007ListDomain>, W3007CriteriaDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>
     * TmCigmaWhXrefService
     * </p>
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * <p>
     * tmNxsWhService
     * </p>
     */
    protected TmNxsWhService tmNxsWhService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3007SearchFacadeServiceImpl() {
        super();
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
     * <p>
     * Setter method for tmCigmaWhXrefService.
     * </p>
     * 
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(
        TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * <p>
     * Setter method for tmNxsWhService.
     * </p>
     * 
     * @param tmNxsWhService Set for tmNxsWhService
     */
    public void setTmNxsWhService(TmNxsWhService tmNxsWhService) {
        this.tmNxsWhService = tmNxsWhService;
    }

    /**
     * {@inheritDoc} Search with criteria -Count number of TR result -Get Page
     * info -Search transfer information -Convert result to list Domain
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected List<? extends W3007ListDomain> callServices(
        W3007CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        W3TransferCriteriaDomain w3Criteria = createTransferCriteriaDomain(criteriaDomain);

        // Count number of result
        int count = w3TransferService
            .searchCountForPagingCreatePartsTransferReportSearch(w3Criteria);
        // Get Page info
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w3Criteria);
        // Search transfer information
        List<? extends W3TransferDomain> w3TransferList = w3TransferService
            .searchForPagingCreatePartsTransferReportSearch(w3Criteria);

        // Convert result to list Domain
        List<? extends W3007ListDomain> w3007List = convertToListDomain(
            w3TransferList, criteriaDomain.getScreenDateFormat());

        // check whether To WH is need to check firm order qty or not
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
        //TODO Chaiporn 17Sep2014 Change check by Carry in Comp CD
        //tmNxsWhCriteriaDomain.setCompCd(criteriaDomain.getShipperCd());
        tmNxsWhCriteriaDomain.setCompCd(criteriaDomain.getCarryInCompCd());
        tmNxsWhCriteriaDomain.setWhCd(criteriaDomain.getCarryInWhCd());
        TmNxsWhDomain tmNxsWhDomain = w3TransferService
            .getTmNxsWh(tmNxsWhCriteriaDomain);
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {

            tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(criteriaDomain
                .getShipperCd());
            tmCigmaWhXrefCriteriaDomain.setCompCd(criteriaDomain
                .getCarryInCompCd());
            tmCigmaWhXrefCriteriaDomain
                .setWhCd(criteriaDomain.getCarryInWhCd());

        } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
            tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(criteriaDomain
                .getShipperCd());
            tmCigmaWhXrefCriteriaDomain.setCompCd(criteriaDomain
                .getCarryOutCompCd());
            tmCigmaWhXrefCriteriaDomain.setWhCd(criteriaDomain
                .getCarryOutWhCd());
        }
        List<TmCigmaWhXrefDomain> tmCigmaWhXrefList = w3TransferService
            .getTmCigmaWhXref(tmCigmaWhXrefCriteriaDomain);
        // call web service
        // set WS3003 parameter
        List<Ws3003ParamItemDomain> detailList = new ArrayList<Ws3003ParamItemDomain>();
       
        for (int i = 0; i < w3007List.size(); i++ ) {
            Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
            ws3003ParamItemDomain.setItemNo(w3007List.get(i).getItemNo());
            // Chaiporn : Plant code as criteria
            // ws3003ParamItemDomain.setPlantCd(w3007List.get(i).getPlantCd());
            detailList.add(ws3003ParamItemDomain);
        }
        Ws3003ParamDomain ws3003ParamDomain = new Ws3003ParamDomain();
        if (tmCigmaWhXrefList == null || tmCigmaWhXrefList.size() == 0) {
            throw new GscmApplicationException(NXS_E1_0353);
        } else {
            ws3003ParamDomain.setLgcyWhCd(tmCigmaWhXrefList.get(0)
                .getLgcyWhCd());
        }
        ws3003ParamDomain.setDetailList(detailList);

        // Call WS3003
        List<String[]> webServiceList = w3TransferService.getInventoryInfo(
            criteriaDomain.getShipperCd(), ws3003ParamDomain);

        // connect data
        w3007List = w3TransferService.combineConnectDataForW3007(w3007List,
            webServiceList);

        double onHandQty = 0;
        double shipLot = 0;
        double boxNo = 0;
        for (W3007ListDomain domain : w3007List) {
            if (domain.getOnHandQty() == null) {
                domain.setOnHandQty("0");
            }
            String boxNoStr = null;
            onHandQty = Double.parseDouble(domain.getOnHandQty());
            shipLot = Double.parseDouble(domain.getShipLot());
            boxNo = onHandQty / shipLot;
            if (onHandQty % shipLot != 0) {
                boxNo = Math.ceil(boxNo);
                boxNoStr = Long.toString(Math.round(boxNo)).concat("*");
            } else{
                boxNoStr = Long.toString(Math.round(boxNo));
            }
            // Box No
            domain.setBoxNo(boxNoStr);
            if (domain.getSumExpQty() == null) {
                domain.setSumExpQty(new BigDecimal("0"));
            }
            // Transferable Qty
            if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransQty(String.valueOf(domain.getSumExpQty()
                    .intValue()
                    - domain.getSumCarryOutQty().intValue()
                    - domain.getSumQty().intValue()
                    - Integer.parseInt(domain.getOnHandQty())));
            } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransQty(String.valueOf(Integer.parseInt(domain
                    .getOnHandQty())
                    - domain.getSumQty().intValue()));
            }
        }
        return w3007List;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3007CriteriaDomain filterDomain(
        W3007CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc} Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W3007CriteriaDomain> valid = new Validator<W3007CriteriaDomain>(
            criteriaDomain, "criteriaDomain");

        // item check
        String[] properties = {"itemNo", "pkgCd"};
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3007);

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
     * @param criteria w3007CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(
        W3007CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        TransferCriteria.setDscId(criteria.getLoginUserDscId());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria,
            criteria.getScreenDateFormat());
        return TransferCriteria;
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
     * Conver to w3007ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3007ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3007ListDomain> listDomainList = new ArrayList<W3007ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3007ListDomain listDomain = new W3007ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer,
                    dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
}