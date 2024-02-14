/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5004;

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
import com.globaldenso.gscm.framework.util.Validator;


/**
 * The Register Working service facade implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のRegister Working facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004SearchFacadeService
 * </pre>
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 8612 $
 */
public class W5004ReUpdateContainerNoFacadeServiceImpl extends
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
    public W5004ReUpdateContainerNoFacadeServiceImpl() {
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
     * - Common error checking
     *
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W5004CriteriaDomain> valid
            = new Validator<W5004CriteriaDomain>(criteriaDomain, "w5004CriteriaDomain");
        
        // Set the label name still need to be examined.
        // チェックが必要なラベル名を設定する。
        String[] properties = {
            "containerNo",
        };
        valid.isValidateProperties(properties, SCREEN_ID_W5004);
        
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
    protected void validateConsistency(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Consistency check of the DB.
     * <br />DB整合性チェックを実施する
     * <pre>
     * - Lock of shipping confirmation
     * - Lock of palletizing
     *
     * - 出荷確認のロック
     * - パレタイズのロック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Lock of shipping confirmation.
        // 出荷確認のロック
        w5001ShippingFirmService.validateDatabaseTtShippingFirmOnRegisterReUpdateContainerNo(criteriaDomain.getShippingFirmNo());
        
        // Lock of palletizing.
        // パレタイズのロック
        List<? extends MessageDomain> resultList = 
            w5001ShippingFirmService.validateDatabaseTtPltzOnRegisterReUpdateContainerNo(criteriaDomain.getShippingFirmNo());
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
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
     * Call the service to update the container of NO Shipping Confirmation
     * <br />出荷確認のコンテナNOを更新するサービスを呼び出します。
     * <pre>
     * - The transfer of header information to W5001ShippingFrimDomain shippingFrimDomain than criteriaDomain 
     * - Status updates of shipment confirmation 
     *     Call the W5001ShippingFirmService.updateOnRegisterReUpdateContainerNo an argument shippingFrimDomain
     *
     * - criteriaDomainよりW5001ShippingFrimDomain shippingFrimDomainにヘッダ情報を移送
     * - 出荷確認のステータス更新
     *       shippingFrimDomainを引数にW5001ShippingFirmService.updateOnRegisterReUpdateContainerNoの呼び出し
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
        
        W5001ShippingFirmDomain shippingFirm = w5001ShippingFirmService.transactOnRegisterReUpdateContainerNo(criteriaDomain);
        
        return w5001ShippingFirmService.convertToListDomain(shippingFirm, criteriaDomain);
    }
}
