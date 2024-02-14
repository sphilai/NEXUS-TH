/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.sun.jersey.api.client.GenericType;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class T001ResourceTest extends AbstractEca0027Test {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    

    /**
     * デフォルトコンストラクタです。
     */
    public T001ResourceTest() {
        super();
    }
    
    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        commonService = (CommonService) getContext().getBean("commonService");
    }
    
    /* ========== テストケース ================================================================== */
    // --- ValidateDatabaseCigmaAvailable ----------------------------------------------------------
    /**
     * 正常系：NEXUSへCIGMA夜間バッチ状態を通知する単体テスト
     * <ul>
     *     <li>NEXUSへCIGMA夜間バッチ状態を通知を行います。</li>
     *     <li>validateDatabaseCigmaAvailable</li>
     * </ul>
     * @throws ApplicationException CIGMA夜間バッチの稼働状況が取得できない場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable001() throws ApplicationException {
        
        setDensoContext("nexus");
        
        String compCd = "MYF";
        
        String webServicePath = "wst001";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        
        // パラメータを設定する
        setDensoContext("nexus");
        
        wsCallerRestDomain.setUrl("http://malaysia:8080/NEXUS_EXPORT/rest/wst001");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");

        wsCallerRestDomain.setParamMap("companyCode", "THE");
        wsCallerRestDomain.setParamMap("accessibilityType", "1");
        wsCallerRestDomain.setParamMap("cigmaAds", "20140411");


        ResultDomain resultDomain = new ResultDomain();
        try {
            // Webサービスを呼び出す
            resultDomain = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<ResultDomain>(){});

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }

        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
        
    }
}
