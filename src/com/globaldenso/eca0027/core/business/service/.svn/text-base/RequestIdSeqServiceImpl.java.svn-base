/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RequestIdSeqDao;

/**
 * A "Service" implementation class of "RequestIdSeq"
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 14032 $
 */
public class RequestIdSeqServiceImpl implements RequestIdSeqService {
 
    /**
     * A "Dao" of "requestIdSeq"
     */
    @Autowired
    private RequestIdSeqDao requestIdSeqDao;
 
    /**
     * Default constructor
     */
    public RequestIdSeqServiceImpl() {
    }

    /**
     * Setter method of the Dao of "requestIdSeq"
     * 
     * @param requestIdSeqDao requestIdSeqDao
     */
    public void setRequestIdSeqDao(RequestIdSeqDao requestIdSeqDao) {
        this.requestIdSeqDao = requestIdSeqDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0031.core.auto.business.service.RequestIdSeqService#getNextValue()
     */
    public String getNextValue() throws ApplicationException {
        return requestIdSeqDao.getNextValue();
    }
 
}
