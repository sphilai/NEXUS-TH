/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOMER_PART_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0021;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0022;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0023;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0025;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0032;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0033;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0148;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB002ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB002UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Update action of an ordering registration picture.
 * <br />受注登録画面のUpdateアクションに対するFacadeサービスの実装クラスです。
 * 
 * @version $Revision: 14596 $
 */
public class WB002RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<WB002UpdateDomain, WB002UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB002RegisterFacadeServiceImpl() {
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
     * Setter method for WB001OdrRcvServic.
     * 
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *
     * - Extraction of a target domain
     *       The List domain selected in the pictures is extracted, and it sets to a mass update domain.
     * 
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - 対象ドメインの抽出
     *     画面で選択されたListドメインを抽出し、一括更新ドメインに設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB002UpdateDomain filterDomain(WB002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Detailed line currently checked
        // チェックされている明細行
        List<WB002ListDomain> checkedListDomainList = new ArrayList<WB002ListDomain>();
        
        // Acquisition of a detailed line
        // 明細行の取得
        List<WB002ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // Acquisition of chosen detailed line
        // 選択済み明細行の取得
        if (listDomainList != null && listDomainList.size() > 0) {
            for (Iterator<WB002ListDomain> i = listDomainList.iterator(); i.hasNext();) {
                WB002ListDomain listDomain = i.next();
                
                // flg off
                listDomain.setWarningFlgFirmQty("");
                listDomain.setWarningFlgForecastQty("");
                
                if (StringUtils.equals(listDomain.getSelected(), CHECK_ON)) {
                    checkedListDomainList.add(listDomain);
                }
            }
        }
        
        // The check of chosen detailed line existence
        // 選択済み明細行有無の確認
        if (checkedListDomainList != null && checkedListDomainList.size() > 0) {
            updateDomain.setUpdateListDomainList(checkedListDomainList);
            return updateDomain;
        } else {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Error list
        // エラーリスト
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // The list of list domains is acquired.
        // リストドメインのリストを取得
        List<WB002ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // required check, screen peculiar check (customerItemNo, customerPoNo, salesCompPoNo)  
        // 必須チェック、画面固有チェック(customerItemNo、customerPoNo、salesCompPoNo)
        String[] requiredProperties = {
            "firmQty",
            "forecastQty",
            "customerDueDt",
            "customerItemNo",
            "customerPoNo",
            "salesCompPoNo"
        };
        
        // Check implementation
        // チェック実施
        if (listDomainList != null && listDomainList.size() > 0) {
            for (int i = 0; i < listDomainList.size(); ++i ) {
                WB002ListDomain listDomain = listDomainList.get(i);
                
                Validator<WB002ListDomain> valid = new Validator<WB002ListDomain>(listDomain, "wb002ListDomainList", Integer.parseInt(listDomain.getIndex()));
                
                valid.isValidateProperties(requiredProperties, SCREEN_ID_WB002);
                
                // Error registration
                // エラー登録
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - The number validity check of decision
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyFirmQtyAllocQty (BigDecimal, BigDecimal)}.
     *
     * - CUSTOMER-DUE-DATE validity check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyDateReceivingDate (Date, Date)}.
     *
     * - CUSTOMER-ITEM-NO change propriety check
     *       This is a call about * {@link WB001OdrRcvService#validateConsistencyAllocQtyCustomerPartNo(BigDecimal, String, String)}.
     *
     * - Customer P/O No. change propriety check
     *       This is a call about * {@link WB001OdrRcvService#validateConsistencyAllocQtyCustomerPoNo(BigDecimal, String, String)}.
     *
     * - Sales company P/O change propriety check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyAllocQtySalesPoNo (BigDecimal, String, String)}.
     *
     * - Decision and Forecast-QTY check (Export Receive Order) (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY)
     *       This is a call about * {@link WB001OdrRcvService#validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal, BigDecimal, BigDecimal)}.
     *
     * - Decision and Forecast-QTY check (in a QUANTITY specified, an error is made in decision and an unofficial announcement)  
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyFirmQtyForecastQty (BigDecimal, BigDecimal)}.
     * 
     * - 確定数妥当性チェック
     *     {@link WB001OdrRcvService#validateConsistencyFirmQtyAllocQty(BigDecimal, BigDecimal)}を呼出
     *     
     * - 顧客納期妥当性チェック
     *     {@link WB001OdrRcvService#validateConsistencyDateReceivingDate(Date, Date)}を呼出
     *     
     * - 得意先品目番号変更可否チェック
     *     {@link WB001OdrRcvService#validateConsistencyAllocQtyCustomerPartNo(BigDecimal, String, String)}を呼出
     *     
     * - 得意先P/O No.変更可否チェック
     *     {@link WB001OdrRcvService#validateConsistencyAllocQtyCustomerPoNo(BigDecimal, String, String)}を呼出
     *     
     * - 販売会社P/O変更可否チェック
     *     {@link WB001OdrRcvService#validateConsistencyAllocQtySalesPoNo(BigDecimal, String, String)}を呼出
     *     
     * - 確定・内示数チェック（輸出受注）（新規で確定・内示共に数量なしの場合エラー）
     *     {@link WB001OdrRcvService#validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal, BigDecimal, BigDecimal)}を呼出
     *     
     * - 確定・内示数チェック（確定・内示共に数量指定の場合エラー）
     *     {@link WB001OdrRcvService#validateConsistencyFirmQtyForecastQty(BigDecimal, BigDecimal)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Condition domain
        // 条件ドメイン
        WB002CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Acquisition of a locale
        // ロケールの取得
        Locale locale = updateDomain.getLocale();
        
        // Date format
        // 日付フォーマット
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // List of list domains
        // リストドメインのリスト
        List<WB002ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        for (Iterator<WB002ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB002ListDomain listDomain = i.next();
            
            // Acquisition of a check item
            // チェック項目の取得
            // dueDate
            String strEtdDueDate = listDomain.getEtdDueDt();
            Date etdDueDate = DateUtil.parseDate(strEtdDueDate, dateFormat);
            
            // receivingDate
            Date receivingDate = DateUtil.parseDate(listDomain.getCustomerDueDt(), dateFormat);
            
            // Hidden Order Qty
            BigDecimal hiddenOdrQty = convertBigDecimal(listDomain.getOdrQty());
            
            // Firm Qty
            BigDecimal firmQty = convertBigDecimal(listDomain.getFirmQty());
            
            // Forecast Qty
            BigDecimal forecastQty = convertBigDecimal(listDomain.getForecastQty());
            
            // Alloc Qty
            BigDecimal allocQty = convertBigDecimal(listDomain.getPltzAllocQty());
            
            // Customer Item No
            String customerItemNo = listDomain.getCustomerItemNo();
            String customerItemNoHidden = listDomain.getCustomerItemNoHidden();
            
            // Customer Po No
            String customerPoNo = listDomain.getCustomerPoNo();
            String customerPoNoHidden = listDomain.getCustomerPoNoHidden();
            
            // Sales Company Po No
            String salesCompPoNo = listDomain.getSalesCompPoNo();
            String salesCompPoNoHidden = listDomain.getSalesCompPoNoHidden();
            
            // Index
            int index = Integer.parseInt(listDomain.getIndex());
            
            // The number validity check of decision
            // 確定数妥当性チェック
            if (!wb001OdrRcvService.validateConsistencyFirmQtyAllocQty(firmQty, allocQty)) {
                Object[] params = {
                    strEtdDueDate
                };
                MessageDomain msgFirmQty = new MessageDomain("wb002ListDomainList[" + index + "].firmQty", NXS_E7_0018, params);
                MessageDomain msgAllocQty = new MessageDomain("wb002ListDomainList[" + index + "].pltzAllocQty", null, null);
                
                errorList.add(msgFirmQty);
                errorList.add(msgAllocQty);
            }
            
            // CUSTOMER-DUE-DATE validity check
            // 顧客納期妥当性チェック
            if (receivingDate != null) {
                if (!wb001OdrRcvService.validateConsistencyDateReceivingDate(etdDueDate, receivingDate)) {
                    Object[] params = {
                        strEtdDueDate
                    };
                    MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].customerDueDt", NXS_E7_0020, params);
                    
                    errorList.add(msg);
                }
            }
            
            // CUSTOMER-ITEM-NO change propriety check
            // 得意先品目番号変更可否チェック
            if (!wb001OdrRcvService.validateConsistencyAllocQtyCustomerPartNo(allocQty, customerItemNo, customerItemNoHidden)) {
                Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                    commonService.getResource(locale, "label.custPNo"),
                    CUSTOMER_PART_NO,
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain( "wb002ListDomainList[" + index + "].customerItemNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // Customer P/O No. change propriety check
            // 得意先P/O No.変更可否チェック
            if (!wb001OdrRcvService.validateConsistencyAllocQtyCustomerPoNo(allocQty, customerPoNo, customerPoNoHidden)) {
                Object[] params = {
                    commonService.getResource(locale, "label.custPoNo"),
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + listDomain.getIndex() + "].customerPoNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // Sales company P/O change propriety check
            // 販売会社P/O変更可否チェック
            if (!wb001OdrRcvService.validateConsistencyAllocQtySalesPoNo(allocQty, salesCompPoNo, salesCompPoNoHidden)) {
                Object[] params = {
                    commonService.getResource(locale, "label.salesCompPoNo"),
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].salesCompPoNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // decision, and Forecast-QTY check (Export Receive Order) (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY)  
            // 確定・内示数チェック（輸出受注）（新規で確定・内示共に数量なしの場合エラー）
            if (!wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(hiddenOdrQty, firmQty, forecastQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.firmQty"), 
                    commonService.getResource(locale, "label.forecastQty"),
                    strEtdDueDate
                };
                MessageDomain msgFirmQty = new MessageDomain("wb002ListDomainList[" + index + "].firmQty", NXS_E7_0022, params);
                MessageDomain msgForecastQty = new MessageDomain("wb002ListDomainList[" + index + "].forecastQty", null, null);
                
                errorList.add(msgFirmQty);
                errorList.add(msgForecastQty);
            }
            
            // decision, and Forecast-QTY check (in a QUANTITY specified, an error is made in decision and an unofficial announcement)  
            // 確定・内示数チェック（確定・内示共に数量指定の場合エラー）
            if (!wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(firmQty, forecastQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.firmQty"), 
                    commonService.getResource(locale, "label.forecastQty"),
                    strEtdDueDate
                };
                MessageDomain msgFirmQty = new MessageDomain("wb002ListDomainList[" + index + "].firmQty", NXS_E7_0022, params);
                MessageDomain msgForecastQty = new MessageDomain("wb002ListDomainList[" + index + "].forecastQty", null, null);
                
                errorList.add(msgFirmQty);
                errorList.add(msgForecastQty);
            }
        }
        
        // Processing is ended when error occurs.
        // エラーが発生した場合、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - common specifications : this is a check during processing in the CIGMA night.   (behavior in a CIGMA night batch)  
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}
     *
     * - Ordering company existence check (NEXUS Company Master)  
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnRegister(String)}
     *
     * - SHIP-TO-NAME acquisition   Existence check
     * {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnRegister(String, String, String, WB001OdrRcvDomain)}
     *
     * - ITEM-NO existence check for export
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegister(String, String, String, String, String, Date, BigDecimal[])}
     *
     * - ITEM-NO existence check for export control
     * {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnRegister(String, String, Date)}
     *
     * - ETD validity check
     *     {@link WB001OdrRcvService#validateDatabaseProcessingDateOnRegister(String, Date)}
     *
     * - Decision and Forecast-QTY check
     *     (an error is made when a definite unofficial announcement is intermingled by the order received whose key corresponds.)
     *       A transportation CD difference is not permitted, either.
     *      That is, an error is made when an unofficial announcement order received exists by FIRM_QTY&gt;0 in addition to the object record under selection.  
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *
     * - Decision and Forecast-QTY check
     *     (an error is made when a definite unofficial announcement is intermingled by the order received whose key corresponds.)
     *       A transportation CD difference is not permitted, either.
     *      That is, an error is made when a firm order receipt exists by FORECAST_QTY&gt;0 in addition to the object record under selection.  
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *
     * - Lot multiple check
     *     ([73] : when Firm QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT)  
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(BigDecimal, BigDecimal)}
     *
     * - Lot multiple check
     *     ([74] : when Forecast QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT)  
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(BigDecimal, BigDecimal)}
     *
     * - Duplication check
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByDuplication(TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *
     * - On-line ordering registration detailed check
     * {@link WB001OdrRcvService#validateDatabaseWsB002OnRegister(String, String, String, String, String, String, List, List, List, WsB002ResultDomain)}
     *
     * - 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}
     *     
     * - 受注会社存在チェック（NEXUS会社原単位）
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnRegister(String)}
     *     
     * - 送荷先名称取得　存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnRegister(String, String, String, WB001OdrRcvDomain)}
     *     
     * - 輸出対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegister(String, String, String, String, String, Date, BigDecimal[])}
     *     
     * - 輸出規制対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnRegister(String, String, Date)}
     *     
     * - ETD妥当性チェック
     *     {@link WB001OdrRcvService#validateDatabaseProcessingDateOnRegister(String, Date)}
     *     
     * - 確定・内示数チェック
     *   （キーが一致する受注で確定内示が混在する場合エラー。
     *     輸送コード違いでも許可しない。つまりFIRM_QTY&gt;0で選択中の対象レコード以外に内示受注が存在する場合エラー）
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *     
     * - 確定・内示数チェック
     *   （キーが一致する受注で確定内示が混在する場合エラー。
     *     輸送コード違いでも許可しない。つまりFORECAST_QTY&gt;0で選択中の対象レコード以外に確定受注が存在する場合エラー）
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *     
     * - ロット倍数チェック
     *   （【73】:Firm QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合）
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(BigDecimal, BigDecimal)}
     *     
     * - ロット倍数チェック
     *   （【74】:Forecast QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合）
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(BigDecimal, BigDecimal)}
     *     
     * - 重複チェック
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnRegisterByDuplication(TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}
     *     
     * - オンライン受注登録明細チェック
     *     {@link WB001OdrRcvService#validateDatabaseWsB002OnRegister(String, String, String, String, String, String, List, List, List, WsB002ResultDomain)}
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Condition domain
        // 条件ドメイン
        WB002CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Date format
        // 日付フォーマット
        String dateFormat = criteriaDomain.getScreenDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        SimpleDateFormat cigmaDf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // Acquisition of a check item
        // チェック項目の取得
        
        // Ordering company
        // 受注会社
        String rcvOdrCompCd = criteriaDomain.getRcvOdrCompCd();
        // CUSTOMER CODE
        // 得意先コード
        String custCd = criteriaDomain.getCustomerCd();
        // SHIP TO CODE
        // 送荷先コード
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        // Transportation CD
        // 輸送コード
        String trnsCd = criteriaDomain.getTrnsCd();
        // ITEM NO
        // 品目番号
        String itemNo = criteriaDomain.getItemNo();
        // Packing CD
        // 包装コード
        String pkgCd = convertBlankToSpace(criteriaDomain.getPkgCd());
        
        // List of list domains
        // リストドメインのリスト
        List<WB002ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // APPLY START DATE
        // 適用開始日
        Date aplyStrtDt = commonService.searchCigmaAds(rcvOdrCompCd);
        
        // Declaration of variable for return VALUEs
        // 戻り値用変数の宣言
        
        // The number of lots
        // ロット数
        BigDecimal shippingLot = BigDecimal.ZERO;
        
        // The domain for setting up return VALUE
        // 戻り値を設定する為のドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // common specifications: This is the check   (behavior in a CIGMA night batch) during processing in the CIGMA night.  
        // 共通仕様：CIGMA夜間処理中チェック （CIGMA夜間バッチ中の振る舞い）
        if (!wb001OdrRcvService.validateDatabaseCigmaAvailable(false, rcvOdrCompCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            
            errorList.add(msg);
        }
        
        // Processing will be ended if this is under processing in the CIGMA night.
        // CIGMA夜間処理中であれば、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        // Ordering company existence check (NEXUS Company Master)  
        // 受注会社存在チェック（NEXUS会社原単位）
        if (!wb001OdrRcvService.validateDatabaseTmNxsCompOnRegister(rcvOdrCompCd)) {
            MessageDomain msg = new MessageDomain("wb002CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null);
            
            errorList.add(msg);
        }
        
        // Processing is ended if ordering company does not exist.
        // 受注会社が存在しなければ、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        // SHIP-TO-NAME acquisition   Existence check
        // 送荷先名称取得 存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnRegister(rcvOdrCompCd, custCd, lgcyShipTo, tmpDomain)) {
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb002CriteriaDomain.rcvOdrCompCd", NXS_E7_0032, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb002CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("wb002CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        } else {
            criteriaDomain.setShipToNm(tmpDomain.getShipToNm());
        }
        
        // ITEM-NO existence check for export
        // 輸出対象品目番号存在チェック
        
        if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo(
                rcvOdrCompCd, itemNo, pkgCd, custCd, lgcyShipTo, aplyStrtDt, tmpDomain)) {
            Object[] params = {
                ""
            };
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb002CriteriaDomain.rcvOdrCompCd", NXS_E7_0033, params);
            MessageDomain msgItemNo = new MessageDomain("wb002CriteriaDomain.itemNo", null, null);
            MessageDomain msgPkgCd = new MessageDomain("wb002CriteriaDomain.pkgCd", null, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb002CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("wb002CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgItemNo);
            errorList.add(msgPkgCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        } else {
            shippingLot = tmpDomain.getShippingLot();
        }
        
        // ITEM-NO existence check for export control
        // 輸出規制対象品目番号存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmExpFormalitiItemNo(rcvOdrCompCd, itemNo, aplyStrtDt, null)) {
            Object[] params = {
                ""
            };
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb002CriteriaDomain.rcvOdrCompCd", NXS_E7_0034, params);
            MessageDomain msgItemNo = new MessageDomain("wb002CriteriaDomain.itemNo", null, null);
            
            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgItemNo);
        }
        
        // Processing will be ended if an error exists with the check so far.
        // ここまでのチェックでエラーが存在すれば、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        for (Iterator<WB002ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB002ListDomain listDomain = i.next();
            
            // Acquisition of a check item
            // チェック項目の取得
            
            // dueDate
            String strEtdDueDate = listDomain.getEtdDueDt();
            Date etdDueDate = convertDate(strEtdDueDate, dateFormat);
            
            // Order Ctrl No
            BigDecimal odrCtrlNo = convertBigDecimal(listDomain.getOdrCtrlNo());
            
            // Customer P/O No
            String custPoNo = listDomain.getCustomerPoNo();
            
            // Customer Item No
            String custItemNo = listDomain.getCustomerItemNo();
            
            // Customer P/O No hidden
            String customerPoNoHidden = listDomain.getCustomerPoNoHidden();
            
            // Customer Item No hidden
            String customerItemNoHidden = listDomain.getCustomerItemNoHidden();
            
            // Customer Item No(ORG)
            String custItemNoOrg = listDomain.getCustomerItemNoOrg();
            
            // Firm Qty
            BigDecimal firmQty = convertBigDecimal(listDomain.getFirmQty());
            
            // Forecast Qty
            BigDecimal forecastQty = convertBigDecimal(listDomain.getForecastQty());
            
            // Index
            int index = Integer.parseInt(listDomain.getIndex());
            
            // Delete by external design modification No.345 start.
            // ETD validity check
            // ETD妥当性チェック
            //if (!wb001OdrRcvService.validateDatabaseProcessingDateOnRegister(rcvOdrCompCd, etdDueDate)) {
            //    Object[] params = {
            //        strEtdDueDate
            //    };
            //    MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].etdDueDt", NXS_E7_0019, params);
            //    
            //    errorList.add(msg);
            //}
            // Delete by external design modification No.345 end.
            
            TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
            after.setRcvOdrCompCd(rcvOdrCompCd);
            after.setCustomerCd(custCd);
            after.setLgcyShipTo(lgcyShipTo);
            after.setItemNo(itemNo);
            after.setPkgCd(pkgCd);
            after.setEtdDueDt(etdDueDate);
            after.setCustomerPoNo(custPoNo);
            after.setCustomerItemNo(custItemNo);
            after.setOdrFirmFlg(FLAG_N);
            
            TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
            before.setRcvOdrCompCd(rcvOdrCompCd);
            before.setCustomerCd(custCd);
            before.setLgcyShipTo(lgcyShipTo);
            before.setItemNo(itemNo);
            before.setPkgCd(pkgCd);
            before.setTrnsCd(trnsCd);
            before.setEtdDueDt(etdDueDate);
            before.setCustomerPoNo(customerPoNoHidden);
            before.setCustomerItemNo(customerItemNoHidden);
            before.setCustomerItemNoOrg(custItemNoOrg);
            before.setOdrCtrlNo(odrCtrlNo);
            
            // Decision and Forecast-QTY check
            // 確定・内示数チェック
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(firmQty, after, before)) {
                Object[] params = {
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].firmQty", NXS_E7_0023, params);
                
                errorList.add(msg);
                
                listDomain.setWarningFlgFirmQty("E");
            }
            
            // Decision and Forecast-QTY check
            // 確定・内示数チェック
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(forecastQty, after, before)) {
                Object[] params = {
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].forecastQty", NXS_E7_0024, params);
                
                errorList.add(msg);
                
                listDomain.setWarningFlgForecastQty("E");
            }
            
            // Lot multiple check
            // ロット倍数チェック
            if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(firmQty, shippingLot)) {
                Object[] params = {
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].firmQty", NXS_W1_0001, params);
                
                errorList.add(msg);
                
                if (StringUtils.isBlank(listDomain.getWarningFlgFirmQty())){
                    listDomain.setWarningFlgFirmQty("W");
                }
            }
            
            // Lot multiple check
            // ロット倍数チェック
            if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(forecastQty, shippingLot)) {
                Object[] params = {
                    strEtdDueDate
                };
                MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].forecastQty", NXS_W1_0001, params);
                
                errorList.add(msg);
                
                if (StringUtils.isBlank(listDomain.getWarningFlgForecastQty())){
                    listDomain.setWarningFlgForecastQty("W");
                }
            }
            
            // Duplication check
            // 重複チェック
            after = new TtExpRcvOdrCriteriaDomain();
            after.setRcvOdrCompCd(rcvOdrCompCd);
            after.setCustomerCd(custCd);
            after.setLgcyShipTo(lgcyShipTo);
            after.setItemNo(itemNo);
            after.setPkgCd(pkgCd);
            after.setTrnsCd(trnsCd);
            after.setEtdDueDt(etdDueDate);
            after.setCustomerPoNo(custPoNo);
            after.setCustomerItemNo(custItemNo);
            after.setCustomerItemNoOrg(custItemNoOrg);
            after.setOdrCtrlNo(odrCtrlNo);
            
            before = new TtExpRcvOdrCriteriaDomain();
            before.setRcvOdrCompCd(rcvOdrCompCd);
            before.setCustomerCd(custCd);
            before.setLgcyShipTo(lgcyShipTo);
            before.setItemNo(itemNo);
            before.setPkgCd(pkgCd);
            before.setTrnsCd(trnsCd);
            before.setEtdDueDt(etdDueDate);
            before.setCustomerPoNo(customerPoNoHidden);
            before.setCustomerItemNo(customerItemNoHidden);
            before.setCustomerItemNoOrg(custItemNoOrg);
            before.setOdrCtrlNo(odrCtrlNo);
            
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnRegisterByDuplication(after, before)) {
                Object[] params = {
                    strEtdDueDate
                };
                //MessageDomain msg = new MessageDomain("wb002ListDomainList[" + index + "].selected", NXS_E7_0025, params);
                MessageDomain msg = new MessageDomain("", NXS_E7_0025, params);
                
                errorList.add(msg);
            }
        }
        
        // Processing will be ended if an error exists with the check so far (only in * warning, processing is continued).  
        // ここまでのチェックでエラーが存在すれば、処理を終了(※警告のみの場合は、処理を継続)
        if (errorList != null && errorList.size() > 0) {
            
            boolean throwFlg = false;
            
            // It throw(s), only when the message which starts except NXS-W* exists.
            // NXS-W*以外で始まるメッセージが存在する場合のみ、throwする。
            String warningMsgWord = "NXS-W";
            for (Iterator<MessageDomain> i = errorList.iterator(); i.hasNext();) {
                MessageDomain msg = i.next();
                if (msg.getKey() != null && !msg.getKey().startsWith(warningMsgWord)) {
                    throwFlg = true;
                    break;
                }
            }
            
            if (throwFlg) {
                throw new ValidationException(errorList);
            }
        }
        
        // On-line ordering registration detailed check
        // オンライン受注登録明細チェック
        WsB002ResultDomain wsB002Result = new WsB002ResultDomain();
        
        // A parameter is created.
        // パラメータを作成
        List<String> indexList = new ArrayList<String>();
        List<Date> etdDueDtList = new ArrayList<Date>();
        List<String> customerItemNoList = new ArrayList<String>();
        
        for (Iterator<WB002ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB002ListDomain listDomain = i.next();
            
            indexList.add(listDomain.getIndex());
            etdDueDtList.add(DateUtil.parseDate(listDomain.getEtdDueDt(), dateFormat));
            customerItemNoList.add(listDomain.getCustomerItemNo());
        }
        
        // The invoke of Web service (WsB002)
        // Webサービス(WsB002)の呼び出し
        if (!wb001OdrRcvService.validateDatabaseWsB002OnRegister(rcvOdrCompCd, custCd, lgcyShipTo, itemNo, pkgCd, trnsCd,
            indexList, etdDueDtList, customerItemNoList, wsB002Result)) {
            
            for (WsB002ResultItemDomain customerOrder :  wsB002Result.getCustomerOrderList()){
                if (customerOrder.getErrorList() != null) { // Add by external design modification No.345.
                    for (ErrorListItemDomain error : customerOrder.getErrorList()){
                        String errCode = error.getErrorCode();

                        if (NXS_E7_0148.equals(errCode)){
                            String etd = sdf.format(DateUtil.parseDate(error.getErrorParamList().get(0).getParam(), WS_CIGMA_DATE_FORMAT));
                            int index = Integer.parseInt(error.getErrorParamList().get(1).getParam());

                            // ST988 ADD START
                            // Ignore the EM000PR error in the case of deletion (quantity 0).
                            // 削除（数量0）の場合は品対のエラーを無視する。
                            BigDecimal firmQty = convertBigDecimal(updateDomain.getListDomainList().get(index - 1).getFirmQty());
                            BigDecimal forecastQty = convertBigDecimal(updateDomain.getListDomainList().get(index - 1).getForecastQty());
                            if (!BigDecimal.ZERO.equals(firmQty) || !BigDecimal.ZERO.equals(forecastQty)) {
                            // ST988 ADD END

                                Object[] params = {etd};
                                MessageDomain msgCustomerItemNo = new MessageDomain("wb002ListDomainList[" + (index - 1) + "].customerItemNo", errCode, params);
                                errorList.add(msgCustomerItemNo);
                            }

                        } else {
                            MessageDomain msg = new MessageDomain("", errCode, null);
                            errorList.add(msg);
                        }
                    }
                }
            }
        } //else { // Delete by external design modification No.345.
        
        // The result of Web service (WsB002) is set up.
        // Webサービス(WsB002)の結果を設定
        List<WsB002ResultItemDomain> wsb002ResultList = wsB002Result.getCustomerOrderList();
        for (int i = 0; i < wsb002ResultList.size(); i++ ) {
            WsB002ResultItemDomain resultItemDomain = wsb002ResultList.get(i);

            WB002ListDomain listDomain = new WB002ListDomain();
            for (WB002ListDomain d : listDomainList){
                if (d.getIndex().equals(String.valueOf(resultItemDomain.getIndex()))){
                    listDomain = d;
                    break;
                }
            }

            // ST990 ADD START
            // When the shipping date could not be calculated
            // because there is no calendar previous ETD. 
            // ETDより前のカレンダーが存在せず、出荷予定日が算出できなかった場合
            if (resultItemDomain.getShippingDueDate() == null) {
                String property = "wb002ListDomainList[" + Integer.parseInt(listDomain.getIndex()) + "].dummy";
                Object[] params = {
                    "CIGMA's Relative Week Calendar Master",
                    "Shipping Due Date for ETD:" + listDomain.getEtdDueDt()
                };
                MessageDomain msg = new MessageDomain(property, NXS_E1_0031, params);
                errorList.add(0, msg);
                listDomain.setWarningFlgForecastQty("E");
            } else {
            // ST990 ADD END

                try {
                    listDomain.setShippingDt(sdf.format(cigmaDf.parse(resultItemDomain.getShippingDueDate())));
                } catch (ParseException e) {
                    new ApplicationException("");
                }
            }
            listDomainList.set(i, listDomain);
        }
        //}

        // Add by external design modification No.345 start.
        // An error forecast order that shipping date is past date.
        // Error message display order to sort so that the Z order, together with the error of the Web service.
        // 出荷予定日が過去日となる内示はエラーとする。
        // エラーメッセージ表示順がWebサービスのエラーと合わせてZ順となるようにソートする。
        Date cigmaAds = commonService.searchCigmaAds(rcvOdrCompCd);
        Date shippingDt = null;
        for (WB002ListDomain listDomain : listDomainList) {
            if (BigDecimal.ZERO.compareTo(convertBigDecimal(listDomain.getForecastQty())) != 0) {
                if (!StringUtils.isBlank(listDomain.getShippingDt())) {
                    try {
                        shippingDt = sdf.parse(listDomain.getShippingDt());
                    } catch (ParseException e) {
                        new SystemException(e);
                    }
                    if (shippingDt.compareTo(cigmaAds) <= 0) {
                        String property = 
                            "wb002ListDomainList[" + Integer.parseInt(listDomain.getIndex()) + "].forecastQty";
                        Object[] params = { listDomain.getEtdDueDt() };
                        MessageDomain msg = new MessageDomain(property, NXS_E7_0019, params);
                        errorList.add(0, msg);
                        listDomain.setWarningFlgForecastQty("E");
                    }
                }
            }
        }
        Collections.sort(errorList, new Comparator<MessageDomain>() {
            public int compare(MessageDomain o1, MessageDomain o2) {
                String[] temp1s = o1.getProperty().split("(\\[|\\])");
                String[] temp2s = o2.getProperty().split("(\\[|\\])");
                if (1 < temp1s.length && 1 < temp2s.length) {
                    return Integer.parseInt(temp1s[1]) - Integer.parseInt(temp2s[1]);
                }
                return 0;
            }
        });
        // Add by external design modification No.345 end.

        // checked result judging
        // チェック結果判定
        if (errorList != null && errorList.size() > 0) {
            
            boolean throwFlg = false;
            
            if (StringUtils.equals(criteriaDomain.getIgnoreWarnings(), CHECK_ON)) {
                // In warning disregard, only when the message which starts except NXS-W* exists, it throw(s).
                // 警告無視の場合は、NXS-W*以外で始まるメッセージが存在する場合のみ、throwする。
                String warningMsgWord = "NXS-W";
                for (Iterator<MessageDomain> i = errorList.iterator(); i.hasNext();) {
                    MessageDomain msg = i.next();
                    if (msg.getKey() != null && !msg.getKey().startsWith(warningMsgWord)) {
                        throwFlg = true;
                        break;
                    }
                }
            } else {
                throwFlg = true;
            }
            if (throwFlg) {
                throw new ValidationException(errorList);
            }
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving domain
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB002CriteriaDomain} are set up.   *12
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB002ListDomain} are set up.   *2
     *       {@link WB001OdrRcvDomain} This is {@link WB001OdrRcvDomain} to *1. The list of *2 is set up.
     *
     * - Execution of registration processing
     *       This is an argument about created {@link WB001OdrRcvDomain},
     *       This is a call about {@link WB001OdrRcvService#transactOnRegister (WB001OdrRcvDomain)}.
     *
     * A create of - Update domain
     *       {@link WB002UpdateDomain} is created based on the re retrieval result after registration.
     *
     * A return of - Update domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB002CriteriaDomain}の内容を設定 ※12
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB002ListDomain}の内容を設定 ※2
     *     {@link WB001OdrRcvDomain} ※1に{@link WB001OdrRcvDomain} ※2のリストを設定
     *     
     * - 登録処理の実行
     *     作成した{@link WB001OdrRcvDomain}を引数に、
     *     {@link WB001OdrRcvService#transactOnRegister(WB001OdrRcvDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     登録後の再検索結果をもとに{@link WB002UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected WB002UpdateDomain callServices(WB002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving domain
       // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = createOdrRcv(updateDomain);
        
        // Execution of registration processing
        // 登録処理の実行
        WB001OdrRcvDomain resultOdrRcv = wb001OdrRcvService.transactOnRegister(odrRcv);
        
        // A create of a Update domain
        // Updateドメインの作成
        return convertToListDomain(updateDomain.getCriteriaDomain(), resultOdrRcv);
    }
    
    /**
     * {@link WB002UpdateDomain} to {@link WB001OdrRcvDomain} is created.
     * <br />{@link WB002UpdateDomain}から{@link WB001OdrRcvDomain}を作成します。
     *
     * @param updateDomain {@link WB002UpdateDomain}
     * @return Created {@link WB001OdrRcvCriteriaDomain}<br />作成した{@link WB001OdrRcvCriteriaDomain}
     * @throws ApplicationException When the date conversion error occurs<br />日付変換エラーが発生した場合
     */
    protected WB001OdrRcvDomain createOdrRcv(WB002UpdateDomain updateDomain) throws ApplicationException {
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        WB002CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Acquisition of Date format
        // 日付フォーマットの取得
        String screenDateFormat = criteriaDomain.getScreenDateFormat();
        
        // Setting of an Export-Receive-Order (parents) domain
        // 輸出受注（親）ドメインの設定
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        CommonUtil.copyPropertiesDomainToDomain(parentOdrRcv, criteriaDomain, screenDateFormat);
        
        // Setting of a PACKAGE CODE
        // 包装区分の設定
        parentOdrRcv.setPkgCd(convertBlankToSpace(criteriaDomain.getPkgCd()));
        
        // Copy of the date list
        // 日付リストのコピー
        List<Date> dateList = new ArrayList<Date>();
        for (String strDate : criteriaDomain.getDateList()){
            SimpleDateFormat sdf = new SimpleDateFormat(criteriaDomain.getScreenDateFormat());
            try {
                Date date = sdf.parse(strDate);
                dateList.add(date);
            } catch (ParseException e) {
                throw new ApplicationException(e);
            }
        }
        parentOdrRcv.setDateList(dateList);
        
        // Acquisition of the list of list domains
        // リストドメインのリストの取得
        List<WB002ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // List of Export-Receive-Order (sub) domains
        // 輸出受注（子）ドメインのリスト
        List<WB001OdrRcvDomain> childOdrRcvList = new ArrayList<WB001OdrRcvDomain>();
        
        for (WB002ListDomain listDomain : listDomainList) {
            // Export-Receive-Order (sub) domain
            // 輸出受注（子）ドメイン
            WB001OdrRcvDomain childOdrRcv = new WB001OdrRcvDomain();
            
            // Setting of an Export-Receive-Order (sub) domain
            // 輸出受注（子）ドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(childOdrRcv, listDomain, screenDateFormat);
            
            childOdrRcvList.add(childOdrRcv);
        }
        
        // String attachment of the parent and child of Export-Receive-Order domain
        // 輸出受注ドメインの親子の紐づけ
        parentOdrRcv.setOdrRcvDomainList(childOdrRcvList);
        
        return parentOdrRcv;
    }
    
    /**
     * {@link WB001OdrRcvDomain} to {@link WB002UpdateDomain} is created.
     * <br />{@link WB001OdrRcvDomain}から{@link WB002UpdateDomain}を作成します。
     *
     * @param criteriaDomain {@link WB002CriteriaDomain}
     * @param odrRcv {@link WB001OdrRcvDomain}
     * @return Created {@link WB002UpdateDomain}<br />作成した{@link WB002UpdateDomain}
     */
    @SuppressWarnings("deprecation")
    protected WB002UpdateDomain convertToListDomain(WB002CriteriaDomain criteriaDomain, WB001OdrRcvDomain odrRcv) {
        // Acquisition of Date format
        // 日付フォーマットの取得
        String screenDateFormat = criteriaDomain.getScreenDateFormat();
        
        // Acquisition of an Export-Receive-Order (parents) domain
        // 輸出受注（親）ドメインの取得
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // Acquisition of an Export-Receive-Order (sub) domain list
        // 輸出受注（子）ドメインリストの取得
        List<? extends WB001OdrRcvDomain> childOdrRcvList = parentOdrRcv.getOdrRcvDomainList();
        
        // Export-Receive-Order (parents) domain is copied to a search-condition domain.
        // 輸出受注（親）ドメインを検索条件ドメインにコピー
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, parentOdrRcv, screenDateFormat);
        
        /*
         * With 426 lines "(List) List destList = obj.getClass().newInstance();" of ScreenInfoStackRequestProcessor
         * When obj is Arrays$arrayList, it becomes an error and does not Stack.
         * Copy manually.
         * <br />ScreenInfoStackRequestProcessorの426行「List destList = (List)obj.getClass().newInstance();」で
         * objがArrays$arrayListの場合エラーとなってStackされない。
         * 手動でコピーしておく。
         */ 
        List<String> totalQtyList = new ArrayList<String>();
        for (BigDecimal qty : parentOdrRcv.getTotalQty()){
            String strQty = qty.toString();
            totalQtyList.add(strQty);
        }
        criteriaDomain.setTotalQty(totalQtyList);
        
        int index = 0;
        
        // Export-Receive-Order (sub) domain list is copied to a list domain list.
        // 輸出受注（子）ドメインリストをリストドメインリストにコピー
        List<WB002ListDomain> listDomainList = new ArrayList<WB002ListDomain>();
        for (WB001OdrRcvDomain childOdrRcv : childOdrRcvList){
            WB002ListDomain listDomain = new WB002ListDomain();
            
            // Export-Receive-Order (sub) domain is copied to a list domain.
            // 輸出受注（子）ドメインをリストドメインにコピー
            CommonUtil.copyPropertiesDomainToDomain(listDomain, childOdrRcv, screenDateFormat);
            
            listDomain.setFirmQty(convertZeroToBlank(childOdrRcv.getFirmQty()));
            listDomain.setForecastQty(convertZeroToBlank(childOdrRcv.getForecastQty()));
            
            listDomain.setCustomerPoNoHidden(childOdrRcv.getCustomerPoNo());
            listDomain.setCustomerItemNoHidden(childOdrRcv.getCustomerItemNo());
            listDomain.setSalesCompPoNoHidden(childOdrRcv.getSalesCompPoNo());
            
            if (childOdrRcv.getPltzAllocQty() != null){
                listDomain.setPltzAllocQtyHidden(childOdrRcv.getPltzAllocQty().toString());
            }
            if (childOdrRcv.getComUpdateTimestamp() != null){
                listDomain.setUpdateTimestamp(childOdrRcv.getComUpdateTimestamp().toString());
            }
            
            if (childOdrRcv.getCount() != null){
                listDomain.setCountHidden(childOdrRcv.getCount().toString());
            }
            
            listDomain.setIndex(Integer.toString(index));
            index++;
            
            // Export-Receive-Order information retrieval result . count
            // 輸出受注情報検索結果.カウント
            BigDecimal recordCount = childOdrRcv.getCount();
            
            if (recordCount != null && BigDecimal.ONE.compareTo(recordCount) < 0) {
                // Export-Receive-Order information retrieval result . count > In the case of 1
                // 輸出受注情報検索結果.カウント > 1の場合
                listDomain.setCustomerDueDt("");
                listDomain.setCustomerItemNo("");
                listDomain.setCustomerPoNo("");
                listDomain.setSalesCompPoNo("");
            } else if (recordCount != null && BigDecimal.ONE.compareTo(recordCount) == 0){
                // Export-Receive-Order information retrieval result . count = in the case of 1
                // 輸出受注情報検索結果.カウント = 1の場合
                listDomain.setCount("");
            } else {
                listDomain.setCustomerItemNoHidden("");
            }
            
            listDomainList.add(listDomain);
        }
        
        // search-condition domain, and a list domain list are set as a mass update domain.
        // 検索条件ドメイン、リストドメインリストを一括更新ドメインに設定
        WB002UpdateDomain updateDomain = new WB002UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }
    
    /**
     * When an argument is Blank, Space is returned, and in except, an argument is returned.
     * <br />引数がBlankの場合Spaceを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Blank, this is a VALUE of an argument except Space.<br />Blankの場合Space、以外は引数の値
     */
    protected String convertBlankToSpace(String val){
        if (StringUtils.isBlank(val)){
            return new String(" ");
        } else {
            return val;
        }
    }
    
    /**
     * When an argument is null, null is returned, and in except, an argument is returned.
     * <br />引数がnullの場合nullを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @param dateFormat Date format<br />日付フォーマット
     * @return In null, this is a VALUE of an argument except null.<br />nullの場合null、以外は引数の値
     */
    protected Date convertDate(String val, String dateFormat){
        if (StringUtils.isBlank(val)){
            return null;
        } else {
            return DateUtil.parseDate(val, dateFormat);
        }
    }
    
    /**
     * When an argument is null, 0 is returned, and in except, an argument is returned.
     * <br />引数がnullの場合0を返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In null, this is a VALUE of an argument except 0.<br />nullの場合0、以外は引数の値
     */
    protected BigDecimal convertBigDecimal(String val){
        if (StringUtils.isBlank(val)){
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(val);
        }
    }
    
    /**
     * When an argument is Zero is returned, and in except, an argument is returned.
     * <br />引数がZeroの場合Blankを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Zero, this is a VALUE of an argument except Blank.<br />Zeroの場合Blank、以外は引数の値
     */
    protected String convertZeroToBlank(BigDecimal val){
        if (val == null || BigDecimal.ZERO.equals(val)){
            return new String("");
        } else {
            return val.toString();
        }
    }
}
