/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WB020OdrUploadDao;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;

/**
 * This is an implement class of the ordering registration DAO.
 * <br />受注登録DAOの実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13539 $
 */
public class WB020OdrUploadDaoImpl extends SqlMapClientDaoSupport implements WB020OdrUploadDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020OdrUploadDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WB020OdrUploadDao#searchOdrUploadReqMgt(com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB020OdrUploadReqDomain> searchOdrUploadReqMgt(
        WB020OdrUploadReqDomain wb020OCriteriaDomain) throws ApplicationException
    {
        return (List<WB020OdrUploadReqDomain>)getSqlMapClientTemplate()
            .queryForList("WB020OdrUpload.SearchOdrUploadReqMgt", wb020OCriteriaDomain);
    }
}
