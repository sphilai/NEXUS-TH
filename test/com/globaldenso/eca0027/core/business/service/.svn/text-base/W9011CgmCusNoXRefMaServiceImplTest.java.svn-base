/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W4001StgInstrServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011CgmCusNoXRefMaServiceImplTest extends TestCase{

    /**
     * Constructor.
     */
    public W9011CgmCusNoXRefMaServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9011CgmCusNoXRefMaService testService
            = (W9011CgmCusNoXRefMaService)getContext().getBean("w9011CgmCusNoXRefMaService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain
            = new W9011CgmCusNoXRefMaCriteriaDomain();
        criteriaDomain.setServerId("dev");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);

        // Create search expectation domain
        // 検索予想ドメイン作成
        W9011CgmCusNoXRefMaDomain expectation = new W9011CgmCusNoXRefMaDomain();
        expectation.setLgcyLibCompCd("TG0");
        expectation.setCustomerCd("10000001");
        expectation.setConsigneeCd("JP0");
        expectation.setReInvoiceFlg("N");

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W9011CgmCusNoXRefMaDomain> result = new ArrayList<W9011CgmCusNoXRefMaDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getLgcyLibCompCd(), result.get(0).getLgcyLibCompCd());
        assertEquals(expectation.getCustomerCd(), result.get(0).getCustomerCd());
        assertEquals(expectation.getConsigneeCd(), result.get(0).getConsigneeCd());
        assertEquals(expectation.getReInvoiceFlg(), result.get(0).getReInvoiceFlg());

        // Log output of search results
        Debug.dump(result);
    }

    /**
     * Test method for searchCount
     * <br /> searchCountメソッドのテスト。
     */
    public void testSearchCount() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9011CgmCusNoXRefMaService testService
            = (W9011CgmCusNoXRefMaService)getContext().getBean("w9011CgmCusNoXRefMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain
            = new W9011CgmCusNoXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("TG0");
        criteriaDomain.setCustomerCd("10000001");
        criteriaDomain.setConsigneeCd("JP0");
        criteriaDomain.setReInvoiceFlg("N");
        criteriaDomain.setServerId("dev");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("W9011");

        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCount(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(1, searchCount);
        
        // Log output of search results
        Debug.dump(searchCount);

    }

    /**
     * Test method for searchCount
     * <br /> searchByConditionメソッドのテスト。
     */
    public void testSearchByCondition(){

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9011CgmCusNoXRefMaService testService
            = (W9011CgmCusNoXRefMaService)getContext().getBean("w9011CgmCusNoXRefMaService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9011CgmCusNoXRefMaCriteriaDomain criteriaDomain
            = new W9011CgmCusNoXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("MA0");
        criteriaDomain.setCustomerCd("1");
        criteriaDomain.setServerId("dev");

        // Create search expectation domain
        // 検索予想ドメイン作成
        W9011CgmCusNoXRefMaDomain expectation = new W9011CgmCusNoXRefMaDomain();
        expectation.setLgcyLibCompCd("MA0");
        expectation.setCustomerCd("1");
        expectation.setConsigneeCd("JP0");
        expectation.setReInvoiceFlg("N");
        expectation.setComUpdateTimestamp(toTimestamp("2014/05/22 09:34:55"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W9011CgmCusNoXRefMaDomain> result = new ArrayList<W9011CgmCusNoXRefMaDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getLgcyLibCompCd(), result.get(0).getLgcyLibCompCd());
        assertEquals(expectation.getCustomerCd(), result.get(0).getCustomerCd());
        assertEquals(expectation.getConsigneeCd(), result.get(0).getConsigneeCd());
        assertEquals(expectation.getReInvoiceFlg(), result.get(0).getReInvoiceFlg());
        assertEquals(expectation.getComUpdateTimestamp(), result.get(0).getComUpdateTimestamp());

        // Log output of search results
        Debug.dump(result);
    }
    //--------------------------------- Private methods below ----------------------------------

    /**
     * Get an ApplicationContext
     * @return ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {
                "WEB-INF/applicationContext-aij2.xml"
                , "WEB-INF/applicationContext-aij2-jdbc.xml"
                , "WEB-INF/applicationContext-aij2-aop.xml"
                , "WEB-INF/applicationContext-library.xml"
            }
        );
        return context;
    }

    /**
     * Conversion datetime string -> java.util.Date
     * @param s String型の日付
     * @return date Date型の日付
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
     * @param s String型の日付
     * @return Timestamp型の日付
     */
    private Timestamp toTimestamp(String s) {
        return new Timestamp(toDatetime(s).getTime());
    }
}

