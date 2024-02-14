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
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDtlDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain;


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
public class W1006ExpRequestDtlServiceImpl implements W1006ExpRequestDtlService {

    /**
     * W1006ExpRequestDtlのDAO
     */
    protected W1006ExpRequestDtlDao w1006ExpRequestDtlDao;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W1006ExpRequestDtlServiceImpl() {
    }

    /**
     * <p>Setter method for w1006ExpRequestDtlDao.</p>
     *
     * @param expRequestDtlDao Set for w1006ExpRequestDtlDao
     */
    public void setW1006ExpRequestDtlDao(W1006ExpRequestDtlDao expRequestDtlDao) {
        w1006ExpRequestDtlDao = expRequestDtlDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public List<W1006ExpRequestDtlDomain> searchByCondition(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlDao.searchByCondition(criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlService#searchKitByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public List<W1006ExpRequestDtlDomain> searchKitByCondition(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlDao.searchKitByCondition(criteria);
    }
    

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public int searchCount(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlDao.searchCount(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlService#searchCountUnionKit(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public int searchCountUnionKit(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlDao.searchCountUnionKit(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlService#searchByDscId(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain)
     */
    public String searchByDscId(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlDao.searchByDscId(criteria);
    }
}
