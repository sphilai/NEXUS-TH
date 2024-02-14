/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * The Facade Service with respect to the initial display of action Shipping Actuality Main screen.
 * <br />船積実績Main画面の初期表示アクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W7001CriteriaDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001InitFacadeServiceImpl() {
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
     * 
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
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7001CriteriaDomain criteriaDomain)
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
     * 
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
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create conditions domain
     *   Create the W7001ShippingActCriteriaDomain, to set the DSC-ID
     * 
     * - Delete the Shipping Actuality Invoice Work
     *   Call the (W7001ShippingActCriteriaDomain) W7001ShippingActService.deleteOnMainInit, 
     *   Remove the Shipping Actuality Invoice Work the logged-in user has registered
     *
     * </pre>
     * <pre>
     * ‐条件ドメインの作成
     *     {@link W7001ShippingActCriteriaDomain}を作成し、DSC-IDを設定する
     *     
     * ‐船積実績対象インボイスワークの削除
     *     {@link W7001ShippingActService#deleteOnMainInit(W7001ShippingActCriteriaDomain)}を呼出し、
     *     ログインユーザが登録した船積実績対象インボイスワークを削除する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W7001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(criteriaDomain);
        
        // Delete of Palletize Instruction Item No Work.
        // 梱包指示品目番号ワークの削除
        deleteShippingActInvoice(shippingActCriteria);
        
        return null;
    }
    
    /**
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain conditions of domain Shipping Actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     *      *
     * @return Conditions of domain Shipping Actuality Service<br /> 
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7001CriteriaDomain criteriaDomain) {
        // Creation of conditions domain.
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Creation of conditions domain.
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain);
        shippintActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return shippintActCriteria;
    }
    
    /**
     * Delete of Shipping Actuality Invoice Work.
     * <br />船積実績対象インボイスワークの削除
     * 
     * @param shippintActCriteria Conditions of domain Shipping Actuality Service<br /> 
     * 船積実績サービスの条件ドメイン
     * 
     * @throws ApplicationException If Shipping Actuality Invoice Work can not be removed<br />
     * 船積実績対象インボイスワークが削除できない場合
     */
    protected void deleteShippingActInvoice(W7001ShippingActCriteriaDomain shippintActCriteria) 
        throws ApplicationException {
        // Delete of Shipping Actuality Invoice Work
        // 船積実績対象インボイスワークを削除
        w7001ShippingActService.deleteOnMainInit(shippintActCriteria);
    }
}
