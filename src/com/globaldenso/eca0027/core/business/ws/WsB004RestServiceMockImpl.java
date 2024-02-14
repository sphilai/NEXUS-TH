/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB004ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The mock class for the Web Call Service (WSB004) <br />
 * Webサービス(WSB004)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB004RestServiceMockImpl implements WsB004RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB004RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB004RestService#searchEdiOdrLastDigChgCandidate(String, String)
     */
    public WsB004ResultDomain searchEdiOdrLastDigChgCandidate(String compCd, String partNo)
        throws ApplicationException {
        
        WsB004ResultDomain wsB004ResultDomain = new WsB004ResultDomain();
        wsB004ResultDomain.setResultCode("0");
        wsB004ResultDomain.setPartList(Arrays.asList("A002TB0091B3N", "A002TB0091B3_-ORG1", "A002TB0091B3_-ORG2", "A002TB0091B3_-ORG3"));
        return wsB004ResultDomain;
    }
}
