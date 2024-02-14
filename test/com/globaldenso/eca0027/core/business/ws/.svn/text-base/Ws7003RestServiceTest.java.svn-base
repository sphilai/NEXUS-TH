/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7003ParamItemDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws7003RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected Ws7003RestService ws7003RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public Ws7003RestServiceTest() {
        super();
    }

    /**
     * Setter method for ws7003RestService.
     *
     * @param ws7003RestService Set for ws7003RestService
     */
    public void setWs7003RestService(Ws7003RestService ws7003RestService) {
        this.ws7003RestService = ws7003RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws7003RestService = (Ws7003RestService) getContext().getBean("ws7003RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUpdateShippingAct() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7003ParamItemDomain> paramItemListDomain = new ArrayList<Ws7003ParamItemDomain>();
        Ws7003ParamItemDomain paramItemDomain = new Ws7003ParamItemDomain();
        paramItemDomain.setInvoiceNoHeader("22346");
        paramItemDomain.setCustomerNo("22345");
        paramItemDomain.setShipToNo("12");
        paramItemDomain.setTransportationCode("1");
        paramItemListDomain.add(paramItemDomain);
        
        List<Ws7003ParamItemDomain> DeleteInvoiceListDomain = new ArrayList<Ws7003ParamItemDomain>();
        Ws7003ParamItemDomain DeleteInvoiceDomain = new Ws7003ParamItemDomain();
        DeleteInvoiceDomain.setInvoiceNoHeader("12346");
        DeleteInvoiceDomain.setCustomerNo("12345");
        DeleteInvoiceDomain.setShipToNo("12");
        DeleteInvoiceDomain.setTransportationCode("1");
        DeleteInvoiceDomain.setInvoiceNoDelete("12346");
        DeleteInvoiceListDomain.add(DeleteInvoiceDomain);
        
        Ws7003ParamDomain paramDomain = new Ws7003ParamDomain();
        paramDomain.setDeleteInvoiceList(DeleteInvoiceListDomain);
        paramDomain.setUpdateInvoiceList(paramItemListDomain);
        paramDomain.setVesselName("0000000002");
        paramDomain.setAtd("1");
        paramDomain.setEta("1");
        paramDomain.setStatusFlg("1");

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7003RestService.updateShippingAct(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoUpdateShippingAct() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7003ParamItemDomain> paramItemListDomain = new ArrayList<Ws7003ParamItemDomain>();
        Ws7003ParamItemDomain paramItemDomain = new Ws7003ParamItemDomain();
        paramItemDomain.setInvoiceNoHeader("10");
        paramItemDomain.setCustomerNo("909");
        paramItemDomain.setShipToNo("909");
        paramItemDomain.setTransportationCode("1");
        paramItemListDomain.add(paramItemDomain);
        
        List<Ws7003ParamItemDomain> DeleteInvoiceListDomain = new ArrayList<Ws7003ParamItemDomain>();
        Ws7003ParamItemDomain DeleteInvoiceDomain = new Ws7003ParamItemDomain();
        DeleteInvoiceDomain.setInvoiceNoHeader("15");
        DeleteInvoiceDomain.setCustomerNo("909");
        DeleteInvoiceDomain.setShipToNo("909");
        DeleteInvoiceDomain.setTransportationCode("1");
        DeleteInvoiceDomain.setInvoiceNoDelete("909");
        DeleteInvoiceListDomain.add(DeleteInvoiceDomain);
        
        Ws7003ParamDomain paramDomain = new Ws7003ParamDomain();
        paramDomain.setDeleteInvoiceList(DeleteInvoiceListDomain);
        paramDomain.setUpdateInvoiceList(paramItemListDomain);
        paramDomain.setVesselName("0000000002");
        paramDomain.setAtd("1");
        paramDomain.setEta("1");
        paramDomain.setStatusFlg("1");

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7003RestService.updateShippingAct(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }

}
