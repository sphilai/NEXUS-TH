/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0069;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0074;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0045;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9008;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  An implementation class of facade service for register action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Edit画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9008RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<Integer, W9008UpdateDomain> {

    /**
     * Exp. Ship To Shipping MA service<br />
     * Exp Ship To Shipping MAのサービス
     */
    protected W9007ExpShipToShippingMaService w9007ExpShipToShippingMaService;
    
    /**
     * Common service<br />
     * 共通サービス
     */
    protected CommonService commonService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9008RegisterFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w9007ExpShipToShippingMaService.
     *
     * @param expShipToShippingMaService Set for w9007ExpShipToShippingMaService
     */
    public void setW9007ExpShipToShippingMaService(W9007ExpShipToShippingMaService expShipToShippingMaService) {
        w9007ExpShipToShippingMaService = expShipToShippingMaService;
    }

    /**
     * Getter method for commonService.
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
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
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9008UpdateDomain filterDomain(W9008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check
     * For details, see screen definition document _ECA0027_W9008_Export Ship to Shipping MA Inquiry.xls.
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     *     詳細は画面定義書_ECA0027_W9008_Export Ship to Shipping MA Edit.xls「画面項目定義」を参照
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        W9008CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W9008CriteriaDomain> valid 
            = new Validator<W9008CriteriaDomain>(criteriaDomain, "w9008CriteriaDomain");
        Validator<W9008CriteriaDomain> valid2 
            = new Validator<W9008CriteriaDomain>(criteriaDomain, "w9008CriteriaDomain");

        
        valid2.isFill("shipToCompCd", SCREEN_ID_W9008);
        if (0 < valid2.getErrList().size()) {
            errList.add(new MessageDomain( valid2.getErrList().get(0).getProperty(), GSCM_E0_0011,
                new Object[] {commonService.getResource( criteriaDomain.getLocale(), "label.nexusShipToCd")}));
        }
        if(valid2.getErrList().size() == 0){
            valid2.isPermittedAttr("shipToCompCd", SCREEN_ID_W9008);
            if (0 < valid2.getErrList().size()) {
                errList.add(new MessageDomain( valid2.getErrList().get(0).getProperty(), GSCM_E0_0015,
                    new Object[] {commonService.getResource( criteriaDomain.getLocale(), "label.nexusShipToCd")}));
            }
        }
        if(valid2.getErrList().size() == 0){
            valid2.isPermittedFormat("shipToCompCd", SCREEN_ID_W9008);
            if (0 < valid2.getErrList().size()) {
                errList.add(new MessageDomain( valid2.getErrList().get(0).getProperty(), GSCM_E0_0018,
                    new Object[] {commonService.getResource( criteriaDomain.getLocale(), "label.nexusShipToCd")}));
            }
        }
        
        String[] properties = {
            "aplyStrtDt",
            "containerSortingKey",
            "loadingCd",
            "labelPrintNum",
            "singlePltzQrFlg", // NL047 ADD
            "containerLooseTyp",
            "customTimingTyp",
            "packingSummaryAtchFlg" // NL023 ADD
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9008);

        if (0 < valid.getErrList().size()) {
            errList.addAll(valid.getErrList());
        }

        // Check of Invoice Template list area 
        // Invoice Template一覧エリア チェック
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W9008ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            Validator<W9008ListDomain> listValid
                = new Validator<W9008ListDomain>(listDomain, "listDomainList", i);
    
            String[] listProperties = { 
                "docNo"
            };
            listValid.isValidateProperties(listProperties, SCREEN_ID_W9008);

            if (0 < listValid.getErrList().size()) {
                errList.add(new MessageDomain( listValid.getErrList().get(0).getProperty(), GSCM_E0_0011,
                    new Object[] {commonService.getResource( criteriaDomain.getLocale(), "label.invTemplate")}));
            }
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Past date check
     * Correlation check
     * </pre>
     * <pre>
     * 過去日チェック
     * 相関チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        String date = updateDomain.getCriteriaDomain().getAplyStrtDt();
        String format = updateDomain.getScreenDateFormat();
        String compCd = updateDomain.getCriteriaDomain().getShipperCd();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // check of a past day
        // 過去日チェック
        if(!w9007ExpShipToShippingMaService.validateConsistencyApplyStartDate(date, format, compCd)){
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.aplyStrtDt")
            };
            MessageDomain msg = new MessageDomain("w9008CriteriaDomain.aplyStrtDt", NXS_E7_0070, params);
            errorList.add(msg);
        }
        String cl = updateDomain.getCriteriaDomain().getContainerLooseTyp();
        String ccType = updateDomain.getCriteriaDomain().getCustomTimingTyp();
        
        // Combination check 
        // 相関チェック
        if(!w9007ExpShipToShippingMaService.validateConsistencyCLAndCCCorrelative(cl, ccType)){
            Object[] params = {
                commonService.getResource(updateDomain.getLocale(), "label.containerLooseTyp")
            };
            MessageDomain msgCl = new MessageDomain("w9008CriteriaDomain.containerLooseTyp", NXS_E7_0069, params);
            MessageDomain msgCcType = new MessageDomain("w9008CriteriaDomain.customTimingTyp", null, null);
            errorList.add(msgCl);
            errorList.add(msgCcType);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check for the existence of NEXUS Ship to
     * Check for the existence of shipper
     * Check combination
     * </pre>
     * <pre>
     * NEXUS Ship to存在チェック
     * Shipper存在チェック
     * 組合せチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of NEXUS Ship to existence 
        // NEXUS Ship to存在チェック
        String shipTo = updateDomain.getCriteriaDomain().getShipToCompCd();
        
        if(!w9007ExpShipToShippingMaService.validateDatabaseOnEditRegisterByShipTo(shipTo)){
            MessageDomain msgShipTo = new MessageDomain("w9008CriteriaDomain.shipToCompCd", NXS_E7_0074, null);
            errorList.add(msgShipTo);
        }
        
        // Check of shipper existence 
        // Shipper存在チェック
        if(!w9007ExpShipToShippingMaService.validateDatabaseShipper(updateDomain.getCriteriaDomain().getShipperCd())){
            MessageDomain msgShipper = new MessageDomain("w9008CriteriaDomain.shipperCd", NXS_E7_0111, null);
            errorList.add(msgShipper);
        }
        
        // Combination check 
        // 組合せチェック
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W9008ListDomain listdomain = updateDomain.getListDomainList().get(i);

            String shipper = updateDomain.getCriteriaDomain().getShipperCd();
            String docNo = listdomain.getDocNo();
            String invCategory = listdomain.getInvoiceCtgry();
            String invClass = listdomain.getInvoiceClass();
        
            if(!w9007ExpShipToShippingMaService.validateDatabaseTmInvTplOnEditRegister(shipper, docNo, invCategory, invClass)){
                MessageDomain msg = new MessageDomain("listDomainList[" + i + "].docNo", NXS_E7_0045, null);
                errorList.add(msg);
            }
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Registration/update base unit of export ship to and Invoice template of each ship to.
     * </pre>
     * <pre>
     * 輸出送荷先出荷原単位、送荷先別インボイステンプレート原単位を登録/更新
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9008UpdateDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9007ExpShipToShippingMaCriteriaDomain criteriaDomain = createExpShippingItemSpInfoMaCriteria(criteria);
        
        return w9007ExpShipToShippingMaService.transactOnEditRegister(criteriaDomain);
        
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return  Criteria domain for  User id MA service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9007ExpShipToShippingMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9008UpdateDomain updateDomain) {
        
        W9007ExpShipToShippingMaCriteriaDomain userIdMaCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        W9008CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        userIdMaCriteria.setCompCd(criteriaDomain.getShipperCd());
        userIdMaCriteria.setShipToCd(criteriaDomain.getShipToCompCd());
        userIdMaCriteria.setMode(criteriaDomain.getProcMode());
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        userIdMaCriteria.setW9007ExpShipToShippingMaItemDomainList(convertToListDomain(updateDomain.getListDomainList()
            , criteriaDomain.getScreenDateFormat()));
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert Exp Ship To Shipping MA service domain(BL) to List domain of screen(PL).<br />
     * <br />Exp Ship To Shipping MAサービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of Exp. Ship to Shipping MA service domain<br />
     * @param dateFormat date format<br />
     * Exp Ship To Shipping MAサービスドメインのリスト(BL)
     * @return List domain for Exp. Ship to shipping MA Inquiry screen(PL)<br />
     * Exp Ship To Shipping MA Inquiry画面のリストドメイン(PL)
     */
    protected List<W9007ExpShipToShippingMaItemDomain> convertToListDomain(List<? extends W9008ListDomain> srcList, String dateFormat) {
        
        List<W9007ExpShipToShippingMaItemDomain> dstList = new ArrayList<W9007ExpShipToShippingMaItemDomain>();
        
        if (srcList != null) {
            for (W9008ListDomain src : srcList) {
                
                W9007ExpShipToShippingMaItemDomain dst = new W9007ExpShipToShippingMaItemDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(dst, src, dateFormat);

                dstList.add(dst);
            }
        }
        
        return dstList;
    }
}