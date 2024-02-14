/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The mock class for the Web Call Service (WSB008) <br />
 * Webサービス(WSB008)呼出しサービスのMockクラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB008RestServiceMockImpl implements WsB008RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB008RestServiceMockImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB008RestService#getEdiOdrLincData(java.lang.String, java.lang.String)
     */
    public WsB008ResultDomain getEdiOdrLincData(String receivingCompanyCode, String newLincSubsidiaryCode, String callerJobId)
        throws ApplicationException {
        
        WsB008ResultDomain result = new WsB008ResultDomain();
        
        result.setResultCode("0");
        result.setRcvOdrCompCd("MY5");
        List<WsB008ResultItemDomain> ediReceivingOrderList = new ArrayList<WsB008ResultItemDomain>();
        WsB008ResultItemDomain item = new WsB008ResultItemDomain();
        item.setCustomerCd("MY5");
        item.setTransmissionDt("14/02/14");
        item.setCustomerDueDt("14/02/14");
        item.setOdrTyp("S");
        item.setSerialNo("1");
        item.setCustomerSubsidiaryCd("MY5");
        item.setOdrCtrlNo("99");
        item.setRevisionNo("1");
        item.setRevisionNoEis("2");
        item.setOdrChgTyp("N");
        item.setCustomerPoNo("po");
        item.setTransCd("S");
        item.setCustomerDueDt("14/02/14");
        item.setEtdDueDt("14/02/14");
        item.setOdrFirmFlg("Y");
        item.setOdrQty("100");
        item.setSupplierCd("00");
        ediReceivingOrderList.add(item);
        result.setEdiReceivingOrderList(ediReceivingOrderList);
        return result;
    }
}
