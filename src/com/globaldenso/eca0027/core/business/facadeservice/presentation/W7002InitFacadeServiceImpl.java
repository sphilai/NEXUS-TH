/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * The Facade Service with respect to the initial display of action Shipping Actuality Header screen.
 * <br />船積実績Header画面の初期表示アクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12515 $
 */
public class W7002InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W7002CriteriaDomain> {

    /**
     * The shipping service performance.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7002InitFacadeServiceImpl() {
        super();
    }
    
    /**
     * Setter method for w7001ShippingActService.
     *
     * @param shippingActService Set for w7001ShippingActService
     */
    public void setW7001ShippingActService(
        W7001ShippingActService shippingActService) {
        w7001ShippingActService = shippingActService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7002CriteriaDomain filterDomain(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * The physical delete the shipment performance target invoice work. 
     * - Create conditions domain
     *     Create a {@link W7001ShippingActCriteriaDomain}, to set the DSC-ID.
     *     
     * - Delete shipment of performance target invoice work
     *     call the {@link W7001ShippingActService#deleteOnHeaderInit(W7001ShippingActCriteriaDomain)}.
     *     Remove the shipment performance target invoice work the logged-in user has registered.
     * </pre>
     * 
     * <pre>
     * 船積実績対象インボイスワークを物理削除
     * ‐条件ドメインの作成
     *     {@link W7001ShippingActCriteriaDomain}を作成し、DSC-IDを設定する
     *     
     * ‐船積実績対象インボイスワークの削除
     *     {@link W7001ShippingActService#deleteOnHeaderInit(W7001ShippingActCriteriaDomain)}を呼出し、
     *     ログインユーザが登録した船積実績対象インボイスワークを削除する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        // Delete of Shipping Actuality Invoice Work
        // 船積実績対象インボイスワークの削除
        deleteShippingActInvoice(shippingActCriteria);
        
        return null;
    }
    
    /**
     * Create the condition of shipment domain service performance.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Domain conditions of shipment performance Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7002CriteriaDomain criteriaDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain);
        shippintActCriteria.setDscId(criteriaDomain.getLoginUserDscId()); // IN195 ADD
        
        return shippintActCriteria;
    }
    
    /**
     * Delete shipment of performance target invoice work.
     * <br />船積実績対象インボイスワークの削除
     *
     * @param shippintActCriteria Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     * @throws ApplicationException If the shipment performance target invoice work can not be removed.<br />
     * 船積実績対象インボイスワークが削除できない場合
     */
    protected void deleteShippingActInvoice(W7001ShippingActCriteriaDomain shippintActCriteria) throws ApplicationException {
        // Delete of Shipping Actuality Invoice Work
        // 船積実績対象インボイスワークを削除
        w7001ShippingActService.deleteOnHeaderInit(shippintActCriteria);
    }
}