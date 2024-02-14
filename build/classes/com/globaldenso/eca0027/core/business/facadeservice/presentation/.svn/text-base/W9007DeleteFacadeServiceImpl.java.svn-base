/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation class of facade service for delete action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9587 $
 */
public class W9007DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<W9007UpdateDomain, W9007UpdateDomain> {

    /**
     * Exp Ship To Shipping MA service<br />
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
    public W9007DeleteFacadeServiceImpl() {
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
    protected W9007UpdateDomain filterDomain(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        // Detail line selection check 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getCriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // Selected line is stored. 
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        List<W9007ListDomain> listDomainList = new ArrayList<W9007ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
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
    protected void validateItems(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Past date check
     * Authority check
     * </pre>
     * <pre>
     * 過去日チェック
     * 権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        String date = updateDomain.getListDomainList().get(0).getAplyStrtDt();
        String format = updateDomain.getScreenDateFormat();
        String compCd = updateDomain.getListDomainList().get(0).getCompCd();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        // Check of a past day
        // 過去日チェック
        if(!w9007ExpShipToShippingMaService.validateConsistencyApplyStartDate(date, format, compCd)){
            Object[] params = { commonService.getResource(updateDomain.getLocale(), "label.applyStartDate") };
            MessageDomain msg = new MessageDomain("listDomainList[" + selectedRow + "].aplyStrtDt", NXS_E7_0070, params);
            errorList.add(msg);
        }
        
        // Authority check 
        // 権限チェック
        if(!w9007ExpShipToShippingMaService.validateConsistencyCompAuth(compCd)){
            MessageDomain msgCompany = new MessageDomain("listDomainList[" + selectedRow + "].compCd", GSCM_I0_0009, null);
            errorList.add(msgCompany);
        }

        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     *  Do a physical delete base unit of export ship to and Invoice template of each ship to.
     *  </pre>
     * <pre>
     * 輸出送荷先出荷原単位、送荷先別インボイステンプレート原単位を物理削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9007UpdateDomain callServices(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        W9007ExpShipToShippingMaCriteriaDomain criteriaDomain = createExpShippingItemSpInfoMaCriteria(updateDomain);
        
        int cnt = w9007ExpShipToShippingMaService.deleteOnInquiryDelete(criteriaDomain);
        updateDomain.setUpdateCount(cnt);
        
        return updateDomain;
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomoain  Update domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for  User id MA service(BL)<br />
     * User id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9007ExpShipToShippingMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9007UpdateDomain updateDomoain) {
        
        W9007ExpShipToShippingMaCriteriaDomain userIdMaCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria
            , updateDomoain.getListDomainList().get(0), updateDomoain.getScreenDateFormat());
        
        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomoain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomoain.getLanguageCd()));
        
        return userIdMaCriteria;
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain  Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User id  MA service(BL)<br />
     * User id MAサービスの検索条件ドメイン(BL)
     */
    protected W9007ExpShipToShippingMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9007CriteriaDomain criteriaDomain) {
        
        W9007ExpShipToShippingMaCriteriaDomain userIdMaCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        
        // Setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        userIdMaCriteria.setCompCd(criteriaDomain.getShipperCd());
        userIdMaCriteria.setShipToCd(criteriaDomain.getShipToCompCd());
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert Exp Ship To Shipping MA service domain(BL) to List domain of screen(PL).<br />
     * <br />Exp Ship To Shipping MAサービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of Exp. Ship to Shipping MA service domain<br />
     * Exp Ship To Shipping MAサービスドメインのリスト(BL)
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return List domain for Exp. Ship to shipping MA Inquiry screen(PL)<br />
     * Exp Ship To Shipping MA Inquiry画面のリストドメイン(PL)
     */
    protected List<? extends W9007ListDomain> convertToListDomain(List<? extends W9007ExpShipToShippingMaItemDomain> srcList, W9007ExpShipToShippingMaCriteriaDomain criteriaDomain) {
        
        List<W9007ListDomain> dstList = new ArrayList<W9007ListDomain>();
        
        if (srcList != null) {
            for (W9007ExpShipToShippingMaItemDomain src : srcList) {
                W9007ListDomain dst = new W9007ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(dst, src, criteriaDomain.getScreenDateFormat());
                dstList.add(dst);
            }
        }
        return dstList;
    }
}
