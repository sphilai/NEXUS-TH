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
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The mock class for the Web Call Service (WSB003) <br />
 * Webサービス(WSB003)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB003RestServiceMockImpl implements WsB003RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB003RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB003RestService#searchEdiOdrLastDigChgHdr(String, String, String, String, Date, String, String)
     */
    public ResultDomain searchEdiOdrLastDigChgHdr(
        String compCd,
        String customerNoLegacy, 
        String shipToNoLegacy,
        String transportationCode, 
        Date shippingDate, 
        String partNoOrg,
        String pkgCode) throws ApplicationException {
        
        boolean errFlg = false;
        
        ResultDomain result = new ResultDomain();
        if (!errFlg) {
            result.setResultCode("0");
        } else {
            result.setResultCode("1");
            
            List<ErrorListItemDomain> errList = new ArrayList<ErrorListItemDomain>();
            ErrorListItemDomain err1 = new ErrorListItemDomain();
            err1.setErrorCode("NXS-E7-0035");
            errList.add(err1);
            
            ErrorListItemDomain err2 = new ErrorListItemDomain();
            err2.setErrorCode("NXS-E7-0027");
            errList.add(err2);
            
            ErrorListItemDomain err3 = new ErrorListItemDomain();
            err3.setErrorCode("NXS-E7-0030");
            errList.add(err3);
            
            result.setErrorList(errList);
        }
        
        return result;
    }
}
