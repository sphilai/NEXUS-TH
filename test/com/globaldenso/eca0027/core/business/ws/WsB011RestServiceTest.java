/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.WsB011ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB011RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB011RestService wsb011RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB011RestServiceTest() {
        super();
    }
    /**
     * Setter method for WsB011RestService.
     *
     * @param WsB011RestService Set for WsB011RestService
     */
    public void setWsB011RestService(WsB011RestService WsB011RestService) {
        this.wsb011RestService = WsB011RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb011RestService = (WsB011RestService) getContext().getBean("wsB011RestService");
    }
    
    /**
     * <br />正常系テスト
     * <pre>
     * EDI拠点あり
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgHdr() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "10001";
        String shipToNoLegacy = "11";
        
        WsB011ResultDomain resultDomain = wsb011RestService.searchEdiSupport(compCd, customerSubsidiaryCode, shipToNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
        assertEquals(resultDomain.getFlag(), FLAG_Y);
    }
    
    /**
     * <br />正常系テスト
     * <pre>
     * EDI拠点なし
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgHdrNone001() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "7";
        String shipToNoLegacy = "7";
        
        WsB011ResultDomain resultDomain = wsb011RestService.searchEdiSupport(compCd, customerSubsidiaryCode, shipToNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
        assertEquals(resultDomain.getFlag(), FLAG_N);
    }
    
    /**
     * <br />正常系テスト
     * <pre>
     * EDI拠点なし
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgHdrNone002() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "12345678";
        String shipToNoLegacy = "12";
        
        WsB011ResultDomain resultDomain = wsb011RestService.searchEdiSupport(compCd, customerSubsidiaryCode, shipToNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
        assertEquals(resultDomain.getFlag(), FLAG_N);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNosearchEdiOdrLastDigChgHdr() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String customerSubsidiaryCode = "A";    // 数値以外のデータ
        String shipToNoLegacy = "1";
        
        WsB011ResultDomain resultDomain = wsb011RestService.searchEdiSupport(compCd, customerSubsidiaryCode, shipToNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
