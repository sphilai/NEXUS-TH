/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.W2005MixTagDao;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;

/**
 * This is an implement class of Multiple Item No. in 1Box PKG DAO.
 * <br />小箱内多品DAOの実装クラスです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13648 $
 */
public class W2005MixTagDaoImpl extends SqlMapClientDaoSupport implements W2005MixTagDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2005MixTagDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#lockTtExpRcvOdr(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException{
        return (List<TtExpRcvOdrDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.LockTtExpRcvOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchCountTtMixtag(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    public int searchCountTtMixtag(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W2005MixTag.SearchCountTtMixtag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchForPagingTtMixtag(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagDomain> searchForPagingTtMixtag(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchForPagingTtMixtag", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTmCigmaWhXrefByAuth(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagDomain> searchTmCigmaWhXrefByAuth(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTmCigmaWhXrefByAuth", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTtExpRcvOdr(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagItemDomain> searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagItemDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTtExpRcvOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTtMixtagItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagDomain> searchTtMixtagItemNo(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTtMixtagItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTtMixtagItemNoByActualQtyOver(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagItemDomain> searchTtMixtagItemNoByActualQtyOver(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagItemDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTtMixtagItemNoByActualQtyOver", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTtPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagItemDomain> searchTtPltzInstr(W2005MixTagItemCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagItemDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTtPltzInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTtPltzInstrOnHeaderMoveToCreate(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagDomain> searchTtPltzInstrOnHeaderMoveToCreate(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTtPltzInstrOnHeaderMoveToCreate", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchTwMixtagRt(com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2005MixTagRtDomain> searchTwMixtagRt(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException{
        return (List<W2005MixTagRtDomain>) getSqlMapClientTemplate()
            .queryForList("W2005MixTag.SearchTwMixtagRt", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2005MixTagDao#searchPkgMaterials(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public TmPkgMtrlDomain searchPkgMaterials(TmPkgMtrlCriteriaDomain criteria)
        throws ApplicationException{
        return (TmPkgMtrlDomain)getSqlMapClientTemplate().queryForObject(
            "W2005MixTag.SearchPkgMaterials", criteria);
    }
}
