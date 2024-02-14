package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0076;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

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
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9018ExpFmlByItemMaServiceImplの単体テストクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 11247 $
 */
public class W9018ExpFmlByItemMaServiceTest extends AbstractEca0027Test {

    /**
     * W9018ExpFmlByItemMaService
     */
    protected W9018ExpFmlByItemMaService w9018ExpFmlByItemMaService;

    /**
     * TmExpFormalitiItemNoService
     */
    protected TmExpFormalitiItemNoService tmExpFormalitiItemNoService;

    /**
     * CommonService
     */
    protected CommonService commonService;
    
    
    /**
     * 日付フォーマット
     */
    private String dateFormat = "dd/MM/yy";
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9018ExpFmlByItemMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9018ExpFmlByItemMaService = (W9018ExpFmlByItemMaService) getContext().getBean("w9018ExpFmlByItemMaService");
        tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        commonService = (CommonService) getContext().getBean("commonService");
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnInquirySearch_nml_1() throws Exception {

        // ページオブジェクト(モックの戻り値用)
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);

        W9018ExpFmlByItemMaCriteriaDomain criteria = new W9018ExpFmlByItemMaCriteriaDomain();
        
        // 検索条件
        criteria.setCompCd("MYJ");
        // 権限
        criteria.setServerId("MYS");
        
        // ページ情報Creator(モック用にinstanceのみ)
        criteria.setScreenId(SCREEN_ID_W9018);
        criteria.setLanguageCd("ja");
        criteria.setLocale(new Locale(criteria.getLanguageCd()));
        AbstractActionForm form = new AbstractActionForm();
        form.setCurrentPageNo("1");
        ActionMapping mapping = new ActionMapping();

        PageInfoCreator page = new ActionPageInfoCreator(form, mapping, null);
        criteria.setPageInfoCreator(page);

        w9018ExpFmlByItemMaService.searchForPagingOnInquirySearch(criteria);
    }
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateCompanyFromToDate_nml_1() throws Exception {

        assertTrue(w9018ExpFmlByItemMaService.validateCompanyFromToDate("06/03/14", "07/03/14", dateFormat));
        assertTrue(w9018ExpFmlByItemMaService.validateCompanyFromToDate("", "", dateFormat));
        assertFalse(w9018ExpFmlByItemMaService.validateCompanyFromToDate("06/03/14", "04/03/14", dateFormat));
    }
    
    /**
     * 正常ケース
     *  
     *  新規、引継値.CIGMA Products＝"Y"
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_nml_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("");
        criteriaDomain.setItemNo("");
        criteriaDomain.setLanguageCd("");
        criteriaDomain.setMode(MODE_NEW);                // 処理モード
        criteriaDomain.setPrmCompany("MYI");          // 引継値.Company
        criteriaDomain.setPrmItemNo("");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("Y");       // 引継値.CIGMA Products
        w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
        
    }

    /**
     * 正常ケース
     *  
     *  新規、引継値.CIGMA Products＝"N"
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_nml_2() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("MYI");
        criteriaDomain.setItemNo("A002TB0091B3N");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_NEW);                // 処理モード
        criteriaDomain.setPrmCompany("MYI");          // 引継値.Company
        criteriaDomain.setPrmItemNo("");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("N");       // 引継値.CIGMA Products
        w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
    }

    /**
     * 正常ケース
     *  
     *  更新、TBL.CIGMA_Products_FLG＝"Y"
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_nml_3() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("MYK");
        criteriaDomain.setItemNo("A002TB0091B3N");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_EDIT);                // 処理モード
        criteriaDomain.setPrmCompany("MYK");          // 引継値.Company
        criteriaDomain.setPrmItemNo("A002TB0091B3N");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2012/12/19");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("Y");       // 引継値.CIGMA Products
        w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
    }
    
    /**
     * 正常ケース
     *  
     *  更新、TBL.CIGMA_Products_FLG＝"N"
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_nml_4() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("MYK");
        criteriaDomain.setItemNo("A002TB0091B3N");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_EDIT);                // 処理モード
        criteriaDomain.setPrmCompany("MYK");          // 引継値.Company
        criteriaDomain.setPrmItemNo("A002TB0091B3N");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2012/12/19");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("N");       // 引継値.CIGMA Products
        w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
    }

    /**
     * 正常ケース
     *  
     *  参照、TBL.CIGMA_Products_FLG＝"Y"
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_nml_5() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("compCd1");
        criteriaDomain.setItemNo("itemNo1");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_REF);                // 処理モード
        criteriaDomain.setPrmCompany("MYK");          // 引継値.Company
        criteriaDomain.setPrmItemNo("A002TB0091B3N");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2012/12/19");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("Y");       // 引継値.CIGMA Products
        w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
    }

    /**
     * 異常ケース
     *  
     *  修正、検索データの取得0件のためエラー
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_err_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);                // 処理モード
        criteriaDomain.setPrmCompany("XXXXXX");           // 引継値.Company
        criteriaDomain.setPrmItemNo("XXXXXXX");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2014/03/01");   // 引継値.Apply Start Date
        try {
            w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage(), GSCM_E0_0001);
        }
    }

    /**
     * 異常ケース
     *  
     *  修正、CIGMA夜間バッチ中チェックエラー
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_err_2() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);                // 処理モード
        criteriaDomain.setPrmCompany("bachErrCompCd1");   // 引継値.Company
        criteriaDomain.setPrmItemNo("itemNo1");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2014/03/01");   // 引継値.Apply Start Date
        try {
            w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage() , "GSCM-E0-0001");
        }
    }

    /**
     * 異常ケース
     *  
     *  新規、包装材原単位から品名と原産国を取得0件
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_err_3() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("compCd2");
        criteriaDomain.setItemNo("itemNo2");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_COPY_NEW);                // 処理モード
        criteriaDomain.setPrmCompany("MYK");          // 引継値.Company
        criteriaDomain.setPrmItemNo("A002TB0091B3N");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2012/12/19");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("Y");       // 引継値.CIGMA Products

        try {
            w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage(), NXS_E7_0076);
        }

    }

    /**
     * 異常ケース
     *  
     *  新規、包装材原単位から品名と原産国を取得0件
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnEditInit_err_4() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setCompCd("compCd2");
        criteriaDomain.setItemNo("itemNo2");
        criteriaDomain.setLanguageCd("ja");
        criteriaDomain.setMode(MODE_COPY_NEW);                // 処理モード
        criteriaDomain.setPrmCompany("TG0");          // 引継値.Company
        criteriaDomain.setPrmItemNo("TG017268-17509M");           // 引継値.Item No
        criteriaDomain.setPrmApplyStartDate("2012/02/20");   // 引継値.Apply Start Date
        criteriaDomain.setPrmCigmaPrdct("Y");       // 引継値.CIGMA Products
        MockObjectManager.setReturnValueAtAllTimes(CommonServiceImpl.class, "searchCigmaAvailable", false);

        try {
            w9018ExpFmlByItemMaService.searchOnEditInit(criteriaDomain);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage(), "NXS-E1-0060");
        }

    }
    
    /**
     * 正常ケース
     * 
     *  true
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyAfterDate_nml_1() throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140310");
        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", date);
//        boolean rt = w9018ExpFmlByItemMaService.validateConsistencyAfterDate("2014/03/11", "MYI");
//        assertTrue(rt);
    }

    /**
     * 正常ケース
     * 
     *  false
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyAfterDate_nml_2() throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse("20140310");
        MockObjectManager.setReturnValueAtAllTimes(DateUtil.class, "convertTime", date);
//        boolean rt = w9018ExpFmlByItemMaService.validateConsistencyAfterDate("2014/03/09", "MYI");
//        assertFalse(rt);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompAuth_nml_1() throws Exception {
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", userAuthList);
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        w9018ExpFmlByItemMaService.validateConsistencyCompAuth("compCd1");
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCountry_nml_1() throws Exception {
        w9018ExpFmlByItemMaService.validateDatabaseCountry("01");
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseShipper_nml_1() throws Exception {
        w9018ExpFmlByItemMaService.validateDatabaseShipper("compCd1");
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmExpFormalitiItemNoOnEditRegister_nml_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);
        criteriaDomain.setCompCd("MYK");
        criteriaDomain.setItemNo("A002TB0091B3N");
//        criteriaDomain.setAplyStrtDt("2012/12/19");
        // インタフェースの変更をしました(m-tutumi/0507)
//        w9018ExpFmlByItemMaService.validateDatabaseTmExpFormalitiItemNoOnEditRegister(criteriaDomain);
    }

    /**
     * 異常ケース
     *  
     *  ロック取得0件時エラー
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmExpFormalitiItemNoOnEditRegister_err_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);
        criteriaDomain.setCompCd("compCd1");
        criteriaDomain.setItemNo("XXXXXX");
//        criteriaDomain.setAplyStrtDt("2014/03/02");
        // インタフェースの変更をしました(m-tutumi/0507)
//        try {
//            w9018ExpFmlByItemMaService.validateDatabaseTmExpFormalitiItemNoOnEditRegister(criteriaDomain);
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(e.getMessage(), GSCM_E0_0010);
//        }
    }

    /**
     * 正常ケース
     * 
     * 更新
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateOnEditRegister_nml_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);
        criteriaDomain.setCompCd("MYH");
        criteriaDomain.setItemNo("A002TB0091B3N");
//        criteriaDomain.setAplyStrtDt("2012/12/19");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20140107000000");
        criteriaDomain.setComUpdateTimestamp(new Timestamp(date.getTime()));
        w9018ExpFmlByItemMaService.createOnEditRegister(criteriaDomain);
        // 実行後は更新日時を戻す
    }

    /**
     * 正常ケース
     * 
     * 登録
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testCreateOnEditRegister_nml_2() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_NEW);
        criteriaDomain.setCompCd("addCompCd1");
        criteriaDomain.setItemNo("addItemNo1");
//        criteriaDomain.setAplyStrtDt("2014/03/10");
        criteriaDomain.setCigmaPrdctFlg("1");
        criteriaDomain.setItemDescription("1");
        criteriaDomain.setExpLimitTyp("1");
        criteriaDomain.setDngrItemFlg("1");
        criteriaDomain.setHsCd("1");
        criteriaDomain.setOriginCntryCd("1");
        criteriaDomain.setFree1RegFlg("1");
        criteriaDomain.setFree1Dtl("1");
        criteriaDomain.setFree1OriginCntryFlg("1");
        criteriaDomain.setFree2RegFlg("1");
        criteriaDomain.setFree2Dtl("1");
        criteriaDomain.setFree2OriginCntryFlg("1");
        criteriaDomain.setFree3RegFlg("1");
        criteriaDomain.setFree3Dtl("1");
        criteriaDomain.setFree3OriginCntryFlg("1");
        w9018ExpFmlByItemMaService.createOnEditRegister(criteriaDomain);
        // 後処理 テストデータの消去
        w9018ExpFmlByItemMaService.deleteOnInquiryDelete(criteriaDomain);
    }

    /**
     * 正常ケース
     * 
     * 更新
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testDeleteOnInquiryDelete_nml_1() throws Exception {
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain = new W9018ExpFmlByItemMaCriteriaDomain();
        criteriaDomain.setMode(MODE_EDIT);
        criteriaDomain.setCompCd("MYG");
        criteriaDomain.setItemNo("A002TB0091B3N");
//        criteriaDomain.setAplyStrtDt("2012/12/19");
        w9018ExpFmlByItemMaService.deleteOnInquiryDelete(criteriaDomain);
        
    }

}
  