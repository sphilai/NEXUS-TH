/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * <br/>The interface of service for generate L3004 report.
 * <pre>
 * bean id:l3004ReportService
 * </pre>
 * 
 * @author SNT Ri, Chonthicha.A
 * @version 1.00
 */
public interface L3004ReportService {

    /**
     * Generate PDF file for Transfer Report by Item Number
     * 
     * <pre>
     * - Create the domain for sact criteria with the parameter
     * - Call the searching method from sact service
     * - Get the printed date
     * - Generate QR code
     * - Get/set the result for generating the report
     * - Report generation
     * </pre>
     * 
     * @param trNo String  
     * @throws ApplicationException Application exception
     * @return File stream
     * @throws ApplicationException exception
     */
    public File searchTransferReportItemNo(String trNo) throws ApplicationException;
}
