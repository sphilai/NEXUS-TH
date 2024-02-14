/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0023;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0059;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TwPltzInstrItemNoServiceImpl;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2001RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2002RestServiceMockImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;


/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2001PltzInstrServiceTest extends AbstractEca0027Test {

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
     * 梱包指示サービス
     */
    private W2001PltzInstrService pltzInstrService;

    /**
     * 輸出受注サービス (SACT)
     */
    private TtExpRcvOdrService ttExpRcvOdrService;
    
    /**
     * 梱包指示サービス (SACT)
     */
    private TtPltzInstrService ttPltzInstrService;

    /**
     * 梱包指示品目番号サービス (SACT)
     */
    private TtPltzInstrItemNoService ttPltzInstrItemNoService;
    
    /**
     * 梱包指示品目番号受注情報サービス (SACT)
     */
    private TtPltzInstrOdrService ttPltzInstrOdrService;
    
    /**
     * 仮在庫サービス (SACT)
     */
    private TtTmpStockService ttTmpStockService;
    
    /**
     * 梱包指示品目番号ワーク サービス (SACT)
     */
    private TwPltzInstrItemNoService twPltzInstrItemNoService;
    
    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
    
    /**
     * SimpleDateFormat
     */
    private SimpleDateFormat df = new SimpleDateFormat(dateFormat);
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W2001PltzInstrServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        pltzInstrService = (W2001PltzInstrService) getContext().getBean("w2001PltzInstrService");
        ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
        ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
        twPltzInstrItemNoService = (TwPltzInstrItemNoService) getContext().getBean("twPltzInstrItemNoService");
    }
    
    
    /**
     * <br />validateConsistencyFmInstrDateToInstrDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyFmInstrDateToInstrDate() {
        boolean result = false;
        
        // 開始日 == null、終了日 == null
        result = pltzInstrService.validateConsistencyFmDateToDate(null, null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = pltzInstrService.validateConsistencyFmDateToDate(null, "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 != null、終了日 == null
        result = pltzInstrService.validateConsistencyFmDateToDate("06/03/14", null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 < 終了日
        result = pltzInstrService.validateConsistencyFmDateToDate("06/03/14", "13/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = pltzInstrService.validateConsistencyFmDateToDate("06/03/14", "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = pltzInstrService.validateConsistencyFmDateToDate("13/03/14", "06/03/14", dateFormat);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyShipperPlantAuthのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testValidateConsistencyShipperPlantAuth() throws Exception {
        boolean result = false;
        
        // 権限あり
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", true);
        result = pltzInstrService.validateConsistencyShipperPlantAuth("TG0", "1");
        assertThat(result, is(true));
        
        // 権限なし
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = pltzInstrService.validateConsistencyShipperPlantAuth("TG0", "1");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyInstrActQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyInstrActQty() {
        boolean result = false;
        
        // 数量 < 0
        result = pltzInstrService.validateConsistencyInstrActQty(-1);
        assertThat(result, is(false));
        
        // 数量 == 0
        result = pltzInstrService.validateConsistencyInstrActQty(0);
        assertThat(result, is(false));
        
        // 0 < 数量
        result = pltzInstrService.validateConsistencyInstrActQty(1);
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyInstrActQtyOverのテスト
     *
     */
    @Test
    public void testValidateConsistencyInstrActQtyOver() {
        boolean result = false;
        
        // 数量 < 合計
        result = pltzInstrService.validateConsistencyInstrActQtyOver(10, 15);
        assertThat(result, is(true));
        
        // 数量 == 合計
        result = pltzInstrService.validateConsistencyInstrActQtyOver(15, 15);
        assertThat(result, is(true));
        
        // 合計 < 数量
        result = pltzInstrService.validateConsistencyInstrActQtyOver(15, 10);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateConsistencyItemNmのテスト
     *
     */
    @Test
    public void testValidateConsistencyItemNm() {
        boolean result = false;
        
        // 輸出出荷品番情報 == null
        result = pltzInstrService.validateConsistencyItemNm(null);
        assertThat(result, is(false));
        
        // 輸出出荷品番情報 == ""
        result = pltzInstrService.validateConsistencyItemNm("");
        assertThat(result, is(false));
        
        // 輸出出荷品番情報 != ""
        result = pltzInstrService.validateConsistencyItemNm("BRACKET");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyLotSizeのテスト
     *
     */
    @Test
    public void testValidateConsistencyLotSize() {
        boolean result = false;
        
        // ロット数 == null
        result = pltzInstrService.validateConsistencyLotSize(null);
        assertThat(result, is(false));
        
        // ロット数 == ""
        result = pltzInstrService.validateConsistencyLotSize("");
        assertThat(result, is(false));
        
        // ロット数 == "0"
        result = pltzInstrService.validateConsistencyLotSize("0");
        assertThat(result, is(false));
        
        // ロット数 == "0.000"
        result = pltzInstrService.validateConsistencyLotSize("0.000");
        assertThat(result, is(false));

        // ロット数 != ""
        result = pltzInstrService.validateConsistencyLotSize("123");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateConsistencyShipLotのテスト
     *
     */
    @Test
    public void testValidateConsistencyShipLot() {
        boolean result = false;
        
        // 収容数 == null
        result = pltzInstrService.validateConsistencyShipLot(null);
        assertThat(result, is(false));
        
        // 収容数 == ""
        result = pltzInstrService.validateConsistencyShipLot("");
        assertThat(result, is(false));
        
        // 収容数 != null
        result = pltzInstrService.validateConsistencyShipLot("15");
        assertThat(result, is(true));
    }
    
    /**
     * validateDatabaseAfterDateCompのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseAfterDateComp() throws Exception {
        boolean result = false;
        
        // 日付 < システム日付
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateAfterDateComp", false);
        result = pltzInstrService.validateDatabaseAfterDateComp("06/03/14", dateFormat, "TG0");
        assertThat(result, is(false));
        
        // システム日付 <= 日付
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateAfterDateComp", true);
        result = pltzInstrService.validateDatabaseAfterDateComp("06/03/14", dateFormat, "TG0");
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseCigmaAvailableのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable() throws Exception {
        boolean result = false;
        
        // CIGMA利用不可
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", false);
        result = pltzInstrService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(false));
        
        // CIGMA利用可
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", true);
        result = pltzInstrService.validateDatabaseCigmaAvailable(true, "TG0");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateDatabaseShipperCustomerShipToのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseShipperCustomerShipTo() throws Exception {
        boolean result = false;
        
        // 組み合わせ (不正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperCustomerShipTo", false);
        result = pltzInstrService.validateDatabaseShipperCustomerShipTo("TG0", "2", "3");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperCustomerShipTo", true);
        result = pltzInstrService.validateDatabaseShipperCustomerShipTo("TG0", "2", "3");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateDatabaseShipperWhPlantのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant() throws Exception {
        boolean result = false;
        
        // 組み合わせ (不正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperWhPlant", false);
        result = pltzInstrService.validateDatabaseShipperWhPlant("TG0", "6", "5");
        assertThat(result, is(false));
        
        // 組み合わせ (正)
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "validateShipperWhPlant", true);
        result = pltzInstrService.validateDatabaseShipperWhPlant("TG0", "6", "5");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister() throws Exception {
        boolean result = false;
        
        // 梱包指示ワークなし
        MockObjectManager.addReturnValue(TwPltzInstrItemNoServiceImpl.class, "searchCount", 0);
        result = pltzInstrService.validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister("nexus");
        assertThat(result, is(false));
        
        // 梱包指示ワークあり
        MockObjectManager.addReturnValue(TwPltzInstrItemNoServiceImpl.class, "searchCount", 1);
        result = pltzInstrService.validateDatabaseTwPltzInstrItemNoOnHeaderMoveToRegister("nexus");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateDatabaseTwPltzInstrItemNoOnCreateUpdateのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTwPltzInstrItemNoOnCreateUpdate() throws Exception {
        boolean result = false;
        
        // 登録件数 + 梱包指示ワークの件数 < 最大登録件数
        MockObjectManager.addReturnValue(TwPltzInstrItemNoServiceImpl.class, "searchCount", 900);
        result = pltzInstrService.validateDatabaseTwPltzInstrItemNoOnCreateUpdate("nexus", 98);
        assertThat(result, is(true));
        
        // 登録件数 + 梱包指示ワークの件数 == 最大登録件数
        MockObjectManager.addReturnValue(TwPltzInstrItemNoServiceImpl.class, "searchCount", 900);
        result = pltzInstrService.validateDatabaseTwPltzInstrItemNoOnCreateUpdate("nexus", 99);
        assertThat(result, is(true));
        
        // 最大登録件数 < 登録件数 + 梱包指示ワークの件数
        MockObjectManager.addReturnValue(TwPltzInstrItemNoServiceImpl.class, "searchCount", 900);
        result = pltzInstrService.validateDatabaseTwPltzInstrItemNoOnCreateUpdate("nexus", 100);
        assertThat(result, is(false));
    }
    
    /**
     * <br />validateDatabaseTtPltzInstrOnRegisterCancelのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegisterCancel() throws Exception {
        String result = null;
        TtPltzInstrDomain ttPltzInstr = null;
        
        // レコードが存在しない場合
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterCancel("TG00306001");
        assertThat(result, is(GSCM_E0_0010));
        
        // ステータス不正 (30: In process of CML Create)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterCancel("TG00306001");
        assertThat(result, is(NXS_E1_0011));
        
        // ステータス不正 (50: All CML Print out)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterCancel("TG00306001");
        assertThat(result, is(NXS_E1_0011));
        
        // ステータス正 (10: Instruction Created)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterCancel("TG00306001");
        assertThat(result, is(nullValue()));
    }
    
    /**
     * <br />validateDatabaseTtPltzInstrOnRegisterPrintInstrのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegisterPrintInstr() throws Exception {
        boolean result = false;
        TtPltzInstrDomain ttPltzInstr = null;
        
        // 梱包指示なし
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintInstr("TG00306001");
        assertThat(result, is(false));
        
        // 梱包指示あり
        ttPltzInstr = new TtPltzInstrDomain();
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintInstr("TG00306001");
        assertThat(result, is(true));
    }
    
    /**
     * <br />validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstrのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr() throws Exception {
        String result = null;
        TtPltzInstrDomain ttPltzInstr = null;
        
        // 梱包指示なし
        MockObjectManager.addReturnNull(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr("TG00306001");
        assertThat(result, is(GSCM_E0_0010));
        
        // 梱包指示あり (ステータス不正 / 10: Instruction Created)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr("TG00306001");
        assertThat(result, is(NXS_E1_0013));
        
        // 梱包指示あり (ステータス不正 / 30: In Process of CML Create)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr("TG00306001");
        assertThat(result, is(NXS_E1_0013));
        
        // 梱包指示あり (ステータス正)
        ttPltzInstr = new TtPltzInstrDomain();
        ttPltzInstr.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.addReturnValue(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", ttPltzInstr);
        result = pltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr("TG00306001");
        assertThat(result, is(nullValue()));
    }
    
    /**
     * <br />validateDatabaseTtMixTagOnRegisterCancelのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtMixTagOnRegisterCancel() throws Exception {
        boolean result = false;
        
        // MIXED現品票あり
        MockObjectManager.addReturnValue(TtMixtagServiceImpl.class, "searchCount", 1);
        result = pltzInstrService.validateDatabaseTtMixTagOnRegisterCancel("TG00306001");
        assertThat(result, is(false));
        
        // MIXED現品票なし
        MockObjectManager.addReturnValue(TtMixtagServiceImpl.class, "searchCount", 0);
        result = pltzInstrService.validateDatabaseTtMixTagOnRegisterCancel("TG00306001");
        assertThat(result, is(true));
    }
    
    /**
     * <br />searchCountForPagingOnMainSearchのテスト (権限以外)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchCountForPagingOnMainSearch1() throws Exception {
        /*
         *  0: テストケースの説明
         *  1: 検索結果の件数
         *  2: サーバID
         *  3: 荷主コード
         *  4: 得意先NO
         *  5: LEGACY送荷先
         *  6: 輸送手段コード
         *  7: LEGACY倉庫コード
         *  8: 梱包指示ステータス
         *  9: 梱包指示NO
         * 10: 梱包指示日(From)
         * 11: 梱包指示日(To)
         * 12: 梱包指示者ID
         */
        String[][] fixtures = {
            { "追加条件なし",                  "145", "MYS", "MY2", "30001205", "00", null, null, null, null, null,         null,       null,       null },
            { "TRANS_CDを指定",                "10",  "MYS", "MY2", "30001205", "00", "A",  null, null, null, null,         null,       null,       null },
            { "PLNT_CDを指定",                 "10",  "MYS", "MY2", "30001205", "00", null, "M2", null, null, null,         null,       null,       null },
            { "LGCY_WH_CDを指定",              "10",  "MYS", "MY2", "30001205", "00", null, null, "2",  null, null,         null,       null,       null },
            { "PLTZ_INSTR_STATUSを指定",       "10",  "MYS", "MY2", "30001205", "00", null, null, null, "20", null,         null,       null,       null },
            { "PLTZ_INSTR_NOを指定",           "1",   "MYS", "MY2", "30001205", "00", null, null, null, null, "MY20000001", null,       null,       null },
            { "PLTZ_INSTR_DT(From)を指定",     "10",  "MYS", "MY2", "30001205", "00", null, null, null, null, null,         "15/05/14", null,       null },
            { "PLTZ_INSTR_DT(To)を指定",       "135", "MYS", "MY2", "30001205", "00", null, null, null, null, null,         null,       "14/05/14", null },
            { "PLTZ_INSTR_DT(From/To)を指定",  "10",  "MYS", "MY2", "30001205", "00", null, null, null, null, null,         "15/05/14", "24/05/14", null },
            { "ISSUERを指定",                  "10",  "MYS", "MY2", "30001205", "00", null, null, null, null, null,         null,       null,       "issuer02" },
        };
        
        // 権限なし
        for (String[] fixture : fixtures) {
            String reason = fixture[0];
            int expected = Integer.parseInt(fixture[1]);
            int count = pltzInstrService.searchCountForPagingOnMainSearch(toPltzInstrCriteria(fixture));
            assertThat(reason, count, is(expected));
        }
    }
    
    /**
     * <br />searchCountForPagingOnMainSearchのテスト (権限含む)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchCountForPagingOnMainSearch2() throws Exception {
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
                { "AR", "MY2", "M1", "W2001R", "R"},
            },
            {
                { "AR", "MY2", "M1", "W2001R", "R"},
                { "AR", "MY2", "M2", "W2001R", "R"},
            },
            
        };
        // 検索条件 (書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[][] fixtures = {
            { "権限: [M1]",    "135", "MYS", "MY2", "30001205", "00", null, null, null, null, null, null, null, null },
            { "権限: [M1,M2]", "145", "MYS", "MY2", "30001205", "00", null, null, null, null, null, null, null, null },
        };
        
        for (int i = 0; i < userAuthList.length; i++) {
            String reason = fixtures[i][0];
            int expected = Integer.parseInt(fixtures[i][1]);
            int count = pltzInstrService.searchCountForPagingOnMainSearch(toPltzInstrCriteria(fixtures[i], userAuthList[i]));
            assertThat(reason, count, is(expected));
        }
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch() throws Exception {
        // 検索条件 (書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[] fixture = { 
            "追加条件なし", "-", "MYS", "MY2", "30001205", "00", null, null, null, null, null, null, null, null
        };
        /*
         * 0: 開始位置
         * 1: 終了位置
         */
        // 検索範囲
        int[][] ranges = {
            { 1, 50 },
            { 51, 100 },
            { 101, 150 }
        };
        
        String[] ignoreCols = {
            "PLTZ_INSTR_ISSUER_ID",
            "WEIGHT_UNIT",
            "CML_PRINT_OUT_DT",
            "COLLATE_METH_TYP",
            "COM_UPDATE_FUNC_ID",
            "COM_UPDATE_USER_ID",
            "COM_UPDATE_TIMESTAMP",
            "COM_CREATE_FUNC_ID",
            "COM_CREATE_USER_ID",
            "COM_CREATE_TIMESTAMP"
        };

        for (int i = 0; i < ranges.length; i++) {
            String reason = String.format("%s (%d-%d)", fixture[0], ranges[i][0], ranges[i][1]);
            List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch_" + i + ".csv");
            List<?> actualList = pltzInstrService.searchForPagingOnMainSearch(toPltzInstrCriteria(fixture, ranges[i]));
            assertDomainList(reason, actualList, expectedList, ignoreCols);
        }
    }
    
    /**
     * <br />searchForPagingOnCreateSearchのテスト (正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch1() throws Exception {
        /*
         *  0: テストケースの説明
         *  1: 検索結果の件数
         *  2: DSC-ID
         *  3: 荷主コード
         *  4: 得意先NO
         *  5: LEGACY送荷先
         *  6: 輸送手段コード
         *  7: 製造部工場区分
         *  8: LEGACY倉庫コード (未使用)
         *  9: 梱包指示日
         * 10: 得意先PO NO
         * 11: 品目番号
         * 12: 包装区分
         * 13: 稼働日リスト (カンマ区切り)
         * 14: 適用開始日
         */
        // 検索条件
        String[][] fixtures = {
            { "データ整合性あり",   "2", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
            { "品目番号情報なし",   "3", "pltzinstr02", "MA2", "30001205", "02", "A", "M3", "-", "15/05/14", "30001205-02", null,            "112", "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
            { "照合方式区分あり",   "1", "pltzinstr02", "MA2", "30001205", "03", "X", "M3", "-", "15/05/14", "30001205-03", "A002TB0091B3N", "113", "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
            { "包装仕様(明細)なし", "1", "pltzinstr02", "MA2", "30001205", "04", "S", "M3", "-", "15/05/14", "30001205-04", "A002TB0091B3N", "114", "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
            { "輸出出荷品番なし",   "1", "pltzinstr02", "MA2", "30001205", "05", "T", "M3", "-", "15/05/14", "30001205-05", "A002TB0091B3N", "115", "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
            { "照合方式区分が空白", "1", "pltzinstr02", "MA2", "30001205", "03", "X", "M3", "-", "15/05/14", "30001205-03", "A002TB0091B3N", "113", "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" },
        };
        /*
         * 0: 結果コード
         * 1: 照合方式区分
         * 2: 品目情報 (項目値を":"区切り、複数件の場合は","区切り)
         */
        // Webサービスの結果
        String[][] itemInfo = {
            { WS_RESULT_SUCCESS, "",  "A002TB0091B3N:10:WH1" },
            { WS_RESULT_SUCCESS, "",  "A002TB0091B3N:10:WH1,A002TB0093B3N:10:WH3,A002TB0095B3N:10:WH5" },
            { WS_RESULT_SUCCESS, "X", "A002TB0091B3N:10:WH1" },
            { WS_RESULT_SUCCESS, "",  "A002TB0091B3N:10:WH1" },
            { WS_RESULT_SUCCESS, "",  "A002TB0091B3N:10:WH1" },
            { WS_RESULT_SUCCESS, " ", "A002TB0091B3N:10:WH1" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            String reason = fixtures[i][0];
            MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixtures[i][13]));
            MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo[i]));
            List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnCreateSearch1_W2001PltzInstrItem_" + i + ".csv");
            List<?> actualList = pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixtures[i]));
            assertDomainList(reason, actualList, expectedList);
        }
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 品目番号情報が0件の場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch2() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "品目番号情報0件", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_ERROR, "",  "" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0024));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 照合方式区分が"No Data"の場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch3() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "照合方式区分が\"No Data\"", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_ERROR, NO_DATA,  "A002TB0091B3N:10:WH1" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0015));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 得意先QRパターン(ヘッダ)が未定義の場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch4() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "得意先QRパターン(ヘッダ)が未定義", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_SUCCESS, "S",  "A002TB0091B3N:10:WH1" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0059));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 得意先QRパターン(明細)が未定義の場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch5() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "得意先QRパターン(明細)が未定義", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_SUCCESS, "T",  "A002TB0091B3N:10:WH1" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0059));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 輸出受注の検索結果が0件の場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch6() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "輸出受注が0件", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_SUCCESS, "T",  "A002TB0091B3N:10:WH1" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        MockObjectManager.addReturnValue(SqlMapClientTemplate.class, "queryForList", toFilledList(null, 0));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(GSCM_E0_0001));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 輸出受注の検索結果が最大件数を超える場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch7() throws Exception {
        /*
         * ※検索条件、Webサービスの結果の書式はtestSearchForPagingOnCreateSearch1と同じ
         */
        // 検索条件
        String[] fixture = { "輸出受注が最大件数を超える", "0", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null,  "20140513,20140514,20140515,20140516,20140519,20140520,20140521", "19/12/12" };
        // Webサービスの結果
        String[] itemInfo = { WS_RESULT_SUCCESS, "T",  "A002TB0091B3N:10:WH1" };
        
        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        MockObjectManager.addReturnValue(Ws2002RestServiceMockImpl.class, "getItemInfoForPltzIns", toWs2002ResultDomain(itemInfo));
        MockObjectManager.addReturnValue(SqlMapClientTemplate.class, "queryForList", toFilledList(null, SEARCH_MAX_COUNT + 1));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(GSCM_E0_0003));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 稼働日取得のステータスがエラーの場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch8() throws Exception {
        String[] fixture = { "稼働日取得のステータスがエラー", "-", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null, null, "19/12/12" };

        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString(NXS_91_0001));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 稼働日に""が存在する場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch9() throws Exception {
        String[] fixture = { "稼働日に\"\"が存在する", "-", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null, "20140513,20140514,20140515,,20140519,20140520,20140521", "19/12/12" };

        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0023));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchForPagingOnCreateSearchのテスト (異常系 / 稼働日のフォーマットが不正な場合)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnCreateSearch10() throws Exception {
        String[] fixture = { "稼働日のフォーマットが不正", "-", "pltzinstr02", "MA2", "30001205", "01", "S", "M3", "-", "15/05/14", "30001205-01", "A002TB0091B3N", null, "13/05/14,14/05/14,15/05/14,16/05/14,19/05/14,20/05/14,21/05/14", "19/12/12" };

        MockObjectManager.addReturnValue(Ws2001RestServiceMockImpl.class, "searchWorkingDay", toWs2001ResultDomain(fixture[13]));
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString(NXS_91_0001));
        pltzInstrService.searchForPagingOnCreateSearch(toPltzInstrItemCriteria(fixture));
    }

    /**
     * <br />searchOnRegisterInitByFromMainのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromMain() throws Exception {
        // 検索条件 (※書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[] fixture = { 
            "梱包指示NOで検索", "3", "MYS", null, null, null, null, null, null, null, "MY20000001", null, null, null
        };

        /*
         * 0: TT_PLTZ_INSTR
         * 1: TT_PLTZ_INSTR_ITEM_NO
         */
        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "PLTZ_INSTR_ISSUER_ID",
                "PLTZ_INSTR_NM",
                "COLLATE_METH_TYP",
                "COM_UPDATE_FUNC_ID",
                "COM_UPDATE_USER_ID",
                "COM_UPDATE_TIMESTAMP",
                "COM_CREATE_FUNC_ID",
                "COM_CREATE_USER_ID",
                "COM_CREATE_TIMESTAMP"
            },
            {
                "PLTZ_INSTR_NO",
                "ITEM_DESCRIPTION",
                "WH_STK_LOCATION",
                "COM_UPDATE_FUNC_ID",
                "COM_UPDATE_USER_ID",
                "COM_UPDATE_TIMESTAMP",
                "COM_CREATE_FUNC_ID",
                "COM_CREATE_USER_ID",
                "COM_CREATE_TIMESTAMP"
            }
        };
        
        Map<String, String> expectedPltzInstr = readCsvFile("testSearchOnRegisterInitByFromMain_W2001PltzInstr.csv").get(0);
        List<Map<String, String>> expectedPltzInstrItemList = readCsvFile("testSearchOnRegisterInitByFromMain_W2001PltzInstrItem.csv");

        W2001PltzInstrDomain pltzInstr = pltzInstrService.searchOnRegisterInitByFromMain(toPltzInstrCriteria(fixture));
        
        assertDomain(fixture[0], pltzInstr, expectedPltzInstr, ignoreCols[0]);
        assertDomainList(fixture[0], pltzInstr.getPltzInstrItemList(), expectedPltzInstrItemList, ignoreCols[1]);
    }
    
    /**
     * <br />searchOnRegisterInitByFromCreateのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInitByFromCreate() throws Exception {
        // 検索条件 (書式はtestSearchForPagingOnCreateSearch1と同じ)
        String[] fixture = { "DSC-IDで検索", "10", "pltzinstr07", null, null, null, null, null, null, null, null, null, null, null, null };
        
        // 比較対象外カラム
        String[] ignoreCols = {
            "DSC_ID",
            "COM_UPDATE_FUNC_ID",
            "COM_UPDATE_USER_ID",
            "COM_UPDATE_TIMESTAMP",
            "COM_CREATE_FUNC_ID",
            "COM_CREATE_USER_ID",
            "COM_CREATE_TIMESTAMP"
        };
        
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnRegisterInitByFromCreate_W2001PltzInstrItem.csv");
        List<?> actualList = pltzInstrService.searchOnRegisterInitByFromCreate(toPltzInstrItemCriteria(fixture));
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

    /**
     * <br />deleteOnHeaderInitのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeleteOnHeaderInit() throws Exception {
        // 検索条件 (書式はtestSearchForPagingOnCreateSearch1と同じ)
        String[][] fixtures = {
            { "梱包指示品目番号ワークあり", "5", "pltzinstr03", null, null, null, null, null, null, null, null, null, null, null, null },
            { "梱包指示品目番号ワークなし", "0", "pltzinstr04", null, null, null, null, null, null, null, null, null, null, null, null }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            int expectedCount = Integer.valueOf(fixtures[i][1]);
            int beforeCount = countTwPltzInstrItemNo(fixtures[i][2]);
            pltzInstrService.deleteOnHeaderInit(toPltzInstrItemCriteria(fixtures[i]));
            int afterCount = countTwPltzInstrItemNo(fixtures[i][2]);
            assertThat(fixtures[i][0], beforeCount - afterCount, is(expectedCount));
        }
    }
    
    /**
     * <br />deleteOnRegisterDeleteのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testDeleteOnRegisterDelete() throws Exception {
        /*
         * 0: テストケースの説明
         * 1: 削除される件数
         * 2: DSC-ID
         * 3: 削除対象の梱包指示品目番号ワーク (項目値を":"区切り、複数件の場合は","区切り)
         * 4: 再検索結果 (書式は3と同じ)
         */
        String[][] fixtures = {
            { "梱包指示品目番号ワークを削除 (全件)", "5", "pltzinstr05", "A002TB0091B3N:110,A002TB0091B3N:111,A002TB0091B3N:112,A002TB0091B3N:113,A002TB0091B3N:114", null },
            { "梱包指示品目番号ワークを削除 (一部)", "3", "pltzinstr06", "A002TB0091B3N:110,A002TB0091B3N:112,A002TB0091B3N:114", "A002TB0091B3N:111,A002TB0091B3N:113" },
        };

        for (String[] fixture : fixtures) {
            int expectedCount = Integer.valueOf(fixture[1]);
            List<W2001PltzInstrItemDomain> expectedResult = toPltzInstrItemList(fixture[2], fixture[4]);
            
            int beforeCount = countTwPltzInstrItemNo(fixture[2]);
            List<? extends W2001PltzInstrItemDomain> actualResult = pltzInstrService.deleteOnRegisterDelete(toPltzInstrItemList(fixture[2], fixture[3]));
            int afterCount = countTwPltzInstrItemNo(fixture[2]);
            
            // 削除件数の検証
            assertThat(fixture[0], beforeCount - afterCount, is(expectedCount));

            // 再検索結果の検証
            assertThat(fixture[0], actualResult.size(), is(expectedResult.size()));
            for (int i = 0; i < actualResult.size(); i++) {
                W2001PltzInstrItemDomain actual = actualResult.get(i);
                W2001PltzInstrItemDomain expected = expectedResult.get(i);
            
                assertThat("ITEM_NO", actual.getItemNo(), is(expected.getItemNo()));
                assertThat("PKC_CD", actual.getPkgCd(), is(expected.getPkgCd()));
            }
        }
    }

    
    /**
     * <br />transactOnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegister1() throws Exception {
        String[][] fixtures = {
            { "登録 (受注残≠0、仮在庫あり)", "pltzinstr11", ":MA2:30001205:06:S:M4:1::12/05/14:pltzinstr11:梱包指示者11:KG::X", "A002TB0091B3N:110:INSERT:80:150:3.0:30:WH6:X:Y:5:450" },
            { "登録 (受注残＝0、仮在庫あり)", "pltzinstr12", ":MA2:30001205:07:S:M4:1::12/05/14:pltzinstr12:梱包指示者12:KG::X", "A002TB0091B3N:111:INSERT:90:200:3.5:35:WH7:X:Y:6:700" },
            { "登録 (受注残≠0、仮在庫なし)", "pltzinstr13", ":MA2:30001205:08:S:M4:1::12/05/14:pltzinstr13:梱包指示者13:KG::X", "A002TB0091B3N:112:INSERT:100:150:4.0:40:WH8:X:Y:4:600" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 梱包指示の作成
            W2001PltzInstrDomain pltzInstr = toPltzInstr(fixtures[i][2]);
            pltzInstr.setPltzInstrItemList(toPltzInstrItemList(fixtures[i][1], fixtures[i][3]));
            
            // 梱包指示NOの設定
            String pltzInstrNoSeq = String.format("%03d", i + 1);
            String pltzInstrNo = "MA20512" + pltzInstrNoSeq;
            MockObjectManager.addReturnValue(DateUtil.class, "convertTime", toDate("12/05/14"));
            MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", Arrays.asList(pltzInstrNoSeq));
            MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", FLAG_N);
            
            // DensoContextの設定
            setDensoContext(fixtures[i][1]);
            
            // Register処理の実行
            pltzInstrService.transactOnRegister(pltzInstr);
            
            String reason = fixtures[i][0];
            String[] ignoreCols = {
                "COM_CREATE_TIMESTAMP",
                "COM_UPDATE_TIMESTAMP"
            };
            
            // 輸出受注の検証
            List<Map<String, String>> expectedTtExpRcvOdrList = readCsvFile("testTransactOnRegister_TT_EXP_RCV_ODR_" + i + ".csv");
            List<TtExpRcvOdrDomain> actualTtExpOdrList = searchTtExpRcvOdr(fixtures[i][2]);
            assertDomainList(reason + " [TT_EXP_RCV_ODR]", actualTtExpOdrList, expectedTtExpRcvOdrList, ignoreCols);
            
            // 梱包指示の検証
            Map<String, String> expectedTtPltzInstr = readCsvFile("testTransactOnRegister_TT_PLTZ_INSTR_" + i + ".csv").get(0);
            TtPltzInstrDomain actualTtPltzInstr = searchTtPltzInstr(pltzInstrNo);
            assertDomain(reason + " [TT_PLTZ_INSTR]", actualTtPltzInstr, expectedTtPltzInstr, ignoreCols);
            
            // 梱包指示品目番号の検証
            List<Map<String, String>> expectedTtPltzInstrItemNoList = readCsvFile("testTransactOnRegister_TT_PLTZ_INSTR_ITEM_NO_" + i + ".csv");
            List<TtPltzInstrItemNoDomain> actualTtPltzInstrItemNoList = searchTtPltzInstrItemNo(pltzInstrNo + ":" + fixtures[i][3]);
            assertDomainList(reason + " [TT_PLTZ_INSTR_ITEM_NO]", actualTtPltzInstrItemNoList, expectedTtPltzInstrItemNoList, ignoreCols);
            
            // 梱包指示品目番号受注情報の検証
            List<Map<String, String>> expectedTtPltzInstrOdrList = readCsvFile("testTransactOnRegister_TT_PLTZ_INSTR_ODR_" + i + ".csv");
            List<TtPltzInstrOdrDomain> actualTtPltzInstrOdrList = searchTtPltzInstrOdr(pltzInstrNo);
            assertDomainList(reason + " [TT_PLTZ_INSTR_ODR]", actualTtPltzInstrOdrList, expectedTtPltzInstrOdrList, ignoreCols);

            // 仮在庫の検証
            Map<String, String> expectedTtTmpStock = readCsvFile("testTransactOnRegister_TT_TMP_STOCK_" + i + ".csv").get(0);
            TtTmpStockDomain actualTtTmpStock = searchTtTmpStock("MA2::" + fixtures[i][3]);
            assertDomain(reason + " [TT_TMP_STOCK]", actualTtTmpStock, expectedTtTmpStock, ignoreCols);
        }
    }

    /**
     * <br />transactOnRegisterのテスト (異常系 / 輸出受注の引当不能)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegister2() throws Exception {
        String[] fixture = { "登録 (輸出受注の引当不能)", "pltzinstr14", ":MA2:30001205:09:S:M4:1::12/05/14:pltzinstr14:梱包指示者14:KG::X", "A002TB0091B3N:113:INSERT:110:250:4.0:45:WH9:X:Y:6:1125" };
        
        // 梱包指示の作成
        W2001PltzInstrDomain pltzInstr = toPltzInstr(fixture[2]);
        pltzInstr.setPltzInstrItemList(toPltzInstrItemList(fixture[1], fixture[3]));
        
        // DensoContextの設定
        setDensoContext(fixture[1]);
        
        // 例外の設定
        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString(NXS_E1_0008));
        
        // Register処理の実行
        pltzInstrService.transactOnRegister(pltzInstr);
    }

    
    /**
     * <br />transactOnRegisterCancelのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegisterCancel() throws Exception {
        String[][] fixtures = {
            { "キャンセル", "pltzinstr15", "MA20513001:MA2:30001205:10:S:M5:1::13/05/14:pltzinstr15:梱包指示者15:KG::X", "A002TB0091B3N:114:BUSHING:120:150:5.0:50:WH10:X:Y:3:750" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 梱包指示の作成
            W2001PltzInstrDomain pltzInstr = toPltzInstr(fixtures[i][2]);
            pltzInstr.setPltzInstrItemList(toPltzInstrItemList(fixtures[i][1], fixtures[i][3]));

            // 梱包指示NOの設定
            String pltzInstrNoSeq = String.format("%03d", i + i);
            String pltzInstrNo = "MA20513" + pltzInstrNoSeq;
            MockObjectManager.addReturnValue(DateUtil.class, "convertTime", toDate("13/05/14"));
            MockObjectManager.addReturnValue(CommonServiceImpl.class, "transactSequence", Arrays.asList(pltzInstrNoSeq));
            MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaNightFlg", FLAG_N);
            
            // DensoContextの設定
            setDensoContext(fixtures[i][1]);
            
            // Cancel処理の実行
            pltzInstrService.transactOnRegisterCancel(pltzInstr);
            
            String reason = fixtures[i][0];
            String[] ignoreCols = {
                "COM_CREATE_TIMESTAMP",
                "COM_UPDATE_TIMESTAMP"
            };

            // 輸出受注の検証
            List<Map<String, String>> expectedTtExpRcvOdrList = readCsvFile("testTransactOnRegisterCancel_TT_EXP_RCV_ODR_" + i + ".csv");
            List<TtExpRcvOdrDomain> actualTtExpOdrList = searchTtExpRcvOdr(fixtures[i][2]);
            assertDomainList(reason + " [TT_EXP_RCV_ODR]", actualTtExpOdrList, expectedTtExpRcvOdrList, ignoreCols);
            
            // 梱包指示の検証
            TtPltzInstrDomain actualTtPltzInstr = searchTtPltzInstr(pltzInstrNo);
            assertThat(reason + " [TT_PLTZ_INSTR]", actualTtPltzInstr, is(nullValue()));

            // 梱包指示品目番号の検証
            List<TtPltzInstrItemNoDomain> actualTtPltzInstrItemNoList = searchTtPltzInstrItemNo(pltzInstrNo);
            assertThat(reason + " [TT_PLTZ_INSTR_ITEM_NO]", actualTtPltzInstrItemNoList.size(), is(0));
            
            // 梱包指示品目番号受注情報の検証
            List<TtPltzInstrOdrDomain> actualTtPltzInstrOdrList = searchTtPltzInstrOdr(pltzInstrNo);
            assertThat(reason + " [TT_PLTZ_INSTR_ODR]", actualTtPltzInstrOdrList.size(), is(0));
            
            // 仮在庫の検証
            Map<String, String> expectedTtTmpStock = readCsvFile("testTransactOnRegisterCancel_TT_TMP_STOCK_" + i + ".csv").get(0);
            TtTmpStockDomain actualTtTmpStock = searchTtTmpStock("MA2::" + fixtures[i][3]);
            assertDomain(reason + " [TT_TMP_STOCK]", actualTtTmpStock, expectedTtTmpStock, ignoreCols);
        }

    }
    
    /**
     * <br />transactOnCreateUpdateのテスト (更新)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnCreateUpdate1() throws Exception {
        /*
         * 0: テストケースの説明
         * 1: DSC-ID
         * 2: 梱包指示品目番号 (項目値は":"区切り。複数件の場合は","区切り)
         *     0: 品目番号 
         *     1: 包装区分
         *     2: 品目名称
         *     3: 出荷ロット
         *     4: 梱包指示数量
         *     5: 実測ネット重量
         *     6: 小箱ロット数
         *     7: 倉庫保管場所
         *     8: 照合方式区分
         *     9: 箱数 (期待値)
         *    10: ネット総重量 (期待値) 
         * 3: 荷主コード
         */
        String[][] fixtures = {
            { "更新 (実測ネット重量≠null)", "pltzinstr10",  "A002TB0091B3N:110:BRACKET:30:10:1.0:5:WH1:X:Y:2:10", "MA2"},
            { "更新 (実測ネット重量＝null)", "pltzinstr10",  "A002TB0091B3N:111:BRACKET:30:50::10:WH2:X:Y:5:",     "MA2" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            setDensoContext(fixtures[i][1]);
            pltzInstrService.transactOnCreateUpdate(fixtures[i][3], toPltzInstrItemList(fixtures[i][1], fixtures[i][2]));

            Map<String, String> expected = readCsvFile(String.format("testTransactOnCreateUpdate1_%d.csv", i)).get(0);
            TwPltzInstrItemNoDomain actual = searchTwPltzInstrItemNo(fixtures[i][1], fixtures[i][2]);
            assertDomain(fixtures[i][0], actual, expected);
        }
    }

    /**
     * <br />transactOnCreateUpdateのテスト (登録)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnCreateUpdate2() throws Exception {
        /*
         * 0: テストケースの説明
         * 1: DSC-ID
         * 2: 梱包指示品目番号 (項目値は":"区切り。複数件の場合は","区切り)
         * 3: 荷主コード
         */
        String[][] fixtures = {
            { "登録 (包装区分＝'')"        , "pltzinstr10",  "A002TB0091B3N::BRACKET:50:100:2.0:15:WH3:X:N:7:200",    "MA2" },
            { "登録 (実測ネット重量≠null)", "pltzinstr10",  "A002TB0091B3N:113:BRACKET:60:150:2.5:20:WH4:X:N:7:375", "MA2" },
            { "登録 (実測ネット重量＝null)", "pltzinstr10",  "A002TB0091B3N:114:BRACKET:70:200::25:WH5:X:N:8:",       "MA2" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            setDensoContext(fixtures[i][1]);
            pltzInstrService.transactOnCreateUpdate(fixtures[i][3], toPltzInstrItemList(fixtures[i][1], fixtures[i][2]));

            Map<String, String> expected = readCsvFile(String.format("testTransactOnCreateUpdate2_%d.csv", i)).get(0);
            TwPltzInstrItemNoDomain actual = searchTwPltzInstrItemNo(fixtures[i][1], fixtures[i][2]);
            assertDomain(fixtures[i][0], actual, expected);
        }
    }
    
    /**
     * <br />transactOnCreateUpdateのテスト (異常系 / ネット総重量の桁溢れ)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnCreateUpdate3() throws Exception {
        String[] fixture = { "更新 (実測ネット重量≠null)", "pltzinstr10",  "A002TB0091B3N:110:BRACKET:30:120:480000:5:WH1:X:Y:2:10", "MA2" };

        setDensoContext(fixture[1]);

        thrown.expect(GscmApplicationException.class);
        thrown.expectMessage(containsString("NXS-E7-0157"));
        
        pltzInstrService.transactOnCreateUpdate(fixture[3], toPltzInstrItemList(fixture[1], fixture[2]));
    }

    /**
     * <br />updatePrintCmlのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testUpdatePrintCml() throws Exception {
        /*
         * 0: テストケースの説明
         * 1: DSC-ID
         * 2: 梱包指示データ (1件 / 項目値をカンマ区切り)
         * 3: CML出力日
         */
        // 検索条件
        String[][] fixtures = {
            { "CMLの作成 (ステータス更新あり)", "pltzinstr09", "TH20000003:TH2::::::40::::::", "27/04/14" },
            { "CMLの作成 (ステータス更新なし)", "pltzinstr09", "TH20000004:TH2::::::30::::::", "27/04/14" },
        };
        
        // PDF帳票
        File pdfFile = folder.newFile();
        
        String[] ignoreCols = {
            "COM_UPDATE_TIMESTAMP",
            "COM_CREATE_TIMESTAMP"
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            setDensoContext(fixtures[i][1]);
            MockObjectManager.addReturnValue(DateUtil.class, "convertTime", toDate(fixtures[i][3]));
            MockObjectManager.addReturnValue(L2003ReportServiceImpl.class, "searchCml", pdfFile);
            
            File file = pltzInstrService.updatePrintCml(toPltzInstr(fixtures[i][2]), "dd/MM/yyyy");
            
            Map<String, String> expectedTtPltzInstr = readCsvFile("testUpdatePrintCml_W2001PltzInstr_" + i + ".csv").get(0);
            TtPltzInstrDomain actualTtPltzInstr = searchTtPltzInstr(fixtures[i][2]);
            assertDomain(fixtures[i][0], actualTtPltzInstr, expectedTtPltzInstr, ignoreCols);
            assertThat(fixtures[i][0], file, is(pdfFile));
        }
    }
    
    /**
     * <br />updatePrintInstrのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testUpdatePrintInstr() throws Exception {
        /*
         * 0: テストケースの説明
         * 1: DSC-ID
         * 2: 梱包指示データ (1件 / 項目値をカンマ区切り)
         */
        String[][] fixtures = {
            { "梱包指示書の作成 (ステータス更新あり)", "pltzinstr08", "TH20000001:::::::10::::::" },
            { "梱包指示書の作成 (ステータス更新なし)", "pltzinstr08", "TH20000002:::::::30::::::" }
        };
       
        // PDF帳票
        File pdfFile = folder.newFile();
        
        String[] ignoreCols = {
            "COM_UPDATE_TIMESTAMP",
            "COM_CREATE_TIMESTAMP"
        };

        for (int i = 0; i < fixtures.length; i++) {
            setDensoContext(fixtures[i][1]);
            MockObjectManager.addReturnValue(L2001ReportServiceImpl.class, "searchPltzInstr", pdfFile);
            
            File file = pltzInstrService.updatePrintInstr(toPltzInstr(fixtures[i][2]), "dd/MM/yyyy");
            
            Map<String, String> expectedTtPltzInstr = readCsvFile("testUpdatePrintInstr_W2001PltzInstr_" + i + ".csv").get(0);
            TtPltzInstrDomain actualTtPltzInstr = searchTtPltzInstr(fixtures[i][2]);
            assertDomain(fixtures[i][0], actualTtPltzInstr, expectedTtPltzInstr, ignoreCols);
            assertThat(fixtures[i][0], file, is(pdfFile));
        }
    }
    
    /**
     * <br />指定された値を含む{@link W2001PltzInstrDomain}を作成します。
     *
     * @param fixture 検索条件 (項目値は":"区切り)
     * @return 作成した{@link W2001PltzInstrDomain}
     * @throws Exception {@link W2001PltzInstrDomain}が作成できない場合
     */
    private W2001PltzInstrDomain toPltzInstr(String fixture) throws Exception {
        W2001PltzInstrDomain pltzInstr = new W2001PltzInstrDomain();
        
        String[] values = fixture.split(":");
        if (!isEmpty(values, 0)) {
            pltzInstr.setPltzInstrNo(values[0]);
        }
        if (!isEmpty(values, 1)) {
            pltzInstr.setShipperCd(values[1]);
        }
        if (!isEmpty(values, 2)) {
            pltzInstr.setCustomerCd(values[2]);
        }
        if (!isEmpty(values, 3)) {
            pltzInstr.setLgcyShipTo(values[3]);
        }
        if (!isEmpty(values, 4)) {
            pltzInstr.setTrnsCd(values[4]);
        }
        if (!isEmpty(values, 5)) {
            pltzInstr.setPlntCd(values[5]);
        }
        if (!isEmpty(values, 6)) {
            pltzInstr.setLgcyWhCd(values[6]);
        }
        if (!isEmpty(values, 7)) {
            pltzInstr.setPltzInstrStatus(values[7]);
        }
        if (!isEmpty(values, 8)) {
            pltzInstr.setPltzInstrDt(toDate(values[8]));
        }
        if (!isEmpty(values, 9)) {
            pltzInstr.setPltzInstrIssuerId(values[9]);
        }
        if (!isEmpty(values, 10)) {
            pltzInstr.setPltzInstrNm(values[10]);
        }
        if (!isEmpty(values, 11)) {
            pltzInstr.setWeightUnit(values[11]);
        }
        if (!isEmpty(values, 12)) {
            pltzInstr.setCmlPrintOutDt(toDate(values[12]));
        }
        if (!isEmpty(values, 13)) {
            pltzInstr.setCollateMethTyp(values[13]);
        }
        
        
        return pltzInstr;
    }
    
    /**
     * <br />指定された値を含む{@link W2001PltzInstrCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @return 作成した{@link W2001PltzInstrCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    private W2001PltzInstrCriteriaDomain toPltzInstrCriteria(String[] fixture) throws Exception {
        W2001PltzInstrCriteriaDomain criteria = new W2001PltzInstrCriteriaDomain();
        
        // GSCM部品(SearchCountLimitAdvice)で必要
        criteria.setLocale(new Locale("en"));
        
        criteria.setServerId(fixture[2]);
        criteria.setShipperCd(fixture[3]);
        criteria.setCustomerCd(fixture[4]);
        criteria.setLgcyShipTo(fixture[5]);
        criteria.setTrnsCd(fixture[6]);
        criteria.setPlntCd(fixture[7]);
        criteria.setLgcyWhCd(fixture[8]);
        criteria.setPltzInstrStatus(fixture[9]);
        criteria.setPltzInstrNo(fixture[10]);
        criteria.setPltzInstrDtFrom(toDate(fixture[11]));
        criteria.setPltzInstrDtTo(toDate(fixture[12]));
        criteria.setPltzInstrIssuerId(fixture[13]);
        
        return criteria;
    }
    
    /**
     * <br />指定された値と権限を含む{@link W2001PltzInstrCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @param userAuthList ユーザ権限
     * @return 作成した{@link W2001PltzInstrCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    private W2001PltzInstrCriteriaDomain toPltzInstrCriteria(String[] fixture, String[][] userAuthList) throws Exception {
        W2001PltzInstrCriteriaDomain criteria = toPltzInstrCriteria(fixture);
        criteria.setUserAuthList(toUserAuthList(userAuthList));
        
        return criteria;
    }
    
    /**
     * <br />指定された値と検索範囲を含む{@link W2001PltzInstrCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @param range 検索範囲 (0: 開始位置、1: 終了位置)  
     * @return 作成した{@link W2001PltzInstrCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    private W2001PltzInstrCriteriaDomain toPltzInstrCriteria(String[] fixture, int[] range) throws Exception {
        W2001PltzInstrCriteriaDomain criteria = toPltzInstrCriteria(fixture);
        criteria.setRowNumFrom(range[0]);
        criteria.setRowNumTo(range[1]);
        
        return criteria;
    }
    
    /**
     * <br />指定された値を含む{@link W2001PltzInstrItemCriteriaDomain}を作成します。
     *
     * @param fixture 検索条件
     * @return 作成した{@link W2001PltzInstrItemCriteriaDomain}
     * @throws Exception 検索条件が不正な場合
     */
    private W2001PltzInstrItemCriteriaDomain toPltzInstrItemCriteria(String[] fixture) throws Exception {
        W2001PltzInstrItemCriteriaDomain criteria = new W2001PltzInstrItemCriteriaDomain();
        
        // GSCM部品(SearchCountLimitAdvice)で必要
        criteria.setLocale(new Locale("en"));

        criteria.setDscId(fixture[2]);
        criteria.setShipperCd(fixture[3]);
        criteria.setCustomerCd(fixture[4]);
        criteria.setLgcyShipTo(fixture[5]);
        criteria.setTrnsCd(fixture[6]);
        criteria.setPlntCd(fixture[7]);
        criteria.setLgcyWhCd(fixture[8]);
        criteria.setPltzInstrDt(toDate(fixture[9]));
        criteria.setCustomerPoNo(fixture[10]);
        criteria.setItemNo(fixture[11]);
        criteria.setPkgCd(fixture[12]);
        criteria.setAplyStrtDt(toDate(fixture[14]));

        return criteria;
    }
    
    /**
     * <br />指定された稼働日を含むWS2001の結果ドメインを作成します。
     *
     * @param workingDays 稼働日のリスト
     * @return 作成したWS2001の結果ドメイン
     */
    private Ws2001ResultDomain toWs2001ResultDomain(String workingDays) {
        Ws2001ResultDomain result = null;
        
        if (workingDays == null) {
            result = new Ws2001ResultDomain(WS_RESULT_ERROR);
        } else {
            result = new Ws2001ResultDomain(WS_RESULT_SUCCESS);
            result.setWorkingDayList(Arrays.asList(workingDays.split(",")));
        }
        
        return result;
    }
    
    /**
     * <br />指定された品目情報を含むWS2002の結果ドメインを作成します。
     *
     * @param itemInfo 品目情報
     * @return 作成したWS2001の結果ドメイン
     */
    private Ws2002ResultDomain toWs2002ResultDomain(String[] itemInfo) {
        Ws2002ResultDomain result = new Ws2002ResultDomain(itemInfo[0]);
        
        List<Ws2002ResultItemDomain> resultItemList = new ArrayList<Ws2002ResultItemDomain>();
        for (String item : itemInfo[2].split(",")) {
            Ws2002ResultItemDomain resultItem = new Ws2002ResultItemDomain();
            
            String[] values = item.split(":");
            if (values.length == 3) {
                resultItem.setItnbr(values[0]);
                resultItem.setLotsz(values[1]);
                resultItem.setWhslc(values[2]);

                resultItemList.add(resultItem);
            }
        }
        
        result.setDcdiv(itemInfo[1]);
        result.setItemList(resultItemList);
        
        return result;
    }
    
    /**
     * <br />文字列→日付変換を行います。
     *
     * @param value 日付文字列
     * @return 変換結果
     * @throws Exception 日付変換時にエラーが発生した場合
     */
    private Date toDate(String value) throws Exception {
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
    private List<UserAuthDomain> toUserAuthList(String[][] userAuthLDataList) {
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
     * <br />梱包指示品目番号ワークの件数を取得します。
     *
     * @param dscId DSC-ID
     * @return 梱包指示品目番号ワークの件数
     * @throws Exception 梱包指示品目番号ワークの件数が取得できない場合
     */
    private int countTwPltzInstrItemNo(String dscId) throws Exception {
        TwPltzInstrItemNoCriteriaDomain criteria = new TwPltzInstrItemNoCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        
        return twPltzInstrItemNoService.searchCount(criteria);
    }
    
    /**
     * <br />指定された値を含む{@link W2001PltzInstrItemDomain}を作成します。
     *
     * @param dscId DSC-ID
     * @param fixture 品目番号、包装区分 (コロン区切り)
     * @return 作成した{@link W2001PltzInstrItemDomain}
     */
    private List<W2001PltzInstrItemDomain> toPltzInstrItemList(String dscId, String fixture) {
        List<W2001PltzInstrItemDomain> pltzInstrItemList = new ArrayList<W2001PltzInstrItemDomain>();
        
        if (fixture != null) {
            for (String item : fixture.split(",")) {
                W2001PltzInstrItemDomain pltzInstrItem = new W2001PltzInstrItemDomain();
                pltzInstrItem.setLoginUserDscId(dscId);

                String[] values = item.split(":");
                if (!isEmpty(values, 0)) {
                    pltzInstrItem.setItemNo(values[0]);
                }
                if (!isEmpty(values, 1)) {
                    pltzInstrItem.setPkgCd(values[1]);
                }
                if (!isEmpty(values, 2)) {
                    pltzInstrItem.setItemDescription(values[2]);
                }
                if (!isEmpty(values, 3)) {
                    pltzInstrItem.setShippingLot(new BigDecimal(values[3]));
                }
                if (!isEmpty(values, 4)) {
                    pltzInstrItem.setInstrQty(new BigDecimal(values[4]));
                }
                if (!isEmpty(values, 5)) {
                    pltzInstrItem.setNetWeightA(values[5]);
                }
                if (!isEmpty(values, 6)) {
                    pltzInstrItem.setBoxLotQty(new BigDecimal(values[6]));
                }
                if (!isEmpty(values, 7)) {
                    pltzInstrItem.setWhStkLocation(values[7]);
                }
                if (!isEmpty(values, 8)) {
                    pltzInstrItem.setCollateMethTyp(values[8]);
                }
                if (!isEmpty(values, 9)) {
                    pltzInstrItem.setDisabledFlg(values[9]);
                }
                
                if (!isEmpty(values, 10)) {
                    pltzInstrItem.setBoxQty(new BigDecimal(values[10]));
                }
                if (!isEmpty(values, 11)) {
                    pltzInstrItem.setTotalNetWeight(new BigDecimal(values[11]));
                }
                
                pltzInstrItemList.add(pltzInstrItem);
            }
        }
        
        return pltzInstrItemList;
    }

    /**
     * <br />指定された梱包指示NOに対する梱包指示データを取得します。
     *
     * @param fixture 梱包指示データ
     * @return 該当する梱包指示データ
     * @throws Exception 梱包指示データが取得できない場合
     */
    private TtPltzInstrDomain searchTtPltzInstr(String fixture) throws Exception {
        TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
        criteria.setPltzInstrNo(fixture.split(":")[0]);
        
        return ttPltzInstrService.searchByKey(criteria);
    }
    
    /**
     * <br />指定された主キーに対する梱包指示品目番号ワークを取得します。
     *
     * @param dscId DSC-ID
     * @param fixture 主キー
     * @return 該当する梱包指示品目番号ワーク
     * @throws Exception 梱包指示品目番号ワークが取得できない場合
     */
    private TwPltzInstrItemNoDomain searchTwPltzInstrItemNo(String dscId, String fixture) throws Exception {
        String[] values = fixture.split(":");
        
        TwPltzInstrItemNoCriteriaDomain criteria = new TwPltzInstrItemNoCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setItemNo(values[0]);
        if (StringUtils.isEmpty(values[1])) {
            criteria.setPkgCd(" ");
        } else {
            criteria.setPkgCd(values[1]);
        }
        
        return twPltzInstrItemNoService.searchByKey(criteria);
    }

    /**
     * <br />指定された梱包指示に対応する輸出受注データを取得します。
     *
     * @param fixture 検索条件 (梱包指示)
     * @return 該当する輸出受注
     * @throws Exception 輸出受注が取得できない場合
     */
    private List<TtExpRcvOdrDomain> searchTtExpRcvOdr(String fixture) throws Exception {
        TtExpRcvOdrCriteriaDomain criteria = new TtExpRcvOdrCriteriaDomain();
        
        String[] values = fixture.split(":");
        if (!isEmpty(values, 1)) {
            criteria.setRcvOdrCompCd(values[1]);
        }
        if (!isEmpty(values, 2)) {
            criteria.setCustomerCd(values[2]);
        }
        if (!isEmpty(values, 3)) {
            criteria.setLgcyShipTo(values[3]);
        }
        if (!isEmpty(values, 4)) {
            criteria.setTrnsCd(values[4]);
        }

        return ttExpRcvOdrService.searchByCondition(criteria);
    }
    
    /**
     * <br />指定された梱包指示に対応する梱包指示品目番号を取得します。
     *
     * @param fixture 検索条件 (梱包指示NO)
     * @return 該当する梱包指示品目番号
     * @throws Exception 梱包指示品目番号が取得できない場合
     */
    private List<TtPltzInstrItemNoDomain> searchTtPltzInstrItemNo(String fixture) throws Exception {
        TtPltzInstrItemNoCriteriaDomain criteria = new TtPltzInstrItemNoCriteriaDomain();
        
        String[] values = fixture.split(":");
        if (0 < values.length && !StringUtils.isEmpty(values[0])) {
            criteria.setPltzInstrNo(values[0]);
        }
        
        return ttPltzInstrItemNoService.searchByCondition(criteria);
    }
    
    /**
     * <br />指定された梱包指示に対応する梱包指示品目番号受注情報を取得します
     *
     * @param fixture 検索条件 (梱包指示NO)
     * @return 該当する梱包指示品目番号受注情報
     * @throws Exception 梱包指示品目番号受注情報が取得できない場合
     */
    private List<TtPltzInstrOdrDomain> searchTtPltzInstrOdr(String fixture) throws Exception {
        TtPltzInstrOdrCriteriaDomain criteria = new TtPltzInstrOdrCriteriaDomain();
        
        String[] values = fixture.split(":");
        if (0 < values.length && !StringUtils.isEmpty(values[0])) {
            criteria.setPltzInstrNo(values[0]);
        }
        
        return ttPltzInstrOdrService.searchByCondition(criteria);
    }
    
    /**
     * <br />指定された条件に該当する仮在庫を取得します。
     *
     * @param fixture 検索条件 (仮在庫の主キー)
     * @return 該当する仮在庫
     * @throws Exception 仮在庫を取得できない場合
     */
    private TtTmpStockDomain searchTtTmpStock(String fixture) throws Exception {
        TtTmpStockCriteriaDomain criteria = new TtTmpStockCriteriaDomain();
        
        String[] values = fixture.split(":");
        if (!isEmpty(values, 0)) {
            criteria.setShipperCd(values[0]);
        }
        if (!isEmpty(values, 1)) {
            criteria.setLgcyWhCd(values[1]);
        }
        if (!isEmpty(values, 2)) {
            criteria.setItemNo(values[2]);
        }
        if (!isEmpty(values, 3)) {
            criteria.setPkgCd(values[3]);
        }
        
        return ttTmpStockService.searchByCondition(criteria).get(0);
    }
}
