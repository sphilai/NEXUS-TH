/*
 * PROJECT：eca0027
 * 
 * W1008Pltz のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/06/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1008PltzDao;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;


/**
 * W1008Pltz のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/06/05 16:25:47<BR>
 * 
 * テーブル定義から2558/06/05に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1008PltzServiceImpl implements W1008PltzService {

    /**
     * W1008PltzのDAO
     */
    protected W1008PltzDao w1008PltzDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1008PltzServiceImpl() {
    }

    /**
     * W1008PltzのDAOを設定します。
     * 
     * @param w1008PltzDao W1008PltzのDao
     */
    public void setW1008PltzDao(W1008PltzDao w1008PltzDao) {
        this.w1008PltzDao = w1008PltzDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public W1008PltzDomain searchByKey(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public List<W1008PltzDomain> searchByCondition(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.searchByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchByPalletNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public List<W1008PltzDomain> searchByPalletNo(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.searchByPalletNo(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchRunningNo()
     */
    public String searchRunningNo() throws ApplicationException {
        return w1008PltzDao.searchRunningNo();
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchCountDistinct(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public int searchCountDistinct(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.searchCountDistinct(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#create(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzDomain)
     */
    public void create(W1008PltzDomain domain) throws ApplicationException {
        w1008PltzDao.create(domain);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public int delete(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.delete(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#searchByConditionWithOuterCD(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzCriteriaDomain)
     */
    public List<W1008PltzDomain> searchByConditionWithOuterCD(W1008PltzCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzDao.searchByConditionWithOuterCD(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzService#update(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzDomain)
     */
    public int update(W1008PltzDomain domain) throws ApplicationException {
        return w1008PltzDao.update(domain);
    }

}
