/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * This is an implement class of the Facade service to Init action of a Packaging Instruction (=Pull) Header screen.
 * <br />梱包指示Header画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2002InitFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2002InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W2002CriteriaDomain> {

    /**
     * Packaging Instruction (=Pull) service
     * <br/>梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2002InitFacadeServiceImpl() {
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
    protected W2002CriteriaDomain filterDomain(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateDatabase(W2002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a search-condition domain
     *       {@link W2001PltzInstrCriteriaDomain} is created and a DSC-ID is set up.
     *
     * A delete of - Palletize Instruction Item No Work
     *       {@link W2001PltzInstrService#deleteOnHeaderInit(W2001PltzInstrItemCriteriaDomain)} is called,
     *       The Palletize Instruction Item No Work which the login user registered is deleted.
     *
     * - 検索条件ドメインの作成
     *     {@link W2001PltzInstrCriteriaDomain}を作成し、DSC-IDを設定する
     * 
     * - 梱包指示品目番号ワークの削除
     *     {@link W2001PltzInstrService#deleteOnHeaderInit(W2001PltzInstrItemCriteriaDomain)}を呼出し、
     *     ログインユーザが登録した梱包指示品目番号ワークを削除する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2002CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Create of a condition domain
        // 条件ドメインの作成
        W2001PltzInstrItemCriteriaDomain pltzInstrCriteria = createPltzInstrItemCriteria(criteriaDomain);
        
        // A delete of Palletize Instruction Item No Work
        // 梱包指示品目番号ワークの削除
        deletePltzInstrItemNo(pltzInstrCriteria);
        
        return null;
    }

    /**
     * The condition domain of Packaging Instruction (=Pull) service is created.
     * <br />梱包指示サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a Packaging Instruction (=Pull) Header screen<br />梱包指示Header画面の検索条件ドメイン
     * @return The condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの条件ドメイン
     */
    protected W2001PltzInstrItemCriteriaDomain createPltzInstrItemCriteria(W2002CriteriaDomain criteriaDomain) {
        // Create of a condition domain
        // 条件ドメインの作成
        W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria = new W2001PltzInstrItemCriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(pltzInstrItemCriteria, criteriaDomain);
        
        // A setting of DSC-ID
        // DSC-IDの設定
        pltzInstrItemCriteria.setDscId(criteriaDomain.getLoginUserDscId());

        return pltzInstrItemCriteria;
    }

    /**
     * A Palletize Instruction Item No Work is deleted.
     * <br />梱包指示品目番号ワークを削除します。
     *
     * @param pltzInstrItemCriteria The condition domain of a Palletize Instruction Item No Work<br />梱包指示品目番号ワークの条件ドメイン
     * @throws ApplicationException When a Palletize Instruction Item No Work cannot be deleted<br />梱包指示品目番号ワークが削除できない場合
     */
    protected void deletePltzInstrItemNo(W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria) throws ApplicationException {
        w2001PltzInstrService.deleteOnHeaderInit(pltzInstrItemCriteria);
    }
}
