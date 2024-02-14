/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9003;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9002AgentMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class for facade service to register action of Agent MA Inquiry screen.
 * <br />
 * Agent MA Edit画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9003RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<Integer, W9003UpdateDomain> {

    /**
     * Agent MA service<br />
     * AgentMAのサービス
     */
    protected W9002AgentMaService w9002AgentMaService;

    /**
     * common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9003RegisterFacadeServiceImpl() {
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
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9003UpdateDomain filterDomain(W9003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
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
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W9003CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        Validator<W9003CriteriaDomain> valid 
            = new Validator<W9003CriteriaDomain>(criteriaDomain, "w9003CriteriaDomain");

        String[] properties = {
            "agentCompCd",
            "bhtUnlockAuthFlg",
            "maOtherAuthFlg",
            "docAuthFlg",
            "shippingActAuthFlg",
            "expRequestAuthFlg",
            "expRequestPkgAuthFlg",
            "ertAuthFlg",
            "rcvOdrAuthFlg",
            "pltzInstrAuthFlg",
            "mixTagAuthFlg",
            "cmlAuthFlg",
            "XTagAuthFlg",
            "trAuthFlg",
            "stgInstrAuthFlg",
            "stgActAuthFlg",
            "shippingFirmAuthFlg",
            "progControlAuthFlg"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9003);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check the combination of proxy request destination company and proxy request based company.
     * </pre>
     * <pre>
     * 代行依頼元会社と代行依頼先会社の組み合わせチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        String orgCompCd = updateDomain.getCriteriaDomain().getOrgCompCd();
        String agentCompCd = updateDomain.getCriteriaDomain().getAgentCompCd();

        // Check auth
        if (!w9002AgentMaService.validateConsistencyCompAuth(orgCompCd)) {
            MessageDomain msgDomain = new MessageDomain("w9003CriteriaDomain.orgCompCd", GSCM_I0_0009, null);
            errorList.add(msgDomain);
        }
        
        // Combination check (Org Company、Agent Company)
        if (!w9002AgentMaService.validateConsistencyAgentMaPair(orgCompCd, agentCompCd)) {
            Object[] params = {
                commonService.getResource(updateDomain.getCriteriaDomain().getLocale(), "label.orgCompCd")
                , commonService.getResource(updateDomain.getCriteriaDomain().getLocale(), "label.agentCompCd")
            };
            
            MessageDomain msgOrgCompCd = new MessageDomain("w9003CriteriaDomain.orgCompCd", GSCM_E0_0029, params);
            MessageDomain msgAgentCompCd = new MessageDomain("w9003CriteriaDomain.agentCompCd", null, null);
            
            errorList.add(msgOrgCompCd);
            errorList.add(msgAgentCompCd);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 2.4.1 Check Agent company master record.
     * 2.5.1 Lock the selected data of Agent Company base unit.(Only if the update mode)
     * </pre>
     * <pre>
     * 2.4.1代行会社マスタを存在チェック
     * 2.5.1.代行会社原単位の選択データをロック(修正モードの場合のみ)
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        String mode = updateDomain.getCriteriaDomain().getProcMode();
        String agentCompCd = updateDomain.getCriteriaDomain().getAgentCompCd();
        String orgCompCd = updateDomain.getCriteriaDomain().getOrgCompCd();

        // Check exist for Agent company(new mode) 
        // 代行会社存在チェック(新規モードの場合)
        if (MODE_NEW.equals(mode)) {
            if (!w9002AgentMaService.validateDatabaseCompCd(agentCompCd)) {
                MessageDomain msgCompany = new MessageDomain("w9003CriteriaDomain.agentCompCd", NXS_E7_0071, null);
                errorList.add(msgCompany);
            }
        }
        // The select data of a factoring company standard physical unit is locked.(edit mode) 
        // 代行会社原単位の選択データをロック(修正モード)
        if (MODE_EDIT.equals(mode)) {
            if(!w9002AgentMaService.validateDatabaseTmNxsCompOnEditRegisterByConsistency(orgCompCd, agentCompCd)){
                MessageDomain msgCompany = new MessageDomain("", GSCM_E0_0010, null);
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
     * Register/Update Agent Company master, updating the user authority to use management.
     * </pre>
     * <pre>
     * 代行会社マスタを登録/更新、ユーザ利用権限管理を更新
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9003UpdateDomain criteria)
        throws GscmApplicationException, ApplicationException {

        W9002AgentMaCriteriaDomain criteriaDomain = createAgentMaCriteria(criteria);

        return w9002AgentMaService.createOnEditRegister(criteriaDomain);
    }

    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain  Criteria domain of Agent MA Inquiry screen (PL)<br />
     * Agent MA Edit画面の検索条件ドメイン(PL)
     * @return Criteria domain for Agent MA Edit service(BL)<br />
     * Agent MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9002AgentMaCriteriaDomain createAgentMaCriteria(
        W9003UpdateDomain criteriaDomain) {

        W9002AgentMaCriteriaDomain agentMaCriteria = new W9002AgentMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(agentMaCriteria, criteriaDomain.getCriteriaDomain());
        
        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        agentMaCriteria.setScreenId(criteriaDomain.getScreenId());
        agentMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        // Setup of DSC_ID
        // DSC_IDを設定
        agentMaCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return agentMaCriteria;
    }

    /**
     * Convert agent MA service domain(BL)  to agent MA edit screen domain(PL). 
     * <br />
     * AgentMAサービスのドメイン(BL)をAgent MA Edit画面のドメイン(PL)に変換します。
     * 
     * @param srcDomain agent MA service domain(BL)<br />
     * AgentMAサービスドメイン(BL)
     * @return agent MA edit screen domain(PL)<br />
     * Agent MA Edit画面のドメイン(PL)
     */
    protected W9003UpdateDomain convertToListDomain(W9002AgentMaDomain srcDomain) {
        W9003UpdateDomain dstDomain = new W9003UpdateDomain();
        if (srcDomain != null) {
            CommonUtil.copyPropertiesDomainToDomain(dstDomain, srcDomain);
        }
        return dstDomain;
    }
}
