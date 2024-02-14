/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;


import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * An implementation of the Facade class service to Init action of Documentation Invoice Header screen.
 * <br />通関書類作成業務 Invoice Header画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6003InitFacadeService
 * </pre>
 *
 * @author $Author: y-hazama$
 * @version $Revision: 6712$
 */
public class W6003InitFacadeServiceImpl extends 
    AbstractDeleteFacadeService<Void, W6003CriteriaDomain> {
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6003InitFacadeServiceImpl(){
    }
    
    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }

   
    /**
     * {@inheritDoc}
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6003CriteriaDomain filterDomain(W6003CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {

        return criteria;
    }


    /**
     * {@inheritDoc}
     * Checking the consistency.
     * <br />整合性チェックを行う。
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6003CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * Checking the database.
     * <br />データベースチェックを行う。
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6003CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * Checking the single item.
     * <br />単項目チェックを行う。
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected void validateItems(W6003CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain 
     *     Create the {@link W6001DocCriteriaDomain}
     * - Remove the work table
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - ワークテーブルを削除する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected Void callServices(W6003CriteriaDomain w6003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteria = createDocCriteriaDomain(w6003CriteriaDomain);

        CommonUtil.copyPropertiesDomainToDomain(docCriteria, w6003CriteriaDomain);
        
        // Delete work table.
        // ワークテーブルを削除
        w6001DocService.deleteOnHeaderInit(docCriteria);
        
        return null;
    }
    /**
     * 
     * Create the condition of progress domain management service.
     * <br />進度管理サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Conditions domain of progress management Main screen<br />
     * 進度管理Main画面の条件ドメイン
     * @return Conditions of progress domain management service<br />
     * 進度管理サービスの条件ドメイン
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6001DocCriteriaDomain createDocCriteriaDomain(W6003CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        String dateFormat = criteriaDomain.getScreenDateFormat();

        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain, dateFormat);

        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteriaDomain;
    }
}
