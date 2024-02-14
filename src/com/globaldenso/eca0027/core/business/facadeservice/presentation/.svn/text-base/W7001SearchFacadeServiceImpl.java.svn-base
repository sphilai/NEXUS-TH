/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The Facade Service to search action of Shipping Actuality Main screen.
 * <br />船積実績Main画面のSearchアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W7001ListDomain>, W7001CriteriaDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001SearchFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w7001ShippingActService.
     *
     * @param shippingActService Set for w7001ShippingActService
     */
    public void setW7001ShippingActService(W7001ShippingActService shippingActService) {
        w7001ShippingActService = shippingActService;
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
    protected W7001CriteriaDomain filterDomain(W7001CriteriaDomain criteriaDomain)
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
    protected void validateItems(W7001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W7001CriteriaDomain> valid 
            = new Validator<W7001CriteriaDomain>(criteriaDomain, "w7001CriteriaDomain");

        // Single item check
        // 単項目チェック
        String[] properties = {
            "fmRegisterDt",
            "toRegisterDt",
            "shipperCd",
            "consigneeCd",
            "shipToCompCd",
            "carrierCompCd",
            "vessel",
            "billdNo",
            "fmAtd",
            "toAtd",
            "invoiceNo",
            "containerNo",
            "clpGroup"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W7001);

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
    protected void validateConsistency(W7001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
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
    protected void validateDatabase(W7001CriteriaDomain criteriaDomain)
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
    protected List<? extends W7001ListDomain> callServices(W7001CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        // Search Shipping Actuality
        // 船積実績の検索
        List<? extends W7001ShippingActDomain> shippingActList = searchShippingAct(shippingActCriteria);
        
        // Conversion to list domain
        // リストドメインへの変換
        return convertToListDomain(shippingActList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * 
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Conditions of domain Shipping Actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of domain Shipping Actuality Service<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7001CriteriaDomain criteriaDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Settings for obtaining the maximum number
        // 最大件数を取得するための設定
        shippintActCriteria.setScreenId(criteriaDomain.getScreenId());
        shippintActCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // Set of DSC-ID
        // DSC-IDの設定
        shippintActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return shippintActCriteria;
    }
    
    /**
     * 
     * Search result data acquisition.
     * <br />検索結果データ取得
     *
     * @param shippintActCriteria Conditions of domain Shipping Actuality Service<br />
     * 船積実績サービスの条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If it fails in the search results acquisition process.<br />
     * 検索結果取得処理に失敗した場合 
     */
    protected List<? extends W7001ShippingActDomain> searchShippingAct(W7001ShippingActCriteriaDomain shippintActCriteria)
        throws ApplicationException {

        return w7001ShippingActService.searchForPagingOnMainSearch(shippintActCriteria);
    }

    /**
     * Convert to the list domain Shipping Actuality domain.
     * <br />船積実績ドメインをリストドメインに変換します。
     *
     * @param shippingActList List of search results<br />
     * 検索結果のリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<W7001ListDomain> convertToListDomain(List<? extends W7001ShippingActDomain> shippingActList, String dateFormat) {
        List<W7001ListDomain> listDomainList = new ArrayList<W7001ListDomain>();
        
        if (shippingActList != null) {
            for (W7001ShippingActDomain shippingAct : shippingActList) {
                W7001ListDomain listDomain = new W7001ListDomain();
                
                // Copy of the property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, shippingAct, dateFormat);

                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
}
