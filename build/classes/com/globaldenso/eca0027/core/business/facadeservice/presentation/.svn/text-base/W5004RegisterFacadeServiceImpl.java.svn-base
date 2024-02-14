/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5004;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * The Register service facade implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004RegisterFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9358 $
 */
public class W5004RegisterFacadeServiceImpl extends
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
    public W5004RegisterFacadeServiceImpl() {
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
            "etd",
            "carrierCompCd",
            "containerNo"
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
     * - The transfer your search criteria in W5001ShippingFirmDomain shippingFirmDomain than updateDomain.criteriaDomain
     * - Check not in the past day
     *     An argument shippingFirmDomain, check by calling W5001ShippingFirmService.validateDatabaseAfterDate
     *
     * - updateDomain.criteriaDomainよりW5001ShippingFirmDomain shippingFirmDomainに検索条件を移送
     * - 過去日でないチェック
     *    shippingFirmDomainを引数に、W5001ShippingFirmService.validateDatabaseAfterDateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Get input value.
        // 入力値の取得
        String etd = criteriaDomain.getEtd();
        
        Locale locale = criteriaDomain.getLocale();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check not in the past day
        // 過去日でないチェック
        if (!w5001ShippingFirmService.validateDatabaseAfterDate(etd,
            criteriaDomain.getScreenDateFormat(), criteriaDomain.getTimeZone())) {
            
            Object[] params = {
                commonService.getResource(locale, "label.etd")
            };
            MessageDomain msg = new MessageDomain("w5004CriteriaDomain.etd", NXS_E7_0070, params);
            
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
     * <pre>
     * - The transfer of header information to W5001ShippingFirmDomain shippingFirmDomain than updateDomain.criteriaDomain
     * - W / H Company, NEXUS W / H combination check
     *     An argument shippingFirmDomain, check by calling W5001ShippingFirmService.validateDatabaseWhCompanyWh
     * - Carrier existence check
     *     An argument shippingFirmDomain, check by calling W5001ShippingFirmService.validateDatabaseCarrier
     *
     * - updateDomain.criteriaDomainよりW5001ShippingFirmDomain shippingFirmDomainに検索条件を移送
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    shippingFirmDomainを引数に、W5001ShippingFirmService.validateDatabaseWhCompanyWhを呼び出してチェック
     * - Carrier存在チェック
     *    shippingFirmDomainを引数に、W5001ShippingFirmService.validateDatabaseCarrierを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W5004ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // Get input value.
        // 入力値の取得
        String whCompCd = criteriaDomain.getWhCompCd();
        String whCd = criteriaDomain.getWhCd();
        String carrierCompCd = criteriaDomain.getCarrierCompCd();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check combination.(W/H Company、NEXUS W/H)
        // 組み合わせチェック (W/H Company、NEXUS W/H)
        if (!w5001ShippingFirmService.validateDatabaseWhCompanyWh(whCompCd, whCd)) {
            Object[] params = {
                whCompCd,
                whCd
            };
            MessageDomain msgWhCompCd = new MessageDomain("criteriaDomain.whCompCd", GSCM_E0_0029, params);
            MessageDomain msgWhCd = new MessageDomain("criteriaDomain.whCd", null, null);
            
            errorList.add(msgWhCompCd);
            errorList.add(msgWhCd);
        }
        
        // Check presence of carrier.
        // carrier存在チェック
        if (!w5001ShippingFirmService.validateDatabaseCarrier(carrierCompCd)) {
            Object[] params = {
                carrierCompCd
            };
            MessageDomain msgCarrierCompCd = new MessageDomain("criteriaDomain.carrierCompCd", NXS_E7_0113, params);
            
            errorList.add(msgCarrierCompCd);
        }
        
        // Lock of palletizing, existence check, check status.
        // パレタイズのロック、存在チェック、ステータスチェック
        for (W5004ListDomain listDomain : listDomainList) {
            List<? extends MessageDomain> resultList = w5001ShippingFirmService.validateDatabaseTtPltzOnRegister(listDomain);
            
            if (0 < resultList.size()) {
                for (MessageDomain domain : resultList) {
                    errorList.add(domain);
                }
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
     * Call the service to register formally Shipping Confirmation being created
     * <br />作成中の出荷確認を正式に登録するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W5001ShippingFirmDomain shippingFirmDomain than updateDomain.criteriaDomain
     * - Set to shippingFirmDomain.cmlDomainList the updateDomain.listDomainList
     * - Shipping confirmation and registration
     *     Call the W5001ShippingFirmService.transactOnRegister an argument updateDomain
     *
     * - updateDomain.criteriaDomainよりW5001ShippingFirmDomain shippingFirmDomainに検索条件を移送
     * - updateDomain.listDomainListをshippingFirmDomain.cmlDomainListに設定
     * - 出荷確認登録
     *     updateDomainを引数にW5001ShippingFirmService.transactOnRegisterの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W5004ListDomain> callServices(W5004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W5001ShippingFirmDomain shippingFirm = w5001ShippingFirmService.transactOnRegister(updateDomain);
        
        // To switch to a transition from the Main screen display the results on the screen
        // 画面の表示結果をMain画面から遷移したように切り替える
        updateDomain.getCriteriaDomain().setCallScreenId(SCREEN_ID_W5001);
        
        return w5001ShippingFirmService.convertToListDomain(shippingFirm, updateDomain.getCriteriaDomain());
    }
}
