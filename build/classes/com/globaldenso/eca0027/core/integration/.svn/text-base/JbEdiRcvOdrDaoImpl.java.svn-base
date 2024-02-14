/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtEdiRcvOdrReportDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao;
import com.globaldenso.eca0027.core.business.domain.B0100EdiRcvOdrDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.ibatis.sqlmap.client.SqlMapExecutor;

/**
 * This is a DAO implement class of an EDI-Receive-Order registration batch.
 * <br />EDI受注登録バッチのDAO実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12500 $
 */
public class JbEdiRcvOdrDaoImpl extends SqlMapClientDaoSupport implements JbEdiRcvOdrDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public JbEdiRcvOdrDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateClearErrorEdiOdr(java.lang.String, java.lang.String)
     */
    public int updateClearErrorEdiOdr(String rcvOdrCompCd, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("rtryFlg", rtryFlg);
        return getSqlMapClientTemplate().update("JbEdiRcvOdr.UpdateClearErrorEdiOdr", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchEdiOdrTransmissionDt(java.lang.String, java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> searchEdiOdrTransmissionDt(String rcvOdrCompCd, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("rtryFlg", rtryFlg);
        return (List<Map<String, Object>>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchEdiOdrTransmissionDt", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createExpOdrUpdByForecastEdi(java.lang.String, java.util.Date)
     */
    public void createExpOdrUpdByForecastEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        getSqlMapClientTemplate().insert("JbEdiRcvOdr.CreateExpOdrUpdByForecastEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteExpOdrForecastByOrgEdi(java.lang.String, java.util.Date)
     */
    public int deleteExpOdrForecastByOrgEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteExpOdrForecastByOrgEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteEdiOdrRtryForecastByOrgEdi(java.lang.String, java.util.Date)
     */
    public int deleteEdiOdrRtryForecastByOrgEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteEdiOdrRtryForecastByOrgEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchCheckEdiOdrCigmaSide(java.lang.String, java.util.Date, java.lang.String, java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0100EdiRcvOdrDomain> searchCheckEdiOdrCigmaSide(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("addOrChgTyp", addOrChgTyp);
        param.put("rtryFlg", rtryFlg);
        return (List<? extends B0100EdiRcvOdrDomain>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchCheckEdiOdrCigmaSide", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchCheckEdiOdrAddTypNxsSide(java.lang.String, java.util.Date, java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0100EdiRcvOdrDomain> searchCheckEdiOdrAddTypNxsSide(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        return (List<? extends B0100EdiRcvOdrDomain>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchCheckEdiOdrAddTypNxsSide", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchCheckEdiOdrChgTypNxsSide(java.lang.String, java.util.Date, java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0100EdiRcvOdrDomain>searchCheckEdiOdrChgTypNxsSide(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        return (List<? extends B0100EdiRcvOdrDomain>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchCheckEdiOdrChgTypNxsSide", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createErrorReportByErrorEdi(java.lang.String, java.util.Date, java.lang.String, java.lang.String)
     */
    public void createErrorReportByErrorEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("addOrChgTyp", addOrChgTyp);
        param.put("rtryFlg", rtryFlg);
        getSqlMapClientTemplate().insert("JbEdiRcvOdr.CreateErrorReportByErrorEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createEdiOdrRtryByErrorEdi(java.lang.String, java.util.Date, java.lang.String)
     */
    public void createEdiOdrRtryByErrorEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("addOrChgTyp", addOrChgTyp);
        getSqlMapClientTemplate().insert("JbEdiRcvOdr.CreateEdiOdrRtryByErrorEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createExpOdrUpdBySuccessEdi(java.lang.String, java.util.Date, java.lang.String, java.lang.String)
     */
    public void createExpOdrUpdBySuccessEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("addOrChgTyp", addOrChgTyp);
        param.put("rtryFlg", rtryFlg);
        getSqlMapClientTemplate().insert("JbEdiRcvOdr.CreateExpOdrUpdBySuccessEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createExpOdrByAddEdi(java.lang.String, java.util.Date, java.lang.String)
     */
    public void createExpOdrByAddEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        getSqlMapClientTemplate().insert("JbEdiRcvOdr.CreateExpOdrByAddEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateMaItemNameByAddEdi(java.lang.String, java.util.Date, java.lang.String, java.util.Date)
     */
    public int updateMaItemNameByAddEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg, Date cigmaAds)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        param.put("cigmaAds", cigmaAds);
        return getSqlMapClientTemplate().update("JbEdiRcvOdr.UpdateMaItemNameByAddEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateExpOdrByChgEdi(java.lang.String, java.util.Date, java.lang.String)
     */
    public int updateExpOdrByChgEdi(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        return getSqlMapClientTemplate().update("JbEdiRcvOdr.UpdateExpOdrByChgEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteExpOdrZeroQty(java.lang.String, java.util.Date, java.lang.String)
     */
    public int deleteExpOdrZeroQty(String rcvOdrCompCd, Date transmissionDt, String rtryFlg)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("rtryFlg", rtryFlg);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteExpOdrZeroQty", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteExpOdrByDelEdi(java.lang.String, java.util.Date)
     */
    public int deleteExpOdrByDelEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteExpOdrByDelEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteEdiOdrRtryByDelEdi(java.lang.String, java.util.Date)
     */
    public int deleteEdiOdrRtryByDelEdi(String rcvOdrCompCd, Date transmissionDt)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteEdiOdrRtryByDelEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#deleteEdiOdrRtryBySuccessEdi(java.lang.String, java.util.Date, java.lang.String)
     */
    public int deleteEdiOdrRtryBySuccessEdi(String rcvOdrCompCd, Date transmissionDt, String addOrChgTyp)
        throws ApplicationException {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("rcvOdrCompCd", rcvOdrCompCd);
        param.put("transmissionDt", transmissionDt);
        param.put("addOrChgTyp", addOrChgTyp);
        return getSqlMapClientTemplate().delete("JbEdiRcvOdr.DeleteEdiOdrRtryBySuccessEdi", param);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#createEdiOdrByBulk(java.util.List)
     */
    public void createEdiOdrByBulk(final List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException {
        batchExecute("JbEdiRcvOdr.CreateEdiOdr", domainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateEdiOdrByCigmaSideCheckResults(java.util.List)
     */
    public int updateEdiOdrByCigmaSideCheckResults(final List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException {
        return batchExecute("JbEdiRcvOdr.UpdateEdiOdrByCigmaSideCheckResults", domainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateEdiOdrByNxsSideCheckResults(java.util.List)
     */
    public int updateEdiOdrByNxsSideCheckResults(final List<? extends B0100EdiRcvOdrDomain> domainList)
        throws ApplicationException {
        return batchExecute("JbEdiRcvOdr.UpdateEdiOdrByNxsSideCheckResults", domainList);
    }

    /**
     * Bulk update
     * 一括更新処理
     *
     * @param sqlId SQLID
     * @param domainList parameter domain list
     * @return update count
     */
    protected int batchExecute(final String sqlId, final List<? extends AbstractDomain> domainList) {
        Integer result = 0;
        result = (Integer)getSqlMapClientTemplate().execute(
            new SqlMapClientCallback() {
                public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                    executor.startBatch();
                    for (AbstractDomain domain : domainList) {
                        executor.update(sqlId, domain);
                    }
                    return executor.executeBatch();
                }
            }
        );
        return result.intValue();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchEdiRcvOdrReportHeader(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtEdiRcvOdrReportCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtEdiRcvOdrReportDomain> searchEdiRcvOdrReportHeader(TtEdiRcvOdrReportCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends TtEdiRcvOdrReportDomain>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchEdiRcvOdrReportHeader", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#searchPrinterForErrReport(java.lang.String, java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchPrinterForErrReport(String rcvOdrCompCd, String plntCd) throws ApplicationException {
        Map<String, String> criteria = new HashMap<String, String>();
        criteria.put("compCd", rcvOdrCompCd);
        criteria.put("plntCd", plntCd);
        
        return (List<String>) getSqlMapClientTemplate()
            .queryForList("JbEdiRcvOdr.SearchPrinterForErrReport", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbEdiRcvOdrDao#updateTtExpRcvOdrForReviseOdrQty(com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain, com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int updateTtExpRcvOdrForReviseOdrQty(TtExpRcvOdrDomain ttExpRcvOdr, TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException {

        return getSqlMapClientTemplate()
            .update("JbEdiRcvOdr.UpdateTtExpRcvOdrForReviseOdrQty", toParameterMap(ttExpRcvOdr, criteria));
    }

    /**
     * This is a method which generates the conditional update parameter Map.
     * <br />条件付更新パラメーターMapを生成するメソッドです。
     *
     * @param domain update object Domain<br />更新対象Domain
     * @param criteria update condition Domain<br />更新条件Domain
     * @return conditional update parameter Map<br />条件付更新パラメーターMap
     */
    private Map<String, Object> toParameterMap(Object domain, Object criteria) {

        Map<String, Object> parameterMap = new HashMap<String, Object>();

        parameterMap.put("condition", criteria);
        parameterMap.put("domain", domain);

        return parameterMap;
    }
}
