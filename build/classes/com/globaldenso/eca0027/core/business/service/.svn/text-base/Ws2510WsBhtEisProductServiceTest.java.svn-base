package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5021;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5059;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrServiceImpl;
import com.globaldenso.eca0027.core.business.domain.Ws2501OuterSumWeightDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzNxsShipToDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501SumCmlWeightForUnitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.integration.WsBhtEisProductDaoImpl;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストクラス
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9074 $
 */
public class Ws2510WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2510WsBhtEisProductServiceTest() {
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
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();

        wsBhtEisProductService = (WsBhtEisProductService) getContext().getBean("wsBhtEisProductService");

    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetDtlOnXtag(String, String, Map)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetDtlOnXtag1() throws ApplicationException {
        // TRUE
        List<Ws2501OuterSumWeightDomain> outerSumWeightList = new ArrayList<Ws2501OuterSumWeightDomain>();

        Ws2501OuterSumWeightDomain outerSumWeight = new Ws2501OuterSumWeightDomain();
        outerSumWeight.setWeightUnit("kg");
        outerSumWeight.setSumWeight(BigDecimal.valueOf(100));
        outerSumWeightList.add(outerSumWeight);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchOuterSumWeight", outerSumWeightList);

        // --------------------------------------------------------------------
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();

        boolean result = wsBhtEisProductService.validateDatabaseTmPkgSetDtlOnXtag("FOO", "BAR", weightMap);

        assertTrue(result);
        assertFalse(weightMap.isEmpty());
        assertThat(weightMap.get("kg"), is(BigDecimal.valueOf(100)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetDtlOnXtag(String, String, Map)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetDtlOnXtag2() throws ApplicationException {
        // FALSE
        List<Ws2501OuterSumWeightDomain> outerSumWeightList = new ArrayList<Ws2501OuterSumWeightDomain>();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchOuterSumWeight", outerSumWeightList);

        // --------------------------------------------------------------------
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();

        boolean result = wsBhtEisProductService.validateDatabaseTmPkgSetDtlOnXtag("FOO", "BAR", weightMap);

        assertFalse(result);
        assertTrue(weightMap.isEmpty());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetHdrOnXtag(String, String, Map)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetHdrOnXtag1() throws ApplicationException {
        // TRUE
        TmPkgSetHdrDomain tmPkgSetHdr = new TmPkgSetHdrDomain();
        tmPkgSetHdr.setVolumeUnit("kg");
        tmPkgSetHdr.setVolume(BigDecimal.valueOf(100));

        MockObjectManager.setReturnValueAtAllTimes(TmPkgSetHdrServiceImpl.class, "searchByKey", tmPkgSetHdr);

        // --------------------------------------------------------------------
        Map<String, BigDecimal> volumeMap = new HashMap<String, BigDecimal>();

        boolean result = wsBhtEisProductService.validateDatabaseTmPkgSetHdrOnXtag("FOO", "BAR", volumeMap);

        assertTrue(result);
        assertFalse(volumeMap.isEmpty());
        assertThat(volumeMap.get("kg"), is(BigDecimal.valueOf(100)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetHdrOnXtag(String, String, Map)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetHdrOnXtag2() throws ApplicationException {
        // FALSE
        MockObjectManager.setReturnNullAtAllTimes(TmPkgSetHdrServiceImpl.class, "searchByKey");

        // --------------------------------------------------------------------
        Map<String, BigDecimal> volumeMap = new HashMap<String, BigDecimal>();

        boolean result = wsBhtEisProductService.validateDatabaseTmPkgSetHdrOnXtag("FOO", "BAR", volumeMap);

        assertFalse(result);
        assertTrue(volumeMap.isEmpty());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag1() throws ApplicationException {

        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("FOO");
        pltzNxsShipTo.setCurWhCompCd("BAR");
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd(LOADING_CD_DOOR);
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setDngrItemFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_DOOR);
        criteria.setCustomTimingTyp("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertTrue(result.isEmpty());
        assertThat(criteria.getCurWhCd(), is("FOO"));
        assertThat(criteria.getCurWhCompCd(), is("BAR"));
        assertThat(criteria.getDngrItemFlg(), is(FLAG_Y));
        assertThat(criteria.getLoadingCd(), is(LOADING_CD_DOOR));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag2() throws ApplicationException {
        // EMPTY
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(new ArrayList<String>());

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertTrue(result.isEmpty());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag3() throws ApplicationException {
        // NXS_E1_5001
        MockObjectManager.setReturnNullAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo");

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5001));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag4() throws ApplicationException {
        // NXS_E1_5019
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCompCd("FOO");
        pltzNxsShipTo.setContainerSortingKey("a");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCompCd("BAR");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5019));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag5() throws ApplicationException {
        // 5_2_1
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("FOO");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("BAR");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag6() throws ApplicationException {
        // 5_2_2
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("FOO");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("BAR");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");
        criteria.setShipToCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag7() throws ApplicationException {
        // 5_2_3
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("FOO");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("BAR");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag8() throws ApplicationException {
        // 5_2_4_FREE
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd(LOADING_CD_DOOR);
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setDngrItemFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_FREE);
        criteria.setCustomTimingTyp("");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag9() throws ApplicationException {
        // 5_2_4_DOOR
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd(LOADING_CD_DOOR);
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setDngrItemFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_BACK);
        criteria.setCustomTimingTyp("");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag10() throws ApplicationException {
        // 5_2_4_BACK
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd(LOADING_CD_BACK);
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setDngrItemFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_DOOR);
        criteria.setCustomTimingTyp("");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag11() throws ApplicationException {
        // 5_2_5
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("FOO");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd("");
        criteria.setCustomTimingTyp("BAR");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag12() throws ApplicationException {
        // 5_2_6
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_ERT);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd("");
        criteria.setCustomTimingTyp("");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag13() throws ApplicationException {
        // 5_2_7
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCurWhCd("");
        pltzNxsShipTo.setCurWhCompCd("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_Y);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd("");
        criteria.setCustomTimingTyp("");
        criteria.setCurWhCd("");
        criteria.setCurWhCompCd("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5021));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag14() throws ApplicationException {
        // NXS_E1_5020
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("BAR");
        pltzNxsShipTo.setCurWhCompCd("FOO");
        pltzNxsShipTo.setContainerSortingKey("a");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCd("BOO");
        criteria.setCurWhCompCd("FOO");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5020));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag15() throws ApplicationException {
        // NXS_E1_5006
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("BAR");
        pltzNxsShipTo.setCurWhCompCd("FOO");
        pltzNxsShipTo.setContainerSortingKey("a");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus("20");
        pltzNxsShipTo.setMigrationFlg(FLAG_N);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCd("BAR");
        criteria.setCurWhCompCd("FOO");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5006));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag16() throws ApplicationException {
        // NXS_E1_5039
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("BAR");
        pltzNxsShipTo.setCurWhCompCd("FOO");
        pltzNxsShipTo.setContainerSortingKey("a");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setXmainMark("X");

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCd("BAR");
        criteria.setCurWhCompCd("FOO");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5039));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag17() throws ApplicationException {
        // NXS_E1_5059
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("BAR");
        pltzNxsShipTo.setCurWhCompCd("FOO");
        pltzNxsShipTo.setContainerSortingKey("a");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd("");
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCd("BAR");
        criteria.setCurWhCompCd("FOO");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertFalse(result.isEmpty());
        assertThat(result.get("HOGE"), is(NXS_E1_5059));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag18() throws ApplicationException {
        // LDCD_FREE
        Ws2501PltzNxsShipToDomain pltzNxsShipTo = new Ws2501PltzNxsShipToDomain();
        pltzNxsShipTo.setCurWhCd("FOO");
        pltzNxsShipTo.setCurWhCompCd("BAR");
        pltzNxsShipTo.setContainerSortingKey("");
        pltzNxsShipTo.setTrnsCd("");
        pltzNxsShipTo.setCompCd("");
        pltzNxsShipTo.setLanguageCd("");
        pltzNxsShipTo.setLoadingCd(LOADING_CD_FREE);
        pltzNxsShipTo.setCustomTimingTyp("");
        pltzNxsShipTo.setCmlTyp(CML_TYPE_CIGMA);
        pltzNxsShipTo.setStgInstrNo(FLAG_N);
        pltzNxsShipTo.setPltzStatus(PLTZ_STATUS_PLTZ);
        pltzNxsShipTo.setMigrationFlg(FLAG_N);
        pltzNxsShipTo.setDngrItemFlg(FLAG_Y);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", pltzNxsShipTo);

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_FREE);
        criteria.setCustomTimingTyp("");

        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
        assertTrue(result.isEmpty());
        assertThat(criteria.getCurWhCd(), is("FOO"));
        assertThat(criteria.getCurWhCompCd(), is("BAR"));
        assertThat(criteria.getDngrItemFlg(), is(FLAG_Y));
        assertThat(criteria.getLoadingCd(), is(LOADING_CD_FREE));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnXtag19() throws ApplicationException {
        // NXS_E1_5004
        MockObjectManager.setReturnValueAtAllTimes(
            WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitPltzNxsShipTo", new WsBhtEisProductCriteriaDomain());

        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("HOGE");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setCurWhCompCd("BAR");
        criteria.setContainerSortingKey("a");
        criteria.setTrnsCd("b");
        criteria.setShipToCompCd("c");

        boolean blRet = false;
        try {
            String[] returnCurWhCompCd = new String[1];
            String[] returnCurWhCd = new String[1];
            Map<String, String> result = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(criteria, returnCurWhCompCd, returnCurWhCd);
            assertThat(result, null);
        } catch (ApplicationException e) {
            if (e.getCode().equals("NXS-E1-5004")) {
                blRet = true;
            }
        }
        assertTrue(blRet);

    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnXtag() throws ApplicationException {

        List<Ws2501SumCmlWeightForUnitDomain> Ws2501SumCmlWeightForUnitDomainList = new ArrayList<Ws2501SumCmlWeightForUnitDomain>();
        Ws2501SumCmlWeightForUnitDomain ws2501SumCmlWeightForUnitDomain = new Ws2501SumCmlWeightForUnitDomain(); 
        ws2501SumCmlWeightForUnitDomain.setSumGrossWeight(new BigDecimal(2));
        ws2501SumCmlWeightForUnitDomain.setSumNetWeight(new BigDecimal(3));
        ws2501SumCmlWeightForUnitDomain.setWeightUnit("KG");
        Ws2501SumCmlWeightForUnitDomainList.add(ws2501SumCmlWeightForUnitDomain);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchSumCmlWeightForUnit", Ws2501SumCmlWeightForUnitDomainList);


        // --------------------------------------------------------------------
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DTA4000140101000033");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMainMarkList(mainMarkList);
        criteria.setContainerSortingKey("");
        criteria.setTrnsCd("");
        criteria.setShipToCompCd("");
        criteria.setLoadingCd(LOADING_CD_DOOR);
        criteria.setCustomTimingTyp("");
        criteria.setLoginUserDscId("fukui07");
        
        Map<String, BigDecimal> grossWeightMap = new HashMap<String, BigDecimal>();
        grossWeightMap.put("KG", new BigDecimal(3));
        criteria.setGrossWeightMap(grossWeightMap);
        criteria.setVolume(new BigDecimal(15));
        criteria.setVolumeUnit("LT");
        criteria.setCurWhCompCd("BAR");
        criteria.setCurWhCd("FOO");
        criteria.setCompCd("MY7");
        criteria.setPalletNo("0001");
        criteria.setTrnsCd("S");
        criteria.setLoadingCd("F");
        criteria.setContainerSortingKey("ZA001001");
        criteria.setShipToCompCd("MY7");
        criteria.setCurWhCd("FOO");
        criteria.setCurWhCompCd("BAR");
        criteria.setOuterPkgComCd("MY7");
        criteria.setOuterPkgCd("1");
        criteria.setDngrItemFlg("M");
        criteria.setCustomTimingTyp("A");
        wsBhtEisProductService.transactOnXtag(criteria);
        
    }

    
    
    

}
