/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOMER_PART_NO;

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
import com.globaldenso.eca0027.core.business.domain.WB002UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WB003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB003ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB003UpdateDomain;
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
 * This is an implement class of the Facade service to Update action of ordering two or moreP / O registration picture.
 * <br />受注複数P/O登録画面のUpdateアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 14596 $
 */
public class WB003RegisterFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends WB003ListDomain>, WB003UpdateDomain> {

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
    public WB003RegisterFacadeServiceImpl() {
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
    protected WB003UpdateDomain filterDomain(WB003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // Detailed line currently checked
        // チェックされている明細行
        List<WB003ListDomain> checkedListDomainList = new ArrayList<WB003ListDomain>();
        
        // Acquisition of a detailed line
        // 明細行の取得
        List<WB003ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // Acquisition of chosen detailed line
        // 選択済み明細行の取得
        if (listDomainList != null && listDomainList.size() > 0 ) {
            for(Iterator<WB003ListDomain> i = listDomainList.iterator(); i.hasNext(); ) {
                WB003ListDomain listDomain = i.next();
                
                // flg off
                listDomain.setWarningFlgFirmQty("");
                listDomain.setWarningFlgForecastQty("");
                
                if (StringUtils.equals(listDomain.getSelected(), CHECK_ON) ) {
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
    protected void validateItems(WB003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Error list
        // エラーリスト
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // The list of list domains is acquired.
        // リストドメインのリストを取得
        List<WB003ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
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
        if (listDomainList != null && listDomainList.size() > 0 ) {
            for (int i = 0; i < listDomainList.size(); i++) {
                WB003ListDomain listDomain = listDomainList.get(i);
                
                Validator<WB003ListDomain> valid = new Validator<WB003ListDomain>(listDomain, "wb003ListDomainList", Integer.parseInt(listDomain.getIndex()));
                
                valid.isValidateProperties(requiredProperties, SCREEN_ID_WB003);
                
                // Error registration
                // エラー登録
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }
            }
            
            // Error check
            // エラー確認
            if (0 < errList.size()) {
                throw new ValidationException(errList);
            }
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
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyDueDateReceivingDate (Date, Date)}.
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
     * - Decision and Forecast-QTY check
     *     (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY)  
     *       This is a call about * {@link WB001OdrRcvService#validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal, BigDecimal, BigDecimal)}.
     *
     * - Decision and Forecast-QTY check
     *     (in a QUANTITY specified, an error is made in decision and an unofficial announcement)  
     *         This is a call about {@link WB001OdrRcvService#validateConsistencyFirmQtyForecastQty (BigDecimal, BigDecimal)}.
     * 
     * - 確定数妥当性チェック
     *     {@link WB001OdrRcvService#validateConsistencyFirmQtyAllocQty(BigDecimal, BigDecimal)}を呼出
     *     
     * - 顧客納期妥当性チェック
     *     {@link WB001OdrRcvService#validateConsistencyDueDateReceivingDate(Date, Date)}を呼出
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
     * - 確定・内示数チェック
     *   （新規で確定・内示共に数量なしの場合エラー）
     *       {@link WB001OdrRcvService#validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal, BigDecimal, BigDecimal)}を呼出
     *       
     * - 確定・内示数チェック
     *   （確定・内示共に数量指定の場合エラー）
     *       {@link WB001OdrRcvService#validateConsistencyFirmQtyForecastQty(BigDecimal, BigDecimal)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Condition domain
        // 条件ドメイン
        WB003CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Date format
        // 日付フォーマット
        String dateFormat = updateDomain.getScreenDateFormat();
        
        // Acquisition of a locale
        // ロケールの取得
        Locale locale = updateDomain.getLocale();
        
        // ETD DUE DATE
        // 船積期限
        Date etdDueDate = DateUtil.parseDate(criteriaDomain.getEtdDueDt(), dateFormat);
        
        // List of list domains
        // リストドメインのリスト
        List<WB003ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        for(Iterator<WB003ListDomain> i = listDomainList.iterator(); i.hasNext(); ) {
            WB003ListDomain listDomain = i.next();
            
            // receivingDate
            Date receivingDate = convertDate(listDomain.getCustomerDueDt(), dateFormat);
            
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
            int indexDisp = index + 1;
            
            // The number validity check of decision
            // 確定数妥当性チェック
            if (!wb001OdrRcvService.validateConsistencyFirmQtyAllocQty(firmQty, allocQty)) {
                Object[] params = {
                    indexDisp
                };
                MessageDomain msgFirmQty = new MessageDomain("wb003ListDomainList[" + index + "].firmQty", NXS_E7_0018, params);
                MessageDomain msgAllocQty = new MessageDomain("wb003ListDomainList[" + index + "].pltzAllocQty", null, null);
                
                errorList.add(msgFirmQty);
                errorList.add(msgAllocQty);
            }
            
            // CUSTOMER-DUE-DATE validity check
            // 顧客納期妥当性チェック
            if (receivingDate != null){
                if (!wb001OdrRcvService.validateConsistencyDateReceivingDate(etdDueDate, receivingDate)) {
                    Object[] params = {
                        indexDisp
                    };
                    MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].customerDueDt", NXS_E7_0020, params);
                    
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
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].customerItemNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // Customer P/O No. change propriety check
            // 得意先P/O No.変更可否チェック
            if (!wb001OdrRcvService.validateConsistencyAllocQtyCustomerPoNo(allocQty, customerPoNo, customerPoNoHidden)) {
                Object[] params = {
                    commonService.getResource(locale, "label.custPoNo"),
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].customerPoNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // Sales company P/O change propriety check
            // 販売会社P/O変更可否チェック
            if (!wb001OdrRcvService.validateConsistencyAllocQtySalesPoNo(allocQty, salesCompPoNo, salesCompPoNoHidden)) {
                Object[] params = {
                    commonService.getResource(locale, "label.salesCompPoNo"),
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].salesCompPoNo", NXS_E7_0021, params);
                
                errorList.add(msg);
            }
            
            // decision, and Forecast-QTY check (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY)  
            // 確定・内示数チェック（新規で確定・内示共に数量なしの場合エラー）
            if (!wb001OdrRcvService.validateConsistencyOrderQtyFirmQtyForecastQty(hiddenOdrQty, firmQty, forecastQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.firmQty"), 
                    commonService.getResource(locale, "label.forecastQty"),
                    indexDisp
                };
                MessageDomain msgFirmQty = new MessageDomain("wb003ListDomainList[" + index + "].firmQty", NXS_E7_0022, params);
                MessageDomain msgForecastQty = new MessageDomain("wb003ListDomainList[" + index + "].forecastQty", null, null);
                
                errorList.add(msgFirmQty);
                errorList.add(msgForecastQty);
            }
            
            // decision, and Forecast-QTY check (in a QUANTITY specified, an error is made in decision and an unofficial announcement)  
            // 確定・内示数チェック（確定・内示共に数量指定の場合エラー）
            if (!wb001OdrRcvService.validateConsistencyFirmQtyForecastQty(firmQty, forecastQty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.firmQty"), 
                    commonService.getResource(locale, "label.forecastQty"),
                    indexDisp
                };
                MessageDomain msgFirmQty = new MessageDomain("wb003ListDomainList[" + index + "].firmQty", NXS_E7_0022, params);
                MessageDomain msgForecastQty = new MessageDomain("wb003ListDomainList[" + index + "].forecastQty", null, null);
                
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
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     * - Ordering company existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnMultiPoRegister(String)}.
     *
     * - SHIP-TO-NAME acquisition   Existence check
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(String, String, String ,WB001OdrRcvDomain)}.
     *
     * - ITEM-NO existence check for export
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegister(String, String, String, String, String, Date, BigDecimal[])}.
     *
     * - ITEM-NO existence check for export control
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnMultiPoRegister(String, String, Date)}.
     *
     * - ETD validity check
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseProcessingDateOnMultiPoRegister (String, Date)}.
     *
     * - Decision and Forecast-QTY check
     *    (an error is made when a definite unofficial announcement is intermingled by the order received whose key corresponds.)
     *      A transportation CD difference is not permitted, either.
     *      That is, an error is made when an unofficial announcement order received exists by FIRM_Qty>0 in addition to the object record under selection.
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     * - Decision and Forecast-QTY check
     *    (an error is made when a definite unofficial announcement is intermingled by the order received whose key corresponds.)
     *      A transportation CD difference is not permitted, either.
     *       That is, an error is made when a firm order receipt exists by FORECAST_Qty>0 in addition to the object record under selection.  
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     * - Lot multiple check
     *     [73] : When Firm Qty cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(BigDecimal, BigDecimal)}.
     *
     * - Lot multiple check
     *     [74] : When Forecast Qty cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(BigDecimal, BigDecimal)}.
     *
     * - Duplication check
     * {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(int, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain, List)}.
     *
     * - Web service "ECA0027_WS_B002:on-line ordering registration detailed check"
     * {@link WB001OdrRcvService#validateDatabaseWsB002OnMultiPoRegister(String, String, String, String, String, String ,List, List, List, WsB002ResultDomain)}.
     * 
     * - 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *     
     * - 受注会社存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnMultiPoRegister(String)}を呼出
     *     
     * - 送荷先名称取得　存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(String, String, String ,WB001OdrRcvDomain)}を呼出
     *     
     * - 輸出対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegister(String, String, String, String, String, Date, BigDecimal[])}を呼出
     *     
     * - 輸出規制対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnMultiPoRegister(String, String, Date)}を呼出
     *     
     * - ETD妥当性チェック
     *     {@link WB001OdrRcvService#validateDatabaseProcessingDateOnMultiPoRegister(String, Date)}を呼出
     *     
     * - 確定・内示数チェック
     *  （キーが一致する受注で確定内示が混在する場合エラー。
     *    輸送コード違いでも許可しない。つまりFIRM_Qty>0で選択中の対象レコード以外に内示受注が存在する場合エラー）
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 確定・内示数チェック
     *  （キーが一致する受注で確定内示が混在する場合エラー。
     *    輸送コード違いでも許可しない。つまりFORECAST_Qty>0で選択中の対象レコード以外に確定受注が存在する場合エラー）
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(BigDecimal, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - ロット倍数チェック
     *   【73】:Firm Qtyが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(BigDecimal, BigDecimal)}を呼出
     *     
     * - ロット倍数チェック
     *   【74】:Forecast Qtyが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(BigDecimal, BigDecimal)}を呼出
     *     
     * - 重複チェック
     *     {@link WB001OdrRcvService#validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(int, TtExpRcvOdrCriteriaDomain, TtExpRcvOdrCriteriaDomain, List)}を呼出
     *     
     * - Webサービス「ECA0027_WS_B002：オンライン受注登録明細チェック」
     *     {@link WB001OdrRcvService#validateDatabaseWsB002OnMultiPoRegister(String, String, String, String, String, String, List, List, List, WsB002ResultDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Condition domain
        // 条件ドメイン
        WB003CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // The domain for setting up return VALUE
        // 戻り値を設定する為のドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        
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
        
        // Date format
        // 日付フォーマット
        String dateFormat = updateDomain.getScreenDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        SimpleDateFormat cigmaDf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // Edi Due Date
        String strEtdDueDate = criteriaDomain.getEtdDueDt();
        Date dueDate = DateUtil.parseDate(strEtdDueDate, dateFormat);
        
        // The number of lots
        // ロット数
        BigDecimal shippingLot = BigDecimal.ZERO;
        
        // List of list domains
        // リストドメインのリスト
        List<WB003ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
        
        // Acquisition of the list of update object lines
        // 更新対象行のリストの取得
        List<WB003ListDomain> updateListDomainList = updateDomain.getUpdateListDomainList();
        
        // A create of a Customer Order Receiving domain
        // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = createOdrRcv(updateDomain);
        
        // APPLY START DATE
        // 適用開始日
        Date aplyStrtDt = commonService.searchCigmaAds(rcvOdrCompCd);
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // common specifications: This is a check during processing in the CIGMA night.   (behavior in a CIGMA night batch)  
        // 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
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
        if (!wb001OdrRcvService.validateDatabaseTmNxsCompOnMultiPoRegister(rcvOdrCompCd)) {
            MessageDomain msg = new MessageDomain("wb003CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null);
            
            errorList.add(msg);
        }
        
        // Processing is ended if ordering company does not exist.
        // 受注会社が存在しなければ、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        // SHIP-TO-NAME acquisition   Existence check
        // 送荷先名称取得　存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(rcvOdrCompCd, custCd, lgcyShipTo, tmpDomain)) {
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb003CriteriaDomain.rcvOdrCompCd", NXS_E7_0032, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb003CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("wb003CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        } else {
            criteriaDomain.setShipToNm(tmpDomain.getShipToNm());
        }
        
        // ITEM-NO existence check for export
        // 輸出対象品目番号存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo(rcvOdrCompCd, itemNo, pkgCd, custCd, lgcyShipTo, aplyStrtDt, tmpDomain)) {
            Object[] params = {
                ""
            };
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb003CriteriaDomain.rcvOdrCompCd", NXS_E7_0033, params);
            MessageDomain msgItemNo = new MessageDomain("wb003CriteriaDomain.itemNo", null, null);
            MessageDomain msgPkgCd = new MessageDomain("wb003CriteriaDomain.pkgCd", null, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb003CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("wb003CriteriaDomain.lgcyShipTo", null, null);
            
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
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb003CriteriaDomain.rcvOdrCompCd", NXS_E7_0034, params);
            MessageDomain msgItemNo = new MessageDomain("wb003CriteriaDomain.itemNo", null, null);
            
            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgItemNo);
        }
        
        // Processing will be ended if an error exists with the check so far.
        // ここまでのチェックでエラーが存在すれば、処理を終了
        if (errorList != null && errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        // Delete by external design modification No.345 start.
        // ETD validity check
        // ETD妥当性チェック
        //if (!wb001OdrRcvService.validateDatabaseProcessingDateOnMultiPoRegister(rcvOdrCompCd, dueDate)) {
        //    Object[] params = {
        //        strEtdDueDate
        //    };
        //    MessageDomain msg = new MessageDomain("", NXS_E7_0019, params);
        //    
        //    errorList.add(msg);
        //}
        // Delete by external design modification No.345 end.
        
        for(Iterator<WB003ListDomain> i = listDomainList.iterator(); i.hasNext(); ) {
            WB003ListDomain listDomain = i.next();
            
            // Order Ctrl No
            BigDecimal odrCtrlNo = convertBigDecimal(listDomain.getOdrCtrlNo());
            
            // Customer P/O No
            String customerPoNo = listDomain.getCustomerPoNo();
            String customerPoNoHidden = listDomain.getCustomerPoNoHidden();
            
            // Customer Item No
            String customerItemNo = listDomain.getCustomerItemNo();
            String customerItemNoHidden = listDomain.getCustomerItemNoHidden();
            
            // Customer Item No(ORG)
            String customerItemNoOrg = listDomain.getCustomerItemNoOrg();
            
            // Firm Qty
            BigDecimal firmQty = convertBigDecimal(listDomain.getFirmQty());
            
            // Forecast Qty
            BigDecimal forecastQty = convertBigDecimal(listDomain.getForecastQty());
            
            // Index
            int index = Integer.parseInt(listDomain.getIndex());
            int indexDisp = index + 1;
            
            TtExpRcvOdrCriteriaDomain after = new TtExpRcvOdrCriteriaDomain();
            after.setRcvOdrCompCd(rcvOdrCompCd);
            after.setCustomerCd(custCd);
            after.setLgcyShipTo(lgcyShipTo);
            after.setItemNo(itemNo);
            after.setPkgCd(pkgCd);
            after.setEtdDueDt(dueDate);
            after.setCustomerPoNo(customerPoNo);
            after.setCustomerItemNo(customerItemNo);
            after.setOdrFirmFlg(FLAG_N);
            
            TtExpRcvOdrCriteriaDomain before = new TtExpRcvOdrCriteriaDomain();
            before.setRcvOdrCompCd(rcvOdrCompCd);
            before.setCustomerCd(custCd);
            before.setLgcyShipTo(lgcyShipTo);
            before.setItemNo(itemNo);
            before.setPkgCd(pkgCd);
            before.setTrnsCd(trnsCd);
            before.setEtdDueDt(dueDate);
            before.setCustomerPoNo(customerPoNoHidden);
            before.setCustomerItemNo(customerItemNoHidden);
            before.setCustomerItemNoOrg(customerItemNoOrg);
            before.setOdrCtrlNo(odrCtrlNo);
            
            // Decision and Forecast-QTY check
            // 確定・内示数チェック
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(firmQty, after, before)) {
                Object[] params = {
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].firmQty", NXS_E7_0023, params);
                
                errorList.add(msg);
                
                listDomain.setWarningFlgFirmQty("E");
            }
            
            // Decision and Forecast-QTY check
            // 確定・内示数チェック
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(forecastQty, after, before)) {
                Object[] params = {
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].forecastQty", NXS_E7_0024, params);
                
                errorList.add(msg);
                
                listDomain.setWarningFlgForecastQty("E");
            }
            
            // Lot multiple check
            // ロット倍数チェック
            if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(firmQty, shippingLot)) {
                Object[] params = {
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].firmQty", NXS_W1_0001, params);
                
                errorList.add(msg);
                
                if (StringUtils.isBlank(listDomain.getWarningFlgFirmQty())){
                    listDomain.setWarningFlgFirmQty("W");
                }
            }
            
            // Lot multiple check
            // ロット倍数チェック
            if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(forecastQty, shippingLot)) {
                Object[] params = {
                    indexDisp
                };
                MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].forecastQty", NXS_W1_0001, params);
                
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
            after.setEtdDueDt(dueDate);
            after.setCustomerPoNo(customerPoNo);
            after.setCustomerItemNo(customerItemNo);
            if (StringUtils.isBlank(customerItemNoOrg)) {
                after.setCustomerItemNoOrg(customerItemNo);
            } else {
                after.setCustomerItemNoOrg(customerItemNoOrg);
            }
            after.setOdrCtrlNo(odrCtrlNo);
            
            before = new TtExpRcvOdrCriteriaDomain();
            before.setRcvOdrCompCd(rcvOdrCompCd);
            before.setCustomerCd(custCd);
            before.setLgcyShipTo(lgcyShipTo);
            before.setItemNo(itemNo);
            before.setPkgCd(pkgCd);
            before.setTrnsCd(trnsCd);
            before.setEtdDueDt(dueDate);
            before.setCustomerPoNo(customerPoNoHidden);
            before.setCustomerItemNo(customerItemNoHidden);
            before.setCustomerItemNoOrg(customerItemNoOrg);
            before.setOdrCtrlNo(odrCtrlNo);
            
            if (!wb001OdrRcvService.validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(index, after, before, odrRcv.getOdrRcvDomainList())) {
                Object[] params = {
                    indexDisp
                };
                //MessageDomain msg = new MessageDomain("wb003ListDomainList[" + index + "].selected", NXS_E7_0025 , params);
                MessageDomain msg = new MessageDomain("", NXS_E7_0025 , params);
                
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
        
        for (Iterator<WB003ListDomain> i = updateListDomainList.iterator(); i.hasNext();) {
            WB003ListDomain listDomain = i.next();
            
            indexList.add(listDomain.getIndex());
            etdDueDtList.add(dueDate);
            customerItemNoList.add(listDomain.getCustomerItemNo());
        }
        
        // The invoke of Web service
        // Webサービスの呼び出し
        if (!wb001OdrRcvService.validateDatabaseWsB002OnMultiPoRegister(rcvOdrCompCd, custCd, lgcyShipTo, itemNo, pkgCd, trnsCd, 
            indexList, etdDueDtList, customerItemNoList, wsB002Result)) {
            
            for (WsB002ResultItemDomain customerOrder :  wsB002Result.getCustomerOrderList()){
                if (customerOrder.getErrorList() != null) {  // Add by external design modification No.345.
                    for (ErrorListItemDomain error : customerOrder.getErrorList()){
                        String errCode = error.getErrorCode();

                        if (NXS_E7_0148.equals(errCode)){
                            int index = Integer.parseInt(error.getErrorParamList().get(1).getParam());

                            // ST988 ADD START
                            // Ignore the EM000PR error in the case of deletion (quantity 0).
                            // 削除（数量0）の場合は品対のエラーを無視する。
                            BigDecimal firmQty = convertBigDecimal(updateDomain.getListDomainList().get(index - 1).getFirmQty());
                            BigDecimal forecastQty = convertBigDecimal(updateDomain.getListDomainList().get(index - 1).getForecastQty());
                            if (!BigDecimal.ZERO.equals(firmQty) || !BigDecimal.ZERO.equals(forecastQty)) {
                            // ST988 ADD END

                                Object[] params = {index};
                                MessageDomain msgCustomerItemNo = new MessageDomain("wb003ListDomainList[" + (index - 1) + "].customerItemNo", errCode, params);
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
            
            WB003ListDomain listDomain = new WB003ListDomain();
            for (WB003ListDomain d : updateListDomainList){
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
                    "Shipping Due Date for ETD:" + criteriaDomain.getEtdDueDt()
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
            updateListDomainList.set(i, listDomain);
        }
        //}

        // Add by external design modification No.345 start.
        // An error forecast order that shipping date is past date.
        // Error message display order to sort so that the Z order, together with the error of the Web service.
        // 出荷予定日が過去日となる内示はエラーとする。
        // エラーメッセージ表示順がWebサービスのエラーと合わせてZ順となるようにソートする。
        Date cigmaAds = commonService.searchCigmaAds(rcvOdrCompCd);
        Date shippingDt = null;
        for (WB003ListDomain listDomain : listDomainList) {
            if (BigDecimal.ZERO.compareTo(convertBigDecimal(listDomain.getForecastQty())) != 0) {
                if (!StringUtils.isBlank(listDomain.getShippingDt())) {
                    try {
                        shippingDt = sdf.parse(listDomain.getShippingDt());
                    } catch (ParseException e) {
                        new SystemException(e);
                    }
                    if (shippingDt.compareTo(cigmaAds) <= 0) {
                        String property = 
                            "wb003ListDomainList[" + Integer.parseInt(listDomain.getIndex()) + "].forecastQty";
                        Object[] params = { Integer.parseInt(listDomain.getIndex()) + 1 };
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
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB003CriteriaDomain} are set up.   *1
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB003ListDomain} are set up.   *2
     *       {@link WB001OdrRcvDomain} This is {@link WB001OdrRcvDomain} to *1. The list of *2 is set up.
     *
     * - Execution of registration processing
     *       This is an argument about created {@link WB001OdrRcvDomain},
     *       This is a call about {@link WB001OdrRcvService#transactOnMultiPoRegister (WB001OdrRcvDomain)}.
     *
     * A create of - List domain
     *       {@link WB003ListDomain} is created based on the re retrieval result after registration.
     *
     * A return of - List domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB003CriteriaDomain}の内容を設定 ※1
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB003ListDomain}の内容を設定 ※2
     *     {@link WB001OdrRcvDomain} ※1に{@link WB001OdrRcvDomain} ※2のリストを設定
     *     
     * - 登録処理の実行
     *     作成した{@link WB001OdrRcvDomain}を引数に、
     *     {@link WB001OdrRcvService#transactOnMultiPoRegister(WB001OdrRcvDomain)}を呼出
     *     
     * - Listドメインの作成
     *     登録後の再検索結果をもとに{@link WB003ListDomain}を作成する
     *     
     * - Listドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected List<? extends WB003ListDomain> callServices(WB003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving domain
        // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = createOdrRcv(updateDomain);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends WB001OdrRcvDomain> resultOdrRcvList = wb001OdrRcvService.transactOnMultiPoRegister(odrRcv);
        
        // A create of a List domain, a return of a List domain
        // Listドメインの作成、Listドメインの返却
        return convertToListDomain(updateDomain.getCriteriaDomain(), resultOdrRcvList);
    }
    
    /**
     * {@link WB003UpdateDomain} to {@link WB001OdrRcvDomain} is created.
     * <br />{@link WB003UpdateDomain}から{@link WB001OdrRcvDomain}を作成します。
     *
     * @param updateDomain {@link WB002UpdateDomain}
     * @return Created {@link WB001OdrRcvCriteriaDomain}<br />作成した{@link WB001OdrRcvCriteriaDomain}
     */
    protected WB001OdrRcvDomain createOdrRcv(WB003UpdateDomain updateDomain) {
        
        // Acquisition of a condition domain
        // 条件ドメインの取得
        WB003CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
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
        
        // List acquisition of a list domain
        // リストドメインのリスト取得
        List<WB003ListDomain> listDomainList = updateDomain.getUpdateListDomainList();
            
        // List of Export-Receive-Order (sub) domains
        // 輸出受注（子）ドメインのリスト
        List<WB001OdrRcvDomain> childOdrRcvList = new ArrayList<WB001OdrRcvDomain>();
        
        for (Iterator<WB003ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            // Acquisition of a list domain
            // リストドメインの取得
            WB003ListDomain listDomain = i.next();
            
            // Create of a condition domain
            // 条件ドメインの作成
            WB001OdrRcvDomain childOdrRcv = new WB001OdrRcvDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(childOdrRcv, listDomain, screenDateFormat);
            childOdrRcvList.add(childOdrRcv);
        }
        
        // String attachment of the child-parent relationship of Export Receive Order
        // 輸出受注の親子関係の紐づけ
        parentOdrRcv.setOdrRcvDomainList(childOdrRcvList);
        
        return parentOdrRcv;
    }
    
    /**
     * The list of {@link WB003ListDomain} is created from the list of {@link WB001OdrRcvDomain}.
     * <br />{@link WB001OdrRcvDomain}のリストから{@link WB003ListDomain}のリストを作成します。
     *
     * @param criteriaDomain {@link WB003CriteriaDomain}
     * @param odrRcvList The list of {@link WB001OdrRcvDomain}<br />{@link WB001OdrRcvDomain}のリスト
     * @return Created {@link WB003ListDomain}<br />作成した{@link WB003ListDomain}
     */
    protected List<WB003ListDomain> convertToListDomain(WB003CriteriaDomain criteriaDomain, List<? extends WB001OdrRcvDomain> odrRcvList) {
        // Date format
        // 日付フォーマット
        String screenDateFormat = criteriaDomain.getScreenDateFormat();
        
        // List of list domains
        // リストドメインのリスト
        List<WB003ListDomain> listDomainList = new ArrayList<WB003ListDomain>();
        
        if (odrRcvList != null && odrRcvList.size() > 0) {
            for (int i = 0; i < odrRcvList.size(); i++) {
                WB001OdrRcvDomain wB001OdrRcvDomain = odrRcvList.get(i);
                
                WB003ListDomain listDomain = new WB003ListDomain();
                
                listDomain.setNo(i + 1);
                listDomain.setFirmQty(convertZeroToBlank(wB001OdrRcvDomain.getFirmQty()));
                listDomain.setForecastQty(convertZeroToBlank(wB001OdrRcvDomain.getForecastQty()));
                listDomain.setCustomerDueDt(DateUtil.formatDate(wB001OdrRcvDomain.getCustomerDueDt(), screenDateFormat));
                listDomain.setPltzAllocQty(String.valueOf(wB001OdrRcvDomain.getPltzAllocQty()));
                listDomain.setCustomerItemNo(wB001OdrRcvDomain.getCustomerItemNo());
                listDomain.setCustomerPoNo(wB001OdrRcvDomain.getCustomerPoNo());
                listDomain.setSalesCompPoNo(wB001OdrRcvDomain.getSalesCompPoNo());
                listDomain.setCustomerPoNoHidden(wB001OdrRcvDomain.getCustomerPoNo());
                listDomain.setOdrCtrlNo(String.valueOf(wB001OdrRcvDomain.getOdrCtrlNo()));
                listDomain.setCustomerItemNoHidden(wB001OdrRcvDomain.getCustomerItemNo());
                listDomain.setCustomerItemNoOrg(wB001OdrRcvDomain.getCustomerItemNoOrg());
                listDomain.setSalesCompPoNoHidden(wB001OdrRcvDomain.getSalesCompPoNo());
                listDomain.setOdrQty(String.valueOf(wB001OdrRcvDomain.getOdrQty()));
                listDomain.setOdrQtyOrg(String.valueOf(wB001OdrRcvDomain.getOdrQtyOrg()));
                listDomain.setPltzAllocQtyHidden(String.valueOf(wB001OdrRcvDomain.getPltzAllocQty()));
                listDomain.setShippedQty(String.valueOf(wB001OdrRcvDomain.getShippedQty()));
                listDomain.setPartialDelivCnt(String.valueOf(wB001OdrRcvDomain.getPartialDelivCnt()));
                listDomain.setUpdateTimestamp(wB001OdrRcvDomain.getComUpdateTimestamp().toString());
                listDomain.setComUpdateTimestamp(wB001OdrRcvDomain.getComUpdateTimestamp());
                listDomain.setIndex(String.valueOf(i));
                
                listDomainList.add(listDomain);
            }
        }
        
        for (int i = listDomainList.size(); i < 20; i++) {
            
            WB003ListDomain blankData = new WB003ListDomain();
            blankData.setNo(i + 1);
            blankData.setFirmQty("");
            blankData.setForecastQty("");
            blankData.setCustomerDueDt("");
            blankData.setPltzAllocQty("");
            blankData.setCustomerItemNo(criteriaDomain.getCustomerItemNo());
            blankData.setCustomerPoNo(criteriaDomain.getCustomerPoNo());
            blankData.setSalesCompPoNo("");
            blankData.setOdrCtrlNo("");
            blankData.setCustomerItemNoHidden("");
            blankData.setCustomerItemNoOrg("");
            blankData.setSalesCompPoNoHidden("");
            blankData.setOdrQty("");
            blankData.setOdrQtyOrg("");
            blankData.setPltzAllocQtyHidden("");
            blankData.setShippedQty("");
            blankData.setPartialDelivCnt("");
            blankData.setComUpdateTimestamp(null);
            blankData.setIndex(String.valueOf(i));
            
            listDomainList.add(blankData);
        }
        
        return listDomainList;
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
     * @param val Numerical value<br>数値
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
