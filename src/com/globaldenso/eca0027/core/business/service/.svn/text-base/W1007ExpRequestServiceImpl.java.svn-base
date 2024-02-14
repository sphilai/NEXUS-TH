/*
 * PROJECT：eca0027
 * 
 * W1007ExpRequest のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;


/**
 * W1007ExpRequest のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/24 15:48:14<BR>
 * 
 * テーブル定義から2558/04/24に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007ExpRequestServiceImpl implements W1007ExpRequestService {

    /**
     * W1007ExpRequestのDAO
     */
    protected W1007ExpRequestDao w1007ExpRequestDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestServiceImpl() {
    }

    /**
     * <p>Setter method for w1007ExpRequestDao.</p>
     *
     * @param expRequestDao Set for w1007ExpRequestDao
     */
    public void setW1007ExpRequestDao(W1007ExpRequestDao expRequestDao) {
        w1007ExpRequestDao = expRequestDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestCriteriaDomain)
     */
    public W1007ExpRequestDomain searchByKey(W1007ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1007ExpRequestDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007ExpRequestService#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDomain)
     */
    public int update(W1007ExpRequestDomain domain) throws ApplicationException {
        return w1007ExpRequestDao.update(domain);
    }


}
