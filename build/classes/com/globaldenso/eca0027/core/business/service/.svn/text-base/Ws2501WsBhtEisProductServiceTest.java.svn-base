package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5064;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoServiceImpl;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmCustomerQrPatternHdrByDtlDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.integration.WsBhtEisProductDaoImpl;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfServiceImpl;
import com.globaldenso.gscm.framework.business.service.TmUserServiceImpl;

/**
 * {@link WsBhtEisProductServiceImpl} の WS2501 のためのテストクラス
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10489 $
 */
public class Ws2501WsBhtEisProductServiceTest {

    /** EIS ProductのWebサービスの実装クラス */
    private WsBhtEisProductServiceImpl bhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2501WsBhtEisProductServiceTest() {
    }

    /**
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();

        bhtEisProductService = new WsBhtEisProductServiceImpl();

        // 関連サービスの設定
        bhtEisProductService.setCommonService(new CommonServiceImpl());
        bhtEisProductService.setL2002ReportService(new L2002ReportServiceImpl());
        bhtEisProductService.setL2003ReportService(new L2003ReportServiceImpl());
        bhtEisProductService.setL2004ReportService(new L2004ReportServiceImpl());
        bhtEisProductService.setL2005ReportService(new L2005ReportServiceImpl());
        bhtEisProductService.setLc001ReportService(new LC001ReportServiceImpl());
        bhtEisProductService.setTmCigmaCustomerXrefService(new TmCigmaCustomerXrefServiceImpl());
        bhtEisProductService.setTmCigmaShipToXrefService(new TmCigmaShipToXrefServiceImpl());
        bhtEisProductService.setTmCigmaWhXrefService(new TmCigmaWhXrefServiceImpl());
        bhtEisProductService.setTmNxsCompService(new TmNxsCompServiceImpl());
        bhtEisProductService.setTmPkgSetHdrService(new TmPkgSetHdrServiceImpl());
        bhtEisProductService.setTmPkgSpecRevHisService(new TmPkgSpecRevHisServiceImpl());
        bhtEisProductService.setTmPkgSpecRevService(new TmPkgSpecRevServiceImpl());
        bhtEisProductService.setTmPrinterService(new TmPrinterServiceImpl());
        bhtEisProductService.setTmUserConfService(new TmUserConfServiceImpl());
        bhtEisProductService.setTmUserService(new TmUserServiceImpl());
        bhtEisProductService.setTmCdService(new TmCdServiceImpl());
        bhtEisProductService.setTtCmlErrorHeaderService(new TtCmlErrorHeaderServiceImpl());
        bhtEisProductService.setTtMixtagService(new TtMixtagServiceImpl());
        bhtEisProductService.setTtPltzInstrService(new TtPltzInstrServiceImpl());
        bhtEisProductService.setTtPltzService(new TtPltzServiceImpl());
        bhtEisProductService.setTtXpltzService(new TtXpltzServiceImpl());
        bhtEisProductService.setVmUserInfoService(new VmUserInfoServiceImpl());
        bhtEisProductService.setTtPltzItemService(new TtPltzItemServiceImpl());
        bhtEisProductService.setTmExpShipToShippingService(new TmExpShipToShippingServiceImpl());
        bhtEisProductService.setTmNxsShipToService(new TmNxsShipToServiceImpl());
        bhtEisProductService.setTmPkgMtrlService(new TmPkgMtrlServiceImpl());
        bhtEisProductService.setWsBhtEisProductDao(new WsBhtEisProductDaoImpl());
        bhtEisProductService.setWs2004RestService(new Ws2004RestServiceImpl());
        bhtEisProductService.setTmMeasureUnitService(new TmMeasureUnitServiceImpl());
        bhtEisProductService.setTtCmlErrorDtlService(new TtCmlErrorDtlServiceImpl());
        bhtEisProductService.setTtPltzInstrOdrService(new TtPltzInstrOdrServiceImpl());
        bhtEisProductService.setTtPltzItemOdrService(new TtPltzItemOdrServiceImpl());
        bhtEisProductService.setTtMixtagRtService(new TtMixtagRtServiceImpl());
        bhtEisProductService.setTtPltzKanbanService(new TtPltzKanbanServiceImpl());
        bhtEisProductService.setTtMixKanbanService(new TtMixKanbanServiceImpl());
        bhtEisProductService.setTtPltzInstrItemNoService(new TtPltzInstrItemNoServiceImpl());
        bhtEisProductService.setTtBhtWorkTimeService(new TtBhtWorkTimeServiceImpl());
        bhtEisProductService.setTtBhtWorkPltzService(new TtBhtWorkPltzServiceImpl());
        bhtEisProductService.setTtBhtWorkMixTagService(new TtBhtWorkMixTagServiceImpl());
        bhtEisProductService.setTtBhtWorkErrService(new TtBhtWorkErrServiceImpl());
        bhtEisProductService.setTtExpRcvOdrService(new TtExpRcvOdrServiceImpl());
        bhtEisProductService.setTtMixtagItemNoService(new TtMixtagItemNoServiceImpl());
        bhtEisProductService.setTtMixtagOdrService(new TtMixtagOdrServiceImpl());
        bhtEisProductService.setTtTmpStockService(new TtTmpStockServiceImpl());
        bhtEisProductService.setWs2005RestService(new Ws2005RestServiceImpl());
        bhtEisProductService.setWs9002RestService(new Ws9002RestServiceImpl());

        TmUserDomain user = new TmUserDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserServiceImpl.class, "searchByKey", user);
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnPltzInstr1() throws ApplicationException {

        TtPltzInstrDomain ttPltzInstrDomain = newTtPltzInstrDomain("a", "b", "c", "d", "e", "f", "g");
        ttPltzInstrDomain.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "searchByKey", ttPltzInstrDomain);

        // --------------------------------------------------------------------
        TtPltzInstrDomain result = new TtPltzInstrDomain();

        String errCd = bhtEisProductService.validateDatabaseTtPltzOnPltzInstr("1", result);
        assertThat(errCd, is(nullValue()));
        assertThat(result.getShipperCd(),      is("a"));
        assertThat(result.getCustomerCd(),     is("b"));
        assertThat(result.getLgcyShipTo(),     is("c"));
        assertThat(result.getTrnsCd(),         is("d"));
        assertThat(result.getPlntCd(),         is("e"));
        assertThat(result.getLgcyWhCd(),       is("f"));
        assertThat(result.getCollateMethTyp(), is("g"));
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnPltzInstr2() throws ApplicationException {
        // NXS_E1_5038
        MockObjectManager.setReturnNullAtAllTimes(TtPltzInstrServiceImpl.class, "searchByKey");

        // --------------------------------------------------------------------
        TtPltzInstrDomain result = new TtPltzInstrDomain();

        String errCd = bhtEisProductService.validateDatabaseTtPltzOnPltzInstr("HOGE", result);
        assertThat(errCd, is(NXS_E1_5038));
        assertThat(result.getShipperCd(),      is(nullValue()));
        assertThat(result.getCustomerCd(),     is(nullValue()));
        assertThat(result.getLgcyShipTo(),     is(nullValue()));
        assertThat(result.getTrnsCd(),         is(nullValue()));
        assertThat(result.getPlntCd(),         is(nullValue()));
        assertThat(result.getLgcyWhCd(),       is(nullValue()));
        assertThat(result.getCollateMethTyp(), is(nullValue()));
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzOnPltzInstr3() throws ApplicationException {
        // NXS_E1_5015
        TtPltzInstrDomain ttPltzInstrDomain = newTtPltzInstrDomain("a", "b", "c", "d", "e", "f", "g");

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "searchByKey", ttPltzInstrDomain);

        // --------------------------------------------------------------------

        TtPltzInstrDomain result;
        String errCd;

        // --------------------------------------------------------------------
        // PLTZ_INSTR_STATUS_ALL_CML_CREATE
        ttPltzInstrDomain.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);

        result = new TtPltzInstrDomain();
        errCd = bhtEisProductService.validateDatabaseTtPltzOnPltzInstr("HOGE", result);
        assertThat(errCd, is(NXS_E1_5015));
        assertThat(result.getShipperCd(),      is(nullValue()));
        assertThat(result.getCustomerCd(),     is(nullValue()));
        assertThat(result.getLgcyShipTo(),     is(nullValue()));
        assertThat(result.getTrnsCd(),         is(nullValue()));
        assertThat(result.getPlntCd(),         is(nullValue()));
        assertThat(result.getLgcyWhCd(),       is(nullValue()));
        assertThat(result.getCollateMethTyp(), is(nullValue()));

        // --------------------------------------------------------------------
        // PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT
        ttPltzInstrDomain.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);

        errCd = bhtEisProductService.validateDatabaseTtPltzOnPltzInstr("HOGE", result);
        assertThat(errCd, is(NXS_E1_5015));
        assertThat(result.getShipperCd(),      is(nullValue()));
        assertThat(result.getCustomerCd(),     is(nullValue()));
        assertThat(result.getLgcyShipTo(),     is(nullValue()));
        assertThat(result.getTrnsCd(),         is(nullValue()));
        assertThat(result.getPlntCd(),         is(nullValue()));
        assertThat(result.getLgcyWhCd(),       is(nullValue()));
        assertThat(result.getCollateMethTyp(), is(nullValue()));
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPltzInstr1() throws ApplicationException {

        List<Object> ttPltzList                      = new ArrayList<Object>();
        List<Object> ttPltzItemByKanbanList          = new ArrayList<Object>();
        List<Object> ttMixtagList                    = new ArrayList<Object>();
        List<Object> unpackagedItemNoList            = new ArrayList<Object>();
        List<Object> ttMixtagByNoPltzInstrList       = new ArrayList<Object>();
        List<Object> tmCustomerQrPatternHdrByDtlList = new ArrayList<Object>();
        tmCustomerQrPatternHdrByDtlList.add(new Ws2501TmCustomerQrPatternHdrByDtlDomain());

        MockObjectManager.setReturnValueAt(TtPltzServiceImpl.class,      "searchByCondition",                 0, ttPltzList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTtPltzItemByKanban",          0, ttPltzItemByKanbanList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 0, ttMixtagList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchUnpackagedItemNo",            0, unpackagedItemNoList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 1, ttMixtagByNoPltzInstrList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmCustomerQrPatternHdrByDtl", 0, tmCustomerQrPatternHdrByDtlList);

        // --------------------------------------------------------------------
        // COLLATE_METH_TYP が null でない場合
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCollateMethTyp("HOGE");

        WsBhtEisProductDomain wsBhtEisProduct = bhtEisProductService.searchOnPltzInstr(criteria);
        assertNull(wsBhtEisProduct.getErrMap());
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtPltzList())                      == ttPltzList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtPltzItemByKanbanList())          == ttPltzItemByKanbanList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtMixtagList())                    == ttMixtagList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501UnpackagedItemNoList())            == unpackagedItemNoList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtMixtagByNoPltzInstrList())       == ttMixtagByNoPltzInstrList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TmCustomerQrPatternHdrByDtlList()) == tmCustomerQrPatternHdrByDtlList);

        MockObjectManager.assertCalled(WsBhtEisProductDaoImpl.class, "searchTmCustomerQrPatternHdrByDtl");
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPltzInstr2() throws ApplicationException {
        // NXS_E1_5064
        List<Object> ttPltzList                      = new ArrayList<Object>();
        List<Object> ttPltzItemByKanbanList          = new ArrayList<Object>();
        List<Object> ttMixtagList                    = new ArrayList<Object>();
        List<Object> unpackagedItemNoList            = new ArrayList<Object>();
        List<Object> ttMixtagByNoPltzInstrList       = new ArrayList<Object>();
        List<Object> tmCustomerQrPatternHdrByDtlList = new ArrayList<Object>();

        MockObjectManager.setReturnValueAt(TtPltzServiceImpl.class,      "searchByCondition",                 0, ttPltzList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTtPltzItemByKanban",          0, ttPltzItemByKanbanList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchUnpackagedItemNo",            0, unpackagedItemNoList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 0, ttMixtagList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 1, ttMixtagByNoPltzInstrList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmCustomerQrPatternHdrByDtl", 0, tmCustomerQrPatternHdrByDtlList);

        // --------------------------------------------------------------------
        // COLLATE_METH_TYP が null でない場合
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCollateMethTyp("HOGE");

        WsBhtEisProductDomain wsBhtEisProduct = bhtEisProductService.searchOnPltzInstr(criteria);
        assertTrue(wsBhtEisProduct.getErrMap().containsKey(NXS_E1_5064));

        MockObjectManager.assertCalled(WsBhtEisProductDaoImpl.class, "searchTmCustomerQrPatternHdrByDtl");
    }

    /**
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPltzInstr3() throws ApplicationException {

        List<Object> ttPltzList                      = new ArrayList<Object>();
        List<Object> ttPltzItemByKanbanList          = new ArrayList<Object>();
        List<Object> ttMixtagList                    = new ArrayList<Object>();
        List<Object> unpackagedItemNoList            = new ArrayList<Object>();
        List<Object> ttMixtagByNoPltzInstrList       = new ArrayList<Object>();

        MockObjectManager.setReturnValueAt(TtPltzServiceImpl.class,      "searchByCondition",                 0, ttPltzList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTtPltzItemByKanban",          0, ttPltzItemByKanbanList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 0, ttMixtagList);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchUnpackagedItemNo",            0, unpackagedItemNoList);
        MockObjectManager.setReturnValueAt(TtMixtagServiceImpl.class,    "searchByCondition",                 1, ttMixtagByNoPltzInstrList);

        // --------------------------------------------------------------------
        // COLLATE_METH_TYP が null の場合
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setCollateMethTyp(null);

        WsBhtEisProductDomain wsBhtEisProduct = bhtEisProductService.searchOnPltzInstr(criteria);
        assertNull(wsBhtEisProduct.getErrMap());
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtPltzList())                      == ttPltzList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtPltzItemByKanbanList())          == ttPltzItemByKanbanList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtMixtagList())                    == ttMixtagList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501UnpackagedItemNoList())            == unpackagedItemNoList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TtMixtagByNoPltzInstrList())       == ttMixtagByNoPltzInstrList);
        assertTrue(((List<?>) wsBhtEisProduct.getWs2501TmCustomerQrPatternHdrByDtlList()).isEmpty());

        MockObjectManager.assertNotCalled(WsBhtEisProductDaoImpl.class, "searchTmCustomerQrPatternHdrByDtl");
    }

    /**
     * {@link TtPltzInstrDomain} を生成して返す。
     * 
     * @param shipperCd shipperCd
     * @param customerCd customerCd
     * @param lgcyShipTo lgcyShipTo
     * @param trnsCd trnsCd
     * @param plntCd plntCd
     * @param lgcyWhCd lgcyWhCd
     * @param collateMethTyp collateMethTyp
     * @return TtPltzInstrDomain
     */
    private TtPltzInstrDomain newTtPltzInstrDomain(
            String shipperCd, String customerCd, String lgcyShipTo,
            String trnsCd, String plntCd, String lgcyWhCd, String collateMethTyp) {
        TtPltzInstrDomain pltzInstr = new TtPltzInstrDomain();
        pltzInstr.setShipperCd(shipperCd);
        pltzInstr.setCustomerCd(customerCd);
        pltzInstr.setLgcyShipTo(lgcyShipTo);
        pltzInstr.setTrnsCd(trnsCd);
        pltzInstr.setPlntCd(plntCd);
        pltzInstr.setLgcyWhCd(lgcyWhCd);
        pltzInstr.setCollateMethTyp(collateMethTyp);
        return pltzInstr;
    }

}
