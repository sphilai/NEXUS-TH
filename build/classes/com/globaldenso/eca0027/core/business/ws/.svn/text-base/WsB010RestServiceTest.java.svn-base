/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.WsB010ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB010RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB010RestService wsb010RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB010RestServiceTest() {
        super();
    }
    /**
     * Setter method for WsB010RestService.
     *
     * @param WsB010RestService Set for WsB010RestService
     */
    public void setWsB010RestService(WsB010RestService WsB010RestService) {
        this.wsb010RestService = WsB010RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb010RestService = (WsB010RestService) getContext().getBean("wsB010RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetCusSubInfo() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "01";
        
        WsB010ResultDomain resultDomain = wsb010RestService.getCusSubInfo(compCd, customerSubsidiaryCode);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetCusSubInfo() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "99";
        
        WsB010ResultDomain resultDomain = wsb010RestService.getCusSubInfo(compCd, customerSubsidiaryCode);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
