/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SYS_INFO_MAX_COUNT;
import static org.junit.Assert.assertFalse;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002UserConfDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;
import com.globaldenso.eca0027.core.integration.W0002MenuDaoImpl;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;

/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10410 $
 */
public class W0002MenuServiceTest extends AbstractEca0027Test {

    /**
     * <br />メニュー サービス
     */
    private W0002MenuService w0002MenuService;
    
    /**
     * <br />ユーザ設定原単位サービス (SACT)
     */
    private TmUserConfService tmUserConfService;

    /**
     * <br />SimpleDateFormat
     */
    private SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public W0002MenuServiceTest() {
    }

    /**
     * <br />初期化処理を行います。
     */
    @Before
    public void setUp() {
        w0002MenuService = (W0002MenuService) getContext().getBean("w0002MenuService");
        tmUserConfService = (TmUserConfService) getContext().getBean("gscmTmUserConfService");
    }
    
    /**
     * <br />searchOnMenuInitForMenuのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchOnMenuInitForMenu() throws Exception {
        // 検索条件の設定
        W0002MenuCriteriaDomain criteria = new W0002MenuCriteriaDomain();
        criteria.setCompCd("DNJ");
        criteria.setLngCd("ja");
        
        // メニューの取得
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasRole", true);
        List<? extends W0002MenuDomain> actualMenuList = w0002MenuService.searchOnMenuInitForMenu(criteria);
        
        // 1階層目の検証
        List<Map<String, String>> expectedMenuList = readCsvFile("testSearchOnMenuInitForMenu_W0002MenuDomain.csv");
        assertDomainList("メニューの取得 (1階層目)", actualMenuList, expectedMenuList);
        
        // 2階層目の検証
        for (W0002MenuDomain menu : actualMenuList) {
            String reason = String.format("メニューの取得 (2階層目) [%s]", menu.getScreenId());

            List<Map<String, String>> expectedSubMenuList = readCsvFile("testSearchOnMenuInitForMenu_W0002MenuDomain_" + menu.getScreenId() + ".csv");
            List<? extends W0002MenuDomain> actualSubMenuList = menu.getSubMenuList();
            assertDomainList(reason, actualSubMenuList, expectedSubMenuList);
        }

        // 画面ID重複の場合
        W0002MenuDomain menu1 = new W0002MenuDomain();
        menu1.setId("001");
        menu1.setScreenId("W0001");
        menu1.setScreenNm("画面1");
        menu1.setParScreenId(null);
        menu1.setActionPath("w0001");
        menu1.setRole("");
        menu1.setPermitted(true);
        menu1.setSubMenuList(null);
        
        W0002MenuDomain menu2 = new W0002MenuDomain();
        menu2.setId("002");
        menu2.setScreenId("W0001");
        menu2.setScreenNm("画面1");
        menu2.setParScreenId(null);
        menu2.setActionPath("w0001");
        menu2.setRole("");
        menu2.setPermitted(true);
        menu2.setSubMenuList(null);

        MockObjectManager.setReturnValueAtAllTimes(W0002MenuDaoImpl.class, "searchVmMenu", Arrays.asList(menu1, menu2));
        List<? extends W0002MenuDomain> actualMenuList2 = w0002MenuService.searchOnMenuInitForMenu(criteria);
        
        assertFalse(actualMenuList2.isEmpty());

    }

    /**
     * <br />searchOnMenuInitForServerのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchOnMenuInitForServer() throws Exception {
        // 検索条件の設定
        W0002ServerCriteriaDomain criteria = new W0002ServerCriteriaDomain();
        criteria.setServerId("dev");
        
        // 言語コード
        String[][] fixtures = { 
            { "サーバ原単位(言語)に定義済", "ja" },
            { "サーバ原単位(言語)に未定義", "fr" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            String reason = String.format("言語(%s)で検索", fixtures[i][0]);

            // 言語コードの設定
            criteria.setLngCd(fixtures[i][1]);
            
            // サーバ情報の取得・検証
            List<Map<String, String>> expectedServerList = readCsvFile("testSearchOnMenuInitForServer_" + i + ".csv");
            List<?> actualServerList = w0002MenuService.searchOnMenuInitForServer(criteria);
            assertDomainList(reason, actualServerList, expectedServerList);
        }
    }

    /**
     * <br />searchOnMenuInitForSystemInfoのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testSearchOnMenuInitForSystemInfo() throws Exception {
        // 検索条件の設定
        W0002SysInfoCriteriaDomain criteria = new W0002SysInfoCriteriaDomain();
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(SYS_INFO_MAX_COUNT);
        criteria.setPreferredOrder("PUB_STRT_DT desc");
        
        String[] ignoreCols = {
            "TT_SYS_INFO_SEQ",
            "OWNER_COMP",
            "LNG_CD",
            "PUB_END_DT",
            "INFORMATION_TYP"
        };
        
        /* 0: テストケースの説明
         * 1: システム日付
         * 2: 言語
         * 3: サーバID
         */
        // 検索条件
        String[][] fixtures = { 
            { "公開期間中である", "2014/04/23", "en", "MYS" },
            { "公開期間中でない (過去)", "1900/04/23", "en", "MYS" },
            { "公開期間中でない (未来)", "2199/04/23", "en", "MYS" },
            { "指定言語のお知らせなし", "2014/04/23", "ja", "MYS" },
            { "指定サーバのお知らせなし", "2014/04/23", "en", "MMM" } 
        };

        for (int i = 0; i < fixtures.length; i++) {
            String reason = String.format("お知らせ情報の検索 (%s) [%s]", fixtures[i][0], fixtures[i][1]);

            // システム日付、言語、サーバIDの設定
            criteria.setSysdate(df.parse(fixtures[i][1]));
            criteria.setLngCd(fixtures[i][2]);
            criteria.setServerId(fixtures[i][3]);
            
            // お知らせ情報の取得・検証
            List<Map<String, String>> expectedVtSysInfoList = readCsvFile("testSearchOnMenuInitForSystemInfo_W0002SysInfoDomain_" + i + ".csv");
            List<?> actualVtSysInfoList = w0002MenuService.searchOnMenuInitForSystemInfo(criteria);
            assertDomainList(reason, actualVtSysInfoList, expectedVtSysInfoList, ignoreCols);
        }
    }

    /**
     * <br />searchOnMenuInitForBusinessInfoのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testSearchOnMenuInitForBusinessInfo() throws Exception {
        // 検索条件の設定
        W0002SysInfoCriteriaDomain criteria = new W0002SysInfoCriteriaDomain();
        criteria.setRowNumFrom(1);
        criteria.setRowNumTo(SYS_INFO_MAX_COUNT);
        criteria.setPreferredOrder("PUB_STRT_DT desc");
        
        String[] ignoreCols = {
            "TT_SYS_INFO_SEQ",
            "OWNER_COMP",
            "LNG_CD",
            "PUB_END_DT",
            "INFORMATION_TYP"
        };
        
        /* 0: テストケースの説明
         * 1: システム日付
         * 2: 言語
         * 3: サーバID
         */
        // 検索条件
        String[][] fixtures = { 
            { "公開期間中", "2014/04/23", "en", "MYS" },
            { "公開期間中でない (過去)", "1900/04/23", "en", "MYS" },
            { "公開期間中でない (未来)", "2199/04/23", "en", "MYS" },
            { "指定言語のお知らせなし", "2014/04/23", "ja", "MYS" },
            { "指定サーバのお知らせなし", "2014/04/23", "en", "MMM" } 
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            String reason = String.format("お知らせ情報の取得 (%s) [%s]", fixtures[i][0], fixtures[i][1]);

            // システム日付、言語、サーバIDの設定
            criteria.setSysdate(df.parse(fixtures[i][1]));
            criteria.setLngCd(fixtures[i][2]);
            criteria.setServerId(fixtures[i][3]);
            
            // お知らせ情報の取得・検証
            List<Map<String, String>> expectedVtSysInfoList = readCsvFile("testSearchOnMenuInitForBusinessInfo_W0002SysInfoDomain_" + i + ".csv");
            List<?> actualVtSysInfoList = w0002MenuService.searchOnMenuInitForBusinessInfo(criteria);
            assertDomainList(reason, actualVtSysInfoList, expectedVtSysInfoList, ignoreCols);
        }
    }

    /**
     * <br />searchOnMenuInitForCigmaStatusのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchOnMenuInitForCigmaStatus() throws Exception {
        // 検索条件
        String[][] fixtures = { 
            { "夜間バッチ中である", "dev" },
            { "夜間バッチ中でない", "MYS" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            String reason = String.format("CIGMA夜間バッチ情報の取得 (%s)", fixtures[i][0]);
            
            // 検索条件の設定
            W0002CigmaStatusCriteriaDomain criteria = new W0002CigmaStatusCriteriaDomain();
            criteria.setServerId(fixtures[i][1]);
            
            // CIGMA夜間バッチ情報の取得・検証
            List<Map<String, String>> expectedCigmaStatusList = readCsvFile("testSearchOnMenuInitForCigmaStatus_W0002CigmaStatusDomain_" + i + ".csv");
            List<?> actualCigmaStatusList = w0002MenuService.searchOnMenuInitForCigmaStatus(criteria);
            assertDomainList(reason, actualCigmaStatusList, expectedCigmaStatusList);
        }
    }
    
    /**
     * <br />updateOnMenuSetupのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testUpdateOnMenuSetup() throws Exception {
        W0002UserConfDomain userConf = new W0002UserConfDomain();
        userConf.setDscId("nexus");
        userConf.setUserLngCd("en");
        userConf.setCharCd("iso-8859-1");
        userConf.setTimezoneId("AST");
        
        w0002MenuService.updateOnMenuSetup(userConf);
        
        TmUserConfCriteriaDomain criteria = new TmUserConfCriteriaDomain();
        criteria.setDscId("nexus");
        
        Map<String, String> expectedTmUserConf = readCsvFile("testUpdateOnMenuSetup_W0002UserConfDomain.csv").get(0);
        TmUserConfDomain actualTmUserConf = tmUserConfService.searchByKey(criteria);
        assertDomain("ユーザ設定原単位の更新", actualTmUserConf, expectedTmUserConf);
    }
    
}
