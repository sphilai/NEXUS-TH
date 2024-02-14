package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5067;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmPrinterDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoServiceImpl;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストクラス
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2507WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * TtPltzInstrServiceサービス
     */
    private TtPltzInstrService ttPltzInstrService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2507WsBhtEisProductServiceTest() {
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
     * Setter method for ttPltzInstrService.
     *
     * @param ttPltzInstrService Set for ttPltzInstrService
     */
    public void setTtPltzInstrService(TtPltzInstrService ttPltzInstrService) {
        this.ttPltzInstrService = ttPltzInstrService;
    }

    /**
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();

        wsBhtEisProductService = (WsBhtEisProductService) getContext().getBean("wsBhtEisProductService");
        ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");

    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml1() throws ApplicationException {
        // INSTR
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setCmlPrintFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("MYB0511001");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("");
        criteriaDomain.setMainMarkList(mainMarkList);

        wsBhtEisProductService.transactOnPrintCml(criteriaDomain);

        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0511001");
        List<TtPltzInstrDomain> list = this.ttPltzInstrService.searchByCondition(ttPltzInstrCriteria);
        if (list == null || list.size() == 0) {
            fail("更新失敗1");
        } else {
            TtPltzInstrDomain ttPltzInstrDomain = list.get(0);
            if (!ttPltzInstrDomain.getPltzInstrStatus().equals(PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT)) {
                fail("更新失敗2");
            }
        }

    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml2() throws ApplicationException {
        boolean result = false;
        // NXS_E1_5040
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setCmlPrintFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("MY70000002");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("");
        criteriaDomain.setMainMarkList(mainMarkList);

        try {
            wsBhtEisProductService.transactOnPrintCml(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_5040)) {
                result = true;
            }
        }

        assertThat(result, is(true));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml3() throws ApplicationException {
        boolean result = false;
        // NXS_E1_5040_2
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setCmlPrintFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("MYB0001288");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("");
        criteriaDomain.setMainMarkList(mainMarkList);

        try {
            wsBhtEisProductService.transactOnPrintCml(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_5040)) {
                result = true;
            }
        }
        assertThat(result, is(true));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml4() throws ApplicationException {
        // NON INSTR
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setCmlPrintFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMYB11505110001");
        criteriaDomain.setMainMarkList(mainMarkList);

        wsBhtEisProductService.transactOnPrintCml(criteriaDomain);
    }


    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml5() throws ApplicationException {
        // NON INSTR NXS_E1_5067
        boolean result = false;

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setCmlPrintFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMYB11599999999");
        criteriaDomain.setMainMarkList(mainMarkList);

        try {
            wsBhtEisProductService.transactOnPrintCml(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_5067)) {
                result = true;
            }
        }
        assertThat(result, is(true));
    }

    /**
     * {@link WsBhtEisProductServiceImpl#transactOnPrintCml(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testTransactOnPrintCml6() throws ApplicationException {
        // ERROR REP
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MYB");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MYB");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setErrorReportFlg(FLAG_Y);
        criteriaDomain.setPltzInstrNo("");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMYB11505110001");
        criteriaDomain.setMainMarkList(mainMarkList);

        wsBhtEisProductService.transactOnPrintCml(criteriaDomain);
    }




}
