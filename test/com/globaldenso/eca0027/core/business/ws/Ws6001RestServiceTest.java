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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamItemDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class Ws6001RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws6001RestService ws6001RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws6001RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws6001RestService.
     *
     * @param ws6001RestService Set for ws6001RestService
     */
    public void setWs6001RestService(Ws6001RestService ws6001RestService) {
        this.ws6001RestService = ws6001RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws6001RestService = (Ws6001RestService) getContext().getBean("ws6001RestService");
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testRegistSalesOdrInvntry02() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        Ws6001ParamDomain paramDomain = new Ws6001ParamDomain();
        paramDomain.setInvoiceNo("300111");
        paramDomain.setCustomerCd("30001205");
        paramDomain.setShipToNo("00");
        paramDomain.setDateOfIssuedDocument("20140611");
        paramDomain.setShippedDate("20140612");
        paramDomain.setEstimatedArrivalDate("20140613");
        paramDomain.setEstimatedArrivalTime("1212");
        paramDomain.setShipToName("Shpnm_189012345678901234567890");
        paramDomain.setShipToAddress1("Shpa1_1890123456789012345");
        paramDomain.setShipToAddress2("Shpa2_1890123456789012345");
        paramDomain.setShipToAddress3("Shpa3_1890123456789012345");
        paramDomain.setShipToCountryCode("S1");
        paramDomain.setNoOfCartons("0");
        paramDomain.setTotalGrossWeight("123456.123");
        paramDomain.setTotalNetWeight("234567.234");
        paramDomain.setWeightUnit("1");
        paramDomain.setWeightUnitonDoc("Doc");
        paramDomain.setTotalVolume("1234567");
        paramDomain.setCarrierName("Carnm_189012345678901234567890");
        paramDomain.setCarrierAddress1("Cara1_1890123456789012345");
        paramDomain.setCarrierAddress2("Cara2_1890123456789012345");
        paramDomain.setCarrierAddress3("Cara3_1890123456789012345");
        paramDomain.setCarrierCountryCode("Ca");
        paramDomain.setSpecialInfomation("Sinfo_189012345678901234567890");
        paramDomain.setSenderName("Sndnm_189012345678901234567890");
        paramDomain.setSenderAddress1("Snda1_1890123456789012345");
        paramDomain.setSenderAddress2("Snda2_1890123456789012345");
        paramDomain.setSenderAddress3("Snda3_1890123456789012345");
        paramDomain.setSenderCountryCode("Sn1");
        paramDomain.setBilingCompanyVatNo("Blvat_189012345");
        paramDomain.setBillingTelNo("Biltl_18901234567890");
        paramDomain.setBillingFaxNo("Bilfx_18901234567890");
        paramDomain.setPaymentTerms("Pytrm_189012345678901234567890");
        paramDomain.setFreightStatus("1");
        paramDomain.setTradeTerms("Trt");
        paramDomain.setDeliveryPoint("Delpt_189012345");
        paramDomain.setPriceTerms("Pr1");
        paramDomain.setBankName("Bnknm_1890123456789012345");
        paramDomain.setBankAddress1("Bnka1_1890123456789012345");
        paramDomain.setBankAddress2("Bnka2_1890123456789012345");
        paramDomain.setBankAddress3("Bnka3_1890123456789012345");
        paramDomain.setBankAccountNo("Bnkno_189012345");
        paramDomain.setInvoiceAuthorizedName("INVNC_18901234567890");
        paramDomain.setInvoiceAuthorizedPosition("INVPT_18901234567890");
        paramDomain.setInvoiceAmount("12345678901.12");
        paramDomain.setInvoiceAmountCurCd3Digit("Z10");
        paramDomain.setTax("12345678901.13");
        paramDomain.setTaxpc("123");
        paramDomain.setInsurance("12345678901.14");
        paramDomain.setFreight("12345678901.15");
        paramDomain.setLibPgm("LibPgm_1");
        paramDomain.setJobDescription("JobDesc_1");
        paramDomain.setJobHost("172.17.0.53");
        paramDomain.setJobUser("JOB_USER");
        paramDomain.setJobPassword("JOB_PASSWORD");
        
        List<Ws6001ParamItemDomain> paramItemDomain = new ArrayList<Ws6001ParamItemDomain>();
        Ws6001ParamItemDomain item = new Ws6001ParamItemDomain();
        item.setPartNo("TG123456-7890V0");
        item.setEtdDueDate("20140615");
        item.setCustomerPoNo("Corno_18901234567890");
        item.setCustomerPartNo("Cprtn_18901234567890");
        item.setInstructedShippingQty("1234567");
        item.setShippedQty("1234568");
        item.setSalesCompanyPoNo("Sorno_1890");
        item.setUnitOfMeasure("U1");
        item.setUnitOfMeasureOnDocument("Un1");
        item.setSalesUnitPrice("1");
        item.setSalesUnitPriceCurCd3Digit("P1");
        item.setCurrentWarehouse("1");
        paramItemDomain.add(item);
        
        paramDomain.setSalesDetailList(paramItemDomain);
        
        ResultDomain resultDomain = ws6001RestService.registSalesOdrInvntry(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
//    @Test
    public void testNoRegistSalesOdrInvntry() throws Exception {
        
        String compCd = "MYF";
        Ws6001ParamDomain paramDomain = new Ws6001ParamDomain();
        paramDomain.setInvoiceNo("300111");
        paramDomain.setCustomerCd("30001205");
        paramDomain.setShipToNo("12");
        paramDomain.setDateOfIssuedDocument("20140611");
        paramDomain.setShippedDate("20140612");
        paramDomain.setEstimatedArrivalDate("20140613");
        paramDomain.setEstimatedArrivalTime("1212");
        paramDomain.setShipToName("Shpnm_189012345678901234567890");
        paramDomain.setShipToAddress1("Shpa1_1890123456789012345");
        paramDomain.setShipToAddress2("Shpa2_1890123456789012345");
        paramDomain.setShipToAddress3("Shpa3_1890123456789012345");
        paramDomain.setShipToCountryCode("S1");
        paramDomain.setNoOfCartons("0");
        paramDomain.setTotalGrossWeight("123456.123");
        paramDomain.setTotalNetWeight("234567.234");
        paramDomain.setWeightUnit("1");
        paramDomain.setWeightUnitonDoc("Doc");
        paramDomain.setTotalVolume("1234567");
        paramDomain.setCarrierName("Carnm_189012345678901234567890");
        paramDomain.setCarrierAddress1("Cara1_1890123456789012345");
        paramDomain.setCarrierAddress2("Cara2_1890123456789012345");
        paramDomain.setCarrierAddress3("Cara3_1890123456789012345");
        paramDomain.setCarrierCountryCode("Ca");
        paramDomain.setSpecialInfomation("Sinfo_189012345678901234567890");
        paramDomain.setSenderName("Sndnm_189012345678901234567890");
        paramDomain.setSenderAddress1("Snda1_1890123456789012345");
        paramDomain.setSenderAddress2("Snda2_1890123456789012345");
        paramDomain.setSenderAddress3("Snda3_1890123456789012345");
        paramDomain.setSenderCountryCode("Sn1");
        paramDomain.setBilingCompanyVatNo("Blvat_189012345");
        paramDomain.setBillingTelNo("Biltl_18901234567890");
        paramDomain.setBillingFaxNo("Bilfx_18901234567890");
        paramDomain.setPaymentTerms("Pytrm_189012345678901234567890");
        paramDomain.setFreightStatus("1");
        paramDomain.setTradeTerms("Trt");
        paramDomain.setDeliveryPoint("Delpt_189012345");
        paramDomain.setPriceTerms("Pr1");
        paramDomain.setBankName("Bnknm_1890123456789012345");
        paramDomain.setBankAddress1("Bnka1_1890123456789012345");
        paramDomain.setBankAddress2("Bnka2_1890123456789012345");
        paramDomain.setBankAddress3("Bnka3_1890123456789012345");
        paramDomain.setBankAccountNo("Bnkno_189012345");
        paramDomain.setInvoiceAuthorizedName("INVNC_18901234567890");
        paramDomain.setInvoiceAuthorizedPosition("INVPT_18901234567890");
        paramDomain.setInvoiceAmount("12345678901.12");
        paramDomain.setInvoiceAmountCurCd3Digit("Z10");
        paramDomain.setTax("12345678901.13");
        paramDomain.setTaxpc("123");
        paramDomain.setInsurance("12345678901.14");
        paramDomain.setFreight("12345678901.15");
        paramDomain.setLibPgm("LibPgm_1");
        paramDomain.setJobDescription("JobDesc_1");
        
        List<Ws6001ParamItemDomain> paramItemDomain = new ArrayList<Ws6001ParamItemDomain>();
        Ws6001ParamItemDomain item = new Ws6001ParamItemDomain();
        item.setPartNo("TG123456-7890V0");
        item.setEtdDueDate("20140615");
        item.setCustomerPoNo("Corno_18901234567890");
        item.setCustomerPartNo("Cprtn_18901234567890");
        item.setInstructedShippingQty("1234567");
        item.setShippedQty("1234568");
        item.setSalesCompanyPoNo("Sorno_1890");
        item.setUnitOfMeasure("U1");
        item.setUnitOfMeasureOnDocument("Un1");
        item.setSalesUnitPrice("1");
        item.setSalesUnitPriceCurCd3Digit("P1");
        item.setCurrentWarehouse("1");
        paramItemDomain.add(item);
        
        paramDomain.setSalesDetailList(paramItemDomain);

        ResultDomain resultDomain = ws6001RestService.registSalesOdrInvntry(compCd, paramDomain);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
