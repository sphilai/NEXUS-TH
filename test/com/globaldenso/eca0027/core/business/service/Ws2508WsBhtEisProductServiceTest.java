package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_FREE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5069;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.TEN;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static jp.co.dgic.testing.common.virtualmock.MockObjectManager.assertNotCalled;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemNoNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagRtGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501NxsPkgSpecificationDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmNxsWhByXrefDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.integration.WsBhtEisProductDaoImpl;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfServiceImpl;
import com.globaldenso.gscm.framework.business.service.TmUserServiceImpl;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;

/**
 * {@link WsBhtEisProductServiceImpl} の WS2508 のためのテストクラス
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10489 $
 */
public class Ws2508WsBhtEisProductServiceTest {

    /** EIS ProductのWebサービスの実装クラス */
    private WsBhtEisProductServiceImpl bhtEisProductService;

    /** システム日時 */
    private Date date = new Date();

    /**
     * デフォルトコンストラクタ
     */
    public Ws2508WsBhtEisProductServiceTest() {
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

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchTimezone", TimeZone.getDefault().getID());

        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", date);

        TmUserDomain user = new TmUserDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserServiceImpl.class, "searchByKey", user);

        TmUserConfDomain tmUserConf = new TmUserConfDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserConfServiceImpl.class, "searchByKey", tmUserConf);

        TtPltzItemDomain pltzItem = new TtPltzItemDomain();
        pltzItem.setBrch(TEN);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemServiceImpl.class, "searchByConditionForPaging", asList(pltzItem));

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchNextWorkTimeNo", ONE);

        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkTimeServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkPltzServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkErrServiceImpl.class,     "create");
        MockObjectManager.setReturnValueAtAllTimes(TtCmlErrorDtlServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtCmlErrorHeaderServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class,         "create");
        MockObjectManager.setReturnValueAtAllTimes(TtMixKanbanServiceImpl.class,      "create");
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagItemNoServiceImpl.class,   "create");
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagOdrServiceImpl.class,      "create");
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagRtServiceImpl.class,       "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemOdrServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemServiceImpl.class,       "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzKanbanServiceImpl.class,     "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class,           "create");
        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class,       "create");
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkMixTagServiceImpl.class,  "create");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyNxsStockFlg(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateConsistencyNxsStockFlg1() throws ApplicationException {
        // NxsStockFlg_NULL
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNxsStockFlg(null);      // NEXUS倉庫フラグ
        criteria.setPltzInstrNo(null);      // 梱包指示No.
        criteria.setShipperCd(null);        // 荷主コード
        criteria.setCustomerCd(null);       // 得意先コード
        criteria.setLgcyShipTo(null);       // 送荷先コード
        criteria.setTrnsCd(null);           // 輸送手段コード
        criteria.setPlntCd(null);           // 工場コード (LEGACY)
        criteria.setLgcyWhCd(null);         // 倉庫コード (LEGACY)
        criteria.setWhCompCd(null);         // 倉庫会社コード (拠点間)
        criteria.setWhCd(null);             // 倉庫コード (拠点間)

        //  -------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setPltzInstrNo("HOGE");
        assertTrue(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyNxsStockFlg(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateConsistencyNxsStockFlg2() throws ApplicationException {
        // NxsStockFlg_N
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNxsStockFlg(FLAG_N);    // NEXUS倉庫フラグ
        criteria.setPltzInstrNo(null);      // 梱包指示No.
        criteria.setShipperCd(null);        // 荷主コード
        criteria.setCustomerCd(null);       // 得意先コード
        criteria.setLgcyShipTo(null);       // 送荷先コード
        criteria.setTrnsCd(null);           // 輸送手段コード
        criteria.setPlntCd(null);           // 工場コード (LEGACY)
        criteria.setLgcyWhCd(null);         // 倉庫コード (LEGACY)
        criteria.setWhCompCd(null);         // 倉庫会社コード (拠点間)
        criteria.setWhCd(null);             // 倉庫コード (拠点間)

        //  -------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setShipperCd("a");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setCustomerCd("a");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setLgcyShipTo("a");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setTrnsCd("a");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setPlntCd("a");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setLgcyWhCd("a");
        assertTrue(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyNxsStockFlg(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateConsistencyNxsStockFlg3() throws ApplicationException {
        // NxsStockFlg_Y
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNxsStockFlg(FLAG_Y);      // NEXUS倉庫フラグ
        criteria.setPltzInstrNo(null);      // 梱包指示No.
        criteria.setShipperCd(null);        // 荷主コード
        criteria.setCustomerCd(null);       // 得意先コード
        criteria.setLgcyShipTo(null);       // 送荷先コード
        criteria.setTrnsCd(null);           // 輸送手段コード
        criteria.setPlntCd(null);           // 工場コード (LEGACY)
        criteria.setLgcyWhCd(null);         // 倉庫コード (LEGACY)
        criteria.setWhCompCd(null);         // 倉庫会社コード (拠点間)
        criteria.setWhCd(null);             // 倉庫コード (拠点間)

        //  -------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setShipperCd("HOGE");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setCustomerCd("HOGE");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setLgcyShipTo("HOGE");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setTrnsCd("HOGE");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setWhCompCd("HOGE");
        assertFalse(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));

        //  -------------------------------------------------------------------

        criteria.setWhCd("HOGE");
        assertTrue(bhtEisProductService.validateConsistencyNxsStockFlg(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnMixTag1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501ItemNoNxsNonPltzInstNoDomain itemNoNxsNonPltzInstNo = new Ws2501ItemNoNxsNonPltzInstNoDomain();
        itemNoNxsNonPltzInstNo.setOrderQty("1");
        itemNoNxsNonPltzInstNo.setContainerSortingKey("a");
        itemNoNxsNonPltzInstNo.setLoadingCd("b");
        itemNoNxsNonPltzInstNo.setInvoiceKey("c");
        itemNoNxsNonPltzInstNo.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonPltzInstNo.setCustomTimingTyp("d");
        itemNoNxsNonPltzInstNo.setContainerLooseTyp("f");
        itemNoNxsNonPltzInstNo.setItemDescription("g");
        itemNoNxsNonPltzInstNo.setExpLimitTyp("h");
        itemNoNxsNonPltzInstNo.setDngrItemFlg(FLAG_N);
        itemNoNxsNonPltzInstNo.setOriginCntryCd("i");
        itemNoNxsNonPltzInstNo.setQty("2");
        itemNoNxsNonPltzInstNo.setWeightUnit("j");
        itemNoNxsNonPltzInstNo.setNetWeightA("3");
        itemNoNxsNonPltzInstNo.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        itemNoNxsNonPltzInstNo.setMltInBoxArrowFlg(FLAG_Y);
        itemNoNxsNonPltzInstNo.setLotSize("4");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonPltzInstNo", asList(itemNoNxsNonPltzInstNo));

        //  -------------------------------------------------------------------

        Ws2004ResultItemDomain resultItem = new Ws2004ResultItemDomain();
        resultItem.setItnbr("A");
        resultItem.setCurr3("1");
        resultItem.setMohtq("2");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(resultItem));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        //  -------------------------------------------------------------------

        TtExpRcvOdrDomain ttPltzInstrOdrDomain1 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain1.setOdrQty(dec(100));
        ttPltzInstrOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain2 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain2.setOdrQty(dec(50));
        ttPltzInstrOdrDomain2.setPltzAllocQty(dec(40));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain3 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain3.setOdrQty(dec(100));
        ttPltzInstrOdrDomain3.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain4 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain4.setOdrQty(dec(20));
        ttPltzInstrOdrDomain4.setPltzAllocQty(dec(0));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2,
                ttPltzInstrOdrDomain3,
                ttPltzInstrOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "kg");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertWeightUnit", ONE);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagItemNoNw", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagRtGw", emptyList());

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnNullAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait");

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaNightFlg", FLAG_N);

        //  -------------------------------------------------------------------

        ResultDomain resultDomain = new ResultDomain();
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.setReturnValueAtAllTimes(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", resultDomain);

        //  -------------------------------------------------------------------

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("A");
        itemNo.setPkgCd("B");
        itemNo.setIndusTypCd("C");
        itemNo.setKanbanTyp("D");
        itemNo.setTagSeqNo(ONE);
        itemNo.setKanbanQty(ONE);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWorkTimeStrt("2014/04/01 09:30:00");
        criteria.setWorkTimeEnd("2014/04/01 17:30:00");
        criteria.setWs2508ItemNoList(asList(itemNo));
        criteria.setWs2508PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2508ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());

        bhtEisProductService.transactOnMixTag(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnMixTag2() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501ItemNoNxsNonPltzInstNoDomain itemNoNxsNonPltzInstNo = new Ws2501ItemNoNxsNonPltzInstNoDomain();
        itemNoNxsNonPltzInstNo.setOrderQty("1");
        itemNoNxsNonPltzInstNo.setContainerSortingKey("a");
        itemNoNxsNonPltzInstNo.setLoadingCd("b");
        itemNoNxsNonPltzInstNo.setInvoiceKey("c");
        itemNoNxsNonPltzInstNo.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonPltzInstNo.setCustomTimingTyp("d");
        itemNoNxsNonPltzInstNo.setContainerLooseTyp("f");
        itemNoNxsNonPltzInstNo.setItemDescription("g");
        itemNoNxsNonPltzInstNo.setExpLimitTyp("h");
        itemNoNxsNonPltzInstNo.setDngrItemFlg(FLAG_N);
        itemNoNxsNonPltzInstNo.setOriginCntryCd("i");
        itemNoNxsNonPltzInstNo.setQty("2");
        itemNoNxsNonPltzInstNo.setWeightUnit("j");
        itemNoNxsNonPltzInstNo.setNetWeightA("3");
        itemNoNxsNonPltzInstNo.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxsNonPltzInstNo.setMltInBoxArrowFlg(FLAG_Y);
        itemNoNxsNonPltzInstNo.setLotSize("4");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonPltzInstNo", asList(itemNoNxsNonPltzInstNo));

        //  -------------------------------------------------------------------

        Ws2004ResultItemDomain resultItem = new Ws2004ResultItemDomain();
        resultItem.setItnbr("A");
        resultItem.setCurr3("1");
        resultItem.setMohtq("2");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(resultItem));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        //  -------------------------------------------------------------------

        TtExpRcvOdrDomain ttPltzInstrOdrDomain1 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain1.setOdrQty(dec(100));
        ttPltzInstrOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain2 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain2.setOdrQty(dec(50));
        ttPltzInstrOdrDomain2.setPltzAllocQty(dec(40));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain3 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain3.setOdrQty(dec(100));
        ttPltzInstrOdrDomain3.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain4 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain4.setOdrQty(dec(20));
        ttPltzInstrOdrDomain4.setPltzAllocQty(dec(0));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2,
                ttPltzInstrOdrDomain3,
                ttPltzInstrOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "kg");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertWeightUnit", ONE);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagItemNoNw", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagRtGw", emptyList());

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnNullAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait");

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaNightFlg", FLAG_N);

        //  -------------------------------------------------------------------

        ResultDomain resultDomain = new ResultDomain();
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        MockObjectManager.setReturnValueAtAllTimes(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", resultDomain);

        //  -------------------------------------------------------------------

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("A");
        itemNo.setPkgCd("B");
        itemNo.setIndusTypCd("C");
        itemNo.setKanbanTyp("D");
        itemNo.setTagSeqNo(ONE);
        itemNo.setKanbanQty(ONE);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWorkTimeStrt("2014/04/01 09:30:00");
        criteria.setWorkTimeEnd("2014/04/01 17:30:00");
        criteria.setWs2508ItemNoList(asList(itemNo));
        criteria.setWs2508PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2508ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());

        bhtEisProductService.transactOnMixTag(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2508LockByPltzInstrNo(String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2508LockByPltzInstrNo1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait",                  new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", singletonList(new TtPltzInstrItemNoDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr",    singletonList(new TtPltzInstrOdrDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag",    new ArrayList<Object>());

        bhtEisProductService.ws2508LockByPltzInstrNo("FOO");

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "lockByKeyNoWait"),                  is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr"),    is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag"),    is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2508LockByPltzInstrNo(String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2508LockByPltzInstrNo2() throws ApplicationException {

        bhtEisProductService.ws2508LockByPltzInstrNo(null);

        MockObjectManager.assertNotCalled(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");
        MockObjectManager.assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo");
        MockObjectManager.assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr");
        MockObjectManager.assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2508LockByPltzInstrNo(String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2508LockByPltzInstrNo3() throws ApplicationException {

        MockObjectManager.setReturnNullAtAllTimes(TtPltzInstrServiceImpl.class,  "lockByKeyNoWait");

        try {
            bhtEisProductService.ws2508LockByPltzInstrNo("FOO");
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "lockByKeyNoWait"), is(1));
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo");
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr");
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2508LockByPltzInstrNo(String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2508LockByPltzInstrNo4() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait",                  new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", emptyList());

        try {
            bhtEisProductService.ws2508LockByPltzInstrNo("FOO");
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "lockByKeyNoWait"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo"), is(1));
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr");
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2508LockByPltzInstrNo(String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2508LockByPltzInstrNo5() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait",                  new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", singletonList(new TtPltzInstrOdrDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr",    emptyList());

        try {
            bhtEisProductService.ws2508LockByPltzInstrNo("FOO");
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "lockByKeyNoWait"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr"), is(1));
        assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtPltzInstrOnMixTag(String, String[], String[], String[], String[], String[], String[])}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtPltzInstrOnMixTag() throws ApplicationException {

        MockObjectManager.setReturnNullAt(TtPltzInstrServiceImpl.class, "searchByKey", 0);

        TtPltzInstrDomain pltzInstr1 = new TtPltzInstrDomain();
        pltzInstr1.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        MockObjectManager.setReturnValueAt(TtPltzInstrServiceImpl.class, "searchByKey", 1, pltzInstr1);

        TtPltzInstrDomain pltzInstr2 = new TtPltzInstrDomain();
        pltzInstr2.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(TtPltzInstrServiceImpl.class, "searchByKey", 2, pltzInstr2);

        //  -------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] customerCd = new String[1];
        String[] lgcyShipTo = new String[1];
        String[] trnsCd = new String[1];
        String[] plntCd = new String[1];
        String[] lgcyWhCd = new String[1];

        assertThat(bhtEisProductService.validateDatabaseTtPltzInstrOnMixTag("HOGE", shipperCd, customerCd, lgcyShipTo, trnsCd, plntCd, lgcyWhCd), is(NXS_E1_5038));
        assertThat(bhtEisProductService.validateDatabaseTtPltzInstrOnMixTag("HOGE", shipperCd, customerCd, lgcyShipTo, trnsCd, plntCd, lgcyWhCd), is(NXS_E1_5015));
        assertNull(bhtEisProductService.validateDatabaseTtPltzInstrOnMixTag("HOGE", shipperCd, customerCd, lgcyShipTo, trnsCd, plntCd, lgcyWhCd));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508HeaderData(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508HeaderData() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        bhtEisProductService.searchWs2508HeaderData(criteria);

        Assert.assertNotNull(criteria.getWs2508InternalVariableHdrDomain());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgMaterialsOnMixTag(String, java.util.List, java.util.List)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnMixTag() throws ApplicationException {

        MockObjectManager.setReturnNullAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 0);

        Ws2501PkgMaterialsDomain pkgMaterials = new  Ws2501PkgMaterialsDomain();
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 1, pkgMaterials);

        //  -------------------------------------------------------------------

        List<String> resultList1 = new ArrayList<String>();

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("a");

        assertFalse(bhtEisProductService.validateDatabaseTmPkgMaterialsOnMixTag("HOGE", asList(itemNo1), resultList1));
        assertThat(resultList1.size(), is(1));
        assertThat(resultList1.get(0), is("a"));

        //  -------------------------------------------------------------------

        List<String> resultList2 = new ArrayList<String>();

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("b");

        assertTrue(bhtEisProductService.validateDatabaseTmPkgMaterialsOnMixTag("HOGE", asList(itemNo2), resultList2));
        assertThat(resultList2.size(), is(0));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDtOnMixTag(String, java.util.List, String, java.util.List)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtOnMixTag1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification", emptyList());

        // --------------------------------------------------------------------

        List<String> resultList = new ArrayList<String>();

        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnMixTag("a", new ArrayList<Ws2501ItemNoDomain>(), "b", resultList));
        assertTrue(resultList.isEmpty());
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification"), is(0));

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();

        assertFalse(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnMixTag("a", asList(itemNo1), "b", resultList));
        assertThat(resultList.size(), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtOnMixTag2() throws ApplicationException {
        // 同一品目番号_同一包装コード
        Ws2501NxsPkgSpecificationDomain nxsPkgSpecification = new Ws2501NxsPkgSpecificationDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification", asList(nxsPkgSpecification));

        // --------------------------------------------------------------------

        List<String> resultList = new ArrayList<String>();

        // itemNo1 と itemNo3 は 同一品目番号、同一包装コード
        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("FOO");
        itemNo1.setPkgCd("BAR");

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo2.setItemNo("FOO");
        itemNo2.setPkgCd("BOR");

        Ws2501ItemNoDomain itemNo3 = new Ws2501ItemNoDomain();
        itemNo3.setItemNo("FOO");
        itemNo3.setPkgCd("BAR");

        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnMixTag("a", asList(itemNo1, itemNo2, itemNo3), "b", resultList));
        assertTrue(resultList.isEmpty());
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtOnMixTag3() throws ApplicationException {
        // 同一品目番号エラー
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification", emptyList());

        // --------------------------------------------------------------------

        List<String> resultList = new ArrayList<String>();

        // itemNo1 と itemNo2 は 同一品目番号（包装コードは違う）で両方ともエラー
        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("FOO");
        itemNo1.setPkgCd("BAR");

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo2.setItemNo("FOO");
        itemNo2.setPkgCd("BOR");

        assertFalse(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnMixTag("a", asList(itemNo1, itemNo2), "b", resultList));
        assertThat(resultList.size(), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchNxsPkgSpecification"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmCigmaWhXrefOnMixTag(String, String, String, String[], String[])}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaWhXrefOnMixTag() throws ApplicationException {


        MockObjectManager.setReturnNullAt(TmCigmaWhXrefServiceImpl.class, "searchByKey", 0);
        MockObjectManager.setReturnValueAt(TmCigmaWhXrefServiceImpl.class, "searchByKey", 1, new TmCigmaWhXrefDomain());

        //  -------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmCigmaWhXrefOnMixTag("a", "b", "c", new String[1], new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmCigmaWhXrefOnMixTag("a", "b", "c", new String[1], new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmNxsWhOnMixTag(String, String, String, String[])}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsWhOnMixTag() throws ApplicationException {

        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmNxsWhByXref", 0, emptyList());

        Ws2501TmNxsWhByXrefDomain nxsWhByXref = new Ws2501TmNxsWhByXrefDomain();
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmNxsWhByXref", 1, asList(nxsWhByXref));

        //  -------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmNxsWhOnMixTag("a", "b", "c", new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmNxsWhOnMixTag("a", "b", "c", new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508DetailData(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508DetailData() throws ApplicationException {

        Ws2501ItemNoNxsNonPltzInstNoDomain itemNoNxsNonPltzInstNo = new Ws2501ItemNoNxsNonPltzInstNoDomain();
        itemNoNxsNonPltzInstNo.setOrderQty("1");
        itemNoNxsNonPltzInstNo.setQty("2");
        itemNoNxsNonPltzInstNo.setNetWeightA("3");
        itemNoNxsNonPltzInstNo.setLotSize("4");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonPltzInstNo", asList(itemNoNxsNonPltzInstNo));

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(new ArrayList<Ws2004ResultItemDomain>());
        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setPltzInstrNo("HOGE");
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508ItemNoList(itemNoList);

        bhtEisProductService.searchWs2508DetailData(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#initInternalVariableDtlMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testInitInternalVariableDtlMixTag() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        criteria.setWs2508ItemNoList(itemNoList);

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("ITEM_1");
        itemNo1.setPkgCd("PKG_1");
        itemNo1.setCustomerItemNo("a");
        itemNo1.setMixTagFlg(FLAG_N);
        itemNo1.setKanbanQty(ONE);
        itemNo1.setIndusTypCd("b");
        itemNo1.setKanbanTyp("c");
        itemNo1.setTagSeqNo(ONE);
        itemNo1.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo1);

        Ws2501ItemNoDomain itemNo4 = new Ws2501ItemNoDomain();
        itemNo4.setItemNo("ITEM_1");
        itemNo4.setPkgCd("PKG_1");
        itemNo4.setCustomerItemNo("a");
        itemNo4.setMixTagFlg(FLAG_N);
        itemNo4.setKanbanQty(dec(4));
        itemNo4.setIndusTypCd("b");
        itemNo4.setKanbanTyp("c");
        itemNo4.setTagSeqNo(ONE);
        itemNo4.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo4);

        Ws2501ItemNoDomain itemNo7 = new Ws2501ItemNoDomain();
        itemNo7.setItemNo("ITEM_1");
        itemNo7.setPkgCd("PKG_1");
        itemNo7.setCustomerItemNo("a");
        itemNo7.setMixTagFlg(FLAG_N);
        itemNo7.setKanbanQty(dec(7));
        itemNo7.setIndusTypCd("b");
        itemNo7.setKanbanTyp("c");
        itemNo7.setTagSeqNo(ONE);
        itemNo7.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo7);

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo2.setItemNo("ITEM_2");
        itemNo2.setPkgCd("PKG_2");
        itemNo2.setCustomerItemNo("a");
        itemNo2.setMixTagFlg(FLAG_Y);
        itemNo2.setKanbanQty(dec(2));
        itemNo2.setIndusTypCd("b");
        itemNo2.setKanbanTyp("c");
        itemNo2.setTagSeqNo(ONE);
        itemNo2.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo2);

        Ws2501ItemNoDomain itemNo3 = new Ws2501ItemNoDomain();
        itemNo3.setItemNo("ITEM_1");
        itemNo3.setPkgCd("PKG_2");
        itemNo3.setCustomerItemNo("a");
        itemNo3.setMixTagFlg(FLAG_N);
        itemNo3.setKanbanQty(dec(3));
        itemNo3.setIndusTypCd("b");
        itemNo3.setKanbanTyp("c");
        itemNo3.setTagSeqNo(ONE);
        itemNo3.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo3);

        Ws2501ItemNoDomain itemNo5 = new Ws2501ItemNoDomain();
        itemNo5.setItemNo("ITEM_3");
        itemNo5.setPkgCd("PKG_1");
        itemNo5.setCustomerItemNo("a");
        itemNo5.setMixTagFlg(FLAG_N);
        itemNo5.setKanbanQty(dec(5));
        itemNo5.setIndusTypCd("b");
        itemNo5.setKanbanTyp("c");
        itemNo5.setTagSeqNo(ONE);
        itemNo5.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo5);

        Ws2501ItemNoDomain itemNo6 = new Ws2501ItemNoDomain();
        itemNo6.setItemNo("ITEM_3");
        itemNo6.setPkgCd("PKG_1");
        itemNo6.setCustomerItemNo("a");
        itemNo6.setMixTagFlg(FLAG_N);
        itemNo6.setKanbanQty(dec(6));
        itemNo6.setIndusTypCd("b");
        itemNo6.setKanbanTyp("c");
        itemNo6.setTagSeqNo(ONE);
        itemNo6.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo6);

        bhtEisProductService.initInternalVariableDtlMixTag(criteria);

        assertThat(criteria.getWs2508InternalVariableDtlDomainList().size(), is(4));

        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(0).getItemNo(), is("ITEM_1"));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(1).getItemNo(), is("ITEM_2"));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(2).getItemNo(), is("ITEM_1"));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(3).getItemNo(), is("ITEM_3"));

        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(0).getSeq(), is(dec(1)));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(1).getSeq(), is(nullValue()));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(2).getSeq(), is(dec(2)));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(3).getSeq(), is(dec(3)));

        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(0).getQty().intValue(), is(12));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(1).getQty().intValue(), is(2));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(2).getQty().intValue(), is(3));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(3).getQty().intValue(), is(11));

        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(0).getTagQty().intValue(), is(3));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(1).getTagQty().intValue(), is(1));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(2).getTagQty().intValue(), is(1));
        assertThat(criteria.getWs2508InternalVariableDtlDomainList().get(3).getTagQty().intValue(), is(2));

        assertThat(criteria.getMaxSeq().intValue(), is(3));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#dataLock(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDataLock() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", singletonList(new Ws2501TtExpRcvOdrDomain()));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        //  -------------------------------------------------------------------

        criteria.setPltzInstrNo("HOGE");
        bhtEisProductService.dataLock(criteria);

        MockObjectManager.assertNotCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr");

        //  -------------------------------------------------------------------

        criteria.setPltzInstrNo(null);
        bhtEisProductService.dataLock(criteria);

        MockObjectManager.assertCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#dataLock(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testDataLock2() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        //  -------------------------------------------------------------------

        criteria.setPltzInstrNo(null);

        try {
            bhtEisProductService.dataLock(criteria);
            fail();
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        MockObjectManager.assertCalled(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508NexusInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508NexusInfo() throws ApplicationException {

        Ws2501ItemNoNxsPltzInstNoDomain itemNoNxsPltzInstNo = new Ws2501ItemNoNxsPltzInstNoDomain();
        itemNoNxsPltzInstNo.setInstrQty("1");
        itemNoNxsPltzInstNo.setPackedQty("1");
        itemNoNxsPltzInstNo.setSumQty("1");
        itemNoNxsPltzInstNo.setQty("1");
        itemNoNxsPltzInstNo.setNetWeightA("1");
        itemNoNxsPltzInstNo.setLotSize("1");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsPltzInstNo", asList(itemNoNxsPltzInstNo));

        Ws2501ItemNoNxsNonPltzInstNoDomain itemNoNxsNonPltzInstNo = new Ws2501ItemNoNxsNonPltzInstNoDomain();
        itemNoNxsNonPltzInstNo.setOrderQty("1");
        itemNoNxsNonPltzInstNo.setQty("2");
        itemNoNxsNonPltzInstNo.setNetWeightA("3");
        itemNoNxsNonPltzInstNo.setLotSize("4");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonPltzInstNo", asList(itemNoNxsNonPltzInstNo));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        //  -------------------------------------------------------------------

        bhtEisProductService.searchWs2508NexusInfo(criteria);

        //  -------------------------------------------------------------------

        internalVariableHdr.setPltzInstrNo("HOGE");
        bhtEisProductService.searchWs2508NexusInfo(criteria);

        //  -------------------------------------------------------------------
        MockObjectManager.setReturnNullAtAllTimes(Ws2501ItemNoNxsPltzInstNoDomain.class, "getSumQty");
        bhtEisProductService.searchWs2508NexusInfo(criteria);

    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508CigmaInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508CigmaInfo1() throws ApplicationException {

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setMohtq("20");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setNexusWhFlg(FLAG_Y);
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setTmpStockQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setTmpStockQty(dec(2));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2508CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508CigmaInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508CigmaInfo2() throws ApplicationException {
        // 梱包指示Noなし、NEXUS倉庫フラグ_Y
        Ws2501TmNxsWhByXrefDomain tmNxsWhByXref = new Ws2501TmNxsWhByXrefDomain();

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setMohtq("20");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTmNxsWhByXref", asList(tmNxsWhByXref));
        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setNexusWhFlg(FLAG_Y);
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setTmpStockQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setTmpStockQty(dec(2));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNxsStockFlg(FLAG_Y);
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2508CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508CigmaInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508CigmaInfo3() throws ApplicationException {
        // Ws2004ResultItemDomain_is_EMPTY
        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(new ArrayList<Ws2004ResultItemDomain>());

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setNexusWhFlg(FLAG_Y);
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setTmpStockQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setTmpStockQty(dec(2));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2508CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508CigmaInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2508CigmaInfo4() throws ApplicationException {
        // Ws2004ResultItemDomain該当なし
        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setNexusWhFlg(FLAG_Y);
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setTmpStockQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setTmpStockQty(dec(2));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2508CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2508CigmaInfo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test(expected = ApplicationException.class)
    public void testSearchWs2508CigmaInfo5() throws ApplicationException {
        // TmMeasureUnitDomain_is_EMPTY
        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", emptyList());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setTmpStockQty(ONE);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1));
        bhtEisProductService.searchWs2508CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData1() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("b");
        internalVariableDtl1.setInvoiceKey("c");
        internalVariableDtl1.setContainerSortingKey("d");
        internalVariableDtl1.setCurrCd("e");
        internalVariableDtl1.setLoadingCd("f");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("h");
        internalVariableDtl1.setCustomTimingTyp("i");
        internalVariableDtl1.setMixTagStatus("j");
        internalVariableDtl1.setWhCompCd("k");
        internalVariableDtl1.setWhCd("l");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("b");
        internalVariableDtl2.setInvoiceKey("c");
        internalVariableDtl2.setContainerSortingKey("d");
        internalVariableDtl2.setCurrCd("e");
        internalVariableDtl2.setLoadingCd("f");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("h");
        internalVariableDtl2.setCustomTimingTyp("i");
        internalVariableDtl2.setMixTagStatus("j");
        internalVariableDtl2.setWhCompCd("k");
        internalVariableDtl2.setWhCd("l");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertTrue(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData2() throws ApplicationException {
        // 梱包形態チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

//    /**
//     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
//     *
//     * @throws ApplicationException 何らかのエラーが発生した場合
//     */
//    @Test
//    public void testCheckInputData_単品品目番号チェック() throws ApplicationException {
//
//        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
//        internalVariableDtl1.setPltzInstrNo("HOGE");
//        internalVariableDtl1.setDataGetFlg(FLAG_Y);
//        internalVariableDtl1.setMixTagFlg(FLAG_Y);
//        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
//        internalVariableDtl1.setItemNo("FOO");
//        internalVariableDtl1.setInvoiceKey("");
//        internalVariableDtl1.setContainerSortingKey("");
//        internalVariableDtl1.setCurrCd("");
//        internalVariableDtl1.setLoadingCd("");
//        internalVariableDtl1.setStgInstrItemFlg("");
//        internalVariableDtl1.setContainerLooseTyp("");
//        internalVariableDtl1.setCustomTimingTyp("");
//        internalVariableDtl1.setMixTagStatus("");
//        internalVariableDtl1.setWhCompCd("");
//        internalVariableDtl1.setWhCd("");
//        internalVariableDtl1.setQty(dec(1));
//        internalVariableDtl1.setPltzQty(dec(1));
//        internalVariableDtl1.setInstrQty(dec(1));
//        internalVariableDtl1.setLotSize(dec(1));
//
//        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
//        internalVariableDtl2.setPltzInstrNo("HOGE");
//        internalVariableDtl2.setDataGetFlg(FLAG_Y);
//        internalVariableDtl2.setMixTagFlg(FLAG_Y);
//        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
//        internalVariableDtl2.setItemNo("BAR");
//        internalVariableDtl2.setInvoiceKey("");
//        internalVariableDtl2.setContainerSortingKey("");
//        internalVariableDtl2.setCurrCd("");
//        internalVariableDtl2.setLoadingCd("");
//        internalVariableDtl2.setStgInstrItemFlg("");
//        internalVariableDtl2.setContainerLooseTyp("");
//        internalVariableDtl2.setCustomTimingTyp("");
//        internalVariableDtl2.setMixTagStatus("");
//        internalVariableDtl2.setWhCompCd("");
//        internalVariableDtl2.setWhCd("");
//        internalVariableDtl2.setQty(dec(1));
//        internalVariableDtl2.setPltzQty(dec(1));
//        internalVariableDtl2.setInstrQty(dec(1));
//        internalVariableDtl2.setLotSize(dec(1));
//
//        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
//    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData3() throws ApplicationException {
        // インボイスキーチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("FOO");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("BAR");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData4() throws ApplicationException {
        // コンテナ層別キーチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("FOO");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("BAR");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData5() throws ApplicationException {
        // 通貨チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("FOO");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("BAR");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData6() throws ApplicationException {
        // 荷積み位置コードチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd(LOADING_CD_DOOR);
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd(LOADING_CD_BACK);
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData7() throws ApplicationException {
        // 荷揃え指示フラグチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_Y);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData8() throws ApplicationException {
        // コンテナルーズチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("FOO");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("BAR");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData9() throws ApplicationException {
        // 通関タイミング区分チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("FOO");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("BAR");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCheckInputData10() throws ApplicationException {
        // 小箱内多品許可フラグチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo("HOGE");
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");
        internalVariableDtl1.setQty(dec(1));
        internalVariableDtl1.setPltzQty(dec(1));
        internalVariableDtl1.setInstrQty(dec(1));
        internalVariableDtl1.setLotSize(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg(FLAG_N);
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");
        internalVariableDtl2.setQty(dec(1));
        internalVariableDtl2.setPltzQty(dec(1));
        internalVariableDtl2.setInstrQty(dec(1));
        internalVariableDtl2.setLotSize(dec(1));

        assertFalse(checkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#checkInputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @param d1 Ws2501InternalVariableDtlDomain
     * @param d2 Ws2501InternalVariableDtlDomain
     * @return チェック結果
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private boolean checkInputData(Ws2501InternalVariableDtlDomain d1, Ws2501InternalVariableDtlDomain d2) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("b");
        internalVariableHdr.setWhCd("c");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(d1, d2));

        return bhtEisProductService.checkInputData(criteria, new Timestamp[1]);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo1() {
        // オーダー超えチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl.setQty(dec(3));
        internalVariableDtl.setTagQty(ONE);
        internalVariableDtl.setLotSize(TEN);
        internalVariableDtl.setOdrQty(dec(2));
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg("c");
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2508ItemNo(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, null);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo2() {
        // 出荷ロット超えチェック_多品品目番号
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(ONE);
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg("c");
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2508ItemNo(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, null);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo3() {
        // 出荷ロット超えチェック_単品品目番号
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(dec(9));
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg("c");
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2508ItemNo(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, null);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo4() {
        // CIGMA情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(dec(12));
        internalVariableDtl.setCurrCd(null);
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg("c");
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        assertThat(chkWs2508ItemNo(internalVariableDtl), is("YNNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo5() {
        //輸出出荷品目番号情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(dec(12));
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription(null);
        internalVariableDtl.setDngrItemFlg("c");
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        assertThat(chkWs2508ItemNo(internalVariableDtl), is("NYNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2508ItemNo6() {
        // 輸出手続き品目番号情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(dec(12));
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg(null);
        internalVariableDtl.setOriginCntryCd("d");
        internalVariableDtl.setExpLimitTyp("e");
        internalVariableDtl.setPlntCd("f");
        internalVariableDtl.setQtyUnit("g");

        assertThat(chkWs2508ItemNo(internalVariableDtl), is("NNYN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2508ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     *
     * @param internalVariableDtl Ws2501InternalVariableDtlDomain
     * @return チェック結果を表す文字列
     */
    private String chkWs2508ItemNo(Ws2501InternalVariableDtlDomain internalVariableDtl) {
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        bhtEisProductService.chkWs2508ItemNo(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, null);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(NG));

        return itemNoChkFlg.toString();
    }

    /**
     * {@link WsBhtEisProductServiceImpl#addWs2508CmlDtlList(com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain, com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain, StringBuffer, java.util.List)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAddWs2508CmlDtlList() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPltzInstrNo(null);
        internalVariableDtl.setQty(dec(10));
        internalVariableDtl.setOdrQty(dec(20));

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        bhtEisProductService.addWs2508CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, null,  ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(0).getOdrQty(),       is(dec(20)));
        assertThat(ttCmlErrorDtlList.get(0).getLeftInstrQty(), is(nullValue()));
        assertThat(ttCmlErrorDtlList.get(0).getOverInstrQty(), is(nullValue()));

        //---------------------------------------------------------------------

        internalVariableDtl.setPltzInstrNo("NOT_NULL");
        internalVariableDtl.setQty(dec(9));
        internalVariableDtl.setInstrQty(dec(12));
        internalVariableDtl.setPltzQty(dec(2));
        bhtEisProductService.addWs2508CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, "NOT_NULL",  ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(1).getOdrQty(),       is(nullValue()));
        assertThat(ttCmlErrorDtlList.get(1).getLeftInstrQty(), is(dec(10)));
        assertThat(ttCmlErrorDtlList.get(1).getOverInstrQty(), is(nullValue()));

        //---------------------------------------------------------------------

        internalVariableDtl.setPltzInstrNo("NOT_NULL");
        internalVariableDtl.setQty(dec(10));
        internalVariableDtl.setInstrQty(dec(12));
        internalVariableDtl.setPltzQty(dec(2));
        bhtEisProductService.addWs2508CmlDtlList(internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, "NOT_NULL",  ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(2).getOdrQty(),       is(nullValue()));
        assertThat(ttCmlErrorDtlList.get(2).getLeftInstrQty(), is(dec(10)));
        assertThat(ttCmlErrorDtlList.get(2).getOverInstrQty(), is(dec(0)));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#createMixTagNo(String, String)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateMixTagNo() throws ApplicationException {
//        bhtEisProductService.createMixTagNo(shipperCd, whCd);

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        new SpringUtil().setApplicationContext(new GenericApplicationContext());

        DateUtil.formatDate(date, "yyMMdd").substring(1);

        assertThat(bhtEisProductService.createMixTagNo("XXXX", "YYYY", "TEST"), is("MXXXXYYYY" + DateUtil.formatDate(date, "yyMMdd").substring(1) + "1234"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2508Qty(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2508Qty1() throws ApplicationException {

        TtExpRcvOdrDomain ttPltzInstrOdrDomain1 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain1.setOdrQty(dec(100));
        ttPltzInstrOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain2 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain2.setOdrQty(dec(50));
        ttPltzInstrOdrDomain2.setPltzAllocQty(dec(40));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain3 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain3.setOdrQty(dec(100));
        ttPltzInstrOdrDomain3.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain4 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain4.setOdrQty(dec(20));
        ttPltzInstrOdrDomain4.setPltzAllocQty(dec(0));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2,
                ttPltzInstrOdrDomain3,
                ttPltzInstrOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        bhtEisProductService.allocWs2508Qty("HOGE", criteria);
        assertThat(MockObjectManager.getCallCount(TtMixtagOdrServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2508Qty(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2508Qty2() throws ApplicationException {
        // pltzInstrNo is not null
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setPltzInstrNo("NOT_NULL");
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        assertTrue(bhtEisProductService.allocWs2508Qty("HOGE", criteria).isEmpty());
        MockObjectManager.assertNotCalled(TtMixtagOdrServiceImpl.class, "create");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2508Qty(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test(expected = ApplicationException.class)
    public void testAllocWs2508Qty3() throws ApplicationException {
        // ERROR
        TtExpRcvOdrDomain ttPltzInstrOdrDomain1 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain1.setOdrQty(dec(30));
        ttPltzInstrOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttPltzInstrOdrDomain2 = new TtExpRcvOdrDomain();
        ttPltzInstrOdrDomain2.setOdrQty(dec(50));
        ttPltzInstrOdrDomain2.setPltzAllocQty(dec(40));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        bhtEisProductService.allocWs2508Qty("HOGE", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508Kanban(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508Kanban() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlKanbanDomain kanban = new Ws2501InternalVariableDtlKanbanDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(dec(110));
        internalVariableDtl.setInternalVariableDtlKanbanDomainList(asList(kanban));

        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        bhtEisProductService.createWs2508Kanban("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtMixKanbanServiceImpl.class, "create"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508MixTagItemNo(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508MixTagItemNo() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(dec(110));

        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));

        bhtEisProductService.createWs2508MixTagItemNo("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagItemNoServiceImpl.class, "create"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508MixTagRt(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508MixTagRt() throws ApplicationException {

        Ws2501PkgMaterialsDomain pkgMaterials1 = new Ws2501PkgMaterialsDomain();
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 0, pkgMaterials1);

        Ws2501PkgMaterialsDomain pkgMaterials2 = new Ws2501PkgMaterialsDomain();
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 1, pkgMaterials2);

        Ws2501PkgItemNoDomain pkgItemNo1 = new Ws2501PkgItemNoDomain();
        Ws2501PkgItemNoDomain pkgItemNo2 = new Ws2501PkgItemNoDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508PkgItemNoList(asList(pkgItemNo1, pkgItemNo2));

        bhtEisProductService.createWs2508MixTagRt("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagRtServiceImpl.class, "create"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508TtMixTag(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508TtMixTag1() throws ApplicationException {
        // DOOR
        testCreateWs2508TtMixTag(LOADING_CD_DOOR);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508TtMixTag(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508TtMixTag2() throws ApplicationException {
        // BACK
        testCreateWs2508TtMixTag(LOADING_CD_BACK);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508TtMixTag(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508TtMixTag3() throws ApplicationException {
        // FREE
        testCreateWs2508TtMixTag(LOADING_CD_FREE);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508TtMixTag(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @param loadingCd 荷積み位置コード
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private void testCreateWs2508TtMixTag(String loadingCd) throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "kg");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertWeightUnit", ONE);

        Ws2501MixedTagItemNoNwDomain mixedTagItemNoNw = new Ws2501MixedTagItemNoNwDomain();
        mixedTagItemNoNw.setSumItemWeight("1");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagItemNoNw", asList(mixedTagItemNoNw));

        Ws2501MixedTagRtGwDomain mixedTagRtGw = new Ws2501MixedTagRtGwDomain();
        mixedTagRtGw.setSumPkgWeight("1");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagRtGw", asList(mixedTagRtGw));


        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setLoadingCd(loadingCd);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(new Ws2501InternalVariableHdrDomain());
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1));

        bhtEisProductService.createWs2508TtMixTag("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "create"), is(1));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactTmpStock(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactTmpStock() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtTmpStock", Collections.emptyList());

        TtTmpStockDomain tmpStock = new TtTmpStockDomain();
        tmpStock.setQty(dec(1));

        MockObjectManager.setReturnNullAt(TtTmpStockServiceImpl.class, "lockByKeyNoWait", 0);
        MockObjectManager.setReturnValueAt(TtTmpStockServiceImpl.class, "lockByKeyNoWait", 1, tmpStock);

        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setPltzInstrNo(null);
        internalVariableDtl1.setQty(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setPltzInstrNo("HOGE");
        internalVariableDtl2.setQty(dec(1));

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setPltzInstrNo(null);
        internalVariableDtl3.setQty(dec(1));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2508InternalVariableHdrDomain(new Ws2501InternalVariableHdrDomain());
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2, internalVariableDtl3));

        bhtEisProductService.transactTmpStock(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createRcvOdrAllocMixTag(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateRcvOdrAllocMixTag() throws ApplicationException {
//        bhtEisProductService.createRcvOdrAllocMixTag(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2508BhtInfo(String, com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2508BhtInfo() throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp("");

        Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
        productivityDataInfo.setWorkTimeStrt("2014/01/01 08:30:00");
        productivityDataInfo.setWorkTimeEnd("2014/01/01 17:30:00");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWorkTimeStrt("2014/01/01 08:30:00");
        criteria.setWorkTimeEnd("2014/01/01 17:30:00");
        criteria.setWs2508InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2508InternalVariableDtlDomainList(asList(internalVariableDtl));
        criteria.setWs2508ProductivityDataInfoList(asList(productivityDataInfo));
        criteria.setWs2508ItemNoList(new ArrayList<Ws2501ItemNoDomain>());

        bhtEisProductService.createWs2508BhtInfo("HOGE", criteria);
    }
    
    //  -----------------------------------------------------------------------

    /**
     * int 型の数値を BigDecimal に変換して返す。
     *
     * @param i 数値
     * @return BigDecimal オブジェクト
     */
    private static BigDecimal dec(int i) {
        return BigDecimal.valueOf(i);
    }
}