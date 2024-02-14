package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5068;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5069;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0090;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_INNER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_OUTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.gscm.framework.util.DateUtil.parseDate;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.TEN;
import static java.math.BigDecimal.ZERO;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static jp.co.dgic.testing.common.virtualmock.MockObjectManager.assertNotCalled;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;
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
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSetMaterialsNxsCompNmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecMaterialsNameRevDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzInstrInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemDeliveryTimeDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.eca0027.core.integration.WsBhtEisProductDaoImpl;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfServiceImpl;
import com.globaldenso.gscm.framework.business.service.TmUserServiceImpl;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.SpringUtil;

/**
 * {@link WsBhtEisProductServiceImpl} の WS2502 のためのテストクラス
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 11304 $
 */
public class Ws2502WsBhtEisProductServiceTest {

    /** 2 */
    private static final BigDecimal TWO = BigDecimal.valueOf(2);

    /** EIS ProductのWebサービスの実装クラス */
    private WsBhtEisProductServiceImpl bhtEisProductService;

    /** システム日時 */
    private Date date = new Date();

    /**
     * デフォルトコンストラクタ
     */
    public Ws2502WsBhtEisProductServiceTest() {
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

        TmUserConfDomain userConf = new TmUserConfDomain();
        MockObjectManager.setReturnValueAtAllTimes(TmUserConfServiceImpl.class, "searchByKey", userConf);

        TtPltzItemDomain pltzItem = new TtPltzItemDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemServiceImpl.class, "searchByConditionForPaging", asList(pltzItem));

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchNextWorkTimeNo", ONE);

        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkErrServiceImpl.class,     "create");
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkPltzServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkTimeServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtCmlErrorDtlServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtCmlErrorHeaderServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemOdrServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemServiceImpl.class,       "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzKanbanServiceImpl.class,     "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class,           "create");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyItemListCstmr(List)} のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyItemListCstmr() {

        Ws2501ItemNoDomain itemNoDomain = new Ws2501ItemNoDomain();
        assertFalse(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_N);
        assertFalse(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

        itemNoDomain.setItemNo("a");
        itemNoDomain.setPkgCd("a");
        itemNoDomain.setIndusTypCd("a");
        itemNoDomain.setKanbanTyp("a");
        itemNoDomain.setTagSeqNo(ONE);
        itemNoDomain.setKanbanQty(ONE);
        itemNoDomain.setCustomerItemNo("HOGE");
        itemNoDomain.setCustomerTagSeqNo("HOGE");

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_Y);
        itemNoDomain.setItemNo(null);
        assertFalse(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_N);
        itemNoDomain.setItemNo("a");
        itemNoDomain.setCustomerItemNo(null);
        assertFalse(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_Y);
        itemNoDomain.setCustomerItemNo("a");
        itemNoDomain.setCustomerTagSeqNo("a");
        assertFalse(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_N);
        assertTrue(bhtEisProductService.validateConsistencyItemListCstmr(asList(itemNoDomain)));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyOuterNumber(String, String)} のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyOuterNumber() {

        // --------------------------------------------------------------------
        assertFalse(bhtEisProductService.validateConsistencyOuterNumber(null, null));
//        assertFalse(bhtEisProductService.validateConsistencyOuterNumber("", ""));
        assertFalse(bhtEisProductService.validateConsistencyOuterNumber("HOGE", null));
//        assertFalse(bhtEisProductService.validateConsistencyOuterNumber("HOGE", ""));

        // --------------------------------------------------------------------
        assertFalse(bhtEisProductService.validateConsistencyOuterNumber(null, FLAG_Y));
//        assertFalse(bhtEisProductService.validateConsistencyOuterNumber("", FLAG_Y));
        assertTrue(bhtEisProductService.validateConsistencyOuterNumber("HOGE", FLAG_Y));

        // --------------------------------------------------------------------
        assertTrue(bhtEisProductService.validateConsistencyOuterNumber(null, FLAG_N));
//        assertTrue(bhtEisProductService.validateConsistencyOuterNumber("", FLAG_N));
        assertTrue(bhtEisProductService.validateConsistencyOuterNumber("HOGE", FLAG_N));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyPkgMtrlItemList(List)} のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyPkgMtrlItemList() {

        // --------------------------------------------------------------------
        Ws2501PkgItemNoDomain pkgItemNo = new Ws2501PkgItemNoDomain();
        assertTrue(bhtEisProductService.validateConsistencyPkgMtrlItemList(asList(pkgItemNo)));

        // --------------------------------------------------------------------
        pkgItemNo.setPkgItemNo("FOO");
        pkgItemNo.setPkgQty(null);
        assertFalse(bhtEisProductService.validateConsistencyPkgMtrlItemList(asList(pkgItemNo)));

        // --------------------------------------------------------------------
        pkgItemNo.setPkgItemNo(null);
        pkgItemNo.setPkgQty(ONE);
        assertFalse(bhtEisProductService.validateConsistencyPkgMtrlItemList(asList(pkgItemNo)));

        // --------------------------------------------------------------------
        pkgItemNo.setPkgItemNo("FOO");
        pkgItemNo.setPkgQty(ONE);
        assertTrue(bhtEisProductService.validateConsistencyPkgMtrlItemList(asList(pkgItemNo)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyPrdctData(String, String, List)} のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyPrdctData() {

        // --------------------------------------------------------------------
        assertFalse(bhtEisProductService.validateConsistencyPrdctData(null, null, new ArrayList<Ws2501ProductivityDataInfoDomain>()));
        assertFalse(bhtEisProductService.validateConsistencyPrdctData(null, "00:00", new ArrayList<Ws2501ProductivityDataInfoDomain>()));
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", null, new ArrayList<Ws2501ProductivityDataInfoDomain>()));

        Ws2501ProductivityDataInfoDomain info = new Ws2501ProductivityDataInfoDomain();
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId(null);
        info.setMsgId("b");
        info.setLockFlg("c");
        info.setWorkTimeStrt("d");
        info.setWorkTimeEnd("e");
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId("a");
        info.setMsgId(null);
        info.setLockFlg("c");
        info.setWorkTimeStrt("d");
        info.setWorkTimeEnd("e");
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId("a");
        info.setMsgId("b");
        info.setLockFlg(null);
        info.setWorkTimeStrt("d");
        info.setWorkTimeEnd("e");
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId("a");
        info.setMsgId("b");
        info.setLockFlg("c");
        info.setWorkTimeStrt(null);
        info.setWorkTimeEnd("e");
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId("a");
        info.setMsgId("b");
        info.setLockFlg("c");
        info.setWorkTimeStrt("d");
        info.setWorkTimeEnd(null);
        assertFalse(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

        info.setScreenId("a");
        info.setMsgId("b");
        info.setLockFlg("c");
        info.setWorkTimeStrt("d");
        info.setWorkTimeEnd("e");
        assertTrue(bhtEisProductService.validateConsistencyPrdctData("00:00", "00:00", asList(info)));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgMaterialsOnInstrPltz(String[], List, List)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnInstrPltz() throws ApplicationException {
        MockObjectManager.setReturnNullAt(TmPkgMtrlServiceImpl.class, "searchByKey", 0);
        assertTrue(bhtEisProductService.validateDatabaseTmPkgMaterialsOnInstrPltz(new String[1], new ArrayList<String>(), new ArrayList<String>()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetDtlOnInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetDtlOnInstrPltz() throws ApplicationException {
        assertNull(bhtEisProductService.validateDatabaseTmPkgSetDtlOnInstrPltz(null, null, new String[1], new String[1], new TmPkgSetHdrDomain()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDtOnInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtOnInstrPltz() throws ApplicationException {
        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnInstrPltz(new String[1], new ArrayList<Ws2501ItemNoDomain>(), new String[1], new Ws2501PkgSpecDomain()).isEmpty());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnInstPltz1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());

        //  -------------------------------------------------------------------
        // searchWs2502HeaderData

        Ws2501PltzInstrInfoDomain pltzInstrInfo = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo.setShipToCd("a");
        pltzInstrInfo.setConsigneeCompCd("b");
        pltzInstrInfo.setPlntCd("c");
        pltzInstrInfo.setWhCompCd("d");
        pltzInstrInfo.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo);

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        // -------------------------------------------------------------------
        // searchWs2502DetailData

        Ws2501ItemNoNxsDomain itemNoNxs = new Ws2501ItemNoNxsDomain();
        itemNoNxs.setItemNo("ITEM_A");
        itemNoNxs.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxs.setInvoiceKey("IK");
        itemNoNxs.setContainerSortingKey("CSK");
        itemNoNxs.setPackedQty(ONE);
        itemNoNxs.setInstrQty(ONE);
        itemNoNxs.setSumQty(TWO);
        itemNoNxs.setLoadingCd(LOADING_CD_DOOR);
        itemNoNxs.setStgInstrItemFlg(FLAG_N);
        itemNoNxs.setContainerLooseTyp("CLT");
        itemNoNxs.setCustomTimingTyp("CTT");
        itemNoNxs.setNetWeightA(ONE);
        itemNoNxs.setLotSize(ONE);
        itemNoNxs.setQty(ONE);
        itemNoNxs.setDngrItemFlg(FLAG_N);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxs", itemNoNxs);

        //  -------------------------------------------------------------------
        // searchWs2502CigmaInfo

        Ws2004ResultItemDomain item = new Ws2004ResultItemDomain();
        item.setItnbr("ITEM_A");
        item.setCurr3("CC");
        item.setMohtq("1");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        List<TmMeasureUnitDomain> tmMeasureUnitList = new ArrayList<TmMeasureUnitDomain>();
        tmMeasureUnitList.add(new TmMeasureUnitDomain());
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", tmMeasureUnitList);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        //  -------------------------------------------------------------------

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain1 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain1.setAllocQty(BigDecimal.valueOf(100));
        ttPltzInstrOdrDomain1.setPackedQty(BigDecimal.valueOf(20));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain2 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain2.setAllocQty(BigDecimal.valueOf(50));
        ttPltzInstrOdrDomain2.setPackedQty(BigDecimal.valueOf(40));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain3 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain3.setAllocQty(BigDecimal.valueOf(100));
        ttPltzInstrOdrDomain3.setPackedQty(BigDecimal.valueOf(20));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain4 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain4.setAllocQty(BigDecimal.valueOf(30));
        ttPltzInstrOdrDomain4.setPackedQty(TEN);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2,
                ttPltzInstrOdrDomain3,
                ttPltzInstrOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        List<Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevList = new ArrayList<Ws2501PkgSpecMaterialsNameRevDomain>();
        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev1 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev1.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev1.setPkgUsedQty(BigDecimal.valueOf(4));
        pkgSpecMaterialsNameRev1.setLotSize(BigDecimal.valueOf(50));
        pkgSpecMaterialsNameRev1.setQty(TWO);
        pkgSpecMaterialsNameRev1.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev1.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev1);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev2 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev2.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev2.setPkgUsedQty(BigDecimal.valueOf(8));
        pkgSpecMaterialsNameRev2.setLotSize(BigDecimal.valueOf(20));
        pkgSpecMaterialsNameRev2.setQty(TEN);
        pkgSpecMaterialsNameRev2.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev2.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev2);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev3 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev3.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev3.setPkgUsedQty(BigDecimal.valueOf(30));
        pkgSpecMaterialsNameRev3.setLotSize(BigDecimal.valueOf(80));
        pkgSpecMaterialsNameRev3.setQty(BigDecimal.valueOf(3));
        pkgSpecMaterialsNameRev3.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev3.setRtTyp(PKG_TYP_OUTER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev3);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev4 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev4.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev4.setPkgUsedQty(BigDecimal.valueOf(150));
        pkgSpecMaterialsNameRev4.setLotSize(BigDecimal.valueOf(50));
        pkgSpecMaterialsNameRev4.setQty(TWO);
        pkgSpecMaterialsNameRev4.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev4.setRtTyp(PKG_TYP_OUTER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev4);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev5 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev5.setPkgItemNo("PKG03");
        pkgSpecMaterialsNameRev5.setPkgUsedQty(BigDecimal.valueOf(3));
        pkgSpecMaterialsNameRev5.setLotSize(BigDecimal.valueOf(20));
        pkgSpecMaterialsNameRev5.setQty(TEN);
        pkgSpecMaterialsNameRev5.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev5.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev5);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpecMaterialsNameRev", pkgSpecMaterialsNameRevList);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "kg");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchLengthUnit", "m");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchVolumeUnit", "L");

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertLengthUnit", ONE);
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertVolumeUnit", TEN);

        Ws2501TtPltzItemNwDomain pltzItemNw = new Ws2501TtPltzItemNwDomain();
        pltzItemNw.setNetWeight(ONE);
        pltzItemNw.setWeightUnit("kg");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemNw", asList(pltzItemNw));

        Ws2501TtPltzItemGwDomain pltzItemGw = new Ws2501TtPltzItemGwDomain();
        pltzItemGw.setNetWeight(ONE);
        pltzItemGw.setWeightUnit("kg");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemGw", asList(pltzItemGw));

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = new Ws2501TtPltzItemDeliveryTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemDeliveryTime", ttPltzItemDeliveryTime);

        //  -------------------------------------------------------------------

        TtPltzInstrItemNoDomain pltzInstrItemNo = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo.setPackedQty(ONE);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "searchByKey", pltzInstrItemNo);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "searchByCondition", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        TtBhtWorkTimeDomain workTime = new TtBhtWorkTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkTimeServiceImpl.class, "searchByConditionForPaging", singletonList(workTime));

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "searchByCondition", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemByKanban", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "searchByCondition", emptyList());

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchUnpackagedItemNo", emptyList());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("ITEM_A");
        itemNo.setMixTagFlg(FLAG_N);
        itemNo.setKanbanQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNexusWhFlg(FLAG_Y);
        criteria.setWorkTimeStrt("2000/04/01 09:00:00");
        criteria.setWorkTimeEnd("2000/04/01 17:30:00");
        criteria.setWs2502ItemNoList(asList(itemNo));
        criteria.setWs2502pkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2502ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());
        criteria.setWs2502InternalVariableHdrDomain(header);

        bhtEisProductService.transactOnInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnInstPltz2() throws ApplicationException {
        // ERROR1
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());
        MockObjectManager.setReturnNullAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);

        bhtEisProductService.transactOnInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnInstPltz3() throws ApplicationException {
        // ERROR2
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());

        Ws2501PltzInstrInfoDomain pltzInstrInfo = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo);

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);

        bhtEisProductService.transactOnInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnInstPltz4() throws ApplicationException {
        // ERROR3
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());

        //  -------------------------------------------------------------------
        // searchWs2502HeaderData

        Ws2501PltzInstrInfoDomain pltzInstrInfo = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo.setShipToCd("a");
        pltzInstrInfo.setConsigneeCompCd("b");
        pltzInstrInfo.setPlntCd("c");
        pltzInstrInfo.setWhCompCd("d");
        pltzInstrInfo.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo);

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        // -------------------------------------------------------------------
        // searchWs2502DetailData

        Ws2501ItemNoNxsDomain itemNoNxs1 = new Ws2501ItemNoNxsDomain();
        itemNoNxs1.setItemNo("ITEM_A");
        itemNoNxs1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxs1.setInvoiceKey("IK");
        itemNoNxs1.setContainerSortingKey("CSK");
        itemNoNxs1.setPackedQty(ONE);
        itemNoNxs1.setInstrQty(ONE);
        itemNoNxs1.setSumQty(TWO);
        itemNoNxs1.setLoadingCd(LOADING_CD_DOOR);
        itemNoNxs1.setStgInstrItemFlg(FLAG_N);
        itemNoNxs1.setContainerLooseTyp("CLT");
        itemNoNxs1.setCustomTimingTyp("CTT");
        itemNoNxs1.setNetWeightA(ONE);
        itemNoNxs1.setLotSize(ONE);
        itemNoNxs1.setQty(ONE);
        itemNoNxs1.setDngrItemFlg(FLAG_N);

        Ws2501ItemNoNxsDomain itemNoNxs2 = new Ws2501ItemNoNxsDomain();
        itemNoNxs2.setItemNo("ITEM_A");
        itemNoNxs2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        itemNoNxs2.setInvoiceKey("IK");
        itemNoNxs2.setContainerSortingKey("CSK");
        itemNoNxs2.setPackedQty(ONE);
        itemNoNxs2.setInstrQty(ONE);
        itemNoNxs2.setSumQty(TWO);
        itemNoNxs2.setLoadingCd(LOADING_CD_DOOR);
        itemNoNxs2.setStgInstrItemFlg(FLAG_N);
        itemNoNxs2.setContainerLooseTyp("CLT");
        itemNoNxs2.setCustomTimingTyp("CTT");
        itemNoNxs2.setNetWeightA(ONE);
        itemNoNxs2.setLotSize(ONE);
        itemNoNxs2.setQty(ONE);
        itemNoNxs2.setDngrItemFlg(FLAG_N);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchItemNoNxs", 0, itemNoNxs1);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchItemNoNxs", 1, itemNoNxs2);

        //  -------------------------------------------------------------------
        // searchWs2502CigmaInfo

        Ws2004ResultItemDomain item = new Ws2004ResultItemDomain();
        item.setItnbr("ITEM_A");
        item.setCurr3("CC");
        item.setMohtq("1");
        
        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setCurr3("CC");
        item2.setMohtq("1");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        List<TmMeasureUnitDomain> tmMeasureUnitList = new ArrayList<TmMeasureUnitDomain>();
        tmMeasureUnitList.add(new TmMeasureUnitDomain());
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", tmMeasureUnitList);

        //  -------------------------------------------------------------------

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNo1.setItemNo("ITEM_A");
        itemNo1.setMixTagFlg(FLAG_N);
        itemNo1.setKanbanQty(dec(110));

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo2.setItemNo("ITEM_B");
        itemNo2.setMixTagFlg(FLAG_N);
        itemNo2.setKanbanQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNexusWhFlg(FLAG_Y);
        criteria.setWorkTimeStrt("2000/04/01 09:00:00");
        criteria.setWorkTimeEnd("2000/04/01 17:30:00");
        criteria.setWs2502ItemNoList(asList(itemNo1, itemNo2));
        criteria.setWs2502pkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2502ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());
        criteria.setWs2502InternalVariableHdrDomain(new Ws2501InternalVariableHdrDomain());

        bhtEisProductService.transactOnInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnInstPltz5() throws ApplicationException {
        // ERROR4
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());

        //  -------------------------------------------------------------------
        // searchWs2502HeaderData

        Ws2501PltzInstrInfoDomain pltzInstrInfo = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo.setShipToCd("a");
        pltzInstrInfo.setConsigneeCompCd("b");
        pltzInstrInfo.setPlntCd("c");
        pltzInstrInfo.setWhCompCd("d");
        pltzInstrInfo.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo);

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        // -------------------------------------------------------------------
        // searchWs2502DetailData

        Ws2501ItemNoNxsDomain itemNoNxs = new Ws2501ItemNoNxsDomain();
        itemNoNxs.setItemNo("ITEM_A");
        itemNoNxs.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        itemNoNxs.setInvoiceKey("IK");
        itemNoNxs.setContainerSortingKey("CSK");
        itemNoNxs.setPackedQty(ONE);
        itemNoNxs.setInstrQty(ONE);
        itemNoNxs.setSumQty(TWO);
        itemNoNxs.setLoadingCd(LOADING_CD_DOOR);
        itemNoNxs.setStgInstrItemFlg(FLAG_N);
        itemNoNxs.setContainerLooseTyp("CLT");
        itemNoNxs.setCustomTimingTyp("CTT");
        itemNoNxs.setNetWeightA(ONE);
        itemNoNxs.setLotSize(ONE);
        itemNoNxs.setQty(ONE);
        itemNoNxs.setDngrItemFlg(FLAG_N);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxs", itemNoNxs);

        //  -------------------------------------------------------------------
        // searchWs2502CigmaInfo

        Ws2004ResultItemDomain item = new Ws2004ResultItemDomain();
        item.setItnbr("ITEM_A");
        item.setCurr3("CC");
        item.setMohtq("1");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        List<TmMeasureUnitDomain> tmMeasureUnitList = new ArrayList<TmMeasureUnitDomain>();
        tmMeasureUnitList.add(new TmMeasureUnitDomain());
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", tmMeasureUnitList);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("ITEM_A");
        itemNo.setMixTagFlg(FLAG_N);
        itemNo.setKanbanQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNexusWhFlg(FLAG_Y);
        criteria.setWorkTimeStrt("2000/04/01 09:00:00");
        criteria.setWorkTimeEnd("2000/04/01 17:30:00");
        criteria.setWs2502ItemNoList(asList(itemNo));
        criteria.setWs2502pkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2502ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());
        criteria.setWs2502InternalVariableHdrDomain(header);

        bhtEisProductService.transactOnInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2502LockByPltzInstrNo(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2502LockByPltzInstrNo() throws ApplicationException {
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", singletonList(new TtPltzInstrItemNoDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", singletonList(new TtPltzInstrOdrDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag", new ArrayList<Object>());

        bhtEisProductService.ws2502LockByPltzInstrNo("FOO");

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "lockByKeyNoWait"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr"), is(1));
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByConditionNoWaitTtMixTag"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#ws2502LockByPltzInstrNo(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2502LockByPltzInstrNo2() throws ApplicationException {

        MockObjectManager.setReturnNullAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait");

        try {
            bhtEisProductService.ws2502LockByPltzInstrNo("FOO");
            fail();
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
     * {@link WsBhtEisProductServiceImpl#ws2502LockByPltzInstrNo(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2502LockByPltzInstrNo3() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", new ArrayList<Object>());

        try {
            bhtEisProductService.ws2502LockByPltzInstrNo("FOO");
            fail();
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
     * {@link WsBhtEisProductServiceImpl#ws2502LockByPltzInstrNo(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testWs2502LockByPltzInstrNo4() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "lockByKeyNoWait", new TtPltzInstrDomain());
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrItemNo", singletonList(new TtPltzInstrItemNoDomain()));
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtPltzInstrOdr", new ArrayList<Object>());

        try {
            bhtEisProductService.ws2502LockByPltzInstrNo("FOO");
            fail();
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
     * {@link WsBhtEisProductServiceImpl#searchWs2502HeaderData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502HeaderData1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        Ws2501PltzInstrInfoDomain pltzInstrInfo1 = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo1.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo1);


        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);
        header.setPltzInstrNo("FOO");

        assertNull(bhtEisProductService.searchWs2502HeaderData(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502HeaderData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502HeaderData2() throws ApplicationException {
        // NXS_E1_5038
        MockObjectManager.setReturnNullAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);
        header.setPltzInstrNo("FOO");

        assertThat(bhtEisProductService.searchWs2502HeaderData(criteria), is(NXS_E1_5038));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502HeaderData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502HeaderData3() throws ApplicationException {
        // NXS_E1_0060
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", false);


        Ws2501PltzInstrInfoDomain pltzInstrInfo = new Ws2501PltzInstrInfoDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", pltzInstrInfo);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);
        header.setPltzInstrNo("FOO");

        assertThat(bhtEisProductService.searchWs2502HeaderData(criteria), is(NXS_E1_5062));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502HeaderData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502HeaderData4() throws ApplicationException {
        // NXS_E1_5015
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", true);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(header);
        header.setPltzInstrNo("FOO");

        // --------------------------------------------------------------------

        Ws2501PltzInstrInfoDomain pltzInstrInfo1 = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo1.setPltzInstrStatus(PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo1);

        assertThat(bhtEisProductService.searchWs2502HeaderData(criteria), is(NXS_E1_5015));

        // --------------------------------------------------------------------

        Ws2501PltzInstrInfoDomain pltzInstrInfo2 = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo2.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_CREATE);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo2);

        assertThat(bhtEisProductService.searchWs2502HeaderData(criteria), is(NXS_E1_5015));

        // --------------------------------------------------------------------

        Ws2501PltzInstrInfoDomain pltzInstrInfo3 = new Ws2501PltzInstrInfoDomain();
        pltzInstrInfo3.setPltzInstrStatus(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPltzInstrInfo", 0, pltzInstrInfo3);

        assertThat(bhtEisProductService.searchWs2502HeaderData(criteria), is(NXS_E1_5015));
    }

    /**
     *
     * {@link WsBhtEisProductServiceImpl#chkWs2502CompWh(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502CompWh() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        header.setPalletNo("1");
        header.setShipperCd("2");
        header.setPltzInstrNo("3");
        header.setCustomerCd("4");
        header.setLgcyShipTo("5");
        header.setTrnsCd("6");
        header.setPlntCd("7");
        header.setLgcyWhCd("8");

        criteria.setWs2502InternalVariableHdrDomain(header);

        Timestamp[] ts = new Timestamp[1];

        // --------------------------------------------------------------------
        header.setShipToCd("a");
        header.setConsigneeCompCd("b");
        header.setPlntCd("c");
        header.setWhCompCd("d");
        assertTrue(bhtEisProductService.chkWs2502CompWh(criteria, ts));

        // --------------------------------------------------------------------
        // 送荷先存在チェック
        header.setShipToCd(null);
        header.setConsigneeCompCd("b");
        header.setPlntCd("c");
        header.setWhCompCd("d");
        assertFalse(bhtEisProductService.chkWs2502CompWh(criteria, ts));

        // --------------------------------------------------------------------
        // 荷受人存在チェック
        header.setShipToCd("a");
        header.setConsigneeCompCd(null);
        header.setPlntCd("c");
        header.setWhCompCd("d");
        assertFalse(bhtEisProductService.chkWs2502CompWh(criteria, ts));

        // --------------------------------------------------------------------
        // LEGACY 工場、倉庫存在チェック
        header.setShipToCd("a");
        header.setConsigneeCompCd("b");
        header.setPlntCd(null);
        header.setWhCompCd("d");
        assertFalse(bhtEisProductService.chkWs2502CompWh(criteria, ts));

        // --------------------------------------------------------------------
        // NEXUS倉庫会社、NEXUS倉庫存在チェック
        header.setShipToCd("a");
        header.setConsigneeCompCd("b");
        header.setPlntCd("c");
        header.setWhCompCd(null);
        assertFalse(bhtEisProductService.chkWs2502CompWh(criteria, ts));

        // --------------------------------------------------------------------
        header.setShipToCd(null);
        header.setConsigneeCompCd(null);
        header.setPlntCd(null);
        header.setWhCompCd(null);
        assertFalse(bhtEisProductService.chkWs2502CompWh(criteria, ts));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502DetailData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502DetailData() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        criteria.setWs2502ItemNoList(itemNoList);

        Ws2501InternalVariableHdrDomain ws2502InternalVariableHdrDomain = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(ws2502InternalVariableHdrDomain);

        bhtEisProductService.searchWs2502DetailData(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#initWs2502InternalVariableDtl(WsBhtEisProductCriteriaDomain)} のテスト
     */
    @Test
    public void testInitInternalVariableDtl() {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();
        criteria.setWs2502ItemNoList(itemNoList);

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

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNo2.setItemNo("ITEM_2");
        itemNo2.setPkgCd("PKG_2");
        itemNo2.setCustomerItemNo("a");
        itemNo2.setMixTagFlg(FLAG_Y);
        itemNo2.setKanbanQty(TWO);
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
        itemNo3.setKanbanQty(BigDecimal.valueOf(3));
        itemNo3.setIndusTypCd("b");
        itemNo3.setKanbanTyp("c");
        itemNo3.setTagSeqNo(ONE);
        itemNo3.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo3);

        Ws2501ItemNoDomain itemNo4 = new Ws2501ItemNoDomain();
        itemNo4.setItemNo("ITEM_1");
        itemNo4.setPkgCd("PKG_1");
        itemNo4.setCustomerItemNo("a");
        itemNo4.setMixTagFlg(FLAG_N);
        itemNo4.setKanbanQty(BigDecimal.valueOf(4));
        itemNo4.setIndusTypCd("b");
        itemNo4.setKanbanTyp("c");
        itemNo4.setTagSeqNo(ONE);
        itemNo4.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo4);

        Ws2501ItemNoDomain itemNo5 = new Ws2501ItemNoDomain();
        itemNo5.setItemNo("ITEM_3");
        itemNo5.setPkgCd("PKG_1");
        itemNo5.setCustomerItemNo("a");
        itemNo5.setMixTagFlg(FLAG_N);
        itemNo5.setKanbanQty(BigDecimal.valueOf(5));
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
        itemNo6.setKanbanQty(BigDecimal.valueOf(6));
        itemNo6.setIndusTypCd("b");
        itemNo6.setKanbanTyp("c");
        itemNo6.setTagSeqNo(ONE);
        itemNo6.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo6);

        Ws2501ItemNoDomain itemNo7 = new Ws2501ItemNoDomain();
        itemNo7.setItemNo("ITEM_1");
        itemNo7.setPkgCd("PKG_1");
        itemNo7.setCustomerItemNo("a");
        itemNo7.setMixTagFlg(FLAG_N);
        itemNo7.setKanbanQty(BigDecimal.valueOf(7));
        itemNo7.setIndusTypCd("b");
        itemNo7.setKanbanTyp("c");
        itemNo7.setTagSeqNo(ONE);
        itemNo7.setCustomerTagSeqNo("1");
        itemNoList.add(itemNo7);

        bhtEisProductService.initWs2502InternalVariableDtl(criteria);

        assertThat(criteria.getWs2502InternalVariableDtlDomainList().size(), is(4));

        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(0).getQty().intValue(), is(12));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(1).getQty().intValue(), is(2));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(2).getQty().intValue(), is(3));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(3).getQty().intValue(), is(11));

        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(0).getTagQty().intValue(), is(3));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(1).getTagQty().intValue(), is(1));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(2).getTagQty().intValue(), is(1));
        assertThat(criteria.getWs2502InternalVariableDtlDomainList().get(3).getTagQty().intValue(), is(2));

        assertThat(criteria.getMaxSeq().intValue(), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502NexusInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502NexusInfo() throws ApplicationException {

        Ws2501ItemNoNxsDomain itemNoNxs = new Ws2501ItemNoNxsDomain();
        itemNoNxs.setPackedQty(ONE);
        itemNoNxs.setSumQty(TWO);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxs", itemNoNxs);

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtlList.add(internalVariableDtl1);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl2);

        bhtEisProductService.searchWs2502NexusInfo(criteria);

        assertThat(internalVariableDtl1.getDataGetFlg(), is(FLAG_Y));
        assertThat(internalVariableDtl2.getDataGetFlg(), is(not(FLAG_Y)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502CigmaInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502CigmaInfo1() throws ApplicationException {

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        List<Ws2004ResultItemDomain> itemList = new ArrayList<Ws2004ResultItemDomain>();
        result.setItemList(itemList);

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        itemList.add(item1);

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_A");
        item2.setMohtq("20");
        itemList.add(item2);

        Ws2004ResultItemDomain item3 = new Ws2004ResultItemDomain();
        item3.setItnbr("ITEM_B");
        item3.setMohtq("30");
        itemList.add(item3);


        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);


        List<TmMeasureUnitDomain> tmMeasureUnitList = new ArrayList<TmMeasureUnitDomain>();
        tmMeasureUnitList.add(new TmMeasureUnitDomain());
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", tmMeasureUnitList);

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setTmpStockQty(ONE);
        internalVariableDtlList.add(internalVariableDtl1);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setTmpStockQty(TWO);
        internalVariableDtlList.add(internalVariableDtl2);

        bhtEisProductService.searchWs2502CigmaInfo(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502CigmaInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502CigmaInfo2() throws ApplicationException {
        // EMPTY
        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", new Ws2004ResultDomain());

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl1);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl2);

        bhtEisProductService.searchWs2502CigmaInfo(criteria);

        assertThat(MockObjectManager.getCallCount(Ws2004RestServiceImpl.class, "searchItemInfoForCml"), is(0));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502MixInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502MixInfo() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "searchByKey", new TtMixtagDomain());

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtlList.add(internalVariableDtl1);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl2);

        bhtEisProductService.searchWs2502MixInfo(criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "searchByKey"), is(1));
        assertThat(internalVariableDtl1.getDataGetFlg(), is(not(FLAG_Y)));
        assertThat(internalVariableDtl2.getDataGetFlg(), is(FLAG_Y));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2502MixItemInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2502MixItemInfo() throws ApplicationException {

        List<Ws2501MixedTagItemDomain> mixedTagItemList = new ArrayList<Ws2501MixedTagItemDomain>();
        Ws2501MixedTagItemDomain mixedTagItem1 = new Ws2501MixedTagItemDomain();
        mixedTagItemList.add(mixedTagItem1);

        Ws2501MixedTagItemDomain mixedTagItem2 = new Ws2501MixedTagItemDomain();
        mixedTagItemList.add(mixedTagItem2);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagItem", mixedTagItemList);

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMaxSeq(TEN);

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlList);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtlList.add(internalVariableDtl1);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl2);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setMixTagFlg(FLAG_Y);
        internalVariableDtlList.add(internalVariableDtl3);

        bhtEisProductService.searchWs2502MixItemInfo(criteria);

        @SuppressWarnings("unchecked")
        List <Ws2501InternalVariableDtlDomain> InternalVariableMixItemNoDomainList = (List <Ws2501InternalVariableDtlDomain>) criteria.getWs2502InternalVariableMixItemNoDomainList();
        assertThat(InternalVariableMixItemNoDomainList.size(), is(4));
        assertThat(InternalVariableMixItemNoDomainList.get(0).getSeq().intValue(), is(11));
        assertThat(InternalVariableMixItemNoDomainList.get(1).getSeq().intValue(), is(12));
        assertThat(InternalVariableMixItemNoDomainList.get(2).getSeq().intValue(), is(13));
        assertThat(InternalVariableMixItemNoDomainList.get(3).getSeq().intValue(), is(14));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502OuterPkgCd(WsBhtEisProductCriteriaDomain)} のテスト
     */
    @Test
    public void testChkWs2502OuterPkgCd() {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        header.setOuterPkgCd("HOGE");
        criteria.setWs2502InternalVariableHdrDomain(header);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setQty(ONE);
        internalVariableDtl1.setLotSize(TWO);
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertTrue(bhtEisProductService.chkWs2502OuterPkgCd(criteria));

        //---------------------------------------------------------------------

        header.setOuterPkgCd(null);

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertFalse(bhtEisProductService.chkWs2502OuterPkgCd(criteria));

        //---------------------------------------------------------------------

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setQty(ONE);
        internalVariableDtl1.setQty(ONE);
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertFalse(bhtEisProductService.chkWs2502OuterPkgCd(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createMainMark(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateMainMark() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        new SpringUtil().setApplicationContext(new GenericApplicationContext());

        DateUtil.formatDate(date, "yyMMdd").substring(1);

        assertThat(bhtEisProductService.createMainMark("XXX", "YYYY", "TEST"), is("DXXXYYYY" + DateUtil.formatDate(date, "yyMMdd").substring(1) + "1234"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2502Qty(boolean, String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2502Qty() throws ApplicationException {

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain1 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain1.setAllocQty(BigDecimal.valueOf(100));
        ttPltzInstrOdrDomain1.setPackedQty(BigDecimal.valueOf(20));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain2 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain2.setAllocQty(BigDecimal.valueOf(50));
        ttPltzInstrOdrDomain2.setPackedQty(BigDecimal.valueOf(40));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain3 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain3.setAllocQty(BigDecimal.valueOf(100));
        ttPltzInstrOdrDomain3.setPackedQty(BigDecimal.valueOf(20));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain4 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain4.setAllocQty(BigDecimal.valueOf(30));
        ttPltzInstrOdrDomain4.setPackedQty(TEN);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2,
                ttPltzInstrOdrDomain3,
                ttPltzInstrOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "updateByCondition", 1);

        WsBhtEisProductCriteriaDomain bhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        bhtEisProductCriteriaDomain.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(TEN);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(BigDecimal.valueOf(110));

        bhtEisProductCriteriaDomain.setWs2502InternalVariableDtlDomainList(asList(
                internalVariableDtl1,
                internalVariableDtl2
        ));

        bhtEisProductService.allocWs2502Qty(false, "HOGE", bhtEisProductCriteriaDomain);
        assertThat(MockObjectManager.getCallCount(TtPltzItemOdrServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2502Qty(boolean, String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2502QtyForMixItemNo() throws ApplicationException {

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain1 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain1.setAllocQty(BigDecimal.valueOf(30));
        ttPltzInstrOdrDomain1.setPackedQty(BigDecimal.valueOf(20));

        TtPltzInstrOdrDomain ttPltzInstrOdrDomain2 = new TtPltzInstrOdrDomain();
        ttPltzInstrOdrDomain2.setAllocQty(BigDecimal.valueOf(50));
        ttPltzInstrOdrDomain2.setPackedQty(BigDecimal.valueOf(40));

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "searchByCondition", asList(
                ttPltzInstrOdrDomain1,
                ttPltzInstrOdrDomain2
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrOdrServiceImpl.class, "updateByCondition", 1);

        WsBhtEisProductCriteriaDomain bhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        bhtEisProductCriteriaDomain.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(BigDecimal.valueOf(110));

        bhtEisProductCriteriaDomain.setWs2502InternalVariableMixItemNoDomainList(asList(internalVariableDtl1));

        try {
            bhtEisProductService.allocWs2502Qty(true, "HOGE", bhtEisProductCriteriaDomain);
            fail("Exception 未発生");
        } catch (ApplicationException e) {
            assertThat(e.getCode(), is(NXS_E7_0090));
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItem(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItem() throws ApplicationException {

        WsBhtEisProductCriteriaDomain bhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        bhtEisProductCriteriaDomain.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setMixTagFlg(FLAG_Y);
        internalVariableDtl.setQty(TWO);
        internalVariableDtl.setItemWeight(TEN);
        internalVariableDtl.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
        bhtEisProductCriteriaDomain.setWs2502InternalVariableDtlDomainList(Arrays.asList(internalVariableDtl));

        Ws2501InternalVariableDtlDomain internalVariableDtlMix = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlMix.setQty(TWO);
        internalVariableDtlMix.setItemWeight(TEN);
        bhtEisProductCriteriaDomain.setWs2502InternalVariableMixItemNoDomainList(Arrays.asList(internalVariableDtlMix));

        bhtEisProductService.createWs2502PltzItem("", bhtEisProductCriteriaDomain);

        MockObjectManager.assertCalled(TtPltzItemServiceImpl.class, "create");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createTtPltzItemDomains(String, WsBhtEisProductCriteriaDomain)} のテスト
     * 
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateTtPltzItemDomains() throws Exception {

        WsBhtEisProductCriteriaDomain bhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        bhtEisProductCriteriaDomain.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());

        internalVariableDtls.get(0).setMixTagFlg(FLAG_Y);
        internalVariableDtls.get(0).setQty(TWO);
        internalVariableDtls.get(0).setItemWeight(TEN);
        internalVariableDtls.get(0).setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);

        internalVariableDtls.get(1).setMixTagFlg(FLAG_N);
        internalVariableDtls.get(1).setQty(TWO);
        internalVariableDtls.get(1).setItemWeight(TEN);
        internalVariableDtls.get(1).setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);

        bhtEisProductCriteriaDomain.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        Ws2501InternalVariableDtlDomain internalVariableDtlMix = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlMix.setQty(TWO);
        internalVariableDtlMix.setItemWeight(TEN);
        bhtEisProductCriteriaDomain.setWs2502InternalVariableMixItemNoDomainList(Arrays.asList(internalVariableDtlMix));

        bhtEisProductService.createTtPltzItemDomains("", bhtEisProductCriteriaDomain);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createTtPltzItemDomainForItemNo(String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain)} のテスト
     * 
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateTtPltzItemDomainForItemNo() throws Exception {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(TWO);
        internalVariableDtl.setItemWeight(TEN);

        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);

        @SuppressWarnings("unused")
        TtPltzItemDomain pltzItem = bhtEisProductService.createTtPltzItemDomainForItemNo("HOGE", internalVariableHdr, internalVariableDtl);
        assertThat(pltzItem, is(notNullValue()));

        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        pltzItem = bhtEisProductService.createTtPltzItemDomainForItemNo("HOGE", internalVariableHdr, internalVariableDtl);
        assertThat(pltzItem, is(notNullValue()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createTtPltzItemDomainForMixItemNo(String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain)} のテスト
     * 
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateTtPltzItemDomainForMixItemNo() throws Exception {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(TWO);
        internalVariableDtl.setItemWeight(TEN);

        @SuppressWarnings("unused")
        TtPltzItemDomain pltzItem = bhtEisProductService.createTtPltzItemDomainForMixItemNo("HOGE", internalVariableHdr, internalVariableDtl);
        assertThat(pltzItem, is(notNullValue()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItemPkg() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        criteria.setWs2502pkgItemNoList(pkgItemNoList);

        bhtEisProductService.createWs2502PltzItemPkg("", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkgByPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItemPkgByPkg() throws ApplicationException {

        List<Ws2501PkgSpecMaterialsNameRevDomain> pkgSpecMaterialsNameRevList = new ArrayList<Ws2501PkgSpecMaterialsNameRevDomain>();
        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev1 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev1.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev1.setPkgUsedQty(BigDecimal.valueOf(4));
        pkgSpecMaterialsNameRev1.setLotSize(BigDecimal.valueOf(50));
        pkgSpecMaterialsNameRev1.setQty(TWO);
        pkgSpecMaterialsNameRev1.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev1.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev1);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev2 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev2.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev2.setPkgUsedQty(BigDecimal.valueOf(8));
        pkgSpecMaterialsNameRev2.setLotSize(BigDecimal.valueOf(20));
        pkgSpecMaterialsNameRev2.setQty(TEN);
        pkgSpecMaterialsNameRev2.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev2.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev2);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev3 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev3.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev3.setPkgUsedQty(BigDecimal.valueOf(30));
        pkgSpecMaterialsNameRev3.setLotSize(BigDecimal.valueOf(80));
        pkgSpecMaterialsNameRev3.setQty(BigDecimal.valueOf(3));
        pkgSpecMaterialsNameRev3.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev3.setRtTyp(PKG_TYP_OUTER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev3);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev4 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev4.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev4.setPkgUsedQty(BigDecimal.valueOf(150));
        pkgSpecMaterialsNameRev4.setLotSize(BigDecimal.valueOf(50));
        pkgSpecMaterialsNameRev4.setQty(TWO);
        pkgSpecMaterialsNameRev4.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev4.setRtTyp(PKG_TYP_OUTER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev4);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev5 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev5.setPkgItemNo("PKG03");
        pkgSpecMaterialsNameRev5.setPkgUsedQty(BigDecimal.valueOf(3));
        pkgSpecMaterialsNameRev5.setLotSize(BigDecimal.valueOf(20));
        pkgSpecMaterialsNameRev5.setQty(TEN);
        pkgSpecMaterialsNameRev5.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev5.setRtTyp(PKG_TYP_INNER);
        pkgSpecMaterialsNameRevList.add(pkgSpecMaterialsNameRev5);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpecMaterialsNameRev", pkgSpecMaterialsNameRevList);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setOuterPkgCd("HOGE");
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain1.setMixTagFlg(FLAG_Y);
        internalVariableDtlDomain1.setQty(BigDecimal.valueOf(80));
        internalVariableDtls.add(internalVariableDtlDomain1);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain2.setMixTagFlg(FLAG_N);
        internalVariableDtlDomain2.setQty(BigDecimal.valueOf(60));
        internalVariableDtls.add(internalVariableDtlDomain2);

        bhtEisProductService.createWs2502PltzItemPkgByPkg("", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkgByMixTag(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItemPkgByMixTag() throws ApplicationException {

        List<TtMixtagRtDomain> ttMixtagRtList = new ArrayList<TtMixtagRtDomain>();
        TtMixtagRtDomain mixtagRt1 = new TtMixtagRtDomain();
        mixtagRt1.setQty(ONE);
        mixtagRt1.setPkgWeight(TEN);
        mixtagRt1.setRtFlg(FLAG_Y);
        ttMixtagRtList.add(mixtagRt1);
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagRtServiceImpl.class, "searchByCondition", ttMixtagRtList);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain1.setMixTagFlg(FLAG_Y);
        internalVariableDtlDomain1.setQty(BigDecimal.valueOf(80));
        internalVariableDtls.add(internalVariableDtlDomain1);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain2.setMixTagFlg(FLAG_N);
        internalVariableDtlDomain2.setQty(BigDecimal.valueOf(60));
        internalVariableDtls.add(internalVariableDtlDomain2);

        bhtEisProductService.createWs2502PltzItemPkgByMixTag("", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkgByOuterPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItemPkgByOuterPkg() throws ApplicationException {

        List<Ws2501PkgSetMaterialsNxsCompNmDomain> pkgSetMaterialsNxsCompNmList = new ArrayList<Ws2501PkgSetMaterialsNxsCompNmDomain>();
        Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm1 = new Ws2501PkgSetMaterialsNxsCompNmDomain();
        pkgSetMaterialsNxsCompNm1.setUseQty(ONE);
        pkgSetMaterialsNxsCompNm1.setPkgWeight(TEN);
        pkgSetMaterialsNxsCompNm1.setRtTyp(PKG_TYP_INNER);
        pkgSetMaterialsNxsCompNmList.add(pkgSetMaterialsNxsCompNm1);
        Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm2 = new Ws2501PkgSetMaterialsNxsCompNmDomain();
        pkgSetMaterialsNxsCompNm2.setUseQty(ONE);
        pkgSetMaterialsNxsCompNm2.setPkgWeight(TEN);
        pkgSetMaterialsNxsCompNm2.setRtTyp(PKG_TYP_OUTER);
        pkgSetMaterialsNxsCompNmList.add(pkgSetMaterialsNxsCompNm2);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSetMaterialsNxsCompNm", pkgSetMaterialsNxsCompNmList);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setOuterPkgCd("HOGE");
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain1.setMixTagFlg(FLAG_Y);
        internalVariableDtlDomain1.setQty(BigDecimal.valueOf(80));
        internalVariableDtls.add(internalVariableDtlDomain1);

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain2.setMixTagFlg(FLAG_N);
        internalVariableDtlDomain2.setQty(BigDecimal.valueOf(60));
        internalVariableDtls.add(internalVariableDtlDomain2);

        bhtEisProductService.createWs2502PltzItemPkgByOuterPkg("", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkgByDummyPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502PltzItemPkgByDummyPkg() throws ApplicationException {

        Ws2501PkgMaterialsDomain pkgMaterials1 = new Ws2501PkgMaterialsDomain();
        pkgMaterials1.setPkgWeight(TEN);
        pkgMaterials1.setRtTyp(PKG_TYP_INNER);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 0, pkgMaterials1);

        Ws2501PkgMaterialsDomain pkgMaterials2 = new Ws2501PkgMaterialsDomain();
        pkgMaterials2.setPkgWeight(TEN);
        pkgMaterials2.setRtTyp(PKG_TYP_OUTER);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 1, pkgMaterials2);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501PkgItemNoDomain> pkgItemNoList = new ArrayList<Ws2501PkgItemNoDomain>();
        criteria.setWs2502pkgItemNoList(pkgItemNoList);
        Ws2501PkgItemNoDomain pkgItemNo1 = new Ws2501PkgItemNoDomain();
        pkgItemNo1.setPkgQty(ONE);
        pkgItemNoList.add(pkgItemNo1);

        Ws2501PkgItemNoDomain pkgItemNo2 = new Ws2501PkgItemNoDomain();
        pkgItemNo2.setPkgQty(ONE);
        pkgItemNoList.add(pkgItemNo2);

        bhtEisProductService.createWs2502PltzItemPkgByDummyPkg("", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createKanban(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateKanban() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());

        internalVariableDtls.get(0).setInternalVariableDtlKanbanDomainList(asList(
                new Ws2501InternalVariableDtlKanbanDomain(),
                new Ws2501InternalVariableDtlKanbanDomain()
        ));
        
        Ws2501InternalVariableDtlDomain internalVariableDt2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDt2.setMixTagFlg("Y");
        internalVariableDtls.add(internalVariableDt2);
        
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);
        criteria.setWs2502InternalVariableMixItemNoDomainList(new ArrayList<Ws2501InternalVariableDtlDomain>());

        bhtEisProductService.createKanban("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzKanbanServiceImpl.class, "create"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createTtPltzKanbanDomains(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateTtPltzKanbanDomains() throws ApplicationException {

        List<TtMixKanbanDomain> mixKanbans = new ArrayList<TtMixKanbanDomain>();
        mixKanbans.add(new TtMixKanbanDomain());

        MockObjectManager.setReturnValueAtAllTimes(TtMixKanbanServiceImpl.class, "searchByCondition", mixKanbans);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());
        Ws2501InternalVariableDtlDomain domain = new Ws2501InternalVariableDtlDomain();
        domain.setMixTagFlg("Y");
        internalVariableDtls.add(domain);

        internalVariableDtls.get(0).setInternalVariableDtlKanbanDomainList(asList(
                new Ws2501InternalVariableDtlKanbanDomain(),
                new Ws2501InternalVariableDtlKanbanDomain()
        ));

        internalVariableDtls.get(1).setInternalVariableDtlKanbanDomainList(asList(
                new Ws2501InternalVariableDtlKanbanDomain()
        ));

        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);
        criteria.setWs2502InternalVariableMixItemNoDomainList(asList(new Ws2501InternalVariableDtlDomain()));

        List<TtPltzKanbanDomain> pltzKanbans = bhtEisProductService.createTtPltzKanbanDomains("HOGE", criteria);
        assertThat(pltzKanbans.size(), is(4));
    }

    /**
     *{@link WsBhtEisProductServiceImpl#createWs2502Pltz(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502Pltz() throws ApplicationException {
        testCreateWs2502Pltz(null);
        testCreateWs2502Pltz("HOGE");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502Pltz(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @param outerCd 外装記号
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private void testCreateWs2502Pltz(String outerCd) throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchWeightUnit", "kg");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchLengthUnit", "m");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchVolumeUnit", "L");

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertLengthUnit", ONE);
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "convertVolumeUnit", TEN);

        List<Ws2501TtPltzItemNwDomain> ttPltzItemNwList = new ArrayList<Ws2501TtPltzItemNwDomain>();
        Ws2501TtPltzItemNwDomain pltzItemNw = new Ws2501TtPltzItemNwDomain();
        pltzItemNw.setNetWeight(ONE);
        pltzItemNw.setWeightUnit("kg");
        ttPltzItemNwList.add(pltzItemNw);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemNw", ttPltzItemNwList);

        List<Ws2501TtPltzItemGwDomain> ttPltzItemGwList = new ArrayList<Ws2501TtPltzItemGwDomain>();
        Ws2501TtPltzItemGwDomain pltzItemGw = new Ws2501TtPltzItemGwDomain();
        ttPltzItemGwList.add(pltzItemGw);
        pltzItemGw.setNetWeight(ONE);
        pltzItemGw.setWeightUnit("kg");
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemGw", ttPltzItemGwList);

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = new Ws2501TtPltzItemDeliveryTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemDeliveryTime", ttPltzItemDeliveryTime);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setOuterCd(outerCd);

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setLoadingCd(LOADING_CD_BACK);
        internalVariableDtl1.setDngrItemFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg("N");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setLoadingCd(LOADING_CD_DOOR);
        internalVariableDtl2.setDngrItemFlg(FLAG_N);
        internalVariableDtl2.setExpLimitTyp("FOO");
        internalVariableDtl2.setMixTagFlg("N");
        
        Ws2501InternalVariableDtlDomain mix1 = new Ws2501InternalVariableDtlDomain();
        mix1.setLoadingCd(LOADING_CD_BACK);
        mix1.setDngrItemFlg(FLAG_Y);
        mix1.setPlntCd("M1");

        Ws2501InternalVariableDtlDomain mix2 = new Ws2501InternalVariableDtlDomain();
        mix2.setLoadingCd(LOADING_CD_DOOR);
        mix2.setDngrItemFlg(FLAG_N);
        mix2.setExpLimitTyp("FOO");
        mix2.setPlntCd("M2");
        
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));
        criteria.setWs2502InternalVariableMixItemNoDomainList(asList(mix1, mix2));

        bhtEisProductService.createWs2502Pltz("", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#updatePltzItemNoPackedQtyByItemNo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testUpdatePltzItemNoPackedQtyByItemNo() throws ApplicationException {

        TtPltzInstrItemNoDomain pltzInstrItemNo = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo.setPackedQty(ONE);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "searchByKey", pltzInstrItemNo);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "updateByCondition", 1);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());

        internalVariableDtls.get(0).setMixTagFlg(FLAG_Y);
        internalVariableDtls.get(1).setMixTagFlg(FLAG_N);

        internalVariableDtls.get(0).setQty(TEN);
        internalVariableDtls.get(1).setQty(ONE);

        bhtEisProductService.updatePltzItemNoPackedQtyByItemNo(criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzInstrItemNoServiceImpl.class, "updateByCondition"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#updatePltzItemNoPackedQtyByMixItemNo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testUpdatePltzItemNoPackedQtyByMixItemNo() throws ApplicationException {

        TtPltzInstrItemNoDomain pltzInstrItemNo = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo.setPackedQty(ONE);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "searchByKey", pltzInstrItemNo);
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrItemNoServiceImpl.class, "updateByCondition", 1);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableMixItemNoDomainList(internalVariableDtls);
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());

        internalVariableDtls.get(0).setQty(TEN);

        bhtEisProductService.updatePltzItemNoPackedQtyByMixItemNo(criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzInstrItemNoServiceImpl.class, "updateByCondition"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#updatePltzStatus(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testUpdatePltzStatus() throws ApplicationException {

        TtPltzInstrItemNoDomain pltzInstrItemNo1 = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo1.setInstrQty(ONE);
        pltzInstrItemNo1.setPackedQty(ONE);

        TtPltzInstrItemNoDomain pltzInstrItemNo2 = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo2.setInstrQty(TEN);
        pltzInstrItemNo2.setPackedQty(TEN);

        TtPltzInstrItemNoDomain pltzInstrItemNo3 = new TtPltzInstrItemNoDomain();
        pltzInstrItemNo3.setInstrQty(ONE);
        pltzInstrItemNo3.setPackedQty(TEN);

        MockObjectManager.setReturnValueAt(TtPltzInstrItemNoServiceImpl.class, "searchByCondition", 0, asList(pltzInstrItemNo1, pltzInstrItemNo2));
        MockObjectManager.setReturnValueAt(TtPltzInstrItemNoServiceImpl.class, "searchByCondition", 1, asList(pltzInstrItemNo1, pltzInstrItemNo3));
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "updateByCondition", 1);

     // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        bhtEisProductService.updatePltzStatus(criteria);
        bhtEisProductService.updatePltzStatus(criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzInstrServiceImpl.class, "updateByCondition"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#updateWs2502MixTagStatus(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testUpdateWs2502MixTagStatus() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "updateByCondition", 1);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());
        internalVariableDtls.add(new Ws2501InternalVariableDtlDomain());

        internalVariableDtls.get(0).setMixTagFlg(FLAG_Y);
        internalVariableDtls.get(1).setMixTagFlg(FLAG_N);

        bhtEisProductService.updateWs2502MixTagStatus(criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "updateByCondition"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502BhtInfo(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2502BhtInfo() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWorkTimeStrt("2014/01/01 08:30:00");
        criteria.setWorkTimeEnd("2014/01/01 17:30:00");

        List<Ws2501ProductivityDataInfoDomain> productivityDataInfoList = new ArrayList<Ws2501ProductivityDataInfoDomain>();
        criteria.setWs2502ProductivityDataInfoList(productivityDataInfoList);
        Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
        productivityDataInfo.setWorkTimeStrt("2014/01/01 08:30:00");
        productivityDataInfo.setWorkTimeEnd("2014/01/01 17:30:00");
        productivityDataInfoList.add(productivityDataInfo);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtlDomainList = new ArrayList<Ws2501InternalVariableDtlDomain>();
        Ws2501InternalVariableDtlDomain internalVariableDtlDomain = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain.setPkgFormTyp("");
        internalVariableDtlDomainList.add(internalVariableDtlDomain);
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtlDomainList);
        criteria.setWs2502ItemNoList(new ArrayList<Ws2501ItemNoDomain>());

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        bhtEisProductService.createWs2502BhtInfo("", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchPackedList(WsBhtEisProductCriteriaDomain, WsBhtEisProductDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testSearchPackedList() throws ApplicationException {

        List<TtPltzDomain> ttPltzList = new ArrayList<TtPltzDomain>();
        List<Ws2501TtPltzItemByKanbanDomain> ttPltzItemByKanbanList = new ArrayList<Ws2501TtPltzItemByKanbanDomain>();
        List<TtMixtagDomain> ttMixtagList = new ArrayList<TtMixtagDomain>();
        TtMixtagDomain ttMixtagDomain = new TtMixtagDomain();
        ttMixtagDomain.setMixTagNo("FOO");
        ttMixtagList.add(ttMixtagDomain);

        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class, "searchByCondition", ttPltzList);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemByKanban", ttPltzItemByKanbanList);
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "searchByCondition", ttMixtagList);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);
        internalVariableHdr.setPltzInstrNo("HOGE");

        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        bhtEisProductService.searchPackedList(criteria, wsBhtEisProduct);

        assertThat(wsBhtEisProduct.getWs2502TtPltzList(), sameInstance(ttPltzList));
        assertThat((List<Ws2501TtPltzItemByKanbanDomain>) wsBhtEisProduct.getWs2502TtPltzItemByKanbanList(), sameInstance(ttPltzItemByKanbanList));
        assertThat(wsBhtEisProduct.getWs2502MixTagList().get(0), is("FOO"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchUnPackedList(WsBhtEisProductCriteriaDomain, WsBhtEisProductDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testSearchUnPackedList() throws ApplicationException {

        List<Ws2501UnpackagedItemNoDomain> unpackagedItemNoList = new ArrayList<Ws2501UnpackagedItemNoDomain>();
        List<TtMixtagDomain> ttMixtagList = new ArrayList<TtMixtagDomain>();
        TtMixtagDomain ttMixtagDomain = new TtMixtagDomain();
        ttMixtagDomain.setMixTagNo("FOO");
        ttMixtagList.add(ttMixtagDomain);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchUnpackagedItemNo", unpackagedItemNoList);
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "searchByCondition", ttMixtagList);

        // --------------------------------------------------------------------
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);
        internalVariableHdr.setPltzInstrNo("HOGE");

        WsBhtEisProductDomain wsBhtEisProduct = new WsBhtEisProductDomain();

        bhtEisProductService.searchUnPackedList(criteria, wsBhtEisProduct);

        assertThat((List<Ws2501UnpackagedItemNoDomain>) wsBhtEisProduct.getWs2502UnpackagedItemNoList(), sameInstance(unpackagedItemNoList));
        assertThat(wsBhtEisProduct.getWs2502UnpackagedMixTagList().get(0), is("FOO"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData1() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp("");
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp("");
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertTrue(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData2() throws ApplicationException {
        // 梱包形態チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp("FOO");
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp("BAR");
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData3() throws ApplicationException {
        // 単品品目番号チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("FOO");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("BAR");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData4() throws ApplicationException {
        // インボイスキーチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("FOO");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("BAR");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData5() throws ApplicationException {
        // コンテナ層別キーチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("FOO");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("BAR");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData6() throws ApplicationException {
        // 通貨チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("FOO");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("BAR");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData7() throws ApplicationException {
        // 荷積み位置コードチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd(LOADING_CD_DOOR);
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd(LOADING_CD_BACK);
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData8() throws ApplicationException {
        // 荷揃え指示フラグチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("FOO");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("BAR");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData9() throws ApplicationException {
        // コンテナルーズチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("FOO");
        internalVariableDtl1.setCustomTimingTyp("");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("BAR");
        internalVariableDtl2.setCustomTimingTyp("");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkWs2502InputData10() throws ApplicationException {
        // 通関タイミング区分チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setItemNo("");
        internalVariableDtl1.setInvoiceKey("");
        internalVariableDtl1.setContainerSortingKey("");
        internalVariableDtl1.setCurrCd("");
        internalVariableDtl1.setLoadingCd("");
        internalVariableDtl1.setStgInstrItemFlg("");
        internalVariableDtl1.setContainerLooseTyp("");
        internalVariableDtl1.setCustomTimingTyp("FOO");
        internalVariableDtl1.setMixTagStatus("");
        internalVariableDtl1.setWhCompCd("");
        internalVariableDtl1.setWhCd("");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl2.setItemNo("");
        internalVariableDtl2.setInvoiceKey("");
        internalVariableDtl2.setContainerSortingKey("");
        internalVariableDtl2.setCurrCd("");
        internalVariableDtl2.setLoadingCd("");
        internalVariableDtl2.setStgInstrItemFlg("");
        internalVariableDtl2.setContainerLooseTyp("");
        internalVariableDtl2.setCustomTimingTyp("BAR");
        internalVariableDtl2.setMixTagStatus("");
        internalVariableDtl2.setWhCompCd("");
        internalVariableDtl2.setWhCd("");

        assertFalse(chkWs2502InputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @param d1 Ws2501InternalVariableDtlDomain
     * @param d2 Ws2501InternalVariableDtlDomain
     * @return チェック結果
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private boolean chkWs2502InputData(Ws2501InternalVariableDtlDomain d1, Ws2501InternalVariableDtlDomain d2) throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("");
        internalVariableHdr.setWhCd("");
        criteria.setWs2502InternalVariableHdrDomain(internalVariableHdr);

        List<Ws2501InternalVariableDtlDomain> internalVariableDtls = new ArrayList<Ws2501InternalVariableDtlDomain>();
        criteria.setWs2502InternalVariableDtlDomainList(internalVariableDtls);

        internalVariableDtls.add(d1);
        internalVariableDtls.add(d2);

        return bhtEisProductService.chkWs2502InputData(criteria, new Timestamp[1]);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo1() {
        // 指示超えチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setQty(ONE);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(TWO);
        internalVariableDtl.setLotSize(BigDecimal.valueOf(9));
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2502ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo2() {
        // 出荷ロット超えチェック_多品品目番号
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(ZERO);
        internalVariableDtl.setTagQty(BigDecimal.valueOf(4));
        internalVariableDtl.setLotSize(ONE);
        internalVariableDtl.setCurrCd("");
        internalVariableDtl.setItemDescription("");
        internalVariableDtl.setDngrItemFlg("");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2502ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo3() {
        // 出荷ロット超えチェック_単品品目番号
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(ZERO);
        internalVariableDtl.setTagQty(BigDecimal.valueOf(4));
        internalVariableDtl.setLotSize(BigDecimal.valueOf(9));
        internalVariableDtl.setCurrCd("");
        internalVariableDtl.setItemDescription("");
        internalVariableDtl.setDngrItemFlg("");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2502ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo4() {
        // CIGMA情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(ZERO);
        internalVariableDtl.setTagQty(BigDecimal.valueOf(4));
        internalVariableDtl.setLotSize(BigDecimal.valueOf(9));
        internalVariableDtl.setCurrCd(null);
        internalVariableDtl.setItemDescription("");
        internalVariableDtl.setDngrItemFlg("");

        assertThat(chkWs2502ItemNo(internalVariableDtl), is("YNNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo5() {
        // 輸出出荷品目番号情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(ZERO);
        internalVariableDtl.setTagQty(BigDecimal.valueOf(4));
        internalVariableDtl.setLotSize(BigDecimal.valueOf(9));
        internalVariableDtl.setCurrCd("");
        internalVariableDtl.setItemDescription(null);
        internalVariableDtl.setDngrItemFlg("");

        assertThat(chkWs2502ItemNo(internalVariableDtl), is("NYNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502ItemNo6() {
        // 輸出手続き品目番号情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setPltzQty(TWO);
        internalVariableDtl.setInstrQty(ZERO);
        internalVariableDtl.setTagQty(BigDecimal.valueOf(4));
        internalVariableDtl.setLotSize(BigDecimal.valueOf(9));
        internalVariableDtl.setCurrCd("");
        internalVariableDtl.setItemDescription("");
        internalVariableDtl.setDngrItemFlg(null);

        assertThat(chkWs2502ItemNo(internalVariableDtl), is("NNYN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     *
     * @param internalVariableDtl Ws2501InternalVariableDtlDomain
     * @return チェック結果を表す文字列
     */
    private String chkWs2502ItemNo(Ws2501InternalVariableDtlDomain internalVariableDtl) {
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        bhtEisProductService.chkWs2502ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        return itemNoChkFlg.toString();
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502MixTag(boolean, String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502MixTag1() {
        // 小箱内多品情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setDataGetFlg(FLAG_N);
        internalVariableDtl.setMixTagStatus(null);

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        bhtEisProductService.chkWs2502MixTag(FLAG_Y, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(itemNoChkFlg.toString(), is("NNNY"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502MixTag(boolean, String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2502MixTag2() {
        // 小箱内多品状態チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setDataGetFlg(FLAG_Y);
        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_CML);

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        bhtEisProductService.chkWs2502MixTag(FLAG_Y, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultQ(), is(NG));
    }

//    @Test
//    public void testCreateWs2502CmlHdr() {
//        fail("まだ実装されていません");
//    }

    /**
     * {@link WsBhtEisProductServiceImpl#addWs2502CmlDtlList(Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer, List)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAddWs2502CmlDtlList() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setMixTagFlg(FLAG_N);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setInstrQty(TEN);
        internalVariableDtl.setPltzQty(TWO);

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        bhtEisProductService.addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                 itemNoChkFlg, ttCmlErrorDtlList, "TEST");

        ttCmlErrorDtlList.get(0);

        //---------------------------------------------------------------------

        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setInstrQty(ONE);
        internalVariableDtl.setPltzQty(TWO);
        bhtEisProductService.addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg, ttCmlErrorDtlList, "TEST");

        ttCmlErrorDtlList.get(1);

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagFlg(FLAG_Y);
        bhtEisProductService.addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg, ttCmlErrorDtlList, "TEST");

        assertNull(ttCmlErrorDtlList.get(2).getShippingLot());
        assertNull(ttCmlErrorDtlList.get(2).getQty());
        assertNull(ttCmlErrorDtlList.get(2).getScanQty());
        assertNull(ttCmlErrorDtlList.get(2).getStkQty());
        assertNull(ttCmlErrorDtlList.get(2).getOdrQty());
        assertNull(ttCmlErrorDtlList.get(2).getLeftInstrQty());
        assertNull(ttCmlErrorDtlList.get(2).getOverInstrQty());

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
        bhtEisProductService.addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg, ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(3).getMixPltzCompltFlg(), is(FLAG_Y));

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_CML);
        bhtEisProductService.addWs2502CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg, ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(4).getMixPltzCompltFlg(), is(FLAG_N));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetDtl(String, String, String[], String[], TmPkgSetHdrDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetDtl() throws ApplicationException {

        TtPltzInstrDomain pltzInstr = new TtPltzInstrDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtPltzInstrServiceImpl.class, "searchByKey", pltzInstr);

        MockObjectManager.setReturnNullAt(TmPkgSetHdrServiceImpl.class, "searchByKey", 0);

        TmPkgSetHdrDomain pkgSetHdr1 = new TmPkgSetHdrDomain();
        MockObjectManager.setReturnValueAt(TmPkgSetHdrServiceImpl.class, "searchByKey", 1, pkgSetHdr1);

        TmPkgSetHdrDomain pkgSetHdr2 = new TmPkgSetHdrDomain();
        pkgSetHdr2.setVolumeUnit("a");
        pkgSetHdr2.setVolume(ONE);
        pkgSetHdr2.setLengthUnit("a");
        pkgSetHdr2.setLength(ONE);
        pkgSetHdr2.setWidth(ONE);
        pkgSetHdr2.setHeight(ONE);
        MockObjectManager.setReturnValueAt(TmPkgSetHdrServiceImpl.class, "searchByKey", 2, pkgSetHdr2);

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        TmPkgSetHdrDomain pkgSetHdr = new TmPkgSetHdrDomain();

        assertNull(bhtEisProductService.validateDatabaseTmPkgSetDtl("FOO", null, shipperCd, trnsCd, pkgSetHdr));
        assertThat(bhtEisProductService.validateDatabaseTmPkgSetDtl("FOO", "BAR", shipperCd, trnsCd, pkgSetHdr), is(NXS_E1_5008));
        assertThat(bhtEisProductService.validateDatabaseTmPkgSetDtl("FOO", "BAR", shipperCd, trnsCd, pkgSetHdr), is(NXS_E1_5017));
        assertNull(bhtEisProductService.validateDatabaseTmPkgSetDtl("FOO", "BAR", shipperCd, trnsCd, pkgSetHdr));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgMaterials(String[], List, List)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterials() throws ApplicationException {

        MockObjectManager.setReturnNullAt(TmPkgMtrlServiceImpl.class, "searchByKey", 0);
        MockObjectManager.setReturnValueAt(TmPkgMtrlServiceImpl.class, "searchByKey", 1, new TmPkgMtrlDomain());

        String[] shipperCd = new String[1];

        List<String> pkgItemNoList = new ArrayList<String>();
        pkgItemNoList.add("FOO");

        List<String> pkgItemNoErrList = new ArrayList<String>();

        assertFalse(bhtEisProductService.validateDatabaseTmPkgMaterials(shipperCd, pkgItemNoList, pkgItemNoErrList));
        assertThat(pkgItemNoErrList.size(), is(1));
        assertThat(pkgItemNoErrList.get(0), is("FOO"));

        pkgItemNoErrList = new ArrayList<String>();
        assertTrue(bhtEisProductService.validateDatabaseTmPkgMaterials(shipperCd, pkgItemNoList, pkgItemNoErrList));
        assertThat(pkgItemNoErrList.size(), is(0));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDt1() throws ApplicationException {

        List<Ws2501PkgSpecDomain> pkgSpecList = new ArrayList<Ws2501PkgSpecDomain>();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpec", pkgSpecList);

        // --------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec).isEmpty());

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo1);
        itemNo1.setMixTagFlg(FLAG_Y);

        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec).isEmpty());
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchPkgSpec"), is(0));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDt2() throws ApplicationException {
        // 同一品目番号_同一包装コード
        List<Ws2501PkgSpecDomain> pkgSpecList = new ArrayList<Ws2501PkgSpecDomain>();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpec", pkgSpecList);

        // --------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        // itemNo1 と itemNo3 は 同一品目番号、同一包装コード
        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo1);
        itemNo1.setItemNo("FOO");
        itemNo1.setPkgCd("BAR");
        itemNo1.setMixTagFlg(FLAG_N);

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo2);
        itemNo2.setItemNo("FOO");
        itemNo2.setPkgCd("BOR");
        itemNo2.setMixTagFlg(FLAG_N);

        Ws2501ItemNoDomain itemNo3 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo3);
        itemNo3.setItemNo("FOO");
        itemNo3.setPkgCd("BAR");
        itemNo3.setMixTagFlg(FLAG_N);

        bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "searchPkgSpec"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDt3() throws ApplicationException {
        // NXS_E1_5010
        List<Ws2501PkgSpecDomain> pkgSpecList = new ArrayList<Ws2501PkgSpecDomain>();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpec", pkgSpecList);

        // --------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo1);
        itemNo1.setItemNo("a");
        itemNo1.setPkgCd("b");
        itemNo1.setMixTagFlg(FLAG_N);

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo2);
        itemNo2.setItemNo("c");
        itemNo2.setPkgCd("d");
        itemNo2.setMixTagFlg(FLAG_N);

        Map<String, List<String>> errors = bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
        assertThat(errors.get(NXS_E1_5010).size(), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDt4() throws ApplicationException {
        // NXS_E1_5068
        List<Ws2501PkgSpecDomain> pkgSpecList = new ArrayList<Ws2501PkgSpecDomain>();

        Ws2501PkgSpecDomain pkgSpec1 = new Ws2501PkgSpecDomain();
        pkgSpec1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        pkgSpecList.add(pkgSpec1);

        Ws2501PkgSpecDomain pkgSpec2 = new Ws2501PkgSpecDomain();
        pkgSpec2.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        pkgSpecList.add(pkgSpec2);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpec", pkgSpecList);

        // --------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo1);
        itemNo1.setItemNo("a");
        itemNo1.setPkgCd("b");
        itemNo1.setMixTagFlg(FLAG_N);

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo2);
        itemNo2.setItemNo("c");
        itemNo2.setPkgCd("d");
        itemNo2.setMixTagFlg(FLAG_N);

        Map<String, List<String>> errors = bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
        assertThat(errors.get(NXS_E1_5068).size(), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDt(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDt5() throws ApplicationException {
        // NXS_E1_5070
        List<Ws2501PkgSpecDomain> pkgSpecList = new ArrayList<Ws2501PkgSpecDomain>();

        Ws2501PkgSpecDomain pkgSpec1 = new Ws2501PkgSpecDomain();
        pkgSpec1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        pkgSpecList.add(pkgSpec1);

        Ws2501PkgSpecDomain pkgSpec2 = new Ws2501PkgSpecDomain();
        pkgSpec2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        pkgSpecList.add(pkgSpec2);

        Ws2501PkgSpecDomain pkgSpec3 = new Ws2501PkgSpecDomain();
        pkgSpec3.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        pkgSpec3.setVolumeUnit("l");
        pkgSpec3.setVolumePalletize(ONE);
        pkgSpec3.setLengthUnit("m");
        pkgSpec3.setLengthPalletize(ONE);
        pkgSpec3.setWidthPalletize(ONE);
        pkgSpec3.setHeightPalletize(ONE);
        pkgSpecList.add(pkgSpec3);

        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgSpec", 0, asList(pkgSpec1, pkgSpec2, pkgSpec3));
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgSpec", 1, asList(pkgSpec3));

        // --------------------------------------------------------------------

        String[] shipperCd = new String[1];
        String[] trnsCd = new String[1];
        Ws2501PkgSpecDomain singlePkgSpec = new Ws2501PkgSpecDomain();

        List<Ws2501ItemNoDomain> itemNoList = new ArrayList<Ws2501ItemNoDomain>();

        Ws2501ItemNoDomain itemNo1 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo1);
        itemNo1.setItemNo("a");
        itemNo1.setPkgCd("b");
        itemNo1.setMixTagFlg(FLAG_N);

        Ws2501ItemNoDomain itemNo2 = new Ws2501ItemNoDomain();
        itemNoList.add(itemNo2);
        itemNo2.setItemNo("c");
        itemNo2.setPkgCd("d");
        itemNo2.setMixTagFlg(FLAG_N);

        Map<String, List<String>> errors = bhtEisProductService.validateDatabaseTmPkgSpecificationDt(shipperCd, itemNoList, trnsCd, singlePkgSpec);
        assertThat(errors.get(NXS_E1_5070).size(), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#duration(Date, Date)} のテスト
     * @throws ApplicationException Application Exception
     */
    @Test
    public void testDuration1() throws ApplicationException {
        testDuration("2013/12/31 23:59", "2014/01/01 00:00", 1);
        testDuration("2013/12/31 23:59", "2014/01/01 00:09", 10);
        testDuration("2013/12/31 23:59", "2014/01/01 00:58", 59);
        testDuration("2013/12/31 23:59", "2014/01/01 00:59", 100);
        testDuration("2013/12/31 23:59", "2014/01/01 09:58", 959);
        testDuration("2013/12/31 23:59", "2014/01/01 09:59", 1000);
        testDuration("2013/12/31 23:59", "2014/01/05 03:58", 9959);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#duration(Date, Date)} のテスト
     * @throws ApplicationException Application Exception
     */
    @Test(expected = ApplicationException.class)
    public void testDuration2() throws ApplicationException {
        // ERROR
        testDuration("2013/12/31 23:59", "2014/01/05 03:59", 0);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#duration(Date, Date)} のテスト
     *
     * @param startDateTime 開始日時
     * @param endDateTime 終了日時
     * @param expected 期待値
     * @throws ApplicationException Application Exception
     */
    private void testDuration(String startDateTime, String endDateTime, int expected) throws ApplicationException {
        assertThat(WsBhtEisProductServiceImpl.duration(parseDate(startDateTime, "yyyy/MM/dd HH:mm"),
                                                       parseDate(endDateTime, "yyyy/MM/dd HH:mm")),
                   is(dec(expected)));
    }

    /**
     * int 型の数値を BigDecimal に変換して返す。
     *
     * @param i 数値
     * @return BigDecimal オブジェクト
     */
    private static BigDecimal dec(int i) {
        return BigDecimal.valueOf(i);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchMaxBrchPlusOne(String)} のテスト
     * @throws Exception 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchMaxBrchPlusOne() throws Exception {
        
        MockObjectManager.initialize();
        
        TtPltzItemDomain pltzItem = new TtPltzItemDomain();
        pltzItem.setBrch(TEN);
        MockObjectManager.addReturnValue(TtPltzItemServiceImpl.class, "searchByConditionForPaging", asList(pltzItem));
        BigDecimal res1 = bhtEisProductService.searchMaxBrchPlusOne("xxx");
        assertThat(res1, is(new BigDecimal(11)));
        
        TtPltzItemDomain pltzItem2 = new TtPltzItemDomain();
        MockObjectManager.addReturnValue(TtPltzItemServiceImpl.class, "searchByConditionForPaging", asList(pltzItem2));
        BigDecimal res2 = bhtEisProductService.searchMaxBrchPlusOne("xxx");
        assertThat(res2, is(new BigDecimal(1)));
        
        MockObjectManager.addReturnValue(TtPltzItemServiceImpl.class, "searchByConditionForPaging", new ArrayList<TtPltzItemDomain>());
        BigDecimal res3 = bhtEisProductService.searchMaxBrchPlusOne("xxx");
        assertThat(res3, is(new BigDecimal(1)));
        
    }

}
