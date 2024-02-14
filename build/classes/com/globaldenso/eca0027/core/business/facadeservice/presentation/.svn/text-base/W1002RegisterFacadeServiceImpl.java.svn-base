/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0153;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1002UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of Export Request Register
 * <br />Export Request RegisterのRegisterFacadeサービス実装クラスです。
 * <pre>
 * bean id:W1002RegisterFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1002RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1002UpdateDomain, W1002UpdateDomain> {

    /**
     * W1001ExpRequestService
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    /**
     * Common service.
     */
    protected CommonService commonService;
    /**
     * service of Supplier Company Master <br />
     */
    protected TmSupplierWhXrefService tmSupplierWhXrefService;
    /**
     * constructor.
     */
    public W1002RegisterFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for tmSupplierWhXrefService.</p>
     *
     * @param tmSupplierWhXrefService Set for tmSupplierWhXrefService
     */
    public void setTmSupplierWhXrefService(TmSupplierWhXrefService tmSupplierWhXrefService) {
        this.tmSupplierWhXrefService = tmSupplierWhXrefService;
    }

    /**
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1002UpdateDomain filterDomain(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W1002CriteriaDomain> valid 
            = new Validator<W1002CriteriaDomain>(updateDomain.getCriteriaDomain(), "w1002CriteriaDomain");

        W1002CriteriaDomain w1002CriteriaDomain = updateDomain.getCriteriaDomain();
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // digit number, an attribute, form check (peculiar to a screen)  
        // 桁数、属性、書式チェック(画面固有)
        if (w1002CriteriaDomain.getDensoShipperTyp().equals(FLAG_Y)) {
            String[] typeOfShip = {
                "plantCd" ,
                "requestIssuerDeptNm" ,
                "issuerCompTel"
            };
            valid.isValidateProperties(typeOfShip, SCREEN_ID_W1002);
        }
        
        if (w1002CriteriaDomain.getReExpGoodsFlg().equals(FLAG_Y)) {
            String[] reExpGoodsFlg = {
                "impInvoiceNo1" ,
                "impInvoiceNo2"
            };
            valid.isValidateProperties(reExpGoodsFlg, SCREEN_ID_W1002);
        }
        
        if (CheckUtil.isBlankOrNull(w1002CriteriaDomain.getPriceTerms())) {
            String[] priceTerms = {
                "priceTerms1" ,
                "termsPoint"
            };
            valid.isValidateProperties(priceTerms, SCREEN_ID_W1002);
        }
        
        if (CheckUtil.isBlankOrNull(w1002CriteriaDomain.getTradeTerms())) {
            String[] tradeTerms = {
                "tradeTerms1"
            };
            valid.isValidateProperties(tradeTerms, SCREEN_ID_W1002);
        }
        
        if (w1002CriteriaDomain.getPrepareExpInvoiceCtgry().equals(FLAG_Y) && !w1002CriteriaDomain.getDensoShipperTyp().equals(FLAG_Y)) {
            String[] supplierInvoiceNo = {
                "supplierInvoiceNo"
            };
            valid.isValidateProperties(supplierInvoiceNo, SCREEN_ID_W1002);
        }
        
        String[] properties = {
            "densoShipperTyp" ,
            "shipperCd" ,
            "shipperName" ,
            "requestIssuerCompCd" ,
            "requestIssuerCompNm" ,
            "requestIssuerNm" ,
            "issuerCompNiceNet" ,
            "invoiceCtgry" ,
            "reExpGoodsFlg" ,
            "itemTyp" ,
            "description" ,
            "originCntryCd" ,
            "qtyUnit" ,
            "weightUnit" ,
            "customerShipTo" ,
            "accounteeCd" ,
            "consigneeCd" ,
            "consigneeCompNm" ,
            "consigneeCntryCd" ,
            "consigneeCompAddr" ,
            "consigneeCompTel" ,
            "shipToCd" ,
            "shipToCompNm" ,
            "shipToCntryCd" ,
            "shipToCompAddr" ,
            "shipToCompTel" ,
            "shipToCompDeptNm" ,
            "shipToAttnNm" ,
            "payMeth" ,
            "payTerms" ,
            "currCd" ,
            "priceTerms" ,
            "tradeTerms" ,
            "trnsCd" ,
            "containerSortingKey" ,
            "loadingCd" ,
            "stagingInstructionFlg" ,
            "splitShippingNgFlg" ,
            "requiredShipDt" ,
            "packingCompLocationFlg" ,
            "packingWhCd" ,
            "nexusWhCom" ,
            "packingCompDeptNm" ,
            "requestToPackingSec" ,
            "casemarkNotation" ,
            "freightResponsibleCd" ,
            "ctgryCd1" ,
            "ctgryCd2" ,
            "ctgryCd3" ,
            "budgetNo1" ,
            "budgetNo2" ,
            "budgetNo3" ,
            "jobNo1" ,
            "jobNo2" ,
            "jobNo3" ,
            "per1" ,
            "per2" ,
            "per3" ,
            "prepareExpInvoiceCtgry"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W1002);
        
        if (0 < valid.getErrList().size()) {
            errorList.addAll(valid.getErrList());
        }
        
        // Error check
        // エラー確認
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1002UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W1002CriteriaDomain w1002CriteriaDomain = updateDomain.getCriteriaDomain();
        
        // If the Shipper does not exist
        // Shipperが存在しない場合
        if (!w1001ExpRequestService.validateDatabaseShipper(w1002CriteriaDomain.getShipperCd())) {
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.shipperCd")
            };
            errorList.add(new MessageDomain("w1002CriteriaDomain.shipperCd", NXS_E7_0111, params));
        }
        
        // * - WS (Get Plant Info) check
        // * - WS(Get Plant Info)チェック
        if (w1002CriteriaDomain.getDensoShipperTyp().equals(FLAG_Y)) {
            try {
                if (!w1001ExpRequestService.validateDatabaseWs9002OnContensOfABoxRegister(w1002CriteriaDomain.getShipperCd(), w1002CriteriaDomain.getPlantCd())) {
                    Object[] params = {
                        commonService.getResource(updateDomain.getLocale(), "label.plntCd")
                    };
                    errorList.add(new MessageDomain("w1002CriteriaDomain.plantCd", NXS_E7_0153, params));
                }
            } catch (GscmApplicationException e) {
                if (NXS_E1_0060.equals(e.getCode())) {
                    Object[] params = {
                        commonService.getResource(updateDomain.getLocale(), "label.shipperCd")
                    };
                    errorList.add(new MessageDomain("w1002CriteriaDomain.shipperCd", e.getCode(), params));
                    throw new ValidationException(errorList);
                } else {
                    throw e;
                }
            }
        }
        
        // Company existence check
        // Company存在チェック
        if (!w1001ExpRequestService.validateDatabaseCompCd(w1002CriteriaDomain.getConsigneeCd())){
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.consigneeCd")
            };
            errorList.add(new MessageDomain("w1002CriteriaDomain.consigneeCd", NXS_E7_0071, params));
        }
        if (!commonService.validateShipTo(w1002CriteriaDomain.getShipToCd())){
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.nexusShipToCd")
            };
            errorList.add(new MessageDomain("w1002CriteriaDomain.shipToCd", NXS_E7_0071, params));
        }
        if (!w1001ExpRequestService.validateDatabaseCompCd(w1002CriteriaDomain.getNexusWhCom())){
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.nexusWhCom")
            };
            errorList.add(new MessageDomain("w1002CriteriaDomain.nexusWhCom", NXS_E7_0071, params));
        }
        if(w1002CriteriaDomain.getDensoShipperTyp() != null && w1002CriteriaDomain.getDensoShipperTyp().equalsIgnoreCase("N"))
        {
            if (!w1001ExpRequestService.validateDatabaseSupplierWhCompanyWhShipper(w1002CriteriaDomain.getNexusWhCom(), w1002CriteriaDomain.getPackingWhCd(), w1002CriteriaDomain.getShipperCd())) {
                Object[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.nexusWhCom"),
                    commonService.getResource(updateDomain.getLocale(), "label.nexusWhWh"),
                    commonService.getResource(updateDomain.getLocale(), "label.shipperCd")
                };
                MessageDomain msgCompCd = new MessageDomain("w1002CriteriaDomain.nexusWhCom", NXS_E7_3011, params);
                MessageDomain msgWhCd = new MessageDomain("w1002CriteriaDomain.packingWhCd", null, null);
                MessageDomain msgShipperCd = new MessageDomain("w1002CriteriaDomain.shipperCd", null, null);
                errorList.add(msgCompCd);
                errorList.add(msgWhCd);
                errorList.add(msgShipperCd);
            }
        }else{
            if (!w1001ExpRequestService.validateDatabaseWhCompanyWhShipper(w1002CriteriaDomain.getNexusWhCom(), w1002CriteriaDomain.getPackingWhCd(), w1002CriteriaDomain.getShipperCd())) {
                Object[] params = {
                    commonService.getResource(updateDomain.getLocale(), "label.nexusWhCom"),
                    commonService.getResource(updateDomain.getLocale(), "label.nexusWhWh"),
                    commonService.getResource(updateDomain.getLocale(), "label.shipperCd")
                };
                MessageDomain msgCompCd = new MessageDomain("w1002CriteriaDomain.nexusWhCom", NXS_E7_3011, params);
                MessageDomain msgWhCd = new MessageDomain("w1002CriteriaDomain.packingWhCd", null, null);
                MessageDomain msgShipperCd = new MessageDomain("w1002CriteriaDomain.shipperCd", null, null);
                errorList.add(msgCompCd);
                errorList.add(msgWhCd);
                errorList.add(msgShipperCd);
            }

            //Check  User Athority ISSUE 108
            if (!w1001ExpRequestService.validateConsistencyShipperPlantAuth(w1002CriteriaDomain.getShipperCd(), w1002CriteriaDomain.getPlantCd())) {
                MessageDomain msgShipperCd = new MessageDomain("w1002CriteriaDomain.shipperCd", GSCM_I0_0009, null);
                MessageDomain msgPlntCd = new MessageDomain("w1002CriteriaDomain.plantCd", null, null);
                
                errorList.add(msgShipperCd);
                errorList.add(msgPlntCd);
            }
        }

        // ISSUE 110
        if(w1002CriteriaDomain.getDensoShipperTyp() != null && w1002CriteriaDomain.getDensoShipperTyp().equalsIgnoreCase("N")){
            TmSupplierWhXrefCriteriaDomain tmSupplierWhXrefCriteriaDomain = new TmSupplierWhXrefCriteriaDomain();
            tmSupplierWhXrefCriteriaDomain.setCompCd(w1002CriteriaDomain.getNexusWhCom());
            tmSupplierWhXrefCriteriaDomain.setWhCd(w1002CriteriaDomain.getPackingWhCd());
            tmSupplierWhXrefCriteriaDomain.setSupplierCompCd(w1002CriteriaDomain.getShipperCd());
            List<TmSupplierWhXrefDomain> resultList = tmSupplierWhXrefService.searchByCondition(tmSupplierWhXrefCriteriaDomain);
            if(resultList != null && resultList.size() > 0)
            {
                TmSupplierWhXrefDomain result = resultList.get(0);
                w1002CriteriaDomain.setPlantCd(result.getSupplierPlntCd());
            }
        }

        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1002UpdateDomain callServices(W1002UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // A create of Export Request domain
        // まとめパレタイズドメインの作成
        W1001ExpRequestDomain expRequest = createExpRequest(updateDomain);
        W1002CriteriaDomain w1002CriteriaDomain = new W1002CriteriaDomain();
        String mode = updateDomain.getCriteriaDomain().getProcMode();
        if (MODE_EDIT.equals(mode) || MODE_REF.equals(mode)) {
            w1002CriteriaDomain = w1001ExpRequestService.transactOnEdit(expRequest);
        }else if (MODE_NEW.equals(mode) || MODE_COPY_NEW.equals(mode)) {
            // Execution of registration processing
            w1002CriteriaDomain = w1001ExpRequestService.transactOnRegister(expRequest);
        }
       
        
        return convertToUpdateDomain(w1002CriteriaDomain);
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#createExpRequest(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected W1001ExpRequestDomain createExpRequest(W1002UpdateDomain updateDomain) {
        
        W1001ExpRequestDomain expRequest = new W1001ExpRequestDomain();
        
        // A setting domain
        CommonUtil.copyPropertiesDomainToDomain(expRequest, updateDomain.getCriteriaDomain(), updateDomain.getCriteriaDomain().getScreenDateFormat());
        expRequest.setPackingCompCd(updateDomain.getCriteriaDomain().getNexusWhCom());
        return expRequest;
    }
    
    /**
     * {@inheritDoc}.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#convertToUpdateDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    protected W1002UpdateDomain convertToUpdateDomain(W1002CriteriaDomain w1002CriteriaDomain) {
        
        W1002UpdateDomain updateDomain = new W1002UpdateDomain();
        // A setting of a Criteria domain
        updateDomain.setCriteriaDomain(w1002CriteriaDomain);
        
        return updateDomain;
    }
}
