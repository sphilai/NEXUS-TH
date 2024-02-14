package com.globaldenso.eca0027.core.integration;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static java.math.BigDecimal.ONE;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonInstDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemNoNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagRtGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSetMaterialsNxsCompNmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecMaterialsNameRevDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzInstrInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501SumCmlWeightForUnitDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmNxsWhByXrefDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtMixTagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemNoNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagRtGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501NxsPkgSpecificationCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501OuterSumWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgMaterialsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecMaterialsNameRevCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzInstrInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501SumCmlWeightForUnitCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmNxsWhByXrefCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemByKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemDeliveryTimeCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501UnpackagedItemNoCriteriaDomain;

/**
 * {@link WsBhtEisProductDao} のためのテストクラス
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsBhtEisProductDaoTest extends AbstractEca0027Test {

    /**
     * WsBhtEisProductDao インスタンス
     */
    private WsBhtEisProductDao wsBhtEisProductDao;

    /**
     * デフォルトコンストラクタ
     */
    public WsBhtEisProductDaoTest() {
    }

    /**
     * セットアップ
     */
    @Before
    public void setUp() {
        wsBhtEisProductDao = (WsBhtEisProductDao)getContext().getBean(
            "wsBhtEisProductDao");
    }

    /**
     * <br />lockByKeyNoWaitTtExpRcvOdrテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testLockByKeyNoWaitTtExpRcvOdr() throws Exception {
        Ws2501TtExpRcvOdrCriteriaDomain criteria = new Ws2501TtExpRcvOdrCriteriaDomain();
        List<? extends Ws2501TtExpRcvOdrDomain> result = null;
        // 検索条件
        criteria.setRcvOdrCompCd("BHT");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");

        List<Map<String, String>> itemNoPkgCdList = new ArrayList<Map<String, String>>();

        Map<String, String> keyMap = new HashMap<String, String>();
        keyMap.put("itemNo", "A002TB0091B3N");
        keyMap.put("pkgCd", "110");
        itemNoPkgCdList.add(keyMap);

        keyMap = new HashMap<String, String>();
        keyMap.put("itemNo", "A002TB0091B3N");
        keyMap.put("pkgCd", "111");
        itemNoPkgCdList.add(keyMap);

        keyMap = new HashMap<String, String>();
        keyMap.put("itemNo", "A002TB0091B3NX");
        keyMap.put("pkgCd", "112");
        itemNoPkgCdList.add(keyMap);

        criteria.setItemNoPkgCdList(itemNoPkgCdList);

        result = wsBhtEisProductDao.lockByKeyNoWaitTtExpRcvOdr(criteria);
        assertThat(result.size(), is(3));
    }

    /**
     * <br />lockByKeyNoWaitTtMixTagテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testLockByKeynNoWaitTtMixTag() throws Exception {
        Ws2501TtMixTagCriteriaDomain criteria = new Ws2501TtMixTagCriteriaDomain();
        List<? extends Ws2501TtMixTagDomain> result = null;
        criteria.setPltzInstrNo("DBHT000001");
        result = wsBhtEisProductDao.lockByConditionNoWaitTtMixTag(criteria);
        assertThat(result.size(), is(1));
    }

    /**
     * <br />lockByKeyNoWaitTtPltzInstrItemNoテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testLockByKeyNoWaitTtPltzInstrItemNo() throws Exception {
        List<? extends TtPltzInstrItemNoDomain> result = null;
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo("DBHT000001");
        result = wsBhtEisProductDao
            .lockByKeyNoWaitTtPltzInstrItemNo(ttPltzInstrItemNoCriteria);
        assertThat(result.size(), is(1));
    }

    /**
     * <br />lockByKeyNoWaitTtPltzInstrOdrテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testLockByKeyNoWaitTtPltzInstrOdr() throws Exception {

        List<? extends TtPltzInstrOdrDomain> result = null;
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo("DBHT000001");
        result = wsBhtEisProductDao
            .lockByKeyNoWaitTtPltzInstrOdr(ttPltzInstrOdrCriteria);
        assertThat(result.size(), is(1));
    }

    /**
     * <br />searchItemNoNxsNonInstテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchItemNoNxsNonInst() throws Exception {

        Ws2501ItemNoNxsNonInstCriteriaDomain criteria = new Ws2501ItemNoNxsNonInstCriteriaDomain();

        criteria.setRcvOdrCompCd("BHT");
        criteria.setItemNo("A002TB0091B01N");
        criteria.setPkgCd("110");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setTrnsCd("S");
        criteria.setAplyStrtDt(new Date("2014/06/16 00:00:00"));
        criteria.setLgcyWhCd("1");

        Ws2501ItemNoNxsNonInstDomain result = wsBhtEisProductDao
            .searchItemNoNxsNonInst(criteria);
        assertThat(result.getItemDescription(), is("METER ASSY,INTAKE AIRFLOW"));

    }

    /**
     * <br />searchItemNoNxsテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchItemNoNxs() throws Exception {

        Ws2501ItemNoNxsCriteriaDomain criteria = new Ws2501ItemNoNxsCriteriaDomain();

        criteria.setPltzInstrNo("MYB0613002");
        criteria.setItemNo("A002TB0091B03N");
        criteria.setPkgCd("110");
        criteria.setAplyStrtDt(new Date("2014/06/16 00:00:00"));

        Ws2501ItemNoNxsDomain itemNoNxs = wsBhtEisProductDao
            .searchItemNoNxs(criteria);

        assertThat(itemNoNxs.getItemNo(), is("A002TB0091B03N"));
        assertThat(itemNoNxs.getPackedQty(), is(new BigDecimal("150")));
        assertThat(itemNoNxs.getOriginCntryCd(), is("JP"));
        assertThat(itemNoNxs.getSumQty(), is(new BigDecimal("30")));

    }

    /**
     * <br />searchMixedTagItemテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchMixedTagItem() throws Exception {

        Ws2501MixedTagItemCriteriaDomain criteria = new Ws2501MixedTagItemCriteriaDomain();
        criteria.setMixTagNo("MMYBWH01406130001");
        List<? extends Ws2501MixedTagItemDomain> mixedTagItemList = wsBhtEisProductDao.searchMixedTagItem(criteria);
        assertThat(mixedTagItemList.size(), is(2));

    }

    /**
     * <br />searchMixedTagItemNoNwテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchMixedTagItemNoNw() throws Exception {

        Ws2501MixedTagItemNoNwCriteriaDomain mixedTagItemNoNwCriteriaDomain = new Ws2501MixedTagItemNoNwCriteriaDomain();
        mixedTagItemNoNwCriteriaDomain.setMixTagNo("MMYBWH01406130001");
        List<? extends Ws2501MixedTagItemNoNwDomain> mixTagItemNoNwList = wsBhtEisProductDao.searchMixedTagItemNoNw(mixedTagItemNoNwCriteriaDomain);
        assertThat(mixTagItemNoNwList.size(), is(1));
        assertThat(mixTagItemNoNwList.get(0).getSumItemWeight(), is("3000"));

    }

    /**
     * <br />searchMixedTagRtGwテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchMixedTagRtGw() throws Exception {

        Ws2501MixedTagRtGwCriteriaDomain mixedTagRtGwCriteriaDomain = new Ws2501MixedTagRtGwCriteriaDomain();
        mixedTagRtGwCriteriaDomain.setMixTagNo("MMYBWH01406130001");
        List<? extends Ws2501MixedTagRtGwDomain> mixTagRtGwList = wsBhtEisProductDao.searchMixedTagRtGw(mixedTagRtGwCriteriaDomain);
        assertThat(mixTagRtGwList.size(), is(1));
        assertThat(mixTagRtGwList.get(0).getSumPkgWeight(), is("534"));
    }

    /**
     * <br />searchPkgMaterialsテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchPkgMaterials1() throws Exception {
        // 日本語名あり
        Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
        pkgMaterialsCriteria.setOwnerComp("BHT");
        pkgMaterialsCriteria.setPkgItemNo("PKGITEMENO-000");
        Ws2501PkgMaterialsDomain pkgMaterial = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);
        assertThat(pkgMaterial.getPkgNm(), is("包装材 日本語０"));
    }

    /**
     * <br />searchPkgMaterialsテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchPkgMaterials2() throws Exception {
        // 日本語名なし
        Ws2501PkgMaterialsCriteriaDomain pkgMaterialsCriteria = new Ws2501PkgMaterialsCriteriaDomain();
        pkgMaterialsCriteria.setOwnerComp("BHT");
        pkgMaterialsCriteria.setPkgItemNo("PKGITEMENO-001");
        Ws2501PkgMaterialsDomain pkgMaterial = wsBhtEisProductDao.searchPkgMaterials(pkgMaterialsCriteria);
        assertThat(pkgMaterial.getPkgNm(), is("packageMaterial English"));
    }


    /**
     * <br />searchPkgSetMaterialsNxsCompNmテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchPkgSetMaterialsNxsCompNm() throws Exception {

        Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain pkgSetMaterialsNxsCompNmCriteria = new Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain();
        pkgSetMaterialsNxsCompNmCriteria.setOwnerComp("BHT");
        pkgSetMaterialsNxsCompNmCriteria.setOuterCd("9999");

        List<? extends Ws2501PkgSetMaterialsNxsCompNmDomain> pkgSetMaterialsNxsCompNmList
            = wsBhtEisProductDao.searchPkgSetMaterialsNxsCompNm(pkgSetMaterialsNxsCompNmCriteria);

        assertThat(pkgSetMaterialsNxsCompNmList.size(), is(5));

    }

    /**
     * <br />searchPkgSpecテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchPkgSpec() throws Exception {

        Ws2501PkgSpecCriteriaDomain pkgSpecCriteria =  new Ws2501PkgSpecCriteriaDomain();
        pkgSpecCriteria.setCompCd("MYB");
        pkgSpecCriteria.setTrnsCd("S");
        pkgSpecCriteria.setItemNo("A002TB0091B03N");
        pkgSpecCriteria.setPkgCd("110");

        List<? extends Ws2501PkgSpecDomain> pkgSpecList = wsBhtEisProductDao.searchPkgSpec(pkgSpecCriteria);

        assertThat(pkgSpecList.size(), is(1));
    }

    /**
     * <br />searchPkgSpecMaterialsNameRevテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchPkgSpecMaterialsNameRev() throws Exception {
        Ws2501PkgSpecMaterialsNameRevCriteriaDomain pkgSpecMaterialsNameRevCriteria = new Ws2501PkgSpecMaterialsNameRevCriteriaDomain();
        pkgSpecMaterialsNameRevCriteria.setOwnerCompCd("MYB");
        pkgSpecMaterialsNameRevCriteria.setTrnsCd("S");
        pkgSpecMaterialsNameRevCriteria.setItemNo("A002TB0091B03N");
        pkgSpecMaterialsNameRevCriteria.setPkgCd("110");
        pkgSpecMaterialsNameRevCriteria.setOuterPkgCd("7777");

        List<? extends Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevList
            = wsBhtEisProductDao.searchPkgSpecMaterialsNameRev(pkgSpecMaterialsNameRevCriteria);
        assertThat(pkgSpecMaterialsNameRevList.size(), is(1));
    }

    /**
     * <br />searchItemNoNxsPltzInstNoテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchItemNoNxsPltzInstNo() throws Exception {

        Ws2501ItemNoNxsPltzInstNoCriteriaDomain itemNoNxsPltzInstNoCriteria = new Ws2501ItemNoNxsPltzInstNoCriteriaDomain();
        itemNoNxsPltzInstNoCriteria.setPltzInstrNo("MYB0613002");
        itemNoNxsPltzInstNoCriteria.setItemNo("A002TB0091B03N");
        itemNoNxsPltzInstNoCriteria.setPkgCd("110");
        itemNoNxsPltzInstNoCriteria.setAplyStrtDt(new Date("2014/06/16 00:00:00"));

        List<? extends Ws2501ItemNoNxsPltzInstNoDomain> itemNoNxsPltzInstNoList = wsBhtEisProductDao.searchItemNoNxsPltzInstNo(
            itemNoNxsPltzInstNoCriteria);

        assertThat(itemNoNxsPltzInstNoList.size(), is(1));
    }

    /**
     * <br />searchItemNoNxsNonPltzInstNoテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testSearchItemNoNxsNonPltzInstNo() throws Exception {

        Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain itemNoNxsNonPltzInstNoCriteria = new Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain();
        itemNoNxsNonPltzInstNoCriteria.setRcvOdrCompCd("MY7");
        itemNoNxsNonPltzInstNoCriteria.setItemNo("A002TB0091B3N05");
        itemNoNxsNonPltzInstNoCriteria.setPkgCd("110");
        itemNoNxsNonPltzInstNoCriteria.setCustomerCd("30001205");
        itemNoNxsNonPltzInstNoCriteria.setLgcyShipTo("00");
        itemNoNxsNonPltzInstNoCriteria.setTrnsCd("S");
        itemNoNxsNonPltzInstNoCriteria.setAplyStrtDt(new Date("2014/06/16 00:00:00"));
        itemNoNxsNonPltzInstNoCriteria.setLgcyWhCd("1");
        itemNoNxsNonPltzInstNoCriteria.setOdrFirmFlg("Y");
        itemNoNxsNonPltzInstNoCriteria.setShippedTyp("1");

        List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain> ItemNoNxsNonPltzInstNoList = wsBhtEisProductDao.searchItemNoNxsNonPltzInstNo(
            itemNoNxsNonPltzInstNoCriteria);

        assertThat(ItemNoNxsNonPltzInstNoList.size(), is(1));

    }

    /**
     * <br />searchPltzInstrInfoテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchPltzInstrInfo() throws Exception {

        Ws2501PltzInstrInfoCriteriaDomain pltzInstrInfoCriteria = new Ws2501PltzInstrInfoCriteriaDomain();
        pltzInstrInfoCriteria.setPltzInstrNo("MYB0613002");
        Ws2501PltzInstrInfoDomain pltzInstrInfo = wsBhtEisProductDao.searchPltzInstrInfo(pltzInstrInfoCriteria);
        assertThat(pltzInstrInfo, is(notNullValue()));
    }

    /**
     * <br />searchSumCmlWeightForUnitテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchSumCmlWeightForUnit() throws Exception {
        Ws2501SumCmlWeightForUnitCriteriaDomain sumCmlWeightForUnitCriteria = new Ws2501SumCmlWeightForUnitCriteriaDomain();
        List<String> mainMarks = new ArrayList<String>();
        mainMarks.add("DMY711506170001");
        mainMarks.add("DMY711506170002");
        sumCmlWeightForUnitCriteria.setMainMarkList(mainMarks);
        List<? extends Ws2501SumCmlWeightForUnitDomain> sumCmlWeightForUnitList = wsBhtEisProductDao.searchSumCmlWeightForUnit(sumCmlWeightForUnitCriteria);
        assertThat(sumCmlWeightForUnitList, is(notNullValue()));
        assertThat(sumCmlWeightForUnitList.size(), is(1));

    }

    /**
     * <br />searchTmNxsWhByXrefテスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchTmNxsWhByXref() throws Exception {
        Ws2501TmNxsWhByXrefCriteriaDomain tmNxsWhByXrefCriteriaDomain = new Ws2501TmNxsWhByXrefCriteriaDomain();
        tmNxsWhByXrefCriteriaDomain.setCompCd("MYB");
        tmNxsWhByXrefCriteriaDomain.setWhCd("WH02");
        tmNxsWhByXrefCriteriaDomain.setLgcyLibCompCd("MYB");
        List<? extends Ws2501TmNxsWhByXrefDomain> tmNxsWhByXrefDomainList
            = wsBhtEisProductDao.searchTmNxsWhByXref(tmNxsWhByXrefCriteriaDomain);

        assertThat(tmNxsWhByXrefDomainList, is(notNullValue()));
        assertThat(tmNxsWhByXrefDomainList.size(), is(1));
    }

    /**
     * {@link WsBhtEisProductDao#searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchTtPltzItemDeliveryTime() throws Exception {
        Ws2501TtPltzItemDeliveryTimeCriteriaDomain ttPltzItemDeliveryTimeCriteria = new Ws2501TtPltzItemDeliveryTimeCriteriaDomain();
        ttPltzItemDeliveryTimeCriteria.setMainMark("DMYB11504150008");
        Assert.assertNotNull(wsBhtEisProductDao.searchTtPltzItemDeliveryTime(ttPltzItemDeliveryTimeCriteria));
    }

    /**
     * {@link WsBhtEisProductDao#searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchTtPltzItemGw() throws Exception {
        Ws2501TtPltzItemGwCriteriaDomain criteria = new Ws2501TtPltzItemGwCriteriaDomain();
        criteria.setMainMark("DMYB11504150008");
        Assert.assertFalse(wsBhtEisProductDao.searchTtPltzItemGw(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchTtPltzItemNw() throws Exception {
        Ws2501TtPltzItemNwCriteriaDomain criteria = new Ws2501TtPltzItemNwCriteriaDomain();
        criteria.setMainMark("DMYB11504150008");
        Assert.assertFalse(wsBhtEisProductDao.searchTtPltzItemNw(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchNextWorkTimeNo()} のテスト
     *
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchNextWorkTimeNo() throws Exception {
        BigDecimal actual = wsBhtEisProductDao.searchNextWorkTimeNo();
        System.out.println("########## " + actual);
        assertTrue(actual.compareTo(ONE) > 0);
    }

    /**
     * {@link WsBhtEisProductDao#testSearchNxsPkgSpecification(Ws2501NxsPkgSpecificationCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchNxsPkgSpecification() throws Exception {
        Ws2501NxsPkgSpecificationCriteriaDomain criteria =  new Ws2501NxsPkgSpecificationCriteriaDomain();
        criteria.setCompCd("MYB");
        criteria.setTrnsCd("S");
        criteria.setItemNo("A002TB0091B01N");
        criteria.setPkgCd("110");
        Assert.assertFalse(wsBhtEisProductDao.searchNxsPkgSpecification(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchTmCustomerQrPatternHdrByDtl(Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchTmCustomerQrPatternHdrByDtl() throws Exception {
        Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain criteria
            = new Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain();
        criteria.setCompCd("MYB");
        criteria.setCollateMethTyp("2");

        Assert.assertFalse(wsBhtEisProductDao.searchTmCustomerQrPatternHdrByDtl(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchTtPltzItemByKanban(Ws2501TtPltzItemByKanbanCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchTtPltzItemByKanban() throws Exception {
        Ws2501TtPltzItemByKanbanCriteriaDomain criteria = new Ws2501TtPltzItemByKanbanCriteriaDomain();
        criteria.setPltzInstrNo("MYB0614001");
        Assert.assertFalse(wsBhtEisProductDao.searchTtPltzItemByKanban(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchUnpackagedItemNo(Ws2501UnpackagedItemNoCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchUnpackagedItemNo() throws Exception {
        Ws2501UnpackagedItemNoCriteriaDomain criteria = new Ws2501UnpackagedItemNoCriteriaDomain();
        criteria.setPltzInstrNo("MYB0612002");
        criteria.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
        Assert.assertFalse(wsBhtEisProductDao.searchUnpackagedItemNo(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#searchOuterSumWeight(Ws2501OuterSumWeightCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOuterSumWeight() throws Exception {
        Ws2501OuterSumWeightCriteriaDomain criteria = new Ws2501OuterSumWeightCriteriaDomain();
        criteria.setOwnerComp("MYB");
        criteria.setOuterCd("7777");
        Assert.assertFalse(wsBhtEisProductDao.searchOuterSumWeight(criteria).isEmpty());
    }

    /**
     * {@link WsBhtEisProductDao#lockByKeyNoWaitPltzNxsShipTo(Ws2501PltzNxsShipToCriteriaDomain)} のテスト
     *
     * @throws Exception  何らかのエラーが発生した場合
     */
    @Test
    public void testLockByKeyNoWaitPltzNxsShipTo() throws Exception {
        Ws2501PltzNxsShipToCriteriaDomain criteria = new Ws2501PltzNxsShipToCriteriaDomain();
        criteria.setMainMark("0001");
        Assert.assertNotNull(wsBhtEisProductDao.lockByKeyNoWaitPltzNxsShipTo(criteria));
    }
}
