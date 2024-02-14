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
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultSubItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The mock class for the Web Call Service (WSB005) <br />
 * Webサービス(WSB005)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB005RestServiceMockImpl implements WsB005RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB005RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB005RestService#searchEdiOdrLastDigChgDtl(java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.List, java.util.List)
     */
    public WsB005ResultDomain searchEdiOdrLastDigChgDtl(
        String compCd, 
        String customerNoLegacy, 
        String shipToNoLegacy,
        Date shippingDateDate, 
        List<String> indexList, 
        List<String> partNoList) throws ApplicationException {
        
        WsB005ResultDomain result = new WsB005ResultDomain();
        
        boolean errFlg = false;
        
        if (!errFlg){
            result.setResultCode("0");
            // result.setCustomerPartNo("aaa");

            List<WsB005ResultItemDomain> resultItemList = new ArrayList<WsB005ResultItemDomain>();

            for (String idx : indexList){
                WsB005ResultItemDomain resultItem = new WsB005ResultItemDomain();
                resultItem.setIndex(idx);
                resultItem.setCustomerPartNo("wsB005CustomerItemNo");
                resultItem.setPlantCodeLegacy("PM");
                resultItem.setPartName("wsB005PartName");
                resultItemList.add(resultItem);
            }
            result.setCustomerOrderList(resultItemList);
        } else {
            result.setResultCode("1");
            
            List<WsB005ResultItemDomain> customerOrderList = new ArrayList<WsB005ResultItemDomain>();
            
            WsB005ResultItemDomain customerOrder = new WsB005ResultItemDomain();
            customerOrder.setIndex("0");
            
            List<WsB005ResultSubItemDomain> errorList = new ArrayList<WsB005ResultSubItemDomain>();
            WsB005ResultSubItemDomain error1 = new WsB005ResultSubItemDomain();
            error1.setCode("NXS-E7-0029");
            errorList.add(error1);
            
            WsB005ResultSubItemDomain error2 = new WsB005ResultSubItemDomain();
            error2.setCode("NXS-W1-0002");
            List<String> paramList2 = new ArrayList<String>();
            String param2 = new String("itenNo2");
            paramList2.add(param2);
            error2.setParamList(paramList2);
            errorList.add(error2);
            
            WsB005ResultSubItemDomain error3 = new WsB005ResultSubItemDomain();
            error3.setCode("NXS-E7-0030");
            List<String> paramList3 = new ArrayList<String>();
            String param3 = new String("itenNo3");
            paramList3.add(param3);
            error3.setParamList(paramList3);
            errorList.add(error3);
            
            WsB005ResultSubItemDomain error4 = new WsB005ResultSubItemDomain();
            error4.setCode("NXS-W1-0003");
            List<String> paramList4 = new ArrayList<String>();
            String param4 = new String("itenNo4");
            paramList4.add(param4);
            error4.setParamList(paramList4);
            errorList.add(error4);
            
            customerOrder.setErrorList(errorList);
            customerOrderList.add(customerOrder);
            
            result.setCustomerOrderList(customerOrderList);
        }
        
        return result;
    }
}
