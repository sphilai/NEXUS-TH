/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws7002ResultDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WS7002)
 * <br />Webサービス(WS7002)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws7002RestServiceMockImpl implements Ws7002RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7002RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws7002RestService#getShippingActStat(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws7002ParamDomain)
     */
    public Ws7002ResultDomain getShippingActStat(String compCd, Ws7002ParamDomain param) throws ApplicationException {
        return new Ws7002ResultDomain(WS_RESULT_SUCCESS);
    }

}
