/*
 * PROJECT：eca0027
 * 
 * W1006ExpRequestDtlKit のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDtlKitDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain;


/**
 * W1006ExpRequestDtlKit のService実装クラスです。<BR>
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
public class W1007ExpRequestDtlKitServiceImpl implements W1007ExpRequestDtlKitService {

    /**
     * W1007ExpRequestDtlKitのDAO
     */
    protected W1007ExpRequestDtlKitDao w1007ExpRequestDtlKitDao;
    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDtlKitServiceImpl() {
    }

    /**
     * <p>Setter method for w1007ExpRequestDtlKitDao.</p>
     *
     * @param expRequestDtlKitDao Set for w1007ExpRequestDtlKitDao
     */
    public void setW1007ExpRequestDtlKitDao(W1007ExpRequestDtlKitDao expRequestDtlKitDao) {
        w1007ExpRequestDtlKitDao = expRequestDtlKitDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlKitService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain)
     */
    public W1007ExpRequestDtlKitDomain searchByKey(W1007ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlKitDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlKitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain)
     */
    public List<W1007ExpRequestDtlKitDomain> searchByCondition(W1007ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDtlKitDao.searchByCondition(criteria);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestDtlKitService#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDtlKitDomain)
     */
    public int update(W1007ExpRequestDtlKitDomain domain) throws ApplicationException {
        return w1007ExpRequestDtlKitDao.update(domain);
    }


}
