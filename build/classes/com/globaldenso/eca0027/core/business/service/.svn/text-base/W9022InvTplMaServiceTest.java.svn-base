package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9022;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.apache.struts.action.ActionMapping;
import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.filemanagerstream.business.FileManagementException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementServiceImpl;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9022InvTplMaServiceImplの単体テストクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 11247 $
 */
public class W9022InvTplMaServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9022InvTplMaService w9022InvTplMaService;

    /**
     * Type in the role of the field.
     */
    private CommonService commonService;

    /**
     * デフォルトコンストラクタ。
     */
    public W9022InvTplMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9022InvTplMaService = (W9022InvTplMaService) getContext().getBean("w9022InvTplMaService");
        commonService = (CommonService) getContext().getBean("commonService");
        if (commonService == null) {;}
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnInquirySearch_1() throws Exception {
        // ページオブジェクト(モックの戻り値用)
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(3);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        // criteria
        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
        criteria.setLocale(new Locale("ja"));
        
        // ページ情報Creator(モック用にinstanceのみ)
        criteria.setScreenId(SCREEN_ID_W9022);
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();
        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        // 検索条件初期化
        criteria.setCompCd("MAF");
        criteria.setServerId("MYS");
        
        // 検証
        List<?> actualList = w9022InvTplMaService.searchForPagingOnInquirySearch(criteria);
        assertNotNull(actualList);
        assertEquals(actualList.size(), 3);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInquiryDelete_1() throws Exception {
        // criteria
        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
        criteria.setLocale(new Locale("ja"));
        
        // 検索条件初期化
        criteria.setCompCd("MAF");
        criteria.setDocNo("80");
        
        // 検証
        w9022InvTplMaService.deleteOnInquiryDelete(criteria);

    }
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInquiryDelete_err_1() throws Exception {
        // criteria
        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
        criteria.setLocale(new Locale("ja"));
        
        // 検索条件初期化
        criteria.setCompCd("MAF");
        criteria.setDocNo("999");
        
        try{
            // 検証
            w9022InvTplMaService.deleteOnInquiryDelete(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException e){
            
        }

    }
    
    /**
     * 正常ケースsearchOnEditInit
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_1() throws Exception {

        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
        criteria.setCompCd("MYX");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setTimeZone("JST");
        List<FileManagementDomain> fileList = new ArrayList<FileManagementDomain>();
        FileManagementDomain fDomain = new FileManagementDomain();
        fDomain.setFileName("test");
        fileList.add(fDomain);
        
        w9022InvTplMaService.searchOnEditInit(criteria);

        criteria.setCompCd("MYF");
        criteria.setDocNo("11");
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 0, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず1");
        }catch(SystemException se){
            
        }
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 1, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず2");
        }catch(SystemException se){
            
        }
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 2, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず3");
        }catch(SystemException se){
            
        }
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 3, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず4");
        }catch(SystemException se){
            
        }
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 4, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず5");
        }catch(SystemException se){
            
        }
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAt(FileManagementServiceImpl.class, "searchFileInfo", 5, new UnsupportedEncodingException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず6");
        }catch(SystemException se){
            
        }

        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        w9022InvTplMaService.searchOnEditInit(criteria);

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName1", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }
        
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName5", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName6", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName9", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName12", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }

        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileInfo", fileList);
        MockObjectManager.addReturnValue("W9022InvTplMaDomain", "setFileName13", new FileManagementException("test"));
        try{
            w9022InvTplMaService.searchOnEditInit(criteria);
            fail("この行は、実行されないはず");
        }catch(GscmApplicationException ge){
            
        }

    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyTxtLines_1() throws Exception {
        
        // インタフェース変更
//        String crlf = System.getProperty("line.separator");
//        W9022InvTplMaDomain criteria = new W9022InvTplMaDomain();
//        criteria.setMaster2("あ" + crlf + "い" + crlf + "う");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//        criteria.setMaster2("あ" + crlf + "12345678901234567890123456789012345");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//        criteria.setMaster2("あ" + crlf + "1234567890123456789012345678901234");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//        
//        criteria.setMaster3("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "け" + crlf + "1234567890123456789012345678901234");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//        
//        criteria.setMaster3("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "12345678901234567890123456789012345");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//        
//        criteria.setMaster3("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "1234567890123456789012345678901234");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster4("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "け" + crlf + "12345678901234567890123456789012345678901234567890");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster4("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "12345678901234567890123456789012345678901234567890");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster4("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "1234567890123456789012345678901234567890123456789");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster10("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "け" + crlf + "1234567890123456789012345678901234");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster10("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "12345678901234567890123456789012345");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster10("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "1234567890123456789012345678901234");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster11("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "け" + crlf + "12345678901234567890123456789012345678901234567890");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster11("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "12345678901234567890123456789012345678901234567890");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
//
//        criteria.setMaster11("あ" + crlf + "い" + crlf + "う" + crlf + "え" + crlf + "お" + crlf + "か" + crlf + "き" + crlf + "く" + crlf + "1234567890123456789012345678901234567890123456789");
//        w9022InvTplMaService.validateConsistencyTxtLines(criteria);
        

    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyInvoiceCategoryClassOfInvoice_1() throws Exception {
        
        assertTrue(!w9022InvTplMaService.validateConsistencyInvoiceCategoryClassOfInvoice("C", "F"));
        assertTrue(w9022InvTplMaService.validateConsistencyInvoiceCategoryClassOfInvoice("C", "GF"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyFile_1() throws Exception {
        
        String msgId = null;
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file", 0);
        assertEquals(msgId, GSCM_E0_0036);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file", FILE_SIZE_MAX + 1);
        assertEquals(msgId, NXS_E7_0057);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.bmp", 1);
        assertEquals(null, msgId);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.png", 1);
        assertEquals(null, msgId);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.gif", 1);
        assertEquals(null, msgId);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.jpeg", 1);
        assertEquals(null, msgId);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.jpg", 1);
        assertEquals(null, msgId);
        
        msgId = w9022InvTplMaService.validateConsistencyFile("file.txt", 1);
        assertEquals(msgId, GSCM_E0_0040);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd_1() throws Exception {
        
        assertTrue(w9022InvTplMaService.validateDatabaseCompCd("MYI"));

    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompanyAuth_1() throws Exception {
        
        assertTrue(w9022InvTplMaService.validateConsistencyCompanyAuth("MYI"));

    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmInvTplOnEditRegister_1() throws Exception {
        
        TmInvTplDomain domain = new TmInvTplDomain();
        boolean rtn1 =  w9022InvTplMaService.validateDatabaseTmInvTplOnEditRegister("", "", null);
        assertTrue(!rtn1);
        
        boolean rtn2 =  w9022InvTplMaService.validateDatabaseTmInvTplOnEditRegister("MAF", "88", domain);
        assertTrue(rtn2);
    }

    /**
     * 正常ケースsearchOnEditInit
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateOnEditRegister_1() throws Exception{

        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
        TmInvTplDomain criteria2 = new TmInvTplDomain();
        criteria.setCompCd("MYC");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setTimeZone("JST");

//        File file = new File("C:/junitTest/file.bmp");
        criteria.setOwnerCompCd("MYC");
        criteria.setDocNo("1");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140318");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        criteria.setM1FileName("file1");
        criteria.setM5FileName("file5");
        criteria.setM6FileName("file6");
        criteria.setM9FileName("file9");
        criteria.setM12FileName("file12");
        criteria.setM13FileName("file13");
        criteria.setProcMode(MODE_EDIT);
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice1".getBytes()));
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice5".getBytes()));
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice6".getBytes()));
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice9".getBytes()));
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice12".getBytes()));
        criteria.setM1FileData(new ByteArrayInputStream("HelloInvoice13".getBytes()));
        criteria.setDscId("srawe01");
        
//        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "updateFileData",  new IOException(""));
//        MockObjectManager.setReturnValueAtAllTimes(TmInvTplServiceImpl.class, "create");
        try{
            w9022InvTplMaService.createOnEditRegister(criteria, criteria2);
        }catch(FileManagementException e){
            
        }

        criteria.setProcMode(MODE_EDIT);
        criteria.setCompCd("MYC");
        criteria.setOwnerCompCd("MYC");
        criteria.setDocNo("1");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new IOException(""));
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "deleteFile", new IOException(""));
        try{
            w9022InvTplMaService.createOnEditRegister(criteria, criteria2);
        }catch(FileManagementException e){
            
        }
        criteria.setProcMode(MODE_EDIT);
        criteria.setCompCd("MYC");
        criteria.setOwnerCompCd("MYC");
        criteria.setDocNo("4");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        
        MockObjectManager.initialize();
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "createFileUpload", new IOException(""));
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "deleteFile", new IOException(""));
        try{
            w9022InvTplMaService.createOnEditRegister(criteria, criteria2);
        }catch(GscmApplicationException e){
            
        }
    }

    
//    /**
//     * 正常ケース
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testPrintSample_1() throws Exception {
//        
//        W9022InvTplMaCriteriaDomain criteria = new W9022InvTplMaCriteriaDomain();
//        criteria.setCompCd("MAF");
//        criteria.setDocNo("81");
//        criteria.setInvoiceCtgry("C");
//        criteria.setInvoiceClass("M");
//        MockObjectManager.setReturnNullAtAllTimes(L9001ReportServiceImpl.class, "searchSmplInvHdrForCmrclIntang");
//        MockObjectManager.setReturnNullAtAllTimes(L9004ReportServiceImpl.class, "searchSmplPackHdrForMain");
//        MockObjectManager.setReturnNullAtAllTimes(L9006ReportServiceImpl.class, "searchSmplSalesCntrctHdrForCmrclIntang");
//        w9022InvTplMaService.printSample(criteria);
//        criteria.setInvoiceCtgry("N");
//        criteria.setInvoiceClass("M");
//        MockObjectManager.setReturnNullAtAllTimes(L9002ReportServiceImpl.class, "searchSmplInvHdrForNonCmrcl");
//        MockObjectManager.setReturnNullAtAllTimes(L9004ReportServiceImpl.class, "searchSmplPackHdrForMain");
//        MockObjectManager.setReturnNullAtAllTimes(L9007ReportServiceImpl.class, "searchSmplSalesCntrctHdrForNonCmrcｌ");
//        w9022InvTplMaService.printSample(criteria);
//        criteria.setInvoiceCtgry("N");
//        criteria.setInvoiceClass("F");
//        MockObjectManager.setReturnNullAtAllTimes(L9003ReportServiceImpl.class, "searchSmplInvHdrFor");
//        MockObjectManager.setReturnNullAtAllTimes(L9005ReportServiceImpl.class, "searchSmplPackHdrForFrt");
//        MockObjectManager.setReturnNullAtAllTimes(L9008ReportServiceImpl.class, "searchSmplSalesCntrctHdrForFrt");
//        w9022InvTplMaService.printSample(criteria);
//
//    }
}
