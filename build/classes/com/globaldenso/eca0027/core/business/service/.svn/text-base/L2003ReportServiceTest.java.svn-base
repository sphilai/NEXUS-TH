package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L2003ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L2003ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L2003ReportService l2003ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L2003ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l2003ReportService = (L2003ReportService)getContext().getBean("l2003ReportService");
    }

//    /**
//     * 正常ケース
//     * 
//     * (単品１・多品１)、梱包指示NOあり
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintCml1() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "getTimeZoneDtVal", new Date("2010/11/18"));
//        File file = l2003ReportService.searchCml("TG022435-9", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 正常ケース
//     * 
//     * (単品１・多品１)、梱包指示NOなし
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintCml2() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "getTimeZoneDtVal", new Date("2010/11/18"));
//        File file = l2003ReportService.searchCml("", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合Exceptionをスロー
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        try {
//            l2003ReportService.searchCml("XXXXXXXXX", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     *  QRコード生成に失敗した場合Exceptionをスロー
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testErr_3() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "getTimeZoneDtVal", new Date("2010/11/18"));
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "createQrCode", new IOException());
//        try {
//            l2003ReportService.searchCml("TG022435-9", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals("NXS-E1-5065", e.getMessage());
//        } 
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     *  QRコード生成に失敗した場合Exceptionをスロー
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testErr_4() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "getTimeZoneDtVal", new Date("2010/11/18"));
//        MockObjectManager.setReturnValueAtAllTimes(L2003ReportServiceImpl.class, "createQrCode", new QrcodeGenerateException(""));
//        try {
//            l2003ReportService.searchCml("TG022435-9", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals("NXS-E1-5065", e.getMessage());
//        } 
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     *  QRコードストリームのクローズに失敗した場合Exceptionをスロー
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testErr_5() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(ByteArrayOutputStream.class, "close", new Exception());
//        try {
//            l2003ReportService.searchCml("TG022435-9", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }    

    /**
     * 帳票を作成します。
     * @throws ApplicationException ApplicationException
     */
    @Test
    public void test() throws ApplicationException {
//        File report = l2003ReportService.searchCml("", "MMW6009Y001", "yyyy/MM/dd");
        File report = l2003ReportService.searchCml("TG022435-9", "1", "yyyy/MM/dd");
//        File report = l2003ReportService.searchCml("NODATA", "1", "yyyy/MM/dd");
        displayReport(report, true);
    }
}

