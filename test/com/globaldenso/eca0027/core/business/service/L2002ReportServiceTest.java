package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L2002ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L2002ReportServiceTest extends AbstractEca0027Test {

    /**
     * Interface
     */
    private L2002ReportService l2002ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L2002ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l2002ReportService = (L2002ReportService)getContext().getBean("l2002ReportService");
    }

    /**
     * 正常ケース
     */
//    @Test
//    public void testNormal_1() throws Exception {
//        File file = l2002ReportService.searchMixTag("1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        try {
//            l2002ReportService.searchMixTag("999", "yyyy/MM/dd");
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
//    public void testErr_2() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "createQrCode", new IOException());
//        try {
//            l2002ReportService.searchMixTag("1", "yyyy/MM/dd");
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
//    public void testErr_3() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(L2002ReportServiceImpl.class, "createQrCode", new QrcodeGenerateException(""));
//        try {
//            l2002ReportService.searchMixTag("1", "yyyy/MM/dd");
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
//    public void testErr_4() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(ByteArrayOutputStream.class, "close", new Exception());
//        try {
//            l2002ReportService.searchMixTag("1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * GWの整数部桁数が整数部最大桁数を超えている場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_5() throws Exception {
//
//        MockObjectManager.setReturnNullAtAllTimes(CommonServiceImpl.class, "convertWeightUnit");
//        try {
//            l2002ReportService.searchMixTag("1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(NXS_E7_0157, e.getMessage());
//        }
//    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException Exception 
     * @throws QrcodeGenerateException Exception 
     * @throws IOException Exception 
     */
    @Test
    public void test() throws ApplicationException, IOException, QrcodeGenerateException {
        String mixTagNo = "MMYEWH01405010001";
//        String mixTagNo = "MMYEWH01405010000";
        File report = l2002ReportService.searchMixTag(mixTagNo, "yyyy/MM/dd");
        displayReport(report, true);
    }

}

