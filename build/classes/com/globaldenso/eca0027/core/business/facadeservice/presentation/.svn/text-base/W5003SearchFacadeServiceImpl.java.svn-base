/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5003;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;
import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5003ListDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * The Search service facade implementation class of Shipping Confirmation Create screen
 * <br />出荷確認Create画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w5003SearchFacadeService
 * </pre>
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 7998 $
 */
public class W5003SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<W5003ListDomain>, W5003CriteriaDomain> {

    /**
     * common service.
     */
    protected CommonService commonService;
    
    /**
     * shipping confirm service.
     */
    protected W5001ShippingFirmService w5001ShippingFirmService;

    /**
     * constructor.
     */
    public W5003SearchFacadeServiceImpl() {
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
     * Setter method for w5001ShippingFirmService.
     *
     * @param w5001ShippingFirmService Set for w5001ShippingFirmService
     */
    public void setW5001ShippingFirmService(W5001ShippingFirmService w5001ShippingFirmService) {
        this.w5001ShippingFirmService = w5001ShippingFirmService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W5003CriteriaDomain filterDomain(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        Validator<W5003CriteriaDomain> valid 
            = new Validator<W5003CriteriaDomain>(criteriaDomain, "w5003CriteriaDomain");
        
        // Set the label name still need to be examined.
        // チェックが必要なラベル名を設定する。
        String[] properties = {
            "stgInstrNo",
            "stgActNo",
            "fmEtd",
            "toEtd",
            "carrierCompCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W5003);
        
        // Confirmation of error.
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - The transfer your search criteria in W5001StgCriteriaDomain stgCriteriaDomain than criteriaDomain
     * - Correlation check of To - From date
     *     An argument stgCriteriaDomain, check by calling W5001ShippingFirmService.validateConsistencyFmEtdToEtd
     *
     * - criteriaDomainよりW5001StgCriteriaDomain stgCriteriaDomainに検索条件を移送
     * - 日付 From - To の相関チェック
     *    stgCriteriaDomainを引数に、W5001ShippingFirmService.validateConsistencyFmEtdToEtdを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // Get depart date.
        // 出発予定日を取得
        String fmEtd = criteriaDomain.getFmEtd();
        String toEtd = criteriaDomain.getToEtd();
        
        // Get the date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correlation check of depart date.
        // 出発予定日の相関チェック
        if (!w5001ShippingFirmService.validateConsistencyFmEtdToEtd(fmEtd, toEtd, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.fmEtd")
            };
            MessageDomain msgFmEtd = new MessageDomain("w5003CriteriaDomain.fmEtd", GSCM_E0_0031,
                params);
            MessageDomain msgToEtd = new MessageDomain("w5003CriteriaDomain.toEtd", null, null);
            
            errList.add(msgFmEtd);
            errList.add(msgToEtd);
        }
        
        // Confirmation of error.
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search the Staging Instruction or Staging Actuality of interest in the Shipping Confirmation.
     * <br />出荷確認の対象とする荷揃え指示、山作り実績を検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in ShippingFirmCriteriaDomain shippingFirmCriteriaDomain than criteriaDomain 
     * - Get the number of searches 
     *     The call of W5001ShippingFirmService.searchCountOnMainSearch an argument shippingFirmCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to shippingFirmCriteriaDomain 
     * - The one page get a search result of shipping confirmation 
     *     The call of W5001ShippingFirmService.searchForPagingOnMainSearch an argument shippingFirmCriteriaDomain 
     * - Create a list of lists domain W5003ListDomain search result, return 
     *     - Convert list of W5003ListDomain result of a call W5001ShippingFirmService.searchForPagingOnMainSearch 
     *     - The return a list of W5003ListDomain
     *
     * - criteriaDomainよりW5001StgCriteriaDomain stgCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       stgCriteriaDomainを引数にW5001ShippingFirmService.searchCountOnCreateSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをstgCriteriaDomainに設定
     * - 出荷確認の検索結果を1ページ分取得
     *       stgCriteriaDomainを引数にW5001ShippingFirmService.searchForPagingOnCreateSearchの呼び出し
     * - 検索結果リストドメインW5003ListDomainのリストを作成し、返却
     *       - W5001ShippingFirmService.searchForPagingOnCreateSearchの呼び出し結果をW5003ListDomainのリストに変換
     *       - W5003ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W5003ListDomain> callServices(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Create a search condition domain.
        // 検索条件ドメインの作成
        W5001StgCriteriaDomain stgCriteria = createShippingFirmCriteria(criteriaDomain);
        
        // Get the count of searches.
        // 検索件数の取得
        int count = searchShippingFirmCount(stgCriteria);
        
        // Set the search range.
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, stgCriteria);
        
        // Search of shipping confirmation.
        // 出荷確認の検索
        List<? extends W5001StgDomain> stgList = searchShippingFirm(stgCriteria);
        
        // Conversion to list domain.
        // リストドメインへの変換
        return convertToListDomain(stgList, criteriaDomain.getScreenDateFormat(), 
            criteriaDomain.getWeightUnit(), criteriaDomain.getVolumeUnit(),
            criteriaDomain.getLocale());
    }
    
    /**
     * Create the search criteria domain of shipping confirmation service
     * <br />出荷確認サービスの検索条件ドメインを作成します。
     * <pre> 
     * - Create a search condition domain W5001StgCriteriaDomain, return
     *
     * - 検索条件ドメインW5001StgCriteriaDomainを作成し、返却
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return W5001ShippingFirmCriteriaDomain
     */
    protected W5001StgCriteriaDomain createShippingFirmCriteria(
        W5003CriteriaDomain criteriaDomain) {
        W5001StgCriteriaDomain stgCriteria = new W5001StgCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(stgCriteria, criteriaDomain, 
            criteriaDomain.getScreenDateFormat());
        
        return stgCriteria;
    }

    /**
     * Get the number of searches.
     * <br />検索件数を取得する。
     * <pre> 
     * - Get the number of searches in the argument W5001StgCriteriaDomain.
     *
     * - W5001StgCriteriaDomainを引数に検索件数を取得する。
     * </pre>
     *
     * @param stgCriteria staging criteria
     * @return Search count
     * @throws ApplicationException ApplicationException
     */
    protected int searchShippingFirmCount(W5001StgCriteriaDomain stgCriteria) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchCountForPagingOnCreateSearch(stgCriteria);
    }

    /**
     * Set the search scope.
     * <br />検索範囲を設定する。
     * <pre> 
     * - Set the search scope to stgCriteria.
     *
     * - stgCriteriaに検索範囲を設定する。
     * </pre>
     *
     * @param pageInfoCreator page info creator
     * @param count count
     * @param stgCriteria staging criteria
     * @throws ApplicationException ApplicationException
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, 
        W5001StgCriteriaDomain stgCriteria) 
        throws ApplicationException {
        
        // Get information page.
        // ページ情報の取得
        
        // アプリ基盤レビュー結果報告書(拠点間物流_プログラミング).xlsのNo.82の指摘↓ 
        // ビジネス層からプレゼンテーション層を呼び出す特殊な処理のため、
        // GSCMフレームワーク本体には修正依頼を出しています。
        // 今後、拠点間でもFWの置き換えなどの際に修正が入る可能性が高いと思われます
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, 
            stgCriteria.getLocale());
        
        // Set the start and end position in the search condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        stgCriteria.setRowNumFrom(pageInfoData.getFromCount());
        stgCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search the shipping confirmation.
     * <br />出荷確認を検索する。
     * <pre> 
     * - Search the shipping confirmation to the argument stgCriteria.
     *
     * - stgCriteriaを引数に出荷確認を検索する。
     * </pre>
     *
     * @param stgCriteria staging criteria
     * @throws ApplicationException ApplicationException
     * @return List of W5001StgDomain
     */
    protected List<? extends W5001StgDomain> searchShippingFirm(W5001StgCriteriaDomain stgCriteria) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchForPagingOnCreateSearch(stgCriteria);
    }

    /**
     * Convert to the format of the screen for display Staging Instruction / Staging Actuality domain.
     * <br />荷揃え指示/山作り実績ドメインを画面表示用のフォーマットに変換する。
     * <pre> 
     * - Convert to screen for display W5003ListDomain.
     *
     * - W5003ListDomainを画面表示用に変換する。
     * </pre>
     *
     * @param stgList Staging list
     * @param dateFormat Format for a date
     * @param weightUnit weight unit
     * @param volumeUnit volume unit
     * @param locale locale
     * @throws ApplicationException ApplicationException
     * @return List of W5003ListDomain
     */
    protected List<W5003ListDomain> convertToListDomain(List<? extends W5001StgDomain> stgList, 
        String dateFormat, String weightUnit, String volumeUnit, Locale locale) 
        throws ApplicationException {
        List<W5003ListDomain> listDomainList = new ArrayList<W5003ListDomain>();
        
        if (stgList != null) {
            for (W5001StgDomain stgDomain : stgList) {
                W5003ListDomain listDomain = new W5003ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(listDomain, stgDomain);
                
                // Format conversion of the shipment due date
                // 出荷予定日のフォーマット変換
                String etd = DateUtil.formatDate(stgDomain.getEtd(), dateFormat);
                listDomain.setEtd(etd);

                // Unit conversion of gross weight
                // グロス重量の単位変換
                BigDecimal grossWeight = stgDomain.getGrossWeight();
                if (!weightUnit.equals(stgDomain.getWeightUnit())) {
                    grossWeight = commonService.convertWeightUnit(
                        grossWeight, stgDomain.getWeightUnit(), weightUnit);
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (grossWeight == null) {
                        Object[] params = {commonService.getResource(locale, "label.totalGrossWeight")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                }
                listDomain.setGrossWeight(NumberUtil.format(grossWeight, FORMAT_WEIGHT));
                
                // Unit conversion of volume
                // 容積の単位変換
                BigDecimal volume = stgDomain.getVolume();
                if (!volumeUnit.equals(stgDomain.getVolumeUnit())) {
                    volume = commonService.convertVolumeUnit(
                        volume, stgDomain.getVolumeUnit(), volumeUnit);
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (volume == null) {
                        Object[] params = {commonService.getResource(locale, "label.totalVol")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                }                
                listDomain.setVolume(NumberUtil.format(volume, FORMAT_VOLUME));
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
    
}
