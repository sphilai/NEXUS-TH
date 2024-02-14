/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation of the Facade class service to Init action of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6004InitFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004InitFacadeServiceImpl extends 
    AbstractDeleteFacadeService<Void, W6004CriteriaDomain> {
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004InitFacadeServiceImpl(){
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
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6004CriteriaDomain filterDomain(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }
    
    /**
     * Check the single item.
     * <br />単項目チェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * Check the consistency.
     * <br />整合性チェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * Check the database.
     * <br />データベースチェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * {@inheritDoc}
     * <br />
     * <pre>
     * - Remove the work table
     * - ワークテーブルを削除する
     * </pre>
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6004CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain criteria = createDocCriteria(criteriaDomain);

        // Delete work table.
        // ワークテーブルを削除
        //public void deleteOnCreateInit(W6001DocCriteriaDomain criteria)
        w6001DocService.deleteOnCreateInit(criteria);
  
        return null;
    }
    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param  critical Search conditions domain of the screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6004CriteriaDomain critical){
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteria, critical);

        docCriteria.setDscId(critical.getLoginUserDscId());
        
        return docCriteria;
    }
}
