/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INFO_TYP_BUSINESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INFO_TYP_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9004;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtSysInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtSysInfoService;
import com.globaldenso.eca0027.core.business.dao.W0002MenuDao;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerDomain;
import com.globaldenso.eca0027.core.business.domain.W0002SysInfoDomain;
import com.globaldenso.eca0027.core.business.domain.W0002UserConfDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The implementation class of the service menu
 * <br />メニューサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10657 $
 */
/**
 * Type in the functional overview of the class.
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10657 $
 */
public class W0002MenuServiceImpl implements W0002MenuService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Authorization service for using the user function <br />
     * ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * System alert service <br />
     * システムアラート サービス
     */
    protected VtSysInfoService vtSysInfoService;
    
    /**
     * Service of 'User Config Master' <br />
     * ユーザ設定原単位サービス
     */
    protected TmUserConfService tmUserConfService;
    
    /**
     * Dao for the menu <br />
     * メニューDAO
     */
    protected W0002MenuDao w0002MenuDao;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     *
     */
    public W0002MenuServiceImpl() {
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
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * Setter method for vtSysInfoService.
     *
     * @param vtSysInfoService Set for vtSysInfoService
     */
    public void setVtSysInfoService(VtSysInfoService vtSysInfoService) {
        this.vtSysInfoService = vtSysInfoService;
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
     * Setter method for w0002MenuDao.
     *
     * @param menuDao Set for w0002MenuDao
     */
    public void setW0002MenuDao(W0002MenuDao menuDao) {
        w0002MenuDao = menuDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#searchOnMenuInitForMenu(com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain)
     */
    public List<? extends W0002MenuDomain> searchOnMenuInitForMenu(W0002MenuCriteriaDomain criteria) 
        throws ApplicationException {
        return shrinkMenu(w0002MenuDao.searchVmMenu(criteria));
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002OtherMenuService#searchOnMenuInitForOtherMenu(com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain)
     */
    public List<? extends W0002OtherMenuDomain> searchOnMenuInitForOtherMenu(W0002OtherMenuCriteriaDomain criteria) 
        throws ApplicationException {
        return w0002MenuDao.searchTmOtherSysLink(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#searchOnMenuInitForServer(com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain)
     */
    public List<? extends W0002ServerDomain> searchOnMenuInitForServer(W0002ServerCriteriaDomain criteria) 
        throws ApplicationException {
        return w0002MenuDao.searchTmServer(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#searchOnMenuInitForSystemInfo(com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain)
     */
    public List<? extends W0002SysInfoDomain> searchOnMenuInitForSystemInfo(W0002SysInfoCriteriaDomain criteria) 
        throws ApplicationException {
        return convertToW0002SysInfo(searchVtSysInfo(criteria, INFO_TYP_SYSTEM));
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#searchOnMenuInitForBusinessInfo(com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain)
     */
    public List<? extends W0002SysInfoDomain> searchOnMenuInitForBusinessInfo(W0002SysInfoCriteriaDomain criteria) 
        throws ApplicationException {
        return convertToW0002SysInfo(searchVtSysInfo(criteria, INFO_TYP_BUSINESS));
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#searchOnMenuInitForCigmaStatus(com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain)
     */
    public List<? extends W0002CigmaStatusDomain> searchOnMenuInitForCigmaStatus(W0002CigmaStatusCriteriaDomain criteria) 
        throws ApplicationException {
        return w0002MenuDao.searchTmCigmaEnv(criteria);
    }
    
    /**
     * Convert {@link MenuDomain} into {@link W0002MenuDomain}
     * <br />{@link MenuDomain}を{@link W0002MenuDomain}に変換します。
     * <pre>
     * In order to simplify the menu display in a JSP, performed the following processing.
     * JSPでのメニュー表示を簡単にするために、以下の処理を行う。
     * 
     * - bring together the same menu
     *     bring together the same menu because the list of {@link W0002MenuDomain} has same menu items as number of rolls in 'Function Use Auth Config Master'.
     * 
     * - メニュー項目の集約
     *     {@link W0002MenuDomain}のリストには、メニュー利用権限設定原単位に設定されているロール分だけ
     *     同一メニュー項目が存在しているので、1つに集約する
     * 
     * - Hierarchization of the menu item
     *     Add the second level menu as a sub menu of the top menu item.
     *     
     * - メニュー項目の階層化
     *     2階層目以下のメニュー項目を、上位メニュー項目のサブメニューとして追加する
     * 
     * - Set the availability flag
     *     If login user has role that is set to 'Function Use Auth Config Master', the menu item will be available.
     *     * the screen 'User ID MA Inquiry' shuld be always available.
     * 
     * - 利用可否フラグの設定
     *     ログインユーザにメニュー利用権限設定原単位に設定されているロールが付与されている場合、
     *     そのメニュー項目を使用可能とする
     *     ※User ID MA Inquiry画面については、常に使用可能とする
     * </pre>
     * 
     * @param srcMenuList - menu information retrieved
     * @return - menu information 
     */
    @SuppressWarnings("unchecked")
    protected List<? extends W0002MenuDomain> shrinkMenu(List<? extends W0002MenuDomain> srcMenuList) {
        
        // The menu of 1 class
        // 1階層目のメニュー
        List<W0002MenuDomain> destMenuList = new ArrayList<W0002MenuDomain>();
        
        // together put menu
        // 集約済みメニュー 
        W0002MenuDomain flattenMenu = null;
        Map<String, W0002MenuDomain> flattenMenuMap = new HashMap<String, W0002MenuDomain>();
        
        for (W0002MenuDomain srcMenu : srcMenuList) {
            
            // Acquisition of together put menu
            // 集約済みメニューの取得
            flattenMenu = flattenMenuMap.get(srcMenu.getScreenId());

            // Setting of a use propriety flag
            // 利用可否フラグの設定
            if (srcMenu.getActionPath() != null) {
                if (SCREEN_ID_W9004.equals(srcMenu.getScreenId()) || userAuthService.hasRole(srcMenu.getRole())) {
                    if (flattenMenu != null) {
                        flattenMenu.setPermitted(true);
                    } else {
                        srcMenu.setPermitted(true);
                    }
                }
            }
            
            // The menu of target outside has been collected 
            // 集約済みのメニューは対象外
            if (flattenMenu != null) {
                continue;
            }

            // In the case of 1 class , it adds to destMenuList.
            // 1階層目の場合はdestMenuListへ追加
            if (srcMenu.getParScreenId() == null) {
                destMenuList.add(srcMenu);
                
            // It adds to a parent menu except it.
            // それ以外は親メニューに追加
            } else {
                W0002MenuDomain parentMenu = flattenMenuMap.get(srcMenu.getParScreenId());
                ((List<W0002MenuDomain>) parentMenu.getSubMenuList()).add(srcMenu);
            }

            // It registers to together put menu.
            // 集約済みメニューへ登録
            flattenMenuMap.put(srcMenu.getScreenId(), srcMenu);
        }
        
        return destMenuList;
    }
    
    /**
     * Get the system alert corresponding to the specified conditions
     * <br />指定された条件に該当するシステムアラートを取得します。
     *
     * @param criteria - search condition
     * @param infoTyp - INFORMATION TYPE
     * @return in a form of list {@link VtSysInfoDomain}
     * @throws ApplicationException - if the system alert can not be obtained
     */
    protected List<? extends VtSysInfoDomain> searchVtSysInfo(W0002SysInfoCriteriaDomain criteria, String infoTyp) 
        throws ApplicationException {
        VtSysInfoCriteriaDomain vtSysInfoCriteria = new VtSysInfoCriteriaDomain();
        
        // Setting of a search condition
        // 検索条件の設定
        vtSysInfoCriteria.setLngCd(criteria.getLngCd());
        vtSysInfoCriteria.setInfoTrgt(criteria.getServerId());
        vtSysInfoCriteria.setPubStrtDtLessThanEqual(criteria.getSysdate());
        vtSysInfoCriteria.setPubEndDtGreaterThanEqual(criteria.getSysdate());
        vtSysInfoCriteria.setInfoTyp(infoTyp);
        
        // Setting of the search range
        // 検索範囲の設定
        vtSysInfoCriteria.setRowNumFrom(criteria.getRowNumFrom());
        vtSysInfoCriteria.setRowNumTo(criteria.getRowNumTo());
        
        // A setting of sort condition
        // ソート条件の設定
        vtSysInfoCriteria.setPreferredOrder(criteria.getPreferredOrder());
        
        // Acquisition of a System Alart
        // システムアラートの取得
        List<VtSysInfoDomain> vtSysInfoList = vtSysInfoService.searchByConditionForPaging(vtSysInfoCriteria);
        
        return vtSysInfoList;
    }
    
    /**
     * Convert {@link VtSysInfoDomain} into {@link W0002SysInfoDomain}
     * <br />{@link VtSysInfoDomain}を{@link W0002SysInfoDomain}に変換します。
     * 
     * @param vtSysInfoList - in a form of list {@link VtSysInfoDomain}
     * @return in a form of list {@link W0002SysInfoDomain}
     */
    protected List<? extends W0002SysInfoDomain> convertToW0002SysInfo(List<? extends VtSysInfoDomain> vtSysInfoList) {
        List<W0002SysInfoDomain> sysInfoList = new ArrayList<W0002SysInfoDomain>();
        
        for (VtSysInfoDomain vtSysInfo : vtSysInfoList) {
            W0002SysInfoDomain sysInfo = new W0002SysInfoDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(sysInfo, vtSysInfo);
            
            sysInfoList.add(sysInfo);
        }
        
        return sysInfoList;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W0002MenuService#updateOnMenuSetup(com.globaldenso.eca0027.core.business.domain.W0002UserConfDomain)
     */
    public void updateOnMenuSetup(W0002UserConfDomain userConf) throws ApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        TmUserConfCriteriaDomain criteria = new TmUserConfCriteriaDomain();
        criteria.setDscId(userConf.getDscId());
        
        // Acquisition of a lock
        // ロックの取得
        TmUserConfDomain tmUserConf = tmUserConfService.lockByKeyNoWait(criteria);
        
        // user set information
        // ユーザ設定情報の設定
        CommonUtil.copyPropertiesDomainToDomain(tmUserConf, userConf);
        
        // Set common property
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(tmUserConf, SCREEN_ID_W0002);
        
        // GSCM標準のDAOはタイムスタンプが自動設定されない
        tmUserConf.setComUpdateTimestamp(new Timestamp(new Date().getTime()));
        
        // The update of user set master
        // ユーザ設定原単位の更新
        tmUserConfService.update(tmUserConf);
    }

}
