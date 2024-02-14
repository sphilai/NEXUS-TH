/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_BROWSE_ALL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_REGISTER_ALL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService;
import com.globaldenso.eca0027.core.common.business.dao.UserAuthDao;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;


/**
 * An implementation class for service of user functions use authorization
 * <br />ユーザ機能利用権限サービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public class UserAuthServiceImpl implements UserAuthService {

    /**
     * service of NEXUS Company Master <br />
     * NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * CIGMA Warehouse Cross Reference Master <br />
     * 倉庫クロスリファレンス サービス
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;
    
    /**
     * DAO for Function Use Auth Config <br />
     * ユーザ機能利用権限DAO
     */
    protected UserAuthDao userAuthDao;

    /**
     * Supplier Warehouse Cross Reference Master service<br />
     * 仕入先倉庫クロスリファレンス原単位サービス。
     * ST986 ADD
     */
    protected TmSupplierWhXrefService tmSupplierWhXrefService;

    /**
     * constructor.
     * <br />デフォルト・コンストラクタです。
     *
     */
    public UserAuthServiceImpl() {
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
     * Setter method for tmCigmaWhXrefService.
     *
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * Setter method for userAuthDao.
     *
     * @param userAuthDao Set for userAuthDao
     */
    public void setUserAuthDao(UserAuthDao userAuthDao) {
        this.userAuthDao = userAuthDao;
    }

    /**
     * Setter method for tmSupplierWhXrefService.
     *
     * @param tmSupplierWhXrefService Set for tmSupplierWhXrefService
     */
    public void setTmSupplierWhXrefService(
        TmSupplierWhXrefService tmSupplierWhXrefService) {
        this.tmSupplierWhXrefService = tmSupplierWhXrefService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#searchByCondition(com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain)
     */
    public List<? extends UserAuthDomain> searchByCondition(UserAuthCriteriaDomain criteria) throws ApplicationException {
        return userAuthDao.searchByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasRole(java.lang.String)
     */
    public boolean hasRole(String role) {
        
        if (role == null) {
            return false;
        }
        
        // Acquisition of authority (R or B)  
        // 権限の取得 (R or B)
        String authority = role.substring(role.length() - 1);
        
        // Authority classification
        // 権限種別
        boolean isRegister = AUTH_REGISTER.equals(authority);
        boolean isBrowse = AUTH_BROWSE.equals(authority);

        // [Update] When there is Register All authority
        // [更新] Register All権限がある場合
        if (isRegister && hasRegisterAll()) {
            return true;
            
        // [Reference] When there is Browse All authority
        // [参照] Browse All権限がある場合
        } else if (isBrowse && hasBrowseAll()) {
            return true;
            
        // Except the above
        // 上記以外
        } else {
            return hasRole(getUserAuthList(), role);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasAnyPermitFuncId(java.lang.String[])
     */
    public boolean hasAnyPermitFuncId(String... permitFuncIds) {
        if (permitFuncIds != null) {
            for (String permitFuncId : permitFuncIds) {
                // Acquisition of authority (R or B)  
                // 権限の取得 (R or B)
                String authority = permitFuncId.substring(permitFuncId.length() - 1);
                
                // Authority classification
                // 権限種別
                boolean isRegister = AUTH_REGISTER.equals(authority);
                boolean isBrowse = AUTH_BROWSE.equals(authority);
                
                // [Update] When there is Register All authority
                // [更新] Register All権限がある場合
                if (isRegister && hasRegisterAll()) {
                    return true;
                
                // [Reference] When there is Browse All authority
                // [参照] Browse All権限がある場合
                } else if (isBrowse && hasBrowseAll()) {
                    return true;
                
                // Except the above
                // 上記以外
                } else if (hasPermitFuncId(getUserAuthList(), permitFuncId)) {
                    return true;
                }
            }
        }
        // When neither is given
        // いずれも付与されていない場合
        return false;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasUserAuth()
     */
    public boolean hasUserAuth() {
        return !CollectionUtils.isEmpty(getUserAuthList());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasBrowseAll()
     */
    public boolean hasBrowseAll() {
        return hasPermitFuncId(getUserAuthList(), PERMIT_FUNC_ID_BROWSE_ALL)
            || hasPermitFuncId(getUserAuthList(), PERMIT_FUNC_ID_REGISTER_ALL);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasRegisterAll()
     */
    public boolean hasRegisterAll() {
        return hasPermitFuncId(getUserAuthList(), PERMIT_FUNC_ID_REGISTER_ALL);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasUserAuthForComp(java.lang.String, java.lang.String)
     */
    public boolean hasUserAuthForComp(String permitFuncId, String compCd) throws ApplicationException {
        // Acquisition of authority (R or B)  
        // 権限の取得 (R or B)
        String authority = permitFuncId.substring(permitFuncId.length() - 1);

        // Authority classification
        // 権限種別
        boolean isRegister = AUTH_REGISTER.equals(authority);
        boolean isBrowse = AUTH_BROWSE.equals(authority);
        
        // [Update] When there is Register All authority, are you a company of the server which logs in?
        // [更新] Register All権限がある場合、ログインしているサーバの会社であるか
        if (isRegister && hasRegisterAll() && isCompInCurrentServer(compCd)) {
            return true;

        // [Reference] When there is Browse All authority, are you a company of the server which logs in?
        // [参照] Browse All権限がある場合、ログインしているサーバの会社であるか
        } else if (isBrowse && hasBrowseAll() && isCompInCurrentServer(compCd)) {
            return true;
            
        // Except the above
        // 上記以外
        } else {
            for (UserAuthDomain userAuth : getUserAuthList()) {
                boolean hasPermitFuncId = permitFuncId.equals(userAuth.getPermitFuncId());
                boolean hasCompCd = compCd.equals(userAuth.getAuthMgtComp());

                // Is there any authority of specified approval function ID, and a COMPANY CODE?
                // 指定された認可機能ID、会社コードの権限があるか
                if (hasPermitFuncId && hasCompCd) {
                    return true;
                }
            }
            // With no authority
            // 権限なし
            return false;
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#hasUserAuthForCompPlnt(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean hasUserAuthForCompPlnt(String permitFuncId, String compCd, String plntCd) throws ApplicationException {
        // Acquisition of authority (R or B)  
        // 権限の取得 (R or B)
        String authority = permitFuncId.substring(permitFuncId.length() - 1);

        // Authority classification
        // 権限種別
        boolean isRegister = AUTH_REGISTER.equals(authority);
        boolean isBrowse = AUTH_BROWSE.equals(authority);
        
        // [Update] When there is Register All authority, are they the company and factory of the server which logs in?
        // [更新] Register All権限がある場合、ログインしているサーバの会社・工場であるか
        if (isRegister && hasRegisterAll() && isCompPlntInCurrentServer(compCd, plntCd)) {
            return true;

        // [Reference] When there is Browse All authority, are they the company and factory of the server which logs in?
        // [参照] Browse All権限がある場合、ログインしているサーバの会社・工場であるか
        } else if (isBrowse && hasBrowseAll() && isCompPlntInCurrentServer(compCd, plntCd)) {
            return true;
            
        // Except the above
        // 上記以外
        } else {
            for (UserAuthDomain userAuth : getUserAuthList()) {
                boolean hasPermitFuncId = permitFuncId.equals(userAuth.getPermitFuncId());
                boolean hasCompCd = compCd.equals(userAuth.getAuthMgtComp());
                boolean hasPlntCd = plntCd.equals(userAuth.getProcMfgDivCd());

                // Is there any authority of specified approval function ID, a COMPANY CODE, and a factory code?
                // 指定された認可機能ID、会社コード、工場コードの権限があるか
                if (hasPermitFuncId && hasCompCd && hasPlntCd) {
                    return true;
                }
            }
            // With no authority
            // 権限なし
            return false;
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.UserAuthService#getUserAuthList(java.lang.String[])
     */
    public List<? extends UserAuthDomain> getUserAuthList(String... permitFuncId) {
        // approval function ID is changed into a list.
        // 認可機能IDをリストに変換
        List<String> permitFuncIdList = Arrays.asList(permitFuncId);
        
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        
        // applicable user functional utilization right is extracted.
        // 該当するユーザ機能利用権限を抽出
        for (UserAuthDomain userAuth : getUserAuthList()) {
            if (permitFuncIdList.contains(userAuth.getPermitFuncId())) {
                userAuthList.add(userAuth);
            }
        }
        
        return userAuthList;
    }
    
    /**
     * Return the existence of Function Use Auth Config specified
     * <br />指定された役割のユーザ機能利用権限の有無を返します。
     *
     * @param userAuthList - Function Use Auth Config
     * @param role - role
     * @return true or false
     */
    protected boolean hasRole(List<? extends UserAuthDomain> userAuthList, String role) {
        for (UserAuthDomain userAuth : userAuthList) {
            if (role != null && role.equals(userAuth.getRole())) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Return the existence of Function Use Auth Config for Permit Function ID that specified
     * <br />指定された認可機能IDのユーザ機能利用権限の有無を返します。
     *
     * @param userAuthList - Function Use Auth Config
     * @param permitFuncId - Permit Function ID
     * @return true or false
     */
    protected boolean hasPermitFuncId(List<? extends UserAuthDomain> userAuthList, String permitFuncId) {
        for (UserAuthDomain userAuth : userAuthList) {
            if (permitFuncId.equals(userAuth.getPermitFuncId())) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Check if specified COMPANY CODE is associated with the server which logged in.
     * <br />指定された会社コードが、ログインしているサーバに紐づくかチェックします。
     *
     * @param compCd COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if can not access to NEXUS Company Master
     */
    protected boolean isCompInCurrentServer(String compCd) throws ApplicationException {
        Eca0027CommonInfoDomain commonInfo = getCommonInfo();
        if (commonInfo == null) {
            return false;
        }
        
        TmNxsCompCriteriaDomain criteria = new TmNxsCompCriteriaDomain();
        criteria.setCompCd(compCd);
        criteria.setServerId(commonInfo.getServerId());
        criteria.setSearchCountCheckFlg(false);
        
        return 0 < tmNxsCompService.searchCount(criteria);
    }
    
    /**
     * Check if specified company and factory are associated with the server which logged in.
     * <br />指定された会社と工場が、ログインしているサーバに紐づくかチェックします。
     *
     * @param compCd - COMPANY CODE
     * @param plntCd - PLANT CODE
     * @return true or false
     * @throws ApplicationException - if can not access to NEXUS Company Master or CIGMA Warehouse Cross Reference Master
     */
    protected boolean isCompPlntInCurrentServer(String compCd, String plntCd) throws ApplicationException {
        if (!isCompInCurrentServer(compCd)) {
            return false;
        }
        
        TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
        criteria.setLgcyLibCompCd(compCd);
        criteria.setPlntCd(plntCd);
        criteria.setSearchCountCheckFlg(false);
        
        //return 0 < tmCigmaWhXrefService.searchCount(criteria); // ST986 DEL

        // ST986 ADD START
        int tmCigmaWhXrefResultCount = tmCigmaWhXrefService.searchCount(criteria);
        if (tmCigmaWhXrefResultCount == 0) {
            TmSupplierWhXrefCriteriaDomain tmSupplierWhXrefCriteriaDomain = new TmSupplierWhXrefCriteriaDomain();
            tmSupplierWhXrefCriteriaDomain.setSupplierCompCd(compCd);
            tmSupplierWhXrefCriteriaDomain.setSupplierPlntCd(plntCd);
            tmSupplierWhXrefCriteriaDomain.setSearchCountCheckFlg(false);
            int tmSupplierWhXrefResultCount = tmSupplierWhXrefService.searchCount(tmSupplierWhXrefCriteriaDomain);
            if (tmSupplierWhXrefResultCount == 0) {
                return false;
            }
        }

        return true;
        // ST986 ADD END
    }
    
    /**
     * get the screen common information
     * <br />画面共通情報を取得します。
     *
     * @return screen common information
     */
    protected Eca0027CommonInfoDomain getCommonInfo() {
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        if (windowInfo == null) {
            return null;
        }
        
        return  (Eca0027CommonInfoDomain) windowInfo.getCommonInfo();
    }
    
    /**
     * Get privileges of Function Use Auth Config that obtained when logged in
     * <br />ログイン時に取得したユーザ機能利用権限を取得します。
     *
     * @return Function Use Auth Config that obtained when logged in
     */
    protected List<? extends UserAuthDomain> getUserAuthList() {
        Eca0027CommonInfoDomain commonInfo = getCommonInfo();
        if (commonInfo == null) {
            return Collections.emptyList();
        }
        
        return commonInfo.getUserAuthList();
    }

}
