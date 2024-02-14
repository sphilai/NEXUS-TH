/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 29, 2015
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToDomain;
import com.globaldenso.eca0027.core.business.domain.Wt002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt002ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt002CigmaCusNoShipToCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt002CigmaCusNoShipToSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author XXXXXXXXXXX
 * @version 1.00
 */
public class Wt002SearchFacadeServiceImpl extends AbstractSearchFacadeService <List<Wt002ListDomain>, Wt002CriteriaDomain>{

    /** Validated property name of search condition. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {
        "shipperCd", "customerCd", "shipToAbb", "shipToNm"};
    
    /**
     * <p>Type in the role of the field.</p>
     */
    private Wt002CigmaCusNoShipToSelectService wt002CigmaCusNoShipToSelectService;
    
    /**
     * <p>Setter method for wt002CigmaCusNoShipToSelectService.</p>
     *
     * @param wt002CigmaCusNoShipToSelectService Set for wt002CigmaCusNoShipToSelectService
     */
    public void setWt002CigmaCusNoShipToSelectService(
        Wt002CigmaCusNoShipToSelectService wt002CigmaCusNoShipToSelectService) {
        this.wt002CigmaCusNoShipToSelectService = wt002CigmaCusNoShipToSelectService;
    }

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Wt002SearchFacadeServiceImpl() {
    }

    @Override
    protected Wt002CriteriaDomain filterDomain(Wt002CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    @Override
    protected void validateConsistency(Wt002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    @Override
    protected void validateDatabase(Wt002CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    @Override
    protected void validateItems(Wt002CriteriaDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        // Validate search criteria.
        Validator<Wt002CriteriaDomain> valid = new Validator<Wt002CriteriaDomain>(filterDomain,
            "wt002CriteriaDomain");
        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT002);
        // check error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    @Override
    protected List<Wt002ListDomain> callServices(Wt002CriteriaDomain filterDomain)
        throws GscmApplicationException, ApplicationException {

        Wt002CigmaCusNoShipToCriteriaDomain criteria = new Wt002CigmaCusNoShipToCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(criteria, filterDomain);

        int resultCount = wt002CigmaCusNoShipToSelectService.searchCount(criteria);
        
     // Calculate paging information.
        PageInfoCreator creator = filterDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        criteria.setRowNumFrom(pageInfo.getFromCount());
        criteria.setRowNumTo(pageInfo.getToCount());
        
        List <Wt002CigmaCusNoShipToDomain> resultList = wt002CigmaCusNoShipToSelectService.searchByConditionForPaging(criteria);
        
        List<Wt002ListDomain> listDomainList = new ArrayList<Wt002ListDomain>();
        if (listDomainList != null){
            for (Wt002CigmaCusNoShipToDomain resultDomain : resultList){
                Wt002ListDomain wt002Domain = new Wt002ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(wt002Domain, resultDomain);
                
                listDomainList.add(wt002Domain);
            }
        }
        return listDomainList;
    }
}
