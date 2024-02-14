/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RequestIdSeqDao;


/**
 * A "Dao" implementation class of "RequestIdSeq"
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 14032 $
 */
public class RequestIdSeqDaoImpl extends SqlMapClientDaoSupport implements RequestIdSeqDao {

    /**
     * Default constructor
     */
    public RequestIdSeqDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0031.core.auto.integration.dao.RequestIdSeqDao#getNextValue()
     */
    public String getNextValue() throws ApplicationException {
        return (String)getSqlMapClientTemplate().queryForObject("RequestIdSeq.GetNextValue");
    }

}
