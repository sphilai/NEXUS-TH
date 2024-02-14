/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0080;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0081;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0128;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0129;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0130;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0131;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_REGISTER_ALL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_WC001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_WC001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzServiceImpl;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WC001ErtCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
public class WC001ErtServiceTest extends AbstractEca0027Test {

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
     * E-RTサービス
     */
    private WC001ErtService ertService;
    
    /**
     * tt_pltzサービス
     */
    private TtPltzService ttPltzService;
    
    /**
     * tt_pltz_itemサービス
     */
    private TtPltzItemService ttPltzItemService;
    
    /**
     * tm_pkg_materialsサービス
     */
    private TmPkgMtrlService tmPkgMtrlService;

    
    /**
     * 日付フォーマット
     */
    private String dateFormat = "yyyy/MM/dd";
    
    /**
     * SimpleDateFormat
     */
    private SimpleDateFormat df = new SimpleDateFormat(dateFormat);

    /**
     * 日付フォーマット2
     */
    private String dateFormat2 = "dd/MM/yyyy";
    
    /**
     * SimpleDateFormat2
     */
    private SimpleDateFormat df2 = new SimpleDateFormat(dateFormat2);
    

    /**
     * <br />デフォルトコンストラクタです。
     */
    public WC001ErtServiceTest() {
    }
    
    /**
     * Getter method for ertService.
     *
     * @return the ertService
     */
    public WC001ErtService getErtService() {
        return ertService;
    }

    /**
     * Setter method for ertService.
     *
     * @param ertService Set for ertService
     */
    public void setErtService(WC001ErtService ertService) {
        this.ertService = ertService;
    }
    
    /**
     * Getter method for ttPltzService.
     *
     * @return the ttPltzService
     */
    public TtPltzService getTtPltzService() {
        return ttPltzService;
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
     * Getter method for ttPltzItemService.
     *
     * @return the ttPltzItemService
     */
    public TtPltzItemService getTtPltzItemService() {
        return ttPltzItemService;
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
     * Getter method for TmPkgMtrlService.
     *
     * @return the TmPkgMtrlService
     */
    public TmPkgMtrlService getTmPkgMtrlService() {
        return tmPkgMtrlService;
    }

    /**
     * Setter method for TmPkgMtrlService.
     *
     * @param tmPkgMtrlService Set for TmPkgMtrlService
     */
    public void setTmPkgMtrlService(TmPkgMtrlService tmPkgMtrlService) {
        this.tmPkgMtrlService = tmPkgMtrlService;
    }

    /**
     * <br /テストの前処理を行います。
     * 
     * @throws Exception 例外
     */
    @Before
    public void setUp() throws Exception {
        ertService = (WC001ErtService) getContext().getBean("wc001ErtService");
        ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        tmPkgMtrlService = (TmPkgMtrlService) getContext().getBean("TmPkgMtrlService");
    }
    
    /**
     * <br />validateConsistencyAfterDateのテスト
     *
     */
    @Test
    public void testValidateConsistencyAfterDate() {
        boolean result = false;

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        // 基準日以降であればOK
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();

        // 日 == null OK
        result = ertService.validateConsistencyAfterDate(null, dateFormat, "GMT");
        assertThat(result, is(true));
        
        // 日 == 現在日時 OK
        result = ertService.validateConsistencyAfterDate(df.format(now), dateFormat, "GMT");
        assertThat(result, is(true));
        
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        now = calendar.getTime();
        
        // 日 == 明日 OK
        result = ertService.validateConsistencyAfterDate(df.format(now), dateFormat, "GMT");
        assertThat(result, is(true));

        // フォーマット == null OK
        result = ertService.validateConsistencyAfterDate(df2.format(now), null, "GMT");
        assertThat(result, is(true));
        
        
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, -2);
        now = calendar.getTime();

        // 日 == 昨日(過去日) NG
        result = ertService.validateConsistencyAfterDate(df.format(now), dateFormat, "GMT");
        assertThat(result, is(false));
        
    }
    

    /**
     * <br />validateConsistencyCmlNoFromCmlNoToのテスト
     *
     */
    @Test
    public void testValidateConsistencyCmlNoFromCmlNoTo() {
        boolean result = false;
        
        // From==null To==null
        result = ertService.validateConsistencyCmlNoFromCmlNoTo(null, null);
        assertThat(result, is(true));
        // From==not null To== null
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("DMY7WH01405070011", null);
        assertThat(result, is(true));
        // From==null To== not null
        result = ertService.validateConsistencyCmlNoFromCmlNoTo(null, "DMY7WH01405070011");
        assertThat(result, is(true));

        // From=="" To==""
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("", "");
        assertThat(result, is(true));
        // From==not "" To== ""
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("DMY7WH01405070011", "");
        assertThat(result, is(true));
        // From=="" To== not ""
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("", "DMY7WH01405070011");
        assertThat(result, is(true));
        
        // From < To
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("DMY7WH01405070011", "DMY7WH01405070012");
        assertThat(result, is(true));
        // From == TO
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("DMY7WH01405070011", "DMY7WH01405070011");
        assertThat(result, is(true));
        // From > To
        result = ertService.validateConsistencyCmlNoFromCmlNoTo("DMY7WH01405070012", "DMY7WH01405070011");
        assertThat(result, is(false));
        
    }
    
    /**
     * <br />validateConsistencyCmlNoFromCmlNoToInputのテスト
     *
     */
    @Test
    public void testValidateConsistencyCmlNoFromCmlNoToInput() {
        boolean result = false;
        
        // From==null To==null
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput(null, null);
        assertThat(result, is(true));
        // From==not null To== null
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput("DTH8000140101000021", null);
        assertThat(result, is(true));
        // From==null To== not null
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput(null, "DTH8000140101000021");
        assertThat(result, is(false));

        // From=="" To==""
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput("", "");
        assertThat(result, is(true));
        // From==not "" To== ""
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput("DTH8000140101000021", "");
        assertThat(result, is(true));
        // From=="" To== not ""
        result = ertService.validateConsistencyCmlNoFromCmlNoToInput("", "DTH8000140101000021");
        assertThat(result, is(false));
    }

    /**
     * <br />validateConsistencyContentsのテスト
     *
     */
    @Test
    public void testValidateConsistencyContents() {
        boolean result = false;

        List<String> itemNoList = new ArrayList<String>();
        
        // 全て入っている
        itemNoList = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            itemNoList.add("ABCDEFG");
        }
        result = ertService.validateConsistencyContents(itemNoList, null, null);
        assertThat(result, is(true));
        
        // 最初だけ入っている
        itemNoList = new ArrayList<String>();
        itemNoList.add("ABCDEFG");
        for (int i = 0; i < 14; i++) {
            itemNoList.add("");
        }
        result = ertService.validateConsistencyContents(itemNoList, null, null);
        assertThat(result, is(true));

        // 最後だけ入っている
        itemNoList = new ArrayList<String>();
        for (int i = 0; i < 14; i++) {
            itemNoList.add("");
        }
        itemNoList.add("ABCDEFG");
        result = ertService.validateConsistencyContents(itemNoList, null, null);
        assertThat(result, is(true));

        // 真ん中だけ入っている
        itemNoList = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            itemNoList.add("");
        }
        itemNoList.add("ABCDEFG");
        for (int i = 0; i < 7; i++) {
            itemNoList.add("");
        }
        result = ertService.validateConsistencyContents(itemNoList, null, null);
        assertThat(result, is(true));
        
        // 全てブランク
        itemNoList = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            itemNoList.add("");
        }
        result = ertService.validateConsistencyContents(itemNoList, null, null);
        assertThat(result, is(false));
        
    }

    /**
     * <br />validateConsistencyContentsQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyContentsQty() {
        boolean result = false;

        // null
        result = ertService.validateConsistencyContentsQty(null);
        assertThat(result, is(true));
        // ブランク
        result = ertService.validateConsistencyContentsQty("");
        assertThat(result, is(true));
        // "0"
        result = ertService.validateConsistencyContentsQty("0");
        assertThat(result, is(false));
        // "00"
        result = ertService.validateConsistencyContentsQty("00");
        assertThat(result, is(false));
        // "000"
        result = ertService.validateConsistencyContentsQty("000");
        assertThat(result, is(false));
        // ".00001"
        result = ertService.validateConsistencyContentsQty(".00001");
        assertThat(result, is(false));
        // "0.00001"
        result = ertService.validateConsistencyContentsQty("0.00001");
        assertThat(result, is(false));
        // "0.999999"
        result = ertService.validateConsistencyContentsQty("0.999999");
        assertThat(result, is(false));
        // ".999999"
        result = ertService.validateConsistencyContentsQty(".999999");
        assertThat(result, is(false));
        // "1"
        result = ertService.validateConsistencyContentsQty("1");
        assertThat(result, is(true));
        // "01"
        result = ertService.validateConsistencyContentsQty("01");
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyGwのテスト
     *
     */
    @Test
    public void testValidateConsistencyGw() {
        boolean result = false;

        // null
        result = ertService.validateConsistencyGw(null);
        assertThat(result, is(false));
        // ブランク
        result = ertService.validateConsistencyGw("");
        assertThat(result, is(false));
        // "0"
        result = ertService.validateConsistencyGw("0");
        assertThat(result, is(false));
        // "00"
        result = ertService.validateConsistencyGw("00");
        assertThat(result, is(false));
        // "000"
        result = ertService.validateConsistencyGw("000");
        assertThat(result, is(false));
        // ".00001"
        result = ertService.validateConsistencyGw(".00001");
        assertThat(result, is(false));
        // "0.00001"
        result = ertService.validateConsistencyGw("0.00001");
        assertThat(result, is(true));
        // "1"
        result = ertService.validateConsistencyGw("1");
        assertThat(result, is(true));
        // "01"
        result = ertService.validateConsistencyGw("01");
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyLengthWidthHeightのテスト
     *
     */
    @Test
    public void testValidateConsistencyLengthWidthHeight() {
        boolean result = false;

        // null
        result = ertService.validateConsistencyLengthWidthHeight(null);
        assertThat(result, is(false));
        // ブランク
        result = ertService.validateConsistencyLengthWidthHeight("");
        assertThat(result, is(false));
        // 数値以外
        result = ertService.validateConsistencyLengthWidthHeight("x");
        assertThat(result, is(false));
        // "0"
        result = ertService.validateConsistencyLengthWidthHeight("0");
        assertThat(result, is(false));
        // "00"
        result = ertService.validateConsistencyLengthWidthHeight("00");
        assertThat(result, is(false));
        // "000"
        result = ertService.validateConsistencyLengthWidthHeight("000");
        assertThat(result, is(false));
        // ".00001"
        result = ertService.validateConsistencyLengthWidthHeight(".00001");
        assertThat(result, is(false));
        // "0.00001"
        result = ertService.validateConsistencyLengthWidthHeight("0.00001");
        assertThat(result, is(true));
        // "1"
        result = ertService.validateConsistencyLengthWidthHeight("1");
        assertThat(result, is(true));
        // "01"
        result = ertService.validateConsistencyLengthWidthHeight("01");
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyPalletQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyPalletQty() {
        boolean result = false;

        // 異常系 null
        result = ertService.validateConsistencyPalletQty(null);
        assertThat(result, is(false));
        // 異常系 ブランク
        result = ertService.validateConsistencyPalletQty("");
        assertThat(result, is(false));
        // 異常系 数値以外
        result = ertService.validateConsistencyPalletQty("x");
        assertThat(result, is(false));
        // 異常系 "0"
        result = ertService.validateConsistencyPalletQty("0");
        assertThat(result, is(false));
        // 異常系 "00"
        result = ertService.validateConsistencyPalletQty("00");
        assertThat(result, is(false));
        // 異常系 "000"
        result = ertService.validateConsistencyPalletQty("000");
        assertThat(result, is(false));
        // 異常系 "0.00001"
        result = ertService.validateConsistencyPalletQty("0.00001");
        assertThat(result, is(false));
        // 正常系 "1"
        result = ertService.validateConsistencyPalletQty("1");
        assertThat(result, is(true));
        // 正常系 "01"
        result = ertService.validateConsistencyPalletQty("01");
        assertThat(result, is(true));
    }

    /**
     * <br />validateConsistencyPkgItemNoQtyのテスト
     *
     */
    @Test
    public void testValidateConsistencyPkgItemNoQty() {
        boolean result = false;

        // itemNo==null qty==null
        result = ertService.validateConsistencyPkgItemNoQty(null, null);
        assertThat(result, is(true));
        // 異常系 itemNo==not null qty== null
        result = ertService.validateConsistencyPkgItemNoQty("A002TB0091B3N", null);
        assertThat(result, is(false));
        // 異常系 itemNo==null qty== not null
        result = ertService.validateConsistencyPkgItemNoQty(null, "1");
        assertThat(result, is(false));
        // 正常系 itemNo==not null qty== not null
        result = ertService.validateConsistencyPkgItemNoQty("A002TB0091B3N", "2");
        assertThat(result, is(true));

        // 正常系 itemNo=="" qty==""
        result = ertService.validateConsistencyPkgItemNoQty("", "");
        assertThat(result, is(true));
        // 異常系 itemNo==not "" qty== ""
        result = ertService.validateConsistencyPkgItemNoQty("A002TB0091B3N", "");
        assertThat(result, is(false));
        // 異常系 itemNo=="" qty== not ""
        result = ertService.validateConsistencyPkgItemNoQty("", "1");
        assertThat(result, is(false));
        // 正常系 itemNo==not "" qty== not ""
        result = ertService.validateConsistencyPkgItemNoQty("A002TB0091B3N", "2");
        assertThat(result, is(true));
        
    }

    /**
     * <br />validateConsistencyShipperPlantAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateConsistencyShipperPlantAuth() throws Exception {
        boolean result = false;

        // 正常系　両方とも入力
        result = ertService.validateConsistencyShipperPlantAuth("MY7", "M1");
        assertThat(result, is(true));
        
        // 正常系　両方とも未入力
        result = ertService.validateConsistencyShipperPlantAuth("", "");
        assertThat(result, is(true));

        // 異常系　数量だけ入力
        result = ertService.validateConsistencyShipperPlantAuth("", "11111");
        assertThat(result, is(false));

        // 異常系　品番だけ入力
        result = ertService.validateConsistencyShipperPlantAuth("XXX", "");
        assertThat(result, is(false));
    }

    // ------------------------------------------------------------------------------------

    /**
     * <br />validateDatabaseCompWhのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseCompWh() throws Exception {
        boolean result = false;

        // 正常系 組み合わせが正常
        result = ertService.validateDatabaseCompWh("TG0", "L201");
        assertThat(result, is(true));

        // 異常系 組み合わせが不正
        result = ertService.validateDatabaseCompWh("TG1", "L201");
        assertThat(result, is(false));

        // 異常系 未入力
        result = ertService.validateDatabaseCompWh("", "");
        assertThat(result, is(false));

        // 異常系 でたらめな値
        result = ertService.validateDatabaseCompWh("XXX", "ZZZ");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseShipperのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseShipper() throws Exception {
        boolean result = false;
        
        // 正常系 存在し、SHIPPER_FLG='Y'
        result = ertService.validateDatabaseShipper("MY7");
        assertThat(result, is(true));

        // 異常系 存在するが、SHIPPER_FLG='N'
        result = ertService.validateDatabaseShipper("TG0");
        assertThat(result, is(false));

        // 異常系 存在しない
        result = ertService.validateDatabaseShipper("ZZ1");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseShipToのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseShipTo() throws Exception {
        boolean result = false;

        // 正常系 存在する
        result = ertService.validateDatabaseShipTo("MY7");
        assertThat(result, is(true));

        // 異常系 存在しない
        result = ertService.validateDatabaseShipTo("MY71");
        assertThat(result, is(false));
    }

    /**
     * <br />validateDatabaseTmPkgMaterialsOnContensOfABoxRegisterのテスト
     * 正常系
     * 
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnContensOfABoxRegister1() throws Exception {

        try {
            // データをインサート
            this.deletePkgMaterialsData("MY7", "PKGITEMENO-901");
            List<Map<String, String>> expectedPkgMaterials = readCsvFile("TM_PKG_MATERIALS_01.csv");
            this.insertPkgMaterialsData(expectedPkgMaterials);
        
            // チェック処理
            List<String> pltzItemNoList = new ArrayList<String>();
            for (int i = 0; i < 15; i++) {
                pltzItemNoList.add("PKGITEMENO-001");
            }
            
            List<Integer> resultPartList = new ArrayList<Integer>();
    
            // 正常系
            List<String> returnList = new ArrayList<String>();
            TmPkgMtrlDomain domain = new TmPkgMtrlDomain();
            domain.setRtTyp("0");
            domain.setCurrCd("002");
            MockObjectManager.setReturnValueAtAllTimes( TmPkgMtrlServiceImpl.class, "searchByKey", domain);
            returnList = ertService.validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(
                "MY7"
                , pltzItemNoList
                , resultPartList
                , "en"
            );
            
            if (returnList.size() > 0) {
                fail("エラーにはならない");
            }
        } finally {
            this.deletePkgMaterialsData("MY7", "PKGITEMENO-901");
        }

    }

    /**
     * <br />validateDatabaseTmPkgMaterialsOnContensOfABoxRegisterのテスト
     * 異常系 pltzItemNoが不正
     * 
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnContensOfABoxRegister2() throws Exception {

        // チェック処理
        List<String> pltzItemNoList = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            pltzItemNoList.add("xxxxxxxx");
        }
        List<Integer> resultPartList = new ArrayList<Integer>();
        
        // 異常系 pltzItemNoが不正
        List<String> returnList = ertService.validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(
            "MY7"
            , pltzItemNoList
            , resultPartList
            , "en"
        );

        if (returnList.size() == 0) {
            fail("エラーにならないといけない");
        }
        if (returnList.size() > 0 && resultPartList.size() == 0) {
            fail("エラーの場合、リストにデータが入らないといけない");
        }
    }

    /**
     * <br />validateDatabaseTmPkgMaterialsOnContensOfABoxRegisterのテスト
     * 異常系 pltzItemNoが不正
     * 
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnContensOfABoxRegister3() throws Exception {

        // チェック処理
        List<String> pltzItemNoList = new ArrayList<String>();
        for (int i = 1; i < 8; i++) {
            pltzItemNoList.add("PKGITEMENO-00" + i);
        }
        List<Integer> resultPartList = new ArrayList<Integer>();
        
        // 異常系 RT_TYPとCURRENCY_CD（一意）
        List<String> returnList = ertService.validateDatabaseTmPkgMaterialsOnContensOfABoxRegister(
            "MY7"
            , pltzItemNoList
            , resultPartList
            , "en"
        );

        if (returnList.size() == 0) {
            fail("エラーにならないといけない");
        }
        else if (returnList.size() > 0 && resultPartList.size() == 0) {
            fail("エラーの場合、リストにデータが入らないといけない");
        }

        if (!returnList.contains(NXS_E7_0080)) {
            fail("RT_TYPエラーがない");
        
        }
        if (!returnList.contains(NXS_E7_0081)) {
            fail("CURRENCY_CDが一意でないのエラーがない");
        
        }
    }


    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxCancelByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxCancelByAuthCount() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405920005", "DMY7WH01405920104");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_05.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_05.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
            
            // 0件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("XXXXXXXXXXXXXXXXX");
            wc001ErtCriteriaDomain.setToMainMark("XXXXXXXXXXXXXXXXX");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0129)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0129) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }
            
            // 1件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals(NXS_E7_0129) || retArray[0].equals(GSCM_E0_0038)) {
                fail("件数エラーにはならないはず");
            }
            
            // 99件
            wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405920103");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals(NXS_E7_0129) || retArray[0].equals(GSCM_E0_0038)) {
                fail("件数エラーにはならないはず");
            }
            
            // 100件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405920104");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(GSCM_E0_0038)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(GSCM_E0_0038) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }

            // NXS_E7_0129
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            MockObjectManager.setReturnNullAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait");
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405920005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            String[] retArray1 = {"", ""};
            retArray1 = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
            assertEquals(true, NXS_E7_0129.equals(retArray1[0]));
            
            // NXS_E7_0130
            MockObjectManager.initialize();
            ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setCmlTyp("dummy");
            ttPltzDomain.setMainMark("dummy");
            MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait", ttPltzDomain);
            String[] retArray2 = {"", ""};
            retArray2 = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
            assertEquals(true, NXS_E7_0130.equals(retArray2[0]));
            
            // NXS_E7_0131
            MockObjectManager.initialize();
            TtPltzDomain ttPltzDomain2 = new TtPltzDomain();
            ttPltzDomain2.setCmlTyp(CML_TYPE_ERT);
            ttPltzDomain2.setPltzStatus("xxxxxxxxxxxxx");
            ttPltzDomain2.setMainMark("dummy");
            MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait", ttPltzDomain2);
            String[] retArray3 = {"", ""};
            retArray3 = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
            assertEquals(true, NXS_E7_0131.equals(retArray3[0]));
            
        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405920005", "DMY7WH01405920104");
        }
        
        
    }
    
    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxCancelByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxCancelByAuthCmlTypAndStatus() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405020001", "DMY7WH01405020006");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_03.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_03.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
    
            // 対象レコードが1件でもCML_TYPが"2"以外の場合 NXS_E7_0130
            // SELECT * FROM TT_PLTZ WHERE CML_TYP <> '2' AND shipper_cd = 'MY7';
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405020001");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405020003");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0130)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0130) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }
    
            // 対象レコードが1件でもPALLETIZE_STATUS_CDが"10"以外の場合 NXS_E7_0131
            // SELECT * FROM TT_PLTZ WHERE PLTZ_STATUS <> '10' AND shipper_cd = 'MY7';
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405020004");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405020006");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0131)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0131) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }

        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405020001", "DMY7WH01405020006");
        }
    }

    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxCancelByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxCancelByAuthOk() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405960005", "DMY7WH01405960005");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_09.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_09.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_WC001R, "MY7", "M1", "1", "fukui09", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
            
            // 権限エラー GSCM_I0_0009
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405960005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405960005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (!retArray[0].equals("")) {
                fail("認証失敗");
            }

        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405960005", "DMY7WH01405960005");
        }
    }
    
    
    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxCancelByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxCancelByAuthError() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405940005", "DMY7WH01405940005");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_07.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_07.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_WC001B, "MY7", "M1", "1", "fukui08", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
            
            // 権限エラー GSCM_I0_0009
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405940005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405940005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxCancelByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(GSCM_I0_0009)) {
                fail("エラーの内容が異なる");
            }

        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405940005", "DMY7WH01405940005");
        }
    }
    

    
    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthCmlTypAndStatus() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405930001", "DMY7WH01405930006");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_06.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_06.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
    
            // 対象レコードが1件でもCML_TYPが"2"以外の場合 NXS_E7_0130
            // SELECT * FROM TT_PLTZ WHERE CML_TYP <> '2' AND shipper_cd = 'MY7';
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405930001");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405930003");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0130)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0130) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }
            
        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405930001", "DMY7WH01405930006");
        }
        
    }

    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthOk() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405970005", "DMY7WH01405970005");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_10.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_10.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_WC001R, "MY7", "M1", "1", "fukui09", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
            
            // 権限エラー GSCM_I0_0009
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405970005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405970005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);

            if (!retArray[0].equals("")) {
                fail("認証失敗");
            }
            
        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405970005", "DMY7WH01405970005");
        }

    }
    

    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthError() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405950005", "DMY7WH01405950005");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_08.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_08.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_WC001B, "MY7", "M1", "1", "fukui08", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
            
            // 権限エラー GSCM_I0_0009
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405950005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405950005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(GSCM_I0_0009)) {
                fail("エラーの内容が異なる");
            }
            
        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405950005", "DMY7WH01405950005");
        }

    }
    
    /**
     * <br />validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseTtPltzOnContensOfABoxPrintCmlByAuthCount() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405100005", "DMY7WH01405100104");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_02.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_02.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
            WC001ErtCriteriaDomain wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            String[] retArray = {"", ""};
    
            // 0件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("XXXXXXXXXXXXXXXXX");
            wc001ErtCriteriaDomain.setToMainMark("XXXXXXXXXXXXXXXXX");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0129)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0129) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }
            
            // 1件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405100005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405100005");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals(NXS_E7_0129) || retArray[0].equals(GSCM_E0_0038)) {
                fail("件数エラーにはならないはず");
            }
            
            // 99件
            wc001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405100005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405100103");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals(NXS_E7_0129) || retArray[0].equals(GSCM_E0_0038)) {
                fail("件数エラーにはならないはず");
            }
            
            // 100件
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405100005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405100104");
            wc001ErtCriteriaDomain.setServerId("MYS");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
    
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(GSCM_E0_0038)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(GSCM_E0_0038) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }
            
            // 1件(ただしリストからは消えている)
            // 処理途中でブレイクし
            // DMY7WH01405100005またはDMY7WH01405100006を削除しなければいけない
            wc001ErtCriteriaDomain.setShipperCd("MY7");
            wc001ErtCriteriaDomain.setPlntCd("M1");
            wc001ErtCriteriaDomain.setFromMainMark("DMY7WH01405100005");
            wc001ErtCriteriaDomain.setToMainMark("DMY7WH01405100006");
            wc001ErtCriteriaDomain.setServerId("MYS");
            MockObjectManager.setReturnNullAtAllTimes(TtPltzServiceImpl.class, "searchByKey");
            retArray = ertService.validateDatabaseTtPltzOnContensOfABoxPrintCmlByAuth(wc001ErtCriteriaDomain);
            
            if (retArray[0].equals("")) {
                fail("エラーにならないといけない");
            }
            else if (!retArray[0].equals(NXS_E7_0129)) {
                fail("エラーの内容が異なる");
            }
            else if (retArray[0].equals(NXS_E7_0129) && retArray[1].equals("")) {
                fail("エラーの場合、リストにデータが入らないといけない");
            }

        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405100005", "DMY7WH01405100104");
        }
        
    }
    
    /**
     * <br />validateDatabaseWs9002OnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testValidateDatabaseWs9002OnContensOfABoxRegister() throws Exception {
//        boolean result = false;
        
        // 正常系
//        result = ertService.validateDatabaseWs9002OnContensOfABoxRegister("MY7", "MY7");
//        assertThat(result, is(true));

//        // 異常系
//        result = ertService.validateDatabaseWs9002OnContensOfABoxRegister("MY7", "999");
//        assertThat(result, is(false));

    }

    // 更新、検索系------------------------------------------------------------------------------------
    
    /**
     * <br />printErtのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testPrintErt() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405910005", "DMY7WH01405910104");
            List<Map<String, String>> expectedErt2 = readCsvFile("TT_PLTZ_04.csv");
            List<Map<String, String>> expectedErtItemList2 = readCsvFile("TT_PLTZ_ITEM_04.csv");
            this.insertErtData(expectedErt2, expectedErtItemList2);

            // 権限付与
            setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
            
            // 条件
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405910005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405910103");      //99件
            ertService.printErt(wC001ErtCriteriaDomain);

        } finally {
    
            // データを削除
            this.deleteErtData("DMY7WH01405910005", "DMY7WH01405910104");
        }

    }
    
    /**
     * <br />createOnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister() throws Exception {

        String[] fixture = { 
            "E-RT登録処理",
        };

        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "MAIN_MARK",
                "FROM_MAIN_MARK",
                "LANGUAGE_CD",
                "LOGIN_USER_DSC_ID",
                "TO_MAIN_MARK",
                "ROW_NUM_FROM",
                "ROW_NUM_TO"
            },
        };

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MY7");
        wC001ErtDomain.setTrnsCd("S");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("MY7");
        wC001ErtDomain.setPackingWhCd("WH01");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(100));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("MY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(2));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        Map<String, String> expectedErt = readCsvFile("CreateOnContentsOfABoxRegister1.csv").get(0);
        List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);

        assertDomain(fixture[0], ertList.get(0), expectedErt, ignoreCols[0]);
        
        // 異常系
        try {
            MockObjectManager.setReturnNullAt(CommonServiceImpl.class, "convertWeightUnit", 0);
            ertService.createOnContensOfABoxRegister(wC001ErtDomain);
            fail("エラーなし");
        } catch (GscmApplicationException e) {
            assertThat( e.getCode().equals("NXS-E7-0157"), is(true));
        }
    }


    /**
     * <br />createOnContensOfABoxRegisterのテスト2(Air)
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister_Air() throws Exception {

        String[] fixture = { 
            "E-RT登録処理",
        };

        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "MAIN_MARK",
                "FROM_MAIN_MARK",
                "LANGUAGE_CD",
                "LOGIN_USER_DSC_ID",
                "TO_MAIN_MARK",
                "ROW_NUM_FROM",
                "ROW_NUM_TO"
            },
        };

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MY7");
        wC001ErtDomain.setTrnsCd("A");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("MY7");
        wC001ErtDomain.setPackingWhCd("WH02");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(100));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("MY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(2));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        Map<String, String> expectedErt = readCsvFile("CreateOnContentsOfABoxRegister2.csv").get(0);
        List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);

        assertDomain(fixture[0], ertList.get(0), expectedErt, ignoreCols[0]);
        
    }

    /**
     * <br />createOnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister_DNBASE_N() throws Exception {

        String[] fixture = { 
            "E-RT登録処理",
        };

        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "MAIN_MARK",
                "FROM_MAIN_MARK",
                "LANGUAGE_CD",
                "LOGIN_USER_DSC_ID",
                "TO_MAIN_MARK",
                "ROW_NUM_FROM",
                "ROW_NUM_TO"
            },
        };

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MY7");
        wC001ErtDomain.setTrnsCd("S");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("YY7");
        wC001ErtDomain.setPackingWhCd("WH01");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(100));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("YY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(2));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        Map<String, String> expectedErt = readCsvFile("CreateOnContentsOfABoxRegister3.csv").get(0);
        List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);

        assertDomain(fixture[0], ertList.get(0), expectedErt, ignoreCols[0]);
        
    }
    

    /**
     * <br />createOnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister_BlankData() throws Exception {

        String[] fixture = { 
            "E-RT登録処理",
        };

        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "MAIN_MARK",
                "FROM_MAIN_MARK",
                "LANGUAGE_CD",
                "LOGIN_USER_DSC_ID",
                "TO_MAIN_MARK",
                "ROW_NUM_FROM",
                "ROW_NUM_TO"
            },
        };

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MY7");
        wC001ErtDomain.setTrnsCd("S");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("MY7");
        wC001ErtDomain.setPackingWhCd("WH03");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(100));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("MY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(2));
        wC001ErtItemList.add(domain);
        domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("");
        domain.setModelCd("");
        domain.setQty(new BigDecimal(0));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        Map<String, String> expectedErt = readCsvFile("CreateOnContentsOfABoxRegister4.csv").get(0);
        List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);

        assertDomain(fixture[0], ertList.get(0), expectedErt, ignoreCols[0]);
        
    }

    /**
     * <br />createOnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister_NXS_E7_0082() throws Exception {
        boolean result = false;

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MY7");
        wC001ErtDomain.setTrnsCd("A");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("MY7");
        wC001ErtDomain.setPackingWhCd("WH04");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(24));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("MY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(10));
        wC001ErtItemList.add(domain);
        domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-002");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(15));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        try {
            List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);
            if (ertList.size() > 0) {
                fail("ありえない");
            }
        } catch (ValidationException e) {
            if (e.getErrors().get(0).getKey().equals(NXS_E7_0082)) {
                result = true;
            }
        }
        assertThat(result, is(true));
        
    }


    /**
     * <br />createOnContensOfABoxRegisterのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testCreateOnContensOfABoxRegister_NXS_E7_0128() throws Exception {
        boolean result = false;

        // 権限付与
        setScreenCommonContext(PERMIT_FUNC_ID_REGISTER_ALL, "MY7", "M1", "2", "fukui07", "MY7");
        
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        wC001ErtDomain.setLanguageCd("en");
        wC001ErtDomain.setLoginUserDscId("fukui07");
        wC001ErtDomain.setShipToCd("MYZ");
        wC001ErtDomain.setTrnsCd("S");
        wC001ErtDomain.setFreightResponsibleCd("");
        //wC001ErtDomain.setDueDt(wlDueDt);
        wC001ErtDomain.setPackingWhCompCd("MY7");
        wC001ErtDomain.setPackingWhCd("WH05");
        wC001ErtDomain.setPlntCd("M1");
        wC001ErtDomain.setContainerSortingKey("");
        wC001ErtDomain.setLoadingCd("D");
        wC001ErtDomain.setInvoiceCtgry("");
        wC001ErtDomain.setCmlTyp("");
        wC001ErtDomain.setPriceTerms("FOB");
        wC001ErtDomain.setReturnStyleCd("ReturnStyleCd");
        wC001ErtDomain.setPalletQty(new BigDecimal(50));
        wC001ErtDomain.setLength(new BigDecimal(1));
        wC001ErtDomain.setWidth(new BigDecimal(2));
        wC001ErtDomain.setHeight(new BigDecimal(3));
        wC001ErtDomain.setVolume(new BigDecimal(6));
        wC001ErtDomain.setNetWeight(new BigDecimal(0));
        wC001ErtDomain.setGrossWeight(new BigDecimal(100));
        wC001ErtDomain.setLengthUnit("MR");
        wC001ErtDomain.setVolumeUnit("LT");
        wC001ErtDomain.setWeightUnit("KG");
        wC001ErtDomain.setShipperCd("MY7");

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setPltzItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setQty(new BigDecimal(2));
        wC001ErtItemList.add(domain);
        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);

        try {
            List<? extends WC001ErtDomain> ertList = ertService.createOnContensOfABoxRegister(wC001ErtDomain);
            if (ertList.size() > 0) {
                fail("ありえない");
            }
        } catch (ValidationException e) {
            if (e.getErrors().get(0).getKey().equals(NXS_E7_0128)) {
                result = true;
            }
        }
        
        assertThat(result, is(true));
        
    }

    
    /**
     * <br />searchOnContensOfABoxDisplayのテスト
     * 
     * @throws Exception 例外
     */
    @Test
    public void testSearchOnContensOfABoxDisplay() throws Exception {

        // 検索条件 (※書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[] fixture = { 
            "梱包指示NOで検索",
            "3",
            "MY7",       // ShipperCd
            "MY7",       // ShipToCd
            "S",         // TrnsCd
            "",          // DueDt
            "MY7",       // PackingWhCompCd
            "WH01",      // PackingWhCd
            "M1",        // PlntCd
            "D",         // LoadingCd
            "FOB",       // PriceTerms
            "abcedfg",   // ReturnStyleCd
            "1",         // Length
            "2",         // Width
            "3",         // Height
            "6",         // Volume
            "20",        // GrossWeight
            "PKGITEMENO-001",   // KitParItemNo
            "1",         // ModelCd
            "2"          // Qty
        };

        /*
         * 0: TT_PLTZ
         * 1: TT_PLTZ_ITEM
         */
        // 比較対象外カラム
        String[][] ignoreCols = {
            {
                "MAIN_MARK",
            },
            {
                "MAIN_MARK",
                "BRCH",
                "PKG_CD",
                "ITEM_DESCRIPTION",
            }
        };
        
        Map<String, String> expectedErt = readCsvFile("SearchOnContentsOfABoxDisplay.csv").get(0);
        List<Map<String, String>> expectedErtItemList = readCsvFile("SearchOnContentsOfABoxDisplayItem.csv");

        WC001ErtDomain wc001ert = ertService.searchOnContensOfABoxDisplay(toErt(fixture));
        
        assertDomain(fixture[0], wc001ert, expectedErt, ignoreCols[0]);
        assertDomainList(fixture[0], wc001ert.getErtItemDomainList(), expectedErtItemList, ignoreCols[1]);
        
        // 異常系
        try {
            MockObjectManager.setReturnNullAt(CommonServiceImpl.class, "convertWeightUnit", 0);
            ertService.searchOnContensOfABoxDisplay(toErt(fixture));
            fail("エラーなし");
        } catch (GscmApplicationException e) {
            assertThat( e.getCode().equals("NXS-E7-0157"), is(true));
        }
    }


    /**
     * <br />searchOnContensOfABoxDisplayのテスト
     * 
     * @throws Exception 例外
     */
    @Test
    public void testSearchOnContensOfABoxDisplay_NXS_E7_0128() throws Exception {
        boolean result = false;

        // 検索条件 (※書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[] fixture = { 
            "梱包指示NOで検索",
            "3",
            "MY7",       // ShipperCd
            "MYX",       // ShipToCd
            "S",         // TrnsCd
            "",          // DueDt
            "MY7",       // PackingWhCompCd
            "WH01",      // PackingWhCd
            "M1",        // PlntCd
            "D",         // LoadingCd
            "FOB",       // PriceTerms
            "abcedfg",   // ReturnStyleCd
            "1",         // Length
            "2",         // Width
            "3",         // Height
            "6",         // Volume
            "20",        // GrossWeight
            "PKGITEMENO-001",   // KitParItemNo
            "1",         // ModelCd
            "2"          // Qty
        };
        

        try {
            ertService.searchOnContensOfABoxDisplay(toErt(fixture));

        } catch (GscmApplicationException e) {
            
            // エラー取得
            if (e.getCode().equals(NXS_E7_0128)) {
                result = true;
            }
            
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405980005", "DMY7WH01405980104");
        }
        assertThat(result, is(true));
        
        
    }
    
    /**
     * <br />searchOnContensOfABoxDisplayのテスト
     * 
     * @throws Exception 例外
     */
    @Test
    public void testSearchOnContensOfABoxDisplay_CONTINUE() throws Exception {

        // 検索条件 (※書式はtestSearchCountForPagingOnMainSearch1と同じ)
        String[] fixture = { 
            "梱包指示NOで検索",
            "3",
            "MY7",       // ShipperCd
            "MY7",       // ShipToCd
            "S",         // TrnsCd
            "",          // DueDt
            "MY7",       // PackingWhCompCd
            "WH01",      // PackingWhCd
            "M1",        // PlntCd
            "D",         // LoadingCd
            "FOB",       // PriceTerms
            "abcedfg",   // ReturnStyleCd
            "1",         // Length
            "2",         // Width
            "3",         // Height
            "6",         // Volume
            "20",        // GrossWeight
            "",   // KitParItemNo
            "1",         // ModelCd
            "2"          // Qty
        };

        WC001ErtDomain wc001ert = ertService.searchOnContensOfABoxDisplay(toErt(fixture));
        
        if (wc001ert.getErtItemDomainList() == null) {
            fail("ありえない");
        }
        List<WC001ErtItemDomain> ertItemDomainList = wc001ert.getErtItemDomainList();
        if (!ertItemDomainList.get(0).getModelCd().equals("")) {
            fail("Blank時のcontinue処理に未到達");
        }
        
    }

    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel() throws Exception {

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405090005", "DMY7WH01405090104");
            List<Map<String, String>> expectedErt = readCsvFile("TT_PLTZ_01.csv");
            List<Map<String, String>> expectedErtItemList = readCsvFile("TT_PLTZ_ITEM_01.csv");
            this.insertErtData(expectedErt, expectedErtItemList);
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405090005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405090006");
            
            // キャンセル処理の実行
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
    
            if (ret != 2) {
                fail("削除件数が合わない");
            }
        
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405090005", "DMY7WH01405090104");
        }
      
    }

    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel_NXS_E7_0129() throws Exception {
        boolean result = false;

        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405980005", "DMY7WH01405980104");
            List<Map<String, String>> expectedErt = readCsvFile("TT_PLTZ_14.csv");
            List<Map<String, String>> expectedErtItemList = readCsvFile("TT_PLTZ_ITEM_14.csv");
            this.insertErtData(expectedErt, expectedErtItemList);
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405980005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405980006");

            // 1件(ただしリストからは消えている)
            // 処理途中でブレイクし
            // DMY7WH01405090005またはDMY7WH01405090006を削除しなければいけない
            // キャンセル処理の実行
            MockObjectManager.setReturnNullAtAllTimes(TtPltzServiceImpl.class, "lockByKeyNoWait");
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
            if (ret == 0) {
                fail("ありえない");
            }

        } catch (GscmApplicationException e) {
            
            // 取得件数が100件の場合
            if (e.getCode().equals(NXS_E7_0129)) {
                result = true;
            }
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405980005", "DMY7WH01405980104");
        }
        assertThat(result, is(true));
      
    }

    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel_GSCM_E0_0038() throws Exception {
        boolean result = false;
        
        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405810005", "DMY7WH01405810104");
            List<Map<String, String>> expectedErt = readCsvFile("TT_PLTZ_13.csv");
            List<Map<String, String>> expectedErtItemList = readCsvFile("TT_PLTZ_ITEM_13.csv");
            this.insertErtData(expectedErt, expectedErtItemList);
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405810005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405810104");
            
            // キャンセル処理の実行
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
            if (ret == 0) {
                fail("ありえない");
            }

        } catch (GscmApplicationException e) {
            
            // 取得件数が100件の場合
            if (e.getCode().equals(GSCM_E0_0038)) {
                result = true;
            }
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405810005", "DMY7WH01405810104");
        }
        assertThat(result, is(true));
      
    }
    
    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel_GSCM_E0_0010() throws Exception {
        boolean result = false;

        try {
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH0140509XXXX");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH0140509YYYY");
            
            // キャンセル処理の実行
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
            if (ret == 0) {
                fail("ありえない");
            }
            
        } catch (GscmApplicationException e) {
            
            // 削除件数0
            if (e.getCode().equals(GSCM_E0_0010)) {
                result = true;
            }
        }

        assertThat(result, is(true));
      
    }
    

    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel_NXS_E7_0130() throws Exception {
        boolean result = false;
        
        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405961005", "DMY7WH01405961005");
            List<Map<String, String>> expectedErt = readCsvFile("TT_PLTZ_11.csv");
            List<Map<String, String>> expectedErtItemList = readCsvFile("TT_PLTZ_ITEM_11.csv");
            this.insertErtData(expectedErt, expectedErtItemList);
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405961005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405961005");
            
            // キャンセル処理の実行
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
    
            if (ret != 2) {
                fail("削除件数が合わない");
            }

        } catch (GscmApplicationException e) {
            
            // CML_TYPが"2"以外の場合
            if (e.getCode().equals(NXS_E7_0130)) {
                result = true;
            }
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405961005", "DMY7WH01405961005");
        }
        assertThat(result, is(true));
      
    }

    /**
     * <br />deleteOnContensOfABoxCancelのテスト
     *
     * @throws Exception 例外
     */
    @Test
    public void testDeleteOnContensOfABoxCancel_NXS_E7_0131() throws Exception {
        boolean result = false;
        
        try {
            // データをインサート
            this.deleteErtData("DMY7WH01405971005", "DMY7WH01405971005");
            List<Map<String, String>> expectedErt = readCsvFile("TT_PLTZ_12.csv");
            List<Map<String, String>> expectedErtItemList = readCsvFile("TT_PLTZ_ITEM_12.csv");
            this.insertErtData(expectedErt, expectedErtItemList);
    
            // ERT検索条件ドメインの作成
            WC001ErtCriteriaDomain wC001ErtCriteriaDomain = new WC001ErtCriteriaDomain();
            wC001ErtCriteriaDomain.setFromMainMark("DMY7WH01405971005");
            wC001ErtCriteriaDomain.setToMainMark("DMY7WH01405971005");
            
            // キャンセル処理の実行
            Integer ret = ertService.deleteOnContensOfABoxCancel(wC001ErtCriteriaDomain);
    
            if (ret != 2) {
                fail("削除件数が合わない");
            }

        } catch (GscmApplicationException e) {
            
            // PALLETIZE_STATUS_CDが"10"以外の場合
            if (e.getCode().equals(NXS_E7_0131)) {
                result = true;
            }
        } finally {

            // データを削除
            this.deleteErtData("DMY7WH01405971005", "DMY7WH01405971005");
        }
        assertThat(result, is(true));
      
    }

    // テストメソッドはここまで
    // --------------------------------------------------------------------------------------------------------------------------

    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param expectedPkgMaterials TT_PKG_MATERIALS
     * @throws Exception 例外
     */
    private void insertPkgMaterialsData(List<Map<String, String>> expectedPkgMaterials)
        throws Exception {

        TmPkgMtrlDomain tmPkgMaterials = new TmPkgMtrlDomain();
        for (int i = 0; i < expectedPkgMaterials.size(); i++) {
            Map<String, String> mapPkgMaterials = expectedPkgMaterials.get(i);
            tmPkgMaterials.setOwnerComp(mapPkgMaterials.get("OWNER_COMP"));
            tmPkgMaterials.setPkgItemNo(mapPkgMaterials.get("PKG_ITEM_NO"));
            tmPkgMaterials.setModelCd(mapPkgMaterials.get("MODEL_CD"));
            tmPkgMaterials.setLengthUnit(mapPkgMaterials.get("LENGTH_UNIT"));
            //tmPkgMaterials.setLength(new BigDecimal(mapPkgMaterials.get("LENGTH")));
            //tmPkgMaterials.setWidth(new BigDecimal(mapPkgMaterials.get("WIDTH")));
            //tmPkgMaterials.setHeight(new BigDecimal(mapPkgMaterials.get("HEIGHT")));
            //tmPkgMaterials.setLengthFold(new BigDecimal(mapPkgMaterials.get("LENGTH_FOLD")));
            //tmPkgMaterials.setWidthFold(new BigDecimal(mapPkgMaterials.get("WIDTH_FOLD")));
            //tmPkgMaterials.setHeightFold(new BigDecimal(mapPkgMaterials.get("HEIGHT_FOLD")));
            tmPkgMaterials.setWeightUnit(mapPkgMaterials.get("WEIGHT_UNIT"));
            tmPkgMaterials.setPkgWeight(new BigDecimal(mapPkgMaterials.get("PKG_WEIGHT")));
            tmPkgMaterials.setRtTyp(mapPkgMaterials.get("RT_TYP"));
            //tmPkgMaterials.setOriginCntry(mapPkgMaterials.get("ORIGIN_CNTRY"));
            //tmPkgMaterials.setPkgCtgry(mapPkgMaterials.get("PKG_CTGRY"));
            tmPkgMaterials.setSupplierCd(mapPkgMaterials.get("SUPPLIER_CD"));
            tmPkgMaterials.setCurrCd(mapPkgMaterials.get("CURR_CD"));
            tmPkgMaterials.setCustomsValuation(new BigDecimal(mapPkgMaterials.get("CUSTOMS_VALUATION")));
            tmPkgMaterials.setItemNoGrp(mapPkgMaterials.get("ITEM_NO_GRP"));
            //tmPkgMaterials.setQtyUnit(mapPkgMaterials.get("QTY_UNIT"));

            tmPkgMaterials.setComUpdateFuncId(mapPkgMaterials.get("COM_UPDATE_FUNC_ID"));
            tmPkgMaterials.setComUpdateUserId(mapPkgMaterials.get("COM_UPDATE_USER_ID"));
            tmPkgMaterials.setComUpdateTimestamp(new Timestamp(1));
            tmPkgMaterials.setComCreateFuncId(mapPkgMaterials.get("COM_CREATE_FUNC_ID"));
            tmPkgMaterials.setComCreateUserId(mapPkgMaterials.get("COM_CREATE_USER_ID"));
            tmPkgMaterials.setComCreateTimestamp(new Timestamp(1));

            //tmPkgMtrlService.create(tmPkgMaterials);
        }
    }
    
    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param expectedErt E-RTのTT_PLTZ
     * @param expectedErtItemList E-RTのTT_PLTZ_ITEM
     * @throws Exception 例外
     */
    private void insertErtData(List<Map<String, String>> expectedErt, List<Map<String, String>> expectedErtItemList)
        throws Exception {

        TtPltzDomain ttPltz = new TtPltzDomain();
        TtPltzItemDomain ttPltzItem = new TtPltzItemDomain();
        
        for (int i = 0; i < expectedErt.size(); i++) {
            Map<String, String> mapExpErt = expectedErt.get(i);
            ttPltz.setMainMark(mapExpErt.get("MAIN_MARK"));
            ttPltz.setPalletNo(mapExpErt.get("PALLET_NO"));
            ttPltz.setShipperCd(mapExpErt.get("SHIPPER_CD"));
            ttPltz.setShipToCd(mapExpErt.get("SHIP_TO_CD"));
            ttPltz.setCustomerCd(mapExpErt.get("CUSTOMER_CD"));
            ttPltz.setLgcyShipTo(mapExpErt.get("LGCY_SHIP_TO"));
            ttPltz.setTrnsCd(mapExpErt.get("TRNS_CD"));
            ttPltz.setTrnsCdOrg(mapExpErt.get("TRNS_CD_ORG"));
            ttPltz.setReviseFlg(mapExpErt.get("REVISE_FLG"));
            ttPltz.setPlntCd(mapExpErt.get("PLNT_CD"));
            ttPltz.setLgcyWhCd(mapExpErt.get("LGCY_WH_CD"));
            ttPltz.setCurLgcyWhCd(mapExpErt.get("CUR_LGCY_WH_CD"));
            ttPltz.setPkgFormTyp(mapExpErt.get("PKG_FORM_TYP"));
            ttPltz.setInvoiceKey(mapExpErt.get("INVOICE_KEY"));
            ttPltz.setContainerSortingKey(mapExpErt.get("CONTAINER_SORTING_KEY"));
            ttPltz.setContainerLooseTyp(mapExpErt.get("CONTAINER_LOOSE_TYP"));
            ttPltz.setReturnStyleCd(mapExpErt.get("RETURN_STYLE_CD"));
            ttPltz.setVariantFlg(mapExpErt.get("VARIANT_FLG"));
            ttPltz.setRtUseFlg(mapExpErt.get("RT_USE_FLG"));
            ttPltz.setWeightUnit(mapExpErt.get("WEIGHT_UNIT"));
            ttPltz.setNetWeight(new BigDecimal(mapExpErt.get("NET_WEIGHT")));
            ttPltz.setGrossWeight(new BigDecimal(mapExpErt.get("GROSS_WEIGHT")));
            ttPltz.setLengthUnit(mapExpErt.get("LENGTH_UNIT"));
            ttPltz.setLength(new BigDecimal(mapExpErt.get("LENGTH")));
            ttPltz.setWidth(new BigDecimal(mapExpErt.get("WIDTH")));
            ttPltz.setHeight(new BigDecimal(mapExpErt.get("HEIGHT")));
            ttPltz.setVolumeUnit(mapExpErt.get("VOLUME_UNIT"));
            ttPltz.setVolume(new BigDecimal(mapExpErt.get("VOLUME")));
//            ttPltz.setSupplierMainMark(mapExpErt.get("SUPPLIER_MAIN_MARK"));
            ttPltz.setCmlTyp(mapExpErt.get("CML_TYP"));
//            ttPltz.setOuterPkgCd(mapExpErt.get("OUTER_PKG_CD"));
            ttPltz.setExpPackingDt(new Date());
            ttPltz.setExpPackingIssuerId(mapExpErt.get("EXP_PACKING_ISSUER_ID"));
            ttPltz.setExpPackingIssuerNm(mapExpErt.get("EXP_PACKING_ISSUER_NM"));
//            ttPltz.setDueDt(new Date());
            ttPltz.setStgInstrItemFlg(mapExpErt.get("STG_INSTR_ITEM_FLG"));
            ttPltz.setConsigneeCd(mapExpErt.get("CONSIGNEE_CD"));
            ttPltz.setCommercialFlg(mapExpErt.get("COMMERCIAL_FLG"));
//            ttPltz.setTradeTerms(mapExpErt.get("TRADE_TERMS"));
            ttPltz.setCurrCd(mapExpErt.get("CURR_CD"));
            ttPltz.setPltzStatus(mapExpErt.get("PLTZ_STATUS"));
            ttPltz.setPackingWhCompCd(mapExpErt.get("PACKING_WH_COMP_CD"));
            ttPltz.setPackingWhCd(mapExpErt.get("PACKING_WH_CD"));
            ttPltz.setCurWhCompCd(mapExpErt.get("CUR_WH_COMP_CD"));
            ttPltz.setCurWhCd(mapExpErt.get("CUR_WH_CD"));
//            ttPltz.setXmainMark(mapExpErt.get("XMAIN_MARK"));
//            ttPltz.setInvoiceNo(mapExpErt.get("INVOICE_NO"));
//            ttPltz.setInvoiceIssueDt(new Date());
            ttPltz.setLoadingCd(mapExpErt.get("LOADING_CD"));
//            ttPltz.setSiteTyp(mapExpErt.get("SITE_TYP"));
            ttPltz.setExpLimitFlg(mapExpErt.get("EXP_LIMIT_FLG"));
            ttPltz.setDngrItemFlg(mapExpErt.get("DNGR_ITEM_FLG"));
//            ttPltz.setStgInstrNo(mapExpErt.get("STG_INSTR_NO"));
//            ttPltz.setStgActNo(mapExpErt.get("STG_ACT_NO"));
//            ttPltz.setShippingFirmNo(mapExpErt.get("SHIPPING_FIRM_NO"));
            ttPltz.setCustomTimingTyp(mapExpErt.get("CUSTOM_TIMING_TYP"));
            ttPltz.setLastTrStatus(mapExpErt.get("LAST_TR_STATUS"));
//            ttPltz.setLastTrRcvDt(new Date());
//            ttPltz.setPltzInstrNo(mapExpErt.get("PLTZ_INSTR_NO"));
//            ttPltz.setExpRequestNo(mapExpErt.get("EXP_REQUEST_NO"));
            ttPltz.setExpRequestAllCmlIssuedFlg(mapExpErt.get("EXP_REQUEST_ALL_CML_ISSUED_FLG"));
            ttPltz.setSplitShippingNgFlg(mapExpErt.get("SPLIT_SHIPPING_NG_FLG"));
//            ttPltz.setShipperCompNmAbb(mapExpErt.get("SHIPPER_COMP_NM_ABB"));
//            ttPltz.setShipperCompNm1(mapExpErt.get("SHIPPER_COMP_NM_1"));
//            ttPltz.setShipperCompNm2(mapExpErt.get("SHIPPER_COMP_NM_2"));
//            ttPltz.setShipperCompAddr1(mapExpErt.get("SHIPPER_COMP_ADDR_1"));
//            ttPltz.setShipperCompAddr2(mapExpErt.get("SHIPPER_COMP_ADDR_2"));
//            ttPltz.setShipperCompAddr3(mapExpErt.get("SHIPPER_COMP_ADDR_3"));
//            ttPltz.setShipperCompAddr4(mapExpErt.get("SHIPPER_COMP_ADDR_4"));
//            ttPltz.setShipperCompTel(mapExpErt.get("SHIPPER_COMP_TEL"));
//            ttPltz.setShipperCompFax(mapExpErt.get("SHIPPER_COMP_FAX"));
//            ttPltz.setConsigneeCompNm1(mapExpErt.get("CONSIGNEE_COMP_NM_1"));
//            ttPltz.setConsigneeCompNm2(mapExpErt.get("CONSIGNEE_COMP_NM_2"));
//            ttPltz.setConsigneeCompAddr1(mapExpErt.get("CONSIGNEE_COMP_ADDR_1"));
//            ttPltz.setConsigneeCompAddr2(mapExpErt.get("CONSIGNEE_COMP_ADDR_2"));
//            ttPltz.setConsigneeCompAddr3(mapExpErt.get("CONSIGNEE_COMP_ADDR_3"));
//            ttPltz.setConsigneeCompAddr4(mapExpErt.get("CONSIGNEE_COMP_ADDR_4"));
//            ttPltz.setConsigneeCompTel(mapExpErt.get("CONSIGNEE_COMP_TEL"));
//            ttPltz.setConsigneeCompFax(mapExpErt.get("CONSIGNEE_COMP_FAX"));
//            ttPltz.setConsigneeAttn(mapExpErt.get("CONSIGNEE_ATTN"));
//            ttPltz.setShipToNm1(mapExpErt.get("SHIP_TO_NM_1"));
//            ttPltz.setShipToNm2(mapExpErt.get("SHIP_TO_NM_2"));
//            ttPltz.setShipToAddr1(mapExpErt.get("SHIP_TO_ADDR_1"));
//            ttPltz.setShipToAddr2(mapExpErt.get("SHIP_TO_ADDR_2"));
//            ttPltz.setShipToAddr3(mapExpErt.get("SHIP_TO_ADDR_3"));
//            ttPltz.setShipToAddr4(mapExpErt.get("SHIP_TO_ADDR_4"));
//            ttPltz.setShipToTel(mapExpErt.get("SHIP_TO_TEL"));
            ttPltz.setInvoiceCtgry(mapExpErt.get("INVOICE_CTGRY"));
            ttPltz.setPriceTerms(mapExpErt.get("PRICE_TERMS"));
//            ttPltz.setTermsPoint(mapExpErt.get("TERMS_POINT"));
//            ttPltz.setPayTerms(mapExpErt.get("PAY_TERMS"));
//            ttPltz.setPayMeth(mapExpErt.get("PAY_METH"));
            ttPltz.setReExpGoodsFlg(mapExpErt.get("RE_EXP_GOODS_FLG"));
//            ttPltz.setSupplierInvoiceNo(mapExpErt.get("SUPPLIER_INVOICE_NO"));
//            ttPltz.setImpInvoiceNo1(mapExpErt.get("IMP_INVOICE_NO_1"));
//            ttPltz.setImpInvoiceNo2(mapExpErt.get("IMP_INVOICE_NO_2"));
//            ttPltz.setFreightResponsibleCd(mapExpErt.get("FREIGHT_RESPONSIBLE_CD"));
            ttPltz.setMigrationFlg(mapExpErt.get("MIGRATION_FLG"));
//            ttPltz.setOldQrMixTyp(mapExpErt.get("OLD_QR_MIX_TYP"));
//            ttPltz.setOldQrContainerGrpCd(mapExpErt.get("OLD_QR_CONTAINER_GRP_CD"));
            ttPltz.setComUpdateFuncId(mapExpErt.get("COM_UPDATE_FUNC_ID"));
            ttPltz.setComUpdateUserId(mapExpErt.get("COM_UPDATE_USER_ID"));
            ttPltz.setComUpdateTimestamp(new Timestamp(1));
            ttPltz.setComCreateFuncId(mapExpErt.get("COM_CREATE_FUNC_ID"));
            ttPltz.setComCreateUserId(mapExpErt.get("COM_CREATE_USER_ID"));
            ttPltz.setComCreateTimestamp(new Timestamp(1));

            ttPltzService.create(ttPltz);
        }

        for (int i = 0; i < expectedErtItemList.size(); i++) {
            Map<String, String> mapExpErtItem = expectedErtItemList.get(i);
            ttPltzItem.setMainMark(mapExpErtItem.get("MAIN_MARK"));
            ttPltzItem.setBrch(new BigDecimal(mapExpErtItem.get("BRCH")));
            ttPltzItem.setPltzItemNo(mapExpErtItem.get("PLTZ_ITEM_NO"));
            ttPltzItem.setPkgCd(mapExpErtItem.get("PKG_CD"));
            ttPltzItem.setItemDescription(mapExpErtItem.get("ITEM_DESCRIPTION"));
            ttPltzItem.setQty(new BigDecimal(mapExpErtItem.get("QTY")));
            ttPltzItem.setQtyUnit(mapExpErtItem.get("QTY_UNIT"));
//            ttPltzItem.setTagQty(new BigDecimal(mapExpErtItem.get("TAG_QTY")));
            ttPltzItem.setItemTyp(mapExpErtItem.get("ITEM_TYP"));
            ttPltzItem.setNetWeight(new BigDecimal(mapExpErtItem.get("NET_WEIGHT")));
            ttPltzItem.setItemWeight(new BigDecimal(mapExpErtItem.get("ITEM_WEIGHT")));
            ttPltzItem.setWeightUnit(mapExpErtItem.get("WEIGHT_UNIT"));
//            ttPltzItem.setShippingLot(new BigDecimal(mapExpErtItem.get("SHIPPING_LOT")));
            ttPltzItem.setPkgTyp(mapExpErtItem.get("PKG_TYP"));
            ttPltzItem.setModelCd(mapExpErtItem.get("MODEL_CD"));
            ttPltzItem.setExpLimitTyp(mapExpErtItem.get("EXP_LIMIT_TYP"));
            ttPltzItem.setDngrItemFlg(mapExpErtItem.get("DNGR_ITEM_FLG"));
            ttPltzItem.setOriginCntryCd(mapExpErtItem.get("ORIGIN_CNTRY_CD"));
            ttPltzItem.setCurrCd(mapExpErtItem.get("CURR_CD"));
            ttPltzItem.setPlntCd(mapExpErtItem.get("PLNT_CD"));
            ttPltzItem.setRtFlg(mapExpErtItem.get("RT_FLG"));
            ttPltzItem.setKitFlg(mapExpErtItem.get("KIT_FLG"));
//            ttPltzItem.setExpRequestNo(mapExpErtItem.get("EXP_REQUEST_NO"));
//            ttPltzItem.setLineNo(new BigDecimal(mapExpErtItem.get("LINE_NO")));
//            ttPltzItem.setKitBrch(new BigDecimal(mapExpErtItem.get("KIT_BRCH")));
//            ttPltzItem.setMixTagNo(mapExpErtItem.get("MIX_TAG_NO"));
//            ttPltzItem.setPltzInstrNo(mapExpErtItem.get("PLTZ_INSTR_NO"));
            ttPltzItem.setParFlg(mapExpErtItem.get("PAR_FLG"));
            ttPltzItem.setKitParItemNo(mapExpErtItem.get("KIT_PAR_ITEM_NO"));
//            ttPltzItem.setCustomerPoNo(mapExpErtItem.get("CUSTOMER_PO_NO"));
//            ttPltzItem.setCustomerItemNo(mapExpErtItem.get("CUSTOMER_ITEM_NO"));
//            ttPltzItem.setUnitPrice(new BigDecimal(mapExpErtItem.get("UNIT_PRICE")));
//            ttPltzItem.setHsCd(mapExpErtItem.get("HS_CD"));
//            ttPltzItem.setInputMethTyp(mapExpErtItem.get("INPUT_METH_TYP"));
            ttPltzItem.setComUpdateFuncId(mapExpErtItem.get("COM_UPDATE_FUNC_ID"));
            ttPltzItem.setComUpdateUserId(mapExpErtItem.get("COM_UPDATE_USER_ID"));
            ttPltzItem.setComUpdateTimestamp(new Timestamp(1));
            ttPltzItem.setComCreateFuncId(mapExpErtItem.get("COM_CREATE_FUNC_ID"));
            ttPltzItem.setComCreateUserId(mapExpErtItem.get("COM_CREATE_USER_ID"));
            ttPltzItem.setComCreateTimestamp(new Timestamp(1));

            ttPltzItemService.create(ttPltzItem);
        }
    }

    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param ownerComp 会社コード
     * @param pkgItemNo 品番
     * @throws Exception 例外
     */
    private void deletePkgMaterialsData(String ownerComp, String pkgItemNo)
        throws Exception {

        TmPkgMtrlCriteriaDomain TmPkgMtrlCriteriaDomain = new TmPkgMtrlCriteriaDomain();
        TmPkgMtrlCriteriaDomain.setOwnerComp(ownerComp);
        TmPkgMtrlCriteriaDomain.setPkgItemNo(pkgItemNo);
        
    }
    

    /**
     * <br />データ削除、検証用のデータを投入します。
     *
     * @param fromMainMark メインマーク(from)
     * @param toMainMark メインマーク(to)
     * @throws Exception 例外
     */
    private void deleteErtData(String fromMainMark, String toMainMark)
        throws Exception {

        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        TtPltzItemCriteriaDomain ttPltzItemCriteriaDomain = new TtPltzItemCriteriaDomain();

        ttPltzCriteriaDomain.setMainMarkGreaterThanEqual(fromMainMark);
        ttPltzCriteriaDomain.setMainMarkLessThanEqual(toMainMark);
        
        ttPltzItemCriteriaDomain.setMainMarkGreaterThanEqual(fromMainMark);
        ttPltzItemCriteriaDomain.setMainMarkLessThanEqual(toMainMark);

        List<TtPltzDomain> list = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
        if (list.size() > 0) {
            ttPltzService.deleteByCondition(ttPltzCriteriaDomain);
        }
        
        List<TtPltzItemDomain> list2 = ttPltzItemService.searchByCondition(ttPltzItemCriteriaDomain);
        if (list2.size() > 0) {
            ttPltzItemService.deleteByCondition(ttPltzItemCriteriaDomain);
        }
    }
    

    /**
     * <br />指定された値を含む{@link WC001ErtDomain}を作成します。
     *
     * @param fixture 検索条件
     * @return 作成した{@link WC001ErtDomain}
     * @throws Exception 例外
     */
    private WC001ErtDomain toErt(String[] fixture) throws Exception {
        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        // GSCM部品(SearchCountLimitAdvice)で必要
        wC001ErtDomain.setLocale(new Locale("en"));
        
        wC001ErtDomain.setShipperCd(fixture[2]);
        wC001ErtDomain.setShipToCd(fixture[3]);
        wC001ErtDomain.setTrnsCd(fixture[4]);
        if (!fixture[5].equals("")) {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            Date wlDueDt = df.parse(fixture[5]);
            wC001ErtDomain.setDueDt(wlDueDt);
        }
        wC001ErtDomain.setPackingWhCompCd(fixture[6]);
        wC001ErtDomain.setPackingWhCd(fixture[7]);
        wC001ErtDomain.setPlntCd(fixture[8]);
        wC001ErtDomain.setLoadingCd(fixture[9]);
        wC001ErtDomain.setPriceTerms(fixture[10]);
        wC001ErtDomain.setReturnStyleCd(fixture[11]);
        wC001ErtDomain.setLength(new BigDecimal(fixture[12]));
        wC001ErtDomain.setWidth(new BigDecimal(fixture[13]));
        wC001ErtDomain.setHeight(new BigDecimal(fixture[14]));
        wC001ErtDomain.setVolume(new BigDecimal(fixture[15]));
        wC001ErtDomain.setGrossWeight(new BigDecimal(fixture[16]));

        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();

        WC001ErtItemDomain domain = new WC001ErtItemDomain();
        domain.setKitParItemNo(fixture[17]);
        domain.setModelCd(fixture[18]);
        domain.setQty(new BigDecimal(fixture[19]));
        wC001ErtItemList.add(domain);

        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);
        
        return wC001ErtDomain;
    }
    
    /**
     * <br />画面共通情報ドメインの設定
     *
     * @param permitFuncId permitFuncId
     * @param ownerCompCd ownerCompCd
     * @param procMfgDivCd procMfgDivCd
     * @param autholity autholity
     * @param dscId dscId
     * @param authMgtComp authMgtComp
     */
    private void setScreenCommonContext(
        String permitFuncId, 
        String ownerCompCd, 
        String procMfgDivCd, 
        String autholity, 
        String dscId,
        String authMgtComp 
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
        userAuth.setAuthMgtComp(authMgtComp);
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
    


    
}
