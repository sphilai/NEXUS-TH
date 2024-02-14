/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkDtlIfDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwCaseMarkHdrIfDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001MigrationCaseMarkRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkDetailItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkItemCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_REGISTER_ALL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13546 $
 */
public class WsR001MigCmlServiceTest extends AbstractEca0027Test {

    /**
     * 例外ルール
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    /**
     * 一時フォルダルール
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * MigrationCMLサービス
     */
    private WsR001MigCmlService wsR001MigCmlService;
    
    /**
     * TW_CASE_MARK_HDR_IFサービス
     */
    private TwCaseMarkHdrIfService twCaseMarkHdrIfService;
    
    /**
     * TW_CASE_MARK_DTL_IFサービス
     */
    private TwCaseMarkDtlIfService twCaseMarkDtlIfService;
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public WsR001MigCmlServiceTest() {
    }

    /**
     * Setter method for wsR001MigCmlService.
     *
     * @param wsR001MigCmlService Set for wsR001MigCmlService
     */
    public void setWsR001MigCmlService(WsR001MigCmlService wsR001MigCmlService) {
        this.wsR001MigCmlService = wsR001MigCmlService;
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
     * <br /テストの前処理を行います。
     * 
     * @throws Exception 例外
     */
    @Before
    public void setUp() throws Exception {
        wsR001MigCmlService = (WsR001MigCmlService) getContext().getBean("wsR001MigCmlService");
        twCaseMarkHdrIfService = (TwCaseMarkHdrIfService) getContext().getBean("twCaseMarkHdrIfService");
        twCaseMarkDtlIfService = (TwCaseMarkDtlIfService) getContext().getBean("twCaseMarkDtlIfService");
    }
    
    /**
     * <br />createMigCmlのテスト
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml() throws Exception {
        //boolean result = false;

        // データ投入
        for (int i = 0; i < 4; i++) {
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_01_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_01_" + i + ".csv");
            this.toTwCaseMarkHdrIf(hdr, dtl);
        }
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("MY7");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        for (int i = 0; i < 4; i++) {
            // -----------------------------------------------------------------------
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_01_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_01_" + i + ".csv");
            
            // ケースマークヘッダのリスト
            WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
                this.loadCsvToTwCaseMarkHdrIf(hdr);
            
            // ケースマーク明細のリスト(パラメータより)
            List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
                this.loadCsvToTwCaseMarkDtlIf(dtl);
    
            wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
            migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);
    
            // -----------------------------------------------------------------------
        }
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        wsR001MigCmlService.createMigCml(criteria);
        
        //assertThat(result, is(false));
    }
    
    /**
     * <br />createMigCmlのテスト(移行不具合対応：得意先No.先頭0カット)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml2() throws Exception {
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "TG0", "A1", "2", "10088NXS0021");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("TG0");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        for (int i = 10; i < 12; i++) {
            // -----------------------------------------------------------------------
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_01_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_01_" + i + ".csv");
            
            // ケースマークヘッダのリスト
            WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
                this.loadCsvToTwCaseMarkHdrIf(hdr);
            
            // ケースマーク明細のリスト(パラメータより)
            List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
                this.loadCsvToTwCaseMarkDtlIf(dtl);
    
            wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
            migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);
    
            // -----------------------------------------------------------------------
        }
    
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        try {
            wsR001MigCmlService.createMigCml(criteria);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        //assertThat(result, is(false));
    }
    
    /**
     * <br />createMigCmlのテスト(移行不具合対応：通貨コードチェック)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml3() throws Exception {
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "TG0", "A1", "2", "10088NXS0021");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("TG0");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_01_12.csv");
        // 13,14,15もテストする
        List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_01_15.csv");
            
        // ケースマークヘッダのリスト
        WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
            this.loadCsvToTwCaseMarkHdrIf(hdr);
            
        // ケースマーク明細のリスト(パラメータより)
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
            this.loadCsvToTwCaseMarkDtlIf(dtl);
    
        wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
        migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);
    
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        try {
            wsR001MigCmlService.createMigCml(criteria);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        //assertThat(result, is(false));
    }
    
    /**
     * <br />createMigCmlのテスト(移行不具合対応：輸送手段)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml4() throws Exception {
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "TG0", "A1", "2", "10088NXS0021");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("TG0");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        for (int i = 16; i < 18; i++) {
            // -----------------------------------------------------------------------
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_01_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_01_" + i + ".csv");
            
            // ケースマークヘッダのリスト
            WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
                this.loadCsvToTwCaseMarkHdrIf(hdr);
            
            // ケースマーク明細のリスト(パラメータより)
            List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
                this.loadCsvToTwCaseMarkDtlIf(dtl);
    
            wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
            migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);
    
            // -----------------------------------------------------------------------
        }
    
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        try {
            wsR001MigCmlService.createMigCml(criteria);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        //assertThat(result, is(false));
    }

    /**
     * <br />createMigCmlのテスト(入力エラー編)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml_Error1_1() throws Exception {
        //boolean result = false;

        // データ投入
        for (int i = 0; i < 4; i++) {
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_E1_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_E1_" + i + ".csv");
            this.toTwCaseMarkHdrIf(hdr, dtl);
        }
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("MY7");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        for (int i = 0; i < 4; i++) {
            // -----------------------------------------------------------------------
            List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_E1_" + i + ".csv");
            List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_E1_" + i + ".csv");
            
            // ケースマークヘッダのリスト
            WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
                loadCsvToTwCaseMarkHdrIf(hdr);
            
            // ケースマーク明細のリスト(パラメータより)
            List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
                loadCsvToTwCaseMarkDtlIf(dtl);
    
            wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
            migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);
    
            // -----------------------------------------------------------------------
        }
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        wsR001MigCmlService.createMigCml(criteria);
        
        //assertThat(result, is(false));
    }
    
    

    /**
     * <br />createMigCmlのテスト(プリンタエラー編9-0)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml_Error9_0() throws Exception {
        boolean result = false;
        // 正常系でかつプリンタ情報なし
        
        // データ投入
        List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_E9_0.csv");
        List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_E9_0.csv");
        this.toTwCaseMarkHdrIf(hdr, dtl);
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("MY7");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        // -----------------------------------------------------------------------
        
        // ケースマークヘッダのリスト
        WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
            this.loadCsvToTwCaseMarkHdrIf(hdr);
        
        // ケースマーク明細のリスト(パラメータより)
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
            this.loadCsvToTwCaseMarkDtlIf(dtl);

        wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
        migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);

        // -----------------------------------------------------------------------
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));

        try {
        
            wsR001MigCmlService.createMigCml(criteria);

        } catch (ValidationException ve) {
            
            String code = ve.getCode();
            // プリンタ情報が取得できなければOK
            if (code.equals(NXS_E1_0002)) {
                result = true;
            }
        }

        assertThat(result, is(true));
    }
    

    /**
     * <br />createMigCmlのテスト(プリンタエラー編9-1)
     * @throws Exception 例外
     *
     */
    @Test
    public void testCreateMigCml_Error9_1() throws Exception {
        boolean result = false;

        // データ投入
        List<Map<String, String>> hdr = readCsvFile("TW_CASE_MARK_HDR_IF_E9_1.csv");
        List<Map<String, String>> dtl = readCsvFile("TW_CASE_MARK_DTL_IF_E9_1.csv");
        this.toTwCaseMarkHdrIf(hdr, dtl);
        
        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07");

        List<WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemCriteriaDomainList =
            new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();

        WsR001CriteriaDomain criteria = new WsR001CriteriaDomain();
        WsR001MigrationCaseMarkRootCriteriaDomain wsR001MigrationCaseMarkRootCriteriaDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        wsR001MigrationCaseMarkRootCriteriaDomain.setShipperCd("MY5");
        criteria.setMigrationCaseMarkRoot(wsR001MigrationCaseMarkRootCriteriaDomain);
        
        // -----------------------------------------------------------------------
        
        // ケースマークヘッダのリスト
        WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain =
            loadCsvToTwCaseMarkHdrIf(hdr);
        
        // ケースマーク明細のリスト(パラメータより)
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
            loadCsvToTwCaseMarkDtlIf(dtl);

        wsR001migrationCaseMarkItemCriteriaDomain.setMigrationCaseMarkDetailItemList(migrationCaseMarkDetailItemList);
        migrationCaseMarkItemCriteriaDomainList.add(wsR001migrationCaseMarkItemCriteriaDomain);

        // -----------------------------------------------------------------------
        criteria.getMigrationCaseMarkRoot().setMigrationCaseMarkItemList(migrationCaseMarkItemCriteriaDomainList);
        criteria.setLocale(new Locale("en"));
        
        try {
        
            wsR001MigCmlService.createMigCml(criteria);

        } catch (ValidationException ve) {
            
            String code = ve.getCode();
            // プリンタ情報が取得できなければOK
            if (code.equals(NXS_E1_0002)) {
                result = true;
            }
        }
        
        assertThat(result, is(true));
    }
    
    
    
    
    
    
    
    //---------------------------------------------------------------------------------------------------------------------------------------
    
    
    

    /**
     * <br />指定された値を含む{@link TwCaseMarkHdrIfDomain}を作成します。
     *
     * @param expectedErt ヘッダ情報
     * @param expectedErtItemList 明細情報
     * @throws Exception 例外
     */
    private void toTwCaseMarkHdrIf(List<Map<String, String>> expectedErt, List<Map<String, String>> expectedErtItemList) throws Exception {


        for (int i = 0; i < expectedErt.size(); i++) {
            TwCaseMarkHdrIfDomain domain = new TwCaseMarkHdrIfDomain();
            
            Map<String, String> mapHdr = expectedErt.get(i);
            // GSCM部品(SearchCountLimitAdvice)で必要
            domain.setLocale(new Locale("en"));

            domain.setMainMark(setSpace(mapHdr.get("MAIN_MARK")));
            domain.setPalletNo(setSpace(mapHdr.get("PALLET_NO")));
            domain.setShipperCd(setSpace(mapHdr.get("SHIPPER_CD")));
            domain.setCustomerCd(setSpace(mapHdr.get("CUSTOMER_CD")));
            domain.setLgcyShipTo(setSpace(mapHdr.get("LGCY_SHIP_TO")));
            domain.setTrnsCd(setSpace(mapHdr.get("TRNS_CD")));
            domain.setPlntCd(setSpace(mapHdr.get("PLNT_CD")));
            domain.setLgcyWhCd(setSpace(mapHdr.get("LGCY_WH_CD")));
            domain.setPkgFormTyp(setSpace(mapHdr.get("PKG_FORM_TYP")));
            domain.setNetWeight(new BigDecimal(setZero(mapHdr.get("NET_WEIGHT"))));
            domain.setGrossWeight(new BigDecimal(setZero(mapHdr.get("GROSS_WEIGHT"))));
            domain.setVolume(new BigDecimal(setZero(mapHdr.get("VOLUME"))));
            domain.setContainerGrpCd(setSpace(mapHdr.get("CONTAINER_GRP_CD")));
            
    
            domain.setComUpdateFuncId(mapHdr.get("COM_UPDATE_FUNC_ID"));
            domain.setComUpdateUserId(mapHdr.get("COM_UPDATE_USER_ID"));
            domain.setComUpdateTimestamp(new Timestamp(1));
            domain.setComCreateFuncId(mapHdr.get("COM_CREATE_FUNC_ID"));
            domain.setComCreateUserId(mapHdr.get("COM_CREATE_USER_ID"));
            domain.setComCreateTimestamp(new Timestamp(1));

            TwCaseMarkHdrIfCriteriaDomain criteria = new TwCaseMarkHdrIfCriteriaDomain();
            criteria.setMainMark(setSpace(mapHdr.get("MAIN_MARK")));
            List<TwCaseMarkHdrIfDomain> list = twCaseMarkHdrIfService.searchByCondition(criteria);
            if (list.size() > 0) {
                twCaseMarkHdrIfService.deleteByCondition(criteria);
            }
            
            twCaseMarkHdrIfService.create(domain);
        }

        List<TwCaseMarkDtlIfDomain> dtlDomainList = new ArrayList<TwCaseMarkDtlIfDomain>();
        for (int i = 0; i < expectedErtItemList.size(); i++) {
            Map<String, String> mapDtl = expectedErtItemList.get(i);
            TwCaseMarkDtlIfDomain dtlDomain = new TwCaseMarkDtlIfDomain();

            dtlDomain.setMainMark(mapDtl.get("MAIN_MARK"));
            dtlDomain.setPltzItemNo(mapDtl.get("PLTZ_ITEM_NO"));
            if (!mapDtl.get("ETD_DUE_DT").equals("")) {
                DateFormat df = new SimpleDateFormat("yy-MM-dd");
                Date wlDueDt = df.parse(mapDtl.get("ETD_DUE_DT"));
                dtlDomain.setEtdDueDt(wlDueDt);
            }
            dtlDomain.setCustomerPoNo(setSpace(mapDtl.get("CUSTOMER_PO_NO")));
            dtlDomain.setCustomerItemNo(setSpace(mapDtl.get("CUSTOMER_ITEM_NO")));
            dtlDomain.setCustomerItemNoOrg(setSpace(mapDtl.get("CUSTOMER_ITEM_NO_ORG")));
            dtlDomain.setOdrCtrlNo(new BigDecimal(setZero(mapDtl.get("ODR_CTRL_NO"))));
            dtlDomain.setAllocQty(new BigDecimal(setZero(mapDtl.get("ALLOC_QTY"))));
            dtlDomain.setQtyUnit(setSpace(mapDtl.get("QTY_UNIT")));
            dtlDomain.setItemWeight(new BigDecimal(setZero(mapDtl.get("ITEM_WEIGHT"))));
            dtlDomain.setShippingLot(new BigDecimal(setZero(mapDtl.get("SHIPPING_LOT"))));
            dtlDomain.setPlntCd(setSpace(mapDtl.get("PLNT_CD")));
            dtlDomain.setCurrCd(setSpace(mapDtl.get("CURR_CD")));

            dtlDomain.setComUpdateFuncId(mapDtl.get("COM_UPDATE_FUNC_ID"));
            dtlDomain.setComUpdateUserId(mapDtl.get("COM_UPDATE_USER_ID"));
            dtlDomain.setComUpdateTimestamp(new Timestamp(1));
            dtlDomain.setComCreateFuncId(mapDtl.get("COM_CREATE_FUNC_ID"));
            dtlDomain.setComCreateUserId(mapDtl.get("COM_CREATE_USER_ID"));
            dtlDomain.setComCreateTimestamp(new Timestamp(1));
            dtlDomainList.add(dtlDomain);

            TwCaseMarkDtlIfCriteriaDomain criteria = new TwCaseMarkDtlIfCriteriaDomain();
            criteria.setMainMark(setSpace(mapDtl.get("MAIN_MARK")));
            List<TwCaseMarkDtlIfDomain> list = twCaseMarkDtlIfService.searchByCondition(criteria);
            if (list.size() > 0) {
                twCaseMarkDtlIfService.deleteByCondition(criteria);
            }
        }
        twCaseMarkDtlIfService.create(dtlDomainList);
    }
    

    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param hdr TW_CASE_MARK_HDR_IF
     * @return {@link WsR001migrationCaseMarkItemCriteriaDomain}のリスト
     * @throws Exception 例外
     */
    private WsR001migrationCaseMarkItemCriteriaDomain loadCsvToTwCaseMarkHdrIf(List<Map<String, String>> hdr)
        throws Exception {

        WsR001migrationCaseMarkItemCriteriaDomain wsR001migrationCaseMarkItemCriteriaDomain = new WsR001migrationCaseMarkItemCriteriaDomain();

        
        Map<String, String> mapHdr = hdr.get(0);
        // GSCM部品(SearchCountLimitAdvice)で必要
    //    wsR001migrationCaseMarkItemCriteriaDomain.setLocale(new Locale("en"));

        wsR001migrationCaseMarkItemCriteriaDomain.setMainMark(mapHdr.get("MAIN_MARK"));
        wsR001migrationCaseMarkItemCriteriaDomain.setPalletNo(mapHdr.get("PALLET_NO"));
        //wsR001migrationCaseMarkItemCriteriaDomain.setShipperCd(mapHdr.get("SHIPPER_CD"));
        wsR001migrationCaseMarkItemCriteriaDomain.setCustomerNo(mapHdr.get("CUSTOMER_CD"));
        wsR001migrationCaseMarkItemCriteriaDomain.setShipTo(mapHdr.get("LGCY_SHIP_TO"));
        wsR001migrationCaseMarkItemCriteriaDomain.setTrnsWayCd(mapHdr.get("TRNS_CD"));
        wsR001migrationCaseMarkItemCriteriaDomain.setPlantCd(mapHdr.get("PLNT_CD"));
        wsR001migrationCaseMarkItemCriteriaDomain.setWhCd(mapHdr.get("LGCY_WH_CD"));
        if (PKG_FORM_TYP_MULTI.equals(mapHdr.get("PKG_FORM_TYP"))) {
            wsR001migrationCaseMarkItemCriteriaDomain.setMultiPartNoFlg(FLAG_Y);
        } else {
            wsR001migrationCaseMarkItemCriteriaDomain.setMultiPartNoFlg(FLAG_N);
        }
        wsR001migrationCaseMarkItemCriteriaDomain.setNetWeight(mapHdr.get("NET_WEIGHT"));
        wsR001migrationCaseMarkItemCriteriaDomain.setGrossWeight(mapHdr.get("GROSS_WEIGHT"));
        wsR001migrationCaseMarkItemCriteriaDomain.setVolume(mapHdr.get("VOLUME"));
        wsR001migrationCaseMarkItemCriteriaDomain.setContainerGroupCd(mapHdr.get("CONTAINER_GRP_CD"));

        return wsR001migrationCaseMarkItemCriteriaDomain;
    }

    
    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param dtl TW_CASE_MARK_HDR_IF
     * @return {@link WsR001migrationCaseMarkDetailItemCriteriaDomain}のリスト
     * @throws Exception 例外
     */
    private List<WsR001migrationCaseMarkDetailItemCriteriaDomain> loadCsvToTwCaseMarkDtlIf(List<Map<String, String>> dtl)
        throws Exception {
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList =
            new ArrayList<WsR001migrationCaseMarkDetailItemCriteriaDomain>();
                
        for (int i = 0; i < dtl.size(); i++) {
            WsR001migrationCaseMarkDetailItemCriteriaDomain criteria = new WsR001migrationCaseMarkDetailItemCriteriaDomain();
            Map<String, String> mapDtl = dtl.get(i);
            criteria.setPartNo(mapDtl.get("PLTZ_ITEM_NO"));
            criteria.setEtdDueDt(mapDtl.get("ETD_DUE_DT"));
            criteria.setCustomerPoNo(mapDtl.get("CUSTOMER_PO_NO"));
            criteria.setCustomerPartNo(mapDtl.get("CUSTOMER_ITEM_NO"));
            criteria.setCustomerPartNoOrg(mapDtl.get("CUSTOMER_ITEM_NO_ORG"));
            criteria.setOdrCtrlNo(mapDtl.get("ODR_CTRL_NO"));
            criteria.setAllocQty(mapDtl.get("ALLOC_QTY"));
            criteria.setMeasureUnit(mapDtl.get("QTY_UNIT"));
            criteria.setItemWeight(mapDtl.get("ITEM_WEIGHT"));
            criteria.setShipLotQty(mapDtl.get("SHIPPING_LOT"));
            criteria.setPlantCd(mapDtl.get("PLNT_CD"));
            criteria.setCurrencyCd(mapDtl.get("CURR_CD"));

            migrationCaseMarkDetailItemList.add(criteria);
        }
        return migrationCaseMarkDetailItemList;
    }

    /**
     * <br />画面共通情報ドメインの設定
     *
     * @param permitFuncId permitFuncId
     * @param ownerCompCd ownerCompCd
     * @param procMfgDivCd procMfgDivCd
     * @param autholity 認証情報
     * @param dscId dscId
     */
    private void setScreenCommonContext(
        String permitFuncId, 
        String ownerCompCd, 
        String procMfgDivCd, 
        String autholity, 
        String dscId
    ) {
        
        // 
        WindowInfoDomain windowInfo = new WindowInfoDomain();
        Eca0027CommonInfoDomain commonInfo = new Eca0027CommonInfoDomain();
        Locale locale = new Locale("ja");
        
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuth = new UserAuthDomain();
        userAuth.setPermitFuncId(permitFuncId);
        userAuth.setOwnerCompCd(ownerCompCd);
        userAuth.setProcMfgDivCd(procMfgDivCd);
        userAuth.setAuthority(autholity);
        userAuth.setDscId(dscId);
        userAuthList.add(userAuth);
        
        commonInfo.setUserName(dscId);
        commonInfo.setUserAuthList(userAuthList);
        commonInfo.setLocale(locale);
        commonInfo.setLoginUserDscId(dscId);
        windowInfo.setCommonInfo(commonInfo);
        
        //DensoContext context = DensoContext.get();
        DensoContext context = new DensoContext(dscId, "0", locale);
        context.putGeneralArea(WINDOW_ID_0, windowInfo);
        DensoContext.set(context);
    }

    /**
     * NULL or ブランク時にスペースに変換
     * Type in the functional overview of the method.
     *
     * @param str 文字列
     * @return 文字列 or スペース
     */
    private String setSpace(String str) {

        if (!CheckUtil.isBlankOrNull(str)) {
            return str;
        }
        return " ";
        
    }
        
      /**
     * NULL or ブランク時に"0"に変換
     * Type in the functional overview of the method.
     *
     * @param str 文字列
     * @return 文字列 or "0"
     */
    private String setZero(String str) {

        if (!CheckUtil.isBlankOrNull(str)) {
            return str;
        }
        return "0";

    }
}
