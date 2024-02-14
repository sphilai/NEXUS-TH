/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9006NxsShipToMaDao;
import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;

/**
 * The search service implementation class of NEXUS Ship to MA Inquiry Screen.
 * <br />NEXUS Ship to MA Inquiry画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class W9006NxsShipToMaServiceImpl implements W9006NxsShipToMaService {

    /**
     * W9006NxsShipToMaDao
     */
    private W9006NxsShipToMaDao w9006NxsShipToMaDao;

    /**
     * Default constructor.
     */
    public W9006NxsShipToMaServiceImpl() {
    }

    /**
     * <p>
     * Setter method for w9006NxsShipToMaDao.
     * </p>
     * 
     * @param w9006NxsShipToMaDao Set for w9006NxsShipToMaDao
     */
    public void setW9006NxsShipToMaDao(
        W9006NxsShipToMaDao w9006NxsShipToMaDao) {
        this.w9006NxsShipToMaDao = w9006NxsShipToMaDao;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search for the w9006NxsShipToMa information.
     * NEXUS送荷先原単位情報の検索結果を取得するDAOを呼び出します。
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.W9006NxsShipToMaDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.W9006NxsShipToMaCriteriaDomain)
     */
    public List<W9006NxsShipToMaDomain> searchByConditionForPaging(
        W9006NxsShipToMaCriteriaDomain criteria) throws ApplicationException {
        
        // Wild card Replace.
        String shipToNm = criteria.getShipToNm();
        if(shipToNm != null) {
            String escShipToNm =
                shipToNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setShipToNm(escShipToNm);
        }
        
        String shipToNmAbb = criteria.getShipToNmAbb();
        if(shipToNmAbb != null) {
            String escShipToNmAbb =
                shipToNmAbb.replace("%", "[%]").replace("_", "[_]");
            criteria.setShipToNmAbb(escShipToNmAbb);
        }
        
        String compNm = criteria.getCompNm();
        if(compNm != null) {
            String escCompNm =
                compNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNm(escCompNm);
        }
        
        List<W9006NxsShipToMaDomain> resultList = w9006NxsShipToMaDao
            .searchByConditionForPaging(criteria);

        return resultList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the dao to search count for the nexus　Ship　To　Ma information.
     * NEXUS送荷先原単位情報の検索結果件数を取得するDAOを呼び出します。
     * </pre>
     * 
     */
    public int searchCount(W9006NxsShipToMaCriteriaDomain criteria)
        throws ApplicationException {

        // Wild card Replace.
        String shipToNm = criteria.getShipToNm();
        if(shipToNm != null) {
            String escShipToNm =
                shipToNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setShipToNm(escShipToNm);
        }
        
        String shipToNmAbb = criteria.getShipToNmAbb();
        if(shipToNmAbb != null) {
            String escShipToNmAbb =
                shipToNmAbb.replace("%", "[%]").replace("_", "[_]");
            criteria.setShipToNmAbb(escShipToNmAbb);
        }
        
        String compNm = criteria.getCompNm();
        if(compNm != null) {
            String escCompNm =
                compNm.replace("%", "[%]").replace("_", "[_]");
            criteria.setCompNm(escCompNm);
        }
        
        return w9006NxsShipToMaDao.searchCount(criteria);
    }

}
