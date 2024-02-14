package com.globaldenso.eca0027.asia.business.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.dgic.testing.framework.DJUnitTestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * LB001ReportAsiaServiceImpl test class
 *
 * @author $Author: 810833613 $
 * @version $Revision: 8830 $
 */
public class Lb001ReportAsiaServiceTest extends DJUnitTestCase {

    /**
     * Type in the role of the field.
     */
//    private LB001ReportAsiaService lB001ReportAsiaService;

    /**
     * Default constructor
     */
    public Lb001ReportAsiaServiceTest() {
    }

    /**
     * Initial setup
     *
     * @throws Exception when got an error
     */
//    @Before
//    public void setUp() throws Exception {
//        lB001ReportAsiaService = (LB001ReportAsiaService) getContext().getBean("lB001ReportAsiaService");
//        if (lB001ReportAsiaService == null) {;}
//    }

    /**
     * form created
     * @throws ApplicationException ApplicationException 
     */
//    @Test
//    public void test() throws ApplicationException {
//        LB001ReportAsiaService lB001ReportAsiaService =
//            (LB001ReportAsiaService) getContext().getBean("lB001ReportAsiaService");
//        String shipper = "MMM";
//        SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        Date transDate = null;
//        try {
//            transDate = formatA.parse("2014/06/01 1:00:00");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        String CustCd = null;
//        String lgcyShipTo = null;
//        String plantCd = null;
//        CustCd = "MMMMMMMM";
//        lgcyShipTo = "99";
//        plantCd = "99";
//        String subCd = "99";
//        Date cigmaAds = new Date();
//        lB001ReportAsiaService.searchOdrRcv(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd, cigmaAds, "yyyy/MM/dd");
//    }

    /**
     * Create the form
     * @throws ApplicationException ApplicationException 
     */
    @Test
    public void test_2266() throws ApplicationException {
//        LB001ReportAsiaService lB001ReportAsiaService =
//            (LB001ReportAsiaService) getContext().getBean("lB001ReportAsiaService");
        // Test data
        String shipper = "TG0";
        SimpleDateFormat formatA = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date transDate = null;
        try {
            transDate = formatA.parse("2014/10/09 0:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String CustCd = null;
        String lgcyShipTo = null;
        String plantCd = null;
        String subCd = null;

        CustCd = "30001204";
        lgcyShipTo = "01";
        plantCd = "A1";
        subCd = "PH";
        new ResourcesFactory().createResources("");

        Date cigmaAds = new Date();
//        File report = lB001ReportAsiaService.searchOdrRcv(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd, cigmaAds, "yyyy/MM/dd");
//        lB001ReportAsiaService.searchOdrRcv(shipper, subCd, transDate, CustCd, lgcyShipTo, plantCd, cigmaAds, "yyyy/MM/dd");
//        displayReport(report, true);
    }

    // --------------------------------- Private methods below
    // ----------------------------------
    /**
     * Get an ApplicationContext
     * 
     * @return ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
            "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml",
            "WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-library.xml"});
        return context;
    }
}

