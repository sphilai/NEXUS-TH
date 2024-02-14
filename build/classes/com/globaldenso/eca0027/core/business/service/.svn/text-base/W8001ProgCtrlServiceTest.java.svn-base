package com.globaldenso.eca0027.core.business.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.apache.struts.action.ActionMapping;
import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W8001ProgressControlServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W8001ProgCtrlServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W8001ProgCtrlService w8001ProgressControlService;

    /**
     * デフォルトコンストラクタ。
     */
    public W8001ProgCtrlServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w8001ProgressControlService = (W8001ProgCtrlService) getContext().getBean("w8001ProgCtrlService");
    }


    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmIssueDateToIssueDate_1() throws ApplicationException {
        
        String fmIssueDate = "20140115";
        String toIssueDate = "20140116";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmIssueDateToIssueDate(fmIssueDate, toIssueDate, dateFormat);
        assertTrue(result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmIssueDateToIssueDate_2() throws ApplicationException {
        
        String fmIssueDate = "20140115";
        String toIssueDate = "";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmIssueDateToIssueDate(fmIssueDate, toIssueDate, dateFormat);
        assertTrue(result);
    }

    /**
     * 異常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmIssueDateToIssueDate_3() throws ApplicationException {
        
        String fmIssueDate = "20140116";
        String toIssueDate = "20140115";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmIssueDateToIssueDate(fmIssueDate, toIssueDate, dateFormat);
        assertTrue(!result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmEtdToEtd_1() throws ApplicationException {
        
        String fmEtd = "20140115";
        String toEtd = "20140116";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmEtdToEtd(fmEtd, toEtd, dateFormat);
        assertTrue(result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmEtdToEtd_2() throws ApplicationException {
        
        String fmEtd = "20140115";
        String toEtd = "";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmEtdToEtd(fmEtd, toEtd, dateFormat);
        assertTrue(result);
    }


    /**
     * 異常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmEtdToEtd_3() throws ApplicationException {
        
        String fmEtd = "20140116";
        String toEtd = "20140115";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmEtdToEtd(fmEtd, toEtd, dateFormat);
        assertTrue(!result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmAtdToAtd_1() throws ApplicationException {
        
        String fmAtd = "20140115";
        String toAtd = "20140116";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmAtdToAtd(fmAtd, toAtd, dateFormat);
        assertTrue(result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmAtdToAtd_2() throws ApplicationException {
        
        String fmAtd = "";
        String toAtd = "20140116";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmAtdToAtd(fmAtd, toAtd, dateFormat);
        assertTrue(result);
    }

    /**
     * 異常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFmAtdToAtd_3() throws ApplicationException {
        
        String fmAtd = "20140116";
        String toAtd = "20140115";
        String dateFormat = "yyyyMMdd";
        
        boolean result = w8001ProgressControlService.validateConsistencyFmAtdToAtd(fmAtd, toAtd, dateFormat);
        assertTrue(!result);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch_1() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setSelectCondition("searchItemNo");
        criteria.setCustomerCd("1");
        criteria.setServerId("MYS");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);

        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchForPagingOnMainSearch(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 5);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnMainSearch_2() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setSelectCondition("SearchPO");
        criteria.setCustomerCd("1");
        criteria.setServerId("MYS");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);

        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchForPagingOnMainSearch(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 5);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchOnDetailInit_1() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setMainMark("1");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        W8001ProgCtrlDomain resultDomain = w8001ProgressControlService.searchOnDetailInit(criteria);
        assertNotNull(resultDomain);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchOnDetailInit_2() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setMainMark("10");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        W8001ProgCtrlDomain resultDomain = w8001ProgressControlService.searchOnDetailInit(criteria);
        assertNotNull(resultDomain);
    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnCmlDetailInit_1() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setCmlTyp("1");
        criteria.setMainMark("1");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchForPagingOnCmlDetailInit(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 1);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnCmlDetailInit_2() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setCmlTyp("3");
        criteria.setMainMark("mm002");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchForPagingOnCmlDetailInit(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 25);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchOnCmlDetailSort_1() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setCmlTyp("1");
        criteria.setMainMark("1");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchOnCmlDetailSort(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 1);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchOnCmlDetailSort_2() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setCmlTyp("3");
        criteria.setMainMark("mm002");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        List<? extends W8001ProgCtrlDomain> result = w8001ProgressControlService.searchOnCmlDetailSort(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 25);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    public void testSearchOnRtnInfoInit_1() throws ApplicationException {
        
        W8001ProgCtrlCriteriaDomain criteria = new W8001ProgCtrlCriteriaDomain();
        criteria.setCmlTyp("1");
        criteria.setMainMark("1");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));

        List<? extends W8001ProgCtrlPltzItemDomain> result = w8001ProgressControlService.searchOnRtnInfoInit(criteria);
        assertNotNull(result);
        assertEquals(result.size(), 1);
    }
    
}
