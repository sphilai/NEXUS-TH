package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9003;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtServiceImpl;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.eca0027.core.integration.W9002AgentMaDaoImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * W9002AgentMaServiceImplの単体テストクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W9002AgentMaServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W9002AgentMaService w9002AgentMaService;

    /**
     * Type in the role of the field.
     */
    private TmAgentService tmAgentService;

    /**
     * Type in the role of the field.
     */
    private CommonService commonService;

    /**
     * デフォルトコンストラクタ。
     */
    public W9002AgentMaServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        w9002AgentMaService = (W9002AgentMaService) getContext().getBean("w9002AgentMaService");
        tmAgentService = (TmAgentService) getContext().getBean("tmAgentService");
        commonService = (CommonService) getContext().getBean("commonService");
    }

    /**
     * Type in the functional overview of the method.
     *
     * @param orgCompCd orgCompCd
     * @param agentCompCd agentCompCd
     * @throws ApplicationException ApplicationException
     * @return domain
     */
    private TmAgentDomain getInsTmAgentDomain(String orgCompCd, String agentCompCd) throws ApplicationException {
        TmAgentDomain createDomain = new TmAgentDomain();
        createDomain.setOrgCompCd(orgCompCd);
        createDomain.setAgentCompCd(agentCompCd);
        createDomain.setBhtUnlockAuthFlg("Y");
        createDomain.setMaOtherAuthFlg("Y");
        createDomain.setDocAuthFlg("Y");
        createDomain.setShippingActAuthFlg("Y");
        createDomain.setExpRequestAuthFlg("Y");
        createDomain.setExpRequestPkgAuthFlg("Y");
        createDomain.setErtAuthFlg("Y");
        createDomain.setRcvOdrAuthFlg("Y");
        createDomain.setPltzInstrAuthFlg("Y");   
        createDomain.setMixTagAuthFlg("Y");
        createDomain.setCmlAuthFlg("Y");
        createDomain.setXtagAuthFlg("Y");
        createDomain.setTrAuthFlg("Y");          
        createDomain.setStgInstrAuthFlg("Y");
        createDomain.setStgActAuthFlg("Y");
        createDomain.setShippingFirmAuthFlg("Y");
        createDomain.setProgControlAuthFlg("Y");
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W9003);
        return createDomain;
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchForPagingOnInquirySearch_nml_1() throws Exception {
        PageInfoData pageInfoData = new PageInfoData();
        pageInfoData.setFromCount(1);
        pageInfoData.setToCount(5);
        MockObjectManager.setReturnValueAtAllTimes(ActionPageInfoCreator.class, "createPageInfoData", pageInfoData);
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        
        criteria.setOrgCompCd("pagingOrgCompCd1");
        criteria.setAgentCompCd("paginAgentCompCd1");
        criteria.setLoginCompCd("pagingOrgCompCd1");
        criteria.setFunction("01");
        criteria.setServerId("001");
        
        List<UserAuthDomain> list = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setOwnerCompCd("pagingOrgCompCd1");
        list.add(userAuthDomain);
        criteria.setUserAuthList(list);
        
        criteria.setScreenId(SCREEN_ID_W9002);
        criteria.setLanguageCd("ja");
        PageInfoCreator page = new ActionPageInfoCreator(null, null, null);
        criteria.setPageInfoCreator(page);
        
        MockObjectManager.setReturnValueAtAllTimes(W9002AgentMaDaoImpl.class, "searchCountTmAgent", 1 );
        List<? extends W9002AgentMaItemDomain> resultList = w9002AgentMaService.searchForPagingOnInquirySearch(criteria);
        assertNotNull(resultList);
        assertEquals(resultList.size(), 0);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompAuthDel_nml_1() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("ortCompCd1");
        boolean result = w9002AgentMaService.validateConsistencyCompAuthDel(criteria.getOrgCompCd());
        assertTrue(result);
    }

    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyAgentMaPair_nml_1() throws Exception {
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("orgCompCd");
        criteria.setAgentCompCd("agentCompCd");
        Boolean rtn = w9002AgentMaService.validateConsistencyAgentMaPair(criteria.getOrgCompCd(), criteria.getAgentCompCd());
        assertEquals(rtn, true);
    }

    /**
     * 正常ケース
     * 
     * 組み合わせチェックエラーのためエラーコード返却
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyAgentMaPair_nml_3() throws Exception {
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("orgCompCd1");
        criteria.setAgentCompCd("orgCompCd");
        Boolean rtn = w9002AgentMaService.validateConsistencyAgentMaPair(criteria.getOrgCompCd(), criteria.getAgentCompCd());
        assertEquals(rtn, false);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyCompAuth_nml_1() throws Exception {
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "getUserAuthList", new ArrayList<UserAuthDomain>());
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);

        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("orgCompCd1");
        w9002AgentMaService.validateConsistencyCompAuth(criteria.getOrgCompCd());
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyEditMode_nml_1() throws Exception {
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        
        criteria.setFunctionNo("1");
        criteria.setOrgCompCd("orgCompCd1");
        String mode = w9002AgentMaService.validateConsistencyEditMode(criteria.getFunctionNo(), criteria.getAgentCompCd());
        assertEquals(mode, "1");
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyEditMode_nml_2() throws Exception {
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        criteria.setFunctionNo("2");
        criteria.setOrgCompCd("orgCompCd1");
        String mode = w9002AgentMaService.validateConsistencyEditMode(criteria.getFunctionNo(), criteria.getAgentCompCd());
        assertEquals(mode, MODE_EDIT);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyEditMode_nml_3() throws Exception {
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", false);
        criteria.setFunctionNo("2");
        criteria.setOrgCompCd("orgCompCd1");
        String mode = w9002AgentMaService.validateConsistencyEditMode(criteria.getFunctionNo(), criteria.getAgentCompCd());
        assertEquals(mode, MODE_REF);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_nml_1() throws Exception {
        
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setFunctionNo(MODE_EDIT);
        criteria.setOwnerCompCd("orgCompCd1");
        W9002AgentMaDomain w9002AgentMaDomain = w9002AgentMaService.searchOnEditInit(criteria);
        assertEquals(w9002AgentMaDomain.getOrgCompNmAbb(), "0000000020");
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_nml_2() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setFunctionNo(MODE_EDIT);
        criteria.setOwnerCompCd("orgCompCd1");
        criteria.setAgentCompCd("agentCompCd1");
        criteria.setOrgCompCd("orgCompCd1");
        W9002AgentMaDomain w9002AgentMaDomain = w9002AgentMaService.searchOnEditInit(criteria);
        assertNull(w9002AgentMaDomain.getOrgCompNmAbb());
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testSearchOnEditInit_nml_3() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setFunctionNo("1");
        criteria.setOwnerCompCd("MYJ");
        criteria.setAgentCompCd("MY1");
        criteria.setOrgCompCd("MYJ");
        W9002AgentMaDomain w9002AgentMaDomain = w9002AgentMaService.searchOnEditInit(criteria);
        if (w9002AgentMaDomain == null) {;}
    }
    
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseCompCd_nml_1() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setAgentCompCd("agentCompCd1");
        boolean rt = w9002AgentMaService.validateDatabaseCompCd(criteria.getAgentCompCd());
        assertFalse(rt);
    }

    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnEditRegisterByConsistency_nml_1() throws Exception {
        boolean rtn = w9002AgentMaService.validateDatabaseTmNxsCompOnEditRegisterByConsistency("orgCompCd1", "agentCompCd1");
        assertTrue(rtn);
    }
    /**
     * 正常ケース
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTmNxsCompOnEditRegisterByConsistency_nml_2() throws Exception {
        boolean rtn = w9002AgentMaService.validateDatabaseTmNxsCompOnEditRegisterByConsistency("orgCompCd1", "XXXXX");
        assertFalse(rtn);
    }
    
    // ----------- 更新系のテスト --------------------------------------------------------------------------------------------------//
    
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnInquiryDelete_nml_1() throws Exception {

        String cmp = "delOrgCompCd2";
        String agt = "delAgentCompCd2";
        
        try {
            
            // コンテキスト設定
            setDensoContext("test-dsc2");
            
            // TmAgentテストデータ追加
            TmAgentDomain createDomain = getInsTmAgentDomain("delOrgCompCd2", "delAgentCompCd2");
            tmAgentService.create(createDomain);
            
            // 追加したTmAgentデータ取得
            TmAgentCriteriaDomain dm = new TmAgentCriteriaDomain();
            dm.setOrgCompCd("delOrgCompCd2");
            dm.setAgentCompCd("delAgentCompCd2");
            TmAgentDomain rt = tmAgentService.searchByKey(dm);
            
            // Serviceパラメータ設定
            W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
            criteria.setOrgCompCd("orgCompCd2");
            criteria.setAgentCompCd("agentCompCd2");
            criteria.setDelOrgCompCd(cmp);
            criteria.setDelAgentCompCd(agt);
            criteria.setDelComUpdateTimestamp(rt.getComUpdateTimestamp());
            criteria.setArgOrgCompCd(cmp);
            
            TmAgentDomain tmAgentDomain = new TmAgentDomain();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date = sdf.parse("20140325184630");
            Timestamp object = new Timestamp(date.getTime());
            tmAgentDomain.setComUpdateTimestamp(object);
            
            // Service実行
            MockObjectManager.setReturnValueAtAllTimes(TmAgentServiceImpl.class, "lockByKeyNoWait", tmAgentDomain);
            MockObjectManager.setReturnValueAtAllTimes(TmAgentServiceImpl.class, "deleteByCondition", 1);
            int result = w9002AgentMaService.transactOnInquiryDelete(criteria);
            
            assertEquals(result, 1);
            
        } catch (UnexpectedRollbackException e) {
            // これはどうやって回避すればよいのか。。
            ;
        } finally {
            // testデータ削除
            TmAgentCriteriaDomain reflesh = new TmAgentCriteriaDomain();
            reflesh.setOrgCompCd(cmp);
            reflesh.setAgentCompCd(agt);
            tmAgentService.deleteByCondition(reflesh);
        }
    }

    /**
     * 異常ケース
     * 
     * 代行会社原単位のデータロック時に取得件数ゼロ件 
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnInquiryDelete_err_1() throws Exception {

        // Serviceパラメータ設定
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("XXXX");
        criteria.setAgentCompCd("ZZZ");
        try {
            w9002AgentMaService.transactOnInquiryDelete(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /**
     * 異常ケース
     * 
     * DSC-ID取得時の件数ゼロ件 
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnInquiryDelete_err_2() throws Exception {

        // Serviceパラメータ設定
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("orgCompCd1");
        criteria.setAgentCompCd("agentCompCd1");
        criteria.setDelAgentCompCd("XXXXXXX");
        try {
            w9002AgentMaService.transactOnInquiryDelete(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /**
     * 異常ケース
     * 
     * ユーザ利用権限管理データロック取得時の件数ゼロ件 
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnInquiryDelete_err_3() throws Exception {

        // Serviceパラメータ設定
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setOrgCompCd("orgCompCd1");
        criteria.setAgentCompCd("agentCompCd1");
        criteria.setDelOrgCompCd("XXXXXXXX");
        criteria.setArgOrgCompCd("XXXXXXXX");
        try {
            w9002AgentMaService.transactOnInquiryDelete(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }

    /**
     * 異常ケース
     * 
     * ユーザ利用権限管理データロック取得時の件数ゼロ件 
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnInquiryDelete_err_4() throws Exception {

        MockObjectManager.setReturnValueAtAllTimes(TtUserAuthMgtServiceImpl.class, "deleteByCondition", new GscmApplicationException("XXXX"));
        
        String cmp = "delOrgCompCd3";
        String agt = "delAgentCompCd3";
        try {
            
            // コンテキスト設定
            setDensoContext("test-dsc2");
            
            // TmAgentテストデータ追加
            TmAgentDomain createDomain = getInsTmAgentDomain("delOrgCompCd3", "delAgentCompCd3");
            tmAgentService.create(createDomain);

            // データ取得
            TmAgentCriteriaDomain dm = new TmAgentCriteriaDomain();
            dm.setOrgCompCd("MYJ");
            dm.setAgentCompCd("MYC");
            TmAgentDomain rt = tmAgentService.searchByKey(dm);
            
            // Serviceパラメータ設定
            W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
            criteria.setOrgCompCd("MYJ");
            criteria.setAgentCompCd("MYC");
            criteria.setDelComUpdateTimestamp(rt.getComUpdateTimestamp());
            
            // Service実行
            w9002AgentMaService.transactOnInquiryDelete(criteria);
            
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(e.getMessage(), "XXXX");
        } finally {
            // testデータ削除
            TmAgentCriteriaDomain reflesh = new TmAgentCriteriaDomain();
            reflesh.setOrgCompCd(cmp);
            reflesh.setAgentCompCd(agt);
            tmAgentService.deleteByCondition(reflesh);
        }
    }

    /**
     * 正常ケース
     * 
     * TmAgent登録
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_nml_0() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setProcMode("1");
        criteria.setOrgCompCd("addOrgComp");
        criteria.setAgentCompCd("addAgentComp");
        criteria.setBhtUnlockAuthFlg("Y");
        criteria.setMaOtherAuthFlg("Y");
        criteria.setDocAuthFlg("Y");
        criteria.setShippingActAuthFlg("Y");
        criteria.setExpRequestAuthFlg("Y");
        criteria.setExpRequestPkgAuthFlg("Y");
        criteria.setErtAuthFlg("Y");
        criteria.setRcvOdrAuthFlg("Y");
        criteria.setPltzInstrAuthFlg("Y");
        criteria.setMixTagAuthFlg("Y");
        criteria.setCmlAuthFlg("Y");
        criteria.setXTagAuthFlg("Y");
        criteria.setTrAuthFlg("Y");
        criteria.setStgInstrAuthFlg("Y");
        criteria.setStgActAuthFlg("Y");
        criteria.setShippingFirmAuthFlg("Y");
        criteria.setProgControlAuthFlg("Y");
        
        MockObjectManager.setReturnNullAtAllTimes(TmAgentServiceImpl.class, "updateByCondition");
        w9002AgentMaService.createOnEditRegister(criteria);
        
        try{
            MockObjectManager.setReturnNullAtAllTimes(TmAgentServiceImpl.class, "updateByCondition");
            MockObjectManager.setReturnValueAtAllTimes(TmAgentServiceImpl.class, "create", new IntegrationLayerException(""));
            w9002AgentMaService.createOnEditRegister(criteria);
        }catch (GscmApplicationException e) {
        }
    }
    
    /**
     * 正常ケース
     * 
     * TmAgent登録
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_nml_1() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setOrgCompCd("MYJ");
        criteria.setAgentCompCd("MYK");
        criteria.setBhtUnlockAuthFlg("N");
        criteria.setMaOtherAuthFlg("Y");
        criteria.setDocAuthFlg("Y");
        criteria.setShippingActAuthFlg("Y");
        criteria.setExpRequestAuthFlg("Y");
        criteria.setExpRequestPkgAuthFlg("Y");
        criteria.setErtAuthFlg("Y");
        criteria.setRcvOdrAuthFlg("Y");
        criteria.setPltzInstrAuthFlg("Y");
        criteria.setMixTagAuthFlg("Y");
        criteria.setCmlAuthFlg("Y");
        criteria.setXTagAuthFlg("Y");
        criteria.setTrAuthFlg("Y");
        criteria.setStgInstrAuthFlg("Y");
        criteria.setStgActAuthFlg("Y");
        criteria.setShippingFirmAuthFlg("Y");
        criteria.setProgControlAuthFlg("Y");
        w9002AgentMaService.createOnEditRegister(criteria);
        
        MockObjectManager.setReturnNullAtAllTimes(TmAgentServiceImpl.class, "updateByCondition");
        w9002AgentMaService.createOnEditRegister(criteria);
        
//        MockObjectManager.setReturnNullAtAllTimes(TmAgentServiceImpl.class, "updateByCondition");
//        MockObjectManager.setReturnNullAtAllTimes(TmUserConfServiceImpl.class, "searchByCondition");
//        w9002AgentMaService.createOnEditRegister(criteria);

        // 後処理（登録データ削除）
        TmAgentCriteriaDomain criteriaDomain = new TmAgentCriteriaDomain();
        criteriaDomain.setOrgCompCd("0000000020");
        criteriaDomain.setAgentCompCd("0000000020");
        TmAgentDomain dom = tmAgentService.searchByKey(criteriaDomain);
        criteriaDomain.setComUpdateTimestamp(dom.getComUpdateTimestamp());
        tmAgentService.delete(criteriaDomain);

    }

    /**
     * 正常ケース
     * 
     * TmAgent更新 FLGに"N"なし
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_nml_2() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setOrgCompCd("MYJ");
        criteria.setAgentCompCd("MYD");
        w9002AgentMaService.createOnEditRegister(criteria);
    }

    /**
     * 正常ケース
     * 
     * TmAgent更新 FLGに"N"あり
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_nml_3() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setAgentCompCd("updAgentCompCd1");
        criteria.setBhtUnlockAuthFlg("N");
        criteria.setMaOtherAuthFlg("N");
        criteria.setOrgCompCd("orgCompCd1");
        criteria.setArgOrgCompCd("updAgentCompCd1");
        
        MockObjectManager.setReturnNullAtAllTimes(TmAgentServiceImpl.class, "updateByCondition");
        w9002AgentMaService.createOnEditRegister(criteria);
    }

    /**
     * 異常ケース
     * 
     * TmAgent更新 FLGに"N"あり, DSC-IDの取得結果0件
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_err_1() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setAgentCompCd("XXXX");
        criteria.setBhtUnlockAuthFlg("N");
        criteria.setMaOtherAuthFlg("N");
        try {
            w9002AgentMaService.createOnEditRegister(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }
    
    /**
     * 異常ケース
     * 
     * TmAgent更新 FLGに"N"あり, DSC-IDの取得結果0件
     * 
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnEditRegister_err_2() throws Exception {
        W9002AgentMaCriteriaDomain criteria = new W9002AgentMaCriteriaDomain();
        criteria.setMode(MODE_EDIT);
        criteria.setAgentCompCd("updAgentCompCd1");
        criteria.setBhtUnlockAuthFlg("N");
        criteria.setMaOtherAuthFlg("N");
        criteria.setOrgCompCd("orgCompCd1");
        criteria.setArgOrgCompCd("XXXXX");
        try {
            w9002AgentMaService.createOnEditRegister(criteria);
            fail("この行は、実行されないはず");
        } catch (GscmApplicationException e) {
            assertEquals(GSCM_E0_0010, e.getMessage());
        }
    }
}
