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
import com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WSB006)
 * <br />Webサービス(WSB006)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
public class WsB006RestServiceMockImpl implements WsB006RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB006RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB006RestService#checkEdiOdrEntry(com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain)
     */
    public WsB006ResultDomain checkEdiOdrEntry(WsB006ParamDomain param) throws ApplicationException {
        List<WsB006ResultItemDomain> resultItemList = new ArrayList<WsB006ResultItemDomain>();
        
        for (WsB006ParamItemDomain paramItem : param.getOrderEntryDetailList()) {
            WsB006ResultItemDomain resultItem = new WsB006ResultItemDomain();
            
            CommonUtil.copyProperties(resultItem, paramItem, null);

            resultItem.setCustomerSubsidiaryCode(paramItem.getCustomerSubsidiaryCode());
            
            resultItem.setPartNo("A002TB0091B03N");
            resultItem.setPkgCode("");
            resultItem.setPartName("HOSE, WATER");
            resultItem.setPlantCodeLegacy("M1");
            
            resultItem.setShippingDueDate("20140502");
            
            resultItemList.add(resultItem);
        }
        
        WsB006ResultDomain result = new WsB006ResultDomain(WS_RESULT_SUCCESS);
        result.setReceivingCompanyCode(param.getReceivingCompanyCode());
        result.setEdiReceivingOrderList(resultItemList);
        
        return result;
    }
}
