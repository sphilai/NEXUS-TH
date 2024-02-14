package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.Locale;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.apache.struts.action.ActionMapping;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9001RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9016ProgressControlServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9016ExpShippingItemSpInfoMaServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;

    /**
     * デフォルトコンストラクタ。
     */
    public W9016ExpShippingItemSpInfoMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9016ExpShippingItemSpInfoMaService = (W9016ExpShippingItemSpInfoMaService) getContext().getBean("w9016ExpShippingItemSpInfoMaService");
    }


    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_1() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setCompCd("CompCd_1");
        criteria.setItemNo("ItemNo_1");
        criteria.setPkgCd("Pk1");
        criteria.setCustomerCd("Custom_1");
        criteria.setLgcyShipTo("L1");
        criteria.setAplyStrtDt("20140115");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("1");
        criteria.setCustomTimingTyp("2");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("3");
        criteria.setContainerLooseTyp("4");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        criteria.setComUpdateTimestamp(new Timestamp(System.currentTimeMillis()));
        criteria.setScreenDateFormat("yyyyMMdd");
        criteria.setMode("1");
        
        w9016ExpShippingItemSpInfoMaService.createOnEditRegister(criteria);

    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_2() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setCompCd("CompCd_2");
        criteria.setItemNo("ItemNo_1");
        criteria.setPkgCd("Pk1");
        criteria.setCustomerCd("Custom_1");
        criteria.setLgcyShipTo("L1");
        criteria.setAplyStrtDt("20140115");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("5");
        criteria.setCustomTimingTyp("6");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("7");
        criteria.setContainerLooseTyp("8");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        try{
            criteria.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/24").getTime()));
        } catch (Exception e) {
            // 一意制約エラー
            throw new ApplicationException(e);
        }
        criteria.setScreenDateFormat("yyyyMMdd");
        criteria.setMode("2");
        
        w9016ExpShippingItemSpInfoMaService.createOnEditRegister(criteria);

    }
    
    /**
     * 異常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_3() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setCompCd("CompCd_2");
        criteria.setItemNo("ItemNo_1");
        criteria.setPkgCd("Pk1");
        criteria.setCustomerCd("Custom_1");
        criteria.setLgcyShipTo("L1");
        criteria.setAplyStrtDt("20140115");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("1");
        criteria.setCustomTimingTyp("2");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("3");
        criteria.setContainerLooseTyp("4");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        criteria.setComUpdateTimestamp(new Timestamp(System.currentTimeMillis()));
        criteria.setScreenDateFormat("yyyyMMdd");
        criteria.setMode("1");
        
        try {
            w9016ExpShippingItemSpInfoMaService.createOnEditRegister(criteria);
        } catch (GscmApplicationException e) {
            // 一意制約エラー
            assertEquals(GSCM_E0_0020, e.getMessage());
        }

    }

    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnInquiryDelete_1() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setCompCd("MYE");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setCustomerCd("30001205");
        criteria.setLgcyShipTo("00");
        criteria.setAplyStrtDt("20121219");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("1");
        criteria.setCustomTimingTyp("2");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("3");
        criteria.setContainerLooseTyp("4");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        try{
            criteria.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/01/07").getTime()));
        } catch (Exception e) {
            // 一意制約エラー
            throw new ApplicationException(e);
        }
        criteria.setScreenDateFormat("yyyyMMdd");
        
        w9016ExpShippingItemSpInfoMaService.deleteOnInquiryDelete(criteria);

    }

    /**
     * 異常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnInquiryDelete_2() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setCompCd("CompCd_1");
        criteria.setItemNo("ItemNo_1");
        criteria.setPkgCd("Pk1");
        criteria.setCustomerCd("Custom_1");
        criteria.setLgcyShipTo("L1");
        criteria.setAplyStrtDt("20140115");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("1");
        criteria.setCustomTimingTyp("2");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("3");
        criteria.setContainerLooseTyp("4");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        try{
            criteria.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/24").getTime()));
        } catch (Exception e) {
            // 一意制約エラー
            throw new ApplicationException(e);
        }
        criteria.setScreenDateFormat("yyyyMMdd");
        
        try {
            w9016ExpShippingItemSpInfoMaService.deleteOnInquiryDelete(criteria);
        } catch (GscmApplicationException e) {
            // 一意制約エラー
            assertEquals("GSCM-E0-0010", e.getMessage());
        }

    }
    
    /**
     * 正常ケース
     *  
     *  @throws ApplicationException 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnInquirySearch_1() throws ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setScreenDateFormat("yyyyMMdd");
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

        w9016ExpShippingItemSpInfoMaService.searchForPagingOnInquirySearch(criteria);

    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInitr_1() throws Exception {
        
        setDensoContext("test-Dsc-Id");
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYK");
        criteria.setItemNo("ItemNo_1");
        criteria.setPkgCd("Pk1");
        criteria.setCustomerCd("Custom_1");
        criteria.setLgcyShipTo("L1");
        criteria.setAplyStrtDt("20140115");
        criteria.setItemDescription("ItemDescription_1");
        criteria.setShippingLot("1234567");
        criteria.setInvoiceKey("Inv");
        criteria.setStgInstrItemFlg("1");
        criteria.setCustomTimingTyp("2");
        criteria.setContainerSortingKey("Contain1");
        criteria.setLoadingCd("3");
        criteria.setContainerLooseTyp("4");
        criteria.setCasemarkNotation("CasemarkNotation_1");
        
        Ws9001ResultDomain ws9001ResultDomain = new Ws9001ResultDomain();
        Ws9001ResultItemDomain ws9001ResultItemDomain = new Ws9001ResultItemDomain();
        ws9001ResultItemDomain.setItmNm("1");
        ws9001ResultItemDomain.setLotsz("1");
        ws9001ResultDomain.setItemInfo(ws9001ResultItemDomain);
        ws9001ResultDomain.setResultCode("1");
        
        MockObjectManager.setReturnValueAtAllTimes(Ws9001RestServiceImpl.class, "getItemInfoForMa", ws9001ResultDomain);
            
        try {
            // 新規モード(一意制約エラー)
            w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteria);
            fail("Webサービス失敗確認");
        } catch (ValidationException e) {
            assertEquals("GSCM-E0-0020", "GSCM-E0-0020");
        }
        
        ws9001ResultDomain.setResultCode("0");
        MockObjectManager.setReturnValueAtAllTimes(Ws9001RestServiceImpl.class, "getItemInfoForMa", ws9001ResultDomain);
        // 新規モード
        w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteria);
        
        // コピー新規モード
        criteria.setMode(MODE_COPY_NEW);
        criteria.setCompCd("MAC");
        w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteria);
        
        // 更新モード
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MAC");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setCustomerCd("30001205");
        criteria.setAplyStrtDt("02/04/14");
        criteria.setLgcyShipTo("00");
        criteria.setContainerSortingKey("1");  
        criteria.setLoadingCd("1");            
        criteria.setContainerLooseTyp("1");    
        criteria.setCustomTimingTyp("1");      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20140408171321");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteria);
        
        criteria.setMode(MODE_NEW);
        try {
            // 新規モード(一意制約エラー)
            w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteria);
        } catch (GscmApplicationException e) {
            assertEquals("GSCM-E0-0020", e.getMessage());
        }

    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateConsistencyCompAuth_1() throws Exception {
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyCompAuth("MYK"), true);

    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testvalidateDatabaseCigmaAvailable_1() throws Exception {
        
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabaseCigmaAvailable("MYK"), true);

    }

    /**
    * 正常ケース
      *  
      *  @throws ApplicationException 例外発生した場合
      */
    @Test
    @Transactional
    public void testValidateDatabasePkgCd_1() throws ApplicationException {
         
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabasePkgCd("MAC" , "110"), true);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabasePkgCd("CompCd_1" , "110"), false);
    
    }
    
    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateDatabaseShipper_1() throws ApplicationException {
          
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabaseShipper("00"), false);
     
    }
    
    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateDatabaseShipperCustomerShipTo_1() throws ApplicationException {
          
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabaseShipperCustomerShipTo("MAC" , "30001205", "00"), true);
     
    }
    
    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateDatabaseTmExpItemNoSpInfoOnEditRegister_1() throws ApplicationException {
          
        
        // 更新モード
        setDensoContext("test-Dsc-Id");
      
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        criteria.setScreenDateFormat("yyyy/MM/dd");
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MAC");
        criteria.setItemNo("A002TB0091B3N");
        criteria.setPkgCd("110");
        criteria.setCustomerCd("30001205");
        criteria.setAplyStrtDt("2012/12/19");
        criteria.setLgcyShipTo("00");
        criteria.setContainerSortingKey("1");  
        criteria.setLoadingCd("1");            
        criteria.setContainerLooseTyp("1");    
        criteria.setCustomTimingTyp("1");      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            Date date = sdf.parse("20140408171321");
            criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
            
            assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabaseTmExpItemNoSpInfoOnEditRegister(criteria), true);
         
            criteria.setMode(MODE_EDIT);
            criteria.setCompCd("CompCd_1");
            criteria.setItemNo("A002TB0091B3N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setAplyStrtDt("2012/12/19");
            criteria.setLgcyShipTo("00");
            criteria.setContainerSortingKey("1");  
            criteria.setLoadingCd("1");            
            criteria.setContainerLooseTyp("1");    
            criteria.setCustomTimingTyp("1");      
            criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
            assertEquals(w9016ExpShippingItemSpInfoMaService.validateDatabaseTmExpItemNoSpInfoOnEditRegister(criteria), false);
            
        } catch (Exception e) {
            ;
        }
        

    }

    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateConsistencyTxtLines_1() throws ApplicationException {
          
        String crlf = System.getProperty("line.separator");
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyTxtLines("あ" + crlf + "い" + crlf + "う"), false);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyTxtLines("あ" + crlf + "12345678901234567890123456"), false);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyTxtLines("あ" + crlf + "1234567890123456789012345"), true);

    }
    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateConsistencyCLAndCCSpInf_1() throws ApplicationException {
          
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyCLAndCCSpInf("", "Y", "L"), false);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyCLAndCCSpInf("N", "Z", "L"), false);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyCLAndCCSpInf("N", "Z", "M"), false);
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyCLAndCCSpInf("Y", "Z", "L"), true);

    }

    /**
     * 正常ケース
       *  
       *  @throws ApplicationException 例外発生した場合
       */
    @Test
    @Transactional
    public void testValidateConsistencyAfterDate_1() throws ApplicationException {
          
        assertEquals(w9016ExpShippingItemSpInfoMaService.validateConsistencyAfterDate("2014/01/15", "yyyy/MM/dd", "MAC"), false);

    }
}
