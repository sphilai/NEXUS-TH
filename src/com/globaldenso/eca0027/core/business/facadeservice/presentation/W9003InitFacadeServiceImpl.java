/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9002AgentMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  The implementation class for facade service to initial action of Agent MA Inquiry screen.
 * <br />Agent MA Edit画面のInitアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9003InitFacadeServiceImpl extends
    AbstractTransactFacadeService<W9003UpdateDomain, W9003CriteriaDomain> {

    /**
     * Agent MA service<br />
     * AgentMAのサービス
     */
    protected W9002AgentMaService w9002AgentMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9003InitFacadeServiceImpl() {
    }
   

    /**
     * Setter method for w9002AgentMaService.
     *
     * @param agentMaService Set for w9002AgentMaService
     */
    public void setW9002AgentMaService(W9002AgentMaService agentMaService) {
        w9002AgentMaService = agentMaService;
    }


    /**
     * {@inheritDoc}
    * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9003CriteriaDomain filterDomain(W9003CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check takeover value.
     * </pre>
     * <pre>
     * 引継値のチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9003CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Processing mode judging 
        // 処理モード判定
        String mode = w9002AgentMaService.validateConsistencyEditMode(criteria.getFunctionNo(), criteria.getOrgCompCd());
        
        criteria.setProcMode(mode);
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9003CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9003CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result.
     * </pre>
     * <pre>
     * 検索データの取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9003UpdateDomain callServices(W9003CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9002AgentMaCriteriaDomain criteriaDomain = createAgentMaCriteria(criteria);

        W9002AgentMaDomain domain = w9002AgentMaService.searchOnEditInit(criteriaDomain);
        CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
        
        W9003UpdateDomain updateDomain = new W9003UpdateDomain();
        updateDomain.setCriteriaDomain(criteria);
        
        return updateDomain;
    }
    
    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain Criteria domain of Agent MA Inquiry screen (PL)<br />
     * Agent MA Edit画面の検索条件ドメイン(PL)
     * @return Criteria domain for Agent MA Edit service(BL)<br />
     * Agent MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9002AgentMaCriteriaDomain createAgentMaCriteria(
        W9003CriteriaDomain criteriaDomain) {

        W9002AgentMaCriteriaDomain agentMaCriteria = new W9002AgentMaCriteriaDomain();

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        agentMaCriteria.setScreenId(criteriaDomain.getScreenId());
        agentMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        CommonUtil
            .copyPropertiesDomainToDomain(agentMaCriteria, criteriaDomain);

        return agentMaCriteria;
    }
}
