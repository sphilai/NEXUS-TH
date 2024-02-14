/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0076;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9018R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvFreeItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmInvFreeItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmInvFreeItemService;
import com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9001RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Service implementation class of Export Formalities by Parts MA
 * <br />Export Formalities by Parts MAのサービス実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11315 $
 */
public class W9018ExpFmlByItemMaServiceImpl implements W9018ExpFmlByItemMaService {

    /**
     * common services<br />
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * UserAuth
     */
    protected UserAuthService userAuthService;
    
    /**
     * TmExpFormalitiItemNo
     */
    protected TmExpFormalitiItemNoService tmExpFormalitiItemNoService;
    
    /**
     * TmInvFreeItem
     */
    protected TmInvFreeItemService tmInvFreeItemService;
    
    /**
     * Ws9001RestService
     */
    protected Ws9001RestService ws9001RestService;
    
    /**
     * W9018ExpFmlByItemMaDao
     */
    protected W9018ExpFmlByItemMaDao w9018ExpFmlByItemMaDao;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9018ExpFmlByItemMaServiceImpl() {
    }

    /**
     * Setter method for tmExpFormalitiItemNoService.
     *
     * @param tmExpFormalitiItemNoService Set for tmExpFormalitiItemNoService
     */
    public void setTmExpFormalitiItemNoService(
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService) {
        this.tmExpFormalitiItemNoService = tmExpFormalitiItemNoService;
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
     * Setter method for tmInvFreeItemService.
     *
     * @param tmInvFreeItemService Set for tmInvFreeItemService
     */
    public void setTmInvFreeItemService(TmInvFreeItemService tmInvFreeItemService) {
        this.tmInvFreeItemService = tmInvFreeItemService;
    }

    /**
     * Setter method for ws9001RestService.
     *
     * @param ws9001RestService Set for ws9001RestService
     */
    public void setWs9001RestService(Ws9001RestService ws9001RestService) {
        this.ws9001RestService = ws9001RestService;
    }

    /**
     * Setter method for w9018ExpFmlByItemMaDao.
     *
     * @param expFmlByItemMaDao Set for w9018ExpFmlByItemMaDao
     */
    public void setW9018ExpFmlByItemMaDao(W9018ExpFmlByItemMaDao expFmlByItemMaDao) {
        w9018ExpFmlByItemMaDao = expFmlByItemMaDao;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#createOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public int createOnEditRegister(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException {
        
        // W9019   Processing No.3
        //【W9019  処理№ 3】
        
        if (MODE_EDIT.equals(criteriaDomain.getMode())) {
            
            // 3.2.Update process
            // 3.2.更新処理
            
            // Update condition
            // 更新条件
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd(criteriaDomain.getCompCd());
            criteria.setItemNo(criteriaDomain.getItemNo());
            criteria.setAplyStrtDt(criteriaDomain.getAplyStrtDt());
            criteria.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestamp());
            
            // Updated value
            // 更新値
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setCigmaPrdctFlg(criteriaDomain.getCigmaPrdctFlg());
            domain.setItemDescription(criteriaDomain.getItemDescription());
            domain.setExpLimitTyp(criteriaDomain.getExpLimitTyp());
            domain.setDngrItemFlg(criteriaDomain.getDngrItemFlg());
            domain.setHsCd(criteriaDomain.getHsCd());
            domain.setOriginCntryCd(criteriaDomain.getOriginCntryCd());
            domain.setFree1RegFlg(criteriaDomain.getFree1RegFlg());
            domain.setFree1Dtl(criteriaDomain.getFree1Dtl());
            domain.setFree1OriginCntryFlg(criteriaDomain.getFree1OriginCntryFlg());
            domain.setFree2RegFlg(criteriaDomain.getFree2RegFlg());
            domain.setFree2Dtl(criteriaDomain.getFree2Dtl());
            domain.setFree2OriginCntryFlg(criteriaDomain.getFree2OriginCntryFlg());
            domain.setFree3RegFlg(criteriaDomain.getFree3RegFlg());
            domain.setFree3Dtl(criteriaDomain.getFree3Dtl());
            domain.setFree3OriginCntryFlg(criteriaDomain.getFree3OriginCntryFlg());
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W9019);
            
            // Update execution
            // 更新実行
            return tmExpFormalitiItemNoService.updateByCondition(domain, criteria);

        } else if (MODE_NEW.equals(criteriaDomain.getMode()) || MODE_COPY_NEW.equals(criteriaDomain.getMode())) {
            
            // 3.3.Registration processing
            // 3.3.登録処理
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setCompCd(criteriaDomain.getCompCd());
            domain.setItemNo(criteriaDomain.getItemNo());
            domain.setAplyStrtDt(criteriaDomain.getAplyStrtDt());
            domain.setCigmaPrdctFlg(criteriaDomain.getCigmaPrdctFlg());
            domain.setItemDescription(criteriaDomain.getItemDescription());
            domain.setExpLimitTyp(criteriaDomain.getExpLimitTyp());
            domain.setDngrItemFlg(criteriaDomain.getDngrItemFlg());
            domain.setHsCd(criteriaDomain.getHsCd());
            domain.setOriginCntryCd(criteriaDomain.getOriginCntryCd());
            domain.setFree1RegFlg(criteriaDomain.getFree1RegFlg());
            domain.setFree1Dtl(criteriaDomain.getFree1Dtl());
            domain.setFree1OriginCntryFlg(criteriaDomain.getFree1OriginCntryFlg());
            domain.setFree2RegFlg(criteriaDomain.getFree2RegFlg());
            domain.setFree2Dtl(criteriaDomain.getFree2Dtl());
            domain.setFree2OriginCntryFlg(criteriaDomain.getFree2OriginCntryFlg());
            domain.setFree3RegFlg(criteriaDomain.getFree3RegFlg());
            domain.setFree3Dtl(criteriaDomain.getFree3Dtl());
            domain.setFree3OriginCntryFlg(criteriaDomain.getFree3OriginCntryFlg());
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W9019);
            
            // Registration execution
            // 登録実行
            try {
                tmExpFormalitiItemNoService.create(domain);
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
            return 1;
        }
        return 0;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#deleteOnInquiryDelete(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public Integer deleteOnInquiryDelete(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException {

        // W9018   Processing No.6
        //【W9018  処理№ 6】
        
        // 4.Lock on the data
        // 4.データのロック
        TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
        criteria.setCompCd(criteriaDomain.getCompCd());
        criteria.setItemNo(criteriaDomain.getItemNo());
        criteria.setAplyStrtDt(criteriaDomain.getAplyStrtDt());

        TmExpFormalitiItemNoDomain lockTmExpFormalitiItemNoDomain = tmExpFormalitiItemNoService.lockByKeyNoWait(criteria);
        if (lockTmExpFormalitiItemNoDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }

        // 5.Delete Selected data
        // 5.選択データの削除
        criteria.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestamp());
        // ※削除件数0件時はExceptionが返る
        return tmExpFormalitiItemNoService.deleteByCondition(criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateCompanyFromToDate(String, String, String)
     */
    public boolean validateCompanyFromToDate(String from, String to, String dateFormat) {

        if (!CheckUtil.isBlankOrNull(from)
            && !CheckUtil.isBlankOrNull(to)) {
            return commonService.validateFromToDate(dateFormat, from, to);
        } else {
            return true;
        }
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public List<? extends W9018ExpFmlByItemMaItemDomain> searchForPagingOnInquirySearch(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) throws ApplicationException {
        // Get Search count
        // 検索件数の取得
        int count = w9018ExpFmlByItemMaDao.searchCountTmExpFormalitiItemNo(criteriaDomain);
        
        // Setting the search scope
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, criteriaDomain);
        
        // Get Search result
        // 検索結果の取得
        return w9018ExpFmlByItemMaDao.searchForPagingTmExpFormalitiItemNo(criteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public W9018ExpFmlByItemMaDomain searchOnEditInit(W9018ExpFmlByItemMaCriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        String mode = criteriaDomain.getMode();
        String prmCompany = criteriaDomain.getCompCd();
        String prmItemNo = criteriaDomain.getItemNo();
        Date prmApplyStartDate = criteriaDomain.getAplyStrtDt();
        String prmCigmaPrdctFlg = criteriaDomain.getCigmaPrdctFlg();
        
        W9018ExpFmlByItemMaDomain w9018ExpFmlByItemMaDomain = new W9018ExpFmlByItemMaDomain();
        
        // 4.Get Search data(Only EDIT mode/REF mode/COPY NEW mode)
        // 4.検索データの取得(修正・参照・コピー新規の場合のみ)
        TmExpFormalitiItemNoDomain tmExpFormalitiItemNoDomain = null;
        if (MODE_EDIT.equals(mode) || MODE_REF.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // Get Export Ship To Shipping Master data
            // 輸出手続品番原単位からデータ取得
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd(prmCompany);
            criteria.setItemNo(prmItemNo);
            criteria.setAplyStrtDt(prmApplyStartDate);
            criteria.setLocale(criteriaDomain.getLocale());
            
            tmExpFormalitiItemNoService.searchCount(criteria);
            tmExpFormalitiItemNoDomain = tmExpFormalitiItemNoService.searchByKey(criteria);
        }
        
        // 5.get the part number from CIGMA
        //  (In the case of 'Y' is the takeover value. CIGMA Products in the new)
        //   or (In the case of 'Y' is 4.1.CIGMA_PRDCT_FLG a modified copy new)
        // 5.CIGMAから品名を取得する（新規で引継値.CIGMA Productsが'Y'の場合、または修正・コピー新規で4.1.CIGMA_PRDCT_FLGが'Y'の場合）
        String itemNm = StringUtils.EMPTY;
        if (MODE_NEW.equals(mode) && FLAG_Y.equals(prmCigmaPrdctFlg)
            || null != tmExpFormalitiItemNoDomain 
            && ((MODE_EDIT.equals(mode) && FLAG_Y.equals(tmExpFormalitiItemNoDomain.getCigmaPrdctFlg()))
                || (MODE_COPY_NEW.equals(mode) && FLAG_Y.equals(tmExpFormalitiItemNoDomain.getCigmaPrdctFlg())))) {

            // 5.1.CIGMA night batch check
            // Master management 24H shipping non-compliant
            // 5.1.CIGMA夜間バッチ中チェック
            // マスタ管理は24H出荷非対応
            
            if (!validateDatabaseCigma(prmCompany) ) {
                if (MODE_NEW.equals(mode)){
                    errorList.add(new MessageDomain("w9018CriteriaDomain.compCd", NXS_E7_0075, null));
                    throw new ValidationException(errorList);
                } else {
                    w9018ExpFmlByItemMaDomain.setMsgId(NXS_E7_0075);
                    return w9018ExpFmlByItemMaDomain;
                }
            } else {
                if (!commonService.searchCigmaAvailable(false, prmCompany)) {
                    if (MODE_NEW.equals(mode)){
                        errorList.add(new MessageDomain("w9018CriteriaDomain.compCd", NXS_E1_0060, null));
                        throw new ValidationException(errorList);
                    } else {
                        w9018ExpFmlByItemMaDomain.setMsgId(NXS_E1_0060);
                        return w9018ExpFmlByItemMaDomain;
                    }
                }
            }

            // 5.2.Web Service「ECA0027_WS_9001：Get Item Info call of (Master Maintenance) 」
            // 5.2.Webサービス「ECA0027_WS_9001：Get Item Info(Master Maintenance)」のコール
            try {
                Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(prmCompany, prmItemNo, "");
                if (!WS_RESULT_SUCCESS.equals(ws9001ResultDomain.getResultCode())) {
                    if (ws9001ResultDomain.getErrorList().isEmpty()) {
                        throw new SystemException(NXS_91_0001);
                    } else {
                        throw new GscmApplicationException(ws9001ResultDomain.getErrorList().get(0).getErrorCode());
                    }
                }
                
                if(null != ws9001ResultDomain && null != ws9001ResultDomain.getItemInfo()){
                    itemNm = ws9001ResultDomain.getItemInfo().getItmNm();
                }
                // 5.4.Get check
                // 5.4.取得チェック
                if (CheckUtil.isBlankOrNull(itemNm)) {
                    w9018ExpFmlByItemMaDomain.setMsgId(NXS_E7_0030);
                    return w9018ExpFmlByItemMaDomain;
                }
            } catch (GscmApplicationException e) {
                if (e.getCode().equals(NXS_E1_0060)){
                    if (MODE_NEW.equals(mode)){
                        String pCompany = "w9018CriteriaDomain.compCd";
                        errorList.add(new MessageDomain(pCompany, NXS_E1_0060, null));
                        throw new ValidationException(errorList);
                    } else {
                        w9018ExpFmlByItemMaDomain.setMsgId(NXS_E1_0060);
                        return w9018ExpFmlByItemMaDomain;
                    }
                } else {
                    throw e;
                }
            }
        }
        
        // 6.get the country of origin and name of product from PKG Materials MA
        //  (In the case of 'N' is the takeover value. CIGMA Products in the new)
        //   or (In the case of 'N' is 4.1.CIGMA_PRDCT_FLG a modified copy new).
        // 6.包装材原単位から品名と原産国を取得する（新規で引継値.CIGMA Productsが'Nの場合、または修正・コピー新規で4.1.CIGMA_PRDCT_FLGが'Nの場合）
        W9018ExpFmlByItemMaDomain expFmlByItemMaDomain = new W9018ExpFmlByItemMaDomain();
        if (MODE_NEW.equals(mode) && FLAG_N.equals(prmCigmaPrdctFlg) 
            || null != tmExpFormalitiItemNoDomain 
            && ((MODE_EDIT.equals(mode) && FLAG_N.equals(tmExpFormalitiItemNoDomain.getCigmaPrdctFlg()))
                || (MODE_COPY_NEW.equals(mode) && FLAG_N.equals(tmExpFormalitiItemNoDomain.getCigmaPrdctFlg())))) {

            expFmlByItemMaDomain = w9018ExpFmlByItemMaDao.searchTmPkgMtrl(criteriaDomain);
            if (expFmlByItemMaDomain == null) {
                // The retry language "en" if it is not possible to take in the first time.
                // 1度目で取得できなかった場合は言語「en」でリトライ
                W9018ExpFmlByItemMaCriteriaDomain retry = new W9018ExpFmlByItemMaCriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(retry, criteriaDomain);
                retry.setLanguageCd(LANGUAGE_CD_ENGLISH);
                expFmlByItemMaDomain = w9018ExpFmlByItemMaDao.searchTmPkgMtrl(retry);
            }
            
            if (expFmlByItemMaDomain == null) {
                w9018ExpFmlByItemMaDomain.setMsgId(NXS_E7_0076);
                return w9018ExpFmlByItemMaDomain;
            }
        }
        
        // 7.Set to screen search results
        // 7.検索結果を画面に設定
        if (MODE_NEW.equals(mode)) {
            // NEW mode
            // 新規モード
            
            // CIGMA Products
            w9018ExpFmlByItemMaDomain.setCigmaPrdctFlg(prmCigmaPrdctFlg);
            
            // Item Name
            if (FLAG_Y.equals(prmCigmaPrdctFlg)) {
                w9018ExpFmlByItemMaDomain.setItemDescription(itemNm);
            } else {
                w9018ExpFmlByItemMaDomain.setItemDescription(expFmlByItemMaDomain.getPkgNm());
            }
            
            // DG Flg
            w9018ExpFmlByItemMaDomain.setDngrItemFlg(FLAG_N);
            
            // Country of Origin
            if (FLAG_N.equals(prmCigmaPrdctFlg)) {
                w9018ExpFmlByItemMaDomain.setOriginCntryCd(expFmlByItemMaDomain.getOriginCntryCd());
            }
            
            // Free Register Flg
            w9018ExpFmlByItemMaDomain.setFree1RegFlg(FLAG_N);
            w9018ExpFmlByItemMaDomain.setFree2RegFlg(FLAG_N);
            w9018ExpFmlByItemMaDomain.setFree3RegFlg(FLAG_N);
            
        } else if (MODE_EDIT.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // EDIT mode / COPY NEW mode
            // 修正・コピー新規モード
            CommonUtil.copyPropertiesDomainToDomain(w9018ExpFmlByItemMaDomain, tmExpFormalitiItemNoDomain);
            
            // CIGMA Products
            String cigmaPrdct = tmExpFormalitiItemNoDomain.getCigmaPrdctFlg();
            
            // Item Name, Country of Origin
            if (FLAG_Y.equals(cigmaPrdct)) {
                w9018ExpFmlByItemMaDomain.setItemDescription(itemNm);
                w9018ExpFmlByItemMaDomain.setOriginCntryCd(tmExpFormalitiItemNoDomain.getOriginCntryCd());
            } else {
                w9018ExpFmlByItemMaDomain.setItemDescription(expFmlByItemMaDomain.getPkgNm());
                w9018ExpFmlByItemMaDomain.setOriginCntryCd(expFmlByItemMaDomain.getOriginCntryCd());
            }
            
        } else if (MODE_REF.equals(mode)) {
            // REF mode
            // 参照モード
            CommonUtil.copyPropertiesDomainToDomain(w9018ExpFmlByItemMaDomain, tmExpFormalitiItemNoDomain);
        }
        
        // 8.Get the Free item name
        // 8.Free項目名の取得
        TmInvFreeItemCriteriaDomain tmInvFreeItemCriteriaDomain = new TmInvFreeItemCriteriaDomain();
        tmInvFreeItemCriteriaDomain.setCompCd(prmCompany);
        List<TmInvFreeItemDomain> tmInvFreeItemDomainList = tmInvFreeItemService.searchByCondition(tmInvFreeItemCriteriaDomain);
        for (int i = 0; i < tmInvFreeItemDomainList.size(); i++) {
            TmInvFreeItemDomain invFreeItemDomain = tmInvFreeItemDomainList.get(i);
            
            if ("1".equals(invFreeItemDomain.getFreeColNo().toPlainString())) {
                w9018ExpFmlByItemMaDomain.setFree1Value(StringUtil.getEmptyToBlank(invFreeItemDomain.getFreeColNm()) + " Value");
            } else if ("2".equals(invFreeItemDomain.getFreeColNo().toPlainString())) {
                w9018ExpFmlByItemMaDomain.setFree2Value(StringUtil.getEmptyToBlank(invFreeItemDomain.getFreeColNm()) + " Value");
            } else if ("3".equals(invFreeItemDomain.getFreeColNo().toPlainString())) {
                w9018ExpFmlByItemMaDomain.setFree3Value(StringUtil.getEmptyToBlank(invFreeItemDomain.getFreeColNm()) + " Value");
            }
        }
        return w9018ExpFmlByItemMaDomain;
    }
    
    /**
     * 
     * Type in the functional overview of the method.
     *
     * @param compCd compCd
     * @return true/false
     * @throws ApplicationException applicationException
     */
    public boolean validateDatabaseCigma(String compCd) throws ApplicationException {
        try {
            commonService.searchCigmaNightFlg(compCd);
            return true;
        } catch (SystemException e) {
            if (e.getCode().equals(GSCM_E0_0001)){
                return false;
            }
            return true;
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateConsistencyAfterDate(String, String, String)
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String compCd) throws ApplicationException {
        return commonService.validateAfterDateComp(date, dateFormat, compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateConsistencyCompAuth(String)
     */
    public boolean validateConsistencyCompAuth(String compCd) throws ApplicationException {

        W9018ExpFmlByItemMaDomain domain = new W9018ExpFmlByItemMaDomain();
        
        //  W9018   Processing No. Initial display
        //【W9018  処理№ 初期表示】
        
        // 2.Setting the initial value
        // 2.初期値の設定
        List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_W9018R);
        domain.setUserAuthList(userAuthList);
        
        
        // W9018   Processing No.2
        //【W9018  処理№ 2】
        
        // 1.2.Authority check(Authorization check for Company)
        // 1.2.権限チェック Companyの権限チェック
        if (!CheckUtil.isBlankOrNull(compCd)) {
            return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9018R, compCd);
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateDatabaseCountry(String)
     */
    public boolean validateDatabaseCountry(String countryCd) throws ApplicationException {
        
        // W9019   Processing No.3
        //【W9019  処理№ 3】
        
        // 2.3.1.existence check
        // 2.3.1.存在チェック
        return commonService.validateCountry(countryCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateDatabaseShipper(String)
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException {
        // Shipper existence check
        // Shipper存在チェック
        return commonService.validateShipper(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService#validateDatabaseTmExpFormalitiItemNoOnEditRegister(String, String, String, String)
     */
    public boolean validateDatabaseTmExpFormalitiItemNoOnEditRegister(String compCd, String itemNo, String aplyStrtDt, String dateFormat)
        throws ApplicationException {

        // Lock of Export Ship To Shipping Master data
        // 輸出手続品番原単位をロック
        TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
        criteria.setCompCd(compCd);
        criteria.setItemNo(itemNo);
        criteria.setAplyStrtDt(DateUtil.parseDate(aplyStrtDt, dateFormat));
        
        TmExpFormalitiItemNoDomain resultDomain = tmExpFormalitiItemNoService.lockByKeyNoWait(criteria);
        if (resultDomain == null) {
            return false;
        }
        return true;
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
     * @throws ApplicationException can not calculate search range<br />
     * 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W9018ExpFmlByItemMaCriteriaDomain criteria) 
        throws ApplicationException {
        
        // Getting information page
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        // Set the start and end position in the search condition domain
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }
}
