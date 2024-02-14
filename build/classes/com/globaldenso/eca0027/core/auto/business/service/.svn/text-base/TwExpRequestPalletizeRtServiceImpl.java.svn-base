/*
 * PROJECT：eca0027
 * 
 * TwExpRequestPalletizeRt のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/06/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TwExpRequestPalletizeRtDao;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;


/**
 * TwExpRequestPalletizeRt のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/06/08 15:34:03<BR>
 * 
 * テーブル定義から2015/06/08に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TwExpRequestPalletizeRtServiceImpl implements TwExpRequestPalletizeRtService {

    /**
     * twExpRequestPalletizeRtのDAO
     */
    private TwExpRequestPalletizeRtDao twExpRequestPalletizeRtDao;

    /**
     * デフォルトコンストラクタ。
     */
    public TwExpRequestPalletizeRtServiceImpl() {
    }

    /**
     * twExpRequestPalletizeRtのDAOを設定します。
     * 
     * @param twExpRequestPalletizeRtDao twExpRequestPalletizeRtのDao
     */
    public void setTwExpRequestPalletizeRtDao(TwExpRequestPalletizeRtDao twExpRequestPalletizeRtDao) {
        this.twExpRequestPalletizeRtDao = twExpRequestPalletizeRtDao;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public List<TwExpRequestPalletizeRtDomain> searchByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return twExpRequestPalletizeRtDao.searchByCondition(criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#create(java.util.List)
     */
    public void create(List<TwExpRequestPalletizeRtDomain> domains) throws ApplicationException {
        for(TwExpRequestPalletizeRtDomain domain : domains) {
            twExpRequestPalletizeRtDao.create(domain);
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#update(java.util.List)
     */
    public int update(List<TwExpRequestPalletizeRtDomain> domains) throws ApplicationException {
        int updateCount = 0;
        for(TwExpRequestPalletizeRtDomain domain : domains) {
            updateCount += twExpRequestPalletizeRtDao.update(domain);
        }
        return updateCount;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int delete(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return twExpRequestPalletizeRtDao.delete(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#deleteByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public int deleteByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return twExpRequestPalletizeRtDao.deleteByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#searchPkgSetMaterialsNxsCompNm(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public List<TwExpRequestPalletizeRtDomain> searchPkgSetMaterialsNxsCompNm(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return twExpRequestPalletizeRtDao.searchPkgSetMaterialsNxsCompNm(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService#searchJoinPackageMaterialByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain)
     */
    public List<TwExpRequestPalletizeRtDomain> searchJoinPackageMaterialByCondition(TwExpRequestPalletizeRtCriteriaDomain criteria) throws ApplicationException {
        return twExpRequestPalletizeRtDao.searchJoinPackageMaterialByCondition(criteria);
    }
}
