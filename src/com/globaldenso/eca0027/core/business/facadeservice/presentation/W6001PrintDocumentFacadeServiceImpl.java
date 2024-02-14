/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation class of service for the PrintDocument Facade of action Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のPrintDocumentアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6001PrintDocumentFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001PrintDocumentFacadeServiceImpl extends AbstractSearchFacadeService<File, W6001ListDomain>{
   
    /**
     * Documentation Service.<br />
     * Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001PrintDocumentFacadeServiceImpl(){
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
    protected W6001ListDomain filterDomain(W6001ListDomain listDomain)
        throws GscmApplicationException, ApplicationException {

        return listDomain;
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
    protected void validateItems(W6001ListDomain listDomain)
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
    protected void validateConsistency(W6001ListDomain listDomain)
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
    protected void validateDatabase(W6001ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐PDF file extraction
     * ‐PDFファイル抽出
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W6001ListDomain listDomain) 
        throws GscmApplicationException, ApplicationException {
 
        W6001DocCriteriaDomain docCriteria = createDocCriteriaDomain(listDomain);
        
        // Search PDF file.
        // PDFファイル取得
        return w6001DocService.searchOnMainPrintDocument(docCriteria);
    }
    
    /**
     * 
     * Create the domain for BL from the screen domain.
     * <br />画面ドメインからBL用のドメインを作成します。
     * 
     * @param listDomain List domain selected search result<br />
     * 選択した検索結果リストドメイン
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     */
    protected W6001DocCriteriaDomain createDocCriteriaDomain(W6001ListDomain listDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        CommonUtil.copyProperties(docCriteria, listDomain, listDomain.getScreenDateFormat());
        
        return docCriteria;
    }
}
