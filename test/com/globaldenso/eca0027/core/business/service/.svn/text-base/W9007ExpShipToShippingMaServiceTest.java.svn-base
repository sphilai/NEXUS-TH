package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9007;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9007ExpShipToShippingMaServiceImplの単体テストクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6748 $
 */
public class W9007ExpShipToShippingMaServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9007ExpShipToShippingMaService w9007ExpShipToShippingMaService;

    /**
     * デフォルトコンストラクタ。
     */
    public W9007ExpShipToShippingMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9007ExpShipToShippingMaService = (W9007ExpShipToShippingMaService) getContext().getBean("w9007ExpShipToShippingMaService");
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompAuth_1() throws Exception {
    
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        assertTrue(w9007ExpShipToShippingMaService.validateConsistencyCompAuth("compCd1"));
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", false);
        assertFalse(w9007ExpShipToShippingMaService.validateConsistencyCompAuth("compCd1"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCLAndCCCorrelative_1() throws Exception {
    
        assertTrue(w9007ExpShipToShippingMaService.validateConsistencyCLAndCCCorrelative("L", "Z"));
        assertTrue(w9007ExpShipToShippingMaService.validateConsistencyCLAndCCCorrelative("C", "Z"));
        assertTrue(w9007ExpShipToShippingMaService.validateConsistencyCLAndCCCorrelative("C", "C"));
        assertFalse(w9007ExpShipToShippingMaService.validateConsistencyCLAndCCCorrelative("L", "C"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseOnEditRegisterByShipTo_1() throws Exception {
        
        assertTrue(w9007ExpShipToShippingMaService.validateDatabaseOnEditRegisterByShipTo("MYK"));
        assertFalse(w9007ExpShipToShippingMaService.validateDatabaseOnEditRegisterByShipTo("shipTo99"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmInvTplOnEditRegister_1() throws Exception {

        assertTrue(w9007ExpShipToShippingMaService.validateDatabaseTmInvTplOnEditRegister("MAC", "1", "1", "1"));
        assertFalse(w9007ExpShipToShippingMaService.validateDatabaseTmInvTplOnEditRegister("compCd99", "1", "N", "M"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyApplyStartDate_1() throws Exception {
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateAfterDateComp", true);
        assertTrue(w9007ExpShipToShippingMaService.validateConsistencyApplyStartDate("13/03/14", "dd/MM/yy", "comp1"));
        
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "validateAfterDateComp", false);
        assertFalse(w9007ExpShipToShippingMaService.validateConsistencyApplyStartDate("13/03/12", "dd/MM/yy", "comp99"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseShipper_1() throws Exception {
        
        assertTrue( w9007ExpShipToShippingMaService.validateDatabaseShipper("MYK"));
        assertFalse(w9007ExpShipToShippingMaService.validateDatabaseShipper("compCd99"));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnInquirySearch_1() throws Exception {
        
        // ページオブジェクト(モックの戻り値用)
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(3);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
        criteria.setLocale(new Locale("ja"));

        // ページ情報Creator(モック用にinstanceのみ)
        criteria.setScreenId(SCREEN_ID_W9007);
        criteria.setLanguageCd("ja");
        PageInfoCreator page = new ActionPageInfoCreator(null, null, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setServerId("MYS");
        
        // 検索条件初期化
        criteria.setCompCd(null);
        criteria.setCompCd(null);
        criteria.setShipToCd(null); 
        criteria.setContainerSortingKey(null); 
        criteria.setLoadingCd(null); 
        criteria.setContainerLooseTyp(null);
        // 検証
        List<?> actualList = w9007ExpShipToShippingMaService.searchForPagingOnInquirySearch(criteria);
        assertNotNull(actualList);
        assertEquals(actualList.size(), 3);
        
    }
    
  
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_1() throws Exception {

        W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
        criteria.setScreenDateFormat("dd/MM/yy");

        // 新規モード
        criteria.setMode(MODE_NEW);
        // 検索条件
        criteria.setCompCd("MAF");
        criteria.setShipToCd(null);
        criteria.setAplyStrtDt(null);
        W9007ExpShipToShippingMaDomain actDomain = w9007ExpShipToShippingMaService.searchOnEditInit(criteria);
        // 検証
        assertEquals("CRITERIA1(Name)", actDomain.getFree1TitleNm());
        assertEquals("CRITERIA2(Name)", actDomain.getFree2TitleNm());
        assertEquals("CRITERIA3(Name)", actDomain.getFree3TitleNm());
        
        // 修正モード
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MAC");
        criteria.setShipToCd("JPE");
        criteria.setAplyStrtDt(DateUtil.parseDate("02/04/14", "dd/MM/yyyy"));
        actDomain = w9007ExpShipToShippingMaService.searchOnEditInit(criteria);
        // 検証
        assertEquals("12345678", actDomain.getContainerSortingKey());
        assertEquals("D", actDomain.getLoadingCd());
        assertEquals("1", actDomain.getLabelPrintNum());
        assertEquals("L", actDomain.getContainerLooseTyp());
        assertEquals("Z", actDomain.getCustomTimingTyp());

        // 参照モード
        criteria.setMode(MODE_REF);
        actDomain = w9007ExpShipToShippingMaService.searchOnEditInit(criteria);
        // 検証
        assertEquals("12345678", actDomain.getContainerSortingKey());
        assertEquals("D", actDomain.getLoadingCd());
        assertEquals("1", actDomain.getLabelPrintNum());
        assertEquals("L", actDomain.getContainerLooseTyp());
        assertEquals("Z", actDomain.getCustomTimingTyp());
        
        // コピー新規モード
        criteria.setMode(MODE_COPY_NEW);
        actDomain = w9007ExpShipToShippingMaService.searchOnEditInit(criteria);
        // 検証
        assertEquals("12345678", actDomain.getContainerSortingKey());
        assertEquals("D", actDomain.getLoadingCd());
        assertEquals("1", actDomain.getLabelPrintNum());
        assertEquals("L", actDomain.getContainerLooseTyp());
        assertEquals("Z", actDomain.getCustomTimingTyp());
        // 修正モード
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MAF");
        criteria.setShipToCd("JPE");
        criteria.setAplyStrtDt(DateUtil.parseDate("04/04/14", "dd/MM/yyyy"));
        actDomain = w9007ExpShipToShippingMaService.searchOnEditInit(criteria);
        
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnInquiryDelete_1() throws Exception {
        W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
        criteria.setScreenDateFormat("dd/MM/yy");
        criteria.setCompCd("MAF");
        criteria.setShipToCd("JPE");
        criteria.setAplyStrtDt(DateUtil.parseDate("12/12/12", "dd/MM/yyyy"));
        w9007ExpShipToShippingMaService.deleteOnInquiryDelete(criteria);
    }

    /**
     * 正常ケース
     * 
     * 輸出送荷先出荷原単位のロックレコード0件
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnInquiryDelete_err_1() throws Exception {
        try {
            W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
            criteria.setScreenDateFormat("dd/MM/yy");
            criteria.setCompCd("delCompCd999");
            w9007ExpShipToShippingMaService.deleteOnInquiryDelete(criteria);
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /**
     * 正常ケース
     * 
     * 送荷先別インボイステンプレート原単位のロックレコード0件
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnInquiryDelete_err_2() throws Exception {
        try {
            W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
            criteria.setScreenDateFormat("dd/MM/yy");
            criteria.setCompCd("delCompCd2");
            criteria.setShipToCd("shipTo1");
            criteria.setAplyStrtDt(DateUtil.parseDate("18/03/14", "dd/MM/yyyy"));
            w9007ExpShipToShippingMaService.deleteOnInquiryDelete(criteria);
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnEditRegister_1() throws Exception {
        
        setDensoContext("test-Dsc-Id");
        
        W9007ExpShipToShippingMaCriteriaDomain criteria = new W9007ExpShipToShippingMaCriteriaDomain();
        criteria.setScreenDateFormat("dd/MM/yy");
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("insCompCd1");
        criteria.setShipToCd("shipTo1");
        criteria.setAplyStrtDt(DateUtil.parseDate("18/03/14", "dd/MM/yyyy"));
        criteria.setContainerSortingKey("1");  
        criteria.setLoadingCd("1");            
        criteria.setLabelPrintNum(new BigDecimal("1"));        
        criteria.setContainerLooseTyp("1");    
        criteria.setCustomTimingTyp("1");      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20140408171321");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        
        List<W9007ExpShipToShippingMaItemDomain> itemList = new ArrayList<W9007ExpShipToShippingMaItemDomain>();
        W9007ExpShipToShippingMaItemDomain item = new W9007ExpShipToShippingMaItemDomain();
        item.setCmlTyp("9");
        item.setInvoiceCtgry("9");
        item.setInvoiceClass("9");
        item.setDocNo("1");
        item.setFree1DispFlg("on");
        item.setFree2DispFlg("off");
        item.setFree3DispFlg("off");
        item.setHsCdDispFlg("1");
        item.setCmlTyp("1");
        item.setInvoiceCtgry("C");
        item.setInvoiceClass("M");
        item.setComUpdateTimestamp(new Timestamp(date.getTime()));
        itemList.add(item);
        criteria.setW9007ExpShipToShippingMaItemDomainList(itemList);
        
        // 新規モード
        w9007ExpShipToShippingMaService.transactOnEditRegister(criteria);
        
        // コピー新規モード
        criteria.setMode(MODE_COPY_NEW);
        criteria.setCompCd("MAC");
        w9007ExpShipToShippingMaService.transactOnEditRegister(criteria);
        
        // 更新モード
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MAC");
        criteria.setShipToCd("JPE");
        criteria.setAplyStrtDt(DateUtil.parseDate("02/04/14", "dd/MM/yyyy"));
        criteria.setContainerSortingKey("1");  
        criteria.setLoadingCd("1");            
        criteria.setLabelPrintNum(new BigDecimal("1"));
        criteria.setContainerLooseTyp("1");    
        criteria.setCustomTimingTyp("1");      
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        w9007ExpShipToShippingMaService.transactOnEditRegister(criteria);
        
        criteria.setMode(MODE_NEW);
        try {
            // 新規モード(一意制約エラー)
            w9007ExpShipToShippingMaService.transactOnEditRegister(criteria);
        } catch (GscmApplicationException e) {
            assertEquals("GSCM-E0-0020", e.getMessage());
        }
    }
}
