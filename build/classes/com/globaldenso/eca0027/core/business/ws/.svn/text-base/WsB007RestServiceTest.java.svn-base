/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamItemDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB007RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB007RestService wsb007RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB007RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for WsB007RestService.
     *
     * @param WsB007RestService Set for WsB007RestService
     */
    public void setWsB007RestService(WsB007RestService WsB007RestService) {
        this.wsb007RestService = WsB007RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb007RestService = (WsB007RestService) getContext().getBean("wsB007RestService");
    }
    
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testReflectToCusOdr() throws Exception {
//        
//        // 入力ドメインの設定
//        String compCd = "MYF";
//        WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
//        WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
//        List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
//        // 1件目
//        criteriaItemDomain.setCustomerSubsidiaryCode("01");
//        criteriaItemDomain.setTransmissionDate("20140531");
//        criteriaItemDomain.setOrderType("1");
//        criteriaItemDomain.setSerialNo("");
//        criteriaItemDomain.setCustomerNoLegacy("12345678");
//        criteriaItemDomain.setShiptoNoLegacy("12");
//        criteriaItemDomain.setPartNo("PartNo789012345");
//        criteriaItemDomain.setPkgCode("123");
//        criteriaItemDomain.setShippingDueDate("20140605");
//        criteriaItemDomain.setShipInstrAllocQty("1234567");
//        criteriaItemDomain.setShippedQty("1234567");
//        criteriaItemDomain.setNumberOfShipInstr("123");
//        criteriaItemDomain.setOrderQtyOrg("");
//        criteriaItemDomain.setSalesCompanyPoNo("1234567890");
//        criteriaItemDomain.setUpdateType("1");
//        criteriaItemDomain.setOldCustomerDueDate("20140515");
//        criteriaItemDomain.setOldEtdDueDate("20140530");
//        criteriaItemDomain.setOldOrderQty("1234566");
//        criteriaItemDomain.setOldTransportationCode("1");
//        criteriaItemDomain.setOldCustomerPoNo("PoNo5678901234567890");
//        criteriaItemDomain.setOldOrderFirmFlag("1");
//        criteriaItemDomain.setOldCustomerPartNo("NewCustomerPartNo890");
//        criteriaItemDomain.setNewCustomerDueDate("20140515");
//        criteriaItemDomain.setNewEtdDueDate("20140604");
//        criteriaItemDomain.setNewOrderQty("1234567");
//        criteriaItemDomain.setNewTransportationCode("1");
//        criteriaItemDomain.setNewCustomerPoNo("PoNo567890123456789A");
//        criteriaItemDomain.setNewOrderFirmFlag("1");
//        criteriaItemDomain.setNewCustomerPartNo("NewCustomerPartNo89A");
//        criteriaItemList.add(criteriaItemDomain);
//        
//        // 2件目
//        WsB007ParamItemDomain criteriaItemDomain2 = new WsB007ParamItemDomain();
//        criteriaItemDomain2.setCustomerSubsidiaryCode("3");
//        criteriaItemDomain2.setTransmissionDate("20140515");
//        criteriaItemDomain2.setOrderType("1");
//        criteriaItemDomain2.setSerialNo("");
//        criteriaItemDomain2.setCustomerNoLegacy("1");
//        criteriaItemDomain2.setShiptoNoLegacy("1");
//        criteriaItemDomain2.setPartNo("1");
//        criteriaItemDomain2.setPkgCode("1");
//        criteriaItemDomain2.setShippingDueDate("20140515");
//        criteriaItemDomain2.setShipInstrAllocQty("1");
//        criteriaItemDomain2.setShippedQty("1");
//        criteriaItemDomain2.setNumberOfShipInstr("1");
//        criteriaItemDomain2.setOrderQtyOrg("1");
//        criteriaItemDomain2.setSalesCompanyPoNo("1");
//        criteriaItemDomain2.setUpdateType("3");
//        criteriaItemDomain2.setOldCustomerDueDate("20140515");
//        criteriaItemDomain2.setOldEtdDueDate("20140515");
//        criteriaItemDomain2.setOldOrderQty("1");
//        criteriaItemDomain2.setOldTransportationCode("1");
//        criteriaItemDomain2.setOldCustomerPoNo("1");
//        criteriaItemDomain2.setOldOrderFirmFlag("1");
//        criteriaItemDomain2.setOldCustomerPartNo("1");
//        criteriaItemDomain2.setNewCustomerDueDate("20140515");
//        criteriaItemDomain2.setNewEtdDueDate("20140515");
//        criteriaItemDomain2.setNewOrderQty("1");
//        criteriaItemDomain2.setNewTransportationCode("1");
//        criteriaItemDomain2.setNewCustomerPoNo("1");
//        criteriaItemDomain2.setNewOrderFirmFlag("1");
//        criteriaItemDomain2.setNewCustomerPartNo("1");
//        criteriaItemList.add(criteriaItemDomain2);
//        
//        criteriaDomain.setReceivingCompanyCode("12345678901234567890");
//        criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
//        
//        ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
//        assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
//    }
//    
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testNoReflectToCusOdr() throws Exception {
//        
//        // 入力ドメインの設定
//        String compCd = "MYF";
//        WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
//        WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
//        List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
//        criteriaItemDomain.setCustomerSubsidiaryCode("1");
//        criteriaItemDomain.setTransmissionDate("20140515");
//        criteriaItemDomain.setOrderType("1");
//        criteriaItemDomain.setSerialNo("");
//        criteriaItemDomain.setCustomerNoLegacy("1");
//        criteriaItemDomain.setShiptoNoLegacy("1");
//        criteriaItemDomain.setPartNo("1");
//        criteriaItemDomain.setPkgCode("1");
//        criteriaItemDomain.setShippingDueDate("20140515");
//        criteriaItemDomain.setShipInstrAllocQty("1");
//        criteriaItemDomain.setShippedQty("1");
//        criteriaItemDomain.setNumberOfShipInstr("1");
//        criteriaItemDomain.setOrderQtyOrg("1");
//        criteriaItemDomain.setSalesCompanyPoNo("1");
//        criteriaItemDomain.setUpdateType("3");
//        criteriaItemDomain.setOldCustomerDueDate("20140515");
//        criteriaItemDomain.setOldEtdDueDate("20140515");
//        criteriaItemDomain.setOldOrderQty("1");
//        criteriaItemDomain.setOldTransportationCode("1");
//        criteriaItemDomain.setOldCustomerPoNo("1");
//        criteriaItemDomain.setOldOrderFirmFlag("1");
//        criteriaItemDomain.setOldCustomerPartNo("1");
//        criteriaItemDomain.setNewCustomerDueDate("20140515");
//        criteriaItemDomain.setNewEtdDueDate("20140515");
//        criteriaItemDomain.setNewOrderQty("1");
//        criteriaItemDomain.setNewTransportationCode("1");
//        criteriaItemDomain.setNewCustomerPoNo("1");
//        criteriaItemDomain.setNewOrderFirmFlag("1");
//        criteriaItemDomain.setNewCustomerPartNo("1");
//        criteriaItemList.add(criteriaItemDomain);
//        criteriaDomain.setReceivingCompanyCode("1");
//        criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
//        
//        ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
//        assertEquals(WS_RESULT_ERROR_SYSTEM, resultDomain.getResultCode());
//    }
//    
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testReflectToCusOdr2() throws Exception {
//        
//        // 入力ドメインの設定
//        String compCd = "MYF";
//        WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
//        List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
//        
//        String[][] arrList = {
//            {"1", "22345678", "12", "PRTNO6789012345", "20140101", "100", "200", "300", "50000", "SORNO67890", "1", "20140103", "1000000", "CORNO67890123456879A", "CPRTN67890123456879A", "20140103", "0", "CORNO67890123456879A", "Y", "CPRTN67890123456879A"},
//            {"1", "22345678", "12", "PRTNO6789012345", "20140201", "100", "200", "300", "50001", "SORNO67890", "3", "20140203", "1000000", "CORNO67890123456879B", "CPRTN67890123456879B", "20140203", "1000000", "CORNO67890123456879B", "Y", "CPRTN67890123456879B"},
//            {"1", "22345678", "12", "PRTNO6789012345", "20140301", "100", "200", "", "50002", "SORNO67890", "1", "20140303", "1000000", "CORNO67890123456879C", "CPRTN67890123456879C", "20140303", "1000000", "CORNO67890123456879C", "Y", "CPRTN67890123456879C"},
//            {"1", "22345678", "12", "PRTNO6789012345", "20140401", "10", "2", "", "50003", "SORNO67890", "2", "20140403", "1000000", "CORNO67890123456879D", "CPRTN67890123456879D", "20140403", "1000000", "CORNO67890123456879D", "Y", "CPRTN67890123456879D"}
//        };
//
//        criteriaDomain.setReceivingCompanyCode("1234567890123456789A");
//        for(int i = 0; i < arrList.length; i++ ){
//            int j = 0;
//            WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
//            criteriaItemDomain.setOrderType(arrList[i][j++]);
//            criteriaItemDomain.setCustomerNoLegacy(arrList[i][j++]);
//            criteriaItemDomain.setShiptoNoLegacy(arrList[i][j++]);
//            criteriaItemDomain.setPartNo(arrList[i][j++]);
//            criteriaItemDomain.setShippingDueDate(arrList[i][j++]);
//            criteriaItemDomain.setShipInstrAllocQty(arrList[i][j++]);
//            criteriaItemDomain.setShippedQty(arrList[i][j++]);
//            criteriaItemDomain.setNumberOfShipInstr(arrList[i][j++]);
//            criteriaItemDomain.setOrderQtyOrg(arrList[i][j++]);
//            criteriaItemDomain.setSalesCompanyPoNo(arrList[i][j++]);
//            criteriaItemDomain.setUpdateType(arrList[i][j++]);
//            criteriaItemDomain.setOldEtdDueDate(arrList[i][j++]);
//            criteriaItemDomain.setOldOrderQty(arrList[i][j++]);
//            criteriaItemDomain.setOldCustomerPoNo(arrList[i][j++]);
//            criteriaItemDomain.setOldCustomerPartNo(arrList[i][j++]);
//            criteriaItemDomain.setNewEtdDueDate(arrList[i][j++]);
//            criteriaItemDomain.setNewOrderQty(arrList[i][j++]);
//            criteriaItemDomain.setNewCustomerPoNo(arrList[i][j++]);
//            criteriaItemDomain.setNewOrderFirmFlag(arrList[i][j++]);
//            criteriaItemDomain.setNewCustomerPartNo(arrList[i][j++]);
//
//
//            criteriaItemList.add(criteriaItemDomain);
//        }
//
//        criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
//        
//        ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
//        assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
//    }
//  /**
//  * <br />正常系テスト(新規登録)
//  *
//  * @throws Exception エラーが発生した場合
//  */
// @Test
// public void testReflectToCusOdr2() throws Exception {
//     
//     // 入力ドメインの設定
//     String compCd = "MYF";
//     WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
//     List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
//     
//     String[][] arrList = {
//         {"1", "22345678", "12", "PRTNO6789012345", "20140101", "100", "200", "300", "50000", "SORNO67890", "1", "20140103", "1000000", "CORNO67890123456879A", "CPRTN67890123456879A", "20140103", "0", "CORNO67890123456879A", "Y", "CPRTN67890123456879A"}
//     };
//
//     criteriaDomain.setReceivingCompanyCode("1234567890123456789A");
//     for(int i = 0; i < arrList.length; i++ ){
//         int j = 0;
//         WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
//         criteriaItemDomain.setOrderType(arrList[i][j++]);
//         criteriaItemDomain.setCustomerNoLegacy(arrList[i][j++]);
//         criteriaItemDomain.setShiptoNoLegacy(arrList[i][j++]);
//         criteriaItemDomain.setPartNo(arrList[i][j++]);
//         criteriaItemDomain.setShippingDueDate(arrList[i][j++]);
//         criteriaItemDomain.setShipInstrAllocQty(arrList[i][j++]);
//         criteriaItemDomain.setShippedQty(arrList[i][j++]);
//         criteriaItemDomain.setNumberOfShipInstr(arrList[i][j++]);
//         criteriaItemDomain.setOrderQtyOrg(arrList[i][j++]);
//         criteriaItemDomain.setSalesCompanyPoNo(arrList[i][j++]);
//         criteriaItemDomain.setUpdateType(arrList[i][j++]);
//         criteriaItemDomain.setOldEtdDueDate(arrList[i][j++]);
//         criteriaItemDomain.setOldOrderQty(arrList[i][j++]);
//         criteriaItemDomain.setOldCustomerPoNo(arrList[i][j++]);
//         criteriaItemDomain.setOldCustomerPartNo(arrList[i][j++]);
//         criteriaItemDomain.setNewEtdDueDate(arrList[i][j++]);
//         criteriaItemDomain.setNewOrderQty(arrList[i][j++]);
//         criteriaItemDomain.setNewCustomerPoNo(arrList[i][j++]);
//         criteriaItemDomain.setNewOrderFirmFlag(arrList[i][j++]);
//         criteriaItemDomain.setNewCustomerPartNo(arrList[i][j++]);
//
//
//         criteriaItemList.add(criteriaItemDomain);
//     }
//
//     criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
//     
//     ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
//     assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
// }
// /**
//  * <br />正常系テスト(更新NEW=OLD)
//  *
//  * @throws Exception エラーが発生した場合
//  */
// @Test
// public void testReflectToCusOdr2() throws Exception {
//     
//     // 入力ドメインの設定
//     String compCd = "MYF";
//     WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
//     List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
//     
//     String[][] arrList = {
//         {"1", "22345678", "12", "PRTNO6789012345", "20140101", "101", "202", "303", "50001", "SORNO67890", "2", "20140103", "1000001", "CORNO67890123456879A", "CPRTN67890123456879A", "20140103", "1000000", "CORNO67890123456879A", "Y", "CPRTN67890123456879A"}
//     };
//
//     criteriaDomain.setReceivingCompanyCode("1234567890123456789A");
//     for(int i = 0; i < arrList.length; i++ ){
//         int j = 0;
//         WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
//         criteriaItemDomain.setOrderType(arrList[i][j++]);
//         criteriaItemDomain.setCustomerNoLegacy(arrList[i][j++]);
//         criteriaItemDomain.setShiptoNoLegacy(arrList[i][j++]);
//         criteriaItemDomain.setPartNo(arrList[i][j++]);
//         criteriaItemDomain.setShippingDueDate(arrList[i][j++]);
//         criteriaItemDomain.setShipInstrAllocQty(arrList[i][j++]);
//         criteriaItemDomain.setShippedQty(arrList[i][j++]);
//         criteriaItemDomain.setNumberOfShipInstr(arrList[i][j++]);
//         criteriaItemDomain.setOrderQtyOrg(arrList[i][j++]);
//         criteriaItemDomain.setSalesCompanyPoNo(arrList[i][j++]);
//         criteriaItemDomain.setUpdateType(arrList[i][j++]);
//         criteriaItemDomain.setOldEtdDueDate(arrList[i][j++]);
//         criteriaItemDomain.setOldOrderQty(arrList[i][j++]);
//         criteriaItemDomain.setOldCustomerPoNo(arrList[i][j++]);
//         criteriaItemDomain.setOldCustomerPartNo(arrList[i][j++]);
//         criteriaItemDomain.setNewEtdDueDate(arrList[i][j++]);
//         criteriaItemDomain.setNewOrderQty(arrList[i][j++]);
//         criteriaItemDomain.setNewCustomerPoNo(arrList[i][j++]);
//         criteriaItemDomain.setNewOrderFirmFlag(arrList[i][j++]);
//         criteriaItemDomain.setNewCustomerPartNo(arrList[i][j++]);
//
//
//         criteriaItemList.add(criteriaItemDomain);
//     }
//
//     criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
//     
//     ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
//     assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
// }
    /**
    /**
     * <br />正常系テスト(更新NEW<>OLD)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testReflectToCusOdr2() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        WsB007ParamDomain criteriaDomain = new WsB007ParamDomain();
        List<WsB007ParamItemDomain> criteriaItemList = new ArrayList<WsB007ParamItemDomain>();
        
        String[][] arrList = {
            {"1", "22345678", "12", "PRTNO6789012345", "20140101", "101", "202", "303", "50001", "SORNO67890", "2", "20140103", "100", "CORNO67890123456879A", "CPRTN67890123456879A", "20140303", "200", "CORNO67890123456879A", "Y", "CPRTN67890123456879A"}
        };
   
        criteriaDomain.setReceivingCompanyCode("1234567890123456789A");
        for(int i = 0; i < arrList.length; i++ ){
            int j = 0;
            WsB007ParamItemDomain criteriaItemDomain = new WsB007ParamItemDomain();
            criteriaItemDomain.setOrderType(arrList[i][j++]);
            criteriaItemDomain.setCustomerNoLegacy(arrList[i][j++]);
            criteriaItemDomain.setShiptoNoLegacy(arrList[i][j++]);
            criteriaItemDomain.setPartNo(arrList[i][j++]);
            criteriaItemDomain.setShippingDueDate(arrList[i][j++]);
            criteriaItemDomain.setShipInstrAllocQty(arrList[i][j++]);
            criteriaItemDomain.setShippedQty(arrList[i][j++]);
            criteriaItemDomain.setNumberOfShipInstr(arrList[i][j++]);
            criteriaItemDomain.setOrderQtyOrg(arrList[i][j++]);
            criteriaItemDomain.setSalesCompanyPoNo(arrList[i][j++]);
            criteriaItemDomain.setUpdateType(arrList[i][j++]);
            criteriaItemDomain.setOldEtdDueDate(arrList[i][j++]);
            criteriaItemDomain.setOldOrderQty(arrList[i][j++]);
            criteriaItemDomain.setOldCustomerPoNo(arrList[i][j++]);
            criteriaItemDomain.setOldCustomerPartNo(arrList[i][j++]);
            criteriaItemDomain.setNewEtdDueDate(arrList[i][j++]);
            criteriaItemDomain.setNewOrderQty(arrList[i][j++]);
            criteriaItemDomain.setNewCustomerPoNo(arrList[i][j++]);
            criteriaItemDomain.setNewOrderFirmFlag(arrList[i][j++]);
            criteriaItemDomain.setNewCustomerPartNo(arrList[i][j++]);


            criteriaItemList.add(criteriaItemDomain);
        }

        criteriaDomain.setExpRcvOdrUpdateList(criteriaItemList);
        
        ResultDomain resultDomain = wsb007RestService.reflectToCusOdr(compCd, criteriaDomain);
        assertEquals(WS_RESULT_SUCCESS, resultDomain.getResultCode());
    }

}
