/*
 * PROJECT：eca0027
 * 
 * TwInv のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwInvDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;


/**
 * TwInv のService実装クラスです。<BR>
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
public class TwInvServiceImpl implements TwInvService {

    /**
     * twInvのDAO
     */
    private TwInvDao twInvDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwInvServiceImpl() {
    }

    /**
     * twInvのDAOを設定します。
     * 
     * @param twInvDao twInvのDao
     */
    public void setTwInvDao(TwInvDao twInvDao) {
        this.twInvDao = twInvDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public List<TwInvDomain> searchByCondition(TwInvCriteriaDomain criteria) throws ApplicationException {
        return twInvDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public List<TwInvDomain> searchByConditionForPaging(TwInvCriteriaDomain criteria) throws ApplicationException {
        return twInvDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int searchCount(TwInvCriteriaDomain criteria) throws ApplicationException {
        return twInvDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#create(com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain)
     */
    public void create(TwInvDomain domain) throws ApplicationException {
        twInvDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#create(java.util.List)
     */
    public void create(List<TwInvDomain> domains) throws ApplicationException {
        for(TwInvDomain domain : domains) {
            twInvDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#updateByCondition(com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int updateByCondition(TwInvDomain domain, TwInvCriteriaDomain criteria) throws ApplicationException {
        return twInvDao.updateByCondition(domain, criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#updateByCondition(java.util.List, java.util.List)
     */
    public int updateByCondition(List<TwInvDomain> domains, List<TwInvCriteriaDomain> criterions) throws ApplicationException {
        int updateCount = 0;
        for(int i = 0; i < domains.size(); i++) {
            updateCount += twInvDao.updateByCondition(domains.get(i), criterions.get(i));
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwInvService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwInvCriteriaDomain)
     */
    public int deleteByCondition(TwInvCriteriaDomain criteria) throws ApplicationException {
        return twInvDao.deleteByCondition(criteria);
    }

}
