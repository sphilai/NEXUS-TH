/*
 * PROJECT：eca0027
 * 
 * W1006ExpRequest のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;


/**
 * W1006ExpRequest のService実装クラスです。<BR>
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
public class W1006ExpRequestServiceImpl implements W1006ExpRequestService {

    /**
     * W1006ExpRequestのDAO
     */
    protected W1006ExpRequestDao w1006ExpRequestDao;

    /**
     * Constructor
     */
    public W1006ExpRequestServiceImpl() {
    }

    /**
     * <p>Setter method for w1006ExpRequestDao.</p>
     *
     * @param expRequestDao Set for w1006ExpRequestDao
     */
    public void setW1006ExpRequestDao(W1006ExpRequestDao expRequestDao) {
        w1006ExpRequestDao = expRequestDao;
    }

   

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestService#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestCriteriaDomain)
     */
    public W1006ExpRequestDomain searchByKey(W1006ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDao.searchByKey(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1006ExpRequestService#update(com.globaldenso.eca0027.core.auto.business.domain.W1006ExpRequestDomain)
     */
    public int update(W1006ExpRequestDomain domain) throws ApplicationException {
        return w1006ExpRequestDao.update(domain);
    }

    

}
