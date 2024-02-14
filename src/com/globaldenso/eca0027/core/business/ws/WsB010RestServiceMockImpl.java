/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB010ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
/**
 * The mock class for the Web Call Service (WSB010)
 * <br />Webサービス(WSB010)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB010RestServiceMockImpl implements WsB010RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB010RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB010RestService#getCusSubInfo(java.lang.String, java.lang.String)
     */
    public WsB010ResultDomain getCusSubInfo(String compCd, String customerSubsidiaryCode) throws ApplicationException {
        WsB010ResultDomain wsB010ResultDomain = new WsB010ResultDomain();
        
        wsB010ResultDomain.setResultCode(WS_RESULT_SUCCESS);
        wsB010ResultDomain.setSubsidiaryAbbreviation("aaa");
        
        return wsB010ResultDomain;
    }
}
