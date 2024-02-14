/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;

/**
 * Interface for service of the User Function Use Auth Config
 * <br />ユーザ機能利用権限サービスのインタフェースです。
 * <pre>
 * bean id: userAuthService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface UserAuthService {
    /**
     * Get the User Function Use Auth Config under the condition specified
     * <br />指定された条件でユーザ機能利用権限を取得します。
     * <pre>
     * Register the User Function Use Auth Config of the logged-in user,
     *     by using Setup User Function of Screen Common Information that is executed successful authentication
     * 
     * 認証成功時に実行される画面共通情報設定機能({@link com.globaldenso.gscm.framework.filter.CreateCommonInfoFilter})において
     * ログインユーザの機能利用権限を登録します。
     * </pre>
     * 
     * @param criteria - search criteria
     * @return list of the Function Use Auth Config
     * @throws ApplicationException - exception of application infrastructure
     */
    public List<? extends UserAuthDomain> searchByCondition(UserAuthCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Check the roll have been granted to the logged-in user
     * <br />ログインユーザにロールが付与されているかチェックします。
     * <pre>
     * If the following condition is satisfied, assume that the role has been granted:
     *     - The role is Update Type ("R" is the end), 
     *         and Register All Permissions are granted to the logged-in user.
     *     - The role is Reference Type ("B" is the end), 
     *         and Register All Permissions or Browse All Permissions are granted to the logged-in user.
     *     - Otherwise, role that is specified has been granted to in the login user.
     *     
     * 以下のいずれかの条件を満たす場合、ロールが付与されているものとします：
     *   - roleが更新系(末尾が"R")の場合、ログインユーザにRegister All権限が付与されている
     *   - roleが参照系(末尾が"B")の場合、ログインユーザにRegister All権限またはBrowse All権限が付与されている
     *   - それ以外の場合、ログインユーザに指定されたroleが付与されている
     * </pre>
     * 
     * @param role - role specified
     * @return true if the roll have been granted, otherwise return false
     */
    public boolean hasRole(String role);
    
    /**
     * Check that the Authorization Function ID have been granted to the logged-in user
     * <br />ログインユーザに認可機能IDが付与されているかチェックします。
     * <pre>
     * If the following condition is satisfied, assume that the Authorization Function ID has been granted:
     *     - The Authorization Function ID is Update Type ("R" is the end), 
     *         and Register All Permissions are granted to the logged-in user.
     *     - The Authorization Function ID is Reference Type ("B" is the end), 
     *         and Register All Permissions or Browse All Permissions are granted to the logged-in user.
     *     - Otherwise, Register All Permissions that is specified has been granted to in the login user.
     * 
     * 指定された認可機能IDのいずれかが以下の条件を満たす場合、認可機能IDが付与されているものとします：
     *   - 認可機能IDが更新系(末尾が"R")の場合、ログインユーザにRegister All権限が付与されている
     *   - 認可機能IDが参照系(末尾が"B")の場合、ログインユーザにRegister All権限またはBrowse All権限が付与されている
     *   - それ以外の場合、ログインユーザに指定された認可機能IDが付与されている
     * </pre>
     *
     * @param permitFuncId - Authorization Function ID
     * @return true if the Authorization Function ID have been granted, otherwise return false
     */
    public boolean hasAnyPermitFuncId(String... permitFuncId);
    
    /**
     * Check that the privileges have been granted to the logged-in user
     * <br />ログインユーザに権限が付与されているかチェックします。
     * <pre>
     * This method checks that some permissions are granted to the logged-in user
     * このメソッドは、ログインユーザに何らかの権限が付与されていることをチェックします。
     * </pre>
     * 
     * @return true if privileges has been granted 1 or more, otherwise return false
     */
    public boolean hasUserAuth();
    
    /**
     * Check that the Company Function Use Auth Config have been granted to the logged-in user
     * <br />ログインユーザに会社機能利用権限が付与されているかチェックします。
     * <pre>
     * If the following condition is satisfied, assume that the Company Function Use Auth Config has been granted:
     *     - The permitFuncId is Update Type ("R" is the end), and Register All Permissions are granted to the
     *         logged-in user, and compCd match the company contained in the server that user logged in.
     *     - The permitFuncId is Reference Type ("B" is the end), and Register All Permissions or Browse All 
     *         Permissions are granted to the logged-in user, and compCd match the company contained in the server that user logged in.
     *     - Otherwise, Authorization function ID for compCd that is specified to the login user has been granted. 
     * 
     * 以下のいずれかの条件を満たす場合、会社機能利用権限が付与されているものとします：
     *   - permitFuncIdが更新系(末尾が"R")の場合、ログインユーザにRegister All権限が付与されおり、compCdがログイン中のサーバ内の会社である
     *   - permitFuncIdが参照系(末尾が"B")の場合、ログインユーザにRegister All権限またはBrowse All権限が付与されおり、compCdがログイン中のサーバ内の会社である
     *   - それ以外の場合、ログインユーザに指定されたcompCdに対する認可機能IDが付与されている
     * </pre>
     *
     * @param permitFuncId - Authorization function ID
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - If can not get the NEXUS Company Master
     */
    public boolean hasUserAuthForComp(String permitFuncId, String compCd) throws ApplicationException;
    
    
    /**
     * Check that the Plant Function Use Auth Config have been granted to the logged-in user
     * <br />ログインユーザに工場機能利用権限が付与されているかチェックします。
     * <pre>
     * If the following condition is satisfied, assume that the Plant Function Use Auth Config has been granted:
     *     - The permitFuncId is Update Type ("R" is the end), and Register All Permissions are granted to the
     *         logged-in user, and compCd/plntCd match the company/plant contained in the server that user logged in.
     *     - The permitFuncId is Reference Type ("B" is the end), and Register All Permissions or Browse All 
     *         Permissions are granted to the logged-in user, and compCd/plntCd match the company/plant contained in the server that user logged in.
     *     - Otherwise, Authorization function ID for compCd/plntCd that is specified to the login user has been granted. 
     * 
     * 以下のいずれかの条件を満たす場合、工場機能利用権限が付与されているものとします：
     *   - permitFuncIdが更新系(末尾が"R")の場合、ログインユーザにRegister All権限が付与されおり、compCdおよびplntCdがログイン中のサーバ内の会社・工場である
     *   - permitFuncIdが参照系(末尾が"B")の場合、ログインユーザにRegister All権限またはBrowse All権限が付与されおり、compCdおよびplntCdがログイン中のサーバ内の会社・工場である
     *   - それ以外の場合、ログインユーザに指定されたcompCd、plntCdに対する認可機能IDが付与されている
     * </pre>
     *
     * @param permitFuncId - Authorization function ID
     * @param compCd - COMPANY CODE
     * @param plntCd - PLANT CODE
     * @return true or false
     * @throws ApplicationException - If can not get the NEXUS Company Master or CIGMA Warehouse Cross Reference Master
     */
    public boolean hasUserAuthForCompPlnt(String permitFuncId, String compCd, String plntCd) throws ApplicationException;
    
    /**
     * Check that the Register All Permissions have been granted to the logged-in user
     * <br />ログインユーザにRegister All権限が付与されているかチェックします。
     *
     * @return true or false
     */
    public boolean hasRegisterAll();
    
    
    /**
     * Check that the Browse All Permissions have been granted to the logged-in user
     * <br />ログインユーザにBrowse All権限が付与されているかチェックします。
     *
     * @return true or false
     */
    public boolean hasBrowseAll();
    
    
    /**
     * Get the User Function Use Auth Config that is corresponding to the Authorization function ID specified
     * <br />指定した認可機能IDに該当するユーザ機能利用権限を取得します。
     * <pre>
     * This method returns the User Function Use Auth Config that is corresponding to 
     *     the Authorization function ID specified.
     * Please note that even if Register All Permissions or Browse All Permissions is granted to the logged in user,
     *     it does not return all of the User Function Use Auth Config.
     * 
     * このメソッドは、指定された認可機能IDに対するユーザ機能利用権限を返します。
     * ログインユーザにRegister All権限またはBrowse All権限が付与されていたとしても、
     * すべてのユーザ機能利用権限を返すわけではないので注意してください。
     * </pre>
     * 
     * @param permitFuncId - Authorization function ID
     * @return User Function Use Auth Config that is corresponding to the Authorization function ID
     */
    public List<? extends UserAuthDomain> getUserAuthList(String... permitFuncId);
}
