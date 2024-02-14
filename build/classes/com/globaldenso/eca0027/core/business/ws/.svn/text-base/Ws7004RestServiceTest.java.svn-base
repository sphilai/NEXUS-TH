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
public class Ws7004RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws7004RestService ws7004RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public Ws7004RestServiceTest() {
        super();
    }

    /**
     * Setter method for ws7004RestService.
     *
     * @param ws7004RestService Set for ws7004RestService
     */
    public void setWs7004RestService(Ws7004RestService ws7004RestService) {
        this.ws7004RestService = ws7004RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws7004RestService = (Ws7004RestService) getContext().getBean("ws7004RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testDeleteShippingAct() throws Exception {
        
        // 入力ドメインの設定
        String invoiceNoDelete = new String();
        invoiceNoDelete = "12346,12347";

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7004RestService.deleteShippingAct(compCd, invoiceNoDelete);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }

    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoDeleteShippingAct() throws Exception {
        
        // 入力ドメインの設定
        String invoiceNoDelete = new String();
        invoiceNoDelete = "XX,YY";

        String compCd = "MYI";
        
        ResultDomain resultDomain = ws7004RestService.deleteShippingAct(compCd, invoiceNoDelete);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
