/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9011;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011CgmCusNoXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9011ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of CIGMA Customer No. X-Reference MA Inquiry
 * Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9011ListDomain>, W9011CriteriaDomain>{

    /**
     * w9011CgmCusNoXRefMaService/cgmCusNoXRefMaサービス
     */
    protected W9011CgmCusNoXRefMaService w9011CgmCusNoXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9011CgmCusNoXRefMaService.
     *
     * @param cgmCusNoXRefMaService Set for w9011CgmCusNoXRefMaService
     */
    public void setW9011CgmCusNoXRefMaService(W9011CgmCusNoXRefMaService cgmCusNoXRefMaService) {
        w9011CgmCusNoXRefMaService = cgmCusNoXRefMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9011CriteriaDomain filterDomain(W9011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check.
     * - 共通エラーチェックをする。
     * 
     * - Check out the single item.
     * - Check the error.
     * 
     * - 単項目チェックをする。
     * - エラーを確認する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9011CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9011CriteriaDomain> valid 
            = new Validator<W9011CriteriaDomain>(criteriaDomain, "w9011CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "customerCd", 
            "consigneeCd"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9011);

        // Check the error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create a search condition domain.
     *     Set the following {@link W9011CgmCusNoXRefMaCriteriaDomain}.
     *     Screen ID, locale(To get the maximum number)
     *     Conditions input from the screen
     * 
     * - Get the number of searches.
     *     with the arg of the {@link W9011CgmCusNoXRefMaCriteriaDomain}, 
     *     to call the {@link W9011CgmCusNoXRefMaService#searchCount(W9011CgmCusNoXRefMaCriteriaDomain)}.
     * 
     * - Calculate the search range corresponding to the requested page.
     *     Calculate the search start and end position on the basis of the number 
     *     of search queries, per page. 
     *     Set to {@ link W9011CgmCusNoXRefMaCriteriaDomain} calculation results.
     * 
     * - Search process.
     *     with the arg of the {@link W9011CgmCusNoXRefMaCriteriaDomain}, 
     *     to call the {@link W9011CgmCusNoXRefMaService#searchByConditionForPaging
     *     (W9011CgmCusNoXRefMaCriteriaDomain)}.
     * 
     * - Create a list domain.
     *     Convert to {@link W9011ListDomain} a {@link W9011CgmCusNoXRefMaDomain}. 
     * 
     * - 検索条件ドメインを作成
     *     {@link W9011CgmCusNoXRefMaCriteriaDomain}に下記を設定する。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9011CgmCusNoXRefMaCriteriaDomain}を引数に
     *     {@link W9011CgmCusNoXRefMaService#searchCount(W9011CgmCusNoXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する。
     *     計算結果を{@link W9011CgmCusNoXRefMaCriteriaDomain}に設定する。
     * 
     * - 検索処理
     *     {@link W9011CgmCusNoXRefMaCriteriaDomain}を引数に
     *     {@link W9011CgmCusNoXRefMaService#searchByConditionForPaging
     *     (W9011CgmCusNoXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - リストドメインの作成
     *     {@link CgmCusNoXRefMaDomain}を{@link W9011ListDomain}に変換する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9011ListDomain> callServices(W9011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create a search condition domain.
        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
            = createCgmCusNoXRefMaCriteria(criteriaDomain);

        // Get the number of searches.
        int count = searchCgmCusNoXRefMaCount(cgmCusNoXRefMaCriteria);

        // Set the search range
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, cgmCusNoXRefMaCriteria);

        // Search process.
        List<? extends W9011CgmCusNoXRefMaDomain> cgmCusNoXRefMaList 
            = searchCgmCusNoXRefMa(cgmCusNoXRefMaCriteria);

        // Create a list domain.
        return convertToListDomain(cgmCusNoXRefMaList);

    }

    /**
     * Based on the search criteria domain(PL), create a domain search criteria(BL). 
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成する。
     *
     * - Set the following in order to get the maximum number.
     *      - Screen ID, locale
     * - Copy the search criteria.
     * 
     * -最大件数を取得するために以下を設定する。
     *      - 画面ID, ロケール
     * - 検索条件をコピーする。
     * 
     * @param criteriaDomain 画面の検索条件ドメイン(PL)
     * @return w9011CgmCusNoXRefMaサービスの検索条件ドメイン(BL)
     */
    protected W9011CgmCusNoXRefMaCriteriaDomain createCgmCusNoXRefMaCriteria
    (W9011CriteriaDomain criteriaDomain) {

        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
            = new W9011CgmCusNoXRefMaCriteriaDomain();

        // Configuring settings for obtaining the maximum number.
        cgmCusNoXRefMaCriteria.setScreenId(criteriaDomain.getScreenId());
        cgmCusNoXRefMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(cgmCusNoXRefMaCriteria, criteriaDomain);

        return cgmCusNoXRefMaCriteria;
    }

    /**
     * Get the number of searches.
     * 検索件数を取得する。
     * 
     * - Get the number of searches 
     *     The call of w9011CgmCusNoXRefMaService.searchCount an argument 
     *     cgmCusNoXRefMaCriteria 
     * 
     * - 検索件数の取得
     *       cgmCusNoXRefMaCriteriaを引数に
     *       w9011CgmCusNoXRefMaService.searchByConditionForPagingの呼び出し
     * 
     * @param cgmCusNoXRefMaCriteria w9011CgmCusNoXRefMaサービスの検索条件ドメイン
     * @return 検索件数
     * @throws ApplicationException 件数が取得できない場合
     */
    protected int searchCgmCusNoXRefMaCount(W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria) 
        throws ApplicationException {

        return w9011CgmCusNoXRefMaService.searchCount(cgmCusNoXRefMaCriteria);
    }

    /**
     * To calculate the search range.
     * 検索範囲を算出する。
     * 
     * - Get information page.
     * - Set the start and end position in the search condition domain.
     * 
     * - ページ情報を取得する。
     * - 検索条件ドメインに開始・終了位置を設定する。
     *
     * @param pageInfoCreator PageInfoCreatorオブジェクト
     * @param count 検索件数
     * @param cgmCusNoXRefMaCriteria 梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, 
        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria) 
        throws ApplicationException {

        // Get information page.
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, 
            null, null, cgmCusNoXRefMaCriteria.getLocale());

        // Set the start and end position in the search condition domain.
        cgmCusNoXRefMaCriteria.setRowNumFrom(pageInfoData.getFromCount());
        cgmCusNoXRefMaCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search process.
     * 検索処理。
     * 
     * - Get the result of searches 
     *     The call of w9011CgmCusNoXRefMaService.searchByConditionForPaging an argument 
     *     cgmCusNoXRefMaCriteria 
     * 
     * - 検索結果の取得
     *       cgmCusNoXRefMaCriteriaを引数に
     *       w9011CgmCusNoXRefMaService.searchByConditionForPagingの呼び出し
     * 
     * @param cgmCusNoXRefMaCriteria w9011CgmCusNoXRefMaサービスの検索条件ドメイン
     * @return 検索結果
     * @throws ApplicationException 検索できない場合
     */
    protected List<? extends W9011CgmCusNoXRefMaDomain> searchCgmCusNoXRefMa
    (W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria) 
        throws ApplicationException {

        return w9011CgmCusNoXRefMaService.searchByConditionForPaging(cgmCusNoXRefMaCriteria);
    }

    /**
     * Convert to list domain a cgmCusNoXRefMa domain.
     * cgmCusNoXRefMaドメインをリストドメインに変換する。
     *
     * - Copy property.
     * - return a list of domain W9011ListDomain.
     * 
     * - プロパティをコピーする。
     * - W9011ListDomainのリストドメインを返却
     * 
     * @param cgmCusNoXRefMaList cgmCusNoXRefMaドメインのリスト
     * @return 変換結果
     */
    protected List<W9011ListDomain> convertToListDomain(List<? extends W9011CgmCusNoXRefMaDomain> cgmCusNoXRefMaList) {
        List<W9011ListDomain> listDomainList = new ArrayList<W9011ListDomain>();

        if (cgmCusNoXRefMaList != null) {
            for (W9011CgmCusNoXRefMaDomain cgmCusNoXRefMa : cgmCusNoXRefMaList) {
                W9011ListDomain listDomain = new W9011ListDomain();

                // Copy property.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, cgmCusNoXRefMa);
                
                listDomainList.add(listDomain);

            }
        }

        return listDomainList;
    }
}
