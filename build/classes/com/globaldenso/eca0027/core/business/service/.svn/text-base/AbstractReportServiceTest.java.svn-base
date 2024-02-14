/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.L9999ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L9999ReportDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfServiceImpl;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;

/**
 * <br />帳票サービスの基底クラスのテストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class AbstractReportServiceTest extends AbstractEca0027Test {

    /**
     * <br />QRコード(サンプル)
     */
    private static String QR_CODE_PATH = "qrcode.gif";

    /**
     * 例外ルール
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * 一時フォルダルール
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * <br />Mock帳票のテンプレート
     */
    private String mockTemplate;
    
    /**
     * <br />Mock帳票のサービス
     */
    private AbstractReportServiceMockImpl mockService;
    
    /**
     * <br />Mock帳票のドメイン
     */
    private L9999ReportDomain reportDomain;
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public AbstractReportServiceTest() {
    }
    
    /**
     * <br />テストの前処理を行います。
     *
     * @throws Exception エラーが発生した場合
     */
    @Before
    public void setUp() throws Exception {
        // Mock帳票のテンプレート
        mockTemplate = getResource("AbstractReportServiceTest.jrxml").getPath();
        
        // Mock帳票サービスの作成
        mockService = new AbstractReportServiceMockImpl();
        mockService.setTmUserConfService(new TmUserConfServiceImpl());

        reportDomain = new L9999ReportDomain();
        List<L9999ReportDetailDomain> detailList = new ArrayList<L9999ReportDetailDomain>();
        
        // Mock帳票ドメイン(明細)の作成
        for (int i = 0; i < 50; i++) {
            L9999ReportDetailDomain detailDomain = new L9999ReportDetailDomain();
            String seq = String.format("%02d", i + 1);
            
            detailDomain.setCmlNo("MMMMMMMMMMMMMMMMMMME");
            detailDomain.setRt("M");
            detailDomain.setMixTag("M");
            detailDomain.setDescription(seq + "MMMMMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setCustItemNoOrModItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
            detailDomain.setQty("9999999");
            detailDomain.setPkg("MMM");
            detailDomain.setRemarks("MMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMME");
            
            detailList.add(detailDomain);
        }

        // Mock帳票ドメインの設定
        reportDomain.setSingleFlg(false);
        reportDomain.setContainerSortKey("MMMMMMME");
        reportDomain.setLdCd("M");
        reportDomain.setInstrFlg(true);
        reportDomain.setAirFlg(true);
        reportDomain.setPalletNo("MMME");
        reportDomain.setMainMark("MMMMMMMMMMMMMMMMMMME");
        reportDomain.setShipToAbbr("MMMMMMMMME");
        reportDomain.setShipToCompName("MMMMMMMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setCustomerItemNo("MMMMMMMMMMMMMMMMMMME");
        reportDomain.setQty("9999999");
        reportDomain.setBrokenFlg(true);
        reportDomain.setUnitName("EA");
        reportDomain.setCmlType("M");
        reportDomain.setGw("999999999.999 kg");
        reportDomain.setDescription("MMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMME");
        reportDomain.setItemNo("MMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setQrNexus(getInputStream(QR_CODE_PATH));
        reportDomain.setDueDate(new Date());
        reportDomain.setRemarks("MMMMMMMMMMMMMMMMMMMMMMMME\nMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setQrEis(getInputStream(QR_CODE_PATH));
        reportDomain.setPrintedDate(new Date());
        reportDomain.setShipper("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMME");
        reportDomain.setIssuer("MMMMMMMMME\nMMMMMMMMME");
        reportDomain.setDetailList(detailList);
    }
    
    /**
     * <br />createReport(PDF帳票の作成)のテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);

        mockService.createReport("L9999", reportDomain);
    }
    
    /**
     * <br />createReport(PDF帳票の作成)のテスト (異常系 / IOExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport2() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnValue(FileOutputStream.class, "<init>", new FileNotFoundException("FILE NOT FOUND"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("FILE NOT FOUND"));
        
        mockService.createReport("L9999", reportDomain);
    }

    /**
     * <br />createReport(PDF帳票の作成)のテスト (異常系 / FormGenerateExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport3() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnNull(AbstractReportServiceImpl.class, "getTemplatePath");
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("LB42-E7-0001"));
        
        mockService.createReport("L9999", reportDomain);
    }

    /**
     * <br />createReport(PDF帳票の作成)のテスト (異常系 / クローズエラーが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport4() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnValue(FileOutputStream.class, "close", new IOException("CLOSE ERROR"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("CLOSE ERROR"));
        
        mockService.createReport("L9999", reportDomain);
    }

    
    /**
     * <br />createReport(中間レポートの結合)のテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport5() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        
        mockService.createReport("L9999", Arrays.asList(mockService.createJasperPrint("L9999", reportDomain)));
    }

    /**
     * <br />createReport(中間レポートの結合)のテスト (異常系 / IOExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport6() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnValue(FileOutputStream.class, "<init>", new FileNotFoundException("FILE NOT FOUND"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("FILE NOT FOUND"));
        
        mockService.createReport("L9999", Arrays.asList(mockService.createJasperPrint("L9999", reportDomain)));
    }
    
    /**
     * <br />createReport(中間レポートの結合)のテスト (異常系 / FormGenerateExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport7() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnNull(FileOutputStream.class, "<init>");
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("LB42-E7-0001"));
        
        mockService.createReport("L9999", Arrays.asList(mockService.createJasperPrint("L9999", reportDomain)));
    }
    
    /**
     * <br />createReport(中間レポートの結合)のテスト (異常系 / クローズエラーが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateReport8() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnValue(FileOutputStream.class, "close", new IOException("CLOSE ERROR"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("CLOSE ERROR"));
        
        mockService.createReport("L9999", Arrays.asList(mockService.createJasperPrint("L9999", reportDomain)));
    }

    /**
     * <br />createJasperPrintのテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateJasperPrint() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        
        mockService.createJasperPrint("L9999", reportDomain);
    }
    
    /**
     * <br />createJasperPrintのテスト (異常系 / FormGenerateExceptionが発生する場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateJasperPrint2() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnNull(AbstractReportServiceImpl.class, "getTemplatePath");
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        thrown.expectMessage(containsString("L9999"));
        thrown.expectMessage(containsString("LB42-E7-0001"));
        
        mockService.createJasperPrint("L9999", reportDomain);
    }
    
    

    /**
     * <br />getResourcePathのテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetResourcePath() throws Exception {
        MockObjectManager.addReturnValue(Class.class, "getResource", getResource("AbstractReportServiceTest.jrxml"));
        
        assertThat(mockService.getResourcePath("AbstractReportServiceTest.jrxml"), is(mockTemplate));
    }
    
    /**
     * <br />getResourcePathのテスト (異常系 / リソースが存在しない場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetResourcePath2() throws Exception {
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString(NXS_91_0001));
        
        mockService.getResourcePath("NON_EXISTNECE_RESOURCE");
    }
    
    /**
     * <br />getResourcePathのテスト (異常系 / URLデコードできない場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetResourcePath3() throws Exception {
        MockObjectManager.addReturnValue(Class.class, "getResource", getResource("AbstractReportServiceTest.jrxml"));
        MockObjectManager.addReturnValue(URLDecoder.class, "decode", new UnsupportedEncodingException());
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        
        mockService.getResourcePath("AbstractReportServiceTest.pdf");
    }
    
    /**
     * <br />holdのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHold() throws Exception {
        assertThat(mockService.hold(null, 10), is(nullValue()));
        assertThat(mockService.hold("MMMME", 10), is("MMMME"));
        assertThat(mockService.hold("MMMMMMMMMEMMMME", 10), is("MMMMMMMMME\nMMMME"));
    }
    
    /**
     * <br />createOutputFileのテスト (異常系 / 一時ファイルが作成できない場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOutputFile() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        MockObjectManager.addReturnNull(AbstractReportServiceImpl.class, "getTemplatePath");
        MockObjectManager.addReturnValue(File.class, "createTempFile", new IOException("CREATE ERROR"));
        
        thrown.expect(SystemException.class);
        thrown.expectMessage(containsString("AI-90-0000"));
        
        mockService.createReport("L9999", reportDomain);
    }
    
    /**
     * <br />getLanguageCdのテスト (ログインユーザの言語が取得できる場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetLanguageCd() throws Exception {
        TmUserConfDomain tmUserConf = new TmUserConfDomain();
        tmUserConf.setLanguageCd("ja");
        
        MockObjectManager.setReturnValueAt(AbstractReportServiceImpl.class, "getResourcePath", 0, new SystemException("AI-90-0000"));
        MockObjectManager.setReturnValueAt(AbstractReportServiceImpl.class, "getResourcePath", 1, mockTemplate);
        MockObjectManager.addReturnValue(TmUserConfServiceImpl.class, "searchByKey", tmUserConf);

        mockService.createReport("L9999", reportDomain);
    }

    /**
     * <br />getLanguageCdのテスト (ログインユーザの言語が取得できない場合)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetLanguageCd2() throws Exception {
        MockObjectManager.addReturnValue(AbstractReportServiceImpl.class, "getTemplatePath", mockTemplate);
        MockObjectManager.addReturnValue(TmUserConfServiceImpl.class, "searchByKey", new ApplicationException(""));

        mockService.createReport("L9999", reportDomain);
    }
    
    /**
     * <br />クラスロードを使用して、指定されたリソースのURLを取得します。
     *
     * @param name リソース名
     * @return リソースのURL
     */
    private URL getResource(String name) {
        return getClass().getResource(name);
    }

    /**
     * <br />指定されたリソースに対する入力ストリームを作成する。
     *
     * @param resource リソース名
     * @return 入力ストリーム
     * @throws IOException 入力ストリームが作成できなかった場合
     */
    private InputStream getInputStream(String resource) throws IOException {
        return getResource(resource).openStream();
    }
}
