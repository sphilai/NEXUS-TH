/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;

/**
 * The interface of the service that provides the Export Request [] output function form.
 * <br/>帳票【 Export Request 】出力機能を提供するサービスのインターフェースです。
 * <pre>
 * bean id:l1003ReportService
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public interface L1003ReportService {

    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param w1006UpdateDomain W1006UpdateDomain
     * @param dateFormat format
     * @return File
     * @throws ApplicationException application exception
     */
    public File searchExpRequestIdTag(W1006UpdateDomain w1006UpdateDomain, String dateFormat) throws ApplicationException;
    
}
