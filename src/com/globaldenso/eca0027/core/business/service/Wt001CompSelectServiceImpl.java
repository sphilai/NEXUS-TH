/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt001CompSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt001CompSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt001CompSelectCriteriaDomain;

/**
 * The search service implementation class of Company Search Sub Screen. <br />
 * 会社選択子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7347 $
 */
public class Wt001CompSelectServiceImpl implements Wt001CompSelectService {

    /**
     * Wt001CompSelectDao
     */
    private Wt001CompSelectDao wt001CompSelectDao;

    /**
     * Default constructor.
     */
    public Wt001CompSelectServiceImpl() {
    }

    /**
     * <p>Setter method for wt001CompSelectDao.</p>
     *
     * @param wt001CompSelectDao Set for wt001CompSelectDao
     */
    public void setWt001CompSelectDao(Wt001CompSelectDao wt001CompSelectDao) {
        this.wt001CompSelectDao = wt001CompSelectDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the company information.
     * 会社情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompCriteriaDomain)
     */
    public List<Wt001CompSelectDomain> searchByConditionForPaging(
        Wt001CompSelectCriteriaDomain criteria) throws ApplicationException {

        // Wild card Replace.
        String compNm = criteria.getCompNm();
        String compNmAbb = criteria.getCompNmAbb();
        if(compNm != null) {
            String escCompNm =
                compNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNm(escCompNm);
        }
        if(compNmAbb != null) {
            String escCompNmAbb =
                compNmAbb.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNmAbb(escCompNmAbb);
        }
        
        List<Wt001CompSelectDomain> resultList = wt001CompSelectDao
        .searchByConditionForPaging(criteria);

        return resultList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search count for the company information.
     * 会社情報の検索結果件数を取得するDAOを呼び出します。
     *  </pre>
     *       
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompCriteriaDomain)
     * 
     */
    public int searchCount(Wt001CompSelectCriteriaDomain criteria) throws ApplicationException {


        // Wild card Replace.
        String compNm = criteria.getCompNm();
        String compNmAbb = criteria.getCompNmAbb();
        
        if(compNm != null) {
            String escCompNm =
                compNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNm(escCompNm);
        }
        if(compNmAbb != null) {
            String escCompNmAbb =
                compNmAbb.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNmAbb(escCompNmAbb);
        }

        return wt001CompSelectDao.searchCount(criteria);
    }

}
