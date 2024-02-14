/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;;


/**
 * This is a DAO implement class of a Packaging Instruction (=Pull).
 * <br />梱包指示のDAO実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6748 $
 */
public class W2001PltzInstrDaoImpl extends SqlMapClientDaoSupport implements W2001PltzInstrDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001PltzInstrDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#searchCountTtPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    public int searchCountTtPltzInstr(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W2001PltzInstr.SearchCountTtPltzInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#searchForPagingTtPltzInstr(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2001PltzInstrDomain> searchForPagingTtPltzInstr(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException {
        return (List<W2001PltzInstrDomain>) getSqlMapClientTemplate()
            .queryForList("W2001PltzInstr.SearchForPagingTtPltzInstr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#searchTtExpRcvOdr(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2001PltzInstrItemDomain> searchTtExpRcvOdr(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException {

        List<W2001PltzInstrItemDomain> result = (List<W2001PltzInstrItemDomain>) getSqlMapClientTemplate()
            .queryForList("W2001PltzInstr.SearchTtExpRcvOdr", criteria);

        if (result.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }

        if (SEARCH_MAX_COUNT < result.size()) {
            Object[] params = {
                result.size(),
                SEARCH_MAX_COUNT
            };
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#searchTtPltzInstrItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W2001PltzInstrDomain searchTtPltzInstrItemNo(W2001PltzInstrCriteriaDomain criteria)
        throws ApplicationException {

        return (W2001PltzInstrDomain) getSqlMapClientTemplate()
            .queryForObject("W2001PltzInstr.SearchTtPltzInstrItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#searchTwPltzInstrItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W2001PltzInstrItemDomain> searchTwPltzInstrItemNo(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException {

        return (List<W2001PltzInstrItemDomain>) getSqlMapClientTemplate()
            .queryForList("W2001PltzInstr.SearchTwPltzInstrItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W2001PltzInstrDao#lockTtExpRcvOdr(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException {

        return (List<TtExpRcvOdrDomain>) getSqlMapClientTemplate()
            .queryForList("W2001PltzInstr.LockTtExpRcvOdr", criteria);
    }

}
