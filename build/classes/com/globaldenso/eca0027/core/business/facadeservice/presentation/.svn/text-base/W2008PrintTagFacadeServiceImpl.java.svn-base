/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のPrintTagFacadeサービス実装クラスです。
 * <pre>
 * bean W2008PrintTagFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2008PrintTagFacadeServiceImpl extends AbstractTransactFacadeService<File, W2008CriteriaDomain> {

    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;
    
    /**
     * constructor.
     */
    public W2008PrintTagFacadeServiceImpl() {
    }


    /**
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
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
    protected W2008CriteriaDomain filterDomain(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
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
    protected void validateItems(W2008CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W2008CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A create of PDF list
     *       {@link W2005MixTagDomain} is created and the following item is set up.
     *         - mixTagNo / MIX TAG NO
     *       {@link W2005MixTagService#printOnRegisterPrintTag (W2005MixTagDomain, String)} is called and this is a create of a PDF list.
     *
     * - A return of PDF list
     * 
     * - PDF帳票の作成
     *     {@link W2005MixTagDomain}を作成し、下記項目を設定
     *       - mixTagNo/MIXタグNO
     *     {@link W2005MixTagService#printOnRegisterPrintTag(W2005MixTagDomain, String)}を呼出し、PDF帳票の作成
     *     
     * - PDF帳票の返却
     *   
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2008CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A create of PDF list
        // PDF帳票の作成
        W2005MixTagDomain mixTag = createMixTag(criteriaDomain);
        File file = w2005MixTagService.printOnRegisterPrintTag(mixTag, criteriaDomain.getReportDateFormat());
        
        return file;
        
    }

    /**
     * {@link W2005MixTagDomain} is created.
     * <br />{@link W2005MixTagDomain}を作成します。
     *
     * @param criteriaDomain Search-condition domain<br />検索条件ドメイン
     * @return Created {@link W2005MixTagDomain}<br />作成した{@link W2005MixTagDomain}
     */
    protected W2005MixTagDomain createMixTag(W2008CriteriaDomain criteriaDomain) {
        W2005MixTagDomain mixTag = new W2005MixTagDomain();
        
        mixTag.setMixTagNo(criteriaDomain.getMixTagNo());
        
        return mixTag;
    }
    
}
