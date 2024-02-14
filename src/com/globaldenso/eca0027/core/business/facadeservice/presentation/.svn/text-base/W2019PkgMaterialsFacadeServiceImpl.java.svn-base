/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * This is an implement class of the Facade service to PkgMaterials action of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のPkgMaterialsアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id : W2019PkgMaterialsFacade
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2019PkgMaterialsFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2019CriteriaDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * constructor.
     */
    public W2019PkgMaterialsFacadeServiceImpl() {
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
    protected W2019CriteriaDomain filterDomain(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Nothing
     * 
     * - なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateDatabase(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A delete of Palletize Item Package Work
     *
     * - Registration of Palletize Item Package Work (registration of an initial data)  
     *       Palletize Item
     *
     * - Registration of Palletize Item Package Work (registration of exterior sign alteration data)  
     *       Registration of a Dunnage
     *         Palletize Item
     *       Registration of imported wood
     *         Packing combination master (details)
     *         PKG Materials MA
     *         PKG Materials Name MA
     *         NEXUS Company Master
     *
     * - Setting of a session
     * 
     * - パレタイズ対象品PKGワークの削除
     *     
     * - パレタイズ対象品PKGワークの登録（初期データの登録）
     *     パレタイズ対象品
     * 
     * - パレタイズ対象品PKGワークの登録（外装記号変更データの登録）  
     *     内材の登録
     *       パレタイズ対象品
     *     外材の登録
     *       包装組合せ原単位（明細）
     *       包装材原単位
     *       包装材名称原単位
     *       NEXUS会社原単位
     *       
     * - セッションの設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2019CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        if (FLAG_N.equals(criteriaDomain.getPackagingConfirmedFlg())) {
        
            W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
            List<MessageDomain> errorMessages = new ArrayList<MessageDomain>();
            
            // The information from a screen is set to criteria.
            // criteria に画面からの情報を設定する。
            CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
            // Execution of registration processing
            // 登録処理の実行
            w2009CmlService.transactOnTransRevisePkgMaterials(criteria, errorMessages);
            
            // When an error is during registration processing
            // 登録処理中にエラーがあった場合
            if (errorMessages.size() > 0) {
                throw new ValidationException(errorMessages);
            }
        }
        
        return null;
    }
    
}
