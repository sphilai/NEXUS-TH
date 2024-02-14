/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.Date;

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
public class WsB003RestServiceTest extends AbstractEca0027Test {
    /**
     * Serviceクラス
     */
    protected WsB003RestService wsb003RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB003RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB003RestService.
     *
     * @param WsB003RestService Set for WsB003RestService
     */
    public void setWsB003RestService(WsB003RestService WsB003RestService) {
        this.wsb003RestService = WsB003RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb003RestService = (WsB003RestService) getContext().getBean("wsB003RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgHdr() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "12345";
        String shipToNoLegacy = "67890";
        String pkgCode = "1";
        String partNoOrg = "TG123456-7890V0";
        String transportationCode = "1";
        Date shippingDate = DateFormat.getDateInstance().parse("2014/04/14");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb003RestService.searchEdiOdrLastDigChgHdr(compCd, customerNoLegacy, shipToNoLegacy, transportationCode, shippingDate, partNoOrg, pkgCode);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNosearchEdiOdrLastDigChgHdr() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "12345678";
        String shipToNoLegacy = "12";
        String pkgCode = "123";
        String partNoOrg = "NOTHING8901234567890";
        String transportationCode = "1";
        Date shippingDate = DateFormat.getDateInstance().parse("2014/04/14");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb003RestService.searchEdiOdrLastDigChgHdr(compCd, customerNoLegacy, shipToNoLegacy, transportationCode, shippingDate, partNoOrg, pkgCode);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
