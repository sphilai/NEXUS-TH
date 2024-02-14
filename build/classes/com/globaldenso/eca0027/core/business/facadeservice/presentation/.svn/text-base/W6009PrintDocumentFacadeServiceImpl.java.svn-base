/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * An implementation class of service for the PrintDocument Facade of action Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のPrintDocumentアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009PrintDocumentFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6009PrintDocumentFacadeServiceImpl extends AbstractSearchFacadeService<File, W6009CriteriaDomain>{
    
    /**
     * Documentation Service<br />
     * Documentation サービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009PrintDocumentFacadeServiceImpl(){
        super();
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
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain filterDomain(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Search conditions domain settings
     *     Set the {@link W6001DocCriteriaDomain}.
     * 
     * - PDF file acquisition 
     *     Call the {@link W6001DocService#searchOnRegisterPrintDocument(W6001DocCriteriaDomain)}.
     * </pre>
     * 
     * <pre>
     * ‐検索条件ドメイン設定
     *     {@link W6001DocCriteriaDomain}を設定します。
     * 
     * ‐PDFファイル取得
     *     {@link W6001DocService#searchOnRegisterPrintDocument(W6001DocCriteriaDomain)}を呼び出します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
 
        W6001DocCriteriaDomain docCriteria = prepareCriteriaDomain(criteriaDomain);

        return w6001DocService.searchOnRegisterPrintDocument(docCriteria);
    }

    /**
     * 
     * Convert to the BL layer from the screen for domain domain.
     * <br />画面用ドメインからBL層用ドメインに変換します。
     * 
     * @param criteriaDomain Screen for the search criteria domain<br />
     * 画面用検索条件ドメイン
     * @return BL layer search criteria domain<br />
     * BL層用検索条件ドメイン
     */
    protected W6001DocCriteriaDomain prepareCriteriaDomain (W6009CriteriaDomain criteriaDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, dateFormat);
        
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteria;
    }
}
