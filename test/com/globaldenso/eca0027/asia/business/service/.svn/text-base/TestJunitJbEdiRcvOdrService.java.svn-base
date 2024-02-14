package com.globaldenso.eca0027.asia.business.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain;
import com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for JbEdiRcvOdrServiceImpl.
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TestJunitJbEdiRcvOdrService extends TestCase {

    /**
     * Constructor.
     */
    public TestJunitJbEdiRcvOdrService() {
    }

    // --------------------------------- トランザクション系メソッド transact
    // ----------------------------------

    /**
     * Test method for transactRequest <br />
     * transactRequestメソッドのテスト。
     */
    @Test
    public void testTransactRequest1() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        ResidentRequestApplicationService testService = (ResidentRequestApplicationService)getContext()
            .getBean("jbEdiRcvOdrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        ResidentRequestDomain req = new ResidentRequestDomain();
        req.setRequestId("98700000000000000001");
        // req.setRequestId("00000000000000000274");

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

    // --------------------------------- Private methods below
    // ----------------------------------

    /**
     * Get an ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"applicationContext-aijb-residentReqApp.xml",
                "applicationContext-aijb-jdbc.xml",
                "applicationContext-aijb-aop.xml",
                "applicationContext-library.xml"});
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
