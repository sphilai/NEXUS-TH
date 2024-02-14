package com.globaldenso.eca0027.core.business.service;

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
public class Ws2511WsBhtEisProductServiceTest extends AbstractEca0027Test {

    /**
     * BhtEisProductサービス
     */
    private WsBhtEisProductService wsBhtEisProductService;

    /**
     * デフォルトコンストラクタ
     */
    public Ws2511WsBhtEisProductServiceTest() {
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
     * {@link WsBhtEisProductServiceImpl#searchOnPrintXtag(WsBhtEisProductCriteriaDomain)} のテスト
     *
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Test
    public void testSearchOnPrintXtag() throws ApplicationException {
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
        DensoContext context = new DensoContext("nexus", "0", new Locale("en"));
        DensoContext.set(context);

        WsBhtEisProductCriteriaDomain criteriaDomain = new WsBhtEisProductCriteriaDomain();
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setDscId("nexus");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setCompCd("MY7");
        criteriaDomain.setPrinterId("01");
        criteriaDomain.setXmainMark("XWH01404150004");

        wsBhtEisProductService.searchOnPrintXtag(criteriaDomain);

    }

}
