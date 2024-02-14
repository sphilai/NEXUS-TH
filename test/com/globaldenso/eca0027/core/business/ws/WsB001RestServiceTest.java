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
public class WsB001RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB001RestService wsb001RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB001RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB001RestService.
     *
     * @param WsB001RestService Set for WsB001RestService
     */
    public void setWsB001RestService(WsB001RestService WsB001RestService) {
        this.wsb001RestService = WsB001RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb001RestService = (WsB001RestService) getContext().getBean("wsB001RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOdrEntryHdrOnHand001() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "1";
        String shipToNoLegacy = "1";
        String partNo = "TG123456-7890V0";
        String pkgCode = "1";
        Date startDt = DateFormat.getDateInstance().parse("2015/03/20");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb001RestService.searchOdrEntryHdrOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, startDt);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOdrEntryHdrOnHand002() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "12345";
        String shipToNoLegacy = "67890";
        String partNo = "TG234567-8901V0";
        String pkgCode = "1";
        Date startDt = DateFormat.getDateInstance().parse("2015/03/20");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb001RestService.searchOdrEntryHdrOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, startDt);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />正常系テスト(警告)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOdrEntryHdrOnHandForWarn() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "1";
        String shipToNoLegacy = "1";
        String partNo = "TG234567-8901V0";
        String pkgCode = "1";
        Date startDt = DateFormat.getDateInstance().parse("2015/03/20");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb001RestService.searchOdrEntryHdrOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, startDt);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchOdrEntryHdrOnHand() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "12345678";
        String shipToNoLegacy = "12";
        String partNo = "12345678901234567890";
        String pkgCode = "123";
        Date startDt = DateFormat.getDateInstance().parse("2015/03/20");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb001RestService.searchOdrEntryHdrOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, startDt);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
