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
 * L6015ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L6015ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L6015ReportService l6015ReportService;

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
    public L6015ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l6015ReportService = (L6015ReportService) getContext().getBean("l6015ReportService");
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
//        File file = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
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
//        File file = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
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
//        File file = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
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
//        File file = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        String shipper = "999";
//        String invoiceNo = "999";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/08 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "999";
//        try {
//            l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }
//    
//    /**
//     * 異常ケース
//     * 
//     * 文字コードにUTF-8以外を渡した場合GscmApplicationExceptionをスロー
//     */
//    @Test
//    public void testErr_2() throws Exception {
//        String shipper = "1";
//        String invoiceNo = "1";
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        String invoiceTemplateNo = "1";
//        try {
//            l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "aaaa", "yyyy/MM/dd");
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
//        MockObjectManager.setReturnValueAtAllTimes(L6015ReportServiceImpl.class, "getFileDomain", new IOException());
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        try {
//            l6015ReportService.searchSalesCntrctAtchedForRt("1", "1", invoiceIssueDt, "1", "UTF-8", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        } 
//    }
//
//    /**
//     * 異常ケース
//     * 
//     *  OutputStreamのクローズに失敗した場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_5() throws Exception {
//        MockObjectManager.setReturnValueAtAllTimes(OutputStream.class, "close", new IOException());
//        MockObjectManager.setReturnValueAtAllTimes(L6015ReportServiceImpl.class, "getOutputStream", new ByteArrayOutputStream());
//        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
//        try {
//            l6015ReportService.searchSalesCntrctAtchedForRt("1", "1", invoiceIssueDt, "1", "UTF-8", "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (SystemException e) {
//            assertEquals(NXS_91_0001, e.getMessage());
//        }
//    }
//
    /**
     * 帳票を作成します。
     * @throws ApplicationException Exception 
     */
    @Test
    public void test() throws ApplicationException {
//        FileManagementDomain fileDomain = new FileManagementDomain();
//        try {
//            fileDomain.setFileData(new FileInputStream(new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        MockObjectManager.setReturnValueAtAllTimes(L6015ReportServiceImpl.class, "getFileDomain", fileDomain );
        // テスト用データ
        String shipper = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
        String invoiceTemplateNo = "1";
        File report = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
        displayReport(report, true);
    }
}

