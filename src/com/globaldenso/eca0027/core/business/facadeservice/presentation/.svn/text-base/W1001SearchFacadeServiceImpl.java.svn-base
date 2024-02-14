/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The Facade Service to search action of Export Request Main screen.
 * <br />船積実績Main画面のSearchアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1001SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W1001ListDomain>, W1001CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Export Request Service.<br />
     * 船積実績サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1001SearchFacadeServiceImpl() {
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
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1001CriteriaDomain filterDomain(W1001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking.
     * </pre> 
     * <pre>
     * ‐共通エラーチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W1001CriteriaDomain> valid 
            = new Validator<W1001CriteriaDomain>(criteriaDomain, "w1001CriteriaDomain");

        // Single item check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "requestStatus",
            "consigneeCd",
            "shipToCd",
            "expRequestNo",
            "comCreateUserId",
            "trnsCd",
            "fmUpdateTimestamp",
            "toUpdateTimestamp",
            "pltzItemNo",
            "itemDescription",
            "mainMark",
            "invoiceCtgry",
            "packingCompCd",
            "packingWhCd",
            "customerCd",
            "customerShipTo",
            "splitShippingNgFlg"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W1001);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Acquisition of a PALLETIZE INSTRUCTION DATE
        // 梱包指示日の取得
        String updateDtFrom = criteriaDomain.getFmUpdateTimestamp();
        String updateDtTo = criteriaDomain.getToUpdateTimestamp();

        // Acquisition of Date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correlation check of a PALLETIZE INSTRUCTION DATE
        // 梱包指示日の相関チェック
        if (!w1001ExpRequestService.validateConsistencyFmUpdateToUpdate(updateDtFrom, updateDtTo, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.lastMdfDt")
            };
            MessageDomain msgUpdateDtFrom = new MessageDomain("w1001CriteriaDomain.fmUpdateTimestamp", GSCM_E0_0031, params);
            MessageDomain msgUpdateDtTo = new MessageDomain("w1001CriteriaDomain.toUpdateTimestamp", null, null);
            
            errList.add(msgUpdateDtFrom);
            errList.add(msgUpdateDtTo);
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
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}[
     * <pre>
     * Data which coincides with the conditions specified as the search condition is acquired. 
     * 検索条件に指定した条件に一致するデータを取得します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W1001ListDomain> callServices(W1001CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Creation of conditions domain.
        // 条件ドメインの作成
        W1001ExpRequestCriteriaDomain expRequestCriteria = createExpRequestCriteriaDomain(criteriaDomain);
        
     // Acquisition of the search number
        // 検索件数の取得
        int count = searchExpRequestCount(expRequestCriteria);
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, expRequestCriteria);
        // Search Export Request
        // 船積実績の検索
        List<? extends W1001ExpRequestDomain> expRequestList = searchExpRequest(expRequestCriteria);
        
        // Conversion to list domain
        // リストドメインへの変換
        return convertToListDomain(expRequestList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * The search number is acquired.
     * <br />検索件数を取得します。
     *
     * @param expRequestCriteria W1001ExpRequestCriteriaDomain<br />梱包指示サービスの検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When the number of a Packaging Instruction (=Pull) is unacquirable<br />梱包指示の件数が取得できない場合
     */
    protected int searchExpRequestCount(W1001ExpRequestCriteriaDomain expRequestCriteria) 
        throws ApplicationException {
        return w1001ExpRequestService.searchCount(expRequestCriteria);
    }
    
    /**
     * 
     * Create the condition of domain Export Request service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Conditions of domain Export Request Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of domain Export Request Service<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W1001ExpRequestCriteriaDomain createExpRequestCriteriaDomain(W1001CriteriaDomain criteriaDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W1001ExpRequestCriteriaDomain expRequestCriteria = new W1001ExpRequestCriteriaDomain();
        
        // Settings for obtaining the maximum number
        // 最大件数を取得するための設定
        expRequestCriteria.setScreenId(criteriaDomain.getScreenId());
        expRequestCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(expRequestCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        if (expRequestCriteria.getToUpdateTimestamp() != null) {
            long msInDay = 1000 * 60 * 60 * 24; // Number of milliseconds in a day
            msInDay += expRequestCriteria.getToUpdateTimestamp().getTime();
            expRequestCriteria.getToUpdateTimestamp().setTime(msInDay - 1);
        }
        
        return expRequestCriteria;
    }
    
    /**
     * 
     * Search result data acquisition.
     * <br />検索結果データ取得
     *
     * @param expRequestCriteria Conditions of domain Export Request Service<br />
     * 船積実績サービスの条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If it fails in the search results acquisition process.<br />
     * 検索結果取得処理に失敗した場合 
     */
    protected List<? extends W1001ExpRequestDomain> searchExpRequest(W1001ExpRequestCriteriaDomain expRequestCriteria)
        throws ApplicationException {

        return w1001ExpRequestService.searchByConditionForPaging(expRequestCriteria);
    }

    /**
     * Convert to the list domain Export Request domain.
     * <br />船積実績ドメインをリストドメインに変換します。
     *
     * @param expRequestList List of search results<br />
     * 検索結果のリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     * @throws GscmApplicationException GscmApplicationException
     */
    protected List<W1001ListDomain> convertToListDomain(List<? extends W1001ExpRequestDomain> expRequestList, String dateFormat) throws GscmApplicationException {
        List<W1001ListDomain> listDomainList = new ArrayList<W1001ListDomain>();
        
        if (expRequestList != null) {
            for (W1001ExpRequestDomain expRequest : expRequestList) {
                W1001ListDomain listDomain = new W1001ListDomain();
                
                // Copy of the property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, expRequest, dateFormat);
                
                listDomain.setLastModifiedDate(new SimpleDateFormat(dateFormat).format(expRequest.getComUpdateTimestamp()));
                
                listDomainList.add(listDomain);
            }
        }
     // 件数チェック
        if (listDomainList.size() == 0) {
            // 0件エラー
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        if (SEARCH_MAX_COUNT < listDomainList.size()) {
            // 最大件数超過エラー
            Object[] params = {
                listDomainList.size(),
                SEARCH_MAX_COUNT
            };
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }
        
        return listDomainList;
    }
    
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param expRequestCriteria The search-condition domain of Export Request service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W1001ExpRequestCriteriaDomain expRequestCriteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, expRequestCriteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        expRequestCriteria.setRowNumFrom(pageInfoData.getFromCount());
        expRequestCriteria.setRowNumTo(pageInfoData.getToCount());
    }
}
