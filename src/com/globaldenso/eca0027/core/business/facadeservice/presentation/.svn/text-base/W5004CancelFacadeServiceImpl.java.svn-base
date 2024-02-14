/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * The Cancel service facade implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のCancel facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004CancelFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004CancelFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W5004UpdateDomain> {

    /**
     * common service.
     */
    protected CommonService commonService;
    
    /**
     * shipping confirm service.
     */
    protected W5001ShippingFirmService w5001ShippingFirmService;

    /**
     * constructor.
     */
    public W5004CancelFacadeServiceImpl() {
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
     * Setter method for w5001ShippingFirmService.
     *
     * @param w5001ShippingFirmService Set for w5001ShippingFirmService
     */
    public void setW5001ShippingFirmService(W5001ShippingFirmService w5001ShippingFirmService) {
        this.w5001ShippingFirmService = w5001ShippingFirmService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W5004UpdateDomain filterDomain(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        return updateDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Consistency check of the DB.
     * <br />DB整合性チェックを実施する
     * <pre>
     * - Lock of shipping confirmation
     * - Process check and Lock of palletizing
     *
     * - 出荷確認のロック
     * - パレタイズのロックと工程チェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Lock of shipping confirmation.
        // 出荷確認のロック
        w5001ShippingFirmService.validateDatabaseTtShippingFirmOnRegisterCancel(criteriaDomain.getShippingFirmNo());
        
        // Process check and Lock of palletizing
        // パレタイズのロック
        List<? extends MessageDomain> resultList = 
            w5001ShippingFirmService.validateDatabaseTtPltzOnRegisterCancel(criteriaDomain.getShippingFirmNo());
        if (0 < resultList.size()) {
            for (MessageDomain domain : resultList) {
                errorList.add(domain);
            }
        }
        
        // Confirmation of error.
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * call the service to cancel the shipping confirmation
     * <br />出荷確認をキャンセルするサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W5001ShippingFrimDomain shippingFrimDomain than criteriaDomain 
     * - Cancellation of already created shipping confirmation 
     *     Call W5001ShippingFirmService.transactOnRegisterCancel an argument shippingFrimDomain
     *
     * - criteriaDomainよりW5001ShippingFrimDomain shippingFrimDomainに検索条件を移送
     * - 作成済み出荷確認のキャンセル
     *       shippingFrimDomainを引数にW5001ShippingFirmService.transactOnRegisterCancelの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        w5001ShippingFirmService.transactOnRegisterCancel(updateDomain);
        
        return null;
    }
    
}
