package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L2004ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L2004ReportServiceTest extends AbstractEca0027Test {

    /**
     * L2004Report Servise
     */
    private L2004ReportService l2004ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L2004ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l2004ReportService = (L2004ReportService)getContext().getBean("l2004ReportService");
    }

//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        File file = l2004ReportService.searchXtag("1", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        try {
//            l2004ReportService.searchXtag("999", "999", "yyyy/MM/dd");
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
//     */
//    @Test
//    public void testErr_3() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L2004ReportServiceImpl.class, "createQrCode", new IOException());
//        try {
//            l2004ReportService.searchXtag("1", "1", "yyyy/MM/dd");
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
//     */
//    @Test
//    public void testErr_4() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(L2004ReportServiceImpl.class, "createQrCode", new QrcodeGenerateException(""));
//        try {
//            l2004ReportService.searchXtag("1", "1", "yyyy/MM/dd");
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
//     */
//    @Test
//    public void testErr_5() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(ByteArrayOutputStream.class, "close", new Exception());
//        try {
//            l2004ReportService.searchXtag("1", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException error 
     */
    @Test
    public void test() throws ApplicationException {
        File report = l2004ReportService.searchXtag("XMAINMARK01234567890", "1", "yyyy/MM/dd");
//        File report = l2004ReportService.searchXtag("X0", "1", "yyyy/MM/dd");
        displayReport(report, true);
    }
}

