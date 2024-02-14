/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * Shipping Confirmation form output facade service implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のShipping Confirmation帳票出力facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004SearchFacadeService
 * </pre>
 *
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class W5004PrintConfirmationFacadeServiceImpl extends
    AbstractTransactFacadeService<File, W5004CriteriaDomain> {

    /**
     * shipping confirm service.
     */
    protected W5001ShippingFirmService w5001ShippingFirmService;

    /**
     * constructor.
     */
    public W5004PrintConfirmationFacadeServiceImpl() {
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
    protected W5004CriteriaDomain filterDomain(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
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
    protected void validateItems(W5004CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W5004CriteriaDomain criteriaDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to print the Shipping Confirmation form
     * <br />Shipping Confirmation帳票を印刷するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W5001ShippingFrimDomain shippingFrimDomain than criteriaDomain
     * - Call of W5001ShippingFirmService.printShippingFirm an argument shippingFrimDomain
     * - Return the result of the call W5001ShippingFirmService.printShippingFirm
     *
     * - criteriaDomainよりW5001ShippingFrimDomain shippingFrimDomainに検索条件を移送
     * - shippingFrimDomainを引数にW5001ShippingFirmService.printShippingFirmの呼び出し
     * - W5001ShippingFirmService.printShippingFirmの呼び出し結果を返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W5001ShippingFirmDomain domain = new W5001ShippingFirmDomain();
        // UT429 MOD START
        //domain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        //domain.setOwnerCompCd(criteriaDomain.getOwnerCompCd());
        //domain.setLocale(criteriaDomain.getLocale());
        CommonUtil.copyPropertiesDomainToDomain(domain, criteriaDomain);
        // UT429 MOD END

        return w5001ShippingFirmService.printShippingFirm(domain, criteriaDomain.getReportDateFormat());
    }
}
