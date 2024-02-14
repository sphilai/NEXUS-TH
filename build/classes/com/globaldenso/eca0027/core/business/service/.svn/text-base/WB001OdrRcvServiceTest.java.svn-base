/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0037;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.beans.PersistenceDelegate;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrServiceImpl;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemSubDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvTestDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultSubItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB011ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsB001RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB002RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB003RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB004RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB005RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB007RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB011RestServiceMockImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10295 $
 */
public class WB001OdrRcvServiceTest extends AbstractEca0027Test {

    /**
     * W2014XTagService サービス
     */
    private WB001OdrRcvService wb001OdrRcvService;

    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
        
    /**
     * <br />デフォルトコンストラクタです。
     */
    public WB001OdrRcvServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        wb001OdrRcvService = (WB001OdrRcvService) getContext().getBean("wb001OdrRcvService");
    }
    
//////////////////////////// WB001OdrRcvService.validateConsistency メソッドの確認 ////////////////////////////////////////
    /**
     * <br />validateConsistencyAllocQtyCustomerPartNoのテスト
     *
     */
    @Test
    public void testValidateConsistencyAllocQtyCustomerPartNo(){
        //得意先品目番号変更可否チェック
        boolean result = false;
        
        // 0 == Alloc. QTY かつ Customer Part No. <> hidden.Customer Part No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPartNo(BigDecimal.ZERO, "customerPartNo", "customerPartNoOrg");
        assertThat(result, is(true));
        
        // 0 <> Alloc. QTY かつ Customer Part No. == hidden.Customer Part No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPartNo(new BigDecimal(100), "customerPartNoOrg", "customerPartNoOrg");
        assertThat(result, is(true));
        
        // 0 <> Alloc. QTY かつ Customer Part No. <> hidden.Customer Part No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPartNo(new BigDecimal(100), "customerPartNo", "customerPartNoOrg");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyAllocQtyCustomerPoNoのテスト
     *
     */
    @Test
    public void testValidateConsistencyAllocQtyCustomerPoNo(){
        //得意先P/O No.変更可否チェック
        boolean result = false;
        
        // 0 == Alloc. QTY かつ Customer P/O No. <> hidden.Customer P/O No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPoNo(BigDecimal.ZERO, "customerPoNo", "customerPoNoOrg");
        assertThat(result, is(true));     
        
        // 0 <> Alloc. QTY かつ Customer P/O No. == hidden.Customer P/O No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPoNo(new BigDecimal(100), "customerPoNoOrg", "customerPoNoOrg");
        assertThat(result, is(true));    
        
        // 0 <> Alloc. QTY かつ Customer P/O No. <> hidden.Customer P/O No.
        result = wb001OdrRcvService.validateConsistencyAllocQtyCustomerPoNo(new BigDecimal(100), "customerPoNo", "customerPoNoOrg");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyAllocQtySalesPoNoのテスト
     *
     */
    @Test
    public void testValidateConsistencyAllocQtySalesPoNo(){
        //販売会社P/O変更可否チェック
        boolean result = false;
        
        // 0 == Alloc. QTY かつ Sales P/O No. <> hidden.Sales P/O No.の場合エラー
        result = wb001OdrRcvService.validateConsistencyAllocQtySalesPoNo(BigDecimal.ZERO, "salesPoNo", "salesPoNoOrg");
        assertThat(result, is(true));
        
        // 0 <> Alloc. QTY かつ Sales P/O No. == hidden.Sales P/O No.の場合エラー
        result = wb001OdrRcvService.validateConsistencyAllocQtySalesPoNo(new BigDecimal(100), "salesPoNoOrg", "salesPoNoOrg");
        assertThat(result, is(true));
        
        // 0 <> Alloc. QTY かつ Sales P/O No. <> hidden.Sales P/O No.の場合エラー
        result = wb001OdrRcvService.validateConsistencyAllocQtySalesPoNo(new BigDecimal(100), "salesPoNo", "salesPoNoOrg");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyDateReceivingDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyDateReceivingDate(){
        //顧客納期妥当性チェック
        boolean result = false;
        
        Date dueDate = DateUtil.parseDate("31/08/2012", dateFormat);
        Date receivingDate0830 = DateUtil.parseDate("30/08/2012", dateFormat);
        Date receivingDate0228 = DateUtil.parseDate("28/02/2013", dateFormat);
        Date receivingDate0301 = DateUtil.parseDate("01/03/2013", dateFormat);
        
        // Due Date <= Receiving Date <= Due Dateの半年後
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate, receivingDate0228);
        assertThat(result, is(true));
        
        // Due Date が null
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(null, receivingDate0228);
        assertThat(result, is(true));
        
        // Receiving Date < Due Date
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate, receivingDate0830);
        assertThat(result, is(false));
        
        // Due Dateの半年後 < Receiving Date
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate, receivingDate0301);
        assertThat(result, is(false));
        
        // Due Dateの半年後の月が30日までの月
        Calendar cal = Calendar.getInstance();
        cal.set(2014, 5, 31);
        MockObjectManager.addReturnValue(Calendar.class, "hasUserAuthForCompPlnt", cal);
        
        Date dueDate0501 = DateUtil.parseDate("01/05/2014", dateFormat);
        Date receivingDate0531 = DateUtil.parseDate("31/05/2014", dateFormat);
        
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate0501, receivingDate0531);
        assertThat(result, is(true));
        
        // 半年後が30日の月のケース
        Date dueDate0531 = DateUtil.parseDate("31/05/2014", dateFormat);
        Date receivingDate0601 = DateUtil.parseDate("01/06/2014", dateFormat);
        
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate0531, receivingDate0601);
        assertThat(result, is(true));
        
        
        // 閏年のケース
        Date dueDate0831 = DateUtil.parseDate("31/08/2011", dateFormat);
        Date receivingDate0901 = DateUtil.parseDate("01/09/2011", dateFormat);
        
        result = wb001OdrRcvService.validateConsistencyDateReceivingDate(dueDate0831, receivingDate0901);
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyDueDateReceivingDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyDueDateReceivingDate(){
        //顧客納期妥当性チェック
        boolean result = false;
        
        Date dueDate = DateUtil.parseDate("31/08/2012", dateFormat);
        Date receivingDate0830 = DateUtil.parseDate("30/08/2012", dateFormat);
        Date receivingDate0228 = DateUtil.parseDate("28/02/2013", dateFormat);
        Date receivingDate0331 = DateUtil.parseDate("01/03/2013", dateFormat);
        
        // Due Date <= Receiving Date <= Due Dateの半年後
        result = wb001OdrRcvService.validateConsistencyDueDateReceivingDate(dueDate, receivingDate0228);
        assertThat(result, is(true));
        
        // Due Date が null
        result = wb001OdrRcvService.validateConsistencyDueDateReceivingDate(null, receivingDate0228);
        assertThat(result, is(true));
        
        // Receiving Date < Due Date
        result = wb001OdrRcvService.validateConsistencyDueDateReceivingDate(dueDate, receivingDate0830);
        assertThat(result, is(false));
        
        // Due Dateの半年後 < Receiving Date
        result = wb001OdrRcvService.validateConsistencyDueDateReceivingDate(dueDate, receivingDate0331);
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyFirmQtyAllocQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyFirmQtyAllocQty(){
        //確定数妥当性チェック
        boolean result = false;
        
        // Firm QTY >= Alloc. QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyAllocQty(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));

        // Firm QTY < Alloc. QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyAllocQty(new BigDecimal(99), new BigDecimal(100));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyFirmQtyForecastQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyFirmQtyForecastQty(){
        //確定・内示数チェック
        boolean result = false;
        
        // 0 == Firm QTY かつ 0 == Forecast QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(new BigDecimal(0), new BigDecimal(0));
        assertThat(result, is(true));
        
        // 0 <> Firm QTY かつ 0 == Forecast QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(new BigDecimal(1), new BigDecimal(0));
        assertThat(result, is(true));
        
        // 0 == Firm QTY かつ 0 <> Forecast QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(new BigDecimal(0), new BigDecimal(1));
        assertThat(result, is(true));
        
        // 0 <> Firm QTY かつ 0 <> Forecast QTY
        result = wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(new BigDecimal(1), new BigDecimal(1));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyNewQtyAllocQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyNewQtyAllocQty(){
        //数量妥当性チェック
        boolean result = false;
        
        // New QTY >= Alloc. QTY
        result = wb001OdrRcvService.validateConsistencyNewQtyAllocQty(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // New QTY < Alloc. QTY
        result = wb001OdrRcvService.validateConsistencyNewQtyAllocQty(new BigDecimal(99), new BigDecimal(100));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyNewQtyOrderQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyNewQtyOrderQty(){
        //合計数量不変チェック
        boolean result = false;
        
        // New QTYの合計 == 引継値.Order QTY
        result = wb001OdrRcvService.validateConsistencyNewQtyOrderQty(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // New QTYの合計 <> 引継値.Order QTY
        result = wb001OdrRcvService.validateConsistencyNewQtyOrderQty(new BigDecimal(101), new BigDecimal(100));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyNewQtyOrderQtyHiddenのテスト
     *
     */
    @Test
    public void testValidateConsistencyNewQtyOrderQtyHidden(){
        //情報変更チェック
        boolean result = false;
        
        // trueの場合、true
        result = wb001OdrRcvService.validateConsistencyNewQtyOrderQtyHidden(true);
        assertThat(result, is(true));
        
        // falseの場合、false
        result = wb001OdrRcvService.validateConsistencyNewQtyOrderQtyHidden(false);
        assertThat(result, is(false));
    }

    
    /**
     * <br />validateConsistencyNewQtyQtyCartonのテスト
     *
     */
    @Test
    public void testValidateConsistencyNewQtyQtyCarton(){
        //ロット倍数チェック
        boolean result = false;
        
        // New QTYがQTY/Cartonで割り切れる
        result = wb001OdrRcvService.validateConsistencyNewQtyQtyCarton(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // New QTYがQTY/Cartonで割り切れない
        result = wb001OdrRcvService.validateConsistencyNewQtyQtyCarton(new BigDecimal(101), new BigDecimal(100));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyOrderQtyFirmQtyForecastQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyOrderQtyFirmQtyForecastQty(){
        //確定・内示数チェック
        boolean result = false;
        
        // 0 <> hidden.Order QTY　かつ 0 = Firm QTY　かつ 0 = Forecast QTY
        result = wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(new BigDecimal(100), new BigDecimal(0), new BigDecimal(0));
        assertThat(result, is(true));
        
        // 0 = hidden.Order QTY　かつ 0 <> Firm QTY　かつ 0 = Forecast QTY
        result = wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(new BigDecimal(0), new BigDecimal(100), new BigDecimal(0));
        assertThat(result, is(true));
        
        // 0 = hidden.Order QTY　かつ 0 = Firm QTY　かつ 0 <> Forecast QTY
        result = wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(new BigDecimal(0), new BigDecimal(0), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 0 = hidden.Order QTY　かつ 0 = Firm QTY　かつ 0 = Forecast QTY
        result = wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(new BigDecimal(0), new BigDecimal(0), new BigDecimal(0));
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyPkgCdのテスト
     *
     */
    @Test
    public void testValidateConsistencyPkgCd(){
        //包装コード関連チェック
        boolean result = false;
        
        // デンソーグループ 且つ　包装コードがブランク
        result = wb001OdrRcvService.validateConsistencyPkgCd("", "DG");
        assertThat(result, is(true));

        // デンソーグループ 且つ　包装コードがブランク以外
        result = wb001OdrRcvService.validateConsistencyPkgCd("110", "DG");
        assertThat(result, is(false));

        // デンソー 且つ　包装コードがブランク
        result = wb001OdrRcvService.validateConsistencyPkgCd("110", "D");
        assertThat(result, is(true));

        // デンソー 且つ　包装コードがブランク以外
        result = wb001OdrRcvService.validateConsistencyPkgCd("", "D");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyShipperPlantAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateConsistencyShipperPlantAuth() throws Exception {
        //権限チェック(更新権限)
        boolean result = false;
        
        // 機能利用権限あり(R-ALL)
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("MY4", "M1");
        assertThat(result, is(true));
        
        // 機能利用権限あり
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", true);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("MY4", "M1");
        assertThat(result, is(true));
        
        // 機能利用権限なし
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("shipperCd", "plntCd");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyShipperAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateConsistencyShipperAuth() throws Exception {
        //権限チェック(更新権限)
        boolean result = false;
        
        // 機能利用権限あり(R-ALL)
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", true);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("MY4", "M1");
        assertThat(result, is(true));
        
        // 機能利用権限あり
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", true);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("MY4", "M1");
        assertThat(result, is(true));
        
        // 機能利用権限なし
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasUserAuthForCompPlnt", false);
        result = wb001OdrRcvService.validateConsistencyShipperPlantAuth("shipperCd", "");
        assertThat(result, is(false));
    }

////////////////////////////WB001OdrRcvService.validateDatabase メソッドの確認 ////////////////////////////////////////
    /**
     * <br /CommonServiceImpl.classｃvalidateDatabaseCigmaAvailableのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable() throws Exception{
        //CIGMA夜間処理中チェック
        boolean result = false;
        
        // 夜間バッチ中でない
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", true);
        result = wb001OdrRcvService.validateDatabaseCigmaAvailable(false, "MY4");
        assertThat(result, is(true));
        
        // 夜間バッチ中でない
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAvailable", false);
        result = wb001OdrRcvService.validateDatabaseCigmaAvailable(false, "shipper");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseProcessingDateOnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseProcessingDateOnMultiPoRegister() throws Exception{
        //ETD妥当性チェック
        boolean result = false;
        
        Date dueDate = DateUtil.parseDate("13/05/2014", dateFormat);
        Date cigmaAds1 = DateUtil.parseDate("12/05/2014", dateFormat);
        Date cigmaAds2 = DateUtil.parseDate("13/05/2014", dateFormat);
        
        // 本日 < Due Date
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds1);
        result = wb001OdrRcvService.validateDatabaseProcessingDateOnMultiPoRegister("MY4", dueDate);
        assertThat(result, is(true));
        
        // 本日 >= Due Date
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds2);
        result = wb001OdrRcvService.validateDatabaseProcessingDateOnMultiPoRegister("shipper", dueDate);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseProcessingDateOnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseProcessingDateOnRegister() throws Exception {
        //ETD妥当性チェック
        boolean result = false;
        
        Date dueDate = DateUtil.parseDate("13/05/2014", dateFormat);
        Date cigmaAds1 = DateUtil.parseDate("12/05/2014", dateFormat);
        Date cigmaAds2 = DateUtil.parseDate("13/05/2014", dateFormat);
        
        // 本日 < Due Date
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds1);
        result = wb001OdrRcvService.validateDatabaseProcessingDateOnRegister("MY4", dueDate);
        assertThat(result, is(true));
        
        // Due Date が null
        result = wb001OdrRcvService.validateDatabaseProcessingDateOnRegister("MY4", null);
        assertThat(result, is(true));
        
        // 本日 >= Due Date
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds2);
        result = wb001OdrRcvService.validateDatabaseProcessingDateOnRegister("shipper", dueDate);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister() throws Exception {
        //送荷先名称取得存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        TmCigmaShipToXrefDomain tmCigmaShipToXref = new TmCigmaShipToXrefDomain();
        TmNxsShipToDomain tmNxsShipTo = new TmNxsShipToDomain();
        tmCigmaShipToXref.setShipToCd("00");
        tmNxsShipTo.setShipToNm("Ship To Name");
        
        // 正常系
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is("Ship To Name"));
        
        // 正常系　第四引数がnull
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister("MY4" , "30001205", "00", null);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is(nullValue()));
        
        // 異常系　NEXUS送荷先クロスリファレンス原単位が取得できない
        MockObjectManager.addReturnNull(TmCigmaShipToXrefServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
        
        // 異常系　NEXUS送荷先原単位が取得できない
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnNull(TmNxsShipToServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch() throws Exception {
        //送荷先名称取得存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        TmCigmaShipToXrefDomain tmCigmaShipToXref = new TmCigmaShipToXrefDomain();
        TmNxsShipToDomain tmNxsShipTo = new TmNxsShipToDomain();
        tmCigmaShipToXref.setShipToCd("00");
        tmNxsShipTo.setShipToNm("Ship To Name");
        
        // 正常系
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is("Ship To Name"));
        
        // 正常系　第四引数がnull
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch("MY4" , "30001205", "00", null);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is(nullValue()));
        
        // 異常系　NEXUS送荷先クロスリファレンス原単位が取得できない
        MockObjectManager.addReturnNull(TmCigmaShipToXrefServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
        
        // 異常系　NEXUS送荷先原単位が取得できない
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnNull(TmNxsShipToServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister() throws Exception {
        //送荷先名称取得存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        TmCigmaShipToXrefDomain tmCigmaShipToXref = new TmCigmaShipToXrefDomain();
        TmNxsShipToDomain tmNxsShipTo = new TmNxsShipToDomain();
        tmCigmaShipToXref.setShipToCd("00");
        tmNxsShipTo.setShipToNm("Ship To Name");
        
        // 正常系
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is("Ship To Name"));
        
        // 正常系　第四引数がnull
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister("MY4" , "30001205", "00", null);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is(nullValue()));
        
        // 異常系　NEXUS送荷先クロスリファレンス原単位が取得できない
        MockObjectManager.addReturnNull(TmCigmaShipToXrefServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
        
        // 異常系　NEXUS送荷先原単位が取得できない
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnNull(TmNxsShipToServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmCigmaShipToXrefOnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnMultiPoRegister() throws Exception {
        //送荷先名称取得存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        TmCigmaShipToXrefDomain tmCigmaShipToXref = new TmCigmaShipToXrefDomain();
        TmNxsShipToDomain tmNxsShipTo = new TmNxsShipToDomain();
        tmCigmaShipToXref.setShipToCd("00");
        tmNxsShipTo.setShipToNm("Ship To Name");
        
        // 正常系
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnMultiPoRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is("Ship To Name"));
        
        // 正常系　第四引数がnull
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnMultiPoRegister("MY4" , "30001205", "00", null);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is(nullValue()));
        
        // 異常系　NEXUS送荷先クロスリファレンス原単位が取得できない
        MockObjectManager.addReturnNull(TmCigmaShipToXrefServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnMultiPoRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
        
        // 異常系　NEXUS送荷先原単位が取得できない
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnNull(TmNxsShipToServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnMultiPoRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmCigmaShipToXrefOnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnRegister() throws Exception {
        //送荷先名称取得存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        TmCigmaShipToXrefDomain tmCigmaShipToXref = new TmCigmaShipToXrefDomain();
        TmNxsShipToDomain tmNxsShipTo = new TmNxsShipToDomain();
        tmCigmaShipToXref.setShipToCd("00");
        tmNxsShipTo.setShipToNm("Ship To Name");
        
        // 正常系
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is("Ship To Name"));
        
        // 正常系　第四引数がnull
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnValue(TmNxsShipToServiceImpl.class, "searchByKey", tmNxsShipTo);
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnRegister("MY4" , "30001205", "00", null);
        assertThat(result, is(true));
        assertThat(odrRcv.getShipToNm(), is(nullValue()));
        
        // 異常系　NEXUS送荷先クロスリファレンス原単位が取得できない
        MockObjectManager.addReturnNull(TmCigmaShipToXrefServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
        
        // 異常系　NEXUS送荷先原単位が取得できない
        MockObjectManager.addReturnValue(TmCigmaShipToXrefServiceImpl.class, "searchByKey", tmCigmaShipToXref);
        MockObjectManager.addReturnNull(TmNxsShipToServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnRegister("MY4" , "30001205", "00", odrRcv);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmExpItemNoSpInfoOnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmExpItemNoSpInfoOnHeaderMoveToRegister() throws Exception {
        //輸出対象品目番号存在チェック
        boolean result = false;
        
        Date aplyStrtDt =  DateUtil.parseDate("13/05/2014", dateFormat);
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        
        List<TmExpItemNoSpInfoDomain> tmExpItemNoSpInfoList = new ArrayList<TmExpItemNoSpInfoDomain>();
        TmExpItemNoSpInfoDomain tmExpItemNoSpInfo = new TmExpItemNoSpInfoDomain();
        tmExpItemNoSpInfo.setShippingLot(new BigDecimal(100));
        tmExpItemNoSpInfoList.add(tmExpItemNoSpInfo);
        
        List<TmExpFormalitiItemNoDomain> tmExpFormalitiItemNoList = new ArrayList<TmExpFormalitiItemNoDomain>();
        TmExpFormalitiItemNoDomain tmExpFormalitiItemNo = new TmExpFormalitiItemNoDomain();
        tmExpFormalitiItemNo.setItemDescription("itemDescription");
        tmExpFormalitiItemNoList.add(tmExpFormalitiItemNo);
        
        // 正常系
        MockObjectManager.addReturnValue(TmExpItemNoSpInfoServiceImpl.class, "searchByConditionForPaging", tmExpItemNoSpInfoList);
        MockObjectManager.addReturnValue(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging", tmExpFormalitiItemNoList);
        
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo("MY4", "A002TB0091B3N", "110", "30001205", "00", aplyStrtDt, odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getItemDescription(), is("itemDescription"));
        
        // 異常系 輸出出荷品目番号原単位が取得できない
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnNull(TmExpItemNoSpInfoServiceImpl.class, "searchByConditionForPaging");
        
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo("MY4", "A002TB0091B3N", "110", "30001205", "00", aplyStrtDt, odrRcv);
        assertThat(result, is(false));
        assertThat(odrRcv.getItemDescription(), is(nullValue()));
        
        // 異常系 輸出手続品目番号原単位が取得できない
        odrRcv = new WB001OdrRcvDomain();      
        MockObjectManager.addReturnValue(TmExpItemNoSpInfoServiceImpl.class, "searchByConditionForPaging", tmExpItemNoSpInfoList);
        MockObjectManager.addReturnNull(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging");
        
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo("MY4", "A002TB0091B3N", "110", "30001205", "00", aplyStrtDt, odrRcv);
        assertThat(result, is(false));
        assertThat(odrRcv.getItemDescription(), is(nullValue()));
    }

    /**
     * <br />validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLotのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot() throws Exception {
        //確定・内示数チェック(Firm QTYのロット倍数チェック)
        boolean result = false;
        
        // 正常系
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 異常系 割り切れない場合
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(new BigDecimal(100), new BigDecimal(99));
        assertThat(result, is(false));
        
        // 異常系 0割
        //result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(new BigDecimal(100), BigDecimal.ZERO);
        //assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLotのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot() throws Exception {
        //確定・内示数チェック(Forecast QTYのロット倍数チェック)
        boolean result = false;
        
        // 正常系
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 異常系 割り切れない場合
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(new BigDecimal(100), new BigDecimal(99));
        assertThat(result, is(false));
        
        // 異常系 0割
        //result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(new BigDecimal(100), BigDecimal.ZERO);
        //assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLotのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot() throws Exception {
        //確定・内示数チェック(Forecast QTYのロット倍数チェック)
        boolean result = false;
        
        // 正常系
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 正常系(firmQtyが0の場合)
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(new BigDecimal(0), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 異常系 割り切れない場合
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(new BigDecimal(100), new BigDecimal(99));
        assertThat(result, is(false));
        
        // 異常系 0割
        //result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(new BigDecimal(100), BigDecimal.ZERO);
        //assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLotのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot() throws Exception {
        //確定・内示数チェック(Forecast QTYのロット倍数チェック)
        boolean result = false;
        
        // 正常系
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(new BigDecimal(100), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 正常系(firmQtyが0の場合)
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(new BigDecimal(0), new BigDecimal(100));
        assertThat(result, is(true));
        
        // 異常系 割り切れない場合
        result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(new BigDecimal(100), new BigDecimal(99));
        assertThat(result, is(false));
        
        // 異常系 0割
        //result = wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(new BigDecimal(100), BigDecimal.ZERO);
        //assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmNxsCompOnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnHeaderMoveToRegister() throws Exception {
        //受注会社存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        tmNxsComp.setCompNm("compNm");
        
        // 正常系
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnHeaderMoveToRegister("MY4", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getCompNm(), is("compNm"));
        
        // 異常系 NEXUS会社原単位が取得できない
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnHeaderMoveToRegister("MY4", odrRcv);
        assertThat(result, is(false));
        assertThat(odrRcv.getCompNm(), is(nullValue()));
    }

    /**
     * <br />validateDatabaseTmNxsCompのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnLstDgtChgMainSearch() throws Exception {
        //受注会社存在チェック
        boolean result = false;
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        tmNxsComp.setCompNm("compNm");
        
        // 正常系
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        result = wb001OdrRcvService.validateDatabaseTmNxsComp("MY4", odrRcv);
        assertThat(result, is(true));
        assertThat(odrRcv.getCompNm(), is("compNm"));
        
        // 異常系 NEXUS会社原単位が取得できない
        odrRcv = new WB001OdrRcvDomain();
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmNxsComp("MY4", odrRcv);
        assertThat(result, is(false));
        assertThat(odrRcv.getCompNm(), is(nullValue()));
    }

    /**
     * <br />validateDatabaseTmNxsCompOnLstDgtChgRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnLstDgtChgRegister() throws Exception {
        //受注会社存在チェック
        boolean result = false;
        
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        
        // 正常系
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnLstDgtChgRegister("MY4", tmpDomain);
        assertThat(result, is(true));
        
        // 異常系 NEXUS会社原単位が取得できない
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        tmpDomain = new WB001OdrRcvDomain();
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnLstDgtChgRegister("MY4", tmpDomain);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmNxsCompOnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnMultiPoRegister() throws Exception {
        //受注会社存在チェック
        boolean result = false;
        
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        
        // 正常系
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnMultiPoRegister("MY4");
        assertThat(result, is(true));
        
        // 異常系 NEXUS会社原単位が取得できない
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnMultiPoRegister("MY4");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmNxsCompOnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnRegister() throws Exception {
        //受注会社存在チェック
        boolean result = false;
        
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        
        // 正常系
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnRegister("MY4");
        assertThat(result, is(true));
        
        // 異常系 NEXUS会社原単位が取得できない
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTmNxsCompOnRegister("MY4");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplicationのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication() throws Exception {
        //重複チェック（輸出受注）
        boolean result = false;
        
        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
        
        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        
        List<WB001OdrRcvDomain> OdrRcvList = new ArrayList<WB001OdrRcvDomain>();
        
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(true));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNo不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(false));

        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNo不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(false));
        
        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("110");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(true));
        
        // 画面上で同じデータが複数入力されたケース
        after = new TtExpRcvOdrCriteriaDomain();
        after.setCustomerItemNo("customerItemNo");
        after.setCustomerPoNo("customerPoNo");
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        odrRcv.setIndex(2);
        odrRcv.setCustomerItemNo("customerItemNo");
        odrRcv.setCustomerPoNo("customerPoNo");
        OdrRcvList.add(odrRcv);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(1, after, before, OdrRcvList);
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQtyのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty() throws Exception {
        //確定・内示数チェック(確定数量>0で対象レコード以外に内示受注が存在する場合エラー)
        boolean result = false;
        
        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
        
        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = new ArrayList<TtExpRcvOdrDomain>();
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setTrnsCd("trnsCd");
        ttExpRcvOdr.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");
        ttExpRcvOdr.setCustomerItemNoOrg("customerItemNoOrg");
        ttExpRcvOdr.setOdrCtrlNo(BigDecimal.ZERO);
        ttExpRcvOdrList.add(ttExpRcvOdr);
        
        // FirmQtyが0
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(BigDecimal.ZERO, after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、TrnsCdが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("unmatch");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、EtdDueDtが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2012", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoOrgが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("unmatch");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、OdrCtrlNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ONE);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQtyのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty() throws Exception {
        //確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)
        boolean result = false;
        
        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
        
        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = new ArrayList<TtExpRcvOdrDomain>();
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setTrnsCd("trnsCd");
        ttExpRcvOdr.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");
        ttExpRcvOdr.setCustomerItemNoOrg("customerItemNoOrg");
        ttExpRcvOdr.setOdrCtrlNo(BigDecimal.ZERO);
        ttExpRcvOdrList.add(ttExpRcvOdr);
        
        // Forecastが0
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(BigDecimal.ZERO, after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、TrnsCdが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("unmatch");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、EtdDueDtが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2012", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoOrgが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("unmatch");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、OdrCtrlNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ONE);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("110");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnRegisterByDuplicationのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnRegisterByDuplication() throws Exception {
        //重複チェック（輸出受注）
        boolean result = false;

        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();

        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");

        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");

        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(true));

        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(false));

        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(true));

        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNo不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(false));

        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNo不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByKey", ttExpRcvOdr);

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(false));

        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("110");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByKey");

        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before);
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnRegisterByFirmQtyのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnRegisterByFirmQty() throws Exception {
        //確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)
        boolean result = false;
        
        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
        
        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = new ArrayList<TtExpRcvOdrDomain>();
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setTrnsCd("trnsCd");
        ttExpRcvOdr.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");
        ttExpRcvOdr.setCustomerItemNoOrg("customerItemNoOrg");
        ttExpRcvOdr.setOdrCtrlNo(BigDecimal.ZERO);
        ttExpRcvOdrList.add(ttExpRcvOdr);
        
        // Forecastが0
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(BigDecimal.ZERO, after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、TrnsCdが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("unmatch");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、EtdDueDtが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2012", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoOrgが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("unmatch");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、OdrCtrlNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ONE);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("110");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseTtExpRcvOdrOnRegisterByForecastQtyのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseTtExpRcvOdrOnRegisterByForecastQty() throws Exception {
        //確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)
        boolean result = false;
        
        TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
        
        TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = new ArrayList<TtExpRcvOdrDomain>();
        TtExpRcvOdrDomain ttExpRcvOdr = new TtExpRcvOdrDomain();
        ttExpRcvOdr.setTrnsCd("trnsCd");
        ttExpRcvOdr.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        ttExpRcvOdr.setCustomerPoNo("customerPoNo");
        ttExpRcvOdr.setCustomerItemNo("customerItemNo");
        ttExpRcvOdr.setCustomerItemNoOrg("customerItemNoOrg");
        ttExpRcvOdr.setOdrCtrlNo(BigDecimal.ZERO);
        ttExpRcvOdrList.add(ttExpRcvOdr);
        
        // Forecastが0
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(BigDecimal.ZERO, after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before不存在(before.setCustomerItemNo(""))、且つ、輸出受注が取得できる
        before = new TtExpRcvOdrCriteriaDomain();
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できない
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、TrnsCdが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("unmatch");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、EtdDueDtが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2012", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerPoNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setCustomerItemNo("customerItemNo");
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("unmatch");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("unmatch");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、CustomerItemNoOrgが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("unmatch");
        before.setOdrCtrlNo(BigDecimal.ZERO);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // before存在(before.setCustomerItemNo("")でない)、且つ、輸出受注が取得できる、且つ、OdrCtrlNoが不一致
        before = new TtExpRcvOdrCriteriaDomain();
        before.setTrnsCd("trnsCd");
        before.setEtdDueDt(DateUtil.parseDate("13/05/2014", dateFormat));
        before.setCustomerPoNo("customerPoNo");
        before.setCustomerItemNo("customerItemNo");
        before.setCustomerItemNoOrg("customerItemNoOrg");
        before.setOdrCtrlNo(BigDecimal.ONE);
        MockObjectManager.addReturnValue(TtExpRcvOdrServiceImpl.class, "searchByCondition", ttExpRcvOdrList);
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(false));
        
        // pkgCdバリエーション
        before = new TtExpRcvOdrCriteriaDomain();
        after = new TtExpRcvOdrCriteriaDomain();
        after.setPkgCd("");
        MockObjectManager.addReturnNull(TtExpRcvOdrServiceImpl.class, "searchByCondition");
        
        result = wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(new BigDecimal(100), after, before);
        assertThat(result, is(true));
    }

    /**
     * <br />validateDatabaseWsB001OnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB001OnHeaderMoveToRegister() throws Exception {
        //Webサービス「ECA0027_WS_B001:オンライン受注登録ヘッダチェック」のコール
        
        // 正常
        testValidateDatabaseWsB001OnHeaderMoveToRegisterNormal();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB001OnHeaderMoveToRegisterError();
    }
    
    /**
     * <br />validateDatabaseWsB001OnHeaderMoveToRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB001OnHeaderMoveToRegisterNormal() throws Exception {
        boolean result = false;
        
        Date etdDueDt = DateUtil.parseDate("13/05/2014", dateFormat);
        
        WsB001ResultDomain wsB001Result = new WsB001ResultDomain();
        
        WsB001ResultDomain mockResult = new WsB001ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        
        mockResult.setPartName("partName");
        mockResult.setPlantCodeLegacy("plantCodeLegacy");
        mockResult.setSupplierCode("supplierCode");
        
        List<WsB001ResultItemDomain> dateList = new ArrayList<WsB001ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB001ResultItemDomain wsB001ResultItem = new WsB001ResultItemDomain();
            wsB001ResultItem.setDate("20140513");
            wsB001ResultItem.setWorkDayFlag(true);
            wsB001ResultItem.setCustomerPartNo("customerPartNo");
            dateList.add(wsB001ResultItem);
        }
        mockResult.setDateList(dateList);
        
        MockObjectManager.addReturnValue(WsB001RestServiceMockImpl.class, "searchOdrEntryHdrOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB001OnHeaderMoveToRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", etdDueDt, wsB001Result);
        assertThat(result, is(true));
        
        assertThat(wsB001Result.getResultCode(), is(WS_RESULT_SUCCESS));
        /*
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB001Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        */
        assertThat(wsB001Result.getErrorList(), is(nullValue()));
        assertThat(wsB001Result.getPartName(), is("partName"));
        assertThat(wsB001Result.getPlantCodeLegacy(), is("plantCodeLegacy"));
        assertThat(wsB001Result.getSupplierCode(), is("supplierCode"));
        for (int i = 0; i < 3; i++){
            WsB001ResultItemDomain wsB001ResultItem = wsB001Result.getDateList().get(i);
            assertThat(wsB001ResultItem.getDate(), is("20140513"));
            assertThat(wsB001ResultItem.isWorkDayFlag(), is(true));
            assertThat(wsB001ResultItem.getCustomerPartNo(), is("customerPartNo"));
        }
    }
    
    /**
     * <br />validateDatabaseWsB001OnHeaderMoveToRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB001OnHeaderMoveToRegisterError() throws Exception {
        boolean result = false;
        
        Date etdDueDt = DateUtil.parseDate("13/05/2014", dateFormat);
        
        WsB001ResultDomain wsB001Result = new WsB001ResultDomain();
        
        WsB001ResultDomain mockResult = new WsB001ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        
        MockObjectManager.addReturnValue(WsB001RestServiceMockImpl.class, "searchOdrEntryHdrOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB001OnHeaderMoveToRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", etdDueDt, wsB001Result);
        assertThat(result, is(false));
        
        assertThat(wsB001Result.getResultCode(), is(WS_RESULT_ERROR));
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB001Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        assertThat(wsB001Result.getPartName(), is(nullValue()));
        assertThat(wsB001Result.getPlantCodeLegacy(), is(nullValue()));
        assertThat(wsB001Result.getSupplierCode(), is(nullValue()));
        assertThat(wsB001Result.getDateList(), is(nullValue()));
    }

    /**
     * <br />validateDatabaseWsB002OnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB002OnMultiPoRegister() throws Exception {
        //Webサービス「ECA0027_WS_B002：オンライン受注登録明細チェック」のコール
        
        // 正常
        testValidateDatabaseWsB002OnMultiPoRegisterNormal();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB002OnMultiPoRegisterError();
    }

    /**
     * <br />validateDatabaseWsB002OnMultiPoRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB002OnMultiPoRegisterNormal() throws Exception {
        boolean result = false;
        
        List<String> indexList = new ArrayList<String>();
        List<Date> etdDueDtList = new ArrayList<Date>();
        List<String> customerItemNoList = new ArrayList<String>();
        WsB002ResultDomain wsB002Result = new WsB002ResultDomain();
        
        WsB002ResultDomain mockResult = new WsB002ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        
        List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain wsB002ResultItem = new WsB002ResultItemDomain();
            wsB002ResultItem.setIndex(i);
            wsB002ResultItem.setShippingDueDate("13/05/2014");
            //wsB002ResultItem.setErrorList(errorList);
            customerOrderList.add(wsB002ResultItem);
        }
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB002RestServiceMockImpl.class, "searchOdrEntryDtlOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB002OnMultiPoRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", "S", 
            indexList, etdDueDtList, customerItemNoList, wsB002Result);
        assertThat(result, is(true));
        /*
        assertThat(wsB002Result.getResultCode(), is(WS_RESULT_SUCCESS));
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB002Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        */
        assertThat(wsB002Result.getErrorList(), is(nullValue()));
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain wsB002ResultItem = wsB002Result.getCustomerOrderList().get(i);
            assertThat(wsB002ResultItem.getIndex(), is(i));
            assertThat(wsB002ResultItem.getShippingDueDate(), is("13/05/2014"));
            /*
            for (int j = 0; j < 3; j++){
                ErrorListItemDomain errorListItem = wsB002ResultItem.getErrorList().get(j);
                assertThat(errorListItem.getErrorCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(k);
                    assertThat(errorParamListItem.getParam(), is("param"));
                }
            }
            */
            assertThat(wsB002ResultItem.getErrorList(), is(nullValue()));
        }
    }
    
    /**
     * <br />validateDatabaseWsB002OnMultiPoRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB002OnMultiPoRegisterError() throws Exception {
        boolean result = false;
        
        List<String> indexList = new ArrayList<String>();
        List<Date> etdDueDtList = new ArrayList<Date>();
        List<String> customerItemNoList = new ArrayList<String>();
        WsB002ResultDomain wsB002Result = new WsB002ResultDomain();
        
        WsB002ResultDomain mockResult = new WsB002ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        
        List<ErrorListItemSubDomain> errorList = new ArrayList<ErrorListItemSubDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemSubDomain errorListItemSub = new ErrorListItemSubDomain();
            errorListItemSub.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItemSub.setErrorParamList(errorParamList);
            errorList.add(errorListItemSub);
        }
        
        List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain customerOrderItem = new WsB002ResultItemDomain();
            customerOrderItem.setIndex(i);
            customerOrderItem.setErrorList(errorList);
            customerOrderList.add(customerOrderItem);
        }
        
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB002RestServiceMockImpl.class, "searchOdrEntryDtlOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB002OnMultiPoRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", "S", 
            indexList, etdDueDtList, customerItemNoList, wsB002Result);
        
        assertThat(result, is(false));
        
        assertThat(wsB002Result.getResultCode(), is(WS_RESULT_ERROR));
        
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain wsB002ResultItem = wsB002Result.getCustomerOrderList().get(i);
            assertThat(wsB002ResultItem.getIndex(), is(i));
            assertThat(wsB002ResultItem.getShippingDueDate(), is(nullValue()));
            for (int j = 0; j < 3; j++){
                ErrorListItemDomain errorListItem = wsB002ResultItem.getErrorList().get(j);
                assertThat(errorListItem.getErrorCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(k);
                    assertThat(errorParamListItem.getParam(), is("param"));
                }
            }
        }
    }
    
    /**
     * <br />validateDatabaseWsB002OnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB002OnRegister() throws Exception {
        //Webサービス「ECA0027_WS_B002：オンライン受注登録明細チェック」のコール
        
        // 正常
        testValidateDatabaseWsB002OnRegisterNormal();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB002OnRegisterError();
    }

    /**
     * <br />validateDatabaseWsB002OnRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB002OnRegisterNormal() throws Exception {
        boolean result = false;
        
        List<String> indexList = new ArrayList<String>();
        List<Date> etdDueDtList = new ArrayList<Date>();
        List<String> customerItemNoList = new ArrayList<String>();
        WsB002ResultDomain wsB002Result = new WsB002ResultDomain();
        
        WsB002ResultDomain mockResult = new WsB002ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        
        List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain wsB002ResultItem = new WsB002ResultItemDomain();
            wsB002ResultItem.setIndex(i);
            wsB002ResultItem.setShippingDueDate("13/05/2014");
            //wsB002ResultItem.setErrorList(errorList);
            customerOrderList.add(wsB002ResultItem);
        }
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB002RestServiceMockImpl.class, "searchOdrEntryDtlOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB002OnRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", "S", 
            indexList, etdDueDtList, customerItemNoList, wsB002Result);
        assertThat(result, is(true));
        
        assertThat(wsB002Result.getResultCode(), is(WS_RESULT_SUCCESS));
        /*
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB002Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        */
        assertThat(wsB002Result.getErrorList(), is(nullValue()));
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain wsB002ResultItem = wsB002Result.getCustomerOrderList().get(i);
            assertThat(wsB002ResultItem.getIndex(), is(i));
            assertThat(wsB002ResultItem.getShippingDueDate(), is("13/05/2014"));
            /*
            for (int j = 0; j < 3; j++){
                ErrorListItemDomain errorListItem = wsB002ResultItem.getErrorList().get(j);
                assertThat(errorListItem.getErrorCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(k);
                    assertThat(errorParamListItem.getParam(), is("param"));
                }
            }
            */
            assertThat(wsB002ResultItem.getErrorList(), is(nullValue()));
        }
    }
    
    /**
     * <br />validateDatabaseWsB002OnRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB002OnRegisterError() throws Exception {
        boolean result = false;
        
        List<String> indexList = new ArrayList<String>();
        List<Date> etdDueDtList = new ArrayList<Date>();
        List<String> customerItemNoList = new ArrayList<String>();
        WsB002ResultDomain wsB002Result = new WsB002ResultDomain();
        
        WsB002ResultDomain mockResult = new WsB002ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        
        List<ErrorListItemSubDomain> errorList = new ArrayList<ErrorListItemSubDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemSubDomain errorListItemSub = new ErrorListItemSubDomain();
            errorListItemSub.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItemSub.setErrorParamList(errorParamList);
            errorList.add(errorListItemSub);
        }
        List<WsB002ResultItemDomain> wsB002ResultItemList = new ArrayList<WsB002ResultItemDomain>();
        WsB002ResultItemDomain wsB002ResultItem = new WsB002ResultItemDomain();
        wsB002ResultItem.setErrorList(errorList);
        wsB002ResultItemList.add(wsB002ResultItem);
        
        mockResult.setCustomerOrderList(wsB002ResultItemList);
        
        List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain customerOrder = new WsB002ResultItemDomain();
            customerOrder.setIndex(i);
            customerOrder.setErrorList(errorList);
            customerOrderList.add(customerOrder);
        }
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB002RestServiceMockImpl.class, "searchOdrEntryDtlOnHand", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB002OnRegister("MY4", "30001205", "00", "A002TB0091B3N", "110", "S", 
            indexList, etdDueDtList, customerItemNoList, wsB002Result);
        assertThat(result, is(false));
        
        assertThat(wsB002Result.getResultCode(), is(WS_RESULT_ERROR));
        
        for (int i = 0; i < 3; i++){
            WsB002ResultItemDomain resultItem = wsB002Result.getCustomerOrderList().get(i);
            assertThat(resultItem.getIndex(), is(i));
            assertThat(resultItem.getShippingDueDate(), is(nullValue()));
            for (int j = 0; j < 3; j++){
                ErrorListItemDomain errorListItem = resultItem.getErrorList().get(j);
                assertThat(errorListItem.getErrorCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(k);
                    assertThat(errorParamListItem.getParam(), is("param"));
                }
            }
        }
    }

    /**
     * <br />validateDatabaseWsB003OnLstDgtChgRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB003OnLstDgtChgRegister() throws Exception {
        //Webサービス「ECA0027_WS_B003：EDI受注末尾変更ヘッダチェック」のコール
        
        // 正常
        testValidateDatabaseWsB003OnLstDgtChgRegisterNormal();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB003OnLstDgtChgRegisterError();
    }
    
    /**
     * <br />validateDatabaseWsB003OnLstDgtChgRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB003OnLstDgtChgRegisterNormal() throws Exception {
        List<String> result = new ArrayList<String>();
        
        Date shippingDt = DateUtil.parseDate("13/05/2014", dateFormat);
        
        ResultDomain mockResult = new ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        
        MockObjectManager.addReturnValue(WsB003RestServiceMockImpl.class, "searchEdiOdrLastDigChgHdr", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB003OnLstDgtChgRegister("MY4", "30001205", "00", "S", shippingDt, "A002TB0091B3N-ORG", "110");
        assertThat(result.size(), is(0));
    }
    
    /**
     * <br />validateDatabaseWsB003OnLstDgtChgRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB003OnLstDgtChgRegisterError() throws Exception {
        List<String> result = new ArrayList<String>();
        
        Date shippingDt = DateUtil.parseDate("13/05/2014", dateFormat);
        
        ResultDomain mockResult = new ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        
        MockObjectManager.addReturnValue(WsB003RestServiceMockImpl.class, "searchEdiOdrLastDigChgHdr", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB003OnLstDgtChgRegister("MY4", "30001205", "00", "S", shippingDt, "A002TB0091B3N-ORG", "110");
        for (int i = 0; i < 3; i++){
            String errCd = result.get(i);
            assertThat(errCd, is(Integer.toString(i)));
        }
    }

    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB005OnLstDgtChgRegister() throws Exception {
        //Webサービス「ECA0027_WS_B005：EDI受注末尾変更明細チェック」のコール
        
        // 正常
        testValidateDatabaseWsB005OnLstDgtChgRegisterNormal();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB005OnLstDgtChgRegisterError();
    }
    
    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB005OnLstDgtChgRegisterNormal() throws Exception {
        List<String> result = new ArrayList<String>();
        
        Date shippingDt = DateUtil.parseDate("13/05/2014", dateFormat);
        List<String> indexList = new ArrayList<String>();
        List<String> itemNoList = new ArrayList<String>();
        WsB005ResultDomain wsB005Result = new WsB005ResultDomain();
        
        WsB005ResultDomain mockResult = new WsB005ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        List<WsB005ResultItemDomain> customerOrderList = new ArrayList<WsB005ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB005ResultItemDomain customerOrder = new WsB005ResultItemDomain();
            customerOrder.setIndex(Integer.toString(i));
            List<WsB005ResultSubItemDomain> errList = new ArrayList<WsB005ResultSubItemDomain>();
            for (int j = 0; j < 3; j++){
                WsB005ResultSubItemDomain err = new WsB005ResultSubItemDomain();
                err.setCode(Integer.toString(j));
                List<String> paramList = new ArrayList<String>();
                for (int k = 0; k < 3; k++){
                    String param = "param";
                    paramList.add(param);
                }
                errList.add(err);
            }
            customerOrder.setCustomerPartNo("customerPartNo");
            customerOrder.setPartName("partName");
            customerOrder.setPlantCodeLegacy("plantCodeLegacy");
            customerOrderList.add(customerOrder);
        }
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB005RestServiceMockImpl.class, "searchEdiOdrLastDigChgDtl", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB005OnLstDgtChgRegister("MY4", "30001205", "00", "S", shippingDt,
            indexList, itemNoList, wsB005Result);
        assertThat(result.size(), is(0));
        
        assertThat(wsB005Result.getResultCode(), is(WS_RESULT_SUCCESS));
        /*
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB005Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        */
        assertThat(wsB005Result.getErrorList(), is(nullValue()));
        for (int i = 0; i < 3; i++){
            WsB005ResultItemDomain wsB005ResultItem = wsB005Result.getCustomerOrderList().get(i);
            assertThat(wsB005ResultItem.getIndex(), is(Integer.toString(i)));
            /*
            for (int j = 0; j < 3; j++){
                WsB005ResultSubItemDomain err = wsB005ResultItem.getErrorList().get(j);
                assertThat(err.getCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    String param = err.getParamList().get(k);
                    assertThat(param, is("param"));
                }
            }
            */
            assertThat(wsB005ResultItem.getErrorList(), is(nullValue()));
            assertThat(wsB005ResultItem.getCustomerPartNo(), is("customerPartNo"));
            assertThat(wsB005ResultItem.getPartName(), is("partName"));
            assertThat(wsB005ResultItem.getPlantCodeLegacy(), is("plantCodeLegacy"));
        }
    }
    
    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB005OnLstDgtChgRegisterError() throws Exception {
        List<String> result = new ArrayList<String>();
        
        Date shippingDt = DateUtil.parseDate("13/05/2014", dateFormat);
        List<String> indexList = new ArrayList<String>();
        List<String> itemNoList = new ArrayList<String>();
        WsB005ResultDomain wsB005Result = new WsB005ResultDomain();
        
        WsB005ResultDomain mockResult = new WsB005ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        
        List<WsB005ResultItemDomain> customerOrderList = new ArrayList<WsB005ResultItemDomain>();
        for (int i = 0; i < 3; i++){
            WsB005ResultItemDomain customerOrder = new WsB005ResultItemDomain();
            customerOrder.setIndex(Integer.toString(i));
            List<WsB005ResultSubItemDomain> errList = new ArrayList<WsB005ResultSubItemDomain>();
            for (int j = 0; j < 3; j++){
                WsB005ResultSubItemDomain err = new WsB005ResultSubItemDomain();
                err.setCode(Integer.toString(j));
                List<String> paramList = new ArrayList<String>();
                for (int k = 0; k < 3; k++){
                    String param = "param";
                    paramList.add(param);
                }
                err.setParamList(paramList);
                errList.add(err);
            }
            customerOrder.setErrorList(errList);
            customerOrderList.add(customerOrder);
            //customerOrder.setCustomerPartNo("customerPartNo");
            //customerOrder.setPartName("partName");
            //customerOrder.setPlantCodeLegacy("plantCodeLegacy");
        }
        mockResult.setCustomerOrderList(customerOrderList);
        
        MockObjectManager.addReturnValue(WsB005RestServiceMockImpl.class, "searchEdiOdrLastDigChgDtl", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB005OnLstDgtChgRegister("MY4", "30001205", "00", "S", shippingDt,
            indexList, itemNoList, wsB005Result);
        for (int i = 0; i < 3; i++){
            String errCd = result.get(i);
            assertThat(errCd, is(Integer.toString(i)));
        }
        
        assertThat(wsB005Result.getResultCode(), is(WS_RESULT_ERROR));
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = wsB005Result.getErrorList().get(i);
            assertThat(errorListItem.getErrorCode(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = errorListItem.getErrorParamList().get(j);
                assertThat(errorParamListItem.getParam(), is("param"));
            }
        }
        for (int i = 0; i < 3; i++){
            WsB005ResultItemDomain wsB005ResultItem = wsB005Result.getCustomerOrderList().get(i);
            assertThat(wsB005ResultItem.getIndex(), is(Integer.toString(i)));
            for (int j = 0; j < 3; j++){
                WsB005ResultSubItemDomain err = wsB005ResultItem.getErrorList().get(j);
                assertThat(err.getCode(), is(Integer.toString(j)));
                for (int k = 0; k < 3; k++){
                    String param = err.getParamList().get(k);
                    assertThat(param, is("param"));
                }
            }
            assertThat(wsB005ResultItem.getCustomerPartNo(), is(nullValue()));
            assertThat(wsB005ResultItem.getPartName(), is(nullValue()));
            assertThat(wsB005ResultItem.getPlantCodeLegacy(), is(nullValue()));
        }
    }

    /**
     * <br />validateDatabaseWsB011OnHeaderMoveToRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB011OnHeaderMoveToRegister() throws Exception {
        //Webサービス「ECA0027_WS_B011:EDI拠点判定」のコール
        
        // 正常
        testValidateDatabaseWsB011OnHeaderMoveToRegisterNormal();
        
        // 異常(EDI)
        MockObjectManager.initialize();
        testValidateDatabaseWsB011OnHeaderMoveToRegisterEdi();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB011OnHeaderMoveToRegisterError();
    }
    
    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnHeaderMoveToRegisterNormal() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        mockResult.setFlag(FLAG_N);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnHeaderMoveToRegister("MY4", "30001205", "00");
        assertThat(result.size(), is(0));
    }

    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト(異常(EDI))
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnHeaderMoveToRegisterEdi() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        mockResult.setFlag(FLAG_Y);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnHeaderMoveToRegister("MY4", "30001205", "00");
        assertThat(result.size(), is(1));
        assertThat(result.get(0), is(NXS_E7_0036));
    }
    
    /**
     * <br />validateDatabaseWsB005OnLstDgtChgRegisterのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnHeaderMoveToRegisterError() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        mockResult.setFlag(FLAG_Y);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnHeaderMoveToRegister("MY4", "30001205", "00");
        assertThat(result.get(0), is("0"));
        assertThat(result.get(1), is("1"));
        assertThat(result.get(2), is("2"));
        assertThat(result.get(3), is(NXS_E7_0036));
    }
    
    /**
     * <br />validateDatabaseWsB011OnLstDgtChgMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testValidateDatabaseWsB011OnLstDgtChgMainSearch() throws Exception {
        //Webサービス「ECA0027_WS_B011:EDI拠点判定」のコール
        
        // 正常
        testValidateDatabaseWsB011OnLstDgtChgMainSearchNormal();
        
        // 異常(非EDI)
        MockObjectManager.initialize();
        testValidateDatabaseWsB011OnLstDgtChgMainSearchNonEdi();
        
        // 異常
        MockObjectManager.initialize();
        testValidateDatabaseWsB011OnLstDgtChgMainSearchError();
    }

    /**
     * <br />validateDatabaseWsB011OnLstDgtChgMainSearchのテスト(正常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnLstDgtChgMainSearchNormal() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        mockResult.setFlag(FLAG_Y);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnLstDgtChgMainSearch("MY4", "30001205", "00");
        assertThat(result.size(), is(0));
    }

    /**
     * <br />validateDatabaseWsB011OnLstDgtChgMainSearchのテスト(異常(非EDI))
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnLstDgtChgMainSearchNonEdi() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_SUCCESS);
        /*
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        */
        mockResult.setFlag(FLAG_N);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnLstDgtChgMainSearch("MY4", "30001205", "00");
        assertThat(result.size(), is(1));
        assertThat(result.get(0), is(NXS_E7_0037));
    }
    
    /**
     * <br />validateDatabaseWsB011OnLstDgtChgMainSearchのテスト(異常)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testValidateDatabaseWsB011OnLstDgtChgMainSearchError() throws Exception {
        List<String> result = new ArrayList<String>();
        
        WsB011ResultDomain mockResult = new WsB011ResultDomain();
        mockResult.setResultCode(WS_RESULT_ERROR);
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        for (int i = 0; i < 3; i++){
            ErrorListItemDomain errorListItem = new ErrorListItemDomain();
            errorListItem.setErrorCode(Integer.toString(i));
            
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (int j = 0; j < 3; j++){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam("param");
                errorParamList.add(errorParamListItem);
            }
            errorListItem.setErrorParamList(errorParamList);
            errorList.add(errorListItem);
        }
        mockResult.setErrorList(errorList);
        mockResult.setFlag(FLAG_N);
        
        MockObjectManager.addReturnValue(WsB011RestServiceMockImpl.class, "searchEdiSupport", mockResult);
        
        result = wb001OdrRcvService.validateDatabaseWsB011OnLstDgtChgMainSearch("MY4", "30001205", "00");
        assertThat(result.get(0), is("0"));
        assertThat(result.get(1), is("1"));
        assertThat(result.get(2), is("2"));
        assertThat(result.get(3), is(NXS_E7_0037));
    }

//////////////////////////WB001OdrRcvService.search メソッドの確認 ////////////////////////////////////////
    /**
     * <br />searchForPagingOnDetailInitのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnDetailInit() throws Exception {
        //WB005画面 Init処理
        
        // メッセージ
        String[] fixture = {"WB005画面 Init処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnDetailInit_WB005InitExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 Paging用の開始行と終了行を設定
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(50);
        MockObjectManager.addReturnValue(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setLocale(new Locale("en"));
        criteria.setRcvOdrCompCd("MY4");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setTrnsCd("S");
        criteria.setPageInfoCreator(new ActionPageInfoCreator(null, null, null));
        
        // 実行
        List<?> actualList = wb001OdrRcvService.searchForPagingOnDetailInit(criteria);
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

    /**
     * <br />searchForPagingOnLstDgtChgMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnLstDgtChgMainSearch() throws Exception {
        //WB006画面 Search処理
        
        // メッセージ
        String[] fixture = {"WB006画面 Search処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnLstDgtChgMainSearch_WB006SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 Paging用の開始行と終了行を設定
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(50);
        MockObjectManager.addReturnValue(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setLocale(new Locale("en"));
        criteria.setRcvOdrCompCd("MY4");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setPkgCd("110");
        criteria.setItemNoOrg("A002TB0091B3N-ORG");
        criteria.setShippingDt(DateUtil.parseDate("16/05/2014", dateFormat));
        criteria.setServerId("MYS");
        criteria.setPageInfoCreator(new ActionPageInfoCreator(null, null, null));
        
        // 実行
        List<?> actualList = wb001OdrRcvService.searchForPagingOnLstDgtChgMainSearch(criteria);
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

    /**
     * <br />searchForPagingOnMainSearchのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch() throws Exception {
        //WB004画面 Search処理
        
        // 正常系
        testSearchForPagingOnMainSearchNormal();
        
        // 異常系(TM_NXS_COMPが取得できない)
        MockObjectManager.initialize();
        testSearchForPagingOnMainSearchErrorNoCompNm();
        
        // 異常系(TM_EXP_FORMALITI_ITEM_NOが取得できない)
        MockObjectManager.initialize();
        testSearchForPagingOnMainSearchErrorNoItemNm();
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testSearchForPagingOnMainSearchNormal() throws Exception {
        // メッセージ
        String[] fixture = {"WB004画面 Search処理 正常系"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch_WB004SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 TM_NXS_COMP
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        tmNxsComp.setCompNm("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 TM_EXP_FORMALITI_ITEM_NO
        List<TmExpFormalitiItemNoDomain> tmExpFormalitiItemNoList = new ArrayList<TmExpFormalitiItemNoDomain>();
        TmExpFormalitiItemNoDomain mExpFormalitiItemNo = new TmExpFormalitiItemNoDomain();
        mExpFormalitiItemNo.setItemDescription("wsb001PartName");
        tmExpFormalitiItemNoList.add(mExpFormalitiItemNo);
        MockObjectManager.addReturnValue(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging", tmExpFormalitiItemNoList);
        
        //Mock設定 Paging用の開始行と終了行を設定
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(50);
        MockObjectManager.addReturnValue(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setLocale(new Locale("en"));
        criteria.setRcvOdrCompCd("MY4");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setServerId("MYS");
        criteria.setPageInfoCreator(new ActionPageInfoCreator(null, null, null));
        
        // 実行
        List<?> actualList = wb001OdrRcvService.searchForPagingOnMainSearch(criteria);
        
        // 結果判定
        assertThat(criteria.getRcvOdrCompNm(), is("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
        assertThat(criteria.getItemNm(), is("wsb001PartName"));
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト(異常系(TM_NXS_COMPが取得できない))
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testSearchForPagingOnMainSearchErrorNoCompNm() throws Exception {
        // メッセージ
        String[] fixture = {"WB004画面 Search処理 異常系(TM_NXS_COMPが取得できない)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch_WB004SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 TM_NXS_COMP
        MockObjectManager.addReturnNull(TmNxsCompServiceImpl.class, "searchByKey");
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 TM_EXP_FORMALITI_ITEM_NO
        List<TmExpFormalitiItemNoDomain> tmExpFormalitiItemNoList = new ArrayList<TmExpFormalitiItemNoDomain>();
        TmExpFormalitiItemNoDomain mExpFormalitiItemNo = new TmExpFormalitiItemNoDomain();
        mExpFormalitiItemNo.setItemDescription("wsb001PartName");
        tmExpFormalitiItemNoList.add(mExpFormalitiItemNo);
        MockObjectManager.addReturnValue(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging", tmExpFormalitiItemNoList);
        
        //Mock設定 Paging用の開始行と終了行を設定
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(50);
        MockObjectManager.addReturnValue(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setLocale(new Locale("en"));
        criteria.setRcvOdrCompCd("MY4");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setServerId("MYS");
        criteria.setPageInfoCreator(new ActionPageInfoCreator(null, null, null));
        
        // 実行
        List<?> actualList = wb001OdrRcvService.searchForPagingOnMainSearch(criteria);
        
        // 結果判定
        assertThat(criteria.getRcvOdrCompNm(), is(nullValue()));
        assertThat(criteria.getItemNm(), is(nullValue()));
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * <br />searchForPagingOnMainSearchのテスト(異常系(TM_EXP_FORMALITI_ITEM_NOが取得できない))
     *
     * @throws Exception テストに失敗した場合
     */
    protected void testSearchForPagingOnMainSearchErrorNoItemNm() throws Exception {
        // メッセージ
        String[] fixture = {"WB004画面 Search処理 異常系(TM_EXP_FORMALITI_ITEM_NOが取得できない)"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchForPagingOnMainSearch_WB004SearchExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 TM_NXS_COMP
        TmNxsCompDomain tmNxsComp = new TmNxsCompDomain();
        tmNxsComp.setCompNm("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        MockObjectManager.addReturnValue(TmNxsCompServiceImpl.class, "searchByKey", tmNxsComp);
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 TM_EXP_FORMALITI_ITEM_NO
        MockObjectManager.addReturnNull(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging");
        
        //Mock設定 Paging用の開始行と終了行を設定
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(50);
        MockObjectManager.addReturnValue(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        //Mock設定 ユーザー権限の設定
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasBrowseAll", false);
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "hasRegisterAll", false);
        
        List<? extends UserAuthDomain> userAuthList = setUserAuthList();
        MockObjectManager.addReturnValue(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setLocale(new Locale("en"));
        criteria.setRcvOdrCompCd("MY4");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setServerId("MYS");
        criteria.setPageInfoCreator(new ActionPageInfoCreator(null, null, null));
        
        //Mock設定 TM_EXP_FORMALITI_ITEM_NO
        MockObjectManager.addReturnNull(TmExpFormalitiItemNoServiceImpl.class, "searchByConditionForPaging");
        
        // 実行
        List<?> actualList = wb001OdrRcvService.searchForPagingOnMainSearch(criteria);
        
        // 結果判定
        assertThat(criteria.getRcvOdrCompNm(), is("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"));
        assertThat(criteria.getItemNm(), is(nullValue()));
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

    /**
     * <br />searchOnHeaderInitのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnHeaderInit() throws Exception {
        //WB001画面 Init処理
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        // 引数設定
        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();
        criteria.setOwnerCompCd("MY4");
        
        // 実行
        WB001OdrRcvDomain result = wb001OdrRcvService.searchOnHeaderInit(criteria);
        
        // 結果判定
        assertThat(result.getEtdDueDt(), is(cigmaAds));
    }

    /**
     * <br />searchOnLstDgtChgRegisterInitのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnLstDgtChgRegisterInit() throws Exception {
        //WB007画面 Init処理
        // 正常系
        testSearchOnLstDgtChgRegisterInitNormal();
        
        // 異常系(オリジナルのItem不存在)
        MockObjectManager.initialize();
        testSearchOnLstDgtChgRegisterInitErrorNonOrgItem();
        
        // 異常系(WsB004エラー発生)
        MockObjectManager.initialize();
        testSearchOnLstDgtChgRegisterInitErrorWsb004();
    }
    
    /**
     * <br />searchOnLstDgtChgRegisterInitのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testSearchOnLstDgtChgRegisterInitNormal() throws Exception {
        // メッセージ
        String[] fixture = {"WB007画面 Init処理 正常系"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnLstDgtChgRegisterInit_WB007InitExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 wsB004RestService
        WsB004ResultDomain wsB004Result = new WsB004ResultDomain();
        wsB004Result.setResultCode(WS_RESULT_SUCCESS);
        String[] partArray = {"A002TB0091B3N", "A002TB0091B3_-ORG1", "A002TB0091B3_-ORG2", "A002TB0091B3_-ORG3"};
        List<String> partList = Arrays.asList(partArray);
        wsB004Result.setPartList(partList);
        
        MockObjectManager.addReturnValue(WsB004RestServiceMockImpl.class, "searchEdiOdrLastDigChgCandidate", wsB004Result);
        
        //Mock設定 TM_EXP_ITEM_NO_SP_INFO
        for (int i = 0; i < partList.size(); i++){
            TmExpItemNoSpInfoDomain tmExpItemNoSpInfo = new TmExpItemNoSpInfoDomain();
            tmExpItemNoSpInfo.setCompCd("MY4");
            tmExpItemNoSpInfo.setItemNo(partList.get(i));
            tmExpItemNoSpInfo.setPkgCd("110");
            tmExpItemNoSpInfo.setCustomerCd("30001205");
            tmExpItemNoSpInfo.setLgcyShipTo("00");
            tmExpItemNoSpInfo.setAplyStrtDt(DateUtil.parseDate("01/04/2014", dateFormat));
            tmExpItemNoSpInfo.setShippingLot(new BigDecimal(200));
            MockObjectManager.setReturnValueAt(TmExpItemNoSpInfoServiceImpl.class, "searchByKey", i, tmExpItemNoSpInfo);
        }
        
        // 引数設定
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        odrRcv.setRcvOdrCompCd("MY4");
        odrRcv.setCustomerCd("30001205");
        odrRcv.setLgcyShipTo("00");
        odrRcv.setTrnsCd("S");
        odrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        odrRcv.setPkgCd("110");
        odrRcv.setCustomerPoNo("30001205-999");
        odrRcv.setOdrCtrlNo(new BigDecimal(999));
        odrRcv.setShippingDt(DateUtil.parseDate("16/05/2014", dateFormat));
        
        // 実行
        WB001OdrRcvDomain actual = wb001OdrRcvService.searchOnLstDgtChgRegisterInit(odrRcv);
        List<?> actualList = actual.getOdrRcvDomainList();

        XMLEncoder encoder = new XMLEncoder( new FileOutputStream( "c:\\testSearchOnLstDgtChgRegisterInitNormal.xml" ) );
        PersistenceDelegate pd = encoder.getPersistenceDelegate(Date.class);
        encoder.setPersistenceDelegate(Timestamp.class, pd);
        
        encoder.writeObject(actualList.toString());
        encoder.flush();
        encoder.close();
        
        /* Debug用
        // 検証項目
        String chkItems = "RCV_ODR_COMP_CD,CUSTOMER_CD,LGCY_SHIP_TO,ITEM_NO,PKG_CD,TRNS_CD,ETD_DUE_DT,CUSTOMER_PO_NO,CUSTOMER_ITEM_NO,CUSTOMER_ITEM_NO_ORG,ODR_CTRL_NO,REVISION_NO,REVISION_NO_EIS,PLNT_CD,CUSTOMER_DUE_DT,ODR_QTY,ODR_QTY_HIDDEN,PLTZ_ALLOC_QTY,SALES_COMP_PO_NO,SUPPLIER_CD,UPDATE_TIMESTAMP,SHIPPING_LOT";
        
        // 検証用ファイルのヘッダー出力
        printOutHeader(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (WB001OdrRcvDomain obj : actual.getOdrRcvDomainList()){
            WB001OdrRcvTestDomain odrRcvExt = new WB001OdrRcvTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(odrRcvExt, obj);
            odrRcvExt.setChkItems(chkItems);
            System.out.println(odrRcvExt);
        }
        */
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * <br />searchOnLstDgtChgRegisterInitのテスト(異常系(オリジナルのItem不存在))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testSearchOnLstDgtChgRegisterInitErrorNonOrgItem() throws Exception {
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 wsB004RestService
        WsB004ResultDomain wsB004Result = new WsB004ResultDomain();
        wsB004Result.setResultCode(WS_RESULT_SUCCESS);
        String[] partArray = {"A002TB0091B3N", "A002TB0091B3_-ORG1", "A002TB0091B3_-ORG2", "A002TB0091B3_-ORG3"};
        List<String> partList = Arrays.asList(partArray);
        wsB004Result.setPartList(partList);
        
        MockObjectManager.addReturnValue(WsB004RestServiceMockImpl.class, "searchEdiOdrLastDigChgCandidate", wsB004Result);
        
        //Mock設定 TM_EXP_ITEM_NO_SP_INFO
        for (int i = 0; i < partList.size(); i++){
            TmExpItemNoSpInfoDomain tmExpItemNoSpInfo = new TmExpItemNoSpInfoDomain();
            tmExpItemNoSpInfo.setCompCd("MY4");
            tmExpItemNoSpInfo.setItemNo(partList.get(i));
            tmExpItemNoSpInfo.setPkgCd("110");
            tmExpItemNoSpInfo.setCustomerCd("30001205");
            tmExpItemNoSpInfo.setLgcyShipTo("00");
            tmExpItemNoSpInfo.setAplyStrtDt(DateUtil.parseDate("01/04/2014", dateFormat));
            tmExpItemNoSpInfo.setShippingLot(new BigDecimal(200));
            MockObjectManager.setReturnValueAt(TmExpItemNoSpInfoServiceImpl.class, "searchByKey", i, tmExpItemNoSpInfo);
        }
        
        // 引数設定
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        // データが取得できないような値をセットすること
        odrRcv.setRcvOdrCompCd("DMY");
        odrRcv.setCustomerCd("30001205");
        odrRcv.setLgcyShipTo("00");
        odrRcv.setTrnsCd("S");
        odrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        odrRcv.setPkgCd("110");
        odrRcv.setCustomerPoNo("30001205-999");
        odrRcv.setOdrCtrlNo(new BigDecimal(999));
        odrRcv.setShippingDt(DateUtil.parseDate("16/05/2014", dateFormat));
        
        // 実行
        try {
            wb001OdrRcvService.searchOnLstDgtChgRegisterInit(odrRcv);
            fail("例外が投げられない");
        } catch (ApplicationException e){
            // 結果判定
            assertThat(e.getCode(), is(GSCM_E0_0001));
        }
    }

    /**
     * <br />searchOnLstDgtChgRegisterInitのテスト(異常系(WsB004エラー発生))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testSearchOnLstDgtChgRegisterInitErrorWsb004() throws Exception {
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        //Mock設定 wsB004RestService
        WsB004ResultDomain wsB004Result = new WsB004ResultDomain();
        wsB004Result.setResultCode(WS_RESULT_ERROR);
        String[] partArray = {"A002TB0091B3N", "A002TB0091B3_-ORG1", "A002TB0091B3_-ORG2", "A002TB0091B3_-ORG3"};
        List<String> partList = Arrays.asList(partArray);
        wsB004Result.setPartList(partList);
        
        MockObjectManager.addReturnValue(WsB004RestServiceMockImpl.class, "searchEdiOdrLastDigChgCandidate", wsB004Result);
        
        //Mock設定 TM_EXP_ITEM_NO_SP_INFO
        for (int i = 0; i < partList.size(); i++){
            TmExpItemNoSpInfoDomain tmExpItemNoSpInfo = new TmExpItemNoSpInfoDomain();
            tmExpItemNoSpInfo.setCompCd("MY4");
            tmExpItemNoSpInfo.setItemNo(partList.get(i));
            tmExpItemNoSpInfo.setPkgCd("110");
            tmExpItemNoSpInfo.setCustomerCd("30001205");
            tmExpItemNoSpInfo.setLgcyShipTo("00");
            tmExpItemNoSpInfo.setAplyStrtDt(DateUtil.parseDate("01/04/2014", dateFormat));
            tmExpItemNoSpInfo.setShippingLot(new BigDecimal(200));
            MockObjectManager.setReturnValueAt(TmExpItemNoSpInfoServiceImpl.class, "searchByKey", i, tmExpItemNoSpInfo);
        }
        
        // 引数設定
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        odrRcv.setRcvOdrCompCd("MY4");
        odrRcv.setCustomerCd("30001205");
        odrRcv.setLgcyShipTo("00");
        odrRcv.setTrnsCd("S");
        odrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        odrRcv.setPkgCd("110");
        odrRcv.setCustomerPoNo("30001205-999");
        odrRcv.setOdrCtrlNo(new BigDecimal(999));
        odrRcv.setShippingDt(DateUtil.parseDate("16/05/2014", dateFormat));
        
        // 実行
        try {
            wb001OdrRcvService.searchOnLstDgtChgRegisterInit(odrRcv);
            fail("例外が投げられない");
        } catch (ApplicationException e){
            // 結果判定
            assertThat(e.getCode(), is(GSCM_E0_0010));
        }
    }
    
    /**
     * <br />searchOnRegisterInitのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnRegisterInit() throws Exception {
        //WB002画面 Init処理
        
        // メッセージ
        String[] fixture = {"WB002画面 Init処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnLstDgtChgRegisterInit_WB002InitExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        //Mock設定 TM_CIGMA_ENV
        Date cigmaAds = DateUtil.parseDate("10/04/2014", dateFormat);
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "searchCigmaAds", cigmaAds);
        
        // 引数設定
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        odrRcv.setRcvOdrCompCd("MY4");
        odrRcv.setCustomerCd("30001205");
        odrRcv.setLgcyShipTo("00");
        odrRcv.setTrnsCd("S");
        odrRcv.setItemNo("A002TB0091B3N");
        odrRcv.setPkgCd("110");
        odrRcv.setEtdDueDt(DateUtil.parseDate("20140410", "yyyyMMdd"));
        
        List<Date> dateList = new ArrayList<Date>();
        String[] ad = {"20140424", "20140425", "20140428", "20140429", "20140430", "20140530", "20140630", "20140731", "20140829"};
        for (String d : ad){
            dateList.add(DateUtil.parseDate(d, "yyyyMMdd"));
        }
        odrRcv.setDateList(dateList);

        List<String> workDayFlgList = new ArrayList<String>();
        String[] af = {"Y", "Y", "Y", "N", "Y", "Y", "Y", "Y", "Y"};
        for (String f : af){
            workDayFlgList.add(f);
        }
        odrRcv.setWorkDayFlgList(workDayFlgList);
        
        List<String> customerPartNoList = new ArrayList<String>();
        for (int i = 0; i < 9; i++){
            customerPartNoList.add("customerPartNo");
        }
        odrRcv.setCustomerPartNoList(customerPartNoList);
        
        // 実行
        WB001OdrRcvDomain actual = wb001OdrRcvService.searchOnRegisterInit(odrRcv);
        
        // 月リストのテスト
        String[] monthArray = {"Apr", "May", "Jun", "Jul", "Aug"};
        for (int i = 0; i < monthArray.length; i++){
            assertThat(actual.getMonth().get(i), is(monthArray[i]));
        }
        
        // 月別総注文数量リストのテスト
        int[] qtyArray = {27300, 400, 200, 200, 0};
        for (int i = 0; i < qtyArray.length; i++){
            assertThat(actual.getTotalQty().get(i), is(new BigDecimal(qtyArray[i])));
        }
        
        List<?> actualList = actual.getOdrRcvDomainList();
        
        // 検証項目
        String chkItems = "ETD_DUE_DT,FIRM_QTY,FORECAST_QTY,CUSTOMER_DUE_DT,PLTZ_ALLOC_QTY,CUSTOMER_ITEM_NO,CUSTOMER_PO_NO,SALES_COMP_PO_NO,COUNT,CUSTOMER_PO_NO,ODR_CTRL_NO,CUSTOMER_ITEM_NO,CUSTOMER_ITEM_NO_ORG,SALES_COMP_PO_NO,ODR_QTY,ODR_QTY_ORG,PLTZ_ALLOC_QTY,SHIPPED_QTY,PARTIAL_DELIV_CNT,COM_UPDATE_TIMESTAMP,";
        
        // 検証用ファイルのヘッダー出力
        printOutHeader(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (WB001OdrRcvDomain obj : actual.getOdrRcvDomainList()){
            WB001OdrRcvTestDomain odrRcvExt = new WB001OdrRcvTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(odrRcvExt, obj);
            odrRcvExt.setChkItems(chkItems);
            System.out.println(odrRcvExt);
        }
        
        // 結果判定
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }
    
    /**
     * <br />serchOnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSerchOnMultiPoRegister() throws Exception {
        // WB003画面 Init処理
        
        // メッセージ
        String[] fixture = {"WB003画面 Init処理"};
        
        // 期待結果
        List<Map<String, String>> expectedList = readCsvFile("testSearchOnLstDgtChgRegisterInit_WB003InitExpectedList.csv");
        
        // 比較対象外カラム
        String[] ignoreCols = {
        };
        
        // 引数設定
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        odrRcv.setRcvOdrCompCd("MY4");
        odrRcv.setCustomerCd("30001205");
        odrRcv.setLgcyShipTo("00");
        odrRcv.setItemNo("A002TB0091B3N");
        odrRcv.setPkgCd(" ");
        odrRcv.setTrnsCd("S");
        odrRcv.setEtdDueDt(DateUtil.parseDate("30/04/2014", dateFormat));
        
        // 実行
        List<? extends WB001OdrRcvDomain> odrRcvList = wb001OdrRcvService.serchOnMultiPoRegister(odrRcv);
        
        /*
        // 検証項目
        String chkItems = "FIRM_QTY,FORECAST_QTY,CUSTOMER_DUE_DT,PLTZ_ALLOC_QTY,CUSTOMER_ITEM_NO,CUSTOMER_PO_NO,SALES_COMP_PO_NO,ODR_CTRL_NO,CUSTOMER_ITEM_NO_ORG,ODR_QTY,ODR_QTY_ORG,SHIPPED_QTY,PARTIAL_DELIV_CNT,COM_UPDATE_TIMESTAMP";
        
        // 検証用ファイルのヘッダー出力
        printOutHeader(chkItems);
        
        // 検証用ファイルの検証項目値を出力
        for (WB001OdrRcvDomain obj : odrRcvList){
            WB001OdrRcvTestDomain odrRcvExt = new WB001OdrRcvTestDomain();
            CommonUtil.copyPropertiesDomainToDomain(odrRcvExt, obj);
            odrRcvExt.setChkItems(chkItems);
            System.out.println(odrRcvExt);
        }
        */
        
        // 結果判定
        List<?> actualList = odrRcvList;
        assertDomainList(fixture[0], actualList, expectedList, ignoreCols);
    }

////////////////////////////////////WB001OdrRcvService.transact メソッドの確認 ////////////////////////////////////////
    /**
     * <br />transactOnLstDgtChgRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnLstDgtChgRegister() throws Exception {
        //WB007画面 Register処理
        
        // 正常系
        testTransactOnLstDgtChgRegisterNormal();
        
        // 正常系(梱包指示済み)
        MockObjectManager.initialize();
        testTransactOnLstDgtChgRegisterNormalPltzAlloc();
        
        // 正常系(船積み済み)
        MockObjectManager.initialize();
        testTransactOnLstDgtChgRegisterNormalShipping();
        
        // 異常系(WsB007でシステムエラー)
        MockObjectManager.initialize();
        testTransactOnLstDgtChgRegisterError();
    }
    
    /**
     * <br />transactOnLstDgtChgRegisterのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnLstDgtChgRegisterNormal() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnLstDgtChgRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setCustomerPoNo("30001205-999");
        parentOdrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        parentOdrRcv.setShippingDt(DateUtil.parseDate("20140516", "yyyyMMdd"));
        
        // 登録用データ
        WB001OdrRcvDomain childOdrRcvIns = new WB001OdrRcvDomain();
        childOdrRcvIns.setItemNo("A002TB0091B31-ORG");
        childOdrRcvIns.setEtdDueDt(DateUtil.parseDate("20140401", "yyyyMMdd"));
        childOdrRcvIns.setCustomerItemNo("wsB005CustomerItemNo");
        childOdrRcvIns.setCustomerItemNoOrg("-");
        childOdrRcvIns.setOdrCtrlNo(new BigDecimal(999));
        childOdrRcvIns.setRevisionNo(new BigDecimal(-1));
        childOdrRcvIns.setRevisionNoEis(new BigDecimal(-1));
        childOdrRcvIns.setCustomerDueDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setOdrQtyOrg(new BigDecimal(200));
        childOdrRcvIns.setOdrQty(new BigDecimal(200));
        childOdrRcvIns.setOdrQtyHidden(new BigDecimal(0));
        childOdrRcvIns.setOdrFirmFlg(FLAG_N);
        childOdrRcvIns.setSalesCompPoNo("sales");
        childOdrRcvIns.setSupplierCd("-");
        childOdrRcvIns.setPlntCd("PM");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvIns);
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setItemNo("A002TB0091B32-ORG");
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140401", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNo("30001205-999");
        childOdrRcvUpd.setCustomerItemNoHidden("wsB005CustomerItemNo");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(999));
        childOdrRcvUpd.setOdrQty(new BigDecimal(400));
        childOdrRcvUpd.setOdrQtyHidden(new BigDecimal(200));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(0));
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/20 10:37:49").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 削除用データ
        WB001OdrRcvDomain childOdrRcvDel = new WB001OdrRcvDomain();
        childOdrRcvDel.setItemNo("A002TB0091B33-ORG");
        childOdrRcvDel.setEtdDueDt(DateUtil.parseDate("20140401", "yyyyMMdd"));
        childOdrRcvDel.setCustomerPoNo("30001205-999");
        childOdrRcvDel.setCustomerItemNoHidden("wsB005CustomerItemNo");
        childOdrRcvDel.setCustomerItemNoOrg("-");
        childOdrRcvDel.setOdrCtrlNo(new BigDecimal(999));
        childOdrRcvDel.setOdrQty(new BigDecimal(0));
        childOdrRcvDel.setOdrQtyHidden(new BigDecimal(200));
        try {
            childOdrRcvDel.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/20 10:37:49").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvDel);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnLstDgtChgRegister(parentOdrRcv);
    }

    /**
     * <br />transactOnLstDgtChgRegisterのテスト正常系(梱包指示済み)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnLstDgtChgRegisterNormalPltzAlloc() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnLstDgtChgRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setCustomerPoNo("30001205-130");
        parentOdrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        parentOdrRcv.setShippingDt(DateUtil.parseDate("20140519", "yyyyMMdd"));
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setItemNo("A002TB0091B3N");
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNo("30001205-130");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(130));
        childOdrRcvUpd.setOdrQty(new BigDecimal(1000));
        childOdrRcvUpd.setOdrQtyHidden(new BigDecimal(100));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(1000));
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2013/03/03 00:00:00").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnLstDgtChgRegister(parentOdrRcv);
    }

    /**
     * <br />transactOnLstDgtChgRegisterのテスト正常系(船積み済み)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnLstDgtChgRegisterNormalShipping() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnLstDgtChgRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setCustomerPoNo("30001205-130");
        parentOdrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        parentOdrRcv.setShippingDt(DateUtil.parseDate("20140520", "yyyyMMdd"));
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setItemNo("A002TB0091B3N");
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNo("30001205-140");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(140));
        childOdrRcvUpd.setOdrQty(new BigDecimal(200));
        childOdrRcvUpd.setOdrQtyHidden(new BigDecimal(100));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(1000));
        childOdrRcvUpd.setShippedQty(new BigDecimal(200));
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2013/03/03 00:00:00").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnLstDgtChgRegister(parentOdrRcv);
    }

    /**
     * <br />transactOnLstDgtChgRegisterのテスト(異常系(WsB007でシステムエラー))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnLstDgtChgRegisterError() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnLstDgtChgRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setCustomerPoNo("30001205-999");
        parentOdrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        parentOdrRcv.setShippingDt(DateUtil.parseDate("20140516", "yyyyMMdd"));
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setItemNo("A002TB0091B32-ORG");
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140401", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNo("30001205-999");
        childOdrRcvUpd.setCustomerItemNoHidden("wsB005CustomerItemNo");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(999));
        childOdrRcvUpd.setOdrQty(new BigDecimal(400));
        childOdrRcvUpd.setOdrQtyHidden(new BigDecimal(200));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(0));
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);

        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        try {
            wb001OdrRcvService.transactOnLstDgtChgRegister(parentOdrRcv);
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is(NXS_91_0001));
        }
    }
    

    /**
     * <br />transactOnMultiPoRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnMultiPoRegister() throws Exception {
        //WB003画面 Register処理
        
        // 正常系
        testTransactOnMultiPoRegisterNormal();
        
        // 正常系(梱包指示済み)
        MockObjectManager.initialize();
        testTransactOnMultiPoRegisterNormalPltzAlloc();
        
        // 正常系(船積み済み)
        MockObjectManager.initialize();
        testTransactOnMultiPoRegisterNormalShipping();
        
        // 異常系(デュプリケイト)
        //MockObjectManager.initialize();
        //testTransactOnMultiPoRegisterErrorDuplicate();
        
        // 異常系(WsB007でシステムエラー)
        MockObjectManager.initialize();
        testTransactOnMultiPoRegisterErrorWsB007();
    }
    
    /**
     * <br />transactOnMultiPoRegisterのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnMultiPoRegisterNormal() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        List<? extends WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "serchOnMultiPoRegister", resultList);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd(" ");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        parentOdrRcv.setItemNoOrg("A002TB0091B3N");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 登録用データ
        WB001OdrRcvDomain childOdrRcvIns = new WB001OdrRcvDomain();
        childOdrRcvIns.setCustomerPoNo("poNo");
        childOdrRcvIns.setCustomerItemNo("itemNo");
        childOdrRcvIns.setCustomerItemNoOrg("itemNo");
        childOdrRcvIns.setCustomerDueDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setFirmQty(new BigDecimal(100));
        childOdrRcvIns.setForecastQty(new BigDecimal(0));
        childOdrRcvIns.setShippingDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setSalesCompPoNo("sales");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvIns);
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setCustomerPoNoHidden("30001205-xxx");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(999));
        
        childOdrRcvUpd.setCustomerPoNo("newPoNo");
        childOdrRcvUpd.setCustomerItemNo("newItemNo");
        childOdrRcvUpd.setFirmQty(new BigDecimal(100));
        childOdrRcvUpd.setForecastQty(new BigDecimal(0));
        childOdrRcvUpd.setPltzAllocQtyHidden(new BigDecimal(100));
        childOdrRcvUpd.setShippedQty(new BigDecimal(0));
        childOdrRcvUpd.setSalesCompPoNo("sales");
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/02 19:26:32").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 削除用データ
        WB001OdrRcvDomain childOdrRcvDel = new WB001OdrRcvDomain();
        childOdrRcvDel.setCustomerPoNoHidden("30001205-xxx");
        childOdrRcvDel.setCustomerItemNoHidden("wsB005CustomerItemNo");
        childOdrRcvDel.setCustomerItemNoOrg("-");
        childOdrRcvDel.setOdrCtrlNo(new BigDecimal(162));
        
        childOdrRcvDel.setFirmQty(new BigDecimal(0));
        childOdrRcvDel.setForecastQty(new BigDecimal(0));
        try {
            childOdrRcvDel.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/12 20:16:38").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvDel);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnMultiPoRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnMultiPoRegisterのテスト(正常系(梱包指示済み))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnMultiPoRegisterNormalPltzAlloc() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        List<? extends WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "serchOnMultiPoRegister", resultList);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        parentOdrRcv.setItemNoOrg("A002TB0091B3N");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setCustomerPoNoHidden("30001205-120");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(270));
        
        childOdrRcvUpd.setCustomerPoNo("newPoNo");
        childOdrRcvUpd.setCustomerItemNo("newItemNo");
        childOdrRcvUpd.setFirmQty(new BigDecimal(200));
        childOdrRcvUpd.setForecastQty(new BigDecimal(0));
        childOdrRcvUpd.setPltzAllocQtyHidden(new BigDecimal(200));
        childOdrRcvUpd.setShippedQty(new BigDecimal(1));
        childOdrRcvUpd.setSalesCompPoNo("sales");
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2013/03/03 00:00:00").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnMultiPoRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnMultiPoRegisterのテスト(正常系(船積み済み))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnMultiPoRegisterNormalShipping() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        List<? extends WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "serchOnMultiPoRegister", resultList);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        parentOdrRcv.setItemNoOrg("A002TB0091B3N");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setCustomerPoNoHidden("30001205-122");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(122));
        
        childOdrRcvUpd.setCustomerPoNo("newPoNo");
        childOdrRcvUpd.setCustomerItemNo("newItemNo");
        childOdrRcvUpd.setFirmQty(new BigDecimal(200));
        childOdrRcvUpd.setForecastQty(new BigDecimal(0));
        childOdrRcvUpd.setPltzAllocQtyHidden(new BigDecimal(1000));
        childOdrRcvUpd.setShippedQty(new BigDecimal(200));
        childOdrRcvUpd.setSalesCompPoNo("sales");
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2013/03/03 00:00:00").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnMultiPoRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnMultiPoRegisterのテスト(異常系(デュプリケイト))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnMultiPoRegisterErrorDuplicate() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        List<? extends WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "serchOnMultiPoRegister", resultList);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("220");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setEtdDueDt(DateUtil.parseDate("20140430", "yyyyMMdd"));
        parentOdrRcv.setItemNoOrg("A002TB0091B3N");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 登録用データ
        WB001OdrRcvDomain childOdrRcvIns = new WB001OdrRcvDomain();
        childOdrRcvIns.setCustomerPoNo("poNo");
        childOdrRcvIns.setCustomerItemNo("itemNo");
        childOdrRcvIns.setCustomerItemNoOrg("itemNo");
        childOdrRcvIns.setCustomerDueDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setFirmQty(new BigDecimal(100));
        childOdrRcvIns.setForecastQty(new BigDecimal(0));
        childOdrRcvIns.setShippingDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setSalesCompPoNo("sales");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvIns);
        
        // 登録用データ(デュプリケイト用)
        WB001OdrRcvDomain childOdrRcvIns2 = new WB001OdrRcvDomain();
        childOdrRcvIns2.setCustomerPoNo("poNo");
        childOdrRcvIns2.setCustomerItemNo("itemNo");
        childOdrRcvIns2.setCustomerItemNoOrg("itemNo");
        childOdrRcvIns2.setCustomerDueDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns2.setFirmQty(new BigDecimal(100));
        childOdrRcvIns2.setForecastQty(new BigDecimal(0));
        childOdrRcvIns2.setShippingDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns2.setSalesCompPoNo("sales");
        
        childrenOdrRcv.add(childOdrRcvIns2);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        try {
            wb001OdrRcvService.transactOnMultiPoRegister(parentOdrRcv);
            fail("例外が発生しない");
        } catch (ApplicationException e) {
            assertThat(e.getCode(), is("com.globaldenso.ai.common.core.exception.IntegrationLayerException: [AI-80-0005]データに不整合があります。データを確認してください。"));
        }
    }
    
    /**
     * <br />transactOnMultiPoRegisterのテスト(異常系(WsB007でシステムエラー))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnMultiPoRegisterErrorWsB007() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        List<? extends WB001OdrRcvDomain> resultList = new ArrayList<WB001OdrRcvDomain>();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "serchOnMultiPoRegister", resultList);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setEtdDueDt(DateUtil.parseDate("20140930", "yyyyMMdd"));
        parentOdrRcv.setItemNoOrg("A002TB0091B3N-ORG");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setCustomerPoNoHidden("30001205-01");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(151));
        
        childOdrRcvUpd.setCustomerPoNo("newPoNo");
        childOdrRcvUpd.setCustomerItemNo("newItemNo");
        childOdrRcvUpd.setFirmQty(new BigDecimal(100));
        childOdrRcvUpd.setForecastQty(new BigDecimal(0));
        childOdrRcvUpd.setPltzAllocQtyHidden(new BigDecimal(100));
        childOdrRcvUpd.setShippedQty(new BigDecimal(0));
        childOdrRcvUpd.setSalesCompPoNo("sales");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        try {
            wb001OdrRcvService.transactOnMultiPoRegister(parentOdrRcv);
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is(NXS_91_0001));
        }
    }
    

    /**
     * <br />transactOnRegisterのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnRegister() throws Exception {
        //WB002画面 Register処理
        
        // 正常系
        testTransactOnRegisterNormal();
        
        // 正常系(梱包指示済み)
        MockObjectManager.initialize();
        testTransactOnRegisterNormalPltzAlloc();
        
        // 正常系(船積み済み)
        MockObjectManager.initialize();
        testTransactOnRegisterNormalShipping();
        
        // 異常系(WsB007でシステムエラー)
        MockObjectManager.initialize();
        testTransactOnRegisterError();
    }
    
    /**
     * <br />transactOnRegisterのテスト(正常系)
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnRegisterNormal() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd(" ");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        parentOdrRcv.setPartName("pn");
        
        // 登録用データ
        WB001OdrRcvDomain childOdrRcvIns = new WB001OdrRcvDomain();
        childOdrRcvIns.setEtdDueDt(DateUtil.parseDate("20140424", "yyyyMMdd"));
        childOdrRcvIns.setCustomerPoNo("poNo");
        childOdrRcvIns.setCustomerItemNo("itemNoDummy");
        childOdrRcvIns.setCustomerItemNoOrg("itemNoDummy");
        childOdrRcvIns.setCustomerDueDt(DateUtil.parseDate("20140601", "yyyyMMdd"));
        childOdrRcvIns.setItemNoOrg("A002TB0091B3N");
        childOdrRcvIns.setFirmQty(new BigDecimal(200));
        childOdrRcvIns.setForecastQty(new BigDecimal(0));
        childOdrRcvIns.setShippingDt(DateUtil.parseDate("20140602", "yyyyMMdd"));
        childOdrRcvIns.setSalesCompPoNo("sales");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvIns);
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140425", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNoHidden("po");
        childOdrRcvUpd.setCustomerItemNoHidden("item");
        childOdrRcvUpd.setCustomerItemNoOrg("item");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(0));
        
        childOdrRcvUpd.setCustomerPoNo("newPo");
        childOdrRcvUpd.setCustomerItemNo("nweItem");
        
        childOdrRcvUpd.setFirmQty(new BigDecimal(200));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(100));
        childOdrRcvUpd.setShippedQty(new BigDecimal(100));
        childOdrRcvUpd.setShippingDt(DateUtil.parseDate("20140602", "yyyyMMdd"));
        childOdrRcvUpd.setSalesCompPoNo("newSales");
        
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/20 18:45:29").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 削除用データ
        WB001OdrRcvDomain childOdrRcvDel = new WB001OdrRcvDomain();
        childOdrRcvDel.setEtdDueDt(DateUtil.parseDate("20140428", "yyyyMMdd"));
        childOdrRcvDel.setCustomerPoNoHidden("poNo");
        childOdrRcvDel.setCustomerItemNoHidden("customerPartNo");
        childOdrRcvDel.setCustomerItemNoOrg("customerPartNo");
        childOdrRcvDel.setOdrCtrlNo(new BigDecimal(0));
        try {
            childOdrRcvDel.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/21 18:01:27").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        childrenOdrRcv.add(childOdrRcvDel);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnRegisterのテスト(正常系(梱包指示済み))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnRegisterNormalPltzAlloc() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140630", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNoHidden("3000120501");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("30001205A002TB0091B3N");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(1));
        
        childOdrRcvUpd.setCustomerPoNo("newPo");
        childOdrRcvUpd.setCustomerItemNo("nweItem");
        
        childOdrRcvUpd.setFirmQty(new BigDecimal(200));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(200));
        childOdrRcvUpd.setShippedQty(new BigDecimal(0));
        childOdrRcvUpd.setShippingDt(DateUtil.parseDate("20140602", "yyyyMMdd"));
        childOdrRcvUpd.setSalesCompPoNo("newSales");
        
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2014/05/16 13:51:04").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnRegisterのテスト(正常系(船積み済み))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnRegisterNormalShipping() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // タイムスタンプ用日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20140731", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNoHidden("test02");
        childOdrRcvUpd.setCustomerItemNoHidden("test01");
        childOdrRcvUpd.setCustomerItemNoOrg("test01");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(1));
        
        childOdrRcvUpd.setCustomerPoNo("newPo");
        childOdrRcvUpd.setCustomerItemNo("nweItem");
        
        childOdrRcvUpd.setForecastQty(new BigDecimal(100));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(1000));
        childOdrRcvUpd.setShippedQty(new BigDecimal(100));
        childOdrRcvUpd.setShippingDt(DateUtil.parseDate("20140602", "yyyyMMdd"));
        childOdrRcvUpd.setSalesCompPoNo("newSales");
        
        try {
            childOdrRcvUpd.setUpdateTimestamp(new Timestamp(sdf.parse("2014/04/23 19:14:45").getTime()));
        } catch (ParseException e) {
            fail("例外が発生した");
        }
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        wb001OdrRcvService.transactOnRegister(parentOdrRcv);
    }
    
    /**
     * <br />transactOnRegisterのテスト(異常系(WsB007でシステムエラー))
     *
     * @throws Exception テストに失敗した場合
     */
    public void testTransactOnRegisterError() throws Exception {
        //Mock設定 
        //以下のメソッドはsearch系のメソッドでテスト済みの為、Mockとする
        WB001OdrRcvDomain result = new WB001OdrRcvDomain();
        MockObjectManager.addReturnValue(WB001OdrRcvServiceImpl.class, "searchOnRegisterInit", result);
        
        //WebService　WsB007
        ResultDomain wsResult = new ResultDomain();
        wsResult.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.addReturnValue(WsB007RestServiceMockImpl.class, "reflectToCusOdr", wsResult);
        
        // 親データ設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        parentOdrRcv.setRcvOdrCompCd("MY4");
        parentOdrRcv.setCustomerCd("30001205");
        parentOdrRcv.setLgcyShipTo("00");
        parentOdrRcv.setItemNo("A002TB0091B3N");
        parentOdrRcv.setPkgCd("110");
        parentOdrRcv.setTrnsCd("S");
        parentOdrRcv.setSupplierCd("sup");
        parentOdrRcv.setPlntCd("pl");
        
        // 更新用データ
        WB001OdrRcvDomain childOdrRcvUpd = new WB001OdrRcvDomain();
        childOdrRcvUpd.setEtdDueDt(DateUtil.parseDate("20141031", "yyyyMMdd"));
        childOdrRcvUpd.setCustomerPoNoHidden("30001205-01");
        childOdrRcvUpd.setCustomerItemNoHidden("30001205-A002TB0091B3N");
        childOdrRcvUpd.setCustomerItemNoOrg("-");
        childOdrRcvUpd.setOdrCtrlNo(new BigDecimal(151));
        
        childOdrRcvUpd.setCustomerPoNo("newPo");
        childOdrRcvUpd.setCustomerItemNo("nweItem");
        
        childOdrRcvUpd.setFirmQty(new BigDecimal(200));
        childOdrRcvUpd.setPltzAllocQty(new BigDecimal(100));
        childOdrRcvUpd.setShippedQty(new BigDecimal(100));
        childOdrRcvUpd.setShippingDt(DateUtil.parseDate("20140602", "yyyyMMdd"));
        childOdrRcvUpd.setSalesCompPoNo("newSales");
        
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        childrenOdrRcv.add(childOdrRcvUpd);
        
        // 親子関係紐づけ
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // 実行
        try {
            wb001OdrRcvService.transactOnRegister(parentOdrRcv);
            fail("例外が発生しない");
        } catch (GscmApplicationException e) {
            assertThat(e.getCode(), is(NXS_91_0001));
        }
    }
    
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
    
    /**
     * <br />検証用ファイルのヘッダーをコンソールアウトします。
     *
     * @param chkItems 検証用項目
     */
    private void printOutHeader(String chkItems){
        System.out.println(chkItems);
    }
}