package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * L6008ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L6008ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L6008ReportService l6008ReportService;

    /**
     * ファイルマネージャ
     */
    private FileManagementService fileManagerServiceForStream;

    /**
     * Type in the role of the field.
     */
    private String fileId;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L6008ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l6008ReportService = (L6008ReportService) getContext().getBean("l6008ReportService");
        fileManagerServiceForStream = (FileManagementService) getContext().getBean("fileManagerServiceForStream");
    }

    /**
     * Type in the functional overview of the method.
     *
     * @return FileManagementDomain FileManagementDomain
     * @throws Exception Exception
     */
    private FileManagementDomain getTestFileDomain() throws Exception {
        FileManagementDomain fileDomain = new FileManagementDomain();
        FileInputStream inputStream = new FileInputStream(
            new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg"));
        try {
            fileDomain.setFileData(inputStream);
            return fileDomain;
        } finally {
            closeQuietly(inputStream);
        }
    }
    
    /**
     * Type in the functional overview of the method.
     *
     * @throws Exception Exception
     */
    public void setLbFileManager() throws Exception {
        // ファイルデータの登録
        fileId = fileManagerServiceForStream.createFileUpload(getTestFileDomain().getFileData(), "testFileName1", 1, "testUser");
        if (fileId == null) {;}
    }
    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_2() throws Exception {
//        String shipper = "2";
//        String invoiceNo = "2";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "2";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_3() throws Exception {
//        String shipper = "3";
//        String invoiceNo = "3";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "3";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_4() throws Exception {
//        String shipper = "4";
//        String invoiceNo = "4";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "4";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_5() throws Exception {
//        String shipper = "5";
//        String invoiceNo = "5";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "5";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_6() throws Exception {
//        String shipper = "6";
//        String invoiceNo = "6";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "6";
//        File file = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
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
//        String shipper = "999";
//        String invoiceNo = "999";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/08 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "999";
//        try {
//            l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     * 項目にnullが入った状態でバイト数カットのメソッドが実行された場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_2() throws Exception {
//        String shipper = "4";
//        String invoiceNo = "4";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "4";
//        try {
//            l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "aaaa");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }
//    
//    /** 
//     * 異常ケース
//     * 
//     * 画像取得に失敗した場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_3() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(L6008ReportServiceImpl.class, "getFileDomain", new IOException());
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        try {
//            l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        } 
//    }
//
//     /**
//      * 異常ケース
//      * 
//      *  OutputStreamのクローズに失敗した場合Exceptionをスロー
//      */
//    @Test
//    public void testErr_5() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(OutputStream.class, "close", new IOException());
//        MockObjectManager.setReturnValueAtAllTimes(L6008ReportServiceImpl.class, "getOutputStream", new ByteArrayOutputStream());
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        try {
//            l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }

    /**
     * 帳票を作成します。
     * @throws ApplicationException Exception 
     */
    @Test
    public void test() throws ApplicationException {

//        FileManagementDomain fileDomain = new FileManagementDomain();
//        try {
//            FileManagementService fileManagerServiceForStream = (FileManagementService)context.getBean("fileManagerServiceForStream");
//            fileDomain.setFileData(new FileInputStream(new File("C:/tmp/denso/ReportImageTest.jpg")));
//            // ファイルデータの登録
//            String fileId = fileManagerServiceForStream.createFileUpload(fileDomain.getFileData(), "ReportImageTest.jpg", 1, "testUser");
//            // テンプレートマスタを生成したファイルIDへ関連付ける
//            TmInvTplService tmInvTplService = (TmInvTplService)context.getBean("tmInvTplService");
//            List<TmInvTplDomain> tplList = tmInvTplService.searchByCondition(new TmInvTplCriteriaDomain());
//            for (TmInvTplDomain dm : tplList) {
//                TmInvTplDomain domain = new TmInvTplDomain();
//                domain.setCompCd(dm.getCompCd());
//                domain.setDocNo(dm.getDocNo());
//                domain.setComUpdateTimestamp(dm.getComUpdateTimestamp());
//                domain.setMaster1(fileId);
//                domain.setMaster5(fileId);
//                domain.setMaster6(fileId);
//                domain.setMaster9(fileId);
//                domain.setMaster12(fileId);
//                domain.setMaster13(fileId);
//                tmInvTplService.update(domain);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        MockObjectManager.setReturnValueAtAllTimes(L6008ReportServiceImpl.class, "getFileDomain", fileDomain );
        // テスト用データ
        String shipper = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
        String invoiceTemplateNo = "1";
        File report = l6008ReportService.searchPackAtchedForMain(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd", "UTF-8");
        displayReport(report, true);
    }
}
