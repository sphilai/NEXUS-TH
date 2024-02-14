package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L7001ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L7001ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L7001ReportService l7001ReportService;

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L7001ReportServiceTest() {
    }
    
    /**
     * 
     * 前処理
     *
     * @throws Exception 例外発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l7001ReportService = (L7001ReportService) getContext().getBean("l7001ReportService");
    }

//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintShippingAct_nomal_1() throws Exception {
//        File file = l7001ReportService.searchShippingAct("1", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintShippingAct_nomal_2() throws Exception {
//        File file = l7001ReportService.searchShippingAct("2", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 正常ケース
//     * 
//     * @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintShippingAct_nomal_3() throws Exception {
//        File file = l7001ReportService.searchShippingAct("4", "1", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * @throws Exception 帳票出力件数がゼロ件の場合Exceptionをスロー
//     */
//    @Test
//    public void testPrintShippingAct_err_1() throws Exception {
//        try {
//            l7001ReportService.searchShippingAct("999", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * @throws Exception マスタに登録されていない単位だった場合Exceptionをスロー
//     */
//    @Test
//    public void testPrintShippingAct_err_3() throws Exception {
//        try {
//            l7001ReportService.searchShippingAct("3", "1", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(GSCM_E0_0001, e.getMessage());
//        }
//    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException 例外が発生した場合
     */
    @Test
    public void test() throws ApplicationException {
//        File report = l7001ReportService.searchShippingAct("NODATA", "MYG", "yyyy/MM/dd");
        File report = l7001ReportService.searchShippingAct("SA_G1", "MYG", "yyyy/MM/dd");
//        File report = l7001ReportService.searchShippingAct("san002", "MYG", "dd/MM/yyyy");
        displayReport(report, true);
    }
}
