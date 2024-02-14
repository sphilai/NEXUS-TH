/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BATCH_DSC_ID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CML_NO_SUP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_PALLETIZE_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_REQUEST_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_SHIPPING_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_STG_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_MAX_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_DN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CML_NO_SUP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_MIX_TAG_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_PALLETIZE_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_REQUEST_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_SHIPPING_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_ACTUALITY_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_STG_INSTR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_PARAM_LIB;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.dao.DataIntegrityViolationException;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.timezonemanage.exception.TimezoneManageException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCurrencyDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmSeqService;
import com.globaldenso.eca0027.core.auto.integration.TmSeqDaoImpl;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfReader;

/**
 * <br />CommonServiceのテストクラス
 *
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class CommonServiceTest extends AbstractEca0027Test {

    /**
     * 例外ルール
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <br />commonService
     */
    private CommonService commonService;

    /**
     * <br />tmSeqService
     */
    private TmSeqService tmSeqService;

    /**
     * <br />デフォルトコンストラクタ
     */
    public CommonServiceTest() {
    }

    /**
     * <br />初期化処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        // validateAfterDate のテストのためデフォルトタイムゾーンを変更
        System.setProperty("user.timezone", "UTC");
    }

    /**
     * <br />終了処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * <br />各テスト実行前の処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        
        commonService = (CommonService) getContext().getBean("commonService");
        tmSeqService = (TmSeqService) getContext().getBean("tmSeqService");
    }

    /**
     * <br />各テスト実行後の処理
     *
     * @throws Exception エラーが発生した場合
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * <br />searchTimezonePullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchTimezonePullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1 = commonService.searchTimezonePullDownList(false);
        List<? extends SelectListItemDomain> list2 = commonService.searchTimezonePullDownList(true);
        
        assertEquals(75, list1.size());
        assertEquals(75 + 1, list2.size());
        
        assertEquals("0000000001", list1.get(0).getId());
        assertEquals("GMT", list1.get(0).getName());
        
        // 強制的に TimezoneManageException が発生するように設定
        MockObjectManager.setReturnValueAtAllTimes(
            TestTimezoneManageDaoImpl.class, "searchByCondition", new TimezoneManageException(""));
        
        try {
            commonService.searchTimezonePullDownList(false);
            fail("ApplicationException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof GscmApplicationException);
            assertEquals(true, e.getCause() instanceof TimezoneManageException);
        }
    }

    /**
     * <br />searchCurrencyPullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCurrencyPullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1 = commonService.searchCurrencyPullDownList(true, false);
        List<? extends SelectListItemDomain> list2 = commonService.searchCurrencyPullDownList(true, true);
        List<? extends SelectListItemDomain> list3 = commonService.searchCurrencyPullDownList(false, false);
        List<? extends SelectListItemDomain> list4 = commonService.searchCurrencyPullDownList(false, true);
        
        assertEquals(3, list1.size());
        assertEquals(3 + 1, list2.size());
        assertEquals(3, list3.size());
        assertEquals(3 + 1, list4.size());
        
        assertEquals("001", list1.get(0).getId());
        assertEquals("001:円", list1.get(0).getName());
        
        assertEquals("001", list3.get(0).getId());
        assertEquals("円", list3.get(0).getName());
    }

   /**
    * <br />searchInvTemplatePullDownListのテスト
    *
    * @throws Exception エラーが発生した場合
    */
    @Test
    public void testSearchInvTemplatePullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1
            = commonService.searchInvTemplatePullDownList("C0001", false);
        List<? extends SelectListItemDomain> list2
            = commonService.searchInvTemplatePullDownList("C0001", true);
        
        assertEquals(2, list1.size());
        assertEquals(2 + 1, list2.size());
        
        assertEquals("D01", list1.get(0).getId());
        assertEquals("D01", list1.get(0).getName());
    }

    /**
     * <br />searchExpRegulationTypePullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchExpRegulationTypePullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1
            = commonService.searchExpRegulationTypePullDownList("C0002", true, false);
        List<? extends SelectListItemDomain> list2
            = commonService.searchExpRegulationTypePullDownList("C0002", true, true);
        List<? extends SelectListItemDomain> list3
            = commonService.searchExpRegulationTypePullDownList("C0002", false, false);
        List<? extends SelectListItemDomain> list4
            = commonService.searchExpRegulationTypePullDownList("C0002", false, true);
        
        assertEquals(2, list1.size());
        assertEquals(2 + 1, list2.size());
        assertEquals(2, list3.size());
        assertEquals(2 + 1, list4.size());
        
        assertEquals("L003", list1.get(0).getId());
        assertEquals("L003:規制3", list1.get(0).getName());
        
        assertEquals("L003", list3.get(0).getId());
        assertEquals("規制3", list3.get(0).getName());
        
        List<? extends SelectListItemDomain> list5
            = commonService.searchExpRegulationTypePullDownList("", true, false);
        List<? extends SelectListItemDomain> list6
            = commonService.searchExpRegulationTypePullDownList("", true, true);
        
        assertEquals(6, list5.size());
        assertEquals(6 + 1, list6.size());
        
        assertEquals("L001", list5.get(0).getId());
        assertEquals("L001:規制1", list5.get(0).getName());
        
        List<? extends SelectListItemDomain> list7
            = commonService.searchExpRegulationTypePullDownList("C000X", true, false);
        List<? extends SelectListItemDomain> list8
            = commonService.searchExpRegulationTypePullDownList("C000X", true, true);
        
        assertEquals(0, list7.size());
        assertEquals(0, list8.size());
    }

    /**
     * <br />searchUnitOfVolumePullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchUnitOfVolumePullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1
            = commonService.searchUnitOfVolumePullDownList(true, false);
        List<? extends SelectListItemDomain> list2
            = commonService.searchUnitOfVolumePullDownList(true, true);
        List<? extends SelectListItemDomain> list3
            = commonService.searchUnitOfVolumePullDownList(false, false);
        List<? extends SelectListItemDomain> list4
            = commonService.searchUnitOfVolumePullDownList(false, true);
        
        assertEquals(11, list1.size());
        assertEquals(11 + 1, list2.size());
        assertEquals(11, list3.size());
        assertEquals(11 + 1, list4.size());
        
        assertEquals("01", list1.get(0).getId());
        assertEquals("01:g", list1.get(0).getName());
        
        assertEquals("01", list3.get(0).getId());
        assertEquals("g", list3.get(0).getName());
    }

    /**
     * <br />searchUnitOfWeightPullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchUnitOfWeightPullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1
            = commonService.searchUnitOfWeightPullDownList(true, false);
        List<? extends SelectListItemDomain> list2
            = commonService.searchUnitOfWeightPullDownList(true, true);
        List<? extends SelectListItemDomain> list3
            = commonService.searchUnitOfWeightPullDownList(false, false);
        List<? extends SelectListItemDomain> list4
            = commonService.searchUnitOfWeightPullDownList(false, true);
        
        assertEquals(11, list1.size());
        assertEquals(11 + 1, list2.size());
        assertEquals(11, list3.size());
        assertEquals(11 + 1, list4.size());
        
        assertEquals("01", list1.get(0).getId());
        assertEquals("01:g", list1.get(0).getName());
        
        assertEquals("01", list3.get(0).getId());
        assertEquals("g", list3.get(0).getName());
    }

    /**
     * <br />searchTransTypePullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchTransTypePullDownList() throws Exception {
        
        List<? extends SelectListItemDomain> list1 = commonService.searchTransTypePullDownList(false);
        List<? extends SelectListItemDomain> list2 = commonService.searchTransTypePullDownList(true);
        
        assertEquals(8, list1.size());
        assertEquals(8 + 1, list2.size());
        
        assertEquals("1", list1.get(0).getId());
        assertEquals("20FT", list1.get(0).getName());
    }

    /**
     * <br />searchPullDownListのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchPullDownList() throws Exception {
        
        try {
            commonService.searchPullDownList("XX", "XX", 0, false);
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
        
        List<? extends SelectListItemDomain> list1
            = commonService.searchPullDownList("64", "en", PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> list2
            = commonService.searchPullDownList("64", "en", PULLDOWN_DISP_TYPE_VALUE, true);
        List<? extends SelectListItemDomain> list3
            = commonService.searchPullDownList("64", "ja", PULLDOWN_DISP_TYPE_CODE_VALUE, false);
        List<? extends SelectListItemDomain> list4
            = commonService.searchPullDownList("64", "ja", PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> list5
            = commonService.searchPullDownList("64", "fr", PULLDOWN_DISP_TYPE_VALUE, false);
        List<? extends SelectListItemDomain> list6
            = commonService.searchPullDownList("64", "en", PULLDOWN_DISP_TYPE_CODE, false);
        List<? extends SelectListItemDomain> list7
            = commonService.searchPullDownList("64", "en", PULLDOWN_DISP_TYPE_CODE, true);
        
        assertEquals(17, list1.size());
        assertEquals(17 + 1, list2.size());
        assertEquals(17, list3.size());
        assertEquals(17 + 1, list4.size());
        assertEquals(17, list5.size());
        assertEquals(17, list6.size());
        assertEquals(17 + 1, list7.size());
        
        assertEquals("01", list1.get(0).getId());
        assertEquals("BHT UNLOCK", list1.get(0).getName());
        assertEquals("01", list3.get(0).getId());
        assertEquals("01:BHTロック解除", list3.get(0).getName());
        assertEquals("01", list5.get(0).getId());
        assertEquals("BHT UNLOCK", list5.get(0).getName());
        assertEquals("01", list6.get(0).getId());
        assertEquals("01", list6.get(0).getName());
    }

    /**
     * <br />setCommonPropertyForRegistのテスト
     */
    @Test
    public void testSetCommonPropertyForRegist() {
        
        String dscId = "DSCID-test";
        String funcId = "FUNCID-test";
        
        setDensoContext(dscId);
        
        TmSeqDomain tmSeqDomain = new TmSeqDomain();
        commonService.setCommonPropertyForRegist(tmSeqDomain, funcId);
        
        assertEquals(dscId, tmSeqDomain.getComCreateUserId());
        assertEquals(funcId, tmSeqDomain.getComCreateFuncId());
        assertEquals(null, tmSeqDomain.getComCreateTimestamp());
        assertEquals(dscId, tmSeqDomain.getComUpdateUserId());
        assertEquals(funcId, tmSeqDomain.getComUpdateFuncId());
        assertEquals(null, tmSeqDomain.getComUpdateTimestamp());
    }

    /**
     * <br />setCommonPropertyForUpdateのテスト
     */
    @Test
    public void testSetCommonPropertyForUpdate() {
        
        String dscId = "DSCID-test";
        String funcId = "FUNCID-test";
        
        setDensoContext(dscId);
        
        TmSeqDomain tmSeqDomain = new TmSeqDomain();
        commonService.setCommonPropertyForUpdate(tmSeqDomain, funcId);
        
        assertEquals(null, tmSeqDomain.getComCreateUserId());
        assertEquals(null, tmSeqDomain.getComCreateFuncId());
        assertEquals(null, tmSeqDomain.getComCreateTimestamp());
        assertEquals(dscId, tmSeqDomain.getComUpdateUserId());
        assertEquals(funcId, tmSeqDomain.getComUpdateFuncId());
        assertEquals(null, tmSeqDomain.getComUpdateTimestamp());
    }

    /**
     * <br />validateFromToDateのテスト
     */
    @Test
    public void testValidateFromToDate1() {
        
        String format = "yyyy/MM/dd";
        
        boolean result1 = commonService.validateFromToDate(format, "2013/12/24", "2013/12/25");
        boolean result2 = commonService.validateFromToDate(format, "2013/12/25", "2013/12/25");
        boolean result3 = commonService.validateFromToDate(format, "2013/12/26", "2013/12/25");
        boolean result4 = commonService.validateFromToDate(format, "20131224", "2013/12/25");
        boolean result5 = commonService.validateFromToDate(format, "2013/12/24", "20131225");
        boolean result6 = commonService.validateFromToDate(format, null, "20131225");
        boolean result7 = commonService.validateFromToDate(format, "", "20131225");
        
        assertEquals(true,  result1);
        assertEquals(true,  result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
    }

    /**
     * <br />validateFromToDateのテスト
     */
    @Test
    public void testValidateFromToDate2() {
        
        try {
            commonService.validateFromToDate("", "", null, "X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-E1-0002", ((SystemException) e).getCode());
        }
        
        String formatKey = "test.date.format";
        Locale locale = new Locale("ja", "JP");
        
        boolean result1
            = commonService.validateFromToDate("2013/12/24", "2013/12/25", locale, formatKey);
        boolean result2
            = commonService.validateFromToDate("2013/12/25", "2013/12/25", locale, formatKey);
        boolean result3
            = commonService.validateFromToDate("2013/12/26", "2013/12/25", locale, formatKey);
        boolean result4
            = commonService.validateFromToDate("20131224", "2013/12/25", locale, formatKey);
        boolean result5
            = commonService.validateFromToDate("2013/12/24", "20131225", locale, formatKey);
        boolean result6
            = commonService.validateFromToDate(null, "20131225", locale, formatKey);
        boolean result7
            = commonService.validateFromToDate("", "20131225", locale, formatKey);
        
        assertEquals(true,  result1);
        assertEquals(true,  result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
    }

    /**
     * <br />transactSequenceのテスト (正常系)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactSequence1() throws Exception {
        
        // insert されるパターン
        try {
            // 対象データをあらかじめ削除
            TmSeqCriteriaDomain searchCriteria1 = new TmSeqCriteriaDomain();
            searchCriteria1.setSeqKey("T");
            searchCriteria1.setSeqTyp("01");
            TmSeqDomain tmSeqDomain = tmSeqService.searchByKey(searchCriteria1);
            
            if (tmSeqDomain != null) {
                TmSeqCriteriaDomain deleteCriteria = new TmSeqCriteriaDomain();
                deleteCriteria.setSeqKey("T");
                deleteCriteria.setSeqTyp("01");
                deleteCriteria.setComUpdateTimestamp(tmSeqDomain.getComUpdateTimestamp());
                tmSeqService.delete(deleteCriteria);
            }
            
            List<String> list1 = commonService.transactSequence("T", "01", 2, "test");
            TmSeqDomain result1 = tmSeqService.searchByKey(searchCriteria1);
            
            assertEquals("[0001, 0002]", list1.toString());
            assertEquals(2, result1.getSeqNo().intValue());
            
        } finally {
            
            // 後始末
        }

        // update されるパターン
        try {
            TmSeqCriteriaDomain searchCriteria1 = new TmSeqCriteriaDomain();
            searchCriteria1.setSeqKey("T");
            searchCriteria1.setSeqTyp("01");
            
            List<String> list1 = commonService.transactSequence("T", "01", 2, "test");
            TmSeqDomain result1 = tmSeqService.searchByKey(searchCriteria1);
            
            assertEquals("[0003, 0004]", list1.toString());
            assertEquals(4, result1.getSeqNo().intValue());
            
        } finally {
            
            // 後始末
            TmSeqCriteriaDomain deleteCriteria1 = new TmSeqCriteriaDomain();
            deleteCriteria1.setSeqKey("T");
            deleteCriteria1.setSeqTyp("01");
            TmSeqDomain tmSeqDomain = tmSeqService.searchByKey(deleteCriteria1);
            
            deleteCriteria1.setComUpdateTimestamp(tmSeqDomain.getComUpdateTimestamp());
            tmSeqService.delete(deleteCriteria1);
        }
    }

    /**
     * <br />transactSequenceのテスト (異常系 / 不正な採番区分、最大値超え)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactSequence3() throws Exception {
        
        // 未知の採番区分のパターン
        try {
            commonService.transactSequence("T", "X", 2, "test");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
        
        // 最大値を超えるパターン
        try {
            // 対象データの採番Noをあらかじめ「最大値-1」に設定
            TmSeqCriteriaDomain searchCriteria1 = new TmSeqCriteriaDomain();
            searchCriteria1.setSeqKey("T");
            searchCriteria1.setSeqTyp("02");
            TmSeqDomain tmSeqDomain = tmSeqService.searchByKey(searchCriteria1);
            
            if (tmSeqDomain == null) {
                tmSeqDomain = new TmSeqDomain();
                tmSeqDomain.setSeqKey("T");
                tmSeqDomain.setSeqTyp("02");
                tmSeqDomain.setSeqNo(new BigDecimal(SEQ_MAX_PALLETIZE_INSTR_NO - 1));
                commonService.setCommonPropertyForRegist(tmSeqDomain, "test");
                tmSeqService.create(tmSeqDomain);
                
            } else {
                tmSeqDomain.setSeqNo(new BigDecimal(SEQ_MAX_PALLETIZE_INSTR_NO - 1));
                commonService.setCommonPropertyForUpdate(tmSeqDomain, "test");
                tmSeqService.update(tmSeqDomain);
            }
            
            try {
                commonService.transactSequence("T", "02", 2, "test");
                fail("ApplicationException 発生せず");
            } catch (Exception e) {
                assertEquals(true, e instanceof GscmApplicationException);
                assertEquals("NXS-E1-0005", ((ApplicationException) e).getCode());
            }
            
        } finally {
            
            // 後始末
        }
    }

    /**
     * <br />transactSequenceのテスト (異常系 / 一意制約違反)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactSequence4() throws Exception {
        
        // 一意制約違反が発生するパターン
        
        // 強制的に IntegrationLayerException が発生するように設定
        MockObjectManager.setReturnValueAtAllTimes(TmSeqDaoImpl.class,
            "create", new IntegrationLayerException("", new DataIntegrityViolationException("")));
        
        try {
            
            try {
                commonService.transactSequence("T", "03", 1, "test");
                fail("ApplicationException 発生せず");
            } catch (Exception e) {
                assertEquals(true, e instanceof GscmApplicationException);
                assertEquals("NXS-E7-0005", ((ApplicationException) e).getCode());
            }
            
        } finally {
            
            // 後始末
            TmSeqCriteriaDomain searchCriteria1 = new TmSeqCriteriaDomain();
            searchCriteria1.setSeqKey("T");
            searchCriteria1.setSeqTyp("03");
            TmSeqDomain tmSeqDomain = tmSeqService.searchByKey(searchCriteria1);
            
            if (tmSeqDomain != null) {
                TmSeqCriteriaDomain deleteCriteria = new TmSeqCriteriaDomain();
                deleteCriteria.setSeqKey("T");
                deleteCriteria.setSeqTyp("03");
                deleteCriteria.setComUpdateTimestamp(tmSeqDomain.getComUpdateTimestamp());
                tmSeqService.delete(deleteCriteria);
            }
        }
    }

//    /**
//     * <br />transactSequenceのテスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testTransactSequence5() throws Exception {
//        
//        // 一意制約違反が発生するパターン
//        
//        // このテストを実行するには、
//        //   1. transactSequence の tmSeqService.create(tmSeqDomain); の手前でデバッグで止める
//        //   2. TM_SEQ に重複するデータを登録する
//        //      insert into TM_SEQ values ('T','04',1,'test','test',systimestamp,'test','test',systimestamp);
//        //   3. デバッグで止めていた処理を再開する
//        
//        try {
//            
//            try {
//                commonService.transactSequence("T", "04", 1, "test");
//                fail("ApplicationException 発生せず");
//            } catch (Exception e) {
//                assertEquals(true, e instanceof GscmApplicationException);
//                assertEquals("NXS-E7-0005", ((ApplicationException) e).getCode());
//            }
//            
//        } finally {
//            
//            // 後始末
//            TmSeqCriteriaDomain searchCriteria1 = new TmSeqCriteriaDomain();
//            searchCriteria1.setSeqKey("T");
//            searchCriteria1.setSeqTyp("04");
//            TmSeqDomain tmSeqDomain = tmSeqService.searchByKey(searchCriteria1);
//            
//            if (tmSeqDomain != null) {
//                TmSeqCriteriaDomain deleteCriteria = new TmSeqCriteriaDomain();
//                deleteCriteria.setSeqKey("T");
//                deleteCriteria.setSeqTyp("04");
//                deleteCriteria.setComUpdateTimestamp(tmSeqDomain.getComUpdateTimestamp());
//                tmSeqService.delete(deleteCriteria);
//            }
//        }
//    }

    /**
     * <br />validateShipperCustomerShipToのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateShipperCustomerShipTo() throws Exception {
        
        boolean result1 = commonService.validateShipperCustomerShipTo("TG0", "30001205", "11");
        boolean result2 = commonService.validateShipperCustomerShipTo("X", "30001205", "11");
        boolean result3 = commonService.validateShipperCustomerShipTo("TG0", "X", "11");
        boolean result4 = commonService.validateShipperCustomerShipTo("TG0", "30001205", "X");
        boolean result5 = commonService.validateShipperCustomerShipTo("", "30001205", "11");
        boolean result6 = commonService.validateShipperCustomerShipTo("TG0", "", "11");
        boolean result7 = commonService.validateShipperCustomerShipTo("TG0", "30001205", "");
        boolean result8 = commonService.validateShipperCustomerShipTo(null, "30001205", "11");
        boolean result9 = commonService.validateShipperCustomerShipTo("TG0", null, "11");
        boolean result10 = commonService.validateShipperCustomerShipTo("TG0", "30001205", null);
        boolean result11 = commonService.validateShipperCustomerShipTo("", "", "");
        boolean result12 = commonService.validateShipperCustomerShipTo(null, null, null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
        assertEquals(false, result10);
        assertEquals(false, result11);
        assertEquals(false, result12);
    }

    /**
     * <br />validateShipperWhPlantのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateShipperWhPlant() throws Exception {
        
        boolean result1 = commonService.validateShipperWhPlant("001", "1", "01");
        boolean result2 = commonService.validateShipperWhPlant("X", "1", "01");
        boolean result3 = commonService.validateShipperWhPlant("001", "X", "01");
        boolean result4 = commonService.validateShipperWhPlant("001", "1", "X");
        boolean result5 = commonService.validateShipperWhPlant("", "1", "01");
        boolean result6 = commonService.validateShipperWhPlant("001", "", "01");
        boolean result7 = commonService.validateShipperWhPlant("001", "1", "");
        boolean result8 = commonService.validateShipperWhPlant(null, "1", "01");
        boolean result9 = commonService.validateShipperWhPlant("001", null, "01");
        boolean result10 = commonService.validateShipperWhPlant("001", "1", null);
        boolean result11 = commonService.validateShipperWhPlant("", "", "");
        boolean result12 = commonService.validateShipperWhPlant(null, null, null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
        assertEquals(false, result10);
        assertEquals(false, result11);
        assertEquals(false, result12);
    }

    /**
     * <br />validateCompWhのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateCompWh() throws Exception {
        
        boolean result1 = commonService.validateCompWh("TG0", "A101");
        boolean result2 = commonService.validateCompWh("X", "A101");
        boolean result3 = commonService.validateCompWh("TG0", "X");
        boolean result4 = commonService.validateCompWh("", "A101");
        boolean result5 = commonService.validateCompWh("TG0", "");
        boolean result6 = commonService.validateCompWh(null, "A101");
        boolean result7 = commonService.validateCompWh("TG0", null);
        boolean result8 = commonService.validateCompWh("", "");
        boolean result9 = commonService.validateCompWh(null, null);
        
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
     * <br />validateNumberのテスト
     */
    @Test
    public void testValidateNumber() {
        
        boolean result1 = commonService.validateNumber("12.34", 2, 2);
        boolean result2 = commonService.validateNumber("-12.34", 2, 2);
        boolean result3 = commonService.validateNumber("2.34", 2, 2);
        boolean result4 = commonService.validateNumber("12.3", 2, 2);
        boolean result5 = commonService.validateNumber("12", 2, 2);
        boolean result6 = commonService.validateNumber("0.34", 2, 2);
        boolean result7 = commonService.validateNumber(".34", 2, 2);
        boolean result8 = commonService.validateNumber("912.34", 2, 2);
        boolean result9 = commonService.validateNumber("12.349", 2, 2);
        boolean result10 = commonService.validateNumber(".345", 2, 2);
        boolean result11 = commonService.validateNumber("0.00000000000000000000000000001", 2, 2);
        boolean result12 = commonService.validateNumber("10000000000000000000000000000.1", 2, 2);
        boolean result13 = commonService.validateNumber("12.3E+7", 2, 2);
        boolean result14 = commonService.validateNumber("1234.5E-4", 2, 2);
        boolean result15 = commonService.validateNumber("-0.00000000000000000000000000001", 2, 2);
        boolean result16 = commonService.validateNumber("-10000000000000000000000000000.1", 2, 2);
        boolean result17 = commonService.validateNumber("-.34", 2, 2);
        boolean result18 = commonService.validateNumber("12", 2, 0);
        boolean result19 = commonService.validateNumber("12.0", 2, 0);
        boolean result20 = commonService.validateNumber("12.1", 2, 0);
        boolean result21 = commonService.validateNumber("012", 2, 0);
        boolean result22 = commonService.validateNumber("X", 2, 0);
        
        assertEquals(true,  result1);
        assertEquals(true,  result2);
        assertEquals(true,  result3);
        assertEquals(true,  result4);
        assertEquals(true,  result5);
        assertEquals(true,  result6);
        assertEquals(true,  result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
        assertEquals(false, result10);
        assertEquals(false, result11);
        assertEquals(false, result12);
        assertEquals(false, result13);
        assertEquals(false, result14);
        assertEquals(false, result15);
        assertEquals(false, result16);
        assertEquals(true,  result17);
        assertEquals(true,  result18);
        assertEquals(false, result19);
        assertEquals(false, result20);
        assertEquals(true,  result21);
        assertEquals(false,  result22);
    }

    /**
     * <br />validateAfterDateのテスト
     */
    @Test
    public void testValidateAfterDate1() {
        
        String formatKey = "test.date.format";
        String timezone = "9000000001";
        Locale locale = new Locale("ja", "JP");
        String format = commonService.getResource(locale, formatKey);
        DateFormat df = new SimpleDateFormat(format);
        Date today = DateUtil.convertTime(new Date(), timezone);
        
        Calendar yesterday = new GregorianCalendar();
        yesterday.setTime(today);
        yesterday.add(Calendar.DATE, -1);
        
        String todayStr = df.format(today);
        String yesterdayStr = df.format(yesterday.getTime());
        
        boolean result1 = commonService.validateAfterDate("2013/01/08", format, timezone);
        boolean result2 = commonService.validateAfterDate(yesterdayStr, format, timezone);
        boolean result3 = commonService.validateAfterDate(todayStr, format, timezone);
        boolean result4 = commonService.validateAfterDate("2015/01/08", format, timezone);
        boolean result5 = commonService.validateAfterDate("20150108", format, timezone);
        boolean result6 = commonService.validateAfterDate("", format, timezone);
        boolean result7 = commonService.validateAfterDate(null, format, timezone);
        boolean result8 = commonService.validateAfterDate("2015/01/08", format, "");
        boolean result9 = commonService.validateAfterDate("2015/01/08", format, null);
        
        assertEquals(false, result1);
        assertEquals(false, result2);
        assertEquals(true,  result3);
        assertEquals(true,  result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(false, result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
    }

    /**
     * <br />validateAfterDateのテスト
     */
    @Test
    public void testValidateAfterDate2() {
        
        String formatKey = "test.date.format";
        String timezone = "9000000002";
        Locale locale = new Locale("en", "US");
        String format = commonService.getResource(locale, formatKey);
        DateFormat df = new SimpleDateFormat(format);
        Date today = DateUtil.convertTime(new Date(), timezone);
        
        Calendar yesterday = new GregorianCalendar();
        yesterday.setTime(today);
        yesterday.add(Calendar.DATE, -1);
        
        String todayStr = df.format(today);
        String yesterdayStr = df.format(yesterday.getTime());
        
        boolean result1 = commonService.validateAfterDate("2013/01/08", format, timezone);
        boolean result2 = commonService.validateAfterDate(yesterdayStr, format, timezone);
        boolean result3 = commonService.validateAfterDate(todayStr, format, timezone);
        boolean result4 = commonService.validateAfterDate("2015/01/08", format, timezone);
        
        assertEquals(false, result1);
        assertEquals(false, result2);
        assertEquals(true,  result3);
        assertEquals(true,  result4);
    }

    /**
     * <br />validateAfterDateCompのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateAfterDateComp() throws Exception {
        
        String formatKey = "test.date.format";
        Locale locale = new Locale("ja", "JP");
        String format = commonService.getResource(locale, formatKey);
        
        boolean result1
            = commonService.validateAfterDateComp("2013/01/08", format, "C0001");
        boolean result2
            = commonService.validateAfterDateComp("2015/01/08", format, "C0001");
        boolean result3
            = commonService.validateAfterDateComp("2015/01/08", format, "C0002");
        boolean result4
            = commonService.validateAfterDateComp("2015/01/08", format, "X");
        boolean result5
            = commonService.validateAfterDateComp("2015/01/08", format, "");
        boolean result6
            = commonService.validateAfterDateComp("2015/01/08", format, null);
        
        assertEquals(false, result1);
        assertEquals(true,  result2);
        assertEquals(true, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
    }

    /**
     * <br />validateConsigneeのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsignee() throws Exception {
        
        boolean result1 = commonService.validateConsignee("C0001");
        boolean result2 = commonService.validateConsignee("X");
        boolean result3 = commonService.validateConsignee("");
        boolean result4 = commonService.validateConsignee(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * <br />validateShipToのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateShipTo() throws Exception {
        
        boolean result1 = commonService.validateShipTo("SHIP001");
        boolean result2 = commonService.validateShipTo("X");
        boolean result3 = commonService.validateShipTo("");
        boolean result4 = commonService.validateShipTo(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * <br />validateOuterCdのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateOuterCd() throws Exception {
        
        boolean result1 = commonService.validateOuterCd("TG0", "KB4S");
        boolean result2 = commonService.validateOuterCd("X", "KB4S");
        boolean result3 = commonService.validateOuterCd("TG0", "X");
        boolean result4 = commonService.validateOuterCd("TG0", "");
        boolean result5 = commonService.validateOuterCd("", "KB4S");
        boolean result6 = commonService.validateOuterCd(null, "KB4S");
        boolean result7 = commonService.validateOuterCd("TG0", null);
        boolean result8 = commonService.validateOuterCd("", "");
        boolean result9 = commonService.validateOuterCd(null, null);
        
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
     * <br />searchCigmaAdsのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCigmaAds() throws Exception {
        
        Date date1 = commonService.searchCigmaAds("C0001");
        Date date2 = commonService.searchCigmaAds("X");
        
        assertEquals("Fri Dec 27 00:00:00 JST 2013", date1.toString());
        assertEquals(null, date2);
    }

    /**
     * <br />searchCigmaAvailableのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCigmaAvailable() throws Exception {
        
        boolean result1 = commonService.searchCigmaAvailable(true, "C0001");
        boolean result2 = commonService.searchCigmaAvailable(true, "C0002");
        boolean result3 = commonService.searchCigmaAvailable(true, "C0003");
        boolean result4 = commonService.searchCigmaAvailable(false, "C0001");
        boolean result5 = commonService.searchCigmaAvailable(false, "C0002");
        boolean result6 = commonService.searchCigmaAvailable(false, "C0003");
        boolean result7 = commonService.searchCigmaAvailable(true, "C0004");
        boolean result8 = commonService.searchCigmaAvailable(true, "C0005");
        boolean result9 = commonService.searchCigmaAvailable(true, "C0006");
        boolean result10 = commonService.searchCigmaAvailable(false, "C0004");
        boolean result11 = commonService.searchCigmaAvailable(false, "C0005");
        boolean result12 = commonService.searchCigmaAvailable(false, "C0006");
        
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
        assertEquals(true, result4);
        assertEquals(false, result5);
        assertEquals(false, result6);
        assertEquals(true, result7);
        assertEquals(false, result8);
        assertEquals(false, result9);
        assertEquals(true, result10);
        assertEquals(false, result11);
        assertEquals(false, result12);

        try {
            commonService.searchCigmaAvailable(true, "X");
            fail();
        } catch (GscmApplicationException e) {
            assertEquals("NXS-E7-0075", e.getCode());
        }
    }

    /**
     * <br />searchCigmaNightFlgのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCigmaNightFlg() throws Exception {
        String result1 = commonService.searchCigmaNightFlg("C0001");
        String result2 = commonService.searchCigmaNightFlg("C0003");
        
        assertEquals(FLAG_N, result1);
        assertEquals(FLAG_Y, result2);
        
        try {
            commonService.searchCigmaNightFlg("X");
            fail();
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        try {
            commonService.searchCigmaNightFlg("C0002");
            fail();
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
    }
    
    /**
     * <br />validateCompCdのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateCompCd() throws Exception {
        
        boolean result1 = commonService.validateCompCd("C0001");
        boolean result2 = commonService.validateCompCd("X");
        boolean result3 = commonService.validateCompCd("");
        boolean result4 = commonService.validateCompCd(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * <br />validateShipperのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateShipper() throws Exception {
        
        boolean result1 = commonService.validateShipper("SHIP0001");
        boolean result2 = commonService.validateShipper("C0001");
        boolean result3 = commonService.validateShipper("X");
        boolean result4 = commonService.validateShipper("");
        boolean result5 = commonService.validateShipper(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
    }

    /**
     * <br />validateCustomsBrokerのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateCustomsBroker() throws Exception {
        
        boolean result1 = commonService.validateCustomsBroker("BROKER0001");
        boolean result2 = commonService.validateCustomsBroker("C0001");
        boolean result3 = commonService.validateCustomsBroker("X");
        boolean result4 = commonService.validateCustomsBroker("");
        boolean result5 = commonService.validateCustomsBroker(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
    }

    /**
     * <br />validateCarrierのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateCarrier() throws Exception {
        
        boolean result1 = commonService.validateCarrier("CARRIER0001");
        boolean result2 = commonService.validateCarrier("C0001");
        boolean result3 = commonService.validateCarrier("X");
        boolean result4 = commonService.validateCarrier("");
        boolean result5 = commonService.validateCarrier(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(false, result5);
    }

    /**
     * <br />validateCountryのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateCountry() throws Exception {
        
        boolean result1 = commonService.validateCountry("JP");
        boolean result2 = commonService.validateCountry("X");
        boolean result3 = commonService.validateCountry("");
        boolean result4 = commonService.validateCountry(null);
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * <br />validatePortのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidatePort() throws Exception {
        
        boolean result1 = commonService.validatePort("NGO","");
        boolean result2 = commonService.validatePort("X","");
        boolean result3 = commonService.validatePort("","");
        boolean result4 = commonService.validatePort(null,null);
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
    }

    /**
     * <br />validatePkgCdのテスト
     */
    @Test
    public void testValidatePkgCd() {
        
        boolean result1 = commonService.validatePkgCd("0", "D");
        boolean result2 = commonService.validatePkgCd("", "D");
        boolean result3 = commonService.validatePkgCd(null, "D");
        boolean result4 = commonService.validatePkgCd("0", "DG");
        boolean result5 = commonService.validatePkgCd("", "DG");
        boolean result6 = commonService.validatePkgCd(null, "DG");
        boolean result7 = commonService.validatePkgCd(null, "X");
        
        assertEquals(true,  result1);
        assertEquals(false, result2);
        assertEquals(false, result3);
        assertEquals(false, result4);
        assertEquals(true,  result5);
        assertEquals(true,  result6);
        assertEquals(true,  result7);
    }

    /**
     * <br />searchCigmaWebServiceUrlのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCigmaWebServiceUrl() throws Exception {
        setDensoContext("100088NXS0001");
        
        WebServiceCallerRestDomain result1
            = commonService.searchCigmaWebServiceCallerRestDomain("C0001", "helloWorld");
        WebServiceCallerRestDomain result2
            = commonService.searchCigmaWebServiceCallerRestDomain("C0003", "helloWorld2");
        
        assertEquals("http://localhost:8080/NEXUS_CIGMA/rest/helloWorld", result1.getUrl());
        assertEquals("nexus-th", result1.getUserName());
        assertEquals("nexus-th", result1.getPassword());
        assertEquals("LIB_NORMAL", result1.getParamMap().get(WS_PARAM_LIB));
        
        assertEquals("http://localhost:8080/NEXUS_CIGMA/rest/helloWorld2", result2.getUrl());
        assertEquals("LIB_NIGHT", result2.getParamMap().get(WS_PARAM_LIB));
        
        try {
            commonService.searchCigmaWebServiceCallerRestDomain("X", null);
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        try {
            commonService.searchCigmaWebServiceCallerRestDomain("C0002", null);
            fail("ApplicationException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof GscmApplicationException);
            assertEquals("NXS-E1-0061", ((ApplicationException) e).getCode());
        }
        
        try {
            commonService.searchCigmaWebServiceCallerRestDomain("C0099", null);
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
    }

    /**
     * <br />searchCigmaWebServiceUrlのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCigmaWebServiceUrlBatch() throws Exception {
        setDensoContext(BATCH_DSC_ID);
        
        WebServiceCallerRestDomain result1
            = commonService.searchCigmaWebServiceCallerRestDomain("C0001", "helloWorld");
        WebServiceCallerRestDomain result2
            = commonService.searchCigmaWebServiceCallerRestDomain("C0003", "helloWorld2");
    
        assertEquals("LIB_NORMAL", result1.getParamMap().get(WS_PARAM_LIB));
        assertEquals("LIB_NORMAL", result2.getParamMap().get(WS_PARAM_LIB));
    }
    
    /**
     * <br />convertWeightUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testConvertWeightUnit() throws Exception {
        
        try {
            commonService.convertWeightUnit(BigDecimal.ONE, "X", "Z");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        try {
            commonService.convertWeightUnit(null, "GR", "GR");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
        
        BigDecimal result1 = commonService.convertWeightUnit(new BigDecimal("1"), "GR", "GR");
        BigDecimal result2 = commonService.convertWeightUnit(new BigDecimal("1"), "GR", "OZ");
        BigDecimal result3 = commonService.convertWeightUnit(new BigDecimal("1"), "KG", "LB");
        BigDecimal result4 = commonService.convertWeightUnit(new BigDecimal("1234"), "KG", "LB");
        BigDecimal result5 = commonService.convertWeightUnit(new BigDecimal("0"), "KG", "LB");
        BigDecimal result6 = commonService.convertWeightUnit(new BigDecimal("1000000000"), "GR", "KG");
        BigDecimal result7 = commonService.convertWeightUnit(new BigDecimal("10000000000"), "GR", "KG");
        BigDecimal result8 = commonService.convertWeightUnit(new BigDecimal("1E+20"), "GR", "KG");
        BigDecimal result9 = commonService.convertWeightUnit(new BigDecimal("1E-20"), "GR", "KG");
        BigDecimal result10 = commonService.convertWeightUnit(new BigDecimal("123456789"), "LB", "KG");
        BigDecimal result11 = commonService.convertWeightUnit(new BigDecimal("123456789"), "KG", "KG");
        
        assertEquals("1", result1.toPlainString());
        assertEquals("0.036", result2.toPlainString());
        assertEquals("0.001", result3.toPlainString());
        assertEquals("0.003", result4.toPlainString());
        assertEquals("0.000", result5.toPlainString());
        assertEquals("1000000.000", result6.toPlainString());
        assertEquals(null, result7);
        assertEquals(null, result8);
        assertEquals("0.001", result9.toPlainString());
        assertEquals(null, result10);
        assertEquals(null, result11);
    }

    /**
     * <br />convertVolumeUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testConvertVolumeUnit() throws Exception {
        
        try {
            commonService.convertVolumeUnit(null, "CC", "LT");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }

        BigDecimal result1 = commonService.convertVolumeUnit(new BigDecimal("1"), "CF", "CF");
        BigDecimal result2 = commonService.convertVolumeUnit(new BigDecimal("1"), "CF", "CR");
        BigDecimal result3 = commonService.convertVolumeUnit(new BigDecimal("0"), "CF", "CR");
        BigDecimal result4 = commonService.convertVolumeUnit(new BigDecimal("1234"), "CF", "CR");
        BigDecimal result5 = commonService.convertVolumeUnit(new BigDecimal("100000000"), "CR", "LT");
        BigDecimal result6 = commonService.convertVolumeUnit(new BigDecimal("1000000000"), "CR", "LT");
        BigDecimal result7 = commonService.convertVolumeUnit(new BigDecimal("1E+20"), "CR", "LT");
        BigDecimal result8 = commonService.convertVolumeUnit(new BigDecimal("1E-20"), "CR", "LT");
        
        assertEquals("1", result1.toPlainString());
        assertEquals("0.029", result2.toPlainString());
        assertEquals("0.000", result3.toPlainString());
        assertEquals("34.944", result4.toPlainString());
        assertEquals("100000000000", result5.toPlainString());
        assertEquals(null, result6);
        assertEquals(null, result7);
        assertEquals("0.001", result8.toPlainString());
    }

    /**
     * <br />convertLengthUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testConvertLengthUnit() throws Exception {
        
        try {
            commonService.convertLengthUnit(null, "YD", "MM");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }

        BigDecimal result1 = commonService.convertLengthUnit(new BigDecimal("1"), "YD", "YD");
        BigDecimal result2 = commonService.convertLengthUnit(new BigDecimal("1"), "YD", "MM");
        BigDecimal result3 = commonService.convertLengthUnit(new BigDecimal("0"), "YD", "MM");
        BigDecimal result4 = commonService.convertLengthUnit(new BigDecimal("1234"), "YD", "MM");
        BigDecimal result5 = commonService.convertLengthUnit(new BigDecimal("1"), "MR", "MM");
        BigDecimal result6 = commonService.convertLengthUnit(new BigDecimal("10"), "MR", "MM");
        BigDecimal result7 = commonService.convertLengthUnit(new BigDecimal("1E+20"), "MR", "MM");
        BigDecimal result8 = commonService.convertLengthUnit(new BigDecimal("1E-20"), "MR", "MM");
        
        assertEquals("1", result1.toPlainString());
        assertEquals("914.39", result2.toPlainString());
        assertEquals("0.00", result3.toPlainString());
        assertEquals(null, result4);
        assertEquals("1000", result5.toPlainString());
        assertEquals(null, result6);
        assertEquals(null, result7);
        assertEquals("0.01", result8.toPlainString());
    }

    /**
     * <br />isWeightOverflowのテスト
     *
     */
    @Test
    public void testIsWeightOverflow() {
        assertEquals(false, commonService.isWeightOverflow(null));
        assertEquals(false, commonService.isWeightOverflow(new BigDecimal("1234567")));
        assertEquals(true, commonService.isWeightOverflow(new BigDecimal("12345678")));
    }
    
    /**
     * <br />isLengthOverflowのテスト
     *
     */
    @Test
    public void testIsLengthOverflow() {
        assertEquals(false, commonService.isLengthOverflow(null));
        assertEquals(false, commonService.isLengthOverflow(new BigDecimal("1234")));
        assertEquals(true, commonService.isLengthOverflow(new BigDecimal("12345")));
    }
    
    /**
     * <br />isVolumeOverflowのテスト
     *
     */
    @Test
    public void testIsVolumeOverflow() {
        assertEquals(false, commonService.isVolumeOverflow(null));
        assertEquals(false, commonService.isVolumeOverflow(new BigDecimal("123456789012")));
        assertEquals(true, commonService.isVolumeOverflow(new BigDecimal("1234567890123")));
    }
    
    /**
     * <br />isLoadingRatioOverflowのテスト
     *
     */
    @Test
    public void testIsLoadingRatioOverflow() {
        assertEquals(false, commonService.isLoadingRatioOverflow(null));
        assertEquals(false, commonService.isLoadingRatioOverflow(new BigDecimal("123")));
        assertEquals(true, commonService.isLoadingRatioOverflow(new BigDecimal("1234")));
    }
    
    
    /**
     * <br />getResourceのテスト
     */
    @Test
    public void testGetResource() {
        
        String result1 = commonService.getResource(new Locale("ja", "JP"), "test.date.format");
        String result2 = commonService.getResource(new Locale("ja", "JP"), "X");
        
        assertEquals("yyyy/MM/dd", result1);
        assertEquals(null, result2);
    }

    /**
     * <br />searchTimezoneのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchTimezone() throws Exception {
        
        try {
            commonService.searchTimezone("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        String result1 = commonService.searchTimezone("C0001");
        
        assertEquals("JST", result1);
    }

    /**
     * <br />searchWeightUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchWeightUnit() throws Exception {
        
        try {
            commonService.searchWeightUnit("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        String result1 = commonService.searchWeightUnit("C0001");
        
        assertEquals("01", result1);
    }

    /**
     * <br />searchLengthUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchLengthUnit() throws Exception {
        
        try {
            commonService.searchLengthUnit("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        String result1 = commonService.searchLengthUnit("C0001");
        
        assertEquals("02", result1);
    }

    /**
     * <br />searchVolumeUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchVolumeUnit() throws Exception {
        
        try {
            commonService.searchVolumeUnit("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        String result1 = commonService.searchVolumeUnit("C0001");
        
        assertEquals("03", result1);
    }

    /**
     * <br />searchMeasureUnitのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchMeasureUnit() throws Exception {
        
        try {
            commonService.searchMeasureUnit("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }

        VtCompMeasureUnitDomain measureUnit = commonService.searchMeasureUnit("C0001");
        
        assertEquals("01", measureUnit.getWeightUnit());
        assertEquals("02", measureUnit.getLengthUnit());
        assertEquals("03", measureUnit.getVolumeUnit());
        assertEquals("g", measureUnit.getWeightUnitDisp());
        assertEquals("kg", measureUnit.getLengthUnitDisp());
        assertEquals("t", measureUnit.getVolumeUnitDisp());
    }
    
    /**
     * <br />searchMeasureUnitDispのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchMeasureUnitDisp() throws Exception {
        try {
            commonService.searchMeasureUnitDisp("X");
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("GSCM-E0-0001", ((SystemException) e).getCode());
        }
        
        assertEquals("g", commonService.searchMeasureUnitDisp("01"));
    }
    
    /**
     * <br />printPdfのテスト (正常系)
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintPdf() throws Exception {
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "getResource", "C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/bin/app/print-dev.bat");
        
        File airPdf = new File(getClass().getResource("CommonServiceTest_AIR.pdf").toURI());
        
        commonService.printPdf(airPdf, 1, "printer01");
    }
    
    /**
     * <br />printPdfのテスト (異常系 / 印刷コマンドが取得できない場合)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintPdf2() throws Exception {
        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "getResource");
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("NXS-91-0001"));
        
        File airPdf = new File(getClass().getResource("CommonServiceTest_AIR.pdf").toURI());
        
        commonService.printPdf(airPdf, 1, "printer01");
    }
    
    /**
     * <br />printPdfのテスト (異常系 / 印刷コマンドの起動エラー)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintPdf3() throws Exception {
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "getResource", "C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/bin/app/print-dev.bat");
        MockObjectManager.setReturnValueAtAllTimes(ProcessBuilder.class, "start", new IOException("PROCESS START ERROR"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("NXS-91-0001"));
        
        File airPdf = new File(getClass().getResource("CommonServiceTest_AIR.pdf").toURI());
        
        commonService.printPdf(airPdf, 1, "printer01");
    }
    
    /**
     * <br />printPdfのテスト (異常系 / 印刷コマンドの異常終了)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintPdf4() throws Exception {
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "getResource", "C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/bin/app/print-dev.bat");
        MockObjectManager.setReturnValueAtAllTimes(Process.class, "waitFor", new InterruptedException("COMMAND INTERRUPTED"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("NXS-91-0001"));
        
        File airPdf = new File(getClass().getResource("CommonServiceTest_AIR.pdf").toURI());
        
        commonService.printPdf(airPdf, 1, "printer01");
    }

    /**
     * <br />printPdfのテスト (異常系 / 印刷コマンドの異常終了 (クローズエラー))
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintPdf5() throws Exception {
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "getResource", "C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/bin/app/print-dev.bat");
        MockObjectManager.setReturnValueAtAllTimes(Process.class, "waitFor", new InterruptedException("COMMAND INTERRUPTED"));
        MockObjectManager.setReturnValueAtAllTimes(InputStream.class, "close", new IOException("CLOSE ERROR"));
        MockObjectManager.setReturnValueAtAllTimes(BufferedReader.class, "close", new IOException("CLOSE ERROR"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("NXS-91-0001"));
        
        File airPdf = new File(getClass().getResource("CommonServiceTest_AIR.pdf").toURI());
        
        commonService.printPdf(airPdf, 1, "printer01");
    }

    /**
     * <br />mergePdfのテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testMergePdf() throws Exception {
        InputStream airPdf = null;
        InputStream instrPdf = null;
        
        try {
            airPdf = getClass().getResourceAsStream("CommonServiceTest_AIR.pdf");
            instrPdf = getClass().getResourceAsStream("CommonServiceTest_INSTR.pdf");

            //File report = commonService.mergePdf("CommonServiceTest_MERGE", airPdf, instrPdf);
            
            // displayReport(report, true);
            
            //assertThat(report, is(not(nullValue())));
        } finally {
            closeQuietly(airPdf);
            closeQuietly(instrPdf);
        }
        
    }
    
    /**
     * <br />mergePdfのテスト (異常系 / IOExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testMergePdf2() throws Exception {
        InputStream airPdf = null;
        InputStream instrPdf = null;
        
        try {
            MockObjectManager.addReturnValue(PdfReader.class, "<init>", new IOException("OPEN ERROR"));

            thrown.expect(SystemException.class);
            thrown.expectMessage(containsString("AI-90-0000"));
            thrown.expectMessage(containsString("CommonServiceTest_MERGE"));
            thrown.expectMessage(containsString("OPEN ERROR"));

            airPdf = getClass().getResourceAsStream("CommonServiceTest_AIR.pdf");
            instrPdf = getClass().getResourceAsStream("CommonServiceTest_INSTR.pdf");
            
            //commonService.mergePdf("CommonServiceTest_MERGE", airPdf, instrPdf);
        } finally {
            closeQuietly(airPdf);
            closeQuietly(instrPdf);
        }
    }
    
    /**
     * <br />mergePdfのテスト (異常系 / DocumentExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testMergePdf3() throws Exception {
        InputStream airPdf = null;
        InputStream instrPdf = null;
        
        try {
            MockObjectManager.addReturnValue(PdfCopy.class, "<init>", new DocumentException("DOCUMENT ERROR"));
            
            thrown.expect(SystemException.class);
            thrown.expectMessage(containsString("AI-90-0000"));
            thrown.expectMessage(containsString("CommonServiceTest_MERGE"));
            thrown.expectMessage(containsString("DOCUMENT ERROR"));
            
            airPdf = getClass().getResourceAsStream("CommonServiceTest_AIR.pdf");
            instrPdf = getClass().getResourceAsStream("CommonServiceTest_INSTR.pdf");
            
            //commonService.mergePdf("CommonServiceTest_MERGE", airPdf, instrPdf);
        } finally {
            closeQuietly(airPdf);
            closeQuietly(instrPdf);
        }
    }
    
    /**
     * <br />searchEffectivePrice()のテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchEffectivePrice() throws Exception {

        String[][] fixtures = { 
            // 切り上げ
            {"U", "切り上げ", "0", "1500.123", "1501"},
            {"U", "切り上げ", "2", "1500.123", "1500.13"},
            // 切り捨て
            {"D", "切り捨て", "2", "0.01", "0.01"}, 
            {"D", "切り捨て", "2", "0.001", "0.01"}, 
            {"D", "切り捨て", "2", "1.001", "1.00"},
            // 四捨五入
            {"O", "四捨五入", "2", "0.01", "0.01"},
            {"O", "四捨五入", "2", "0.001", "0.01"},
            {"O", "四捨五入", "2", "1.001", "1.00"},
            {"O", "四捨五入", "2", "1.005", "1.01"},
        };
        for (String[] fixture : fixtures) {
            String roundPattern = fixture[0];
            String roundPatternName = fixture[1];
            int effectiveDigit = Integer.parseInt(fixture[2]);
            String price = fixture[3];
            String expectedPrice = fixture[4];
            
            MockObjectManager.addReturnValue(TmNxsCompDomain.class, "getRoundPattern", roundPattern);
            MockObjectManager.addReturnValue(TmCurrencyDomain.class, "getEffectiveDigit", new BigDecimal(effectiveDigit));
            
            BigDecimal effectivePrice = commonService.searchEffectivePrice("DNJ", "001", new BigDecimal(price));
            assertThat(String.format("%s (%d, %s)", roundPatternName, effectiveDigit, price), effectivePrice, is(new BigDecimal(expectedPrice)));
        }
    }
    
    /**
     * <br />searchEffectivePrice()のテスト (異常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchEffectivePrice2() throws Exception {
        // 演算パターンの設定 (U/D/O以外)
        MockObjectManager.addReturnValue(TmNxsCompDomain.class, "getRoundPattern", "X");

        try {
            commonService.searchEffectivePrice("DNJ", "001", new BigDecimal(123));
            fail("SystemException 発生せず");
        } catch (Exception e) {
            assertEquals(true, e instanceof SystemException);
            assertEquals("NXS-91-0001", ((SystemException) e).getCode());
        }
    }
    
    /**
     * <br />getSeqMaxMapのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetSeqMax() throws Exception {
        Map<String, Integer> seqMaxMap = CommonServiceImpl.getSeqMaxMap();
        
        assertThat(seqMaxMap.size(), is(10));
        assertThat(seqMaxMap.get(SEQ_TYP_REQUEST_NO), is(SEQ_MAX_REQUEST_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_PALLETIZE_INSTR_NO), is(SEQ_MAX_PALLETIZE_INSTR_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_CML_NO_DN), is(SEQ_MAX_CML_NO_DN));
        assertThat(seqMaxMap.get(SEQ_TYP_CML_NO_SUP), is(SEQ_MAX_CML_NO_SUP));
        assertThat(seqMaxMap.get(SEQ_TYP_MIX_TAG_NO), is(SEQ_MAX_MIX_TAG_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_TR_NO), is(SEQ_MAX_TR_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_STG_INSTR_NO), is(SEQ_MAX_STG_INSTR_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_STG_ACTUALITY_NO), is(SEQ_MAX_STG_ACTUALITY_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_CONFIRMATION_NO), is(SEQ_MAX_CONFIRMATION_NO));
        assertThat(seqMaxMap.get(SEQ_TYP_SHIPPING_ACTUALITY_NO), is(SEQ_MAX_SHIPPING_ACTUALITY_NO));
    }
}
