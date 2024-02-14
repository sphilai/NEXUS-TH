/*
 * Project : ${project_name}
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2011;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * SearchFacade service implement class of a CML Create screen.
 * <br />CML Create画面のSearchFacadeサービス実装クラスです。
 * <pre>
 * bean W2011SearchFacade
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class W2011SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2011ListDomain>, W2011CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2011SearchFacadeServiceImpl() {
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
     * Setter method for w2009CmlService.
     *
     * @param service Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService service) {
        w2009CmlService = service;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2011CriteriaDomain filterDomain(W2011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Common error checking
     * Screen definition document_ECA0027_W2011_CML Create.xls a screen item definition is referred to.
     * 共通エラーチェック
     * 画面定義書_ECA0027_W2011_CML Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2011CriteriaDomain> valid 
            = new Validator<W2011CriteriaDomain>(criteriaDomain, "w2011CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "containerSortingKey",
            "mixTagNo",
            "pltzItemNo",
            "pkgCd",
            "invoiceKey"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W2011);
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * -  A check among night batch
     *     It checks by calling {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}.
     * - 夜間バッチ中チェック
     *     {@link W2009CmlService#validateDatabaseCigmaAvailable(boolean, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2009CmlService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("w2011criteriaDomain.shipperCd", NXS_E1_0060, null);
            
            errorList.add(msg);
        }
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a search-condition domain
     *       {@link W2009CmlCriteriaDomain} is created and the contents of criteriaDomain are copied.
     *
     * - Acquire the list of Palletize-Item eyes.
     *    {@link W2009CmlService#searchForPagingOnMainSearch(W2009CmlCriteriaDomain)} is called,
     *    A Packaging Instruction (=Pull), a Palletize Item Work, a Mix Tag, an Export Receive Order, and a packing specification are searched.
     *
     * - A converted in List domain
     *       The searched result is changed into {@link W2011ListDomain}.
     *
     * - 検索条件ドメインの作成
     *     {@link W2009CmlCriteriaDomain}を作成し、criteriaDomainの内容をコピーする
     *     
     * - パレタイズ対象品目の一覧を取得
     *     {@link W2009CmlService#searchForPagingOnMainSearch(W2009CmlCriteriaDomain)} を呼出し
     *     梱包指示、パレタイズ対象品ワーク、MIXED現品票、輸出受注、包装仕様を検索する
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2011ListDomain}に変換する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2011ListDomain> callServices(W2011CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2009CmlCriteriaDomain cmlCriteriaDomain = createCmlCriteriaDomain(criteriaDomain);
        
        // Palletize-Item eye
        // パレタイズ対象品目の検索
        List<? extends W2009CmlItemDomain> cmlItemList = searchCmlItem(cmlCriteriaDomain);
        
        // List domain
        // Listドメインの変換
        return convertToListDomain(cmlItemList);
        
    }

    /**
     * A search-condition domain is created.
     * <br />検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a CML Create screen<br />CML Create画面の検索条件ドメイン
     * @return CML The search-condition domain of CML service<br />サービスの検索条件ドメイン
     * @throws ApplicationException When the time zone of Shipper is unacquirable<br />Shipperのタイムゾーンが取得できない場合
     */
    protected W2009CmlCriteriaDomain createCmlCriteriaDomain(
        W2011CriteriaDomain criteriaDomain) throws ApplicationException {
        
        W2009CmlCriteriaDomain cmlCriteriaDomain = new W2009CmlCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        cmlCriteriaDomain.setScreenId(criteriaDomain.getScreenId());
        cmlCriteriaDomain.setLocale(criteriaDomain.getLocale());
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // The system date of Shipper is acquired (time is omission).  
        // Shipperのシステム日付を取得 (時刻は切り捨て)
        String timezoneId = commonService.searchTimezone(criteriaDomain.getShipperCd());
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        sysdate = DateUtils.truncate(sysdate, Calendar.DAY_OF_MONTH);
        cmlCriteriaDomain.setShipperTimezoneDt(sysdate);

        return cmlCriteriaDomain;
    }

    /**
     * A Palletize-Item eye is searched.
     * <br />パレタイズ対象品目を検索します。
     *
     * @param cmlCriteriaDomain CML search-condition domain<br />CML検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws GscmApplicationException When the number of search results is zero<br />検索結果が0件だった場合
     * @throws ApplicationException When there is an error by DB processing<br />DB処理でエラーがあった場合
     * @throws GscmApplicationException When a business error occurs during processing<br />処理中に業務的なエラーが発生した場合
     */
    protected List<? extends W2009CmlItemDomain> searchCmlItem(
        W2009CmlCriteriaDomain cmlCriteriaDomain) throws GscmApplicationException, ApplicationException {
        
        List<? extends W2009CmlItemDomain> resultList = null;
        resultList = w2009CmlService.searchForPagingOnCreateSearch(cmlCriteriaDomain);
        
        return resultList;
    }

    /**
     * Search results are changed into a List domain.
     * <br />検索結果をListドメインに変換します。
     *
     * @param cmlItemList Search results<br />検索結果
     * @return The List domain for screen display<br />画面表示用のListドメイン
     */
    protected List<? extends W2011ListDomain> convertToListDomain(
        List<? extends W2009CmlItemDomain> cmlItemList) {

        List<W2011ListDomain> listDomainList = new ArrayList<W2011ListDomain>();
        
        if (cmlItemList != null) {

            for (W2009CmlItemDomain itemDomain : cmlItemList) {
                // create of a List domain
                // Listドメインの作成
                W2011ListDomain listDomain = new W2011ListDomain();

                // Copy of properties.
                // プロパティのコピー

                // To speed up the processing, do not use CommonUtil#copyPropertiesDomainToDomain.
                // 処理速度を上げるために、CommonUtil#copyPropertiesDomainToDomain ではなく 
                // getter/setter を使ってプロパティ値の移送を行う。
                //CommonUtil.copyPropertiesDomainToDomain(listDomain, itemDomain);

                // Use getter/setter instead of it.
                listDomain.setPltzItemNo(itemDomain.getPltzItemNo());
                listDomain.setPkgCd(itemDomain.getPkgCd());
                listDomain.setItemDescription(itemDomain.getItemDescription());
                listDomain.setQty(decimalToString(itemDomain.getQty()));
                listDomain.setQtyUnit(itemDomain.getQtyUnit());
                listDomain.setTagQty(decimalToString(itemDomain.getTagQty()));
                listDomain.setItemWeight(decimalToString(itemDomain.getItemWeight()));
                listDomain.setWeightUnit(itemDomain.getWeightUnit());
                listDomain.setShippingLot(decimalToString(itemDomain.getShippingLot()));
                listDomain.setExpLimitTyp(itemDomain.getExpLimitTyp());
                listDomain.setDngrItemFlg(itemDomain.getDngrItemFlg());
                listDomain.setOriginCntryCd(itemDomain.getOriginCntryCd());
                listDomain.setCurrCd(itemDomain.getCurrCd());
                listDomain.setPlntCd(itemDomain.getPlntCd());
                listDomain.setMixTagNo(itemDomain.getMixTagNo());
                listDomain.setPkgFormTyp(itemDomain.getPkgFormTyp());
                listDomain.setInvoiceKey(itemDomain.getInvoiceKey());
                listDomain.setContainerSortingKey(itemDomain.getContainerSortingKey());
                listDomain.setContainerLooseTyp(itemDomain.getContainerLooseTyp());
                listDomain.setStgInstrItemFlg(itemDomain.getStgInstrItemFlg());
                listDomain.setLoadingCd(itemDomain.getLoadingCd());
                listDomain.setCustomTimingTyp(itemDomain.getCustomTimingTyp());
                listDomain.setCoFlg(itemDomain.getCoFlg());
                listDomain.setOrderQty(decimalToString(itemDomain.getOrderQty()));
                listDomain.setOnHandQty(decimalToString(itemDomain.getOnHandQty()));
                listDomain.setInstrPkgedQty(decimalToString(itemDomain.getInstrPkgedQty()));
                listDomain.setBoQty(decimalToString(itemDomain.getBoQty()));
                listDomain.setInstrQty(decimalToString(itemDomain.getInstrQty()));
                listDomain.setPkgFormTypHidden(itemDomain.getPkgFormTypHidden());
                listDomain.setMixTagFlg(itemDomain.getMixTagFlg());
                listDomain.setDisableFlg(itemDomain.getDisableFlg());
                listDomain.setLgcyUnitCd(itemDomain.getLgcyUnitCd());
                listDomain.setOnHandTotalQty(decimalToString(itemDomain.getOnHandTotalQty()));
// If you need to copy the following items, please enable comment lines.
// AbstractDomain の項目です、コピーする必要がある項目があればコメントアウトを外してください。
//              listDomain.setCharCd(itemDomain.getCharCd());
//              listDomain.setCheckValidateWarning(itemDomain.isCheckValidateWarning());
//              listDomain.setComCreateFuncId(itemDomain.getComCreateFuncId());
//              listDomain.setComCreateTimestamp(itemDomain.getComCreateTimestamp());
//              listDomain.setComCreateUserId(itemDomain.getComCreateUserId());
//              listDomain.setComUpdateFuncId(itemDomain.getComUpdateFuncId());
//              listDomain.setComUpdateTimestamp(itemDomain.getComUpdateTimestamp());
//              listDomain.setComUpdateUserId(itemDomain.getComUpdateUserId());
//              listDomain.setDateFormat(itemDomain.getDateFormat());
//              listDomain.setLanguageCd(itemDomain.getLanguageCd());
//              listDomain.setLocale(itemDomain.getLocale());
//              listDomain.setLoginUserDscId(itemDomain.getLoginUserDscId());
//              listDomain.setOwnerCompCd(itemDomain.getOwnerCompCd());
//              listDomain.setRowNumFrom(itemDomain.getRowNumFrom());
//              listDomain.setRowNumTo(itemDomain.getRowNumTo());
//              listDomain.setScreenId(itemDomain.getScreenId());
//              listDomain.setSearchCountCheckFlg(itemDomain.isSearchCountCheckFlg());
//              listDomain.setSelected(itemDomain.getSelected());
//              listDomain.setTimeZone(itemDomain.getTimeZone());

                // Setting of a check box
                // チェックボックスの設定
                if (FLAG_Y.equals(listDomain.getDisableFlg())) {
                    listDomain.setSelected(CHECK_ON);
                } else {
                    listDomain.setSelected(CHECK_OFF);
                }
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
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
