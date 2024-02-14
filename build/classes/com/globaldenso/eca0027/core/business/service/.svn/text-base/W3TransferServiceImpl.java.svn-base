/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0357;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3012;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_CANCEL_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_TYPE_ITEM_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCarryOutListPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferService;
import com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TwCarryOutListPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwTransferItemItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TwTransferItemPltzService;
import com.globaldenso.eca0027.core.business.dao.W3TransferDao;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws3001RestService;
import com.globaldenso.eca0027.core.business.ws.Ws3003RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * <p>
 * Implementation class of service that provides a Transfer Transaction data
 * function
 * </p>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */

public class W3TransferServiceImpl implements W3TransferService {

    /**
     * <p>
     * Common service
     * </p>
     */
    protected CommonService commonService;

    /**
     * <p>
     * ttTransferService
     * </p>
     */
    protected TtTransferService ttTransferService;

    /**
     * <p>
     * ttTmpStockService
     * </p>
     */
    protected TtTmpStockService ttTmpStockService;

    /**
     * TtPltzService service.
     */
    protected TtPltzService ttPltzService;

    /**
     * <p>
     * twTransferItemPltzService
     * </p>
     */
    protected TwTransferItemPltzService twTransferItemPltzService;

    /**
     * <p>
     * twTransferItemItemNoService
     * </p>
     */
    protected TwTransferItemItemNoService twTransferItemItemNoService;

    /**
     * <p>
     * twTransferItemPltzService
     * </p>
     */
    protected TwCarryOutListPltzService twCarryOutListPltzService;

    /**
     * <p>
     * l3001ReportService
     * </p>
     */
    protected L3001ReportService l3001ReportService;

    /**
     * <p>
     * l3003ReportService
     * </p>
     */
    protected L3003ReportService l3003ReportService;

    /**
     * <p>
     * ttTransferItemPltzService
     * </p>
     */
    protected TtTransferItemPltzService ttTransferItemPltzService;

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
     * tmUserService
     * </p>
     */
    protected TmUserService tmUserService;

    /**
     * <p>
     * l3004ReportService
     * </p>
     */
    protected L3004ReportService l3004ReportService;

    /**
     * <p>
     * ttTransferItemItemNoService
     * </p>
     */
    protected TtTransferItemItemNoService ttTransferItemItemNoService;

    /**
     * <p>
     * w3TransferDao
     * </p>
     */
    protected W3TransferDao w3TransferDao;

    /**
     * <p>
     * twCarryOutListItemNoService
     * </p>
     */
    protected TwCarryOutListItemNoService twCarryOutListItemNoService;

    /* TIS Tanaka Start */
    /**
     * Function authority service.
     */
    protected UserAuthService userAuthService;

    /**
     * Ws3003RestService
     */
    protected Ws3003RestService ws3003RestService;

    /**
     * <p>
     * l3002ReportService
     * </p>
     */
    protected L3002ReportService l3002ReportService;

    /**
     * <p>Ws3001RestService.</p>
     */
    protected Ws3001RestService ws3001RestService;
    
    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3TransferServiceImpl() {
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
     * Setter method for ttTransferService.
     * </p>
     * 
     * @param ttTransferService Set for ttTransferService
     */
    public void setTtTransferService(TtTransferService ttTransferService) {
        this.ttTransferService = ttTransferService;
    }

    /**
     * <p>
     * Setter method for ttTmpStockService.
     * </p>
     * 
     * @param ttTmpStockService Set for ttTmpStockService
     */
    public void setTtTmpStockService(TtTmpStockService ttTmpStockService) {
        this.ttTmpStockService = ttTmpStockService;
    }

    /**
     * <p>
     * Setter method for ttPltzService.
     * </p>
     * 
     * @param ttPltzService ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * <p>
     * Setter method for twCarryOutListPltzService.
     * </p>
     * 
     * @param twCarryOutListPltzService twCarryOutListPltzService
     */
    public void setTwCarryOutListPltzService(
        TwCarryOutListPltzService twCarryOutListPltzService) {
        this.twCarryOutListPltzService = twCarryOutListPltzService;
    }

    /**
     * <p>
     * Setter method for twTransferItemPltzService.
     * </p>
     * 
     * @param twTransferItemPltzService twTransferItemPltzService
     */
    public void setTwTransferItemPltzService(
        TwTransferItemPltzService twTransferItemPltzService) {
        this.twTransferItemPltzService = twTransferItemPltzService;
    }

    /**
     * <p>
     * Setter method for l3001ReportService.
     * </p>
     * 
     * @param reportService l3001ReportService
     */
    public void setL3001ReportService(L3001ReportService reportService) {
        l3001ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for l3003ReportService.
     * </p>
     * 
     * @param reportService l3003ReportService
     */
    public void setL3003ReportService(L3003ReportService reportService) {
        l3003ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for ttTransferItemPltzService.
     * </p>
     * 
     * @param ttTransferItemPltzService ttTransferItemPltzService
     */
    public void setTtTransferItemPltzService(
        TtTransferItemPltzService ttTransferItemPltzService) {
        this.ttTransferItemPltzService = ttTransferItemPltzService;
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
     * Setter method for tmUserService.
     * </p>
     * 
     * @param tmUserService TmUserService
     */
    public void setTmUserService(TmUserService tmUserService) {
        this.tmUserService = tmUserService;
    }

    /**
     * <p>
     * Setter method for l3004ReportService.
     * </p>
     * 
     * @param reportService l3004ReportService
     */
    public void setL3004ReportService(L3004ReportService reportService) {
        l3004ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for ttTransferItemItemNoService.
     * </p>
     * 
     * @param ttTransferItemItemNoService ttTransferItemItemNoService
     */
    public void setTtTransferItemItemNoService(
        TtTransferItemItemNoService ttTransferItemItemNoService) {
        this.ttTransferItemItemNoService = ttTransferItemItemNoService;
    }

    /**
     * <p>
     * Setter method for w3TransferDao.
     * </p>
     * 
     * @param transferDao Set for w3TransferDao
     */
    public void setW3TransferDao(W3TransferDao transferDao) {
        w3TransferDao = transferDao;
    }

    /**
     * <p>
     * Setter method for twCarryOutListItemNoService.
     * </p>
     * 
     * @param twCarryOutListItemNoService Set for twCarryOutListItemNoService
     */
    public void setTwCarryOutListItemNoService(
        TwCarryOutListItemNoService twCarryOutListItemNoService) {
        this.twCarryOutListItemNoService = twCarryOutListItemNoService;
    }

    /**
     * <p>
     * Setter method for twTransferItemItemNoService.
     * </p>
     * 
     * @param twTransferItemItemNoService Set for twTransferItemItemNoService
     */
    public void setTwTransferItemItemNoService(
        TwTransferItemItemNoService twTransferItemItemNoService) {
        this.twTransferItemItemNoService = twTransferItemItemNoService;
    }

    /**
     * <p>
     * Setter method for userAuthService.
     * </p>
     * 
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
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
     * <p>
     * Setter method for l3002ReportService.
     * </p>
     * 
     * @param l3002ReportService Set for l3002ReportService
     */
    public void setL3002ReportService(L3002ReportService l3002ReportService) {
        this.l3002ReportService = l3002ReportService;
    }

    /**
     * <p>Setter method for ws3001RestService.</p>
     *
     * @param ws3001RestService Set for ws3001RestService
     */
    public void setWs3001RestService(Ws3001RestService ws3001RestService) {
        this.ws3001RestService = ws3001RestService;
    }

    // --------------------------------- Search Method----------------------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */

    public List<? extends W3TransferDomain> searchForPagingOnMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> resultTtTransfer = w3TransferDao
            .searchForPagingTransfer(criteria);
        return resultTtTransfer;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCount(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */

    public int searchCount(W3TransferCriteriaDomain criteria)
        throws ApplicationException {
        int count = w3TransferDao.searchCountTransfer(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnCarryOutMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */

    public List<? extends W3TransferDomain> searchForPagingOnCarryOutMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> resultTtTransfer = w3TransferDao
            .searchForPagingTtTransfer(criteria);
        return resultTtTransfer;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnCarryInMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public List<? extends W3TransferDomain> searchForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> resultTtTransfer = w3TransferDao
            .searchForPagingOnCarryInMainSearch(criteria);
        return resultTtTransfer;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountForPagingOnCarryOutMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */

    public int searchCountForPagingOnCarryOutMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao.searchCountTtTransfer(criteria);
        return count;
    }

    // --------------------------------- Transaction ----------------------------------

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param listUpdateDomain W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public void updateTransfer(List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException {
        TtTransferDomain transferDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteriaDomain = new TtTransferCriteriaDomain();

        for (W3TransferDomain listDomain : listUpdateDomain) {
            criteriaDomain.setTrNo(listDomain.getTrNo());
            CommonUtil.copyPropertiesDomainToDomain(transferDomain, listDomain);
            ttTransferService.updateByCondition(transferDomain, criteriaDomain);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#cancelActivateTR(com.globaldenso.eca0027.core.business.domain.W3TransferDomain)
     */
    public void cancelActivateTR(W3TransferDomain domain)
        throws ApplicationException {
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
        w3TransferDao.cancelActivateTR(domain, criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountForPagingOnCarryInMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao
            .searchCountForPagingOnCarryInMainSearch(criteria);
        return count;
    }

    /**
     * <p>
     * Type in the functional overview of the method.
     * 
     * @param listUpdateDomain W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public void updateOnCarryOutMainScreenActivate(
        List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException {
        TtTransferDomain transferDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteriaDomain = new TtTransferCriteriaDomain();

        for (W3TransferDomain listDomain : listUpdateDomain) {
            criteriaDomain.setTrNo(listDomain.getTrNo());
            // Get sysdate from local time zone
            Date sysdate = DateUtil.convertTime(new Date(), commonService
                .searchTimezone(listDomain.getShipperCd()));
            CommonUtil.copyPropertiesDomainToDomain(transferDomain, listDomain);
            transferDomain.setTrActvDscId(listDomain.getLoginUserDscId());
            transferDomain.setTrActvDt(sysdate);
            transferDomain.setComUpdateUserId(listDomain.getLoginUserDscId());
            commonService.setCommonPropertyForUpdate(transferDomain,
                SCREEN_ID_W3001);
            ttTransferService.updateByCondition(transferDomain, criteriaDomain);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateOnCarryoutMainScreenCancel(com.globaldenso.eca0027.core.business.domain.W3TransferDomain)
     */
    public void updateOnCarryoutMainScreenCancel(W3TransferDomain domain)
        throws ApplicationException {
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
        w3TransferDao.updateForCancelActivateTtTransfer(domain, criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtTmpStockOnCarryOutMainScreenActivate(java.lang.String,
     *      java.lang.String)
     */
    public void updateTtTmpStockOnCarryOutMainScreenActivate(String trNo,
        String dscId, String funcId) throws ApplicationException {
        // Get Carry-out,in list under TR
        List<? extends TtTmpStockDomain> carryOutItem = w3TransferDao
            .searchForUpdateTtTmpStockCarryOutWh(trNo);
        List<? extends TtTmpStockDomain> carryInItem = w3TransferDao
            .searchForUpdateTtTmpStockCarryInWh(trNo);

        TtTmpStockDomain tmpStock = new TtTmpStockDomain();
        TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();
        List<TtTmpStockDomain> listUpdate = new ArrayList<TtTmpStockDomain>();
        List<TtTmpStockDomain> listAdd = new ArrayList<TtTmpStockDomain>();

        // Prepare TT_TMP_STOCK for carry-out Item
        for (TtTmpStockDomain tmpStockOut : carryOutItem) {

            CommonUtil.copyPropertiesDomainToDomain(criteria, tmpStockOut);
            criteria.setSearchCountCheckFlg(false);
            tmpStock = ttTmpStockService.searchByKey(criteria);
            if (tmpStock != null) {
                // If TT_TMP_STOCK already exists add to update list
                commonService.setCommonPropertyForUpdate(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStock.getQty().add(
                    tmpStockOut.getQty().multiply(new BigDecimal(-1))));
                tmpStock.setComUpdateUserId(dscId);
                listUpdate.add(tmpStock);

            } else {
                // If TT_TMP_STOCK not exists add to add list
                tmpStock = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(tmpStock, tmpStockOut);
                commonService.setCommonPropertyForRegist(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStockOut.getQty().multiply(
                    new BigDecimal(-1)));
                tmpStock.setComCreateUserId(dscId);
                tmpStock.setComUpdateUserId(dscId);
                listAdd.add(tmpStock);
            }
        }
        // Update carry-in TT_TMP_STOCK
        tmpStock = new TtTmpStockDomain();
        criteria = new TtTmpStockCriteriaDomain();

        // Prepare TT_TMP_STOCK for carry-in Item
        for (TtTmpStockDomain tmpStockIn : carryInItem) {

            CommonUtil.copyPropertiesDomainToDomain(criteria, tmpStockIn);
            criteria.setSearchCountCheckFlg(false);
            tmpStock = ttTmpStockService.searchByKey(criteria);
            if (tmpStock != null) {
                // If TT_TMP_STOCK already exists add to update list
                commonService.setCommonPropertyForUpdate(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStock.getQty().add(tmpStockIn.getQty()));
                tmpStock.setComCreateUserId(dscId);
                listUpdate.add(tmpStock);
            } else {
                // If TT_TMP_STOCK not exists add to add list
                tmpStock = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(tmpStock, tmpStockIn);
                commonService.setCommonPropertyForRegist(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStockIn.getQty());
                tmpStock.setComCreateUserId(dscId);
                tmpStock.setComUpdateUserId(dscId);
                listAdd.add(tmpStock);
            }
        }
        // TT_TMP_STOCK Add/Update
        if (listUpdate.size() > 0) {
            ttTmpStockService.update(listUpdate);
        }
        if (listAdd.size() > 0) {
            ttTmpStockService.create(listAdd);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtTmpStockOnCarryOutMainScreenCancel(java.lang.String,
     *      java.lang.String)
     */
    public void updateTtTmpStockOnCarryOutMainScreenCancel(String trNo,
        String dscId, String funcId) throws ApplicationException {

        List<? extends TtTmpStockDomain> carryOutItem = w3TransferDao
            .searchForUpdateTtTmpStockCarryOutWh(trNo);
        List<? extends TtTmpStockDomain> carryInItem = w3TransferDao
            .searchForUpdateTtTmpStockCarryInWh(trNo);

        TtTmpStockDomain tmpStock = new TtTmpStockDomain();
        TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();
        List<TtTmpStockDomain> listUpdate = new ArrayList<TtTmpStockDomain>();
        List<TtTmpStockDomain> listAdd = new ArrayList<TtTmpStockDomain>();

        // Update carry-out TT_TMP_STOCK
        for (TtTmpStockDomain tmpStockOut : carryOutItem) {

            CommonUtil.copyPropertiesDomainToDomain(criteria, tmpStockOut);
            criteria.setSearchCountCheckFlg(false);
            tmpStock = ttTmpStockService.searchByKey(criteria);
            if (tmpStock != null) {
                // If TT_TMP_STOCK already exists add to update list
                commonService.setCommonPropertyForUpdate(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStock.getQty().add(tmpStockOut.getQty()));
                tmpStock.setComUpdateUserId(dscId);
                listUpdate.add(tmpStock);

            } else {
                // If TT_TMP_STOCK not exists add to add list
                tmpStock = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(tmpStock, tmpStockOut);
                commonService.setCommonPropertyForRegist(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStockOut.getQty());
                tmpStock.setComCreateUserId(dscId);
                tmpStock.setComUpdateUserId(dscId);
                listAdd.add(tmpStock);
            }
        }

        tmpStock = new TtTmpStockDomain();
        criteria = new TtTmpStockCriteriaDomain();
        // Update carry-in TT_TMP_STOCK
        for (TtTmpStockDomain tmpStockIn : carryInItem) {

            CommonUtil.copyPropertiesDomainToDomain(criteria, tmpStockIn);
            criteria.setSearchCountCheckFlg(false);
            tmpStock = ttTmpStockService.searchByKey(criteria);
            if (tmpStock != null) {
                // If TT_TMP_STOCK already exists add to update list
                commonService.setCommonPropertyForUpdate(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStock.getQty().add(
                    tmpStockIn.getQty().multiply(new BigDecimal(-1))));
                tmpStock.setComCreateUserId(dscId);
                listUpdate.add(tmpStock);
            } else {
                // If TT_TMP_STOCK not exists add to add list
                tmpStock = new TtTmpStockDomain();
                CommonUtil.copyPropertiesDomainToDomain(tmpStock, tmpStockIn);
                commonService.setCommonPropertyForRegist(tmpStock,
                    funcId);
                tmpStock.setQty(tmpStockIn.getQty()
                    .multiply(new BigDecimal(-1)));
                tmpStock.setComCreateUserId(dscId);
                tmpStock.setComUpdateUserId(dscId);
                listAdd.add(tmpStock);
            }
        }
        // TT_TMP_STOCK Add/Update
        if (listUpdate.size() > 0) {
            ttTmpStockService.update(listUpdate);
        }
        if (listAdd.size() > 0) {
            ttTmpStockService.create(listAdd);
        }
    }

    // --------------------------------- Delete ----------------------------------

    /**
     * (非 Javadoc)
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateOnCarryInMainScreenReceive(java.util.List)
     * @param listUpdateDomain list
     * @throws ApplicationException exception
     */
    public void updateOnCarryInMainScreenReceive(
        List<? extends W3TransferDomain> listUpdateDomain)
        throws ApplicationException {
        TtTransferDomain transferDomain = new TtTransferDomain();
        TtTransferCriteriaDomain criteriaDomain = new TtTransferCriteriaDomain();

        for (W3TransferDomain listDomain : listUpdateDomain) {
            criteriaDomain.setTrNo(listDomain.getTrNo());
            CommonUtil.copyPropertiesDomainToDomain(transferDomain, listDomain);
            ttTransferService.updateByCondition(transferDomain, criteriaDomain);
            // If TR Kind is CML Need Update TT_PLTZ Also
            if (TR_ITEM_TYP_CML.equals(listDomain.getTrItemTyp())) {
                // Search Transfer ITem TT_TRANSFER_ITEM_PLTZ
                TtTransferItemPltzCriteriaDomain criteria = new TtTransferItemPltzCriteriaDomain();
                criteria.setTrNo(listDomain.getTrNo());
                List<TtTransferItemPltzDomain> ttTransferItemPltzDomainList = ttTransferItemPltzService
                    .searchByCondition(criteria);
                // If Found Item TT_TRANSFER_ITEM_PLTZ
                if (ttTransferItemPltzDomainList != null
                    && ttTransferItemPltzDomainList.size() > 0) {
                    for (TtTransferItemPltzDomain ttTransferItemPltzDomain : ttTransferItemPltzDomainList) {
                        // Search Item TT_PLTZ
                        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
                        ttPltzCriteriaDomain
                            .setMainMark(ttTransferItemPltzDomain.getMainMark());
                        List<TtPltzDomain> ttPltzDomainListResult = ttPltzService
                            .searchByCondition(ttPltzCriteriaDomain);
                        // If Found Item TT_PLTZ
                        if (ttPltzDomainListResult != null
                            && ttPltzDomainListResult.size() > 0) {
                            // Update TT_PLTZ
                            // Time zone conversion date of Shipper
                            // Shipperのタイムゾーン変換日付
                            Date sysdate = DateUtil.convertTime(new Date(),
                                commonService.searchTimezone(listDomain
                                    .getShipperCd()));

                            TtPltzDomain ttPltzDomain = new TtPltzDomain();
                            TtPltzCriteriaDomain ttPltzCriteriaDomainUpdate = new TtPltzCriteriaDomain();
                            ttPltzCriteriaDomainUpdate
                                .setMainMark(ttTransferItemPltzDomain
                                    .getMainMark());
                            ttPltzDomain.setLastTrStatus(TR_STATUS_RECEIVED_TR);
                            ttPltzDomain.setLastTrRcvDt(sysdate);
                            // Setting a common column
                            commonService.setCommonPropertyForUpdate(
                                ttPltzDomain, SCREEN_ID_W3009);

                            // update TT_PLTZ
                            ttPltzService.updateByCondition(ttPltzDomain,
                                ttPltzCriteriaDomainUpdate);
                        }
                    }
                }
            }
        }
    }

    // --------------------------------- Validate Database ----------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTtTransferOnCarryOutMainActivate(java.lang.String)
     * @param trNo String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTtTransferOnCarryOutMainActivate(String trNo)
        throws ApplicationException {
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain domain = ttTransferService.searchByKey(criteria);
        return TR_STATUS_ISSUED_TR.equals(domain.getTrStatus());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTtTransferOnCarryOutMainCancel(java.lang.String)
     * @param trNo String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseTtTransferOnCarryOutMainCancel(String trNo)
        throws ApplicationException {
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain domain = ttTransferService.searchByKey(criteria);
        return TR_STATUS_ACTIVATE_TR.equals(domain.getTrStatus());
    }

    // --------------------------------- Validate Consistency ----------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateConsistencyFmActivateDateToActivateDate(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateConsistencyFmActivateDateToActivateDate(
        String fmActDate, String toActDate, String dateFormat)
        throws ApplicationException {
        if (!CheckUtil.isBlankOrNull(fmActDate)
            && !CheckUtil.isBlankOrNull(toActDate)) {
            return commonService.validateFromToDate(dateFormat, fmActDate,
                toActDate);
        } else {
            return true;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateConsistencyFmIssueDateToIssueDate(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(
        String fmIssueDate, String toIssueDate, String dateFormat)
        throws ApplicationException {
        if (!CheckUtil.isBlankOrNull(fmIssueDate)
            && !CheckUtil.isBlankOrNull(toIssueDate)) {
            return commonService.validateFromToDate(dateFormat, fmIssueDate,
                toIssueDate);
        } else {
            return true;
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateConsistencyFmTrRcvDateToTrRcvDate(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateConsistencyFmTrRcvDateToTrRcvDate(
        String lastTrRcvDtFrom, String lastTrRcvDtTo, String dateFormat) {
        if (!CheckUtil.isBlankOrNull(lastTrRcvDtFrom)
            && !CheckUtil.isBlankOrNull(lastTrRcvDtTo)) {
            return commonService.validateFromToDate(dateFormat,
                lastTrRcvDtFrom, lastTrRcvDtTo);
        } else {
            return true;
        }
    }

    // --------------------------------- Protected Method--------------------------

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTtTransferOnCarryInMainReceive(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateDatabaseTtTransferOnCarryInMainReceive(String trNo)
        throws ApplicationException {
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain domain = ttTransferService.searchByKey(criteria);
        return TR_STATUS_ACTIVATE_TR.equals(domain.getTrStatus());
    }

    // --------------------------------- ValidateConsistency ----------------------
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateTrStatusForActivate(java.lang.String)
     * @param trNo String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateTrStatusForActivate(String trNo)
        throws ApplicationException {
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain domain = ttTransferService.searchByKey(criteria);
        return TR_STATUS_ISSUED_TR.equals(domain.getTrStatus());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateTrStatusForCancel(java.lang.String)
     * @param trNo String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateTrStatusForCancel(String trNo)
        throws ApplicationException {
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain domain = ttTransferService.searchByKey(criteria);
        return TR_STATUS_ACTIVATE_TR.equals(domain.getTrStatus());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchRecieveCmlTransferReportInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecieveCmlTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao.searchRecieveCmlTransferReportInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseShipper(java.lang.String)
     * @param compCd String
     * @param whCd String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWh(String compCd, String whCd)
        throws ApplicationException {
        return commonService.validateCompWh(compCd, whCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseShipper(java.lang.String)
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseShipper(String shipper)
        throws ApplicationException {
        return commonService.validateShipper(shipper);
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseWhCompanyWhShipper(java.lang.String)
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException {
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setCompCd(compCd);
        tmCigmaWhXrefCriteriaDomain.setWhCd(whCd);
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(shipper);
        List<TmCigmaWhXrefDomain> tmmCigmaWhXrefList = getTmCigmaWhXref(tmCigmaWhXrefCriteriaDomain);
        if(tmmCigmaWhXrefList == null || tmmCigmaWhXrefList.size() == 0){
            return false;
        }
        return true;
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountForPagingOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao
            .searchCountOnPrintCarryOutListByCmlSearch(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCount(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao
            .searchCountForPagingOnCreateCmlTrasferReportSearch(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<? extends W3TransferDomain> result = w3TransferDao
            .searchForPagingOnPrintCarryOutListByCmlSearch(criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TtPltzCriteriaDomain
     * @return TtPltzDomain TtPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public TtPltzDomain validateDatabasePltz(TtPltzCriteriaDomain criteria)
        throws ApplicationException {
        return ttPltzService.searchByKey(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TtPltzCriteriaDomain
     * @return TtPltzDomain TtPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public List<TtTransferDomain> validateDatabaseTrStatus(
        TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferService.searchByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TwCarryOutListMmCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnPrintCarryOutListByCmlUpdate(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        if (CHECK_ON.equals(criteria.getSelected())) {
            TwCarryOutListPltzDomain twCarryOutListPltzDomain = twCarryOutListPltzService
                .searchByKey(criteria);
            if (twCarryOutListPltzDomain == null) {
                twCarryOutListPltzDomain = new TwCarryOutListPltzDomain();
                CommonUtil.copyPropertiesDomainToDomain(
                    twCarryOutListPltzDomain, criteria);
                twCarryOutListPltzService.create(twCarryOutListPltzDomain);
            }
        } else {
            TwCarryOutListPltzDomain twCarryOutListPltzDomain = twCarryOutListPltzService
                .searchByKey(criteria);
            if (twCarryOutListPltzDomain != null) {
                TwCarryOutListPltzCriteriaDomain criteriaDomain = new TwCarryOutListPltzCriteriaDomain();
                criteriaDomain.setDscId(criteria.getDscId());
                criteriaDomain.setMainMark(criteria.getMainMark());
                twCarryOutListPltzService.deleteByCondition(criteriaDomain);
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TwCarryOutListMmCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnCmlTranseferReportUpdate(
        TwTransferItemPltzDomain criteria) throws ApplicationException {
        twTransferItemPltzService.create(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */

    public List<? extends W3TransferDomain> searchForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<? extends W3TransferDomain> result = w3TransferDao
            .searchForPagingOnCreateCmlTrasferReportSearch(criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTwCarryOutListPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     * @param criteria TwCarryOutListMmCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTwTransferItemPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return count int
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTwTransferItemPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return count int
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twTransferItemItemNoService.searchCount(criteria);
    }

    //TODO Chonthicha
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#printCarryOutListByCml(com.globaldenso.eca0027.core.business.domain.L3001ReportDomain)
     * @param l3001ReportDomain L3001ReportDomain
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printCarryOutListByCml(L3001ReportDomain l3001ReportDomain)
        throws ApplicationException {
        return l3001ReportService.searchPrintCarryOutListByCml(l3001ReportDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTrStatus(com.globaldenso.eca0027.core.business.domain.L3001ReportDetailDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return List List
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> validateDatabaseTrStatus(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao.searchRecieveCmlTransferReportInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateOnReceiveCmlTransferReportReceive(com.globaldenso.eca0027.core.business.domain.L3001ReportDetailDomain)
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnReceiveCmlTransferReportReceive(
        TtTransferDomain domain, TtTransferCriteriaDomain criteria)
        throws ApplicationException {
        ttTransferService.updateByCondition(domain, criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#createPrintTrByCml(com.globaldenso.eca0027.core.business.domain.L3003ReportDetailDomain)
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File createPrintTrByCml(String trNo) throws ApplicationException {
        return l3003ReportService.searchTransferReportCml(trNo);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchRegisterCmlTransferReportFromMainInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainConfirmInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao
            .searchRegisterCmlTransferReportFromMainConfirmInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchRegisterCmlTransferReportFromMainInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainEditInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao
            .searchRegisterCmlTransferReportFromMainEditInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchRegisterCmlTransferReportFromCreateTrInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromCreateTrInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao
            .searchRegisterCmlTransferReportFromCreateTrInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCount(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao
            .searchCountForPagingCreatePartsTransferReportSearch(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingCreatePartsTransferReportSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<? extends W3TransferDomain> result = w3TransferDao
            .searchForPagingCreatePartsTransferReportSearch(criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#createOnCreateCreatePartsTransferReportUpdate(com.globaldenso.eca0027.core.business.domain.criteria.TwTransferItemItemNoDomain)
     * @param criteria TwTransferItemItemNoDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void createOnCreateCreatePartsTransferReportUpdate(
        TwTransferItemItemNoDomain criteria) throws ApplicationException {
        twTransferItemItemNoService.create(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#printTransferReportByCml(com.globaldenso.eca0027.core.business.domain.L3003ReportDetailDomain)
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printTransferReportByCml(String trNo)
        throws ApplicationException {
        return l3003ReportService.searchTransferReportCml(trNo);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTrStatus(com.globaldenso.eca0027.core.business.domain.criteria.TtPltzCriteriaDomain)
     * @param criteria TtPltzCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTrStatus(TtPltzCriteriaDomain criteria)
        throws ApplicationException {
        return ttPltzService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactOnRegisterPartsTransferReportCancelTr(com.globaldenso.eca0027.core.business.domain.criteria.TtTransferDomain)
     * @param criteria TtTransferCriteriaDomain
     * @param domain TtTransferDomain
     * @return TtPltzDomain TtPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public int transactOnRegisterPartsTransferReportCancelTr(
        TtTransferDomain domain, TtTransferCriteriaDomain criteria)
        throws ApplicationException {
        return ttTransferService.updateByCondition(domain, criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TtPltzCriteriaDomain
     * @return TtPltzDomain TtPltzDomain
     * @throws ApplicationException ApplicationException
     */
    public TwTransferItemPltzDomain validateDatabaseDeleteAllMainMarksInWk(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        TwTransferItemPltzDomain result = twTransferItemPltzService
            .searchByKey(criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#deleteOnRegisterCmlTransferReportDelete(com.globaldenso.eca0027.core.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param domain TwTransferItemPltzCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void deleteOnRegisterCmlTransferReportDelete(
        TwTransferItemPltzCriteriaDomain domain) throws ApplicationException {
        twTransferItemPltzService.deleteByCondition(domain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactOnRegisterPartsTransferReportEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param w3008UpdateDomain W3008UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void transactOnRegisterPartsTransferReportEditRegister(
        W3008UpdateDomain w3008UpdateDomain) throws ApplicationException {
        TtTransferCriteriaDomain ttTransferCriteriaDomain = new TtTransferCriteriaDomain();
        ttTransferCriteriaDomain.setTrNo(w3008UpdateDomain.getTrNo());
        List<TtTransferDomain> list = ttTransferService
            .searchByCondition(ttTransferCriteriaDomain);

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setEditCnt(BigDecimal.valueOf(list.get(0).getEditCnt()
            .intValue() + 1));
        ttTransferDomain.setFinalEditDscId(w3008UpdateDomain
            .getLoginUserDscId());
        ttTransferDomain.setFinalEditDt(new Date());
        ttTransferDomain.setFinalEditNm(w3008UpdateDomain
            .getW3008ListDomainList().get(0).getUserName());
        ttTransferDomain.setComUpdateFuncId(w3008UpdateDomain.getScreenId());
        ttTransferDomain.setComUpdateUserId(w3008UpdateDomain
            .getLoginUserDscId());
        CommonUtil.copyPropertiesDomainToDomain(ttTransferDomain,
            w3008UpdateDomain);

        ttTransferService.updateByCondition(ttTransferDomain,
            ttTransferCriteriaDomain);
        for (W3008ListDomain w3008ListDomain : w3008UpdateDomain
            .getW3008ListDomainList()) {
            if (CHECK_ON.equals(w3008ListDomain.getSelected())) {
                TtTransferItemItemNoCriteriaDomain ttTransferItemItemNoCriteriaDomain = new TtTransferItemItemNoCriteriaDomain();
                ttTransferItemItemNoCriteriaDomain.setTrNo(w3008UpdateDomain
                    .getTrNo());
                ttTransferItemItemNoCriteriaDomain.setItemNo(w3008ListDomain
                    .getItemNo());
                ttTransferItemItemNoCriteriaDomain.setPkgCd(w3008ListDomain
                    .getPkgCd());

                ttTransferItemItemNoService
                    .deleteByCondition(ttTransferItemItemNoCriteriaDomain);
            } else {
                TtTransferItemItemNoDomain ttTransferItemItemNoDomain = new TtTransferItemItemNoDomain();
                ttTransferItemItemNoDomain.setCarryOutQty(new BigDecimal(
                    w3008ListDomain.getEditTransQty()));
                ttTransferItemItemNoDomain.setCarryOutCaseQty(new BigDecimal(
                    w3008ListDomain.getEditTagQty()));
                TtTransferItemItemNoCriteriaDomain ttTransferItemItemNoCriteriaDomain = new TtTransferItemItemNoCriteriaDomain();
                ttTransferItemItemNoCriteriaDomain.setTrNo(w3008UpdateDomain
                    .getTrNo());
                ttTransferItemItemNoCriteriaDomain.setItemNo(w3008ListDomain
                    .getItemNo());
                ttTransferItemItemNoCriteriaDomain.setPkgCd(w3008ListDomain
                    .getPkgCd());
                ttTransferItemItemNoService.updateByCondition(
                    ttTransferItemItemNoDomain,
                    ttTransferItemItemNoCriteriaDomain);
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactOnRegisterCmlTransferReportRegister(com.globaldenso.eca0027.core.business.domain.W3006ListDomain)
     * @param w3006UpdateDomain W3006UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public W3TransferDomain transactOnRegisterCmlTransferReportRegister(
        W3006UpdateDomain w3006UpdateDomain) throws ApplicationException {
        Date nowDate = new Date(System.currentTimeMillis());
        // NXS16001 MOD START
        // 2016/10/14
        final String[] monthChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "Y", "Z" };
        String monthChar = monthChars[Integer.valueOf(new SimpleDateFormat("MM").format(nowDate)) - 1];
        final String[] dateChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G",
                                     "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V" };
        String dateChar = dateChars[Integer.valueOf(new SimpleDateFormat("dd").format(nowDate)) - 1];
        // NXS16001 MOD END
        String key = w3006UpdateDomain.getShipperCd()
            + w3006UpdateDomain.getCarryOutWhCd()
            + new SimpleDateFormat("yy").format(nowDate).substring(1)
            + monthChar + dateChar;
        String result = commonService.transactSequence(key, SEQ_TYP_TR_NO, 1, SCREEN_ID_W3006).get(0);
        
        w3006UpdateDomain.setTrNo(key
            + new DecimalFormat("000").format(Integer.valueOf(result)));
        
        // 2014/09/26 Tanaka Obtain user name from TM_USER
        TmUserCriteriaDomain tmUserCriteria = new TmUserCriteriaDomain();
        tmUserCriteria.setDscId(w3006UpdateDomain.getLoginUserDscId());
        TmUserDomain tmUser = tmUserService.searchByKey(tmUserCriteria);
        
        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setTrNo(w3006UpdateDomain.getTrNo());
        ttTransferDomain.setCarryOutCompCd(w3006UpdateDomain
            .getCarryOutCompCd());
        ttTransferDomain.setCarryOutWhCd(w3006UpdateDomain.getCarryOutWhCd());
        ttTransferDomain.setCarryInCompCd(w3006UpdateDomain.getCarryInCompCd());
        ttTransferDomain.setCarryInWhCd(w3006UpdateDomain.getCarryInWhCd());
        ttTransferDomain.setShipperCd(w3006UpdateDomain.getShipperCd());
        ttTransferDomain.setTrIssuerId(w3006UpdateDomain.getLoginUserDscId());
        ttTransferDomain.setTrIssuerNm(tmUser.getUsrNmEn());
        ttTransferDomain.setTrIssueDt(nowDate);
        ttTransferDomain.setTrStatus(LAST_TR_STATUS_ISSUE_TR);
        ttTransferDomain.setTrItemTyp(TR_ITEM_TYP_CML);
        ttTransferDomain.setComCreateFuncId(w3006UpdateDomain.getScreenId());
        ttTransferDomain.setComCreateUserId(w3006UpdateDomain
            .getLoginUserDscId());
        ttTransferDomain.setComUpdateFuncId(w3006UpdateDomain.getScreenId());
        ttTransferDomain.setComUpdateUserId(w3006UpdateDomain
            .getLoginUserDscId());
        ttTransferDomain.setEditCnt(new BigDecimal("0"));
        ttTransferService.create(ttTransferDomain);

        for (W3006ListDomain listDomain : w3006UpdateDomain
            .getW3006ListDomainList()) {
            // Add Chaiporn 19Sep2014 comment out check if to register without
            // checking
            // if (CHECK_ON.equals(listDomain.getSelected())) {
            TtTransferItemPltzDomain ttTransferItemPltzDomain = new TtTransferItemPltzDomain();
            ttTransferItemPltzDomain.setTrNo(w3006UpdateDomain.getTrNo());
            ttTransferItemPltzDomain.setMainMark(listDomain.getMainMark());
            ttTransferItemPltzDomain.setComCreateFuncId(w3006UpdateDomain
                .getLoginUserDscId());
            ttTransferItemPltzDomain.setComCreateUserId(w3006UpdateDomain
                .getLoginUserDscId());
            ttTransferItemPltzDomain.setComUpdateFuncId(w3006UpdateDomain
                .getLoginUserDscId());
            ttTransferItemPltzDomain.setComUpdateUserId(w3006UpdateDomain
                .getLoginUserDscId());
            ttTransferItemPltzService.create(ttTransferItemPltzDomain);

            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setLastTrStatus(TR_STATUS_ISSUED_TR);
            ttPltzDomain.setComUpdateFuncId(w3006UpdateDomain
                .getComUpdateFuncId());
            ttPltzDomain.setComUpdateUserId(w3006UpdateDomain
                .getComUpdateUserId());
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark(listDomain.getMainMark());
            ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteriaDomain);
            // } Comment out Chaiporn19Sep 2014
        }
        TwTransferItemPltzCriteriaDomain twTransferItemPltzDomain = new TwTransferItemPltzCriteriaDomain();
        twTransferItemPltzDomain
            .setDscId(w3006UpdateDomain.getLoginUserDscId());
        twTransferItemPltzService.deleteByCondition(twTransferItemPltzDomain);

        W3TransferDomain returnDomain = new W3TransferDomain();
        returnDomain.setTrNo(w3006UpdateDomain.getTrNo());
        returnDomain.setRegisterCnt(w3006UpdateDomain.getW3006ListDomainList().size());
        return returnDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactOnRegisterCmlTransferReportEditRegister(com.globaldenso.eca0027.core.business.domain.W3006ListDomain)
     * @param w3006UpdateDomain W3006UpdateDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void transactOnRegisterCmlTransferReportEditRegister(
        W3006UpdateDomain w3006UpdateDomain) throws ApplicationException {
        TtTransferCriteriaDomain ttTransferCriteriaDomain = new TtTransferCriteriaDomain();
        ttTransferCriteriaDomain.setTrNo(w3006UpdateDomain.getTrNo());
        TtTransferDomain result = ttTransferService
            .searchByKey(ttTransferCriteriaDomain);

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        if (result.getEditCnt() == null) {
            ttTransferDomain.setEditCnt(BigDecimal.valueOf(1));
        } else {
            ttTransferDomain.setEditCnt(result.getEditCnt().add(
                BigDecimal.valueOf(1)));
        }
        ttTransferDomain.setFinalEditDscId(w3006UpdateDomain
            .getLoginUserDscId());
        ttTransferDomain.setFinalEditNm(w3006UpdateDomain
            .getW3006ListDomainList().get(0).getUserName());
        ttTransferDomain.setFinalEditDt(new Date());
        ttTransferDomain.setComUpdateFuncId(w3006UpdateDomain
            .getComUpdateFuncId());
        ttTransferDomain.setComUpdateUserId(w3006UpdateDomain
            .getComUpdateUserId());
        ttTransferService.updateByCondition(ttTransferDomain,
            ttTransferCriteriaDomain);
        for (W3006ListDomain w3006ListDomain : w3006UpdateDomain
            .getW3006ListDomainList()) {
            if (CHECK_ON.equals(w3006ListDomain.getSelected())) {
                TtTransferItemPltzCriteriaDomain ttTransferItemPltzCriteriaDomain = new TtTransferItemPltzCriteriaDomain();
                ttTransferItemPltzCriteriaDomain.setTrNo(w3006UpdateDomain
                    .getTrNo());
                ttTransferItemPltzCriteriaDomain.setMainMark(w3006ListDomain
                    .getMainMark());
                ttTransferItemPltzService
                    .deleteByCondition(ttTransferItemPltzCriteriaDomain);
                //Thalerngsak Add Updated TT_PLTZ.LAST_TR_STATUS = '10'
                TtPltzDomain ttPltzDomain = new TtPltzDomain();
                ttPltzDomain.setLastTrStatus(LAST_TR_STATUS_BLANK);
                ttPltzDomain.setComUpdateFuncId(w3006UpdateDomain
                    .getComUpdateFuncId());
                ttPltzDomain.setComUpdateUserId(w3006UpdateDomain
                    .getComUpdateUserId());
                TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
                ttPltzCriteriaDomain.setMainMark(w3006ListDomain.getMainMark());
                ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteriaDomain);
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtTransferOnRegisterCmlTransferReportCancelTr(com.globaldenso.eca0027.core.business.domain.W3006ListDomain)
     * @param criteria W3006ListDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void updateTtTransferOnRegisterCmlTransferReportCancelTr(
        W3006ListDomain criteria) throws ApplicationException {
        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setTrStatus(TR_STATUS_CANCEL_TR);
        ttTransferDomain.setComUpdateFuncId(criteria.getComUpdateFuncId());
        ttTransferDomain.setComUpdateUserId(criteria.getComUpdateUserId());
        TtTransferCriteriaDomain criteriaDomain = new TtTransferCriteriaDomain();
        criteriaDomain.setTrNo(criteria.getTrNo());
        ttTransferService.updateByCondition(ttTransferDomain, criteriaDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtPltzOnRegisterCmlTransferReportCancelTr(com.globaldenso.eca0027.core.business.domain.W3006ListDomain)
     * @param criteria W3006ListDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public void updateTtPltzOnRegisterCmlTransferReportCancelTr(
        W3006ListDomain criteria) throws ApplicationException {
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        //Fix bug update Last TR status = '10'        
        //ttPltzDomain.setLastTrStatus(LAST_TR_STATUS_ISSUE_TR);
        ttPltzDomain.setLastTrStatus(LAST_TR_STATUS_BLANK);
        ttPltzDomain.setComUpdateFuncId(criteria.getComUpdateFuncId());
        ttPltzDomain.setComUpdateUserId(criteria.getComUpdateUserId());
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMark(criteria.getMainMark());
        ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteriaDomain);
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#getTmCigmaWhXref(com.globaldenso.eca0027.core.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     * @param tmCigmaWhXrefCriteriaDomain TmCigmaWhXrefCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public List<TmCigmaWhXrefDomain> getTmCigmaWhXref(
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain)
        throws ApplicationException {

        return tmCigmaWhXrefService
            .searchByCondition(tmCigmaWhXrefCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#getTmNxsWh(com.globaldenso.eca0027.core.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     * @param tmNxsWhCriteriaDomain TmNxsWhCriteriaDomain
     * @return TmNxsWhDomain
     * @throws ApplicationException ApplicationException
     */
    public TmNxsWhDomain getTmNxsWh(TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain)
        throws ApplicationException {

        return tmNxsWhService.searchByKey(tmNxsWhCriteriaDomain);
    }

    /**
     * combine a List to another List by Condition(the type of webListDomain has
     * not defined ,use String[] as testType)
     * 
     * @param w3007List List<W3007ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3007ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3007ListDomain> combineConnectDataForW3007(
        List<? extends W3007ListDomain> w3007List, List<String[]> webServiceList)
        throws ApplicationException {
        for (int i = 0; i < w3007List.size(); i++ ) {
            for (int j = 0; j < webServiceList.size(); j++ ) {
                // String[partNo,PlantCd,onHandQty]
                String[] abc = (String[])webServiceList.get(j);
                if (w3007List.get(i).getItemNo().equals(abc[0])
                    && w3007List.get(i).getPlantCd().equals(abc[1])) {
                    w3007List.get(i).setOnHandQty(String.valueOf(Math.round(Double.parseDouble(abc[2]))));
                }
            }
        }
        return w3007List;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchRecievePartsTransferReportInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return search result domain list
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRecievePartsTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return w3TransferDao.searchRecievePartsTransferReportInit(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#createPrintTrByParts(com.globaldenso.eca0027.core.business.domain.L3004ReportDetailDomain)
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File createPrintTrByParts(String trNo) throws ApplicationException {
        return l3004ReportService.searchTransferReportItemNo(trNo);
    }

    /**
     * <p>
     * searchRegisterPartsTransferReportFromMainConfirmInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainConfirmInit(
        W3008CriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> result = w3TransferDao
            .searchRegisterPartsTransferReportFromMainConfirmInit(criteria);
        return result;
    }

    /**
     * <p>
     * searchRegisterPartsTransferReportFromMainEditInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainEditInit(
        W3008CriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> result = w3TransferDao
            .searchRegisterPartsTransferReportFromMainEditInit(criteria);
        return result;
    }

    /**
     * <p>
     * searchRegisterPartsTransferReportFromCreateTrInit
     * </p>
     * 
     * @param criteria W3008CriteriaDomain
     * @return List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromCreateTrInit(
        W3008CriteriaDomain criteria) throws ApplicationException {

        List<? extends W3TransferDomain> result = w3TransferDao
            .searchRegisterPartsTransferReportFromCreateTrInit(criteria);
        return result;
    }

    /**
     * <p>
     * delete records from TwTransferItemItemNo
     * </p>
     * 
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void deleteOnRegisterPartsTransferReportDelete(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException {
        twTransferItemItemNoService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#printTransferReportByItemNo(
     * com.globaldenso.eca0027.core.business.domain.L3004ReportDetailDomain)
     * @param trNo trNo
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printTransferReportByItemNo(String trNo)
        throws ApplicationException {
        return l3004ReportService.searchTransferReportItemNo(trNo);
    }

    /**
     * <p>
     * Insert Delete for
     * TT_TRANSFER_ITEM_ITEM_NO,TT_TRANSFER,TW_TRANSFER_ITEM_PN
     * </p>
     * 
     * @param w3008UpdateDomain W3008UpdateDomain
     * @return trNO String
     * @throws ApplicationException ApplicationException
     */
    public String transactOnRegisterPartsTransferReportRegister(
        W3008UpdateDomain w3008UpdateDomain) throws ApplicationException {

        Date nowDate = new Date();
        // NXS16001 MOD START
        // 2016/10/14
        final String[] monthChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "Y", "Z" };
        String monthChar = monthChars[Integer.valueOf(new SimpleDateFormat("MM").format(nowDate)) - 1];
        final String[] dateChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G",
                                     "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V" };
        String dateChar = dateChars[Integer.valueOf(new SimpleDateFormat("dd").format(nowDate)) - 1];
        // NXS16001 MOD END
        String key = w3008UpdateDomain.getShipperCd()
            + w3008UpdateDomain.getCarryOutWhCd()
            + new SimpleDateFormat("yy").format(nowDate).substring(1)
            + monthChar + dateChar;
        
        String result = commonService.transactSequence(key, SEQ_TYP_TR_NO, 1,
            SCREEN_ID_W3008).get(0);
        
        w3008UpdateDomain.setTrNo(key
            + new DecimalFormat("000").format(Integer.valueOf(result)));

        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setTrNo(w3008UpdateDomain.getTrNo());
        ttTransferDomain.setCarryOutCompCd(w3008UpdateDomain
            .getCarryOutCompCd());
        ttTransferDomain.setCarryOutWhCd(w3008UpdateDomain.getCarryOutWhCd());
        ttTransferDomain.setCarryInCompCd(w3008UpdateDomain.getCarryInCompCd());
        ttTransferDomain.setCarryInWhCd(w3008UpdateDomain.getCarryInWhCd());
        ttTransferDomain.setShipperCd(w3008UpdateDomain.getShipperCd());
        ttTransferDomain.setTrStatus(TR_STATUS_ISSUED_TR);
        ttTransferDomain.setTrItemTyp(TR_ITEM_TYP_PARTS);
        if (w3008UpdateDomain.getW3008ListDomainList().size() != 0) {
            ttTransferDomain.setTrIssuerNm(w3008UpdateDomain
                .getW3008ListDomainList().get(0).getUserName());
        }
        ttTransferDomain.setTrIssuerId(w3008UpdateDomain.getLoginUserDscId());
        ttTransferDomain.setTrIssueDt(new Date());
        ttTransferDomain.setEditCnt(new BigDecimal("0"));
        ttTransferDomain.setComCreateFuncId(w3008UpdateDomain.getScreenId());
        ttTransferDomain.setComUpdateFuncId(w3008UpdateDomain.getScreenId());
        ttTransferDomain.setComCreateUserId(w3008UpdateDomain
            .getLoginUserDscId());
        ttTransferDomain.setComUpdateUserId(w3008UpdateDomain
            .getLoginUserDscId());
        ttTransferService.create(ttTransferDomain);

        if (w3008UpdateDomain.getW3008ListDomainList() != null) {
            for (W3008ListDomain w3008ListDomain : w3008UpdateDomain
                .getW3008ListDomainList()) {
                TtTransferItemItemNoDomain ttTransferItemItemNoDomain = new TtTransferItemItemNoDomain();
                ttTransferItemItemNoDomain.setTrNo(w3008UpdateDomain.getTrNo());
                ttTransferItemItemNoDomain.setItemNo(w3008ListDomain
                    .getItemNo());
                ttTransferItemItemNoDomain.setPkgCd(w3008ListDomain.getPkgCd());
                ttTransferItemItemNoDomain.setCarryOutQty(new BigDecimal(
                    w3008ListDomain.getEditTransQty()));
                ttTransferItemItemNoDomain.setCarryOutCaseQty(new BigDecimal(
                    w3008ListDomain.getEditTagQty()));
                ttTransferItemItemNoDomain.setPlntCd(w3008ListDomain
                    .getPlantCd());
                ttTransferItemItemNoDomain.setComUpdateFuncId(w3008UpdateDomain
                    .getScreenId());
                ttTransferItemItemNoDomain.setComUpdateUserId(w3008UpdateDomain
                    .getLoginUserDscId());
                ttTransferItemItemNoDomain.setComCreateFuncId(w3008UpdateDomain
                    .getScreenId());
                ttTransferItemItemNoDomain.setComCreateUserId(w3008UpdateDomain
                    .getLoginUserDscId());
                ttTransferItemItemNoService.create(ttTransferItemItemNoDomain);
            }
        }
        TwTransferItemItemNoCriteriaDomain criteria = new TwTransferItemItemNoCriteriaDomain();
        criteria.setDscId(w3008UpdateDomain.getLoginUserDscId());

        twTransferItemItemNoService.deleteByCondition(criteria);
        return w3008UpdateDomain.getTrNo();
    }

    /**
     * <p>
     * check parameter
     * </p>
     * 
     * @param w3008UpdateDomain W3008UpdateDomain
     * @throws ApplicationException ApplicationException
     */
    public void validateConsistencyCheckQty(W3008UpdateDomain w3008UpdateDomain)
        throws ApplicationException {
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        for (W3008ListDomain w3008ListDomain : w3008UpdateDomain
            .getW3008ListDomainList()) {
            if (!CHECK_ON.equals(w3008ListDomain.getSelected())) {
                if (w3008ListDomain.getEditTransQty() == null
                    || w3008ListDomain.getEditTransQty().equals("")) {
                    messageDomainList.add(new MessageDomain(
                        "listDomainList.editTransQty", GSCM_E0_0011,
                        new Object[] {"Edit. Trans Qty"}));
                    throw new ValidationException(messageDomainList);
                } else if (new BigDecimal(w3008ListDomain.getEditTransQty())
                    .intValue() == 0) {
                    messageDomainList.add(new MessageDomain(
                        "listDomainList.editTransQty", NXS_E1_0357,
                        new Object[] {"Edit. Trans Qty"}));
                    throw new ValidationException(messageDomainList);
                }
                if (w3008ListDomain.getEditTagQty() == null
                    || w3008ListDomain.getEditTagQty().equals("")) {
                    messageDomainList.add(new MessageDomain(
                        "listDomainList.editTagQty", GSCM_E0_0011,
                        new Object[] {"Edit Tag Qty"}));
                    throw new ValidationException(messageDomainList);
                } else if (new BigDecimal(w3008ListDomain.getEditTagQty())
                    .intValue() == 0) {
                    messageDomainList.add(new MessageDomain(
                        "listDomainList.editTagQty", NXS_E1_0357,
                        new Object[] {"Edit Tag Qty"}));
                    throw new ValidationException(messageDomainList);
                }
                if (!w3008ListDomain.getEditTransQty().equals("")
                    && (new BigDecimal(w3008ListDomain.getEditTransQty())
                        .intValue() > (new BigDecimal(w3008ListDomain
                        .getTransQty())).intValue())) {
                    messageDomainList.add(new MessageDomain(
                        "listDomainList.editTransQty", NXS_E1_3012,
                        new Object[] {"Edit. Trans Qty", "Transferable Qty"}));
                    throw new ValidationException(messageDomainList);
                }
            }
        }
    }

    /**
     * combine a List to another List by Condition(the type of webListDomain has
     * not defined ,use String[] as testType)
     * 
     * @param w3008List List<W3008ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3008ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3008ListDomain> combineConnectDataForW3008(
        List<? extends W3008ListDomain> w3008List, List<String[]> webServiceList)
        throws ApplicationException {
        for (int i = 0; i < w3008List.size(); i++ ) {
            for (int j = 0; j < webServiceList.size(); j++ ) {
                // String[partNo,PlantCd,onHandQty]
                String[] abc = (String[])webServiceList.get(j);
                if (w3008List.get(i).getItemNo().equals(abc[0])
                    && w3008List.get(i).getPlantCd().equals(abc[1])) {
                    w3008List.get(i).setSoh(String.valueOf(Math.round(Double.parseDouble(abc[2]))));
                }
            }
        }
        return w3008List;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTrStatusByKey(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TtPltzCriteriaDomain
     * @return TtTransferDomain TtTransferDomain
     * @throws ApplicationException ApplicationException
     */
    public TtTransferDomain validateDatabaseTrStatusByKey(
        TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferService.searchByKey(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchUserNameByKey(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria TmUserCriteriaDomain
     * @return tmUserDomain TmUserDomain
     * @throws ApplicationException ApplicationException
     */
    public TmUserDomain searchUserNameByKey(TmUserCriteriaDomain criteria)
        throws ApplicationException {
        return tmUserService.searchByKey(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateOnReceiveCmlTransferReportReceiveTtPltz(com.globaldenso.eca0027.core.business.domain.L3001ReportDetailDomain)
     * @param domain TtTransferDomain
     * @param criteria TtTransferCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void updateOnReceiveCmlTransferReportReceiveTtPltz(
        TtPltzDomain domain, TtPltzCriteriaDomain criteria)
        throws ApplicationException {
        ttPltzService.updateByCondition(domain, criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#deleteTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */

    public int deleteTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twCarryOutListItemNoService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#deleteTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */

    public int deleteTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#deleteTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */

    public int deleteTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twTransferItemItemNoService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#deleteTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return deleteCnt integer
     * @throws ApplicationException ApplicationException
     */

    public int deleteTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twCarryOutListItemNoService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountTwCarryOutListPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain)
     * @param criteria TwCarryOutListPltzCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwCarryOutListPltz(
        TwCarryOutListPltzCriteriaDomain criteria) throws ApplicationException {
        return twCarryOutListPltzService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountTwTransferItemItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemItemNoCriteriaDomain)
     * @param criteria TwTransferItemItemNoCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwTransferItemItemNo(
        TwTransferItemItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twTransferItemItemNoService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountTwTransferItemPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain)
     * @param criteria TwTransferItemPltzCriteriaDomain
     * @return searchCnt integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTwTransferItemPltz(
        TwTransferItemPltzCriteriaDomain criteria) throws ApplicationException {
        return twTransferItemPltzService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchCountForPagingOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int searchCountForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        int count = w3TransferDao
            .searchCountOnPrintCarryOutListByPartsSearch(criteria);
        return count;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#searchForPagingOnPrintCarryOutListByPartsSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list W3TransferDomain
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<? extends W3TransferDomain> result = w3TransferDao
            .searchForPagingOnPrintCarryOutListByPartsSearch(criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateConsistencyShipperAuth(java.lang.String,
     *      java.lang.String)
     */
    public boolean validateConsistencyShipperAuth(String permitFuncId,
        String shipperCd) throws ApplicationException {

        return userAuthService.hasUserAuthForComp(permitFuncId, shipperCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#getInventoryInfo(java.lang.String,
     *      com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain)
     */
    public List<String[]> getInventoryInfo(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {
        // Chaiporn change method name
        Ws3003ResultDomain ws3003Result = ws3003RestService
            .getCigmaInventoryFromWs(compCd, ws3003ParamDomain);
        List<String[]> inventoryList = new ArrayList<String[]>();
        if (WS_RESULT_SUCCESS.equals(ws3003Result.getResultCode())) {
            for (int i = 0; i < ws3003Result.getInventoryItemList().size(); i++ ) {
                String[] inventoryElement = new String[3];
                //2016/03/07 Fix bug if search from CIGMA by adding trim into item No.
                inventoryElement[0] = ws3003Result.getInventoryItemList()
                    .get(i).getItemNo().trim();
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
     * @param w3004List List<W3004ListDomain>
     * @param webServiceList List<String[]>
     * @return List<W3004ListDomain>
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W3004ListDomain> combineConnectDataForW3004(
        List<? extends W3004ListDomain> w3004List, List<String[]> webServiceList)
        throws ApplicationException {
        for (int i = 0; i < w3004List.size(); i++ ) {
            for (int j = 0; j < webServiceList.size(); j++ ) {
                // String[itemNo, plantCd, onHandQty]
                String[] abc = webServiceList.get(j);
                if (w3004List.get(i).getItemNo().equals(abc[0])
                    && w3004List.get(i).getPlantCd().equals(abc[1])) {
                    w3004List.get(i).setOnHandQty(String.valueOf(Math.round(Double.parseDouble(abc[2]))));
                }
            }
        }
        return w3004List;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactOnPrintCarryOutListByPartsUpdate(com.globaldenso.eca0027.core.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @throws ApplicationException ApplicationException
     */
    public void transactOnPrintCarryOutListByPartsUpdate(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException {
        if (CHECK_ON.equals(criteria.getSelected())) {
            TwCarryOutListItemNoDomain twCarryOutListItemNoDomain = twCarryOutListItemNoService
                .searchByKey(criteria);
            if (twCarryOutListItemNoDomain == null) {
                twCarryOutListItemNoDomain = new TwCarryOutListItemNoDomain();
                CommonUtil.copyPropertiesDomainToDomain(
                    twCarryOutListItemNoDomain, criteria);
                twCarryOutListItemNoService.create(twCarryOutListItemNoDomain);
            }
        } else {
            TwCarryOutListItemNoDomain twCarryOutListItemNoDomain = twCarryOutListItemNoService
                .searchByKey(criteria);
            if (twCarryOutListItemNoDomain != null) {
                TwCarryOutListItemNoCriteriaDomain criteriaDomain = new TwCarryOutListItemNoCriteriaDomain();
                criteriaDomain.setDscId(criteria.getDscId());
                criteriaDomain.setItemNo(criteria.getItemNo());
                criteriaDomain.setPkgCd(criteria.getPkgCd());
                twCarryOutListItemNoService.deleteByCondition(criteriaDomain);
            }
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#printCarryOutListByParts(com.globaldenso.eca0027.core.business.domain.L3002ReportDomain)
     * @param l3002ReportDomain L3002ReportDomain
     * @return PDF File
     * @throws ApplicationException ApplicationException
     */
    public File printCarryOutListByParts(L3002ReportDomain l3002ReportDomain)
        throws ApplicationException {
        return l3002ReportService.searchCarryOutListItemNo(l3002ReportDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseTwCarryOutListItemNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain)
     * @param criteria TwCarryOutListItemNoCriteriaDomain
     * @return count Integer
     * @throws ApplicationException ApplicationException
     */
    public int validateDatabaseTwCarryOutListItemNo(
        TwCarryOutListItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return twCarryOutListItemNoService.searchCount(criteria);
    }

    /**
     * {@inheritDoc}
     * @param shipperCd String 
     * @param trNo String 
     * @param userName String 
     * @param trItemTyp String 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactForCigamaInventoryOnCarryOutMainByCml(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public void transactCigmaInventoryOnCarryOutMainByActivate(String shipperCd, String trNo, String userName, String trItemTyp)
        throws ApplicationException {
        //Prepare W3TransferCriteriaDomain
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setTrItemTyp(trItemTyp);
        //Prepare Ws3001ParamItemDomain(CML)
        List <Ws3001ParamItemDomain> paramItem = new ArrayList<Ws3001ParamItemDomain>();
        if (trItemTyp.equals(TR_ITEM_TYP_CML)){
            List <? extends W3TransferDomain> inventoyList = w3TransferDao.SearchForCreateCigmaTransactionOnCarryoutMainByCml(criteria);
            for(W3TransferDomain domain : inventoyList){
                Ws3001ParamItemDomain item = new Ws3001ParamItemDomain ();
                item.setItemNo(domain.getItemNo());
                item.setLegacyFrom(domain.getLgcyWhFrom());
                item.setLegacyTo(domain.getLgcyWhTo());
                item.setTrNo(domain.getTrNo());
                item.setTransferQty(domain.getCarryOutQty());
                item.setUserName(userName);
                paramItem.add(item);
            }
        //Prepare Ws3001ParamItemDomain(ITEM NO)
        } else if (trItemTyp.equals(TR_TYPE_ITEM_NO)){
            List <? extends W3TransferDomain> inventoyList = w3TransferDao.SearchForCreateCigmaTransactionOnCarryoutMainByItem(criteria);
            for(W3TransferDomain domain : inventoyList){
                Ws3001ParamItemDomain item = new Ws3001ParamItemDomain ();
                item.setItemNo(domain.getItemNo());
                item.setLegacyFrom(domain.getLgcyWhFrom());
                item.setLegacyTo(domain.getLgcyWhTo());
                item.setTrNo(domain.getTrNo());
                item.setTransferQty(domain.getCarryOutQty());
                item.setUserName(userName);
                paramItem.add(item);
            }
        }
        Ws3001ParamDomain param = new Ws3001ParamDomain();
        param.setInventoryTransactionList(paramItem);
        //Call Ws3001RestService to transact CIGMA inventory
        ws3001RestService.createRegisterInventoryTransaction(shipperCd, param);
    }

    /**
     * {@inheritDoc}
     * @param shipperCd String 
     * @param trNo String 
     * @param userName String 
     * @param trItemTyp String 
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#transactCigmaInventoryOnCarryOutMainByCancelActivate(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public void transactCigmaInventoryOnCarryOutMainByCancelActivate(String shipperCd, String trNo, String userName, String trItemTyp)
        throws ApplicationException {
      //Prepare W3TransferCriteriaDomain
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setTrItemTyp(trItemTyp);
        List <Ws3001ParamItemDomain> paramItem = new ArrayList<Ws3001ParamItemDomain>();
      //Prepare Ws3001ParamItemDomain(CML)
        if (trItemTyp.equals(TR_ITEM_TYP_CML)){
            List <? extends W3TransferDomain> inventoyList = w3TransferDao.SearchForCreateCigmaTransactionOnCarryoutMainByCml(criteria);
            for(W3TransferDomain domain : inventoyList){
                Ws3001ParamItemDomain item = new Ws3001ParamItemDomain ();
                item.setItemNo(domain.getItemNo());
                item.setLegacyFrom(domain.getLgcyWhTo());
                item.setLegacyTo(domain.getLgcyWhFrom());
                item.setTrNo(domain.getTrNo());
                item.setTransferQty(domain.getCarryOutQty());
                item.setUserName(userName);
                paramItem.add(item);
            }
        //Prepare Ws3001ParamItemDomain(ITEM NO)
        } else if (trItemTyp.equals(TR_TYPE_ITEM_NO)){
            List <? extends W3TransferDomain> inventoyList = w3TransferDao.SearchForCreateCigmaTransactionOnCarryoutMainByItem(criteria);
            for(W3TransferDomain domain : inventoyList){
                Ws3001ParamItemDomain item = new Ws3001ParamItemDomain ();
                item.setItemNo(domain.getItemNo());
                item.setLegacyFrom(domain.getLgcyWhTo());
                item.setLegacyTo(domain.getLgcyWhFrom());
                item.setTrNo(domain.getTrNo());
                item.setTransferQty(domain.getCarryOutQty());
                item.setUserName(userName);
                paramItem.add(item);
            }
        }
        
        Ws3001ParamDomain param = new Ws3001ParamDomain();
        param.setInventoryTransactionList(paramItem);
        //Call Ws3001RestService to transact CIGMA inventory
        ws3001RestService.createRegisterInventoryTransaction(shipperCd, param);
    }
    

    /**
     * {@inheritDoc}
     * @param criteria W3TransferCriteriaDomain trNo, userAuthList, trItemTyp 
     * @return count Integer
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseAuthorityCheckOnCarryOutMain(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public boolean validateDatabaseAuthorityCheckOnCarryOutMain(W3TransferCriteriaDomain criteria)
        throws ApplicationException {
        List<W3TransferDomain> result = new ArrayList<W3TransferDomain>();
        List<? extends UserAuthDomain> userAuthDomainList = criteria.getUserAuthList();
        Set<String> tmpPlantCd = new HashSet<String>();
        int countFlg = 0;
        // If TR_TYPE is CML
        if (TR_ITEM_TYP_CML.equals(criteria.getTrItemTyp())) {
            //Get Plant CD from TT_PLTZ_ITEM under TR_NO
            result = (List<W3TransferDomain>)w3TransferDao
                .searchPlantCdForValidateCheckByCml(criteria);
            //If TR_TYPE is ItemNo
        } else if (
            TR_TYPE_ITEM_NO.equals(criteria.getTrItemTyp())) { // item
            //Get Plant CD from TT_TRANSFER_ITEM_ITEM_NO under TR_NO
            result = (List<W3TransferDomain>)w3TransferDao
                .searchPlantCdForValidateCheckByItemNo(criteria);
        } 
        //If can get result data
        if ((result != null) && (result.size() > 0)) {
            for (W3TransferDomain w3TransferDomain : result) {
                //Collect list of permit plant CD
                tmpPlantCd.add(w3TransferDomain.getPlantCd());
            }
        }
        //If has user authority list control then check authority 
        if ((userAuthDomainList != null) && (userAuthDomainList.size() > 0)) {
            for (UserAuthDomain userAuthDomain : userAuthDomainList) {
                for (String plntCd : tmpPlantCd) {
                    //If use authority equal to list of permit plant code && Authority is Register authority
                    if (userAuthDomain.getProcMfgDivCd().equals(plntCd)
                        && AUTH_REGISTER_NUMERIC.equals(userAuthDomain.getAuthority())
                    ) {
                        //Add count flag
                        countFlg++ ;
                    }
                }
            }
            //If accumulate count flag < size of plant code under TR_ITEM
            if (countFlg < tmpPlantCd.size()) {
                return false;
            }
        }
        //else return true
        return true;
    }
    /**
     * {@inheritDoc}
     * @param criteria W3TransferCriteriaDomain trNo, userAuthList, trItemTyp 
     * @return boolean true,false
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#validateDatabaseAuthorityCheckOnCarryInMain(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public boolean validateDatabaseAuthorityCheckOnCarryInMain(W3TransferCriteriaDomain criteria)
        throws ApplicationException {
        List<W3TransferDomain> result = new ArrayList<W3TransferDomain>();
        List<? extends UserAuthDomain> userAuthDomainList = criteria.getUserAuthList();
        Set<String> tmpPlantCd = new HashSet<String>();
        int countFlg = 0;
        // If TR_TYPE is CML
        if (TR_ITEM_TYP_CML.equals(criteria.getTrItemTyp())) {
            //Get Plant CD from TT_PLTZ_ITEM under TR_NO
            result = (List<W3TransferDomain>)w3TransferDao
                .searchPlantCdForValidateCheckByCml(criteria);
            //If TR_TYPE is ItemNo
        } else if (
            TR_TYPE_ITEM_NO.equals(criteria.getTrItemTyp())) { // item
            //Get Plant CD from TT_TRANSFER_ITEM_ITEM_NO under TR_NO
            result = (List<W3TransferDomain>)w3TransferDao
                .searchPlantCdForValidateCheckByItemNo(criteria);
        } 
        //If can get result data
        if ((result != null) && (result.size() > 0)) {
            for (W3TransferDomain w3TransferDomain : result) {
                //Collect list of permit plant CD
                tmpPlantCd.add(w3TransferDomain.getPlantCd());
            }
        }
        //If has user authority list control then check authority 
        if ((userAuthDomainList != null) && (userAuthDomainList.size() > 0)) {
            for (UserAuthDomain userAuthDomain : userAuthDomainList) {
                for (String plntCd : tmpPlantCd) {
                    //If use authority equal to list of permit plant code && Authority is Register authority
                    if (userAuthDomain.getProcMfgDivCd().equals(plntCd)
                        && AUTH_REGISTER_NUMERIC.equals(userAuthDomain.getAuthority())
                    ) {
                        //Add count flag
                        countFlg++ ;
                    }
                }
            }
            //If accumulate count flag < size of plant code under TR_ITEM
            if (countFlg < tmpPlantCd.size()) {
                return false;
            }
        }
        //else return true
        return true;
    }
 
    /**
     * Update TT_PLTZ on activate
     * {@inheritDoc}
     * @param updateDomain W3TransferDomain trNo, carryInCompCd, carryInWhCd, shipperCd, Screen ID, loginUserDscId, screenId
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtPltzOnActivate(com.globaldenso.eca0027.core.business.domain.W3TransferDomain)
     */
    public void updateTtPltzOnActivate(W3TransferDomain updateDomain) throws ApplicationException {
        // Create ttTransferItemPltzCriteria
        TtTransferItemPltzCriteriaDomain ttPltzItemCriteria = new TtTransferItemPltzCriteriaDomain();
        ttPltzItemCriteria.setTrNo(updateDomain.getTrNo());
        // Get list of transferPltzItemList by TR No.
        List<TtTransferItemPltzDomain> transferPltzItemList = ttTransferItemPltzService
            .searchByCondition(ttPltzItemCriteria);
        // Create Carry in WH CIGMA XREF criteria
        TmCigmaWhXrefCriteriaDomain xrefCriteria = new TmCigmaWhXrefCriteriaDomain();
        xrefCriteria.setCompCd(updateDomain.getCarryInCompCd());
        xrefCriteria.setWhCd(updateDomain.getCarryInWhCd());
        xrefCriteria.setLgcyLibCompCd(updateDomain.getShipperCd());
        // Get Carry in WH CIGMA XREF for update TT_PLTZ
        List<TmCigmaWhXrefDomain> whXref = tmCigmaWhXrefService.searchByCondition(xrefCriteria);
        // Create TtTransferItemPltz for update list
        List<TtPltzDomain> pltzDomainForUpdate = new ArrayList<TtPltzDomain>();
        // Prepare TT_PLTZ for update
        TtPltzCriteriaDomain pltzCriteria = new TtPltzCriteriaDomain();
        for (TtTransferItemPltzDomain ttPltzItem : transferPltzItemList) {
            pltzCriteria.setMainMark(ttPltzItem.getMainMark());
            TtPltzDomain domain = ttPltzService.searchByKey(pltzCriteria);
            domain.setMainMark(ttPltzItem.getMainMark());
            domain.setCurWhCd(updateDomain.getCarryInWhCd());
            domain.setCurWhCompCd(updateDomain.getCarryInCompCd());
            // TODO to be considered on how to get W/H code current get 1st
            // member
            domain.setCurLgcyWhCd(whXref.get(0).getLgcyWhCd());
            commonService.setCommonPropertyForUpdate(domain, updateDomain.getScreenId());
            domain.setLastTrStatus(TR_STATUS_ACTIVATE_TR);
            domain.setComUpdateTimestamp(domain.getComUpdateTimestamp());
            domain.setComUpdateUserId(updateDomain.getLoginUserDscId());
            pltzDomainForUpdate.add(domain);
        }
        // Update TT_PLTZ
        ttPltzService.update(pltzDomainForUpdate);
    }

    /**
     * {@inheritDoc}
     * @param updateDomain W3TransferDomain trNo, Screen ID, loginUserDscId, screenId
     * @see com.globaldenso.eca0027.core.business.service.W3TransferService#updateTtPltzOnCancelActivate(com.globaldenso.eca0027.core.business.domain.W3TransferDomain)
     */
    public void updateTtPltzOnCancelActivate(W3TransferDomain updateDomain)
        throws ApplicationException {
        // Get TT_TRANSFER detail information
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(updateDomain.getTrNo());
        TtTransferDomain transfer = ttTransferService.searchByKey(criteria);
        // Create ttTransferItemPltzCriteria
        TtTransferItemPltzCriteriaDomain ttPltzItemCriteria = new TtTransferItemPltzCriteriaDomain();
        ttPltzItemCriteria.setTrNo(updateDomain.getTrNo());
        // Get list of transferPltzItemList by TR No.
        List<TtTransferItemPltzDomain> transferPltzItemList = ttTransferItemPltzService
            .searchByCondition(ttPltzItemCriteria);
        // Create Carry in WH CIGMA XREF criteria
        TmCigmaWhXrefCriteriaDomain xrefCriteria = new TmCigmaWhXrefCriteriaDomain();
        xrefCriteria.setCompCd(transfer.getCarryOutCompCd());
        xrefCriteria.setWhCd(transfer.getCarryOutWhCd());
        xrefCriteria.setLgcyLibCompCd(transfer.getShipperCd());
        // Get Carry in WH CIGMA XREF for update TT_PLTZ
        List<TmCigmaWhXrefDomain> whXref = tmCigmaWhXrefService.searchByCondition(xrefCriteria);
        // Create TtTransferItemPltz for update list
        List<TtPltzDomain> pltzDomainForUpdate = new ArrayList<TtPltzDomain>();
        // Prepare TT_PLTZ for update
        TtPltzCriteriaDomain pltzCriteria = new TtPltzCriteriaDomain();
        for (TtTransferItemPltzDomain ttPltzItem : transferPltzItemList) {
            pltzCriteria.setMainMark(ttPltzItem.getMainMark());
            TtPltzDomain domain = ttPltzService.searchByKey(pltzCriteria);
            domain.setMainMark(ttPltzItem.getMainMark());
            // Carry out W/H CD&COMP CD
            domain.setCurWhCd(transfer.getCarryOutWhCd());
            domain.setCurWhCompCd(transfer.getCarryOutCompCd());
            // TODO to be considered on how to get W/H code, current get 1st
            // member
            domain.setCurLgcyWhCd(whXref.get(0).getLgcyWhCd());
            commonService.setCommonPropertyForUpdate(domain, updateDomain.getScreenId());
            domain.setLastTrStatus(TR_STATUS_ACTIVATE_TR);
            domain.setComUpdateTimestamp(domain.getComUpdateTimestamp());
            domain.setComUpdateUserId(updateDomain.getLoginUserDscId());
            pltzDomainForUpdate.add(domain);
        }
        // Update TT_PLTZ
        ttPltzService.update(pltzDomainForUpdate);
    }
    // --------------------------------- Private Method--------------------------
    /**
     * <p>
     * Month Format
     * </p>
     * 
     * @param month month
     * @return String
     */
    private String getMonth(String month) {
        String returnMonth = "";
        switch (Integer.valueOf(month)) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                returnMonth = month;
                break;
            case 10:
                returnMonth = "X";
                break;
            case 11:
                returnMonth = "Y";
                break;
            case 12:
                returnMonth = "Z";
                break;
            default:
                break;
        }
        return returnMonth;
    }
}
