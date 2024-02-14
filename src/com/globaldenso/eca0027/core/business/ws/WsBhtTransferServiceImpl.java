/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferItemItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferItemPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTransferService;
import com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501CmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501ItemNoListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.L3003ReportService;
import com.globaldenso.eca0027.core.business.service.L3004ReportService;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * An implementation class of transfer service.
 * </p>
 * 
 * @version 1.00
 */
public class WsBhtTransferServiceImpl implements WsBhtTransferService {
    /**
     * [ws2505] [ws2507] [ws2509] [ws2510] NEXUS-Company-Master service
     * <br />[ws2505][ws2507][ws2509][ws2510]NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * [ws2507] [ws2509] [ws2511] [ws2512] TM_PRINTER service
     * <br />[ws2507][ws2509][ws2511][ws2512]TM_PRINTERサービス
     */
    protected TmPrinterService tmPrinterService;

    /**
     * <p>
     * TtTransferService
     * </p>
     */
    private TtTransferService ttTransferService;

    /**
     * <p>
     * TmUserService
     * </p>
     */
    private TmUserService tmUserService;

    /**
     * <p>
     * WsBhtTransferDao
     * </p>
     */
    private WsBhtTransferDao wsBhtTransferDao;

    /**
     * <p>
     * Ws3001RestService
     * </p>
     */
    private Ws3001RestService ws3001RestService;

    /**
     * <p>
     * TtPltzService
     * </p>
     */
    private TtPltzService ttPltzService;

    /**
     * <p>
     * CommonService
     * </p>
     */
    private CommonService commonService;

    /**
     * <p>
     * TtTransferItemPltzService
     * </p>
     */
    private TtTransferItemPltzService ttTransferItemPltzService;

    /**
     * <p>
     * L3003ReportService
     * </p>
     */
    private L3003ReportService l3003ReportService;

    /**
     * <p>
     * L3004ReportService
     * </p>
     */
    private L3004ReportService l3004ReportService;
    
    /**
     * <p>
     * TmCigmaWhXrefService
     * </p>
     */
    private TmCigmaWhXrefService tmCigmaWhXrefService;
    
    /**
     * <p>
     * Ws3003RestService
     * </p>
     */
    private Ws3003RestService ws3003RestService;

    /**
     * <p>
     * tmNxsWhService
     * </p>
     */
    private TmNxsWhService tmNxsWhService;
    
    /**
     * <p>
     * ttTransferItemItemNoService
     * </p>
     */
    private TtTransferItemItemNoService ttTransferItemItemNoService;

    /**
     * <p>w3TransferService</p>
     */
    private W3TransferService w3TransferService;
    
    /**
     * <p>w3TransferService</p>
     */
    private TmExpItemNoSpInfoService tmExpItemNoSpInfoService;
    
    /**
     * <p>
     * Constructor
     * </p>
     */
    public WsBhtTransferServiceImpl() {
        super();
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
     * Setter method for tmUserService.
     * </p>
     * 
     * @param tmUserService Set for tmUserService
     */
    public void setTmUserService(TmUserService tmUserService) {
        this.tmUserService = tmUserService;
    }

    /**
     * <p>
     * Setter method for wsBhtTransferDao.
     * </p>
     * 
     * @param wsBhtTransferDao Set for wsBhtTransferDao
     */
    public void setWsBhtTransferDao(WsBhtTransferDao wsBhtTransferDao) {
        this.wsBhtTransferDao = wsBhtTransferDao;
    }

    /**
     * <p>
     * Setter method for ws3001RestService.
     * </p>
     * 
     * @param ws3001RestService Set for ws3001RestService
     */
    public void setWs3001RestService(Ws3001RestService ws3001RestService) {
        this.ws3001RestService = ws3001RestService;
    }
    
    /**
     * <p>
     * Setter method for ttPltzService.
     * </p>
     * 
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
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
     * Setter method for ttTransferItemPltzService.
     * </p>
     * 
     * @param ttTransferItemPltzService Set for ttTransferItemPltzService
     */
    public void setTtTransferItemPltzService(
        TtTransferItemPltzService ttTransferItemPltzService) {
        this.ttTransferItemPltzService = ttTransferItemPltzService;
    }

    /**
     * <p>
     * Setter method for l3003ReportService.
     * </p>
     * 
     * @param reportService Set for l3003ReportService
     */
    public void setL3003ReportService(L3003ReportService reportService) {
        l3003ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for l3004ReportService.
     * </p>
     * 
     * @param reportService Set for l3004ReportService
     */
    public void setL3004ReportService(L3004ReportService reportService) {
        l3004ReportService = reportService;
    }

    /**
     * <p>
     * Setter method for tmCigmaWhXrefService.
     * </p>
     * 
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
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
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }
    
    /**
     * <p>
     * Setter method for ttTransferItemItemNoService.
     * </p>
     * 
     * @param ttTransferItemItemNoService Set for ttTransferItemItemNoService
     */
    public void setTtTransferItemItemNoService(
        TtTransferItemItemNoService ttTransferItemItemNoService) {
        this.ttTransferItemItemNoService = ttTransferItemItemNoService;
    }

    /**
     * Setter method for tmPrinterService.
     *
     * @param tmPrinterService Set for tmPrinterService
     */
    public void setTmPrinterService(TmPrinterService tmPrinterService) {
        this.tmPrinterService = tmPrinterService;
    }
    
    /**
     * <p>Setter method for w3TransferService.</p>
     *
     * @param w3transferService Set for w3TransferService
     */
    public void setW3TransferService(W3TransferService w3transferService) {
        this.w3TransferService = w3transferService;
    }
    
    /**
     * <p>Setter method for tmExpItemNoSpInfoService.</p>
     *
     * @param tmExpItemNoSpInfoService Set for tmExpItemNoSpInfoService
     */
    public void setTmExpItemNoSpInfoService(TmExpItemNoSpInfoService tmExpItemNoSpInfoService) {
        this.tmExpItemNoSpInfoService = tmExpItemNoSpInfoService;
    }

    //==============================================================
    
    
   

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchUserInfo(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmUserCriteriaDomain)
     */
    public TmUserDomain searchUserInfo(TmUserCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        return tmUserService.searchByKey(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#updateTrStatus(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public int updateTrStatus(TtTransferDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return ttTransferService.update(updateDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchTtTransfer(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public TtTransferDomain searchTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        return ttTransferService.searchByKey(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchWs3001ParamForCml(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForCml(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        return wsBhtTransferDao.searchWs3001ParamForCml(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchWs3001ParamForParts(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    public List<WsBhtTransferDomain> searchWs3001ParamForParts(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        return wsBhtTransferDao.searchWs3001ParamForParts(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#callWs3001Rest(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferDomain, java.lang.String)
     */
    public ResultDomain callWs3001Rest(List<WsBhtTransferDomain> criteria,
        String usrNmEn) throws GscmApplicationException, ApplicationException {
        String lgcyLibCompCd = criteria.get(0).getShipperCd();
        String lgcyWhFrm = criteria.get(0).getLgcyWhFrm();
        String lgcyWhTo = criteria.get(0).getLgcyWhTo();
        String trNo = criteria.get(0).getTrNo();

        Ws3001ParamDomain ws3001ParamDomain = new Ws3001ParamDomain();
        List<Ws3001ParamItemDomain> detailList = new ArrayList<Ws3001ParamItemDomain>();
        for (int i = 0; i < criteria.size(); i++ ) {
            Ws3001ParamItemDomain itemDomain = new Ws3001ParamItemDomain();
            //Thalerngsak check CIGMA part
            if(criteria.get(i).getItemType() == null){
                itemDomain.setItemNo(criteria.get(i).getItemNo());
                itemDomain.setTransferQty(criteria.get(i).getQty());
                //Thalerngsak Change parameter Domain
                itemDomain.setLegacyFrom(lgcyWhFrm);
                itemDomain.setLegacyTo(lgcyWhTo);
                itemDomain.setTrNo(trNo);
                itemDomain.setUserName(usrNmEn);
                detailList.add(itemDomain);
            }
            
        }
        //Thalerngsak Change from detailList to InventoryTransactionLIst
        ws3001ParamDomain.setInventoryTransactionList(detailList);
        //Thalerngsak Change parameter Domain
        return ws3001RestService.createRegisterInventoryTransaction(lgcyLibCompCd, ws3001ParamDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchCountTtTransfer(com.globaldenso.eca0027.core.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int searchCountTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException{
        return ttTransferService.searchCount(criteria);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#validateDatabaseTtTransfer(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public boolean validateDatabaseTtTransfer(TtTransferCriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        boolean result = false;

        TtTransferDomain ttTransfer = ttTransferService.searchByKey(criteria);

        if (ttTransfer != null) {
            result = true;
        }

        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchTransferInfoDetailByCml(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    public List<Ws3501CmlListItemDomain> searchTransferInfoDetailByCml(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        // In case TrItemTyp is 1 (CML)
        return wsBhtTransferDao.searchTransferInfoDetailByCml(criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchTransferInfoDetailByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    public List<Ws3501ItemNoListItemDomain> searchTransferInfoDetailByItemNo(
        WsBhtTransferCriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        // In case TrItemTyp is 1 (CML)
        return wsBhtTransferDao.searchTransferInfoDetailByItemNo(criteria);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchCmlListFromTtPltz(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public TtPltzDomain searchCmlListFromTtPltz(
        TtPltzCriteriaDomain ttPltzCriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        TtPltzDomain ttPltzDomain = ttPltzService
            .searchByKey(ttPltzCriteriaDomain);
        return ttPltzDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#transactSequence(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String)
     */
    public List<String> transactSequence(String seqKey, String seqTyp, int num,
        String funcId) throws ApplicationException {
        return commonService.transactSequence(seqKey, seqTyp, num, funcId);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#insertTtTransfer(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public void insertTtTransfer(TtTransferDomain domain)
        throws ApplicationException {
        ttTransferService.create(domain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#insertTtTransferItemPltz(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain)
     */
    public void insertTtTransferItemPltz(TtTransferItemPltzDomain domain)
        throws ApplicationException {
        ttTransferItemPltzService.create(domain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#updateTtPltz(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain,
     *      com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain)
     */
    public int updateTtPltz(TtPltzDomain domain, TtPltzCriteriaDomain criteria)
        throws ApplicationException {
        return ttPltzService.updateByCondition(domain, criteria);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#updateTtPltzByKey(com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain)
     */
    public int updateTtPltzByKey(TtPltzDomain domain)
        throws ApplicationException {
        return ttPltzService.update(domain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#updateTtTransfer(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain,
     *      com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTransferCriteriaDomain)
     */
    public int updateTtTransfer(TtTransferDomain domain,
        TtTransferCriteriaDomain criteria) throws ApplicationException {
        return ttTransferService.updateByCondition(domain, criteria);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchMainMarkList(com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain)
     */
    public List<Ws3506UpdateDomain> searchMainMarkList(
        WsBhtTransferDomain domain) throws GscmApplicationException,
        ApplicationException {
        return wsBhtTransferDao.searchMainMarkList(domain);
    }

    //kimura add direct print function
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#callPrintByCml(java.lang.String)
     */
    public void callPrintByCml(String trNo , String printerId , String noOfPrint) throws ApplicationException {
        
        //number of paper ; fixed 1
        // int printnum = 1;
        int printnum = 1;
        
        if(noOfPrint != null && !noOfPrint.equals("")){
            
            printnum = Integer.valueOf(noOfPrint);
        }
        
        //Get PDF file
        File pdf = l3003ReportService.searchTransferReportCml(trNo);

        //Search TR by TR_NO
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain transfer = ttTransferService.searchByKey(criteria);
        
        //Search Printer Master
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(transfer.getShipperCd());
        tmPrinterCriteria.setPrinterId(printerId);
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);
        tmPrinterCriteria.setPrinterId(tmPrinterInfo.getPrinterId());

        //Print out by direct print common function
        this.commonService.printPdf(pdf, printnum, tmPrinterInfo.getPrinterNm());
    }

    //kimura add direct print function
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#callPrintByItemNo(java.lang.String)
     */
    public void callPrintByItemNo(String trNo , String  printerId, String noOfPrint) throws ApplicationException {
        
        int printnum = 1;
        if(noOfPrint != null && !noOfPrint.equals("")){
            
            printnum = Integer.valueOf(noOfPrint);
        }
        //Get PDF file
        File pdf = l3004ReportService.searchTransferReportItemNo(trNo);

        //Search TR by TR_NO
        TtTransferCriteriaDomain criteria = new TtTransferCriteriaDomain();
        criteria.setTrNo(trNo);
        TtTransferDomain transfer = ttTransferService.searchByKey(criteria);
        
        //Search Printer Master
        TmPrinterCriteriaDomain tmPrinterCriteria = new TmPrinterCriteriaDomain();
        tmPrinterCriteria.setCompCd(transfer.getShipperCd());
        tmPrinterCriteria.setPrinterId(printerId);
        TmPrinterDomain tmPrinterInfo = this.tmPrinterService.searchByKey(tmPrinterCriteria);
        tmPrinterCriteria.setPrinterId(tmPrinterInfo.getPrinterId());

        //Print out by direct print common function
        this.commonService.printPdf(pdf, printnum, tmPrinterInfo.getPrinterNm());
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchTransferListByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain)
     */
    public List<Ws3504SearchResultDomain> searchTransferListByItemNo(Ws3504CriteriaDomain domain)
        throws ApplicationException {
        return wsBhtTransferDao.searchTransferListByItemNo(domain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#getTmCigmaWhXref(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     */
    public List<TmCigmaWhXrefDomain> getTmCigmaWhXref(TmCigmaWhXrefCriteriaDomain domain)
        throws ApplicationException {
        return tmCigmaWhXrefService.searchByCondition(domain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#getInventoryInfo(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain)
     */
    public List<String[]> getInventoryInfo(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {
        Ws3003ResultDomain ws3003Result = ws3003RestService.getCigmaInventoryFromWs(compCd, ws3003ParamDomain);
        List<String[]> inventoryList = new ArrayList<String[]>();
        if(WS_RESULT_SUCCESS.equals(ws3003Result.getResultCode())){
            for(int i = 0; i < ws3003Result.getInventoryItemList().size(); i++){
                String[] inventoryElement = new String[3];
                inventoryElement[0] = ws3003Result.getInventoryItemList().get(i).getItemNo();
                //Chaiporn change parameter name
                inventoryElement[1] = ws3003Result.getInventoryItemList().get(i).getPlntCd();
                inventoryElement[2] = ws3003Result.getInventoryItemList().get(i).getOnHandQty();
                inventoryList.add(inventoryElement);
            }
            
        } else{
            inventoryList = null;
        }
        return inventoryList;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#getTmNxsWh(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain)
     * @param tmNxsWhCriteriaDomain TmNxsWhCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    public TmNxsWhDomain getTmNxsWh(
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain)
        throws ApplicationException {

        return tmNxsWhService.searchByKey(tmNxsWhCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#combineConnectDataForWs3504(com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain, java.lang.String)
     * @param ws3504List List<Ws3504SearchResultDomain>
     * @param webServiceList List<String[]>
     * @return
     * @throws ApplicationException ApplicationException
     */
    public List<Ws3504SearchResultDomain> combineConnectDataForWs3504(
        List<Ws3504SearchResultDomain> ws3504List, List<String[]> webServiceList)
        throws ApplicationException {
        for (int i = 0; i < ws3504List.size(); i++ ) {
            for (int j = 0; j < webServiceList.size(); j++ ) {
                // String[itemNo, plantCd, onHandQty]
                String[] abc = webServiceList.get(j);
                if (ws3504List.get(i).getItemNo().equals(abc[0])
                    && ws3504List.get(i).getPlntCd().equals(abc[1])) {
                    ws3504List.get(i).setOnHandQty(String.valueOf(Math.round(Double.parseDouble(abc[2]))));
                }
            }
        }
        return ws3504List;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#insertTtTransferItemItemNo(com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain)
     * @param domainList List<TtTransferItemItemNoDomain>
     */
    public void insertTtTransferItemItemNo(List<TtTransferItemItemNoDomain> domainList)
        throws ApplicationException {
        ttTransferItemItemNoService.create(domainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#updateTtTmpStock(com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain)
     */
    public void updateTtTmpStock(TtTransferDomain domain) throws ApplicationException {
        w3TransferService.updateTtTmpStockOnCarryOutMainScreenActivate(domain.getTrNo(), domain.getComUpdateUserId(), domain.getComUpdateFuncId());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsBhtTransferService#searchItemSpecialInfo(com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain)
     */
    
    public List<TmExpItemNoSpInfoDomain> searchItemSpecialInfo(TmExpItemNoSpInfoCriteriaDomain criteria)
        throws ApplicationException {
        return tmExpItemNoSpInfoService.searchByCondition(criteria);
    }
    
}
