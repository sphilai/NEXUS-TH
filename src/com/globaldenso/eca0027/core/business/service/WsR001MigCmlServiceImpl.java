/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.IVN_CATEGORY_COMMERCIAL_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIGRATION_DSCID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MNF_FLAG_NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MNF_FLAG_OK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BOTH_VANNING;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService;
import com.globaldenso.eca0027.core.business.dao.MigCmlDao;
import com.globaldenso.eca0027.core.business.domain.MigCmlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkDetailItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkItemCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of the CML print service for shift.
 * <br />移行用CML印刷サービスの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13546 $
 */
public class WsR001MigCmlServiceImpl implements WsR001MigCmlService {
    
    /**
     * Error message
     * <br />エラーメッセージ
     */
    protected static final String ERR_MSG_NO_DATA = "No data found. Table:{0} Creteria:{1}";
    
    /**
     * UNIT CD (cubic meter)
     * <br />単位コード (立方メートル)
     */
    protected static final String UNIT_CD_CUBIC_METER = "CR";
    
    /**
     * UNIT CD (kilogram)
     * <br />単位コード (キログラム)
     */
    protected static final String UNIT_CD_KILOGRAM = "KG";
    
    /**
     * UNIT CD (meter)
     * <br />単位コード (メートル)
     */
    protected static final String UNIT_CD_METER = "MR";
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * CML-Header-Interface service
     * <br />ケースマークヘッダ連携サービス
     */
    protected TwCaseMarkHdrIfService twCaseMarkHdrIfService;
    
    /**
     * CML-Detail-Interface service
     * <br />ケースマーク明細連携サービス
     */
    protected TwCaseMarkDtlIfService twCaseMarkDtlIfService;
    
    /**
     * CML-Error-Report-Header service
     * <br />CMLエラーレポートヘッダサービス
     */
    protected TtCmlErrorHeaderService ttCmlErrorHeaderService;
    
    /**
     * CML-Error-Report-Detail service
     * <br />CMLエラーレポート明細サービス
     */
    protected TtCmlErrorDtlService ttCmlErrorDtlService;
    
    /**
     * CML error report service
     * <br />CMLエラーレポートサービス
     */
    protected L2005ReportService l2005ReportService;
    
    /**
     * CML service
     * <br />CMLサービス
     */
    protected L2003ReportService l2003ReportService;

    /**
     * Palletize service
     * <br />パレタイズサービス
     */
    protected TtPltzService ttPltzService;
    
    /**
     * Palletize-Item service
     * <br />パレタイズ対象品サービス
     */
    protected TtPltzItemService ttPltzItemService;
    
    /**
     * Palletize Item Receive Order   Service
     * <br />パレタイズ対象品受注情報 サービス
     */
    protected TtPltzItemOdrService ttPltzItemOdrService;
    
    /**
     * CML printing DAO for shift
     * <br />移行用CML印刷DAO
     */
    protected MigCmlDao migCmlDao;
    
    /**
     * NEXUS-Company-Master service
     * <br />NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Printer-Master service
     * <br />プリンタ原単位サービス
     * 
     * ST 958 ADD
     */
    protected TmPrinterService tmPrinterService;
    
    /**
     * Type in the functional overview of the constructor.
     */
    public WsR001MigCmlServiceImpl() {
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
     * Setter method for twCaseMarkHdrIfService.
     *
     * @param twCaseMarkHdrIfService Set for twCaseMarkHdrIfService
     */
    public void setTwCaseMarkHdrIfService(
        TwCaseMarkHdrIfService twCaseMarkHdrIfService) {
        this.twCaseMarkHdrIfService = twCaseMarkHdrIfService;
    }

    /**
     * Setter method for twCaseMarkDtlIfService.
     *
     * @param twCaseMarkDtlIfService Set for twCaseMarkDtlIfService
     */
    public void setTwCaseMarkDtlIfService(
        TwCaseMarkDtlIfService twCaseMarkDtlIfService) {
        this.twCaseMarkDtlIfService = twCaseMarkDtlIfService;
    }

    /**
     * Setter method for ttCmlErrorHeaderService.
     *
     * @param ttCmlErrorHeaderService Set for ttCmlErrorHeaderService
     */
    public void setTtCmlErrorHeaderService(
        TtCmlErrorHeaderService ttCmlErrorHeaderService) {
        this.ttCmlErrorHeaderService = ttCmlErrorHeaderService;
    }

    /**
     * Setter method for ttCmlErrorDtlService.
     *
     * @param ttCmlErrorDtlService Set for ttCmlErrorDtlService
     */
    public void setTtCmlErrorDtlService(TtCmlErrorDtlService ttCmlErrorDtlService) {
        this.ttCmlErrorDtlService = ttCmlErrorDtlService;
    }

    /**
     * Setter method for l2005ReportService.
     *
     * @param reportService Set for l2005ReportService
     */
    public void setL2005ReportService(L2005ReportService reportService) {
        l2005ReportService = reportService;
    }

    /**
     * Setter method for l2003ReportService.
     *
     * @param reportService Set for l2003ReportService
     */
    public void setL2003ReportService(L2003ReportService reportService) {
        l2003ReportService = reportService;
    }

    /**
     * Setter method for ttPltzItemOdrService.
     *
     * @param ttPltzItemOdrService Set for ttPltzItemOdrService
     */
    public void setTtPltzItemOdrService(TtPltzItemOdrService ttPltzItemOdrService) {
        this.ttPltzItemOdrService = ttPltzItemOdrService;
    }

    /**
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * Setter method for ttPltzItemService.
     *
     * @param ttPltzItemService Set for ttPltzItemService
     */
    public void setTtPltzItemService(TtPltzItemService ttPltzItemService) {
        this.ttPltzItemService = ttPltzItemService;
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
     * Getter method for tmPrinterService.
     *
     * @return the tmPrinterService
     */
    public TmPrinterService getTmPrinterService() {
        return tmPrinterService;
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
     * Setter method for migCmlDao.
     *
     * @param migCmlDao Set for migCmlDao
     */
    public void setMigCmlDao(MigCmlDao migCmlDao) {
        this.migCmlDao = migCmlDao;
    }

    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.WsR001MigCmlService#createMigCml(WsR001CriteriaDomain)
     */
    public List<String> createMigCml(WsR001CriteriaDomain criteria)
        throws ApplicationException {
        
        List<String> errorMessageList = new ArrayList<String>();
        
        // List of case mark headers (parameter)  
        // ケースマークヘッダのリスト(パラメータより)
        List<? extends WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemList =
            criteria.getMigrationCaseMarkRoot().getMigrationCaseMarkItemList();
        // Shipper CD (parameter)  
        // 荷主コード(パラメータより)
        String shipperCd = criteria.getMigrationCaseMarkRoot().getShipperCd();
        
        if (migrationCaseMarkItemList == null || migrationCaseMarkItemList.isEmpty()) {
            return errorMessageList;
        }
        
        // During reruns request can not be registered in the work.
        // リラン要求時はワークへ登録しない。
        if (!FLAG_Y.equals(criteria.getMigrationCaseMarkRoot().getRerunFlg())) {
            
            // Delete of a work table (work table initialize)  
            // ワークテーブルの削除(ワークテーブル初期化)
            for (WsR001migrationCaseMarkItemCriteriaDomain CriteriaDomain : migrationCaseMarkItemList) {
                
                // A delete of CML-Header-Interface work
                // ケースマークヘッダ連携ワークの削除
                TwCaseMarkHdrIfCriteriaDomain deleteHdrCriteria = new TwCaseMarkHdrIfCriteriaDomain();
                deleteHdrCriteria.setMainMark(CriteriaDomain.getMainMark());
                deleteHdrCriteria.setLocale(criteria.getLocale());
                deleteTwCaseMarkHdrIf(deleteHdrCriteria);
                
                // A delete of CML-Detail-Interface work
                // ケースマーク明細連携ワークの削除
                TwCaseMarkDtlIfCriteriaDomain deleteDtlCriteria = new TwCaseMarkDtlIfCriteriaDomain();
                deleteDtlCriteria.setMainMark(CriteriaDomain.getMainMark());
                deleteDtlCriteria.setLocale(criteria.getLocale());
                deleteTwCaseMarkDtlIf(deleteDtlCriteria);
            }
            
            // The information on the case mark received with (1) request parameter is kept to a temporary table.
            // (1)リクエストパラメータで受け取ったケースマークの情報を一時テーブルに保管する。

            // Registration to a work table
            // ワークテーブルへの登録
            for (WsR001migrationCaseMarkItemCriteriaDomain criteriaDomain : migrationCaseMarkItemList) {

                // Registration of CML-Header-Interface work
                // ケースマークヘッダ連携ワークの登録
                TwCaseMarkHdrIfDomain createHdrDomain = new TwCaseMarkHdrIfDomain();
                createHdrDomain.setMainMark(setSpace(criteriaDomain.getMainMark()));
                createHdrDomain.setPalletNo(setSpace(criteriaDomain.getPalletNo()));
                createHdrDomain.setNetWeight(setZero(criteriaDomain.getNetWeight()));
                createHdrDomain.setGrossWeight(setZero(criteriaDomain.getGrossWeight()));
                createHdrDomain.setVolume(setZero(criteriaDomain.getVolume()));
                String customerCd = String.valueOf(Integer.parseInt(criteriaDomain.getCustomerNo()));
                createHdrDomain.setCustomerCd(setSpace(customerCd));
                createHdrDomain.setLgcyShipTo(setSpace(criteriaDomain.getShipTo()));
                createHdrDomain.setTrnsCd(setSpace(criteriaDomain.getTrnsWayCd()));
                createHdrDomain.setPlntCd(setSpace(criteriaDomain.getPlantCd()));
                createHdrDomain.setLgcyWhCd(setSpace(criteriaDomain.getWhCd()));
                createHdrDomain.setContainerGrpCd(setSpace(criteriaDomain.getContainerGroupCd()));
                createHdrDomain.setPrinterId(criteriaDomain.getPrinterId()); // ST958 ADD
                createHdrDomain.setShipperCd(shipperCd);
                if (FLAG_Y.equals(criteriaDomain.getMultiPartNoFlg())) {
                    createHdrDomain.setPkgFormTyp(PKG_FORM_TYP_MULTI);
                } else {
                    createHdrDomain.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
                }

                createHdrDomain.setComUpdateFuncId(MIGRATION_DSCID);
                createHdrDomain.setComUpdateUserId(MIGRATION_DSCID);
                createHdrDomain.setComUpdateTimestamp(new Timestamp(1));
                createHdrDomain.setComCreateFuncId(MIGRATION_DSCID);
                createHdrDomain.setComCreateUserId(MIGRATION_DSCID);
                createHdrDomain.setComCreateTimestamp(new Timestamp(1));
                // Registration of a header work
                // ヘッダワークの登録
                createTwCaseMarkHdrIf(createHdrDomain);

                // List of case mark details (parameter)  
                // ケースマーク明細のリスト(パラメータより)
                List<? extends WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
                    criteriaDomain.getMigrationCaseMarkDetailItemList();

                if (migrationCaseMarkDetailItemList == null || migrationCaseMarkDetailItemList.isEmpty()) {
                    continue;
                }

                for (WsR001migrationCaseMarkDetailItemCriteriaDomain detailCriteriaDomain : migrationCaseMarkDetailItemList) {

                    // Registration of CML-Detail-Interface work
                    // ケースマーク明細連携ワークの登録
                    TwCaseMarkDtlIfDomain createDtlDomain = new TwCaseMarkDtlIfDomain();
                    createDtlDomain.setCustomerPoNo(setSpace(detailCriteriaDomain.getCustomerPoNo()));
                    createDtlDomain.setOdrCtrlNo(setZero(detailCriteriaDomain.getOdrCtrlNo()));
                    createDtlDomain.setAllocQty(setZero(detailCriteriaDomain.getAllocQty()));
                    createDtlDomain.setItemWeight(setZero(detailCriteriaDomain.getItemWeight()));

                    // Since the name of parameter is different, this is a set.
                    // パラメータの名前が違う為セット
                    createDtlDomain.setMainMark(criteriaDomain.getMainMark());
                    createDtlDomain.setPltzItemNo(detailCriteriaDomain.getPartNo());
                    createDtlDomain.setEtdDueDt(DateUtil.parseDate(detailCriteriaDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
                    createDtlDomain.setCustomerItemNo(setSpace(detailCriteriaDomain.getCustomerPartNo()));
                    createDtlDomain.setCustomerItemNoOrg(setSpace(detailCriteriaDomain.getCustomerPartNoOrg()));
                    createDtlDomain.setQtyUnit(setSpace(detailCriteriaDomain.getMeasureUnit()));
                    createDtlDomain.setShippingLot(new BigDecimal(detailCriteriaDomain.getShipLotQty()));
                    createDtlDomain.setPlntCd(setSpace(detailCriteriaDomain.getPlantCd()));
                    createDtlDomain.setCurrCd(setSpace(detailCriteriaDomain.getCurrencyCd()));
                    createDtlDomain.setComUpdateFuncId(MIGRATION_DSCID);
                    createDtlDomain.setComUpdateUserId(MIGRATION_DSCID);
                    createDtlDomain.setComUpdateTimestamp(new Timestamp(1));
                    createDtlDomain.setComCreateFuncId(MIGRATION_DSCID);
                    createDtlDomain.setComCreateUserId(MIGRATION_DSCID);
                    createDtlDomain.setComCreateTimestamp(new Timestamp(1));
                    // Registration of a detailed work
                    // 明細ワークの登録
                    createTwCaseMarkDtlIf(createDtlDomain);
                }
            }
        }
        
        // Since the information on two or more case marks is included in the information which carried out (2) storage, the following processings are repeated in a case mark unit.
        // (2)保管した情報には複数ケースマークの情報を含むため、ケースマーク単位で以下の処理を繰り返す。
        
        // Case mark No. list extraction
        // ケースマークNo.一覧取り出し
        //List<? extends MigCmlDomain> mainMarkList = migCmlDao.searchByKeyMigCmlForHeadDistinct();

        List<MigCmlDomain> MigCmlDomainList = new ArrayList<MigCmlDomain>();
        List<List<? extends MigCmlDomain>> cmlDtilListList = new ArrayList<List<? extends MigCmlDomain>>();

        // acquired list part processing of case mark No.
        // 取得したケースマークNo.の一覧分処理
        //for (MigCmlDomain mainMarkNo : mainMarkList) {
        for (WsR001migrationCaseMarkItemCriteriaDomain CriteriaDomain : migrationCaseMarkItemList) {

            // CML-Header-Interface search-condition domain
            // ケースマークヘッダ連携検索条件ドメイン
            MigCmlCriteriaDomain searchByCondtionMigCmlForCmlHeadCriteria = new MigCmlCriteriaDomain();
            
            searchByCondtionMigCmlForCmlHeadCriteria.setMainMark(CriteriaDomain.getMainMark());
            // Acquisition of CML Header Interface
            // ケースマークヘッダ連携の取得
            MigCmlDomain cmlHeadDomain = migCmlDao.searchByCondtionMigCmlForCmlHead(searchByCondtionMigCmlForCmlHeadCriteria);
            if (cmlHeadDomain == null) {
                List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                String msg = createMessage(ERR_MSG_NO_DATA, new String[]{ "TW_CASE_MARK_HDR_IF", CriteriaDomain.getMainMark() });
                errorList.add(new MessageDomain("", "", new Object[]{ msg }));
                throw new ValidationException(errorList);
            }
            
            // CML-Detail-Interface search-condition domain
            // ケースマーク明細連携検索条件ドメイン
            MigCmlCriteriaDomain searchByCondtionMigCmlForCmlDtilCriteria = new MigCmlCriteriaDomain();
            
            searchByCondtionMigCmlForCmlDtilCriteria.setMainMark(cmlHeadDomain.getMainMark());
            searchByCondtionMigCmlForCmlDtilCriteria.setShipperCd(cmlHeadDomain.getShipperCd());
            searchByCondtionMigCmlForCmlDtilCriteria.setCustomerCd(cmlHeadDomain.getCustomerCd());
            searchByCondtionMigCmlForCmlDtilCriteria.setLgcyShipTo(cmlHeadDomain.getLgcyShipTo());
            
            // The system date of Shipper is acquired.
            // Shipperのシステム日付を取得
            String timezoneId = commonService.searchTimezone(cmlHeadDomain.getShipperCd());
            Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
            searchByCondtionMigCmlForCmlDtilCriteria.setAplyStrtDt(sysdate);
            cmlHeadDomain.setErrorReportTs(new Timestamp(sysdate.getTime()));
            
            // CML-Detail-Interface acquisition
            // ケースマーク明細連携取得
            List<? extends MigCmlDomain> cmlDtilList = 
                migCmlDao.searchByCondtionMigCmlForCmlDtil(searchByCondtionMigCmlForCmlDtilCriteria);
            
            // 移行不具合対応:Airの場合
            if(TRNS_CD_AIR.equals(cmlHeadDomain.getTrnsCd())) {
                for(MigCmlDomain cmlDtil : cmlDtilList) {
                    cmlDtil.setStgInstrItemFlg(FLAG_Y);
                    cmlDtil.setCustomTimingTyp(BOTH_VANNING);
                    cmlDtil.setContainerLooseTyp(CONTAINER_LOOSE_TYP_LOOSE);
                }
            }
            
            // The information on (3) masters is combined and a Palletize check is performed.
            // (3)原単位の情報を結合し、パレタイズチェックを行う。

            List<String> errChkList = new ArrayList<String>();
            List<String> errChkDtlList = new ArrayList<String>();
            boolean errFlg = false;
            
            // header information check
            // ヘッダ情報チェック
            // In the case of an error
            // エラーの場合
            if (!checkCmlHead(cmlHeadDomain, errChkList)) {
                // CML-Error-Report-Header registration
                // CMLエラーレポートヘッダ登録
                createTtCmlErrorHeader(cmlHeadDomain, errChkList);
                printErrorHeader(cmlHeadDomain);
                errFlg = true;

            }
            // Detailed information check
            // 明細情報チェック
            // In the case of an error
            // エラーの場合
            if (!errFlg) {
                if (!checkCmlDtil(cmlHeadDomain, cmlDtilList, errChkDtlList)) {
                    // CML-Error-Report-Detail registration
                    // CMLエラーレポート明細登録
                    createTtCmlErrorHeader(cmlHeadDomain, errChkDtlList);
                    createTtCmlErrorDtil(cmlHeadDomain, cmlDtilList);
                    printErrorHeader(cmlHeadDomain);
                    errFlg = true;
                }
            }
            
            if (!errFlg) {
                MigCmlDomainList.add(cmlHeadDomain);
                cmlDtilListList.add(cmlDtilList);
            }
        }
        
        // Registration process of the normal palletizing data. 
        // チェック正常分パレタイズ情報の登録処理
        int j = 0;
        for (MigCmlDomain cmlHeadDomain : MigCmlDomainList) {
            
            // ST957 ADD START
            // Delete If migrated palletize exists.
            // 移行済みのパレタイズが存在する場合削除
            TtPltzCriteriaDomain pltzDeleteCriteria = new TtPltzCriteriaDomain();
            pltzDeleteCriteria.setMainMark(cmlHeadDomain.getMainMark());
            pltzDeleteCriteria.setSearchCountCheckFlg(false);
            if (0 < ttPltzService.searchCount(pltzDeleteCriteria)) {
                ttPltzService.deleteByCondition(pltzDeleteCriteria);
            }
            
            // Delete If migrated palletize item exists.
            // 移行済みのパレタイズ対象品が存在する場合削除
            TtPltzItemCriteriaDomain pltzItemDeleteCriteria = new TtPltzItemCriteriaDomain();
            pltzItemDeleteCriteria.setMainMark(cmlHeadDomain.getMainMark());
            pltzItemDeleteCriteria.setSearchCountCheckFlg(false);
            if (0 < ttPltzItemService.searchCount(pltzItemDeleteCriteria)) {
                ttPltzItemService.deleteByCondition(pltzItemDeleteCriteria);
            }
            
            // Delete If migrated palletize item order exists.
            // 移行済みのパレタイズ対象品受注情報が存在する場合削除
            TtPltzItemOdrCriteriaDomain pltzItemOdrDeleteCriteria = new TtPltzItemOdrCriteriaDomain();
            pltzItemOdrDeleteCriteria.setMainMark(cmlHeadDomain.getMainMark());
            pltzItemOdrDeleteCriteria.setSearchCountCheckFlg(false);
            if (0 < ttPltzItemOdrService.searchCount(pltzItemOdrDeleteCriteria)) {
                ttPltzItemOdrService.deleteByCondition(pltzItemOdrDeleteCriteria);
            }
            // ST957 ADD END
            
            List<? extends MigCmlDomain> cmlDtilList = cmlDtilListList.get(j);

            String timezoneId = commonService.searchTimezone(cmlHeadDomain.getShipperCd());
            Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
            
            // Registration to a Palletize table
            // パレタイズテーブルへの登録
            TtPltzDomain ttPltz = setTtPltzDomain(cmlHeadDomain, cmlDtilList, sysdate);
            ttPltzService.create(ttPltz);
            
            // Registration to Palletize-Item table
            // パレタイズ対象品テーブルへの登録
            List<TtPltzItemDomain> ttPltzItemList = new ArrayList<TtPltzItemDomain>();
            // It registers several detail record minutes.
            // 明細レコード数分登録する
            for (int i = 0; i < cmlDtilList.size(); i++) {
                MigCmlDomain cmlDtilDomain = cmlDtilList.get(i);
                TtPltzItemDomain ttPltzItemDomain = setTtPltzItemDomain(i + 1, cmlHeadDomain, cmlDtilDomain);
                ttPltzItemList.add(ttPltzItemDomain);
            }
            ttPltzItemService.create(ttPltzItemList);

            MigCmlCriteriaDomain searchByCondtionMigCmlForCmlDtilCriteria = new MigCmlCriteriaDomain();
            searchByCondtionMigCmlForCmlDtilCriteria.setMainMark(cmlHeadDomain.getMainMark());
            // CML-Detail-Interface acquisition
            // ケースマーク明細連携取得
            List<? extends MigCmlDomain> searchMarkDtlIfByPltizList = migCmlDao.searchByConditionMigCmlForCmlDtl(searchByCondtionMigCmlForCmlDtilCriteria);
            // Registration to Palletize Item Receive Order
            // パレタイズ対象品受注情報への登録
            List<TtPltzItemOdrDomain> ttPltzItemOdrList = new ArrayList<TtPltzItemOdrDomain>();
            for (MigCmlDomain dtilDomain : searchMarkDtlIfByPltizList) {
                TtPltzItemOdrDomain ttPltzItemOdrDomain = setTtPltzItemOdrDomain(cmlHeadDomain, dtilDomain);
                ttPltzItemOdrList.add(ttPltzItemOdrDomain);
            }
            ttPltzItemOdrService.create(ttPltzItemOdrList);
            
            // Palletize post-processing
            // パレタイズ後処理
            TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
            ttPltzItemOdrCriteria.setMainMark(cmlHeadDomain.getMainMark());

            ttPltzItemOdrCriteria.setPreferredOrder("ETD_DUE_DT asc");
            List<TtPltzItemOdrDomain> searchTtPltzItemOdrList = ttPltzItemOdrService.searchByCondition(ttPltzItemOdrCriteria);
            // earliest ETD is searched and it sets to a Palletize.
            // 最も早いETDを検索し、パレタイズに設定する。
            Date minDueDt = searchTtPltzItemOdrList.get(0).getEtdDueDt();
            
            // Update to a Palletize table
            // パレタイズテーブルへの更新
            TtPltzDomain updateTtPltzDomain = new TtPltzDomain();
            updateTtPltzDomain.setDueDt(minDueDt);

            TtPltzCriteriaDomain updateCriteria = new TtPltzCriteriaDomain();
            updateCriteria.setMainMark(cmlHeadDomain.getMainMark());
            
            ttPltzService.updateByCondition(updateTtPltzDomain, updateCriteria);
            
            // Case mark printing
            // ケースマーク印刷
            //printHeader(cmlHeadDomain); // ST922 DEL
            
            j++;

        }
        
        // ST922 ADD
        for (MigCmlDomain cmlHeadDomain : MigCmlDomainList) {
            // Case mark printing
            // ケースマーク印刷
            printHeader(cmlHeadDomain);            
        }
        
        return errorMessageList;
    }

    
    /**
     * A delete of a CML-Header-Interface work
     * <br />ケースマークヘッダ連携ワークの削除
     *
     * @param deleteHdrCriteria condition domain<br />条件ドメイン
     * @throws ApplicationException when CML-Header-Interface work cannot delete<br />ケースマークヘッダ連携ワークが削除できない場合
     */
    protected void deleteTwCaseMarkHdrIf(TwCaseMarkHdrIfCriteriaDomain deleteHdrCriteria) throws ApplicationException {
        List<TwCaseMarkHdrIfDomain> list = twCaseMarkHdrIfService.searchByCondition(deleteHdrCriteria);
        if (0 < list.size()) {
            twCaseMarkHdrIfService.deleteByCondition(deleteHdrCriteria);
        }
    }
    
    /**
     * A delete of a CML-Detail-Interface work
     * <br />ケースマーク明細連携ワークの削除
     *
     * @param deleteDtlCriteria condition domain<br />条件ドメイン
     * @throws ApplicationException when CML-Detail-Interface work cannot delete<br />ケースマーク明細連携ワークが削除できない場合
     */
    protected void deleteTwCaseMarkDtlIf(TwCaseMarkDtlIfCriteriaDomain deleteDtlCriteria) throws ApplicationException {
        List<TwCaseMarkDtlIfDomain> list = twCaseMarkDtlIfService.searchByCondition(deleteDtlCriteria);
        if (0 < list.size()) {
            twCaseMarkDtlIfService.deleteByCondition(deleteDtlCriteria);
        }
    }
    
    /**
     * Registration of a CML-Header-Interface work
     * <br />ケースマークヘッダ連携ワークの登録
     *
     * @param createHdrDomain condition domain<br />条件ドメイン
     * @throws ApplicationException when CML-Header-Interface work cannot register<br />ケースマークヘッダ連携ワークが登録できない場合
     */
    protected void createTwCaseMarkHdrIf(TwCaseMarkHdrIfDomain createHdrDomain) throws ApplicationException {
        twCaseMarkHdrIfService.create(createHdrDomain);
    }
    
    /**
     * Registration of a CML-Detail-Interface work
     * <br />ケースマーク明細連携ワークの登録
     *
     * @param createDtlDomain condition domain<br />条件ドメイン
     * @throws ApplicationException when CML-Detail-Interface work cannot register<br />ケースマーク明細連携ワークが登録できない場合
     */
    protected void createTwCaseMarkDtlIf(TwCaseMarkDtlIfDomain createDtlDomain) throws ApplicationException {
        twCaseMarkDtlIfService.create(createDtlDomain);
    }
    
    
    /**
     * Header information check
     * <br />ヘッダ情報チェック
     *
     * @param cmlHeadDomain the domain which carries out a cmlHeadDomain check<br />チェックするドメイン
     * @param errChkList detailed error-checking list<br />明細エラーチェックリスト
     * @return checkFlg (true or false)
     */
    protected boolean checkCmlHead(MigCmlDomain cmlHeadDomain, List<String> errChkList) {
        
        // Shipper, Customer, a Ship to combination check
        // Shipper、Customer、Ship to組み合わせチェック
        if (CheckUtil.isBlankOrNull(cmlHeadDomain.getShipToCd())) {
            errChkList.add("CHK_RESULT_A");
        }
        // Consignee existence check
        // 荷受人存在チェック
        if (CheckUtil.isBlankOrNull(cmlHeadDomain.getCompCd())) {
            errChkList.add("CHK_RESULT_B");
        }
        // Shipper, W/H, a Plant combination check
        // Shipper、W/H、Plant組み合わせチェック
        if (CheckUtil.isBlankOrNull(cmlHeadDomain.getWhCompCd()) || CheckUtil.isBlankOrNull(cmlHeadDomain.getWhCd())) {
            errChkList.add("CHK_RESULT_C");
        }
        
        if (!errChkList.isEmpty()) {
            return false;
        }
        return true;
    }
    
    /**
     * Detailed information check
     * <br />明細情報チェック
     *
     * @param cmlHeadDomain the domain which carries out check<br />チェックするドメイン
     * @param cmlDtilList the detailed list which carries out check<br />チェックする明細リスト
     * @param errChkDtlList detailed error-checking list<br />明細エラーチェックリスト
     * @return checkFlg (true or false)
     */
    protected boolean checkCmlDtil(MigCmlDomain cmlHeadDomain, List<? extends MigCmlDomain> cmlDtilList, List<String> errChkDtlList) {
        
        // Detailed check list
        // 明細チェックリスト
        List<String> itemNoList = new ArrayList<String>();
        List<String> invSetKeyList = new ArrayList<String>();
        List<String> ContSortKeyList = new ArrayList<String>();
        List<String> currencycdList = new ArrayList<String>();
        List<String> itemFlgList = new ArrayList<String>();
        List<String> clList = new ArrayList<String>();
        List<String> ccTypeList = new ArrayList<String>();
        List<String> ldCdList = new ArrayList<String>();
        boolean nullFlg = false;
        String cigmaInfoFlg = new String();
        String expItemNoSpInfoFlg = new String();
        String expFormalitiItemNoFlg = new String();

        for (MigCmlDomain migCml : cmlDtilList) {
            itemNoList.add(migCml.getPltzItemNo());
            invSetKeyList.add(migCml.getInvoiceKey());
            ContSortKeyList.add(migCml.getContainerSortingKey());
            currencycdList.add(migCml.getCurrCd());
            itemFlgList.add(migCml.getStgInstrItemFlg());
            clList.add(migCml.getContainerLooseTyp());
            ccTypeList.add(migCml.getCustomTimingTyp());
            ldCdList.add(migCml.getLoadingCd());
            
            // CIGMA information acquisition check
            // CIGMA情報取得チェック
            if (CheckUtil.isBlankOrNull(migCml.getCurrCd()) || migCml.getCurrCd().trim().equals("")) {
                nullFlg = true;
                cigmaInfoFlg = MNF_FLAG_NG;
            } else {
                cigmaInfoFlg = MNF_FLAG_OK;
            }
            
            // Export-Shipping-Item-No information acquisition check OK:"Y", NG:"N"
            // 輸出出荷品番情報取得チェック OK:"Y"、NG:"N"
            if (CheckUtil.isBlankOrNull(migCml.getStgInstrItemFlg()) || migCml.getStgInstrItemFlg().trim().equals("")) {
                nullFlg = true;
                expItemNoSpInfoFlg = MNF_FLAG_NG; // UT298 MOD
            } else {
                expItemNoSpInfoFlg = MNF_FLAG_OK; // UT298 MOD
            }
            // export-formalities ITEM-NO-INFORMATION acquisition check OK:"Y", NG:"N"
            // 輸出手続き品番情報取得チェック OK:"Y"、NG:"N"
            if (CheckUtil.isBlankOrNull(migCml.getDngrItemFlg()) || migCml.getDngrItemFlg().trim().equals("")) {
                nullFlg = true;
                expFormalitiItemNoFlg = MNF_FLAG_NG; // UT298 MOD
            } else {
                expFormalitiItemNoFlg = MNF_FLAG_OK; // UT298 MOD
            }
            
            // ST956 DEL START
            // SHIPPING-LOT over check (unit of ITEM NO)  
            // 出荷ロット超えチェック（単品品番）
            //if (PKG_FORM_TYP_SINGLE.equals(cmlHeadDomain.getPkgFormTyp().trim())) {
            //    // In ALLOC_QTY > SHIPPING_LOT, an error is made.
            //    // ALLOC_QTY > SHIPPING_LOT の場合エラー
            //    if (migCml.getAllocQty().compareTo(migCml.getShippingLot()) > 0) {
            //        errChkDtlList.add("CHK_RESULT_O");
            //    }
            //}
            // ST956 DEL END
            
            // String combination is carried out and the ITEM-NO master existence checked result of target ITEM NO is set up.
            // 対象品目番号の品目番号マスタ存在チェック結果を文字列結合し設定する
            migCml.setItemNoChkFlg(cigmaInfoFlg + expItemNoSpInfoFlg + expFormalitiItemNoFlg + MNF_FLAG_OK); // UT298 MOD
        }
        
        // Unit-of-ITEM-NO check
        // 単品品番チェック
        if (PKG_FORM_TYP_SINGLE.equals(cmlHeadDomain.getPkgFormTyp())) {
            if (!validateConsistencyAllSame(itemNoList)) {
                errChkDtlList.add("CHK_RESULT_E");
            }
        }
        
        // Inv. Key check
        // インボイスキーチェック
        if (!validateConsistencyAllSame(invSetKeyList)) {
            errChkDtlList.add("CHK_RESULT_F");
        }
        // CONTAINER-SORTING-KEY check
        // コンテナ層別キーチェック
        if (!validateConsistencyAllSame(ContSortKeyList)) {
            errChkDtlList.add("CHK_RESULT_G");
        }
        // Currency check
        // 通貨チェック
        if (!validateConsistencyAllSame(currencycdList)) {
            errChkDtlList.add("CHK_RESULT_H");
        }
        // staging-instruction flag check
        // 荷揃え指示フラグチェック
        if (!validateConsistencyAllSame(itemFlgList)) {
            errChkDtlList.add("CHK_RESULT_J");
        }
        // C/L check
        // コンテナルーズチェック
        if (!validateConsistencyAllSame(clList)) {
            errChkDtlList.add("CHK_RESULT_K");
        }
        // CUSTOM-TIMING-TYPE check
        // 通関タイミング区分チェック
        if (!validateConsistencyAllSame(ccTypeList)) {
            errChkDtlList.add("CHK_RESULT_L");
        }
        
        // loading position code check
        // 荷積み位置コードチェック
        // "D" (Door) and "B" (Back) are to selected loading position code of all the data.
        // 選択された全データの荷積み位置コードに"D"（Door）と"B"（Back）が
        // An error is made, when this is intermingled (*"F" (Free) can be intermingled [ other CDs and ]).
        // 混在している場合エラー(※"F"（Free）は他コードと混在可)
        if (ldCdList != null && ldCdList.size() > 0) {
            if (ldCdList.contains(LOADING_CD_DOOR) && ldCdList.contains(LOADING_CD_BACK)) {
                errChkDtlList.add("CHK_RESULT_I");
            }
        }
        
        // CIGMA information acquisition check
        // CIGMA情報取得チェック
        // Export-Shipping-Item-No information acquisition check
        // 輸出出荷品番情報取得チェック
        // export-formalities ITEM-NO-INFORMATION acquisition check
        // 輸出手続き品番情報取得チェック
        if (nullFlg) {
            errChkDtlList.add("CHK_RESULT_P");
        }
        
        if (!errChkDtlList.isEmpty()) {
            return false;
        }
        return true;
    }
    
    /**
     * The same check
     * <br />同一チェック
     *
     * @param inputList same check list<br />同一チェックリスト
     * @return boolean
     */
    protected boolean validateConsistencyAllSame(List<String> inputList) {
        // This is confirmed whether all the selected data are the same.
        // 選択された全データが同一かどうかチェックする
        if (inputList != null && inputList.size() > 0) {
            String pre = "";
            boolean isCheck = false;
            for (String inputStr : inputList) {
                // It checks henceforth [ 2 line ].
                // 2行目以降でチェックを実施する
                if (isCheck && !StringUtils.equals(pre, inputStr)) {
                    return false;
                }
                isCheck = true;
                pre = inputStr;
            }
        }
        return true;
    }
    
    /**
     * CML-Error-Report-Header registration
     * <br />CMLエラーレポートヘッダ登録
     *
     * @param cmlHeadDomain header information domain<br />ヘッダ情報ドメイン
     * @param errChkList detailed error-checking list<br />明細エラーチェックリスト
     * @throws ApplicationException when CML-Error-Report-Header cannot register<br />CMLエラーレポートヘッダ登録ができなかった時
     */
    protected void createTtCmlErrorHeader(MigCmlDomain cmlHeadDomain, List<String> errChkList)
        throws ApplicationException {

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        // contents set of CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録内容セット
        ttCmlErrorHeader.setDscId(MIGRATION_DSCID);
        ttCmlErrorHeader.setPalletNo(cmlHeadDomain.getPalletNo());
        ttCmlErrorHeader.setExpPackingIssuerNm(MIGRATION_DSCID);
        ttCmlErrorHeader.setShipperCd(setSpace(cmlHeadDomain.getShipperCd()));
        ttCmlErrorHeader.setCustomerCd(setSpace(cmlHeadDomain.getCustomerCd()));
        ttCmlErrorHeader.setLgcyShipTo(setSpace(cmlHeadDomain.getLgcyShipTo()));
        ttCmlErrorHeader.setTrnsCd(setSpace(cmlHeadDomain.getTrnsCd()));
        ttCmlErrorHeader.setPlntCd(setSpace(cmlHeadDomain.getPlntCd()));
        ttCmlErrorHeader.setLgcyWhCd(setSpace(cmlHeadDomain.getLgcyWhCd()));
        
        // Sleep 5 milliseconds
        // 5ミリ秒待機
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new GscmApplicationException(e);
        }
        
        // Acquisition of a time stamp
        // タイムスタンプの取得
        Timestamp errCreateTimestamp = new Timestamp(new Date().getTime());
        ttCmlErrorHeader.setErrCreateTimestamp(errCreateTimestamp);
        cmlHeadDomain.setErrorReportTs(errCreateTimestamp);

        if (!errChkList.isEmpty()) {
            // A - a CHECK RESULT S
            // A～Sチェック結果
            for (String err : errChkList) {
                if (err.compareTo("CHK_RESULT_A") == 0) {ttCmlErrorHeader.setChkResultA(NG); }
                if (err.compareTo("CHK_RESULT_B") == 0) {ttCmlErrorHeader.setChkResultB(NG); }
                if (err.compareTo("CHK_RESULT_C") == 0) {ttCmlErrorHeader.setChkResultC(NG); }
                if (err.compareTo("CHK_RESULT_E") == 0) {ttCmlErrorHeader.setChkResultE(NG); }
                if (err.compareTo("CHK_RESULT_F") == 0) {ttCmlErrorHeader.setChkResultF(NG); }
                if (err.compareTo("CHK_RESULT_G") == 0) {ttCmlErrorHeader.setChkResultG(NG); }
                if (err.compareTo("CHK_RESULT_H") == 0) {ttCmlErrorHeader.setChkResultH(NG); }
                if (err.compareTo("CHK_RESULT_I") == 0) {ttCmlErrorHeader.setChkResultI(NG); }
                if (err.compareTo("CHK_RESULT_J") == 0) {ttCmlErrorHeader.setChkResultJ(NG); }
                if (err.compareTo("CHK_RESULT_K") == 0) {ttCmlErrorHeader.setChkResultK(NG); }
                if (err.compareTo("CHK_RESULT_L") == 0) {ttCmlErrorHeader.setChkResultL(NG); }
                if (err.compareTo("CHK_RESULT_O") == 0) {ttCmlErrorHeader.setChkResultO(NG); }
                if (err.compareTo("CHK_RESULT_P") == 0) {ttCmlErrorHeader.setChkResultP(NG); }
            }
        }
        // Common items
        // 共通項目
        // At the time of add function ID, a registrant, and a REGISTER DATE
        // 登録機能ID、登録者、登録日時
        ttCmlErrorHeader.setComCreateFuncId(MIGRATION_DSCID);
        ttCmlErrorHeader.setComCreateUserId(MIGRATION_DSCID);
        // update function ID, regenerator, an update date
        // 更新機能ID、更新者、更新日時
        ttCmlErrorHeader.setComUpdateFuncId(MIGRATION_DSCID);
        ttCmlErrorHeader.setComUpdateUserId(MIGRATION_DSCID);

        // CML-Error-Report-Header registration
        // CMLエラーレポートヘッダ登録
        ttCmlErrorHeaderService.create(ttCmlErrorHeader);
    }
    
    /**
     * CML-Error-Report-Detail registration
     * <br />CMLエラーレポート明細登録
     *
     * @param cmlHeadDomain header domain<br />ヘッダードメイン
     * @param cmlDtilList detailed list<br />明細リスト
     * @throws ApplicationException when CML error report item sale cannot register<br />CMLエラーレポート明細登録できなかった時
     */
    protected void createTtCmlErrorDtil(MigCmlDomain cmlHeadDomain, List<? extends MigCmlDomain> cmlDtilList)
        throws ApplicationException {

        for (MigCmlDomain migCmlDomain : cmlDtilList){

            TtCmlErrorDtlDomain ttCmlErrorDtl = new TtCmlErrorDtlDomain();
            // contents set of CML-Error-Report-Detail registration
            // CMLエラーレポート明細登録内容セット
            ttCmlErrorDtl.setDscId(MIGRATION_DSCID);
            ttCmlErrorDtl.setErrCreateTimestamp(cmlHeadDomain.getErrorReportTs());
            ttCmlErrorDtl.setItemNo(migCmlDomain.getPltzItemNo());
            ttCmlErrorDtl.setPkgCd(" ");
            ttCmlErrorDtl.setMixTagFlg(FLAG_N);
            ttCmlErrorDtl.setInvoiceKey(setSpace(migCmlDomain.getInvoiceKey()));
            ttCmlErrorDtl.setContainerSortingKey(setSpace(migCmlDomain.getContainerSortingKey()));
            ttCmlErrorDtl.setCurrCd(setSpace(migCmlDomain.getCurrCd()));
            ttCmlErrorDtl.setLoadingCd(setSpace(migCmlDomain.getLoadingCd()));
            ttCmlErrorDtl.setStgInstrItemFlg(setSpace(migCmlDomain.getStgInstrItemFlg()));
            ttCmlErrorDtl.setContainerLooseTyp(setSpace(migCmlDomain.getContainerLooseTyp()));
            ttCmlErrorDtl.setCustomTimingTyp(setSpace(migCmlDomain.getCustomTimingTyp()));
            ttCmlErrorDtl.setShippingLot(migCmlDomain.getShippingLot());
            ttCmlErrorDtl.setQty(migCmlDomain.getAllocQty());
            ttCmlErrorDtl.setItemNoChkFlg(setSpace(migCmlDomain.getItemNoChkFlg()));

            // Common items
            // 共通項目
            // At the time of add function ID, a registrant, and a REGISTER DATE
            // 登録機能ID、登録者、登録日時
            ttCmlErrorDtl.setComCreateFuncId(MIGRATION_DSCID);
            ttCmlErrorDtl.setComCreateUserId(MIGRATION_DSCID);
            // update function ID, regenerator, an update date
            // 更新機能ID、更新者、更新日時
            ttCmlErrorDtl.setComUpdateFuncId(MIGRATION_DSCID);
            ttCmlErrorDtl.setComUpdateUserId(MIGRATION_DSCID);

            // CML-Error-Report-Detail registration
            // CMLエラーレポート明細登録
            ttCmlErrorDtlService.create(ttCmlErrorDtl);
        }
    }
    
    /**
     * CML error report printing
     * <br />CMLエラーレポート印刷
     *
     * @param cmlHeadDomain header information domain<br />ヘッダ情報ドメイン
     * @throws ApplicationException When output destination change printer information acquisition cannot be carried out<br />出力先プリンタ情報取得できなかった時
     */
    protected void printErrorHeader(MigCmlDomain cmlHeadDomain)
        throws ApplicationException {
        
        // ST958 DEL START
        // Search condition
        // 検索条件
        //MigCmlCriteriaDomain searchPrintCriteria = new MigCmlCriteriaDomain();
        //searchPrintCriteria.setCompCd(cmlHeadDomain.getShipperCd());
        //searchPrintCriteria.setPlntCd(cmlHeadDomain.getPlntCd());
        //// Output destination change printer information acquisition
        //// 出力先プリンタ情報取得
        //MigCmlDomain printNmDomain = migCmlDao.searchByKeyMigCmlForPrinterInfo(searchPrintCriteria);
        //
        //// At the time of the search results 0
        //// 検索結果0の時
        //if (printNmDomain == null) {
        //    String[] conds = {cmlHeadDomain.getShipperCd(), cmlHeadDomain.getPlntCd(), FLAG_Y};
        //    String[] params = {"TM_PRINTER_PURPOSE,TM_PRINTER", StringUtils.join(conds, ",")};
        //    
        //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        //    String msg = createMessage(ERR_MSG_NO_DATA, params);
        //    errorList.add(new MessageDomain("", "", new Object[] {msg}));
        //    throw new ValidationException(errorList);
        //}
        // ST958 DEL END
        
        // CML error report document output
        // CMLエラーレポート帳票出力
        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(cmlHeadDomain.getLocale(), REPORT_DATE_FORMAT);
        // PDF create processing
        // PDF作成処理
        File pdf = l2005ReportService.searchCmlMixTagErrRep(
            MIGRATION_DSCID, 
            cmlHeadDomain.getErrorReportTs(), 
            formatDate
        );
        // Printing
        // 印刷
        // ST958 MOD START
        //this.commonService.printPdf(pdf, 1, printNmDomain.getPrinterNm());
        List<String> printerNameList = getOutPutPrinter(cmlHeadDomain);
        for (String printerName : printerNameList) {
            this.commonService.printPdf(pdf, 1, printerName);
        }
        // ST958 MOD END
    }
    
    /**
     * Case mark printing
     * <br />ケースマーク印刷
     *
     * @param cmlHeadDomain information domain<br />ヘッダ情報ドメイン
     * @throws ApplicationException When output destination change printer information acquisition cannot be carried out<br />出力先プリンタ情報取得できなかった時
     */
    protected void printHeader(MigCmlDomain cmlHeadDomain)
        throws ApplicationException {
        
        // ST958 DEL START
        //// Search condition
        //// 検索条件
        //MigCmlCriteriaDomain searchPrintCriteria = new MigCmlCriteriaDomain();
        //searchPrintCriteria.setCompCd(cmlHeadDomain.getShipperCd());
        //searchPrintCriteria.setPlntCd(cmlHeadDomain.getPlntCd());
        //searchPrintCriteria.setLocale(cmlHeadDomain.getLocale());
        //
        //// Output destination change printer information acquisition
        //// 出力先プリンタ情報取得
        //MigCmlDomain printNmDomain = migCmlDao.searchByKeyMigCmlForPrinterInfo(searchPrintCriteria);
        //
        //// At the time of the search results 0
        //// 検索結果0の時
        //if (printNmDomain == null) {
        //    String[] conds = {cmlHeadDomain.getShipperCd(), cmlHeadDomain.getPlntCd(), FLAG_Y};
        //    String[] params = {"TM_PRINTER_PURPOSE,TM_PRINTER", StringUtils.join(conds, ",")};
        //    
        //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        //    String msg = createMessage(ERR_MSG_NO_DATA, params);
        //    errorList.add(new MessageDomain("", "", new Object[] {msg}));
        //    throw new ValidationException(errorList);
        //}
        // ST958 DEL END
        
        // CML error report document output
        // CMLエラーレポート帳票出力
        // Acquisition of Date format
        // 日付フォーマットの取得
        String formatDate =  commonService.getResource(cmlHeadDomain.getLocale(), REPORT_DATE_FORMAT);
        // PDF create processing
        // PDF作成処理
        File pdf = this.l2003ReportService.searchCml(null, cmlHeadDomain.getMainMark(), formatDate);

        // ST964 ADD START
        // 印刷部数の取得
        TmNxsCompCriteriaDomain nxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        nxsCompCriteriaDomain.setCompCd(cmlHeadDomain.getShipperCd());
        TmNxsCompDomain nxsCompResultDomain = tmNxsCompService.searchByKey(nxsCompCriteriaDomain);
        // if result 0
        // 0件の場合
        if (nxsCompResultDomain == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            String[] conds = { cmlHeadDomain.getShipperCd() };
            String[] params = { "TM_NXS_COMP", StringUtils.join(conds, ",") };
            String msg = createMessage(ERR_MSG_NO_DATA, params);
            errorList.add(new MessageDomain("", "", new Object[]{ msg }));
            throw new ValidationException(errorList);
        }
        int cmlPrintNum = nxsCompResultDomain.getCmlPrintNum().intValue();
        // ST964 ADD END

        // Printing
        // 印刷
        // ST958 MOD START
        //this.commonService.printPdf(pdf, 1, printNmDomain.getPrinterNm());
        List<String> printerNameList = getOutPutPrinter(cmlHeadDomain);
        for (String printerName : printerNameList) {
            // ST964 MOD START
            //this.commonService.printPdf(pdf, 1, printerName);
            this.commonService.printPdf(pdf, cmlPrintNum, printerName);
            // ST964 MOD END
        }
        // ST958 MOD END
    }

    // ST958 ADD
    /**
     * Specific output printer
     * <br />出力プリンタの特定
     *
     * @param cmlHeadDomain information domain<br />ヘッダ情報ドメイン
     * @return list of printer name<br />/プリンタ名のリスト
     * @throws ApplicationException When output destination change printer information acquisition cannot be carried out<br />出力先プリンタ情報取得できなかった時
     */
    protected List<String> getOutPutPrinter(MigCmlDomain cmlHeadDomain)
        throws ApplicationException {

        List<String> printNmList = null;

        // If there is a specified output printer in XML of request parameters,
        // Search the printer master directly.
        // リクエストパラメータXMLに出力プリンタの指定がある場合、
        // プリンタ原単位を直接検索する。
        if (StringUtils.isNotBlank(cmlHeadDomain.getPrinterId())) {
            TmPrinterCriteriaDomain tmPrinterCriteriaDomain = new TmPrinterCriteriaDomain();
            tmPrinterCriteriaDomain.setCompCd(cmlHeadDomain.getShipperCd());
            tmPrinterCriteriaDomain.setPrinterId(cmlHeadDomain.getPrinterId());
            TmPrinterDomain tmPrinterResultDomain = tmPrinterService.searchByKey(tmPrinterCriteriaDomain);
            // if result 0
            // 0件の場合
            if (tmPrinterResultDomain == null) {
                List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                String[] conds = { cmlHeadDomain.getShipperCd(), cmlHeadDomain.getPrinterId() };
                String[] params = { "TM_PRINTER", StringUtils.join(conds, ",") };
                String msg = createMessage(ERR_MSG_NO_DATA, params);
                errorList.add(new MessageDomain("", "", new Object[]{ msg }));
                throw new ValidationException(errorList);
            }
            printNmList = new ArrayList<String>();
            printNmList.add(tmPrinterResultDomain.getPrinterNm());

            return printNmList;
        }

        // If the specified printer is not,
        // Search the printer purpose master by shipper,plant.
        // プリンタの指定がない場合、
        // シッパー、工場よりプリンタ用途原単位を検索する。
        MigCmlCriteriaDomain searchPrintCriteria = new MigCmlCriteriaDomain();
        searchPrintCriteria.setCompCd(cmlHeadDomain.getShipperCd());
        searchPrintCriteria.setPlntCd(cmlHeadDomain.getPlntCd());
        searchPrintCriteria.setLocale(cmlHeadDomain.getLocale());
        printNmList = migCmlDao.searchByKeyMigCmlForPrinterInfo(searchPrintCriteria);
        // if result 0
        // 0件の場合
        if (printNmList.size() == 0) {
            String[] conds = { cmlHeadDomain.getShipperCd(), cmlHeadDomain.getPlntCd(), FLAG_Y };
            String[] params = { "TM_PRINTER_PURPOSE,TM_PRINTER", StringUtils.join(conds, ",") };
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            String msg = createMessage(ERR_MSG_NO_DATA, params);
            errorList.add(new MessageDomain("", "", new Object[]{ msg }));
            throw new ValidationException(errorList);
        }

        return printNmList;
    }
    
    /**
     * The set of a Palletize information
     * <br />パレタイズ情報のセット
     * 
     * @param cmlHeadDomain header information domain<br />ヘッダ情報ドメイン
     * @param cmlDtilList detailed list<br />明細リスト
     * @param sysdate system day<br />システム日
     * @return ttPltz Palletize domain<br />パレタイズドメイン
     */
    protected TtPltzDomain setTtPltzDomain(MigCmlDomain cmlHeadDomain, List<? extends MigCmlDomain> cmlDtilList, Date sysdate){
        
        // Setting of each flag
        // 各フラグの設定
        String loadingCd = new String();
        String expLimitFlg = new String(FLAG_N);
        String dngrItemFlg = new String(FLAG_N);
        List<String> bList = new ArrayList<String>();
        List<String> dList = new ArrayList<String>();
        List<String> fList = new ArrayList<String>();
        
        for (MigCmlDomain migCmlDomain : cmlDtilList) {
            if (LOADING_CD_BACK.equals(migCmlDomain.getLoadingCd())) {
                bList.add(LOADING_CD_BACK);
            }
            if (LOADING_CD_DOOR.equals(migCmlDomain.getLoadingCd())) {
                dList.add(LOADING_CD_DOOR);
            }
            if (LOADING_CD_FREE.equals(migCmlDomain.getLoadingCd())) {
                fList.add(LOADING_CD_FREE);
            }
            if (!CheckUtil.isBlankOrNull(migCmlDomain.getExpLimitTyp())) {
                expLimitFlg = FLAG_Y;
            }
            if (FLAG_Y.equals(migCmlDomain.getDngrItemFlg())) {
                dngrItemFlg = FLAG_Y;
            }
        }
        // loadingCd -- all -- the case of "F"
        // loadingCd 全て"F"の場合
        if (!fList.isEmpty() && bList.isEmpty() && dList.isEmpty()) {
            loadingCd = LOADING_CD_FREE;
            // if there is "B" by "F" mixture -- "B"
            // "F"混在で"B"があれば"B"
        } else if(!bList.isEmpty()) {
            loadingCd = LOADING_CD_BACK;
            // if there is "D" by "F" mixture -- "D"
            // "F"混在で"D"があれば"D"
        } else {
            loadingCd = LOADING_CD_DOOR;
        }
        
        Date expPackingDt = DateUtils.truncate(sysdate, Calendar.DAY_OF_MONTH);
        
        // Old QR mix type.
        String oldQrMixType = " ";
        if (PKG_FORM_TYP_MULTI.equals(cmlHeadDomain.getPkgFormTyp())) {
            oldQrMixType = "1";
        }
        
        // This is a VALUE set to a Palletize domain.
        // パレタイズドメインへ値セット
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setMainMark(cmlHeadDomain.getMainMark());
        ttPltz.setPalletNo(cmlHeadDomain.getPalletNo());
        ttPltz.setShipperCd(cmlHeadDomain.getShipperCd());
        ttPltz.setShipToCd(cmlHeadDomain.getShipToCd());
        ttPltz.setCustomerCd(cmlHeadDomain.getCustomerCd());
        ttPltz.setLgcyShipTo(cmlHeadDomain.getLgcyShipTo());
        ttPltz.setTrnsCd(cmlHeadDomain.getTrnsCd());
        ttPltz.setTrnsCdOrg(cmlHeadDomain.getTrnsCd());
        ttPltz.setReviseFlg(FLAG_N);
        ttPltz.setPlntCd(cmlHeadDomain.getPlntCd());
        ttPltz.setLgcyWhCd(cmlHeadDomain.getLgcyWhCd());
        ttPltz.setCurLgcyWhCd(cmlHeadDomain.getLgcyWhCd());
        ttPltz.setPkgFormTyp(cmlHeadDomain.getPkgFormTyp());
        ttPltz.setInvoiceKey(cmlDtilList.get(0).getInvoiceKey());
        ttPltz.setContainerSortingKey(cmlDtilList.get(0).getContainerSortingKey());
        ttPltz.setContainerLooseTyp(cmlDtilList.get(0).getContainerLooseTyp());
        ttPltz.setVariantFlg(FLAG_N);
        ttPltz.setRtUseFlg(FLAG_N);
        ttPltz.setWeightUnit(UNIT_CD_KILOGRAM);
        ttPltz.setNetWeight(cmlHeadDomain.getNetWeight());
        ttPltz.setGrossWeight(cmlHeadDomain.getGrossWeight());
        ttPltz.setLengthUnit(UNIT_CD_METER);
        ttPltz.setLength(new BigDecimal(0));
        ttPltz.setWidth(new BigDecimal(0));
        ttPltz.setHeight(new BigDecimal(0));
        ttPltz.setVolumeUnit(UNIT_CD_CUBIC_METER);
        ttPltz.setVolume(cmlHeadDomain.getVolume());
        ttPltz.setCmlTyp(CML_TYPE_CIGMA);
        ttPltz.setExpPackingDt(expPackingDt);
        ttPltz.setExpPackingIssuerId(MIGRATION_DSCID);
        ttPltz.setExpPackingIssuerNm(MIGRATION_DSCID);
        ttPltz.setStgInstrItemFlg(cmlDtilList.get(0).getStgInstrItemFlg());
        ttPltz.setConsigneeCd(cmlHeadDomain.getCompCd());
        ttPltz.setCommercialFlg(FLAG_Y);
        ttPltz.setCurrCd(cmlDtilList.get(0).getCurrCd());
        ttPltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttPltz.setPackingWhCompCd(cmlHeadDomain.getWhCompCd());
        ttPltz.setPackingWhCd(cmlHeadDomain.getWhCd());
        ttPltz.setCurWhCompCd(cmlHeadDomain.getWhCompCd());
        ttPltz.setCurWhCd(cmlHeadDomain.getWhCd());
        ttPltz.setLoadingCd(loadingCd);
        ttPltz.setExpLimitFlg(expLimitFlg);
        ttPltz.setDngrItemFlg(dngrItemFlg);
        ttPltz.setCustomTimingTyp(cmlDtilList.get(0).getCustomTimingTyp());
        ttPltz.setLastTrStatus(LAST_TR_STATUS_BLANK);
        ttPltz.setExpRequestAllCmlIssuedFlg(FLAG_N);
        ttPltz.setSplitShippingNgFlg(FLAG_N);
        ttPltz.setInvoiceCtgry(IVN_CATEGORY_COMMERCIAL_VALUE);
        ttPltz.setReExpGoodsFlg(FLAG_N);
        ttPltz.setMigrationFlg(FLAG_Y);
        ttPltz.setOldQrMixTyp(oldQrMixType);
        ttPltz.setOldQrContainerGrpCd(cmlHeadDomain.getContainerGroupCd());
        ttPltz.setPalletCartonTyp("P"); // UT420 ADD Pallet
        ttPltz.setComCreateUserId(MIGRATION_DSCID);
        ttPltz.setComCreateFuncId(MIGRATION_DSCID);
        ttPltz.setComUpdateUserId(MIGRATION_DSCID);
        ttPltz.setComUpdateFuncId(MIGRATION_DSCID);
        
        return ttPltz;
    }

    /**
     * The set of a Palletize-Item information
     * <br />パレタイズ対象品情報のセット
     * 
     * @param serialNumber number<br />番号
     * @param cmlHeadDomain header domain<br />ヘッダードメイン
     * @param cmlDtilDomain detailed domain<br />明細ドメイン
     * @return ttPltzItemDomain Palletize-Item domain<br />パレタイズ対象品ドメイン
     */
    protected TtPltzItemDomain setTtPltzItemDomain(int serialNumber, MigCmlDomain cmlHeadDomain, MigCmlDomain cmlDtilDomain){
        
        TtPltzItemDomain ttPltzItemDomain = new TtPltzItemDomain();
        ttPltzItemDomain.setMainMark(cmlHeadDomain.getMainMark());
        ttPltzItemDomain.setBrch(new BigDecimal(serialNumber));
        ttPltzItemDomain.setPltzItemNo(cmlDtilDomain.getPltzItemNo());
        ttPltzItemDomain.setPkgCd(" ");
        ttPltzItemDomain.setItemDescription(cmlDtilDomain.getItemDescription());
        ttPltzItemDomain.setQty(cmlDtilDomain.getAllocQty());
        ttPltzItemDomain.setQtyUnit(cmlDtilDomain.getUnitCd());
        
        // In CML-Header-Interface .PKG_FORM_TYP=Y: (many articles), this is ALLOC_QTY/SHIPPING_LOT (this is upvaluation to an integer).  
        // ケースマークヘッダ連携.PKG_FORM_TYP=Y:(多品)の場合、ALLOC_QTY/SHIPPING_LOT(整数に切り上げ)
        if (PKG_FORM_TYP_MULTI.equals(cmlHeadDomain.getPkgFormTyp())) {
            ttPltzItemDomain.setTagQty(
                cmlDtilDomain.getAllocQty().divide(cmlDtilDomain.getShippingLot(), 0, BigDecimal.ROUND_UP));
        } else {
            //ttPltzItemDomain.setTagQty(cmlDtilDomain.getAllocQty());
            ttPltzItemDomain.setTagQty(null);
        }
        
        //ttPltzItemDomain.setNetWeight(cmlDtilDomain.getItemWeight());
        ttPltzItemDomain.setNetWeight(cmlDtilDomain.getNetWeight()); // ST963 MOD
        ttPltzItemDomain.setItemWeight(cmlDtilDomain.getItemWeight());
        ttPltzItemDomain.setWeightUnit(UNIT_CD_KILOGRAM);
        ttPltzItemDomain.setShippingLot(cmlDtilDomain.getShippingLot());
        ttPltzItemDomain.setExpLimitTyp(cmlDtilDomain.getExpLimitTyp());
        ttPltzItemDomain.setDngrItemFlg(cmlDtilDomain.getDngrItemFlg());
        ttPltzItemDomain.setOriginCntryCd(cmlDtilDomain.getOriginCntryCd());
        ttPltzItemDomain.setCurrCd(cmlDtilDomain.getCurrCd());
        ttPltzItemDomain.setPlntCd(cmlDtilDomain.getPlntCd());
        ttPltzItemDomain.setRtFlg(FLAG_N);
        ttPltzItemDomain.setKitFlg(FLAG_N);
        ttPltzItemDomain.setParFlg(FLAG_Y);
        ttPltzItemDomain.setKitParItemNo(cmlDtilDomain.getPltzItemNo());
        ttPltzItemDomain.setComCreateUserId(MIGRATION_DSCID);
        ttPltzItemDomain.setComCreateFuncId(MIGRATION_DSCID);
        ttPltzItemDomain.setComUpdateUserId(MIGRATION_DSCID);
        ttPltzItemDomain.setComUpdateFuncId(MIGRATION_DSCID);
        return ttPltzItemDomain;
    }
    
    /**
     * The set of a Palletize Item Receive Order
     * <br />パレタイズ対象品受注情報のセット
     * 
     * @param cmlHeadDomain header domain<br />ヘッダードメイン
     * @param dtilDomain detailed domain<br />明細ドメイン
     * @return ttPltzItemOdrDomain
     */
    protected TtPltzItemOdrDomain setTtPltzItemOdrDomain(MigCmlDomain cmlHeadDomain, MigCmlDomain dtilDomain){
        
        TtPltzItemOdrDomain ttPltzItemOdrDomain = new TtPltzItemOdrDomain();
        ttPltzItemOdrDomain.setMainMark(dtilDomain.getMainMark());
        ttPltzItemOdrDomain.setBrch(dtilDomain.getBrch());
        ttPltzItemOdrDomain.setItemNo(dtilDomain.getPltzItemNo());
        ttPltzItemOdrDomain.setPkgCd(" ");
        ttPltzItemOdrDomain.setRcvOdrCompCd(cmlHeadDomain.getShipperCd());
        ttPltzItemOdrDomain.setCustomerCd(cmlHeadDomain.getCustomerCd());
        ttPltzItemOdrDomain.setLgcyShipTo(cmlHeadDomain.getLgcyShipTo());
        ttPltzItemOdrDomain.setTrnsCd(cmlHeadDomain.getTrnsCd());
        ttPltzItemOdrDomain.setEtdDueDt(dtilDomain.getEtdDueDt());
        ttPltzItemOdrDomain.setCustomerPoNo(dtilDomain.getCustomerPoNo());
        ttPltzItemOdrDomain.setCustomerItemNo(dtilDomain.getCustomerItemNo());
        ttPltzItemOdrDomain.setCustomerItemNoOrg(dtilDomain.getCustomerItemNoOrg());
        ttPltzItemOdrDomain.setOdrCtrlNo(dtilDomain.getOdrCtrlNo());
        ttPltzItemOdrDomain.setAllocQty(dtilDomain.getAllocQty());
        ttPltzItemOdrDomain.setComCreateUserId(MIGRATION_DSCID);
        ttPltzItemOdrDomain.setComCreateFuncId(MIGRATION_DSCID);
        ttPltzItemOdrDomain.setComUpdateUserId(MIGRATION_DSCID);
        ttPltzItemOdrDomain.setComUpdateFuncId(MIGRATION_DSCID);
        return ttPltzItemOdrDomain;
    }


    /**
     * Change into a space at the time of a NULL or blank.
     * <br />NULL or ブランク時にスペースに変換
     * Type in the functional overview of the method.
     *
     * @param str string<br />文字列
     * @return string or space<br />文字列 or スペース
     */
    private String setSpace(String str) {

        if (!CheckUtil.isBlankOrNull(str)) {
            return str;
        }
        return " ";
        
    }
    /**
     * Change into 0 at the time of a NULL or blank.
     * <br />NULL or ブランク時に0に変換
     * Type in the functional overview of the method.
     *
     * @param str string<br />文字列
     * @return 0 or VALUE<br />0 or 値
     */
    private BigDecimal setZero(String str) {

        if (!CheckUtil.isBlankOrNull(str)) {
            return new BigDecimal(str);
        }
        return new BigDecimal(0);
        
    }
    
    /**
     * Create message.
     * <br />メッセージを作成する。
     *
     * @param msg Message<br />メッセージ
     * @param params Message parameters<br />メッセージパラメータ
     * @return Message<br />メッセージ
     */
    private String createMessage(String msg, String[] params) {
        
        MessageFormat format = new MessageFormat(msg);
        return format.format(params);
    }
    
}
