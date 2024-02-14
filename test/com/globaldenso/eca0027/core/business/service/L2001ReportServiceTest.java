package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L2001ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L2001ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L2001ReportService l2001ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L2001ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l2001ReportService = (L2001ReportService)getContext().getBean("l2001ReportService");
    }

//    /**
//     * 正常ケース
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        String pltzInstrNo = "TG1234567";
//        File file = l2001ReportService.searchPltzInstr(pltzInstrNo, "yyyy/MM/dd");
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
//        String pltzInstrNo = "999";
//        try {
//            l2001ReportService.searchPltzInstr(pltzInstrNo, "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     *  計量単位換算原単位(小数用)を取得できない場合Exceptionをスロー
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testErr_2() throws Exception {
//        String pltzInstrNo = "2";
//        try {
//            l2001ReportService.searchPltzInstr(pltzInstrNo, "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(GSCM_E0_0001, e.getMessage());
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
//        MockObjectManager.setReturnValueAtAllTimes(L2001ReportServiceImpl.class, "createQrCode", new IOException());
//        try {
//            l2001ReportService.searchPltzInstr("TG1234567", "yyyy/MM/dd");
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
//        MockObjectManager.setReturnValueAtAllTimes(L2001ReportServiceImpl.class, "createQrCode", new QrcodeGenerateException(""));
//        try {
//            l2001ReportService.searchPltzInstr("TG1234567", "yyyy/MM/dd");
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
//            l2001ReportService.searchPltzInstr("TG1234567", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (Exception e) {
//            assertEquals(true, e instanceof GscmApplicationException);
//        }
//    }    
//
    /**
     * 帳票を作成します。
     * @throws ApplicationException a
     * @throws QrcodeGenerateException a
     * @throws IOException IOException
     */
    @Test
    public void testPrint() throws ApplicationException, IOException, QrcodeGenerateException {
        String pltzInstrNo = "ADTH000001";
//        String pltzInstrNo = "ADTH000000";
        File report = l2001ReportService.searchPltzInstr(pltzInstrNo, "yyyy/MM/dd");
        displayReport(report, true);
    }
}
