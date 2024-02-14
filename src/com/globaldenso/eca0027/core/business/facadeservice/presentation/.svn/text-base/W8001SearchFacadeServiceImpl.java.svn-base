/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_ACCTIVE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LEVEL_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LEVEL_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LEVEL_2;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W8001;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.StringUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * 
 * An implementation class of service for Search Facade action of progress control Main screen.
 * <br />進度管理Main画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11165 $
 */
public class W8001SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W8001ListDomain>, W8001CriteriaDomain> {

    /**
     * Common service<br />
     * 共通サービス
     */
    protected CommonService commonService;
    /**
     * Progress control service<br />
     * 進度管理サービス
     */
    protected W8001ProgCtrlService w8001ProgCtrlService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W8001SearchFacadeServiceImpl() {
        super();
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
     * Setter method for w8001ProgCtrlService.
     *
     * @param progCtrlService Set for w8001ProgCtrlService
     */
    public void setW8001ProgCtrlService(W8001ProgCtrlService progCtrlService) {
        w8001ProgCtrlService = progCtrlService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W8001CriteriaDomain filterDomain(W8001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check.
     * For details, see screen definition document ECA0027_W8001_Progress Control Main Screen.xls "Display item definition".
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     *     詳細は画面定義書_ECA0027_W8001_Progress Control Main Screen.xls「画面項目定義」を参照
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W8001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W8001CriteriaDomain> valid 
            = new Validator<W8001CriteriaDomain>(criteriaDomain, "w8001CriteriaDomain");
        
        String[] properties = {
            "shipperCd",
            "consigneeCd",
            "shipToCd",
            "customerCd",
            "lgcyShipTo",
            "fmExpPackingDt",
            "toExpPackingDt",
            "mainMark",
            "curWhCompCd",
            "curWhCd",
            "pltzItemNo",
            "customerPoNo",
            "pkgCd",
            "expRequestNo",
            "returnStyleCd",
            "containerNo",
            "invoiceNo",
            "fmEtd",
            "toEtd",
            "fmAtd",
            "toAtd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W8001);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W8001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Consistency check for FM) Issue Date and TO) Issue Date.
        // FM)Issue DateとTO)Issue Date相関チェック
        if (!w8001ProgCtrlService.validateConsistencyFmIssueDateToIssueDate(
                                criteriaDomain.getFmExpPackingDt(), 
                                criteriaDomain.getToExpPackingDt(),
                                criteriaDomain.getScreenDateFormat())) {
            Object[] params = {"Issue Date"};
            MessageDomain msg1 = new MessageDomain("w8001CriteriaDomain.fmExpPackingDt", GSCM_E0_0031, params);
            MessageDomain msg2 = new MessageDomain("w8001CriteriaDomain.toExpPackingDt", null, null);
            errorList.add(msg1);
            errorList.add(msg2);
        }
        // Consistency check for FM) ETD and TO) ETD.
        // FM) ETDとTO) ETD相関チェック
        if (!w8001ProgCtrlService.validateConsistencyFmIssueDateToIssueDate(
                                criteriaDomain.getFmEtd(), 
                                criteriaDomain.getToEtd(),
                                criteriaDomain.getScreenDateFormat())) {
            Object[] params = {"ETD"};
            MessageDomain msg1 = new MessageDomain("w8001CriteriaDomain.fmEtd", GSCM_E0_0031, params);
            MessageDomain msg2 = new MessageDomain("w8001CriteriaDomain.toEtd", null, null);
            errorList.add(msg1);
            errorList.add(msg2);
        }
        // Consistency check for FM) ATD and TO) ATD
        // FM) ATDとTO) ATDの相関チェック
        if (!w8001ProgCtrlService.validateConsistencyFmIssueDateToIssueDate(
                                criteriaDomain.getFmAtd(), 
                                criteriaDomain.getToAtd(),
                                criteriaDomain.getScreenDateFormat())) {
            Object[] params = {"ATD"};
            MessageDomain msg1 = new MessageDomain("w8001CriteriaDomain.fmAtd", GSCM_E0_0031, params);
            MessageDomain msg2 = new MessageDomain("w8001CriteriaDomain.toAtd", null, null);
            errorList.add(msg1);
            errorList.add(msg2);
        }

        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W8001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Display will focus on the data that get authority search results data.(for paging process)
     * </pre>
     * <pre>
     * <<ページング処理用>>検索結果データを取得権限のあるデータに絞って表示
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W8001ListDomain> callServices(W8001CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        W8001ProgCtrlCriteriaDomain criteria = createProgCtrlCriteriaDomain(criteriaDomain);

        List<? extends W8001ProgCtrlDomain> progCtrlList = w8001ProgCtrlService.searchForPagingOnMainSearch(criteria);
        
        return convertToListDomain(progCtrlList, criteriaDomain.getScreenDateFormat(), criteriaDomain);
    }
    /**
     * 
     * Create criteria domain for progress control service.
     * <br />進度管理サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Criteria domain of progress control main screen.<br />
     * 進度管理Main画面の条件ドメイン
     * @return Criteria domain for progress control service<br />
     * 進度管理サービスの条件ドメイン
     * @throws ApplicationException If it fails to set the search criteria domain.<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W8001ProgCtrlCriteriaDomain createProgCtrlCriteriaDomain(W8001CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        String dateFormat = criteriaDomain.getScreenDateFormat();

        W8001ProgCtrlCriteriaDomain progCtrlCriteriaDomain = new W8001ProgCtrlCriteriaDomain();
        
        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        progCtrlCriteriaDomain.setScreenId(criteriaDomain.getScreenId());
        progCtrlCriteriaDomain.setLocale(criteriaDomain.getLocale());
        
        CommonUtil.copyPropertiesDomainToDomain(progCtrlCriteriaDomain, criteriaDomain, dateFormat);

        progCtrlCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
        return progCtrlCriteriaDomain;
    }

    /**
     *Convert progress control domain to list domain.
     * <br />進度管理ドメインをリストドメインに変換します。
     *
     * @param progCtrlList Search result list<br />
     * 検索結果のリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @param criteriaDomain Input Criteria domain
     * @return Conversion result<br />
     * 変換結果
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected List<? extends W8001ListDomain> convertToListDomain(List<? extends W8001ProgCtrlDomain> progCtrlList, String dateFormat, W8001CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<W8001ListDomain> warn0List = new ArrayList<W8001ListDomain>();
        List<W8001ListDomain> warn1List = new ArrayList<W8001ListDomain>();
        List<W8001ListDomain> warn2List = new ArrayList<W8001ListDomain>();

        Map<String, Date> shipperDtMap = new HashMap<String, Date>();

        if (progCtrlList != null) {
            for (W8001ProgCtrlDomain progCtrl : progCtrlList) {
                W8001ListDomain listDomain = new W8001ListDomain();

                Date shipperDt = null;
                if (!shipperDtMap.containsKey(progCtrl.getTimezoneId())) {
                    shipperDt = DateUtil.convertTime(new Date(), progCtrl.getTimezoneId());
                    shipperDtMap.put(progCtrl.getTimezoneId(), shipperDt);
                } else {
                    shipperDt = shipperDtMap.get(progCtrl.getTimezoneId());
                }

                // Copy domain to Screen from BL.

                // CommonUtil.copyPropertiesDomainToDomain(listDomain, progCtrl, dateFormat);
                // To speed up the processing, do not use CommonUtil#copyPropertiesDomainToDomain.
                // 処理速度を上げるために、CommonUtil#copyPropertiesDomainToDomain ではなく 
                // getter/setter を使ってプロパティ値の移送を行う
                listDomain.setWarn(progCtrl.getWarn());
                listDomain.setShipperCd(progCtrl.getShipperCd());
                listDomain.setConsigneeCd(progCtrl.getConsigneeCd());
                listDomain.setShipToCd(progCtrl.getShipToCd());
                listDomain.setTrnsCd(progCtrl.getTrnsCd());
                listDomain.setMainMark(progCtrl.getMainMark());
                listDomain.setCmlTyp(progCtrl.getCmlTyp());
                listDomain.setCustomTimingTyp(progCtrl.getCustomTimingTyp());
                listDomain.setCurWhCompCd(progCtrl.getCurWhCompCd());
                listDomain.setCurWhCd(progCtrl.getCurWhCd());
                // listDomain.setQty(progCtrl.getQty());
                listDomain.setStgActDt(DateUtil.formatDate(progCtrl.getStgActDt(), dateFormat));
                listDomain.setShippingFirmDt(DateUtil.formatDate(progCtrl.getShippingFirmDt(), dateFormat));
                listDomain.setRegisterDt(DateUtil.formatDate(progCtrl.getRegisterDt(), dateFormat));
                listDomain.setInvoiceNo(progCtrl.getInvoiceNo());
                listDomain.setInvoiceCtgry(progCtrl.getInvoiceCtgry());
                listDomain.setInvoiceKey(progCtrl.getInvoiceKey());
                listDomain.setEtd(DateUtil.formatDate(progCtrl.getEtd(), dateFormat));
                listDomain.setAtd(DateUtil.formatDate(progCtrl.getAtd(), dateFormat));
                listDomain.setEta(DateUtil.formatDate(progCtrl.getEta(), dateFormat));

// If you need to copy the following items, please enable comment lines.
// AbstractDomain の項目です、コピーする必要がある項目があればコメントアウトを外してください。
//                listDomain.setCharCd(progCtrl.getCharCd());
//                listDomain.setCheckValidateWarning(progCtrl.isCheckValidateWarning());
//                listDomain.setComCreateFuncId(progCtrl.getComCreateFuncId());
//                listDomain.setComCreateTimestamp(progCtrl.getComCreateTimestamp());
//                listDomain.setComCreateUserId(progCtrl.getComCreateUserId());
//                listDomain.setComUpdateFuncId(progCtrl.getComUpdateFuncId());
//                listDomain.setComUpdateTimestamp(progCtrl.getComUpdateTimestamp());
//                listDomain.setComUpdateUserId(progCtrl.getComUpdateUserId());
//                listDomain.setDateFormat(progCtrl.getDateFormat());
//                listDomain.setLanguageCd(progCtrl.getLanguageCd());
//                listDomain.setLocale(progCtrl.getLocale());
//                listDomain.setLoginUserDscId(progCtrl.getLoginUserDscId());
//                listDomain.setOwnerCompCd(progCtrl.getOwnerCompCd());
//                listDomain.setRowNumFrom(progCtrl.getRowNumFrom());
//                listDomain.setRowNumTo(progCtrl.getRowNumTo());
//                listDomain.setScreenId(progCtrl.getScreenId());
//                listDomain.setSearchCountCheckFlg(progCtrl.isSearchCountCheckFlg());
//                listDomain.setSelected(progCtrl.getSelected());
//                listDomain.setTimeZone(progCtrl.getTimeZone());

                // Last TR Status(Activate TR)
                if (LAST_TR_STATUS_ACCTIVE_TR.equals(progCtrl.getLastTrStatus())) {
                    listDomain.setCurWhCd(StringUtil.getEmptyToBlank(progCtrl.getCurWhCd()).concat("*"));
                }
                
                // not input Item No.
                if (CheckUtil.isBlankOrNull(criteriaDomain.getPltzItemNo())) {
                    listDomain.setQty("");
                } else {
                    if (progCtrl.getPltzItemList() != null && !progCtrl.getPltzItemList().isEmpty()
                        && progCtrl.getPltzItemList().get(0).getSumQty() != null) {
                        listDomain.setQty(progCtrl.getPltzItemList().get(0).getSumQty().toPlainString());
                    } else {
                        listDomain.setQty("0");
                    }
                }
                
                // Set Warn level.
                if (CUSTOM_TIMING_TYPE_A.equals(progCtrl.getCustomTimingTyp())
                    && progCtrl.getShippingFirmDt() != null && shipperDt.compareTo(progCtrl.getShippingFirmDt()) > 0
                    && CheckUtil.isBlankOrNull(progCtrl.getInvoiceNo())) {
                    listDomain.setWarn(LEVEL_1);
                    warn1List.add(listDomain);
                    
                } else if (CUSTOM_TIMING_TYPE_B.equals(progCtrl.getCustomTimingTyp())
                    && progCtrl.getStgActDt() != null && shipperDt.compareTo(progCtrl.getStgActDt()) > 0
                    && CheckUtil.isBlankOrNull(progCtrl.getInvoiceNo())) {
                    listDomain.setWarn(LEVEL_1);
                    warn1List.add(listDomain);
                    
                } else if (CUSTOM_TIMING_TYPE_Z.equals(progCtrl.getCustomTimingTyp())
                    && progCtrl.getStgInstrDt() != null && shipperDt.compareTo(progCtrl.getStgInstrDt()) > 0
                    && CheckUtil.isBlankOrNull(progCtrl.getInvoiceNo())) {
                    listDomain.setWarn(LEVEL_1);
                    warn1List.add(listDomain);
                    
                } else if (progCtrl.getEtd() != null && shipperDt.compareTo(progCtrl.getEtd()) > 0
                    && progCtrl.getRegisterDt() == null) {
                    listDomain.setWarn(LEVEL_2);
                    warn2List.add(listDomain);
                } else {
                    listDomain.setWarn(LEVEL_0);
                    warn0List.add(listDomain);
                }
            }
        }
        
        List<W8001ListDomain> listDomainAllList = new ArrayList<W8001ListDomain>();
        listDomainAllList.addAll(warn2List);
        listDomainAllList.addAll(warn1List);
        listDomainAllList.addAll(warn0List);
        
        PageInfoData pageInfoData = criteriaDomain.getPageInfoCreator()
            .createPageInfoData(listDomainAllList.size(), null, null, criteriaDomain.getLocale());
        criteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        criteriaDomain.setRowNumTo(pageInfoData.getToCount());
        
        List<W8001ListDomain> listDomainList = new ArrayList<W8001ListDomain>();
        for (int i = criteriaDomain.getRowNumFrom() - 1; i <= criteriaDomain.getRowNumTo() - 1; i++) {
            listDomainList.add(listDomainAllList.get(i));
        }
        return listDomainList;
    }
}
