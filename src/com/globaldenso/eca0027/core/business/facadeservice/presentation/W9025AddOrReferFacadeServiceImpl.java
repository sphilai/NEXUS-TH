/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9025;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9025ActualItemWeightDomain;
import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9025ActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9025ActualItemWeightService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of facade service for add or refer action of P/No Apply 
 * Start Date Refer & Register screen.
 * <br />
 * P/No Apply Start Date Refer & Register画面のAddOrReferアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 11713 $
 */
public class W9025AddOrReferFacadeServiceImpl extends AbstractSearchFacadeService<W9025CriteriaDomain, W9025CriteriaDomain> {

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    /**
     * The service of Item No. Apply Start Date Refer & Register.<br />
     * Item No. Apply Start Date Refer & Registerのサービス
     */
    protected W9025ActualItemWeightService w9025ActualItemWeightService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9025AddOrReferFacadeServiceImpl() {
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
     * Setter method for w9025ActualItemWeightService.
     *
     * @param w9025ActualItemWeightService Set for W9025ActualItemWeightService
     */
    public void setW9025ActualItemWeightService(W9025ActualItemWeightService w9025ActualItemWeightService) {
        this.w9025ActualItemWeightService = w9025ActualItemWeightService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9025CriteriaDomain filterDomain(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9025CriteriaDomain> valid = new Validator<W9025CriteriaDomain>(criteriaDomain, "w9025CriteriaDomain");
        
        // Check out the single item.
        String[] properties = {
            "ownerComp",
            "itemNo"
        };
        
        valid.isValidateProperties(properties, SCREEN_ID_W9025);
        
        // Check the error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Company existence check.
     * </pre>
     * <pre>
     * Company存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of Company existence 
        // Company存在チェック
        if (!w9025ActualItemWeightService.validateDatabaseOwnerComp(criteriaDomain.getOwnerComp())) {
            MessageDomain msg = new MessageDomain("w9025CriteriaDomain.ownerComp", NXS_E7_0111, null);
            errorList.add(msg);
            
        } else {
            // Authority check 
            // 権限チェック
            if (!w9025ActualItemWeightService.validateDatabaseUserAuthOwnerComp(criteriaDomain.getOwnerComp())) {
                MessageDomain msg = new MessageDomain("w9025CriteriaDomain.ownerComp", GSCM_I0_0009, null);
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
     * Display the Target of search
     * </pre>
     * <pre>
     * 検索対象を表示する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9025CriteriaDomain callServices(W9025CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9025ActualItemWeightCriteriaDomain criteriaDomain = createActualItemWeightCriteria(criteria);

        W9025ActualItemWeightDomain resultDomain = w9025ActualItemWeightService.searchOnRegisterAddOrRefer(criteriaDomain);

        W9025CriteriaDomain result = new W9025CriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(result, resultDomain);
        // Format the numerical value of the weight for display.
        // 数値項目フォーマット(重量)
        result.setOldNetWeightA(NumberUtil.format(resultDomain.getOldNetWeightA(), FORMAT_WEIGHT));
        return result;
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteria Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9025ActualItemWeightCriteriaDomain createActualItemWeightCriteria(W9025CriteriaDomain criteria) {

        W9025ActualItemWeightCriteriaDomain criteriaDomain = new W9025ActualItemWeightCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, criteria);

        return criteriaDomain;
    }
}
