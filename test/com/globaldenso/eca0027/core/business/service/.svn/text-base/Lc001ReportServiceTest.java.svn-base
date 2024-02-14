package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * LC001ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Lc001ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private LC001ReportService lC001ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public Lc001ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        lC001ReportService = (LC001ReportService) getContext().getBean("lc001ReportService");
    }

//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外が発生した場合
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        
//        File file = lC001ReportService.searchErt("1", "2", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外が発生した場合
//     */
//    @Test
//    public void testNormal_2() throws Exception {
//        File file = lC001ReportService.searchErt("2", "3", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外が発生した場合
//     */
//    @Test
//    public void testNormal_3() throws Exception {
//        File file = lC001ReportService.searchErt("1", "0", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     * @throws Exception 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー(ヘッダー情報)
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        try {
//            lC001ReportService.searchErt("10", "11", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * @throws Exception 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー(ヘッダー情報)
//     */
//    @Test
//    public void testErr_2() throws Exception {
//        try {
//            lC001ReportService.searchErt("10", "2", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     *  @throws Exception QRコード生成に失敗した場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_3() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(LC001ReportServiceImpl.class, "createQrCode", new IOException());
//        try {
//            lC001ReportService.searchErt("1", "2", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals("NXS-E1-5065", e.getMessage());
//        } 
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     *  @throws Exception QRコード生成に失敗した場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_4() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(LC001ReportServiceImpl.class, "createQrCode", new QrcodeGenerateException(""));
//        try {
//            lC001ReportService.searchErt("1", "2", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals("NXS-E1-5065", e.getMessage());
//        } 
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     *  @throws Exception QRコードストリームのクローズに失敗した場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_5() throws Exception {
//
//        MockObjectManager.setReturnValueAtAllTimes(ByteArrayOutputStream.class, "close", new Exception());
//        try {
//            lC001ReportService.searchErt("1", "2", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    } 

    /**
     * 帳票を作成します。
     * @throws ApplicationException 例外が発生した場合
     */
    @Test
    public void test() throws ApplicationException {
        MockObjectManager.setReturnValueAtAllTimes(AbstractReportServiceImpl.class, "getLanguageCd", "en");
        // テスト用データ
        File report = lC001ReportService.searchErt("MMW6009Y001", "MMW6009Y002", "yyyy/MM/dd");
//        File report = lC001ReportService.searchErt("NO", "DATA", "yyyy/MM/dd");
        displayReport(report, true);
    }
}

