/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 27, 2015
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt002CigmaCusNoSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt002CigmaCusNoShipToCriteriaDomain;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author XXXXXXXXXXX
 * @version 1.00
 */
public class Wt002CigmaCusNoShipToSelectServiceImpl implements Wt002CigmaCusNoShipToSelectService {
    
    /**
     * <p>wt001CompSelectDao service</p>
     */
    private Wt002CigmaCusNoSelectDao wt002CigmaCusNoSelectDao;
    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Wt002CigmaCusNoShipToSelectServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    /**
     * <p>Setter method for wt002CigmaCusNoSelectDao.</p>
     *
     * @param wt002CigmaCusNoSelectDao Set for wt002CigmaCusNoSelectDao
     */
    public void setWt002CigmaCusNoSelectDao(Wt002CigmaCusNoSelectDao wt002CigmaCusNoSelectDao) {
        this.wt002CigmaCusNoSelectDao = wt002CigmaCusNoSelectDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.Wt002CigmaCusNoShipToSelectService#searchByConditionForPaging(com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToCriteriaDomain)
     */

    public List<Wt002CigmaCusNoShipToDomain> searchByConditionForPaging(
        Wt002CigmaCusNoShipToCriteriaDomain criteria) throws ApplicationException { 
        return wt002CigmaCusNoSelectDao.searchByConditionForPaging(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.Wt002CigmaCusNoShipToSelectService#searchCount(com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToCriteriaDomain)
     */

    public int searchCount(Wt002CigmaCusNoShipToCriteriaDomain criteria)
        throws ApplicationException {
        return wt002CigmaCusNoSelectDao.searchCount(criteria);
    }

}
