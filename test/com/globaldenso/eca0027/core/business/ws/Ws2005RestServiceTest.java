/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamItemDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2005RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws2005RestService ws2005RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws2005RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws2005RestService.
     *
     * @param ws2005RestService Set for ws2005RestService
     */
    public void setWs2005RestService(Ws2005RestService ws2005RestService) {
        this.ws2005RestService = ws2005RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws2005RestService = (Ws2005RestService) getContext().getBean("ws2005RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCreateRcvOdrAlloc() throws Exception {
        
        // 入力ドメインの設定
        List<Ws2005ParamItemDomain> paramItemListDomain = new ArrayList<Ws2005ParamItemDomain>();
        Ws2005ParamItemDomain paramItemDomain = new Ws2005ParamItemDomain();
        paramItemDomain.setCustomerNo("12345012");
        paramItemDomain.setShipTo("13");
        paramItemDomain.setPN("TEST56789012345");
        paramItemDomain.setTransWayCd("3");
        paramItemDomain.setEtdDueDt("20140415");
        paramItemDomain.setCustomerPoNo("TEST_CORNO_234567890");
        paramItemDomain.setCustomerPn("TEST_CPRTN_234567890");
        paramItemDomain.setOdrCtrlNo("123456");
        paramItemDomain.setCustomerPnOrg("TEST_OCPRT_234567890");
        paramItemDomain.setShipInstrAllocQty("1234567");
        paramItemListDomain.add(paramItemDomain);
        
        Ws2005ParamDomain paramDomain = new Ws2005ParamDomain();
        paramDomain.setNightFlg("Y");
        paramDomain.setDetailList(paramItemListDomain);

        String compCd = "MYF";
        String nightFlg = FLAG_Y;
        
        ResultDomain resultDomain = ws2005RestService.createRcvOdrAlloc(compCd, nightFlg, paramDomain);
        assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoCreateRcvOdrAlloc() throws Exception {
        
        // 入力ドメインの設定
        List<Ws2005ParamItemDomain> paramItemListDomain = new ArrayList<Ws2005ParamItemDomain>();
        Ws2005ParamItemDomain paramItemDomain = new Ws2005ParamItemDomain();
        paramItemDomain.setCustomerNo("12346");
        paramItemDomain.setShipTo("2");
        paramItemDomain.setPN("TEST_PRTNO_001");
        paramItemDomain.setTransWayCd("3");
        paramItemDomain.setEtdDueDt("40415");
        paramItemDomain.setCustomerPoNo("TEST_CORNO_001");
        paramItemDomain.setCustomerPn("TEST_CPRTN_001");
        paramItemDomain.setOdrCtrlNo("4");
        paramItemDomain.setCustomerPnOrg("TEST_OCPRT_001");
        paramItemDomain.setShipInstrAllocQty("1");
        paramItemListDomain.add(paramItemDomain);
        
        Ws2005ParamDomain paramDomain = new Ws2005ParamDomain();
        paramDomain.setNightFlg("Y");
        paramDomain.setDetailList(paramItemListDomain);

        String compCd = "MYF";
        String nightFlg = FLAG_N;
        
        ResultDomain resultDomain = ws2005RestService.createRcvOdrAlloc(compCd, nightFlg, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
