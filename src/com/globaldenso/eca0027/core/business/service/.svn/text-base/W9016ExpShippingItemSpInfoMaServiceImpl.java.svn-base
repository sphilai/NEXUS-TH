/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK_NOTATION_MAX_PAR_LINE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK_NOTATION_MAX_ROW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0044;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0158;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9016R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.gscm.framework.constants.Constants.ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.dao.W9016ExpShippingItemSpInfoMaDao;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9001RestService;
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
 * Service implementation class of Exp Shipping Item Sp Info MA
 * <br />Exp Shipping Item Sp Info MAのサービス実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public class W9016ExpShippingItemSpInfoMaServiceImpl implements W9016ExpShippingItemSpInfoMaService {

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
     * TmNxsCompService
     */
    protected TmNxsCompService tmNxsCompService;

    /**
     * TmExpItemNoSpInfoService
     */
    protected TmExpItemNoSpInfoService tmExpItemNoSpInfoService;

    /**
     * TmExpShipToShippingService
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;

    /**
     * TmCigmaShipToXrefService
     */
    protected TmCigmaShipToXrefService tmCigmaShipToXrefService;

    /**
     * W9016ExpShippingItemSpInfoMaDao
     */
    protected W9016ExpShippingItemSpInfoMaDao w9016ExpShippingItemSpInfoMaDao;
    
    /**
     * Ws9001RestService
     */
    protected Ws9001RestService ws9001RestService;
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9016ExpShippingItemSpInfoMaServiceImpl() {
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
     * Setter method for tmExpItemNoSpInfoService.
     *
     * @param tmExpItemNoSpInfoService Set for tmExpItemNoSpInfoService
     */
    public void setTmExpItemNoSpInfoService(
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService) {
        this.tmExpItemNoSpInfoService = tmExpItemNoSpInfoService;
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
     * Setter method for tmCigmaShipToXrefService.
     *
     * @param tmCigmaShipToXrefService Set for tmCigmaShipToXrefService
     */
    public void setTmCigmaShipToXrefService(
        TmCigmaShipToXrefService tmCigmaShipToXrefService) {
        this.tmCigmaShipToXrefService = tmCigmaShipToXrefService;
    }

    /**
     * Setter method for w9016ExpShippingItemSpInfoMaDao.
     *
     * @param expShippingItemSpInfoMaDao Set for w9016ExpShippingItemSpInfoMaDao
     */
    public void setW9016ExpShippingItemSpInfoMaDao(
        W9016ExpShippingItemSpInfoMaDao expShippingItemSpInfoMaDao) {
        w9016ExpShippingItemSpInfoMaDao = expShippingItemSpInfoMaDao;
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
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#createOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public Integer createOnEditRegister(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException {
        
        // W9017   Processing No.3
        //【W9017  処理№ 3】
        
        String compCd               = criteria.getCompCd();                 //【3】Company
        String itemNo               = criteria.getItemNo();                 //【4】Item No.
        String pkgCd                = criteria.getPkgCd();                  //【5】PKG CD
        String customerCd           = criteria.getCustomerCd();             //【6】Cust. No.
        String lgcyShipTo           = criteria.getLgcyShipTo();             //【7】Ship to
        String aplyStrtDt           = criteria.getAplyStrtDt();             //【8】Apply Start Date
        String itemDescription      = criteria.getItemDescription();        //【10】Description
        String shippingLot          = criteria.getShippingLot();            //【11】Ship Lot
        String invoiceKey           = criteria.getInvoiceKey();             //【12】Inv. Set Key
        String stgInstrItemFlg      = criteria.getStgInstrItemFlg();        //【13】Stg. Instr. Flg
        String customTimingTyp      = criteria.getCustomTimingTyp();        //【14】C/C TYPE
        String containerSortingKey  = criteria.getContainerSortingKey();    //【15】Cont. Sort Key
        String loadingCd            = criteria.getLoadingCd();              //【16】LD CD
        String containerLooseTyp    = criteria.getContainerLooseTyp();      //【17】C/L
        String casemarkNotation     = criteria.getCasemarkNotation();       //【18】CML Remarks
        Timestamp comUpdateTimestampn = criteria.getComUpdateTimestamp();   // 最終更新日時
        String mode = criteria.getMode();                                   // 処理モード
        int retCount = 0;
        
        Date cnvDateDt    = DateUtil.parseDate(aplyStrtDt, criteria.getScreenDateFormat());
        
        // 3.1.judgment of the registration and update process of（Export Shipping Item No Special Information Master）.
        // 3.1.輸出出荷品目番号原単位の登録・更新処理の判定
        if (MODE_EDIT.equals(mode)) {
            // EDIT mode
            // 更新モード
            
            // 3.2.1.Updated content
            // 3.2.1.更新内容
            TmExpItemNoSpInfoDomain updDomain = new TmExpItemNoSpInfoDomain();
            updDomain.setItemDescription(itemDescription);
            updDomain.setShippingLot(StringUtil.parseBigDecimal(shippingLot));
            updDomain.setInvoiceKey(invoiceKey);
            updDomain.setStgInstrItemFlg(stgInstrItemFlg);
            updDomain.setCustomTimingTyp(customTimingTyp);
            updDomain.setContainerSortingKey(containerSortingKey);
            updDomain.setLoadingCd(loadingCd);
            updDomain.setContainerLooseTyp(containerLooseTyp);
            updDomain.setCasemarkNotation(casemarkNotation);
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(updDomain, SCREEN_ID_W9017);
            
            // 3.2.2.Narrowing of the update data.
            // 3.2.2.更新データの絞込み方法
            TmExpItemNoSpInfoCriteriaDomain updCriteria = new TmExpItemNoSpInfoCriteriaDomain();
            updCriteria.setCompCd(compCd);
            updCriteria.setItemNo(itemNo);
            updCriteria.setPkgCd(pkgCd);
            updCriteria.setCustomerCd(customerCd);
            updCriteria.setLgcyShipTo(lgcyShipTo);
            updCriteria.setAplyStrtDt(cnvDateDt);
            updCriteria.setComUpdateTimestamp(comUpdateTimestampn);
            
            retCount = tmExpItemNoSpInfoService.updateByCondition(updDomain, updCriteria);
            
        } else if (MODE_NEW.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // COPY NEW mode
            // 新規・コピー新規
            
            // 3.3.1.Created content
            // 3.3.1.登録内容
            TmExpItemNoSpInfoDomain insDomain = new TmExpItemNoSpInfoDomain();
            insDomain.setCompCd(compCd);
            insDomain.setItemNo(itemNo);
            insDomain.setPkgCd(pkgCd);
            insDomain.setCustomerCd(customerCd);
            insDomain.setLgcyShipTo(lgcyShipTo);
            insDomain.setAplyStrtDt(cnvDateDt);
            insDomain.setComUpdateTimestamp(comUpdateTimestampn);
            insDomain.setItemDescription(itemDescription);
            insDomain.setShippingLot(StringUtil.parseBigDecimal(shippingLot));
            insDomain.setInvoiceKey(invoiceKey);
            insDomain.setStgInstrItemFlg(stgInstrItemFlg);
            insDomain.setCustomTimingTyp(customTimingTyp);
            insDomain.setContainerSortingKey(containerSortingKey);
            insDomain.setLoadingCd(loadingCd);
            insDomain.setContainerLooseTyp(containerLooseTyp);
            insDomain.setCasemarkNotation(casemarkNotation);
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(insDomain, SCREEN_ID_W9017);
            try {
                tmExpItemNoSpInfoService.create(insDomain);
                retCount = 1;
            } catch (IntegrationLayerException e) {
                if (ORACLE_ERROR_CODE_DUP_VAL_ON_INDEX == e.getSqlErrorCode()) {
                    throw new GscmApplicationException(GSCM_E0_0020);
                }
                throw e;
            }
        }
        return retCount;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#deleteOnInquiryDelete(W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public Integer deleteOnInquiryDelete(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria)throws ApplicationException {
        
        // W9016   Processing No.7
        //【W9016  処理№ 7】
        
        String compCd     = criteria.getCompCd();       //【54】Company
        String itemNo     = criteria.getItemNo();       //【55】Item No.
        String pkgCd      = criteria.getPkgCd();        //【56】PKG CD
        String customerCd = criteria.getCustomerCd();   //【57】Cust. No.
        String lgcyShipTo = criteria.getLgcyShipTo();   //【58】Ship to
        String aplyStrtDt = criteria.getAplyStrtDt();   //【59】Apply Start Date
        Date cnvDateDt    = DateUtil.parseDate(aplyStrtDt, criteria.getScreenDateFormat());
        // 4.Lock of Selection data
        // 4.選択データをロック
        TmExpItemNoSpInfoCriteriaDomain criteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
        criteriaDomain.setCompCd(compCd);
        criteriaDomain.setItemNo(itemNo);
        criteriaDomain.setPkgCd(pkgCd);
        criteriaDomain.setCustomerCd(customerCd);
        criteriaDomain.setLgcyShipTo(lgcyShipTo);
        criteriaDomain.setAplyStrtDt(cnvDateDt);
        TmExpItemNoSpInfoDomain lockTmExpItemNoSpInfoDomain = tmExpItemNoSpInfoService.lockByKeyNoWait(criteriaDomain);
        if (lockTmExpItemNoSpInfoDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        // 5.deleted Selection data
        // 5.選択データの削除
        criteriaDomain.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
        return tmExpItemNoSpInfoService.deleteByCondition(criteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#searchForPagingOnInquirySearch(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public List<? extends W9016ExpShippingItemSpInfoMaItemDomain> searchForPagingOnInquirySearch(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException {

        // W9016   Processing No.4
        //【W9016  処理№ 4】
        
        // Creation of search condition domain
        // 検索条件ドメインの作成
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain = createCriteria(criteria);
        
        // Get Search count
        // 検索件数の取得
        int count = w9016ExpShippingItemSpInfoMaDao.searchCountTmExpItemNoSpInfo(criteriaDomain);
        
        // Setting the search scope
        // 検索範囲の設定
        setPageInfo(criteria.getPageInfoCreator(), count, criteriaDomain);
        
        // Search result
        // 検索結果
        return w9016ExpShippingItemSpInfoMaDao.searchForPagingTmExpItemNoSpInfo(criteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#searchOnEditInit(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public W9016ExpShippingItemSpInfoMaDomain searchOnEditInit(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException {
        
        // W9017   Processing No.1
        //【W9017  処理№ 1】
        
        String mode         = criteria.getMode();           // 処理モード
        String compCd       = criteria.getCompCd();         //【3】Company
        String itemNo       = criteria.getItemNo();         //【4】Item No.
        String pkgCd        = criteria.getPkgCd();          //【5】PKG CD
        String customerCd   = criteria.getCustomerCd();     //【6】Cust. No.
        String lgcyShipTo   = criteria.getLgcyShipTo();     //【7】Ship to
        String aplyStrtDt   = criteria.getAplyStrtDt();     //【8】Apply Start Date

        Date cnvDateDt    = DateUtil.parseDate(aplyStrtDt, criteria.getScreenDateFormat());

        W9016ExpShippingItemSpInfoMaDomain rtnDomain = new W9016ExpShippingItemSpInfoMaDomain();
        rtnDomain.setCompCd(compCd);
        rtnDomain.setItemNo(itemNo);
        rtnDomain.setPkgCd(pkgCd);
        rtnDomain.setCustomerCd(customerCd);
        rtnDomain.setLgcyShipTo(lgcyShipTo);
        rtnDomain.setAplyStrtDt(aplyStrtDt);
        
        if (MODE_EDIT.equals(mode) || MODE_REF.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // EDIT mode / REF mode / COPY NEW mode
            // 修正モード、参照モード、コピー新規モードの場合
            
            // 4.1.Get Export Ship To Shipping Master data
            // 4.1.輸出出荷品目番号原単位のデータ取得
            TmExpItemNoSpInfoCriteriaDomain criteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
            criteriaDomain.setCompCd(compCd);
            criteriaDomain.setItemNo(itemNo);
            criteriaDomain.setPkgCd(pkgCd);
            criteriaDomain.setCustomerCd(customerCd);
            criteriaDomain.setLgcyShipTo(lgcyShipTo);
            criteriaDomain.setAplyStrtDt(cnvDateDt);
            criteriaDomain.setLocale(criteria.getLocale());
            tmExpItemNoSpInfoService.searchCount(criteriaDomain);
            List<TmExpItemNoSpInfoDomain> tmExpItemNoSpInfoList = tmExpItemNoSpInfoService.searchByCondition(criteriaDomain);
            
            if (tmExpItemNoSpInfoList.size() != 0) {
                TmExpItemNoSpInfoDomain domain = tmExpItemNoSpInfoList.get(0);
                // 【10】Description
                rtnDomain.setItemDescription(domain.getItemDescription());
                // 【11】Ship Lot
                if (domain.getShippingLot() != null) {
                    rtnDomain.setShippingLot(domain.getShippingLot().toString());
                }
                // 【12】Inv. Set Key
                rtnDomain.setInvoiceKey(domain.getInvoiceKey());
                // 【13】Stg. Instr. Flg
                rtnDomain.setStgInstrItemFlg(domain.getStgInstrItemFlg());
                // 【14】C/C TYPE
                rtnDomain.setCustomTimingTyp(domain.getCustomTimingTyp());
                // 【15】Cont. Sort Key
                rtnDomain.setContainerSortingKey(domain.getContainerSortingKey());
                // 【16】LD CD
                rtnDomain.setLoadingCd(domain.getLoadingCd());
                // 【17】C/L
                rtnDomain.setContainerLooseTyp(domain.getContainerLooseTyp());
                // 【18】CML Remarks
                rtnDomain.setCasemarkNotation(domain.getCasemarkNotation());
                // 【19】LAST UPDATE DATE
                // 【19】最終更新日時
                rtnDomain.setComUpdateTimestamp(domain.getComUpdateTimestamp());
            }

            
            
        } else if (MODE_NEW.equals(mode)) {
            // NEW mode
            // 新規モード
            // 5.1.Web Service「ECA0027_WS_9001：Get Item Info call of (Master Maintenance) 」
            // 5.1.Webサービス「ECA0027_WS_9001：Get Item Info(Master Maintenance)」のコール
            try  {
                Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(compCd, itemNo, customerCd);
                if (!WS_RESULT_SUCCESS.equals(ws9001ResultDomain.getResultCode())) {
                    if (ws9001ResultDomain.getErrorList().isEmpty()) {
                        throw new SystemException(NXS_91_0001);
                    } else {
                        throw new GscmApplicationException(ws9001ResultDomain.getErrorList().get(0).getErrorCode());
                    }
                }
                String itemNm = StringUtils.EMPTY;
                if (ws9001ResultDomain.getItemInfo() == null) {
                    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                    Object[] params = { "(" + itemNo + ")" };
                    errorList.add(new MessageDomain("w9016CriteriaDomain.itemNo", NXS_E7_0030, params));
                    throw new ValidationException(errorList);
                } 
                // UT305 MOD START
                //itemNm = ws9001ResultDomain.getItemInfo().getItmNm();
                //if (CheckUtil.isBlankOrNull(itemNm)) {
                //    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                //    // UT296 MOD START
                //    //Object[] params = { "(" + itemNo + ")" };
                //    //errorList.add(new MessageDomain("w9016CriteriaDomain.itemNo", NXS_E7_0030, params));
                //    errorList.add(new MessageDomain("w9016CriteriaDomain.itemNo", NXS_E7_0044, null));
                //    errorList.add(new MessageDomain("w9016CriteriaDomain.customerCd", null, null));
                //    // UT296 MOD END
                //    throw new ValidationException(errorList);
                //}
                
                // No record of item in P/N Xref MA.
                // 品対に品番のレコードなし
                if (CheckUtil.isBlankOrNull(ws9001ResultDomain.getItemInfo().getItmNm())
                    && CheckUtil.isBlankOrNull(ws9001ResultDomain.getItemInfo().getItemNameFuture())
                )
                {
                    // Change the message in the presence or absence of Item MA.
                    // Item MAの有無でメッセージを変える。
                    if (CheckUtil.isBlankOrNull(ws9001ResultDomain.getItemInfo().getLotsz())) {
                        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                        Object[] params = { "(" + itemNo + ")" };
                        errorList.add(new MessageDomain("w9016CriteriaDomain.itemNo", NXS_E7_0030, params));
                        throw new ValidationException(errorList);
                    } else {
                        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                        errorList.add(new MessageDomain("w9016CriteriaDomain.itemNo", NXS_E7_0044, null));
                        errorList.add(new MessageDomain("w9016CriteriaDomain.customerCd", null, null));
                        throw new ValidationException(errorList);
                    }
                }
                // UT305 MOD END

                // 6.Get from the default value of Export Ship To Shipping Master.
                // 6.輸出送荷先出荷原単位からデフォルト値の取得

                // 6.1.Get Ship to Cd of NEXUS.
                // 6.1.NEXUSの送荷先コードの取得
                TmCigmaShipToXrefCriteriaDomain tmCigmaShipToXrefCriteriaDomain = new TmCigmaShipToXrefCriteriaDomain();
                // 【3】Company Full match
                // 【3】Company 完全一致
                tmCigmaShipToXrefCriteriaDomain.setLgcyLibCompCd(compCd);
                // 【6】Cust. No. Full match
                // 【6】Cust. No. 完全一致
                tmCigmaShipToXrefCriteriaDomain.setCustomerCd(customerCd);
                // 【7】Ship to Full match
                // 【7】Ship to 完全一致
                tmCigmaShipToXrefCriteriaDomain.setLgcyShipTo(lgcyShipTo);

                List<TmCigmaShipToXrefDomain> tmCigmaShipToXrefDomainList = tmCigmaShipToXrefService.searchByCondition(tmCigmaShipToXrefCriteriaDomain);

                if(tmCigmaShipToXrefDomainList.size() != 0) {
                    // 6.2.Get from Export Ship To Shipping Master.
                    // 6.2.輸出送荷先出荷原単位からデータを取得
                    TmExpShipToShippingCriteriaDomain criteriaDomain = new TmExpShipToShippingCriteriaDomain();
                    // 【3】Company Full match
                    // 【3】Company 完全一致
                    criteriaDomain.setCompCd(compCd);
                    // 6.1.SHIP_TO_CD Full match
                    // 6.1.SHIP_TO_CD 完全一致
                    criteriaDomain.setShipToCd(tmCigmaShipToXrefDomainList.get(0).getShipToCd());
                    // Get the data of the latest date in the date (time zone conversion) APLY_STRT_DT ≦ current
                    // APLY_STRT_DT≦現在日付（タイムゾーン変換）の中で最も後の日付のデータを抽出
                    String timezoneId = commonService.searchTimezone(compCd);
                    Date nowDt = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);
                    criteriaDomain.setAplyStrtDtLessThanEqual(nowDt);
                    
                    List<TmExpShipToShippingDomain> tmExpShipToShippingList = tmExpShipToShippingService.searchByCondition(criteriaDomain);
                    
                    if (tmExpShipToShippingList.size() != 0) {
                        TmExpShipToShippingDomain tmExpShipToShippingDomain = tmExpShipToShippingList.get(tmExpShipToShippingList.size() - 1);
                        // 【14】C/C TYPE
                        rtnDomain.setCustomTimingTyp(tmExpShipToShippingDomain.getCustomTimingTyp());
                        // 【15】Cont. Sort Key
                        rtnDomain.setContainerSortingKey(tmExpShipToShippingDomain.getContainerSortingKey());
                        // 【16】LD CD
                        rtnDomain.setLoadingCd(tmExpShipToShippingDomain.getLoadingCd());
                        // 【17】C/L
                        rtnDomain.setContainerLooseTyp(tmExpShipToShippingDomain.getContainerLooseTyp());
                    } else {
                        throw new GscmApplicationException(NXS_E7_0158);
                    }
                }

                // 【10】Description
                // UT305 MOD START
                //rtnDomain.setItemDescription(ws9001ResultDomain.getItemInfo().getItmNm());
                // Get a name in the 1.currently, 2.future priority order.
                // 品対から①現在有効、②未来日有効の優先順で名称を取得する。
                itemNm = ws9001ResultDomain.getItemInfo().getItmNm();
                if (CheckUtil.isBlankOrNull(itemNm)) {
                    itemNm = ws9001ResultDomain.getItemInfo().getItemNameFuture();
                }
                rtnDomain.setItemDescription(itemNm);
                // UT305 MOD END
                // 【11】Ship Lot
                rtnDomain.setShippingLot(ws9001ResultDomain.getItemInfo().getLotsz());

            } catch (GscmApplicationException e) {
                if (e.getCode().equals(NXS_E1_0060)){
                    String pCompany = "w9016CriteriaDomain.compCd";
                    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                    errorList.add(new MessageDomain(pCompany, NXS_E1_0060, null));
                    throw new ValidationException(errorList);
                } else if (e.getCode().equals(NXS_E7_0158)){
                    String pCompany = "w9016CriteriaDomain.compCd";
                    String pCustomerCd = "w9016CriteriaDomain.customerCd";
                    String pLgcyShipTo = "w9016CriteriaDomain.lgcyShipTo";
                    List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                    errorList.add(new MessageDomain(pCompany, NXS_E7_0158, null));
                    errorList.add(new MessageDomain(pCustomerCd, null, null));
                    errorList.add(new MessageDomain(pLgcyShipTo, null, null));
                    throw new ValidationException(errorList);
                } else {
                    throw e;
                }
            }
        }

        return rtnDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateConsistencyCompAuth(String)
     */
    public boolean validateConsistencyCompAuth(String company) throws ApplicationException {
        
        // W9016   Processing No.1
        //【W9016  処理№ 1】
        
        // Check for Updates authority
        // 更新権限があるかどうか
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9016R, company);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabaseCigma(String)
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
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabaseCigmaAvailable(String)
     */
    public boolean validateDatabaseCigmaAvailable(String compCd) throws ApplicationException {
        
        // W9017   Processing No.1
        //【W9017  処理№ 1】
        
        // 2.3
        return commonService.searchCigmaAvailable(false, compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabasePkgCd(String, String)
     */
    public boolean validateDatabasePkgCd(String compCd, String pkgCd) throws ApplicationException {

        // W9017   Processing No.1
        //【W9017  処理№ 1】
        
        // 2.1.3.1
        TmNxsCompCriteriaDomain criteriaDomain = new TmNxsCompCriteriaDomain();
        criteriaDomain.setCompCd(compCd);
        List<TmNxsCompDomain> list = tmNxsCompService.searchByCondition(criteriaDomain);
        if (list.size() == 0) {
            return false;
        }
        TmNxsCompDomain domain = list.get(0);

        // 2.1.3.2
        return commonService.validatePkgCd(pkgCd, domain.getItemNoGrp());
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabaseShipper(String)
     */
    public boolean validateDatabaseShipper(String shipper) throws ApplicationException {

        // W9017   Processing No.1
        //【W9017  処理№ 1】
        
         // 2.1.1
        return commonService.validateShipper(shipper);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabaseShipperCustomerShipTo(String, String, String)
     */
    public boolean validateDatabaseShipperCustomerShipTo(String compCd, String customerCd, String shipToCd) throws ApplicationException {
        
        // W9017   Processing No.1
        //【W9017  処理№ 1】
        
        // 2.1.2
        return commonService.validateShipperCustomerShipTo(compCd, customerCd, shipToCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateDatabaseTmExpItemNoSpInfoOnEditRegister(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnEditRegister(W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) throws ApplicationException {
        
        // W9017   Processing No.3
        //【W9017  処理№ 3】
        
        if (MODE_EDIT.equals(criteria.getMode())) {
            // 2.7.Lock selection data(Only EDIT mode)
            // 2.7.選択データをロック(修正モードの場合のみ)
            
            String aplyStrtDt   = criteria.getAplyStrtDt();     //【8】Apply Start Date
            Date cnvDateDt    = DateUtil.parseDate(aplyStrtDt, criteria.getScreenDateFormat());
            
            TmExpItemNoSpInfoCriteriaDomain criteriaDomain = new TmExpItemNoSpInfoCriteriaDomain();
            criteriaDomain.setCompCd(criteria.getCompCd());
            criteriaDomain.setItemNo(criteria.getItemNo());
            criteriaDomain.setPkgCd(criteria.getPkgCd());
            criteriaDomain.setCustomerCd(criteria.getCustomerCd());
            criteriaDomain.setLgcyShipTo(criteria.getLgcyShipTo());
            criteriaDomain.setAplyStrtDt(cnvDateDt);
            TmExpItemNoSpInfoDomain tmExpItemNoSpInfoDomain = tmExpItemNoSpInfoService.lockByKeyNoWait(criteriaDomain);
            if (tmExpItemNoSpInfoDomain == null) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateConsistencyTxtLines(java.lang.String)
     */
    public boolean validateConsistencyTxtLines(String cmlRemarks) {
        String[] cmlRemarksArr = cmlRemarks.split(LINE_SEPARATOR, -1);
        
        // Check Line separator.
        if (cmlRemarksArr.length > CASEMARK_NOTATION_MAX_ROW) {
            return false;
        }
        // Check number of characters per line.
        for(String str : cmlRemarksArr) {
            if (str.length() > CASEMARK_NOTATION_MAX_PAR_LINE) {
                return false;
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateConsistencyCLAndCCSpInf(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyCLAndCCSpInf(String stgInstrFlg, String ccType, String cl) {

        // W9017   Processing No.3
        //【W9017  処理№ 3】
        
        // 2.3.Check correlation
        // 2.3.相関チェック

        // 【17】C/L = 'L'で【14】C/C TYPEが'Z'でない場合
        if ("L".equals(cl) && !"Z".equals(ccType)) {
            return false;
        }
        
        // 【17】C/L = 'L'で【13】Stg. Instr. Flgが'Y'でない場合
        if ("L".equals(cl) && !"Y".equals(stgInstrFlg)) {
            return false;
        }
        
        // 【14】C/C TYPEが'Z'で【13】Stg. Instr. Flgが'Y'でない場合
        if ("Z".equals(ccType) && !"Y".equals(stgInstrFlg)) {
            return false;
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#validateConsistencyAfterDate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyAfterDate(String date, String dateFormat, String compCd) throws ApplicationException {

        // W9017   Processing No.3
        //【W9017  処理№ 3】
        
        // 2.4.Past date Check(【8】Time zone conversion date Apply Start Date, the Company)
        // 2.4.過去日チェック（【8】Apply Start Date、Companyのタイムゾーン変換日付）
        return commonService.validateAfterDateComp(date, dateFormat, compCd);
    }

    /**
     * make a paging search condition domain.
     * <br />ページング検索条件ドメインを作成します。
     *
     * @param criteriaDomain Search condition domain of main screen
     * <br />Main画面の検索条件ドメイン
     * @return Search condition domain of the service 
     * <br />サービスの検索条件ドメイン
     * @throws ApplicationException
     * <br />アプリケーション例外
     */
    protected W9016ExpShippingItemSpInfoMaCriteriaDomain createCriteria(W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain)
        throws ApplicationException {
        W9016ExpShippingItemSpInfoMaCriteriaDomain newCriteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        
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
     * Calculate a search range.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreatorオブジェクト
     * @param count The number of searches
     * <br />検索件数
     * @param criteria Search condition domain
     * <br />検索条件ドメイン
     * @throws ApplicationException cannot calculate a search range
     * <br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W9016ExpShippingItemSpInfoMaCriteriaDomain criteria) 
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
     * {@inheritDoc}
     * 
     * UT305 ADD
     * 
     * @see com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService#searchRefreshOnEdit(com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain)
     */
    public W9016ExpShippingItemSpInfoMaDomain searchRefreshOnEdit(W9016ExpShippingItemSpInfoMaCriteriaDomain expShippingItemSpInfoMaCriteriaDomain)
        throws ApplicationException
    {
        W9016ExpShippingItemSpInfoMaDomain expShippingItemSpInfoMaResultDomain = null;
        Ws9001ResultDomain ws9001ResultDomain = null;

        // Convert Apply Start Date to CIGMA format.
        // Apply Start DateをCIGMAフォーマットに変換する。
        Date tempDt = DateUtil.parseDate(expShippingItemSpInfoMaCriteriaDomain.getAplyStrtDt(),
            expShippingItemSpInfoMaCriteriaDomain.getScreenDateFormat());
        String refDate = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT).format(tempDt);
        try  {
            // WEB service call
            // WEBサービスを呼び出す。
            ws9001ResultDomain
                = ws9001RestService.getItemInfoForMa(expShippingItemSpInfoMaCriteriaDomain.getCompCd(),
                    expShippingItemSpInfoMaCriteriaDomain.getItemNo(),
                        expShippingItemSpInfoMaCriteriaDomain.getCustomerCd(), refDate);

        } catch (GscmApplicationException e) {
            // During CIGMA night batch.
            // CIGMA夜間バッチ中
            if (e.getCode().equals(NXS_E1_0060)){
                String pCompany = "w9016CriteriaDomain.compCd";
                List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                errorList.add(new MessageDomain(pCompany, NXS_E1_0060, null));
                throw new ValidationException(errorList);
            } else {
                throw e;
            }
        }
        // Edit the return value.
        // 戻り値の編集
        if (ws9001ResultDomain.getItemInfo() == null) {
            return null;
        }
        if (CheckUtil.isBlankOrNull(ws9001ResultDomain.getItemInfo().getItmNm())) {
            return null;
        }
        expShippingItemSpInfoMaResultDomain = new W9016ExpShippingItemSpInfoMaDomain();
        expShippingItemSpInfoMaResultDomain
            .setItemDescription(ws9001ResultDomain.getItemInfo().getItmNm());

        return expShippingItemSpInfoMaResultDomain;
    }
}
