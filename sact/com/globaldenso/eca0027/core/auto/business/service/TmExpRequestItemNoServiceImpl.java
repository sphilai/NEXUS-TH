/*
 * PROJECT：eca0027
 * 
 * TmExpRequestItemNo のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmExpRequestItemNoDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain;


/**
 * TmExpRequestItemNo のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmExpRequestItemNoServiceImpl implements TmExpRequestItemNoService {

    /**
     * tmExpRequestItemNoのDAO
     */
    private TmExpRequestItemNoDao tmExpRequestItemNoDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpRequestItemNoServiceImpl() {
    }

    /**
     * tmExpRequestItemNoのDAOを設定します。
     * 
     * @param tmExpRequestItemNoDao tmExpRequestItemNoのDao
     */
    public void setTmExpRequestItemNoDao(TmExpRequestItemNoDao tmExpRequestItemNoDao) {
        this.tmExpRequestItemNoDao = tmExpRequestItemNoDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public List<TmExpRequestItemNoDomain> searchByCondition(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpRequestItemNoDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public List<TmExpRequestItemNoDomain> searchByConditionForPaging(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpRequestItemNoDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int searchCount(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpRequestItemNoDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#create(com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain)
     */
    public void create(TmExpRequestItemNoDomain domain) throws ApplicationException {
        tmExpRequestItemNoDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#create(java.util.List)
     */
    public void create(List<TmExpRequestItemNoDomain> domains) throws ApplicationException {
        for(TmExpRequestItemNoDomain domain : domains) {
            tmExpRequestItemNoDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TmExpRequestItemNoDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int updateByCondition(TmExpRequestItemNoDomain domain, TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpRequestItemNoDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TmExpRequestItemNoDomain> domains, List<TmExpRequestItemNoCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += tmExpRequestItemNoDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TmExpRequestItemNoService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpRequestItemNoCriteriaDomain)
     */
    public int deleteByCondition(TmExpRequestItemNoCriteriaDomain criteria) throws ApplicationException {
        return tmExpRequestItemNoDao.deleteByCondition(criteria);
    }

}
