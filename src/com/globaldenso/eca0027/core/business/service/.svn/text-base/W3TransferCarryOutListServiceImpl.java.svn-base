/*
 * Project : NEXUS_EXPORT_ORG
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0352;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0353;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService;
import com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws3003RestService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * Implementation class of service for Carry Out List function
 * </p>
 * 
 * @author DIAT Chonthicha.A
 * @version 1.00
 */

public class W3TransferCarryOutListServiceImpl implements
    W3TransferCarryOutListService {

    /**
     * <p>
     * w3TransferCarryOutListDao
     * </p>
     */
    protected W3TransferCarryOutListDao w3TransferCarryOutListDao;

    /**
     * <p>
     * tmNxsWhService
     * </p>
     */
    protected TmNxsWhService tmNxsWhService;

    /**
     * <p>
     * TmCigmaWhXrefService
     * </p>
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * Ws3003RestService
     */
    protected Ws3003RestService ws3003RestService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3TransferCarryOutListServiceImpl() {
    }

    /**
     * <p>
     * Setter method for w3TransferCarryOutListDao.
     * </p>
     * 
     * @param transferCarryOutListDao Set for w3TransferCarryOutListDao
     */
    public void setW3TransferCarryOutListDao(
        W3TransferCarryOutListDao transferCarryOutListDao) {
        w3TransferCarryOutListDao = transferCarryOutListDao;
    }

    /**
     * <p>
     * Setter method for tmNxsWhService.
     * </p>
     * 
     * @param tmNxsWhService TmNxsWhService
     */
    public void setTmNxsWhService(TmNxsWhService tmNxsWhService) {
        this.tmNxsWhService = tmNxsWhService;
    }

    /**
     * <p>
     * Setter method for tmCigmaWhXrefService.
     * </p>
     * 
     * @param tmCigmaWhXrefService tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(
        TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * <p>
     * Setter method for ws3003RestService.
     * </p>
     * 
     * @param ws3003RestService Set for ws3003RestService
     */
    public void setWs3003RestService(Ws3003RestService ws3003RestService) {
        this.ws3003RestService = ws3003RestService;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferCarryOutListService#searchCountCarryOutListByCml(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public int searchCountCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        return w3TransferCarryOutListDao.searchCountCarryOutListByCml(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferCarryOutListService#searchPrintCarryOutListByCml(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        return w3TransferCarryOutListDao.searchPrintCarryOutListByCml(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferCarryOutListService#SearchCountCarryOutListByItemNo(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public int searchCountCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        return w3TransferCarryOutListDao.searchCountCarryOutByItemNo(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferCarryOutListService#SearchPrintCarryOutListByItemNo(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public List<? extends W3TransferDomain> searchPrintCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        // Search transfer information
        List<? extends W3TransferDomain> w3TransferList = w3TransferCarryOutListDao
            .searchPrintCarryOutListByItemNo(criteria);

        // check whether To WH is need to check firm order qty or not
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
        //TODO confirm which one is correct Shipper CD or Carry in Comp
        tmNxsWhCriteriaDomain.setCompCd(criteria.getCarryInCompCd());
        tmNxsWhCriteriaDomain.setWhCd(criteria.getCarryInWhCd());

        TmNxsWhDomain tmNxsWhDomain = tmNxsWhService
            .searchByKey(tmNxsWhCriteriaDomain);

        if (tmNxsWhDomain == null) {
            throw new GscmApplicationException(NXS_E1_0352);
        }
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
        List<TmCigmaWhXrefDomain> tmCigmaWhXref = new ArrayList<TmCigmaWhXrefDomain>();

        if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(criteria.getShipperCd());
            tmCigmaWhXrefCriteria.setCompCd(criteria.getCarryInCompCd());
            tmCigmaWhXrefCriteria.setWhCd(criteria.getCarryInWhCd());

            tmCigmaWhXref = tmCigmaWhXrefService
                .searchByCondition(tmCigmaWhXrefCriteria);
        } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(criteria.getShipperCd());
            tmCigmaWhXrefCriteria.setCompCd(criteria.getCarryOutCompCd());
            tmCigmaWhXrefCriteria.setWhCd(criteria.getCarryOutWhCd());

            tmCigmaWhXref = tmCigmaWhXrefService
                .searchByCondition(tmCigmaWhXrefCriteria);
        }

        if (tmCigmaWhXref == null || tmCigmaWhXref.size() == 0) {
            throw new GscmApplicationException(NXS_E1_0353);
        }

        // set WS3003 parameter
        List<Ws3003ParamItemDomain> detailList = new ArrayList<Ws3003ParamItemDomain>();
        for (int i = 0; i < w3TransferList.size(); i++ ) {
            Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
            ws3003ParamItemDomain.setItemNo(w3TransferList.get(i).getItemNo());
            detailList.add(ws3003ParamItemDomain);
        }
        Ws3003ParamDomain ws3003ParamDomain = new Ws3003ParamDomain();
        ws3003ParamDomain.setLgcyWhCd(tmCigmaWhXref.get(0).getLgcyWhCd());
        ws3003ParamDomain.setDetailList(detailList);

        // Call WS3003
        List<String[]> webServiceList = getInventoryInfo(criteria
            .getShipperCd(), ws3003ParamDomain);

        // Combine NEXUS data with CIGMA data
        // Set On Hand Qty
        w3TransferList = combineConnectDataForL3002(w3TransferList,
            webServiceList);

        // Calculation
        for (W3TransferDomain domain : w3TransferList) {
            if (domain.getOnHandQty() == null) {
                domain.setOnHandQty("0");
            }
            // Tranferable Qty
            if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransferableQty(String.valueOf(domain.getSumExpQty().intValue()
                    - domain.getSumCarryOutQty().intValue()
                    - domain.getSumQty().intValue()
                    - Integer.parseInt(domain.getOnHandQty())));
            } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransferableQty(String.valueOf(Integer
                    .parseInt(domain.getOnHandQty())
                    - domain.getSumQty().intValue()));
            }
        }
        return w3TransferList;
    }

    /**
     * <p>
     * Call Ws3003RestService to get Inventory Information
     * </p>
     * 
     * @param compCd Company Code
     * @param ws3003ParamDomain Ws3003ParamDomain
     * @return List<String[]>
     * @throws ApplicationException ApplicationException
     */
    public List<String[]> getInventoryInfo(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {
        Ws3003ResultDomain ws3003Result = ws3003RestService
            .getCigmaInventoryFromWs(compCd, ws3003ParamDomain);
        List<String[]> inventoryList = new ArrayList<String[]>();
        if (WS_RESULT_SUCCESS.equals(ws3003Result.getResultCode())) {
            for (int i = 0; i < ws3003Result.getInventoryItemList().size(); i++ ) {
                String[] inventoryElement = new String[3];
                inventoryElement[0] = ws3003Result.getInventoryItemList()
                    .get(i).getItemNo();
                inventoryElement[1] = ws3003Result.getInventoryItemList()
                    .get(i).getPlntCd();
                inventoryElement[2] = ws3003Result.getInventoryItemList()
                    .get(i).getOnHandQty();
                inventoryList.add(inventoryElement);
            }

        } else {
            inventoryList = null;
        }
        return inventoryList;
    }

    /**
     * combine a List to another List by Condition(the type of webListDomain has
     * not defined ,use String[] as testType)
     * 
     * @param w3Transfer List<W3TransferDomain>
     * @param webServiceList List<String[]>
     * @return List<W3004ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> combineConnectDataForL3002(
        List<? extends W3TransferDomain> w3Transfer,
        List<String[]> webServiceList) throws ApplicationException {
        for (int i = 0; i < w3Transfer.size(); i++ ) {
            for (int j = 0; j < webServiceList.size(); j++ ) {
                // String[itemNo, plantCd, onHandQty]
                String[] abc = webServiceList.get(j);
                if (w3Transfer.get(i).getItemNo().equals(abc[0])
                    && w3Transfer.get(i).getPlantCd().equals(abc[1])) {
                    w3Transfer.get(i).setOnHandQty(
                        String.valueOf(Math.round(Double.parseDouble(abc[2]))));
                }
            }
        }
        return w3Transfer;
    }
}
