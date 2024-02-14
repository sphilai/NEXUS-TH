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
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDtlKitDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain;


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
public class W1006ExpRequestDtlKitServiceImpl implements W1006ExpRequestDtlKitService {

    /**
     * W1006ExpRequestDtlKitのDAO
     */
    protected W1006ExpRequestDtlKitDao w1006ExpRequestDtlKitDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1006ExpRequestDtlKitServiceImpl() {
    }
    /**
     * <p>Setter method for w1006ExpRequestDtlKitDao.</p>
     *
     * @param expRequestDtlDao Set for w1006ExpRequestDtlKitDao
     */
    public void setW1006ExpRequestDtlKitDao(W1006ExpRequestDtlKitDao expRequestDtlDao) {
        w1006ExpRequestDtlKitDao = expRequestDtlDao;
    }

    /**
     * W1006ExpRequestDtlKitのDAOを設定します。
     * 
     * @param w1006ExpRequestDtlKitDao W1006ExpRequestDtlKitDao
     */
    public void seW1006tExpRequestDtlKitDao(W1006ExpRequestDtlKitDao w1006ExpRequestDtlKitDao) {
        this.w1006ExpRequestDtlKitDao = w1006ExpRequestDtlKitDao;
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlKitService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain)
     */
    public List<W1006ExpRequestDtlKitDomain> searchByCondition(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlKitDao.searchByCondition(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestDtlKitService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain)
     */
    public int searchCount(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlKitDao.searchCount(criteria);
    }


}
