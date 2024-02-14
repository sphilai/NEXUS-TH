/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrServiceImpl;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.eca0027.core.integration.W2014XtagDaoImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;


/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W2014XTagServiceTest extends AbstractEca0027Test {

    /**
     * W2014XTagService サービス
     */
    private W2014XtagService w2014XtagService;
    
    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
        
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W2014XTagServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        w2014XtagService = (W2014XtagService) getContext().getBean("w2014XtagService");
    }
    
//////////////////////////// W2014XtagService.validateConsistencyXXX メソッドの確認 ////////////////////////////////////////
    
    /**
     * <br />validateConsistencyCcTypeのテスト
     *
     */
    @Test
    public void testValidateConsistencyCcType() {
        boolean result = false;
        
        List<String> errCds = new ArrayList<String>();
        
        // リストデータ：0件のみ
        List<? extends W2014PltzDomain> pltzList;
        List<W2014PltzDomain> w2014PltzList = new ArrayList<W2014PltzDomain>();
        pltzList = w2014PltzList;
        result = w2014XtagService.validateConsistencyCcType(pltzList, errCds);
        assertThat(result, is(true));
        
        // リストデータ：1件の場合
        errCds.clear();
        pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain w2014Pltz = new W2014PltzDomain();
        w2014Pltz.setCustomTimingTyp("R");
        w2014PltzList.add(w2014Pltz);
        pltzList = w2014PltzList;
        result = w2014XtagService.validateConsistencyCcType(pltzList, errCds);
        assertThat(result, is(true));
        
        // エラー：リストデータ：2件 (タイプが異なる)
        errCds.clear();
        w2014PltzList.clear();
        w2014Pltz = new W2014PltzDomain();
        w2014Pltz.setCustomTimingTyp("R");
        w2014PltzList.add(w2014Pltz);
        
        W2014PltzDomain w2014Pltz2 = new W2014PltzDomain();
        w2014Pltz2.setCustomTimingTyp("S");
        w2014PltzList.add(w2014Pltz2);
        pltzList = w2014PltzList;
        
        result = w2014XtagService.validateConsistencyCcType(pltzList, errCds);
        assertThat(result, is(false));

        // 正常：リストデータ：2件 (タイプは同一)
        errCds.clear();
        w2014PltzList.clear();
        w2014PltzList.add(w2014Pltz);
        
        w2014Pltz2 = new W2014PltzDomain();
        w2014Pltz2.setCustomTimingTyp("R");
        w2014PltzList.add(w2014Pltz2);
        pltzList = w2014PltzList;
        
        result = w2014XtagService.validateConsistencyCcType(pltzList, errCds);
        assertThat(result, is(true));
    
    }
    
    /**
     * <br />validateConsistencyCmlCountのテスト
     */
    @Test
    public void testValidateConsistencyCmlCount() {
        boolean result = false;
        
        // エラー：リストデータ：0件
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        result = w2014XtagService.validateConsistencyCmlCount(pltzList);
        assertThat(result, is(false));
       
        // エラー：リストデータ：1件
        pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain w2014Pltz = new W2014PltzDomain();
        w2014Pltz.setCustomTimingTyp("R");
        pltzList.add(w2014Pltz);
        result = w2014XtagService.validateConsistencyCmlCount(pltzList);
        assertThat(result, is(false));

        // 正常：リストデータ：2件
        W2014PltzDomain w2014Pltz2 = new W2014PltzDomain();
        w2014Pltz2.setCustomTimingTyp("R");
        pltzList.add(w2014Pltz2);
        result = w2014XtagService.validateConsistencyCmlCount(pltzList);
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyFromToDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyFromToDate() {
        boolean result = false;
        
        // 開始日 == null、終了日 == null
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, null, null);
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, null, "06/03/14");
        assertThat(result, is(true));
        
        // 開始日 != null、終了日 == null
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, "06/03/14", null);
        assertThat(result, is(true));
        
        // 開始日 < 終了日
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, "06/03/14", "13/03/14");
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, "06/03/14", "06/03/14");
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = w2014XtagService.validateConsistencyFromToDate(dateFormat, "13/03/14", "06/03/14");
        assertThat(result, is(false));
    }
    
//////////////////////////////W2014XtagService.validateDatabaseXXX メソッドの確認 ////////////////////////////////////////
    /**
     * validateDatabaseCompCdテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd() throws Exception {

        boolean result1 = w2014XtagService.validateDatabaseCompCd("SHIP0001");
        boolean result2 = w2014XtagService.validateDatabaseCompCd("C0001");
        boolean result3 = w2014XtagService.validateDatabaseCompCd("X");
        boolean result4 = w2014XtagService.validateDatabaseCompCd("");
        boolean result5 = w2014XtagService.validateDatabaseCompCd(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
    }
    
    /**
     * validateDatabaseCompWhテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCompWh() throws Exception {
        
        boolean result1 = w2014XtagService.validateDatabaseCompWh("TG0", "A101");
        boolean result2 = w2014XtagService.validateDatabaseCompWh("X", "A101");
        boolean result3 = w2014XtagService.validateDatabaseCompWh("TG0", "X");
        boolean result4 = w2014XtagService.validateDatabaseCompWh("", "A101");
        boolean result5 = w2014XtagService.validateDatabaseCompWh("TG0", "");
        boolean result6 = w2014XtagService.validateDatabaseCompWh(null, "A101");
        boolean result7 = w2014XtagService.validateDatabaseCompWh("TG0", null);
        boolean result8 = w2014XtagService.validateDatabaseCompWh("", "");
        boolean result9 = w2014XtagService.validateDatabaseCompWh(null, null);
        
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
     * validateDatabaseTtPltzOnRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnRegister() throws Exception {
        
        // 引数
        List<String> mainMarkList = new ArrayList<String>();
        
        // エラー：パレタイズ存在なし
        mainMarkList.add("DUMMY");
        
        List<String> errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
                           mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList.get(0), is(GSCM_E0_0010));
        
        // エラー：対象のCMLが山づくりされていないかをチェック (ステータス:10以外)
        mainMarkList.clear();
        mainMarkList.add("JUNIT00001");
        
        errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
            mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList.get(0), is(NXS_E1_0062));

        // エラー:対象のCMLが送荷書が発行されている、または、搬出中のものがないかをチェック
        mainMarkList.clear();
        mainMarkList.add("JUNIT00002");

        errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
            mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList.get(0), is(NXS_E1_0063));
        
        // エラー:対象のCMLが既にまとめCMLになっていないかをチェック
        mainMarkList.clear();
        mainMarkList.add("JUNIT00003");
        
        errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
            mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList.get(0), is(GSCM_E0_0010));
        
        // エラー:対象のCMLが輸送手段の付け替えを行っていないかをチェック
        mainMarkList.clear();
        mainMarkList.add("JUNIT00004");
        
        errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
            mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList.get(0), is(GSCM_E0_0010));
        
        // 正常
        mainMarkList.clear();
        mainMarkList.add("JUNIT00005");
        errorList = w2014XtagService.validateDatabaseTtPltzOnRegister(
            mainMarkList, "S", new ArrayList<String>(), new ArrayList<String>());
        assertThat(errorList, is(nullValue()));
        
        rollback();
        
    }
    
    /**
     * validateDatabaseTtPltzOnRegisterCancelテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnRegisterCancel() throws Exception {
        
        List<String> mainMarkList = new ArrayList<String>();
        List<String> mainMarkErrList = new ArrayList<String>();
        
        // エラー：レコードが存在しない場合
        mainMarkList.add("DUMMY");
        String error = w2014XtagService.validateDatabaseTtPltzOnRegisterCancel(mainMarkList, mainMarkErrList);
        assertThat(error, is(GSCM_E0_0010));
        
        // エラー：対象のCMLが山づくりされていないかをチェック (ステータス:10以外) 
        mainMarkList.clear();
        mainMarkList.add("JUNIT00006");
        error = w2014XtagService.validateDatabaseTtPltzOnRegisterCancel(mainMarkList, mainMarkErrList);
        assertThat(error, is(NXS_E1_0062));
        
        // 正常
        mainMarkList.clear();
        mainMarkList.add("JUNIT00007");
        error = w2014XtagService.validateDatabaseTtPltzOnRegisterCancel(mainMarkList, mainMarkErrList);
        assertThat(error, is(nullValue()));
        
        rollback();
    }

    /**
     * validateDatabaseTtXpltzOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtXpltzOnRegisterCancel() throws Exception {
        
        // エラー：レコードが存在しない場合
        boolean result = w2014XtagService.validateDatabaseTtXpltzOnRegisterCancel("DUMMY");
        assertThat(result, is(false));
        
        // 正常：レコードが存在する場合
        result = w2014XtagService.validateDatabaseTtXpltzOnRegisterCancel("XTG0A101405210001");
        assertThat(result, is(true));
  
        rollback();
    }

    
    /**
     * validateDatabaseTwXpltzOnCreateMoveToRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwXpltzOnCreateMoveToRegister() throws Exception {
        boolean result = false;
        
        // エラー：レコードが存在しない場合
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateMoveToRegister("DUMMY");
        assertThat(result, is(false));
        
        // エラー：レコードが存在する場合
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateMoveToRegister("JUNIT");
        assertThat(result, is(true));
        
        rollback();
    }

    /**
     * validateDatabaseTwXpltzOnCreateUpdateByCmlテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwXpltzOnCreateUpdateByCml() throws Exception {
        boolean result = false;
        
        // 正常：レコードが存在しない場合
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCml("DUMMY", "A");
        assertThat(result, is(true));
        
        // エラー：同一まとめCML条件チェック
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCml("JUNIT", "2");
        assertThat(result, is(false));
        
        // 正常：レコード存在チェック、同一まとめCML条件チェック
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCml("JUNIT", "1");
        assertThat(result, is(true));

        rollback();
    }

    /**
     * validateDatabaseTwXpltzOnCreateUpdateByCountテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwXpltzOnCreateUpdateByCount() throws Exception {
        boolean result = false;
        
        // エラー：　COUNT(DSC_ID) = 0, 新規登録レコードが100
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCount("DUMMY", 100);
        assertThat(result, is(false));
        
        // エラー：　COUNT(DSC_ID) = 50, 新規登録レコード：50
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCount("JUNIT", 50);
        assertThat(result, is(false));
        
        // 正常: 　COUNT(DSC_ID) = 50, 新規登録レコード：49
        result = w2014XtagService.validateDatabaseTwXpltzOnCreateUpdateByCount("JUNIT", 49);
        assertThat(result, is(true));
        
        rollback();
    }
    
    
////////////////////////////W2014XtagService.createXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />createOnCreateUpdateのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testCreateOnCreateUpdate() throws Exception {
        //W2016画面 Update処理
        
        // データ設定
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setLoginUserDscId("id");
        pltz.setMainMark("mainMark");
        pltz.setCustomTimingTyp("A");
        pltz.setDngrItemFlg("N");
        pltz.setDisabledFlg("N");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        pltzList.add(pltz);
        
        // 実行
        w2014XtagService.createOnCreateUpdate(pltzList);
        
        rollback();
    }

////////////////////////////////W2014XtagService.searchXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />searcCountOnCreateSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearcCountOnCreateSearch() throws Exception {
        // W2016画面 Search処理
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setCurWhCompCd("TG0");
        criteria.setCurWhCd("A101");
        criteria.setTrnsCd("S");
        criteria.setContainerSortingKey("11111111");
        criteria.setLoadingCd("F");
        criteria.setShipToCompCd("MY4");
        criteria.setShipperCd(null);
        criteria.setMainMark(null);
        criteria.setLoginUserDscId("hirao09");
        criteria.setServerId("MYS");
        criteria.setLocale(new Locale("en"));
        
        // 実行
        int actual = w2014XtagService.searcCountOnCreateSearch(criteria);
        
        // 結果判定
        assertThat(actual, is(2));
        
        rollback();
    }

    /**
     * <br />searchCountOnMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchCountOnMainSearch() throws Exception {
        // W2014画面 Search処理
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setCurWhCompCd("TG0");
        criteria.setCurWhCd("A101");
        criteria.setTrnsCd("S");
        criteria.setContainerSortingKey("11111111");
        criteria.setLoadingCd("F");
        criteria.setShipToCompCd("MY4");
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setShipperCd(null);
        criteria.setMainMark(null);
        criteria.setIssueFromDate(null);
        criteria.setIssueToDate(null);
        criteria.setLoginUserDscId("hirao09");
        criteria.setServerId("MYS");
        criteria.setLocale(new Locale("en"));
        
        // 実行
        int actual = w2014XtagService.searchCountOnMainSearch(criteria);
        
        // 結果判定
        assertThat(actual, is(1));
        
        rollback();
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchNormal() throws Exception {
        // メッセージ
        String[] fixture = {"W2016画面 Search処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearch_W2016SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // Mock設定 重量単位変換
        BigDecimal weight = new BigDecimal(1);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", weight);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", weight);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", weight);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", weight);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", weight);
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setCurWhCompCd("TG0");
        criteria.setCurWhCd("A101");
        criteria.setTrnsCd("S");
        criteria.setContainerSortingKey("11111111");
        criteria.setLoadingCd("F");
        criteria.setShipToCompCd("MY4");
        criteria.setShipperCd(null);
        criteria.setMainMark(null);
        criteria.setLoginUserDscId("hirao09");
        criteria.setServerId("MYS");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(50);
        //criteria.setWeightUnit("GR");
        criteria.setWeightUnitDisplay("KG");
        
        // 実行
        List<?> actualList = w2014XtagService.searchForPagingOnCreateSearch(criteria);
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
        rollback();
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト(異常(重量単位変換で桁あふれ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearchError() throws Exception {
        // 重量単位変換で桁あふれ
        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setCurWhCompCd("TG0");
        criteria.setCurWhCd("A101");
        criteria.setTrnsCd("S");
        criteria.setContainerSortingKey("11111111");
        criteria.setLoadingCd("F");
        criteria.setShipToCompCd("MY4");
        criteria.setShipperCd(null);
        criteria.setMainMark(null);
        criteria.setLoginUserDscId("hirao09");
        criteria.setServerId("MYS");
        criteria.setUserAuthList(setUserAuthList());
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(50);
        //criteria.setWeightUnit("KG");
        criteria.setWeightUnitDisplay("KG");
        
        // 実行
        try {
            w2014XtagService.searchForPagingOnCreateSearch(criteria);
            fail("例外が投げられない");
        } catch (ApplicationException e){
            // 結果判定
            assertThat(e.getCode(), is(NXS_E7_0157));
        }
    }

    /**
     * <br />searchForPagingOnMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch() throws Exception {
        // W2014画面 Search処理
        
        // メッセージ
        String[] fixture = {"W2014画面 Search処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch_W2014SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setCurWhCompCd("TG0");
        criteria.setCurWhCd("A101");
        criteria.setTrnsCd(null);
        criteria.setContainerSortingKey(null);
        criteria.setLoadingCd(null);
        criteria.setShipToCompCd(null);
        criteria.setXmainMark(null);
        criteria.setShipperCd(null);
        criteria.setMainMark(null);
        criteria.setIssueFromDate(null);
        criteria.setIssueToDate(null);
        criteria.setLoginUserDscId("hirao09");
        criteria.setServerId("MYS");
        criteria.setUserAuthList(userAuthList);
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(50);
        
        // 実行
        List<?> actualList = w2014XtagService.searchForPagingOnMainSearch(criteria);
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
        rollback();
    }

    /**
     * <br />searchOnRegisterInitByFromCreateのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreateNormal() throws Exception {
        // メッセージ
        String[] fixture = {"W2017画面 Init処理(W2016画面より遷移)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromCreate_W2017InitFromCreateExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(1));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(1));
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setLoginUserDscId("hirao09");
        
        // 実行
        W2014XtagDomain actual = w2014XtagService.searchOnRegisterInitByFromCreate(criteria);
        
        // 結果判定
        // Shipper数
        assertThat(actual.getTotalShipper(), is(new BigDecimal(2)));
        
        // ShipperCd
        String[] shipperCd = new String[2];
        shipperCd = actual.getShipperCdList().split(",");
        
        assertThat(shipperCd[0], is("MY4"));
        assertThat(shipperCd[1], is("MA4"));
        
        // 通関タイミング
        assertThat(actual.getCustomTimingTyp(), is("1"));
        
        // 明細行
        List<?> actualList = actual.getPltzDomainList();
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
        rollback();
    }
    
    /**
     * <br />searchOnRegisterInitByFromCreateのテスト(異常系(データ取得不可))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreateError() throws Exception {
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setLoginUserDscId("junit");
        
        // 実行
        W2014XtagDomain actual = w2014XtagService.searchOnRegisterInitByFromCreate(criteria);
        
        // 結果判定
        // Shipper数
        assertThat(actual, is(nullValue()));
    }

    /**
     * <br />searchOnRegisterInitByFromCreateのテスト(異常系(桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreateError2() throws Exception {        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setLoginUserDscId("hirao09");
        try {
            // 実行
            w2014XtagService.searchOnRegisterInitByFromCreate(criteria);
            
            rollback();
            fail("例外が発生しない");
            
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />searchOnRegisterInitByFromMainのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMainNormal() throws Exception {
        // W2017画面 Init処理(W2014画面より遷移)
        
        // メッセージ
        String[] fixture = {"W2017画面 Init処理(W2014画面より遷移)"};
        
        // 期待結果
        Map<String, String> expectedDomain = readCsvFile("testSearchOnRegisterInitByFromMain_W2017InitFromMainExpectedDomain.csv").get(0);
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromMain_W2017InitFromMainExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // Mock設定 容量単位変換
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        
        // Mock設定 重量単位変換
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        //MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setVolumeUnit("LT");
        criteria.setWeightUnit("KG");
        criteria.setVolumeUnitDisplay("LT");
        criteria.setWeightUnitDisplay("KG");
        criteria.setServerId("MYS");
        
        // 実行
        W2014XtagDomain actual = w2014XtagService.searchOnRegisterInitByFromMain(criteria);
        
        // 結果判定
        // 検索条件エリア
        assertDomain(fixture[0], actual, expectedDomain, ignoreCols);
        
        // 明細エリア
        List<?> actualList = actual.getPltzDomainList();
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
        
        rollback();
    }

    /**
     * <br />searchOnRegisterInitByFromMainのテスト(異常系(Volumeの桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMainError1() throws Exception {
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertVolumeUnit");
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setVolumeUnit("LT");
        criteria.setWeightUnit("KG");
        criteria.setVolumeUnitDisplay("LT");
        criteria.setWeightUnitDisplay("KG");
        criteria.setServerId("MYS");
        try {
            // 実行
            w2014XtagService.searchOnRegisterInitByFromMain(criteria);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />searchOnRegisterInitByFromMainのテスト(異常系(GrossWeight(1回目の呼出し)の桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMainError2() throws Exception {
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");

        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setVolumeUnit("LT");
        criteria.setWeightUnit("KG");
        criteria.setVolumeUnitDisplay("LT");
        criteria.setWeightUnitDisplay("KG");
        criteria.setServerId("MYS");
        try {
            // 実行
            w2014XtagService.searchOnRegisterInitByFromMain(criteria);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />searchOnRegisterInitByFromMainのテスト(異常系(GrossWeight(2回目の呼出し)の桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMainError3() throws Exception {
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", true);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        
        // Mock設定 ユーザー権限の設定
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.785));
        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");

        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setVolumeUnit("LT");
        criteria.setWeightUnit("KG");
        criteria.setVolumeUnitDisplay("LT");
        criteria.setWeightUnitDisplay("KG");
        criteria.setServerId("MYS");
        try {
            // 実行
            w2014XtagService.searchOnRegisterInitByFromMain(criteria);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }
    
//////////////////////////////W2014XtagService.deleteXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />deleteOnHeaderInitのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeleteOnHeaderInitNormal() throws Exception {
        // W2015画面 Init処理
        
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setLoginUserDscId("hirao09");
        
        // 実行
        w2014XtagService.deleteOnHeaderInit(criteria);
        
        rollback();
    }

    /**
     * <br />deleteOnHeaderInitのテスト(異常系(データ0件))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeleteOnHeaderInitError() throws Exception {
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setLoginUserDscId("dummy");
        
        // 実行
        w2014XtagService.deleteOnHeaderInit(criteria);
    }
    
    /**
     * <br />deleteOnRegisterDeleteのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeleteOnRegisterDelete() throws Exception {
        // W2017画面 Delete処理
        
        // Mock設定 重量単位変換
        W2014XtagDomain mockXtag = new W2014XtagDomain();
        MockObjectManager.addReturnValue(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromCreate", mockXtag);
        
        // 引数
        W2014XtagDomain xtag = new W2014XtagDomain();
        
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setLoginUserDscId("hirao09");
        pltz.setMainMark("DMY4000140101000010");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        w2014XtagService.deleteOnRegisterDelete(xtag);
        
        rollback();
    }

    /**
     * <br />deletePltzListのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeletePltzList() throws Exception {
        // 引数
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setLoginUserDscId("hirao09");
        pltz.setMainMark("DMY4000140101000001");
        pltzList.add(pltz);
        
        pltz = new W2014PltzDomain();
        pltz.setLoginUserDscId("hirao09");
        pltz.setMainMark("DMY4000140101000010");
        pltzList.add(pltz);
        
        // 実行
        int cnt = w2014XtagService.deletePltzList(pltzList);
        rollback();
        assertEquals(2, cnt);
    }

////////////////////////////////////W2014XtagService.transactXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />transactOnRegisterのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterNormal() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設/*定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        /* 設定が効かない
        BigDecimal three = new BigDecimal(3);
        BigDecimal one = new BigDecimal(3);
        
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 1, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 2, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 3, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 4, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 5, one);
        */
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        w2014XtagService.transactOnRegister(xtag);
        
        rollback();
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(Outer CDの容積 取得不可))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorOuterCd() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        //TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        //MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設/*定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        /* 設定が効かない
        BigDecimal three = new BigDecimal(3);
        BigDecimal one = new BigDecimal(3);
        
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 1, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 2, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 3, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 4, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 5, one);
        */
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // Mock設定 DAO
        // テスト用にG/Wがnullで戻ってきた想定
        MockObjectManager.addReturnNull(TmPkgSetHdrServiceImpl.class, "searchByKey");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        W2014XtagDomain actual = w2014XtagService.transactOnRegister(xtag);
        
        // チェック
        assertThat(actual.getErrCdList().get(0), is("NXS-E1-0066"));
        
        //getTxManager().rollback(getTx());
    }
    
    /**
     * <br />transactOnRegisterのテスト(異常系(G/W、N/Wの合計値算出不可))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorGrossWeight() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設/*定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        /* 設定が効かない
        BigDecimal three = new BigDecimal(3);
        BigDecimal one = new BigDecimal(3);
        
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 1, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 2, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 3, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 4, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 5, one);
        */
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // Mock設定 DAO
        // テスト用にG/Wがnullで戻ってきた想定
        List<W2014PltzDomain> pltzWeightList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltzWeight = new W2014PltzDomain();
        pltzWeight.setWeightUnit("KG");
        pltzWeight.setGrossWeight(null);
        pltzWeight.setNetWeight(new BigDecimal(1));
        pltzWeightList.add(pltzWeight);
        MockObjectManager.addReturnValue(W2014XtagDaoImpl.class, "searchTtPltzByWeight", pltzWeightList);
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        try {
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
            
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }
    
    /**
     * <br />transactOnRegisterのテスト(異常系(外装の合計値算出不可))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorOuterPkgWeight() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設/*定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        /* 設定が効かない
        BigDecimal three = new BigDecimal(3);
        BigDecimal one = new BigDecimal(3);
        
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 1, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 2, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 3, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 4, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 5, one);
        */
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // Mock設定 DAO
        // テスト用にG/Wがnullで戻ってきた想定
        MockObjectManager.addReturnNull(W2014XtagDaoImpl.class, "searchTmPkgSetDtl");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        W2014XtagDomain actual = w2014XtagService.transactOnRegister(xtag);
        assertThat(actual.getErrCdList().get(0), is("NXS-E1-0066"));
    }
    
    /**
     * <br />transactOnRegisterのテスト(異常系(外装の合計値算出不可))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorOuterPkgWeight2() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設/*定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        /* 設定が効かない
        BigDecimal three = new BigDecimal(3);
        BigDecimal one = new BigDecimal(3);
        
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 1, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 2, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 3, three);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 4, one);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "convertWeightUnit", 5, one);
        */
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // Mock設定 DAO
        // テスト用にG/Wがnullで戻ってきた想定
        List<W2014PltzDomain> pltzWeightList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltzWeight = new W2014PltzDomain();
        pltzWeight.setWeightUnit("KG");
        pltzWeight.setGrossWeight(null);
        pltzWeightList.add(pltzWeight);
        MockObjectManager.addReturnValue(W2014XtagDaoImpl.class, "searchTmPkgSetDtl", pltzWeightList);
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        try {
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
            
        } catch (SystemException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }
    
    /**
     * <br />transactOnRegisterのテスト(異常系(Volume桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorVolume() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertVolumeUnit");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        try {
            // 実行
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(getWeight中で桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorGetWeight1() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal("3.21"));
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        try {
            // 実行
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(getWeight中で桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorGetWeight2() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal("3.21"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("1.23"));
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        try {
            // 実行
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(getWeight中で桁溢れ))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorGetWeight3() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal("3.21"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("1.23"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("2.34"));
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        try {
            // 実行
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(getWeight中で桁溢れ(計算結果が桁溢れ)))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorGetWeight4() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal("3.21"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("8923456.23"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("1234567.34"));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal("1988989.34"));
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        try {
            // 実行
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />transactOnRegisterのテスト(異常系(日付変換エラー))
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterErrorParseDate() throws Exception {
        // W2017画面 Register処理
        
        // 当日日付
        //Date d = DateUtil.parseDate("05/06/14", dateFormat);
        //MockObjectManager.addReturnValue(DateUtil.class, "convertTime", d);
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // Mock設定 まとめパレタイズNo.の取得
        List<String> seqList = new ArrayList<String>();
        String seq = "0001";
        seqList.add(seq);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", seqList);
        
        // Mock設定 Outer CDの容積を取得
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);
        
        // Mock設定 容量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertVolumeUnit", new BigDecimal(3.875));
        
        // Mock設定 重量単位変換
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "convertWeightUnit", new BigDecimal(3));
        
        // Mock設定 再検索
        MockObjectManager.addReturnNull(W2014XtagServiceImpl.class, "searchOnRegisterInitByFromMain");
        
        // Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        // Mock設定
        // 日付変換エラーを発生させる
        // 以下の設定が効かない
        //MockObjectManager.addReturnValue(SimpleDateFormat.class, "format", "99/99/99");
        //MockObjectManager.addReturnValue(DateFormat.class, "format", "99/99/99");
        MockObjectManager.addReturnValue(SimpleDateFormat.class, "parse", new ParseException("", 0));
        //MockObjectManager.addReturnValue(DateFormat.class, "parse", new ParseException("", 0));

        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setLoginUserDscId("hirao09");
        xtag.setCurWhCompCd("TG0");
        xtag.setCurWhCd("A101");
        xtag.setTrnsCd("S");
        xtag.setContainerSortingKey("11111111");
        xtag.setLoadingCd("F");
        xtag.setShipToCompCd("MY4");
        xtag.setOuterPkgComCd("MY4");
        xtag.setOuterPkgCd("1");
        xtag.setDscNm("hirao");
        xtag.setDateFormat(dateFormat);
        xtag.setTimeZone("JST");
        xtag.setTotalShipper(new BigDecimal(1));
        xtag.setCustomTimingTyp("A");
        xtag.setWeightUnit("KG");
        xtag.setVolumeUnit("LT");
        xtag.setTimeZone("MYT");
        xtag.setXtagPackingIssuerId("junit");
        xtag.setXtagPackingIssuerNm("junit");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        W2014PltzDomain pltz = new W2014PltzDomain();
        pltz.setMainMark("JUNIT00008");
        pltz.setDngrItemFlg("Y");
        pltzList.add(pltz);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        try {
            w2014XtagService.transactOnRegister(xtag);
            rollback();
            fail("例外が発生しない");
            
        } catch (ApplicationException e) {
            // 結果判定
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }

    /**
     * <br />transactOnRegisterCancelのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterCancel() throws Exception {
        // W2017画面 Cancel処理
        
        // Mock設定 タイムゾーン
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchTimezone", "MYT");
        
        // 引数設定
        W2014XtagDomain xtag = new W2014XtagDomain();
        xtag.setXmainMark("XTG0A101405210001");
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        W2014PltzDomain pltz1 = new W2014PltzDomain();
        pltz1.setMainMark("DMY4000140101000005");
        pltzList.add(pltz1);
        
        W2014PltzDomain pltz2 = new W2014PltzDomain();
        pltz2.setMainMark("DMY4000140101000006");
        pltzList.add(pltz2);
        
        xtag.setPltzDomainList(pltzList);
        
        // 実行
        w2014XtagService.transactOnRegisterCancel(xtag);
        
        rollback();
    }

//////////////////////////////W2014XtagService.printXXX メソッドの確認 ////////////////////////////////////////
    /**
     * <br />printOnRegisterPrintTagのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testPrintOnRegisterPrintTag() throws Exception {
        // W2017画面 Print処理
        
        //Mock設定 帳票L2004
        MockObjectManager.addReturnNull(L2004ReportServiceImpl.class, "searchXtag");
        
        // 引数設定
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        criteria.setXmainMark("XTG0A101405120001");
        criteria.setOwnerCompCd("MY4");
        criteria.setReportDateFormat(dateFormat);
        
        // 実行
        w2014XtagService.printOnRegisterPrintTag(criteria);
    }

//////////////////////////////W2014XtagService.protected メソッド ////////////////////////////////////////
    /**
     * <br />UserAuthDomainのリストを設定
     * 
     * @return UserAuthDomainのリスト
     */
    protected List<? extends UserAuthDomain> setUserAuthList(){
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
}