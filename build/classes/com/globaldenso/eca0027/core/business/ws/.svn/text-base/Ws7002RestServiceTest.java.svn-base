/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws7002RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected Ws7002RestService ws7002RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public Ws7002RestServiceTest() {
        super();
    }

    /**
     * Setter method for ws7002RestService.
     *
     * @param ws7002RestService Set for ws7002RestService
     */
    public void setWs7002RestService(Ws7002RestService ws7002RestService) {
        this.ws7002RestService = ws7002RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws7002RestService = (Ws7002RestService) getContext().getBean("ws7002RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetShippingActStat01() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7002ParamItemDomain> paramItemListDomain = new ArrayList<Ws7002ParamItemDomain>();
        Ws7002ParamItemDomain paramItemDomain = new Ws7002ParamItemDomain();
        paramItemDomain.setCustomerNo("2");
        paramItemDomain.setShipToNo("1");
        paramItemDomain.setTransportationCode("1");
        paramItemDomain.setInvoiceNoHeader("1");
        paramItemListDomain.add(paramItemDomain);
        
        Ws7002ParamDomain paramDomain = new Ws7002ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);

        String compCd = "MYF";
        
        Ws7002ResultDomain resultDomain = ws7002RestService.getShippingActStat(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetShippingActStat02() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7002ParamItemDomain> paramItemListDomain = new ArrayList<Ws7002ParamItemDomain>();
        Ws7002ParamItemDomain paramItemDomain = new Ws7002ParamItemDomain();
        paramItemDomain.setCustomerNo("1");
        paramItemDomain.setShipToNo("1");
        paramItemDomain.setTransportationCode("1");
        paramItemDomain.setInvoiceNoHeader("1");
        paramItemListDomain.add(paramItemDomain);
        
        Ws7002ParamDomain paramDomain = new Ws7002ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);

        String compCd = "MYF";
        
        Ws7002ResultDomain resultDomain = ws7002RestService.getShippingActStat(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetShippingActStat() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7002ParamItemDomain> paramItemListDomain = new ArrayList<Ws7002ParamItemDomain>();
        Ws7002ParamItemDomain paramItemDomain = new Ws7002ParamItemDomain();
        paramItemDomain.setCustomerNo("2");
        paramItemDomain.setShipToNo("2");
        paramItemDomain.setTransportationCode("2");
        paramItemDomain.setInvoiceNoHeader("2");
        paramItemListDomain.add(paramItemDomain);
        
        Ws7002ParamDomain paramDomain = new Ws7002ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);

        String compCd = "MYF";
        
        Ws7002ResultDomain resultDomain = ws7002RestService.getShippingActStat(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
