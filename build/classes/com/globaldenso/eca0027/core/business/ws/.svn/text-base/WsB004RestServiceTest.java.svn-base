/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB004RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB004RestService wsb004RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB004RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB004RestService.
     *
     * @param WsB004RestService Set for WsB004RestService
     */
    public void setWsB004RestService(WsB004RestService WsB004RestService) {
        this.wsb004RestService = WsB004RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb004RestService = (WsB004RestService) getContext().getBean("wsB004RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgCandidate001() throws Exception {
        
        // 入力ドメインの設定
        String partNoOrg = "TG123456-7890V0";
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb004RestService.searchEdiOdrLastDigChgCandidate(compCd, partNoOrg);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgCandidate002() throws Exception {
        
        // 入力ドメインの設定
        String partNoOrg = "123456789012345";
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb004RestService.searchEdiOdrLastDigChgCandidate(compCd, partNoOrg);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchEdiOdrLastDigChgCandidate() throws Exception {
        
        // 入力ドメインの設定
        String partNoOrg = "";
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb004RestService.searchEdiOdrLastDigChgCandidate(compCd, partNoOrg);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
