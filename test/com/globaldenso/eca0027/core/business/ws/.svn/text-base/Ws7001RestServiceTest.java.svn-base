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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamItemDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws7001RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws7001RestService ws7001RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws7001RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws7001RestService.
     *
     * @param ws7001RestService Set for ws7001RestService
     */
    public void setWs7001RestService(Ws7001RestService ws7001RestService) {
        this.ws7001RestService = ws7001RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws7001RestService = (Ws7001RestService) getContext().getBean("ws7001RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCreateShippingAct001() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7001ParamItemDomain> paramItemListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain paramItemDomain = new Ws7001ParamItemDomain();
        paramItemDomain.setCustomerNo("1");
        paramItemDomain.setShipToNo("1");
        paramItemDomain.setTransportationCode("1");
        paramItemDomain.setInvoiceNoHeader("1");
        paramItemListDomain.add(paramItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfTruckListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfTruckItemDomain = new Ws7001ParamItemDomain();
        DetailOfTruckItemDomain.setInvoiceNoTruck("1");
        DetailOfTruckItemDomain.setTruckNoTruck("1");
        DetailOfTruckListDomain.add(DetailOfTruckItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfPartListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfPartDomain = new Ws7001ParamItemDomain();
        DetailOfPartDomain.setInvoiceNoPart("1");
        DetailOfPartDomain.setTruckNoPart("1");
        DetailOfPartDomain.setContainerNo("1");
        DetailOfPartDomain.setCaseMark("1");
        DetailOfPartDomain.setPartNo("1");
        DetailOfPartDomain.setCustomerPartNo("1");
        DetailOfPartDomain.setCustomerPoNo("1");
        DetailOfPartDomain.setEtd("1");
        DetailOfPartDomain.setCustomerPartNoOrg("1");
        DetailOfPartDomain.setOrderControlNo("1");
        DetailOfPartDomain.setShippedQty("1");
        DetailOfPartDomain.setSalesCompanyPoNo("1");
        DetailOfPartDomain.setShippingLotSize("1");
        DetailOfPartDomain.setPlantCode("1");
        DetailOfPartDomain.setCartonQty("1");
        DetailOfPartListDomain.add(DetailOfPartDomain);
        
        Ws7001ParamDomain paramDomain = new Ws7001ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);
        paramDomain.setShippingFirmDetailList(DetailOfTruckListDomain);
        paramDomain.setItemNoDetailList(DetailOfPartListDomain);
        paramDomain.setVesselName("00000000001");
        paramDomain.setAtd("1");
        paramDomain.setEta("1");
        paramDomain.setStatusFlg("1");

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7001RestService.createShippingAct(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCreateShippingAct002() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7001ParamItemDomain> paramItemListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain paramItemDomain = new Ws7001ParamItemDomain();
        paramItemDomain.setCustomerNo("12345");
        paramItemDomain.setShipToNo("12");
        paramItemDomain.setTransportationCode("1");
        paramItemDomain.setInvoiceNoHeader("12346");
        paramItemListDomain.add(paramItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfTruckListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfTruckItemDomain = new Ws7001ParamItemDomain();
        DetailOfTruckItemDomain.setInvoiceNoTruck("12347");
        DetailOfTruckItemDomain.setTruckNoTruck("0");
        DetailOfTruckListDomain.add(DetailOfTruckItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfPartListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfPartDomain = new Ws7001ParamItemDomain();
        DetailOfPartDomain.setInvoiceNoPart("12348");
        DetailOfPartDomain.setTruckNoPart("0");
        DetailOfPartDomain.setContainerNo("123456789012");
        DetailOfPartDomain.setCaseMark("12345678901234567893");
        DetailOfPartDomain.setPartNo("123456789012345");
        DetailOfPartDomain.setCustomerPartNo("12345678901234567890");
        DetailOfPartDomain.setCustomerPoNo("12345678901234567894");
        DetailOfPartDomain.setEtd("40606");
        DetailOfPartDomain.setCustomerPartNoOrg("12345678901234567891");
        DetailOfPartDomain.setOrderControlNo("12349");
        DetailOfPartDomain.setShippedQty("1234567");
        DetailOfPartDomain.setSalesCompanyPoNo("1");
        DetailOfPartDomain.setShippingLotSize("1");
        DetailOfPartDomain.setPlantCode("1");
        DetailOfPartDomain.setCartonQty("1");
        DetailOfPartListDomain.add(DetailOfPartDomain);
        
        Ws7001ParamDomain paramDomain = new Ws7001ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);
        paramDomain.setShippingFirmDetailList(DetailOfTruckListDomain);
        paramDomain.setItemNoDetailList(DetailOfPartListDomain);
        paramDomain.setVesselName("00000000001");
        paramDomain.setAtd("1");
        paramDomain.setEta("1");
        paramDomain.setStatusFlg("1");

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7001RestService.createShippingAct(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoCreateShippingAct() throws Exception {
        
        // 入力ドメインの設定
        List<Ws7001ParamItemDomain> paramItemListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain paramItemDomain = new Ws7001ParamItemDomain();
        paramItemDomain.setCustomerNo("2");
        paramItemDomain.setShipToNo("2");
        paramItemDomain.setTransportationCode("2");
        paramItemDomain.setInvoiceNoHeader("2");
        paramItemListDomain.add(paramItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfTruckListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfTruckItemDomain = new Ws7001ParamItemDomain();
        DetailOfTruckItemDomain.setInvoiceNoTruck("2");
        DetailOfTruckItemDomain.setTruckNoTruck("2");
        DetailOfTruckListDomain.add(DetailOfTruckItemDomain);
        
        List<Ws7001ParamItemDomain> DetailOfPartListDomain = new ArrayList<Ws7001ParamItemDomain>();
        Ws7001ParamItemDomain DetailOfPartDomain = new Ws7001ParamItemDomain();
        DetailOfPartDomain.setInvoiceNoPart("A");
        DetailOfPartDomain.setTruckNoPart("2");
        DetailOfPartDomain.setContainerNo("A");
        DetailOfPartDomain.setCaseMark("2");
        DetailOfPartDomain.setPartNo("2");
        DetailOfPartDomain.setCustomerPartNo("2");
        DetailOfPartDomain.setCustomerPoNo("2");
        DetailOfPartDomain.setEtd("2");
        DetailOfPartDomain.setCustomerPartNoOrg("2");
        DetailOfPartDomain.setOrderControlNo("2");
        DetailOfPartDomain.setShippedQty("2");
        DetailOfPartDomain.setSalesCompanyPoNo("2");
        DetailOfPartDomain.setShippingLotSize("2");
        DetailOfPartDomain.setPlantCode("2");
        DetailOfPartDomain.setCartonQty("2");
        DetailOfPartListDomain.add(DetailOfPartDomain);
        
        Ws7001ParamDomain paramDomain = new Ws7001ParamDomain();
        paramDomain.setInvoiceDetailList(paramItemListDomain);
        paramDomain.setShippingFirmDetailList(DetailOfTruckListDomain);
        paramDomain.setItemNoDetailList(DetailOfPartListDomain);
        paramDomain.setVesselName("00000000001");
        paramDomain.setAtd("2");
        paramDomain.setEta("2");
        paramDomain.setStatusFlg("2");

        String compCd = "MYF";
        
        ResultDomain resultDomain = ws7001RestService.createShippingAct(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
