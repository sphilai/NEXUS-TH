package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * L9001ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L9001ReportServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private L9001ReportService l9001ReportService;

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
    public L9001ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l9001ReportService = (L9001ReportService) getContext().getBean("l9001ReportService");
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
    
    /**
     * 正常ケース
     * 
     * @throws Exception Exception
     */
    @Test
    public void testNormal_1() throws Exception {
        String company = "1";
        String documentNo = "1";
        File file = l9001ReportService.searchSmplInvHdrForCmrclIntang(company, documentNo);
        assertNotNull(file);
    }
    
    /**
     * 異常ケース
     * 
     * 帳票出力件数がゼロ件の場合GscmApplicationExceptionをスロー
     * 
     * @throws Exception Exception
     */
    @Test
    public void testErr_1() throws Exception {
        String company = "999";
        String documentNo = "999";
        try {
            l9001ReportService.searchSmplInvHdrForCmrclIntang(company, documentNo);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /** 
     * 異常ケース
     * 
     * 画像取得に失敗した場合Exceptionをスロー
     * 
     * @throws Exception Exception
     */
    @Test
    public void testErr_3() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(L9001ReportServiceImpl.class, "getFileDomain", new IOException());
        try {
            l9001ReportService.searchSmplInvHdrForCmrclIntang("1", "1");
            fail("この行は、実行されないはず");
        } catch (SystemException e) {
            assertEquals(NXS_91_0001, e.getMessage());
        } 
    }

    /**
     * 異常ケース
     * 
     *  OutputStreamのクローズに失敗した場合Exceptionをスロー
     *  
     *  @throws Exception Exception
     */
    @Test
    public void testErr_5() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(OutputStream.class, "close", new IOException());
        MockObjectManager.setReturnValueAtAllTimes(L9001ReportServiceImpl.class, "getOutputStream", new ByteArrayOutputStream());
        try {
            l9001ReportService.searchSmplInvHdrForCmrclIntang("1", "1");
            fail("この行は、実行されないはず");
        } catch (SystemException e) {
            assertEquals(NXS_91_0001, e.getMessage());
        }
    } 

//    /**
//     * 帳票を作成します。
//     * @throws ApplicationException 
//     */
//    @Test
//    public void test() throws ApplicationException {
//        FileManagementDomain fileDomain = new FileManagementDomain();
//        try {
//            fileDomain.setFileData(new FileInputStream(new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        MockObjectManager.setReturnValueAtAllTimes(L9001ReportServiceImpl.class, "getFileDomain", fileDomain );
//        // テスト用データ
//        String company = "1";
//        String documentNo = "1";
//        File report = l9001ReportService.searchSmplInvHdrForCmrclIntang(company, documentNo);
//        displayReport(report, true);
//    }
}

