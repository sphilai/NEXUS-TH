/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6004ResultDomain;

/**
 * The mock class for the Web Call Service (WS6004)
 * <br />Webサービス(WS6004)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws6004RestServiceMockImpl implements Ws6004RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6004RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6004RestService#getSalesPriceInfo(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws6004ParamDomain)
     */
    public Ws6004ResultDomain getSalesPriceInfo(String compCd, Ws6004ParamDomain param) throws ApplicationException {
        return new Ws6004ResultDomain(WS_RESULT_SUCCESS);
    }
}
