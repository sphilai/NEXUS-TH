/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial service facade implementation class of Multiple Item No. in 1Box PKG Header
 * <br />小箱内多品番梱包Header画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean id: W2006InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2006InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W2006CriteriaDomain> {

    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;

    /**
     * constructor.
     */
    public W2006InitFacadeServiceImpl() {
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
    protected W2006CriteriaDomain filterDomain(W2006CriteriaDomain criteriaDomain)
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
    protected void validateItems(W2006CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W2006CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W2006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Setting of an initial value
     *
     * - Delete of a session
     *       It carries out by Action.
     *
     * - The delete process of Mix-Tag-Item-No work and a Mix Tag RT Work
     *       {@link W2005MixTagService#deleteOnHeaderInit (W2005MixTagCriteriaDomain)} is called,
     *       The Mix-Tag-Item-No work and Mix Tag RT Work which the login user registered are deleted.
     * 
     * - 初期値の設定
     * 
     * - セッションの削除
     *     Actionで実施
     * 
     * - MIXED品番ワーク、MIXED用RT材ワークの削除処理
     *     {@link W2005MixTagService#deleteOnHeaderInit(W2005MixTagCriteriaDomain)}を呼出し、
     *     ログインユーザが登録したMIXED品番ワーク、MIXED用RT材ワークを削除する
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2006CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a condition domain
        // 条件ドメインの作成
        W2005MixTagCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);
        
        // A delete of Mix-Tag-Item-No work, and a Mix Tag RT Work
        // MIXED品番ワーク、MIXED用RT材ワークの削除
        deleteTwMixTag(mixTagCriteria);

        return null;
    }
    
    /**
     * Create the condition domain of multiple-p/n-packaged-in-box service.
     * <br />小箱内多品番梱包サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a MixTag Header screen<br />MixTag Header画面の検索条件ドメイン
     * @return The condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの条件ドメイン
     */
    protected W2005MixTagCriteriaDomain createMixTagCriteria(W2006CriteriaDomain criteriaDomain) {
        // Create of a condition domain
        // 条件ドメインの作成
        W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
        // Setting of a condition domain
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(mixTagCriteria, criteriaDomain);
        
        return mixTagCriteria;
    }

    /**
     * Delete a Mix-Tag-Item-No work and a Mix Tag RT Work.
     * <br />MIXED品番ワーク、MIXED用RT材ワークを削除します。
     *
     * @param mixTagCriteria The condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの条件ドメイン
     * @throws ApplicationException When a Mix-Tag-Item-No work and a Mix Tag RT Work cannot be deleted<br />MIXED品番ワーク、MIXED用RT材ワークが削除できない場合
     */
    protected void deleteTwMixTag(W2005MixTagCriteriaDomain mixTagCriteria) throws ApplicationException {
        w2005MixTagService.deleteOnHeaderInit(mixTagCriteria);
    }

}
