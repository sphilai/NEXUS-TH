/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9016UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *  An implementation class of facade service for delete action of Export Shipping Parts Special
 *  Information MA inquiry screen.
 * <br />Export Shipping Parts Special Information MA Inquiry画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W9016DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W9016UpdateDomain> {

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
    public W9016DeleteFacadeServiceImpl() {
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
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9016UpdateDomain filterDomain(W9016UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W9016ListDomain> newListDomainList = new ArrayList<W9016ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (W9016ListDomain listDomain : updateDomain.getListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Detail line selection check 
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        updateDomain.setListDomainList(newListDomainList);
        
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
    protected void validateItems(W9016UpdateDomain updateDomain)
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
    protected void validateConsistency(W9016UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W9016ListDomain listDomain = updateDomain.getListDomainList().get(0);
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // UT422 DEL START
        //String date = updateDomain.getListDomainList().get(0).getAplyStrtDt();
        //String format = updateDomain.getScreenDateFormat();
        //String compCd = updateDomain.getListDomainList().get(0).getCompCd();
        //String index = updateDomain.getCriteriaDomain().getSelected();
        //
        //// Check of a past day 
        //// 過去日チェック
        //if (!w9016ExpShippingItemSpInfoMaService.validateConsistencyAfterDate(date, format, compCd)) {
        //    Object[] params = {commonService.getResource(updateDomain.getLocale(), "label.applyStartDate")};
        //    MessageDomain msg = new MessageDomain("listDomainList[" + index + "].aplyStrtDt", NXS_E7_0070, params);
        //    errorList.add(msg);
        //}
        // UT422 DEL END
        
        // Authority check 
        // 権限チェック
        if(!w9016ExpShippingItemSpInfoMaService.validateConsistencyCompAuth(listDomain.getCompCd())){
            MessageDomain msgCompany = new MessageDomain(null, GSCM_I0_0009, null);
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
    protected void validateDatabase(W9016UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * The physical delete the warehouse cross-reference intensity.
     * </pre>
     * <pre>
     * 倉庫クロスリファレンス原単位を物理削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9016UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain 
            = createExpShippingItemSpInfoMaCriteria(updateDomain);
        
        return w9016ExpShippingItemSpInfoMaService.deleteOnInquiryDelete(criteriaDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain  Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User Id MA Edit  service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9016ExpShippingItemSpInfoMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9016UpdateDomain updateDomain) {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain userIdMaCriteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, updateDomain);
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, updateDomain.getListDomainList().get(0));
        
        return userIdMaCriteria;
    }
}
