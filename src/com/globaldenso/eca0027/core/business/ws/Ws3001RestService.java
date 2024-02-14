/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamDomain;

/**
 * Issue Inventory Transaction to CIGMA when Activate
 * 
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
public interface Ws3001RestService {

    /**
     * <p>Insert inventory transaction into CIGMA Database by using WebService(WS3001)</p>
     *
     * @param compCd shipper code to get CIGMA Company Code
     * @param ws3001ParamDomain Ws3001ParamDomain
     * @return ResultDomain
     * @throws ApplicationException ApplicationException
     */
    public ResultDomain createRegisterInventoryTransaction(String compCd, Ws3001ParamDomain ws3001ParamDomain) throws ApplicationException;

}
