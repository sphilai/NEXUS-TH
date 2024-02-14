/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0006;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * The Register Working service facade implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のRegister Working facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004SearchFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004RegisterWorkingFacadeServiceImpl extends
    AbstractTransactFacadeService<List<? extends W5004ListDomain>, W5004UpdateDomain> {
    
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
    public W5004RegisterWorkingFacadeServiceImpl() {
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
     *
     * - 出荷確認のロック
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
        
        // Lock of shipping confirmation data.
        // 出荷確認データのロック
        if (!w5001ShippingFirmService.validateDatabaseTtShippingFirmOnRegisterWorking(criteriaDomain.getShippingFirmNo())) {
            
            MessageDomain msg = new MessageDomain("", NXS_E1_0006, null);
            errorList.add(msg);
        }
        
        // Confirmation of error.
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * Call the service to be updated to "Shipping Confirmation Actuality" the status of the Shipping Confirmation
     * <br />出荷確認のステータスを"出荷実績"に更新するサービスを呼び出します。
     * <pre>
     * - The transfer of header information to W5001ShippingFrimDomain shippingFrimDomain than criteriaDomain 
     * - Status updates of shipping confirmation 
     *     Call the W5001ShippingFirmService.updateOnRegisterWorking an argument shippingFrimDomain
     *
     * - criteriaDomainよりW5001ShippingFrimDomain shippingFrimDomainにヘッダ情報を移送
     * - 出荷確認のステータス更新
     *       shippingFrimDomainを引数にW5001ShippingFirmService.updateOnRegisterWorkingの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W5004ListDomain> callServices(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        W5001ShippingFirmDomain shippingFirmDomain = new W5001ShippingFirmDomain();
        shippingFirmDomain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        shippingFirmDomain.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestamp());
        
        W5001ShippingFirmDomain shippingFirm = w5001ShippingFirmService.transactOnRegisterWorking(criteriaDomain);
        
        return w5001ShippingFirmService.convertToListDomain(shippingFirm, criteriaDomain);
    }
}
