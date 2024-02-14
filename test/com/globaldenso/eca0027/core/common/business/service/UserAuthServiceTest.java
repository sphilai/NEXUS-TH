/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.common.business.service;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

/**
 * <br />UserAuthServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class UserAuthServiceTest extends AbstractEca0027Test {

    /**
     * <br />ユーザ機能利用権限サービス
     */
    private UserAuthService userAuthService;
    
    /**
     * <br />デフォルトコンストラクタです。
     *
     */
    public UserAuthServiceTest() {
    }

    /**
     * <br />テストの前処理を行います。
     *
     */
    @Before
    public void setUp() {
        userAuthService = (UserAuthService) getContext().getBean("userAuthService");
    }
    
    /**
     * <br />searchByConditionのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchByCondition() throws Exception {
        String[][] fixtures = {
            { "一般ユーザ",   "nexus"   },
            { "地域管理者",   "nexus01" },
            { "会社管理者",   "nexus02" },
            { "工場管理者",   "nexus03" },
            { "全機能(更新)", "nexus0R" },
            { "全機能(参照)", "nexus0B" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の取得
            List<?> actualUserAuthList = userAuthService.searchByCondition(toUserAuthCriteria(fixtures[i][1]));

            // 結果の検証
            List<Map<String, String>> expectedUserAuthList = readCsvFile("testSearchByCondition_UserAuthDomain_" + fixtures[i][1] + ".csv");
            assertDomainList(fixtures[i][0], actualUserAuthList, expectedUserAuthList);
        }
    }

    /**
     * <br />hasRoleのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasRole() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が未付与", "nexus",   "0R", "false" },
            { "全機能(更新)が付与済", "nexus0R", "0R", "true"  },
            { "全機能(参照)が未付与", "nexus",   "0B", "false" },
            { "全機能(参照)が付与済", "nexus0B", "0B", "true"  },
            { "役割(更新)が未付与",   "nexus0R", "AR", "true"  },
            { "役割(更新)が未付与",   "nexus01", "AR", "false" },
            { "役割(更新)が付与済",   "nexus",   "AR", "true"  },
            { "役割(参照)が未付与",   "nexus0R", "AB", "true"  },
            { "役割(参照)が未付与",   "nexus0B", "AB", "true"  },
            { "役割(参照)が未付与",   "nexus01", "AB", "false" },
            { "役割(参照)が付与済",   "nexus",   "AR", "true"  },
            { "役割にnullを指定",     "nexus",   null, "false" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限のチェック
            boolean actual = userAuthService.hasRole(fixtures[i][2]);

            // 結果の検証
            String reason = String.format("[%d] %s (%s/%s)", i + 1, fixtures[i][0], fixtures[i][1], fixtures[i][2]);
            boolean expected = Boolean.valueOf(fixtures[i][3]);
            assertThat(reason, actual, is(expected));
        }
    }

    /**
     * <br />hasAnyPermitFuncIdのテスト
     *
     * @throws Exception  テストに失敗した場合
     */
    @Test
    public void testHasAnyPermitFuncId() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が付与済", "nexus0R", "W2001R:W2001B", "true"  },
            { "全機能(更新)が付与済", "nexus0R", "W2001B",        "true"  },
            { "全機能(参照)が付与済", "nexus0B", "W2001R:W2001B", "true"  },
            { "全機能(参照)が付与済", "nexus0B", "W2001B",        "true"  },
            { "認可機能IDが付与済",   "nexus",   "W2001R:W2001B", "true"  },
            { "認可機能IDが未付与",   "nexus01", "W2001R:W2001B", "false" }
        };

        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限の有無をチェック
            String[] args = fixtures[i][2].split(":");
            boolean actual = userAuthService.hasAnyPermitFuncId(args);
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][3]);
            assertThat(reason, actual, is(expected));
        }
    }
    
    /**
     * <br />hasUserAuthのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasUserAuth() throws Exception {
        String[][] fixtures = {
            { "権限あり", "nexus",   "true"  },
            { "権限なし", "nexus00", "false" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限の有無をチェック
            boolean actual = userAuthService.hasUserAuth();
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][2]);
            assertThat(reason, actual, is(expected));
        }
    }

    /**
     * <br />hasUserAuthForCompのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasUserAuthForComp() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が付与済 (サーバ内の会社)",     "nexus0R", "W9002R:DNJ", "true"  },
            { "全機能(更新)が付与済 (サーバ外の会社)",     "nexus0R", "W9002R:MYS", "false" },
            { "全機能(参照)が付与済 (サーバ内の会社)",     "nexus0B", "W9002B:DNJ", "true"  },
            { "全機能(参照)が付与済 (サーバ外の会社)",     "nexus0B", "W9002B:MYS", "false" },
            { "認可機能ID(更新)が付与済 (サーバ内の会社)", "nexus",   "W9002R:DNJ", "true"  },
            { "認可機能ID(更新)が付与済 (サーバ外の会社)", "nexus",   "W9002R:MYS", "false" },
            { "認可機能ID(更新)が未付与",                  "nexus01", "W9002R:-",   "false" },
            { "認可機能ID(参照)が付与済 (サーバ内の会社)", "nexus",   "W9002B:DNJ", "true"  },
            { "認可機能ID(参照)が付与済 (サーバ外の会社)", "nexus",   "W9002B:MYS", "false" },
            { "認可機能ID(参照)が未付与",                  "nexus01", "W9002B:-",   "false" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限のチェック
            String[] args = fixtures[i][2].split(":");
            boolean actual = userAuthService.hasUserAuthForComp(args[0], args[1]);
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][3]);
            assertThat(reason, actual, is(expected));
        }
    }
    
    /**
     * <br />hasUserAuthForCompPlntのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasUserAuthForCompPlnt() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が付与済 (サーバ内の会社、工場あり)",         "nexus0R", "W2001R:DNJ:M1", "true"  },
            { "全機能(更新)が付与済 (サーバ内の会社、工場なし)",         "nexus0R", "W2001R:DNJ:M2", "false" },
            { "全機能(更新)が付与済 (サーバ外の会社)",                   "nexus0R", "W2001R:MYS:-",  "false" },
            { "全機能(参照)が付与済 (サーバ内の会社、工場あり)",         "nexus0B", "W2001B:DNJ:M1", "true"  },
            { "全機能(参照)が付与済 (サーバ内の会社、工場なし)",         "nexus0B", "W2001B:DNJ:M2", "false" },
            { "全機能(参照)が付与済 (サーバ外の会社)",                   "nexus0B", "W2001B:MYS:-",  "false" },
            { "認可機能ID(更新)が付与済 (サーバ内の会社、工場権限あり)", "nexus",   "W2001R:DNJ:M1", "true"  },
            { "認可機能ID(更新)が付与済 (サーバ内の会社、工場権限なし)", "nexus",   "W2001R:DNJ:M2", "false" },
            { "認可機能ID(更新)が付与済 (サーバ外の会社)",               "nexus",   "W2001R:MYS:-",  "false" },
            { "認可機能ID(更新)が未付与",                                "nexus01", "W2001R:-:-",    "false" },
            { "認可機能ID(参照)が付与済 (サーバ内の会社、工場権限あり)", "nexus",   "W2001B:DNJ:M1", "true"  },
            { "認可機能ID(参照)が付与済 (サーバ内の会社、工場権限なし)", "nexus",   "W2001B:DNJ:M2", "false" },
            { "認可機能ID(参照)が付与済 (サーバ外の会社)",               "nexus",   "W2001B:MYS:-",  "false" },
            { "認可機能ID(参照)が未付与",                                "nexus01", "W2001B:-:-",    "false" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限のチェック
            String[] args = fixtures[i][2].split(":");
            boolean actual = userAuthService.hasUserAuthForCompPlnt(args[0], args[1], args[2]);
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][3]);
            assertThat(reason, actual, is(expected));
        }
        
    }
    
    /**
     * <br />hasRegisterAllのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasRegisterAll() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が付与済", "nexus0R", "true"  },
            { "全機能(更新)が未付与", "nexus0B", "false" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限のチェック
            boolean actual = userAuthService.hasRegisterAll();
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][2]);
            assertThat(reason, actual, is(expected));
        }
    }
    
    /**
     * <br />hasBrowseAllのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testHasBrowseAll() throws Exception {
        String[][] fixtures = {
            { "全機能(更新)が付与済", "nexus0R", "true"  },
            { "全機能(参照)が付与済", "nexus0B", "true"  },
            { "全機能(参照)が未付与", "nexus",   "false" }
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限のチェック
            boolean actual = userAuthService.hasBrowseAll();
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            boolean expected = Boolean.valueOf(fixtures[i][2]);
            assertThat(reason, actual, is(expected));
        }
    }
    
    /**
     * <br />getUserAuthListのテスト
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testGetUserAuthList() throws Exception {
        String[][] fixtures = {
            { "付与済の権限を指定", "nexus", "W9002B:W9002R" },
            { "未付与の権限を指定", "nexus", "W9999B:W9999R" },
        };
        
        for (int i = 0; i < fixtures.length; i++) {
            // 権限の設定
            setUpCommonInfo(fixtures[i][1]);
            
            // 権限の取得
            String[] permitFuncIds = fixtures[i][2].split(":");
            List<?> actualUserAuthList = userAuthService.getUserAuthList(permitFuncIds);
            
            // 結果の検証
            String reason = String.format("[%d] %s", i + 1, fixtures[i][0]);
            List<Map<String, String>> expectedUserAuthList = readCsvFile("testGetUserAuthList_" + i + ".csv");
            assertDomainList(reason, actualUserAuthList, expectedUserAuthList);
        }
    }
    
    /**
     * <br />指定されたユーザの権限を取得する{@link UserAuthCriteriaDomain}を作成します。
     *
     * @param dscId DSC-ID
     * @return 作成した{@link UserAuthCriteriaDomain}
     */
    private UserAuthCriteriaDomain toUserAuthCriteria(String dscId) {
        UserAuthCriteriaDomain criteria = new UserAuthCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setServerId("dev");
        
        return criteria;

    }
    
    /**
     * <br />指定されたユーザの権限を取得し、DensoContextに設定します。
     *
     * @param dscId DSC-ID
     * @throws Exception 権限が取得できなかった場合
     */
    private void setUpCommonInfo(String dscId) throws Exception {
        // 権限の取得
        List<? extends UserAuthDomain> userAuthList = userAuthService.searchByCondition(toUserAuthCriteria(dscId));
        
        // 画面共通情報の作成
        Eca0027CommonInfoDomain commonInfo = new Eca0027CommonInfoDomain();
        commonInfo.setServerId("dev");
        commonInfo.setUserAuthList(userAuthList);
        
        // ウィンドウ情報の作成
        WindowInfoDomain windowInfo = new WindowInfoDomain();
        windowInfo.setCommonInfo(commonInfo);
        
        // ウィンドウ情報の設定
        DensoContext.get().putGeneralArea(WINDOW_ID_0, windowInfo);
    }
}
