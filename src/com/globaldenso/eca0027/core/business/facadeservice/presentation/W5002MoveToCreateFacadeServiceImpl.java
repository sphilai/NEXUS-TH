/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5002;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Move to Create service facade implementation class of Shipping Confirmation Header screen
 * <br />出荷確認Header画面のMove to Create facadeサービス実装クラスです。
 * <pre>
 * bean id:w5002MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5002MoveToCreateFacadeServiceImpl extends
    AbstractProcessFacadeService<Void, W5002CriteriaDomain> {
    
    /**
     * shipping confirm service.
     */
    protected W5001ShippingFirmService w5001ShippingFirmService;
    
    /**
     * constructor.
     */
    public W5002MoveToCreateFacadeServiceImpl() {
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
    protected W5002CriteriaDomain filterDomain(W5002CriteriaDomain criteriaDomain)
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
    protected void validateItems(W5002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        Validator<W5002CriteriaDomain> valid
            = new Validator<W5002CriteriaDomain>(criteriaDomain, "w5002CriteriaDomain");
        
        // Set the label name still need to be examined.
        // チェックが必要なラベル名を設定する。
        String[] properties = {
            "whCompCd",
            "whCd",
            "trnsCd",
            "containerSortingKey"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W5002);
        
        // Confirmation of error.
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
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
    protected void validateConsistency(W5002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - The transfer of header information to W5001StgCriteriaDomain stgCriteriaDomain than criteriaDomain
     * - W / H Company, NEXUS W / H combination check
     *     An argument stgCriteriaDomain, check by calling W5001ShippingFirmService.validateDatabaseWhCompanyWh
     *
     * - criteriaDomainよりW5001StgCriteriaDomain stgCriteriaDomainにヘッダ情報を移送
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    stgCriteriaDomainを引数に、W5001ShippingFirmService.validateDatabaseWhCompanyWhを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        
        // Get input value.
        // 入力値の取得
        String whCompCd = criteriaDomain.getWhCompCd();
        String whCd = criteriaDomain.getWhCd();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check combination.(W/H Company、NEXUS W/H)
        // 組み合わせチェック (W/H Company、NEXUS W/H)
        if (!w5001ShippingFirmService.validateDatabaseWhCompanyWh(whCompCd, whCd)) {
            Object[] params = {
                whCompCd,
                whCd
            };
            MessageDomain msgWhCompCd = new MessageDomain("w5002CriteriaDomain.whCompCd", GSCM_E0_0029, params);
            MessageDomain msgWhCd = new MessageDomain("w5002CriteriaDomain.whCd", null, null);
            
            errorList.add(msgWhCompCd);
            errorList.add(msgWhCd);
        }
        
        // Confirmation of error.
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W5002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}
