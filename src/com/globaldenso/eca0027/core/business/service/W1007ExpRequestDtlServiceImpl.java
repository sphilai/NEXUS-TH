/*
 * PROJECT：eca0027
 * 
 * TtExpRequestDtl のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDtlDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain;


/**
 * TtExpRequestDtl のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/28 16:15:38<BR>
 * 
 * テーブル定義から2558/04/28に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007ExpRequestDtlServiceImpl implements W1007ExpRequestDtlService {

    /**
     * W1007ExpRequestDtlのDAO
     */
    protected W1007ExpRequestDtlDao w1007ExpRequestDtlDao;
    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDtlServiceImpl() {
    }

    /**
     * <p>Setter method for w1007ExpRequestDtlDao.</p>
     *
     * @param expRequestDtlDao Set for w1007ExpRequestDtlDao
     */
    public void setW1007ExpRequestDtlDao(W1007ExpRequestDtlDao expRequestDtlDao) {
        w1007ExpRequestDtlDao = expRequestDtlDao;
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public W1007ExpRequestDtlDomain searchByKey(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlDao.searchByKey(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public List<W1007ExpRequestDtlDomain> searchByCondition(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlService#searchParentKitByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public List<W1007ExpRequestDtlDomain> searchParentKitByCondition(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlDao.searchParentKitByCondition(criteria);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlService#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDtlDomain)
     */
    public int update(W1007ExpRequestDtlDomain domain) throws ApplicationException {
        return w1007ExpRequestDtlDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain)
     */
    public int searchCount(W1007ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlDao.searchCount(criteria);
    }


}
