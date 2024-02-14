/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0142;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0143;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation class of Facade service to initial action of Export Shipping Parts Special
 *  Information MA Edit screen.
 * <br />Export Shipping Parts Special Information MA Edit画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9017InitFacadeServiceImpl extends
    AbstractSearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> {

    /**
     * Service of Exp Shipping Item Sp Info MA<br />
     * Exp Shipping Item Sp Info MAのサービス
     */
    protected W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;
    
    /**
     * Common service<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9017InitFacadeServiceImpl() {
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
     * No action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9017CriteriaDomain filterDomain(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return criteriaDomain;
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
    protected void validateItems(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
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
    protected void validateConsistency(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check for the existence of Shipper
     * Check combination
     * Packaging code related check
     * CIGMA night batch check
     * </pre>
     * <pre>
     * Shipper存在チェック
     * 組み合わせチェック
     * 包装コード関連チェック
     * CIGMA夜間バッチ中チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Error item property name (It changes with processing modes. )
        // エラー項目プロパティ名（処理モードによって異なる）
        String pCompany;
        String pCustNo;
        String pShipTo;
        String pPkgCd;
        if (MODE_NEW.equals(criteriaDomain.getProcMode())) {
            pCompany = "w9016CriteriaDomain.compCd";
            pCustNo = "w9016CriteriaDomain.customerCd";
            pShipTo = "w9016CriteriaDomain.lgcyShipTo";
            pPkgCd = "w9016CriteriaDomain.pkgCd";
        } else {
            String index = criteriaDomain.getSelected();
            pCompany = "listDomainList[" + index + "].compCd";
            pCustNo = "listDomainList[" + index + "].customerCd";
            pShipTo = "listDomainList[" + index + "].lgcyShipTo";
            pPkgCd = "listDomainList[" + index + "].pkgCd";
        }
        
        // Check of shipper existence 
        // Shipper存在チェック
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseShipper(criteriaDomain.getCompCd())) {
            MessageDomain msgCompany = new MessageDomain(pCompany, NXS_E7_0111, null);
            errorList.add(msgCompany);
        }
        
        // Combination check 
        // 組み合わせチェック
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseShipperCustomerShipTo(criteriaDomain.getCompCd(), criteriaDomain.getCustomerCd(), criteriaDomain.getLgcyShipTo())) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.company"),
                commonService.getResource(criteriaDomain.getLocale(), "label.custNo"),
                commonService.getResource(criteriaDomain.getLocale(), "label.shipTo"),
            };
            MessageDomain msgCompCd = new MessageDomain(pCompany, GSCM_E0_0030, params);
            MessageDomain msgCustomerCd = new MessageDomain(pCustNo, null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain(pShipTo, null, null);
            errorList.add(msgCompCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        }
        
        // Packing code related check 
        // 包装コード関連チェック
        String pkgCd = StringUtils.trimToEmpty(criteriaDomain.getPkgCd());
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabasePkgCd(criteriaDomain.getCompCd(), pkgCd)) {
            
            String msgId = "";
            if (!CheckUtil.isBlankOrNull(pkgCd)) {
                msgId = NXS_E7_0142;
            } else {
                msgId = NXS_E7_0143;
            }
            MessageDomain msgPkgCd = new MessageDomain(pPkgCd, msgId, null);
            errorList.add(msgPkgCd);
        }
        
        if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseCigma(criteriaDomain.getCompCd())) {
            errorList.add(new MessageDomain(pCompany, NXS_E7_0075, null));
        }
        else {
            // It is a check among a batch in the CIGMA night. 
            // CIGMA夜間バッチ中チェック
            if (!w9016ExpShippingItemSpInfoMaService.validateDatabaseCigmaAvailable(criteriaDomain.getCompCd())) {
                errorList.add(new MessageDomain(pCompany, NXS_E1_0060, null));
            }
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result data.
     * </pre>
     * <pre>
     * 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9017CriteriaDomain callServices(W9017CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain 
            = createExpShippingItemSpInfoMaCriteria(criteria);

        W9016ExpShippingItemSpInfoMaDomain domain 
            = w9016ExpShippingItemSpInfoMaService.searchOnEditInit(criteriaDomain);
        
        return convertToDomain(domain, criteria);
    }
    
    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User Id MA Edit  service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9016ExpShippingItemSpInfoMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9017CriteriaDomain criteriaDomain) {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain userIdMaCriteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        userIdMaCriteria.setMode(criteriaDomain.getProcMode());

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        return userIdMaCriteria;
    }
    
    /**
     * Convert  service domain(BL) to screen domain(PL).<br />
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     *
     * @param srcDomain Service domain(BL)<br />
     * サービスドメイン(BL)
     * @param criteria Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Screen domain<br />
     * 画面のドメイン(PL)
     */
    protected W9017CriteriaDomain convertToDomain(W9016ExpShippingItemSpInfoMaDomain srcDomain, W9017CriteriaDomain criteria) {
        
        W9017CriteriaDomain dstDomain = new W9017CriteriaDomain();
        
        if (srcDomain != null) {
            CommonUtil.copyPropertiesDomainToDomain(dstDomain, srcDomain, criteria.getScreenDateFormat());
            dstDomain.setProcMode(criteria.getProcMode());
        }
        
        return dstDomain;
    }
}
