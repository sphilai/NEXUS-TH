/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUER_ID_YOURSELF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2001;


/**
 * This is an implement class of the Facade service to Search action of a Packaging Instruction (=Pull) Main screen.
 * <br />梱包指示Main画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2001SearchFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2001SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2001ListDomain>, W2001CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001SearchFacadeServiceImpl() {
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
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2001CriteriaDomain filterDomain(W2001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2001CriteriaDomain> valid 
            = new Validator<W2001CriteriaDomain>(criteriaDomain, "w2001CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "customerCd",
            "lgcyShipTo",
            "plntCd",
            "lgcyWhCd",
            "pltzInstrNo",
            "pltzInstrDtFrom",
            "pltzInstrDtTo"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2001);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Correlation check of a PALLETIZE INSTRUCTION DATE
     *     It checks by calling * {@link W2001PltzInstrService#validateConsistencyFmInstrDateToInstrDate(String, String, String)}.
     * 
     * - 梱包指示日の相関チェック
     *     {@link W2001PltzInstrService#validateConsistencyFmInstrDateToInstrDate(String, String, String)}を呼出し、チェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Acquisition of a PALLETIZE INSTRUCTION DATE
        // 梱包指示日の取得
        String pltzInstrDtFrom = criteriaDomain.getPltzInstrDtFrom();
        String pltzInstrDtTo = criteriaDomain.getPltzInstrDtTo();

        // Acquisition of Date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correlation check of a PALLETIZE INSTRUCTION DATE
        // 梱包指示日の相関チェック
        if (!w2001PltzInstrService.validateConsistencyFmDateToDate(pltzInstrDtFrom, pltzInstrDtTo, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.pltzInstrDt")
            };
            MessageDomain msgPltzInstrDtFrom = new MessageDomain("w2001CriteriaDomain.pltzInstrDtFrom", GSCM_E0_0031, params);
            MessageDomain msgPltzInstrDtTo = new MessageDomain("w2001CriteriaDomain.pltzInstrDtTo", null, null);
            
            errList.add(msgPltzInstrDtFrom);
            errList.add(msgPltzInstrDtTo);
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     *       The following is set to {@link W2001PltzInstrCriteriaDomain}.
     * - Create of a search-condition domain
     *       - SCREEN ID, locale (in order to acquire the maximum number)
     *       - Conditions inputted from the screen
     *
     * - Acquisition of the search number
     *       This is {@link W2001PltzInstrService#searchCountForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)} to an argument about {@link W2001PltzInstrCriteriaDomain}.
     *
     * - The search range corresponding to a demand page is computed.
     *       A search start and end position are calculated based on the search number and the number of cases around [ 1 page ].
     *       A calculation result is set as {@link W2001PltzInstrCriteriaDomain}.
     *
     * - Search of a Packaging Instruction (=Pull)
     *      To an argument {@link W2001PltzInstrCriteriaDomain} {@link W2001PltzInstrService#searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)}.
     *
     * - Create of a list domain
     *       {@link W2001PltzInstrDomain} is changed into {@link W2001ListDomain}.
     * 
     * - 検索条件ドメインの作成
     *     {@link W2001PltzInstrCriteriaDomain}に下記を設定する
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     * 
     * - 検索件数の取得
     *     {@link W2001PltzInstrCriteriaDomain}を引数に{@link W2001PltzInstrService#searchCountForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)}を呼び出す
     * 
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する
     *     計算結果を{@link W2001PltzInstrCriteriaDomain}に設定する
     * 
     * - 梱包指示の検索
     *     {@link W2001PltzInstrCriteriaDomain}を引数に{@link W2001PltzInstrService#searchForPagingOnMainSearch(W2001PltzInstrCriteriaDomain)}を呼び出す
     * 
     * - リストドメインの作成
     *     {@link W2001PltzInstrDomain}を{@link W2001ListDomain}に変換する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2001ListDomain> callServices(W2001CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2001PltzInstrCriteriaDomain pltzInstrCriteria = createPltzInstrCriteria(criteriaDomain);
        
        // Acquisition of the search number
        // 検索件数の取得
        int count = searchPltzInstrCount(pltzInstrCriteria);
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, pltzInstrCriteria);
        
        // Search of a Packaging Instruction (=Pull)
        // 梱包指示の検索
        List<? extends W2001PltzInstrDomain> pltzInstrList = searchPltzInstr(pltzInstrCriteria);
        
        // Converted in a list domain
        // リストドメインへの変換
        return convertToListDomain(pltzInstrList, criteriaDomain.getScreenDateFormat());
    }


    /**
     * The search-condition domain of Packaging Instruction (=Pull) service is created.
     * <br />梱包指示サービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a Packaging Instruction (=Pull) Main screen<br />梱包指示Main画面の検索条件ドメイン
     * @return The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     */
    protected W2001PltzInstrCriteriaDomain createPltzInstrCriteria(W2001CriteriaDomain criteriaDomain) {
        W2001PltzInstrCriteriaDomain pltzInstrCriteria = new W2001PltzInstrCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        pltzInstrCriteria.setScreenId(criteriaDomain.getScreenId());
        pltzInstrCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(pltzInstrCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // A setting of ISSUER ID
        // ISSUER IDの設定
        if (ISSUER_ID_YOURSELF.equals(criteriaDomain.getPltzInstrIssuerId())) {
            pltzInstrCriteria.setPltzInstrIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        return pltzInstrCriteria;
    }
    
    /**
     * The search number is acquired.
     * <br />検索件数を取得します。
     *
     * @param pltzInstrCriteria The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of a Packaging Instruction (=Pull) is unacquirable<br />梱包指示の件数が取得できない場合
     */
    protected int searchPltzInstrCount(W2001PltzInstrCriteriaDomain pltzInstrCriteria) 
        throws ApplicationException {
        return w2001PltzInstrService.searchCountForPagingOnMainSearch(pltzInstrCriteria);
    }
    
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param pltzInstrCriteria The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W2001PltzInstrCriteriaDomain pltzInstrCriteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, pltzInstrCriteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        pltzInstrCriteria.setRowNumFrom(pageInfoData.getFromCount());
        pltzInstrCriteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    
    /**
     * A Packaging Instruction (=Pull) is searched.
     * <br />梱包指示を検索します。
     *
     * @param pltzInstrCriteria The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When a Packaging Instruction (=Pull) cannot be searched<br />梱包指示が検索できない場合
     */
    protected List<? extends W2001PltzInstrDomain> searchPltzInstr(W2001PltzInstrCriteriaDomain pltzInstrCriteria) 
        throws ApplicationException {
        return w2001PltzInstrService.searchForPagingOnMainSearch(pltzInstrCriteria);
    }
    
    /**
     * A Packaging Instruction (=Pull) domain is changed into a list domain.
     * <br />梱包指示ドメインをリストドメインに変換します。
     *
     * @param pltzInstrList The list of Packaging Instruction (=Pull) domains<br />梱包指示ドメインのリスト
     * @param dateFormat Date format<br />日付フォーマット
     * @return Conversion result<br />変換結果
     */
    protected List<W2001ListDomain> convertToListDomain(List<? extends W2001PltzInstrDomain> pltzInstrList, String dateFormat) {
        List<W2001ListDomain> listDomainList = new ArrayList<W2001ListDomain>();
        
        if (pltzInstrList != null) {
            for (W2001PltzInstrDomain pltzInstr : pltzInstrList) {
                W2001ListDomain listDomain = new W2001ListDomain();
                
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstr);

                // Setting of a PALLETIZE INSTRUCTION DATE
                // 梱包指示日の設定
                String pltzInstrDt = DateUtil.formatDate(pltzInstr.getPltzInstrDt(), dateFormat);
                listDomain.setPltzInstrDt(pltzInstrDt);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
}
