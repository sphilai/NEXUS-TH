/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * <br/>The interface of service for generate L3003 report.
 * <pre>
 * bean id:l3003ReportService
 * </pre>
 * 
 * @author SNT Ri, Chonthicha.A
 * @version 1.00
 */
public interface L3003ReportService {

    /**
     * Generate PDF file for Transfer Report by CML
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
     * @param trNo trNo for Transfer number
     * @throws ApplicationException application exception
     * @return File
     */
    public File searchTransferReportCml(String trNo) throws ApplicationException;
}
