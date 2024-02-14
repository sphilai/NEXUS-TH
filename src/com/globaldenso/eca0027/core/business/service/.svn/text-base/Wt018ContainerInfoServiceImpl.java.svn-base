/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt018ContainerInfoDao;
import com.globaldenso.eca0027.core.business.domain.Wt018ContainerInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt018ContainerInfoCriteriaDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Container Info Sub Screen.
 * <br />コンテナNo情報表示子画面のService実装クラスです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class Wt018ContainerInfoServiceImpl implements Wt018ContainerInfoService {

    /**
     * wt018ContainerInfoDao
     */
    private Wt018ContainerInfoDao wt018ContainerInfoDao;

    /**
     * Default constructor.
     */
    public Wt018ContainerInfoServiceImpl() {
    }
    
    /**
     * <p>wt018ContainerInfoDao のセッターメソッドです。</p>
     *
     * @param wt018ContainerInfoDao wt018ContainerInfoDao に設定する
     */
    public void setWt018ContainerInfoDao(Wt018ContainerInfoDao wt018ContainerInfoDao) {
        this.wt018ContainerInfoDao = wt018ContainerInfoDao;
    }

    /**
     * {@inheritDoc}
     */
    public ArrayList<Wt018ContainerInfoDomain> searchByCondition
    (Wt018ContainerInfoCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt018ContainerInfoCriteriaDomain tableCriteriaDomain = new Wt018ContainerInfoCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);
        
        // Call search service.
        List<Wt018ContainerInfoDomain> tableResultDomainList = 
            wt018ContainerInfoDao.searchByConditionTtShippingFirm(tableCriteriaDomain);

        ArrayList<Wt018ContainerInfoDomain> listDomainList = new ArrayList<Wt018ContainerInfoDomain>();
        if (tableResultDomainList != null) {
            
            for (Wt018ContainerInfoDomain resultDomain : tableResultDomainList) {
                Wt018ContainerInfoDomain listDomain = new Wt018ContainerInfoDomain();
                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }

    /**
     * {@inheritDoc}
     */
    public int searchCount(Wt018ContainerInfoCriteriaDomain criteria) throws ApplicationException {
        
        // Copy from the criteria on screen to a search criteria Domain.
        Wt018ContainerInfoCriteriaDomain tableCriteriaDomain = new Wt018ContainerInfoCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);
        
        return wt018ContainerInfoDao.searchCountTtShippingFirm(tableCriteriaDomain);
    }
}
