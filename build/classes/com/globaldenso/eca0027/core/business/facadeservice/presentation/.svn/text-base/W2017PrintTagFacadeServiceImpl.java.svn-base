/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The print tag service facade implementation class of X-Tag Register
 * <br />X-Tag Register画面のPrintTagFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2017PrintTagFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2017PrintTagFacadeServiceImpl extends AbstractSearchFacadeService<File, W2017CriteriaDomain> {

    /**
     * X-Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;

    /**
     * constructor.
     */
    public W2017PrintTagFacadeServiceImpl() {
    }

    /**
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017CriteriaDomain filterDomain(W2017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of PDF list (list definition document_ECA0027_L2004_CML(X).xls)  
     *       {@link W2014XtagCriteriaDomain} is created and the following item is set up.
     *         - X-Tag No.      [15] : X-Tag No.
     *         - COMPANY CODE      A login person's COMPANY CODE
     *         - Date format (for document outputs)
     *       {@link W2014XtagService#printOnRegisterPrintTag (W2014XtagCriteriaDomain)} is called, and this is a create of a PDF list.
     *
     * - A return of PDF list
     * 
     * - PDF帳票の作成(帳票定義書_ECA0027_L2004_CML(X).xls)
     *     {@link W2014XtagCriteriaDomain}を作成し、下記項目を設定する
     *       - X-Tag No.    【15】:X-Tag No.
     *       - 会社コード    ログイン者の会社コード
     *       - 日付フォーマット (帳票出力用)
     *     {@link W2014XtagService#printOnRegisterPrintTag(W2014XtagCriteriaDomain)}を呼出し、PDF帳票の作成
     *     
     * - PDF帳票の返却
     *   
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2017CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        
        criteria.setXmainMark(criteriaDomain.getXmainMark());
        criteria.setOwnerCompCd(criteriaDomain.getOwnerCompCd());
        criteria.setReportDateFormat(criteriaDomain.getReportDateFormat());
        
        // A create of PDF list
        // PDF帳票の作成
        return w2014XtagService.printOnRegisterPrintTag(criteria);
    }
}
