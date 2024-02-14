package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * L6010ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L6010ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L6010ReportService l6010ReportService;

    /**
     * Type in the role of the field.
     */
    private FileManagementService fileManagerServiceForStream;
    
    
    
    /**
     * デフォルトコンストラクタ。
     */
    public L6010ReportServiceTest() {
    }
    
    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l6010ReportService = (L6010ReportService) getContext().getBean("l6010ReportService");
        fileManagerServiceForStream = (FileManagementService) getContext().getBean("fileManagerServiceForStream");
    }

    /**
     * Type in the functional overview of the method.
     *
     * @return fileId
     * @throws Exception Exception
     */
    public String getFileData() throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg"));
        try {
            // ファイルデータの登録
            return fileManagerServiceForStream.createFileUpload(inputStream, "testFileName1", 1, "testUser");
        } finally {
            closeQuietly(inputStream);
        }
    }
    
//    /**
//     * 正常ケース
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        
//        // ファイルデータ登録
//        TmInvTplDomain dm = new TmInvTplDomain();
//        dm.setMaster1(getFileData());
//        MockObjectManager.setReturnValueAtAllTimes(L6010ReportServiceImpl.class, "getImage", dm);
//        
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        File file = l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 正常ケース
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testNormal_2() throws Exception {
//
//        // ファイルデータ登録
//        TmInvTplDomain dm = new TmInvTplDomain();
//        dm.setMaster1(getFileData());
//        MockObjectManager.setReturnValueAtAllTimes(L6010ReportServiceImpl.class, "getImage", dm);
//        
//        String shipper = "2";
//        String invoiceNo = "2";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "2";
//        File file = l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合Exceptionをスロー
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        
//        String shipper = "999";
//        String invoiceNo = "999";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/08 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "999";
//        try {
//            l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//    
//    /** 
//     * 異常ケース
//     * 
//     * 画像取得に失敗した場合Exceptionをスロー
//     *
//     * @throws Exception Exception
//     */
//    @Test
//    public void testErr_3() throws Exception {
//
//        // ファイルデータ登録
//        TmInvTplDomain dm = new TmInvTplDomain();
//        dm.setMaster1(getFileData());
//        MockObjectManager.setReturnValueAtAllTimes(L6010ReportServiceImpl.class, "getImage", dm);
//        MockObjectManager.setReturnValueAtAllTimes(L6010ReportServiceImpl.class, "getFileDomain", new IOException());
//        
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        try {
//            l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
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
//     *
//     * @throws Exception Exception
//      */
//    @Test
//    public void testErr_5() throws Exception {
//
//        // ファイルデータ登録
//        TmInvTplDomain dm = new TmInvTplDomain();
//        dm.setMaster1(getFileData());
//        MockObjectManager.setReturnValueAtAllTimes(L6010ReportServiceImpl.class, "getImage", dm);
//        MockObjectManager.setReturnValueAtAllTimes(ByteArrayOutputStream.class, "close", new IOException());
//        
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        try {
//            l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }
//
    /**
     * 帳票を作成します。
     * @throws ApplicationException 帳票作成に失敗した場合
     */
    @Test
    public void test() throws ApplicationException {
//        FileManagementDomain fileDomain = new FileManagementDomain();
//        try {
//            FileManagementService fileManagerServiceForStream = (FileManagementService)context.getBean("fileManagerServiceForStream");
//            fileDomain.setFileData(new FileInputStream(new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg")));
//            // ファイルデータの登録
//            String fileId = fileManagerServiceForStream.createFileUpload(fileDomain.getFileData(), "testFileName1", 1, "testUser");
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
        
        // テスト用データ
        String shipper = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
        String invoiceTemplateNo = "1";
        File report = l6010ReportService.searchPackAtchedForErt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "yyyy/MM/dd");
        displayReport(report, true);
    }
}

