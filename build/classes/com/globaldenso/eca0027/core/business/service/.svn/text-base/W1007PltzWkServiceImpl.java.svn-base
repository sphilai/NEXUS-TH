/*
 * PROJECT：eca0027
 * 
 * W1007PltzWk のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/05/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007PltzWkDao;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;

/**
 * W1007PltzWk のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/05/26 15:53:05<BR>
 * 
 * テーブル定義から2558/05/26に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007PltzWkServiceImpl implements W1007PltzWkService {

    /**
     * W1007PltzWkのDAO
     */
    private W1007PltzWkDao w1007PltzWkDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1007PltzWkServiceImpl() {
    }

    
    /**
     * <p>Setter method for w1007PltzWkDao.</p>
     *
     * @param pltzWkDao Set for w1007PltzWkDao
     */
    public void setW1007PltzWkDao(W1007PltzWkDao pltzWkDao) {
        w1007PltzWkDao = pltzWkDao;
    }


    /**
     * Issue 098
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#searchByType(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public List<W1007PltzWkDomain> searchByType(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.searchByType(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public List<W1007PltzWkDomain> searchByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.searchByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#searchJoinByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public List<W1007PltzWkDomain> searchJoinByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.searchJoinByCondition(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#searchCountDistinct(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int searchCountDistinct(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.searchCountDistinct(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int delete(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.delete(criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#searchMaxId()
     */
    public int searchMaxId() throws ApplicationException {
        return w1007PltzWkDao.searchMaxId();
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#create(List<W1007PltzWkDomain> domain)
     */
    public void create(List<W1007PltzWkDomain> domains) throws ApplicationException {
        for(W1007PltzWkDomain domain : domains) {
            w1007PltzWkDao.create(domain);
        }
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnDetailSave(com.globaldenso.eca0027.core.business.domain.criteria.W1008ListDomain)
     */
    public W1007UpdateDomain transactOnDetailSave(W1007UpdateDomain updateDomain)
        throws ApplicationException {
        int count = 0;
        int totalUpdate = 0;
        for (W1007ListDomain w1007Domain : updateDomain.getListDomainList() ) {
            List<W1007PltzWkDomain> domainList = new ArrayList<W1007PltzWkDomain> ();
            if(w1007Domain.isVisibleFlag() && w1007Domain.getPackingStatusCode().equals(NOT_PACKED) && w1007Domain.getPalletNo() != null  ){
                W1007PltzWkCriteriaDomain  criteriaDomain = new W1007PltzWkCriteriaDomain();
                if(w1007Domain.getLineNo() != null) //parent
                {
                    criteriaDomain.setExpRequestNo(w1007Domain.getExpRequestNo());
                    criteriaDomain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId()));
                    criteriaDomain.setLineNo(w1007Domain.getLineNo());
                    criteriaDomain.setPalletNo(w1007Domain.getPalletNo());
                    domainList = w1007PltzWkDao.searchByCondition(criteriaDomain);
                    
                }else // child
                {
                    criteriaDomain.setExpRequestNo(w1007Domain.getExpRequestNo());
                    criteriaDomain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId()));
                    criteriaDomain.setExpRequestKitId(new BigDecimal(w1007Domain.getExpRequestKitId()));
                    criteriaDomain.setKitBrch(w1007Domain.getKitBrch());
                    criteriaDomain.setPalletNo(w1007Domain.getPalletNo());
                    domainList = w1007PltzWkDao.searchByCondition(criteriaDomain);
                    
                }
                if(domainList != null && domainList.size() > 0)//update
                {
                    W1007PltzWkDomain domain = domainList.get(0);
                    if(w1007Domain.getItem() == null)
                    {
                        domain.setKitBrch(null);
                    }else{
                        domain.setKitBrch( new BigDecimal(w1007Domain.getItem()));
                    }
                    domain.setCustomerItemNo(w1007Domain.getCustomerItemNo());
                    domain.setDescription(w1007Domain.getDescription());
                    domain.setComponentItemNo(w1007Domain.getItemNo());
                    domain.setQty(w1007Domain.getQty());
                    domain.setQtyUnit(w1007Domain.getQtyUnit());
                    domain.setComUpdateFuncId(w1007Domain.getScreenId());
                    domain.setComUpdateUserId(w1007Domain.getLoginUserDscId());
                    w1007PltzWkDao.update(domain);
                    totalUpdate++;
                }else{ //add
                    if(w1007Domain.isPalletTempFlag()) // update pallet no  bcz Pallet No is PK so delete old and insert new 
                    {
                        if(w1007Domain.getLineNo() != null) //parent
                        {
                            criteriaDomain.setExpRequestNo(w1007Domain.getExpRequestNo());
                            criteriaDomain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId()));
                            criteriaDomain.setLineNo(w1007Domain.getLineNo());
                            criteriaDomain.setPalletNo(null);
                            List<W1007PltzWkDomain> pltzWkDomainList = w1007PltzWkDao.searchByCondition(criteriaDomain);
                            if(pltzWkDomainList != null && pltzWkDomainList.size() > 0)
                            {
                                for(W1007PltzWkDomain pltzWkDomain : pltzWkDomainList)
                                {
                                    W1007PltzWkCriteriaDomain criteriaNew = new W1007PltzWkCriteriaDomain();
                                    criteriaNew.setPltzWkId(pltzWkDomain.getPltzWkId());
                                    w1007PltzWkDao.delete(criteriaNew);
                                }
                            }
                        }else{ // child
                            criteriaDomain.setExpRequestNo(w1007Domain.getExpRequestNo());
                            criteriaDomain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId()));
                            criteriaDomain.setExpRequestKitId(new BigDecimal(w1007Domain.getExpRequestKitId()));
                            criteriaDomain.setKitBrch(w1007Domain.getKitBrch());
                            criteriaDomain.setPalletNo(null);
                            List<W1007PltzWkDomain> pltzWkDomainList = w1007PltzWkDao.searchByCondition(criteriaDomain);
                            if(pltzWkDomainList != null && pltzWkDomainList.size() > 0)
                            {
                                for(W1007PltzWkDomain pltzWkDomain : pltzWkDomainList)
                                {
                                    W1007PltzWkCriteriaDomain criteriaNew = new W1007PltzWkCriteriaDomain();
                                    criteriaNew.setPltzWkId(pltzWkDomain.getPltzWkId());
                                    w1007PltzWkDao.delete(criteriaNew);
                                }
                            }
                        }
                        
                    }
                    W1007PltzWkDomain domain = new W1007PltzWkDomain();
                    int maxId = w1007PltzWkDao.searchMaxId();
                    domain.setExpRequestNo(w1007Domain.getExpRequestNo());
                    domain.setPltzWkId(new BigDecimal(maxId));
                    if(w1007Domain.getLineNo() != null) //parent
                    {
                        domain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId()));
                        domain.setLineNo(w1007Domain.getLineNo());
                    }else{
                        domain.setExpRequestItemId(new BigDecimal(w1007Domain.getExpRequestItemId())); 
                        domain.setExpRequestKitId(new BigDecimal(w1007Domain.getExpRequestKitId())); 
                        domain.setKitBrch(new BigDecimal(w1007Domain.getItem()));
                    }
                    domain.setNetWeight(w1007Domain.getNetWeight());
                    domain.setPalletNo(w1007Domain.getPalletNo());
                    domain.setCustomerItemNo(w1007Domain.getCustomerItemNo());
                    domain.setDescription(w1007Domain.getDescription());
                    domain.setComponentItemNo(w1007Domain.getItemNo());
                    domain.setQty(w1007Domain.getQty());
                    domain.setQtyUnit(w1007Domain.getQtyUnit());
                    domain.setComCreateFuncId(w1007Domain.getScreenId());
                    domain.setComCreateUserId(w1007Domain.getLoginUserDscId());
                    
                    w1007PltzWkDao.create(domain);
                    updateDomain.getListDomainList().get(count).setPalletTempFlag(true);
                    totalUpdate++;
                }
               
            }
            count++;
        }
        updateDomain.setTotalUpdate(totalUpdate);
        return updateDomain;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.service.W1007PltzWkService#deleteByExpRequestNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int deleteByExpRequestNo(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return w1007PltzWkDao.deleteByExpRequestNo(criteria);
    }

}
