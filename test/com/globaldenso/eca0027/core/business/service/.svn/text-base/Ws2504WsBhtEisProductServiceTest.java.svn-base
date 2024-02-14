package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0128;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmSeqService;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestServiceImpl;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストクラス
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class Ws2504WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * TmSeqServiceサービス
     */
    private TmSeqService tmSeqService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2504WsBhtEisProductServiceTest() {
    }

    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * Setter method for tmSeqService.
     *
     * @param tmSeqService Set for tmSeqService
     */
    public void setTmSeqService(TmSeqService tmSeqService) {
        this.tmSeqService = tmSeqService;
    }

    /**
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();

        wsBhtEisProductService = (WsBhtEisProductService) getContext().getBean("wsBhtEisProductService");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseLoadPositionCd(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseLoadPositionCd() throws ApplicationException {

        boolean result = false;

        // Back
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", LOADING_CD_BACK);
        assertThat(result, is(true));
        // Door
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", LOADING_CD_DOOR);
        assertThat(result, is(true));
        // Free
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", LOADING_CD_FREE);
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabaseLoadPositionCd(
            "en", "S");
        assertThat(result, is(false));

    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTransWayCd(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTransWayCd() throws ApplicationException {

        boolean result = false;

        // Air
        result = wsBhtEisProductService.validateDatabaseTransWayCd(
            "en", TRNS_CD_AIR);
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabaseTransWayCd(
            "en", "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabaseTransWayCd(
            "en", null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabaseTransWayCd(
            "en", "Z");
        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabasePayFare(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabasePayFare() throws ApplicationException {
        boolean result = false;

        // Collect
        result = wsBhtEisProductService.validateDatabasePayFare(
            "en", "C");
        assertThat(result, is(true));
        // Prepaid
        result = wsBhtEisProductService.validateDatabasePayFare(
            "en", "P");
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabasePayFare(
            "en", "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabasePayFare(
            "en", null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabasePayFare(
            "en", "Z");
        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseQuotesCd(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseQuotesCd() throws ApplicationException {

        boolean result = false;

        // Free On Board
        result = wsBhtEisProductService.validateDatabaseQuotesCd(
            "en", "FOB");
        assertThat(result, is(true));
        // Free Alongside Ship
        result = wsBhtEisProductService.validateDatabaseQuotesCd(
            "en", "FAS");
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabaseQuotesCd(
            "en", "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabaseQuotesCd(
            "en", null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabaseQuotesCd(
            "en", "ZZZ");
        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmExpShipToShippingOnErtPltz(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmExpShipToShippingOnErtPltz() throws ApplicationException {

        boolean result = false;

        // OK Case
        result = wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(
            "MY7", "MY7");
        assertThat(result, is(true));

        // ブランク
        try {
            result = wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(
                "", "MY7");
            result = true;
        } catch (Exception e) {
            result = false;
        }
        assertThat(result, is(false));

        // NULL
        try {
            result = wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(
                null, "MY7");
            result = true;
        } catch (Exception e) {
            result = false;
        }
        assertThat(result, is(false));

        // でたらめ
        result = wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(
            "MY7", "ZZ999");
        assertThat(result, is(false));
        try {
            result = wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(
                "ZZZ", "MY7");
            result = true;
        } catch (Exception e) {
            result = false;
        }
        assertThat(result, is(false));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmNxsShipToOnErtPltz(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsShipToOnErtPltz() throws ApplicationException {
        boolean result = false;

        // OK Case
        result = wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(
            "MY7");
        assertThat(result, is(true));
        // OK Case
        result = wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(
            "MY300");
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(
            "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(
            null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(
            "ZZ999");
        assertThat(result, is(false));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmNxsCompOnErtPltz(String, String, String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void validateDatabaseTmNxsCompOnErtPltz() throws ApplicationException {
        int result = 0;

        // 0 ------------------------------------------------
        result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
            "MY7", "KG", "MR", "LT");
        assertThat(result, is(0));

        // 必須チェックはこれより前の処理で終わっている
        result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
            "MY7", "", "", "");
        assertThat(result, is(0));

        // 1 ------------------------------------------------
        result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
            "MY7", "XA", "XB", "XC");
        assertThat(result, is(1));

        // 2 -------------------------------------------------
        result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
            "MY7", "KG", "XB", "XC");
        assertThat(result, is(2));

        // 3 -------------------------------------------------
        result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
            "MY7", "KG", "MR", "XC");
        assertThat(result, is(3));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmNxsWhOnErtPltz(String, String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsWhOnErtPltz() throws ApplicationException {
        boolean result = false;

        // OK Case
        result = wsBhtEisProductService.validateDatabaseTmNxsWhOnErtPltz(
            "MY7", "WH01");
        assertThat(result, is(true));

        // ブランク
        result = wsBhtEisProductService.validateDatabaseTmNxsWhOnErtPltz(
            "MY7", "");
        assertThat(result, is(false));
        // NULL
        result = wsBhtEisProductService.validateDatabaseTmNxsWhOnErtPltz(
            "MY7", null);
        assertThat(result, is(false));
        // でたらめ
        result = wsBhtEisProductService.validateDatabaseTmNxsWhOnErtPltz(
            "MY7", "WH99");
        assertThat(result, is(false));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseShipperWhPlant(String, String, String, String, List<Ws2504PkgItemNoCriteriaDomain>, List<String>)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant1() throws ApplicationException {
        boolean result = false;


        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-001");
        pkgItemNoList.add("PKGITEMENO-002");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        modelCdList.add("1");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");
        pkgQtyList.add("3");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 2; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }

        List<String> resultList = new ArrayList<String>();
        result = wsBhtEisProductService.validateDatabaseShipperWhPlant(
                "MY7",
                "MY7",
                "WH01",
                wC001ErtItemList,
                resultList);
        assertThat(result, is(true));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseShipperWhPlant(String, String, String, String, List<Ws2504PkgItemNoCriteriaDomain>, List<String>)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant2() throws ApplicationException {
        boolean result = false;

        // 異常系 1
        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-099");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 1; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }

        List<String> resultList = new ArrayList<String>();
        result = wsBhtEisProductService.validateDatabaseShipperWhPlant(
                "MY7",
                "MY7",
                "WH01",
                wC001ErtItemList,
                resultList);
        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseShipperWhPlant(String, String, String, String, List<Ws2504PkgItemNoCriteriaDomain>, List<String>)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant3() throws ApplicationException {
        boolean result = false;

        // 異常系 2
        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-001");
        pkgItemNoList.add("PKGITEMENO-007");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        modelCdList.add("1");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");
        pkgQtyList.add("3");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 2; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }

        List<String> resultList = new ArrayList<String>();
        result = wsBhtEisProductService.validateDatabaseShipperWhPlant(
                "MY7",
                "MY7",
                "WH01",
                wC001ErtItemList,
                resultList);

        if (resultList.size() == 0) {
            fail("エラー結果不正 0件");
        } else if (!resultList.contains("2")) {
            fail("エラー結果不正 エラー違い");
        }

        assertThat(result, is(false));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseShipperWhPlant(String, String, String, String, List<Ws2504PkgItemNoCriteriaDomain>, List<String>)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseShipperWhPlant4() throws ApplicationException {
        boolean result = false;

        // 異常系 3
        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-001");
        pkgItemNoList.add("PKGITEMENO-002");
        pkgItemNoList.add("PKGITEMENO-003");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        modelCdList.add("1");
        modelCdList.add("1");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");
        pkgQtyList.add("3");
        pkgQtyList.add("4");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 3; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }

        List<String> resultList = new ArrayList<String>();
        result = wsBhtEisProductService.validateDatabaseShipperWhPlant(
                "MY7",
                "MY7",
                "WH01",
                wC001ErtItemList,
                resultList);
        if (resultList.size() == 0) {
            fail("エラー結果不正 0件");
        } else if (!resultList.contains("3")) {
            fail("エラー結果不正 エラー違い");
        }

        assertThat(result, is(false));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnErtPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnErtPltz1() throws Exception {
        // NonAir
        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setShipToCd("MY7");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setFreightResponsibleCd("");
        ////wC001ErtDomain.setDueDt(wlDueDt);
        criteriaDomain.setWhCompCd("MY7");
        criteriaDomain.setLgcyWhCd("WH02");
        criteriaDomain.setPlntCd("M1");
        criteriaDomain.setContainerSortingKey("");
        criteriaDomain.setLoadingCd("D");
        criteriaDomain.setPriceTerms("FOB");
        criteriaDomain.setReturnStyleCd("ReturnStyleCd");
        criteriaDomain.setCmlQty("50");
        criteriaDomain.setLength(new BigDecimal(1));
        criteriaDomain.setWidth(new BigDecimal(2));
        criteriaDomain.setHeight(new BigDecimal(3));
        criteriaDomain.setVolume(new BigDecimal(6));
        criteriaDomain.setNetWeight(new BigDecimal(0));
        criteriaDomain.setGrossWeight("100");
        criteriaDomain.setLengthUnit("MR");
        criteriaDomain.setVolumeUnit("LT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setShipperCd("MY7");

        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-001");
        pkgItemNoList.add("PKGITEMENO-002");
        pkgItemNoList.add("");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        modelCdList.add("1");
        modelCdList.add("");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");
        pkgQtyList.add("3");
        pkgQtyList.add("");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 3; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }
        criteriaDomain.setPkgItemNoCriteriaList(wC001ErtItemList);

        WsBhtEisProductDomain resultDomain =
            wsBhtEisProductService.transactOnErtPltz(criteriaDomain);

        if (resultDomain.getRegistCmlList() == null) {
            fail("データ返却値異常 null");
        }
        if (resultDomain.getRegistCmlList().size() == 0) {
            fail("データ返却値異常 0件");
        }
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnErtPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnErtPltz2() throws Exception {

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        // Airのケース
        criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setShipToCd("MY7");
        criteriaDomain.setTrnsCd("A");
        criteriaDomain.setFreightResponsibleCd("");
        ////wC001ErtDomain.setDueDt(wlDueDt);
        criteriaDomain.setWhCompCd("MY7");
        criteriaDomain.setLgcyWhCd("WH03");
        criteriaDomain.setPlntCd("M1");
        criteriaDomain.setContainerSortingKey("");
        criteriaDomain.setLoadingCd("D");
        criteriaDomain.setPriceTerms("FOB");
        criteriaDomain.setReturnStyleCd("ReturnStyleCd");
        criteriaDomain.setCmlQty("50");
        criteriaDomain.setLength(new BigDecimal(1));
        criteriaDomain.setWidth(new BigDecimal(2));
        criteriaDomain.setHeight(new BigDecimal(3));
        criteriaDomain.setVolume(new BigDecimal(6));
        criteriaDomain.setNetWeight(new BigDecimal(0));
        criteriaDomain.setGrossWeight("100");
        criteriaDomain.setLengthUnit("MR");
        criteriaDomain.setVolumeUnit("LT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setShipperCd("MY7");

        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("PKGITEMENO-001");
        pkgItemNoList.add("PKGITEMENO-002");
        List<String> modelCdList = new ArrayList<String>();
        modelCdList.add("1");
        modelCdList.add("1");
        List<String> pkgQtyList = new ArrayList<String>();
        pkgQtyList.add("2");
        pkgQtyList.add("3");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < 2; i++) {
            Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
            domain.setPkgItemNo(pkgItemNoList.get(i));
            domain.setModelCd(modelCdList.get(i));
            domain.setPkgQty(pkgQtyList.get(i));
            wC001ErtItemList.add(domain);
        }
        criteriaDomain.setPkgItemNoCriteriaList(wC001ErtItemList);

        WsBhtEisProductDomain resultDomain = wsBhtEisProductService.transactOnErtPltz(criteriaDomain);

        if (resultDomain.getRegistCmlList() == null) {
            fail("データ返却値異常 null");
        }
        if (resultDomain.getRegistCmlList().size() == 0) {
            fail("データ返却値異常 0件");
        }
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnErtPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnErtPltz3() throws ApplicationException {
        // NXS_E1_5048
        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setShipToCd("MY7");
        criteriaDomain.setTrnsCd("A");
        criteriaDomain.setFreightResponsibleCd("");
        ////wC001ErtDomain.setDueDt(wlDueDt);
        criteriaDomain.setWhCompCd("MY7");
        criteriaDomain.setLgcyWhCd("WH04");
        criteriaDomain.setPlntCd("M1");
        criteriaDomain.setContainerSortingKey("");
        criteriaDomain.setLoadingCd("D");
        criteriaDomain.setPriceTerms("FOB");
        criteriaDomain.setReturnStyleCd("ReturnStyleCd");
        criteriaDomain.setCmlQty("50");
        criteriaDomain.setLength(new BigDecimal(1));
        criteriaDomain.setWidth(new BigDecimal(2));
        criteriaDomain.setHeight(new BigDecimal(3));
        criteriaDomain.setVolume(new BigDecimal(6));
        criteriaDomain.setNetWeight(new BigDecimal(0));
        criteriaDomain.setGrossWeight("36");
        criteriaDomain.setLengthUnit("MR");
        criteriaDomain.setVolumeUnit("LT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setShipperCd("MY7");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
        domain.setPkgItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setPkgQty("7");
        wC001ErtItemList.add(domain);
        domain.setPkgItemNo("PKGITEMENO-002");
        domain.setModelCd("1");
        domain.setPkgQty("30");
        wC001ErtItemList.add(domain);
        criteriaDomain.setPkgItemNoCriteriaList(wC001ErtItemList);

        WsBhtEisProductDomain resultDomain =
            wsBhtEisProductService.transactOnErtPltz(criteriaDomain);

        if (resultDomain.getMainMark() != null) {
            TmSeqCriteriaDomain tmSeqC = new TmSeqCriteriaDomain();
            tmSeqC.setSeqKey(resultDomain.getMainMark().substring(0, 13));
            tmSeqC.setSeqTyp("03");
            tmSeqService.delete(tmSeqC);
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnErtPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnErtPltz4() throws ApplicationException {
        // NXS_E7_0128
        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setShipToCd("MYX");
        criteriaDomain.setTrnsCd("A");
        criteriaDomain.setFreightResponsibleCd("");
        ////wC001ErtDomain.setDueDt(wlDueDt);
        criteriaDomain.setWhCompCd("MY7");
        criteriaDomain.setLgcyWhCd("WH01");
        criteriaDomain.setPlntCd("M1");
        criteriaDomain.setContainerSortingKey("");
        criteriaDomain.setLoadingCd("D");
        criteriaDomain.setPriceTerms("FOB");
        criteriaDomain.setReturnStyleCd("ReturnStyleCd");
        criteriaDomain.setCmlQty("50");
        criteriaDomain.setLength(new BigDecimal(1));
        criteriaDomain.setWidth(new BigDecimal(2));
        criteriaDomain.setHeight(new BigDecimal(3));
        criteriaDomain.setVolume(new BigDecimal(6));
        criteriaDomain.setNetWeight(new BigDecimal(0));
        criteriaDomain.setGrossWeight("100");
        criteriaDomain.setLengthUnit("MR");
        criteriaDomain.setVolumeUnit("LT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setShipperCd("MY7");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
        domain.setPkgItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setPkgQty("2");
        wC001ErtItemList.add(domain);
        criteriaDomain.setPkgItemNoCriteriaList(wC001ErtItemList);

        WsBhtEisProductDomain resultDomain =
            wsBhtEisProductService.transactOnErtPltz(criteriaDomain);

        boolean result = false;
        Map<String, Object[]> map = resultDomain.getErrMap();
        if (map != null && map.size() > 0
            && map.get(NXS_E7_0128) != null) {
            result = true;
        }
        assertThat(result, is(true));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnErtPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnErtPltz5() throws ApplicationException {
        // NXS_E1_5017
        Ws9002ResultDomain ws9002Result = new Ws9002ResultDomain();
        ws9002Result.setResultCode(WS_RESULT_ERROR);
        MockObjectManager.setReturnValueAtAllTimes(Ws9002RestServiceImpl.class, "getPlantInfo", ws9002Result);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setShipToCd("MY7");
        criteriaDomain.setTrnsCd("A");
        criteriaDomain.setFreightResponsibleCd("");
        ////wC001ErtDomain.setDueDt(wlDueDt);
        criteriaDomain.setWhCompCd("MY7");
        criteriaDomain.setLgcyWhCd("WH05");
        criteriaDomain.setPlntCd("xx");
        criteriaDomain.setContainerSortingKey("");
        criteriaDomain.setLoadingCd("D");
        criteriaDomain.setPriceTerms("FOB");
        criteriaDomain.setReturnStyleCd("ReturnStyleCd");
        criteriaDomain.setCmlQty("50");
        criteriaDomain.setLength(new BigDecimal(1));
        criteriaDomain.setWidth(new BigDecimal(2));
        criteriaDomain.setHeight(new BigDecimal(3));
        criteriaDomain.setVolume(new BigDecimal(6));
        criteriaDomain.setNetWeight(new BigDecimal(0));
        criteriaDomain.setGrossWeight("100");
        criteriaDomain.setLengthUnit("MR");
        criteriaDomain.setVolumeUnit("LT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setShipperCd("MY7");

        List<Ws2504PkgItemNoCriteriaDomain> wC001ErtItemList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        Ws2504PkgItemNoCriteriaDomain domain = new Ws2504PkgItemNoCriteriaDomain();
        domain.setPkgItemNo("PKGITEMENO-001");
        domain.setModelCd("1");
        domain.setPkgQty("2");
        wC001ErtItemList.add(domain);
        criteriaDomain.setPkgItemNoCriteriaList(wC001ErtItemList);

        WsBhtEisProductDomain resultDomain =
            wsBhtEisProductService.transactOnErtPltz(criteriaDomain);

        boolean result = false;
        Map<String, Object[]> map = resultDomain.getErrMap();
        if (map != null && map.size() > 0
            && map.get(NXS_E1_5017) != null) {
            result = true;
        }
        assertThat(result, is(true));
    }
}
