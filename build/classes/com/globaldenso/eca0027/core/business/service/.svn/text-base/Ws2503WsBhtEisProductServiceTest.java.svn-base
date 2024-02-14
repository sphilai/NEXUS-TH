package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_BACK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LOADING_CD_DOOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MIX_TAG_STATUS_MIXTAG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5069;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0089;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MULTI;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_SINGLE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_INNER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_TYP_OUTER;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.TEN;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
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
import java.util.TimeZone;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaCustomerXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
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
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonInstDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSetMaterialsNxsCompNmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecMaterialsNameRevDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmNxsWhByXrefDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemDeliveryTimeDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemNwDomain;
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

/**
 * {@link WsBhtEisProductServiceImpl} の WS2503 のためのテストクラス
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10489 $
 */
public class Ws2503WsBhtEisProductServiceTest {

    /** 2 */
    private static final BigDecimal TWO = dec(2);

    /** EIS ProductのWebサービスの実装クラス */
    private WsBhtEisProductServiceImpl bhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2503WsBhtEisProductServiceTest() {
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

        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", new Date());

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
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemOdrServiceImpl.class,    "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzItemServiceImpl.class,       "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzKanbanServiceImpl.class,     "create");
        MockObjectManager.setReturnValueAtAllTimes(TtPltzServiceImpl.class,           "create");
        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class,       "create");
    }


    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyStock(String, String, String, String, String)}
     * のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyStock() {

        String nexusWhFlg = null;
        String whCompCd = null;
        String whCd = null;
        String plntCd = null;
        String lgcyWhCd = null;

        assertFalse(bhtEisProductService.validateConsistencyStock(null, null, null, null, null));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_Y;
        whCompCd = "a";
        whCd = "b";

        assertTrue(bhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, whCd, plntCd, lgcyWhCd));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_Y;
        whCompCd = null;
        whCd = "b";

        assertFalse(bhtEisProductService.validateConsistencyStock(nexusWhFlg, null, whCd, plntCd, lgcyWhCd));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_Y;
        whCompCd = "a";
        whCd = null;

        assertFalse(bhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, null, plntCd, lgcyWhCd));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_N;
        plntCd = "a";
        lgcyWhCd = "b";

        assertTrue(bhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, whCd, plntCd, lgcyWhCd));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_N;
        plntCd = null;
        lgcyWhCd = "b";

        assertFalse(bhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, whCd, null, lgcyWhCd));

        //  -------------------------------------------------------------------

        nexusWhFlg = FLAG_N;
        plntCd = "a";
        lgcyWhCd = null;

        assertFalse(bhtEisProductService.validateConsistencyStock(nexusWhFlg, whCompCd, whCd, plntCd, null));

        //  -------------------------------------------------------------------


    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateConsistencyItemList(List)} のためのテストメソッド。
     */
    @Test
    public void testValidateConsistencyItemList() {

        Ws2501ItemNoDomain itemNoDomain = new Ws2501ItemNoDomain();


        // --------------------------------------------------------------------
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_N);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));

        itemNoDomain.setItemNo("a");
        itemNoDomain.setPkgCd("b");
        itemNoDomain.setIndusTypCd("c");
        itemNoDomain.setKanbanTyp("d");
        itemNoDomain.setTagSeqNo(ONE);
        itemNoDomain.setKanbanQty(ONE);

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_N);
        assertTrue(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setItemNo(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setItemNo("a");
        // --------------------------------------------------------------------
        itemNoDomain.setPkgCd(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setPkgCd("b");
        // --------------------------------------------------------------------
        itemNoDomain.setIndusTypCd(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setIndusTypCd("c");
        // --------------------------------------------------------------------
        itemNoDomain.setKanbanTyp(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setKanbanTyp("d");
        // --------------------------------------------------------------------
        itemNoDomain.setTagSeqNo(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setTagSeqNo(ONE);
        // --------------------------------------------------------------------
        itemNoDomain.setKanbanQty(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));
        itemNoDomain.setKanbanQty(ONE);

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_Y);
        assertTrue(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));

        // --------------------------------------------------------------------
        itemNoDomain.setMixTagFlg(FLAG_Y);
        itemNoDomain.setItemNo(null);
        assertFalse(bhtEisProductService.validateConsistencyItemList(asList(itemNoDomain)));


    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSetDtlOnNonInstrPltz(String, String, String[], String[], TmPkgSetHdrDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSetDtlOnNonInstrPltz() throws ApplicationException {
        assertNull(bhtEisProductService.validateDatabaseTmPkgSetDtlOnNonInstrPltz(null, null, new String[1], new String[1], new TmPkgSetHdrDomain()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgMaterialsOnNonInstrPltz(String[], List, List)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgMaterialsOnNonInstrPltz() throws ApplicationException {
        MockObjectManager.setReturnNullAt(TmPkgMtrlServiceImpl.class, "searchByKey", 0);
        assertTrue(bhtEisProductService.validateDatabaseTmPkgMaterialsOnNonInstrPltz(new String[1], new ArrayList<String>(), new ArrayList<String>()));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[], List, String[], Ws2501PkgSpecDomain)} のテスト
     *
    MockObjectManager.setReturnNullAt(TmPkgMaterialsServiceImpl.class, "searchByKey", 0);
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmPkgSpecificationDtOnNonInstrPltz() throws ApplicationException {
        assertTrue(bhtEisProductService.validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(new String[1], new ArrayList<Ws2501ItemNoDomain>(), new String[1], new Ws2501PkgSpecDomain()).isEmpty());
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(String, String, String, String[])}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaShipToXrefOnNonInstrPltz() throws ApplicationException {

        MockObjectManager.setReturnNullAt(TmCigmaShipToXrefServiceImpl.class, "searchByKey", 0);
        MockObjectManager.setReturnValueAt(TmCigmaShipToXrefServiceImpl.class, "searchByKey", 1, new TmCigmaShipToXrefDomain());

        //  -----------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmCigmaShipToXrefOnNonInstrPltz("a", "b", "c", new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmCigmaShipToXrefOnNonInstrPltz("a", "b", "c", new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(String, String, String[])
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaCustomerXrefOnNonInstrPltz() throws ApplicationException {

        MockObjectManager.setReturnNullAt(TmCigmaCustomerXrefServiceImpl.class, "searchByKey", 0);
        MockObjectManager.setReturnValueAt(TmCigmaCustomerXrefServiceImpl.class, "searchByKey", 1, new TmCigmaCustomerXrefDomain());

        //  -----------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz("a", "b", new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz("a", "b", new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmCigmaWhXrefOnNonInstrPltz(String, String, String, String[], String[])}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmCigmaWhXrefOnNonInstrPltz() throws ApplicationException {

        MockObjectManager.setReturnNullAt(TmCigmaWhXrefServiceImpl.class, "searchByKey", 0);
        MockObjectManager.setReturnValueAt(TmCigmaWhXrefServiceImpl.class, "searchByKey", 1, new TmCigmaWhXrefDomain());

        //  -----------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmCigmaWhXrefOnNonInstrPltz("a", "b", "c", new String[1], new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmCigmaWhXrefOnNonInstrPltz("a", "b", "c", new String[1], new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTmNxsWhOnNonInstrPltz(String, String, String, String[])
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsWhOnNonInstrPltz() throws ApplicationException {

        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmNxsWhByXref", 0, emptyList());
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchTmNxsWhByXref", 1, singletonList(new Ws2501TmNxsWhByXrefDomain()));

        //  -----------------------------------------------------------------------

        assertFalse(bhtEisProductService.validateDatabaseTmNxsWhOnNonInstrPltz("a", "b", "c", new String[1]));
        assertTrue(bhtEisProductService.validateDatabaseTmNxsWhOnNonInstrPltz("a", "b", "c", new String[1]));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String, WsBhtEisProductCriteriaDomain, List)
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseTtCmlErrorHeaderOnNonInstrPltz() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        bhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz("a", criteria, Arrays.asList("A"));
        bhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz("a", criteria, Arrays.asList("B"));
        bhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz("a", criteria, Arrays.asList("C"));
        bhtEisProductService.validateDatabaseTtCmlErrorHeaderOnNonInstrPltz("a", criteria, Arrays.asList("D"));

    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnNonInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnNonInstPltz1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst = new Ws2501ItemNoNxsNonInstDomain();
        itemNoNxsNonInst.setOrderQty(ONE);
        itemNoNxsNonInst.setContainerSortingKey("a");
        itemNoNxsNonInst.setLoadingCd("b");
        itemNoNxsNonInst.setInvoiceKey("c");
        itemNoNxsNonInst.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonInst.setCustomTimingTyp("d");
        itemNoNxsNonInst.setContainerLooseTyp("e");
        itemNoNxsNonInst.setItemDescription("f");
        itemNoNxsNonInst.setExpLimitTyp("g");
        itemNoNxsNonInst.setDngrItemFlg(FLAG_N);
        itemNoNxsNonInst.setOriginCntryCd("h");
        itemNoNxsNonInst.setTmpStockQty(ONE);
        itemNoNxsNonInst.setWeightUnit("i");
        itemNoNxsNonInst.setNetWeightA(ONE);
        itemNoNxsNonInst.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxsNonInst.setLotSize(ONE);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonInst", itemNoNxsNonInst);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmCigmaWhXrefServiceImpl.class, "searchByCondition", singletonList(new TmCigmaWhXrefDomain()));

        //  -------------------------------------------------------------------

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        item1.setCurr3("円");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setMohtq("20");
        item2.setCurr3("円");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "transactSequence", asList("1234"));

        //  -------------------------------------------------------------------

        TtExpRcvOdrDomain ttExpRcvOdrDomain1 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain1.setOdrQty(dec(100));
        ttExpRcvOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttExpRcvOdrDomain2 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain2.setOdrQty(dec(50));
        ttExpRcvOdrDomain2.setPltzAllocQty(dec(40));

        TtExpRcvOdrDomain ttExpRcvOdrDomain3 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain3.setOdrQty(dec(100));
        ttExpRcvOdrDomain3.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttExpRcvOdrDomain4 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain4.setOdrQty(dec(30));
        ttExpRcvOdrDomain4.setPltzAllocQty(dec(10));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttExpRcvOdrDomain1,
                ttExpRcvOdrDomain2,
                ttExpRcvOdrDomain3,
                ttExpRcvOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev1 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev1.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev1.setPkgUsedQty(dec(4));
        pkgSpecMaterialsNameRev1.setLotSize(dec(50));
        pkgSpecMaterialsNameRev1.setQty(TWO);
        pkgSpecMaterialsNameRev1.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev1.setRtTyp(PKG_TYP_INNER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev2 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev2.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev2.setPkgUsedQty(dec(8));
        pkgSpecMaterialsNameRev2.setLotSize(dec(20));
        pkgSpecMaterialsNameRev2.setQty(TEN);
        pkgSpecMaterialsNameRev2.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev2.setRtTyp(PKG_TYP_INNER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev3 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev3.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev3.setPkgUsedQty(dec(30));
        pkgSpecMaterialsNameRev3.setLotSize(dec(80));
        pkgSpecMaterialsNameRev3.setQty(dec(3));
        pkgSpecMaterialsNameRev3.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev3.setRtTyp(PKG_TYP_OUTER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev4 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev4.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev4.setPkgUsedQty(dec(150));
        pkgSpecMaterialsNameRev4.setLotSize(dec(50));
        pkgSpecMaterialsNameRev4.setQty(TWO);
        pkgSpecMaterialsNameRev4.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev4.setRtTyp(PKG_TYP_OUTER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev5 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev5.setPkgItemNo("PKG03");
        pkgSpecMaterialsNameRev5.setPkgUsedQty(dec(3));
        pkgSpecMaterialsNameRev5.setLotSize(dec(20));
        pkgSpecMaterialsNameRev5.setQty(TEN);
        pkgSpecMaterialsNameRev5.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev5.setRtTyp(PKG_TYP_INNER);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpecMaterialsNameRev", asList(
                pkgSpecMaterialsNameRev1, pkgSpecMaterialsNameRev2, pkgSpecMaterialsNameRev3, pkgSpecMaterialsNameRev4, pkgSpecMaterialsNameRev5
        ));

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
        MockObjectManager.setReturnValueAtAllTimes( WsBhtEisProductDaoImpl.class, "searchTtPltzItemGw", asList(pltzItemGw));

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = new Ws2501TtPltzItemDeliveryTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemDeliveryTime", ttPltzItemDeliveryTime);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnNullAtAllTimes(TtTmpStockServiceImpl.class, "lockByKeyNoWait");

        //  -------------------------------------------------------------------

        ResultDomain success = new ResultDomain();
        success.setResultCode(Eca0027Constants.WS_RESULT_SUCCESS);
        MockObjectManager.setReturnValueAt(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", 0, success);

        //  -------------------------------------------------------------------

        TtBhtWorkTimeDomain workTime = new TtBhtWorkTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtBhtWorkTimeServiceImpl.class, "searchByConditionForPaging", singletonList(workTime));

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaNightFlg", FLAG_Y);

        //  -------------------------------------------------------------------

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("ITEM_A");
        itemNo.setMixTagFlg(FLAG_N);
        itemNo.setKanbanQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNexusWhFlg(FLAG_Y);
        criteria.setWorkTimeStrt("2000/04/01 09:00:00");
        criteria.setWorkTimeEnd("2000/04/01 17:30:00");
        criteria.setWs2503ItemNoList(asList(itemNo));
        criteria.setWs2503PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2503ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());

        bhtEisProductService.transactOnNonInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnNonInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnNonInstPltz2() throws ApplicationException {
        // ERROR1
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst1 = new Ws2501ItemNoNxsNonInstDomain();
        itemNoNxsNonInst1.setOrderQty(ONE);
        itemNoNxsNonInst1.setContainerSortingKey("a");
        itemNoNxsNonInst1.setLoadingCd("b");
        itemNoNxsNonInst1.setInvoiceKey("c");
        itemNoNxsNonInst1.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonInst1.setCustomTimingTyp("d");
        itemNoNxsNonInst1.setContainerLooseTyp("e");
        itemNoNxsNonInst1.setItemDescription("f");
        itemNoNxsNonInst1.setExpLimitTyp("g");
        itemNoNxsNonInst1.setDngrItemFlg(FLAG_N);
        itemNoNxsNonInst1.setOriginCntryCd("h");
        itemNoNxsNonInst1.setTmpStockQty(ONE);
        itemNoNxsNonInst1.setWeightUnit("i");
        itemNoNxsNonInst1.setNetWeightA(ONE);
        itemNoNxsNonInst1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxsNonInst1.setLotSize(dec(200));

        Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst2 = new Ws2501ItemNoNxsNonInstDomain();
        itemNoNxsNonInst2.setOrderQty(ONE);
        itemNoNxsNonInst2.setContainerSortingKey("a");
        itemNoNxsNonInst2.setLoadingCd("b");
        itemNoNxsNonInst2.setInvoiceKey("c");
        itemNoNxsNonInst2.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonInst2.setCustomTimingTyp("d");
        itemNoNxsNonInst2.setContainerLooseTyp("e");
        itemNoNxsNonInst2.setItemDescription("f");
        itemNoNxsNonInst2.setExpLimitTyp("g");
        itemNoNxsNonInst2.setDngrItemFlg(FLAG_N);
        itemNoNxsNonInst2.setOriginCntryCd("h");
        itemNoNxsNonInst2.setTmpStockQty(ONE);
        itemNoNxsNonInst2.setWeightUnit("i");
        itemNoNxsNonInst2.setNetWeightA(ONE);
        itemNoNxsNonInst2.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        itemNoNxsNonInst2.setLotSize(dec(200));

        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonInst", 0, itemNoNxsNonInst1);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonInst", 1, itemNoNxsNonInst2);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmCigmaWhXrefServiceImpl.class, "searchByCondition", singletonList(new TmCigmaWhXrefDomain()));

        //  -------------------------------------------------------------------

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        item1.setCurr3("円");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setMohtq("20");
        item2.setCurr3("円");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

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
        criteria.setWs2503ItemNoList(asList(itemNo1, itemNo2));
        criteria.setWs2503PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2503ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());

        bhtEisProductService.transactOnNonInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnNonInstPltz(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnNonInstPltz3() throws ApplicationException {
        // ERROR2
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst = new Ws2501ItemNoNxsNonInstDomain();
        itemNoNxsNonInst.setOrderQty(ONE);
        itemNoNxsNonInst.setContainerSortingKey("a");
        itemNoNxsNonInst.setLoadingCd("b");
        itemNoNxsNonInst.setInvoiceKey("c");
        itemNoNxsNonInst.setStgInstrItemFlg(FLAG_N);
        itemNoNxsNonInst.setCustomTimingTyp("d");
        itemNoNxsNonInst.setContainerLooseTyp("e");
        itemNoNxsNonInst.setItemDescription("f");
        itemNoNxsNonInst.setExpLimitTyp("g");
        itemNoNxsNonInst.setDngrItemFlg(FLAG_N);
        itemNoNxsNonInst.setOriginCntryCd("h");
        itemNoNxsNonInst.setTmpStockQty(ONE);
        itemNoNxsNonInst.setWeightUnit("i");
        itemNoNxsNonInst.setNetWeightA(ONE);
        itemNoNxsNonInst.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        itemNoNxsNonInst.setLotSize(dec(200));

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonInst", itemNoNxsNonInst);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmCigmaWhXrefServiceImpl.class, "searchByCondition", singletonList(new TmCigmaWhXrefDomain()));

        //  -------------------------------------------------------------------

        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        item1.setCurr3("円");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_B");
        item2.setMohtq("20");
        item2.setCurr3("円");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        //  -------------------------------------------------------------------

        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(new TmMeasureUnitDomain()));

        //  -------------------------------------------------------------------

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("ITEM_A");
        itemNo.setMixTagFlg(FLAG_N);
        itemNo.setKanbanQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setNexusWhFlg(FLAG_Y);
        criteria.setWorkTimeStrt("2000/04/01 09:00:00");
        criteria.setWorkTimeEnd("2000/04/01 17:30:00");
        criteria.setWs2503ItemNoList(asList(itemNo));
        criteria.setWs2503PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());
        criteria.setWs2503ProductivityDataInfoList(new ArrayList<Ws2501ProductivityDataInfoDomain>());

        bhtEisProductService.transactOnNonInstPltz(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503HeaderData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503HeaderData() throws ApplicationException {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        criteria.setNexusWhFlg(FLAG_Y);
        bhtEisProductService.searchWs2503HeaderData(criteria);

        //  -------------------------------------------------------------------

        criteria.setNexusWhFlg(FLAG_N);
        bhtEisProductService.searchWs2503HeaderData(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503DetailData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503DetailData() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503ItemNoList(new ArrayList<Ws2501ItemNoDomain>());
        criteria.setWs2503InternalVariableHdrDomain(new Ws2501InternalVariableHdrDomain());

        bhtEisProductService.searchWs2503DetailData(criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#initWs2503InternalVariableDtl(WsBhtEisProductCriteriaDomain)} のテスト
     */
    @Test
    public void testInitWs2503InternalVariableDtl() {

        Ws2501ItemNoDomain itemNo = new Ws2501ItemNoDomain();
        itemNo.setItemNo("ITEM_1");
        itemNo.setPkgCd("PKG_1");
        itemNo.setCustomerItemNo("a");
        itemNo.setMixTagFlg(FLAG_N);
        itemNo.setKanbanQty(ONE);
        itemNo.setIndusTypCd("b");
        itemNo.setKanbanTyp("c");
        itemNo.setTagSeqNo(ONE);
        itemNo.setCustomerTagSeqNo("1");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503ItemNoList(asList(itemNo));

        bhtEisProductService.initWs2503InternalVariableDtl(criteria);

        assertThat(criteria.getWs2503InternalVariableDtlDomainList().size(), is(1));
        assertThat(criteria.getMaxSeq().intValue(), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#lockData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testLockData() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", singletonList(new Ws2501TtExpRcvOdrDomain()));
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "lockByKeyNoWait", new TtMixtagDomain());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.lockData(criteria);

        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr"), is(1));
        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "lockByKeyNoWait"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#lockData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testLockData2() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", emptyList());
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "lockByKeyNoWait", new TtMixtagDomain());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        try {
            bhtEisProductService.lockData(criteria);
            fail();
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr"), is(1));
        MockObjectManager.assertNotCalled(TtMixtagServiceImpl.class, "lockByKeyNoWait");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#lockData(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testLockData3() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr", singletonList(new Ws2501TtExpRcvOdrDomain()));
        MockObjectManager.setReturnNullAtAllTimes(TtMixtagServiceImpl.class, "lockByKeyNoWait");

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        try {
            bhtEisProductService.lockData(criteria);
            fail();
        } catch (ValidationException e) {
            assertThat(e.getErrors().size(), is(1));
            assertThat(e.getErrors().get(0).getKey(), is(NXS_E1_5069));
        }

        assertThat(MockObjectManager.getCallCount(WsBhtEisProductDaoImpl.class, "lockByKeyNoWaitTtExpRcvOdr"), is(1));
        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "lockByKeyNoWait"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503NexusInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503NexusInfo() throws ApplicationException {

        Ws2501ItemNoNxsNonInstDomain itemNoNxsNonInst = new Ws2501ItemNoNxsNonInstDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchItemNoNxsNonInst", itemNoNxsNonInst);

        //  -------------------------------------------------------------------

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2503NexusInfo(criteria);

        assertThat(internalVariableDtl1.getDataGetFlg(), is(FLAG_Y));
        assertThat(internalVariableDtl2.getDataGetFlg(), is(not(FLAG_Y)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503CigmaInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503CigmaInfo1() throws ApplicationException {
        // NexusWhFlg_Y
        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        item1.setCurr3("1");
        item1.setUnmsr("a");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_C");
        item2.setMohtq("20");
        item2.setCurr3("1");
        item2.setUnmsr("a");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);
        MockObjectManager.setReturnValueAtAllTimes(TmCigmaWhXrefServiceImpl.class, "searchByCondition", singletonList(new TmCigmaWhXrefDomain()));

        TmMeasureUnitDomain measureUnit = new TmMeasureUnitDomain();
        measureUnit.setUnitCd("A");
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(measureUnit));

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
        internalVariableDtl2.setTmpStockQty(TWO);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setItemNo("ITEM_C");
        internalVariableDtl3.setMixTagFlg(FLAG_N);
        internalVariableDtl3.setTmpStockQty(TWO);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2, internalVariableDtl3));

        bhtEisProductService.searchWs2503CigmaInfo(criteria);

        assertThat(MockObjectManager.getCallCount(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503CigmaInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503CigmaInfo2() throws ApplicationException {
        // NexusWhFlg_N
        Ws2004ResultItemDomain item1 = new Ws2004ResultItemDomain();
        item1.setItnbr("ITEM_A");
        item1.setMohtq("10");
        item1.setCurr3("1");
        item1.setUnmsr("a");

        Ws2004ResultItemDomain item2 = new Ws2004ResultItemDomain();
        item2.setItnbr("ITEM_C");
        item2.setMohtq("20");
        item2.setCurr3("1");
        item2.setUnmsr("a");

        Ws2004ResultDomain result = new Ws2004ResultDomain();
        result.setItemList(asList(item1, item2));

        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml", result);

        TmMeasureUnitDomain measureUnit = new TmMeasureUnitDomain();
        measureUnit.setUnitCd("A");
        MockObjectManager.setReturnValueAtAllTimes(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging", singletonList(measureUnit));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setNexusWhFlg(FLAG_N);
        internalVariableHdr.setPlntCd("a");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setItemNo("ITEM_A");
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setTmpStockQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setItemNo("ITEM_B");
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setTmpStockQty(TWO);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setItemNo("ITEM_C");
        internalVariableDtl3.setMixTagFlg(FLAG_N);
        internalVariableDtl3.setTmpStockQty(TWO);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2503CigmaInfo(criteria);

        assertThat(MockObjectManager.getCallCount(TmMeasureUnitServiceImpl.class, "searchByConditionForPaging"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503CigmaInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503CigmaInfo3() throws ApplicationException {
        // EMPTY
        MockObjectManager.setReturnValueAtAllTimes(Ws2004RestServiceImpl.class, "searchItemInfoForCml");

        //  -------------------------------------------------------------------


        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2503CigmaInfo(criteria);

        assertThat(MockObjectManager.getCallCount(Ws2004RestServiceImpl.class, "searchItemInfoForCml"), is(0));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503MixInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503MixInfo() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "searchByKey", new TtMixtagDomain());

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        bhtEisProductService.searchWs2503MixInfo(criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "searchByKey"), is(1));
        assertThat(internalVariableDtl1.getDataGetFlg(), is(not(FLAG_Y)));
        assertThat(internalVariableDtl2.getDataGetFlg(), is(FLAG_Y));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchWs2503MixItemInfo(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchWs2503MixItemInfo() throws ApplicationException {

        Ws2501MixedTagItemDomain mixedTagItem1 = new Ws2501MixedTagItemDomain();
        Ws2501MixedTagItemDomain mixedTagItem2 = new Ws2501MixedTagItemDomain();

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchMixedTagItem", asList(mixedTagItem1, mixedTagItem2));

        //  -------------------------------------------------------------------


        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_Y);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setMixTagFlg(FLAG_Y);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setMaxSeq(TEN);
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2, internalVariableDtl3));

        bhtEisProductService.searchWs2503MixItemInfo(criteria);

        @SuppressWarnings("unchecked")
        List <Ws2501InternalVariableDtlDomain> InternalVariableMixItemNoDomainList = (List <Ws2501InternalVariableDtlDomain>) criteria.getWs2503InternalVariableMixItemNoDomainList();
        assertThat(InternalVariableMixItemNoDomainList.size(), is(4));
        assertThat(InternalVariableMixItemNoDomainList.get(0).getSeq().intValue(), is(11));
        assertThat(InternalVariableMixItemNoDomainList.get(1).getSeq().intValue(), is(12));
        assertThat(InternalVariableMixItemNoDomainList.get(2).getSeq().intValue(), is(13));
        assertThat(InternalVariableMixItemNoDomainList.get(3).getSeq().intValue(), is(14));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData1() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setDataGetFlg(FLAG_Y);
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setPkgFormTyp("a");
        internalVariableDtl1.setItemNo("b");
        internalVariableDtl1.setInvoiceKey("c");
        internalVariableDtl1.setContainerSortingKey("d");
        internalVariableDtl1.setCurrCd("e");
        internalVariableDtl1.setLoadingCd("f");
        internalVariableDtl1.setStgInstrItemFlg("g");
        internalVariableDtl1.setContainerLooseTyp("h");
        internalVariableDtl1.setCustomTimingTyp("i");
        internalVariableDtl1.setMixTagStatus("j");
        internalVariableDtl1.setWhCompCd("k");
        internalVariableDtl1.setWhCd("l");

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setDataGetFlg(FLAG_Y);
        internalVariableDtl2.setMixTagFlg(FLAG_Y);
        internalVariableDtl2.setPkgFormTyp("a");
        internalVariableDtl2.setItemNo("b");
        internalVariableDtl2.setInvoiceKey("c");
        internalVariableDtl2.setContainerSortingKey("d");
        internalVariableDtl2.setCurrCd("e");
        internalVariableDtl2.setLoadingCd("f");
        internalVariableDtl2.setStgInstrItemFlg("g");
        internalVariableDtl2.setContainerLooseTyp("h");
        internalVariableDtl2.setCustomTimingTyp("i");
        internalVariableDtl2.setMixTagStatus("j");
        internalVariableDtl2.setWhCompCd("k");
        internalVariableDtl2.setWhCd("l");

        assertTrue(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData2() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData3() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData4() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData5() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData6() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData7() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData8() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData9() throws ApplicationException {
        //コンテナルーズチェック
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testChkInputData10() throws ApplicationException {
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

        assertFalse(chkInputData(internalVariableDtl1, internalVariableDtl2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2502InputData(WsBhtEisProductCriteriaDomain, Timestamp[])} のテスト
     *
     * @param d1 Ws2501InternalVariableDtlDomain
     * @param d2 Ws2501InternalVariableDtlDomain
     * @return チェック結果
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private boolean chkInputData(Ws2501InternalVariableDtlDomain d1, Ws2501InternalVariableDtlDomain d2) throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("");
        internalVariableHdr.setWhCd("");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(d1, d2));

        return bhtEisProductService.chkInputData(criteria, new Timestamp[1]);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo1() {
        // オーダー超えチェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl.setQty(dec(3));
        internalVariableDtl.setTagQty(ONE);
        internalVariableDtl.setLotSize(TEN);
        internalVariableDtl.setOdrQty(TWO);
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription("b");
        internalVariableDtl.setDngrItemFlg("c");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2503ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo2() {
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

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2503ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo3() {
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

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer();

        bhtEisProductService.chkWs2503ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(NG));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(not(NG)));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo4() {
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

        assertThat(chkWs2503ItemNo(internalVariableDtl), is("YNNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo5() {
        // 輸出出荷品目番号情報取得チェック
        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(dec(11));
        internalVariableDtl.setTagQty(dec(4));
        internalVariableDtl.setLotSize(dec(12));
        internalVariableDtl.setCurrCd("a");
        internalVariableDtl.setItemDescription(null);
        internalVariableDtl.setDngrItemFlg("c");

        assertThat(chkWs2503ItemNo(internalVariableDtl), is("NYNN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503ItemNo6() {
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

        assertThat(chkWs2503ItemNo(internalVariableDtl), is("NNYN"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503ItemNo(boolean, String, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer)} のテスト
     *
     * @param internalVariableDtl Ws2501InternalVariableDtlDomain
     * @return チェック結果を表す文字列
     */
    private String chkWs2503ItemNo(Ws2501InternalVariableDtlDomain internalVariableDtl) {
        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();
        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");

        bhtEisProductService.chkWs2503ItemNo(FLAG_N, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultM(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultO(), is(not(NG)));
        assertThat(ttCmlErrorHeader.getChkResultP(), is(NG));

        return itemNoChkFlg.toString();
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503MixTag(boolean, String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503MixTag1() {
        // 小箱内多品情報取得チェック
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("a");
        internalVariableHdr.setWhCd("b");

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setDataGetFlg(FLAG_Y);
        internalVariableDtl.setMixTagStatus(null);
        internalVariableDtl.setWhCompCd("a");
        internalVariableDtl.setWhCd("b");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");
        StringBuffer whChkFlg = new StringBuffer("N");

        bhtEisProductService.chkWs2503MixTag(FLAG_Y, internalVariableHdr, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg);

        assertThat(itemNoChkFlg.toString(), is("NNNY"));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503MixTag(boolean, String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503MixTag2() {
        // 小箱内多品状態チェック
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("a");
        internalVariableHdr.setWhCd("b");

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setDataGetFlg(FLAG_Y);
        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_CML);
        internalVariableDtl.setWhCompCd("a");
        internalVariableDtl.setWhCd("b");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");
        StringBuffer whChkFlg = new StringBuffer("N");

        bhtEisProductService.chkWs2503MixTag(FLAG_Y, internalVariableHdr, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg);

        assertThat(ttCmlErrorHeader.getChkResultQ(), is(NG));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503MixTag(boolean, String, Ws2501InternalVariableHdrDomain, Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer)} のテスト
     */
    @Test
    public void testChkWs2503MixTag3() {
        // MIXタグ倉庫会社_倉庫チェック
        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setWhCompCd("a");
        internalVariableHdr.setWhCd("b");

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setDataGetFlg(FLAG_Y);
        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_CML);
        internalVariableDtl.setWhCompCd("a");
        internalVariableDtl.setWhCd("b");

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");
        StringBuffer whChkFlg = new StringBuffer("N");

        // --------------------------------------------------------------------

        internalVariableDtl.setWhCompCd("A");
        internalVariableDtl.setWhCd("b");
        bhtEisProductService.chkWs2503MixTag(FLAG_Y, internalVariableHdr, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg);
        assertThat(ttCmlErrorHeader.getChkResultR(), is(NG));

        // --------------------------------------------------------------------

        internalVariableDtl.setWhCompCd("a");
        internalVariableDtl.setWhCd("B");
        bhtEisProductService.chkWs2503MixTag(FLAG_Y, internalVariableHdr, internalVariableDtl, ttCmlErrorHeader, itemNoChkFlg, whChkFlg);
        assertThat(ttCmlErrorHeader.getChkResultR(), is(NG));
    }

//    @Test
//    public void testCreateWs2503CmlHdr() {
//        testChkInputData_XXX() でテスト済み
//    }

    /**
     * {@link WsBhtEisProductServiceImpl#addWs2503CmlDtlList(Ws2501InternalVariableDtlDomain, TtCmlErrorHeaderDomain, StringBuffer, StringBuffer, List)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAddWs2503CmlDtlList() throws ApplicationException {

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setMixTagFlg(FLAG_N);
        internalVariableDtl.setQty(TEN);
        internalVariableDtl.setOdrQty(TWO);

        TtCmlErrorHeaderDomain ttCmlErrorHeader = new TtCmlErrorHeaderDomain();

        StringBuffer itemNoChkFlg = new StringBuffer("NNNN");
        StringBuffer whChkFlg = new StringBuffer("N");

        List<TtCmlErrorDtlDomain> ttCmlErrorDtlList = new ArrayList<TtCmlErrorDtlDomain>();

        bhtEisProductService.addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                 itemNoChkFlg,  whChkFlg, ttCmlErrorDtlList, "TEST");

        ttCmlErrorDtlList.get(0);

        //---------------------------------------------------------------------

        internalVariableDtl.setQty(ONE);
        internalVariableDtl.setOdrQty(TWO);
        bhtEisProductService.addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg,  whChkFlg, ttCmlErrorDtlList, "TEST");

        ttCmlErrorDtlList.get(1);

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagFlg(FLAG_Y);
        bhtEisProductService.addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg,  whChkFlg, ttCmlErrorDtlList, "TEST");

        assertNull(ttCmlErrorDtlList.get(2).getShippingLot());
        assertNull(ttCmlErrorDtlList.get(2).getQty());
        assertNull(ttCmlErrorDtlList.get(2).getScanQty());
        assertNull(ttCmlErrorDtlList.get(2).getStkQty());
        assertNull(ttCmlErrorDtlList.get(2).getOdrQty());
        assertNull(ttCmlErrorDtlList.get(2).getLeftInstrQty());
        assertNull(ttCmlErrorDtlList.get(2).getOverInstrQty());

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_MIXTAG);
        bhtEisProductService.addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg,  whChkFlg, ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(3).getMixPltzCompltFlg(), is(FLAG_Y));

        //---------------------------------------------------------------------

        internalVariableDtl.setMixTagStatus(MIX_TAG_STATUS_CML);
        bhtEisProductService.addWs2503CmlDtlList(internalVariableDtl, ttCmlErrorHeader,
                itemNoChkFlg,  whChkFlg, ttCmlErrorDtlList, "TEST");

        assertThat(ttCmlErrorDtlList.get(4).getMixPltzCompltFlg(), is(FLAG_N));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#chkWs2503OuterPkgCd(WsBhtEisProductCriteriaDomain)} のテスト
     */
    @Test
    public void testChkWs2503OuterPkgCd() {

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();

        Ws2501InternalVariableHdrDomain header = new Ws2501InternalVariableHdrDomain();
        header.setOuterPkgCd("HOGE");
        criteria.setWs2503InternalVariableHdrDomain(header);

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        internalVariableDtl1.setQty(ONE);
        internalVariableDtl1.setLotSize(TWO);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertTrue(bhtEisProductService.chkWs2503OuterPkgCd(criteria));

        //---------------------------------------------------------------------

        header.setOuterPkgCd(null);

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_SINGLE);
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertFalse(bhtEisProductService.chkWs2503OuterPkgCd(criteria));

        //---------------------------------------------------------------------

        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);
        internalVariableDtl1.setQty(ONE);
        internalVariableDtl1.setQty(ONE);
        criteria.setWs2502InternalVariableDtlDomainList(asList(internalVariableDtl1));

        assertFalse(bhtEisProductService.chkWs2503OuterPkgCd(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2503Qty(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2503Qty1() throws ApplicationException {
        // TRUE
        TtExpRcvOdrDomain ttExpRcvOdrDomain1 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain1.setOdrQty(dec(100));
        ttExpRcvOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttExpRcvOdrDomain2 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain2.setOdrQty(dec(50));
        ttExpRcvOdrDomain2.setPltzAllocQty(dec(40));

        TtExpRcvOdrDomain ttExpRcvOdrDomain3 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain3.setOdrQty(dec(100));
        ttExpRcvOdrDomain3.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttExpRcvOdrDomain4 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain4.setOdrQty(dec(30));
        ttExpRcvOdrDomain4.setPltzAllocQty(dec(10));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttExpRcvOdrDomain1,
                ttExpRcvOdrDomain2,
                ttExpRcvOdrDomain3,
                ttExpRcvOdrDomain4
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(dec(10));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(dec(110));

        WsBhtEisProductCriteriaDomain bhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        bhtEisProductCriteriaDomain.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        bhtEisProductCriteriaDomain.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        //  -------------------------------------------------------------------

        bhtEisProductService.allocWs2503Qty("HOGE", bhtEisProductCriteriaDomain);
        assertThat(MockObjectManager.getCallCount(TtPltzItemOdrServiceImpl.class, "create"), is(3));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#allocWs2503Qty(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testAllocWs2503Qty2() throws ApplicationException {
        // FALSE
        TtExpRcvOdrDomain ttExpRcvOdrDomain1 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain1.setOdrQty(dec(30));
        ttExpRcvOdrDomain1.setPltzAllocQty(dec(20));

        TtExpRcvOdrDomain ttExpRcvOdrDomain2 = new TtExpRcvOdrDomain();
        ttExpRcvOdrDomain2.setOdrQty(dec(50));
        ttExpRcvOdrDomain2.setPltzAllocQty(dec(40));

        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "searchByCondition", asList(
                ttExpRcvOdrDomain1,
                ttExpRcvOdrDomain2
        ));
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_N);
        internalVariableDtl1.setQty(dec(110));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1));

        //  -------------------------------------------------------------------

        try {
            bhtEisProductService.allocWs2503Qty("HOGE", criteria);
            fail("Exception 未発生");
        } catch (ApplicationException e) {
            assertThat(e.getCode(), is(NXS_E7_0089));
        }
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createPltzItemOdrByMixTagOdr(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreatePltzItemOdrByMixTagOdr() throws ApplicationException {

        TtMixtagOdrDomain mixtagOdr1 = new TtMixtagOdrDomain();
        TtMixtagOdrDomain mixtagOdr2 = new TtMixtagOdrDomain();
        TtMixtagOdrDomain mixtagOdr3 = new TtMixtagOdrDomain();

        MockObjectManager.setReturnValueAt(TtMixtagOdrServiceImpl.class, "searchByCondition", 0, asList(mixtagOdr1, mixtagOdr2));
        MockObjectManager.setReturnValueAt(TtMixtagOdrServiceImpl.class, "searchByCondition", 1, asList(mixtagOdr3));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableMixItemNoDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        //  -------------------------------------------------------------------

        bhtEisProductService.createPltzItemOdrByMixTagOdr("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemOdrServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503PltzItem(String, WsBhtEisProductCriteriaDomain)}
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItem() throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(TWO);
        internalVariableDtl1.setItemWeight(TEN);
        internalVariableDtl1.setPkgFormTyp(PKG_FORM_TYP_MULTI);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(TWO);
        internalVariableDtl2.setItemWeight(TEN);
        internalVariableDtl2.setPkgFormTyp(PKG_FORM_TYP_MULTI);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setMixTagFlg(FLAG_N);
        internalVariableDtl3.setQty(TWO);
        internalVariableDtl3.setItemWeight(TEN);
        internalVariableDtl3.setPkgFormTyp(PKG_FORM_TYP_SINGLE);

        Ws2501InternalVariableDtlDomain internalVariableDtlMix = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlMix.setQty(TWO);
        internalVariableDtlMix.setItemWeight(TEN);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2, internalVariableDtl3));
        criteria.setWs2503InternalVariableMixItemNoDomainList(Arrays.asList(internalVariableDtlMix));

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItem("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503PltzItemPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItemPkg() throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(new ArrayList<Ws2501InternalVariableDtlDomain>());
        criteria.setWs2503PkgItemNoList(new ArrayList<Ws2501PkgItemNoDomain>());

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItemPkg("HOGE", criteria);

        // 詳細は別のテストで確認しているので、ここでは実行できることを確認するのみ...
    }


    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503PltzItemPkgByPkg(String, WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException
     *             何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItemPkgByPkg() throws ApplicationException {

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev1 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev1.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev1.setPkgUsedQty(dec(4));
        pkgSpecMaterialsNameRev1.setLotSize(dec(50));
        pkgSpecMaterialsNameRev1.setQty(TWO);
        pkgSpecMaterialsNameRev1.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev1.setRtTyp(PKG_TYP_INNER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev2 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev2.setPkgItemNo("PKG01");
        pkgSpecMaterialsNameRev2.setPkgUsedQty(dec(8));
        pkgSpecMaterialsNameRev2.setLotSize(dec(20));
        pkgSpecMaterialsNameRev2.setQty(TEN);
        pkgSpecMaterialsNameRev2.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev2.setRtTyp(PKG_TYP_INNER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev3 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev3.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev3.setPkgUsedQty(dec(30));
        pkgSpecMaterialsNameRev3.setLotSize(dec(80));
        pkgSpecMaterialsNameRev3.setQty(dec(3));
        pkgSpecMaterialsNameRev3.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev3.setRtTyp(PKG_TYP_OUTER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev4 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev4.setPkgItemNo("PKG02");
        pkgSpecMaterialsNameRev4.setPkgUsedQty(dec(150));
        pkgSpecMaterialsNameRev4.setLotSize(dec(50));
        pkgSpecMaterialsNameRev4.setQty(TWO);
        pkgSpecMaterialsNameRev4.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev4.setRtTyp(PKG_TYP_OUTER);

        Ws2501PkgSpecMaterialsNameRevDomain pkgSpecMaterialsNameRev5 = new Ws2501PkgSpecMaterialsNameRevDomain();
        pkgSpecMaterialsNameRev5.setPkgItemNo("PKG03");
        pkgSpecMaterialsNameRev5.setPkgUsedQty(dec(3));
        pkgSpecMaterialsNameRev5.setLotSize(dec(20));
        pkgSpecMaterialsNameRev5.setQty(TEN);
        pkgSpecMaterialsNameRev5.setPkgWeight(TWO);
        pkgSpecMaterialsNameRev5.setRtTyp(PKG_TYP_INNER);

        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSpecMaterialsNameRev", asList(
                pkgSpecMaterialsNameRev1, pkgSpecMaterialsNameRev2, pkgSpecMaterialsNameRev3, pkgSpecMaterialsNameRev4, pkgSpecMaterialsNameRev5
        ));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setOuterPkgCd("HOGE");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(dec(80));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(dec(60));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItemPkgByPkg("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503PltzItemPkgByMixTag(String, WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItemPkgByMixTag() throws ApplicationException {

        TtMixtagRtDomain mixtagRt1 = new TtMixtagRtDomain();
        mixtagRt1.setQty(ONE);
        mixtagRt1.setPkgWeight(TEN);
        mixtagRt1.setRtFlg(FLAG_Y);
        MockObjectManager.setReturnValueAtAllTimes(TtMixtagRtServiceImpl.class, "searchByCondition", asList(mixtagRt1));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain1.setMixTagFlg(FLAG_Y);
        internalVariableDtlDomain1.setQty(dec(80));

        Ws2501InternalVariableDtlDomain internalVariableDtlDomain2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtlDomain2.setMixTagFlg(FLAG_N);
        internalVariableDtlDomain2.setQty(dec(60));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtlDomain1, internalVariableDtlDomain2));

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItemPkgByMixTag("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(1));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503PltzItemPkgByOuterPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItemPkgByOuterPkg() throws ApplicationException {

        Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm1 = new Ws2501PkgSetMaterialsNxsCompNmDomain();
        pkgSetMaterialsNxsCompNm1.setUseQty(ONE);
        pkgSetMaterialsNxsCompNm1.setPkgWeight(TEN);
        pkgSetMaterialsNxsCompNm1.setRtTyp(PKG_TYP_INNER);
        Ws2501PkgSetMaterialsNxsCompNmDomain pkgSetMaterialsNxsCompNm2 = new Ws2501PkgSetMaterialsNxsCompNmDomain();
        pkgSetMaterialsNxsCompNm2.setUseQty(ONE);
        pkgSetMaterialsNxsCompNm2.setPkgWeight(TEN);
        pkgSetMaterialsNxsCompNm2.setRtTyp(PKG_TYP_OUTER);
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchPkgSetMaterialsNxsCompNm", asList(pkgSetMaterialsNxsCompNm1, pkgSetMaterialsNxsCompNm2));

        //  -------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();
        internalVariableHdr.setOuterPkgCd("HOGE");

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(BigDecimal.valueOf(80));

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(BigDecimal.valueOf(60));

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItemPkgByOuterPkg("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502PltzItemPkgByDummyPkg(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503PltzItemPkgByDummyPkg() throws ApplicationException {

        Ws2501PkgMaterialsDomain pkgMaterials1 = new Ws2501PkgMaterialsDomain();
        pkgMaterials1.setPkgWeight(TEN);
        pkgMaterials1.setRtTyp(PKG_TYP_INNER);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 0, pkgMaterials1);

        Ws2501PkgMaterialsDomain pkgMaterials2 = new Ws2501PkgMaterialsDomain();
        pkgMaterials2.setPkgWeight(TEN);
        pkgMaterials2.setRtTyp(PKG_TYP_OUTER);
        MockObjectManager.setReturnValueAt(WsBhtEisProductDaoImpl.class, "searchPkgMaterials", 1, pkgMaterials2);

        // --------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501PkgItemNoDomain pkgItemNo1 = new Ws2501PkgItemNoDomain();
        pkgItemNo1.setPkgQty(ONE);

        Ws2501PkgItemNoDomain pkgItemNo2 = new Ws2501PkgItemNoDomain();
        pkgItemNo2.setPkgQty(ONE);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503PkgItemNoList(asList(pkgItemNo1, pkgItemNo2));

        // --------------------------------------------------------------------

        bhtEisProductService.createWs2503PltzItemPkgByDummyPkg("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzItemServiceImpl.class, "create"), is(2));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503Kanban(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503Kanban() throws ApplicationException {

        TtMixKanbanDomain mixKanban = new TtMixKanbanDomain();
        MockObjectManager.setReturnValueAtAllTimes(TtMixKanbanServiceImpl.class, "searchByCondition", asList(mixKanban));

        // --------------------------------------------------------------------

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();

        internalVariableDtl.setInternalVariableDtlKanbanDomainList(asList(
                new Ws2501InternalVariableDtlKanbanDomain(),
                new Ws2501InternalVariableDtlKanbanDomain()
        ));
        Ws2501InternalVariableDtlDomain internalVariableDt2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDt2.setMixTagFlg("Y");

        Ws2501InternalVariableDtlDomain internalVariableMixItemNo = new Ws2501InternalVariableDtlDomain();
        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl, internalVariableDt2));
        criteria.setWs2503InternalVariableMixItemNoDomainList(asList(internalVariableMixItemNo));

        // --------------------------------------------------------------------

        bhtEisProductService.createWs2503Kanban("HOGE", criteria);

        assertThat(MockObjectManager.getCallCount(TtPltzKanbanServiceImpl.class, "create"), is(3));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503Pltz(String, WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503Pltz() throws ApplicationException {
        testCreateWs2503Pltz(null);
        testCreateWs2503Pltz("HOGE");
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2503Pltz(String, WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @param outerCd 外装記号
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    private void testCreateWs2503Pltz(String outerCd) throws ApplicationException {

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
        MockObjectManager.setReturnValueAtAllTimes( WsBhtEisProductDaoImpl.class, "searchTtPltzItemGw", asList(pltzItemGw));

        Ws2501TtPltzItemDeliveryTimeDomain ttPltzItemDeliveryTime = new Ws2501TtPltzItemDeliveryTimeDomain();
        MockObjectManager.setReturnValueAtAllTimes(WsBhtEisProductDaoImpl.class, "searchTtPltzItemDeliveryTime", ttPltzItemDeliveryTime);

        // --------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

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

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setOuterCd(outerCd);
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));
        criteria.setWs2503InternalVariableMixItemNoDomainList(asList(mix1, mix2));

        //  -------------------------------------------------------------------

        bhtEisProductService.createWs2503Pltz("HOGE", criteria);
    }

  /**
     * {@link WsBhtEisProductServiceImpl#testUpdateWs2503MixTagStatus(WsBhtEisProductCriteriaDomain)}
     * のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testUpdateWs2503MixTagStatus() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(TtMixtagServiceImpl.class, "updateByCondition", 1);

        // --------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2));

        // --------------------------------------------------------------------

        bhtEisProductService.updateWs2503MixTagStatus(criteria);

        assertThat(MockObjectManager.getCallCount(TtMixtagServiceImpl.class, "updateByCondition"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactTmpStk(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactTmpStk() throws ApplicationException {

        TtTmpStockDomain tmpStock = new TtTmpStockDomain();
        tmpStock.setQty(ONE);
        MockObjectManager.setReturnValueAt(TtTmpStockServiceImpl.class, "lockByKeyNoWait", 0, tmpStock);
        MockObjectManager.setReturnNullAt(TtTmpStockServiceImpl.class, "lockByKeyNoWait", 1);

        MockObjectManager.setReturnValueAtAllTimes(TtTmpStockServiceImpl.class, "updateByCondition", 1);

        // --------------------------------------------------------------------

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl1 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl1.setMixTagFlg(FLAG_Y);
        internalVariableDtl1.setQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl2 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl2.setMixTagFlg(FLAG_N);
        internalVariableDtl2.setQty(ONE);

        Ws2501InternalVariableDtlDomain internalVariableDtl3 = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl3.setMixTagFlg(FLAG_N);
        internalVariableDtl3.setQty(ONE);

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl1, internalVariableDtl2, internalVariableDtl3));

        // --------------------------------------------------------------------

        bhtEisProductService.transactTmpStk(criteria);

        assertThat(MockObjectManager.getCallCount(TtTmpStockServiceImpl.class, "updateByCondition"), is(1));
        assertThat(MockObjectManager.getCallCount(TtTmpStockServiceImpl.class, "create"), is(1));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createRcvOdrAlloc(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateRcvOdrAlloc() throws ApplicationException {

        ResultDomain success = new ResultDomain();
        success.setResultCode(Eca0027Constants.WS_RESULT_SUCCESS);
        MockObjectManager.setReturnValueAt(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", 0, success);

        ResultDomain error = new ResultDomain();
        error.setResultCode(Eca0027Constants.WS_RESULT_ERROR);
        MockObjectManager.setReturnValueAt(Ws2005RestServiceImpl.class, "createRcvOdrAlloc", 1, error);

        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "searchCigmaNightFlg", 0, FLAG_Y);
        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "searchCigmaNightFlg", 1, FLAG_N);

        //  -------------------------------------------------------------------

        TtPltzItemOdrDomain pltzItemOdr1 = new TtPltzItemOdrDomain();

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWs2503InternalVariableHdrDomain(new Ws2501InternalVariableHdrDomain());
        criteria.setTtPltzItemOdrList(asList(pltzItemOdr1));

        assertTrue(bhtEisProductService.createRcvOdrAlloc(criteria));
        assertFalse(bhtEisProductService.createRcvOdrAlloc(criteria));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#createWs2502BhtInfo(String, WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testCreateWs2503BhtInfo() throws ApplicationException {

        Ws2501InternalVariableHdrDomain internalVariableHdr = new Ws2501InternalVariableHdrDomain();

        Ws2501InternalVariableDtlDomain internalVariableDtl = new Ws2501InternalVariableDtlDomain();
        internalVariableDtl.setPkgFormTyp("");

        Ws2501ProductivityDataInfoDomain productivityDataInfo = new Ws2501ProductivityDataInfoDomain();
        productivityDataInfo.setWorkTimeStrt("2014/01/01 08:30:00");
        productivityDataInfo.setWorkTimeEnd("2014/01/01 17:30:00");

        WsBhtEisProductCriteriaDomain criteria = new WsBhtEisProductCriteriaDomain();
        criteria.setWorkTimeStrt("2014/01/01 08:30:00");
        criteria.setWorkTimeEnd("2014/01/01 17:30:00");
        criteria.setWs2503ItemNoList(new ArrayList<Ws2501ItemNoDomain>());
        criteria.setWs2503InternalVariableHdrDomain(internalVariableHdr);
        criteria.setWs2503InternalVariableDtlDomainList(asList(internalVariableDtl));
        criteria.setWs2503ProductivityDataInfoList(asList(productivityDataInfo));

        bhtEisProductService.createWs2503BhtInfo("", criteria);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#validateDatabaseCigmaNightBatchRunning(String)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testValidateDatabaseCigmaNightBatchRunning() throws ApplicationException {

        MockObjectManager.setReturnValueAt(CommonServiceImpl.class, "searchCigmaAvailable", 0, true);

        assertTrue(bhtEisProductService.validateDatabaseCigmaNightBatchRunning("HOGE"));
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
}
