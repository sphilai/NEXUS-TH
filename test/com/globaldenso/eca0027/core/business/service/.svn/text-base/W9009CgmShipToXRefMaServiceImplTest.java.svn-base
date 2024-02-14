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

import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W4001StgInstrServiceImpl.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5941 $
 */
public class W9009CgmShipToXRefMaServiceImplTest extends TestCase{

    /**
     * Constructor.
     */
    public W9009CgmShipToXRefMaServiceImplTest() {
    }
    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchByConditionForPaging() throws Exception{

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9009CgmShipToXRefMaService testService
            = (W9009CgmShipToXRefMaService)getContext().getBean("w9009CgmShipToXRefMaService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9009CgmShipToXRefMaCriteriaDomain criteriaDomain
            = new W9009CgmShipToXRefMaCriteriaDomain();
        criteriaDomain.setServerId("dev");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);

        // Create search expectation domain
        // 検索予想ドメイン作成
        W9009CgmShipToXRefMaDomain expectation = new W9009CgmShipToXRefMaDomain();
        expectation.setLgcyLibCompCd("MA0");
        expectation.setCustomerCd("1");
        expectation.setLgcyShipTo("1");
        expectation.setShipToCd("JP000");

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W9009CgmShipToXRefMaDomain> result = new ArrayList<W9009CgmShipToXRefMaDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getLgcyLibCompCd(), result.get(0).getLgcyLibCompCd());
        assertEquals(expectation.getCustomerCd(), result.get(0).getCustomerCd());
        assertEquals(expectation.getLgcyShipTo(), result.get(0).getLgcyShipTo());
        assertEquals(expectation.getShipToCd(), result.get(0).getShipToCd());

        // Log output of search results
        Debug.dump(result);
    }

    /**
     * Test method for searchCount
     * <br /> searchCountメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchCount() throws Exception{

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9009CgmShipToXRefMaService testService
            = (W9009CgmShipToXRefMaService)getContext().getBean("w9009CgmShipToXRefMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9009CgmShipToXRefMaCriteriaDomain criteriaDomain
            = new W9009CgmShipToXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("MA0");
        criteriaDomain.setCustomerCd("1");
        criteriaDomain.setLgcyShipTo("1");
        criteriaDomain.setShipToCd("JP000");
        criteriaDomain.setServerId("dev");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("W9009");

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
     * 
     * @throws Exception exception
     */
    public void testSearchByCondition() throws Exception{

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9009CgmShipToXRefMaService testService
            = (W9009CgmShipToXRefMaService)getContext().getBean("w9009CgmShipToXRefMaService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9009CgmShipToXRefMaCriteriaDomain criteriaDomain
            = new W9009CgmShipToXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("MA0");
        criteriaDomain.setCustomerCd("1");
        criteriaDomain.setLgcyShipTo("1");
        criteriaDomain.setShipToCd("JP000");
        criteriaDomain.setServerId("dev");

        // Create search expectation domain
        // 検索予想ドメイン作成
        W9009CgmShipToXRefMaDomain expectation = new W9009CgmShipToXRefMaDomain();

        expectation.setShipToCd("JP000");
        expectation.setComUpdateTimestamp(toTimestamp("2014/06/04 10:42:24"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W9009CgmShipToXRefMaDomain> result = new ArrayList<W9009CgmShipToXRefMaDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getShipToCd(), result.get(0).getShipToCd());
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

