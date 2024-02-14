/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws6003RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws6003RestService ws6003RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws6003RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws6003RestService.
     *
     * @param ws6003RestService Set for ws6003RestService
     */
    public void setWs6003RestService(Ws6003RestService ws6003RestService) {
        this.ws6003RestService = ws6003RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws6003RestService = (Ws6003RestService) getContext().getBean("ws6003RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetShippingDocInfo() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String customerNoLegacy = "30001205";
        
        Ws6003ResultDomain resultDomain = ws6003RestService.getShippingDocInfo(compCd, customerNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetShippingDocInfo() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String customerNoLegacy = "99";
        
        Ws6003ResultDomain resultDomain = ws6003RestService.getShippingDocInfo(compCd, customerNoLegacy);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
