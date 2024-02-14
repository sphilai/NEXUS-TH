/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * WsB005のJUnitクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB005RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB005RestService wsb005RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB005RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB005RestService.
     *
     * @param WsB005RestService Set for WsB005RestService
     */
    public void setWsB005RestService(WsB005RestService WsB005RestService) {
        this.wsb005RestService = WsB005RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb005RestService = (WsB005RestService) getContext().getBean("wsB005RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchEdiOdrLastDigChgDtl() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "1";
        String shipToNoLegacy = "1";
        Date shippingDateDate = DateFormat.getDateInstance().parse("2014/05/20");
        List<String>indexList = new ArrayList<String>();
        List<String>partNoList = new ArrayList<String>();
        indexList.add("1");
        partNoList.add("TG123456-7890VX");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb005RestService.searchEdiOdrLastDigChgDtl(compCd, customerNoLegacy, shipToNoLegacy, shippingDateDate, indexList, partNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />異常系テスト
     * <pre>存在しない品目番号を指定</pre>
     *
     * @throws Exception エラーが発生した場合
     */
    //@Test
    public void testNoSearchEdiOdrLastDigChgDtl01() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "1";
        String shipToNoLegacy = "1";
        Date shippingDateDate = DateFormat.getDateInstance().parse("2014/05/20");
        List<String>indexList = new ArrayList<String>();
        indexList.add("1");
        indexList.add("2");
        List<String>partNoList = new ArrayList<String>();
        partNoList.add("TG123456-7890V0");
        partNoList.add("TG123456-7890V0TEST");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb005RestService.searchEdiOdrLastDigChgDtl(compCd, customerNoLegacy, shipToNoLegacy, shippingDateDate, indexList, partNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
    /**
     * <br />異常系テスト
     * <pre>存在しない品目番号を指定</pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchEdiOdrLastDigChgDtl02() throws Exception {
        
        // 入力ドメインの設定
        String customerNoLegacy = "10000000";
        String shipToNoLegacy = "13";
        Date shippingDateDate = DateFormat.getDateInstance().parse("2014/05/05");
        List<String>indexList = new ArrayList<String>();
        String index = "1";
        indexList.add(index);
        List<String>partNoList = new ArrayList<String>();
        partNoList.add("CUS-PARTNO_100000000");
        String compCd = "MYF";
        
        ResultDomain resultDomain = wsb005RestService.searchEdiOdrLastDigChgDtl(compCd, customerNoLegacy, shipToNoLegacy, shippingDateDate, indexList, partNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
