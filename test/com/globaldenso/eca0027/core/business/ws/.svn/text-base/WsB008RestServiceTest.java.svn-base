/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB008RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected WsB008RestService wsb008RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB008RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB008RestService.
     *
     * @param WsB008RestService Set for WsB008RestService
     */
    public void setWsB008RestService(WsB008RestService WsB008RestService) {
        this.wsb008RestService = WsB008RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb008RestService = (WsB008RestService) getContext().getBean("wsB008RestService");
    }
    
    /**
     * <br />正常系テスト
     * <pre>
     * テストを実行しますと、「MR041PR」の「ACTIVE RECORD CODE(ACREC)」の値が'D'に更新されてしまい
     * 再度テストを実行しますとResult Codeがエラーになります。JUnit実行前に'D'以外の値に更新してください。
     * update CQDTALIB5.MR041PR set ACREC ='-'
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetEdiOdrLincData() throws Exception {
        
        // 入力ドメインの設定
        String receivingCompanyCode = "MYF";
        String newLincSubsidiaryCode = "2";
        
        WsB008ResultDomain resultDomain = wsb008RestService.getEdiOdrLincData(receivingCompanyCode, newLincSubsidiaryCode, "E213");
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetEdiOdrLincData01() throws Exception {
        
        // 入力ドメインの設定
        String receivingCompanyCode = "MYG";
        String newLincSubsidiaryCode = "9";
        
        WsB008ResultDomain resultDomain = wsb008RestService.getEdiOdrLincData(receivingCompanyCode, newLincSubsidiaryCode, "E213");
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetEdiOdrLincData02() throws Exception {
        
        // 入力ドメインの設定
        String receivingCompanyCode = "MYI";
        String newLincSubsidiaryCode = "";
        
        WsB008ResultDomain resultDomain = wsb008RestService.getEdiOdrLincData(receivingCompanyCode, newLincSubsidiaryCode, "E213");
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
