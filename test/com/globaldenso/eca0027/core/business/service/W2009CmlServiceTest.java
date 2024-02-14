/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_ISSUE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CARRY_OUT_IN_RECEIVED_AT_TO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0025;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0027;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0048;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0050;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0051;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0086;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0101;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0102;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0103;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0104;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0105;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0106;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0107;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0108;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0147;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0155;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0156;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzServiceImpl;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.eca0027.core.integration.W2009CmlDaoImpl;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12605 $
 */
public class W2009CmlServiceTest extends AbstractEca0027Test {

    /**
     * Webサービス(WS2004)の結果データ
     */
    private static final String[][] WS2004_RESULT_ITEMS = {
        {"A002TB0091B01N", "110", "KG", "1", "002"},
        {"A002TB0091B02N", "110", "KG", "1", "002"},
        {"A002TB0091B11N", "110", "KG", "1", "002"},
        {"A002TB0091B12N", "110", "KG", "1", "002"},
    };
    
    /**
     * W2009CmlService サービス
     */
    private W2009CmlService w2009CmlService;

    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
        
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W2009CmlServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        w2009CmlService = (W2009CmlService) getContext().getBean("w2009CmlService");

    }
    
////////////////////////////// W2009CmlService.validateConsistencyXXX メソッドの確認 ////////////////////////////////////////
    
    /**
     * <br />validateConsistencyActualQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyActualQty() {
        boolean result = false;
        
        // 数量　未入力
        result = w2009CmlService.validateConsistencyActualQty("");
        assertThat(result, is(true));

        // 数量　英文字
        result = w2009CmlService.validateConsistencyActualQty("A");
        assertThat(result, is(false));

        // 数量 =  -1  (-1 < 1) 
        result = w2009CmlService.validateConsistencyActualQty("-1");
        assertThat(result, is(false));
        
        // 数量 = 0   (0 < 1)
        result = w2009CmlService.validateConsistencyActualQty("0");
        assertThat(result, is(false));
        
        // 数量 = 1   (1 == 1)
        result = w2009CmlService.validateConsistencyActualQty("1");
        assertThat(result, is(true));
    
        // 数量 = 2   (2 > 1)
        result = w2009CmlService.validateConsistencyActualQty("2");
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
        result = w2009CmlService.validateConsistencyAllSame(list);
        assertThat(result, is(false));
    
        // リストの中は全て一緒
        list.clear();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        result = w2009CmlService.validateConsistencyAllSame(list);
        assertThat(result, is(true));
    
        // リストは1件
        list.clear();
        list.add("A");
        result = w2009CmlService.validateConsistencyAllSame(list);
        assertThat(result, is(true));

        // リストは0件
        list.clear();
        result = w2009CmlService.validateConsistencyAllSame(list);
        assertThat(result, is(true));

        // リストはnull
        list.clear();
        result = w2009CmlService.validateConsistencyAllSame(null);
        assertThat(result, is(true));

    }
    
    /**
     * <br />validateConsistencyDetailPackageItemNoQTYのテスト
     *
     */
    @Test
    public void testValidateConsistencyDetailPackageItemNoQTY() {
        boolean result = false;
        
        // 包装材品目番号 == null、 数量 == null、MIXタグNO == null
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY(null, null, null);
        assertThat(result, is(true));

        // 包装材品目番号 == null、 数量 == null、MIXタグNO == ""
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY(null, null, "");
        assertThat(result, is(true));

        // 包装材品目番号 == "12345"、 数量 == "10"、MIXタグNO == null
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", "10", null);
        assertThat(result, is(true));

        // 包装材品目番号 == "12345"、 数量 == "10"、MIXタグNO == ""
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", "10", "");
        assertThat(result, is(true));

        // 包装材品目番号 == "12345"、 数量 == null、MIXタグNO == null
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", null, null);
        assertThat(result, is(false));

        // 包装材品目番号 == null、 数量 == "10"、MIXタグNO == null
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY(null, "10", null);
        assertThat(result, is(false));

        // 包装材品目番号 == "12345"、 数量 == null、MIXタグNO == ""
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", null, "");
        assertThat(result, is(false));
        
        // 包装材品目番号 == null、 数量 == "10"、MIXタグNO == ""
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY(null, "10", "");
        assertThat(result, is(false));
        
        // 包装材品目番号 == "12345"、 数量 == "123"、MIXタグNO == "123"
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", "10", "123");
        assertThat(result, is(true));


        // 包装材品目番号 == "12345"、 数量 == null、MIXタグNO == "123"
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY("12345", null, "123");
        assertThat(result, is(true));
        
        // 包装材品目番号 == null、 数量 == "10"、MIXタグNO == "123"
        result = w2009CmlService.validateConsistencyDetailPackageItemNoQTY(null, "10", "123");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyDetailQTYのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyDetailQTY() throws Exception {
        boolean result = false;
        
        // MixTagNo未入力で　かつ　数量　未入力
        result = w2009CmlService.validateConsistencyDetailQTY("", "");
        assertThat(result, is(true));

        // MixTagNo未入力で　かつ　数量　英文字
        result = w2009CmlService.validateConsistencyDetailQTY("A", "");
        assertThat(result, is(false));

        // MixTagNo未入力で　かつ　数量 < 0
        result = w2009CmlService.validateConsistencyDetailQTY("-1", "");
        assertThat(result, is(false));
        
        // MixTagNo未入力で　かつ　数量 == 0
        result = w2009CmlService.validateConsistencyDetailQTY("0", "");
        assertThat(result, is(false));
        
        // MixTagNo未入力で　かつ　0 < 数量
        result = w2009CmlService.validateConsistencyDetailQTY("1", "123");
        assertThat(result, is(true));

        // MixTagNo入力されており　かつ　数量　英文字
        result = w2009CmlService.validateConsistencyDetailQTY("A", "123");
        assertThat(result, is(true));

        // MixTagNo入力されており　かつ　数量 < 0
        result = w2009CmlService.validateConsistencyDetailQTY("-1", "123");
        assertThat(result, is(true));
        
        // MixTagNo入力されており　かつ　数量 == 0
        result = w2009CmlService.validateConsistencyDetailQTY("0", "123");
        assertThat(result, is(true));
        
        // MixTagNo入力されており　かつ　0 < 数量
        result = w2009CmlService.validateConsistencyDetailQTY("1", "123");
        assertThat(result, is(true));

    }

    
    /**
     * <br />validateConsistencyDetailQTYMaxのテスト
     */
    @Test
    public void testValidateConsistencyDetailQTYMax() {
        boolean result = false;
        
        // 数量 == null;
        result = w2009CmlService.validateConsistencyDetailQTYMax(null);
        assertThat(result, is(true));
        
        BigDecimal qty = new BigDecimal(10);
        // 数量 < 9999999
        result = w2009CmlService.validateConsistencyDetailQTYMax(qty);
        assertThat(result, is(true));
        
        // 数量 == 9999999
        qty = new BigDecimal(9999999);
        result = w2009CmlService.validateConsistencyDetailQTYMax(qty);
        assertThat(result, is(true));
        
        // 数量 > 9999999
        qty = new BigDecimal(10000000);
        result = w2009CmlService.validateConsistencyDetailQTYMax(qty);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyFmIssueDateToIssueDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyFmIssueDateToIssueDate() {
        boolean result = false;
        
        // 開始日 == null、終了日 == null
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, null, null);
        assertThat(result, is(false));
        
        // 開始日 == null、終了日 != null
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, null, "06/03/14");
        assertThat(result, is(false));
        
        // 開始日 != null、終了日 == null
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", null);
        assertThat(result, is(false));
        
        // 開始日 < 終了日
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", "13/03/14");
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "06/03/14", "06/03/14");
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(dateFormat, "13/03/14", "06/03/14");
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyGetCigmaInfoのテスト
     * 
     */
    @Test
    public void testValidateConsistencyGetCigmaInfo() {
        boolean result = false;
        
        // 通貨コード == null、数量単位 = ""、製造部工場区分 = ""
        result = w2009CmlService.validateConsistencyGetCigmaInfo(null, "", "");
        assertThat(result, is(false));
        
        // 通貨コード == "EN"、数量単位 = "10"、製造部工場区分 = ""
        result = w2009CmlService.validateConsistencyGetCigmaInfo("EN", "10", "");
        assertThat(result, is(false));
        
        // 通貨コード == "EN"、数量単位 = ""、製造部工場区分 = ""
        result = w2009CmlService.validateConsistencyGetCigmaInfo("EN", "", "");
        assertThat(result, is(false));
        
        // 通貨コード == ""、数量単位 = "10"、製造部工場区分 = "MA"
        result = w2009CmlService.validateConsistencyGetCigmaInfo("", "10", "MA");
        assertThat(result, is(false));

        // 通貨コード == ""、数量単位 = ""、製造部工場区分 = "MA"
        result = w2009CmlService.validateConsistencyGetCigmaInfo("", "", "MA");
        assertThat(result, is(false));

        // 通貨コード == ""、数量単位 = "10"、製造部工場区分 = ""
        result = w2009CmlService.validateConsistencyGetCigmaInfo("", "10", "");
        assertThat(result, is(false));
        
        // 通貨コード == "EN"、数量単位 = "10"、製造部工場区分 = "MA"
        result = w2009CmlService.validateConsistencyGetCigmaInfo("EN", "10", "MA");
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
        result = w2009CmlService.validateConsistencyBlankOrNull(null);
        assertThat(result, is(false));
        
        // 入力値 == ""
        result = w2009CmlService.validateConsistencyBlankOrNull("");
        assertThat(result, is(false));
        
        // 入力値 != null
        result = w2009CmlService.validateConsistencyBlankOrNull("15");
        assertThat(result, is(true));
    }
    
    /**
     * validateConsistencyOfRegisterのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyOfRegister() throws Exception {
        boolean result = false;
        
        // リストに "Y" が1件でも含まれる　かつ、ignore Warnings == null
        List<String> list = new ArrayList<String>();
        list.add("N");
        list.add("N");
        list.add("Y");
        result = w2009CmlService.validateConsistencyOfRegister(list, "");
        assertThat(result, is(false));
        
        // リストに "Y"が1件でも含まれる　かつ ignore Warnings == ON
        result = w2009CmlService.validateConsistencyOfRegister(list, CHECK_ON);
        assertThat(result, is(true));
        
        // リストに "Y" が含まれない　かつ、ignore Warnings == null
        list.clear();
        list.add("N");
        list.add("N");
        list.add("N");
        result = w2009CmlService.validateConsistencyOfRegister(list, "");
        assertThat(result, is(true));
        
        // リストに "Y"が含まれない　かつ ignore Warnings == ON
        result = w2009CmlService.validateConsistencyOfRegister(list, CHECK_ON);
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyOfRegisterPkgMtrialのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyOfRegisterPkgMtrial() throws Exception {
        boolean result = false;
           
        // outerPkgCd == null、pkgFormType = null、warningFlgのリスト == null
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial(null, null, null);
        assertThat(result, is(true));
        
        // outerPkgCd == ""、pkgFormType = "M"、warningFlgのリスト == null
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial("", "M", null);
        assertThat(result, is(false));
        
        // outerPkgCd == ""、pkgFormType = "S"、warningFlgのリスト == null
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial(null, "S", null);
        assertThat(result, is(true));
        
        // outerPkgCd == "1"、pkgFormType = "S"、warningFlgのリスト == null
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial("1", "S", null);
        assertThat(result, is(true));
    
        // outerPkgCd == ""、pkgFormType = "S"、warningFlgのリスト に "Y"が含まれる場合
        List<String> list = new ArrayList<String>();
        list.add("N");
        list.add("Y");
        list.add("N");
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial(null, "S", list);
        assertThat(result, is(false));

        // outerPkgCd == "12"、pkgFormType = "S"、warningFlgのリスト に "Y"が含まれる場合
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial("12", "S", list);
        assertThat(result, is(true));

        // outerPkgCd == ""、pkgFormType = "S"、warningFlgのリスト に "Y"が含まれない場合
        list.clear();
        list.add("N");
        list.add("N");
        list.add("N");
        result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial(null, "S", list);
        assertThat(result, is(true));

    }
    
    /**
     * <br />validateConsistencyOverInstr のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyOverInstr() throws Exception {
        boolean result = false;
        
        // 数量 == null、梱包指示数 = null、梱包済数 == null
        result = w2009CmlService.validateConsistencyOverInstr(null, null, null);
        assertThat(result, is(true));
        
        // 数量 == 15、梱包指示数 = 10、梱包済数 == 1  (15 > (10-1)
        BigDecimal qty = new BigDecimal("15");
        BigDecimal instrQty = new BigDecimal("10");
        BigDecimal instrPkgedQty = new BigDecimal("1");
        result = w2009CmlService.validateConsistencyOverInstr(qty, instrQty, instrPkgedQty);
        assertThat(result, is(false));
        
        // 数量 == 5、梱包指示数 = 10、梱包済数 == 1   (5 < (10-1))
        qty = new BigDecimal("5");
        result = w2009CmlService.validateConsistencyOverInstr(qty, instrQty, instrPkgedQty);
        assertThat(result, is(true));

        // 数量 == 5、梱包指示数 = 6、梱包済数 == 1   (5 == (6-1))
        instrQty = new BigDecimal("6");
        result = w2009CmlService.validateConsistencyOverInstr(qty, instrQty, instrPkgedQty);
        assertThat(result, is(true));
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
        
        // 数量 == null、 輸出受注オーダー数 == null
        result = w2009CmlService.validateConsistencyOver(null, null);
        assertThat(result, is(true));
        
        // 数量 < 輸出受注オーダー数
        qty = new BigDecimal(10);
        order = new BigDecimal(15);
        result = w2009CmlService.validateConsistencyOver(qty, order);
        assertThat(result, is(true));

        // 数量 == 輸出受注オーダー数
        qty = new BigDecimal(15);
        result = w2009CmlService.validateConsistencyOver(qty, order);
        assertThat(result, is(true));
        
        // 数量 > 輸出受注オーダー数
        qty = new BigDecimal(20);
        result = w2009CmlService.validateConsistencyOver(qty, order);
        assertThat(result, is(false));
    }
    
    /**
     * <br /> validateConsistencyOverShipLotMultipleのテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyOverShipLotMultiple() throws Exception {
        boolean result = false;
        
        BigDecimal qty = null;
        BigDecimal tagQty = null;
        BigDecimal shipperLot = null;
        
        // 数量 == null、 タグ数 == null, 出荷ロット == null
        result = w2009CmlService.validateConsistencyOverShipLotMultiple(null, null, null);
        assertThat(result, is(true));
        
        // 数量 == 10、 タグ数 == 0, 出荷ロット == 0
        qty = new BigDecimal(10);
        tagQty = new BigDecimal(0);
        shipperLot = new BigDecimal(0);
        
        result = w2009CmlService.validateConsistencyOverShipLotMultiple(qty, tagQty, shipperLot);
        assertThat(result, is(false));
        
        // 数量 == 10、タグ数 == 2、出荷ロット == 10  (10/2) < 10
        qty = new BigDecimal(10);
        tagQty = new BigDecimal(2);
        shipperLot = new BigDecimal(10);
        result = w2009CmlService.validateConsistencyOverShipLotMultiple(qty, tagQty, shipperLot);
        assertThat(result, is(true));
    
        // 数量 == 10、タグ数 == 2、出荷ロット == 5   (10/2) = 5
        shipperLot = new BigDecimal(5);
        result = w2009CmlService.validateConsistencyOverShipLotMultiple(qty, tagQty, shipperLot);
        assertThat(result, is(true));
        
        // 数量 == 10、タグ数 == 2、出荷ロット == 2   (10/2) > 2
        shipperLot = new BigDecimal(2);
        result = w2009CmlService.validateConsistencyOverShipLotMultiple(qty, tagQty, shipperLot);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyRegisterAuthByTransPkgReviseのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyRegisterAuthByTransPkgRevise() throws Exception {
        boolean result = false;
    
        // 権限 == null
        result = w2009CmlService.validateConsistencyRegisterAuthByTransPkgRevise(null);
        assertThat(result, is(false));

        // 権限 == "0"
        result = w2009CmlService.validateConsistencyRegisterAuthByTransPkgRevise("0");
        assertThat(result, is(false));

        // 権限 == "1"
        result = w2009CmlService.validateConsistencyRegisterAuthByTransPkgRevise("1");
        assertThat(result, is(false));
        
        // 権限 == "2"
        result = w2009CmlService.validateConsistencyRegisterAuthByTransPkgRevise("2");
        assertThat(result, is(true));
    }
        
    /**
     * <br />validateConsistencyRegistPkgのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyRegistPkg() throws Exception {
        boolean result = false;
    
        // パッケージング確定フラグ  == null
        result = w2009CmlService.validateConsistencyRegistPkg(null);
        assertThat(result, is(true));

        // 権限 == "Y"
        result = w2009CmlService.validateConsistencyRegistPkg("Y");
        assertThat(result, is(true));

        // 権限 == "N"
        result = w2009CmlService.validateConsistencyRegistPkg("N");
        assertThat(result, is(false));
    }
    
    /**
     * 
     * <br />validateConsistencyShipperPlantAuth のテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyShipperPlantAuth() throws Exception {
        boolean result = false;
        
        // shipperCd == null, plntCd == null
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = w2009CmlService.validateConsistencyShipperPlantAuth(null, null);
        assertThat(result, is(false));

        // 組み合わせ（正）
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", true);
        result = w2009CmlService.validateConsistencyShipperPlantAuth("MA8", "M2");
        assertThat(result, is(true));

        // 組み合わせ（不正）
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = w2009CmlService.validateConsistencyShipperPlantAuth("MA8", "T2");
        assertThat(result, is(false));
        
    }
    
    /**
     * <br />validateConsistencySingleItemNoのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencySingleItemNo() throws Exception {
        boolean result = false;
        
        // list == null
        result = w2009CmlService.validateConsistencySingleItemNo(null);
        assertThat(result, is(true));

        // list == 1件
        List<String> list = new ArrayList<String>();
        list.add("S");
        result = w2009CmlService.validateConsistencySingleItemNo(list);
        assertThat(result, is(true));

        // list == 2件 ("S"を含む)
        list.clear();
        list.add("S");
        list.add("R");
        result = w2009CmlService.validateConsistencySingleItemNo(list);
        assertThat(result, is(false));

        // list == 2件 ("S"を含まない)
        list.clear();
        list.add("R");
        list.add("R");
        result = w2009CmlService.validateConsistencySingleItemNo(list);
        assertThat(result, is(true));

        // list == 3件 ("S"を含まない)
        list.clear();
        list.add("R");
        list.add("R");
        list.add("R");
        result = w2009CmlService.validateConsistencySingleItemNo(list);
        assertThat(result, is(true));

        // list == 3件 ("S"を含む)
        list.clear();
        list.add("R");
        list.add("S");
        list.add("R");
        result = w2009CmlService.validateConsistencySingleItemNo(list);
        assertThat(result, is(false));

    }
    
    /**
     * <br />validateConsistencyStagingCdのテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateConsistencyStagingCd() throws Exception {
        boolean result = false;
        
        // list == null
        result = w2009CmlService.validateConsistencyStagingCd(null);
        assertThat(result, is(true));

        // list == 1件 ("D"のみ)
        List<String> list = new ArrayList<String>();
        list.add("D");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 1件 ("B"のみ)
        list.clear();
        list.add("B");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 2件 ("B"のみ)
        list.clear();
        list.add("B");
        list.add("B");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 2件 ("D"のみ)
        list.clear();
        list.add("D");
        list.add("D");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 3件 ("D"と"F")
        list.clear();
        list.add("D");
        list.add("F");
        list.add("D");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 3件 ("B"と"F")
        list.clear();
        list.add("B");
        list.add("B");
        list.add("F");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(true));

        // list == 3件 ("D", "B")
        list.clear();
        list.add("B");
        list.add("D");
        list.add("D");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(false));

        // list == 3件 ("D", "B", "F")
        list.clear();
        list.add("B");
        list.add("D");
        list.add("F");
        result = w2009CmlService.validateConsistencyStagingCd(list);
        assertThat(result, is(false));

    }
    
//////////////////////////////W2009CmlService.validateDatabaseXXX メソッドの確認 ////////////////////////////////////////
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
        result = w2009CmlService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(false));
        
        // CIGMA利用可
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", true);
        result = w2009CmlService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(true));
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
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperCustomerShipTo", false);
        result = w2009CmlService.validateDatabaseShipperCustomerShipTo("TG0", "2", "3");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperCustomerShipTo", true);
        result = w2009CmlService.validateDatabaseShipperCustomerShipTo("TG0", "2", "3");
        assertThat(result, is(true));
    }
    
    /**
     * validateDatabaseShipperOnHeaderMoveToCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperOnHeaderMoveToCreate() throws Exception {
        
        // エラーなし
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipper", true);
        boolean result1 = w2009CmlService.validateDatabaseShipperOnHeaderMoveToCreate("SHIP0001");
        assertEquals(true,  result1);
        
        // エラーなし
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipper", false);
        boolean result2 = w2009CmlService.validateDatabaseShipperOnHeaderMoveToCreate("SHIP0001");
        assertEquals(false, result2);

    }
    
    /**
     * validateDatabaseShipperWhPlantOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlantOnRegister() throws Exception {
        boolean result = false;
        
        // 組み合わせ (不正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperWhPlant", false);
        result = w2009CmlService.validateDatabaseShipperWhPlantOnRegister("TG0", "6", "5");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperWhPlant", true);
        result = w2009CmlService.validateDatabaseShipperWhPlantOnRegister("TG0", "6", "5");
        assertThat(result, is(true));

    }
    
    /**
     * validateDatabaseTmCigmaCustomerXrefOnRegisterByCompテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaCustomerXrefOnRegisterByComp() throws Exception {

        // エラー：荷受人存在チェック 存在しない
        String compCd = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByComp("MYB", "TEST");
        assertThat(compCd, is(nullValue()));

        // 正常：データ存在あり
        compCd = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByComp("MYB", "30001205");
        assertThat(compCd, is("MYB"));
    }
    
    /**
     * validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCdテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        // shipperCd = "MY8"、 outerCd = ""
        String error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd("MY8", "", criteria);
        assertThat(error, is(nullValue()));
        
        // エラー：外装記号に存在しない
        MockObjectManager.addReturnNull(TmPkgSetHdrServiceImpl.class, "searchByKey");
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd("MY8", "7777", criteria);
        assertThat(error, is(NXS_E7_0147));
        
        // エラー：volumeUnit, volume, lengthUnit, length, width, heightの項目にNULLが存在する場合
        TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
        tmPkgSetHdrDomain.setVolumeUnit("");
        tmPkgSetHdrDomain.setVolume(null);
        tmPkgSetHdrDomain.setLengthUnit("");
        tmPkgSetHdrDomain.setLength(null);
        tmPkgSetHdrDomain.setWidth(null);
        tmPkgSetHdrDomain.setHeight(null);
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdrDomain);
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd("MY8", "7777", criteria);
        assertThat(error, is(NXS_E7_0156));
        
        // 正常：外装記号に存在し、volumeUnit, volume, lengthUnit, length, width, heightの項目にNULLなし
        tmPkgSetHdrDomain.setVolumeUnit("KG");
        tmPkgSetHdrDomain.setVolume(new BigDecimal(10));
        tmPkgSetHdrDomain.setLengthUnit("MR");
        tmPkgSetHdrDomain.setLength(new BigDecimal(1.13));
        tmPkgSetHdrDomain.setWidth(new BigDecimal(1));
        tmPkgSetHdrDomain.setHeight(new BigDecimal(5));
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdrDomain);
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByOuterCd("MY8", "7777", criteria);
        assertThat(error, is(nullValue()));
        
    }
    
    /**
     * validateDatabaseTmCigmaCustomerXrefOnRegisterByShipperテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaCustomerXrefOnRegisterByShipper() throws Exception {

        // エラー：荷受人存在チェック 存在しない
        String compCd = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper("TEST", "01205", "00");
        assertThat(compCd, is(nullValue()));

        // 正常：データ存在あり
        compCd = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnRegisterByShipper("MYB", "30001205", "00");
        assertThat(compCd, is("MYB"));
    }
    
    /**
     * validateDatabaseTmCigmaCustomerXrefOnTransReviseRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaCustomerXrefOnTransReviseRegister() throws Exception {
        
        // shipperCd = "MY8"、 outerCd = ""
        String error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister("MY8", "");
        assertThat(error, is(nullValue()));
        
        // エラー：外装記号に存在しない
        MockObjectManager.addReturnNull(TmPkgSetHdrServiceImpl.class, "searchByKey");
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister("MY8", "7777");
        assertThat(error, is(NXS_E7_0147));
        
        // エラー：volumeUnit, volume, lengthUnit, length, width, heightの項目にNULLが存在する場合
        TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
        tmPkgSetHdrDomain.setVolumeUnit("");
        tmPkgSetHdrDomain.setVolume(null);
        tmPkgSetHdrDomain.setLengthUnit("");
        tmPkgSetHdrDomain.setLength(null);
        tmPkgSetHdrDomain.setWidth(null);
        tmPkgSetHdrDomain.setHeight(null);
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdrDomain);
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister("MY8", "7777");
        assertThat(error, is(NXS_E7_0156));
        
        // 正常：外装記号に存在し、volumeUnit, volume, lengthUnit, length, width, heightの項目にNULLなし
        tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
        tmPkgSetHdrDomain.setVolumeUnit("KG");
        tmPkgSetHdrDomain.setVolume(new BigDecimal(10));
        tmPkgSetHdrDomain.setLengthUnit("MR");
        tmPkgSetHdrDomain.setLength(new BigDecimal(1.13));
        tmPkgSetHdrDomain.setWidth(new BigDecimal(1));
        tmPkgSetHdrDomain.setHeight(new BigDecimal(5));
        MockObjectManager.addReturnValue(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdrDomain);
        error = w2009CmlService.validateDatabaseTmCigmaCustomerXrefOnTransReviseRegister("MY8", "7777");
        assertThat(error, is(nullValue()));
    }
    
    /**
     * validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate() throws Exception {

        // レコードが存在しない場合
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<UserAuthDomain> authList = new ArrayList<UserAuthDomain>();
        
        // エラー：レコードが存在しない場合
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setServerId("MYS");
        UserAuthDomain auth  = new UserAuthDomain();
        auth.setAuthMgtComp("MYB");
        auth.setProcMfgDivCd("TEST"); // PLAT_CD = TEST 追加
        authList.add(auth);
        criteria.setUserAuthList(authList);
        List<? extends W2009CmlDomain> result = w2009CmlService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(criteria);
        assertThat(result.isEmpty(), is(true));
        
        // エラー：片方しか権限がない場合
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setServerId("MYS");
        auth  = new UserAuthDomain();
        auth.setAuthMgtComp("MYB");
        auth.setProcMfgDivCd("M1");  // PLAT_CD = M1 追加
        authList.add(auth);
        criteria.setUserAuthList(authList);
        List<? extends W2009CmlDomain> result2 = w2009CmlService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(criteria);
        assertThat(result2.isEmpty(), is(true));

        // 正常：レコードあり
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setServerId("MYS");
        auth  = new UserAuthDomain();
        auth.setAuthMgtComp("MYB");
        auth.setProcMfgDivCd("M7");  // PLAT_CD = M2 追加
        authList.add(auth);
        List<? extends W2009CmlDomain> result3 = w2009CmlService.validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(criteria);        
        assertThat(result3.get(0).getLgcyWhCd(), is("1"));
        
    }
    
    /**
     * validateDatabaseTmPkgMaterialsOnDetailテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnDetail() throws Exception {
        boolean result = false;
        
        // 正常　データあり
        MockObjectManager.addReturnValue(TmPkgMtrlServiceImpl.class, "searchCount", 10);
        result = w2009CmlService.validateDatabaseTmPkgMaterialsOnDetail("MY8", "PKGITEMENO-001");
        assertThat(result, is(true));

        // エラー　データなし
        MockObjectManager.addReturnValue(TmPkgMtrlServiceImpl.class, "searchCount", 0);
        result = w2009CmlService.validateDatabaseTmPkgMaterialsOnDetail("M5", "PKGITEMENO-01");
        assertThat(result, is(false));

    }
    
    /**
     * validateDatabaseTmPkgSpecificationDtlOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtlOnRegister() throws Exception {
       
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 正常ケース (shipperCd = "MY8"、 trnsCd = "S"、itemNo = "A002TB0091B3N", pkgCd = "110")
        String error = w2009CmlService.validateDatabaseTmPkgSpecificationDtlOnRegister("MY8", "S", "A002TB0091B3N", "110", criteria);
        assertThat(error, is(nullValue()));

        // エラー（該当件数なし） (shipperCd = "MY8"、 trnsCd = "T"、itemNo = "A00TB0091B3N", pkgCd = "11")
        error = w2009CmlService.validateDatabaseTmPkgSpecificationDtlOnRegister("MY8", "T", "A00TB0091B3N", "11", criteria);
        assertThat(error, is(NXS_E7_0155));

        // エラー（容積情報チェック） (shipperCd = "MY8"、 trnsCd = "T"、itemNo = "A002TB0091B3N", pkgCd = "110")
        error = w2009CmlService.validateDatabaseTmPkgSpecificationDtlOnRegister("MY8", "T", "A002TB0091B3N", "110", criteria);
        assertThat(error, is(NXS_E7_0155));
        

    }
    
    /**
     * validateDatabaseTtMixedTagOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtMixedTagOnRegister() throws Exception {
       
        // mixTagFlg = ""、mixTagNo = "1"の場合　チェックしないためOK
        String error = w2009CmlService.validateDatabaseTtMixedTagOnRegister("", "1");
        assertThat(error, is(nullValue()));

        // mixTagFlg = "N"、mixTagNo = "1"の場合　チェックしないためOK
        error = w2009CmlService.validateDatabaseTtMixedTagOnRegister("N", "1");
        assertThat(error, is(nullValue()));
        
        // レコードが存在しない場合
        MockObjectManager.addReturnNull(TtMixtagServiceImpl.class, "lockByKeyNoWait");
        error = w2009CmlService.validateDatabaseTtMixedTagOnRegister("Y", "MY81");
        assertThat(error, is(NXS_E7_0090));
        
        // エラー：ステータス不正 (20:梱包済)
        TtMixtagDomain ttMixtag = new TtMixtagDomain();
        ttMixtag.setMixTagStatus(MIX_TAG_STATUS_CML);
        MockObjectManager.addReturnValue(TtMixtagServiceImpl.class, "lockByKeyNoWait", ttMixtag);
        error = w2009CmlService.validateDatabaseTtMixedTagOnRegister("Y", "MMY7WH01405010001");
        assertThat(error, is(NXS_E1_0029));
        
        // 正常：ステータス(10)
        ttMixtag = new TtMixtagDomain();
        ttMixtag.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);        
        MockObjectManager.addReturnValue(TtMixtagServiceImpl.class, "lockByKeyNoWait", ttMixtag);
        error = w2009CmlService.validateDatabaseTtMixedTagOnRegister("Y", "MMY7WH01405010001");        
        assertThat(error, is(nullValue()));

    }
    
    /**
     * validateDatabaseTtPltzInstrItemNoOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testvalidateDatabaseTtPltzInstrItemNoOnRegister() throws Exception {
        boolean result = false;
        
        // 正常；pltzInstrNo = ""
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegister("");
        assertThat(result, is(true));
        
        // エラー：データなし
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTtPltzInstrItemNoLockBypltzInstrNoNowait");
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegister("MA8");
        assertThat(result, is(false));
        
        // 正常：データあり
        List<String> list = new ArrayList<String>();
        list.add("MA80000001");
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchTtPltzInstrItemNoLockBypltzInstrNoNowait", list);
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegister("MA80000001");
        assertThat(result, is(true));
        
    }
    
    /**
     * validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstrテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr() throws Exception {
        boolean result = false;

        // 正常：pltzInstrNo = ""、mixTagFlg = ""の場合 → チェックなし
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("", "", "", "", null, null);
        assertThat(result, is(true));

        // 正常：pltzInstrNo = "MA80000001"、mixTagFlg = "Y"の場合 → チェックなし
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("MA80000001", "Y", "", "", null, null);
        assertThat(result, is(true));

        // 正常：pltzInstrNo = "MY80000001"、mixTagFlg = "N"、mixTagNo =
        // "A002TB0091B3N"、 pkgNo = "110"
        // → packedQty = 10, qty = 0が取得される
        // instrQty = 30, qty = 5 (30-10-0) > 5 → OK
        BigDecimal instrQty = new BigDecimal(30);
        BigDecimal qty = new BigDecimal(5);
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("MA80000001", "N", "A002TB0091B3N", "110", instrQty, qty);
        assertThat(result, is(true));

        // 正常：instrQty = 10, qty = 5 (15-10-0) == 5 → OK
        instrQty = new BigDecimal(15);
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("MA80000001", "N", "A002TB0091B3N", "110", instrQty, qty);
        assertThat(result, is(true));

        // エラー： instrQty = 10, qty = 5 (10-10-0) < 5 → NG
        instrQty = new BigDecimal(10);
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("MA80000001", "N", "A002TB0091B3N", "110", instrQty, qty);
        assertThat(result, is(false));

        // 正常：
        // pltzInstrNo = "MY80000001"、mixTagFlg = "N"、mixTagNo = "A002TB0091B3"、
        // pkgNo = "11" →該当データなし
        instrQty = new BigDecimal(10);
        result = w2009CmlService.validateDatabaseTtPltzInstrItemNoOnRegisterByOverInstr("MA80000001", "N", "A002TB0091B3", "11", instrQty, qty);
        assertThat(result, is(true));

    }
    
    /**
     * validateDatabaseTtPltzInstrOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegister() throws Exception {
        
        // pltzInstrNo = "" の場合　チェックしないため OK
        String error = w2009CmlService.validateDatabaseTtPltzInstrOnRegister("");
        assertThat(error, is(nullValue()));
        
        // レコードが存在しない場合
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegister("TG00306001");
        assertThat(error, is(GSCM_E0_0010));
        
        // ステータス不正 (40)
        TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegister("TG00306001");
        assertThat(error, is(NXS_E1_0027));
        
        // ステータス不正 (50)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegister("TG00306001");
        assertThat(error, is(NXS_E1_0027));

        // ステータス正 (10: Instruction Created)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegister("TG00306001");
        assertThat(error, is(nullValue()));
    }
    
    /**
     * validateDatabaseTtPltzInstrOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegisterCancel() throws Exception {
        
        // pltzInstrNo = "" の場合　チェックしないため OK
        String error = w2009CmlService.validateDatabaseTtPltzInstrOnRegisterCancel("");
        assertThat(error, is(nullValue()));

        // 梱包指示チェック：レコードが存在しない場合
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegisterCancel("TEST");
        assertThat(error, is(GSCM_E0_0010));
        
        // 梱包指示番号チェック：レコードが存在しない場合
        //MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTtPltzInstrItemNoLockBypltzInstrNoNowait");
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegisterCancel("002");
        assertThat(error, is(GSCM_E0_0010));
        
        // 正常系：梱包指示、梱包指示番号に存在する場合
        error = w2009CmlService.validateDatabaseTtPltzInstrOnRegisterCancel("ADTH000001");
        assertThat(error, is(nullValue()));
        
    }
    
    /**
     * validateDatabaseTtPltzInstrOnRegisterPrintCmlテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegisterPrintCml() throws Exception {
        boolean result = false;
        
        // 正常：pltzInstrNo が未入力の場合
        result = w2009CmlService.validateDatabaseTtPltzInstrPrintCml("");
        assertThat(result, is(true));
        
        // エラー：レコードが存在しない場合
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "searchByKey");
        result = w2009CmlService.validateDatabaseTtPltzInstrPrintCml("MY80000001");
        assertThat(result, is(false));
        
        // エラー：ステータス不正 (40)
        TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "searchByKey", ttPltzInstr);
        result = w2009CmlService.validateDatabaseTtPltzInstrPrintCml("MY80000001");
        assertThat(result, is(false));
        
        // 正常： ステータス（50)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrNo("MY80000005");
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "searchByKey", ttPltzInstr);
        result = w2009CmlService.validateDatabaseTtPltzInstrPrintCml("MY80000001");
        assertThat(result, is(true));
        
    }
    
    /**
     * validateDatabaseTtPltzInstrOnTransRevisePrintCmlテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnTransRevisePrintCml() throws Exception {
        boolean result = false;
        
        // 正常：mainMark が未入力の場合
        result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml("");
        assertThat(result, is(true));
        
        // エラー：レコードが存在しない場合
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml("DMY8000000000000001");
        assertThat(result, is(true));

        // 正常：pltzInstr = nullの場合
        TtPltzInstrDomain ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml("DMY8000000000000001");
        assertThat(result, is(true));

        // エラー：ステータス不正 (40)
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setMainMark("DMA8000140101000011");
        ttPltz.setPltzInstrNo("MY80000001");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "searchByKey", ttPltz);
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrNo("MY80000001");
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml("DMY8000000000000001");
        assertThat(result, is(false));
        
        // 正常： ステータス（50)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml("DMY8000000000000001");
        assertThat(result, is(true));
    }
    
    /**
     * validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain(); 
        TtPltzInstrDomain ttPltzInstrDomain = new TtPltzInstrDomain();
        List<String> errorList = new ArrayList<String>();
        
        // 正常：criteria.getPltzInstrRequired() が未設定の場合 チェックしない
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList, is(nullValue()));

        // 正常：criteria.getPltzInstrRequired() が"N"の場合 チェックしない
        criteria.setPltzInstrRequired("N");
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList, is(nullValue()));
        
        // エラー：criteria.getPltzInstrRequired() が"Y"の場合に、梱包指示情報が存在しない場合
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("TEST");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0047));
        
        // エラー：梱包指示書印刷エラー：ステータス：10
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000010");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0086));
        
        // エラー：梱包完了済みチェックエラー　ステータス：40
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000040");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0048));

        // エラー：梱包完了済みチェックエラー　ステータス：50
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000050");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0048));

        // エラー： NEXUS倉庫情報取得
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000151");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(GSCM_E0_0030));
        
        // エラー：梱包指示書印刷エラー：ステータス：10 かつ　NEXUS倉庫情報取得エラー
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000154");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0086));
        assertThat(errorList.get(1), is(GSCM_E0_0030));
        
        // エラー：梱包完了済みチェックエラー　ステータス：40 かつNEXUS倉庫情報取得エラー
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0000152");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList.get(0), is(NXS_E7_0048));
        assertThat(errorList.get(1), is(GSCM_E0_0030));

        // 正常： ステータスおよびNEXUS倉庫情報取得
        criteria.setPltzInstrRequired("Y");
        criteria.setPltzInstrNo("MYB0613001");
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        errorList = new ArrayList<String>();
        errorList = w2009CmlService.validateDatabaseTtPltzInstrTmCigmaWhXrefOnHeaderMoveToCreate(criteria, ttPltzInstrDomain);
        assertThat(errorList, is(nullValue()));
        
    }
    
    /**
     * validateDatabaseTtPltzItemOnTransReviseRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzItemOnTransReviseRegister() throws Exception {
        
        // 正常：データあり MAIN_MARK = "DMY8000140101000001"
        String errorCd = w2009CmlService.validateDatabaseTtPltzItemOnTransReviseRegister("DMY8000140101000001");
        assertThat(errorCd, is(nullValue()));
        
        // エラー：MAIN_MARK = "TEST"
        errorCd = w2009CmlService.validateDatabaseTtPltzItemOnTransReviseRegister("TEST");
        assertThat(errorCd, is(GSCM_E0_0010));

        // エラー：MAIN_MARK  = ""
        errorCd = w2009CmlService.validateDatabaseTtPltzItemOnTransReviseRegister("");
        assertThat(errorCd, is(GSCM_E0_0010));
    }

    
    /**
     * validateDatabaseTtPltzOnMainTransPkgReviseテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnMainTransPkgRevise() throws Exception {

        // エラー：データなし
        MockObjectManager.addReturnNull(TtPltzServiceImpl.class, "lockByKeyNoWait");
        List<String> errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("MY8");
        assertThat(errorList.get(0), is(GSCM_E0_0010));

        // エラー：パレタイズステータスチェックエラー(""　未設定)
        // エラー：まとめパレタイズチェック xmainMark ≠ "" の場合はエラー
        // エラー：搬出・搬入のチェック　lastTrStatus = "20"の場合エラー
        TtPltzDomain ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus("");
        ttpltz.setXmainMark("TEST");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ISSUE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("DMY8000000000000001");
        assertThat(errorList.get(0), is(NXS_E1_0006));
        assertThat(errorList.get(1), is(NXS_E1_0006));
        assertThat(errorList.get(2), is(NXS_E1_0030));
        
        // エラー：パレタイズステータスチェックエラー(20)
        // エラー：搬出・搬入のチェック　lastTrStatus = "30"の場合エラー
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus("20");
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ACTIVATE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("DMY8000000000000001");
        assertThat(errorList.get(0), is(NXS_E1_0006));
        assertThat(errorList.get(1), is(NXS_E1_0030));
            
        // エラー：移行CMLチェック migrationFlg = "Y"の場合エラー
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        ttpltz.setMigrationFlg(FLAG_Y);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("DMY8000000000000001");
        assertThat(errorList.get(0), is(NXS_E1_0025));
                
        // 正常
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        ttpltz.setMigrationFlg("");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("DMY8000000000000001");
        assertThat(errorList, is(nullValue()));

        // 正常
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        ttpltz.setMigrationFlg(FLAG_N);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnMainTransPkgRevise("DMY8000000000000001");
        assertThat(errorList, is(nullValue()));

    }

    /**
     * validateDatabaseTtPltzOnRegisterCancel テスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnRegisterCancel() throws Exception {

        // エラー：データ存在なし
        MockObjectManager.addReturnNull(TtPltzServiceImpl.class, "lockByKeyNoWait");
        List<String> errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(GSCM_E0_0010));

        // エラー：パレタイズステータスチェックエラー(""　未設定)
        TtPltzDomain ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus("");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(NXS_E1_0006));

        // エラー：パレタイズステータスチェックエラー(20)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(NXS_E1_0006));
        
        // エラー：まとめパレタイズチェック（xmainMark = "11")
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("11");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(NXS_E1_0006));

        // エラー： 搬出・搬入のチェック (lastTrStatus = 20)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ISSUE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(NXS_E1_0047));

        // エラー： 搬出・搬入のチェック (lastTrStatus = 30)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ACTIVATE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList.get(0), is(NXS_E1_0047));
            
        // エラー：パレタイズ対象品チェックエラー（データなし)
        // エラー：パレタイズ対象品受注情報チェックエラー（データなし）
        // エラー：パレタイズ対象品かんばん情報チェック（データなし）
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTtPltzItemLockByMainMarkNowai");
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTtPltzItemOdrLockByMainMarkNowait");
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTtPltzKanbanLockByMainMarkNowait");
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA800014010100001");
        assertThat(errorList.get(0), is(NXS_E1_0047));
        assertThat(errorList.get(1), is(GSCM_E0_0010));
        assertThat(errorList.get(2), is(GSCM_E0_0010));
            
        // 正常系：
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_RECEIVED_AT_TO);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMA8000140101000015");
        mainMarkList.add("DMA8000140101000016");
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchTtPltzItemLockByMainMarkNowai", mainMarkList);
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchTtPltzItemOdrLockByMainMarkNowait", mainMarkList);
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchTtPltzKanbanLockByMainMarkNowait", mainMarkList);
        errorList = w2009CmlService.validateDatabaseTtPltzOnRegisterCancel("DMA8000140101000015");
        assertThat(errorList, is(nullValue()));
    }

    /**
     * validateDatabaseTtPltzOnTransReviseRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnTransReviseRegister() throws Exception {
       
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        boolean result = false;
        
        // エラー：データ存在なし
        MockObjectManager.addReturnNull(TtPltzServiceImpl.class, "lockByKeyNoWait");
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(GSCM_E0_0010));

        // エラー：パレタイズステータスチェックエラー(""　未設定)
        TtPltzDomain ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus("");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E1_0006));

        // エラー：パレタイズステータスチェックエラー(20)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E1_0006));
        
        // エラー：まとめパレタイズチェック（xmainMark = "11")
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("11");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E1_0006));

        // エラー： 搬出・搬入のチェック (lastTrStatus = 20)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ISSUE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E1_0030));

        // エラー： 搬出・搬入のチェック (lastTrStatus = 30)
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_ACTIVATE_TR);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(false));
        assertThat(errorMessages.size(), is(1));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E1_0030));

        // 正常： 
        ttpltz = new TtPltzDomain();
        ttpltz.setPltzStatus(PLTZ_STATUS_PLTZ);
        ttpltz.setXmainMark("");
        ttpltz.setLastTrStatus(CARRY_OUT_IN_BLANK);
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "lockByKeyNoWait", ttpltz);
        errorMessages.clear();
        result = w2009CmlService.validateDatabaseTtPltzOnTransReviseRegister("DMY8000000000000001", new W2009CmlCriteriaDomain(), errorMessages);
        assertThat(result, is(true));
        assertThat(errorMessages.size(), is(0));
    }

    /**
     * validateDatabaseTwPltzItemItemNoOnCreateMoveToRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwPltzItemItemNoOnCreateMoveToRegister() throws Exception {
        boolean result = false;
        
        // エラー：レコードが存在しない場合
        result = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateMoveToRegister("TEST");
        assertThat(result, is(false));
        
        // エラー：レコードが存在する場合
        result = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateMoveToRegister("smz084");
        assertThat(result, is(true));
        
    }

    /**
     * <br />validateDatabaseTwPltzItemItemNoOnCreateUpdateテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTwPltzItemItemNoOnCreateUpdate1() throws Exception {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        // - コンテナ層別キーチェック
        criteria.setLoginUserDscId("smz081");
        List<W2009CmlItemDomain> list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate(); 
        List<String> errorMessages = null;
        list.get(0).setContainerSortingKey("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0101));
        
        // - インボイスキーチェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setInvoiceKey("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0103));
        
        // - 荷揃え指示フラグチェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setStgInstrItemFlg("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0104));
        
        // - 通関タイミング区分チェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setCustomTimingTyp("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0105));
        
        // - コンテナルーズチェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setContainerLooseTyp("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0106));
        
        // - 梱包形態チェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setPkgFormTyp("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0107));
        
        // - 通貨チェック
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate();
        errorMessages.clear();
        list.get(0).setCurrCd("TEST");
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0108));
        
        
        // - 荷積み位置コードチェック
        criteria.setLoginUserDscId("smz082"); // Loading_Cd = "B" のデータがある
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate(); 
        errorMessages.clear();
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0102));
        
        // - 単品品目番号チェック
        criteria.setLoginUserDscId("smz083");
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate(); 
        list.get(0).setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        list.get(0).setPkgCd("TEST");
        errorMessages.clear();
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages.get(0), is(NXS_E7_0051));

        // twPltzItemItemNo データなしの場合
        criteria.setLoginUserDscId("TEST");
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate(); 
        errorMessages.clear();
        errorMessages = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertNull(errorMessages);
        
        // twPltzItemItemNo 登録データ 999件超えの場合
        criteria.setLoginUserDscId("smz084");
        List<String> errorMessages2 = null;
        list = w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate(); 
        errorMessages2 = w2009CmlService.validateDatabaseTwPltzItemItemNoOnCreateUpdate(criteria, list);
        assertThat(errorMessages2.get(0), is(NXS_E7_0050));
    }

    
    /**
     * <br />validateDatabaseTwPltzItemItemNoOnCreateUpdateテスト用のドメインリストを返す。
     *
     * @return W2009CmlItemDomain のリスト
     */
    private List<W2009CmlItemDomain> w2009CmlItemList4TestValidateDatabaseTwPltzItemItemNoOnCreateUpdate() {
        List<W2009CmlItemDomain> itemDomainList = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        
        itemDomain.setSelected(CHECK_ON);
        itemDomain.setContainerSortingKey("ZA001001");
        itemDomain.setInvoiceKey("NMY");
        itemDomain.setStgInstrItemFlg("N");
        itemDomain.setCustomTimingTyp("A");
        itemDomain.setContainerLooseTyp("C");
        itemDomain.setPkgFormTyp("M");
        itemDomain.setCurrCd("002");
        itemDomain.setPltzItemNo("A002TB0091B02N");
        itemDomain.setLoadingCd(LOADING_CD_DOOR);
        itemDomain.setDisableFlg(FLAG_N);
        
        itemDomainList.add(itemDomain);
        
        return itemDomainList;
    }

    /**
     * validateDatabaseWhCompanyWhテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseWhCompanyWh() throws Exception {

        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateCompWh", true);
        boolean result1 = w2009CmlService.validateDatabaseWhCompanyWh("TG0", "A101");
        assertEquals(true,  result1);
        
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateCompWh", false);
        boolean result2 = w2009CmlService.validateDatabaseWhCompanyWh("TG0", "A101");
        assertEquals(false, result2);
    
    }


    /**
     * validateDatabaseTtMixedtagAuthOnCreateUpdateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtMixedtagAuthOnCreateUpdate()
        throws Exception {
        List<UserAuthDomain> authList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setProcMfgDivCd("M1");
        authList.add(userAuthDomain);


        List<TtMixtagItemNoDomain> ttMixtagList = new ArrayList<TtMixtagItemNoDomain>();
        MockObjectManager.addReturnValue(TtMixtagItemNoServiceImpl.class, "searchByCondition", ttMixtagList);
        boolean result1 = w2009CmlService.validateDatabaseTtMixedtagAuthOnCreateUpdate("MMY8WH00000000001", authList); // データが取得できない場合
        
        TtMixtagItemNoDomain mixtagItemDom = new TtMixtagItemNoDomain();
        mixtagItemDom.setPlntCd("M1");
        ttMixtagList = new ArrayList<TtMixtagItemNoDomain>();
        ttMixtagList.add(mixtagItemDom);
        MockObjectManager.addReturnValue(TtMixtagItemNoServiceImpl.class, "searchByCondition", ttMixtagList);
        boolean result2 = w2009CmlService.validateDatabaseTtMixedtagAuthOnCreateUpdate("MMY8WH00000000001", authList); // M1のみの場合
        
        TtMixtagItemNoDomain mixtagItemDom2 = new TtMixtagItemNoDomain();
        mixtagItemDom2.setPlntCd("M9");
        ttMixtagList.add(mixtagItemDom2);
        MockObjectManager.addReturnValue(TtMixtagItemNoServiceImpl.class, "searchByCondition", ttMixtagList);
        boolean result3 = w2009CmlService.validateDatabaseTtMixedtagAuthOnCreateUpdate("MMY8WH00000000001", authList); // M9がある場合

        assertEquals(true, result1);
        assertEquals(true, result2);
        assertEquals(false, result3);
    }

    // ------------------------- search -----------------------------------

    /**
     * <br />
     * searchCountForPagingOnMainSearchテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountForPagingOnMainSearch() throws Exception {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setBaseAuthFlg("1");
        criteria.setPlntCd("M1");
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setMainMark("DMYB11504300001");
        criteria.setServerId("MYS");
        criteria.setLocale(new Locale("en"));

        int result = w2009CmlService.searchCountForPagingOnMainSearch(criteria);
        assertThat(result, is(1));
    }

    /**
     * <br />
     * searchCountOnRegisterテスト 
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountOnRegister1() throws Exception {

        // パターン: 処理モード：登録 の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        // 検索条件
        criteria.setLoginUserDscId("smz0Z");
        int result = w2009CmlService.searchCountOnRegister(criteria);
        // 件数
        assertThat(result, is(1));
    }

    /**
     * <br />
     * searchCountOnRegisterテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountOnRegister2() throws Exception {

        // パターン: 処理モード：参照 の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_REF);
        // 検索条件
        criteria.setMainMark("DMYB11505010007");
        criteria.setServerId("MYS");
        criteria.setLocale(new Locale("en"));
        int result = w2009CmlService.searchCountOnRegister(criteria);
        // 件数
        assertThat(result, is(1));
    }
    
    /**
     * <br />searchCountOnRegisterDeleteテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchCountOnRegisterDelete() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setLoginUserDscId("smz1Z");
        int result = w2009CmlService.searchCountOnRegisterDelete(criteria);
        // 件数
        assertThat(result, is(1));
    }

    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch1() throws Exception {
        
        // パターン: Palletize Instr. No が "" でない、CIGMA倉庫コードを選択 の場合
        
        // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(WS_RESULT_SUCCESS, WS2004_RESULT_ITEMS);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class, "searchItemInfoForCml", ws2004Result);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setPltzInstrNo("MYB0423001");
        criteria.setPlntCd("M1");
        criteria.setLoginUserDscId("smz07");
        criteria.setShipperTimezoneDt(DateUtil.parseDate("2014/06/09", "yyyy/MM/dd"));
        criteria.setLocale(new Locale("en"));
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnCreateSearch(criteria);
        assertThat(result, is(notNullValue()));
        // 件数
        assertThat(result.size(), is(2));
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch2() throws Exception {
        
        // パターン: Palletize Instr. No が ""、NEXUS倉庫コードを選択 の場合
        
        // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(WS_RESULT_SUCCESS, WS2004_RESULT_ITEMS);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class, "searchItemInfoForCml", ws2004Result);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setPltzInstrNo(null);
        
        criteria.setLoginUserDscId("smz07");
        criteria.setPlntCd(""); // NEXUS倉庫コードを選択 の場合
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setLgcyWhCd("1");
        criteria.setTrnsCd("S");
        criteria.setShipperTimezoneDt(DateUtil.parseDate("2014/06/09", "yyyy/MM/dd"));
        //criteria.setPkgFormTyp("S");
        criteria.setStgInstrItemFlg("N");
        criteria.setMixTagNo("");
        
        criteria.setBaseAuthFlg("2");
        criteria.setPackingWhCd("WH01");
        criteria.setPackingWhCompCd("MYB");
        
        criteria.setServerId("MYS");

        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnCreateSearch(criteria);
        assertThat(result, is(notNullValue()));
        // 件数
        //assertThat(result.size(), is(61));
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch3() throws Exception {
        
        // パターン: パターン: Palletize Instr. No が "" の場合（エラー）
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        criteria.setMixTagNo("TEST");
        try {
            w2009CmlService.searchForPagingOnCreateSearch(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("GSCM-E0-0001"));
        }
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch4() throws Exception {
        
        // パターン: 0件
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("TEST");
        try {
            w2009CmlService.searchForPagingOnCreateSearch(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("GSCM-E0-0001"));
        }
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch5() throws Exception {
        
        // パターン: 最大件数超過
        
        // searchMixTagItemNoOnCreateの戻り値 ダミー設定
        List<W2009CmlItemDomain> searchResultList = new ArrayList<W2009CmlItemDomain>();
        for (int i = 0; i < SEARCH_MAX_COUNT + 1; i++ ) {
            searchResultList.add(new W2009CmlItemDomain());
        }
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchMixTagItemNoOnCreate", searchResultList);
        
        // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(WS_RESULT_SUCCESS, null);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class, "searchItemInfoForCml", ws2004Result);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("TEST");
        try {
            w2009CmlService.searchForPagingOnCreateSearch(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("GSCM-E0-0003"));
        }
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch6() throws Exception {
        
        // パターン: Webサービスエラー
        
        // searchMixTagItemNoOnCreateの戻り値 ダミー設定
        List<W2009CmlItemDomain> searchResultList = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setPltzItemNo("TEST");
        cmlItem.setMixTagFlg(FLAG_N);
        searchResultList.add(cmlItem);
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchMixTagItemNoOnCreate", searchResultList);
        
        // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(WS_RESULT_ERROR, null);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class, "searchItemInfoForCml", ws2004Result);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("TEST");
        criteria.setPlntCd("TEST");
        try {
            w2009CmlService.searchForPagingOnCreateSearch(criteria);
            fail("Exception 未発生");
        } catch (SystemException e) {
            assertThat(e.getCode(), is("NXS-91-0001"));
        }
    }
    
    /**
     * <br />searchForPagingOnCreateSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch7() throws Exception {
        
        // パターン: NEXUS倉庫コードを選択、倉庫コードを取得できない場合
        
        // searchMixTagItemNoOnCreateの戻り値 ダミー設定
        List<W2009CmlItemDomain> searchResultList = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setPltzItemNo("TEST");
        cmlItem.setMixTagFlg(FLAG_N);
        searchResultList.add(cmlItem);
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchMixTagItemNoOnCreate", searchResultList);
        
        // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(WS_RESULT_ERROR, null);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class, "searchItemInfoForCml", ws2004Result);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("TEST");
        criteria.setPlntCd(null);
        try {
            w2009CmlService.searchForPagingOnCreateSearch(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E1-0049"));
        }
    }

    /**
     * <br />searchForPagingOnMainSearchテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch() throws Exception {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();


        // BALLユーザの場合
        // 検索条件
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setMainMark("DMYB11504170002");
        criteria.setServerId("MYS");
        criteria.setLocale(new Locale("en"));
        criteria.setRowNumFrom(0);
        criteria.setRowNumTo(50);
        List<? extends W2009CmlDomain> result = w2009CmlService
            .searchForPagingOnMainSearch(criteria);
        assertThat(result, is(notNullValue()));
        // 件数
        assertThat(result.size(), is(1));

        // 一般のユーザの場合
        // 検索条件
        List<UserAuthDomain> authList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setProcMfgDivCd("M1");
        userAuthDomain.setAuthMgtComp("MYB");
        userAuthDomain.setAuthority("1");
        authList.add(userAuthDomain);

        W2009CmlCriteriaDomain criteria2 = new W2009CmlCriteriaDomain();
        criteria2.setBaseAuthFlg("0");
        criteria2.setShipperCd("MYB");
        criteria2.setMainMark("DMYB1150417000");
        criteria2.setServerId("MYS");
        criteria2.setLocale(new Locale("en"));
        criteria2.setRowNumFrom(0);
        criteria2.setRowNumTo(50);
        criteria2.setUserAuthList(authList);
        List<? extends W2009CmlDomain> result2 = w2009CmlService
            .searchForPagingOnMainSearch(criteria2);
        assertThat(result2, is(notNullValue()));
        // 件数
        assertThat(result2.size(), is(5));

    }

    /**
     * <br />searchOnRegisterDeleteテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterDelete() throws Exception {
        
        // searchOnRegisterInitByFromCreate を呼び出しているだけなので呼ぶだけ
        // searchOnRegisterInitByFromCreate のテストは testSearchOnRegisterInitByFromCreate
        // で行う
        
        try {
            w2009CmlService.searchOnRegisterDelete(null);
        } catch (Exception e) {
        }
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit1() throws Exception {
        
        // パターン: 画面W2009からの遷移、パレタイズ対象品あり の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setMainMark("DMYB11504210001");
        criteria.setBaseAuthFlg("2");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2009);
        assertThat(result, is(notNullValue()));
        // 件数
        assertThat(result.size(), is(2));
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit2() throws Exception {
        
        // パターン: 画面W2013からの遷移、パレタイズ対象品あり の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setMainMark("DMYB11504150001");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setLoginUserDscId("smz0Z");
        criteria.setLocale(new Locale("en"));
        criteria.setReviseFlg("N");
        
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2013);
        assertThat(result, is(notNullValue()));
        // 件数
        assertThat(result.size(), is(1));
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit3() throws Exception {
        
        // パターン: TtPltz 0件 の場合
        
        // searchTmMeasureUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTmMeasureUnit");
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setMainMark("TEST");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2009);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit4() throws Exception {
        
        // パターン: VolumeUnitの数量単位原単位 0件 の場合
        
        // searchTmMeasureUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTmMeasureUnit");
        
        // ttPltzService.searchByKeyの戻り値 ダミー設定
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setVolumeUnit("TEST");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "searchByKey", ttPltz);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2009);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit5() throws Exception {
        
        // パターン: WeightUnitの数量単位原単位 0件 の場合
        
        // searchTmMeasureUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTmMeasureUnit");
        
        // ttPltzService.searchByKeyの戻り値 ダミー設定
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setVolumeUnit("LT");
        ttPltz.setWeightUnit("TEST");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "searchByKey", ttPltz);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2009);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit6() throws Exception {
        
        // パターン: 画面W2013からの遷移、単位変換エラー の場合
        
        // convertWeightUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件 (testSearchForPagingOnTransReviseInit2 と同じ条件)
        criteria.setMainMark("DMYB11504150001");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setLoginUserDscId("smz0Z");
        criteria.setLocale(new Locale("en"));
        criteria.setReviseFlg("N");
        try {
            w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2013);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit7() throws Exception {
        
        // パターン: 画面W2013からの遷移、表示用G/W 桁あふれ の場合
        
        // isWeightOverflowの戻り値 ダミー設定
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "isWeightOverflow", true);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件 (testSearchForPagingOnTransReviseInit2 と同じ条件)
        criteria.setMainMark("DMYB11504150001");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setLoginUserDscId("smz0Z");
        criteria.setLocale(new Locale("en"));
        criteria.setReviseFlg("N");
        try {
            w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2013);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }
    
    /**
     * <br />searchForPagingOnTransReviseInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseInit8() throws Exception {
        
        // パターン: 画面W2009からの遷移、パレタイズ対象品なし の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setMainMark("DMYB11504070304");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseInit(criteria, SCREEN_ID_W2009);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseRegister1() throws Exception {
        
        // パターン: パレタイズ対象品あり の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setMainMark("DMYB11504210001");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseRegister(criteria);
        assertThat(result, is(notNullValue()));
        // 件数
        assertThat(result.size(), is(2));
    }
    
    /**
     * <br />searchForPagingOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseRegister2() throws Exception {
        
        // パターン:  TtPltz 0件 の場合
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setMainMark("TEST");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseRegister(criteria);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseRegister3() throws Exception {
        
        // パターン: VolumeUnitの数量単位原単位 0件 の場合
        
        // ttPltzService.searchByKeyの戻り値 ダミー設定
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setVolumeUnit("TEST");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "searchByKey", ttPltz);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseRegister(criteria);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseRegister4() throws Exception {
        
        // パターン: WeightUnitの数量単位原単位 0件 の場合
        
        // searchTmMeasureUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(W2009CmlDaoImpl.class, "searchTmMeasureUnit");
        
        // ttPltzService.searchByKeyの戻り値 ダミー設定
        TtPltzDomain ttPltz = new TtPltzDomain();
        ttPltz.setVolumeUnit("LT");
        ttPltz.setWeightUnit("TEST");
        MockObjectManager.addReturnValue(TtPltzServiceImpl.class, "searchByKey", ttPltz);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseRegister(criteria);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />searchForPagingOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchForPagingOnTransReviseRegister5() throws Exception {
        
        // パターン: パレタイズ対象品なし の場合
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setMainMark("DMYB11504170099");
        List<? extends W2009CmlItemDomain> result = w2009CmlService.searchForPagingOnTransReviseRegister(criteria);
        assertThat(result, is(notNullValue()));
        assertThat(result.size(), is(0));
    }

    // ################################################################################
    /**
     * <br />
     * searchOnDetailInitテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnDetailInit1() throws Exception {

        // パターン: 画面W2019からの遷移 の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        // <ken-s>
        // user:smz07
        // mainmark:DMYB11506100001
        // 処理モード：1(登録)
        criteria.setLoginUserDscId("smz07A");
        criteria.setBaseAuthFlg("2");
        criteria.setMainMark("DMYB11506100001");
        criteria.setFunctionMode("1");
        
        criteria.setPackagingConfirmedFlg(FLAG_N);
        
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        W2009CmlDomain result = w2009CmlService.searchOnDetailInit(criteria, SCREEN_ID_W2019);
        assertThat(result.getCmlItemDomainList(), is(notNullValue()));
    }

    /**
     * <br />
     * searchOnDetailInitテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnDetailInit2() throws Exception {

        // パターン: 画面W2019以外からの遷移、処理モード：登録 の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        // 検索条件
        // <ken-s>
        // user:smz072
        // 処理モード：1(登録)
        criteria.setLoginUserDscId("smz072");
        criteria.setBaseAuthFlg("2");
        criteria.setFunctionMode("1");

        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");
        
        W2009CmlDomain result = w2009CmlService
            .searchOnDetailInit(criteria, "");
        assertThat(result.getCmlItemDomainList(), is(notNullValue()));
    }

    /**
     * <br />
     * searchOnDetailInitテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnDetailInit3() throws Exception {

        // パターン: 画面W2019以外からの遷移、処理モード：参照 の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_REF);
        // 検索条件
        // <ken-s>
        // user:smz07
        // mainmark:DMYB11506100001
        // 処理モード：2(参照)
        criteria.setLoginUserDscId("smz07A");
        criteria.setBaseAuthFlg("2");
        criteria.setMainMark("DMYB11506100001");
        criteria.setFunctionMode("2");

        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        // // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(
            WS_RESULT_SUCCESS, WS2004_RESULT_ITEMS);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class,
            "searchItemInfoForCml", ws2004Result);

        W2009CmlDomain result = w2009CmlService
            .searchOnDetailInit(criteria, "");
        assertThat(result, is(notNullValue()));

    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate1() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // // 検索条件
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        W2009CmlDomain result = w2009CmlService
            .searchOnRegisterInitByFromCreate(criteria);
        
        assertThat(result, is(notNullValue()));
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate2() throws Exception {

        // パターン: 外装記号が設定されていない、
        // パレタイズ対象品ワークのリストに
        // -「梱包形態区分=S」のデータ
        // -「ワーニングフラグ=Y」のデータ
        // が含まれている の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        criteria.setOuterPkgCd(null);
        // 検索条件
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        W2009CmlDomain result = w2009CmlService
            .searchOnRegisterInitByFromCreate(criteria);
        
        assertThat(result, is(notNullValue()));
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate3() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y、容積の単位変換エラー の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // 検索条件 (testSearchOnRegisterInitByFromCreate1 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        try {
            // convertVolumeUnitの戻り値 ダミー設定
            MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertVolumeUnit");

            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate4() throws Exception {

        // パターン: 外装記号が設定されていない、
        // パレタイズ対象品ワークのリストに
        // -「梱包形態区分=S」のデータ
        // -「ワーニングフラグ=Y」のデータ
        // が含まれている、
        // 容積の単位変換エラー の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        criteria.setOuterPkgCd(null);
        // 検索条件 (testSearchOnRegisterInitByFromCreate2 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("ja"));
        criteria.setTrnsCd("S");

        try {
            // convertVolumeUnitの戻り値 ダミー設定
            MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertVolumeUnit");
            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate5() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y、N/Wの単位変換エラー の場合

        // convertWeightUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // 検索条件 (testSearchOnRegisterInitByFromCreate1 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        try {
            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate6() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y、N/Wの桁あふれ の場合

        // isWeightOverflowの戻り値 ダミー設定
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "isWeightOverflow", true);

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // 検索条件 (testSearchOnRegisterInitByFromCreate1 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        try {
            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate7() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y、G/Wの単位変換エラー の場合

        // searchTwPltzItemItemNoByDscIdの戻り値 ダミー設定
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class,
            "searchTwPltzItemItemNoByDscId", new ArrayList<W2009CmlDomain>());

        // convertWeightUnitの戻り値 ダミー設定
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertWeightUnit");

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // 検索条件 (testSearchOnRegisterInitByFromCreate1 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        try {
            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromCreateテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate8() throws Exception {

        // パターン: 外装記号が設定されている、パッケージング確定フラグ=Y、G/Wの桁あふれ の場合

        // searchTwPltzItemItemNoByDscIdの戻り値 ダミー設定
        MockObjectManager.addReturnValue(W2009CmlDaoImpl.class, "searchTwPltzItemItemNoByDscId", new ArrayList<W2009CmlDomain>());

        // isWeightOverflowの戻り値 ダミー設定
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "isWeightOverflow", true);

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPackagingConfirmedFlg(FLAG_Y);
        // 検索条件 (testSearchOnRegisterInitByFromCreate1 と同じ条件)
        criteria.setLoginUserDscId("smz073");
        criteria.setBaseAuthFlg("2");
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setPltzItemNo("A002TB0091B11N");
        criteria.setLocale(new Locale("en"));
        criteria.setTrnsCd("S");

        try {
            w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is("NXS-E7-0157"));
        }
    }

    /**
     * <br />
     * searchOnRegisterInitByFromMainテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMain() throws Exception {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 検索条件
        criteria.setLoginUserDscId("smz07");
        criteria.setServerId("MYS");
        criteria.setBaseAuthFlg("2");
        criteria.setMainMark("DMYB11506100001");
        criteria.setPackagingConfirmedFlg("N");
        W2009CmlDomain result = w2009CmlService.searchOnRegisterInitByFromMain(criteria);
        
        assertThat(result, is(notNullValue()));
    }
    /**
     * <br />deleteOnInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnInit() throws Exception {
        
        // 条件
        String dscId = "smzXX";
        w2009CmlService.deleteOnInit(dscId);
    }
    
    /**
     * <br />deleteOnHeaderInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnHeaderInit() throws Exception {
        
        // 条件
        String dscId = "smzXX";
        w2009CmlService.deleteOnHeaderInit(dscId);
    }
    
    
    /**
     * <br />deleteOnHeaderInitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteOnRegisterDelete() throws Exception {
        
        // パターン: Mix Tag Flg が "Y" の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        criteria.setLoginUserDscId("smzX1"); // DSC_ID
        
        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_Y);
        cmlItem.setMixTagNo("MIXTAGNO0000"); // MIX_TAG_NO
        w2012List.add(cmlItem);
        
        cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setPltzItemNo("A002TB0091B3N04"); // PKG_CD
        cmlItem.setPkgCd("110"); // PKG_CD
        w2012List.add(cmlItem);
        
        w2009CmlService.deleteOnRegisterDelete(criteria, w2012List);
    }
    
    /**
     * <br />transactOnCreateUpdateテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnCreateUpdate() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        
        // 検索条件
        criteria.setLoginUserDscId("TEST"); // ダミーID (取得件数が0件になる)
        criteria.setBaseAuthFlg("2");
        criteria.setServerId("MYS");
        
        List<W2009CmlItemDomain> w2011DispList = new ArrayList<W2009CmlItemDomain>();
        
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_OFF);
        w2011DispList.add(cmlItem);
        
        // insert
        cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setDisableFlg(FLAG_N);
        // 更新値
        cmlItem.setPltzItemNo("A002TB0091B3N99");
        cmlItem.setPkgCd("999");
        cmlItem.setItemDescription("METER ASSY,INTAKE AIRFLOW 99");
        cmlItem.setQty(new BigDecimal("10"));
        cmlItem.setInstrQty(new BigDecimal("20"));
        cmlItem.setShippingLot(new BigDecimal("30"));
        cmlItem.setTagQty(new BigDecimal("40"));
        cmlItem.setPkgFormTyp("M");
        cmlItem.setItemWeight(new BigDecimal("50"));
        cmlItem.setWeightUnit("KG");
        cmlItem.setExpLimitTyp("L001");
        cmlItem.setDngrItemFlg("N");
        cmlItem.setOriginCntryCd("US");
        cmlItem.setQtyUnit("KG");
        cmlItem.setCurrCd("002");
        cmlItem.setPlntCd("M1");
        cmlItem.setContainerSortingKey("ZA000099");
        cmlItem.setLoadingCd("A");
        cmlItem.setInvoiceKey("XYZ");
        cmlItem.setContainerLooseTyp("C");
        cmlItem.setStgInstrItemFlg("Y");
        cmlItem.setCustomTimingTyp("A");
        w2011DispList.add(cmlItem);
        
        // update
        cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setDisableFlg(FLAG_Y);
        // 更新値
        cmlItem.setQty(new BigDecimal("11"));
        cmlItem.setTagQty(new BigDecimal("21"));
        // 更新条件 (上記でインサートしたものを更新対象にする)
        cmlItem.setPltzItemNo("A002TB0091B3N99");
        cmlItem.setPkgCd("999");
        w2011DispList.add(cmlItem);
        
        // insert MixTag
        cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_Y);
        cmlItem.setDisableFlg(FLAG_N);
        // 検索条件、値
        cmlItem.setMixTagNo("MMYBWH01405010001");
        cmlItem.setCurrCd("002");
        cmlItem.setContainerSortingKey("ZA000099");
        cmlItem.setLoadingCd("A");
        cmlItem.setInvoiceKey("XYZ");
        cmlItem.setContainerLooseTyp("C");
        cmlItem.setCustomTimingTyp("A");
        w2011DispList.add(cmlItem);
        
        // 処理なし MixTag
        cmlItem = new W2009CmlItemDomain();
        cmlItem.setSelected(CHECK_ON);
        cmlItem.setMixTagFlg(FLAG_Y);
        cmlItem.setDisableFlg(FLAG_Y);
        w2011DispList.add(cmlItem);
        
        w2009CmlService.transactOnCreateUpdate(criteria, w2011DispList);
    }
    
    /**
     * <br />transactOnDetailDeleteテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnDetailDelete() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 削除条件
        criteria.setLoginUserDscId("smzX2");
        
        List<String> brchList = new ArrayList<String>();
        // 削除条件
        brchList.add("2");
        brchList.add("4");
        
        w2009CmlService.transactOnDetailDelete(criteria, brchList);
    }

    /**
     * <br />transactOnDetailSaveMoveToテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnDetailSaveMoveTo() throws Exception {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        // 条件
        criteria.setLoginUserDscId("smzX3");
        criteria.setShipperCd("MYB");
        
        List<W2009CmlItemDomain> w2009CmlItemDomainList = new ArrayList<W2009CmlItemDomain>();
        
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        w2009CmlItemDomainList.add(cmlItem);
        
        // brch あり
        cmlItem = new W2009CmlItemDomain();
        // 更新値(再登録になる)
        cmlItem.setBrch(new BigDecimal("2"));
        cmlItem.setPkgItemNo("PKGITEMENO-001");
        cmlItem.setItemDescription("Cardboard");
        cmlItem.setModelCd("1");
        cmlItem.setQty(new BigDecimal("20"));
        cmlItem.setPkgTypHidden("1");
        cmlItem.setRtFlg(FLAG_Y);
        cmlItem.setNetWeight(new BigDecimal("20"));
        cmlItem.setPkgWeight(new BigDecimal("1"));
        cmlItem.setWeightUnit("KG");
        cmlItem.setOriginCntryCd("1");
        cmlItem.setCurrCd("001");
        cmlItem.setMixTagNo(null);
        cmlItem.setInputMethTyp("1");
        w2009CmlItemDomainList.add(cmlItem);
        
        // brch なし、再使用区分 (RT材でない)
        cmlItem = new W2009CmlItemDomain();
        // 更新値
        cmlItem.setBrch(null);
        cmlItem.setPkgItemNo("PKGITEMENO-020");
        cmlItem.setItemDescription("PKGITEMENO-020");
        cmlItem.setModelCd("KB20");
        cmlItem.setQty(new BigDecimal("10"));
        cmlItem.setPkgTypHidden("2");
        cmlItem.setRtFlg(FLAG_Y);
        cmlItem.setNetWeight(new BigDecimal("200"));
        cmlItem.setPkgWeight(new BigDecimal("20"));
        cmlItem.setWeightUnit("KG");
        cmlItem.setOriginCntryCd("JP");
        cmlItem.setCurrCd("002");
        cmlItem.setInputMethTyp("1");
        w2009CmlItemDomainList.add(cmlItem);
        
        // brch なし、再使用区分 (RT材)
        cmlItem = new W2009CmlItemDomain();
        // 更新値
        cmlItem.setBrch(null);
        cmlItem.setPkgItemNo("PKGITEMENO-000");
        cmlItem.setItemDescription("Cardboard dummy");
        cmlItem.setModelCd("KB00");
        cmlItem.setQty(new BigDecimal("20"));
        cmlItem.setPkgTypHidden("2");
        cmlItem.setRtFlg(FLAG_N);
        cmlItem.setNetWeight(new BigDecimal("1"));
        cmlItem.setPkgWeight(new BigDecimal("1"));
        cmlItem.setWeightUnit("KG");
        cmlItem.setOriginCntryCd("JP");
        cmlItem.setCurrCd("002");
        cmlItem.setInputMethTyp("2");
        w2009CmlItemDomainList.add(cmlItem);
        
        // brch なし、PkgItemNo = null
        cmlItem = new W2009CmlItemDomain();
        // 更新値
        cmlItem.setBrch(null);
        cmlItem.setPkgItemNo(null);
        cmlItem.setInputMethTyp("2");
        w2009CmlItemDomainList.add(cmlItem);
        
        w2009CmlService.transactOnDetailSaveMoveTo(criteria, w2009CmlItemDomainList);
    }

    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister1() throws Exception {
        
        // 梱包指示 ：あり
        // MixTag   ：あり
        // OuterCD  ：指定あり：7777
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // PLNT_CD  ：全部同一
        // EXP_LIMIT："" でないデータのみ
        // DNGR_ITEM_FLG："N" のみ
        // LOADING_CD：全て D
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // 包装材RT材：あり
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz090");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd("M1");
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo("MYB0612002");
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("M");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("7777");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(new BigDecimal("250"));
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("18500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("37000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_ON);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("MMYBWH01406120001");
        itemDomain.setPkgCd("");
        itemDomain.setMixTagFlg(FLAG_Y);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B02N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B03N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_Y);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B04N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_Y);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が異なる。(Mockで異なるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "CC");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "GR");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "CM");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        /*
        criteria.setWkLengthUnit("");
        criteria.setWkVolumeUnit("");
        criteria.setWkLengthPalletize(new BigDecimal(""));
        criteria.setWkHeightPalletize(new BigDecimal(""));
        criteria.setWkWidthPalletize(new BigDecimal(""));
        criteria.setWkVolumePalletize(new BigDecimal(""));
        */
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9001"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
        
        assertThat(errorMessages.size(), is(0));
    
    }

    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister2() throws Exception {
        
        // PKG Form TYPE = "S"
        
        // 梱包指示 ：""
        // MixTag   ：""
        // OuterCD  ：""
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // PLNT_CD  ："M1"
        // EXP_LIMIT：""
        // DNGR_ITEM_FLG："Y"
        // LOADING_CD："B"
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // 包装材RT材：なし
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz091");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd(null);
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("B");
        criteria.setPkgFormTyp("S");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(null);
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("1500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("3000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B13N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が異なる。(Mockで異なるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "CC");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "GR");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "CM");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        */
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9002"));
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
        
        assertThat(errorMessages.size(), is(0));
    
    }
    
    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister3() throws Exception {
        
        // PKG Form TYPE = "S"
        // 単位が同じになるパターン
        
        // 梱包指示 ：""
        // MixTag   ：""
        // OuterCD  ：""
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // PLNT_CD  ："M1"
        // EXP_LIMIT："L001"
        // DNGR_ITEM_FLG："N"
        // LOADING_CD："F"
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // 包装材RT材：なし
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz092");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd(null);
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("B");
        criteria.setPkgFormTyp("S");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(null);
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("1500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("3000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B14N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が同じになるように設定。(Mockで同じになるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        */
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9003"));
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);

        assertThat(errorMessages.size(), is(0));
    
    }
    
    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister4() throws Exception {
        
        // PKG Form TYPE = "M"
        // 単位が同じになるパターン
        
        // 梱包指示 ：""
        // MixTag   ：あり
        // OuterCD  ："7777"
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // PLNT_CD  ："M1,M2"
        
        // ---------- TW_PLTZ_ITEM_ITEM_NO --------------------
        // 包装材RT材：あり
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz093");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd(null);
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("M");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("7777");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(new BigDecimal("250"));
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("27000"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("54000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("MMYBWH01406120002");
        itemDomain.setPkgCd("");
        itemDomain.setMixTagFlg(FLAG_Y);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B07N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が同じになるように設定。(Mockで同じになるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        */
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9004"));
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);

        assertThat(errorMessages.size(), is(0));
    
    }
    
    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister5() throws Exception {
        
        // 梱包指示品目番号受注情報引当 MYB0613001
        // 引当数量(残)が残っている場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz094");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001206");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd("M1");
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo("MYB0613001");
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("M");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("7777");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(new BigDecimal("250"));
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("6000"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("12000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_ON);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B08N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_Y);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        */
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9005"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
        
        assertThat(errorMessages.size(), is(not(0)));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E7_0090));
    
    }

    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister6() throws Exception {
        
        // 確定受注の引き当て  引当数量(残)が残っている場合
        // 引当数量(残)が残っている場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz095");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd("M1");
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("S");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(null);
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("1500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("3000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B15N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が同じになるように設定。(Mockで同じになるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        */
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9006"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode("OK");
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // 登録処理の実行
        w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);

        assertThat(errorMessages.size(), is(not(0)));
        assertThat(errorMessages.get(0).getKey(), is(NXS_E7_0089));
    
    }
   
    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister7() throws Exception {
        // WEBサービスでエラーが発生するケース
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz096");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd(null);
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("S");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(null);
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("1500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("3000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B16N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が同じになるように設定。(Mockで同じになるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        */
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        criteria.setWkLengthUnit("MR");
        criteria.setWkVolumeUnit("LT");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9007"));
        
        // 登録処理の実行
        try {
            w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
            fail("Exception 未発生");
        } catch (SystemException e) {
            assertThat(e.getCode(), is(NXS_91_0001));
        }
    }
    
    /**
     * <br />transactOnRegister のテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegister8() throws Exception {
        // 単位変換でエラーが発生するケース
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        
        // 基本の情報
        criteria.setBaseAuthFlg("2");
        criteria.setLoginUserDscId("smz097");
        criteria.setUsrNmEn("dummy shimizu");
        
        // 画面からの情報設定(検索エリア)
        criteria.setShipperCd("MYB");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPlntCd(null);
        criteria.setLgcyWhCd("1");
        criteria.setPltzInstrNo(null);
        criteria.setPackingWhCompCd("MYB");
        criteria.setPackingWhCd("WH01");
        criteria.setExpPackingDt(null);
        criteria.setExpPackingIssuerNm(null);
        criteria.setContainerSortingKey("ZA001001");
        criteria.setLoadingCd("D");
        criteria.setPkgFormTyp("S");
        criteria.setInvoiceKey("NMY");
        criteria.setStgInstrItemFlg("N");
        criteria.setCustomTimingTyp("A");
        criteria.setRtUseFlg(null);
        criteria.setPalletNo(null);
        criteria.setMainMark(null);
        criteria.setOuterPkgCd("");
        criteria.setPackagingConfirmedFlg("Y");
        criteria.setVolume(null);
        criteria.setVolumeUnit("LT");
        criteria.setNetWeight(new BigDecimal("1500"));
        criteria.setWeightUnit("KG");
        criteria.setGrossWeight(new BigDecimal("3000"));
        criteria.setWeightUnit("KG");
        criteria.setIgnoreWarnings(CHECK_OFF);
        
        // 画面からの情報設定(一覧エリア)
        W2009CmlItemDomain itemDomain = new W2009CmlItemDomain();
        itemDomain.setPltzItemNo("A002TB0091B17N");
        itemDomain.setPkgCd("110");
        itemDomain.setMixTagFlg(FLAG_N);
        itemDomain.setWarningFlg(FLAG_N);
        itemDomain.setAuthFlg("2"); 
        w2012List.add(itemDomain);
        
        // これで取得できる単位と、以下の単位が同じになるように設定。(Mockで同じになるように設定)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchVolumeUnit", "LT");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchWeightUnit", "KG");
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchLengthUnit", "MR");
        
        // validateDatabase処理の中で取得する値を設定
        criteria.setWkPltzShipToCode("00"); // 2.3.9 より
        criteria.setWkPltzConsigneeCd("MYB"); // 2.3.10 より
        
        // 2.3.11 より
        /*
        criteria.setWkLengthUnit("MR");
        criteria.setVolumeUnit("LT");
        criteria.setWkLength(new BigDecimal("1.13"));                  
        criteria.setWkWidth(new BigDecimal("0.97"));
        criteria.setWkHeight(new BigDecimal("0.73"));
        criteria.setWkVolume(new BigDecimal("250"));
        */
        
        // 2.3.12 より (OuterCD未設定の場合のみ設定)
        criteria.setWkLengthUnit("CM");
        criteria.setWkVolumeUnit("CC");
        criteria.setWkLengthPalletize(new BigDecimal("3"));
        criteria.setWkHeightPalletize(new BigDecimal("3.5"));
        criteria.setWkWidthPalletize(new BigDecimal("2.5"));
        criteria.setWkVolumePalletize(new BigDecimal("26250"));
        
        // CML Noの取得でデッドロックが起きるので、Noの払い出しをMockにする
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence",  Arrays.asList("9008"));
        
        // 長さの変換エラー発生
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertLengthUnit");
        try {
            w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is(NXS_E7_0157));
        }
        
        // 長さの変換エラー発生
        MockObjectManager.addReturnNull(CommonServiceImpl.class, "convertVolumeUnit");
        try {
            w2009CmlService.transactOnRegister(criteria, w2012List, errorMessages);
            fail("Exception 未発生");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is(NXS_E7_0157));
        }
    }
    
    
    /**
     * <br />transactOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel1() throws Exception {
        
        // 梱包指示 + Mixtag
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("MYB0613002");
        criteria.setMainMark("DMYB11506130001");
        criteria.setShipperCd("MYB");
        criteria.setLgcyWhCd("1");
        criteria.setLoginUserDscId("DUMMY");
        criteria.setScreenId("W2012 junit");
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // 登録処理の実行
        w2009CmlService.transactOnRegisterCancel(criteria);

    }
    
    /**
     * <br />transactOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel2() throws Exception {
        
        // 梱包指示でない
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("");
        criteria.setMainMark("DMYB11506140001");
        criteria.setShipperCd("MYB");
        criteria.setLgcyWhCd("1");
        criteria.setLoginUserDscId("DUMMY");
        criteria.setScreenId("W2012 junit");
        // Ws2005 Webサービス
        ResultDomain res = new ResultDomain();
        res.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // 登録処理の実行
        w2009CmlService.transactOnRegisterCancel(criteria);

    }
    
    /**
     * <br />transactOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel3() throws Exception {
        
        // 梱包指示でpackedQty が 0にならないケース
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("MYB0614001");
        criteria.setMainMark("DMYB11506140002");
        criteria.setShipperCd("MYB");
        criteria.setLgcyWhCd("1");
        criteria.setLoginUserDscId("DUMMY");
        criteria.setScreenId("W2012 junit");

        w2009CmlService.transactOnRegisterCancel(criteria);
    }
    
    
    /**
     * <br />transactOnRegisterCancelテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterCancel4() throws Exception {
    
        // WEBサービスでエラー発生
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setPltzInstrNo("");
        criteria.setMainMark("DMYB11506140004");
        criteria.setShipperCd("MYB");
        criteria.setLgcyWhCd("1");
        criteria.setLoginUserDscId("DUMMY");
        criteria.setScreenId("W2012 junit");
        
        // WEBサービスでエラー発生
        ResultDomain res = new ResultDomain();
        res.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.addReturnValue(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", res);
        
        // キャンセル処理の実行
        try {
            w2009CmlService.transactOnRegisterCancel(criteria);
            fail("Exception 未発生");
        } catch (SystemException e) {
            assertThat(e.getCode(), is(NXS_91_0001));
        }

    }
    

    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials1() throws Exception {

        // パターン: 梱包形態区分 (Single)、ワーニングフラグ=Yのデータなし、エラー行なし の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        criteria.setLoginUserDscId("smz074");
        criteria.setBaseAuthFlg("2");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");
        
        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            new ArrayList<MessageDomain>());

        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setPltzItemNo("A002TB0091B11N");
        cmlItem.setPkgCd("110");
        w2012List.add(cmlItem);

        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            new ArrayList<MessageDomain>());
    }

    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials2() throws Exception {

        // パターン: 梱包形態区分 (Single)、ワーニングフラグ=Yのデータなし、エラー行あり の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        criteria.setLoginUserDscId("smz077");
        criteria.setBaseAuthFlg("2");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setPltzItemNo("DUMMY");
        w2012List.add(cmlItem);

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("NXS-E7-0126"));
    }

    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials3() throws Exception {

        // パターン: 梱包形態区分 (Single)以外、エラー行なし、
        // 包装組合せ原単位（明細）・包装材原単位あり の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        criteria.setLoginUserDscId("smz075");
        criteria.setBaseAuthFlg("2");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setPltzItemNo("A002TB0091B02N");
        cmlItem.setMixTagFlg(FLAG_N);
        w2012List.add(cmlItem);

        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            new ArrayList<MessageDomain>());
    }

    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials4() throws Exception {

        // パターン: 梱包形態区分 (Single)以外、エラー行あり

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        criteria.setLoginUserDscId("smz078");
        criteria.setBaseAuthFlg("2");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setPltzItemNo("DUMMY");
        w2012List.add(cmlItem);

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("NXS-E7-0126"));
    }

    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials5() throws Exception {

        // パターン: 梱包形態区分 (Single)以外、エラー行なし、
        // 包装組合せ原単位（明細）・包装材原単位なし の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        criteria.setLoginUserDscId("smz079");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd("7771");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("NXS-E7-0147"));
    }
    
    /**
     * <br />
     * transactOnRegisterPkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnRegisterPkgMaterials6() throws Exception {

        // パターン: ロット割れかつ、Mixを含む場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setFunctionMode(W2009_CML_MODE_EDIT);
        criteria.setPackagingConfirmedFlg(FLAG_N);
        criteria.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        criteria.setLoginUserDscId("smz076");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd("7777");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");


        List<W2009CmlItemDomain> w2012List = new ArrayList<W2009CmlItemDomain>();
        
        
        W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setMixTagFlg(FLAG_Y);
        cmlItem.setPltzItemNo("MMYBWH01406110002");
        w2012List.add(cmlItem);

        cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_N);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setPltzItemNo("A002TB0091B01N");
        cmlItem.setPkgCd("110");
        w2012List.add(cmlItem);

        cmlItem = new W2009CmlItemDomain();
        cmlItem.setWarningFlg(FLAG_Y);
        cmlItem.setMixTagFlg(FLAG_N);
        cmlItem.setPltzItemNo("A002TB0091B02N");
        cmlItem.setPkgCd("110");
        w2012List.add(cmlItem);
        
        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List,
            errorMessages);

    }

    /**
     * <br />
     * transactOnTransRevisePkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnTransRevisePkgMaterials1() throws Exception {

        // パターン: Change Outer CDが""、パレタイズ対象品あり の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("smz080");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd(null);
        criteria.setMainMark("DMYB11506110002");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        // // Webサービス(WS2004)戻り値 ダミー設定
        Ws2004ResultDomain ws2004Result = toWs2004ResultDomain(
            WS_RESULT_SUCCESS, WS2004_RESULT_ITEMS);
        MockObjectManager.addReturnValue(Ws2004RestServiceImpl.class,
            "searchItemInfoForCml", ws2004Result);
        
        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            new ArrayList<MessageDomain>());
    }

    /**
     * <br />
     * transactOnTransRevisePkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnTransRevisePkgMaterials2() throws Exception {

        // パターン: Change Outer CDが""、パレタイズ対象品なし の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("10088NXS1027");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd(null);
        criteria.setMainMark("DMYB11506110003");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("GSCM-E0-0010"));
    }

    /**
     * <br />
     * transactOnTransRevisePkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnTransRevisePkgMaterials3() throws Exception {

        // パターン: Change Outer CDが""以外、パレタイズ対象品あり、
        // 包装組合せ原単位（明細）・包装材原単位あり（RT材、RT材以外） の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("smz07");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd("7777");
        criteria.setMainMark("DMYB11506110004");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            new ArrayList<MessageDomain>());
    }

    /**
     * <br />
     * transactOnTransRevisePkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnTransRevisePkgMaterials4() throws Exception {

        // パターン: Change Outer CDが""以外、パレタイズ対象品なし の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("smz07");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd("7777");
        criteria.setMainMark("DMYB11506110005");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("GSCM-E0-0010"));
    }

    /**
     * <br />transactOnTransRevisePkgMaterialsテスト
     * 
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testTransactOnTransRevisePkgMaterials5() throws Exception {

        // パターン: Change Outer CDが""以外、パレタイズ対象品あり、
        // 包装組合せ原単位（明細）・包装材原単位なし の場合

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("smz07");
        criteria.setBaseAuthFlg("2");
        criteria.setOuterPkgCd("7771");
        criteria.setMainMark("DMYB11506110004");
        criteria.setLanguageCd("en");
        criteria.setShipperCd("MYB");
        criteria.setTrnsCd("S");

        List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
        w2009CmlService.transactOnTransRevisePkgMaterials(criteria,
            errorMessages);
        assertThat(errorMessages.get(0).getKey(), is("NXS-E7-0147"));
    }

    /**
     * <br />transactOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testTransactOnTransReviseRegister1() throws Exception {
        
        // パターン: Change Outer CDが""以外、長さ単位が一致、brch なし の場合
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setLoginUserDscId("smzX5");
        
        criteria.setReviseFlg(FLAG_Y);
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setWkLengthUnit("MR");
        criteria.setWkLength(new BigDecimal("3.5"));
        criteria.setWkWidth(new BigDecimal("2.5"));
        criteria.setWkHeight(new BigDecimal("1.8"));
        criteria.setVolume(new BigDecimal("250"));
        criteria.setNetWeight(new BigDecimal("100"));
        criteria.setGrossWeight(new BigDecimal("730"));
        criteria.setMainMark("DMYB11506110001");
        Timestamp ts = new Timestamp(new Date("2014/06/10 17:48:25").getTime());
        criteria.setComUpdateTimestamp(ts);   // 更新対象データのタイムスタンプに合わせないといけない
        criteria.setWkPltzInstrNo("");
        
        w2009CmlService.transactOnTransReviseRegister(criteria, new ArrayList<MessageDomain>());
    }
    
    /**
     * <br />transactOnTransReviseRegisterテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testTransactOnTransReviseRegister2() throws Exception {
        
        // パターン: Change Outer CDが""以外、長さ単位が一致しない、brch あり の場合
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        criteria.setReviseFlg(FLAG_N);
        criteria.setLoginUserDscId("smzX6");
        
        criteria.setShipperCd("MYB");
        criteria.setOuterPkgCd("7777");
        criteria.setWkLengthUnit("CM");
        criteria.setWkLength(new BigDecimal("350"));
        criteria.setWkWidth(new BigDecimal("250"));
        criteria.setWkHeight(new BigDecimal("180"));
        criteria.setVolume(new BigDecimal("250"));
        criteria.setNetWeight(new BigDecimal("100"));
        criteria.setGrossWeight(new BigDecimal("730"));
        criteria.setMainMark("DMYB115061100XX");
        Timestamp ts = new Timestamp(new Date("2014/06/10 17:48:25").getTime());
        criteria.setComUpdateTimestamp(ts);   // 更新対象データのタイムスタンプに合わせないといけない
        criteria.setWkPltzInstrNo("XXX");
        
        w2009CmlService.transactOnTransReviseRegister(criteria, new ArrayList<MessageDomain>());
    }
    
    /**
     * <br />printCmlテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testPrintCml() throws Exception {
        
        // searchCmlの戻り値 ダミー設定
        File file = new File("test.pdf");
        MockObjectManager.addReturnValue(L2003ReportServiceImpl.class, "searchCml", file);
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        String reportDateFormat = "yyyy/MM/dd";
        File result = w2009CmlService.printCml(criteria, reportDateFormat);
        assertThat(result.getName(), is("test.pdf"));
    }
    
    /**
     * <br />指定された値を含む{@link Ws2004ResultDomain}を作成します。
     *
     * @param resultCode 結果コード
     * @param resultItems {@link Ws2004ResultItemDomain}にセットする値の配列
     * @return 作成した{@link Ws2004ResultDomain}
     */
    private Ws2004ResultDomain toWs2004ResultDomain(String resultCode, String[][] resultItems) {
        
        List<Ws2004ResultItemDomain> ws2004ResultItemList = new ArrayList<Ws2004ResultItemDomain>();
        
        if (resultItems != null) {
            for (String[] resultItem : resultItems) {
                Ws2004ResultItemDomain domain = new Ws2004ResultItemDomain();
                domain.setItnbr(resultItem[0]);
                domain.setPackc(resultItem[1]);
                domain.setUnmsr(resultItem[2]);
                domain.setMohtq(resultItem[3]);
                domain.setCurr3(resultItem[4]);
                
                ws2004ResultItemList.add(domain);
            }
        }
        
        Ws2004ResultDomain ws2004Result = new Ws2004ResultDomain();
        ws2004Result.setResultCode(resultCode);
        ws2004Result.setItemList(ws2004ResultItemList);
        
        return ws2004Result;
    }

}