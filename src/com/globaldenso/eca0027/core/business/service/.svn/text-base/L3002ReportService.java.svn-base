/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L3002ReportDomain;

/**
 * <br/>The interface of service for generate L3002 report.
 * <pre>
 * bean id:l3002ReportService
 * </pre>
 * 
 * @author TIS Tanaka, Chonthicha.A
 * @version 1.00
 */
public interface L3002ReportService {

    /**
     * <br/>Generate PDF file for Carry Out List by Item Number
     * <pre>
     * - Create the domain for criteria ofW3TransferCarryOutListService 
     *   and copy the detail from parameter.   
     * - Search data from searchPrintCarryOutListByItemNo method of W3TransferCarryOutListService
     * - Set the current date and time as the printed date.
     * - Set company and warehouse code from parameter to be company code and warehouse code at the top of report.
     * - Get/set the result for generating the report
     * - Report generation
     * </pre>
     *
     * @param l3002ReportDomain L3002ReportDomain
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchCarryOutListItemNo(L3002ReportDomain l3002ReportDomain) throws ApplicationException;
    
}
