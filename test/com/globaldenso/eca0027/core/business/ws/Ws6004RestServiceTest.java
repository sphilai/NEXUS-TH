/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws6004RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws6004RestService ws6004RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws6004RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws6004RestService.
     *
     * @param ws6004RestService Set for ws6004RestService
     */
    public void setWs6004RestService(Ws6004RestService ws6004RestService) {
        this.ws6004RestService = ws6004RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws6004RestService = (Ws6004RestService) getContext().getBean("ws6004RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetSalesPriceInfo() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        Ws6004ParamDomain paramDomain = new Ws6004ParamDomain();
        paramDomain.setCustomerNoLegacy("30001205");
        List<String> listArray = new ArrayList<String>();
        listArray.add("A002TB0091B3N");
        paramDomain.setPartNoList(listArray);
        paramDomain.setDateShipped("20140121");

        Ws6004ResultDomain resultDomain = ws6004RestService.getSalesPriceInfo(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetSalesPriceInfo() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        Ws6004ParamDomain paramDomain = new Ws6004ParamDomain();
        paramDomain.setCustomerNoLegacy("2");
        List<String> listArray = new ArrayList<String>();
        listArray.add("TG123456-7890V0");
        listArray.add("TG123456-7900V0");
        paramDomain.setPartNoList(listArray);
        paramDomain.setDateShipped("20140120");
        
        Ws6004ResultDomain resultDomain = ws6004RestService.getSalesPriceInfo(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
