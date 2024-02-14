/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientCallback;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadOdrDomain;
import com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain;
import com.ibatis.sqlmap.client.SqlMapExecutor;

/**
 * This is a DAO implement class of an order upload import job
 * <br />受注アップロード取込ジョブのDAO実装クラス。
 *
 * MGT575 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13653 $
 */
public class JbOdrUploadDaoImpl extends SqlMapClientDaoSupport implements JbOdrUploadDao {

    /**
     * constructor.
     * <br />コンストラクタ。
     */
    public JbOdrUploadDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#createOdrUploadWork(java.util.List)
     */
    public int createOdrUploadWork(List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList) throws ApplicationException {

        return batchExecute("JbOdrUpload.CreateOdrUploadWork", odrUploadOdrDomainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#searchCheckUniquenessInsideFile(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0200OdrUploadOdrDomain> searchCheckUniquenessInsideFile(B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException
    {
        return (List<? extends B0200OdrUploadOdrDomain>)getSqlMapClientTemplate()
            .queryForList("JbOdrUpload.SearchCheckUniquenessInsideFile", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#searchCheckRelationCigmaSide(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0200OdrUploadOdrDomain> searchCheckRelationCigmaSide(B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException
    {
        return (List<? extends B0200OdrUploadOdrDomain>)getSqlMapClientTemplate()
            .queryForList("JbOdrUpload.SearchCheckRelationCigmaSide", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#updateOdrUploadWorkByUniquenessInsideFileCheckResults(java.util.List)
     */
    public int updateOdrUploadWorkByUniquenessInsideFileCheckResults(List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException
    {
        return batchExecute("JbOdrUpload.UpdateOdrUploadWorkByUniquenessInsideFileCheckResults", odrUploadOdrDomainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#updateOdrUploadWorkByCigmaSideCheckResults(java.util.List)
     */
    public int updateOdrUploadWorkByCigmaSideCheckResults(List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException
    {
        return batchExecute("JbOdrUpload.UpdateOdrUploadWorkByCigmaSideCheckResults", odrUploadOdrDomainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#searchCheckRelationNexusSide(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends B0200OdrUploadOdrDomain> searchCheckRelationNexusSide(B0200OdrUploadReqDomain odrUploadReqDomain)
        throws ApplicationException
    {
        return (List<? extends B0200OdrUploadOdrDomain>)getSqlMapClientTemplate()
            .queryForList("JbOdrUpload.SearchCheckRelationNexusSide", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#updateOdrUploadWorkByNexusSideCheckResults(java.util.List)
     */
    public int updateOdrUploadWorkByNexusSideCheckResults(List<? extends B0200OdrUploadOdrDomain> odrUploadOdrDomainList)
        throws ApplicationException
    {
        return batchExecute("JbOdrUpload.UpdateOdrUploadWorkByNexusSideCheckResults", odrUploadOdrDomainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#searchStatusSummary(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public String searchStatusSummary(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return (String)getSqlMapClientTemplate()
            .queryForObject("JbOdrUpload.SearchStatusSummary", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#createOdrUploadUpdForFcstReplace(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int createOdrUploadUpdForFcstReplace(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.CreateOdrUploadUpdForFcstReplace", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#deleteExpOdrForFcstReplace(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int deleteExpOdrForFcstReplace(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return  getSqlMapClientTemplate().delete("JbOdrUpload.DeleteExpOdrForFcstReplace", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#createExpOdrUpdForAdd(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int createExpOdrUpdForAdd(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.CreateExpOdrUpdForAdd", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#createExpOdrForAdd(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int createExpOdrForAdd(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.CreateExpOdrForAdd", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#updateMaItemName(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int updateMaItemName(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.UpdateMaItemName", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#createOdrUploadUpdForChg(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int createOdrUploadUpdForChg(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.CreateOdrUploadUpdForChg", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#updateExpOdrForChg(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int updateExpOdrForChg(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().update("JbOdrUpload.UpdateExpOdrForChg", odrUploadReqDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbOdrUploadDao#deleteExpOdrZeroQty(com.globaldenso.eca0027.core.business.domain.B0200OdrUploadReqDomain)
     */
    public int deleteExpOdrZeroQty(B0200OdrUploadReqDomain odrUploadReqDomain) throws ApplicationException {

        return getSqlMapClientTemplate().delete("JbOdrUpload.DeleteExpOdrZeroQty", odrUploadReqDomain);
    }

    /**
     * Bulk update
     * <br />一括更新処理
     *
     * @param <T> generics type
     * @param sqlId SQLID
     * @param odrUploadOdrDomainList parameter domain list
     * @return update count
     */
    protected <T> int batchExecute(final String sqlId, final List<T> odrUploadOdrDomainList) {
        Integer result = 0;
        result = (Integer)getSqlMapClientTemplate().execute(
            new SqlMapClientCallback() {
                public Object doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
                    executor.startBatch();
                    for (T domain : odrUploadOdrDomainList) {
                        executor.update(sqlId, domain);
                    }
                    return executor.executeBatch();
                }
            }
        );
        return result.intValue();
    }
}
