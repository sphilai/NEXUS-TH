/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  An implementation class of facade service for initial action of Export Ship to Shipping MA edit screen.
 * <br />Export Ship to Shipping MA Edit画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9008InitFacadeServiceImpl extends
    AbstractTransactFacadeService<W9008UpdateDomain, W9008CriteriaDomain> {

    /**
     * Exp. Ship To Shipping MA service<br />
     * Exp Ship To Shipping MAのサービス
     */
    protected W9007ExpShipToShippingMaService w9007ExpShipToShippingMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9008InitFacadeServiceImpl() {
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
    protected W9008CriteriaDomain filterDomain(W9008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Shipper existence check
     * </pre>
     * <pre>
     * Shipper存在チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9008CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of shipper existence 
        // Shipper存在チェック
        if(!w9007ExpShipToShippingMaService.validateDatabaseShipper(criteria.getShipperCd())){
            MessageDomain msgCompany = new MessageDomain("w9007CriteriaDomain.shipperCd", NXS_E7_0111, null);
            errorList.add(msgCompany);
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
    protected W9008UpdateDomain callServices(W9008CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {
        
        // Prepere Criteria domain
        W9007ExpShipToShippingMaCriteriaDomain expShippingItemSpInfoMaCriteriaDomain = createExpShippingItemSpInfoMaCriteria(criteria);
        
        // Search Edit info.
        W9007ExpShipToShippingMaDomain domain = w9007ExpShipToShippingMaService.searchOnEditInit(expShippingItemSpInfoMaCriteriaDomain);
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, domain, criteria.getScreenDateFormat());
        List<? extends W9008ListDomain> listDomainList = convertToListDomain(domain.getW9007ExpShipToShippingMaItemDomainList(), criteria.getScreenDateFormat());
        
        W9008UpdateDomain updateDomain = new W9008UpdateDomain();
        updateDomain.setCriteriaDomain(criteria);
        updateDomain.setListDomainList(listDomainList);

        return updateDomain;
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
    protected W9007ExpShipToShippingMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9008CriteriaDomain criteriaDomain) {
        
        W9007ExpShipToShippingMaCriteriaDomain userIdMaCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        userIdMaCriteria.setCompCd(criteriaDomain.getShipperCd());
        userIdMaCriteria.setShipToCd(criteriaDomain.getShipToCompCd());
        userIdMaCriteria.setMode(criteriaDomain.getProcMode());

        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert Exp Ship To Shipping MA service domain(BL) to List domain of screen(PL).<br />
     * <br />Exp Ship To Shipping MAサービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList  List of Exp. Ship to Shipping MA service domain<br />
     * Exp Ship To Shipping MAサービスドメインのリスト(BL)
     * @param dateFormat screen date format.
     * @return List domain for Exp. Ship to shipping MA Inquiry screen(PL)<br />
     * Exp Ship To Shipping MA Inquiry画面のリストドメイン(PL)
     */
    protected List<? extends W9008ListDomain> convertToListDomain(List<? extends W9007ExpShipToShippingMaItemDomain> srcList, String dateFormat) {
        
        List<W9008ListDomain> dstList = new ArrayList<W9008ListDomain>();
        
        if (srcList != null) {
            for (W9007ExpShipToShippingMaItemDomain src : srcList) {
                W9008ListDomain dst = new W9008ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(dst, src, dateFormat);
                dstList.add(dst);
            }
        }
        return dstList;
    }
}
