package com.globaldenso.eca0027.core.business.service;


import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5067;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

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
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterServiceImpl;
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
public class Ws2512WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService bhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2512WsBhtEisProductServiceTest() {
    }

    /**
     * Setter method for bhtEisProductService.
     *
     * @param bhtEisProductService Set for bhtEisProductService
     */
    public void setBhtEisProductService(WsBhtEisProductService bhtEisProductService) {
        this.bhtEisProductService = bhtEisProductService;
    }

    /**
     * 前処理
     */
    @Before
    public void setUp() {
        MockObjectManager.initialize();
        bhtEisProductService = (WsBhtEisProductService) getContext().getBean("wsBhtEisProductService");

    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchOnPrintErt(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt1() throws ApplicationException {
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MY7");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        // ユーザ情報
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MY7");
        criteriaDomain.setPrinterId("01");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMY7L201404250010");
        mainMarkList.add("DMY7L201404250011");
        mainMarkList.add("DMY7L201404250012");
        criteriaDomain.setMainMarkList(mainMarkList);

        bhtEisProductService.searchOnPrintErt(criteriaDomain);

    }

    /**
     * {@link WsBhtEisProductServiceImpl#searchOnPrintErt(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt2() throws ApplicationException {
        // NXS_E1_5067_1
        boolean result = false;

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MY7");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        // ユーザ情報
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MY7");
        criteriaDomain.setPrinterId("01");
        List<String> mainMarkList = new ArrayList<String>();
        criteriaDomain.setMainMarkList(mainMarkList);

        try {
            bhtEisProductService.searchOnPrintErt(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_5067)) {
                result = true;
            }
        }

        assertThat(result, is(true));
    }


    /**
     * {@link WsBhtEisProductServiceImpl#searchOnPrintErt(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt3() throws ApplicationException {
        // NXS_E1_5067_2
        boolean result = false;

        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "getResource", "yyyy/MM/dd");
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "printPdf");

        VmUserInfoDomain vmUserInfoDomain = new VmUserInfoDomain();
        vmUserInfoDomain.setCompCd("MY7");
        List<VmUserInfoDomain> vmUserInfoDomains = Collections.singletonList(vmUserInfoDomain);
        MockObjectManager.setReturnValueAtAllTimes(VmUserInfoServiceImpl.class, "searchByCondition", vmUserInfoDomains);

        TmPrinterDomain tmPrinterDomain = new TmPrinterDomain();
        tmPrinterDomain.setPrinterId("01");
        MockObjectManager.setReturnValueAtAllTimes(TmPrinterServiceImpl.class, "searchByKey", tmPrinterDomain);

        File pdf = new File("/tmp/hoge.pdf");
        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "searchMixTag", pdf);

        // --------------------------------------------------------------------
        // ユーザ情報
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setCompCd("MY7");
        criteriaDomain.setPrinterId("01");
        List<String> mainMarkList = new ArrayList<String>();
        mainMarkList.add("DMY7L201404999999");
        criteriaDomain.setMainMarkList(mainMarkList);

        try {
            bhtEisProductService.searchOnPrintErt(criteriaDomain);
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_5067)) {
                result = true;
            }
        }

        assertThat(result, is(true));
    }



}
