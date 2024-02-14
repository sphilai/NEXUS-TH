/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagService;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemTestDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagTestDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W2005MixTagServiceTest extends AbstractEca0027Test {

    /**
     * Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * MIXED品番ワークサービス
     */
    protected TwMixtagService twMixtagService;
    
    /**
     * MIXED用RT材ワークサービス
     */
    protected TwMixtagRtService twMixtagRtService;
    
    /**
     * 仮在庫サービス
     */
    protected TtTmpStockService ttTmpStockService;
    
    /**
     * W2005MixTagService サービス
     */
    private W2005MixTagService w2005MixTagService;
    
    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
    
    /**
     * SimpleDateFormat
     */
    private SimpleDateFormat df = new SimpleDateFormat(dateFormat);
    
    /**
     * タイムスタンプ用日付フォーマット
     */
    private SimpleDateFormat tsf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W2005MixTagServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        w2005MixTagService = (W2005MixTagService) getContext().getBean("w2005MixTagService");
        twMixtagService = (TwMixtagService) getContext().getBean("twMixtagService");
        twMixtagRtService = (TwMixtagRtService) getContext().getBean("twMixtagRtService");
        ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
        commonService = (CommonService) getContext().getBean("commonService");
    }
    
////////////////////////////// W2005MixTagService.validateConsistencyXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />validateConsistencyFmIssueDateToIssueDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyFmIssueDateToIssueDate() {
        boolean result = false;
        
        // 開始日 == null、終了日 == null
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, null, null);
        assertThat(result, is(false));
        
        // 開始日 == null、終了日 != null
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, null, "06/03/14");
        assertThat(result, is(false));
        
        // 開始日 != null、終了日 == null
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", null);
        assertThat(result, is(false));
        
        // 開始日 < 終了日
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", "13/03/14");
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", "06/03/14");
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "13/03/14", "06/03/14");
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyQty() {
        boolean result = false;
        
        // 数量　未入力
        result = w2005MixTagService.validateConsistencyQty(null);
        assertThat(result, is(true));

        // 数量 =  -1  (-1 < 1) 
        result = w2005MixTagService.validateConsistencyQty(new BigDecimal(-1));
        assertThat(result, is(false));
        
        // 数量 = 0   (0 < 1)
        result = w2005MixTagService.validateConsistencyQty(new BigDecimal(0));
        assertThat(result, is(false));
        
        // 数量 = 1   (1 == 1)
        result = w2005MixTagService.validateConsistencyQty(new BigDecimal(1));
        assertThat(result, is(true));
    
        // 数量 = 2   (2 > 1)
        result = w2005MixTagService.validateConsistencyQty(new BigDecimal(2));
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyActualQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyAllSame() {
        boolean result = false;
        
        List<String> list = new ArrayList<String>();
        // リストの中に異なるデータが存在する
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        result = w2005MixTagService.validateConsistencyAllSame(list);
        assertThat(result, is(false));
    
        // リストの中は全て一緒
        list.clear();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        result = w2005MixTagService.validateConsistencyAllSame(list);
        assertThat(result, is(true));
    
        // リストは1件
        list.clear();
        list.add("A");
        result = w2005MixTagService.validateConsistencyAllSame(list);
        assertThat(result, is(true));

        // リストは0件
        list.clear();
        result = w2005MixTagService.validateConsistencyAllSame(list);
        assertThat(result, is(true));

        // リストはnull
        list.clear();
        result = w2005MixTagService.validateConsistencyAllSame(null);
        assertThat(result, is(true));

    }
    
    /**
     * <br />validateConsistencyBlankOrNullのテスト
     *
     */
    @Test
    public void testValidateConsistencyBlankOrNull() {
        boolean result = false;
        
        // 入力値 == null
        result = w2005MixTagService.validateConsistencyBlankOrNull(null);
        assertThat(result, is(false));
        
        // 入力値 == ""
        result = w2005MixTagService.validateConsistencyBlankOrNull("");
        assertThat(result, is(false));
        
        // 入力値 != null
        result = w2005MixTagService.validateConsistencyBlankOrNull("15");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyCurrencyCdQtyUnitPlantCdのテスト
     *
     */
    @Test
    public void testValidateConsistencyCurrencyCdQtyUnitPlantCd() {
        boolean result = false;
        
        // currencyCD(hidden) = null、qtyUnit(hidden) = null、plantcd(hidden) = null
        result = w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd(null, null, null);
        assertThat(result, is(false));

        // currencyCD(hidden) = null、qtyUnit(hidden) = null、plantcd(hidden) = ""
        result = w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd(null, null, "");
        assertThat(result, is(false));

        // currencyCD(hidden) = "12345"、qtyUnit(hidden) = "10"、plantcd(hidden) = null
        result = w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd("12345", "10", null);
        assertThat(result, is(false));

        // currencyCD(hidden) = "12345"、qtyUnit(hidden) = "10"、plantcd(hidden) = ""
        result = w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd("12345", "10", "");
        assertThat(result, is(false));

        // currencyCD(hidden) = "12345"、qtyUnit(hidden) = "10"、plantcd(hidden) = "123"
        result = w2005MixTagService.validateConsistencyCurrencyCdQtyUnitPlantCd("12345", "10", "123");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyInstrQtyInstrPKGedQtyOverのテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyInstrQtyInstrPKGedQtyOver() throws Exception {
        boolean result = false;
        
        // 正常：梱包指示チェック（pltzInstrNo == null)
        result = w2005MixTagService.validateConsistencyInstrQtyInstrPKGedQtyOver(null, null, null, null);
        assertThat(result, is(true));
        
        // エラー：actualPkgQty == 15、instrQty = 10、instrPkgedQty == 1  (15 > (10-1))
        BigDecimal qty = new BigDecimal("15");
        BigDecimal instrQty = new BigDecimal("10");
        BigDecimal instrPkgedQty = new BigDecimal("1");
        result = w2005MixTagService.validateConsistencyInstrQtyInstrPKGedQtyOver("MY8001", qty, instrQty, instrPkgedQty);
        assertThat(result, is(false));
        
        // 数量 == 5、梱包指示数 = 10、梱包済数 == 1   (5 < (10-1))
        qty = new BigDecimal("5");
        result = w2005MixTagService.validateConsistencyInstrQtyInstrPKGedQtyOver("MY8001", qty, instrQty, instrPkgedQty);
        assertThat(result, is(true));

        // 数量 == 5、梱包指示数 = 6、梱包済数 == 1   (5 == (6-1))
        instrQty = new BigDecimal("6");
        result = w2005MixTagService.validateConsistencyInstrQtyInstrPKGedQtyOver("MY8001", qty, instrQty, instrPkgedQty);
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyLdCdのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyLdCd() throws Exception {
        boolean result = false;
        
        // list == null
        result = w2005MixTagService.validateConsistencyLdCd(null);
        assertThat(result, is(true));

        // list == 1件 ("D"のみ)
        List<String> list = new ArrayList<String>();
        list.add("D");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 1件 ("B"のみ)
        list.clear();
        list.add("B");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 2件 ("B"のみ)
        list.clear();
        list.add("B");
        list.add("B");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 2件 ("D"のみ)
        list.clear();
        list.add("D");
        list.add("D");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 3件 ("D"と"F")
        list.clear();
        list.add("D");
        list.add("F");
        list.add("D");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 3件 ("B"と"F")
        list.clear();
        list.add("B");
        list.add("B");
        list.add("F");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(true));

        // list == 3件 ("D", "B")
        list.clear();
        list.add("B");
        list.add("D");
        list.add("D");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(false));

        // list == 3件 ("D", "B", "F")
        list.clear();
        list.add("B");
        list.add("D");
        list.add("F");
        result = w2005MixTagService.validateConsistencyLdCd(list);
        assertThat(result, is(false));

    }
    
    /**
     * <br />validateConsistencyOverのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyOver() throws Exception {
        boolean result = false;
        
        BigDecimal qty = null;
        BigDecimal order = null;
        
        // Actual PKG QTY == null、 輸出受注オーダー数 == null
        result = w2005MixTagService.validateConsistencyOrderQtyOver(null, null);
        assertThat(result, is(true));
        
        // Actual PKG QTY < Order QTY 
        qty = new BigDecimal(10);
        order = new BigDecimal(15);
        result = w2005MixTagService.validateConsistencyOrderQtyOver(qty, order);
        assertThat(result, is(true));

        // Actual PKG QTY == Order QTY
        qty = new BigDecimal(15);
        result = w2005MixTagService.validateConsistencyOrderQtyOver(qty, order);
        assertThat(result, is(true));
        
        // Actual PKG QTY > Order QTY
        qty = new BigDecimal(20);
        result = w2005MixTagService.validateConsistencyOrderQtyOver(qty, order);
        assertThat(result, is(false));
    }

    /**
     * validateConsistencyPakageItemNoのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyPakageItemNo() throws Exception {
        boolean result = false;
        
        // 正常：マップ1件
        Map<Integer, String> pakageItemNoMap = new HashMap<Integer, String>();
        List<Integer> pkgItemList = new ArrayList<Integer>();
        
        pakageItemNoMap.put(1, "T01");
        result = w2005MixTagService.validateConsistencyPakageItemNo(pakageItemNoMap, pkgItemList);
        assertThat(result, is(true));
        
        // 正常：マップ2件 (異なる)
        pakageItemNoMap.clear();
        pakageItemNoMap.put(1, "T01");
        pakageItemNoMap.put(2, "T03");
        result = w2005MixTagService.validateConsistencyPakageItemNo(pakageItemNoMap, pkgItemList);
        assertThat(result, is(true));
        
        // エラー：マップ2件 (同一)
        pakageItemNoMap.clear();
        pakageItemNoMap.put(1, "T01");
        pakageItemNoMap.put(2, "T01");
        result = w2005MixTagService.validateConsistencyPakageItemNo(pakageItemNoMap, pkgItemList);
        assertThat(result, is(false));
        
        // エラー：マップ3件 (混合)
        pakageItemNoMap.clear();
        pakageItemNoMap.put(1, "T01");
        pakageItemNoMap.put(2, "T03");
        pakageItemNoMap.put(3, "T01");
        result = w2005MixTagService.validateConsistencyPakageItemNo(pakageItemNoMap, pkgItemList);
        assertThat(result, is(false));
        
        // エラー：マップなし
        result = w2005MixTagService.validateConsistencyPakageItemNo(null, pkgItemList);
        assertThat(result, is(false));
        
        // エラー：マップなし(size = 0)
        pakageItemNoMap.clear();
        result = w2005MixTagService.validateConsistencyPakageItemNo(pakageItemNoMap, pkgItemList);
        assertThat(result, is(false));
        
    }

    /**
     * <br />validateConsistencyPkgIpのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyPkgIp() throws Exception {
        boolean result = false;
    
        // 正常：未入力
        result = w2005MixTagService.validateConsistencyPkgIp(null);
        assertThat(result, is(true));

        // 正常： "Y"
        result = w2005MixTagService.validateConsistencyPkgIp("Y");
        assertThat(result, is(true));

        // エラー： "N"
        result = w2005MixTagService.validateConsistencyPkgIp("N");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyPltzTargetRecordActualTagQtyのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyPltzTargetRecordActualTagQty() throws Exception {
        boolean result = false;
        
        
        // エラー：count : 1件 かつ Actual Tag Qty = 1
        result = w2005MixTagService.validateConsistencyPltzTargetRecordActualTagQty(1, new BigDecimal(1));
        assertThat(result, is(false));

        // 正常：count : 1件 かつ Actual Tag Qty = 2
        result = w2005MixTagService.validateConsistencyPltzTargetRecordActualTagQty(1, new BigDecimal(2));
        assertThat(result, is(true));

        // 正常：count : 1件 かつ Actual Tag Qty = 3
        result = w2005MixTagService.validateConsistencyPltzTargetRecordActualTagQty(1, new BigDecimal(3));
        assertThat(result, is(true));
        

    }
    
    /**
     * <br /> validateConsistencyShipLotOverのテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyShipLotOver() throws Exception {
        boolean result = false;
        
        BigDecimal qty = null;
        BigDecimal tagQty = null;
        BigDecimal shipperLot = null;
        
        // 数量 == null、 タグ数 == null, 出荷ロット == null
        result = w2005MixTagService.validateConsistencyShipLotOver(null, null, null);
        assertThat(result, is(true));
        
        // 数量 == 10、 タグ数 == 0, 出荷ロット == 0
        qty = new BigDecimal(10);
        tagQty = new BigDecimal(0);
        shipperLot = new BigDecimal(0);
        
        result = w2005MixTagService.validateConsistencyShipLotOver(qty, tagQty, shipperLot);
        assertThat(result, is(false));
        
        // 数量 == 10、タグ数 == 2、出荷ロット == 10  (10/2) < 10
        qty = new BigDecimal(10);
        tagQty = new BigDecimal(2);
        shipperLot = new BigDecimal(10);
        result = w2005MixTagService.validateConsistencyShipLotOver(qty, tagQty, shipperLot);
        assertThat(result, is(true));
    
        // 数量 == 10、タグ数 == 2、出荷ロット == 5   (10/2) = 5
        shipperLot = new BigDecimal(5);
        result = w2005MixTagService.validateConsistencyShipLotOver(qty, tagQty, shipperLot);
        assertThat(result, is(true));
        
        // 数量 == 10、タグ数 == 2、出荷ロット == 2   (10/2) > 2
        shipperLot = new BigDecimal(2);
        result = w2005MixTagService.validateConsistencyShipLotOver(qty, tagQty, shipperLot);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyWarningFlgIgnoreWarningsのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyWarningFlgIgnoreWarnings() throws Exception {
        boolean result = false;
        
        // 正常：List　存在なし
        result = w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(null, null);
        assertThat(result, is(true));
        
        // エラー：Listの中に warningFlg = 1が含まれる　かつ　ignore Warnings が未設定
        List<String> warningFlgList = new ArrayList<String>();
        warningFlgList.add("1");
        result = w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(warningFlgList, null);
        assertThat(result, is(false));
        
        // エラー：Listの中に warningFlg = 1が含まれる　かつ　ignore Warnings が未設定
        warningFlgList.add("1");
        result = w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(warningFlgList, "off");
        assertThat(result, is(false));
        
        // 正常
        warningFlgList.add("1");
        result = w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(warningFlgList, "on");
        assertThat(result, is(true));

        // 正常
        warningFlgList.clear();
        warningFlgList.add("2");
        warningFlgList.add("2");
        warningFlgList.add("2");
        result = w2005MixTagService.validateConsistencyWarningFlgIgnoreWarnings(warningFlgList, "off");
        assertThat(result, is(true));

    }

//////////////////////////////W2005MixTagService.validateDatabaseXXX メソッドの確認 ////////////////////////////////////////
    /**
     * validateDatabaseCigmaAvailableテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable() throws Exception {
        boolean result = false;
        
        // CIGMA利用不可
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", false);
        result = w2005MixTagService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(false));
        
        // CIGMA利用可
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", true);
        result = w2005MixTagService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(true));
    }

    /**
     * validateDatabaseCompWhテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCompWh() throws Exception {

        boolean result1 = w2005MixTagService.validateDatabaseCompWh("TG0", "A101");
        boolean result2 = w2005MixTagService.validateDatabaseCompWh("X", "A101");
        boolean result3 = w2005MixTagService.validateDatabaseCompWh("TG0", "X");
        boolean result4 = w2005MixTagService.validateDatabaseCompWh("", "A101");
        boolean result5 = w2005MixTagService.validateDatabaseCompWh("TG0", "");
        boolean result6 = w2005MixTagService.validateDatabaseCompWh(null, "A101");
        boolean result7 = w2005MixTagService.validateDatabaseCompWh("TG0", null);
        boolean result8 = w2005MixTagService.validateDatabaseCompWh("", "");
        boolean result9 = w2005MixTagService.validateDatabaseCompWh(null, null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
    
    }

    /**
     * validateDatabaseShipperテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipper() throws Exception {
        
        boolean result1 = w2005MixTagService.validateDatabaseShipper("SHIP0001");
        boolean result2 = w2005MixTagService.validateDatabaseShipper("C0001");
        boolean result3 = w2005MixTagService.validateDatabaseShipper("X");
        boolean result4 = w2005MixTagService.validateDatabaseShipper("");
        boolean result5 = w2005MixTagService.validateDatabaseShipper(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
    }
    
    /**
     * validateDatabaseShipperCustomerShipToテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperCustomerShipTo() throws Exception {
        boolean result = false;
        
        // 組み合わせ (不正)
        result = w2005MixTagService.validateDatabaseShipperCustomerShipTo("TG0", "9", "9");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        result = w2005MixTagService.validateDatabaseShipperCustomerShipTo("TG0", "2", "3");
        assertThat(result, is(true));
    }

    /**
     * 
     * <br />validateDatabaseShipperPlantAuth のテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperPlantAuth() throws Exception {
        boolean result = false;
        
        // shipperCd == null, plntCd == null
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = w2005MixTagService.validateDatabaseShipperPlantAuth(null, null);
        assertThat(result, is(false));

        // 組み合わせ（不正）
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = w2005MixTagService.validateDatabaseShipperPlantAuth("MY4", "M4");
        assertThat(result, is(false));
        
        // 組み合わせ（正）
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", true);
        result = w2005MixTagService.validateDatabaseShipperPlantAuth("MY4", "M1");
        assertThat(result, is(true));
    }
    
    /**
     * validateDatabaseShipperWhPlantテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant() throws Exception {
        boolean result = false;
        
        // 組み合わせ (不正)
        result = w2005MixTagService.validateDatabaseShipperWhPlant("TG0", "9", "9");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        result = w2005MixTagService.validateDatabaseShipperWhPlant("TG0", "6", "5");
        assertThat(result, is(true));

    }

    /**
     * validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate() throws Exception {
        boolean result = false;
        
        List<UserAuthDomain> userAuths = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setAuthMgtComp("MY8");
        userAuthDomain.setProcMfgDivCd("M2");
        userAuths.add(userAuthDomain);
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", new ArrayList<UserAuthDomain>());
        
        String[] returnLgcyWhCd = {"1"};
        String[] returnWhCompCd = {""};
        String[] returnWhCd = {""};
        
        // compCd = null →  CIGMA選択時のNEXUS倉庫情報取得　データ存在しない
        result = w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate("MY8", returnLgcyWhCd, "M8", returnWhCompCd, returnWhCd, "MYS");
        assertThat(result, is(false));
        
        // compCd = null → CIGMA選択時のNEXUS倉庫情報取得　データ存在する
        result = w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate("MY8", returnLgcyWhCd, "M2", returnWhCompCd, returnWhCd, "MYS");
        assertThat(result, is(true));
        assertThat(returnWhCompCd[0], is("MY8"));
        assertThat(returnWhCd[0], is("WH01"));
        
        // エラー：compCd = "MY8"→ NEXUS選択時のCIGMA情報取得　データ存在しない
        returnWhCompCd[0] = "MY8";
        returnWhCd[0] = "";
        result = w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate("MY8", returnLgcyWhCd, "M8", returnWhCompCd, returnWhCd, "MYS");
        assertThat(result, is(false));
        
        // 正常：compCd = "MY8" → NEXUS選択時のCIGMA情報取得　データ存在する
        returnWhCompCd[0] = "MY8";
        returnWhCd[0] = "WH01";
        result = w2005MixTagService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate("MY8", returnLgcyWhCd, "M2", returnWhCompCd, returnWhCd, "MYS");
        assertThat(result, is(true));
        assertThat(returnLgcyWhCd[0], is("1"));
    }

    /**
     * validateDatabaseTmPkgMaterialsOnDetailSaveテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnDetailSave() throws Exception {
        boolean result = false;
         
        // エラー：包装材原単位に存在しない
        result = w2005MixTagService.validateDatabaseTmPkgMaterialsOnDetailSave("MY8", "dummy", new TmPkgMtrlDomain());
        assertThat(result, is(false));
        
        // エラー：包装在名称原単位に存在しない
        result = w2005MixTagService.validateDatabaseTmPkgMaterialsOnDetailSave("MY8", "PKGITEMENO-001", new TmPkgMtrlDomain());
        assertThat(result, is(false));
        
        // 正常：データ存在する(言語コード指定あり)
        TmPkgMtrlDomain tmPkgMtrl = new TmPkgMtrlDomain();
        result = w2005MixTagService.validateDatabaseTmPkgMaterialsOnDetailSave("MY8", "PKGITEMENO-001", tmPkgMtrl);
        assertThat(result, is(true));
        assertThat(tmPkgMtrl.getModelCd(), is("M"));
        assertThat(tmPkgMtrl.getRtTyp(), is("R"));
        assertThat(tmPkgMtrl.getWeightUnit(), is("KG"));
        assertThat(tmPkgMtrl.getPkgWeight(), is(BigDecimal.ONE));
        assertThat(tmPkgMtrl.getOriginCntryCd(), is("CN"));
        assertThat(tmPkgMtrl.getCurrCd(), is("002"));
        assertThat(tmPkgMtrl.getPkgMtrlNm(), is("段ボール"));
        
        // 正常：データ存在する(言語コード指定なし)
        result = w2005MixTagService.validateDatabaseTmPkgMaterialsOnDetailSave("MY8", "PKGITEMENO-001", tmPkgMtrl);
        assertThat(result, is(true));
        assertThat(tmPkgMtrl.getModelCd(), is("M"));
        assertThat(tmPkgMtrl.getRtTyp(), is("R"));
        assertThat(tmPkgMtrl.getWeightUnit(), is("KG"));
        assertThat(tmPkgMtrl.getPkgWeight(), is(BigDecimal.ONE));
        assertThat(tmPkgMtrl.getOriginCntryCd(), is("CN"));
        assertThat(tmPkgMtrl.getCurrCd(), is("002"));
        assertThat(tmPkgMtrl.getPkgMtrlNm(), is("Cardboard"));
    }
 
    /**
     * validateDatabaseTtMixTagItemNoOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtMixTagItemNoOnRegister() throws Exception {
        boolean result = false;
        
        // 正常：pltzInstrNo = "" →　チェックなし
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("", null, null, null, null);
        assertThat(result, is(true));
        
        // 正常：指示超えチェックリストデータが存在しない場合
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("dummy", null, null, null, null);
        assertThat(result, is(true));
        
        // 支持数量(InstrQTY) - MIXED品目番号.SUM(QTY) < Actual PKG QTY
        // 正常：等しい( 支持数量(InstrQTY) (50) - MIXED品目番号.SUM(QTY) (30) == Actual PKG QTY (20)) 
        BigDecimal instrQty = new BigDecimal(50);
        BigDecimal actualPkgQty = new BigDecimal(20);
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("MY70430001", "A002TB0091B3N05", "110", actualPkgQty, instrQty);
        assertThat(result, is(true));
        
        // 正常：( 支持数量(InstrQTY) (50) - MIXED品目番号.SUM(QTY) (30) > Actual PKG QTY (19)) 
        actualPkgQty = new BigDecimal(19);
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("MY70430001", "A002TB0091B3N05", "110", actualPkgQty, instrQty);
        assertThat(result, is(true));
        
        // エラー： ( 支持数量(InstrQTY) (50) - MIXED品目番号.SUM(QTY) (30) < Actual PKG QTY (21))
        actualPkgQty = new BigDecimal(21);
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("MY70430001", "A002TB0091B3N05", "110", actualPkgQty, instrQty);
        assertThat(result, is(false));
        
        // 正常：2件取得( 支持数量(InstrQTY) (30) - MIXED品目番号.SUM(QTY) (10) > Actual PKG QTY (10)) 
        actualPkgQty = new BigDecimal(10);
        result = w2005MixTagService.validateDatabaseTtMixtagItemNoOnRegister("MY70000001", "A002TB0091B3N05", "110", actualPkgQty, instrQty);
        assertThat(result, is(true));
        
    }
    
    /**
     * validateDatabaseTtMixTagOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtMixTagOnRegisterCancel() throws Exception {
        
        // レコードが存在しない場合
        String error = w2005MixTagService.validateDatabaseTtMixtagOnRegisterCancel("dummy");
        assertThat(error, is(GSCM_E0_0010));
        
        // エラー：ステータス不正 (20:梱包済)
        error = w2005MixTagService.validateDatabaseTtMixtagOnRegisterCancel("MMY7WH01405010002");
        assertThat(error, is(NXS_E1_0011));
        
        // 正常：ステータス(10)
        error = w2005MixTagService.validateDatabaseTtMixtagOnRegisterCancel("MMA7WH01405010001");
        assertThat(error, is(nullValue()));
        
        // ロールバック
        rollback();
    }
    
    /**
     * validateDatabaseTtPltzInstrOnRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegister() throws Exception {
        boolean result = false;
        
        // 正常：pltzInstrNoが未指定
        result = w2005MixTagService.validateDatabaseTtPltzInstrOnRegister("");
        assertThat(result, is(true));
        
        // 正常：pltzInstrNoが未指定
        result = w2005MixTagService.validateDatabaseTtPltzInstrOnRegister(null);
        assertThat(result, is(true));
        
        // エラー：存在しない
        result = w2005MixTagService.validateDatabaseTtPltzInstrOnRegister("dummy");
        assertThat(result, is(false));
        
        // 正常：データ存在あり
        result = w2005MixTagService.validateDatabaseTtPltzInstrOnRegister("MY70000050");
        assertThat(result, is(true));
        
        // ロールバック
        rollback();
    }
    
    /**
     * validateDatabaseTtPltzOnHeaderMoveToCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnHeaderMoveToCreate() throws Exception {
        boolean result = false;
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // 正常：pltzInstrNo = "" の場合　チェックしないため OK
        W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreate(null, mixTagCriteria);
        assertThat(result, is(true));
        
        // 梱包指示チェック：レコードが存在しない場合
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTagCriteria.setPltzInstrNo("dummy");
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreate(mixTag, mixTagCriteria);
        assertThat(result, is(false));
                
        // 正常系：梱包指示、梱包指示番号に存在する場合
        mixTag = new W2005MixTagDomain();
        mixTagCriteria.setPltzInstrNo("MY40000001");
        mixTagCriteria.setServerId("MYS");
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreate(mixTag, mixTagCriteria);
        assertThat(result, is(true));
        assertThat(mixTag.getShipperCd(), is("MY4"));
        assertThat(mixTag.getCustomerCd(), is("30001205"));
        assertThat(mixTag.getLgcyShipTo(), is("00"));
        assertThat(mixTag.getTrnsCd(), is("S"));
        assertThat(mixTag.getPlntCd(), is("M1"));
        assertThat(mixTag.getLgcyWhCd(), is("1"));
        assertThat(mixTag.getPltzInstrStatus(), is("10"));
        assertThat(mixTag.getCompCd(), is("MY4"));
        assertThat(mixTag.getWhCd(), is("WH01"));
    }
    
    /**
     * validateDatabaseTtPltzOnHeaderMoveToCreateByCompletionテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnHeaderMoveToCreateByCompletion() throws Exception {
        boolean result = false;
        
        // エラー：梱包完了ステータス (40)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        assertThat(result, is(false));
        
        // エラー：梱包完了ステータス (50)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        assertThat(result, is(false));
        
        // 正常  ：梱包完了ステータス (10)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        assertThat(result, is(true));

        // 正常  ：梱包完了ステータス ("")
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion("");
        assertThat(result, is(true));

    }

    /**
     * validateDatabaseTtPltzOnHeaderMoveToCreateByPrintテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnHeaderMoveToCreateByPrint() throws Exception {
        boolean result = false;
        
        // 正常：梱包完了ステータス (40)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        assertThat(result, is(true));
        
        // 正常：梱包完了ステータス (50)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        assertThat(result, is(true));
        
        // エラー  ：梱包完了ステータス (10)
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        assertThat(result, is(false));

        // 正常  ：梱包完了ステータス ("")
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByPrint("");
        assertThat(result, is(true));

    }

    /**
     * validateDatabaseTwMixtagOnCreateMoveToRegister(テスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwMixtagOnCreateMoveToRegister() throws Exception {
        boolean result = false;
        
        // エラー：dscId = null
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateMoveToRegister(null);
        assertThat(result, is(false));
        
        // エラー：dscId = ""
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateMoveToRegister("");
        assertThat(result, is(false));
        
        // エラー：dscId = "MY"
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateMoveToRegister("dummy");
        assertThat(result, is(false));
        
        // 正常  ：dscId = "MY8"
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateMoveToRegister("JUNIT0011");
        assertThat(result, is(true));
        
    }
    
    /**
     * validateDatabaseTtPltzOnHeaderMoveToCreateByCompCdテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnHeaderMoveToCreateByCompCd() throws Exception {
        boolean result = false;

        // エラー：未指定
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(null);
        assertThat(result, is(false));

        // エラー：未指定
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd("");
        assertThat(result, is(false));
        
        // 正常：設定あり
        result = w2005MixTagService.validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd("MY7");
        assertThat(result, is(true));
        
    }
    
    /**
     * validateDatabaseTwMixtagOnCreateUpdateByConditionテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwMixtagOnCreateUpdateByCondition() throws Exception {
        boolean result = false;
        
        List<W2005MixTagItemDomain> domainList = new ArrayList<W2005MixTagItemDomain>();
        List<String> paramsList = new ArrayList<String>();
        
        // 正常：mixTagRtListが取得できなかった場合
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("dummy", domainList, paramsList);
        assertThat(result, is(true));
        
        // 正常：引数domianListが1件、mixTagRtListが1件取得できた場合
        W2005MixTagItemDomain domain = new W2005MixTagItemDomain();
        domain = new W2005MixTagItemDomain();
        domain.setContainerSortingKey("ZA001001");
        domain.setLoadingCd("D");
        domain.setContainerLooseTyp("C");
        domain.setInvoiceKey("NMY");
        domain.setCustomTimingTyp("A");
        domain.setCurrCd("002");
        domainList.add(domain);
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0013", domainList, paramsList);
        assertThat(result, is(true));
        
        // 正常：引数domianListが1件、mixTagRtListが3件取得でき、全て同じコードの場合
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(true));
        
        // 正常：引数domianListが3件、mixTagRtListが1件取得でき、全て同じコードの場合
        W2005MixTagItemDomain domain2 = new W2005MixTagItemDomain();
        domain2.setContainerSortingKey("ZA001001");
        domain2.setLoadingCd("D");
        domain2.setContainerLooseTyp("C");
        domain2.setInvoiceKey("NMY");
        domain2.setCustomTimingTyp("A");
        domain2.setCurrCd("002");
        domainList.add(domain2);
        
        W2005MixTagItemDomain domain3 = new W2005MixTagItemDomain();
        domain3.setContainerSortingKey("ZA001001");
        domain3.setLoadingCd("D");
        domain3.setContainerLooseTyp("C");
        domain3.setInvoiceKey("NMY");
        domain3.setCustomTimingTyp("A");
        domain3.setCurrCd("002");
        domainList.add(domain3);
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0013", domainList, paramsList);
        assertThat(result, is(true));
        
        // 正常：引数domianListが3件、mixTagRtListが3件取得でき、全て同じコードの場合
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(true));
        
        // エラー：mixTagRtListが3件取得でき、ContainerSortingKeyが異なる場合
        paramsList.clear();
        domainList.get(0).setContainerSortingKey("dummy");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.containerSortingKey"));
        
        // エラー：mixTagRtListが3件取得でき、LoadingCd が異なる場合
        paramsList.clear();
        domainList.get(0).setContainerSortingKey("ZA001001");
        domainList.get(0).setLoadingCd("B");
        domainList.get(1).setLoadingCd("B");
        domainList.get(2).setLoadingCd("B");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.loadingCd"));
        
        // エラー：mixTagRtListが3件取得でき、LoadingCd が異なる場合
        paramsList.clear();
        domainList.get(0).setLoadingCd("D");
        domainList.get(1).setLoadingCd("D");
        domainList.get(2).setLoadingCd("D");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0015", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.loadingCd"));
        
        // エラー：mixTagRtListが3件取得でき、 ContainerLooseTypが異なる場合
        paramsList.clear();
        domainList.get(0).setContainerLooseTyp("D");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.containerLooseTyp"));
        
        // エラー：mixTagRtListが3件取得でき、 InvoiceKeyが異なる場合
        paramsList.clear();
        domainList.get(0).setContainerLooseTyp("C");
        domainList.get(0).setInvoiceKey("DMY");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.invoiceKey"));
        
        // エラー：mixTagRtListが3件取得でき、 CustomTimingTypが異なる場合
        paramsList.clear();
        domainList.get(0).setInvoiceKey("NMY");
        domainList.get(0).setCustomTimingTyp("S");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.customTimingTyp"));
        
        // エラー：mixTagRtListが3件取得でき、 CurrCdが異なる場合
        paramsList.clear();
        domainList.get(0).setCustomTimingTyp("A");
        domainList.get(0).setCurrCd("001");
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCondition("JUNIT0014", domainList, paramsList);
        assertThat(result, is(false));
        assertThat(paramsList.get(0), is("label.currCd"));
    }
    
    /**
     * validateDatabaseTwMixtagOnCreateUpdateByCountテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwMixtagOnCreateUpdateByCount() throws Exception {
        boolean result = false;
        
        // 正常； MIX品目番号ワークの件数(0)＋登録件数(20) = 最大登録件数(20)
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCount("dummy", 20);
        assertThat(result, is(true));
        
        // 正常：MIX品目番号ワークの件数(20)＋登録件数(0) ＝最大登録件数(20)
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCount("JUNIT0012", 0);
        assertThat(result, is(true));
        
        // エラー：MIX品目番号ワークの件数(1)＋登録件数(20) > 最大登録件数(20)
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCount("JUNIT0011", 21);
        assertThat(result, is(false));
        
        // エラー：MIX品目番号ワークの件数(20)＋登録件数(1) > 最大登録件数(20)
        result = w2005MixTagService.validateDatabaseTwMixtagOnCreateUpdateByCount("JUNIT0012", 1);
        assertThat(result, is(false));
    }
    
    /**
     * searchCountForPagingOnMainSearchテスト (権限以外)
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountForPagingOnMainSearch1() throws Exception {
        // W2005画面 Search処理

        /*
         *  0: テストケースの説明
         *  1: 検索結果の件数
         *  2: サーバID
         *  3: 荷主コード
         *  4: 得意先NO
         *  5: LEGACY送荷先
         *  6: 輸送手段コード
         *  7: 製造部工場区分
         *  8: LEGACY倉庫コード
         *  9: MixTagステータス
         * 10: MixTagNo
         * 11: MixTag作成日(From)
         * 12: MixTag作成日(To)
         * 13: MixTag作成者ID
         * 14: 品目番号
         * 15: PKGCD
         */
        String[][] fixtures = {
            { "追加条件なし",                     "486", "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "CUSTOMER_CDを指定",                "1",   "MYS", "MY4", "30001201", null, null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "LGCY_SHIP_TOを指定",               "1",   "MYS", "MY4", null,       "01", null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "TRANS_CDを指定",                   "1",   "MYS", "MY4", null,       null, "A",  null, null, null, null,                null,       null,       null,      null,            null , null },
            { "PLNT_CDを指定",                    "1",   "MYS", "MY4", null,       null, null, "M2", null, null, null,                null,       null,       null,      null,            null , null },
            { "LGCY_WH_CDを指定",                 "1",   "MYS", "MY4", null,       null, null, null, "2",  null, null,                null,       null,       null,      null,            null , null },
            { "MIX_TAG_STATUSを指定",             "2",   "MYS", "MY4", null,       null, null, null, null, "20", null,                null,       null,       null,      null,            null , null },
            { "MIX_TAG_NOを指定",                 "1",   "MYS", "MY4", null,       null, null, null, null, null, "MMY4WH01405220008", null,       null,       null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(From)を指定",     "483", "MYS", "MY4", null,       null, null, null, null, null, null,                "01/05/14", null,       null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(To)を指定",       "483", "MYS", "MY4", null,       null, null, null, null, null, null,                null,       "31/05/14", null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(From/To)を指定",  "480", "MYS", "MY4", null,       null, null, null, null, null, null,                "01/05/14", "31/05/14", null,      null,            null , null },
            { "MIX_TAG_ISSUERを指定",             "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       "JUNIT",   null,            null , null },
            { "品目番号を指定",                   "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      "A002TB0091B3x", null , null },
            { "PKGCDを指定",                      "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      null,            "130", null },
        };

        // 権限なし
        for (String[] fixture : fixtures) {
            String reason = fixture[0];
            int expected = Integer.parseInt(fixture[1]);
            int count = w2005MixTagService.searchCountForPagingOnMainSearch(toMixTagCriteria(fixture));
            assertThat(reason, count, is(expected));
        }
    }
    
    /**
     * searchCountForPagingOnMainSearchテスト (権限)
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountForPagingOnMainSearch2() throws Exception {
        // W2005画面 Search処理
        
        /*
         * 0: 役割
         * 1: 会社コード
         * 2: 工場コード
         * 3: 認可機能ID
         * 4: 権限
         */
        // 権限
        String[][][] userAuthList = {
            {
                { "AR", "MY4", "M1", "W2005R", "R"},
            },
            {
                { "AR", "MY4", "M1", "W2005R", "R"},
                { "AR", "MY4", "M2", "W2005R", "R"},
            },
            
        };
        // 検索条件 (書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[][] fixtures = {
            { "権限: [M1]",    "481", "MYS", "MY4", "30001205", "00", null, null, null, null, null, null, null, null, null, null, null },
            { "権限: [M1,M2]", "481", "MYS", "MY4", "30001205", "00", null, null, null, null, null, null, null, null, null, null, null },
        };
        
        for (int i = 0; i < userAuthList.length; i++) {
            String reason = fixtures[i][0];
            int expected = Integer.parseInt(fixtures[i][1]);
            int count = w2005MixTagService.searchCountForPagingOnMainSearch(toMixTagCriteria(fixtures[i], userAuthList[i]));
            assertThat(reason, count, is(expected));
        }
    }
    
    /**
     * searchForPagingOnCreateSearchByNonInstrテスト(正常系(CIGMA倉庫、disabledFlg(hidden)が0))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByNonInstr1() throws Exception {
        // W2007画面 Search処理 成行 正常系(CIGMA倉庫、disabledFlg(hidden)が0)
        
        // メッセージ
        String[] fixture = {"W2007画面 Search処理 成行 正常系(CIGMA倉庫、disabledFlg(hidden)が0)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearchByNonInstr1_W2007SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        List<? extends W2005MixTagItemDomain> mixTagItemList = w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(criteria, errMessages);
        
        // debug用 Start

        // 検証項目
        String chkItems = "DISABLED_FLG,CONTAINER_SORTING_KEY,LOADING_CD,ITEM_NO,PKG_CD,MAX_REV,CONTAINER_LOOSE_TYP,LOT_SIZE,QTY,TAG_QTY,ODR,ON_HAND_QTY,STOCK_QTY,INSTR_PKGED_QTY,BO,INSTR_QTY,INVOICE_KEY,NET_WEIGHT_A,CUSTOM_TIMING_TYP,DISABLED_FLG,ITEM_DESCRIPTION,HIDDEN_PLNT_CD,WEIGHT_UNIT,CURR_CD,QTY_UNIT,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイルのヘッダー出力
        System.out.println(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (W2005MixTagItemDomain from : mixTagItemList){
            W2005MixTagItemTestDomain to = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(to, from);
            to.setChkItems(chkItems);
            System.out.println(to);
        }

        // debug用 End
        
        // 結果判定
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchForPagingOnCreateSearchByNonInstrテスト(正常系(CIGMA倉庫、disabledFlg(hidden)が1))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByNonInstr2() throws Exception {
        // W2007画面 Search処理 成行 正常系(CIGMA倉庫、disabledFlg(hidden)が0)
        
        // メッセージ
        String[] fixture = {"W2007画面 Search処理 成行 正常系(CIGMA倉庫、disabledFlg(hidden)が1)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearchByNonInstr2_W2007SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("JUNIT0002");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        List<? extends W2005MixTagItemDomain> mixTagItemList = w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(criteria, errMessages);
        
        // debug用 Start
        // 検証項目
        String chkItems = "DISABLED_FLG,CONTAINER_SORTING_KEY,LOADING_CD,ITEM_NO,PKG_CD,MAX_REV,CONTAINER_LOOSE_TYP,LOT_SIZE,QTY,TAG_QTY,ODR,ON_HAND_QTY,STOCK_QTY,INSTR_PKGED_QTY,BO,INSTR_QTY,INVOICE_KEY,NET_WEIGHT_A,CUSTOM_TIMING_TYP,DISABLED_FLG,ITEM_DESCRIPTION,HIDDEN_PLNT_CD,WEIGHT_UNIT,CURR_CD,QTY_UNIT,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイルのヘッダー出力
        System.out.println(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (W2005MixTagItemDomain from : mixTagItemList){
            W2005MixTagItemTestDomain to = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(to, from);
            to.setChkItems(chkItems);
            System.out.println(to);
        }
        // debug用 End
        
        // 結果判定
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

    /**
     * searchForPagingOnCreateSearchByNonInstrテスト(正常系(NEXUS倉庫))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByNonInstr3() throws Exception {
        // W2007画面 Search処理 成行 正常系(NEXUS倉庫)
        
        // メッセージ
        String[] fixture = {"W2007画面 Search処理 成行 正常系(NEXUS倉庫)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearchByNonInstr3_W2007SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("");
        criteria.setPltzInstrNo("2");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        List<? extends W2005MixTagItemDomain> mixTagItemList = w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(criteria, errMessages);
        
        // debug用 Start
        // 検証項目
        String chkItems = "DISABLED_FLG,CONTAINER_SORTING_KEY,LOADING_CD,ITEM_NO,PKG_CD,MAX_REV,CONTAINER_LOOSE_TYP,LOT_SIZE,QTY,TAG_QTY,ODR,ON_HAND_QTY,STOCK_QTY,INSTR_PKGED_QTY,BO,INSTR_QTY,INVOICE_KEY,NET_WEIGHT_A,CUSTOM_TIMING_TYP,DISABLED_FLG,ITEM_DESCRIPTION,HIDDEN_PLNT_CD,WEIGHT_UNIT,CURR_CD,QTY_UNIT,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイルのヘッダー出力
        System.out.println(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (W2005MixTagItemDomain from : mixTagItemList){
            W2005MixTagItemTestDomain to = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(to, from);
            to.setChkItems(chkItems);
            System.out.println(to);
        }
        // debug用 End
        
        // 結果判定
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchForPagingOnCreateSearchByNonInstrテスト(異常系(NEXUS倉庫(倉庫クロスリファレンス原単位が0件)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByNonInstr4() throws Exception {
        // W2007画面 Search処理 成行 異常系(NEXUS倉庫(倉庫クロスリファレンス原単位が0件))
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("");
        criteria.setPltzInstrNo("2");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd(""); //エラーを発生させる為、値を未セットにしておく
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(criteria, errMessages);
        
        // 結果判定
        assertThat(errMessages.get(0), is("NXS-E1-0049"));
    }
    
    /**
     * searchForPagingOnCreateSearchByNonInstrテスト(異常系(Ws2004でシステムエラー))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByNonInstr5() throws Exception {
        // W2007画面 Search処理 成行 異常系(Ws2004でシステムエラー)
        
        // Mock設定 Ws2004RestServiceのResultCode=9(システムエラー)
        Ws2004ResultDomain wsResultDomain = new Ws2004ResultDomain();
        wsResultDomain.setResultCode("9");
        
        MockObjectManager.addReturnValue(Ws2004RestServiceMockImpl.class, "searchItemInfoForCml", wsResultDomain);
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        try {
            w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(criteria, errMessages);
            fail("例外が発生しない");
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }
    /**
     * searchForPagingOnCreateSearchByPltzInstrテスト(正常系(disabledFlg(hidden)が0))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByPltzInstr1() throws Exception {
        // W2007画面 Search処理 梱包指示 正常系(disabledFlg(hidden)が0)
        
        // メッセージ
        String[] fixture = {"W2007画面 Search処理 梱包指示 正常系(disabledFlg(hidden)が0)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearchByPltzInstr1_W2007SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("MY40612001");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        List<? extends W2005MixTagItemDomain> mixTagItemList = w2005MixTagService.searchForPagingOnCreateSearchByPltzInstr(criteria, errMessages);
        
        // debug用 Start
        // 検証項目
        String chkItems = "DISABLED_FLG,CONTAINER_SORTING_KEY,LOADING_CD,ITEM_NO,PKG_CD,MAX_REV,CONTAINER_LOOSE_TYP,LOT_SIZE,QTY,TAG_QTY,ODR,ON_HAND_QTY,STOCK_QTY,INSTR_PKGED_QTY,BO,INSTR_QTY,INVOICE_KEY,NET_WEIGHT_A,CUSTOM_TIMING_TYP,DISABLED_FLG,ITEM_DESCRIPTION,HIDDEN_PLNT_CD,WEIGHT_UNIT,CURR_CD,QTY_UNIT,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイルのヘッダー出力
        System.out.println(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (W2005MixTagItemDomain from : mixTagItemList){
            W2005MixTagItemTestDomain to = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(to, from);
            to.setChkItems(chkItems);
            System.out.println(to);
        }
        // debug用 End
        
        // 結果判定
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchForPagingOnCreateSearchByPltzInstrテスト(正常系(disabledFlg(hidden)が1))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByPltzInstr2() throws Exception {
        // W2007画面 Search処理 梱包指示 正常系(disabledFlg(hidden)が1)
        
        // メッセージ
        String[] fixture = {"W2007画面 Search処理 梱包指示 正常系(disabledFlg(hidden)が0)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearchByPltzInstr2_W2007SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("JUNIT0001");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("MY40612002");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        List<? extends W2005MixTagItemDomain> mixTagItemList = w2005MixTagService.searchForPagingOnCreateSearchByPltzInstr(criteria, errMessages);
        
        // debug用 Start
        // 検証項目
        String chkItems = "DISABLED_FLG,CONTAINER_SORTING_KEY,LOADING_CD,ITEM_NO,PKG_CD,MAX_REV,CONTAINER_LOOSE_TYP,LOT_SIZE,QTY,TAG_QTY,ODR,ON_HAND_QTY,STOCK_QTY,INSTR_PKGED_QTY,BO,INSTR_QTY,INVOICE_KEY,NET_WEIGHT_A,CUSTOM_TIMING_TYP,DISABLED_FLG,ITEM_DESCRIPTION,HIDDEN_PLNT_CD,WEIGHT_UNIT,CURR_CD,QTY_UNIT,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイルのヘッダー出力
        System.out.println(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (W2005MixTagItemDomain from : mixTagItemList){
            W2005MixTagItemTestDomain to = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(to, from);
            to.setChkItems(chkItems);
            System.out.println(to);
        }
        // debug用 End
        
        // 結果判定
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchForPagingOnCreateSearchByPltzInstrテスト(異常系(Ws2004でシステムエラー))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchByPltzInstr3() throws Exception {
        // W2007画面 Search処理 梱包指示 異常系(Ws2004でシステムエラー)
        
        // Mock設定 Ws2004RestServiceのResultCode=9(システムエラー)
        Ws2004ResultDomain wsResultDomain = new Ws2004ResultDomain();
        wsResultDomain.setResultCode("9");
        
        MockObjectManager.addReturnValue(Ws2004RestServiceMockImpl.class, "searchItemInfoForCml", wsResultDomain);
        
        // 引数1の設定
        W2005MixTagItemCriteriaDomain criteria = new W2005MixTagItemCriteriaDomain();
        criteria.setAplyStrtDt(df.parse("12/06/14"));
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCompCd("MY4");
        criteria.setContainerSortingKey("");
        criteria.setCustomerCd("30001205");
        criteria.setItemNo("");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLoadingCd("");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("hirao09");
        criteria.setOwnerCompCd("MY4");
        criteria.setPkgCd("");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("MY40612001");
        criteria.setRcvOdrCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2007");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setShippingDt(df.parse("12/06/14"));
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        
        // 引数2の設定
        List<String> errMessages = new ArrayList<String>();
        
        // 実行
        try {
            w2005MixTagService.searchForPagingOnCreateSearchByPltzInstr(criteria, errMessages);
            fail("例外が発生しない");
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch1() throws Exception {
        // W2005画面 Search処理
        
        String[] ignoreCols = {
        };
        
        /*
         *  0: テストケースの説明
         *  1: 検索結果の件数
         *  2: サーバID
         *  3: 荷主コード
         *  4: 得意先NO
         *  5: LEGACY送荷先
         *  6: 輸送手段コード
         *  7: 製造部工場区分
         *  8: LEGACY倉庫コード
         *  9: MixTagステータス
         * 10: MixTagNo
         * 11: MixTag作成日(From)
         * 12: MixTag作成日(To)
         * 13: MixTag作成者ID
         * 14: 品目番号
         * 15: PKGCD
         */
        String[][] fixtures = {
            { "追加条件なし",                     "486", "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "CUSTOMER_CDを指定",                "1",   "MYS", "MY4", "30001201", null, null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "LGCY_SHIP_TOを指定",               "1",   "MYS", "MY4", null,       "01", null, null, null, null, null,                null,       null,       null,      null,            null , null },
            { "TRANS_CDを指定",                   "1",   "MYS", "MY4", null,       null, "A",  null, null, null, null,                null,       null,       null,      null,            null , null },
            { "PLNT_CDを指定",                    "1",   "MYS", "MY4", null,       null, null, "M2", null, null, null,                null,       null,       null,      null,            null , null },
            { "LGCY_WH_CDを指定",                 "1",   "MYS", "MY4", null,       null, null, null, "2",  null, null,                null,       null,       null,      null,            null , null },
            { "MIX_TAG_STATUSを指定",             "2",   "MYS", "MY4", null,       null, null, null, null, "20", null,                null,       null,       null,      null,            null , null },
            { "MIX_TAG_NOを指定",                 "1",   "MYS", "MY4", null,       null, null, null, null, null, "MMY4WH01405220008", null,       null,       null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(From)を指定",     "483", "MYS", "MY4", null,       null, null, null, null, null, null,                "01/05/14", null,       null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(To)を指定",       "483", "MYS", "MY4", null,       null, null, null, null, null, null,                null,       "31/05/14", null,      null,            null , null },
            { "MIX_TAG_ISSUE_DT(From/To)を指定",  "480", "MYS", "MY4", null,       null, null, null, null, null, null,                "01/05/14", "31/05/14", null,      null,            null , null },
            { "MIX_TAG_ISSUERを指定",             "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       "JUNIT",   null,            null , null },
            { "品目番号を指定",                   "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      "A002TB0091B3x", null , null },
            { "PKGCDを指定",                      "1",   "MYS", "MY4", null,       null, null, null, null, null, null,                null,       null,       null,      null,            "130", null },
        };
        
        int i = 0;
        for (String[] fixture : fixtures) {
            String reason = fixture[0];
            List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch1_W2005SearhExpectedList" + i + ".csv");
            W2005MixTagCriteriaDomain criteria = toMixTagCriteria(fixture);
            criteria.setRowNumFrom(1);
            criteria.setRowNumTo(500);
            List<?> actualList = w2005MixTagService.searchForPagingOnMainSearch(criteria);
            assertDomainList(reason, actualList, expectedList, ignoreCols);
            i++;
        }
        
        // 範囲指定の確認
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch1_W2005SearhExpectedList" + new Integer(14) + ".csv");
        W2005MixTagCriteriaDomain criteria = toMixTagCriteria(fixtures[0]);
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(50);
        List<?> actualList = w2005MixTagService.searchForPagingOnMainSearch(criteria);
        assertDomainList("範囲指定", actualList, expectedList, ignoreCols);
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト(権限)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch2() throws Exception {
        // W2005画面 Search処理
        
        String[] ignoreCols = {
        };
        
        /*
         * 0: 役割
         * 1: 会社コード
         * 2: 工場コード
         * 3: 認可機能ID
         * 4: 権限
         */
        // 権限
        String[][][] userAuthList = {
            {
                { "AR", "MY4", "M1", "W2005R", "R"},
            },
            {
                { "AR", "MY4", "M1", "W2005R", "R"},
                { "AR", "MY4", "M2", "W2005R", "R"},
            },
            
        };
        // 検索条件 (書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[][] fixtures = {
            { "権限: [M1]",    "481", "MYS", "MY4", "30001205", "00", null, null, null, null, null, null, null, null, null, null, null },
            { "権限: [M1,M2]", "481", "MYS", "MY4", "30001205", "00", null, null, null, null, null, null, null, null, null, null, null },
        };
        
        int i = 0;
        for (String[] fixture : fixtures) {
            String reason = fixture[0];
            List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch2_W2005SearhExpectedList" + i + ".csv");
            W2005MixTagCriteriaDomain criteria = toMixTagCriteria(fixtures[i], userAuthList[i]);
            criteria.setRowNumFrom(1);
            criteria.setRowNumTo(500);
            List<?> actualList = w2005MixTagService.searchForPagingOnMainSearch(criteria);
            assertDomainList(reason, actualList, expectedList, ignoreCols);
            i++;
        }
    }
    
    /**
     * searchOnDetailInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnDetailInitByFromCreate() throws Exception {
        // W2018画面 Init処理(Create画面より遷移)
        
        String reason = "W2018画面 Init処理(Create画面より遷移)";
        
        // 期待値
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnDetailInitByFromCreate" + ".csv");
        
        String[] ignoreCols = {
        };
        
        // Mock設定 MIXED用RT材ワーク
        List<TwMixtagRtDomain> searchList = new ArrayList<TwMixtagRtDomain>();
        
        TwMixtagRtDomain domain = new TwMixtagRtDomain();
        domain.setDscId("matta07");
        domain.setPkgItemNo("PKGITEMNO");
        domain.setQty(new BigDecimal(3));
        domain.setBoxFlg("Y");
        domain.setModelCd("1");
        domain.setRtFlg("Y");
        domain.setWeightUnit("KG");
        domain.setPkgWeight(new BigDecimal(1));
        
        searchList.add(domain);
        
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchByCondition", searchList);
        
        // 引数設定
        W2005MixTagRtCriteriaDomain criteria = new W2005MixTagRtCriteriaDomain();
        criteria.setLoginUserDscId("matta07");
        
        // 実行
        List<?> actualList = w2005MixTagService.searchOnDetailInitByFromCreate(criteria);
        
        // 結果判定
        assertDomainList(reason, actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchOnDetailInitByFromMainテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnDetailInitByFromMain() throws Exception {
        // W2018画面 Init処理(Main画面より遷移)
        
        String reason = "W2018画面 Init処理(Main画面より遷移)";
        
        // 期待値
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnDetailInitByFromMain" + ".csv");
        
        String[] ignoreCols = {
        };
        
        // Mock設定 MIXED用RT材
        List<TtMixtagRtDomain> searchList = new ArrayList<TtMixtagRtDomain>();
        
        TtMixtagRtDomain domain = new TtMixtagRtDomain();
        domain.setMixTagNo("MMY6WH01405220001");
        domain.setPkgItemNo("PKGITEMNO");
        domain.setQty(new BigDecimal(3));
        domain.setBoxFlg("Y");
        domain.setModelCd("1");
        domain.setRtFlg("Y");
        domain.setWeightUnit("KG");
        domain.setPkgWeight(new BigDecimal(1));
        
        searchList.add(domain);
        
        MockObjectManager.addReturnValue(TtMixtagRtServiceImpl.class, "searchByCondition", searchList);
        
        // 引数設定
        W2005MixTagRtCriteriaDomain criteria = new W2005MixTagRtCriteriaDomain();
        criteria.setMixTagNo("MMY6WH01405220001");
        
        // 実行
        List<?> actualList = w2005MixTagService.searchOnDetailInitByFromMain(criteria);
        
        // 結果判定
        assertDomainList(reason, actualList, expectedList, ignoreCols);
    }
    
    /**
     * searchOnRegisterInitByFromCreateテスト(正常系(ワーニングなし、RT材なし))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate1() throws Exception {
        // W2008画面 Init処理(Create画面より遷移) 正常系(ワーニングなし、RT材なし)
        
        // メッセージ
        String[] fixture = {"W2008画面 Init処理(Create画面より遷移) 正常系(ワーニングなし、RT材なし)"};
        
        // 期待結果
        Map<String, String> expectedDomain = readCsvFile("testSearchOnRegisterInitByFromCreate1_W2008InitFromCreateExpectedDomain.csv").get(0);
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromCreate1_W2008InitFromCreateExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数設定
        W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
        criteria.setBaseAuthFlg("0");
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCustomerCd("30001205");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("JUNIT0004");
        criteria.setOwnerCompCd("MY4");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("MY40612001");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2008");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        criteria.setWhCompCd("MY4");
        
        // 実行
        W2005MixTagDomain mixTag = w2005MixTagService.searchOnRegisterInitByFromCreate(criteria);
        List<W2005MixTagItemDomain> mixTagItemList = mixTag.getMixTagItemDomainList();
        
        // debug用 Start
        
        // 検証項目(検索条件エリア用)
        String chkItemsForHed = "SHIPPER_CD,CUSTOMER_CD,LGCY_SHIP_TO,TRNS_CD,PLNT_CD,LGCY_WH_CD,PLTZ_INSTR_NO,WH_COMP_CD,WH_CD,MIX_TAG_STATUS,INVOICE_KEY,CONTAINER_SORTING_KEY,LOADING_CD,NET_WEIGHT,GROSS_WEIGHT,PKG_IP,BOX_NO,MIX_TAG_NO,CONTAINER_LOOSE_TYP,CUSTOM_TIMING_TYP";
        
        // 検証用ファイル(検索条件エリア用)のヘッダー出力
        System.out.println(chkItemsForHed);
        
        // 検証用ファイル(検索条件エリア用)の検証項目値を出力
        W2005MixTagTestDomain toMixTag = new W2005MixTagTestDomain();
        CommonUtil.copyPropertiesDomainToDomain(toMixTag, mixTag);
        toMixTag.setChkItems(chkItemsForHed);
        System.out.println(toMixTag);
        
        // 検証項目(検索結果エリア用)
        String chkItemsForDtl = "ITEM_NO,PKG_CD,ITEM_DESCRIPTION,SHIPPING_LOT,INSTR_QTY,QTY,TAG_QTY,WARNING_FLG,ITEM_WEIGHT,WEIGHT_UNIT,CURR_CD,QTY_UNIT,PLNT_CD,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイル(検索結果エリア用)のヘッダー出力
        System.out.println(chkItemsForDtl);
        
        // 検証用ファイル(検索結果エリア用)の検証項目値を出力
        for (W2005MixTagItemDomain fromMixTagItem : mixTagItemList){
            W2005MixTagItemTestDomain toMixTagItem = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(toMixTagItem, fromMixTagItem);
            toMixTagItem.setChkItems(chkItemsForDtl);
            System.out.println(toMixTagItem);
        }
        
        // debug用 End
        
        // 結果判定
        assertDomain(fixture[0], mixTag, expectedDomain, ignoreCols);
        
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
    }
    
    /**
     * searchOnRegisterInitByFromCreateテスト(正常系(ワーニングあり、RT材あり))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate2() throws Exception {
        // W2008画面 Init処理(Create画面より遷移) 正常系(ワーニングあり、RT材あり)
        
        // メッセージ
        String[] fixture = {"W2008画面 Init処理(Create画面より遷移) 正常系(ワーニングあり、RT材あり)"};
        
        // 期待結果
        Map<String, String> expectedDomain = readCsvFile("testSearchOnRegisterInitByFromCreate2_W2008InitFromCreateExpectedDomain.csv").get(0);
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromCreate2_W2008InitFromCreateExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数設定
        W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
        criteria.setBaseAuthFlg("0");
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setCustomerCd("30001205");
        criteria.setLanguageCd("en");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setLocale(new Locale("en"));
        criteria.setLoginUserDscId("JUNIT0005");
        criteria.setOwnerCompCd("MY4");
        criteria.setPlntCd("M1");
        criteria.setPltzInstrNo("MY40612001");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2008");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setShipperCd("MY4");
        criteria.setTimeZone("JST");
        criteria.setTrnsCd("S");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setWhCd("WH01");
        criteria.setWhCompCd("MY4");
        
        // 実行
        W2005MixTagDomain mixTag = w2005MixTagService.searchOnRegisterInitByFromCreate(criteria);
        List<W2005MixTagItemDomain> mixTagItemList = mixTag.getMixTagItemDomainList();
        
        // debug用 Start
        
        // 検証項目(検索条件エリア用)
        String chkItemsForHed = "SHIPPER_CD,CUSTOMER_CD,LGCY_SHIP_TO,TRNS_CD,PLNT_CD,LGCY_WH_CD,PLTZ_INSTR_NO,WH_COMP_CD,WH_CD,MIX_TAG_STATUS,INVOICE_KEY,CONTAINER_SORTING_KEY,LOADING_CD,NET_WEIGHT,GROSS_WEIGHT,PKG_IP,BOX_NO,MIX_TAG_NO,CONTAINER_LOOSE_TYP,CUSTOM_TIMING_TYP";
        
        // 検証用ファイル(検索条件エリア用)のヘッダー出力
        System.out.println(chkItemsForHed);
        
        // 検証用ファイル(検索条件エリア用)の検証項目値を出力
        W2005MixTagTestDomain toMixTag = new W2005MixTagTestDomain();
        CommonUtil.copyPropertiesDomainToDomain(toMixTag, mixTag);
        toMixTag.setChkItems(chkItemsForHed);
        System.out.println(toMixTag);
        
        // 検証項目(検索結果エリア用)
        String chkItemsForDtl = "ITEM_NO,PKG_CD,ITEM_DESCRIPTION,SHIPPING_LOT,INSTR_QTY,QTY,TAG_QTY,WARNING_FLG,ITEM_WEIGHT,WEIGHT_UNIT,CURR_CD,QTY_UNIT,PLNT_CD,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイル(検索結果エリア用)のヘッダー出力
        System.out.println(chkItemsForDtl);
        
        // 検証用ファイル(検索結果エリア用)の検証項目値を出力
        for (W2005MixTagItemDomain fromMixTagItem : mixTagItemList){
            W2005MixTagItemTestDomain toMixTagItem = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(toMixTagItem, fromMixTagItem);
            toMixTagItem.setChkItems(chkItemsForDtl);
            System.out.println(toMixTagItem);
        }
        
        // debug用 End
        
        // 結果判定
        assertDomain(fixture[0], mixTag, expectedDomain, ignoreCols);
        
        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
        // ロールバック
        rollback();
    }
    
    /**
     * searchOnRegisterInitByFromMainテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMain() throws Exception {
        // W2008画面 Init処理(Main画面より遷移)

        // メッセージ
        String[] fixture = {"W2008画面 Init処理(Main画面より遷移)"};

        // 期待結果
        Map<String, String> expectedDomain = readCsvFile("testSearchOnRegisterInitByFromMain_W2008InitFromMainExpectedDomain.csv").get(0);
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromMain_W2008InitFromMainExpectedList.csv");

        // 比較対象外カラム
        String[] ignoreCols = {
        };

        // 引数設定
        W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
        criteria.setBaseAuthFlg("0");
        criteria.setCharCd("utf-8");
        criteria.setCheckValidateWarning(false);
        criteria.setLanguageCd("en");
        criteria.setLocale(new  Locale("en"));
        criteria.setLoginUserDscId("JUNIT");
        criteria.setMixTagNo("MMY4WH01406140002");
        criteria.setOwnerCompCd("MY4");
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(0);
        criteria.setScreenId("W2008");
        criteria.setSearchCountCheckFlg(true);
        criteria.setServerId("MYS");
        criteria.setTimeZone("JST");
        //criteria.setUserAuthList(setUserAuthList());
        
        // 実行
        List<? extends W2005MixTagDomain> mixTagList = w2005MixTagService.searchOnRegisterInitByFromMain(criteria);
        
        // debug用 Start
        
        // 検証項目(検索条件エリア用)
        String chkItemsForHed = "SHIPPER_CD,CUSTOMER_CD,LGCY_SHIP_TO,TRNS_CD,PLNT_CD,LGCY_WH_CD,PLTZ_INSTR_NO,WH_COMP_CD,WH_CD,MIX_TAG_STATUS,INVOICE_KEY,CONTAINER_SORTING_KEY,LOADING_CD,NET_WEIGHT,GROSS_WEIGHT,PKG_IP,BOX_NO,MIX_TAG_NO,CONTAINER_LOOSE_TYP,CUSTOM_TIMING_TYP";
        
        // 検証用ファイル(検索条件エリア用)のヘッダー出力
        System.out.println(chkItemsForHed);
        
        // 検証用ファイル(検索条件エリア用)の検証項目値を出力
        W2005MixTagDomain mixTag = mixTagList.get(0);
        W2005MixTagTestDomain toMixTag = new W2005MixTagTestDomain();
        CommonUtil.copyPropertiesDomainToDomain(toMixTag, mixTag);
        toMixTag.setChkItems(chkItemsForHed);
        System.out.println(toMixTag);
        
        // 検証項目(検索結果エリア用)
        String chkItemsForDtl = "ITEM_NO,PKG_CD,ITEM_DESCRIPTION,SHIPPING_LOT,INSTR_QTY,QTY,TAG_QTY,WARNING_FLG,ITEM_WEIGHT,WEIGHT_UNIT,CURR_CD,QTY_UNIT,PLNT_CD,ORIGIN_CNTRY_CD,EXP_LIMIT_TYP,DNGR_ITEM_FLG";
        
        // 検証用ファイル(検索結果エリア用)のヘッダー出力
        System.out.println(chkItemsForDtl);
        
        // 検証用ファイル(検索結果エリア用)の検証項目値を出力
        List<W2005MixTagItemDomain> mixTagItemList = mixTagList.get(0).getMixTagItemDomainList();
        for (W2005MixTagItemDomain fromMixTagItem : mixTagItemList){
            W2005MixTagItemTestDomain toMixTagItem = new W2005MixTagItemTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(toMixTagItem, fromMixTagItem);
            toMixTagItem.setChkItems(chkItemsForDtl);
            System.out.println(toMixTagItem);
        }

        // debug用 End

        // 結果判定
        assertDomain(fixture[0], mixTag, expectedDomain, ignoreCols);

        List<?> actualList = mixTagItemList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * deleteOnDetailDeleteテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnDetailDelete() throws Exception {
        // W2018画面 Delete処理
        
        // Mock設定 再検索
        // searchメソッドで検証済みの為、Mockとする
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnDetailInitByFromCreate");
        
        // 引数設定
        List<W2005MixTagRtCriteriaDomain> criteriaList = new ArrayList<W2005MixTagRtCriteriaDomain>();
        
        // 1件目
        W2005MixTagRtCriteriaDomain criteria1 = new W2005MixTagRtCriteriaDomain();
        criteria1.setLoginUserDscId("JUNIT0008");
        criteria1.setPkgItemNo("pkgItem1");
        criteriaList.add(criteria1);
        
        // 2件目
        W2005MixTagRtCriteriaDomain criteria2 = new W2005MixTagRtCriteriaDomain();
        criteria2.setLoginUserDscId("JUNIT0008");
        criteria2.setPkgItemNo("pkgItem2");
        criteriaList.add(criteria2);
        
        // 実行
        w2005MixTagService.deleteOnDetailDelete(criteriaList);
        
        // 結果判定
        TwMixtagRtCriteriaDomain twMixtagRtCriteria = new TwMixtagRtCriteriaDomain();
        twMixtagRtCriteria.setDscId("JUNIT0008");
        twMixtagRtCriteria.setPkgItemNo("pkgItem3");
        
        TwMixtagRtDomain twMixtagRt  = twMixtagRtService.searchByKey(twMixtagRtCriteria);
        
        assertThat(twMixtagRt.getBoxFlg(), is("Y"));
        
        // ロールバック
        rollback();
    }
    
    /**
     * deleteOnHeaderInitテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnHeaderInit() throws Exception {
        // W2006画面 Init処理
        
        String[][] fixtures = {
            { "MIXED品番ワークあり", "3", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "JUNIT0007" },
            { "MIXED品番ワークなし", "0", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "DUMMY" },
        };
        
        String[] msg = {"MIXED品番RT材ワークあり" , "MIXED品番RT材ワークなし"};
        
        for (int i = 0; i < fixtures.length; i++) {
            // 更新前件数取得
            int beforeMixtagCount = countTwMixtag(fixtures[i][2]);
            int beforeMixtagRtCount = countTwMixtagRt(fixtures[i][2]);
            
            // 実行
            w2005MixTagService.deleteOnHeaderInit(toMixTagCriteria(fixtures[i]));
            
            // 更新後件数取得
            int afterMixtagCount = countTwMixtag(fixtures[i][2]);
            int afterMixtagRtCount = countTwMixtagRt(fixtures[i][2]);
            
            // 結果判定
            int expectedCount = Integer.valueOf(fixtures[i][1]);
            assertThat(fixtures[i][0], beforeMixtagCount - afterMixtagCount, is(expectedCount));
            assertThat(msg[i], beforeMixtagRtCount - afterMixtagRtCount, is(expectedCount));
        }
        
        // ロールバック
        rollback();
    }
    
    /**
     * deleteOnRegisterDeleteテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnRegisterDelete() throws Exception {
        // W2008画面 Delete処理
        
        // Mock設定 再検索
        // searchメソッドで検証済みの為、Mockとする
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromCreate");
        
        // 引数設定
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        
        // 1件目 更新データ
        W2005MixTagItemDomain mixTagItem1 = new W2005MixTagItemDomain();
        mixTagItem1.setLoginUserDscId("JUNIT0006");
        mixTagItem1.setItemNo("A002TB0091B31");
        mixTagItem1.setPkgCd("110");
        
        mixTagItemList.add(mixTagItem1);
        
        // 2件目 登録データ
        W2005MixTagItemDomain mixTagItem2 = new W2005MixTagItemDomain();
        mixTagItem1.setLoginUserDscId("JUNIT0006");
        mixTagItem1.setItemNo("A002TB0091B32");
        mixTagItem1.setPkgCd("110");
        
        mixTagItemList.add(mixTagItem2);
        
        // 実行
        w2005MixTagService.deleteOnRegisterDelete(mixTagItemList);

        // ロールバック
        rollback();
    }
    
    /**
     * transactOnCreateUpdateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnCreateUpdate() throws Exception {
        // W2007画面 Update処理
        
        /*
        // Mock設定 MIXED品目番号ワークの更新
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED品目番号ワークの登録
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "create");
        */
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        // 引数設定
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        
        // 1件目 更新データ
        W2005MixTagItemDomain mixTagItem1 = new W2005MixTagItemDomain();
        mixTagItem1.setBoQty(new BigDecimal(23450));
        mixTagItem1.setCheckValidateWarning(false);
        mixTagItem1.setCoFlg("");
        mixTagItem1.setContainerLooseTyp("C");
        mixTagItem1.setContainerSortingKey("ZA001001");
        mixTagItem1.setCurrCd("xxx");
        mixTagItem1.setCustomTimingTyp("A");
        mixTagItem1.setDisabledFlg("Y");
        mixTagItem1.setDngrItemFlg("N");
        mixTagItem1.setExpLimitTyp("L001");
        mixTagItem1.setHiddenPlntCd("10");
        mixTagItem1.setInstrPkgedQty(BigDecimal.ZERO);
        mixTagItem1.setInstrQty(new BigDecimal(300));
        mixTagItem1.setInvoiceKey("NMY");
        mixTagItem1.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem1.setItemNo("A002TB0091B3N");
        mixTagItem1.setItemWeight(new BigDecimal(50));
        mixTagItem1.setLanguageCd("en");
        mixTagItem1.setLoadingCd("D");
        mixTagItem1.setLoginUserDscId("JUNIT0003");
        mixTagItem1.setMaxRev(BigDecimal.ONE);
        mixTagItem1.setNetWeightA(new BigDecimal(50));
        mixTagItem1.setOnHandQty(new BigDecimal(-599));
        mixTagItem1.setOrderQty(new BigDecimal(22650));
        mixTagItem1.setOriginCntryCd("JP");
        mixTagItem1.setPackedQty(BigDecimal.ZERO);
        mixTagItem1.setPkgCd("110");
        mixTagItem1.setPlntCd("");
        mixTagItem1.setQty(new BigDecimal(100));
        mixTagItem1.setQtyUnit("LT");
        mixTagItem1.setRev(BigDecimal.ONE);
        mixTagItem1.setRowNumFrom(0);
        mixTagItem1.setRowNumTo(0);
        mixTagItem1.setSearchCountCheckFlg(true);
        mixTagItem1.setSelected("on");
        mixTagItem1.setShippingLot(new BigDecimal(30));
        mixTagItem1.setTagQty(new BigDecimal(10));
        mixTagItem1.setWeightUnit("KG");
        
        mixTagItemList.add(mixTagItem1);
        
        // 2件目 登録データ
        W2005MixTagItemDomain mixTagItem2 = new W2005MixTagItemDomain();
        mixTagItem2.setBoQty(new BigDecimal(23450));
        mixTagItem2.setCheckValidateWarning(false);
        mixTagItem2.setCoFlg("");
        mixTagItem2.setContainerLooseTyp("C");
        mixTagItem2.setContainerSortingKey("ZA001001");
        mixTagItem2.setCurrCd("xxx");
        mixTagItem2.setCustomTimingTyp("A");
        mixTagItem2.setDisabledFlg("N");
        mixTagItem2.setDngrItemFlg("N");
        mixTagItem2.setExpLimitTyp("L001");
        mixTagItem2.setHiddenPlntCd("10");
        mixTagItem2.setInstrPkgedQty(BigDecimal.ZERO);
        mixTagItem2.setInstrQty(new BigDecimal(300));
        mixTagItem2.setInvoiceKey("NMY");
        mixTagItem2.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem2.setItemNo("A002TB0091B3N");
        mixTagItem2.setItemWeight(new BigDecimal(50));
        mixTagItem2.setLanguageCd("en");
        mixTagItem2.setLoadingCd("D");
        mixTagItem2.setLoginUserDscId("DUMMY");
        mixTagItem2.setMaxRev(BigDecimal.ONE);
        mixTagItem2.setNetWeightA(new BigDecimal(50));
        mixTagItem2.setOnHandQty(new BigDecimal(-599));
        mixTagItem2.setOrderQty(new BigDecimal(22650));
        mixTagItem2.setOriginCntryCd("JP");
        mixTagItem2.setPackedQty(BigDecimal.ZERO);
        mixTagItem2.setPkgCd("110");
        mixTagItem2.setPlntCd("");
        mixTagItem2.setQty(new BigDecimal(100));
        mixTagItem2.setQtyUnit("LT");
        mixTagItem2.setRev(BigDecimal.ONE);
        mixTagItem2.setRowNumFrom(0);
        mixTagItem2.setRowNumTo(0);
        mixTagItem2.setSearchCountCheckFlg(true);
        mixTagItem2.setSelected("on");
        mixTagItem2.setShippingLot(new BigDecimal(30));
        mixTagItem2.setTagQty(new BigDecimal(10));
        mixTagItem2.setWeightUnit("KG");
        
        mixTagItemList.add(mixTagItem2);
        
        // 実行
        w2005MixTagService.transactOnCreateUpdate(mixTagItemList);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnDetailSaveテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnDetailSave() throws Exception {
        // W2018画面 Save処理
        
        /*
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの登録
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "create");
        */
        
        // Mock設定 再検索処理
        // searchOnDetailInitByFromCreateメソッドで検証済みの為、Mockとする
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnDetailInitByFromCreate");
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUnit");
        
        // 引数設定
        List<W2005MixTagRtDomain> mixTagRtList = new ArrayList<W2005MixTagRtDomain>();
        
        // 1件目
        W2005MixTagRtDomain mixTagRt1 = new W2005MixTagRtDomain();
        mixTagRt1.setLoginUserDscId("JUNIT0005");
        mixTagRt1.setPkgItemNo("21");
        mixTagRt1.setQty(new BigDecimal(3));
        mixTagRt1.setBoxFlg("4");
        mixTagRt1.setModelCd("5");
        mixTagRt1.setRtFlg("6");
        mixTagRt1.setWeightUnit("7");
        mixTagRt1.setPkgWeight(new BigDecimal(8));
        mixTagRt1.setPkgNm("9");
        mixTagRt1.setOriginCntryCd("10");
        mixTagRt1.setCurrCd("11");
        mixTagRtList.add(mixTagRt1);

        W2005MixTagRtDomain mixTagRt2 = new W2005MixTagRtDomain();
        mixTagRt2.setLoginUserDscId("JUNIT0005");
        mixTagRt2.setPkgItemNo("22");
        mixTagRt2.setQty(new BigDecimal(3));
        mixTagRt2.setBoxFlg("4");
        mixTagRt2.setModelCd("5");
        mixTagRt2.setRtFlg("6");
        mixTagRt2.setWeightUnit("7");
        mixTagRt2.setPkgWeight(new BigDecimal(8));
        mixTagRt2.setPkgNm("9");
        mixTagRt2.setOriginCntryCd("10");
        mixTagRt2.setCurrCd("11");
        mixTagRtList.add(mixTagRt2);
        // 実行
        w2005MixTagService.transactOnDetailSave(mixTagRtList);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterテスト(正常系(梱包指示))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister1() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("10");
        mixTagItem.setInstrQty(new BigDecimal(300));
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(-1));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("MY40612001");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0009");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("MY40612001");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegister(mixTag);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterテスト(正常系(成行))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister2() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("M1");
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("");
        mixTagItem.setQty(new BigDecimal(1000));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComCreateUserId("JUNIT0010");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("hirao09");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegister(mixTag);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterテスト(正常系(成行(MIXED品目番号の工場コードなし、仮在庫UPDATE)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister3() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 準備
        // 仮在庫を登録
        /* ロックが発生するので登録してもダメ
        TtTmpStockDomain ttTmpStock = new TtTmpStockDomain();
        ttTmpStock.setShipperCd("MY4");
        ttTmpStock.setLgcyWhCd("1");
        ttTmpStock.setItemNo("A002TB0091B3N");
        ttTmpStock.setPkgCd("110");
        ttTmpStock.setQty(new BigDecimal(100));
        commonService.setCommonPropertyForRegist(ttTmpStock, "JUNIT");
        ttTmpStockService.create(ttTmpStock);
        */
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("");  //Blankに設定
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("9");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("");
        mixTagItem.setQty(new BigDecimal(1000));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComCreateUserId("JUNIT0010");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("hirao09");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegister(mixTag);
        
        // ロールバック
        rollback();
    }

    /**
     * transactOnRegisterテスト(正常系(B-ALL、R-ALL権限あり))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister4() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("10");
        mixTagItem.setInstrQty(new BigDecimal(300));
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(-1));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("MY40612001");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0009");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("MY40612001");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegister(mixTag);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterテスト(異常系(権限なし))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister5() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("10");
        mixTagItem.setInstrQty(new BigDecimal(300));
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(-1));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("MY40612001");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0009");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("MY40612001");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        try {
            // 実行
            w2005MixTagService.transactOnRegister(mixTag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("GSCM-I0-0009"));
        } finally {
            rollback();
        }
    }
    
    /**
     * transactOnRegisterテスト(異常系(成行(輸出受注引当残あり)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister6() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("M1");
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("0"); // データがヒットしないように設定している
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("0");  // データがヒットしないように設定している
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0010");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        try {
            // 実行
            w2005MixTagService.transactOnRegister(mixTag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E1-0008"));
        }
    }
    
    /**
     * transactOnRegisterテスト(異常系(成行(日付変換エラー)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister7() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 日付変換エラーを発生させる
        MockObjectManager.addReturnValue(SimpleDateFormat.class, "parse", new ParseException("", 0));
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("M1");
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0010");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        try {
            // 実行
            w2005MixTagService.transactOnRegister(mixTag);
            fail("例外が発生しない");
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        } finally {
            rollback();
        }
    }
    
    /**
     * transactOnRegisterテスト(異常系(成行(G/Wの計算エラー)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister8() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定  G/Wの計算
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new SystemException("NXS-91-0001"));
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("M1");
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 13:04:26").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0010");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        try {
            // 実行
            w2005MixTagService.transactOnRegister(mixTag);
            fail("例外が発生しない");
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        } finally {
            rollback();
        }
    }
    
    /**
     * transactOnRegisterテスト(正常系(梱包指示(PLNT_CDなし)))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister9() throws Exception {
        // W2008画面 Register処理
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        /* 実ロジックを稼働させる為コメントアウト
        
        // Mock設定 輸出受注の更新
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "updateByCondition");
        
        // Mock設定 MIXED現品票の登録
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号の登録
        MockObjectManager.addReturnNull(TtMixtagItemNoServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号受注情報の登録
        MockObjectManager.addReturnNull(TtMixtagOdrServiceImpl.class, "create");
        
        // Mock設定 MIXED品目番号ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED品目番号ワークの削除
        MockObjectManager.addReturnNull(TwMixtagServiceImpl.class, "deleteByCondition");
        
        // Mock設定 MIXED用RT材ワークの参照
        List<TwMixtagRtDomain> twMixtagRtList = new ArrayList<TwMixtagRtDomain>();
        TwMixtagRtDomain twMixtagRt = new TwMixtagRtDomain();
        twMixtagRt.setDscId("1");
        twMixtagRt.setPkgItemNo("2");
        twMixtagRtList.add(twMixtagRt);
        MockObjectManager.addReturnValue(TwMixtagServiceImpl.class, "searchByCondition", twMixtagRtList);
        
        // Mock設定 MIXED用RT材の登録
        MockObjectManager.addReturnNull(TtMixtagRtServiceImpl.class, "create");
        
        // Mock設定 MIXED用RT材ワークのカウント
        MockObjectManager.addReturnValue(TwMixtagRtServiceImpl.class, "searchCount", new Integer(1));
        
        // Mock設定 MIXED用RT材ワークの削除
        MockObjectManager.addReturnNull(TwMixtagRtServiceImpl.class, "deleteByCondition");
        
        // Mock設定 仮在庫のロック
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "create");
        MockObjectManager.addReturnNull(TtTmpStockServiceImpl.class, "update");
        */
        
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // Mock設定 権限
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", setUserAuthList());
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2005MixTagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setComCreateFuncId("W2007");
        mixTagItem.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComCreateUserId("hirao09");
        mixTagItem.setComUpdateFuncId("W2007");
        mixTagItem.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTagItem.setComUpdateUserId("hirao09");
        mixTagItem.setContainerLooseTyp("C");
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("xxx");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setCustomTimingTyp("A");
        mixTagItem.setDngrItemFlg("N");
        mixTagItem.setExpLimitTyp("L001");
        mixTagItem.setHiddenPlntCd("");
        mixTagItem.setInstrQty(new BigDecimal(300));
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setItemWeight(new BigDecimal(50));
        mixTagItem.setLgcyShipTo("00");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setNetWeight(new BigDecimal(-1));
        mixTagItem.setOriginCntryCd("JP");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("");
        mixTagItem.setPltzInstrNo("MY40612001");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("LT");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("1");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("");
        mixTag.setCheckValidateWarning(false);
        mixTag.setComCreateFuncId("W2007");
        mixTag.setComCreateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComCreateUserId("hirao09");
        mixTag.setComUpdateFuncId("W2007");
        mixTag.setComUpdateTimestamp(new Timestamp(tsf.parse("2014/06/13 11:07:02").getTime()));
        mixTag.setComUpdateUserId("hirao09");
        mixTag.setContainerLooseTyp("C");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("A");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setDscNm("hirao09");
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("00");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setLoginUserDscId("JUNIT0009");
        mixTag.setMixTagNo("");
        mixTag.setMixTagStatus("");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("");
        mixTag.setPltzInstrNo("MY40612001");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegister(mixTag);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterCancelテスト(正常系(梱包指示の場合))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel1() throws Exception {
        // W2008画面 Cancel処理 正常系(梱包指示の場合)
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setBoxNo("1");
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setDngrItemFlg("");
        mixTagItem.setExpLimitTyp("");
        mixTagItem.setGrossWeight(new BigDecimal(5010));
        mixTagItem.setHiddenPlntCd("");
        mixTagItem.setInstrQty(new BigDecimal(300));
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setLgcyShipTo("0");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setMixTagNo("MMY4WH01406140002");
        mixTagItem.setMixTagStatus("10");
        mixTagItem.setNetWeight(new BigDecimal(0));
        mixTagItem.setOriginCntryCd("");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setPltzInstrNo("MY40612001");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("1");
        mixTag.setCheckValidateWarning(false);
        mixTag.setContainerLooseTyp("");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setGrossWeight(new BigDecimal(5010));
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("0");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setMixTagNo("MMY4WH01406140002");
        mixTag.setMixTagStatus("10");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("MY40612001");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegisterCancel(mixTag);
        
        // ロールバック
        rollback();
    }
    
    /**
     * transactOnRegisterCancelテスト(正常系(成行の場合))
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel2() throws Exception {
        // W2008画面 Cancel処理 正常系(梱包指示の場合)
        
        // Mock設定 コンテキストのユーザーID
        MockObjectManager.addReturnValue(DensoContext.class, "getDscId", "JUNIT");
        
        // Mock設定 commonService.searchCigmaNightFlg
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", "Y");
        
        // Mock設定 Ws2005Service呼出
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc");
        
        // 引数設定
        // MIXED品目番号ドメイン
        W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
        mixTagItem.setBoxNo("1");
        mixTagItem.setCheckValidateWarning(false);
        mixTagItem.setContainerSortingKey("ZA001001");
        mixTagItem.setCurrCd("");
        mixTagItem.setCustomerCd("30001205");
        mixTagItem.setDngrItemFlg("");
        mixTagItem.setExpLimitTyp("");
        mixTagItem.setGrossWeight(new BigDecimal(5010));
        mixTagItem.setHiddenPlntCd("");
        mixTagItem.setInvoiceKey("NMY");
        mixTagItem.setItemDescription("METER ASSY,INTAKE AIRFLOW");
        mixTagItem.setItemNo("A002TB0091B3N");
        mixTagItem.setLgcyShipTo("0");
        mixTagItem.setLgcyWhCd("1");
        mixTagItem.setLoadingCd("D");
        mixTagItem.setMixTagNo("MMY4WH01406140003");
        mixTagItem.setMixTagStatus("10");
        mixTagItem.setNetWeight(new BigDecimal(5000));
        mixTagItem.setOriginCntryCd("");
        mixTagItem.setPkgCd("110");
        mixTagItem.setPlntCd("M1");
        mixTagItem.setQty(new BigDecimal(100));
        mixTagItem.setQtyUnit("");
        mixTagItem.setRowNumFrom(0);
        mixTagItem.setRowNumTo(0);
        mixTagItem.setSearchCountCheckFlg(true);
        mixTagItem.setShipperCd("MY4");
        mixTagItem.setShippingLot(new BigDecimal(30));
        mixTagItem.setTagQty(new BigDecimal(10));
        mixTagItem.setTrnsCd("S");
        mixTagItem.setWarningFlg("");
        mixTagItem.setWeightUnit("KG");
        mixTagItem.setWhCd("WH01");
        mixTagItem.setWhCompCd("MY4");
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();
        mixTagItemList.add(mixTagItem);
        
        // MIXED現品票ドメイン
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setBoxNo("1");
        mixTag.setCheckValidateWarning(false);
        mixTag.setContainerLooseTyp("");
        mixTag.setContainerSortingKey("ZA001001");
        mixTag.setCustomerCd("30001205");
        mixTag.setCustomTimingTyp("");
        mixTag.setDateFormat("dd/MM/yy");
        mixTag.setGrossWeight(new BigDecimal(5010));
        mixTag.setIgnoreWarnings(0);
        mixTag.setInvoiceKey("NMY");
        mixTag.setLgcyShipTo("0");
        mixTag.setLgcyWhCd("1");
        mixTag.setLoadingCd("D");
        mixTag.setMixTagNo("MMY4WH01406140003");
        mixTag.setMixTagStatus("10");
        mixTag.setNetWeight(new BigDecimal(5000));
        mixTag.setPkgIp("Y");
        mixTag.setPlntCd("M1");
        mixTag.setPltzInstrNo("");
        mixTag.setRowNumFrom(0);
        mixTag.setRowNumTo(0);
        mixTag.setScreenId("W2008");
        mixTag.setSearchCountCheckFlg(true);
        mixTag.setServerId("MYS");
        mixTag.setShipperCd("MY4");
        mixTag.setTrnsCd("S");
        mixTag.setWeightUnit("KG");
        mixTag.setWhCd("WH01");
        mixTag.setWhCompCd("MY4");
        mixTag.setMixTagItemDomainList(mixTagItemList);
        
        // 実行
        w2005MixTagService.transactOnRegisterCancel(mixTag);
        
        // ロールバック
        rollback();
    }
    /**
     * printOnRegisterPrintTagテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintOnRegisterPrintTag() throws Exception {
        // W2008画面 Print処理
        
        // Mock設定 日付変換エラーを発生させる
        File expectedFile = new File("W2005MixTagServiceTest_testprintOnRegisterPrintTag.csv");
        MockObjectManager.addReturnValue(L2002ReportServiceImpl.class, "searchMixTag", expectedFile);
        
        // 引数設定
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        mixTag.setMixTagNo("mixTagNo");
        
        // 実行
        File actualAFile = w2005MixTagService.printOnRegisterPrintTag(mixTag, "dd/MM/yy");
        
        // 結果判定
        assertThat(actualAFile.getPath(), is(expectedFile.getPath()));
    }
    
//////////////////////////////W2014XtagService.protected メソッド ////////////////////////////////////////
    /**
     * <br />UserAuthDomainのリストを設定
     * 
     * @return UserAuthDomainのリスト
     */
    protected List<UserAuthDomain> setUserAuthList(){
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        
        UserAuthDomain userAuth = new UserAuthDomain();
        userAuth.setAuthMgtComp("MY4");
        userAuth.setProcMfgDivCd("M1");
        userAuth.setAuthority("2");
        userAuthList.add(userAuth);
        
        userAuth = new UserAuthDomain();
        userAuth.setAuthMgtComp("MY4");
        userAuth.setProcMfgDivCd("M2");
        userAuth.setAuthority("2");
        userAuthList.add(userAuth);
        
        userAuth = new UserAuthDomain();
        userAuth.setAuthMgtComp("MA4");
        userAuth.setProcMfgDivCd("M3");
        userAuth.setAuthority("2");
        userAuthList.add(userAuth);
        
        userAuth = new UserAuthDomain();
        userAuth.setAuthMgtComp("MA4");
        userAuth.setProcMfgDivCd("M4");
        userAuth.setAuthority("2");
        userAuthList.add(userAuth);
        
        return userAuthList;
    }
    
    /**
     * <br />指定された値を含む{@link W2005MixTagCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @return 作成した{@link W2005MixTagCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    protected W2005MixTagCriteriaDomain toMixTagCriteria(String[] fixture) throws Exception {
        W2005MixTagCriteriaDomain criteria = new W2005MixTagCriteriaDomain();
        
        // GSCM部品(SearchCountLimitAdvice)で必要
        criteria.setLocale(new Locale("en"));
        
        criteria.setServerId(fixture[2]);
        criteria.setShipperCd(fixture[3]);
        criteria.setCustomerCd(fixture[4]);
        criteria.setLgcyShipTo(fixture[5]);
        criteria.setTrnsCd(fixture[6]);
        criteria.setPlntCd(fixture[7]);
        criteria.setLgcyWhCd(fixture[8]);
        criteria.setMixTagStatus(fixture[9]);
        criteria.setMixTagNo(fixture[10]);
        criteria.setMixTagIssueDtFrom(toDate(fixture[11]));
        criteria.setMixTagIssueDtTo(toDate(fixture[12]));
        criteria.setMixTagIssuerId(fixture[13]);
        criteria.setItemNo(fixture[14]);
        criteria.setPkgCd(fixture[15]);
        criteria.setLoginUserDscId(fixture[16]);
        
        return criteria;
    }
    
    /**
     * <br />指定された値と権限を含む{@link W2005MixTagCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @param userAuthList ユーザ権限
     * @return 作成した{@link W2005MixTagCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    protected W2005MixTagCriteriaDomain toMixTagCriteria(String[] fixture, String[][] userAuthList) throws Exception {
        W2005MixTagCriteriaDomain criteria = toMixTagCriteria(fixture);
        criteria.setUserAuthList(toUserAuthList(userAuthList));
        
        return criteria;
    }
    
    /**
     * <br />文字列→日付変換を行います。
     *
     * @param value 日付文字列
     * @return 変換結果
     * @throws Exception 日付変換時にエラーが発生した場合
     */
    protected Date toDate(String value) throws Exception {
        if (value == null) {
            return null;
        } else {
            return df.parse(value);
        }
    }
    
    /**
     * <br />指定された値を含むユーザ権限のリストを作成します。
     *
     * @param userAuthLDataList ユーザ権限情報
     * @return 作成した{@link UserAuthDomain}
     */
    protected List<UserAuthDomain> toUserAuthList(String[][] userAuthLDataList) {
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();

        for (String[] userAuthData : userAuthLDataList) {
            UserAuthDomain userAuth = new UserAuthDomain();
            userAuth.setDscId("-");
            userAuth.setRole(userAuthData[0]);
            userAuth.setAuthMgtComp(userAuthData[1]);
            userAuth.setProcMfgDivCd(userAuthData[2]);
            userAuth.setPermitFuncId(userAuthData[3]);
            userAuth.setAuthority(userAuthData[4]);
            
            userAuthList.add(userAuth);
        }
        return userAuthList;
    }
    
    /**
     * <br />MIXED品目番号ワークの件数を取得します。
     *
     * @param dscId DSC-ID
     * @return MIXED品目番号ワークの件数
     * @throws Exception MIXED品目番号ワークの件数が取得できない場合
     */
    protected int countTwMixtag(String dscId) throws Exception {
        TwMixtagCriteriaDomain criteria = new TwMixtagCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        return twMixtagService.searchCount(criteria);
    }
    
    /**
     * <br />MIXED用RT材ワークの件数を取得します。
     *
     * @param dscId DSC-ID
     * @return MIXED用RT材ワークの件数
     * @throws Exception MIXED用RT材ワークの件数が取得できない場合
     */
    protected int countTwMixtagRt(String dscId) throws Exception {
        TwMixtagRtCriteriaDomain criteria = new TwMixtagRtCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        return twMixtagRtService.searchCount(criteria);
    }
}