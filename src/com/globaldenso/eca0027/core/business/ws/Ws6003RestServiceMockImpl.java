/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws6003ResultDomain;

/**
 * The mock class for the Web Call Service (WS6003)
 * <br />Webサービス(WS6003)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws6003RestServiceMockImpl implements Ws6003RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6003RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6003RestService#getShippingDocInfo(java.lang.String, java.lang.String)
     */
    public Ws6003ResultDomain getShippingDocInfo(String compCd, String customerNoLegacy) throws ApplicationException {
        return new Ws6003ResultDomain(WS_RESULT_SUCCESS);
    }
}
