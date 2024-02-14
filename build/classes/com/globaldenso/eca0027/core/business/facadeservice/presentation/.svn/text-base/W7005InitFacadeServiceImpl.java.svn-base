/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * A Facade Service with respect to the initial display action of B / L Update screen.
 * <br />船荷証券更新画面の初期表示アクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005InitFacadeServiceImpl extends AbstractSearchFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7005InitFacadeServiceImpl() {
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
    protected W7005CriteriaDomain filterDomain(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
    protected void validateConsistency(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
    protected void validateDatabase(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipping actuality service. 
     *      Convert to the {@link W7005CriteriaDomain} {@link W7001ShippingActCriteriaDomain}
     *      
     * - Get retrieval data .
     *      Call {@link W7001ShippingActService#searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7005CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐検索データの取得
     *     {@link W7001ShippingActService#searchOnBlUploadInit(W7001ShippingActCriteriaDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7005CriteriaDomain callServices(W7005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        W7001ShippingActDocDomain docDomain = w7001ShippingActService.searchOnBlUploadInit(shippingActCriteria);
        
        return convertToCriteriaDomain(docDomain);
    }
    
    /**
     * 
     * Create a condition of shipping actuality service domain.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Domain conditions of shipping actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipping actuality service domain<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7005CriteriaDomain criteriaDomain) {
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain);
        
        return shippintActCriteria;
    }
    
    /**
     * Convert shipping actuality domain to list a domain.
     * <br />船積実績ドメインをリストドメインに変換します。
     *
     * @param docDomain Search result<br />
     * 検索結果
     * @return Conversion result<br />
     * 変換結果
     */
    protected W7005CriteriaDomain convertToCriteriaDomain(W7001ShippingActDocDomain docDomain) {
        W7005CriteriaDomain criteriaDomain = new W7005CriteriaDomain();

        criteriaDomain.setFileName(docDomain.getFileName());
        criteriaDomain.setComUpdateTimestamp(docDomain.getComUpdateTimestamp());

        return criteriaDomain;
    }
}
