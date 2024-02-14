/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain;
import com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for JbEdiRcvOdrServiceImpl.
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13820 $
 */
public class TestJunitJbOdrUploadService extends TestCase {

    /**
     * Constructor.
     */
    public TestJunitJbOdrUploadService() {
    }

    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * Test method for transactRequest
     * <br />transactRequestメソッドのテスト。
     */
    public void testTransactRequest1() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        ResidentRequestApplicationService testService
            = (ResidentRequestApplicationService)getContext().getBean("jbOdrUploadService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // ローカルファイルシステムのファイルを読んでファイルマネージャーを更新する。
        String fileId = "00000000000000009603";
        FileManagementService fileManagerServiceForStream
            = (FileManagementService)getContext().getBean("fileManagerServiceForStream");
        File file = new File("C:\\work\\０１１．開発作業（NEXUS拠点間物流）\\20161117_UT200受注CSVアップロード\\data\\Order_Upload_Job_Unit_Test_ファイル名にマルチバイト文字も使用可能_01.csv");
        String fileNm = file.getName();
        InputStream inputStream = null;
        try {
            FileManagementDomain fileManagementResultDomain
                = fileManagerServiceForStream.searchFileDownload(fileId, false, null);
            inputStream = new FileInputStream(file);
            fileManagerServiceForStream.updateFileData(fileId,
                inputStream, fileNm, null, "dummy", fileManagementResultDomain.getLastUpdateDate());
        } catch (Exception e) {
            System.out.println(e);
            fail();
        } finally {
            try {
                inputStream.close();
            } catch (Exception e) {}
        }

        // Create search criteria domain
        // 検索条件ドメイン作成
        ResidentRequestDomain req = new ResidentRequestDomain();
        req.setRequestId("00000000000000001051"); // 

        // Call the test method
        // テスト対象メソッドの呼び出し
        boolean result = false;
        try {
            result = testService.transactRequest(req);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert result value
        // 戻り値をassert
        assertEquals(true, result);
    }

    //--------------------------------- Private methods below ----------------------------------

    /**
     * Get an ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {
                    "applicationContext-aijb-residentReqApp.xml"
                ,   "applicationContext-aijb-jdbc.xml"
                ,   "applicationContext-aijb-aop.xml"
                ,   "applicationContext-library.xml"
            }
        );
        return context;
    }

    /**
     * Conversion datetime string -> java.util.Date
     */
    private Date toDatetime(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * Conversion datetime string -> java.sql.Timestamp
     */
    private Timestamp toTimestamp(String s) {
        return new Timestamp(toDatetime(s).getTime());
    }
}
