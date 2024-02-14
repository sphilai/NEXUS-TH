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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4003;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4003ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Search service facade implementation class of Staging Instruction Create screen
 * <br />荷揃え指示Create画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w4003SearchFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4003SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W4003ListDomain>, W4003CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4003SearchFacadeServiceImpl() {
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
     * Setter method for w4001StgInstrService.
     *
     * @param stgInstrService Set for w4001StgInstrService
     */
    public void setW4001StgInstrService(W4001StgInstrService stgInstrService) {
        w4001StgInstrService = stgInstrService;
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
    protected W4003CriteriaDomain filterDomain(W4003CriteriaDomain w4003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4003CriteriaDomain;
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
    protected void validateItems(W4003CriteriaDomain w4003CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4003CriteriaDomain> valid
            = new Validator<W4003CriteriaDomain>(w4003CriteriaDomain, "w4003CriteriaDomain");

        String[] properties = {
            "shipToCd",             // like search
            "mainMark",             // like search
            "expRequestNo",         // like search
            "lastTrRcvDtFrom",      // date
            "lastTrRcvDtTo",        // date
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4003);

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
     *     An argument FM) Carry in Date / TO) Carry in Date of w4003CriteriaDomain, check by calling W4001StgInstrService.validateConsistencyFmInstrDateToInstrDate
     *
     * - 日付 From - To の相関チェック
     *    w4003CriteriaDomainのFM) Carry in Date、TO) Carry in Dateを引数に、W4001StgInstrService.validateConsistencyFmInstrDateToInstrDateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4003CriteriaDomain w4003CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If the relationship of Carry in Date from-to is not correct
        // Carry in Date from-toの関係が正しくない場合
        if (
            !w4001StgInstrService.validateConsistencyFmInstrDateToInstrDate(w4003CriteriaDomain.getLastTrRcvDtFrom(),
                w4003CriteriaDomain.getLastTrRcvDtTo(), w4003CriteriaDomain.getScreenDateFormat())
        )
        {
            Object[] params = {
                commonService.getResource(w4003CriteriaDomain.getLocale(), "label.lastTrRcvDt")
            };
            messageDomainList.add(new MessageDomain("w4003CriteriaDomain.lastTrRcvDtFrom", GSCM_E0_0031, params));
            messageDomainList.add(new MessageDomain("w4003CriteriaDomain.lastTrRcvDtTo", null, null));
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
    protected void validateDatabase(W4003CriteriaDomain w4003CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search the Staging Instruction or Staging Actuality of interest in the Staging Instruction.
     * <br />荷揃え指示の対象とするパレタイズを検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in StgInstrCriteriaDomain stgInstrCriteriaDomain than w4003CriteriaDomain 
     * - Get the number of searches 
     *     The call of W4001StgInstrService.searchCountOnMainSearch an argument stgInstrCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to stgInstrCriteriaDomain 
     * - The one page get a search result of Staging Instruction 
     *     The call of W4001StgInstrService.searchForPagingOnMainSearch an argument stgInstrCriteriaDomain 
     * - Create a list of lists domain W4003ListDomain search result, return 
     *     - Convert list of W4003ListDomain result of a call W4001StgInstrService.searchForPagingOnMainSearch 
     *     - The return a list of W4003ListDomain
     *
     * - w4003CriteriaDomainよりW4001PltzCriteriaDomain pltzCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       pltzCriteriaDomainを引数にW4001StgInstrService.searchCountForPagingOnCreateSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをpltzCriteriaDomainに設定
     * - 荷揃え指示の検索結果を1ページ分取得
     *       pltzCriteriaDomainを引数にW4001StgInstrService.searchForPagingOnCreateSearchの呼び出し
     * - 検索結果リストドメインW4003ListDomainのリストを作成し、返却
     *       - W4001StgInstrService.searchForPagingOnCreateSearchの呼び出し結果をW4003ListDomainのリストに変換
     *       - W4003ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W4003ListDomain> callServices(W4003CriteriaDomain w4003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001PltzCriteriaDomain pltzCriteriaDomain = new W4001PltzCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(pltzCriteriaDomain,
            w4003CriteriaDomain, w4003CriteriaDomain.getScreenDateFormat());

        // Get search count of staging instructions
        // 荷揃え指示検索件数の取得

        // Call service get search count
        // 検索件数取得サービス呼び出し
        int searchCount = w4001StgInstrService.searchCountForPagingOnCreateSearch(pltzCriteriaDomain);

        // Search staging instructions
        // 荷揃え指示の検索

        // Add set the search range corresponding to the requested page
        // 要求ページに対応する検索範囲を追加設定
        PageInfoData pageInfoData = w4003CriteriaDomain.getPageInfoCreator()
            .createPageInfoData(searchCount, null, null, w4003CriteriaDomain.getLocale());
        pltzCriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        pltzCriteriaDomain.setRowNumTo(pageInfoData.getToCount());

        // Call search service
        // 検索サービス呼び出し
        List<? extends W4001PltzDomain> resultPltzDomainList
            = w4001StgInstrService.searchForPagingOnCreateSearch(pltzCriteriaDomain);

        // Conversion of the search results
        // 検索結果の変換

        List<W4003ListDomain> w4003ListDomainList = new ArrayList<W4003ListDomain>();
        for (W4001PltzDomain resultPltzDomain : resultPltzDomainList) {

            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4003ListDomain w4003ListDomain = new W4003ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4003ListDomain,
                resultPltzDomain, w4003CriteriaDomain.getScreenDateFormat());

            // Work registered flag
            // ワーク登録済みフラグ
            if (FLAG_Y.equals(resultPltzDomain.getDisabledFlg())) {
                w4003ListDomain.setSelected(CHECK_ON);
            } else {
                w4003ListDomain.setSelected(CHECK_OFF);
            }

            w4003ListDomainList.add(w4003ListDomain);
        }

        return w4003ListDomainList;
    }
}
