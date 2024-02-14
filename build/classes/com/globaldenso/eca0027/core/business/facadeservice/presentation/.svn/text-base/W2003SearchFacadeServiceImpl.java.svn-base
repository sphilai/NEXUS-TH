/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2003;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Search action of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2003SearchFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2003SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2003ListDomain>, W2003CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003SearchFacadeServiceImpl() {
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
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2003CriteriaDomain filterDomain(W2003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2003_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2003_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2003CriteriaDomain> valid 
            = new Validator<W2003CriteriaDomain>(criteriaDomain, "w2003CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "itemNo",
            "pkgCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2003);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A check among - night batch
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}.
     * 
     * - 夜間バッチ中チェック
     *     {@link W2001PltzInstrService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2001PltzInstrService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("w2003riteriaDomain.shipperCd", NXS_E1_0060, null);
            
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a search-condition domain
     *     {@link W2001PltzInstrItemCriteriaDomain} is created and the contents of criteriaDomain are copied.
     *
     * - A search of - Palletize Instruction Item No Work (an Export Receive Order is included)
     *     {@link W2001PltzInstrService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)} is called,
     *     A Palletize Instruction Item No Work and an Export Receive Order are searched.
     *
     * - A converted in - List domain
     *     The searched result is changed into {@link W2003ListDomain}.
     *
     * - 検索条件ドメインの作成
     *     {@link W2001PltzInstrItemCriteriaDomain}を作成し、criteriaDomainの内容をコピーする
     *     
     * - 梱包指示品目番号ワーク(輸出受注を含む)の検索
     *     {@link W2001PltzInstrService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain)}を呼出し、
     *     梱包指示品目番号ワーク、輸出受注を検索する
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2003ListDomain}に変換する
     * 
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W2003ListDomain> callServices(W2003CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria = createPltzInstrItemCriteriaDomain(criteriaDomain);
        
        // A search of Palletize Instruction Item No Work (an Export Receive Order is included)
        // 梱包指示品目番号ワーク(輸出受注を含む)の検索
        List<? extends W2001PltzInstrItemDomain> pltzInstrItemList = searchPltzInstrItem(pltzInstrItemCriteria);
        
        // A converted of a List domain
        // Listドメインの変換
        return convertToListDomain(pltzInstrItemList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * A search-condition domain is created.
     * <br />検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a Packaging Instruction (=Pull) Create screen<br />梱包指示Create画面の検索条件ドメイン
     * @return The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the time zone of Shipper is unacquirable<br />Shipperのタイムゾーンが取得できない場合
     */
    @SuppressWarnings("deprecation")
    protected W2001PltzInstrItemCriteriaDomain createPltzInstrItemCriteriaDomain(W2003CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria = new W2001PltzInstrItemCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        pltzInstrItemCriteria.setScreenId(criteriaDomain.getScreenId());
        pltzInstrItemCriteria.setLocale(criteriaDomain.getLocale());
        
        // A setting of DSC-ID
        // DSC-IDの設定
        pltzInstrItemCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(pltzInstrItemCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // The system date of Shipper is acquired.
        // Shipperのシステム日付を取得
        String timezoneId = commonService.searchTimezone(criteriaDomain.getShipperCd());
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        
        // Setting of a beginning-of-mission day
        // 運用開始日の設定
        pltzInstrItemCriteria.setAplyStrtDt(sysdate);

        return pltzInstrItemCriteria;
    }
    
    /**
     * A Palletize Instruction Item No Work (an Export Receive Order is included) is searched.
     * <br />梱包指示品目番号ワーク(輸出受注を含む)を検索します。
     *
     * @param pltzInstrItemCriteriaDomain Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When a Palletize Instruction Item No Work cannot be searched<br />梱包指示品目番号ワークが検索できない場合
     */
    protected List<? extends W2001PltzInstrItemDomain> searchPltzInstrItem(W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteriaDomain)
        throws ApplicationException {
        return w2001PltzInstrService.searchForPagingOnCreateSearch(pltzInstrItemCriteriaDomain);
    }
    
    /**
     * Search results are changed into a List domain.
     * <br />検索結果をListドメインに変換します。
     *
     * @param pltzInstrItemList Search results<br />検索結果
     * @param dateFormat Date format<br />日付フォーマット
     * @return List domain<br />Listドメイン
     * @throws ApplicationException When the WEIGHT UNIT of Shipper is unacquirable<br />Shipperの重量単位が取得できない場合
     */
    protected List<W2003ListDomain> convertToListDomain(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList, 
        String dateFormat) throws ApplicationException {
        
        List<W2003ListDomain> listDomainList = new ArrayList<W2003ListDomain>();
        
        if (pltzInstrItemList != null) {
            // Format of operating days
            // 稼働日のフォーマット
            List<String> workingDayList 
                = formatWorkingDay(pltzInstrItemList.get(0).getWorkingDayList(), dateFormat);
            
            // A create of a List domain
            for (int i = 0; i < pltzInstrItemList.size(); i++) {
                W2001PltzInstrItemDomain pltzInstrItem = pltzInstrItemList.get(i);
                // A create of a List domain
                // Listドメインの作成
                W2003ListDomain listDomain = new W2003ListDomain();
                
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstrItem);
                listDomain.setOnHandQty(decimalToString(pltzInstrItem.getOnHandQty()));
                
                int summaryOrder = 0;
                
                summaryOrder += Integer.parseInt(listDomain.getSumQtyBefore2());
                summaryOrder += Integer.parseInt(listDomain.getSumQtyBefore1());
                summaryOrder += Integer.parseInt(listDomain.getSumQty());
                summaryOrder += Integer.parseInt(listDomain.getSumQtyAfter1());
                summaryOrder += Integer.parseInt(listDomain.getSumQtyAfter2());
                summaryOrder += Integer.parseInt(listDomain.getSumQtyAfter3());
                summaryOrder += Integer.parseInt(listDomain.getSumQtyAfter4());
                
                if(summaryOrder > 9999999) {
                    summaryOrder = 9999999;
                }
                listDomain.setSummaryOrder(String.valueOf(summaryOrder));
                
                // Setting of a check box
                // チェックボックスの設定
                if (FLAG_Y.equals(listDomain.getDisabledFlg())) {
                    listDomain.setSelected(CHECK_ON);
                } else {
                    listDomain.setSelected(CHECK_OFF);
                }
                
                // Setting of operating days
                // 稼働日の設定
                listDomain.setWorkingDayList(workingDayList);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }

    /**
     * Operating days are orthopedically adjusted by the Date format for screens.
     * <br />稼働日を画面用の日付フォーマットで整形します。
     *
     * @param workingDayList Operating days<br />稼働日
     * @param dateFormat The Date format for screens<br />画面用の日付フォーマット
     * @return Operating days adjusted orthopedically<br />整形した稼働日
     */
    protected List<String> formatWorkingDay(List<Date> workingDayList, String dateFormat) {
        List<String> fmtWorkingDayList = new ArrayList<String>();
        
        for (Date workingDay : workingDayList) {
            fmtWorkingDayList.add(DateUtil.formatDate(workingDay, dateFormat));
        }
        
        return fmtWorkingDayList;
    }
    
    /**
     * The VALUE of BigDecimal is changed into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     * 
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal){
        
        if (decimalVal == null ) {
            return null;
        }
        return decimalVal.toPlainString();
    }
}
