/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9002ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9002UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9002AgentMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The implementation class for facade service to delete action of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<Integer, W9002UpdateDomain> {

    /**
     * Agent MA service<br />
     * AgentMAのサービス
     */
    protected W9002AgentMaService w9002AgentMaService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     *
     */
    public W9002DeleteFacadeServiceImpl() {
        super();
    }
    
    /**
     * Setter method for agentMaService.
     *
     * @param agentMaService Set for agentMaService
     */
    public void setW9002AgentMaService(W9002AgentMaService agentMaService) {
        this.w9002AgentMaService = agentMaService;
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
    protected W9002UpdateDomain filterDomain(W9002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Detail line selection check 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getCriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // Selected line is stored. 
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        List<W9002ListDomain> listDomainList = new ArrayList<W9002ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
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
    protected void validateItems(W9002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Authority check(Company)
     * </pre>
     * 権限チェック(Company)
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W9002ListDomain listDomain = updateDomain.getListDomainList().get(0);
        
        // Authority check 
        // 権限チェック
        if(!w9002AgentMaService.validateConsistencyCompAuthDel(listDomain.getOrgCompCd())){
            int selectedRow = Integer.parseInt(updateDomain.getSelected());
            MessageDomain msgCompany = new MessageDomain("listDomainList[" + selectedRow + "].orgCompCd", GSCM_I0_0009, null);
            errorList.add(msgCompany);
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Delete Agent company master and user authority to use management.
     * <pre>
     * ‐代行会社マスタ、ユーザ利用権限管理を削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9002AgentMaCriteriaDomain criteriaDomain = createAgentMaCriteria(updateDomain);
        
        // Delete the Agent Master
        return w9002AgentMaService.transactOnInquiryDelete(criteriaDomain);
    }

    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of Agent MA Inquiry screen (PL)<br />
     * Agent MA Inquiry画面の検索条件ドメイン(PL)
     * @return Criteria domain for Agent MA Edit service(BL)<br />
     * Agent MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9002AgentMaCriteriaDomain createAgentMaCriteria(W9002UpdateDomain updateDomain) {
        
        W9002AgentMaCriteriaDomain agentMaCriteria = new W9002AgentMaCriteriaDomain();
        
        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        agentMaCriteria.setScreenId(updateDomain.getScreenId());
        
        CommonUtil.copyPropertiesDomainToDomain(agentMaCriteria, updateDomain.getListDomainList().get(0));
        
        return agentMaCriteria;
    }
}
