/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9009;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9009ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of CIGMA Ship to X-Reference MA Inquiry
 * Screen.
 * <br />CIGMA Ship to X-Reference MA Inquiry画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9009SearchFacadeServiceImpl 
    extends AbstractSearchFacadeService<List<? extends W9009ListDomain>, W9009CriteriaDomain>{

    /**
     * w9009CgmShipToXRefMaService/w9009CgmShipToXRefMaサービス
     */
    protected W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9009CgmShipToXRefMaService.
     *
     * @param w9009CgmShipToXRefMaService Set for w9009CgmShipToXRefMaService
     */
    public void setW9009CgmShipToXRefMaService(W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService) {
        this.w9009CgmShipToXRefMaService = w9009CgmShipToXRefMaService;
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
    protected W9009CriteriaDomain filterDomain(W9009CriteriaDomain criteriaDomain)
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
    protected void validateItems(W9009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9009CriteriaDomain> valid 
            = new Validator<W9009CriteriaDomain>(criteriaDomain, "w9009CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "lgcyLibCompCd", 
            "customerCd", 
            "lgcyShipTo",
            "shipToCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9009);

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
    protected void validateConsistency(W9009CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W9009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create a search condition domain.
     *     Set the following {@link W9009CgmShipToXRefMaCriteriaDomain}.
     *     Screen ID, locale(To get the maximum number)
     *     Conditions input from the screen
     * 
     * - Get the number of searches.
     *     with the arg of the {@link W9009CgmShipToXRefMaCriteriaDomain}, 
     *     to call the {@link W9009CgmShipToXRefMaService#searchCount(W9009CgmShipToXRefMaCriteriaDomain)}.
     * 
     * - Calculate the search range corresponding to the requested page.
     *     Calculate the search start and end position on the basis of the number 
     *     of search queries, per page. 
     *     Set to {@ link W9009CgmShipToXRefMaCriteriaDomain} calculation results.
     * 
     * - Search process.
     *     with the arg of the {@link W9009CgmShipToXRefMaCriteriaDomain}, 
     *     to call the {@link W9009CgmShipToXRefMaService#searchByConditionForPaging
     *     (W9009CgmShipToXRefMaCriteriaDomain)}.
     * 
     * - Create a list domain.
     *     Convert to {@link W9009ListDomain} a {@link W9009CgmShipToXRefMaDomain}. 
     * 
     * - 検索条件ドメインを作成
     *     {@link W9009CgmShipToXRefMaCriteriaDomain}に下記を設定する。
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W9009CgmShipToXRefMaCriteriaDomain}を引数に
     *     {@link W9009CgmShipToXRefMaService#searchCount(W9009CgmShipToXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する。
     *     計算結果を{@link W9009CgmShipToXRefMaCriteriaDomain}に設定する。
     * 
     * - 検索処理
     *     {@link W9009CgmShipToXRefMaCriteriaDomain}を引数に
     *     {@link W9009CgmShipToXRefMaService#searchByConditionForPaging
     *     (W9009CgmShipToXRefMaCriteriaDomain)}を呼び出す。
     * 
     * - リストドメインの作成
     *     {@link W9009CgmShipToXRefMaDomain}を{@link W9009ListDomain}に変換する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9009ListDomain> callServices(W9009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create a search condition domain.
        W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria 
            = createW9009CgmShipToXRefMaCriteria(criteriaDomain);

        // Get the number of searches.
        int count = searchW9009CgmShipToXRefMaCount(w9009CgmShipToXRefMaCriteria);

        // Set the search range
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, w9009CgmShipToXRefMaCriteria);

        // Search process.
        List<? extends W9009CgmShipToXRefMaDomain> w9009CgmShipToXRefMaList 
            = searchW9009CgmShipToXRefMa(w9009CgmShipToXRefMaCriteria);

        // Create a list domain.
        return convertToListDomain(w9009CgmShipToXRefMaList);

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
     * @return W9009CgmShipToXRefMaサービスの検索条件ドメイン(BL)
     */
    protected W9009CgmShipToXRefMaCriteriaDomain createW9009CgmShipToXRefMaCriteria
    (W9009CriteriaDomain criteriaDomain) {
        
        W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria = new W9009CgmShipToXRefMaCriteriaDomain();
        
        // Configuring settings for obtaining the maximum number.
        w9009CgmShipToXRefMaCriteria.setScreenId(criteriaDomain.getScreenId());
        w9009CgmShipToXRefMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9009CgmShipToXRefMaCriteria, criteriaDomain);

        return w9009CgmShipToXRefMaCriteria;
    }

    /**
     * Get the number of searches.
     * 検索件数を取得する。
     * 
     * @param w9009CgmShipToXRefMaCriteria w9009CgmShipToXRefMaサービスの検索条件ドメイン
     * @return 検索件数
     * @throws ApplicationException 件数が取得できない場合
     */
    protected int searchW9009CgmShipToXRefMaCount(W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria) 
        throws ApplicationException {

        return w9009CgmShipToXRefMaService.searchCount(w9009CgmShipToXRefMaCriteria);
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
     * @param w9009CgmShipToXRefMaCriteria CIGMA Ship to X-Reference MA Inquiryサービスの検索条件ドメイン
     * @throws ApplicationException 検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, 
        W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria) 
        throws ApplicationException {
        
        // Get information page.
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, 
            null, null, w9009CgmShipToXRefMaCriteria.getLocale());
        
        // Set the start and end position in the search condition domain.
        w9009CgmShipToXRefMaCriteria.setRowNumFrom(pageInfoData.getFromCount());
        w9009CgmShipToXRefMaCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search process.
     * 検索処理。
     *
     * @param w9009CgmShipToXRefMaCriteria w9009CgmShipToXRefMaサービスの検索条件ドメイン
     * @return 検索結果
     * @throws ApplicationException 検索できない場合
     */
    protected List<? extends W9009CgmShipToXRefMaDomain> searchW9009CgmShipToXRefMa
    (W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria) 
        throws ApplicationException {

        return w9009CgmShipToXRefMaService.searchByConditionForPaging(w9009CgmShipToXRefMaCriteria);
    }

    /**
     * Convert to list domain a w9009CgmShipToXRefMa domain.
     * w9009CgmShipToXRefMaドメインをリストドメインに変換する。
     *
     * - Copy property.
     * 
     * - プロパティをコピーする。
     * 
     * @param w9009CgmShipToXRefMaList w9009CgmShipToXRefMaドメインのリスト
     * @return 変換結果
     */
    protected List<W9009ListDomain> convertToListDomain(List<? 
        extends W9009CgmShipToXRefMaDomain> w9009CgmShipToXRefMaList) {
        List<W9009ListDomain> listDomainList = new ArrayList<W9009ListDomain>();
        
        if (w9009CgmShipToXRefMaList != null) {
            for (W9009CgmShipToXRefMaDomain w9009CgmShipToXRefMa : w9009CgmShipToXRefMaList) {
                W9009ListDomain listDomain = new W9009ListDomain();
                
                // Copy property.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w9009CgmShipToXRefMa);
                
                listDomainList.add(listDomain);

            }
        }

        return listDomainList;
    }
}
