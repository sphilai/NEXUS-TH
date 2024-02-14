/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;


import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;

/**
 * The mock class for the Web Call Service (WS2005) <br />
 * Webサービス(WS2005)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2005RestServiceMockImpl implements Ws2005RestService {

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2005RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws2005RestService#createRcvOdrAlloc(java.lang.String, java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain)
     */
    public ResultDomain createRcvOdrAlloc(String compCd, String nightFlg, Ws2005ParamDomain ws2005ParamDomain) 
        throws ApplicationException {
        return new ResultDomain(WS_RESULT_SUCCESS);
    }

}
