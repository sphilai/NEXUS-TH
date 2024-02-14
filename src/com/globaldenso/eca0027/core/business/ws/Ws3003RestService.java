/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;

/**
 * Query Inventory Information to CIGMA.
 * 
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
public interface Ws3003RestService {

      
    /**
     * <p>Ws3003 CIGMA inventory Rest Service</p>
     *
     * @param compCd String
     * @param ws3003ParamDomain Ws3003ParamDomain
     * @return Ws3003ResultDomain
     * @throws ApplicationException ApplicationException
     */
    public Ws3003ResultDomain getCigmaInventoryFromWs(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException; 

}