/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_DATA_TYP_PLNT_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_BHT_LOCK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_CARRY_OUT_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_CARRY_OUT_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_CML_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_CML_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_COMP_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_DOC_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_ERT_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_ERT_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_EXP_PKG_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_EXP_PKG_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_EXP_REQ_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_EXP_REQ_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MA_AGENT_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MA_AGENT_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MA_OTHER_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MA_OTHER_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MTAG_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_MTAG_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_ORDER_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_ORDER_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PLNT_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PLT_INSTR_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PLT_INSTR_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PRGS_CTRL_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_SHIP_ACT_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_SHIP_CFRM_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_SHIP_CFRM_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_STG_ACT_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_STG_ACT_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_STG_INSTR_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_STG_INSTR_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_XTAG_BROWSER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_XTAG_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WHITE_SPACE;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmAgentCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtUserAuthMgtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtUserAuthMgtService;
import com.globaldenso.eca0027.core.business.dao.W9004UserIdMaDao;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaAreaAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaCompAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaPlantAuthDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Service implementation class of Export Formalities by Parts MA
 * <br />Export Formalities by Parts MAのサービス実装クラス
 *
 * @author $Author: 810833613 $
 * @version $Revision: 9080 $
 */
public class W9004UserIdMaServiceImpl implements W9004UserIdMaService {

    /**
     * TmUserService
     */
    protected TmUserService tmUserService;

    /**
     * TmAgentService
     */
    protected TmAgentService tmAgentService;
    
    /**
     * CommonService
     */
    protected CommonService commonService;

    /**
     * TmNxsCompService
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * TtUserAuthMgtService
     */
    protected TtUserAuthMgtService ttUserAuthMgtService;
    
    /**
     * TmUserConfService
     */
    protected TmUserConfService tmUserConfService;
    
    /**
     * W9004UserIdMaDao
     */
    protected W9004UserIdMaDao w9004UserIdMaDao;
    
    /**
     * constructor.
     *
     */
    public W9004UserIdMaServiceImpl() {
    }

    /**
     * Setter method for tmUserService.
     *
     * @param tmUserService Set for tmUserService
     */
    public void setTmUserService(TmUserService tmUserService) {
        this.tmUserService = tmUserService;
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
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * Setter method for ttUserAuthMgtService.
     *
     * @param ttUserAuthMgtService Set for ttUserAuthMgtService
     */
    public void setTtUserAuthMgtService(TtUserAuthMgtService ttUserAuthMgtService) {
        this.ttUserAuthMgtService = ttUserAuthMgtService;
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
     * Setter method for w9004UserIdMaDao.
     *
     * @param userIdMaDao Set for w9004UserIdMaDao
     */
    public void setW9004UserIdMaDao(W9004UserIdMaDao userIdMaDao) {
        w9004UserIdMaDao = userIdMaDao;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#deleteOnInquiryDelete(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public void deleteOnInquiryDelete(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getDscId();
        Date lastUpdate = criteria.getLastUpdate();
        String timeZone = criteria.getTimeZone();

        // Lock for User Group Master
        List<? extends W9004UserIdMaDomain> lockList = w9004UserIdMaDao.lockByNoWaitTmUser(criteria);
        if (lockList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        // Delete for User Group Master
        TmUserDomain domain = new TmUserDomain();
        Date nowDt = DateUtil.convertTime(new Date(), timeZone);
        domain.setDeleteDt(nowDt);
        domain.setLastUpdate(nowDt);
        TmUserCriteriaDomain criteriaDomain = new TmUserCriteriaDomain();
        criteriaDomain.setDscId(dscId);
        criteriaDomain.setLastUpdate(lastUpdate);
        int deleteCount = tmUserService.updateByCondition(domain, criteriaDomain);
        criteria.setDeleteCount(String.valueOf(deleteCount));
        
        // Delete for User Auth Manage
        TtUserAuthMgtCriteriaDomain searchDomain = new TtUserAuthMgtCriteriaDomain();
        searchDomain.setDscId(dscId);
        searchDomain.setSearchCountCheckFlg(false);
        if (ttUserAuthMgtService.searchCount(searchDomain) > 0) {
            ttUserAuthMgtService.deleteByCondition(searchDomain);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public List<? extends W9004UserIdMaItemDomain> searchForPagingOnInquirySearch(W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        
        W9004UserIdMaCriteriaDomain pageCriteria = createCriteria(criteria);
        // Escape User name.
        pageCriteria.setUsrNmEn(StringUtil.getSQLEscapeString(criteria.getUsrNmEn()));
        
        // Get the number of data search results. 
        // 検索件数の取得
        int count = w9004UserIdMaDao.searchCountForPagingTmUserId(pageCriteria);
        
        setPageInfo(criteria.getPageInfoCreator(), count, pageCriteria);
        
        // Get the search result data. 
        // 検索結果
        return w9004UserIdMaDao.searchForPagingTmUserId(pageCriteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public W9004UserIdMaDomain searchOnEditInit(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {
        String prmDscId = criteria.getPrmDscId();  
        W9004UserIdMaDomain retDomain = new W9004UserIdMaDomain();
        String mode = criteria.getMode();
        retDomain.setMode(mode);
        
        if (MODE_EDIT.equals(mode)) {
            setEditInfo(criteria, retDomain);
        } else if (MODE_REF.equals(mode)) {
            // Get the user information from the User Group Master.
            w9004UserIdMaDao.searchCountTmUser(criteria);
            W9004UserIdMaDomain userInfoDomain = w9004UserIdMaDao.searchTmUser(criteria);
            
            //Get local and regional authority Adm function use the authority of user information.
            // ユーザの地域管理者権限・地域機能利用権限情報を取得
            List<? extends W9004UserIdMaDomain> userAreaAuthList = w9004UserIdMaDao.searchTtUserAuthMgtByArea(criteria);
            
            // Get the authorization possible company. (Reference mode)
            // 入力(会社権限)エリアに表示する会社を取得
            criteria.setAuthDscId(prmDscId);
            List<? extends W9004UserIdMaDomain> refCompAuthList = w9004UserIdMaDao.searchTtUserAuthMgtReferModeByCompany(criteria);
            
            // Get company Adm authority and company functions use the authority of user information
            // ユーザの会社管理者権限・会社機能利用権限情報を取得
            List<? extends W9004UserIdMaDomain> userCompAuthList = searchTtUserAuthMgtByComp(criteria, false, null, refCompAuthList);
            
            // Get the authorization possible company. (Reference mode)
            // 入力(工場権限)エリアに表示する工場を取得
            criteria.setAuthDscId(prmDscId);
            List<? extends W9004UserIdMaDomain> refPlantAuthList = w9004UserIdMaDao.searchTtUserAuthMgtReferModeByPlant(criteria);
            
            // Get factory Adm authority and function factory use authority information of user.
            // ユーザの工場管理者権限・工場機能利用権限情報を取得
            List<? extends W9004UserIdMaDomain> userPlantAuthList = searchTtUserAuthMgtByPlant(criteria, false, null, refPlantAuthList);
            
            retDomain.setDscId(userInfoDomain.getDscId());
            retDomain.setUsrNmEn(userInfoDomain.getUsrNmEn());
            retDomain.setMailAdd1(userInfoDomain.getMailAdd1());
            retDomain.setAuthMgtComp(userInfoDomain.getCompCd());
            retDomain.setPrmDscId(userInfoDomain.getDscId());
            
            W9004UserIdMaAreaAuthDomain areaAuthDomain = new W9004UserIdMaAreaAuthDomain();
            // Set the check box of the area authority area 
            setCheckBoxAreaAuth(userAreaAuthList, areaAuthDomain);
            // Set areaAuthDomain. 
            retDomain.setAreaAuthDomain(areaAuthDomain);
            
            // Set the corporate authority area 
            // 会社権限エリア
            List<W9004UserIdMaCompAuthDomain> compAuthList = new ArrayList<W9004UserIdMaCompAuthDomain>();
            for (W9004UserIdMaDomain comp : refCompAuthList) {
                W9004UserIdMaCompAuthDomain compDomain = new W9004UserIdMaCompAuthDomain();
                setCompAuthDomain(userCompAuthList, compDomain, comp.getAuthMgtComp());
                compAuthList.add(compDomain);
            }
            retDomain.setCompAuthList(compAuthList);
            // Set the factory-set domain authority area 
            // 工場権限エリア
            List<W9004UserIdMaPlantAuthDomain> planAuthList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
            for (W9004UserIdMaDomain plant : refPlantAuthList) {
                W9004UserIdMaPlantAuthDomain plantDomain = new W9004UserIdMaPlantAuthDomain();
                setPlntAuthDomain(userPlantAuthList, plantDomain, plant.getAuthMgtComp(), plant.getAuthDataFrom());
                planAuthList.add(plantDomain);
            }
            retDomain.setPlantAuthList(planAuthList);
            
            retDomain.setUserAreaAuthList(userAreaAuthList);
            retDomain.setLoginCompAuthList(refCompAuthList);
            retDomain.setUserCompAuthList(userCompAuthList);
            retDomain.setLoginPlantAuthList(refPlantAuthList);
            retDomain.setUserPlantAuthList(userPlantAuthList);
        }
        return retDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#searchOnEditRefer(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public W9004UserIdMaDomain searchOnEditRefer(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {
        String dscId = criteria.getDscId();
        String usrNmEn = criteria.getUsrNmEn();
        String mailAdd = criteria.getMailAdd1();
        String compCd = criteria.getCompCd();
        
        String loginUserDscId = criteria.getLoginUserDscId(); 
        
        W9004UserIdMaDomain rtnDomain = new W9004UserIdMaDomain();
        
        // Get information of LoginUser area's Adm 
        // ログイン者の地域管理者情報を取得
        List<? extends TtUserAuthMgtDomain> ttUserAuthMgtDomainList = getLoginUserAreaMgtInfo(loginUserDscId);
        
        List<? extends TmNxsCompDomain> allCompList = new ArrayList<TmNxsCompDomain>();
        List<? extends W9004UserIdMaDomain> allPlantList = new ArrayList<W9004UserIdMaDomain>();
        if (ttUserAuthMgtDomainList.size() > 0) {
            // Get all companies.
            TmNxsCompCriteriaDomain allCompDomain = new TmNxsCompCriteriaDomain();
            allCompDomain.setShipperFlg(FLAG_Y);
            allCompDomain.setPreferredOrder("COMP_CD");
            allCompList = tmNxsCompService.searchByCondition(allCompDomain);
            
            // Get all factories.
            allPlantList = w9004UserIdMaDao.searchTmNxsCompByPlant(criteria);
        }
        // Get company that LoginUser can give the authorization.
        // ログイン者が権限付与可能な会社を取得
        List<? extends W9004UserIdMaDomain> loginCompAuthList = getLoginCompAuthList(loginUserDscId);
        // Get factory that LoginUser can give the authorization.
        // ログイン者が権限付与可能な工場を取得
        List<? extends W9004UserIdMaDomain> loginPlantAuthList = getLoginPlantAuthList(loginUserDscId);
        // Get the proxy request based companies and the features that are proxy request.
        // Companyの会社コードに代行依頼されている代行依頼元会社・機能を取得
        List<? extends TmAgentDomain> tmAgentList = getUserCompAgencyList(compCd);
        
        rtnDomain.setDscId(dscId);
        rtnDomain.setUsrNmEn(usrNmEn);
        rtnDomain.setMailAdd1(mailAdd);
        rtnDomain.setAuthMgtComp(compCd);
        rtnDomain.setPrmDscId(dscId);
        
        W9004UserIdMaAreaAuthDomain areaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        // Set data to the corporate authority area in User ID MA Inquiry screen. 
        // 会社権限エリア
        List<W9004UserIdMaCompAuthDomain> compAuthList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        if (ttUserAuthMgtDomainList.size() >= 1) {
            for (TmNxsCompDomain comp : allCompList) {
                W9004UserIdMaCompAuthDomain compDomain = new W9004UserIdMaCompAuthDomain();
                compDomain.setCompCd(comp.getCompCd());
                compAuthList.add(compDomain);
            }
        } else {
            for (W9004UserIdMaDomain comp : loginCompAuthList) {
                W9004UserIdMaCompAuthDomain compDomain = new W9004UserIdMaCompAuthDomain();
                compDomain.setCompCd(comp.getAuthMgtComp());
                compAuthList.add(compDomain);
            }
        }
        
        // Set data to the factory authority area in User ID MA Inquiry screen. 
        // 工場権限エリア
        List<W9004UserIdMaPlantAuthDomain> planAuthList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        if (ttUserAuthMgtDomainList.size() >= 1) {
            for (W9004UserIdMaDomain plant : allPlantList) {
                W9004UserIdMaPlantAuthDomain plantDomain = new W9004UserIdMaPlantAuthDomain();
                plantDomain.setCompCd(plant.getCompCd());
                plantDomain.setPlantCd(plant.getPlntCd());
                planAuthList.add(plantDomain);
            }
        } else {
            String preCompCd = "";
            String prePlntCd = "";
            for (W9004UserIdMaDomain plant : loginPlantAuthList) {
                if (preCompCd.equals(plant.getAuthMgtComp()) && prePlntCd.equals(plant.getAuthDataFrom())) {
                    continue;
                }
                preCompCd = plant.getAuthMgtComp();
                prePlntCd = plant.getAuthDataFrom();
                
                W9004UserIdMaPlantAuthDomain plantDomain = new W9004UserIdMaPlantAuthDomain();
                plantDomain.setCompCd(plant.getAuthMgtComp());
                plantDomain.setPlantCd(plant.getAuthDataFrom());
                planAuthList.add(plantDomain);
            }
        }
        
        W9004UserIdMaDomain userInfoDomain = new W9004UserIdMaDomain();
        userInfoDomain.setCompCd(compCd);   // 【6】Company
        // Set the active control of local authority area.
        // 地域権限エリア
        setEnabledAreaAuth(ttUserAuthMgtDomainList, areaAuthDomain);
        // Set the active control of corporate authority area.
        // 会社権限エリア
        setEnabledCompAuth(userInfoDomain, loginCompAuthList, tmAgentList, compAuthList);
        // Set the active control of the factory authority area.
        // 工場権限エリア
        setEnabledPlntAuth(userInfoDomain, loginPlantAuthList, tmAgentList, planAuthList);
        
        rtnDomain.setAreaAuthDomain(areaAuthDomain);
        rtnDomain.setCompAuthList(compAuthList);
        rtnDomain.setPlantAuthList(planAuthList);
        
        rtnDomain.setLoginAreaMgtDomainList(ttUserAuthMgtDomainList);
        rtnDomain.setAllCompList(allCompList);
        rtnDomain.setAllPlantLis(allPlantList);
        rtnDomain.setLoginCompAuthList(loginCompAuthList);
        rtnDomain.setLoginPlantAuthList(loginPlantAuthList);
        rtnDomain.setTmAgentList(tmAgentList);
        
        return rtnDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#searchOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public W9004UserIdMaDomain searchOnEditRegister(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {

        // Search after the registration in the update mode of the initial display.
        // 初期表示処理の4.検索データの取得(修正モードの場合)を行う
        W9004UserIdMaDomain retDomain = new W9004UserIdMaDomain();
        setEditInfo(criteria, retDomain);
        return retDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#transactOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public void transactOnEditRegister(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {

        String dscId        = criteria.getDscId();            
        String usrNmEn      = criteria.getUsrNmEn();  
        String mailAdd      = criteria.getMailAdd1();     
        String compCd       = criteria.getCompCd();     
        String timezone     = criteria.getTimeZone();    
        Date lastUpdate = criteria.getLastUpdate();       

        Date nowDate = DateUtil.convertTime(new Date(), timezone);
        Timestamp nowTimestamp = new Timestamp(nowDate.getTime());
        
        W9004UserIdMaAreaAuthDomain areaAuthDomain = criteria.getAreaAuthDomain();      
        List<W9004UserIdMaCompAuthDomain> compAuthList   = criteria.getCompAuthList();  
        List<W9004UserIdMaPlantAuthDomain> plantAuthList = criteria.getPlantAuthList(); 

        if (MODE_EDIT.equals(criteria.getMode())) {
            List<? extends W9004UserIdMaDomain> userIdMaList = w9004UserIdMaDao.lockByNoWaitTtUserAuthMgtByDscId(criteria);
            if (userIdMaList == null || userIdMaList.isEmpty()) {
                throw new GscmApplicationException(GSCM_E0_0010);
            }
        }
        
        if (MODE_NEW.equals(criteria.getMode())) {
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(compCd);
            TmNxsCompDomain insInfoDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            
            if (searchCountTmUserByDscId(dscId) == 0) {
                // Set create data to TM_USER_CONF
                TmUserConfDomain userConfDomain = new TmUserConfDomain();
                userConfDomain.setDscId(dscId);    
                userConfDomain.setCompCd(compCd);  
                userConfDomain.setUserLngCd(insInfoDomain.getLngCd());
                userConfDomain.setTimezoneId(insInfoDomain.getTimezoneId());
                userConfDomain.setComCreateTimestamp(nowTimestamp);
                userConfDomain.setComUpdateTimestamp(nowTimestamp);
                commonService.setCommonPropertyForRegist(userConfDomain, SCREEN_ID_W9005);
                // Create TM_USER_CONF
                try {
                    tmUserConfService.create(userConfDomain);
                } catch (IntegrationLayerException e) {
                    if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                        throw new GscmApplicationException(GSCM_E0_0020);
                    }
                    throw e;
                }
                
                // Set create data to TM_USER
                TmUserDomain userDomain = new TmUserDomain();
                userDomain.setUsrNmEn(usrNmEn);
                userDomain.setMailAdd1(mailAdd);
                userDomain.setDscId(dscId);
                userDomain.setGrpCompCd(WHITE_SPACE);
                userDomain.setLastUpdate(nowDate);
                // Create TM_USER
                try {
                    tmUserService.create(userDomain);
                } catch (IntegrationLayerException e) {
                    if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                        throw new GscmApplicationException(GSCM_E0_0020);
                    }
                    throw e;
                }
                criteria.setCreateCount("1");
            } else {
                // Set update data to TM_USER_CONF
                TmUserConfDomain userConfDomain = new TmUserConfDomain();
                userConfDomain.setCompCd(compCd);       
                userConfDomain.setUserLngCd(insInfoDomain.getLngCd());
                userConfDomain.setTimezoneId(insInfoDomain.getTimezoneId());
                userConfDomain.setComUpdateTimestamp(nowTimestamp);
                commonService.setCommonPropertyForUpdate(userConfDomain, SCREEN_ID_W9005);
                // Set criteria to TM_USER_CONF
                TmUserConfCriteriaDomain userConfCriteria = new TmUserConfCriteriaDomain();
                userConfCriteria.setDscId(dscId);
                // Update TM_USER_CONF
                tmUserConfService.updateByCondition(userConfDomain, userConfCriteria);
                 
                // Set update data to TM_USER
                W9004UserIdMaDomain userDomain = new W9004UserIdMaDomain();
                userDomain.setUsrNmEn(usrNmEn);
                userDomain.setGrpCompCd(WHITE_SPACE);
                userDomain.setMailAdd1(mailAdd);
                userDomain.setLastUpdate(nowDate);
                // Set criteria to TM_USER
                W9004UserIdMaCriteriaDomain userCriteria = new W9004UserIdMaCriteriaDomain();
                userCriteria.setDscId(dscId);
                
                // Update TM_USER
                int updateCount = w9004UserIdMaDao.updateTmUser(userDomain, userCriteria);
                criteria.setCreateCount(String.valueOf(updateCount));
            }
            
        } else if (MODE_EDIT.equals(criteria.getMode())) {
            TmUserDomain updDomain = new TmUserDomain();
            updDomain.setUsrNmEn(usrNmEn);
            updDomain.setMailAdd1(mailAdd);
            updDomain.setLastUpdate(nowDate);
            
            TmUserCriteriaDomain updCriteriaDomain = new TmUserCriteriaDomain();
            updCriteriaDomain.setDscId(dscId);
            updCriteriaDomain.setLastUpdate(lastUpdate);
            // Update data of the User master table.
            // ユーザ集約原単位 更新
            int updateCount = tmUserService.updateByCondition(updDomain, updCriteriaDomain);
            criteria.setUpdateCount(String.valueOf(updateCount));
        }

        // Area Admin
        if (areaAuthDomain != null) {
            // Area admin
            traAuthOfOne(dscId, timezone, ROLE_AREA_ADMIN, WHITE_SPACE, AUTH_DATA_TYP_PLNT_CD
                , WHITE_SPACE, WHITE_SPACE, areaAuthDomain.getRegAdmRole());
            
            // Area refer/register
            traAuthToRefTheUpd(dscId, timezone, ROLE_AREA_BROWSER, ROLE_AREA_REGISTER, WHITE_SPACE
                , AUTH_DATA_TYP_PLNT_CD, WHITE_SPACE, WHITE_SPACE, areaAuthDomain.getBrowseAllRole(), areaAuthDomain.getRegisterAllRole());
        }
        
        // company area
        if (compAuthList != null) {
            for (W9004UserIdMaCompAuthDomain compAuthDomain : compAuthList) {
                // Company admin
                traAuthOfOne(dscId, timezone, ROLE_COMP_ADMIN, compAuthDomain.getCompCd(), AUTH_DATA_TYP_PLNT_CD
                    , WHITE_SPACE, WHITE_SPACE, compAuthDomain.getComAdmRole());
                
                // BHT Lock
                traAuthOfOne(dscId, timezone, ROLE_BHT_LOCK, compAuthDomain.getCompCd(), AUTH_DATA_TYP_PLNT_CD
                    , WHITE_SPACE, WHITE_SPACE, compAuthDomain.getBhtLockAutRole());

                // MA Agent refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_MA_AGENT_BROWSER, ROLE_MA_AGENT_REGISTER, compAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, WHITE_SPACE, WHITE_SPACE, compAuthDomain.getMaAgentBRole(), compAuthDomain.getMaAgentRRole());

                // MA Other refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_MA_OTHER_BROWSER, ROLE_MA_OTHER_REGISTER, compAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, WHITE_SPACE, WHITE_SPACE, compAuthDomain.getMaOtherBRole(), compAuthDomain.getMaOtherRRole());

                // Doc. register
                traAuthOfOne(dscId, timezone, ROLE_DOC_REGISTER, compAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, WHITE_SPACE, WHITE_SPACE, compAuthDomain.getDocRRole());
                
                // Ship act. register
                traAuthOfOne(dscId, timezone, ROLE_SHIP_ACT_REGISTER, compAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, WHITE_SPACE, WHITE_SPACE, compAuthDomain.getShipActRRole());
            }
        }
        // plant area
        if (plantAuthList != null) {
            for (W9004UserIdMaPlantAuthDomain plantAuthDomain : plantAuthList) {
                // plant admin
                traAuthOfOne(dscId, timezone, ROLE_PLNT_ADMIN, plantAuthDomain.getCompCd(), AUTH_DATA_TYP_PLNT_CD
                    , plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getPlnAdmRole());
                
                // Exp req. refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_EXP_REQ_BROWSER, ROLE_EXP_REQ_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getExpReqBRole(), plantAuthDomain.getExpReqRRole());
                
                // Exp PKG. refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_EXP_PKG_BROWSER, ROLE_EXP_PKG_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getReqPkgBRole(), plantAuthDomain.getReqPkgRRole());
                
                // ERT refer
                traAuthToRefTheUpd(dscId, timezone, ROLE_ERT_BROWSER, ROLE_ERT_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getErtBRole(), plantAuthDomain.getErtRRole());
                
                // order refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_ORDER_BROWSER, ROLE_ORDER_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getOrderBRole(), plantAuthDomain.getOrderRRole());
                
                // Pltz Instr refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_PLT_INSTR_BROWSER, ROLE_PLT_INSTR_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getPltInstrBRole(), plantAuthDomain.getPltInstrRRole());
                
                // M-Tag refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_MTAG_BROWSER, ROLE_MTAG_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getMtagBRole(), plantAuthDomain.getMtagRRole());
                
                // CML refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_CML_BROWSER, ROLE_CML_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getCmlBRole(), plantAuthDomain.getCmlRRole());
                
                // X-Tag refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_XTAG_BROWSER, ROLE_XTAG_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getXtagBRole(), plantAuthDomain.getXtagRRole());
                
                // Carry out refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_CARRY_OUT_BROWSER, ROLE_CARRY_OUT_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getCarryOutInBRole(), plantAuthDomain.getCarryOutInRRole());
                
                // Stg Instr refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_STG_INSTR_BROWSER, ROLE_STG_INSTR_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getStgInstrBRole(), plantAuthDomain.getStgInstrRRole());
                
                // Stg act refer/register
                traAuthToRefTheUpd(dscId, timezone, ROLE_STG_ACT_BROWSER, ROLE_STG_ACT_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getStgActBRole(), plantAuthDomain.getStgActRRole());
                
                // Ship confirm refer
                traAuthToRefTheUpd(dscId, timezone, ROLE_SHIP_CFRM_BROWSER, ROLE_SHIP_CFRM_REGISTER, plantAuthDomain.getCompCd()
                    , AUTH_DATA_TYP_PLNT_CD, plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getShipCfrmBRole(), plantAuthDomain.getShipCfrmRRole());

                // Progress control refer
                traAuthOfOne(dscId, timezone, ROLE_PRGS_CTRL_BROWSER, plantAuthDomain.getCompCd(), AUTH_DATA_TYP_PLNT_CD
                    , plantAuthDomain.getPlantCd(), WHITE_SPACE, plantAuthDomain.getPrgsCtrlBRoleRole());
            }
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#validateDatabaseCompCd(String, String)
     */
    public boolean validateDatabaseCompCd(String compCd, String mode) throws ApplicationException {
        boolean rtn = true;
        if (MODE_NEW.equals(mode)) {
            rtn = commonService.validateCompCd(compCd);
        }
        return rtn;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9004UserIdMaService#validateDatabaseTmMenuUseAuthCnfOnEditRefer(com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain)
     */
    public boolean validateDatabaseTmMenuUseAuthCnfOnEditRefer(W9004UserIdMaCriteriaDomain criteria) throws ApplicationException {

        String ownerCompCd      = criteria.getOwnerCompCd();    
        String compCd           = criteria.getCompCd();        
        String loginUserDscId   = criteria.getLoginUserDscId();  
        
        boolean rtn = false;
        
        if (StringUtil.getEmptyToBlank(ownerCompCd).equals(compCd)) {
            rtn = true;
        } else {
            TtUserAuthMgtCriteriaDomain authMgtCriteriaDomain = new TtUserAuthMgtCriteriaDomain();
            authMgtCriteriaDomain.setDscId(loginUserDscId);
            List<TtUserAuthMgtDomain> authList = ttUserAuthMgtService.searchByCondition(authMgtCriteriaDomain);
            for (TtUserAuthMgtDomain dm : authList) {
                if (ROLE_AREA_ADMIN.equals(dm.getRole())) {
                    rtn = true;
                    break;
                }
            }
        }
        
        return rtn;
    }

    /**
     * Registration and deletion of the authority of the ability to have a reference authority and update authority
     * <br />参照権限・更新権限を持つ機能の権限の登録・削除
     *
     * @param prmDscId Takeover VALUE DSC-ID<br />
     * 引継値DSC-ID
     * @param timezone TIMEZONE ID<br />
     * タイムゾーンID
     * @param roleRef ROLE (see)<br />
     * 役割(参照)
     * @param roleEdit ROLE (updated)<br />
     * 役割(更新)
     * @param authMgtComp AUTHORITY MANAGEMENT COMPANY<br />
     * 権限付与会社
     * @param authDataTyp PLANT CODE<br />
     * 製造部工場区分
     * @param authDataFrom Authorization from the production department<br />
     * 権限付与製造部from
     * @param authDataTo Authorization to manufacture parts<br />
     * 権限付与製造部to
     * @param checkRef Check box (see)<br />
     * チェックボックス(参照)
     * @param checkEdit Check box (Updated)<br />
     * チェックボックス(更新)
     * @throws ApplicationException If the operation is not successful<br />
     * 処理に失敗した場合
     */
    protected void traAuthToRefTheUpd(String prmDscId, String timezone, String roleRef, String roleEdit
        , String authMgtComp, String authDataTyp, String authDataFrom, String authDataTo, String checkRef, String checkEdit)
        throws ApplicationException {
        
        // Get the presence or absence of authority from the User Auth Manage table.
        // ユーザー利用権限管理テーブルから権限(参照)の有無を取得する
        int authCntRef = getTmUserAuthMgtByAuthCnt(prmDscId, roleRef, authMgtComp, authDataTyp, authDataFrom, authDataTo);
        // Get the presence or absence of authority from the User Auth Manage table.
        // .ユーザー利用権限管理テーブルから権限(更新)の有無を取得する
        int authCntEdit = getTmUserAuthMgtByAuthCnt(prmDscId, roleEdit, authMgtComp, authDataTyp, authDataFrom, authDataTo);
        
        if (CHECK_ON.equals(checkRef) && (!CHECK_ON.equals(checkEdit))) {
            
            if (authCntRef == 0 && authCntEdit == 0 ) {
                // Set data to the User Auth Manage table.
                // 参照権限登録
                insTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom, timezone);
                
            } else if (authCntRef == 0 && authCntEdit == 1 ) {
                // Set data to the User Auth Manage.
                // (1)参照権限登録
                insTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom, timezone);
                // Lock data of the User Auth Manage table.
                // (2)対象データをロック
                lockTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom);
                // Delete data from the User Auth Manage table.
                // (3)更新権限削除(PKを利用する)
                delTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom);
                
            }
            
        } else if (CHECK_ON.equals(checkEdit)) {

            if (authCntRef == 0 && authCntEdit == 0 ) {
                // Set data to the User Auth Manage.
                // 更新権限登録
                insTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom, timezone);
                
            } else if (authCntRef == 1 && authCntEdit == 0 ) {
                // Lock data of the User Auth Manage table.
                // (1)削除対象データをロック
                lockTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom);
                // Delete data from the User Auth Manage table.
                // (2)削除(PKを利用する)
                delTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom);
                // Set data to the User Auth Manage.
                // (3)更新権限登録
                insTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom, timezone);
            }

        } else if ((!CHECK_ON.equals(checkRef)) && (!CHECK_ON.equals(checkEdit))) {
            
            if (authCntRef >= 1) {
                // Lock data of the User Auth Manage table.
                // (1)削除対象データをロック
                lockTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom);
                // Delete data from the User Auth Manage table.
                // (2)削除(PKを利用する)
                delTtUserAuthMgt(prmDscId, roleRef, authMgtComp, authDataFrom);
                
            } else if (authCntEdit >= 1) {
                // Lock data of the User Auth Manage table.
                // (1)削除対象データをロック
                lockTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom);
                // Delete data from the User Auth Manage table.
                // (2)削除(PKを利用する)
                delTtUserAuthMgt(prmDscId, roleEdit, authMgtComp, authDataFrom);
            }
        }
    }

    /**
     * Registration and deletion of the authority of the features that have the authority of one
     * <br />1種類の権限を持つ機能の権限の登録・削除
     *
     * @param dscId Screen DSC-ID<br />
     * 画面DSC-ID
     * @param timezone TIMEZONE ID<br />
     * タイムゾーンID
     * @param role ROLE<br />
     * 役割
     * @param authMgtComp AUTHORITY MANAGEMENT COMPANY<br />
     * 権限付与会社 
     * @param authDataTyp PLANT CODE<br />
     * 製造部工場区分
     * @param authDataFrom Authorization from the production department<br />
     * 権限付与製造部from
     * @param authDataTo Authorization to manufacture parts<br />
     * 権限付与製造部to
     * @param checkbox Authority check box to be processed<br />
     * 処理対象の権限チェックボックス
     * @throws ApplicationException If the operation is not successful<br />
     * 処理に失敗した場合
     */
    protected void traAuthOfOne(String dscId, String timezone, String role, String authMgtComp, String authDataTyp
        , String authDataFrom, String authDataTo, String checkbox) 
        throws ApplicationException {
        
        // Get the presence or absence of authority from the User Auth Manage table.
        // ユーザ利用権限管理テーブルから権限の有無を取得する
        int authCnt = getTmUserAuthMgtByAuthCnt(dscId, role, authMgtComp, authDataTyp, authDataFrom, authDataTo);
        
        if (CHECK_ON.equals(checkbox) && authCnt == 0 ) {
            // Set data to the User Auth Manage.
            // 処理パターンの項目がチェックON、かつ、上記(3.3.1.1.)の取得件数=0件の場合、登録
            insTtUserAuthMgt(dscId, role, authMgtComp, authDataFrom, timezone);
            
        } else if ((!CHECK_ON.equals(checkbox)) && authCnt > 0 ) {
            // Lock data of the User Auth Manage table.
            // (1)ユーザー利用権限管理の削除対象データをロック
            lockTtUserAuthMgt(dscId, role, authMgtComp, authDataFrom);
            // Delete data from the User Auth Manage table.
            // (2)ユーザー利用権限管理の削除(PKを利用する)
            delTtUserAuthMgt(dscId, role, authMgtComp, authDataFrom);
        }
    }

    /**
     * Authority of the features that have the authority of one: get the presence or absence of authority from the User Auth Manage table
     * <br />ユーザ利用権限管理テーブルから権限の有無を取得：1種類の権限を持つ機能の権限
     *
     * @param dscId DSC-ID
     * @param role ROLE of case processing<br />
     * 処理ケースの役割
     * @param comp AUTHORITY MANAGEMENT COMPANY processing of case<br />
     * 処理ケースの権限付与会社
     * @param typ PLANT CODE<br />
     * 製造部工場区分
     * @param from Authorization from the production department<br />
     * 権限付与製造部from
     * @param to AuthDataTo Authorization to manufacture parts<br />
     * 権限付与製造部to
     * @throws ApplicationException If it fails to search<br />
     * 検索に失敗した場合
     * @return Search number<br />
     * 検索件数
     */
    protected int getTmUserAuthMgtByAuthCnt(String dscId, String role, String comp, String typ, String from, String to) 
        throws ApplicationException {
        
        TtUserAuthMgtCriteriaDomain ttUserAuthMgtCriteriaDomain = new TtUserAuthMgtCriteriaDomain();
        ttUserAuthMgtCriteriaDomain.setDscId(dscId);
        ttUserAuthMgtCriteriaDomain.setRole(role);
        ttUserAuthMgtCriteriaDomain.setAuthMgtComp(comp);
        ttUserAuthMgtCriteriaDomain.setAuthDataTyp(typ);
        ttUserAuthMgtCriteriaDomain.setAuthDataFrom(from);
        ttUserAuthMgtCriteriaDomain.setAuthDataTo(to);
        
        ttUserAuthMgtCriteriaDomain.setSearchCountCheckFlg(false);
        return ttUserAuthMgtService.searchCount(ttUserAuthMgtCriteriaDomain);
    }

    /**
     * Authority of the features that have the authority of one type: registration of User Auth Manage
     * <br />ユーザ利用権限管理の登録：1種類の権限を持つ機能の権限
     *
     * @param dscId Screen DSC-ID<br />
     * 画面DSC-ID
     * @param role ROLE of case processing<br />
     * 処理ケースの役割
     * @param authMgtComp AUTHORITY MANAGEMENT COMPANY processing of case<br />
     * 処理ケースの権限付与会社
     * @param authDataFrom Authorization of the manufacturing process case<br />
     * 処理ケースの権限付与製造部
     * @param timezone TIMEZONE ID<br />
     * タイムゾーンID
     * @throws ApplicationException fail to register<br />
     * 登録に失敗した場合
     */
    protected void insTtUserAuthMgt(String dscId, String role, String authMgtComp, String authDataFrom, String timezone)
        throws ApplicationException {
        
        Date nowDate = DateUtil.convertTime(new Date(), timezone);
        Timestamp nowTimestamp = new Timestamp(nowDate.getTime());
        
        TtUserAuthMgtDomain insDomain = new TtUserAuthMgtDomain();
        insDomain.setDscId(dscId);
        insDomain.setRole(role);               
        insDomain.setAuthMgtComp(authMgtComp);   
        insDomain.setAuthDataTyp(AUTH_DATA_TYP_PLNT_CD);
        insDomain.setAuthDataFrom(authDataFrom);  
        insDomain.setAuthDataTo(WHITE_SPACE);
        insDomain.setExpirationDateFrom(nowDate);
        insDomain.setComCreateTimestamp(nowTimestamp);
        insDomain.setComUpdateTimestamp(nowTimestamp);
        commonService.setCommonPropertyForRegist(insDomain, SCREEN_ID_W9005);
        try {
            ttUserAuthMgtService.create(insDomain);
        } catch (IntegrationLayerException e) {
            if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                throw new GscmApplicationException(GSCM_E0_0020);
            }
            throw e;
        }
    }

    /**
     * Authority of the features that have the authority of one type: Lock of User Auth Manage
     * <br />ユーザ利用権限管理のロック：1種類の権限を持つ機能の権限
     *
     * @param dscId Screen DSC-ID<br />
     * 画面DSC-ID
     * @param role ROLE of case processing<br />
     * 処理ケースの役割
     * @param authMgtComp AUTHORITY MANAGEMENT COMPANY processing of case<br />
     * 処理ケースの権限付与会社
     * @param authDataFrom Authorization of the manufacturing process case<br />
     * 処理ケースの権限付与製造部
     * @throws ApplicationException fail to register<br />
     * 登録に失敗した場合
     */
    protected void lockTtUserAuthMgt(String dscId, String role, String authMgtComp, String authDataFrom) throws ApplicationException {
        TtUserAuthMgtCriteriaDomain lock = new TtUserAuthMgtCriteriaDomain();
        lock.setDscId(dscId);
        lock.setRole(role);                 
        lock.setAuthMgtComp(authMgtComp);   
        lock.setAuthDataTyp(AUTH_DATA_TYP_PLNT_CD);
        lock.setAuthDataFrom(authDataFrom);  
        lock.setAuthDataTo(WHITE_SPACE);
        ttUserAuthMgtService.lockByKeyNoWait(lock);
    }

    /**
     * Authority of the features that have the authority of one: Delete the User Auth Manage
     * <br />ユーザ利用権限管理の削除：1種類の権限を持つ機能の権限
     *
     * @param dscId Screen DSC-ID<br />
     * 画面DSC-ID
     * @param role ROLE of case processing<br />
     * 処理ケースの役割
     * @param authMgtComp AUTHORITY MANAGEMENT COMPANY processing of case<br />
     * 処理ケースの権限付与会社
     * @param authDataFrom Authorization of the manufacturing process case<br />
     * 処理ケースの権限付与製造部
     * @throws ApplicationException fail to register<br />
     * 登録に失敗した場合
     */
    protected void delTtUserAuthMgt(String dscId, String role, String authMgtComp, String authDataFrom)
        throws ApplicationException {
        
        TtUserAuthMgtCriteriaDomain del = new TtUserAuthMgtCriteriaDomain();
        del.setDscId(dscId);
        del.setRole(role);                
        del.setAuthMgtComp(authMgtComp);   
        del.setAuthDataTyp(AUTH_DATA_TYP_PLNT_CD);
        del.setAuthDataFrom(authDataFrom);  
        del.setAuthDataTo(WHITE_SPACE);
        ttUserAuthMgtService.deleteByCondition(del);
    }

    /**
     * Search after the registration in the update mode of the initial display
     * <br />初期表示の更新モードで登録後の再検索
     *
     * @param criteria Search Domain<br />
     * 検索Domain
     * @param retDomain Set Domain<br />
     * 設定Domain
     * @throws ApplicationException fail to find either treatment<br />
     * いずれかの検索処理に失敗した場合
     */
    protected void setEditInfo(W9004UserIdMaCriteriaDomain criteria, W9004UserIdMaDomain retDomain) 
        throws ApplicationException {
        
        String loginUserDscId = criteria.getLoginUserDscId();
        
        //  Get the view user information from the User Group Master.
        w9004UserIdMaDao.searchCountTmUser(criteria);
        W9004UserIdMaDomain userInfoDomain = w9004UserIdMaDao.searchTmUser(criteria);
        
        // Get the Administrator Authority for Login User.
        List<? extends TtUserAuthMgtDomain> ttUserAuthMgtDomainList = getLoginUserAreaMgtInfo(loginUserDscId);
        boolean areaAdminUser = false;
        if (ttUserAuthMgtDomainList == null || ttUserAuthMgtDomainList.isEmpty()) {
            areaAdminUser = false;
        } else {
            areaAdminUser = true;
        }
        
        List<? extends TmNxsCompDomain> allCompList = null;
        List<? extends W9004UserIdMaDomain> allPlantList = null;
        if (areaAdminUser) {
            // Get all company.
            TmNxsCompCriteriaDomain allcompCriteria = new TmNxsCompCriteriaDomain();
            allcompCriteria.setShipperFlg(FLAG_Y);
            allcompCriteria.setPreferredOrder("COMP_CD");
            allCompList = tmNxsCompService.searchByCondition(allcompCriteria);
            
            // Get all plants.
            allPlantList = w9004UserIdMaDao.searchTmNxsCompByPlant(criteria);
        }
        // Get Administrator Authority (Regional) for View user.
        List<? extends W9004UserIdMaDomain> userAreaAuthList = w9004UserIdMaDao.searchTtUserAuthMgtByArea(criteria);

        // Get company that LoginUser can give the authorization.
        List<? extends W9004UserIdMaDomain> loginCompAuthList = getLoginCompAuthList(loginUserDscId);
        
        // Get Administrator Authority of Company and Each Function for View user.
        List<? extends W9004UserIdMaDomain> userCompAuthList = searchTtUserAuthMgtByComp(criteria
            , areaAdminUser, allCompList, loginCompAuthList);
        
        // Get plant that LoginUser can give the authorization 
        // ログイン者が権限付与可能な工場を取得
        List<? extends W9004UserIdMaDomain> loginPlantAuthList = getLoginPlantAuthList(loginUserDscId);
        
        // Get factory Adm authority and function factory use authority information of user.
        // ユーザの工場管理者権限・工場機能利用権限情報を取得
        List<? extends W9004UserIdMaDomain> userPlantAuthList = searchTtUserAuthMgtByPlant(criteria
            , areaAdminUser, allPlantList, loginPlantAuthList);
        
        // Get the proxy request based companies and the features that are proxy request.
        // ユーザの会社に代行依頼されている代行依頼元会社・機能を取得
        List<? extends TmAgentDomain> tmAgentList = getUserCompAgencyList(userInfoDomain.getCompCd());
        
        // Set Result Domain for screen
        retDomain.setDscId(userInfoDomain.getDscId());
        retDomain.setUsrNmEn(userInfoDomain.getUsrNmEn());
        retDomain.setMailAdd1(userInfoDomain.getMailAdd1());
        retDomain.setAuthMgtComp(userInfoDomain.getCompCd());
        
        retDomain.setLastUpdate(userInfoDomain.getLastUpdate());
        retDomain.setPrmDscId(userInfoDomain.getDscId());
        
        // Set the check box of the area authority area 
        // 地域エリア
        W9004UserIdMaAreaAuthDomain areaAuthDomain = new W9004UserIdMaAreaAuthDomain();
        setCheckBoxAreaAuth(userAreaAuthList, areaAuthDomain);
        
        // Set data to the domain class of corporate authority area in User ID MA Inquiry screen. 
        // 会社権限エリア
        List<W9004UserIdMaCompAuthDomain> compAuthList = new ArrayList<W9004UserIdMaCompAuthDomain>();
        if (areaAdminUser) {
            for (TmNxsCompDomain comp : allCompList) {
                W9004UserIdMaCompAuthDomain compDomain = new W9004UserIdMaCompAuthDomain();
                setCompAuthDomain(userCompAuthList, compDomain, comp.getCompCd());
                compAuthList.add(compDomain);
            }
        } else {
            for (W9004UserIdMaDomain comp : loginCompAuthList) {
                W9004UserIdMaCompAuthDomain compDomain = new W9004UserIdMaCompAuthDomain();
                setCompAuthDomain(userCompAuthList, compDomain, comp.getAuthMgtComp());
                compAuthList.add(compDomain);
            }
        }
        
        // Set data to the factory-set domain authority area.
        // 工場権限エリア
        List<W9004UserIdMaPlantAuthDomain> planAuthList = new ArrayList<W9004UserIdMaPlantAuthDomain>();
        if (areaAdminUser) {
            for (W9004UserIdMaDomain plant : allPlantList) {
                W9004UserIdMaPlantAuthDomain plantDomain = new W9004UserIdMaPlantAuthDomain();
                setPlntAuthDomain(userPlantAuthList, plantDomain, plant.getCompCd(),  plant.getPlntCd());
                planAuthList.add(plantDomain);
            }
        } else {
            String compCd = "";
            String plntCd = "";
            for (W9004UserIdMaDomain plant : loginPlantAuthList) {
                if (compCd.equals(plant.getAuthMgtComp()) && plntCd.equals(plant.getAuthDataFrom())) {
                    continue;
                }
                compCd = plant.getAuthMgtComp();
                plntCd = plant.getAuthDataFrom();
                
                W9004UserIdMaPlantAuthDomain plantDomain = new W9004UserIdMaPlantAuthDomain();
                setPlntAuthDomain(userPlantAuthList, plantDomain, compCd, plntCd);
                planAuthList.add(plantDomain);
            }
        }
        
        // Set the check box active
        // Set the active control of local authority area.
        // 地域権限エリア
        setEnabledAreaAuth(ttUserAuthMgtDomainList, areaAuthDomain);
        // Set the active control of corporate authority area.
        // 会社権限エリア
        setEnabledCompAuth(userInfoDomain, loginCompAuthList, tmAgentList, compAuthList);
        // Set the active control of the factory authority area.
        // 工場権限エリア
        setEnabledPlntAuth(userInfoDomain, loginPlantAuthList, tmAgentList, planAuthList);
        
        retDomain.setAreaAuthDomain(areaAuthDomain);
        retDomain.setCompAuthList(compAuthList);
        retDomain.setPlantAuthList(planAuthList);
        
        retDomain.setLoginAreaMgtDomainList(ttUserAuthMgtDomainList);
        retDomain.setAllCompList(allCompList);
        retDomain.setAllPlantLis(allPlantList);
        retDomain.setUserAreaAuthList(userAreaAuthList);
        retDomain.setLoginCompAuthList(loginCompAuthList);
        retDomain.setUserCompAuthList(userCompAuthList);
        retDomain.setLoginPlantAuthList(loginPlantAuthList);
        retDomain.setUserPlantAuthList(userPlantAuthList);
        retDomain.setTmAgentList(tmAgentList);
    }

    /**
     * 
     * Get Administrator Authority of Company and Each Function for View user.
     * 
     * @param userIdMaCriteria Screen criteria domain
     * @param areaAdmin login user is Area Administrator.
     * @param allCompList Company list for login user that Area admin.
     * @param loginCompAuthList Company list for login user can Auth regist.
     * @return Administrator Authority of Company and Each Function List
     * @throws ApplicationException ApplicationException
     */
    protected List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByComp (W9004UserIdMaCriteriaDomain userIdMaCriteria
        , boolean areaAdmin, List<? extends TmNxsCompDomain> allCompList, List<? extends W9004UserIdMaDomain> loginCompAuthList) 
        throws ApplicationException {
        
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId(userIdMaCriteria.getDscId());
        
        List<String> authMgtCompList = new ArrayList<String>();
        if (areaAdmin) {
            for (TmNxsCompDomain compDomain : allCompList) {
                authMgtCompList.add(compDomain.getCompCd());
            }
        } else {
            for (W9004UserIdMaDomain compDomain : loginCompAuthList) {
                authMgtCompList.add(compDomain.getAuthMgtComp());
            }
        }
        criteria.setAuthMgtCompList(authMgtCompList);
        return w9004UserIdMaDao.searchTtUserAuthMgtByComp(criteria);
    }
    
    /**
     * 
     * Get factory Adm authority and function factory use authority information of user.
     * 
     * @param userIdMaCriteria Screen criteria domain.
     * @param areaAdmin login user is Area Administrator.
     * @param allPlantList list for login user that Area admin.
     * @param loginPlantAuthList Company list for login user can Auth regist.
     * @return factory Adm authority and function factory use authority information
     * @throws ApplicationException ApplicationException
     */
    protected List<? extends W9004UserIdMaDomain> searchTtUserAuthMgtByPlant(W9004UserIdMaCriteriaDomain userIdMaCriteria
        , boolean areaAdmin, List<? extends W9004UserIdMaDomain> allPlantList, List<? extends W9004UserIdMaDomain> loginPlantAuthList)
        throws ApplicationException {
        
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId(userIdMaCriteria.getDscId());
        
        List<String> authMgtCompList = new ArrayList<String>();
        List<String> authDataFromList = new ArrayList<String>();
        if (areaAdmin) {
            for (W9004UserIdMaDomain compDomain : allPlantList) {
                authMgtCompList.add(compDomain.getCompCd());
                authDataFromList.add(compDomain.getPlntCd());
            }
        } else {
            for (W9004UserIdMaDomain compDomain : loginPlantAuthList) {
                authMgtCompList.add(compDomain.getAuthMgtComp());
                authDataFromList.add(compDomain.getAuthDataFrom());
            }
        }
        criteria.setAuthMgtCompList(authMgtCompList);
        criteria.setAuthDataFromList(authDataFromList);
        
        return w9004UserIdMaDao.searchTtUserAuthMgtByPlant(criteria);
    }
    
    /**
     * Set the active control of the factory authority area
     * <br />工場権限エリアの活性制御を設定
     *
     * @param userInfoDomain User information<br />
     * ユーザ情報
     * @param loginPlantAuthList Login's a possible authorization factory<br />
     * ログイン者が権限付与可能な工場
     * @param tmAgentList Proxy request based company<br />
     * 代行依頼元会社
     * @param planAuthList Factory authority area list<br />
     * 工場権限エリアリスト
     */
    protected void setEnabledPlntAuth(W9004UserIdMaDomain userInfoDomain, List<? extends W9004UserIdMaDomain> loginPlantAuthList
        , List<? extends TmAgentDomain> tmAgentList, List<? extends W9004UserIdMaPlantAuthDomain> planAuthList) {
        
        for (W9004UserIdMaPlantAuthDomain dispPlntDomain : planAuthList) {
            
            dispPlntDomain.setEnabledPlnAdm(true);
            String dispComp = StringUtil.getEmptyToBlank(dispPlntDomain.getCompCd());
            String dispPlantCd = StringUtil.getEmptyToBlank(dispPlntDomain.getPlantCd());
            
            for (W9004UserIdMaDomain plntAuth : loginPlantAuthList) {
                if (ROLE_PLNT_ADMIN.equals(plntAuth.getRole()) 
                    && dispComp.equals(plntAuth.getAuthMgtComp()) 
                    && dispPlantCd.equals(plntAuth.getAuthDataFrom())) {
                    
                    if (dispComp.equals(userInfoDomain.getCompCd())) {
                        //【27】Exp Req B
                        dispPlntDomain.setEnabledExpreqB(true);
                        //【28】Exp Req R
                        dispPlntDomain.setEnabledExpreqR(true);
                        //【29】Req PKG B
                        dispPlntDomain.setEnabledReqPkgB(true);
                        //【30】Req PKG R
                        dispPlntDomain.setEnabledReqPkgR(true);
                        //【31】ERT B
                        dispPlntDomain.setEnabledErtB(true);
                        //【32】ERT R
                        dispPlntDomain.setEnabledErtR(true);
                        //【33】Order B
                        dispPlntDomain.setEnabledOrderB(true);
                        //【34】Order R
                        dispPlntDomain.setEnabledOrderR(true);
                        //【35】Plt Instr. B
                        dispPlntDomain.setEnabledPltInstrB(true);
                        //【36】Plt Instr. R
                        dispPlntDomain.setEnabledPltInstrR(true);
                        //【37】M-TAG B
                        dispPlntDomain.setEnabledMtagB(true);
                        //【38】M-TAG R
                        dispPlntDomain.setEnabledMtagR(true);
                        //【39】CML B
                        dispPlntDomain.setEnabledCmlB(true);
                        //【40】CML R
                        dispPlntDomain.setEnabledCmlR(true);
                        //【41】X-TAG B
                        dispPlntDomain.setEnabledXtagB(true);
                        //【42】X-TAG R
                        dispPlntDomain.setEnabledXtagR(true);
                        //【43】Carry Out/In B
                        dispPlntDomain.setEnabledCarryOutInB(true);
                        //【44】Carry Out/In R
                        dispPlntDomain.setEnabledCarryOutInR(true);
                        //【45】Stg Instr. B
                        dispPlntDomain.setEnabledStgInstrB(true);
                        //【46】Stg Instr. R
                        dispPlntDomain.setEnabledStgInstrR(true);
                        //【47】Stg Act. B
                        dispPlntDomain.setEnabledStgActB(true);
                        //【48】Stg Act. R
                        dispPlntDomain.setEnabledStgActR(true);
                        //【49】Ship Cfrm B
                        dispPlntDomain.setEnabledShipCfrmB(true);
                        //【50】Ship Cfrm R
                        dispPlntDomain.setEnabledShipCfrmR(true);
                        //【51】PRGS Ctrl B
                        dispPlntDomain.setEnabledPrgsCtrlB(true);
                        break;
                    }
                    
                    for (TmAgentDomain tmAgent : tmAgentList) {
                        if (dispComp.equals(tmAgent.getOrgCompCd())) {
                            
                            if (FLAG_Y.equals(tmAgent.getExpRequestAuthFlg())) {
                                //【27】Exp Req B
                                dispPlntDomain.setEnabledExpreqB(true);
                                //【28】Exp Req R
                                dispPlntDomain.setEnabledExpreqR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getExpRequestPkgAuthFlg())) {
                                //【29】Req PKG B
                                dispPlntDomain.setEnabledReqPkgB(true);
                                //【30】Req PKG R
                                dispPlntDomain.setEnabledReqPkgR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getErtAuthFlg())) {
                                //【31】ERT B
                                dispPlntDomain.setEnabledErtB(true);
                                //【32】ERT R
                                dispPlntDomain.setEnabledErtR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getRcvOdrAuthFlg())) {
                                //【33】Order B
                                dispPlntDomain.setEnabledOrderB(true);
                                //【34】Order R
                                dispPlntDomain.setEnabledOrderR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getPltzInstrAuthFlg())) {
                                //【35】Plt Instr. B
                                dispPlntDomain.setEnabledPltInstrB(true);
                                //【36】Plt Instr. R
                                dispPlntDomain.setEnabledPltInstrR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getMixTagAuthFlg())) {
                                //【37】M-TAG B
                                dispPlntDomain.setEnabledMtagB(true);
                                //【38】M-TAG R
                                dispPlntDomain.setEnabledMtagR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getCmlAuthFlg())) {
                                //【39】CML B
                                dispPlntDomain.setEnabledCmlB(true);
                                //【40】CML R
                                dispPlntDomain.setEnabledCmlR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getXtagAuthFlg())) {
                                //【41】X-TAG B
                                dispPlntDomain.setEnabledXtagB(true);
                                //【42】X-TAG R
                                dispPlntDomain.setEnabledXtagR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getTrAuthFlg())) {
                                //【43】Carry Out/In B
                                dispPlntDomain.setEnabledCarryOutInB(true);
                                //【44】Carry Out/In R
                                dispPlntDomain.setEnabledCarryOutInR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getStgInstrAuthFlg())) {
                                //【45】Stg Instr. B
                                dispPlntDomain.setEnabledStgInstrB(true);
                                //【46】Stg Instr. R
                                dispPlntDomain.setEnabledStgInstrR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getStgActAuthFlg())) {
                                //【47】Stg Act. B
                                dispPlntDomain.setEnabledStgActB(true);
                                //【48】Stg Act. R
                                dispPlntDomain.setEnabledStgActR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getShippingFirmAuthFlg())) {
                                //【49】Ship Cfrm B
                                dispPlntDomain.setEnabledShipCfrmB(true);
                                //【50】Ship Cfrm R
                                dispPlntDomain.setEnabledShipCfrmR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getProgControlAuthFlg())) {
                                //【51】PRGS Ctrl B
                                dispPlntDomain.setEnabledPrgsCtrlB(true);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Set the active control of corporate authority area
     * <br />会社権限エリアの活性制御を設定
     *
     * @param userInfoDomain User information<br />
     * ユーザ情報
     * @param loginCompAuthList Login's a possible authorization company<br />
     * ログイン者が権限付与可能な会社
     * @param tmAgentList Proxy request based company<br />
     * 代行依頼元会社
     * @param compAuthList Corporate authority area list<br />
     * 会社権限エリアリスト
     */
    protected void setEnabledCompAuth(W9004UserIdMaDomain userInfoDomain, List<? extends W9004UserIdMaDomain> loginCompAuthList
        , List<? extends TmAgentDomain> tmAgentList, List<? extends W9004UserIdMaCompAuthDomain> compAuthList) {
        for (W9004UserIdMaCompAuthDomain dispCompDomain : compAuthList) {
            
            dispCompDomain.setEnabledComAdm(true);
            String dispComp = StringUtil.getEmptyToBlank(dispCompDomain.getCompCd());
            
            for (W9004UserIdMaDomain compAuth : loginCompAuthList) {
                if (dispComp.equals(compAuth.getAuthMgtComp())) {
                    if (dispComp.equals(userInfoDomain.getCompCd())) {
                        //【16】BHT Lock Aut.
                        dispCompDomain.setEnabledBhtLockAut(true);
                        //【17】MA Agent B
                        dispCompDomain.setEnabledMaAgentB(true);
                        //【18】MA Agent R
                        dispCompDomain.setEnabledMaAgentR(true);
                        //【19】MA Other B
                        dispCompDomain.setEnabledMaOtherB(true);
                        //【20】MA Other R
                        dispCompDomain.setEnabledMaOtherR(true);
                        //【21】Doc. R
                        dispCompDomain.setEnabledDocR(true);
                        //【22】Ship Act. R
                        dispCompDomain.setEnabledShipActR(true);
                        
                        break;
                    }
                    for (TmAgentDomain tmAgent : tmAgentList) {
                        if (dispComp.equals(tmAgent.getOrgCompCd())) {
                            
                            if (FLAG_Y.equals(tmAgent.getBhtUnlockAuthFlg())) {
                                //【16】BHT Lock Aut.
                                dispCompDomain.setEnabledBhtLockAut(true);
                            }
                            //【17】MA Agent B
                            dispCompDomain.setEnabledMaAgentB(true);
                            //【18】MA Agent R
                            dispCompDomain.setEnabledMaAgentR(true);
                            if (FLAG_Y.equals(tmAgent.getMaOtherAuthFlg())) {
                                //【19】MA Other B
                                dispCompDomain.setEnabledMaOtherB(true);
                                //【20】MA Other R
                                dispCompDomain.setEnabledMaOtherR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getDocAuthFlg())) {
                                //【21】Doc. R
                                dispCompDomain.setEnabledDocR(true);
                            }
                            if (FLAG_Y.equals(tmAgent.getShippingActAuthFlg())) {
                                //【22】Ship Act. R
                                dispCompDomain.setEnabledShipActR(true);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Set the active control of local authority area
     * <br />地域権限エリアの活性制御を設定
     *
     * @param ttUserAuthMgtDomainList User authority information<br />
     * ユーザ権限情報
     * @param areaAuthDomain Domain local area<br />
     * 地域エリアDomain
     */
    protected void setEnabledAreaAuth(List<? extends TtUserAuthMgtDomain> ttUserAuthMgtDomainList, W9004UserIdMaAreaAuthDomain areaAuthDomain) {
        if (ttUserAuthMgtDomainList.size() >= 1) {
            // Adm 
            areaAuthDomain.setEnabledAdm(true);
            // Browse All
            areaAuthDomain.setEnabledBrowseAll(true);
            // Register All
            areaAuthDomain.setEnabledRegisterAll(true);
        }
    }

    /**
     * Set the check box of the area authority area
     * <br />地域権限エリアのチェックボックスを設定
     *
     * @param userAreaAuthList Area authority information<br />
     * 地域権限情報
     * @param areaAuthDomain Domain local area<br />
     * 地域エリアDomain
     */
    protected void setCheckBoxAreaAuth(List<? extends W9004UserIdMaDomain> userAreaAuthList, W9004UserIdMaAreaAuthDomain areaAuthDomain) {
        for (W9004UserIdMaDomain userAreaAuth : userAreaAuthList) {
            //【10】Adm
            if (ROLE_AREA_ADMIN.equals(userAreaAuth.getRole())) {
                areaAuthDomain.setRegAdmRole(CHECK_ON);
            } 
            //【11】Browse All
            if (ROLE_AREA_BROWSER.equals(userAreaAuth.getRole())) {
                areaAuthDomain.setBrowseAllRole(CHECK_ON);
            }
            //【12】Register All
            if (ROLE_AREA_REGISTER.equals(userAreaAuth.getRole())) {
                areaAuthDomain.setRegisterAllRole(CHECK_ON);
            }
        }
    }

    /**
     * The factory-set domain authority area
     * <br />工場権限エリアのドメイン設定
     *
     * @param userPlantAuthList User authorization factory<br />
     * ユーザ権限付与工場
     * @param plantDomain Screen domain<br />
     * 画面ドメイン
     * @param compCd COMPANY CODE<br />
     * 会社コード
     * @param plntCd Factory CD<br />
     * 工場コード
     */
    protected void setPlntAuthDomain(List<? extends W9004UserIdMaDomain> userPlantAuthList, W9004UserIdMaPlantAuthDomain plantDomain, String compCd, String plntCd) {
        
        //【24】Company
        plantDomain.setCompCd(compCd);
        //【25】Plant CD
        plantDomain.setPlantCd(plntCd);
        
        for (W9004UserIdMaDomain userPlantAuth : userPlantAuthList) {
            //【26】Adm
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_PLNT_ADMIN.equals(userPlantAuth.getRole())) {
                plantDomain.setPlnAdmRole(CHECK_ON);
            }
            //【27】Exp Req B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_EXP_REQ_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setExpReqBRole(CHECK_ON);
            }
            //【28】Exp Req R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_EXP_REQ_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setExpReqRRole(CHECK_ON);
            }
            //【29】Req PKG B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_EXP_PKG_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setReqPkgBRole(CHECK_ON);
            }
            //【30】Req PKG R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_EXP_PKG_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setReqPkgRRole(CHECK_ON);
            }
            //【31】ERT B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_ERT_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setErtBRole(CHECK_ON);
            }
            //【32】ERT R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_ERT_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setErtRRole(CHECK_ON);
            }
            //【33】Order B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_ORDER_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setOrderBRole(CHECK_ON);
            }
            //【34】Order R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_ORDER_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setOrderRRole(CHECK_ON);
            }
            //【35】Plt Instr. B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_PLT_INSTR_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setPltInstrBRole(CHECK_ON);
            }
            //【36】Plt Instr. R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_PLT_INSTR_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setPltInstrRRole(CHECK_ON);
            }
            //【37】M-TAG B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_MTAG_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setMtagBRole(CHECK_ON);
            }
            //【38】M-TAG R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_MTAG_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setMtagRRole(CHECK_ON);
            }
            //【39】CML B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_CML_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setCmlBRole(CHECK_ON);
            }
            //【40】CML R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_CML_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setCmlRRole(CHECK_ON);
            }
            //【41】X-TAG B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_XTAG_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setXtagBRole(CHECK_ON);
            }
            //【42】X-TAG R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_XTAG_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setXtagRRole(CHECK_ON);
            }
            //【43】Carry Out/In B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_CARRY_OUT_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setCarryOutInBRole(CHECK_ON);
            }
            //【44】Carry Out/In R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_CARRY_OUT_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setCarryOutInRRole(CHECK_ON);
            }
            //【45】Stg Instr. B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_STG_INSTR_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setStgInstrBRole(CHECK_ON);
            }
            //【46】Stg Instr. R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_STG_INSTR_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setStgInstrRRole(CHECK_ON);
            }
            //【47】Stg Act. B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_STG_ACT_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setStgActBRole(CHECK_ON);
            }
            //【48】Stg Act. R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_STG_ACT_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setStgActRRole(CHECK_ON);
            }
            //【49】Ship Cfrm B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_SHIP_CFRM_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setShipCfrmBRole(CHECK_ON);
            }
            //【50】Ship Cfrm R
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_SHIP_CFRM_REGISTER.equals(userPlantAuth.getRole())) {
                plantDomain.setShipCfrmRRole(CHECK_ON);
            }
            //【51】PRGS Ctrl B
            if (compCd.equals(userPlantAuth.getAuthMgtComp()) 
                    && plntCd.equals(userPlantAuth.getAuthDataFrom())
                    && ROLE_PRGS_CTRL_BROWSER.equals(userPlantAuth.getRole())) {
                plantDomain.setPrgsCtrlBRole(CHECK_ON);
            }
        }
    }

    /**
     * Domain set of corporate authority area
     * <br />会社権限エリアのドメイン設定
     *
     * @param userCompAuthList User information AUTHORITY MANAGEMENT COMPANY<br />
     * ユーザ権限付与会社情報
     * @param compDomain Screen domain<br />
     * 画面ドメイン
     * @param compCd COMPANY CODE<br />
     * 会社コード
     */
    protected void setCompAuthDomain(List<? extends W9004UserIdMaDomain> userCompAuthList, W9004UserIdMaCompAuthDomain compDomain, String compCd) {
        // 【14】Company
        compDomain.setCompCd(compCd);
        
        for (W9004UserIdMaDomain userCompAuth : userCompAuthList){
            //【15】Adm
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_COMP_ADMIN.equals(userCompAuth.getRole())) {
                compDomain.setComAdmRole(CHECK_ON);
            }
            //【16】BHT Lock Aut.
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_BHT_LOCK.equals(userCompAuth.getRole())) {
                compDomain.setBhtLockAutRole(CHECK_ON);
            }
            //【17】MA Agent B
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_MA_AGENT_BROWSER.equals(userCompAuth.getRole())) {
                compDomain.setMaAgentBRole(CHECK_ON);
            }
            //【18】MA Agent R
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_MA_AGENT_REGISTER.equals(userCompAuth.getRole())) {
                compDomain.setMaAgentRRole(CHECK_ON);
            }
            //【19】MA Other B
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_MA_OTHER_BROWSER.equals(userCompAuth.getRole())) {
                compDomain.setMaOtherBRole(CHECK_ON);
            }
            //【20】MA Other R
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_MA_OTHER_REGISTER.equals(userCompAuth.getRole())) {
                compDomain.setMaOtherRRole(CHECK_ON);
            }
            //【21】Doc. R
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_DOC_REGISTER.equals(userCompAuth.getRole())) {
                compDomain.setDocRRole(CHECK_ON);
            }
            //【22】Ship Act. R
            if (compCd.equals(userCompAuth.getAuthMgtComp()) && ROLE_SHIP_ACT_REGISTER.equals(userCompAuth.getRole())) {
                compDomain.setShipActRRole(CHECK_ON);
            }
        }
    }

    /**
     * Get the proxy request based companies and the features that are proxy request
     * <br />ユーザの会社に代行依頼されている代行依頼元会社・機能を取得
     *
     * @param agentCompCd Acting COMPANY CODE<br />
     * 代行会社コード
     * @return Search result list<br />
     * 検索結果リスト
     * @throws ApplicationException fail to search process<br />
     * 検索処理に失敗した場合
     */
    protected List<? extends TmAgentDomain> getUserCompAgencyList(String agentCompCd) throws ApplicationException {
        TmAgentCriteriaDomain tmAgentCriteriaDomain = new TmAgentCriteriaDomain();
        tmAgentCriteriaDomain.setAgentCompCd(agentCompCd);
        return tmAgentService.searchByCondition(tmAgentCriteriaDomain);
    }

    /**
     * Get factory that LoginUser can give the authorization
     * <br />ログイン者が権限付与可能な工場を取得
     *
     * @param loginUserDscId Login user DscId<br />
     * ログインユーザDscId
     * @return Search result list<br />
     * 検索結果リスト
     * @throws ApplicationException ApplicationException
     */
    protected List<? extends W9004UserIdMaDomain> getLoginPlantAuthList(String loginUserDscId)
        throws ApplicationException {
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId(loginUserDscId);
        return w9004UserIdMaDao.searchTtUserAuthMgtByPlantAuth(criteria);
    }

    /**
     * Get company that LoginUser can give the authorization
     * <br />ログインユーザが権限付与可能な会社を取得
     *
     * @param loginUserDscId Login user DscId<br />
     * ログインユーザDscId
     * @return Search result list<br />
     * 検索結果リスト
     * @throws ApplicationException ApplicationException
     */
    protected List<? extends W9004UserIdMaDomain> getLoginCompAuthList(String loginUserDscId) 
        throws ApplicationException {
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId(loginUserDscId);
        return w9004UserIdMaDao.searchTtUserAuthMgt(criteria);
    }

    /**
     * Get information of LoginUser area's Adm
     * <br />ログインユーザの地域管理者情報を取得。
     *
     * @param loginUserDscId Login user DscId<br />
     * ログインユーザDscId
     * @return Search result list<br />
     * 検索結果リスト
     * @throws ApplicationException fail to search<br />
     * 検索に失敗した場合
     */
    protected List<? extends TtUserAuthMgtDomain> getLoginUserAreaMgtInfo(String loginUserDscId) 
        throws ApplicationException {
        
        TtUserAuthMgtCriteriaDomain userAuthMgtCriteriaDomain = new TtUserAuthMgtCriteriaDomain();
        userAuthMgtCriteriaDomain.setDscId(loginUserDscId);
        userAuthMgtCriteriaDomain.setRole(ROLE_AREA_ADMIN);
        userAuthMgtCriteriaDomain.setAuthMgtComp(WHITE_SPACE);
        userAuthMgtCriteriaDomain.setAuthDataTyp(AUTH_DATA_TYP_PLNT_CD);
        userAuthMgtCriteriaDomain.setAuthDataFrom(WHITE_SPACE);
        userAuthMgtCriteriaDomain.setAuthDataTo(WHITE_SPACE);
        return ttUserAuthMgtService.searchByCondition(userAuthMgtCriteriaDomain);
    }

    /**
     * Create a search condition paging domain
     * <br />ページング検索条件ドメインを作成
     *
     * @param criteriaDomain Search conditions domain of Main screen<br />
     * Main画面の検索条件ドメイン
     * @return Search conditions domain of service<br />
     * サービスの検索条件ドメイン
     */
    protected W9004UserIdMaCriteriaDomain createCriteria(W9004UserIdMaCriteriaDomain criteriaDomain) {
        W9004UserIdMaCriteriaDomain newCriteria = new W9004UserIdMaCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(newCriteria, criteriaDomain);
        newCriteria.setScreenId(criteriaDomain.getScreenId());
        newCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        return newCriteria;
    }

    /**
     * Calculate the search range
     * <br />検索範囲を算出
     *
     * @param pageInfoCreator PageInfoCreator object<br />
     * PageInfoCreatorオブジェクト
     * @param count Search number<br />
     * 検索件数
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException can not calculate search range<br />
     * 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W9004UserIdMaCriteriaDomain criteria) 
        throws ApplicationException {
        
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Get Number of count Deleted DSC-ID<br />
     * ユーザ集約原単位より削除済みのDSC-IDの件数を取得します。
     *
     * @param dscId DSC-ID
     * @return Number of count deleted user data.
     * @throws ApplicationException ApplicationException
     */
    protected int searchCountTmUserByDscId (String dscId) throws ApplicationException {
        W9004UserIdMaCriteriaDomain criteria = new W9004UserIdMaCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setSearchCountCheckFlg(false);
        return w9004UserIdMaDao.searchCountTmUserByDscId(criteria);
    }
}
