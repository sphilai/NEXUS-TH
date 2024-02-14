/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.service;

import java.io.File;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;


/**
 * Interface of the service that provides the output function form [Packing Attached(MAIN)].
 * <pre>
 * bean id:l6008ReportService
 * </pre>
 * 
 * @author $Author: DCS $
 */
public interface L6008ReportAsiaService {

    /**
     * Get the form output information to generate a form [Packing Attached (MAIN)].
     * <pre>
     * - The acquisition of fixed image
     *   Call the TmInvTplService.searchByKey (TmInvTplCriteriaDomain) as an argument criteriaDomain.
     * 
     * - Get Invoice Attached data to be printed
     *   Call the RpDocDao.searchPackAtchedForMain (L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain) as an argument criteriaDomain.
     *   Get the number is 0, an error will occur.
     * 
     * - Generation of the form
     *   Call form generation method in argument specification List, header HashMap, template path string, string password, the pdfStream.
     * </pre>
     * 
     * @param shipper search condition
     * @param invoiceNo search condition
     * @param invoiceIssueDt search condition
     * @param invoiceTemplateNo search condition
     * @param formatDate formatDate
     * @param charCd charset
     * @throws ApplicationException application exception
     * @return File file
     */
    public File searchPackAtchedForMain(String shipper, String invoiceNo, Date invoiceIssueDt, String invoiceTemplateNo
        , String formatDate, String charCd) 
        throws ApplicationException;
    
}
