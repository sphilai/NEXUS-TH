/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTENTS_NEWLINE_MARK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_CONTENTS_LINE_SIZE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SYS_INFO_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TIME_FORMAT;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusDomain;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerListDomain;
import com.globaldenso.eca0027.core.business.domain.W0002SysInfoDomain;
import com.globaldenso.eca0027.core.business.domain.W0002SysInfoListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W0002MenuService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * The implementation class of facade service for init action of the menu screen.
 * <br />メニュー画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 10657 $
 */
public class W0002InitFacadeServiceImpl extends AbstractSearchFacadeService<W0002ListDomain, W0002CriteriaDomain> {

    /**
     * common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * service of the menu screen
     * <br />メニュー画面のサービス
     */
    protected W0002MenuService w0002MenuService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W0002InitFacadeServiceImpl() {
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
     * Setter method for w0002MenuService.
     *
     * @param menuService Set for w0002MenuService
     */
    public void setW0002MenuService(W0002MenuService menuService) {
        w0002MenuService = menuService;
    }

    
    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W0002CriteriaDomain filterDomain(W0002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W0002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W0002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W0002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Get the menu information
     *     Create {@link W0002MenuCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForMenu(W0002MenuCriteriaDomain)}, and get menu information
     *     Convert information obtained into {@link W0002MenuListDomain}, and set it to {@link W0002ListDomain}
     * 
     * - メニュー情報の取得
     *     {@link W0002MenuCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForMenu(W0002MenuCriteriaDomain)}を呼び出し、メニュー情報を取得する
     *     取得した情報を{@link W0002MenuListDomain}に変換し、{@link W0002ListDomain}に設定する
     * 
     * - Get the other menu information
     *     Create {@link W0002OtherMenuCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForServer(W0002OtherMenuCriteriaDomain)}, and get other menu information
     *     Convert information obtained into {@link W0002OtherMenuListDomain}, and set it to {@link W0002ListDomain}
     *     * Search in English if it could not  be acquire
     * 
     * - 他システムメニュー情報の取得
     *     {@link W0002OtherMenuCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForMenu(W0002OtherMenuCriteriaDomain)}を呼び出し、他システムメニュー情報を取得する
     *     取得した情報を{@link W0002OtherMenuListDomain}に変換し、{@link W0002ListDomain}に設定する
     * 
     * - Get the server information
     *     Create {@link W0002ServerCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForServer(W0002ServerCriteriaDomain)}, and get server information
     *     Convert information obtained into {@link W0002ServerListDomain}, and set it to {@link W0002ListDomain}
     *     * Search in English if it could not  be acquire
     * 
     * - サーバ情報の取得
     *     {@link W0002ServerCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForServer(W0002ServerCriteriaDomain)}を呼出し、サーバ情報を取得する
     *     取得した情報を{@link W0002ServerListDomain}に変換し、{@link W0002ListDomain}に設定する
     *     ※取得できなければ、英語で検索する
     *     
     * - Get the system information
     *     Create {@link W0002SysInfoCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForSystemInfo(W0002SysInfoCriteriaDomain)}, and get system information
     *     Convert information obtained into {@link W0002SysInfoListDomain}, and set it to {@link W0002ListDomain}
     *     
     * - お知らせ情報(システム連絡)の取得
     *     {@link W0002SysInfoCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForSystemInfo(W0002SysInfoCriteriaDomain)}を呼出し、お知らせ情報(システム連絡)を取得する
     *     取得した情報を{@link W0002SysInfoListDomain}に変換し、{@link W0002ListDomain}に設定する
     *     
     * - Get the business information
     *     Create {@link W0002SysInfoCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForBusinessInfo(W0002SysInfoCriteriaDomain)}, and get business information
     *     Convert information obtained into {@link W0002SysInfoListDomain}, and set it to {@link W0002ListDomain}
     *     
     * - お知らせ情報(業務連絡)の取得
     *     {@link W0002SysInfoCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForBusinessInfo(W0002SysInfoCriteriaDomain)}を呼出し、お知らせ情報(業務連絡)を取得する
     *     取得した情報を{@link W0002SysInfoListDomain}に変換し、{@link W0002ListDomain}に設定する
     * 
     * - Get the CIGMA nightly batch information
     *     Create {@link W0002CigmaStatusCriteriaDomain}, and set the search criteria to it
     *     Call {@link W0002MenuService#searchOnMenuInitForCigmaStatus(W0002CigmaStatusCriteriaDomain)}, and get the CIGMA nightly batch information
     *     Convert information obtained into {@link W0002CigmaStatusListDomain}, and set it to {@link W0002ListDomain}
     * 
     * - CIGMA夜間バッチ情報の取得
     *     {@link W0002CigmaStatusCriteriaDomain}を作成し、検索条件を設定する
     *     {@link W0002MenuService#searchOnMenuInitForCigmaStatus(W0002CigmaStatusCriteriaDomain)}を呼出し、CIGMA夜間バッチ情報を取得する
     *     取得した情報を{@link W0002CigmaStatusListDomain}に変換し、{@link W0002ListDomain}に設定する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W0002ListDomain callServices(W0002CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // A create of a  List domain
        // Listドメインの作成
        W0002ListDomain listDomain = new W0002ListDomain();
        
        // Acquisition of a menu information
        // メニュー情報の取得
        listDomain.setMenuList(searchMenuInfo(criteriaDomain));
        
        // Acquisition of a other menu information
        // 他システムメニュー情報の取得
        listDomain.setOtherMenuList(searchOtherMenuInfo(criteriaDomain));
        
        // Acquisition of server information
        // サーバ情報の取得
        listDomain.setServerList(searchServerInfo(criteriaDomain));
        
        // Acquisition of information information (system connection)
        // お知らせ情報 (システム連絡)の取得
        listDomain.setSystemInfoList(searchSystemInfo(criteriaDomain));

        // Acquisition of information information (connection for business)
        // お知らせ情報 (業務連絡)の取得
        listDomain.setBusinessInfoList(searchBusinessInfo(criteriaDomain));

        // Acquisition of a CIGMA night-batch information
        // CIGMA夜間バッチ情報の取得
        listDomain.setCigmaStatusList(searchCigmaStatus(criteriaDomain));
        
        return listDomain;
    }

    /**
     * Get the menu information
     * <br />メニュー情報を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002MenuListDomain}
     * @throws ApplicationException - If the menu information can not be obtained
     */
    protected List<? extends W0002MenuListDomain> searchMenuInfo(W0002CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        String[] lngCdList = { criteriaDomain.getLanguageCd(), LANGUAGE_CD_ENGLISH };
        
        for (String lngCd : lngCdList) {
            W0002MenuCriteriaDomain menuCriteria = createMenuCriteriaDomain(criteriaDomain, lngCd);
            
            List<? extends W0002MenuDomain> menuList = w0002MenuService.searchOnMenuInitForMenu(menuCriteria);
            
            if (!CollectionUtils.isEmpty(menuList)) {
                return convertToMenuListDomain(w0002MenuService.searchOnMenuInitForMenu(menuCriteria));
            }
        }
        
        return null;
    }
    
    /**
     * Create the search criteria for menu information 
     * <br />メニュー情報の検索条件を作成します。
     *
     * @param criteriaDomain - search condition
     * @param lngCd - language code
     * @return {@link W0002MenuCriteriaDomain}
     */
    protected W0002MenuCriteriaDomain createMenuCriteriaDomain(W0002CriteriaDomain criteriaDomain, String lngCd) {
        W0002MenuCriteriaDomain menuCriteria = new W0002MenuCriteriaDomain();
        
        menuCriteria.setCompCd(criteriaDomain.getCompCd());
        menuCriteria.setLngCd(lngCd);
        
        return menuCriteria;
    }
    
    /**
     * Convert {@link W0002MenuDomain} into {@link W0002MenuListDomain} <br />
     * {@link W0002MenuDomain}を{@link W0002MenuListDomain}に変換します。
     *
     * @param menuList - list before the conversion
     * @return list after the conversion 
     */
    protected List<? extends W0002MenuListDomain> convertToMenuListDomain(List<? extends W0002MenuDomain> menuList) {
        List<W0002MenuListDomain> listDomainList = new ArrayList<W0002MenuListDomain>();
        
        for (W0002MenuDomain menu : menuList) {
            W0002MenuListDomain listDomain = new W0002MenuListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, menu);
            
            if (!CollectionUtils.isEmpty(menu.getSubMenuList())) {
                listDomain.setSubMenuList(convertToMenuListDomain(menu.getSubMenuList()));
            }
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
    
    /**
     * Get the other system menu information
     * <br />他システムメニュー情報を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002OtherMenuDomain}
     * @throws ApplicationException - if the otherMenu information can not be obtained 
     */
    protected List<? extends W0002OtherMenuListDomain> searchOtherMenuInfo(W0002CriteriaDomain criteriaDomain) 
        throws ApplicationException {

        String compCd = criteriaDomain.getCompCd();
        String[] lngCdList = { criteriaDomain.getLanguageCd(), LANGUAGE_CD_ENGLISH };
        
        for (String lngCd : lngCdList) {
            W0002OtherMenuCriteriaDomain criteria = createOtherMenuCriteriaDomain(compCd, lngCd);
            
            List<? extends W0002OtherMenuDomain> otherMenuList = w0002MenuService.searchOnMenuInitForOtherMenu(criteria);
            
            if (!CollectionUtils.isEmpty(otherMenuList)) {
                return convertToOtherMenuListDomain(otherMenuList);
            }
        }
        
        return null;
    }
    
    /**
     * Create the search criteria for the other system menu information
     * <br />他システムメニュー情報の検索条件を作成します。
     * 
     * @param compCd - COMPANY CODE
     * @param lngCd  - LANGUAGE CODE
     * @return {@link W0002OtherMenuCriteriaDomain}
     */
    protected W0002OtherMenuCriteriaDomain createOtherMenuCriteriaDomain(String compCd, String lngCd) {
        W0002OtherMenuCriteriaDomain otherMenuCriteria = new W0002OtherMenuCriteriaDomain();
        
        otherMenuCriteria.setCompCd(compCd);
        otherMenuCriteria.setLngCd(lngCd);
        
        return otherMenuCriteria;
    }
    
    /**
     * Convert {@link W0002OtherMenuDomain} into {@link W0002OtherMenuListDomain} <br />
     * {@link W0002OtherMenuDomain}を{@link W0002OtherMenuListDomain}に変換します。
     *
     * @param otherMenuList - list before the conversion
     * @return list after the conversion
     */
    protected List<? extends W0002OtherMenuListDomain> convertToOtherMenuListDomain(List<? extends W0002OtherMenuDomain> otherMenuList) {
        List<W0002OtherMenuListDomain> listDomainList = new ArrayList<W0002OtherMenuListDomain>();
        
        for (W0002OtherMenuDomain otherMenu : otherMenuList) {
            W0002OtherMenuListDomain listDomain = new W0002OtherMenuListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, otherMenu);
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
    
    /**
     * Get the server information
     * <br />サーバ情報を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002ServerDomain}
     * @throws ApplicationException - if the server information can not be obtained 
     */
    protected List<? extends W0002ServerListDomain> searchServerInfo(W0002CriteriaDomain criteriaDomain) 
        throws ApplicationException {

        String serverId = criteriaDomain.getServerId();
        String[] lngCdList = { criteriaDomain.getLanguageCd(), LANGUAGE_CD_ENGLISH };
        
        for (String lngCd : lngCdList) {
            W0002ServerCriteriaDomain criteria = createServerCriteriaDomain(serverId, lngCd);
            
            List<? extends W0002ServerDomain> serverList = w0002MenuService.searchOnMenuInitForServer(criteria);
            
            if (!CollectionUtils.isEmpty(serverList)) {
                return convertToServerListDomain(serverList);
            }
        }
        
        return null;
    }
    
    /**
     * Create the search criteria for the server information
     * <br />サーバ情報の検索条件を作成します。
     * 
     * @param serverId - SERVER ID
     * @param lngCd - LANGUAGE CODE
     * @return {@link W0002ServerCriteriaDomain}
     */
    protected W0002ServerCriteriaDomain createServerCriteriaDomain(String serverId, String lngCd) {
        W0002ServerCriteriaDomain serverCriteria = new W0002ServerCriteriaDomain();
        
        serverCriteria.setServerId(serverId);
        serverCriteria.setLngCd(lngCd);
        
        return serverCriteria;
    }
    
    /**
     * Convert {@link W0002ServerDomain} into {@link W0002ServerListDomain} <br />
     * {@link W0002ServerDomain}を{@link W0002ServerListDomain}に変換します。
     *
     * @param serverList - list before the conversion
     * @return list after the conversion
     */
    protected List<? extends W0002ServerListDomain> convertToServerListDomain(List<? extends W0002ServerDomain> serverList) {
        List<W0002ServerListDomain> listDomainList = new ArrayList<W0002ServerListDomain>();
        
        for (W0002ServerDomain server : serverList) {
            W0002ServerListDomain listDomain = new W0002ServerListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, server);
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
    
    /**
     * Get the business information
     * <br />お知らせ情報(システム連絡)を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002SysInfoDomain}
     * @throws ApplicationException - if the system information can not be obtained
     */
    protected List<? extends W0002SysInfoListDomain> searchSystemInfo(W0002CriteriaDomain criteriaDomain)
        throws ApplicationException {
        
        W0002SysInfoCriteriaDomain sysInfoCriteira = createSysInfoCriteriaDomain(criteriaDomain);
        
        List<? extends W0002SysInfoDomain> sysInfoList = w0002MenuService.searchOnMenuInitForSystemInfo(sysInfoCriteira);
        
        return convertToSysInfoListDomain(sysInfoList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * Get the business information
     * <br />お知らせ情報(業務連絡)を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002SysInfoDomain}
     * @throws ApplicationException - if the business information can not be obtained
     */
    protected List<? extends W0002SysInfoListDomain> searchBusinessInfo(W0002CriteriaDomain criteriaDomain)
        throws ApplicationException {
        
        W0002SysInfoCriteriaDomain sysInfoCriteira = createSysInfoCriteriaDomain(criteriaDomain);
     
        List<? extends W0002SysInfoDomain> sysInfoList = w0002MenuService.searchOnMenuInitForBusinessInfo(sysInfoCriteira);
        
        return convertToSysInfoListDomain(sysInfoList, criteriaDomain.getScreenDateFormat());
    }

    /**
     * Create the search criteria domain of system information
     * <br />お知らせ情報の検索条件ドメインを作成します。
     * 
     * @param criteriaDomain - search condition
     * @return {@link W0002SysInfoCriteriaDomain}
     */
    protected W0002SysInfoCriteriaDomain createSysInfoCriteriaDomain(W0002CriteriaDomain criteriaDomain) {
        W0002SysInfoCriteriaDomain sysInfoCriteria = new W0002SysInfoCriteriaDomain();
        // Setting of a search condition
        // 検索条件の設定
        CommonUtil.copyPropertiesDomainToDomain(sysInfoCriteria, criteriaDomain);
        sysInfoCriteria.setRowNumFrom(1);
        sysInfoCriteria.setRowNumTo(SYS_INFO_MAX_COUNT);

        // A setting of sort order
        // ソート順の設定
        sysInfoCriteria.setPreferredOrder("PUB_STRT_DT desc");
        
        return sysInfoCriteria;
    }
    
    /**
     * Convert {@link W0002SysInfoDomain} into {@link W0002SysInfoListDomain} <br />
     * {@link W0002SysInfoDomain}を{@link W0002SysInfoListDomain}に変換します。
     *
     * @param sysInfoList - list before the conversion
     * @param dateFormat - time format
     * @return list after the conversion
     */
    protected List<? extends W0002SysInfoListDomain> convertToSysInfoListDomain(
        List<? extends W0002SysInfoDomain> sysInfoList, String dateFormat) {
        
        List<W0002SysInfoListDomain> listDomainList = new ArrayList<W0002SysInfoListDomain>();
        
        for (W0002SysInfoDomain sysInfo : sysInfoList) {
            W0002SysInfoListDomain listDomain = new W0002SysInfoListDomain();

            CommonUtil.copyPropertiesDomainToDomain(listDomain, sysInfo, dateFormat);

            // Setting of CONTENTS (a mark is set up so that a new line can be started by the JSP side)  
            // お知らせ内容の設定 (JSP側で改行できるように目印を設定)
            listDomain.setContents(setNewlineMark(listDomain.getContents()));
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
    
    /**
     * Set the mark which shows a line feed position to a CONTENTS.
     * <br />お知らせ内容に改行位置を示す目印を設定します。
     *
     * @param contents CONTENTS<br />お知らせ内容
     * @return The CONTENTS which set up the mark<br />目印を設定したお知らせ内容
     */
    protected String setNewlineMark(String contents) {
        if (StringUtils.isEmpty(contents)) {
            return contents;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < contents.length(); i++) {
                sb.append(contents.charAt(i));
                if ((i + 1) % MAX_CONTENTS_LINE_SIZE == 0) {
                    sb.append(CONTENTS_NEWLINE_MARK);
                }
            }
            return sb.toString();
        }
    }
    
    /**
     * Get CIGMA nightly batch information.
     * <br />CIGMA夜間バッチ情報を取得します。
     *
     * @param criteriaDomain - search condition
     * @return list of {@link W0002CigmaStatusDomain}
     * @throws ApplicationException - if CIGMA nightly batch information can not be obtained
     */
    protected List<? extends W0002CigmaStatusListDomain> searchCigmaStatus(W0002CriteriaDomain criteriaDomain)
        throws ApplicationException {
        
        W0002CigmaStatusCriteriaDomain cigmaStatusCriteria = createCigmaStatusCriteriaDomain(criteriaDomain);
        
        List<? extends W0002CigmaStatusDomain> cigmaStatusList = w0002MenuService.searchOnMenuInitForCigmaStatus(cigmaStatusCriteria);
        
        return convertToCigmaStatusListDomain(cigmaStatusList);
    }
    
    /**
     * Create the search criteria CIGMA domain of nightly batch information.
     * <br />CIGMA夜間バッチ情報の検索条件ドメインを作成します。
     *
     * @param criteriaDomain - search condition
     * @return {@link W0002CigmaStatusCriteriaDomain}
     */
    protected W0002CigmaStatusCriteriaDomain createCigmaStatusCriteriaDomain(W0002CriteriaDomain criteriaDomain) {
        W0002CigmaStatusCriteriaDomain criteria = new W0002CigmaStatusCriteriaDomain();

        // Setting of a search condition
        // 検索条件の設定
        criteria.setServerId(criteriaDomain.getServerId());
        
        // A setting of sort order
        // ソート順の設定
        criteria.setPreferredOrder("CIG.COMP_CD");
        
        return criteria;
    }
    
    /**
     * Convert {@link W0002CigmaStatusDomain} into {@link W0002CigmaStatusListDomain}
     * <br />{@link W0002CigmaStatusDomain}を{@link W0002CigmaStatusListDomain}に変換します。
     *
     * @param cigmaStatusList - list before the conversion
     * @return list after the conversion
     */
    protected List<W0002CigmaStatusListDomain> convertToCigmaStatusListDomain(
        List<? extends W0002CigmaStatusDomain> cigmaStatusList) {
        
        List<W0002CigmaStatusListDomain> listDomainList = new ArrayList<W0002CigmaStatusListDomain>();
        
        for (W0002CigmaStatusDomain cigmaStatus : cigmaStatusList) {
            W0002CigmaStatusListDomain listDomain = new W0002CigmaStatusListDomain();

            // NIGHT BATCH START TIME is changed into a shipper's time zone.
            // * Since the parts of GSCM do not correspond to Timestamp, a Timestamp<=>Date converted is performed.
            // 夜間バッチ開始時刻をShipperのタイムゾーンに変換
            // ※GSCMの部品がTimestampに対応していないので、Timestamp⇔Date変換を行う
            if (cigmaStatus.getNightBatStrtTime() != null) {
                Date nightBatStrtTime = new Date(cigmaStatus.getNightBatStrtTime().getTime());
                nightBatStrtTime = DateUtil.convertTime(nightBatStrtTime, cigmaStatus.getTimezoneId());
                
                cigmaStatus.setNightBatStrtTime(new Timestamp(nightBatStrtTime.getTime()));
            }
            
            // Copy of property
            // プロパティのコピー
            CommonUtil.copyPropertiesDomainToDomain(listDomain, cigmaStatus, TIME_FORMAT);
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
}
