/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WSB020)
 * <br />Webサービス(WSB020)呼出しサービスのMockクラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB020RestServiceMockImpl implements WsB020RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB020RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB020RestService#updateEdiRcvOdrStatus(java.lang.String, java.lang.String)
     */
    public ResultDomain updateEdiRcvOdrStatus(String rcvOdrCompCd, String jobStatus, String callerJobId)
        throws ApplicationException {
        
        return new ResultDomain(WS_RESULT_SUCCESS);
    }
}
