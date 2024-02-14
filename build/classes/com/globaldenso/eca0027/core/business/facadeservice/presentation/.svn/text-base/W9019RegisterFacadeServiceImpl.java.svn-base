/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0114;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9019;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class of Facade service to register action of Export Formalities by Item
 *  MA edit screen.
 * <br />Export Formalities by Item MA Edit画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W9019RegisterFacadeServiceImpl extends AbstractCreateFacadeService<Integer, W9019CriteriaDomain> {
    
    /**
     * Service of Export Formalities by Item MA<br />
     * Export Formalities by Item MAのサービス
     */
    protected W9018ExpFmlByItemMaService w9018ExpFmlByItemMaService;

    /**
     * Common Features Service<br />
     * 共通機能サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9019RegisterFacadeServiceImpl() {
    }

    /**
     * Setter method for w9018ExpFmlByItemMaService.
     *
     * @param expFmlByItemMaService Set for w9018ExpFmlByItemMaService
     */
    public void setW9018ExpFmlByItemMaService(W9018ExpFmlByItemMaService expFmlByItemMaService) {
        w9018ExpFmlByItemMaService = expFmlByItemMaService;
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
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9019CriteriaDomain filterDomain(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W9019CriteriaDomain> valid = new Validator<W9019CriteriaDomain>(criteriaDomain, "w9019CriteriaDomain");

        List<String> propertyList = new ArrayList<String>();
        propertyList.add("aplyStrtDt");
        if (!FLAG_N.equals(criteriaDomain.getCigmaPrdctFlg())) {
            propertyList.add("expLimitTyp");
        }
        propertyList.add("dngrItemFlg");
        propertyList.add("hsCd");
        propertyList.add("originCntryCd");
        propertyList.add("free1RegFlg");
        propertyList.add("free2RegFlg");
        propertyList.add("free3RegFlg");
        
        String[] properties = propertyList.toArray(new String[0]);

        valid.isValidateProperties(properties, SCREEN_ID_W9019);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Past date check
     * </pre>
     * <pre>
     * 過去日チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // check of a past day
        // 過去日チェック
        // UT422 DEL START
        //if (!w9018ExpFmlByItemMaService.validateConsistencyAfterDate(criteriaDomain.getAplyStrtDt()
        //    , criteriaDomain.getScreenDateFormat(), criteriaDomain.getCompCd())) {
        //    String[] params = {commonService.getResource(criteriaDomain.getLocale(), "label.aplyStrtDt")};
        //    throw new ValidationException(Arrays.asList(new MessageDomain("w9019CriteriaDomain.aplyStrtDt", NXS_E7_0070, params)));
        //}
        // UT422 DEL END
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Country existence check
     * Shipper existence check
     * Check the number of retrieve
     * </pre>
     * <pre>
     * Country存在チェック
     * Shipper存在チェック
     * 取得件数チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Check of country existence. 
        // Country存在チェック
        if (!w9018ExpFmlByItemMaService.validateDatabaseCountry(criteriaDomain.getOriginCntryCd())) {
            MessageDomain md = new MessageDomain("w9019CriteriaDomain.originCntryCd", NXS_E7_0114, null);
            errList.add(md);
        }
        
        // Check of shipper existence 
        // Shipper存在チェック
        if (!w9018ExpFmlByItemMaService.validateDatabaseShipper(criteriaDomain.getCompCd())) {
            MessageDomain md = new MessageDomain("w9019CriteriaDomain.compCd", NXS_E7_0111, null);
            errList.add(md);
        }
        
        // Lock of selected data and Get the number of check.(Correction mode)
        // 選択データをロック & 取得件数チェック(修正モードのみ)
        if (MODE_EDIT.equals(criteriaDomain.getMode())) {
            if (!w9018ExpFmlByItemMaService.validateDatabaseTmExpFormalitiItemNoOnEditRegister(criteriaDomain.getCompCd()
                , criteriaDomain.getItemNo(), criteriaDomain.getAplyStrtDt(), criteriaDomain.getScreenDateFormat())) {
                MessageDomain md = new MessageDomain("", GSCM_E0_0010, null);
                errList.add(md);
            }    
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Register/update  the export procedures Part basic unit.
     * </pre>
     * <pre>
     * 輸出手続品番原単位を登録/更新
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain expFmlCriteria = createExpShippingItemSpInfoMaCriteria(criteriaDomain);
        
        return w9018ExpFmlByItemMaService.createOnEditRegister(expFmlCriteria);
    }

    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of Export Formalities by Item MA service<br />
     * Export Formalities by Item MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9018ExpFmlByItemMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9019CriteriaDomain criteriaDomain) {
        
        W9018ExpFmlByItemMaCriteriaDomain expFmlCriteria = new W9018ExpFmlByItemMaCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(expFmlCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        if(CHECK_ON.equals(criteriaDomain.getFree1OriginCntryFlg())){
            expFmlCriteria.setFree1OriginCntryFlg(FLAG_Y);
        }else{
            expFmlCriteria.setFree1OriginCntryFlg(FLAG_N);
        }
        if(CHECK_ON.equals(criteriaDomain.getFree2OriginCntryFlg())){
            expFmlCriteria.setFree2OriginCntryFlg(FLAG_Y);
        }else{
            expFmlCriteria.setFree2OriginCntryFlg(FLAG_N);
        }
        if(CHECK_ON.equals(criteriaDomain.getFree3OriginCntryFlg())){
            expFmlCriteria.setFree3OriginCntryFlg(FLAG_Y);
        }else{
            expFmlCriteria.setFree3OriginCntryFlg(FLAG_N);
        }
        
        return expFmlCriteria;
    }
}
