/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUER_ID_YOURSELF;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番梱包Main Screen画面のSearchFacadeサービス実装クラスです。
 * <pre>
 * bean id: w2005SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W2005SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2005ListDomain>, W2005CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;
    
    /**
     * constructor.
     */
    public W2005SearchFacadeServiceImpl() {
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
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2005CriteriaDomain filterDomain(W2005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2005_Multiple Item No. in 1Box PKG Main Screen.xls "screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2005_Multiple Item No. in 1Box PKG Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2005CriteriaDomain> valid 
            = new Validator<W2005CriteriaDomain>(criteriaDomain, "w2005CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "customerCd",
            "lgcyShipTo",
            "plntCd",
            "lgcyWhCd",
            "mixTagNo",
            "mixTagIssueDtFrom",
            "mixTagIssueDtTo",
            "itemNo",
            "pkgCd"
        };
        // required, digit number, an attribute, a form, attribute check
        // 必須、桁数、属性、書式、属性チェック
        valid.isValidateProperties(properties, SCREEN_ID_W2005);
      
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
     * - Correlation check of date From - To
     * 
     * - 日付 From - To の相関チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        // Correlation check of date From - To
        // 日付 From - To の相関チェック
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getMixTagIssueDtFrom()) && !CheckUtil.isBlankOrNull(criteriaDomain.getMixTagIssueDtTo())) {
            if (!w2005MixTagService.validateConsistencyFmIssueDateToIssueDate(criteriaDomain.getScreenDateFormat(), criteriaDomain.getMixTagIssueDtFrom(), criteriaDomain.getMixTagIssueDtTo())) {
                String[] params = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.mixTagIssueDt")};
                errList.add(new MessageDomain("criteriaDomain.mixTagIssueDtFrom", GSCM_E0_0031, params));
                errList.add(new MessageDomain("criteriaDomain.mixTagIssueDtTo", null, null));
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a search-condition domain
     *       The following is set as {@link W2005MixTagCriteriaDomain}.
     *       - SCREEN ID, locale (in order to acquire the maximum number)
     *       - Conditions inputted from the screen
     *
     * - Acquisition of the search number
     *       This is a call about {@link W2005MixTagService#searchCountForPagingOnMainSearch (W2005MixTagCriteriaDomain)} to an argument in W2005MixTagCriteriaDomain}.
     *
     *      *
     * - The search range corresponding to a demand page is computed.
     *       A search start and end position are calculated based on the search number and the number of cases around [ 1 page ].
     *       A calculation result is set as {@link W2005MixTagCriteriaDomain}.
     *
     * - Acquisition of search data
     *       A Mix Tag and a Mix Tag Item No are searched.
     *
     * A converted in - List domain
     *       The searched result is changed into {@link W2005ListDomain}.
     * 
     * - 検索条件ドメインの作成
     *     {@link W2005MixTagCriteriaDomain}に下記を設定する
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     *     
     * - 検索件数の取得
     *     {@link W2005MixTagCriteriaDomain}を引数に{@link W2005MixTagService#searchCountForPagingOnMainSearch(W2005MixTagCriteriaDomain)}を呼び出す
     *     
     *      *     
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する
     *     計算結果を{@link W2005MixTagCriteriaDomain}に設定する
     *     
     * - 検索データの取得
     *     MIXED現品票、MIXED品番を検索する
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2005ListDomain}に変換する
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2005ListDomain> callServices(W2005CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2005MixTagCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);
        
        // Acquisition of the search number
        // 検索件数の取得
        int count = searchMixTagCount(mixTagCriteria);
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, mixTagCriteria);
        
        // Search of a multiple p/n packaged in box
        // 小箱内多品番梱包の検索
        List<? extends W2005MixTagDomain> mixTagList = searchMixTag(mixTagCriteria);
        
        // Converted in a list domain
        // リストドメインへの変換
        return convertToListDomain(mixTagList, criteriaDomain.getScreenDateFormat());
        
    }
    
    
    /**
     * Create the search-condition domain of multiple-p/n-packaged-in-box service.
     * <br />小箱内多品番梱包サービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a multiple-p/n-packaged-in-box Main screen<br />小箱内多品番梱包Main画面の検索条件ドメイン
     * @return The search-condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの検索条件ドメイン
     */
    protected W2005MixTagCriteriaDomain createMixTagCriteria(W2005CriteriaDomain criteriaDomain) {
        W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        mixTagCriteria.setScreenId(criteriaDomain.getScreenId());
        mixTagCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(mixTagCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // When Issuer is "yourself", a login user's DSC-ID is set up.
        // Issuer が "yourself" の場合は、ログインユーザのDSC-IDを設定する。
        if (ISSUER_ID_YOURSELF.equals(criteriaDomain.getMixTagIssuerId())) {
            mixTagCriteria.setMixTagIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        return mixTagCriteria;
    }

    /**
     * Acquire the search number.
     * <br />検索件数を取得します。
     *
     * @param mixTagCriteria The search-condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of a multiple p/n packaged in box is unacquirable<br />小箱内多品番梱包の件数が取得できない場合
     */
    protected int searchMixTagCount(W2005MixTagCriteriaDomain mixTagCriteria) 
        throws ApplicationException {
        return w2005MixTagService.searchCountForPagingOnMainSearch(mixTagCriteria);
    }
    
    /**
     * Compute the search range.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param mixTagCriteria The search-condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W2005MixTagCriteriaDomain mixTagCriteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, mixTagCriteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        mixTagCriteria.setRowNumFrom(pageInfoData.getFromCount());
        mixTagCriteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    /**
     * Search a multiple p/n packaged in box.
     * <br />小箱内多品番梱包を検索します。
     *
     * @param mixTagCriteria The search-condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When a multiple p/n packaged in box cannot be searched<br />小箱内多品番梱包が検索できない場合
     */
    protected List<? extends W2005MixTagDomain> searchMixTag(W2005MixTagCriteriaDomain mixTagCriteria)
        throws ApplicationException {
        return w2005MixTagService.searchForPagingOnMainSearch(mixTagCriteria);
    }
    
    /**
     * Change a multiple-p/n-packaged-in-box domain into a list domain.
     * <br />小箱内多品番梱包ドメインをリストドメインに変換します。
     *
     * @param mixTagList The list of multiple-p/n-packaged-in-box domains<br />小箱内多品番梱包ドメインのリスト
     * @param dateFormat Date format<br />日付フォーマット
     * @return Conversion result<br />変換結果
     */
    protected List<W2005ListDomain> convertToListDomain(List<? extends W2005MixTagDomain> mixTagList, String dateFormat) {
        List<W2005ListDomain> listDomainList = new ArrayList<W2005ListDomain>();
        
        if (mixTagList != null) {
            for (W2005MixTagDomain mixTag : mixTagList) {
                W2005ListDomain listDomain = new W2005ListDomain();
                
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTag);

                // A setting of MIX TAG ISSUE DATE
                // MIXタグ作成日の設定
                String mixTagIssueDt = DateUtil.formatDate(mixTag.getMixTagIssueDt(), dateFormat);
                listDomain.setMixTagIssueDt(mixTagIssueDt);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
}
