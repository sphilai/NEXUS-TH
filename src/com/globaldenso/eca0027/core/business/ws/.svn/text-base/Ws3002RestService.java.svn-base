/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3002ParamDomain;

/**
 * <p>Issue Inventory Transaction to CIGMA when Cancel Activate.</p>
 *
 * @author Thalerngsak.P
 * @version 1.00
 */
public interface Ws3002RestService {
    /**
     * Update the sales, orders and stock of CIGMA by using the (WS3002) Web Services
     *
     * @param compCd - COMPANY CODE
     * @param param - Part of specification
     * @return result domain of WS3002
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain transactInvntryByCancel(String compCd, Ws3002ParamDomain param) throws ApplicationException;

}
