/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L3001ReportDomain;

/**
 * <br/>The interface class of service that provides [L3001] output function forms.
 * <pre>
 * bean id:l3001ReportService
 * </pre>
 * 
 * @author SNT ku, Chonthicha.A revised
 * @version 2.00
 */
public interface L3001ReportService {

    /**
     * <br/>Generate PDF file for Carry Out List by Item CML
     * <pre>
     * - Create the domain for criteria ofW3TransferCarryOutListService 
     *   and copy the detail from parameter.   
     * - Search data from searchCountCarryOutListByCml method of W3TransferCarryOutListService
     * - Set the current date and time as the printed date
     * - Get/set the result for generating the report
     * - Report generation
     * </pre>
     *
     * @param criteria L3001ReportDomain which contains dscID
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchPrintCarryOutListByCml(L3001ReportDomain criteria) throws ApplicationException;
}
