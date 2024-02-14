/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB006RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB006RestService wsb006RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB006RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB006RestService.
     *
     * @param WsB006RestService Set for WsB006RestService
     */
    public void setWsB006RestService(WsB006RestService WsB006RestService) {
        this.wsb006RestService = WsB006RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb006RestService = (WsB006RestService) getContext().getBean("wsB006RestService");
    }
    
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testCheckEdiOdrEntry() throws Exception {
//        
//        // 入力ドメインの設定
//        WsB006ParamDomain wsB006ParamDomain = new WsB006ParamDomain();
//        wsB006ParamDomain.setReceivingCompanyCode("MYF");
//        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
//        WsB006ParamItemDomain paramItemDomain = new WsB006ParamItemDomain();
//        paramItemDomain.setCustomerSubsidiaryCode("1");
//        paramItemDomain.setTransmissionDate("20140515");
//        paramItemDomain.setOrderType("1");
//        paramItemDomain.setSerialNo("1");
//        paramItemDomain.setCustomerNoLegacy("1");
//        paramItemDomain.setShiptoNoLegacy("1");
//        paramItemDomain.setCustomerPartNoOrg("1");
//        paramItemDomain.setOrderControlNo("1");
//        paramItemDomain.setRevisionNo("1");
//        paramItemDomain.setRevisionNoEis("1");
//        paramItemDomain.setOrderChangeType("1");
//        paramItemDomain.setCustomerPoNo("1");
//        paramItemDomain.setTransportationCode("1");
//        paramItemDomain.setCustomerDueDate("20140515");
//        paramItemDomain.setEtdDueDate("20140515");
//        paramItemDomain.setOrderFirmFlag("1");
//        paramItemDomain.setOrderQty("1");
//        paramItemDomain.setSupplierCode("1");
//        paramItemDomain.setShippingDueDate("20140415");
//        paramItemDomain.setLevel1ErrorCodeList("1");
//        paramItemDomain.setLevel2ErrorCodeList("1");
//        paramItemDomain.setLevel3ErrorCodeList("1");
//        paramItemDomain.setLevel3WarningCodeList("1");
//        paramItemDomain.setErrorType("1");
//        paramItemList.add(paramItemDomain);
//        wsB006ParamDomain.setOrderEntryDetailList(paramItemList);
//        
//        WsB006ResultDomain resultDomain = wsb006RestService.checkEdiOdrEntry(wsB006ParamDomain);
//        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
//        assertNotNull(resultDomain.getEdiReceivingOrderList());
//        assertEquals(resultDomain.getEdiReceivingOrderList().size() > 0, true);
//    }
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testCheckEdiOdrEntry() throws Exception {
//        
//        // 入力ドメインの設定
//        WsB006ParamDomain wsB006ParamDomain = new WsB006ParamDomain();
//        wsB006ParamDomain.setReceivingCompanyCode("MYI45");
//        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
//        WsB006ParamItemDomain paramItemDomain = new WsB006ParamItemDomain();
//        paramItemDomain.setCustomerSubsidiaryCode("12");
//        paramItemDomain.setTransmissionDate("20140515");
//        paramItemDomain.setOrderType("1");
//        paramItemDomain.setSerialNo("12345");
//        paramItemDomain.setCustomerNoLegacy("12345678");
//        paramItemDomain.setShiptoNoLegacy("34");
//        paramItemDomain.setCustomerPartNoOrg("123456789012345678901234567");
//        paramItemDomain.setOrderControlNo("123456");
//        paramItemDomain.setRevisionNo("56");
//        paramItemDomain.setRevisionNoEis("78");
//        paramItemDomain.setOrderChangeType("1");
//        paramItemDomain.setCustomerPoNo("12345678901234567890");
//        paramItemDomain.setTransportationCode("1");
//        paramItemDomain.setCustomerDueDate("20140515");
//        paramItemDomain.setEtdDueDate("20140515");
//        paramItemDomain.setOrderFirmFlag("N");
//        paramItemDomain.setOrderQty("1234567");
//        paramItemDomain.setSupplierCode("789012");
//        paramItemDomain.setShippingDueDate("20140415");
//        paramItemDomain.setLevel1ErrorCodeList("1");
//        paramItemDomain.setLevel2ErrorCodeList("1");
//        paramItemDomain.setLevel3ErrorCodeList("1");
//        paramItemDomain.setLevel3WarningCodeList("1");
//        paramItemDomain.setErrorType("");
//        paramItemList.add(paramItemDomain);
//        wsB006ParamDomain.setOrderEntryDetailList(paramItemList);
//        
//        WsB006ResultDomain resultDomain = wsb006RestService.checkEdiOdrEntry(wsB006ParamDomain);
//        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
//        assertNotNull(resultDomain.getEdiReceivingOrderList());
//        assertEquals(resultDomain.getEdiReceivingOrderList().size() > 0, true);
//    }
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testCheckEdiOdrEntry02() throws Exception {
//        
//        // 入力ドメインの設定
//        WsB006ParamDomain wsB006ParamDomain = new WsB006ParamDomain();
//        wsB006ParamDomain.setReceivingCompanyCode("MYI");
//        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
//        WsB006ParamItemDomain paramItemDomain = new WsB006ParamItemDomain();
//        paramItemDomain.setCustomerSubsidiaryCode("12");
//        paramItemDomain.setTransmissionDate("20140604");
//        paramItemDomain.setOrderType("1");
//        paramItemDomain.setSerialNo("1");
//        paramItemDomain.setCustomerNoLegacy("30001205");
//        paramItemDomain.setShiptoNoLegacy("12");
//        paramItemDomain.setCustomerPartNoOrg("CUS-PARTNO_100000000");
//        paramItemDomain.setOrderControlNo("123456");
//        paramItemDomain.setRevisionNo("20");
//        paramItemDomain.setRevisionNoEis("21");
//        paramItemDomain.setOrderChangeType("1");
//        paramItemDomain.setCustomerPoNo("12345678901234567890");
//        paramItemDomain.setTransportationCode("1");
//        paramItemDomain.setCustomerDueDate("20140515");
//        paramItemDomain.setEtdDueDate("20140515");
//        paramItemDomain.setOrderFirmFlag("1");
//        paramItemDomain.setOrderQty("1");
//        paramItemDomain.setSupplierCode("1");
//        paramItemDomain.setShippingDueDate("20140415");
//        paramItemDomain.setLevel1ErrorCodeList("1");
//        paramItemDomain.setLevel2ErrorCodeList("1");
//        paramItemDomain.setLevel3ErrorCodeList("1");
//        paramItemDomain.setLevel3WarningCodeList("1");
//        paramItemDomain.setErrorType("");
//        paramItemList.add(paramItemDomain);
//        wsB006ParamDomain.setOrderEntryDetailList(paramItemList);
//        
//        WsB006ResultDomain resultDomain = wsb006RestService.checkEdiOdrEntry(wsB006ParamDomain);
//        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
//        assertNotNull(resultDomain.getEdiReceivingOrderList());
//        assertEquals(resultDomain.getEdiReceivingOrderList().size() > 0, true);
//    }
//    /**
//     * <br />正常系テスト
//     *
//     * @throws Exception エラーが発生した場合
//     */
//    @Test
//    public void testCheckEdiOdrEntry() throws Exception {
//        
//        WsB006ParamDomain wsB006ParamDomain = new WsB006ParamDomain();
//        wsB006ParamDomain.setReceivingCompanyCode("MYF");
//        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
//        WsB006ParamItemDomain paramItemDomain = new WsB006ParamItemDomain();
//        paramItemDomain.setCustomerSubsidiaryCode("1");
//        paramItemDomain.setTransmissionDate("20140515");
//        paramItemDomain.setOrderType("1");
//        paramItemDomain.setSerialNo("1");
//        paramItemDomain.setCustomerNoLegacy("1");
//        paramItemDomain.setShiptoNoLegacy("1");
//        paramItemDomain.setCustomerPartNoOrg("1");
//        paramItemDomain.setOrderControlNo("1");
//        paramItemDomain.setRevisionNo("1");
//        paramItemDomain.setRevisionNoEis("1");
//        paramItemDomain.setOrderChangeType("1");
//        paramItemDomain.setCustomerPoNo("1");
//        paramItemDomain.setTransportationCode("1");
//        paramItemDomain.setCustomerDueDate("20140515");
//        paramItemDomain.setEtdDueDate("20140515");
//        paramItemDomain.setOrderFirmFlag("1");
//        paramItemDomain.setOrderQty("1");
//        paramItemDomain.setSupplierCode("1");
//        paramItemDomain.setShippingDueDate("20140415");
//        paramItemDomain.setLevel1ErrorCodeList("1");
//        paramItemDomain.setLevel2ErrorCodeList("1");
//        paramItemDomain.setLevel3ErrorCodeList("1");
//        paramItemDomain.setLevel3WarningCodeList("1");
//        paramItemDomain.setErrorType("1");
//        paramItemList.add(paramItemDomain);
//        wsB006ParamDomain.setOrderEntryDetailList(paramItemList);
//        
//        WsB006ResultDomain resultDomain = wsb006RestService.checkEdiOdrEntry(wsB006ParamDomain);
//        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
//        assertNotNull(resultDomain.getEdiReceivingOrderList());
//        assertEquals(resultDomain.getEdiReceivingOrderList().size() > 0, true);
//    }
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoCheckEdiOdrEntry() throws Exception {
        
        // 入力ドメインの設定
        WsB006ParamDomain wsB006ParamDomain = new WsB006ParamDomain();
        wsB006ParamDomain.setReceivingCompanyCode("MYJ");
        List<WsB006ParamItemDomain> paramItemList = new ArrayList<WsB006ParamItemDomain>();
        WsB006ParamItemDomain paramItemDomain = new WsB006ParamItemDomain();
        paramItemDomain.setCustomerSubsidiaryCode("1");
        paramItemDomain.setTransmissionDate("20140515");
        paramItemDomain.setOrderType("1");
        paramItemDomain.setSerialNo("1");
        paramItemDomain.setCustomerNoLegacy("1");
        paramItemDomain.setShiptoNoLegacy("1");
        paramItemDomain.setCustomerPartNoOrg("1");
        paramItemDomain.setOrderControlNo("1");
        paramItemDomain.setRevisionNo("1");
        paramItemDomain.setRevisionNoEis("1");
        paramItemDomain.setOrderChangeType("1");
        paramItemDomain.setCustomerPoNo("1");
        paramItemDomain.setTransportationCode("1");
        paramItemDomain.setCustomerDueDate("20140515");
        paramItemDomain.setEtdDueDate("20140515");
        paramItemDomain.setOrderFirmFlag("1");
        paramItemDomain.setOrderQty("1");
        paramItemDomain.setSupplierCode("1");
        paramItemDomain.setShippingDueDate("20140415");
        paramItemDomain.setLevel1ErrorCodeList("1");
        paramItemDomain.setLevel2ErrorCodeList("1");
        paramItemDomain.setLevel3ErrorCodeList("1");
        paramItemDomain.setLevel3WarningCodeList("1");
        paramItemDomain.setErrorType("1");
        paramItemList.add(paramItemDomain);
        wsB006ParamDomain.setOrderEntryDetailList(paramItemList);
        
        WsB006ResultDomain resultDomain = wsb006RestService.checkEdiOdrEntry(wsB006ParamDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
