/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.common.filter;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.mock.MockHttpServletRequest;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;

/**
 * {@link Eca0027CreateCommonInfoImpl}の単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Eca0027CreateCommonInfoImplTest extends AbstractEca0027Test {
    
    /**
     * <br />デフォルトコンストラクタ
     * Type in the functional overview of the constructor.
     *
     */
    public Eca0027CreateCommonInfoImplTest() {
    }

    /**
     * <br />execute()のテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testExecute() throws Exception {
        // HttpServletRequestの作成
        HttpServletRequest request = new MockHttpServletRequest();

        // CommonInfoDomainの作成
        Eca0027CommonInfoDomain commonInfo = new Eca0027CommonInfoDomain();
        commonInfo.setLoginUserDscId("nexus");
        commonInfo.setLanguageCd("ja");
        commonInfo.setTimeZone("JST");
        
        // 画面共通情報の取得
        Eca0027CreateCommonInfoImpl impl = new Eca0027CreateCommonInfoImpl();
        impl.execute(request, null, commonInfo);
        
        // 取得結果の検証
        Map<String, String> expectedCommonInfo = readCsvFile("testExecute_Eca0027CommonInfoDomain.csv").get(0);
        List<Map<String, String>> expectedUserAuthList = readCsvFile("testExecute_UserAuthDomain.csv");
        assertDomain("画面共通情報の取得", commonInfo, expectedCommonInfo);
        assertDomainList("権限の取得", commonInfo.getUserAuthList(), expectedUserAuthList);
    }
}
