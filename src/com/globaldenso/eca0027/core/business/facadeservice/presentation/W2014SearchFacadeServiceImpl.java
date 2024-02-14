/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2014;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2014ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
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

/**
 * The search service facade implementation class of X-Tag Main Screen
 * <br />X-Tag Main Screen画面のSearchFacadeサービス実装クラスです。
 * <pre>
 * bean id:w2014SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W2014SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2014ListDomain>, W2014CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Xtag service
     * <br />Xtagサービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * constructor.
     */
    public W2014SearchFacadeServiceImpl() {
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
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2014CriteriaDomain filterDomain(W2014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error check
     *     Refer for details to "画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」"
     *
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2014CriteriaDomain> valid 
            = new Validator<W2014CriteriaDomain>(criteriaDomain, "w2014CriteriaDomain");

        // 共通チェック
        String[] properties = {
            "curWhCompCd",
            "curWhCd",
            "containerSortingKey",
            "shipToCompCd",
            "xmainMark",
            "shipperCd",
            "mainMark",
            "issueFromDate",
            "issueToDate"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2014);

        // check errors
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Related check for from-date and to-date
     * - 日付 From - To の相関チェック
     *     {@link W2014XtagService#validateConsistencyFromToDate(String, String, String)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // get date
        // 日付取得
        String issueFromDate = criteriaDomain.getIssueFromDate();
        String issueToDate = criteriaDomain.getIssueToDate();

        // get date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Related check for from-date and to-date
        // 日付の相関チェック
        if (!w2014XtagService.validateConsistencyFromToDate(dateFormat, issueFromDate, issueToDate)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.issueDate")
            };
            MessageDomain msgIssueFromDate = new MessageDomain("w2014CriteriaDomain.issueFromDate", GSCM_E0_0031, params);
            MessageDomain msgIssueToDate = new MessageDomain("w2014CriteriaDomain.issueToDate", null, null);
            
            errList.add(msgIssueFromDate);
            errList.add(msgIssueToDate);
        }
        
        // check errors
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
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create search-condition domain
     *     set following information to {@link W2014XtagCriteriaDomain}
     *     - SCREEN ID, Locale (to get the maximum number)
     *     - Search condition from screen
     * - get number of search result
     *     - argument: {@link W2014XtagCriteriaDomain}
     *     - call: {@link W2014XtagService#searchCountOnMainSearch(W2014XtagCriteriaDomain)}
     * - calculate the range of search result
     *     calculate start and end position from the number of search result and the number per page
     *     set calculate result to {@link W2014XtagCriteriaDomain}
     * - get search result
     *     search X Palletize and Palletize
     *     argument: {@link W2014XtagCriteriaDomain}
     *     call: {@link W2014XtagService#searchForPagingOnMainSearch(W2014XtagCriteriaDomain)}
     * - convert to List domain
     *     convert search result to {@link W2014ListDomain}
     * 
     * - 検索条件ドメインの作成
     *     {@link W2014XtagCriteriaDomain}に下記を設定する
     *     - 画面ID、ロケール (最大件数を取得するため)
     *     - 画面から入力された条件
     *     
     * - 検索件数の取得
     *     {@link W2014XtagCriteriaDomain}を引数に{@link W2014XtagService#searchCountOnMainSearch(W2014XtagCriteriaDomain)}を呼出
     *     
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する
     *     計算結果を{@link W2014XtagCriteriaDomain}に設定する
     *     
     * - 検索データの取得
     *     まとめパレタイズ、パレタイズを検索
     *     {@link W2014XtagCriteriaDomain}を引数に{@link W2014XtagService#searchForPagingOnMainSearch(W2014XtagCriteriaDomain)}を呼出
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2014ListDomain}に変換
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2014ListDomain> callServices(W2014CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // create search-condition domain
        // 検索条件ドメインの作成
        W2014XtagCriteriaDomain xtagCriteria = createCriteria(criteriaDomain);
        
        // get the number of search result
        // 検索件数の取得
        int count = searchCount(xtagCriteria);
        
        // set the range of search
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, xtagCriteria);
        
        // search X Palletize and Palletize
        // まとめパレタイズ、パレタイズの検索
        List<? extends W2014XtagDomain> xtagList = searchForPaging(xtagCriteria);
        
        // convert to List domain
        // リストドメインへの変換
        return convertToListDomain(xtagList, criteriaDomain.getScreenDateFormat());
        
    }
    
    /**
     * Create search-condition domain of X-Palletize
     * <br />まとめパレタイズサービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain search-condition domain of X-Palletize main screen<br />まとめパレタイズMain画面の検索条件ドメイン
     * @return search-condition domain of X-Palletize service<br />まとめパレタイズサービスの検索条件ドメイン
     */
    protected W2014XtagCriteriaDomain createCriteria(W2014CriteriaDomain criteriaDomain) {
        
        W2014XtagCriteriaDomain xtagCriteria = new W2014XtagCriteriaDomain();
        
        // setting to get the maximum number
        // 最大件数を取得するための設定
        xtagCriteria.setScreenId(criteriaDomain.getScreenId());
        xtagCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // copy search-condition
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(xtagCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        if (!(criteriaDomain.getXtagPackingIssuerId().equals(""))){
            xtagCriteria.setXtagPackingIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        return xtagCriteria;
    }
    
    /**
     * get the number of search result
     * <br />検索件数を取得します。
     *
     * @param xtagCriteria search-result domain of X-Palletize service<br />まとめパレタイズサービスの検索条件ドメイン
     * @return the number of search result<br />検索件数
     * @throws ApplicationException when you can not get the number of X-Palletize<br />まとめパレタイズの件数が取得できない場合
     */
    protected int searchCount(W2014XtagCriteriaDomain xtagCriteria) 
        throws ApplicationException {
        return w2014XtagService.searchCountOnMainSearch(xtagCriteria);
    }
    
    /**
     * calculate the range of search
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator Object<br />PageInfoCreatorオブジェクト
     * @param count the number of search result<br />検索件数
     * @param xtagCriteria search-condition domain of X-Palletize service<br />まとめパレタイズサービスの検索条件ドメイン
     * @throws ApplicationException when you can not calculate the range of search<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W2014XtagCriteriaDomain xtagCriteria) 
        throws ApplicationException {
        
        // get page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, xtagCriteria.getLocale());
        
        // set start and end position to search-condition domain
        // 検索条件ドメインに開始・終了位置を設定
        xtagCriteria.setRowNumFrom(pageInfoData.getFromCount());
        xtagCriteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    
    /**
     * search X-Palletize
     * <br />まとめパレタイズを検索します。
     *
     * @param xtagCriteria search-condition domain of X-Palletize service<br />まとめパレタイズサービスの検索条件ドメイン
     * @return search result<br />検索結果
     * @throws ApplicationException when you can not search X-Palletize<br />まとめパレタイズが検索できない場合
     */
    protected List<? extends W2014XtagDomain> searchForPaging(W2014XtagCriteriaDomain xtagCriteria) 
        throws ApplicationException {
        return w2014XtagService.searchForPagingOnMainSearch(xtagCriteria);
    }
    
    /**
     * convert X-Palletize domain to List domain
     * <br />まとめパレタイズドメインをリストドメインに変換します。
     *
     * @param xtagList list of X-Palletize domain<br />まとめパレタイズドメインのリスト
     * @param dateFormat date format<br />日付フォーマット
     * @return search result<br />変換結果
     */
    protected List<W2014ListDomain> convertToListDomain(List<? extends W2014XtagDomain> xtagList, String dateFormat) {
        
        List<W2014ListDomain> listDomainList = new ArrayList<W2014ListDomain>();
        
        if (xtagList != null) {
            for (W2014XtagDomain xtagDomain : xtagList) {
                W2014ListDomain listDomain = new W2014ListDomain();
                
                // copy property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, xtagDomain);

                // X-TAG PACKING DATE
                // まとめ梱包日
                String xtagPackingDt = DateUtil.formatDate(xtagDomain.getXtagPackingDt(), dateFormat);
                listDomain.setXtagPackingDt(xtagPackingDt);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
}
