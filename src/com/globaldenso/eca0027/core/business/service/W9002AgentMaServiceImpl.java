/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9002R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9003;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService;
import com.globaldenso.eca0027.core.business.dao.W9002AgentMaDao;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002AgentMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * Class for service of Agent MA.
 * <br />Agent MAのサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002AgentMaServiceImpl implements W9002AgentMaService{

    /**
     * TmAgent
     */
    protected TmAgentService tmAgentService;
    
    /**
     * TmUserConf
     */
    protected TmUserConfService tmUserConfService;

    /**
     * TtUserAuthMgt
     */
    protected TtUserAuthMgtService ttUserAuthMgtService;

    /**
     * UserAuth
     */
    protected UserAuthService userAuthService;

    /**
     * TmNxsComp
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * AgentMaDao
     */
    protected W9002AgentMaDao w9002AgentMaDao;
    
    /**
     * Default constructor.<br />
     * <br />デフォルトコンストラクタです。
     */
    public W9002AgentMaServiceImpl() {
    }

    /**
     * Setter method for tmAgentService.
     *
     * @param tmAgentService Set for tmAgentService
     */
    public void setTmAgentService(TmAgentService tmAgentService) {
        this.tmAgentService = tmAgentService;
    }

    /**
     * Setter method for tmUserConfService.
     *
     * @param tmUserConfService Set for tmUserConfService
     */
    public void setTmUserConfService(TmUserConfService tmUserConfService) {
        this.tmUserConfService = tmUserConfService;
    }

    /**
     * Setter method for ttUserAuthMgtService.
     *
     * @param ttUserAuthMgtService Set for ttUserAuthMgtService
     */
    public void setTtUserAuthMgtService(TtUserAuthMgtService ttUserAuthMgtService) {
        this.ttUserAuthMgtService = ttUserAuthMgtService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
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
     * Setter method for w9002AgentMaDao.
     *
     * @param agentMaDao Set for w9002AgentMaDao
     */
    public void setW9002AgentMaDao(W9002AgentMaDao agentMaDao) {
        w9002AgentMaDao = agentMaDao;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#createOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public Integer createOnEditRegister(W9002AgentMaCriteriaDomain criteria)
        throws ApplicationException {
        
        List<? extends W9002AgentMaDomain> agentMaList = new ArrayList<W9002AgentMaDomain>();
        int retCount = 0;
        if (MODE_NEW.equals(criteria.getProcMode())) {
            // MODE_NEW
            // 新規モード
            
            TmAgentDomain createDomain = new TmAgentDomain();
            createDomain.setOrgCompCd(criteria.getOrgCompCd());
            createDomain.setAgentCompCd(criteria.getAgentCompCd());
            createDomain.setBhtUnlockAuthFlg(criteria.getBhtUnlockAuthFlg());
            createDomain.setMaOtherAuthFlg(criteria.getMaOtherAuthFlg());
            createDomain.setDocAuthFlg(criteria.getDocAuthFlg());
            createDomain.setShippingActAuthFlg(criteria.getShippingActAuthFlg());
            createDomain.setExpRequestAuthFlg(criteria.getExpRequestAuthFlg());
            createDomain.setExpRequestPkgAuthFlg(criteria.getExpRequestPkgAuthFlg());
            createDomain.setErtAuthFlg(criteria.getErtAuthFlg());
            createDomain.setRcvOdrAuthFlg(criteria.getRcvOdrAuthFlg());
            createDomain.setPltzInstrAuthFlg(criteria.getPltzInstrAuthFlg());
            createDomain.setMixTagAuthFlg(criteria.getMixTagAuthFlg());
            createDomain.setCmlAuthFlg(criteria.getCmlAuthFlg());
            createDomain.setXtagAuthFlg(criteria.getXTagAuthFlg());
            createDomain.setTrAuthFlg(criteria.getTrAuthFlg());
            createDomain.setStgInstrAuthFlg(criteria.getStgInstrAuthFlg());
            createDomain.setStgActAuthFlg(criteria.getStgActAuthFlg());
            createDomain.setShippingFirmAuthFlg(criteria.getShippingFirmAuthFlg());
            createDomain.setProgControlAuthFlg(criteria.getProgControlAuthFlg());

            commonService.setCommonPropertyForRegist(createDomain, SCREEN_ID_W9003);
            
            try {
                tmAgentService.create(createDomain);
                retCount = 1;
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
        
        } else {
            if (isParamFlgOnN(criteria)) {
                TmUserConfCriteriaDomain tmUserConfCriteriaDomain = new TmUserConfCriteriaDomain();
                tmUserConfCriteriaDomain.setCompCd(criteria.getAgentCompCd());
                List<TmUserConfDomain> tmUserConfDomainList = tmUserConfService.searchByCondition(tmUserConfCriteriaDomain);
                
                W9002AgentMaCriteriaDomain lockCriteriaDomain = new W9002AgentMaCriteriaDomain();
                lockCriteriaDomain.setDscIdList(new ArrayList<TmUserConfDomain>());
                lockCriteriaDomain.setOrgCompCd(criteria.getOrgCompCd());
                for (TmUserConfDomain tmUserConfDomain : tmUserConfDomainList) {
                    lockCriteriaDomain.getDscIdList().add(tmUserConfDomain);
                }
                // Get the lock data. 
                // ユーザ利用権限管理の対象データをロック
                agentMaList = w9002AgentMaDao.lockByNoWaitTtUserAuthMgt(lockCriteriaDomain);
            }
            
            TmAgentCriteriaDomain updCriteriaDomain = new TmAgentCriteriaDomain();
            updCriteriaDomain.setOrgCompCd(criteria.getOrgCompCd());
            updCriteriaDomain.setAgentCompCd(criteria.getAgentCompCd());
            updCriteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
            
            TmAgentDomain updDomain = new TmAgentDomain();
            updDomain.setBhtUnlockAuthFlg(criteria.getBhtUnlockAuthFlg());
            updDomain.setMaOtherAuthFlg(criteria.getMaOtherAuthFlg());
            updDomain.setDocAuthFlg(criteria.getDocAuthFlg());
            updDomain.setShippingActAuthFlg(criteria.getShippingActAuthFlg());
            updDomain.setExpRequestAuthFlg(criteria.getExpRequestAuthFlg());
            updDomain.setExpRequestPkgAuthFlg(criteria.getExpRequestPkgAuthFlg());
            updDomain.setErtAuthFlg(criteria.getErtAuthFlg());
            updDomain.setRcvOdrAuthFlg(criteria.getRcvOdrAuthFlg());
            updDomain.setPltzInstrAuthFlg(criteria.getPltzInstrAuthFlg());
            updDomain.setMixTagAuthFlg(criteria.getMixTagAuthFlg());
            updDomain.setCmlAuthFlg(criteria.getCmlAuthFlg());
            updDomain.setXtagAuthFlg(criteria.getXTagAuthFlg());
            updDomain.setTrAuthFlg(criteria.getTrAuthFlg());
            updDomain.setStgInstrAuthFlg(criteria.getStgInstrAuthFlg());
            updDomain.setStgActAuthFlg(criteria.getStgActAuthFlg());
            updDomain.setShippingFirmAuthFlg(criteria.getShippingFirmAuthFlg());
            updDomain.setProgControlAuthFlg(criteria.getProgControlAuthFlg());
            
            commonService.setCommonPropertyForUpdate(updDomain, SCREEN_ID_W9003);
            
            retCount = tmAgentService.updateByCondition(updDomain, updCriteriaDomain);
            
            if (isParamFlgOnN(criteria) && agentMaList != null) {
                for (W9002AgentMaDomain agentMaDomain : agentMaList) {
                    W9002AgentMaCriteriaDomain agentMaCriteria = new W9002AgentMaCriteriaDomain();
                    CommonUtil.copyPropertiesDomainToDomain(agentMaCriteria, criteria);
                    agentMaCriteria.setDscId(agentMaDomain.getDscId());
                    agentMaCriteria.setSearchCountCheckFlg(false);
                    // Delete the target data. 
                    if (w9002AgentMaDao.searchCountTtUserAuthMgt(agentMaCriteria) > 0) {
                        w9002AgentMaDao.deleteTtUserAuthMgt(agentMaCriteria);
                    }
                }
            }
        }
        return retCount;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public List<? extends W9002AgentMaItemDomain> searchForPagingOnInquirySearch(W9002AgentMaCriteriaDomain criteria) 
        throws ApplicationException {

        W9002AgentMaCriteriaDomain agentMaCriteriaDomain = createCriteria(criteria);
        
        int count = w9002AgentMaDao.searchCountTmAgent(agentMaCriteriaDomain);
        // Calculate the search range 
        // 検索範囲の設定
        setPageInfo(criteria.getPageInfoCreator(), count, agentMaCriteriaDomain);
        // Get the search result data. 
        // 検索結果
        return w9002AgentMaDao.searchTmAgent(agentMaCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public W9002AgentMaDomain searchOnEditInit(W9002AgentMaCriteriaDomain criteria) 
        throws ApplicationException {
        // The domain class that holds the information of Agent MA Inquiry screen. 
        W9002AgentMaDomain w9002AgentMaDomain = new W9002AgentMaDomain();
        
        if (MODE_NEW.equals(criteria.getFunctionNo())) {
            // MODE_NEW
            // 新規
            
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteria.getOwnerCompCd());
            List<TmNxsCompDomain> orgList = tmNxsCompService.searchByCondition(tmNxsCompCriteriaDomain);
            if (orgList != null && orgList.size() != 0 ) {
                w9002AgentMaDomain.setOrgCompCd(criteria.getOwnerCompCd());
                w9002AgentMaDomain.setOrgCompNmAbb(orgList.get(0).getCompNmAbb());
                w9002AgentMaDomain.setBhtUnlockAuthFlg(FLAG_N);
                w9002AgentMaDomain.setMaOtherAuthFlg(FLAG_N);
                w9002AgentMaDomain.setDocAuthFlg(FLAG_N);
                w9002AgentMaDomain.setShippingActAuthFlg(FLAG_N);
                w9002AgentMaDomain.setExpRequestAuthFlg(FLAG_N);
                w9002AgentMaDomain.setExpRequestPkgAuthFlg(FLAG_N);
                w9002AgentMaDomain.setErtAuthFlg(FLAG_N);
                w9002AgentMaDomain.setRcvOdrAuthFlg(FLAG_N);
                w9002AgentMaDomain.setPltzInstrAuthFlg(FLAG_N);
                w9002AgentMaDomain.setMixTagAuthFlg(FLAG_N);
                w9002AgentMaDomain.setCmlAuthFlg(FLAG_N);
                w9002AgentMaDomain.setXTagAuthFlg(FLAG_N);
                w9002AgentMaDomain.setTrAuthFlg(FLAG_N);
                w9002AgentMaDomain.setStgInstrAuthFlg(FLAG_N);
                w9002AgentMaDomain.setStgActAuthFlg(FLAG_N);
                w9002AgentMaDomain.setShippingFirmAuthFlg(FLAG_N);
                w9002AgentMaDomain.setProgControlAuthFlg(FLAG_N);
            }
        
        } else if (MODE_EDIT.equals(criteria.getFunctionNo()) || MODE_REF.equals(criteria.getFunctionNo())) {
            // MODE_EDIT or MODE_REF
            // 更新・参照
            
            // Set CompNmAbb to OrgCompNmAbb of the Agent MA.
            // Org Companyの会社略称の取得
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteria.getOrgCompCd());
            List<TmNxsCompDomain> orgList = tmNxsCompService.searchByCondition(tmNxsCompCriteriaDomain);
            if (orgList != null && orgList.size() != 0 ) {
                w9002AgentMaDomain.setOrgCompNmAbb(orgList.get(0).getCompNmAbb());
            }
            // Set CompNmAbb to AgtCompNmAbb of the Agent MA.
            // Agent Companyの会社略称の取得
            tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(criteria.getAgentCompCd());
            List<TmNxsCompDomain> agtList = tmNxsCompService.searchByCondition(tmNxsCompCriteriaDomain);
            if (agtList != null && agtList.size() != 0 ) {
                w9002AgentMaDomain.setAgtCompNmAbb(agtList.get(0).getCompNmAbb());
            }
            // Set Agent data to  the Agent MA.
            TmAgentCriteriaDomain tmAgentCriteriaDomain = new TmAgentCriteriaDomain();
            tmAgentCriteriaDomain.setOrgCompCd(criteria.getOrgCompCd());
            tmAgentCriteriaDomain.setAgentCompCd(criteria.getAgentCompCd());
            tmAgentCriteriaDomain.setLocale(criteria.getLocale());
            
            // Number of search count for Agent MA
            tmAgentService.searchCount(tmAgentCriteriaDomain);
            
            // search for Agent MA
            List<TmAgentDomain> tmAgentDomainList = tmAgentService.searchByCondition(tmAgentCriteriaDomain);
            if (tmAgentDomainList != null && tmAgentDomainList.size() != 0) {
                TmAgentDomain tmAgentDomain = tmAgentDomainList.get(0);
                w9002AgentMaDomain.setOrgCompCd(tmAgentDomain.getOrgCompCd());
                w9002AgentMaDomain.setAgentCompCd(tmAgentDomain.getAgentCompCd());
                w9002AgentMaDomain.setBhtUnlockAuthFlg(tmAgentDomain.getBhtUnlockAuthFlg());
                w9002AgentMaDomain.setMaOtherAuthFlg(tmAgentDomain.getMaOtherAuthFlg());
                w9002AgentMaDomain.setDocAuthFlg(tmAgentDomain.getDocAuthFlg());
                w9002AgentMaDomain.setShippingActAuthFlg(tmAgentDomain.getShippingActAuthFlg());
                w9002AgentMaDomain.setExpRequestAuthFlg(tmAgentDomain.getExpRequestAuthFlg());
                w9002AgentMaDomain.setExpRequestPkgAuthFlg(tmAgentDomain.getExpRequestPkgAuthFlg());
                w9002AgentMaDomain.setErtAuthFlg(tmAgentDomain.getErtAuthFlg());
                w9002AgentMaDomain.setRcvOdrAuthFlg(tmAgentDomain.getRcvOdrAuthFlg());
                w9002AgentMaDomain.setPltzInstrAuthFlg(tmAgentDomain.getPltzInstrAuthFlg());
                w9002AgentMaDomain.setMixTagAuthFlg(tmAgentDomain.getMixTagAuthFlg());
                w9002AgentMaDomain.setCmlAuthFlg(tmAgentDomain.getCmlAuthFlg());
                w9002AgentMaDomain.setXTagAuthFlg(tmAgentDomain.getXtagAuthFlg());
                w9002AgentMaDomain.setTrAuthFlg(tmAgentDomain.getTrAuthFlg());
                w9002AgentMaDomain.setStgInstrAuthFlg(tmAgentDomain.getStgInstrAuthFlg());
                w9002AgentMaDomain.setStgActAuthFlg(tmAgentDomain.getStgActAuthFlg());
                w9002AgentMaDomain.setShippingFirmAuthFlg(tmAgentDomain.getShippingFirmAuthFlg());
                w9002AgentMaDomain.setProgControlAuthFlg(tmAgentDomain.getProgControlAuthFlg());
                w9002AgentMaDomain.setComUpdateTimestamp(tmAgentDomain.getComUpdateTimestamp());
            }
        }
        
        return w9002AgentMaDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#transactOnInquiryDelete(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public int transactOnInquiryDelete(W9002AgentMaCriteriaDomain criteria)
        throws ApplicationException {
        String orgCompCd        = criteria.getOrgCompCd();
        String agentCompCd      = criteria.getAgentCompCd();
        Timestamp delTimestamp  = criteria.getComUpdateTimestamp();

        // Lock the Agent Master
        TmAgentCriteriaDomain tmAgentCriteriaDomain = new TmAgentCriteriaDomain();
        tmAgentCriteriaDomain.setOrgCompCd(orgCompCd);
        tmAgentCriteriaDomain.setAgentCompCd(agentCompCd);
        TmAgentDomain tmAgentDomain = tmAgentService.lockByKeyNoWait(tmAgentCriteriaDomain);
        if (tmAgentDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get the User Config Master.
        TmUserConfCriteriaDomain tmUserConfCriteriaDomain = new TmUserConfCriteriaDomain();
        tmUserConfCriteriaDomain.setCompCd(agentCompCd);
        List<TmUserConfDomain> tmUserConfDomainList = tmUserConfService.searchByCondition(tmUserConfCriteriaDomain);
        
        // Delete the Agent Master.
        int delCnt = 0;
        tmAgentCriteriaDomain = new TmAgentCriteriaDomain();
        tmAgentCriteriaDomain.setOrgCompCd(orgCompCd);
        tmAgentCriteriaDomain.setAgentCompCd(agentCompCd);
        tmAgentCriteriaDomain.setSearchCountCheckFlg(false);
        tmAgentCriteriaDomain.setLocale(criteria.getLocale());
        if (tmAgentService.searchCount(tmAgentCriteriaDomain) > 0) {
            tmAgentCriteriaDomain.setComUpdateTimestamp(delTimestamp);
            delCnt = tmAgentService.deleteByCondition(tmAgentCriteriaDomain);
        }
        
        for (TmUserConfDomain tmUserConfDomain : tmUserConfDomainList) {
            // Lock the User Auth Manage
            W9002AgentMaCriteriaDomain confCriteria = new W9002AgentMaCriteriaDomain();
            confCriteria.setOrgCompCd(orgCompCd);
            confCriteria.setDscId(tmUserConfDomain.getDscId());
            List<? extends W9002AgentMaDomain> agentMaDaoLockList = w9002AgentMaDao.lockByNoWaitTtUserAuthMgt(confCriteria);
            
            // Delete the User Auth Manage.
            if (agentMaDaoLockList != null && !agentMaDaoLockList.isEmpty()) {
                TtUserAuthMgtCriteriaDomain ttUserAuthMgtCriteriaDomain = new TtUserAuthMgtCriteriaDomain();
                ttUserAuthMgtCriteriaDomain.setDscId(agentMaDaoLockList.get(0).getDscId());
                ttUserAuthMgtCriteriaDomain.setAuthMgtComp(orgCompCd);
                ttUserAuthMgtCriteriaDomain.setSearchCountCheckFlg(false);
                ttUserAuthMgtCriteriaDomain.setLocale(criteria.getLocale());
                if (ttUserAuthMgtService.searchCount(ttUserAuthMgtCriteriaDomain) > 0) {
                    ttUserAuthMgtService.deleteByCondition(ttUserAuthMgtCriteriaDomain);
                }
            }
        }
        return delCnt;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateConsistencyAgentMaPair(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAgentMaPair(String orgCompany, String agentCompany) 
        throws ApplicationException {
        return !orgCompany.equals(agentCompany);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateConsistencyCompAuth(java.lang.String)
     */
    public boolean validateConsistencyCompAuth(String company)
        throws ApplicationException {
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9002R, company);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateConsistencyCompAuthDel(java.lang.String)
     */
    public boolean validateConsistencyCompAuthDel(String company)
        throws ApplicationException {
        // Check that the Company Function Use Auth Config have been granted to the logged-in user .
        // 権限チェック
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9002R, company);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateConsistencyEditMode(java.lang.String, java.lang.String)
     */
    public String validateConsistencyEditMode(String functionNo, String company)
        throws ApplicationException {

        String mode = MODE_REF;
        
        if(functionNo.equals(MODE_NEW)){
            mode = MODE_NEW;
        }else if(functionNo.equals(MODE_EDIT) || functionNo.equals(MODE_REF)){
            if(userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9002R, company)){
                mode = MODE_EDIT;
            }else{
                mode = MODE_REF;
            }
        }

        return mode;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateDatabaseCompCd(java.lang.String)
     */
    
    public boolean validateDatabaseCompCd(String company)
        throws ApplicationException {
        // Check the existence of the company.
        // 2.4.DB整合性チェック1
        return commonService.validateCompCd(company);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9002AgentMaService#validateDatabaseTmNxsCompOnEditRegisterByConsistency(com.globaldenso.eca0027.core.business.domain.criteria.W9002AgentMaCriteriaDomain)
     */
    public boolean validateDatabaseTmNxsCompOnEditRegisterByConsistency(String orgCompCd, String agentCompCd)
        throws ApplicationException {
        
        TmAgentCriteriaDomain agentCriteria = new TmAgentCriteriaDomain();
        agentCriteria.setOrgCompCd(orgCompCd);
        agentCriteria.setAgentCompCd(agentCompCd);
        
        TmAgentDomain agentDomain = new TmAgentDomain();
        agentDomain = tmAgentService.lockByKeyNoWait(agentCriteria);
        if (agentDomain == null) {
            return false;
        }
        return true;
    }

    /**
     * False if true, this is not the case if those "N" in the flag is set there<br />
     * フラグの中に"N"が設定されているものが存在する場合はtrue、そうでない場合はfalse
     *
     * @param criteria Parameters<br />
     * パラメータ
     * @return Check result<br />
     * チェック結果
     */
    protected boolean isParamFlgOnN(W9002AgentMaCriteriaDomain criteria) {

        boolean rtn = false;
        if (FLAG_N.equals(criteria.getBhtUnlockAuthFlg())
            || FLAG_N.equals(criteria.getMaOtherAuthFlg())
            || FLAG_N.equals(criteria.getDocAuthFlg())
            || FLAG_N.equals(criteria.getShippingActAuthFlg())
            || FLAG_N.equals(criteria.getExpRequestAuthFlg())
            || FLAG_N.equals(criteria.getExpRequestPkgAuthFlg())
            || FLAG_N.equals(criteria.getErtAuthFlg())
            || FLAG_N.equals(criteria.getRcvOdrAuthFlg())
            || FLAG_N.equals(criteria.getPltzInstrAuthFlg())
            || FLAG_N.equals(criteria.getMixTagAuthFlg())
            || FLAG_N.equals(criteria.getCmlAuthFlg())
            || FLAG_N.equals(criteria.getXTagAuthFlg())
            || FLAG_N.equals(criteria.getTrAuthFlg())
            || FLAG_N.equals(criteria.getStgInstrAuthFlg())
            || FLAG_N.equals(criteria.getStgActAuthFlg())
            || FLAG_N.equals(criteria.getShippingFirmAuthFlg())
            || FLAG_N.equals(criteria.getProgControlAuthFlg())) {
            rtn = true;
        }
        return rtn;
    }

    /**
     * Create a paging search criteria domain. 
     * <br />ページング検索条件ドメインを作成します。
     *
     * @param criteriaDomain Search conditions domain of Main screen <br />
     * Main画面の検索条件ドメイン
     * @return Search conditions domain of service<br />
     * サービスの検索条件ドメイン
     */
    protected W9002AgentMaCriteriaDomain createCriteria(W9002AgentMaCriteriaDomain criteriaDomain) {
        W9002AgentMaCriteriaDomain newCriteria = new W9002AgentMaCriteriaDomain();
        
        newCriteria.setScreenId(criteriaDomain.getScreenId());
        newCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(newCriteria, criteriaDomain);
        
        newCriteria.setLoginCompCd(criteriaDomain.getOwnerCompCd());
        newCriteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        
        return newCriteria;
    }

    /**
     * Calculate the search range
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />
     * PageInfoCreatorオブジェクト
     * @param count Search number<br />
     * 検索件数
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If the search range can not be calculated<br />
     * 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W9002AgentMaCriteriaDomain criteria) 
        throws ApplicationException {
        // Create PageInfo data.
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        // Set position data as a retrieval range.
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }
}
