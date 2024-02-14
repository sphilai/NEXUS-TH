/*
 * PROJECT：eca0027
 * 
 * TtPltzKanbanExtra のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/02/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzKanbanExtraDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain;


/**
 * TtPltzKanbanExtra のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/02/07 17:12:52<BR>
 * 
 * テーブル定義から2017/02/07に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TtPltzKanbanExtraServiceImpl implements TtPltzKanbanExtraService {

    /**
     * ttPltzKanbanExtraのDAO
     */
    private TtPltzKanbanExtraDao ttPltzKanbanExtraDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TtPltzKanbanExtraServiceImpl() {
    }

    /**
     * ttPltzKanbanExtraのDAOを設定します。
     * 
     * @param ttPltzKanbanExtraDao ttPltzKanbanExtraのDao
     */
    public void setTtPltzKanbanExtraDao(TtPltzKanbanExtraDao ttPltzKanbanExtraDao) {
        this.ttPltzKanbanExtraDao = ttPltzKanbanExtraDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain searchByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public List<TtPltzKanbanExtraDomain> searchByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public List<TtPltzKanbanExtraDomain> searchByConditionForPaging(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int searchCount(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain searchByKeyForChange(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.searchByKeyForChange(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#lockByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain lockByKey(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.lockByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#lockByKeyNoWait(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public TtPltzKanbanExtraDomain lockByKeyNoWait(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.lockByKeyNoWait(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#create(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain)
     */
    public void create(TtPltzKanbanExtraDomain domain) throws ApplicationException {
        ttPltzKanbanExtraDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#create(java.util.List)
     */
    public void create(List<TtPltzKanbanExtraDomain> domains) throws ApplicationException {
        for(TtPltzKanbanExtraDomain domain : domains) {
            ttPltzKanbanExtraDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#update(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain)
     */
    public int update(TtPltzKanbanExtraDomain domain) throws ApplicationException {
        return ttPltzKanbanExtraDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#update(java.util.List)
     */
    public int update(List<TtPltzKanbanExtraDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TtPltzKanbanExtraDomain domain : domains) {
            updateCount += ttPltzKanbanExtraDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanExtraDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int updateByCondition(TtPltzKanbanExtraDomain domain, TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TtPltzKanbanExtraDomain> domains, List<TtPltzKanbanExtraCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += ttPltzKanbanExtraDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int delete(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanExtraService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanExtraCriteriaDomain)
     */
    public int deleteByCondition(TtPltzKanbanExtraCriteriaDomain criteria) throws ApplicationException {
        return ttPltzKanbanExtraDao.deleteByCondition(criteria);
    }

}
