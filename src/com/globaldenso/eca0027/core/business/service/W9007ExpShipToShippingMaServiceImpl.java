/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9008;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvTplShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvTplShipToService;
import com.globaldenso.eca0027.core.business.dao.W9007ExpShipToShippingMaDao;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Service implementation class of Exp Ship To Shipping MA
 * <br />Exp Ship To Shipping MAのサービス実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9007ExpShipToShippingMaServiceImpl implements W9007ExpShipToShippingMaService {

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * UserAuth
     */
    protected UserAuthService userAuthService;

    /**
     * TmExpShipToShippingService
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;

    /**
     * TmInvTplShipToService
     */
    protected TmInvTplShipToService tmInvTplShipToService;

    /**
     * TmInvFreeItemService
     */
    protected TmInvFreeItemService tmInvFreeItemService;

    /**
     * TmInvTplService
     */
    protected TmInvTplService tmInvTplService;
    
    /**
     * W9007ExpShipToShippingMaDao
     */
    protected W9007ExpShipToShippingMaDao w9007ExpShipToShippingMaDao;
    
    /**
     * constructor.
     *
     */
    public W9007ExpShipToShippingMaServiceImpl() {
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
     * Setter method for tmExpShipToShippingService.
     *
     * @param tmExpShipToShippingService Set for tmExpShipToShippingService
     */
    public void setTmExpShipToShippingService(
        TmExpShipToShippingService tmExpShipToShippingService) {
        this.tmExpShipToShippingService = tmExpShipToShippingService;
    }

    /**
     * Setter method for tmInvTplShipToService.
     *
     * @param tmInvTplShipToService Set for tmInvTplShipToService
     */
    public void setTmInvTplShipToService(TmInvTplShipToService tmInvTplShipToService) {
        this.tmInvTplShipToService = tmInvTplShipToService;
    }

    /**
     * Setter method for tmInvFreeItemService.
     *
     * @param tmInvFreeItemService Set for tmInvFreeItemService
     */
    public void setTmInvFreeItemService(TmInvFreeItemService tmInvFreeItemService) {
        this.tmInvFreeItemService = tmInvFreeItemService;
    }

    /**
     * Setter method for tmInvTplService.
     *
     * @param tmInvTplService Set for tmInvTplService
     */
    public void setTmInvTplService(TmInvTplService tmInvTplService) {
        this.tmInvTplService = tmInvTplService;
    }

    /**
     * Setter method for w9007ExpShipToShippingMaDao.
     *
     * @param expShipToShippingMaDao Set for w9007ExpShipToShippingMaDao
     */
    public void setW9007ExpShipToShippingMaDao(
        W9007ExpShipToShippingMaDao expShipToShippingMaDao) {
        w9007ExpShipToShippingMaDao = expShipToShippingMaDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#deleteOnInquiryDelete(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    public int deleteOnInquiryDelete(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException {

        // Lock Export Ship To Shipping Master
        TmExpShipToShippingCriteriaDomain expShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
        expShipToShippingCriteriaDomain.setCompCd(criteria.getCompCd());
        expShipToShippingCriteriaDomain.setShipToCd(criteria.getShipToCd());
        expShipToShippingCriteriaDomain.setAplyStrtDt(criteria.getAplyStrtDt());
        TmExpShipToShippingDomain lockDomain = tmExpShipToShippingService.lockByKeyNoWait(expShipToShippingCriteriaDomain);
        if (lockDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Lock Invoice Template Ship To Master
        W9007ExpShipToShippingMaCriteriaDomain lockCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(lockCriteria, criteria);
        List<? extends W9007ExpShipToShippingMaItemDomain> lockList = w9007ExpShipToShippingMaDao.lockByNoWaitTmInvTplShipTo(lockCriteria);
        if (lockList == null || lockList.isEmpty()) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Deleted Export Ship To Shipping Master
        TmExpShipToShippingCriteriaDomain delDomain = new TmExpShipToShippingCriteriaDomain();
        delDomain.setCompCd(criteria.getCompCd());
        delDomain.setShipToCd(criteria.getShipToCd());
        delDomain.setAplyStrtDt(criteria.getAplyStrtDt());
        delDomain.setSearchCountCheckFlg(false);
        delDomain.setLocale(criteria.getLocale());
        int delCount = 0;
        if (tmExpShipToShippingService.searchCount(delDomain) > 0) {
            delDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
            delCount = tmExpShipToShippingService.deleteByCondition(delDomain);
        }
        
        // Deleted Invoice Template Ship To Master
        TmInvTplShipToCriteriaDomain tmInvTplShipToCriteriaDomain = new TmInvTplShipToCriteriaDomain();
        tmInvTplShipToCriteriaDomain.setCompCd(criteria.getCompCd());
        tmInvTplShipToCriteriaDomain.setShipToCd(criteria.getShipToCd());
        tmInvTplShipToCriteriaDomain.setAplyStrtDt(criteria.getAplyStrtDt());
        tmInvTplShipToCriteriaDomain.setSearchCountCheckFlg(false);
        tmInvTplShipToCriteriaDomain.setLocale(criteria.getLocale());
        if (tmInvTplShipToService.searchCount(tmInvTplShipToCriteriaDomain) > 0) {
            tmInvTplShipToService.deleteByCondition(tmInvTplShipToCriteriaDomain);
        }
        return delCount;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    public List<? extends W9007ExpShipToShippingMaItemDomain> searchForPagingOnInquirySearch(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException {
        // Creation of search condition domain
        // 検索条件ドメインの作成
        W9007ExpShipToShippingMaCriteriaDomain criteriaDomain = createCriteria(criteria);
        
        // Get Search count
        // 検索件数の取得
        int count = w9007ExpShipToShippingMaDao.searchCountTmExpShipToShipping(criteriaDomain);
        
        // Setting the search scope
        // 検索範囲の設定
        setPageInfo(criteria.getPageInfoCreator(), count, criteriaDomain);
        
        // Search result
        // 検索結果
        return w9007ExpShipToShippingMaDao.searchForPagingTmExpShipToShipping(criteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    public W9007ExpShipToShippingMaDomain searchOnEditInit(W9007ExpShipToShippingMaCriteriaDomain criteria) throws ApplicationException {
        
        String compCd       = criteria.getCompCd();     // 【3】Shipper
        String shipToCd     = criteria.getShipToCd();   // 【4】NEXUS Ship to
        
        W9007ExpShipToShippingMaDomain rtnDomain = new W9007ExpShipToShippingMaDomain();
        rtnDomain.setCompCd(compCd);
        rtnDomain.setShipToCd(shipToCd);
        rtnDomain.setAplyStrtDt(criteria.getAplyStrtDt());
        
        // 4.Get the Free Item Name
        // 4.Free項目名称の取得
        TmInvFreeItemCriteriaDomain invFreeItemCriteriaDomain = new TmInvFreeItemCriteriaDomain();
        invFreeItemCriteriaDomain.setCompCd(compCd);
        List<TmInvFreeItemDomain> invFreeItemList = tmInvFreeItemService.searchByCondition(invFreeItemCriteriaDomain);
        
        // 5.Set to screen the Free item name
        //5.Free項目名称を画面に設定
        for (TmInvFreeItemDomain tmInvFreeItemDomain : invFreeItemList) {
            if ("1".equals(tmInvFreeItemDomain.getFreeColNo().toString())) {
                rtnDomain.setFree1TitleNm(StringUtil.getEmptyToBlank(tmInvFreeItemDomain.getFreeColNm()) + "(Name)");
            } else if ("2".equals(tmInvFreeItemDomain.getFreeColNo().toString())) {
                rtnDomain.setFree2TitleNm(StringUtil.getEmptyToBlank(tmInvFreeItemDomain.getFreeColNm()) + "(Name)");
            } else if ("3".equals(tmInvFreeItemDomain.getFreeColNo().toString())) {
                rtnDomain.setFree3TitleNm(StringUtil.getEmptyToBlank(tmInvFreeItemDomain.getFreeColNm()) + "(Name)");
            }
        }
        
        // 6.Set to screen the CML Type · Inv Category list of part
        // 6.一覧部分のCML Type・Inv Categoryを画面に設定
        List<W9007ExpShipToShippingMaItemDomain> itemList = new ArrayList<W9007ExpShipToShippingMaItemDomain>();
        itemList.add(createtDetail("1", "C", "M"));
        itemList.add(createtDetail("1", "N", "F"));
        itemList.add(createtDetail("2", "N", "M"));
        itemList.add(createtDetail("3", "C", "M"));
        itemList.add(createtDetail("3", "N", "M"));
        itemList.add(createtDetail("3", "N", "F"));
        itemList.add(createtDetail("3", "I", "M"));
        rtnDomain.setW9007ExpShipToShippingMaItemDomainList(itemList);
        
        String mode = criteria.getMode();
        if (MODE_EDIT.equals(mode) || MODE_REF.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // EDIT mode / REF mode / COPY NEW mode
            // 修正モード・参照モード・コピー新規モードの場合
            
            // 7.1.Get Export Ship To Shipping Master data
            // 7.1.輸出送荷先出荷原単位のデータ取得
            TmExpShipToShippingCriteriaDomain tmExpShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
            tmExpShipToShippingCriteriaDomain.setCompCd(compCd);
            tmExpShipToShippingCriteriaDomain.setShipToCd(shipToCd);
            tmExpShipToShippingCriteriaDomain.setAplyStrtDt(criteria.getAplyStrtDt());
            tmExpShipToShippingCriteriaDomain.setLocale(criteria.getLocale());
            tmExpShipToShippingService.searchCount(tmExpShipToShippingCriteriaDomain);
            TmExpShipToShippingDomain tmExpShipToShippingDomain = tmExpShipToShippingService.searchByKey(tmExpShipToShippingCriteriaDomain);
            
            // 7.2.Get Invoice Template Ship To Master data
            // 7.2.送荷先別インボイステンプレート原単位のデータ取得
            TmInvTplShipToCriteriaDomain tmInvTplShipToCriteriaDomain = new TmInvTplShipToCriteriaDomain();
            tmInvTplShipToCriteriaDomain.setCompCd(compCd);
            tmInvTplShipToCriteriaDomain.setShipToCd(shipToCd);
            tmInvTplShipToCriteriaDomain.setAplyStrtDt(criteria.getAplyStrtDt());
            tmInvTplShipToCriteriaDomain.setPreferredOrder("CML_TYP, INVOICE_CTGRY, INVOICE_CLASS");
            tmInvTplShipToCriteriaDomain.setLocale(criteria.getLocale());
            tmInvTplShipToService.searchCount(tmInvTplShipToCriteriaDomain);
            List<TmInvTplShipToDomain> tmInvTplShipTolist = tmInvTplShipToService.searchByCondition(tmInvTplShipToCriteriaDomain);
            
            // 8.Set to screen search results
            // 8.検索結果を画面に設定
            
            // 【7】 Cont Sort Key
            rtnDomain.setContainerSortingKey(tmExpShipToShippingDomain.getContainerSortingKey());
            // 【8】 LD CD
            rtnDomain.setLoadingCd(tmExpShipToShippingDomain.getLoadingCd());
            // 【9】 Label Print Num
            if (tmExpShipToShippingDomain.getLabelPrintNum() != null) {
                rtnDomain.setLabelPrintNum(tmExpShipToShippingDomain.getLabelPrintNum());
            }
            // 【10】C/L
            rtnDomain.setContainerLooseTyp(tmExpShipToShippingDomain.getContainerLooseTyp());
            // 【11】C/C TYPE
            rtnDomain.setCustomTimingTyp(tmExpShipToShippingDomain.getCustomTimingTyp());
            // 【16】P/L SUMMARY
            rtnDomain.setPackingSummaryAtchFlg(tmExpShipToShippingDomain.getPackingSummaryAtchFlg()); // NL023 ADD
            // 【17】Single PLTZ QR
            rtnDomain.setSinglePltzQrFlg(tmExpShipToShippingDomain.getSinglePltzQrFlg()); // NL047 ADD
            // 【15】LAST UPDATE DATE
            // 【15】最終更新日時
            rtnDomain.setComUpdateTimestamp(tmExpShipToShippingDomain.getComUpdateTimestamp());
            
            for (TmInvTplShipToDomain tmInvTplShipToDomain : tmInvTplShipTolist) {
                
                // 【50】CML Type=　Invoice Template Ship To Master.CML_TYP
                // 【51】Inv Category=Invoice Template Ship To Master.INVOICE_CATEGORY
                // 【52】Invoice Template Ship To Master.INVOICE_CLASS（Comparisons are replaced by the Full-RT: 'M': Main, 'F'）
                // Setting the corresponding data obtained.
                
                // 【50】CML Type=　送荷先別インボイステンプレート原単位.CML_TYP
                // 【51】Inv Category=送荷先別インボイステンプレート原単位.INVOICE_CATEGORY
                // 【52】Class of Invoice=送荷先別インボイステンプレート原単位.INVOICE_CLASS（'M'：Main、'F'：Full-RT に置き換えて比較）
                // となる行に取得した各該当データを設定する
                
                String type     = tmInvTplShipToDomain.getCmlTyp();
                String ctgry    = tmInvTplShipToDomain.getInvoiceCtgry();
                String invClass = tmInvTplShipToDomain.getInvoiceClass();
                
                if ("1".equals(type)) {
                    if ("C".equals(ctgry)) {
                        if ("M".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(0));
                        }
                    } else if ("N".equals(ctgry)) {
                        if ("F".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(1));
                        }
                    }
                } else if ("2".equals(type)) {
                    if ("N".equals(ctgry)) {
                        if ("M".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(2));
                        }
                    }
                } else if ("3".equals(type)) {
                    if ("C".equals(ctgry)) {
                        if ("M".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(3));
                        }
                    } else if ("N".equals(ctgry)) {
                        if ("M".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(4));
                        } else if ("F".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(5));
                        }
                    } else if ("I".equals(ctgry)) {
                        if ("M".equals(invClass)) {
                            setDetail(type, ctgry, invClass, tmInvTplShipToDomain, itemList.get(6));
                        }
                    }
                }
            }
        }
        return rtnDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#transactOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain)
     */
    public int transactOnEditRegister(W9007ExpShipToShippingMaCriteriaDomain criteria) 
        throws ApplicationException {
        
        String compCd = criteria.getCompCd();
        String shipToCd = criteria.getShipToCd();
        Date aplyStrtDt = criteria.getAplyStrtDt();
        String containerSortingKey = criteria.getContainerSortingKey();
        String loadingCd = criteria.getLoadingCd();
        BigDecimal labelPrintNum = criteria.getLabelPrintNum();
        String containerLooseTyp = criteria.getContainerLooseTyp();
        String customTimingTyp = criteria.getCustomTimingTyp();
        String packingSummaryAtchFlg = criteria.getPackingSummaryAtchFlg(); // NL023 ADD
        String singlePltzQrFlg = criteria.getSinglePltzQrFlg(); // NL047 ADD
        Timestamp comUpdateTimestamp = criteria.getComUpdateTimestamp();
        // Template List 
        List<? extends W9007ExpShipToShippingMaItemDomain> itemList = criteria.getW9007ExpShipToShippingMaItemDomainList();
        
        String mode = criteria.getMode();
        int retCount = 0;
        if (MODE_EDIT.equals(mode)) {
            // Lock of Export Ship To Shipping Master.
            TmExpShipToShippingCriteriaDomain expShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
            expShipToShippingCriteriaDomain.setCompCd(compCd);
            expShipToShippingCriteriaDomain.setShipToCd(shipToCd);
            expShipToShippingCriteriaDomain.setAplyStrtDt(aplyStrtDt);
            TmExpShipToShippingDomain expShipToShippingDomain 
                = tmExpShipToShippingService.lockByKeyNoWait(expShipToShippingCriteriaDomain);
            if (expShipToShippingDomain == null) {
                throw new GscmApplicationException(GSCM_E0_0010);
            }
            
            // Lock of Invoice Template Ship To Master.
            W9007ExpShipToShippingMaCriteriaDomain lockDomain = new W9007ExpShipToShippingMaCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(lockDomain, criteria);
            lockDomain.setAplyStrtDt(aplyStrtDt);
            List<?extends W9007ExpShipToShippingMaItemDomain> invTmpShipToList 
                = w9007ExpShipToShippingMaDao.lockByNoWaitTmInvTplShipTo(criteria);
            if (invTmpShipToList == null || invTmpShipToList.isEmpty()) {
                throw new GscmApplicationException(GSCM_E0_0010);
            }
            
            // Update the Export Ship To Shipping Master.
            // - Set the update contents
            TmExpShipToShippingDomain updDomain = new TmExpShipToShippingDomain();
            updDomain.setContainerSortingKey(containerSortingKey);
            updDomain.setLoadingCd(loadingCd);
            updDomain.setLabelPrintNum(labelPrintNum);
            updDomain.setContainerLooseTyp(containerLooseTyp);
            updDomain.setCustomTimingTyp(customTimingTyp);
            updDomain.setPackingSummaryAtchFlg(packingSummaryAtchFlg); // NL023 ADD
            updDomain.setSinglePltzQrFlg(singlePltzQrFlg); // NL047 ADD
            commonService.setCommonPropertyForUpdate(updDomain, SCREEN_ID_W9008);
            
            // - Set the criteria domain.
            TmExpShipToShippingCriteriaDomain updCriteria = new TmExpShipToShippingCriteriaDomain();
            updCriteria.setCompCd(compCd);
            updCriteria.setShipToCd(shipToCd);
            updCriteria.setAplyStrtDt(aplyStrtDt);
            updCriteria.setComUpdateTimestamp(comUpdateTimestamp);
            
            retCount = tmExpShipToShippingService.updateByCondition(updDomain, updCriteria);
        } else if (MODE_NEW.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            
            // Create the Export Ship To Shipping Master.
            // - Set register data.
            TmExpShipToShippingDomain insDomain = new TmExpShipToShippingDomain();
            insDomain.setCompCd(compCd);
            insDomain.setShipToCd(shipToCd);
            insDomain.setAplyStrtDt(aplyStrtDt);
            insDomain.setContainerSortingKey(containerSortingKey);
            insDomain.setLoadingCd(loadingCd);
            insDomain.setLabelPrintNum(labelPrintNum);
            insDomain.setContainerLooseTyp(containerLooseTyp);
            insDomain.setCustomTimingTyp(customTimingTyp);
            insDomain.setPackingSummaryAtchFlg(packingSummaryAtchFlg); // NL023 ADD
            insDomain.setSinglePltzQrFlg(singlePltzQrFlg); // NL047 ADD
            commonService.setCommonPropertyForRegist(insDomain, SCREEN_ID_W9008);
            try {
                tmExpShipToShippingService.create(insDomain);
                retCount = 1;
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
        }
        
        // 3.4.judgment of the registration and update process(Invoice Template Ship To Master)
        //【12】For each row in the list of Invoice Template field, to perform the registration update
        // 3.4.送荷先別インボイステンプレート原単位の登録・更新処理の判定
        //   【12】Invoice Template欄の一覧の各行について、登録更新を行う
        for (W9007ExpShipToShippingMaItemDomain item : itemList) {
            
            TmInvTplShipToCriteriaDomain tmInvTplShipToCriteriaDomain = new TmInvTplShipToCriteriaDomain();
            tmInvTplShipToCriteriaDomain.setCompCd(compCd);
            tmInvTplShipToCriteriaDomain.setShipToCd(shipToCd);
            tmInvTplShipToCriteriaDomain.setAplyStrtDt(aplyStrtDt);
            tmInvTplShipToCriteriaDomain.setCmlTyp(item.getCmlTyp());
            tmInvTplShipToCriteriaDomain.setInvoiceCtgry(item.getInvoiceCtgry());
            tmInvTplShipToCriteriaDomain.setInvoiceClass(item.getInvoiceClass());
            List<TmInvTplShipToDomain> tmInvTplShipToList = tmInvTplShipToService.searchByCondition(tmInvTplShipToCriteriaDomain);
            
            if (tmInvTplShipToList.size() > 0) {
                
                // 3.5.1.Updated content
                // 3.5.1.更新内容
                TmInvTplShipToDomain updDomain = new TmInvTplShipToDomain();
                updDomain.setDocNo(item.getDocNo());
                updDomain.setFree1DispFlg(getFlag(item.getFree1DispFlg()));
                updDomain.setFree2DispFlg(getFlag(item.getFree2DispFlg()));
                updDomain.setFree3DispFlg(getFlag(item.getFree3DispFlg()));
                updDomain.setHsCdDispFlg(getFlag(item.getHsCdDispFlg()));
                // Setting common column
                // 共通カラムの設定
                commonService.setCommonPropertyForUpdate(updDomain, SCREEN_ID_W9008);
                
                // 3.5.2.Narrowing of the update data.
                // 3.5.2.更新データの絞込み方法
                TmInvTplShipToCriteriaDomain updCriteriaDomain = new TmInvTplShipToCriteriaDomain();
                updCriteriaDomain.setCompCd(compCd);
                updCriteriaDomain.setShipToCd(shipToCd);
                updCriteriaDomain.setAplyStrtDt(aplyStrtDt);
                updCriteriaDomain.setCmlTyp(item.getCmlTyp());
                updCriteriaDomain.setInvoiceCtgry(item.getInvoiceCtgry());
                updCriteriaDomain.setInvoiceClass(item.getInvoiceClass());
                updCriteriaDomain.setComUpdateTimestamp(item.getComUpdateTimestamp());
                tmInvTplShipToService.updateByCondition(updDomain, updCriteriaDomain);
                
            } else {

                // 3.6.1.Created content
                // 3.6.1.登録内容
                TmInvTplShipToDomain insDomain = new TmInvTplShipToDomain();
                insDomain.setCompCd(compCd);
                insDomain.setShipToCd(shipToCd);
                insDomain.setAplyStrtDt(aplyStrtDt);
                insDomain.setCmlTyp(item.getCmlTyp());
                insDomain.setInvoiceCtgry(item.getInvoiceCtgry());
                insDomain.setInvoiceClass(item.getInvoiceClass());
                insDomain.setComUpdateTimestamp(item.getComUpdateTimestamp());
                insDomain.setDocNo(item.getDocNo());
                insDomain.setFree1DispFlg(getFlag(item.getFree1DispFlg()));
                insDomain.setFree2DispFlg(getFlag(item.getFree2DispFlg()));
                insDomain.setFree3DispFlg(getFlag(item.getFree3DispFlg()));
                insDomain.setHsCdDispFlg(getFlag(item.getHsCdDispFlg()));
                // Setting common column
                // 共通カラムの設定
                commonService.setCommonPropertyForRegist(insDomain, SCREEN_ID_W9008);
                tmInvTplShipToService.create(insDomain);
            }
        }
        return retCount;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateConsistencyApplyStartDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyApplyStartDate(String date, String dateFormat, String compCd) throws ApplicationException {
        return commonService.validateAfterDateComp(date, dateFormat, compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateConsistencyCLAndCCCorrelative(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyCLAndCCCorrelative(String cl, String ccType) throws ApplicationException {

        // W9008   Processing No.3
        //【W9008  処理№ 3】
        
        // 2.3.Check correlation
        // 2.3.相関チェック
        boolean rtn = true;
        if ("L".equals(cl)) {
            if (!"Z".equals(ccType)) {
                rtn = false;
            }
        }
        return rtn;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateConsistencyCompAuth(java.lang.String)
     */
    public boolean validateConsistencyCompAuth(String company) throws ApplicationException {

        // W9007   Processing No.1
        //【W9007  処理№ 1】
        
        // Check for Updates authority
        // 更新権限があるかどうか
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9007R, company);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateDatabaseOnEditRegisterByShipTo(java.lang.String)
     */
    public boolean validateDatabaseOnEditRegisterByShipTo(String shipTo) throws ApplicationException {

        // W9008   Processing No.3
        //【W9008  処理№ 3】
        
        // 2.4.1.1.NEXUS Ship to existence check（【4】NEXUS Ship to）
        // 2.4.1.1.NEXUS Ship to存在チェック（【4】NEXUS Ship to）
        return commonService.validateShipTo(shipTo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String shipper) throws ApplicationException {

        // W9007   Processing No.3
        //【W9007  処理№ 3】
        
        // 1.2.Authority check
        // 1.2.権限チェック
        return commonService.validateShipper(shipper);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService#validateDatabaseTmInvTplOnEditRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTmInvTplOnEditRegister(String shipper, String docNo, String invCategory, String invClass) throws ApplicationException {

        // W9008   Processing No.3
        //【W9008  処理№ 3】
        
        // 2.4.2.Check combination
        // 2.4.2.組合せチェック
        TmInvTplCriteriaDomain tmInvTplCriteriaDomain = new TmInvTplCriteriaDomain();
        tmInvTplCriteriaDomain.setCompCd(shipper);
        tmInvTplCriteriaDomain.setDocNo(docNo);
        tmInvTplCriteriaDomain.setInvoiceCtgry(invCategory);
        tmInvTplCriteriaDomain.setInvoiceClass(invClass);
        List<TmInvTplDomain> list = tmInvTplService.searchByCondition(tmInvTplCriteriaDomain);
        return list.size() > 0;
    }

    /**
     * Create a search condition paging domain
     * <br />ページング検索条件ドメインを作成します。
     *
     * @param criteriaDomain Search conditions domain of Main screen<br />
     * Main画面の検索条件ドメイン
     * @return Search conditions domain of service<br />
     * サービスの検索条件ドメイン
     * @throws ApplicationException
     * アプリケーション例外
     */
    protected W9007ExpShipToShippingMaCriteriaDomain createCriteria(W9007ExpShipToShippingMaCriteriaDomain criteriaDomain) 
        throws ApplicationException {
        W9007ExpShipToShippingMaCriteriaDomain newCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        
        // Settings for obtaining the maximum number
        // 最大件数を取得するための設定
        newCriteria.setScreenId(criteriaDomain.getScreenId());
        newCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Copy search conditions
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(newCriteria, criteriaDomain);
        
        // UT387
        String timezoneId = commonService.searchTimezone(criteriaDomain.getOwnerCompCd());
        Date nowDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);
        newCriteria.setFmtAplyStrtDt(nowDt);
        
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
     * @throws ApplicationException can not calculate the search range<br />
     * 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W9007ExpShipToShippingMaCriteriaDomain criteria) 
        throws ApplicationException {
        
        // Getting information page
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        // Set the start and end position in the search condition domain
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Create a list of information
     * <br />一覧情報を作成します。
     *
     * @param type Type<br />
     * タイプ
     * @param ctgry Category<br />
     * カテゴリ
     * @param invClass Class<br />
     * クラス
     * @return Return Domain<br />
     * 返却Domain
     */
    protected W9007ExpShipToShippingMaItemDomain createtDetail(
        String type, String ctgry, String invClass) {

        W9007ExpShipToShippingMaItemDomain listDomain = new W9007ExpShipToShippingMaItemDomain();
        
        listDomain.setCmlTyp(type);
        listDomain.setInvoiceCtgry(ctgry);
        listDomain.setInvoiceClass(invClass);
        if ("M".equals(invClass)) {
            listDomain.setInvoiceClassNm("Main");
        } else if ("F".equals(invClass)) {
            listDomain.setInvoiceClassNm("Full-RT");
        }
        
        return listDomain;
    }

    /**
     * Set list information
     * <br />一覧情報を設定します。
     *
     * @param type Type<br />
     * タイプ
     * @param ctgry Category<br />
     * カテゴリ
     * @param invClass Class<br />
     * クラス
     * @param tmInvTplShipToDomain Information Domain<br />
     * 情報Domain
     * @param listDomain Return Domain<br />
     * 返却Domain
     */
    protected void setDetail(String type,
                             String ctgry,
                             String invClass,
                             TmInvTplShipToDomain tmInvTplShipToDomain, 
                             W9007ExpShipToShippingMaItemDomain listDomain) {
        
        // 【53】Inv Template
        listDomain.setDocNo(tmInvTplShipToDomain.getDocNo());
        // 【54】Free1(Name)
        listDomain.setFree1DispFlg(getCheckBoxVal(tmInvTplShipToDomain.getFree1DispFlg()));
        // 【55】Free2(Name)
        listDomain.setFree2DispFlg(getCheckBoxVal(tmInvTplShipToDomain.getFree2DispFlg()));
        // 【56】Free3(Name)
        listDomain.setFree3DispFlg(getCheckBoxVal(tmInvTplShipToDomain.getFree3DispFlg()));
        // 【57】HS CODE
        listDomain.setHsCdDispFlg(getCheckBoxVal(tmInvTplShipToDomain.getHsCdDispFlg()));
        // 【58】LAST UPDATE DATE(Details)
        // 【58】最終更新日時(明細)
        listDomain.setComUpdateTimestamp(tmInvTplShipToDomain.getComUpdateTimestamp());
    }
    
    /**
     * Get the VALUE of the flag from the check box VALUE
     * <br />チェックボックス値からフラグの値を取得します。
     *
     * @param value Check box VALUE<br />
     * チェックボックス値
     * @return VALUE of flag<br />
     * フラグの値
     */
    protected String getFlag(String value) {
        if (CHECK_ON.equals(value)) {
            return FLAG_Y;
        } else {
            return FLAG_N;
        }
    }
    
    /**
     * Get check box VALUE VALUE from the flag
     * <br />フラグの値からチェックボックス値を取得します。
     *
     * @param flag VALUE of flag<br />
     * フラグの値
     * @return Check box VALUE<br />
     * チェックボックス値
     */
    protected String getCheckBoxVal(String flag) {
        if (FLAG_Y.equals(flag)) {
            return CHECK_ON;
        } else {
            return CHECK_OFF;
        }
    }
}
