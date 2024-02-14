package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaAreaAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaCompAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaPlantAuthDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9004UserIdMaServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9004UserIdMaServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9004UserIdMaService w9004UserIdMaService;

    /**
     * Type in the role of the field.
     */
    private CommonService commonService;

    /**
     * デフォルトコンストラクタ。
     */
    public W9004UserIdMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9004UserIdMaService = (W9004UserIdMaService) getContext().getBean("w9004UserIdMaService");
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
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setLocale(new Locale("ja"));
        
        // ページ情報Creator(モック用にinstanceのみ)
        criteria.setScreenId(SCREEN_ID_W9018);
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();
        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        // 検索条件初期化
        criteria.setDscId(null);
        criteria.setCompCd(null);
        criteria.setOwnerCompCd(null);
        criteria.setUsrNmEn(null);
        
        // 検証
        List<?> actualList = w9004UserIdMaService.searchForPagingOnInquirySearch(criteria);
        assertNotNull(actualList);
        assertEquals(actualList.size(), 3);
        
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd_1() throws Exception {
        // 新規以外は対象外
        assertTrue(w9004UserIdMaService.validateDatabaseCompCd("", MODE_EDIT));
        // 新規でCompCdあり
        assertTrue(w9004UserIdMaService.validateDatabaseCompCd("MYA", MODE_NEW));
        // 新規でCompCdなし
        assertFalse(w9004UserIdMaService.validateDatabaseCompCd("compCd999", MODE_NEW));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmMenuUseAuthCnfOnEditRefer_1() throws Exception {
        
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        
        // ログイン者の責任会社コードと画面の会社コードが同じ
        criteria.setOwnerCompCd("MYF");
        criteria.setCompCd("MYF");
        assertTrue(w9004UserIdMaService.validateDatabaseTmMenuUseAuthCnfOnEditRefer(criteria));
        
        // ログイン者の責任会社コードと画面の会社コードが異なる、
        // 地域管理者権限のレコードがある
        criteria.setOwnerCompCd("MYE");
        criteria.setCompCd("MYA");
        criteria.setLoginUserDscId("srawe01");
        assertTrue(w9004UserIdMaService.validateDatabaseTmMenuUseAuthCnfOnEditRefer(criteria));
        
        // ログイン者の責任会社コードと画面の会社コードが異なる、
        // 地域管理者権限のレコードがない
        criteria.setOwnerCompCd("MY8");
        criteria.setCompCd("MYA");
        criteria.setLoginUserDscId("srawe09");
        assertFalse(w9004UserIdMaService.validateDatabaseTmMenuUseAuthCnfOnEditRefer(criteria));
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInquiryDelete_1() throws Exception {
      
        SimpleDateFormat sdfOne = new SimpleDateFormat("yyyyMMdd");
        Date dateOne = sdfOne.parse("20140101");
        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", dateOne);
        
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId("yobib16");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20130731135300");
        criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));
        
        w9004UserIdMaService.deleteOnInquiryDelete(criteria);
    }
    
    /**
     * 異常ケース
     *  
     *  ロック取得件数0件
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInquiryDelete_err_1() throws Exception {
        
        try {

            SimpleDateFormat sdfOne = new SimpleDateFormat("yyyyMMdd");
            Date dateOne = sdfOne.parse("20140101");
            MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", dateOne);
        
            W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
            criteria.setDscId("deleteDscId9999");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date = sdf.parse("20130731135300");
            criteria.setComUpdateTimestamp(new Timestamp(date.getTime()));

            w9004UserIdMaService.deleteOnInquiryDelete(criteria);
            fail("この行は実行さないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage(), "GSCM-E0-0010");
        }
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawx01");
        criteria.setDscId("srawx01");   
        criteria.setUsrNmEn("srawx01"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
        
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
        
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);
        
        w9004UserIdMaService.transactOnEditRegister(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_2() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawx02");
        criteria.setDscId("srawx02");   
        criteria.setUsrNmEn("srawx02"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("on");
        
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
        
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
        
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);
        
        w9004UserIdMaService.transactOnEditRegister(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_3() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawf082");
        criteria.setDscId("srawf082");   
        criteria.setUsrNmEn("srawf082"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.transactOnEditRegister(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_4_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe02");
        criteria.setDscId("srawe02");   
        criteria.setUsrNmEn("srawe02"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("on");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("off");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_4_2() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe09");
        criteria.setDscId("srawe09");   
        criteria.setUsrNmEn("srawe09"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("on");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("off");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomain.setCompCd("MYE");
        w9004UserIdMaCompAuthDomain.setMaAgentBRole("on");
        w9004UserIdMaCompAuthDomain.setMaAgentRRole("off");
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
        w9004UserIdMaCompAuthDomain.setMaAgentBRole("off");
        w9004UserIdMaCompAuthDomain.setMaAgentRRole("off");
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
        w9004UserIdMaCompAuthDomain.setMaAgentBRole("on");
        w9004UserIdMaCompAuthDomain.setMaAgentRRole("on");
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_5_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe07");
        criteria.setDscId("srawe07");   
        criteria.setUsrNmEn("srawe07"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("on");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("off");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_5_2() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe06");
        criteria.setDscId("srawe06");   
        criteria.setUsrNmEn("srawe06"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("on");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("on");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_5_3() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe11");
        criteria.setDscId("srawe11");   
        criteria.setUsrNmEn("srawe11"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("off");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("off");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    /**
     * 正常ケースsearchOnEditInit


     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testTransactOnEditRegister_5_4() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe10");
        criteria.setDscId("srawe10");   
        criteria.setUsrNmEn("srawe10"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        W9004UserIdMaAreaAuthDomain w9004UserIdMaAreaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        w9004UserIdMaAreaAuthDomain.setRegAdmRole("off");
        w9004UserIdMaAreaAuthDomain.setBrowseAllRole("off");
        w9004UserIdMaAreaAuthDomain.setRegisterAllRole("off");
    
        List<W9004UserIdMaCompAuthDomain> w9004UserIdMaCompAuthDomainList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        W9004UserIdMaCompAuthDomain w9004UserIdMaCompAuthDomain = new W9004UserIdMaCompAuthDomain();
        w9004UserIdMaCompAuthDomainList.add(w9004UserIdMaCompAuthDomain);
    
        List<W9004UserIdMaPlantAuthDomain> w9004UserIdMaPlantAuthDomainList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        W9004UserIdMaPlantAuthDomain w9004UserIdMaPlantAuthDomain = new W9004UserIdMaPlantAuthDomain();
        w9004UserIdMaPlantAuthDomainList.add(w9004UserIdMaPlantAuthDomain);
    
        criteria.setAreaAuthDomain(w9004UserIdMaAreaAuthDomain);
        criteria.setCompAuthList(w9004UserIdMaCompAuthDomainList);
        criteria.setPlantAuthList(w9004UserIdMaPlantAuthDomainList);

        w9004UserIdMaService.transactOnEditRegister(criteria);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYH");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawh03");
        criteria.setDscId("srawh03");   
        criteria.setUsrNmEn("srawh03"); 
        criteria.setLoginUserDscId("srawh03");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_2() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawi02");
        criteria.setDscId("srawi02");   
        criteria.setUsrNmEn("srawi02"); 
        criteria.setLoginUserDscId("srawe16");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_3() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawi02");
        criteria.setDscId("srawi02");   
        criteria.setUsrNmEn("srawi02"); 
        criteria.setLoginUserDscId("srawi02");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_4() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawi03");
        criteria.setDscId("srawi03");   
        criteria.setUsrNmEn("srawi03"); 
        criteria.setLoginUserDscId("srawi03");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_5() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe16");
        criteria.setDscId("srawe16");   
        criteria.setUsrNmEn("srawe16"); 
        criteria.setLoginUserDscId("srawe16");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }


    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_6() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe06");
        criteria.setDscId("srawe06");   
        criteria.setUsrNmEn("srawe06"); 
        criteria.setLoginUserDscId("srawe06");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_7() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe07");
        criteria.setDscId("srawe07");   
        criteria.setUsrNmEn("srawe07"); 
        criteria.setLoginUserDscId("srawe07");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_8() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_REF);
        criteria.setCompCd("MYF");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawf04");
        criteria.setDscId("srawf04");   
        criteria.setUsrNmEn("srawf04"); 
        criteria.setLoginUserDscId("srawf04");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditInit(criteria);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditRefer_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYJ");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe01");
        criteria.setDscId("srawe01");   
        criteria.setUsrNmEn("srawe01"); 
        criteria.setLoginUserDscId("srawe16");
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        
        w9004UserIdMaService.searchOnEditRefer(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditRefer_2() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYE");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe99");
        criteria.setDscId("srawe99");   
        criteria.setUsrNmEn("srawe99"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("srawe16");
        
        w9004UserIdMaService.searchOnEditRefer(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditRefer_3() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe99");
        criteria.setDscId("srawe99");   
        criteria.setUsrNmEn("srawe99"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("srawe02");
        
        w9004UserIdMaService.searchOnEditRefer(criteria);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditRefer_4() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYI");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe99");
        criteria.setDscId("srawe99");   
        criteria.setUsrNmEn("srawe99"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("srawe04");
        
        w9004UserIdMaService.searchOnEditRefer(criteria);
    }
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditRegister_1() throws Exception {

        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setMode(MODE_NEW);
        criteria.setCompCd("MYJ");
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);
        
        criteria.setPrmDscId("srawe01");
        criteria.setDscId("srawe01");   
        criteria.setUsrNmEn("srawe01"); 
        criteria.setMailAdd1("test@sraw.co.jp");
        criteria.setTimeZone("JST");
        criteria.setLoginUserDscId("srawj07");
        
        w9004UserIdMaService.searchOnEditRegister(criteria);
    }
    
}
