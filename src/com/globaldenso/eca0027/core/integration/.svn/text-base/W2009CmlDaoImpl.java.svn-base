/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.W2009CmlDao;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;

/**
 * This is an implement class of CML DAO.
 * <br />CML DAOの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2009CmlDaoImpl extends SqlMapClientDaoSupport implements W2009CmlDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2009CmlDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#deleteTtPltzItemOnTransReviseRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int deleteTtPltzItemOnTransReviseRegister(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().delete("W2009Cml.DeleteTtPltzItemOnTransReviseRegister", criteria);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#lockTtExpRcvOdr(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(
        TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtExpRcvOdrDomain>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.LockTtExpRcvOdr", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#lockTtPltzInstrOrd(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtPltzInstrOdrDomain> lockTtPltzInstrOrd(
        TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TtPltzInstrOdrDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.LockTtPltzInstrOdr", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTmPkgSetDtl(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTmPkgSetDtl(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTmPkgSetDtl", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTtPltz(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTtPltz(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTtPltz", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTtPltzByCml(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTtPltzByCml(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTtPltzByCml", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTtPltzByMainMarkMixTagNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTtPltzByMainMarkMixTagNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTtPltzByMainMarkMixTagNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searhcCountTtPltzItemOnTransReviseRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searhcCountTtPltzItemOnTransReviseRegister(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearhcCountTtPltzItemOnTransReviseRegister", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTwPltzItemItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTwPltzItemItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTwPltzItemItemNoForLimitNumChkOnCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTwPltzItemItemNoForLimitNumChkOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate",
            criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTwPltzItemItemNoForSingleChkOnCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTwPltzItemItemNoForSingleChkOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTwPltzItemItemNoForSingleChkOnCreate",
            criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchCountTwPltzItemPkg(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchCountTwPltzItemPkg(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchCountTwPltzItemPkg", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchForPagingTtPltz(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchForPagingTtPltz(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (W2009CmlDomain)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchForPagingTtPltz", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchForPagingTtPltzByCml(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlDomain> searchForPagingTtPltzByCml(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlDomain>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchForPagingTtPltzByCml", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchForPagingTwPltzItemPkg(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchForPagingTwPltzItemPkg(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchForPagingTwPltzItemPkg", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchMixTagItemNoOnCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchMixTagItemNoOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchMixTagItemNoOnCreate", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchNonInstructionItemNoOnCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchNonInstructionItemNoOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchNonInstructionItemNoOnCreate",
                criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmCigmaCustomerToXref(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public String searchTmCigmaCustomerToXref(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (String)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTmCigmaCustomerToXref", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmCigmaShipToXref(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public String searchTmCigmaShipToXref(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (String)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTmCigmaShipToXref", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmCigmaWhXrefByAuth(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTmCigmaWhXrefByAuth(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTmCigmaWhXrefByAuth", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmCigmaWhXrefByAuthList(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlDomain> searchTmCigmaWhXrefByAuthList(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<? extends W2009CmlDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTmCigmaWhXrefByAuthList", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmMeasureUnit(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W2009CmlDomain searchTmMeasureUnit(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (W2009CmlDomain)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTmMeasureUnit", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmPkgSetDtl(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTmPkgSetDtl(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTmPkgSetDtl", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmPkgSpecificationDtl(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlDomain> searchTmPkgSpecificationDtl(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlDomain>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTmPkgSpecificationDtl", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmPkgSpecificationDtlByAuto(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTmPkgSpecificationDtlByAuto(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTmPkgSpecificationDtlByAuto",
                criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTmPkgSpecificationDtlByInner(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTmPkgSpecificationDtlByInner(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTmPkgSpecificationDtlByInner",
                criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtMixtagItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtMixtagItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtMixtagItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtMixtagRt(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtMixtagRt(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtMixtagRt", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzByMainMarkMixTagNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W2009CmlDomain searchTtPltzByMainMarkMixTagNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (W2009CmlDomain)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzByMainMarkMixTagNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzByPalletNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public String searchTtPltzByPalletNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (String)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzByPalletNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchTtPltzInstr(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (W2009CmlDomain)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzInstr", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzInstrItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtPltzInstrItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtPltzInstrItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzInstrItemNoByPltzInstrNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchTtPltzInstrItemNoByPltzInstrNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzInstrItemNoByPltzInstrNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzInstrItemNoLockBypltzInstrNoNowait(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzInstrItemNoLockBypltzInstrNoNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate()
            .queryForList(
                "W2009Cml.SearchTtPltzInstrItemNoLockBypltzInstrNoNowait",
                criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzInstrItemNoTransPkg(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtPltzInstrItemNoTransPkg(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtPltzInstrItemNoTransPkg", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemByBrch(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public BigDecimal searchTtPltzItemByBrch(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (BigDecimal)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzItemByBrch", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemByMainMark(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtPltzItemByMainMark(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtPltzItemByMainMark", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemOdrLockByMainMarkNowait(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzItemOdrLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTtPltzItemOdrLockByMainMarkNowait", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemOdr(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlPltzItemOdrDomain> searchTtPltzItemOdr(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlPltzItemOdrDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtPltzItemOdr", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemOdrByPalletNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public Date searchTtPltzItemOdrByPalletNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException {
        return (Date)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTtPltzItemOdrByPalletNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemLockByMainMarkNowait(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzItemLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTtPltzItemLockByMainMarkNowait", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzItemOnTransRevise(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTtPltzItemOnTransRevise(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTtPltzItemOnTransRevise",
                criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTtPltzKanbanLockByMainMarkNowait(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzKanbanLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTtPltzKanbanLockByMainMarkNowait", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTwPltzItemItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlItemDomain> searchTwPltzItemItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<W2009CmlItemDomain>)getSqlMapClientTemplate()
            .queryForList("W2009Cml.SearchTwPltzItemItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTwPltzItemItemNoByBrch(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public BigDecimal searchTwPltzItemItemNoByBrch(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (BigDecimal)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTwPltzItemItemNoByBrch", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTwPltzItemItemNoByDscId(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlDomain> searchTwPltzItemItemNoByDscId(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<? extends W2009CmlDomain>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTwPltzItemItemNoByDscId", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTwPltzItemItemNoForChkOnCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int searchTwPltzItemItemNoForChkOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W2009Cml.SearchTwPltzItemItemNoForChkOnCreate", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchTwPltzItemPkgByDscId(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2009CmlDomain> searchTwPltzItemPkgByDscId(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return (List<? extends W2009CmlDomain>)getSqlMapClientTemplate().queryForList(
            "W2009Cml.SearchTwPltzItemPkgByDscId", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#updateTtPltzInstrStatusByPltzInstrNo(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public int updateTtPltzInstrStatusByPltzInstrNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate().update(
            "W2009Cml.UpdateTtPltzInstrStatusByPltzInstrNo", criteria);
    }

    /**
     * {@inheritDoc}.
     * 
     * UT304 MULTI LABEL ADD 
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#searchOnMultiLabelRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public W2009CmlDomain searchOnMultiLabelRegister(
        W2009CmlCriteriaDomain cmlCriteriaDomain) throws ApplicationException {
        return (W2009CmlDomain)getSqlMapClientTemplate()
            .queryForObject("W2009Cml.SearchOnMultiLabelRegister", cmlCriteriaDomain);
    }

    /**
     * {@inheritDoc}.
     * 
     * UT304 MULTI LABEL ADD
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W2009CmlDao#createTwPltzItemPkgOnMultiLabelRegister(com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain)
     */
    public void createTwPltzItemPkgOnMultiLabelRegister(
        W2009CmlCriteriaDomain cmlCriteriaDomain) throws ApplicationException {

        getSqlMapClientTemplate().insert("W2009Cml.CreateTwPltzItemPkgOnMultiLabelRegister", cmlCriteriaDomain);
    }
}
