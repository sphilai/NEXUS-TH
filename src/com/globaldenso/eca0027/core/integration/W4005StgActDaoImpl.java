/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAIN_MARK_TYP_MAIN_MARK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W4005StgActDao;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;

/**
 * Interface of the DAO to access the Staging Actuality
 * <br />山作り実績へアクセスするDAOの実装クラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W4005StgActDaoImpl extends SqlMapClientDaoSupport implements W4005StgActDao {

    /**
     * constructor.
     */
    public W4005StgActDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(
        W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4005StgAct.SearchCountForPagingOnMainSearch", stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005StgActDomain> searchForPagingOnMainSearch(
        W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return (List<W4005StgActDomain>) getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchForPagingOnMainSearch", stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(
        W4005PltzCriteriaDomain pltzCriteriaDomain) throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4005StgAct.SearchCountForPagingOnCreateSearch", pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005PltzDomain> searchForPagingOnCreateSearch(
        W4005PltzCriteriaDomain pltzCriteriaDomain) throws ApplicationException {

        return (List<W4005PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchForPagingOnCreateSearch", pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchCountOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public int searchCountOnRegisterInitByFromMain(
        W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4005StgAct.SearchCountOnRegisterInitByFromMain", stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    public W4005StgActDomain searchOnRegisterInitByFromMain(
        W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        @SuppressWarnings("unchecked")
        List<W4005StgActDomain> resultStgActDomainList =
            (List<W4005StgActDomain>) getSqlMapClientTemplate()
                .queryForList("W4005StgAct.SearchOnRegisterInitByFromMain", stgActCriteriaDomain);

        if (0 < resultStgActDomainList.size()) {
            return resultStgActDomainList.get(0);
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005PltzDomain> searchOnRegisterInitByFromCreate(
        W4005StgActCriteriaDomain stgActCriteriaDomain)
        throws ApplicationException {

        return (List<W4005PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchOnRegisterInitByFromCreate", stgActCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchOnRegisterInitByWeightSummary(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005PltzDomain> searchOnRegisterInitByWeightSummary(String loginUserDscId)
        throws ApplicationException {

        return (List<W4005PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchOnRegisterInitByWeightSummary", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchOnRegisterInitByVolumeSummary(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005PltzDomain> searchOnRegisterInitByVolumeSummary(String loginUserDscId)
        throws ApplicationException {

        return (List<W4005PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchOnRegisterInitByVolumeSummary", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#lockTtPltzByMainMarkListNoWait(java.util.List)
     */
    public List<? extends W4005PltzDomain> lockTtPltzByMainMarkListNoWait(
        List<? extends W4005PltzDomain> pltzDomainList) throws ApplicationException {

        Map<String, List<String>> pltzListMap = new HashMap<String, List<String>>();
        List<String> mainMarkList = new ArrayList<String>();
        List<String> xmainMarkList = new ArrayList<String>();
        for (W4005PltzDomain pltzDomain : pltzDomainList) {
            if (MAIN_MARK_TYP_MAIN_MARK.equals(pltzDomain.getMainMarkTyp())) {
                mainMarkList.add(pltzDomain.getMainMarkOrXmainMark());
            } else {
                xmainMarkList.add(pltzDomain.getMainMarkOrXmainMark());
            }
        }
        pltzListMap.put("mainMarkList", mainMarkList);
        pltzListMap.put("xmainMarkList", xmainMarkList);

        @SuppressWarnings("unchecked")
        List<W4005PltzDomain> resultPltzDomainList
            = (List<W4005PltzDomain>)getSqlMapClientTemplate()
                .queryForList("W4005StgAct.LockTtPltzByMainMarkListNoWait", pltzListMap);

        return resultPltzDomainList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchTtPltzByExpReq(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzByStgInstr(String loginUserDscId) throws ApplicationException {

        return (List<String>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchTtPltzByStgInstr", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#searchTtPltzByDngrItem(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public String searchTtPltzByDngrItem(String loginUserDscId) throws ApplicationException {

        List<String> resultMaikMarkList = (List<String>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.SearchTtPltzByDngrItem", loginUserDscId);

        if (0 < resultMaikMarkList.size()) {
            return FLAG_Y;
        }

        return FLAG_N;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#lockTtStgInstrByStgInstrNoListNoWait(java.util.List)
     */
    @SuppressWarnings("unchecked")
    public List<String> lockTtStgInstrByStgInstrNoListNoWait(List<String> stgInstrNoList) throws ApplicationException {

        return (List<String>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.LockTtStgInstrByStgInstrNoListNoWait", stgInstrNoList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#lockTtPltzByStgActNoNoWait(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4005PltzDomain> lockTtPltzByStgActNoNoWait(String stgActNo) throws ApplicationException {

        return (List<W4005PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.LockTtPltzByStgActNoNoWait", stgActNo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#lockTtStgInstrByStgActNoNoWait(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<String> lockTtStgInstrByStgActNoNoWait(String stgActNo) throws ApplicationException {

        return (List<String>)getSqlMapClientTemplate()
            .queryForList("W4005StgAct.LockTtStgInstrByStgActNoNoWait", stgActNo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4005StgActDao#updateTtPltzOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W4005PltzDomain)
     */
    public int updateTtPltzOnRegisterCancel(W4005PltzDomain pltzDomain) throws ApplicationException {

        return getSqlMapClientTemplate()
            .update("W4005StgAct.UpdateTtPltzOnRegisterCancel", pltzDomain);
    }
}
