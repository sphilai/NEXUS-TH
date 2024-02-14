/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COME_FROM_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.COME_FROM_W3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDIT_FLG_CONFIRM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0352;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0353;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamItemDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>
 * Search
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W3008ListDomain>, W3008CriteriaDomain> {

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
    public W3008InitFacadeServiceImpl() {
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
     * {@inheritDoc} Search with criteria -Count number of TR result -Get Page
     * info -Search transfer information -Convert result to list Domain
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected List<? extends W3008ListDomain> callServices(
        W3008CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        List<? extends W3TransferDomain> list = null;
        List<? extends W3008ListDomain> w3008ResultList = null;
        if (COME_FROM_W3001.equals(criteriaDomain.getTransferFlg())) {
            // transferred from W3001
            if (EDIT_FLG_CONFIRM.equals(criteriaDomain.getEditFlg())) {
                // transferred by Confirm Detail
                // Count number of result
                list = w3TransferService
                    .searchRegisterPartsTransferReportFromMainConfirmInit(criteriaDomain);
                // Convert result to list Domain
                w3008ResultList = convertToListDomain(list, criteriaDomain
                    .getScreenDateFormat());
            } else {
                // transferred by Edit TR
                list = w3TransferService
                    .searchRegisterPartsTransferReportFromMainEditInit(criteriaDomain);
                // Convert result to list Domain
                w3008ResultList = convertToListDomain(list, criteriaDomain
                    .getScreenDateFormat());

                // check whether To WH is need to check firm order qty or not
                TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
                //TODO Chaiporn Change Shipper CD to Carry-in Comp CD
                //tmNxsWhCriteriaDomain.setCompCd(list.get(0).getShipperCd());
                if(list != null && list.size() > 0){
                    tmNxsWhCriteriaDomain.setCompCd(list.get(0).getCarryInCompCd());
                    tmNxsWhCriteriaDomain.setWhCd(list.get(0).getCarryInWhCd());
                }
                TmNxsWhDomain tmNxsWhDomain = w3TransferService
                    .getTmNxsWh(tmNxsWhCriteriaDomain);

                if (tmNxsWhDomain == null) {
                    throw new GscmApplicationException(NXS_E1_0352);
                }

                TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
                if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                    if(list != null && list.size() > 0){
                        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(list.get(0)
                            .getShipperCd());
                        tmCigmaWhXrefCriteriaDomain.setCompCd(list.get(0)
                            .getCarryInCompCd());
                        tmCigmaWhXrefCriteriaDomain.setWhCd(list.get(0)
                            .getCarryInWhCd());
                    }
                } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                    if(list != null && list.size() > 0){
                        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(list.get(0)
                            .getShipperCd());
                        tmCigmaWhXrefCriteriaDomain.setCompCd(list.get(0)
                            .getCarryOutCompCd());
                        tmCigmaWhXrefCriteriaDomain.setWhCd(list.get(0)
                            .getCarryOutWhCd());
                    }
                }
                List<TmCigmaWhXrefDomain> tmCigmaWhXrefList = w3TransferService
                    .getTmCigmaWhXref(tmCigmaWhXrefCriteriaDomain);
                
                Ws3003ParamDomain ws3003ParamDomain = new Ws3003ParamDomain();
                if (tmCigmaWhXrefList == null || tmCigmaWhXrefList.size() == 0) {
                    throw new GscmApplicationException(NXS_E1_0353);
                } else {
                    ws3003ParamDomain.setLgcyWhCd(tmCigmaWhXrefList.get(0)
                        .getLgcyWhCd());
                }
                // call web service
                // set WS3003 parameter
                List<Ws3003ParamItemDomain> detailList = new ArrayList<Ws3003ParamItemDomain>();

                for (int i = 0; i < w3008ResultList.size(); i++ ) {
                    Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
                    ws3003ParamItemDomain.setItemNo(w3008ResultList.get(i)
                        .getItemNo());
                    // Chaiporn Not set plant code
                    /*
                     * ws3003ParamItemDomain.setPlantCd(w3008ResultList.get(i)
                     * .getPlantCd());
                     */
                    detailList.add(ws3003ParamItemDomain);
                }
                ws3003ParamDomain.setDetailList(detailList);

                // Call WS3003
                List<String[]> webServiceList = w3TransferService
                    .getInventoryInfo(list.get(0).getShipperCd(),
                        ws3003ParamDomain);

                // connect data
                w3008ResultList = w3TransferService.combineConnectDataForW3008(
                    w3008ResultList, webServiceList);

                for (W3008ListDomain domain : w3008ResultList) {
                    domain.setEditTagQty(domain.getActTagQty());
                    domain.setEditTransQty(domain.getActQty());
                    if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                        domain.setTransQty(String.valueOf(domain.getSumExpQty()
                            .intValue()
                            - domain.getSumCarryOutQty().intValue()
                            - domain.getSumQty().intValue()
                            - Integer.parseInt(domain.getSoh())));
                    } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                        domain.setTransQty(String.valueOf(Integer.parseInt(domain.getSoh())
                            - domain.getSumQty().intValue()));
                    }
                }
            }
        } else if (COME_FROM_W3007.equals(criteriaDomain.getTransferFlg())) {
            // tranferred from W3007
            TmUserCriteriaDomain tmUserCriteriaDomain = new TmUserCriteriaDomain();
            tmUserCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
            TmUserDomain tmUserDomain = w3TransferService
                .searchUserNameByKey(tmUserCriteriaDomain);
            list = w3TransferService
                .searchRegisterPartsTransferReportFromCreateTrInit(criteriaDomain);
            // Convert result to list Domain
            w3008ResultList = convertToListDomain(list, criteriaDomain
                .getScreenDateFormat());

            // check whether To WH is need to check firm order qty or not
            TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
            //TODO Chaiporn change ShipperCD -->> Carry-In Comp CD
            //tmNxsWhCriteriaDomain.setCompCd(criteriaDomain.getShipperCd());
            tmNxsWhCriteriaDomain.setCompCd(criteriaDomain.getCarryInCompCd());
            tmNxsWhCriteriaDomain.setWhCd(criteriaDomain.getCarryInWhCd());
            TmNxsWhDomain tmNxsWhDomain = w3TransferService
                .getTmNxsWh(tmNxsWhCriteriaDomain);

            if (tmNxsWhDomain == null) {
                throw new GscmApplicationException(NXS_E1_0352);
            }

            TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
            if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {

                tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(criteriaDomain
                    .getShipperCd());
                tmCigmaWhXrefCriteriaDomain.setCompCd(criteriaDomain
                    .getCarryInCompCd());
                tmCigmaWhXrefCriteriaDomain.setWhCd(criteriaDomain
                    .getCarryInWhCd());

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

            for (int i = 0; i < w3008ResultList.size(); i++ ) {
                Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
                ws3003ParamItemDomain.setItemNo(w3008ResultList.get(i)
                    .getItemNo());
                // Chaiporn not set plant code
                /*
                 * ws3003ParamItemDomain.setPlantCd(w3008ResultList.get(i)
                 * .getPlantCd());
                 */
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
            w3008ResultList = w3TransferService.combineConnectDataForW3008(
                w3008ResultList, webServiceList);

            for (W3008ListDomain domain : w3008ResultList) {
                domain.setUserName(tmUserDomain.getUsrNm());
                if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                    domain.setTransQty(String.valueOf(domain.getSumExpQty()
                        .intValue()
                        - domain.getSumCarryOutQty().intValue()
                        - domain.getSumQty().intValue()
                        - Integer.parseInt(domain.getSoh())));
                } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                    domain.setTransQty(String.valueOf(Integer.parseInt(domain
                        .getSoh())
                        - domain.getSumQty().intValue()));
                }
            }
        }
        return w3008ResultList;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3008CriteriaDomain filterDomain(
        W3008CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc} Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * <p>
     * Convert to w3008ListDomain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return list list
     */
    protected List<W3008ListDomain> convertToListDomain(
        List<? extends W3TransferDomain> transferList, String dateFormat) {

        List<W3008ListDomain> listDomainList = new ArrayList<W3008ListDomain>();

        if (transferList != null) {
            for (W3TransferDomain transfer : transferList) {
                W3008ListDomain listDomain = new W3008ListDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer,
                    dateFormat);
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
}
