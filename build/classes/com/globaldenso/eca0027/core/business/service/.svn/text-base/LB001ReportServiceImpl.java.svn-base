/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_LB001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_CHANGE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_DELETE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDI_RCV_ODR_ODR_CHG_TYP_ERROR;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JasperPrint;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpOdrRcvErrReportHdrService;
import com.globaldenso.eca0027.core.business.dao.RpOdrRcvDao;
import com.globaldenso.eca0027.core.business.domain.LB001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.LB001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.LB001TtEdiRcvOdrReportByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.LB001VtRpOdrRcvErrReportByHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB010ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001TtEdiRcvOdrReportByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LB001VtRpOdrRcvErrReportByHdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9003RestService;
import com.globaldenso.eca0027.core.business.ws.WsB010RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of the form creation service [CML (E-RT)] of LB001.<br />
 * LB001【 CML(E-RT) 】の帳票作成サービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 13397 $
 */
public class LB001ReportServiceImpl extends AbstractReportServiceImpl implements LB001ReportService {
    
    /**
     * RpOdrRcvDao
     */
    protected RpOdrRcvDao rpOdrRcvDao;
    
    /**
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * VT_RP_ODR_RCV_ERR_REPORT_HDR Service
     */
    protected VtRpOdrRcvErrReportHdrService vtRpOdrRcvErrReportHdrService;
    
    /**
     * TM_NXS_COMP Service
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * WsB010RestService
     */
    protected WsB010RestService wsB010RestService;

    /**
     * TtEdiRcvOdrReportService
     */
    protected TtEdiRcvOdrReportService ttEdiRcvOdrReportService;

    /**
     * Ws9003RestService
     */
    protected Ws9003RestService ws9003RestService;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public LB001ReportServiceImpl() {
    }

    /**
     * Setter method for wsB010RestService.
     *
     * @param wsB010RestService Set for wsB010RestService
     */
    public void setWsB010RestService(WsB010RestService wsB010RestService) {
        this.wsB010RestService = wsB010RestService;
    }
    
    /**
     * ws9003RestService のセッターメソッドです。
     *
     * @param ws9003RestService ws9003RestService に設定する
     */
    public void setWs9003RestService(Ws9003RestService ws9003RestService) {
        this.ws9003RestService = ws9003RestService;
    }
   
    /**
     * Setter method for rpOdrRcvDao.
     *
     * @param rpOdrRcvDao Set for rpOdrRcvDao
     */
    public void setRpOdrRcvDao(RpOdrRcvDao rpOdrRcvDao) {
        this.rpOdrRcvDao = rpOdrRcvDao;
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for vtRpOdrRcvErrReportHdrService.
     *
     * @param vtRpOdrRcvErrReportHdrService Set for vtRpOdrRcvErrReportHdrService
     */
    public void setVtRpOdrRcvErrReportHdrService(
        VtRpOdrRcvErrReportHdrService vtRpOdrRcvErrReportHdrService) {
        this.vtRpOdrRcvErrReportHdrService = vtRpOdrRcvErrReportHdrService;
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
     * Setter method for ttEdiRcvOdrReportService.
     *
     * @param ttEdiRcvOdrReportService Set for ttEdiRcvOdrReportService
     */
    public void setTtEdiRcvOdrReportService(
        TtEdiRcvOdrReportService ttEdiRcvOdrReportService) {
        this.ttEdiRcvOdrReportService = ttEdiRcvOdrReportService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.LB001ReportService#searchOdrRcv(String, Date, String)
     */
    public File searchOdrRcv(String shipper, String subCd, Date transDate, String CustCd, String lgcyShipTo, String plantCd, Date cigmaAds, String formatDate) throws ApplicationException {

        LB001ReportDomain reportDomain = new LB001ReportDomain();
        List<JasperPrint> reportList = new ArrayList<JasperPrint>();

        // Get own base data.
        // 自拠点情報の取得(ヘッダーに印字)
        List<TmNxsCompDomain> tmList = getHeadPrint(shipper);
        if (tmList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // Set header data.
        // ヘッダー印字情報設定
        TmNxsCompDomain tmDomain = tmList.get(0);
        reportDomain.setRcvCompNameAbb(tmDomain.getCompNmAbb());
        reportDomain.setRcvCompFax(tmDomain.getCompFax());
        reportDomain.setIssueDate(DateUtil.formatDate(cigmaAds, formatDate));

        // Get header data.
        // ヘッダ単位抽出
        List<LB001VtRpOdrRcvErrReportByHdrDomain> headList = getHeader(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd);
        if (headList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get customer base information, customer data and detail data in each headers.
        // ヘッダ単位ごとに「得意先拠点情報取得」、「得意先情報取得」、「明細情報取得」を繰り返し行う
        for (int i = 0; i < headList.size(); i++) {
            LB001VtRpOdrRcvErrReportByHdrDomain headDomain = headList.get(i);
            reportDomain.setPlantCode(headDomain.getPlntCd());
            reportDomain.setTransDate(DateUtil.formatDate(headDomain.getTransmissionDt(), formatDate));
            reportDomain.setCustNo(headDomain.getCustomerCd());
            reportDomain.setShipToNo(headDomain.getLgcyShipTo());
            reportDomain.setShipToName(headDomain.getShipToNm());
            
            // Get customer base information.
            // 得意先拠点情報取得
            try {
                WsB010ResultDomain b010Domain = wsB010RestService.getCusSubInfo(shipper, headDomain.getCustomerSubsidiaryCd());
                String nameAbb = "";
                if(null != b010Domain && null != b010Domain.getSubsidiaryAbbreviation()){
                    nameAbb = b010Domain.getSubsidiaryAbbreviation();
                }
                // Get customer information.
                // 得意先情報取得
                String faxNo = "";
                if(null != headDomain.getCustomerCd()){
                    Ws9003ResultDomain ws9003ResultDomain = ws9003RestService.validateDatabaseCustomer(headDomain.getRcvOdrCompCd(), headDomain.getCustomerCd());
                    if(null != ws9003ResultDomain && null != ws9003ResultDomain.getCustomerInfo() && null != ws9003ResultDomain.getCustomerInfo().getFaxNo()){
                        faxNo = ws9003ResultDomain.getCustomerInfo().getFaxNo();
                    }
                }
                // Set customer information.
                // 得意先情報取得後セット
                reportDomain.setCustNameAbb(nameAbb);
                reportDomain.setCustFax(faxNo);
            } catch (Exception e) {
                
                throw new SystemException(e);
            }
            
            // Get detail data.
            // 明細情報取得
            List<LB001TtEdiRcvOdrReportByDetailDomain> ttEdiRcvOdrReportList = getDetail(shipper, headDomain);
            List<LB001ReportDetailDomain> detailList = new ArrayList<LB001ReportDetailDomain>();
            for (LB001TtEdiRcvOdrReportByDetailDomain tDm : ttEdiRcvOdrReportList) {
                LB001ReportDetailDomain detailDomain = new LB001ReportDetailDomain();
                
                detailDomain.setCustPartNo(tDm.getCustomerItemNoOrg());
                if (tDm.getOdrCtrlNo() != null) {
                    detailDomain.setControlNo(StringUtil.convertIntegerStr(tDm.getOdrCtrlNo()));
                }
                detailDomain.setPartNo(tDm.getItemNo());
                if (EDI_RCV_ODR_ODR_CHG_TYP_CHANGE.equals(tDm.getOdrChgTyp())
                    || EDI_RCV_ODR_ODR_CHG_TYP_DELETE.equals(tDm.getOdrChgTyp())
                    || EDI_RCV_ODR_ODR_CHG_TYP_ERROR.equals(tDm.getOdrChgTyp())) {
                    detailDomain.setNewRec("New");
                    detailDomain.setOldRec("Old");
                }
                detailDomain.setOldRecvDate(DateUtil.formatDate(tDm.getOldCustomerDueDt(), formatDate));
                detailDomain.setOldEtd(DateUtil.formatDate(tDm.getOldEtdDueDt(), formatDate));
                if (tDm.getOldOdrQty() != null) {
                    detailDomain.setOldQty(StringUtil.convertIntegerStr(tDm.getOldOdrQty()));
                }
                detailDomain.setOldTrans(tDm.getOldTrnsCd());
                detailDomain.setOldOrderNo(tDm.getOldCustomerPoNo());
                detailDomain.setNewRecvDate(DateUtil.formatDate(tDm.getNewCustomerDueDt(), formatDate));
                detailDomain.setNewEtd(DateUtil.formatDate(tDm.getNewEtdDueDt(), formatDate));
                if (tDm.getNewOdrQty() != null) {
                    detailDomain.setNewQty(StringUtil.convertIntegerStr(tDm.getNewOdrQty()));
                }
                detailDomain.setNewTrans(tDm.getNewTrnsCd());
                detailDomain.setNewOrderNo(tDm.getNewCustomerPoNo());
                String errCodeStr = StringUtil.getEmptyToBlank(tDm.getErrCdList());
                if (errCodeStr.contains("01")) {
                    detailDomain.setMsgCode01("01");
                }
                if (errCodeStr.contains("02")) {
                    detailDomain.setMsgCode02("02");
                }
                if (errCodeStr.contains("03")) {
                    detailDomain.setMsgCode03("03");
                }
                if (errCodeStr.contains("04")) {
                    detailDomain.setMsgCode04("04");
                }
                if (errCodeStr.contains("05")) {
                    detailDomain.setMsgCode05("05");
                }
                if (errCodeStr.contains("06")) {
                    detailDomain.setMsgCode06("06");
                }
                if (errCodeStr.contains("07")) {        // UT415 ADD
                    detailDomain.setMsgCode06("07");    // UT415 ADD
                }                                       // UT415 ADD
                if (errCodeStr.contains("11")) {
                    detailDomain.setMsgCode11("11");
                }
                if (errCodeStr.contains("12")) {
                    detailDomain.setMsgCode12("12");
                }
                if (errCodeStr.contains("13")) {
                    detailDomain.setMsgCode13("13");
                }
                if (errCodeStr.contains("21")) {
                    detailDomain.setMsgCode21("21");
                }
                if (errCodeStr.contains("22")) {
                    detailDomain.setMsgCode22("22");
                }
                if (errCodeStr.contains("23")) {
                    detailDomain.setMsgCode23("23");
                }
                if (errCodeStr.contains("24")) {
                    detailDomain.setMsgCode24("24");
                }
                if (errCodeStr.contains("25")) {
                    detailDomain.setMsgCode25("25");
                }
                if (errCodeStr.contains("26")) {
                    detailDomain.setMsgCode26("26");
                }
                if (errCodeStr.contains("27")) {
                    detailDomain.setMsgCode27("27");
                }
                if (errCodeStr.contains("28")) {
                    detailDomain.setMsgCode28("28");
                }
                if (errCodeStr.contains("29")) {
                    detailDomain.setMsgCode29("29");
                }
                if (errCodeStr.contains("30")) {
                    detailDomain.setMsgCode30("30");
                }
                if (errCodeStr.contains("91")) {
                    detailDomain.setMsgCode91("91");
                }
                detailList.add(detailDomain);
            }
            reportDomain.setDetailList(detailList);
            reportList.add(createJasperPrint(REPORT_ID_LB001, reportDomain));
        }
        // Create report.
        // 帳票生成
        return createReport(REPORT_ID_LB001, reportList);
    }

    /**
     * Get the detail information.<br />
     * 明細情報を取得します。
     *
     * @param shipper Between sites COMPANY CODE of the ordering company<br />
     * 受注会社の拠点間会社コード
     * @param headDomain Header information<br />
     * ヘッダー情報
     * @return ttEdiRcvOdrReportList specification information<br />
     * ttEdiRcvOdrReportList 明細情報
     * @throws ApplicationException Failed to get information<br />
     * 情報の取得に失敗した場合
     */
    protected List<LB001TtEdiRcvOdrReportByDetailDomain> getDetail(String shipper,
        LB001VtRpOdrRcvErrReportByHdrDomain headDomain) throws ApplicationException {
        LB001TtEdiRcvOdrReportByDetailCriteriaDomain ttCriteria = new LB001TtEdiRcvOdrReportByDetailCriteriaDomain();
        ttCriteria.setRcvOdrCompCd(shipper);
        ttCriteria.setCustomerCd(headDomain.getCustomerCd());
        ttCriteria.setLgcyShipTo(headDomain.getLgcyShipTo());
        ttCriteria.setTransmissionDt(headDomain.getTransmissionDt());
        ttCriteria.setPlntCd(headDomain.getPlntCd());
        ttCriteria.setCustomerSubsidiaryCd(headDomain.getCustomerSubsidiaryCd());
        List<LB001TtEdiRcvOdrReportByDetailDomain> ttEdiRcvOdrReportList = rpOdrRcvDao.searchTtEdiRcvOdrReportByDetail(ttCriteria);
        return ttEdiRcvOdrReportList;
    }

    /**
     * Get the header information.<br />
     * ヘッダー情報を取得します。
     *
     * @param shipper Between sites COMPANY CODE of the ordering company<br />
     * @param subCd Customer Subsidiary code<br />
     * @param transDate Between sites COMPANY CODE of the ordering company<br />
     * @param CustCd Between sites COMPANY CODE of the ordering company<br />
     * @param lgcyShipTo Between sites COMPANY CODE of the ordering company<br />
     * @param plantCd Between sites COMPANY CODE of the ordering company<br />
     * 受注会社の拠点間会社コード
     * @return headList headList header information<br />
     * ヘッダー情報
     * @throws ApplicationException Failed to get information<br />
     * 情報の取得に失敗した場合
     */
    protected List<LB001VtRpOdrRcvErrReportByHdrDomain> getHeader(String shipper, String subCd, Date transDate, String CustCd, String lgcyShipTo, String plantCd) throws ApplicationException {
        LB001VtRpOdrRcvErrReportByHdrCriteriaDomain vtCriteria = new LB001VtRpOdrRcvErrReportByHdrCriteriaDomain();
        vtCriteria.setRcvOdrCompCd(shipper);
        vtCriteria.setCustomerSubsidiaryCd(subCd);
        vtCriteria.setTransmissionDt(transDate);
        vtCriteria.setCustomerCd(CustCd);
        vtCriteria.setLgcyShipTo(lgcyShipTo);
        vtCriteria.setPlntCd(plantCd);
        vtCriteria.setPreferredOrder("PLNT_CD, CUSTOMER_SUBSIDIARY_CD, CUSTOMER_CD, LGCY_SHIP_TO, TRANSMISSION_DT");
        List<LB001VtRpOdrRcvErrReportByHdrDomain> headList = rpOdrRcvDao.searchVtRpOdrRcvErrReportHdr(vtCriteria);
        return headList;
    }

    /**
     * Get the own base information.<br />
     * 自拠点情報を取得します。
     *
     * @param shipper Between sites COMPANY CODE of the ordering company<br />
     * 受注会社の拠点間会社コード
     * @return tmList own base information<br />
     * tmList 自拠点情報
     * @throws ApplicationException Failed to get information<br />
     * 情報の取得に失敗した場合
     */
    protected List<TmNxsCompDomain> getHeadPrint(String shipper) throws ApplicationException {
        TmNxsCompCriteriaDomain tmCriteria = new TmNxsCompCriteriaDomain();
        tmCriteria.setCompCd(shipper);
        List<TmNxsCompDomain> tmList = tmNxsCompService.searchByCondition(tmCriteria);
        return tmList;
    }
    
    /**
     * Generate a form object.<br />
     * 帳票オブジェクトを生成します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @return Document object<br />
     * 帳票オブジェクト
     */
    protected File getReportFile(LB001ReportDomain reportDomain) {
        return createReport(REPORT_ID_LB001, reportDomain);
    }
}
