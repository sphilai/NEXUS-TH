/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4005;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Search service facade implementation class of Staging Actuality Main screen
 * <br />山作り実績Main画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w4005SearchFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4005SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W4005ListDomain>, W4005CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * Constructor.
     */
    public W4005SearchFacadeServiceImpl() {
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
     * Setter method for w4005StgActService.
     *
     * @param stgActService Set for w4005StgActService
     */
    public void setW4005StgActService(W4005StgActService stgActService) {
        w4005StgActService = stgActService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4005CriteriaDomain filterDomain(W4005CriteriaDomain w4005CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4005CriteriaDomain;
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
    protected void validateItems(W4005CriteriaDomain w4005CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4005CriteriaDomain> valid
            = new Validator<W4005CriteriaDomain>(w4005CriteriaDomain, "w4005CriteriaDomain");

        String[] properties = {
            "whCompCd",             // 3 or 5 digit + required
            "whCd",                 // required
            "containerSortingKey",  // like search
            "stgActNo",             // like search
            "stgInstrNo",           // like search
            "stgActDtFrom",         // date
            "stgActDtTo",           // date
            "shipperCd",            // 3 or 5 digit
            "xmainMark",            // like search
            "mainMark",             // like search
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4005);

        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Correlation check of To - From date
     *     Argument FM) Issue Date of w4005CriteriaDomain, the TO) Issue Date, Check by calling W4005StgActService.validateConsistencyFmInstrDateToInstrDate
     *
     * - 日付 From - To の相関チェック
     *    w4005CriteriaDomainのFM) Issue Date、TO) Issue Dateを引数に、W4005StgActService.validateConsistencyFmInstrDateToInstrDateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4005CriteriaDomain w4005CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If the relationship of staging actuality date from-to is not correct
        // 山作り実績日from-toの関係が正しくない場合
        if (
            !w4005StgActService.validateConsistencyFmInstrDateToInstrDate(w4005CriteriaDomain.getStgActDtFrom(),
                w4005CriteriaDomain.getStgActDtTo(), w4005CriteriaDomain.getScreenDateFormat())
        )
        {
            Object[] params = {
                commonService.getResource(w4005CriteriaDomain.getLocale(), "label.stgActDt")
            };
            messageDomainList.add(new MessageDomain("w4005CriteriaDomain.stgActDtFrom", GSCM_E0_0031, params));
            messageDomainList.add(new MessageDomain("w4005CriteriaDomain.stgActDtTo", null, null));
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4005CriteriaDomain w4005CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for Staging Actuality
     * <br />山作り実績を検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4005StgActCriteriaDomain stgActCriteriaDomain than w4005CriteriaDomain 
     * - Get the number of searches 
     *     The call of W4005StgActService.searchCountForPagingOnMainSearch an argument stgActCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to stgActCriteriaDomain 
     * - The one page get a search result of Staging Actuality 
     *     The call of W4005StgActService.searchForPagingOnMainSearch an argument stgActCriteriaDomain 
     * - Create a list of lists domain W4005ListDomain search result, return 
     *     - Convert list of W4005ListDomain result of a call W4005StgActService.searchForPagingOnMainSearch 
     *     - The return a list of W4005ListDomain
     *
     * - w4005CriteriaDomainよりW4005StgActCriteriaDomain stgActCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       stgActCriteriaDomainを引数にW4005StgActService.searchCountForPagingOnMainSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをstgActCriteriaDomainに設定
     * - 山作り実績の検索結果を1ページ分取得
     *       stgActCriteriaDomainを引数にW4005StgActService.searchForPagingOnMainSearchの呼び出し
     * - 検索結果リストドメインW4005ListDomainのリストを作成し、返却
     *       - W4005StgActService.searchForPagingOnMainSearchの呼び出し結果をW4005ListDomainのリストに変換
     *       - W4005ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W4005ListDomain> callServices(W4005CriteriaDomain w4005CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActCriteriaDomain stgActCriteriaDomain = new W4005StgActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActCriteriaDomain,
            w4005CriteriaDomain, w4005CriteriaDomain.getScreenDateFormat());

        // Get search count of staging actualities
        // 山作り実績検索件数の取得

        // Call service get search count
        // 検索件数取得サービス呼び出し
        int searchCount = w4005StgActService.searchCountForPagingOnMainSearch(stgActCriteriaDomain);

        // Search staging actualities
        // 山作り実績の検索

        // Add set the search range corresponding to the requested page
        // 要求ページに対応する検索範囲を追加設定
        PageInfoData pageInfoData = w4005CriteriaDomain.getPageInfoCreator()
            .createPageInfoData(searchCount, null, null, w4005CriteriaDomain.getLocale());
        stgActCriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        stgActCriteriaDomain.setRowNumTo(pageInfoData.getToCount());

        // Call search service
        // 検索サービス呼び出し
        List<? extends W4005StgActDomain> resultStgActDomainList
            = w4005StgActService.searchForPagingOnMainSearch(stgActCriteriaDomain);

        // Conversion of the search results
        // 検索結果の変換

        List<W4005ListDomain> w4005ListDomainList = new ArrayList<W4005ListDomain>();
        for (W4005StgActDomain resultStgActDomain : resultStgActDomainList) {
            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4005ListDomain w4005ListDomain = new W4005ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4005ListDomain,
                resultStgActDomain, w4005CriteriaDomain.getScreenDateFormat());
            w4005ListDomainList.add(w4005ListDomain);
        }

        return w4005ListDomainList;
    }
}
