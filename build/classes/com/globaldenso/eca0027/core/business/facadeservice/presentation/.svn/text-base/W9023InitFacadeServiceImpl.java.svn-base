/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9022InvTplMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  The implementation class of the Facade service for initial action of Invoice Template MA edit screen.
 * <br />Invoice Template MA Edit画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023InitFacadeServiceImpl extends
    AbstractSearchFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> {
    
    /**
     * Service of invoice Template MA<br />
     * Invoice Template MAのサービス
     */
    protected W9022InvTplMaService w9022InvTplMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9023InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w9022InvTplMaService.
     *
     * @param invTplMaService Set for w9022InvTplMaService
     */
    public void setW9022InvTplMaService(W9022InvTplMaService invTplMaService) {
        w9022InvTplMaService = invTplMaService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9023CriteriaDomain filterDomain(W9023CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9023CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9023CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9023CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    
    
    /**
     * {@inheritDoc}
     * <pre>
     * Get search result data
     * </pre>
     * <pre>
     * 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9023CriteriaDomain callServices(W9023CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {
        
        W9022InvTplMaCriteriaDomain criteriaDomain = createInvTplMaCriteria(criteria);
        
        W9022InvTplMaDomain itemDomain = w9022InvTplMaService.searchOnEditInit(criteriaDomain);
        
        return convertToCriteriaDomain(criteria, itemDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(W9023CriteriaDomain criteriaDomain) {
        
        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain);
        
        invTplMaCriteria.setCompCd(criteriaDomain.getCompany());

        // setup for acquiring the maximum number 
        invTplMaCriteria.setScreenId(criteriaDomain.getScreenId());
        invTplMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        return invTplMaCriteria;
    }
    
    /**
     *  Convert service domain(BL) to screen domain (PL)
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     *
     * @param criteriaDomain criteria domain(screen)
     * @param srcDomain Service domain(BL)<br />
     * サービスドメイン(BL)
     * @return Screen domain(PL)<br />
     * 画面のドメイン(PL)
     */
    protected W9023CriteriaDomain convertToCriteriaDomain(W9023CriteriaDomain criteriaDomain, W9022InvTplMaDomain srcDomain) {
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, srcDomain);
        criteriaDomain.setCompany(srcDomain.getCompCd());
        return criteriaDomain;
    }
}
