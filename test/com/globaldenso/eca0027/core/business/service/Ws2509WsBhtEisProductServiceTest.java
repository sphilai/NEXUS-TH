package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;

import java.io.File;
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
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoServiceImpl;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;

/**
 * {@link WsBhtEisProductServiceImpl} のためのテストクラス
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2509WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2509WsBhtEisProductServiceTest() {
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
     * {@link WsBhtEisProductServiceImpl#searchOnPrintMixTag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintMixTag1() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("FOO");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("BAR");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);
        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setPrinterId("MY7");
        criteriaDomain.setMixTag("MMY7WH01405010001");
        criteriaDomain.setPrintMixTagFlg(FLAG_Y);
        criteriaDomain.setErrorReportFlg("");

        wsBhtEisProductService.searchOnPrintMixTag(criteriaDomain);
    }
    /**
     * {@link WsBhtEisProductServiceImpl#searchOnPrintMixTag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintMixTag2() throws ApplicationException {

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("FOO");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("BAR");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);
        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setPrinterId("MY7");
        criteriaDomain.setMixTag("MMY7WH01405010001");
        criteriaDomain.setErrorReportFlg(FLAG_Y);
        criteriaDomain.setPrintMixTagFlg("");

        wsBhtEisProductService.searchOnPrintMixTag(criteriaDomain);
    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchOnPrintMixTag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintMixTag3() throws ApplicationException {
        // SysError
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("FOO");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("BAR");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setPrinterId("MY7");
        criteriaDomain.setMixTag("MMY7WH01405010001");
        criteriaDomain.setErrorReportFlg("");
        criteriaDomain.setPrintMixTagFlg("");

        try {
            wsBhtEisProductService.searchOnPrintMixTag(criteriaDomain);
        } catch (ApplicationException e) {
            e.getCode().equals("NXS-E1-5016");
        }
    }




}
