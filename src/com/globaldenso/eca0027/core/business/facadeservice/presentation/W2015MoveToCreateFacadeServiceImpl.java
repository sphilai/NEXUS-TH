/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2015;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The move to create service facade implementation class of X-tag Header
 * <br />X-tag Header画面のMove to Createサービス実装クラスです。
 * <pre>
 * bean id:W2015MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2015MoveToCreateFacadeServiceImpl extends AbstractProcessFacadeService<Void, W2015CriteriaDomain> {

    /**
     * X-Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W2015MoveToCreateFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
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
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2015CriteriaDomain filterDomain(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2015_X-Tag Header.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2015_X-Tag Header.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2015CriteriaDomain> valid
            = new Validator<W2015CriteriaDomain>(criteriaDomain, "w2015CriteriaDomain");

        // 共通チェック
        String[] properties = {
            "curWhCompCd",
            "curWhCd",
            "trnsCd",
            "containerSortingKey",
            "loadingCd",
            "shipToCompCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2015);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - W/H Company and NEXUS W/H Combination check
     *       Master existence check 1 ([1] :W/H Com., [2]:NEXUS W/H)  
     *       Common-specifications .xls[functional-specification common: Refer to [ W/H Company and ] NEXUS W/H combination check].
     *
     * - Company existence check
     *       Master existence check 2 ([6] :NEXUS Ship to Com.)
     *       Common-specifications .xls[functional-specification common: Refer to Company existence check].
     * 
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *     マスタ存在チェック1(【1】:W/H Com.、【2】:NEXUS W/H)
     *     共通仕様.xls[機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック]参照
     * 
     * - Company存在チェック
     *     マスタ存在チェック2(【6】:NEXUS Ship to Com.)
     *     共通仕様.xls[機能仕様共通：Company存在チェック]参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // W/H Company, a NEXUS W/H combination check
        // W/H Company、NEXUS W/H　組み合わせチェック
        if ( !w2014XtagService.validateDatabaseCompWh(criteriaDomain.getCurWhCompCd(), criteriaDomain.getCurWhCd()) ) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.whCompCd"),
                commonService.getResource(criteriaDomain.getLocale(), "label.whCd")
            };
            
            MessageDomain msgCurWhCompCd = new MessageDomain("w2015CriteriaDomain.curWhCompCd", GSCM_E0_0029, params);
            MessageDomain msgCurWhCd = new MessageDomain("w2015CriteriaDomain.curWhCd", null, null);
            
            errorList.add(msgCurWhCompCd);
            errorList.add(msgCurWhCd);
        }
        
        // Company existence check
        // Company存在チェック
        if ( !w2014XtagService.validateDatabaseCompCd(criteriaDomain.getShipToCompCd()) ) {
            
            MessageDomain msgShipToCompCd = new MessageDomain("w2015CriteriaDomain.shipToCompCd", NXS_E7_0071, null);
            
            errorList.add(msgShipToCompCd);
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
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2015CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return null;
    }
}
