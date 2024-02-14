/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK_NOTATION_MAX_PAR_LINE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK_NOTATION_MAX_ROW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9017;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of Facade service to initial action of Export Shipping Parts Special
 *  Information MA Edit screen.
 * <br />Export Shipping Parts Special Information MA Edit画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W9017RegisterFacadeServiceImpl extends AbstractCreateFacadeService<Integer, W9017CriteriaDomain> {

    /**
     * Service of Exp Shipping Item Sp Info MA<br />
     * Exp Shipping Item Sp Info MAのサービス
     */
    protected W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;
    
    /**
     * Common service<br />
     * 共通のServiceインターフェース
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9017RegisterFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w9016ExpShippingItemSpInfoMaService.
     *
     * @param expShippingItemSpInfoMaService Set for w9016ExpShippingItemSpInfoMaService
     */
    public void setW9016ExpShippingItemSpInfoMaService(W9016ExpShippingItemSpInfoMaService expShippingItemSpInfoMaService) {
        w9016ExpShippingItemSpInfoMaService = expShippingItemSpInfoMaService;
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
     * CML Remarks: Convert line separator.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9017CriteriaDomain filterDomain(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // Convert line separator
        criteriaDomain.setCasemarkNotation(convertLineSeparator(criteriaDomain.getCasemarkNotation()));
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check
     * For details, see screen definition document _ECA0027_W9017_Export Shipping Item Special Information MA Edit.xls.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W9017_Export Shipping Item Special Information MA Edit.xls「画面項目定義」を参照
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9017CriteriaDomain> valid 
            = new Validator<W9017CriteriaDomain>(criteriaDomain, "w9017CriteriaDomain");
        
        String[] properties = {
            "aplyStrtDt"
            , "itemDescription"
            , "shippingLot"
            , "invoiceKey"
            , "stgInstrItemFlg"
            , "customTimingTyp"
            , "containerSortingKey"
            , "loadingCd"
            , "containerLooseTyp"
            , "casemarkNotation"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9017);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Multiple lines of text check
     * Check correlation
     * Past date check
     * </pre>
     * <pre>
     * 複数行テキストチェック
     * 相関チェック
     * 過去日チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check multiple line for CML Remarks.
        // 複数行テキストチェック
        if (!w9016ExpShippingItemSpInfoMaService.validateConsistencyTxtLines(criteriaDomain.getCasemarkNotation())) {
            String[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.casemarkNotation")
                , Integer.toString(CASEMARK_NOTATION_MAX_PAR_LINE)
                , Integer.toString(CASEMARK_NOTATION_MAX_ROW)
            };
            errorList.add(new MessageDomain("w9017CriteriaDomain.casemarkNotation", GSCM_E0_0039, params));
        }
        
        // Combination check 
        // 相関チェック
        if (!w9016ExpShippingItemSpInfoMaService.validateConsistencyCLAndCCSpInf(
            criteriaDomain.getStgInstrItemFlg(),
            criteriaDomain.getCustomTimingTyp(),
            criteriaDomain.getContainerLooseTyp())) {
            
            Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.stgInstrFlg")
                , commonService.getResource(criteriaDomain.getLocale(), "label.ccType")
                , commonService.getResource(criteriaDomain.getLocale(), "label.cl")
            };
            errorList.add(new MessageDomain("w9017CriteriaDomain.stgInstrItemFlg", GSCM_E0_0030, params));
            errorList.add(new MessageDomain("w9017CriteriaDomain.customTimingTyp", null, null));
            errorList.add(new MessageDomain("w9017CriteriaDomain.containerLooseTyp", null, null));
        }
        
        // Check of a past day 
        // 過去日チェック
        // UT422 DEL START
        //if (!w9016ExpShippingItemSpInfoMaService.validateConsistencyAfterDate(criteriaDomain.getAplyStrtDt()
        //    , criteriaDomain.getScreenDateFormat(), criteriaDomain.getCompCd())) {
        //    Object[] params = {
        //        commonService.getResource(criteriaDomain.getLocale(), "label.applyStartDate")
        //    };
        //    errorList.add(new MessageDomain("w9017CriteriaDomain.aplyStrtDt", NXS_E7_0070, params));
        //}
        // UT422 DEL END
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check for the existence of Shipper
     * Check combination
     * Authority check
     * </pre>
     * <pre>
     * Shipper存在チェック
     * 組み合わせチェック
     * 権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of shipper existence 
        // Shipper存在チェック
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseShipper(criteriaDomain.getCompCd())) {
            errorList.add(new MessageDomain("w9017CriteriaDomain.compCd", NXS_E7_0111, null));
        }
        
        // Combination check 
        // 組み合わせチェック
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseShipperCustomerShipTo(criteriaDomain.getCompCd()
            , criteriaDomain.getCustomerCd(), criteriaDomain.getLgcyShipTo())) {
            
            Object[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.company")
                , commonService.getResource(criteriaDomain.getLocale(), "label.custNo")
                , commonService.getResource(criteriaDomain.getLocale(), "label.shipTo")
            };
            errorList.add(new MessageDomain("w9017CriteriaDomain.compCd", GSCM_E0_0030, params));
            errorList.add(new MessageDomain("w9017CriteriaDomain.customerCd", null, null));
            errorList.add(new MessageDomain("w9017CriteriaDomain.lgcyShipTo", null, null));
        }
        
        // Authority check 
        // 権限チェック
        if(!w9016ExpShippingItemSpInfoMaService.validateConsistencyCompAuth(criteriaDomain.getCompCd())){
            errorList.add(new MessageDomain("w9017CriteriaDomain.compCd", GSCM_I0_0009, null));
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Register/Update the export shipment item number basic unit.
     * </pre>
     * <pre>
     * 輸出出荷品目番号原単位を登録/更新
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9017CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain 
            = createExpShippingItemSpInfoMaCriteria(criteria);
        
        // Select data is locked. (In the case of correction mode )
        // 選択データをロック(修正モードの場合のみ)
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseTmExpItemNoSpInfoOnEditRegister(criteriaDomain)) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        return w9016ExpShippingItemSpInfoMaService.createOnEditRegister(criteriaDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain  Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User Id MA Edit  service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9016ExpShippingItemSpInfoMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9017CriteriaDomain criteriaDomain) {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain userIdMaCriteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(criteriaDomain.getLocale());
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        userIdMaCriteria.setMode(criteriaDomain.getProcMode());
        
        return userIdMaCriteria;
    }
    
    /**
     * Line separator convert to '\n'.
     * <br />改行コードを「\n」に統一します。
     *
     * @param str original string.<br />変換元文字列
     * @return convert string.<br />変換後文字列
     */
    protected String convertLineSeparator(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\r\\n|\\r|\\n", LINE_SEPARATOR);
    }
}
