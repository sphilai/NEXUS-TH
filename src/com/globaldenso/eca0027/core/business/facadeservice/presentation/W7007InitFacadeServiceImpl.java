/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7007ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * Facade Service for initial display action of B/L upload screen.
 * <br />B/Lアップロード画面の初期表示アクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11630 $
 */
public class W7007InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W7007ListDomain>, W7007CriteriaDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7007InitFacadeServiceImpl() {
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
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7007CriteriaDomain filterDomain(W7007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create criteria domain for shipping actuality.
     * Convert to the {@link W7007CriteriaDomain} {@link W7001ShippingActCriteriaDomain}.
     * - Get search result data.
     * Call {@link W7001ShippingActService#searchOnOtherDocUploadSummary}.
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7007CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐検索結果データ取得
     *     {@link W7001ShippingActService#searchOnOtherDocUploadSummary}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W7007ListDomain> callServices(W7007CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        List<? extends W7001ShippingActInvoiceDomain> invoiceList = w7001ShippingActService.searchOnOtherDocUploadSummary(shippingActCriteria);
        
        return convertToCriteriaDomain(invoiceList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * 
     * Create criteria domain for shipping actuality.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Criteria domain of shipping actuality main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Criteria domain of shipping actuality service<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7007CriteriaDomain criteriaDomain) {
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        return shippintActCriteria;
    }
    
    /**
     * Convert shipping actuality domain to facade service domain.<br />
     *      * <br />船積実績ドメインをFacadeServiceドメインに変換します。
     *
     * @param invoiceList Invoice domain list<br />
     * インボイスドメインリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<? extends W7007ListDomain> convertToCriteriaDomain(List<? extends W7001ShippingActInvoiceDomain> invoiceList, String dateFormat) {
        List<W7007ListDomain> listDomainList = new ArrayList<W7007ListDomain>();

        for(W7001ShippingActInvoiceDomain invoiceDomain : invoiceList) {
            W7007ListDomain listDomain = new W7007ListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain);
            
            // Invoice date of issue
            // インボイス発行日
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //listDomain.setInvoiceIssueDt(DateUtil.formatDate(invoiceDomain.getInvoiceIssueDt(), dateFormat));
            listDomain.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            
            // When loading track record status is "20" (Complete Doc attach), it is check box non-activity. 
            // 船積実績ステータスが"20"(Complete Doc attach)の場合、チェックボックス非活性
            if (SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(listDomain.getShippingActStatus())) {
                listDomain.setDisabledFlg(FLAG_Y);
            }
            
            listDomainList.add(listDomain);
        }
        return listDomainList;
    }
}
