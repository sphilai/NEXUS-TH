/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4007;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4007ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
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
 * The Search service facade implementation class of Staging Actuality Create screen
 * <br />山作り実績Create画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w4007SearchFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4007SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W4007ListDomain>, W4007CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4007SearchFacadeServiceImpl() {
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
    protected W4007CriteriaDomain filterDomain(W4007CriteriaDomain w4007CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4007CriteriaDomain;
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
    protected void validateItems(W4007CriteriaDomain w4007CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4007CriteriaDomain> valid
            = new Validator<W4007CriteriaDomain>(w4007CriteriaDomain, "w4007CriteriaDomain");

        String[] properties = {
            "shipperCd",            // 3 or 5 digit
            "shipToCd",             // like search
            "stgInstrNo",           // like search
            "xmainMark",            // like search
            "mainMark",             // like search
            "lastTrRcvDtFrom",      // date
            "lastTrRcvDtTo",        // date
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4007);

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
     *     An argument FM) Carry in Date / TO) Carry in Date of w4007CriteriaDomain, check by calling W4005StgActService.validateConsistencyFmInstrDateToInstrDate
     *
     * - 日付 From - To の相関チェック
     *    w4007CriteriaDomainのFM) Carry in Date、TO) Carry in Dateを引数に、W4005StgActService.validateConsistencyFmInstrDateToInstrDateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4007CriteriaDomain w4007CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If the relationship of Carry in Date from-to is not correct
        // Carry in Date from-toの関係が正しくない場合
        if (
            !w4005StgActService.validateConsistencyFmInstrDateToInstrDate(w4007CriteriaDomain.getLastTrRcvDtFrom(),
                w4007CriteriaDomain.getLastTrRcvDtTo(), w4007CriteriaDomain.getScreenDateFormat())
        )
        {
            Object[] params = {
                commonService.getResource(w4007CriteriaDomain.getLocale(), "label.lastTrRcvDt")
            };
            messageDomainList.add(new MessageDomain("w4007CriteriaDomain.lastTrRcvDtFrom", GSCM_E0_0031, params));
            messageDomainList.add(new MessageDomain("w4007CriteriaDomain.lastTrRcvDtTo", null, null));
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
    protected void validateDatabase(W4007CriteriaDomain w4007CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search the Staging Actuality or Staging Actuality of interest in the Staging Actuality.
     * <br />山作り実績の対象とするパレタイズを検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in StgActCriteriaDomain stgActCriteriaDomain than w4007CriteriaDomain 
     * - Get the number of searches 
     *     The call of W4005StgActService.searchCountOnMainSearch an argument stgActCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to stgActCriteriaDomain 
     * - The one page get a search result of Staging Actuality 
     *     The call of W4005StgActService.searchForPagingOnMainSearch an argument stgActCriteriaDomain 
     * - Create a list of lists domain W4007ListDomain search result, return 
     *     - Convert list of W4007ListDomain result of a call W4005StgActService.searchForPagingOnMainSearch 
     *     - The return a list of W4007ListDomain
     *
     * - w4007CriteriaDomainよりW4005PltzCriteriaDomain pltzCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       pltzCriteriaDomainを引数にW4005StgActService.searchCountForPagingOnCreateSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをpltzCriteriaDomainに設定
     * - 山作り実績の検索結果を1ページ分取得
     *       pltzCriteriaDomainを引数にW4005StgActService.searchForPagingOnCreateSearchの呼び出し
     * - 検索結果リストドメインW4007ListDomainのリストを作成し、返却
     *       - W4005StgActService.searchForPagingOnCreateSearchの呼び出し結果をW4007ListDomainのリストに変換
     *       - W4007ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W4007ListDomain> callServices(W4007CriteriaDomain w4007CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005PltzCriteriaDomain pltzCriteriaDomain = new W4005PltzCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(pltzCriteriaDomain,
            w4007CriteriaDomain, w4007CriteriaDomain.getScreenDateFormat());

        // Get search count of staging actualities
        // 山作り実績検索件数の取得

        // Call service get search count
        // 検索件数取得サービス呼び出し
        int searchCount = w4005StgActService.searchCountForPagingOnCreateSearch(pltzCriteriaDomain);

        // Search staging actualities
        // 山作り実績の検索

        // Add set the search range corresponding to the requested page
        // 要求ページに対応する検索範囲を追加設定
        PageInfoData pageInfoData = w4007CriteriaDomain.getPageInfoCreator()
            .createPageInfoData(searchCount, null, null, w4007CriteriaDomain.getLocale());
        pltzCriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        pltzCriteriaDomain.setRowNumTo(pageInfoData.getToCount());

        // Call search service
        // 検索サービス呼び出し
        List<? extends W4005PltzDomain> resultPltzDomainList
            = w4005StgActService.searchForPagingOnCreateSearch(pltzCriteriaDomain);

        // Conversion of the search results
        // 検索結果の変換

        List<W4007ListDomain> w4007ListDomainList = new ArrayList<W4007ListDomain>();
        for (W4005PltzDomain resultPltzDomain : resultPltzDomainList) {

            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4007ListDomain w4007ListDomain = new W4007ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4007ListDomain,
                resultPltzDomain, w4007CriteriaDomain.getScreenDateFormat());

            // Work registered flag
            // ワーク登録済みフラグ
            if (FLAG_Y.equals(resultPltzDomain.getDisabledFlg())) {
                w4007ListDomain.setSelected(CHECK_ON);
            } else {
                w4007ListDomain.setSelected(CHECK_OFF);
            }

            w4007ListDomainList.add(w4007ListDomain);
        }

        return w4007ListDomainList;
    }
}
