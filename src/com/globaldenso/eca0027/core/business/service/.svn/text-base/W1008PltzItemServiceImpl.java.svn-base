/*
 * PROJECT：eca0027
 * 
 * W1008PltzItem のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/06/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1008PltzItemDao;
import com.globaldenso.eca0027.core.business.domain.W1008PltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzItemCriteriaDomain;


/**
 * W1008PltzItem のService実装クラスです。<BR>
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
public class W1008PltzItemServiceImpl implements W1008PltzItemService {

    /**
     * W1008PltzItemのDAO
     */
    protected W1008PltzItemDao w1008PltzItemDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1008PltzItemServiceImpl() {
    }

    /**
     * W1008PltzItemのDAOを設定します。
     * 
     * @param w1008PltzItemDao W1008PltzItemDao
     */
    public void setW1008PltzItemDao(W1008PltzItemDao w1008PltzItemDao) {
        this.w1008PltzItemDao = w1008PltzItemDao;
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public List<W1008PltzItemDomain> searchByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzItemDao.searchByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#searchW1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public List<W1008PltzItemDomain> searchW1008ByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzItemDao.searchW1008ByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#create(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzItemDomain)
     */
    public void create(W1008PltzItemDomain domain) throws ApplicationException {
        w1008PltzItemDao.create(domain);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#createList(com.globaldenso.eca0027.core.auto.business.domain.W1008PltzItemDomain)
     */
    public void createList(List<W1008PltzItemDomain> domains) throws ApplicationException {
        for(W1008PltzItemDomain domain : domains) {
            w1008PltzItemDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public int delete(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzItemDao.delete(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#searchSumNoOFBoxByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public List<W1008PltzItemDomain> searchSumNoOFBoxByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzItemDao.searchSumNoOFBoxByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1008PltzItemService#searchRegisterParentCmlW1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1008PltzItemCriteriaDomain)
     */
    public List<W1008PltzItemDomain> searchRegisterParentCmlW1008ByCondition(W1008PltzItemCriteriaDomain criteria) throws ApplicationException {
        return w1008PltzItemDao.searchRegisterParentCmlW1008ByCondition(criteria);
    }
}
