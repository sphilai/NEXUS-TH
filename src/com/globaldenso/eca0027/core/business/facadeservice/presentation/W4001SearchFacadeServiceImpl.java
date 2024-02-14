/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4001;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;
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
 * The Search service facade implementation class of Staging Instruction Main screen
 * <br />荷揃え指示Main画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w4001SearchFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4001SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W4001ListDomain>, W4001CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * Constructor.
     */
    public W4001SearchFacadeServiceImpl() {
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
    protected W4001CriteriaDomain filterDomain(W4001CriteriaDomain w4001CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4001CriteriaDomain;
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
    protected void validateItems(W4001CriteriaDomain w4001CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4001CriteriaDomain> valid
            = new Validator<W4001CriteriaDomain>(w4001CriteriaDomain, "w4001CriteriaDomain");

        String[] properties = {
            "whCompCd",             // 3 or 5 digit + required
            "whCd",                 // required
            "containerSortingKey",  // like search
            "shipperCd",            // 3 or 5 digit
            "stgInstrNo",           // like search
            "stgInstrDtFrom",       // date
            "stgInstrDtTo",         // date
            "expRequestNo",         // like search
            "mainMark",             // like search
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4001);

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
     *     Argument FM) Issue Date of w4001CriteriaDomain, the TO) Issue Date, Check by calling W4001StgInstrService.validateConsistencyFmInstrDateToInstrDate
     *
     * - 日付 From - To の相関チェック
     *    w4001CriteriaDomainのFM) Issue Date、TO) Issue Dateを引数に、W4001StgInstrService.validateConsistencyFmInstrDateToInstrDateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4001CriteriaDomain w4001CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If the relationship of staging instruction date from-to is not correct
        // 荷揃え指示日from-toの関係が正しくない場合
        if (
            !w4001StgInstrService.validateConsistencyFmInstrDateToInstrDate(w4001CriteriaDomain.getStgInstrDtFrom(),
                w4001CriteriaDomain.getStgInstrDtTo(), w4001CriteriaDomain.getScreenDateFormat())
        )
        {
            Object[] params = {
                commonService.getResource(w4001CriteriaDomain.getLocale(), "label.stgInstrDt")
            };
            messageDomainList.add(new MessageDomain("w4001CriteriaDomain.stgInstrDtFrom", GSCM_E0_0031, params));
            messageDomainList.add(new MessageDomain("w4001CriteriaDomain.stgInstrDtTo", null, null));
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
    protected void validateDatabase(W4001CriteriaDomain w4001CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for Staging Instruction
     * <br />荷揃え指示を検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4001StgInstrCriteriaDomain stgInstrCriteriaDomain than w4001CriteriaDomain 
     * - Get the number of searches 
     *     The call of W4001StgInstrService.searchCountForPagingOnMainSearch an argument stgInstrCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to stgInstrCriteriaDomain 
     * - The one page get a search result of Staging Instruction 
     *     The call of W4001StgInstrService.searchForPagingOnMainSearch an argument stgInstrCriteriaDomain 
     * - Create a list of lists domain W4001ListDomain search result, return 
     *     - Convert list of W4001ListDomain result of a call W4001StgInstrService.searchForPagingOnMainSearch 
     *     - The return a list of W4001ListDomain
     *
     * - w4001CriteriaDomainよりW4001StgInstrCriteriaDomain stgInstrCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       stgInstrCriteriaDomainを引数にW4001StgInstrService.searchCountForPagingOnMainSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをstgInstrCriteriaDomainに設定
     * - 荷揃え指示の検索結果を1ページ分取得
     *       stgInstrCriteriaDomainを引数にW4001StgInstrService.searchForPagingOnMainSearchの呼び出し
     * - 検索結果リストドメインW4001ListDomainのリストを作成し、返却
     *       - W4001StgInstrService.searchForPagingOnMainSearchの呼び出し結果をW4001ListDomainのリストに変換
     *       - W4001ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W4001ListDomain> callServices(W4001CriteriaDomain w4001CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain = new W4001StgInstrCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrCriteriaDomain,
            w4001CriteriaDomain, w4001CriteriaDomain.getScreenDateFormat());

        // Get search count of staging instructions
        // 荷揃え指示検索件数の取得

        // Call service get search count
        // 検索件数取得サービス呼び出し
        int searchCount = w4001StgInstrService.searchCountForPagingOnMainSearch(stgInstrCriteriaDomain);

        // Search staging instructions
        // 荷揃え指示の検索

        // Add set the search range corresponding to the requested page
        // 要求ページに対応する検索範囲を追加設定
        PageInfoData pageInfoData = w4001CriteriaDomain.getPageInfoCreator()
            .createPageInfoData(searchCount, null, null, w4001CriteriaDomain.getLocale());
        stgInstrCriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        stgInstrCriteriaDomain.setRowNumTo(pageInfoData.getToCount());

        // Call search service
        // 検索サービス呼び出し
        List<? extends W4001StgInstrDomain> resultStgInstrDomainList
            = w4001StgInstrService.searchForPagingOnMainSearch(stgInstrCriteriaDomain);

        // Conversion of the search results
        // 検索結果の変換

        List<W4001ListDomain> w4001ListDomainList = new ArrayList<W4001ListDomain>();
        for (W4001StgInstrDomain resultStgInstrDomain : resultStgInstrDomainList) {
            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4001ListDomain w4001ListDomain = new W4001ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4001ListDomain,
                resultStgInstrDomain, w4001CriteriaDomain.getScreenDateFormat());
            w4001ListDomainList.add(w4001ListDomain);
        }

        return w4001ListDomainList;
    }
}
