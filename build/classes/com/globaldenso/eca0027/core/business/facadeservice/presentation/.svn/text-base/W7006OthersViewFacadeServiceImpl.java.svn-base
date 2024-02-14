/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 *  Facade service for  OthersView action of shipping documents upload screen.
 * <br />船積書類アップロード画面のOthersViewアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11621 $
 */
public class W7006OthersViewFacadeServiceImpl extends AbstractProcessFacadeService<OutputStream, W7006UpdateDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7006OthersViewFacadeServiceImpl() {
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
    protected W7006UpdateDomain filterDomain(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
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
    protected void validateItems(W7006UpdateDomain updateDomain)
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
    protected void validateConsistency(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * File management get check.
     * Call  {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView}
     * </pre>
     * <pre>
     * ‐ファイル管理 取得チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        String shipperCd = criteriaDomain.getShipperCd();
        String invoiceNo = criteriaDomain.getInvoiceNo();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invoiceIssueDt = DateUtil.parseDate(criteriaDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
        Date invoiceIssueDt = criteriaDomain.getInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        BigDecimal brch = new BigDecimal(updateDomain.getListDomainList().get(criteriaDomain.getSelectedRow()).getBrch());
        
        // File manager The lock & number check 
        // ファイル管理 ロック＆取得件数チェック
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(shipperCd
            , invoiceNo, invoiceIssueDt, brch, criteriaDomain.getViewData())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected OutputStream callServices(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain.getW7006CriteriaDomain().getViewData();
    }
}
