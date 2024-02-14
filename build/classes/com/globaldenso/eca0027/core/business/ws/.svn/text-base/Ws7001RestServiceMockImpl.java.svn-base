/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WS7001)
 * <br />Webサービス(WS7001)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws7001RestServiceMockImpl implements Ws7001RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7001RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws7001RestService#createShippingAct(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws7001ParamDomain)
     */
    public ResultDomain createShippingAct(String compCd, Ws7001ParamDomain param) throws ApplicationException {
        return new ResultDomain(WS_RESULT_SUCCESS);
    }

}
