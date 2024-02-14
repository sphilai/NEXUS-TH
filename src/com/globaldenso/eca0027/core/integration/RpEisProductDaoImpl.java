/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.RpEisProductDao;
import com.globaldenso.eca0027.core.business.domain.L1008TtPltzItemByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2001TtPltzInstrItemNoBySumBoxQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzBySingleDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L1008TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of L2000 series.<br.>
 * L2000番台の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 12983 $
 */
public class RpEisProductDaoImpl extends SqlMapClientDaoSupport implements RpEisProductDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpEisProductDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzInstrItemNoBySumBoxQty(com.globaldenso.eca0027.core.business.domain.criteria.L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2001TtPltzInstrItemNoBySumBoxQtyDomain> searchTtPltzInstrItemNoBySumBoxQty(L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain criteria) throws ApplicationException {
        return (List<L2001TtPltzInstrItemNoBySumBoxQtyDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzInstrItemNoBySumBoxQty", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2003TtPltzItemByItemNoDomain> searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<L2003TtPltzItemByItemNoDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzItemByPltzInstrNo", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzBySingle(com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2003TtPltzBySingleDomain> searchTtPltzBySingle(L2003TtPltzBySingleCriteriaDomain criteria) throws ApplicationException {
        return (List<L2003TtPltzBySingleDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzBySingle", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2003TtPltzItemByDetailDomain> searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException {
        return (List<L2003TtPltzItemByDetailDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzItemByDetail", criteria);
    }

 // NL012 DEL START
//  // A.Chonthicha: Total number of box
//  /**
//   * {@inheritDoc}
//   * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemForTotalNoOfBox(L2003TtPltzItemByDetailCriteriaDomain)
//   */
//  @SuppressWarnings("unchecked")
//  public int searchTtPltzItemForTotalNoOfBox(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException{
//      return (Integer)getSqlMapClientTemplate().queryForObject("RpEisProduct.SearchTtPltzItemForTotalNoOfBox", criteria);
//  }
//
//  // NL009 MERGE START
//  // A.Chonthicha: Total number of box for manual registration
//  /**
//   * {@inheritDoc}
//   * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemForTotalNoOfBoxOfManualRegist(L2003TtPltzItemByDetailCriteriaDomain)
//   */
//  @SuppressWarnings("unchecked")
//  public int searchTtPltzItemForTotalNoOfBoxOfManualRegist(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException{
//      return (Integer)getSqlMapClientTemplate().queryForObject("RpEisProduct.SearchTtPltzItemForTotalNoOfBoxOfManualRegist", criteria);
//  }
//  // NL009 MERGE END
//NL012 DEL END
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemByDetail(L1008TtPltzItemByDetailCriteriaDomain)
     */
    public TmExpShipToShippingDomain searchExpShipToShippingMa(TmExpShipToShippingCriteriaDomain criteria) throws ApplicationException {
    	TmExpShipToShippingDomain resultDomain = (TmExpShipToShippingDomain)getSqlMapClientTemplate().queryForObject("RpEisProduct.SearchExpShipToShippingMa", criteria);
        return resultDomain;
    }
    @SuppressWarnings("unchecked")
    public List<L1008TtPltzItemByDetailDomain> searchTtPltzItemL1008ByDetail(L1008TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException {
    	return (List<L1008TtPltzItemByDetailDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzItemL1008ByDetail", criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzBySingle(com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2003TtPltzBySingleDomain> searchTtPltzL1008BySingle(L2003TtPltzBySingleCriteriaDomain criteria) throws ApplicationException {
        return (List<L2003TtPltzBySingleDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzL1008BySingle", criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemW1008ByPltzInstrNo(com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L2003TtPltzItemByItemNoDomain> searchTtPltzItemW1008ByPltzInstrNo(L2003TtPltzItemByItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<L2003TtPltzItemByItemNoDomain>) getSqlMapClientTemplate().queryForList("RpEisProduct.SearchTtPltzItemW1008ByPltzInstrNo", criteria);
    }
 // NL012 DEL START
//  // A.Chonthicha: Total number of box
//  /**
//   * {@inheritDoc}
//   * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemForTotalNoOfBox(L2003TtPltzItemByDetailCriteriaDomain)
//   */
//  @SuppressWarnings("unchecked")
//  public int searchTtPltzItemForTotalNoOfBox(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException{
//      return (Integer)getSqlMapClientTemplate().queryForObject("RpEisProduct.SearchTtPltzItemForTotalNoOfBox", criteria);
//  }
//
//  // NL009 MERGE START
//  // A.Chonthicha: Total number of box for manual registration
//  /**
//   * {@inheritDoc}
//   * @see com.globaldenso.eca0027.core.business.dao.RpEisProductDao#searchTtPltzItemForTotalNoOfBoxOfManualRegist(L2003TtPltzItemByDetailCriteriaDomain)
//   */
//  @SuppressWarnings("unchecked")
//  public int searchTtPltzItemForTotalNoOfBoxOfManualRegist(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException{
//      return (Integer)getSqlMapClientTemplate().queryForObject("RpEisProduct.SearchTtPltzItemForTotalNoOfBoxOfManualRegist", criteria);
//  }
//  // NL009 MERGE END
//NL012 DEL END
}