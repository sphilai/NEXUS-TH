package com.globaldenso.eca0027.core.business.service;


import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * LB001ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 8830 $
 */
public class Lb001ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private LB001ReportService lB001ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public Lb001ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        lB001ReportService = (LB001ReportService) getContext().getBean("lB001ReportService");
        if (lB001ReportService == null) {;}
    }

//    /**
//     * 正常ケース
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testNormal_1() throws Exception {
////        ResidentRequestDomain residentRequestDomain = new ResidentRequestDomain();
////        String shipper = "VN0";
////        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
////        File file = lB001ReportService.searchOdrRcv(shipper, invoiceIssueDt, "yyyy/MM/dd", "1");
////        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testNormal_2() throws Exception {
////        String shipper = "TG0";
////        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
////        File file = lB001ReportService.searchOdrRcv(shipper, invoiceIssueDt, "yyyy/MM/dd", "1");
////        assertNotNull(file);
//    }
//    
//    /**
//     * 異常ケース
//     *
//     * @throws Exception Exception
//     * 
//     * 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー(ヘッダー情報)
//     */
//    @Test
//    public void testErr_1() throws Exception {
////        String shipper = "1";
////        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
////        try {
////            lB001ReportService.searchOdrRcv(shipper, invoiceIssueDt, "yyyy/MM/dd", "1");
////            fail("この行は、実行されないはず");
////        } catch (GscmApplicationException e) {
////            assertEquals(GSCM_E0_0010, e.getMessage());
////        }
//    }
//
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー(ヘッダー情報)
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testErr_2() throws Exception {
////        String shipper = "AAA";
////        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
////        try {
////            lB001ReportService.searchOdrRcv(shipper, invoiceIssueDt, "yyyy/MM/dd", "1");
////            fail("この行は、実行されないはず");
////        } catch (GscmApplicationException e) {
////            assertEquals(GSCM_E0_0010, e.getMessage());
////        }
//    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException ApplicationException 
     */
//    @Test
    public void test() throws ApplicationException {
        LB001ReportService lB001ReportService =
            (LB001ReportService) getContext().getBean("lB001ReportService");
        // テスト用データ
//        String shipper = "VN0";
        String shipper = "MMM";
        SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date transDate = null;
        try {
            transDate = formatA.parse("2014/06/01 1:00:00");
        } catch (ParseException e) {
            // パース時の例外をキャッチします。
            e.printStackTrace();
        }
        String CustCd = null;
        String lgcyShipTo = null;
        String plantCd = null;
        CustCd = "MMMMMMMM";
        lgcyShipTo = "99";
        plantCd = "99";
//        lgcyShipTo = "01";
//      plantCd = "4";
        String subCd = "99";
       
        //        String shipper = "NODATA";
        Date cigmaAds = new Date();
        File report = lB001ReportService.searchOdrRcv(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd, cigmaAds, "yyyy/MM/dd");
        displayReport(report, true);
        
        // テスト用データ
        /*shipper = "VN0";
        cigmaAds = new Date();
        report = lB001ReportService.searchOdrRcv(shipper, cigmaAds, "yyyy/MM/dd", "reqId");
        displayReport(report, true);*/
    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException ApplicationException 
     */
    @Test
    public void test_2266() throws ApplicationException {
        LB001ReportService lB001ReportService =
            (LB001ReportService) getContext().getBean("lB001ReportService");
        // テスト用データ
        String shipper = "TG0";
        SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date transDate = null;
        try {
            transDate = formatA.parse("2014/09/10 0:00:00");
        } catch (ParseException e) {
            // パース時の例外をキャッチします。
            e.printStackTrace();
        }
        String CustCd = null;
        String lgcyShipTo = null;
        String plantCd = null;
        String subCd = null;
        
        CustCd = "30001204";
        lgcyShipTo = "01";
        plantCd = "A1";
        subCd = "TW";

        Date cigmaAds = new Date();
        File report = lB001ReportService.searchOdrRcv(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd, cigmaAds, "yyyy/MM/dd");
        displayReport(report, true);
        
    }
}

