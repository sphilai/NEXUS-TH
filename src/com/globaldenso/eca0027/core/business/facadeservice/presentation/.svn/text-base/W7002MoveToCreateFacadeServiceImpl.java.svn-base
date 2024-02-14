/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0109;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7002;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * 
 * The service to the Facade Move to Create action of Shipping Actuality Header screen.
 * <br />船積実績Header画面のMove to Createアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12132 $
 */
public class W7002MoveToCreateFacadeServiceImpl extends AbstractProcessFacadeService<Void, W7002CriteriaDomain> {

    /**
     * The shipping service performance.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7002MoveToCreateFacadeServiceImpl() {
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
     * - Common error check .
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W7002CriteriaDomain> valid 
            = new Validator<W7002CriteriaDomain>(criteriaDomain, "w7002CriteriaDomain");
        
        // Single item check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "consigneeCd",
            "shipToCompCd",
            "trnsCd",
            "freightResponsibleCd",
            "autoInvoiceRegisterFlg"
        };
        
        valid.isValidateProperties(properties, SCREEN_ID_W7002);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Authorization check for screen input value.
     * ‐画面入力値の権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        // Creating an Error List
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // Authority check(INVOICE SHIPPER CODE)
        // 権限チェック（荷主コード）
        if(!w7001ShippingActService.validateConsistencyShipperAuth(criteriaDomain.getShipperCd())) {
            MessageDomain msgShipperCd = new MessageDomain("w7002CriteriaDomain.shipperCd", NXS_E7_0111, null);
            errorList.add(msgShipperCd);
        }

        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check the existence of the following. 
     *  - Shipper existence check .
     *  - Consignee existence check .
     *  - NEXUS Ship to Com. Existence check.
     * </pre>
     * <pre>
     * 下記の存在チェックを行います。
     * ‐Shipper存在チェック
     * ‐Consignee存在チェック
     * ‐NEXUS Ship to Com.存在チェック
     * <pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        // Creating an Error List
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Shipper existence check
        // Shipper存在チェック
        if (!w7001ShippingActService.validateDatabaseShipper(criteriaDomain.getShipperCd())) {
            MessageDomain msgShipperCd = new MessageDomain("w7002CriteriaDomain.shipperCd", NXS_E7_0111, null);
            errorList.add(msgShipperCd);
        }
        
        // Consignee existence check
        // Consignee存在チェック
        // UT280 Consigneeの入力があれば実施するように変更
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getConsigneeCd())) {
            if (!w7001ShippingActService.validateDatabaseConsignee(criteriaDomain.getConsigneeCd())) {
                MessageDomain msgConsigneeCd = new MessageDomain("w7002CriteriaDomain.consigneeCd", NXS_E7_0109, null);
                errorList.add(msgConsigneeCd);
            }
        }
        
        // NEXUS Ship to Com. Existence check
        // NEXUS Ship to Com.存在チェック
        if (!w7001ShippingActService.validateDatabaseCompCd(criteriaDomain.getShipToCompCd())) {
            MessageDomain msgShipToCompCd = new MessageDomain("w7002CriteriaDomain.shipToCompCd", NXS_E7_0071, null);
            errorList.add(msgShipToCompCd);
        }

        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W7002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No action
        // 処理なし
        return null;
    }
}