/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9002;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9002AgentMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * The implementation class for facade service to search action of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<W9002ListDomain>, W9002CriteriaDomain> {

    /**
     *  Agent MA service<br />
     * AgentMAのサービス
     */
    protected W9002AgentMaService w9002AgentMaService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9002SearchFacadeServiceImpl() {
    }

    /**
     * Getter method for w9002AgentMaService.
     *
     * @return the w9002AgentMaService
     */
    public W9002AgentMaService getW9002AgentMaService() {
        return w9002AgentMaService;
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
    protected W9002CriteriaDomain filterDomain(W9002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
    protected void validateItems(W9002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W9002CriteriaDomain> valid = new Validator<W9002CriteriaDomain>(
            criteriaDomain, "w9002CriteriaDomain");
        
        String[] properties = {
            "orgCompCd", 
            "agentCompCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9002);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
        
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Authority check(Company)
     * </pre>
     * <pre>
     * 権限チェック(Company)
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Authority check (When OrgCompCd is inputted )
        // 権限チェック(OrgCompCdが入力されたときのみ)
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getOrgCompCd())) {
            if (!w9002AgentMaService.validateConsistencyCompAuth(criteriaDomain.getOrgCompCd())) {
                MessageDomain msgCompany = new MessageDomain("w9002CriteriaDomain.orgCompCd", GSCM_I0_0009, null);
                errorList.add(msgCompany);
            }
        }

        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Search base unit of agent company.
     * <pre>
     * 代行会社原単位 検索
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9002ListDomain> callServices(W9002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9002AgentMaCriteriaDomain agentMaCriteria = createAgentMaCriteria(criteriaDomain);
        
        List<? extends W9002AgentMaItemDomain> domainList
            = w9002AgentMaService.searchForPagingOnInquirySearch(agentMaCriteria);
        
        return convertToListDomain(domainList);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for service(BL)<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9002AgentMaCriteriaDomain createAgentMaCriteria(W9002CriteriaDomain criteriaDomain) {
        
        W9002AgentMaCriteriaDomain agentMaCriteria = new W9002AgentMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        agentMaCriteria.setScreenId(criteriaDomain.getScreenId());
        agentMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(agentMaCriteria, criteriaDomain);
        
        return agentMaCriteria;
    }
    
    /**
     * Convert service domain(BL) to list domain for agent MA inquiry screen(PL).
     * <br />サービスのドメイン(BL)をAgent MA Inquiry画面のリストドメイン(PL)に変換します。
     *
     * @param srcList list of service domain<br />
     * サービスドメインのリスト(BL)
     * @return list domain of screen<br />
     * 画面のリストドメイン(PL)
     */
    protected List<W9002ListDomain> convertToListDomain(List<? extends W9002AgentMaItemDomain> srcList) {
        
        List<W9002ListDomain> dstList = new ArrayList<W9002ListDomain>();
        
        if (srcList != null) {
            for (W9002AgentMaItemDomain src : srcList) {
                
                W9002ListDomain dst = new W9002ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(dst, src);
                
                dstList.add(dst);
            }
        }
        return dstList;
    }
}
