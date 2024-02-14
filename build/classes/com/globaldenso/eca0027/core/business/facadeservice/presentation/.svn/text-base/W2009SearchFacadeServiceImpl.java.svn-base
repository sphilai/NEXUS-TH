/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUER_ID_YOURSELF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2009;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
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
 * This is a SearchFacade service implement class of a CML Main Screen.
 * <br />CML Main Screen画面のSearchFacadeサービス実装クラスです。
 * 
 * <pre>
 * bean id:W2009SearchFacadeService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W2009SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W2009ListDomain>, W2009CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * constructor.
     */
    public W2009SearchFacadeServiceImpl() {
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
     * Setter method for w2009CmlService.
     * 
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
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
    protected W2009CriteriaDomain filterDomain(
        W2009CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2009_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2009_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        Validator<W2009CriteriaDomain> valid = new Validator<W2009CriteriaDomain>(
            criteriaDomain, "w2009CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "customerCd",
            "lgcyShipTo",
            "mainMark",
            "plntCd",
            "lgcyWhCd",
            "packingWhCompCd",
            "packingWhCd",
            "pltzInstrNo",
            "containerSortingKey",
            "mixTagNo",
            "pltzItemNo",
            "pkgCd",
            "issueFromDate",
            "issueToDate",
            "fromMainMark", // UT414 ADD
            "toMainMark" // UT414 ADD
        };
        
        valid.isValidateProperties(properties, SCREEN_ID_W2009);

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
    protected void validateConsistency(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        List<MessageDomain> errlist = new ArrayList<MessageDomain>();
        
        // Correlation check of date From - To
        // 日付 From - To の相関チェック
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getIssueFromDate()) &&  !CheckUtil.isBlankOrNull(criteriaDomain.getIssueToDate())) {
            boolean result = w2009CmlService.validateConsistencyFmIssueDateToIssueDate(criteriaDomain.getScreenDateFormat(), criteriaDomain.getIssueFromDate(), criteriaDomain.getIssueToDate());
            if (!result) {
                String[] params = new String[] { commonService.getResource(criteriaDomain.getLocale(), "label.expPackingDt")};
                errlist.add(new MessageDomain("w2009CriteriaDomain.issueToDate", GSCM_E0_0031, params));
                errlist.add(new MessageDomain("w2009CriteriaDomain.issueFromDate", null, null));
                //throw new ValidationException(errlist);
            }
        }

        // UT414 ADD START
        // FROM-TO correlation check
        // FROM-TO相関チェック
        if (!StringUtils.isEmpty(criteriaDomain.getFromMainMark()) && !StringUtils.isEmpty(criteriaDomain.getToMainMark())) {
            if (!(criteriaDomain.getFromMainMark().compareTo(criteriaDomain.getToMainMark()) <= 0)) {
                Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.mainMark")};
                errlist.add(new MessageDomain("w2009CriteriaDomain.fromMainMark", GSCM_E0_0031, params));
                errlist.add(new MessageDomain("w2009CriteriaDomain.toMainMark", null, null));
            }
        }

        if (0 < errlist.size()) {
            throw new ValidationException(errlist);
        }
        // UT414 ADD END
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
    protected void validateDatabase(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a search-condition domain
     *
     * - Acquisition of the search number data
     *       When search results exceed the maximum number and it exceeds zero affair
     *       Processing specified to common specifications, respectively is performed, and the following processings are not performed.
     *
     * - Acquisition of search data
     *       A Palletize and a Palletize Item are searched.
     *
     * A converted in - List domain
     *       The searched result is changed into {@link W2009ListDomain}.
     * 
     * - 検索条件ドメインの作成
     *     
     * - 検索件数データの取得
     *     検索結果が上限件数を超えた場合、0件を超えた場合は
     *     それぞれ共通仕様に規定された処理を行い、以下の処理は行わない
     *     
     * - 検索データの取得
     *     パレタイズ、パレタイズ対象品を検索する
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2009ListDomain}に変換する
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2009ListDomain> callServices(
        W2009CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2009CmlCriteriaDomain cmlCriteria = createCmlCriteria(criteriaDomain);
        
        // Acquisition of the search number
        // 検索件数の取得
        int count = searchCmlCount(cmlCriteria);
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, cmlCriteria);
        
        // A search of CML
        // CMLの検索
        List<? extends W2009CmlDomain> cmlList = searchCml(cmlCriteria);
        
        // Converted in a list domain
        // リストドメインへの変換
        return convertToListDomain(cmlList, criteriaDomain.getScreenDateFormat());
        
    }

    /**
     * The search-condition domain of CML service is created.
     * <br />CMLサービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a CMLMain screen<br />CMLMain画面の検索条件ドメイン
     * @return The search-condition domain of CML service<br />CMLサービスの検索条件ドメイン
     */
    protected W2009CmlCriteriaDomain createCmlCriteria(W2009CriteriaDomain criteriaDomain) {
        W2009CmlCriteriaDomain cmlCriteria = new W2009CmlCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        cmlCriteria.setScreenId(criteriaDomain.getScreenId());
        cmlCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // In the case of yourself
        // yourselfの場合
        if (ISSUER_ID_YOURSELF.equals(cmlCriteria.getExpPackingIssuerId())) {
            cmlCriteria.setExpPackingIssuerId(cmlCriteria.getLoginUserDscId());
        }
        
        return cmlCriteria;
    }
    
    /**
     * The search number is acquired.
     * <br />検索件数を取得します。
     *
     * @param cmlCriteria The search-condition domain of CML service<br />CMLサービスの検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of CML is zero affair<br />CMLの件数が0件の場合
     */
    protected int searchCmlCount(W2009CmlCriteriaDomain cmlCriteria) 
        throws ApplicationException {
        return w2009CmlService.searchCountForPagingOnMainSearch(cmlCriteria);
    }
    
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param cmlCriteria The search-condition domain of CML service<br />CMLサービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W2009CmlCriteriaDomain cmlCriteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, cmlCriteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        cmlCriteria.setRowNumFrom(pageInfoData.getFromCount());
        cmlCriteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    /**
     * CML is searched.
     * <br />CMLを検索します。
     *
     * @param cmlCriteria The search-condition domain of CML service<br />CMLサービスの検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When CML cannot be searched<br />CMLが検索できない場合
     */
    protected List<? extends W2009CmlDomain> searchCml(W2009CmlCriteriaDomain cmlCriteria) 
        throws ApplicationException {
        return w2009CmlService.searchForPagingOnMainSearch(cmlCriteria);
    }
    
    /**
     * A CML domain is changed into a list domain.
     * <br />CMLドメインをリストドメインに変換します。
     *
     * @param cmlList The list of CML domains<br />CMLドメインのリスト
     * @param dateFormat The Date format for screen display<br />画面表示用の日付フォーマット
     * @return Conversion result<br />変換結果
     */
    protected List<W2009ListDomain> convertToListDomain(List<? extends W2009CmlDomain> cmlList, String dateFormat) {
        List<W2009ListDomain> listDomainList = new ArrayList<W2009ListDomain>();
        
        if (cmlList != null) {

            for (W2009CmlDomain cml : cmlList) {
                W2009ListDomain listDomain = new W2009ListDomain();
                // Copy of property
                // プロパティのコピー

                // To speed up the processing, do not use CommonUtil#copyPropertiesDomainToDomain.
                // 処理速度を上げるために、CommonUtil#copyPropertiesDomainToDomain ではなく 
                // getter/setter を使ってプロパティ値の移送を行う。

                // CommonUtil.copyPropertiesDomainToDomain(listDomain, cml, dateFormat);

                // Use getter/setter instead of it.
                listDomain.setMainMark(cml.getMainMark());
                listDomain.setShipperCd(cml.getShipperCd());
                listDomain.setCustomerCd(cml.getCustomerCd());
                listDomain.setLgcyShipTo(cml.getLgcyShipTo());
                listDomain.setTrnsCd(cml.getTrnsCd());
                listDomain.setReviseFlg(cml.getReviseFlg());
                listDomain.setPlntCd(cml.getPlntCd());
                listDomain.setLgcyWhCd(cml.getLgcyWhCd());
                listDomain.setContainerSortingKey(cml.getContainerSortingKey());
                listDomain.setExpPackingDt(DateUtil.formatDate(cml.getExpPackingDt(), dateFormat));
                listDomain.setExpPackingIssuerNm(cml.getExpPackingIssuerNm());
                listDomain.setPackingWhCompCd(cml.getPackingWhCompCd());
                listDomain.setPackingWhCd(cml.getPackingWhCd());
                listDomain.setLoadingCd(cml.getLoadingCd());
                listDomain.setPltzInstrNo(cml.getPltzInstrNo());
                listDomain.setAuthFlg(cml.getAuthFlg());

// If you need to copy the following items, please enable comment lines.
// AbstractDomain の項目です、コピーする必要がある項目があればコメントアウトを外してください。
//                listDomain.setCharCd(cml.getCharCd());
//                listDomain.setCheckValidateWarning(cml.isCheckValidateWarning());
//                listDomain.setComCreateFuncId(cml.getComCreateFuncId());
//                listDomain.setComCreateTimestamp(cml.getComCreateTimestamp());
//                listDomain.setComCreateUserId(cml.getComCreateUserId());
//                listDomain.setComUpdateFuncId(cml.getComUpdateFuncId());
//                listDomain.setComUpdateTimestamp(cml.getComUpdateTimestamp());
//                listDomain.setComUpdateUserId(cml.getComUpdateUserId());
//                listDomain.setDateFormat(cml.getDateFormat());
//                listDomain.setLanguageCd(cml.getLanguageCd());
//                listDomain.setLocale(cml.getLocale());
//                listDomain.setLoginUserDscId(cml.getLoginUserDscId());
//                listDomain.setOwnerCompCd(cml.getOwnerCompCd());
//                listDomain.setRowNumFrom(cml.getRowNumFrom());
//                listDomain.setRowNumTo(cml.getRowNumTo());
//                listDomain.setScreenId(cml.getScreenId());
//                listDomain.setSearchCountCheckFlg(cml.isSearchCountCheckFlg());
//                listDomain.setSelected(cml.getSelected());
//                listDomain.setTimeZone(cml.getTimeZone());

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
