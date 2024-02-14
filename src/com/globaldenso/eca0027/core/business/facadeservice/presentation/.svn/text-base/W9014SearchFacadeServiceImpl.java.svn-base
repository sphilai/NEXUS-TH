/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9014;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9014ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService;
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
public class W9014SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9014ListDomain>, W9014CriteriaDomain>{

    /**
     * w9014CgmWhXRefMaService/w9014CgmWhXRefMaサービス
     */
    protected W9014CgmWhXRefMaService w9014CgmWhXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9014CgmWhXRefMaService.
     *
     * @param w9014CgmWhXRefMaService Set for w9014CgmWhXRefMaService
     */
    public void setW9014CgmWhXRefMaService(W9014CgmWhXRefMaService w9014CgmWhXRefMaService) {
        this.w9014CgmWhXRefMaService = w9014CgmWhXRefMaService;
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
    protected W9014CriteriaDomain filterDomain(W9014CriteriaDomain criteriaDomain)
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
    protected void validateItems(W9014CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9014CriteriaDomain> valid 
            = new Validator<W9014CriteriaDomain>(criteriaDomain, "w9014CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "lgcyWhCd", 
            "plntCd", 
            "compCd", 
            "whCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9014);

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
    protected void validateConsistency(W9014CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W9014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create a search condition domain.
     *     Set the following {@link W9014CgmWhXRefMaCriteriaDomain}.
     *     Screen ID, locale(To get the maximum number)
     *     Conditions input from the screen
     * 
     * - Get the number of searches.
     *     with the arg of the {@link W9014CgmWhXRefMaCriteriaDomain}, 
     *     to call the {@link W9014CgmWhXRefMaService#searchCount(W9014CgmWhXRefMaCriteriaDomain)}.
     * 
     * - Calculate the search range corresponding to the requested page.
     *     Calculate the search start and end position on the basis of the number 
     *     of search queries, per page. 
     *     Set to {@ link W9014CgmWhXRefMaCriteriaDomain} calculation results.
     * 
     * - Search process.
     *     with the arg of the {@link W9014CgmWhXRefMaCriteriaDomain}, 
     *     to call the {@link W9014CgmWhXRefMaService#searchByConditionForPaging
     *     (W9014CgmWhXRefMaCriteriaDomain)}.
     * 
     * - Create a list domain.
     *     Convert to {@link W9014ListDomain} a {@link W9014CgmWhXRefMaDomain}. 
     * 
     * - 検索条件ドメインを作成
     *     {@link W9014CgmWhXRefMaCriteriaDomain}に下記を設定する。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9014CgmWhXRefMaCriteriaDomain}を引数に
     *     {@link W9014CgmWhXRefMaService#searchCount(W9014CgmWhXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する。
     *     計算結果を{@link W9014CgmWhXRefMaCriteriaDomain}に設定する。
     * 
     * - 検索処理
     *     {@link W9014CgmWhXRefMaCriteriaDomain}を引数に
     *     {@link W9014CgmWhXRefMaService#searchByConditionForPaging
     *     (W9014CgmWhXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - リストドメインの作成
     *     {@link W9014CgmWhXRefMaDomain}を{@link W9014ListDomain}に変換する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9014ListDomain> callServices(W9014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create a search condition domain.
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria 
            = createW9014CgmWhXRefMaCriteria(criteriaDomain);

        // Get the number of searches.
        int count = searchW9014CgmWhXRefMaCount(w9014CgmWhXRefMaCriteria);

        // Set the search range
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w9014CgmWhXRefMaCriteria);

        // Search process.
        List<? extends W9014CgmWhXRefMaDomain> w9014CgmWhXRefMaList 
            = searchW9014CgmWhXRefMa(w9014CgmWhXRefMaCriteria);

        // Create a list domain.
        return convertToListDomain(w9014CgmWhXRefMaList);

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
     * @return W9014CgmWhXRefMaサービスの検索条件ドメイン(BL)
     */
    protected W9014CgmWhXRefMaCriteriaDomain createW9014CgmWhXRefMaCriteria
    (W9014CriteriaDomain criteriaDomain) {
        
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria 
            = new W9014CgmWhXRefMaCriteriaDomain();
        
        // Configuring settings for obtaining the maximum number.
        w9014CgmWhXRefMaCriteria.setScreenId(criteriaDomain.getScreenId());
        w9014CgmWhXRefMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9014CgmWhXRefMaCriteria, criteriaDomain);

        return w9014CgmWhXRefMaCriteria;
    }

    /**
     * Get the number of searches.
     * 検索件数を取得する。
     * 
     * @param w9014CgmWhXRefMaCriteria w9014CgmWhXRefMaサービスの検索条件ドメイン
     * @return 検索件数
     * @throws ApplicationException 件数が取得できない場合
     */
    protected int searchW9014CgmWhXRefMaCount(W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria) 
        throws ApplicationException {

        return w9014CgmWhXRefMaService.searchCount(w9014CgmWhXRefMaCriteria);
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
     * @param w9014CgmWhXRefMaCriteria 梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, 
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria) 
        throws ApplicationException {
        
        // Get information page.
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, 
            null, null, w9014CgmWhXRefMaCriteria.getLocale());
        
        // Set the start and end position in the search condition domain.
        w9014CgmWhXRefMaCriteria.setRowNumFrom(pageInfoData.getFromCount());
        w9014CgmWhXRefMaCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search process.
     * 検索処理。
     *
     * @param w9014CgmWhXRefMaCriteria w9014CgmWhXRefMaサービスの検索条件ドメイン
     * @return 検索結果
     * @throws ApplicationException 検索できない場合
     */
    protected List<? extends W9014CgmWhXRefMaDomain> searchW9014CgmWhXRefMa
    (W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria) 
        throws ApplicationException {

        return w9014CgmWhXRefMaService.searchByConditionForPaging(w9014CgmWhXRefMaCriteria);
    }

    /**
     * Convert to list domain a w9014CgmWhXRefMa domain.
     * w9014CgmWhXRefMaドメインをリストドメインに変換する。
     *
     * - Copy property.
     * 
     * - プロパティをコピーする。
     * 
     * @param w9014CgmWhXRefMaList w9014CgmWhXRefMaドメインのリスト
     * @return 変換結果
     */
    protected List<W9014ListDomain> convertToListDomain(List<? 
        extends W9014CgmWhXRefMaDomain> w9014CgmWhXRefMaList) {
        List<W9014ListDomain> listDomainList = new ArrayList<W9014ListDomain>();
        
        if (w9014CgmWhXRefMaList != null) {
            for (W9014CgmWhXRefMaDomain w9014CgmWhXRefMa : w9014CgmWhXRefMaList) {
                W9014ListDomain listDomain = new W9014ListDomain();
                
                // Copy property.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w9014CgmWhXRefMa);
                
                listDomainList.add(listDomain);

            }
        }

        return listDomainList;
    }
}
