/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.business.dao.W3TransferDao;
import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * DAO use for Transfer.
 * </p>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3TransferDaoImpl extends SqlMapClientDaoSupport implements
    W3TransferDao {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3TransferDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountTtTransfer(com.globaldenso.eca0027.core.business.domain.criteria.W3001TransferCriteriaDomain)
     */
    public int searchCountTtTransfer(W3TransferCriteriaDomain criteria)
        throws ApplicationException {

        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountTransfer", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountForPagingOnCarryInMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountTransfer", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingOnCarryInMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingOnCarryInMainSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchForPagingTransferCarryInMainScreen", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingTtTransfer(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingTtTransfer(
        W3TransferCriteriaDomain criteria) throws ApplicationException {

        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchForPagingTransfer", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForUpdateTtTmpStockCarryInWh(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtTmpStockDomain> searchForUpdateTtTmpStockCarryInWh(
        String trNo) throws ApplicationException {
        // TODO update TT_TMP_STOCK
        return (List<TtTmpStockDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchForUpdateTtTmpStockCarryInWh", trNo);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForUpdateTtTmpStockCarryOutWh(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtTmpStockDomain> searchForUpdateTtTmpStockCarryOutWh(
        String trNo) throws ApplicationException {
        // TODO update TT_TMP_STOCK
        return (List<TtTmpStockDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchForUpdateTtTmpStockCarryOutWh", trNo);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#updateForCancelActivateTtTransfer(com.globaldenso.eca0027.core.business.domain.W3TransferDomain,
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int updateForCancelActivateTtTransfer(W3TransferDomain domain,
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(
            domain, criteria);
        return getSqlMapClientTemplate().update("W3Transfer.CancelActivateTR",
            updateByConditionMap);
    }

    /**
     * To generates a criteria update parameter Map.<br>
     * 
     * @param domain Domain
     * @param criteria CriteriaDomain
     * @return parameter updateMap
     */
    private Map<String, Object> getUpdateByConditionMap(Object domain,
        Object criteria) {
        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();
        // map update item
        updateByConditionMap.put("condition", criteria);
        // map update condition
        updateByConditionMap.put("domain", domain);
        return updateByConditionMap;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountTransfer(com.globaldenso.eca0027.core.business.domain.criteria.W3001TransferCriteriaDomain)
     */
    // TODO if not used, to be deleted
    public int searchCountTransfer(W3TransferCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountTransfer", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingTransfer(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    // TODO if not used, to be deleted
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingTransfer(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchForPagingTransfer", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#cancelActivateTR(com.globaldenso.eca0027.core.business.domain.W3TransferDomain,
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int cancelActivateTR(W3TransferDomain domain,
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        Map<String, Object> updateByConditionMap = getUpdateByConditionMap(
            domain, criteria);
        return getSqlMapClientTemplate().update("W3Transfer.CancelActivateTR",
            updateByConditionMap);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRecieveCmlTransferReportInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRecieveCmlTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchRecieveCmlTransferReportInit", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {

        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountOnPrintCarryOutListByCmlSearch", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountForPagingOnCreateCmlTrasferReportSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountForPagingOnCreateCmlTrasferReportSearch",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByCmlSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForPagingOnPrintCarryOutListByCmlSearch",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingOnCreateCmlTrasferReportSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingOnCreateCmlTrasferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForPagingOnCreateCmlTrasferReportSearch",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }

        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountForPagingCreatePartsTransferReportSearch",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingOnCreateCmlTrasferReportSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingCreatePartsTransferReportSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForPagingCreatePartsTransferReportSearch",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterCmlTransferReportFromMainConfirmInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainConfirmInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchRegisterCmlTransferReportFromMainConfirmInit",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterCmlTransferReportFromMainEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromMainEditInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchRegisterCmlTransferReportFromMainEditInit",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterCmlTransferReportFromCreateTrInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria W3TransferCriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterCmlTransferReportFromCreateTrInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchRegisterCmlTransferReportFromCreateTrInit",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRecievePartsTransferReportInit(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     * @param criteria criteria
     * @return list list
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRecievePartsTransferReportInit(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3Transfer.SearchRecievePartsTransferReportInit", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterPartsTransferReportFromMainConfirmInit(com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain)
     * @param criteria W3008CriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainConfirmInit(
        W3008CriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchRegisterPartsTransferReportFromMainConfirmInit",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterPartsTransferReportFromMainEditInit(com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain)
     * @param criteria W3008CriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromMainEditInit(
        W3008CriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchRegisterPartsTransferReportFromMainEditInit",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchRegisterPartsTransferReportFromCreateTrInit(com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain)
     * @param criteria W3008CriteriaDomain
     * @return list List<? extends W3TransferDomain>
     * @throws ApplicationException ApplicationException
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchRegisterPartsTransferReportFromCreateTrInit(
        W3008CriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchRegisterPartsTransferReportFromCreateTrInit",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountOnPrintCarryOutListByCmlSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3Transfer.SearchCountOnPrintCarryOutListByPartsSearch", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchForPagingOnPrintCarryOutListByPartsSearch(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchForPagingOnPrintCarryOutListByPartsSearch(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForPagingOnPrintCarryOutListByPartsSearch",
                criteria);
        if (SEARCH_MAX_COUNT < result.size()) {
            throw new GscmApplicationException(GSCM_E0_0003);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#SearchForCreateCigmaTransactionOnCarryoutMainByCml(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> SearchForCreateCigmaTransactionOnCarryoutMainByCml(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForCreateCigmaTransactionOnCarryoutMainByCml",
                criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#SearchForCreateCigmaTransactionOnCarryoutMainByItem(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> SearchForCreateCigmaTransactionOnCarryoutMainByItem(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList(
                "W3Transfer.SearchForCreateCigmaTransactionOnCarryoutMainByItemNo",
                criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#searchCountForValidateActivateOnCarryOutMainScreen(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    public int searchCountForValidateActivateOnCarryOutMainScreen(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        return 0;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#getListPlantCdOnCml(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchPlantCdForValidateCheckByCml(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList("W3Transfer.getListPlantCdOnCml", criteria);
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferDao#getListPlantCdOnItem(com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchPlantCdForValidateCheckByItemNo(
        W3TransferCriteriaDomain criteria) throws ApplicationException {
        List<W3TransferDomain> result = (List<W3TransferDomain>)getSqlMapClientTemplate()
            .queryForList("W3Transfer.getListPlantCdOnItem", criteria);
        return result;
    }

}
