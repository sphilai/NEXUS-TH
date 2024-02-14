/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 20, 2015
 * Development company name:DIAT
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt002CigmaCusNoShipToCriteriaDomain;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author Chaiporn A.
 * @version 1.00
 */
public interface Wt002CigmaCusNoShipToSelectService {
    
    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria
     * @return
     * @throws ApplicationException
     */
    public List<Wt002CigmaCusNoShipToDomain> searchByConditionForPaging(
        Wt002CigmaCusNoShipToCriteriaDomain criteria) throws ApplicationException;
    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param criteria
     * @return
     * @throws ApplicationException
     */
    public int searchCount(Wt002CigmaCusNoShipToCriteriaDomain criteria)
        throws ApplicationException;

}
