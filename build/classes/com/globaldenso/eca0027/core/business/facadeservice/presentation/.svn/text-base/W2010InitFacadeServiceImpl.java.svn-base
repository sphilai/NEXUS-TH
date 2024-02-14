/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The search service facade implementation class of CML Header
 * <br />CML Header画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W2010InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2010InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W2010CriteriaDomain> {

    /**
     * W2009CML service
     * <br />W2009CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W2010InitFacadeServiceImpl() {
    }

    /**
     * Setter method for cmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2010CriteriaDomain filterDomain(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a search-condition domain
     *       {@link W2009CmlCriteriaDomain} is created and a DSC-ID is set up.
     *
     * The delete process of - Palletize Item Work
     *       {@link W2009CmlService#deleteOnHeaderInit(String)} is called,
     *       The Palletize Item Work which the login user registered is deleted.
     * </pre>
     * <pre>
     * - 検索条件ドメインの作成
     *     {@link W2009CmlCriteriaDomain}を作成し、DSC-IDを設定する
     * 
     * - パレタイズ対象品ワークの削除処理
     *     {@link W2009CmlService#deleteOnHeaderInit(String)}を呼出し、
     *     ログインユーザが登録したパレタイズ対象品ワークを削除する    
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2010CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // The delete process of Palletize Item Work
        // パレタイズ対象品ワークの削除処理            
        w2009CmlService.deleteOnHeaderInit(criteriaDomain.getLoginUserDscId());

        return null;
    }

}
