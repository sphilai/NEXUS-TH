/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * The interface of the service that provides the Export Request [] output function form.
 * <br/>帳票【 Export Request 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l1001ReportService
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public interface L1001ReportService {

    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param expRequestNo search condition
     * @param dateFormat format
     * @param langCd string
     * @return File
     * @throws ApplicationException application exception
     */
    public File searchExpRequestApproval(String expRequestNo, String dateFormat, String langCd ) throws ApplicationException;
    
}
