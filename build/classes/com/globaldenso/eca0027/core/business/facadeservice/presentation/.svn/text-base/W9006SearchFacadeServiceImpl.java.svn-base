/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9006;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9006NxsShipToMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of NEXUS Ship to MA Inquiry Screen.
 * <br />
 * NEXUS Ship to MA Inquiry画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 8055 $
 */
public class W9006SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9006ListDomain>, W9006CriteriaDomain>{

    /**
     * w9006NxsShipToMaService/w9006NxsShipToMaサービス
     */
    protected W9006NxsShipToMaService w9006NxsShipToMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9006SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9006NxsShipToMaService.
     *
     * @param w9006NxsShipToMaService Set for w9006NxsShipToMaService
     */
    public void setW9006NxsShipToMaService(W9006NxsShipToMaService w9006NxsShipToMaService) {
        this.w9006NxsShipToMaService = w9006NxsShipToMaService;
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
    protected W9006CriteriaDomain filterDomain(W9006CriteriaDomain criteriaDomain)
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
    protected void validateItems(W9006CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9006CriteriaDomain> valid 
            = new Validator<W9006CriteriaDomain>(criteriaDomain, "w9006CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "shipToCd", 
            "shipToNm", 
            "shipToNmAbb",
            "nxsShipToCompany",
            "compNm"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9006);

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
    protected void validateConsistency(W9006CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W9006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create a search condition domain.
     *     Set the following {@link W9006NxsShipToMaCriteriaDomain}.
     *     Screen ID, locale(To get the maximum number)
     *     Conditions input from the screen
     * 
     * - Get the number of searches.
     *     with the arg of the {@link W9006NxsShipToMaCriteriaDomain}, 
     *     to call the {@link W9006NxsShipToMaService#searchCount(W9006NxsShipToMaCriteriaDomain)}.
     * 
     * - Calculate the search range corresponding to the requested page.
     *     Calculate the search start and end position on the basis of the number 
     *     of search queries, per page. 
     *     Set to {@ link W9006NxsShipToMaCriteriaDomain} calculation results.
     * 
     * - Search process.
     *     with the arg of the {@link W9006NxsShipToMaCriteriaDomain}, 
     *     to call the {@link W9006NxsShipToMaService#searchByConditionForPaging
     *     (W9006NxsShipToMaCriteriaDomain)}.
     * 
     * - Create a list domain.
     *     Convert to {@link W9006ListDomain} a {@link W9006NxsShipToMaDomain}. 
     * 
     * - 検索条件ドメインを作成
     *     {@link W9006NxsShipToMaCriteriaDomain}に下記を設定する。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9006NxsShipToMaCriteriaDomain}を引数に
     *     {@link W9006NxsShipToMaService#searchCount(W9006NxsShipToMaCriteriaDomain)}を呼び出す。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する。
     *     計算結果を{@link W9006NxsShipToMaCriteriaDomain}に設定する。
     * 
     * - 検索処理
     *     {@link W9006NxsShipToMaCriteriaDomain}を引数に
     *     {@link W9006NxsShipToMaService#searchByConditionForPaging
     *     (W9006NxsShipToMaCriteriaDomain)}を呼び出す。
     * 
     * - リストドメインの作成
     *     {@link W9006NxsShipToMaDomain}を{@link W9006ListDomain}に変換する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9006ListDomain> callServices(W9006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create a search condition domain.
        W9006NxsShipToMaCriteriaDomain w9006NxsShipToMaCriteria 
            = createW9006NxsShipToMaCriteria(criteriaDomain);

        // Get the number of searches.
        int count = searchW9006NxsShipToMaCount(w9006NxsShipToMaCriteria);

        // Set the search range
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w9006NxsShipToMaCriteria);

        // Search process.
        List<? extends W9006NxsShipToMaDomain> w9006NxsShipToMaList 
            = searchW9006NxsShipToMa(w9006NxsShipToMaCriteria);

        // Create a list domain.
        return convertToListDomain(w9006NxsShipToMaList);

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
     * @param w9006CriteriaDomain 画面の検索条件ドメイン(PL)
     * @return W9006NxsShipToMa サービスの検索条件ドメイン(BL)
     */
    protected W9006NxsShipToMaCriteriaDomain createW9006NxsShipToMaCriteria
    (W9006CriteriaDomain w9006CriteriaDomain) {
        
        W9006NxsShipToMaCriteriaDomain w9006NxsShipToMaCriteria = new W9006NxsShipToMaCriteriaDomain();
        
        // Configuring settings for obtaining the maximum number.
        w9006NxsShipToMaCriteria.setScreenId(w9006CriteriaDomain.getScreenId());
        w9006NxsShipToMaCriteria.setLocale(new Locale(w9006CriteriaDomain.getLanguageCd()));
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9006NxsShipToMaCriteria, w9006CriteriaDomain);

        return w9006NxsShipToMaCriteria;
    }

    /**
     * Get the number of searches.
     * 検索件数を取得する。
     * 
     * @param w9006NxsShipToMaCriteria w9006NxsShipToMaサービスの検索条件ドメイン
     * @return 検索件数
     * @throws ApplicationException 件数が取得できない場合
     */
    protected int searchW9006NxsShipToMaCount(W9006NxsShipToMaCriteriaDomain w9006NxsShipToMaCriteria) 
        throws ApplicationException {

        return w9006NxsShipToMaService.searchCount(w9006NxsShipToMaCriteria);
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
     * @param w9006NxsShipToMaCriteria Nexus送荷先原単位サービスの検索条件ドメイン
     * @throws ApplicationException 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, 
        W9006NxsShipToMaCriteriaDomain w9006NxsShipToMaCriteria) 
        throws ApplicationException {
        
        // Get information page.
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, 
            null, null, w9006NxsShipToMaCriteria.getLocale());
        
        // Set the start and end position in the search condition domain.
        w9006NxsShipToMaCriteria.setRowNumFrom(pageInfoData.getFromCount());
        w9006NxsShipToMaCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search process.
     * 検索処理。
     *
     * @param w9006NxsShipToMaCriteria w9006NxsShipToMaサービスの検索条件ドメイン
     * @return 検索結果
     * @throws ApplicationException 検索できない場合
     */
    protected List<? extends W9006NxsShipToMaDomain> searchW9006NxsShipToMa
    (W9006NxsShipToMaCriteriaDomain w9006NxsShipToMaCriteria) 
        throws ApplicationException {

        return w9006NxsShipToMaService.searchByConditionForPaging(w9006NxsShipToMaCriteria);
    }

    /**
     * Convert to list domain a w9006NxsShipToMa domain.
     * w9006NxsShipToMaドメインをリストドメインに変換する。
     *
     * - Copy property.
     * 
     * - プロパティをコピーする。
     * 
     * @param w9006NxsShipToMaList w9006NxsShipToMaドメインのリスト
     * @return 変換結果
     */
    protected List<W9006ListDomain> convertToListDomain(List<? 
        extends W9006NxsShipToMaDomain> w9006NxsShipToMaList) {
        List<W9006ListDomain> w9006ListDomainList = new ArrayList<W9006ListDomain>();
        
        if (w9006NxsShipToMaList != null) {
            for (W9006NxsShipToMaDomain w9006NxsShipToMa : w9006NxsShipToMaList) {
                W9006ListDomain listDomain = new W9006ListDomain();
                
                // Copy property.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w9006NxsShipToMa);
                
                w9006ListDomainList.add(listDomain);

            }
        }

        return w9006ListDomainList;
    }
}