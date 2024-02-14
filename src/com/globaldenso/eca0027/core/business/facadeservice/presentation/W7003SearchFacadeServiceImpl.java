/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7003ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * 
 * The service for Search Facade action of Shipping Actuality Create screen.
 * <br />船積実績Create画面のSearchアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12515 $
 */
public class W7003SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W7003ListDomain>, W7003CriteriaDomain> {

    /**
     * The shipping service performance.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7003SearchFacadeServiceImpl() {
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
    protected W7003CriteriaDomain filterDomain(W7003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check 
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W7003CriteriaDomain> valid = new Validator<W7003CriteriaDomain>(criteriaDomain, "w7003CriteriaDomain");
        
        // Single item check
        // 単項目チェック
        String[] properties = {
            "fmEtd",
            "toEtd",
            "carrierCompCd",
            "vessel",
            "invoiceNo",
            "containerNo"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W7003);

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
    protected void validateConsistency(W7003CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W7003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Data which coincides with the conditions specified as the search condition is acquired. 
     * 検索条件に指定した条件に一致するデータを取得します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W7003ListDomain> callServices(W7003CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        // Search Shipping Actuality
        // 船積実績の検索
        List<? extends W7001ShippingActInvoiceDomain> shippingActInvoiceList = searchShippingAct(shippingActCriteria);
        
        // Conversion to list domain
        // リストドメインへの変換
        return convertToListDomain(shippingActInvoiceList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * 
     * Create the condition of shipment domain service performance.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Domain conditions of shipment performance Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7003CriteriaDomain criteriaDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Settings for obtaining the maximum number.
        // 最大件数を取得するための設定
        shippintActCriteria.setScreenId(criteriaDomain.getScreenId());
        shippintActCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        shippintActCriteria.setDscId(criteriaDomain.getLoginUserDscId()); // IN195 ADD
        
        return shippintActCriteria;
    }
    
    /**
     * 
     * Search result data acquisition.
     * <br />検索結果データ取得
     *
     * @param shippintActCriteria Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     * @return Search result<br />
     * 検索結果
     * @throws ApplicationException If it fails in the search results acquisition process.<br />
     * 検索結果取得処理に失敗した場合 
     */
    protected List<? extends W7001ShippingActInvoiceDomain> searchShippingAct(W7001ShippingActCriteriaDomain shippintActCriteria)
        throws ApplicationException {
        // Service call
        // サービス呼出し
        return w7001ShippingActService.searchForPagingOnCreateSearch(shippintActCriteria);
    }
    
    /**
     * Convert to the list domain list the invoice domain list.
     * <br />インボイスドメインリストをリストドメインリストに変換します。
     *
     * @param invoicelist Invoice domain list of search results<br />
     * 検索結果のインボイスドメインリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<W7003ListDomain> convertToListDomain(List<? extends W7001ShippingActInvoiceDomain> invoicelist, String dateFormat) {
        List<W7003ListDomain> listDomainList = new ArrayList<W7003ListDomain>();
        
        for (W7001ShippingActInvoiceDomain invoiceDomain : invoicelist) {
            W7003ListDomain listDomain = new W7003ListDomain();
            
            // Copy of the property
            // プロパティのコピー
            CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain, dateFormat);
            
            // If the data in the shipment performance target invoice work there --> checked
            // 船積実績対象インボイスワークのデータが存在する場合、チェック済み
            if (!invoiceDomain.getShippingActTwInvoiceList().isEmpty()) {
                listDomain.setSelected(CHECK_ON);
            }

            listDomainList.add(listDomain);
        }
        return listDomainList;
    }
}
