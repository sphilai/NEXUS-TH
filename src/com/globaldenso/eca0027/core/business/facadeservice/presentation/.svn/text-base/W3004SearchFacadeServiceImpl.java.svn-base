/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0352;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0353;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3004;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
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
 * <p>W3004SearchFacadeService</p>
 * 
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W3004ListDomain>, W3004CriteriaDomain> {

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;
    
    /**
     * <p>Constructor method.</p>
     *
     */
    public W3004SearchFacadeServiceImpl() {
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
    protected List<? extends W3004ListDomain> callServices(W3004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W3TransferCriteriaDomain w3Criteria = createTransferCriteriaDomain(criteriaDomain);

        //Count number of result
        int count = w3TransferService.searchCountForPagingOnPrintCarryOutListByPartsSearch(w3Criteria);
        //Get Page info
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w3Criteria);
        //Search transfer information
        List<? extends W3TransferDomain> w3TransferList = searchTransfer(w3Criteria);
        //Convert result to list Domain
        List<? extends W3004ListDomain> w3004List = convertToListDomain(w3TransferList,
            criteriaDomain.getScreenDateFormat());

        // check whether To WH is need to check firm order qty or not
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
        tmNxsWhCriteriaDomain.setCompCd(criteriaDomain.getCarryInCompCd());
        tmNxsWhCriteriaDomain.setWhCd(criteriaDomain.getCarryInWhCd());

        TmNxsWhDomain tmNxsWhDomain = w3TransferService.getTmNxsWh(tmNxsWhCriteriaDomain);

        if(tmNxsWhDomain == null){
            throw new GscmApplicationException(NXS_E1_0352);
        }
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
        List<TmCigmaWhXrefDomain> tmCigmaWhXref = new ArrayList<TmCigmaWhXrefDomain>();

        if(FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())){
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(criteriaDomain.getShipperCd());
            tmCigmaWhXrefCriteria.setCompCd(criteriaDomain.getCarryInCompCd());
            tmCigmaWhXrefCriteria.setWhCd(criteriaDomain.getCarryInWhCd());
    
            tmCigmaWhXref = w3TransferService.getTmCigmaWhXref(tmCigmaWhXrefCriteria);
        } else if(FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())){
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(criteriaDomain.getShipperCd());
            tmCigmaWhXrefCriteria.setCompCd(criteriaDomain.getCarryOutCompCd());
            tmCigmaWhXrefCriteria.setWhCd(criteriaDomain.getCarryOutWhCd());
    
            tmCigmaWhXref = w3TransferService.getTmCigmaWhXref(tmCigmaWhXrefCriteria);
        }
        
        if(tmCigmaWhXref == null || tmCigmaWhXref.size() == 0){
            throw new GscmApplicationException(NXS_E1_0353);
        }
        
        // set WS3003 parameter
        List<Ws3003ParamItemDomain> detailList = new ArrayList<Ws3003ParamItemDomain>();
        for(int i = 0; i < w3004List.size(); i++){
            Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
            ws3003ParamItemDomain.setItemNo(w3004List.get(i).getItemNo());
            //Chaiporn DIAT : no plant cd for parameter
            //ws3003ParamItemDomain.setPlantCd(w3004List.get(i).getPlantCd());
            detailList.add(ws3003ParamItemDomain);
        }
        Ws3003ParamDomain ws3003ParamDomain = new Ws3003ParamDomain();
        ws3003ParamDomain.setLgcyWhCd(tmCigmaWhXref.get(0).getLgcyWhCd());
        ws3003ParamDomain.setDetailList(detailList);
        
        // Call WS3003
        List<String[]> webServiceList = w3TransferService.getInventoryInfo(criteriaDomain.getShipperCd(), ws3003ParamDomain);
        
        // Combine nexus data with cigma data
        // Set On Hand Qty
        w3004List = w3TransferService.combineConnectDataForW3004(w3004List, webServiceList);
        
        // Calculation
        double onHandQty = 0;
        double shipLot = 0;
        double boxNo = 0;
        for(W3004ListDomain domain : w3004List){
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
            
            // Tranferable Qty
            if(FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())){
                domain.setTransferableQty(String.valueOf(domain.getSumExpQty().intValue()
                    - domain.getSumCarryOutQty().intValue()
                    - domain.getSumQty().intValue()
                    - Integer.parseInt(domain.getOnHandQty())));
            } else if(FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())){
                domain.setTransferableQty(String.valueOf(Integer.parseInt(domain.getOnHandQty())
                    - domain.getSumQty().intValue()));
            }
        }

        return w3004List;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3004CriteriaDomain filterDomain(W3004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W3004CriteriaDomain> valid = new Validator<W3004CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        //item check
        String[] properties = {
            "itemNo"
        };
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3004);
        
        // Error check
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>Create transfer criteria</p>
     *
     * @param criteria w3004CriteriaDomain
     * @return transferCriteriaDomain domain
     */
    protected W3TransferCriteriaDomain createTransferCriteriaDomain(W3004CriteriaDomain criteria) {
        W3TransferCriteriaDomain TransferCriteria = new  W3TransferCriteriaDomain();
        TransferCriteria.setScreenId(criteria.getScreenId());
        TransferCriteria.setLocale(criteria.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(TransferCriteria, criteria, criteria.getScreenDateFormat());
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
        return w3TransferService.searchForPagingOnPrintCarryOutListByPartsSearch(criteriaDomain);
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
     * <p>Conver to w3004ListDomain</p>
     *
     * @param transferList List<? extends W3TransferDomain>
     * @param dateFormat String
     * @return listDomainList List<W3004ListDomain>
     */
    protected List<W3004ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {
        List<W3004ListDomain> listDomainList = new ArrayList<W3004ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3004ListDomain listDomain = new W3004ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer, dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }

}
