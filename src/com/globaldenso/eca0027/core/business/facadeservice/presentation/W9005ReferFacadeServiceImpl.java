/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9005;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaAreaAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaCompAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaPlantAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9005UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9004UserIdMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class for facade service to refer action of User ID MA edit screen.
 * <br />User ID MA Edit画面のReferアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9005ReferFacadeServiceImpl extends
    AbstractSearchFacadeService<W9005UpdateDomain, W9005UpdateDomain> {

    /**
     * User ID MA service<br />
     * User ID MAのサービス
     */
    protected W9004UserIdMaService w9004UserIdMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9005ReferFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w9004UserIdMaService.
     *
     * @param userIdMaService Set for w9004UserIdMaService
     */
    public void setW9004UserIdMaService(W9004UserIdMaService userIdMaService) {
        w9004UserIdMaService = userIdMaService;
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
    protected W9005UpdateDomain filterDomain(W9005UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 単項目チェック
     * </pre> 
     * <pre>
     * 単項目チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9005UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        W9005CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W9005CriteriaDomain> valid 
            = new Validator<W9005CriteriaDomain>(criteriaDomain, "w9005CriteriaDomain");
        
        String[] properties = {
            "dscId",
            "usrNmEn",
            "mailAdd1",
            "compCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9005);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Authority check
     * </pre>
     * <pre>
     * 権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9005UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W9004UserIdMaCriteriaDomain criteriaDomain = createUserIdMaCriteria(updateDomain);
        
        // Authority check 
        // 権限チェック
        if (!w9004UserIdMaService.validateDatabaseTmMenuUseAuthCnfOnEditRefer(criteriaDomain)){
            
            MessageDomain msgCompany = new MessageDomain("", GSCM_I0_0009, null);
            
            errorList.add(msgCompany);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * DB Consistency check
     * </pre>
     * <pre>
     * DB整合性チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9005UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        W9004UserIdMaCriteriaDomain criteriaDomain = createUserIdMaCriteria(updateDomain);
        
        // Check of Company existence 
        // Company存在チェック
        if(!w9004UserIdMaService.validateDatabaseCompCd(criteriaDomain.getCompCd(), criteriaDomain.getMode())){
            
            MessageDomain msgCompany = new MessageDomain("w9005CriteriaDomain.compCd", NXS_E7_0071, null);
            
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
     * - 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9005UpdateDomain callServices(
        W9005UpdateDomain updateDomain) throws GscmApplicationException,
        ApplicationException {
        
        W9004UserIdMaCriteriaDomain criteriaDomain = createUserIdMaCriteria(updateDomain);
        
        W9004UserIdMaDomain userIdMaDomain = w9004UserIdMaService.searchOnEditRefer(criteriaDomain);
        
        return convertToDomain(userIdMaDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of User Id MA Inquiry screen (PL)<br />
     * User Id MA Inquiry画面の検索条件ドメイン(PL)
     * @return Criteria domain for  User Id MA Edit service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9004UserIdMaCriteriaDomain createUserIdMaCriteria(W9005UpdateDomain updateDomain) {
        
        W9004UserIdMaCriteriaDomain userIdMaCriteria = new W9004UserIdMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, updateDomain.getCriteriaDomain());
        userIdMaCriteria.setMode(updateDomain.getCriteriaDomain().getProcMode());
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert user id MA service domain(BL)  to user id MA inquiry screen list domain(PL). 
     * <br />User Id MAサービスのドメイン(BL)をUser Id MA Inquiry画面のリストドメイン(PL)に変換します。
     *
     * @param src  List of user id MA service domain<br />
     * User Id MAサービスドメインのリスト(BL)
     * @return List domain of user id MA inquiry screen<br />
     * User Id MA Inquiry画面のリストドメイン(PL)
     */
    protected W9005UpdateDomain convertToDomain(W9004UserIdMaDomain src) {
        
        W9005UpdateDomain dst = new W9005UpdateDomain();
        
        if (src != null) {
            
            W9005CriteriaDomain w9005CriteriaDomain = new W9005CriteriaDomain();
            w9005CriteriaDomain.setDscId(src.getDscId());
            w9005CriteriaDomain.setUsrNmEn(src.getUsrNmEn());
            w9005CriteriaDomain.setMailAdd1(src.getMailAdd1());
            w9005CriteriaDomain.setCompCd(src.getAuthMgtComp());
            w9005CriteriaDomain.setPrmDscId(src.getPrmDscId());
            dst.setCriteriaDomain(w9005CriteriaDomain);
            
            // Region area of a screen 
            // 画面の地域エリア
            W9004UserIdMaAreaAuthDomain srcAreaDomain = src.getAreaAuthDomain();
            if( srcAreaDomain != null) {
                W9005ListDomain dstAreaDomain = new W9005ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(dstAreaDomain, srcAreaDomain);
                dst.setAreaDomain(dstAreaDomain);
            }
            // Company area of a screen 
            // 画面の会社エリア
            List<? extends W9004UserIdMaCompAuthDomain> srcListCompDomain = src.getCompAuthList();
            if( srcListCompDomain != null) {
                List<W9005ListDomain> dstListCompDomain = new ArrayList<W9005ListDomain>();
                for (W9004UserIdMaCompAuthDomain srcComp : srcListCompDomain) {
                    W9005ListDomain dstComp = new W9005ListDomain();
                    CommonUtil.copyPropertiesDomainToDomain(dstComp, srcComp);
                    dstListCompDomain.add(dstComp);
                }
                dst.setCompListDomain(dstListCompDomain);
            }
            
            // Plant area of a screen 
            // 画面の工場エリア
            List<? extends W9004UserIdMaPlantAuthDomain> srcListPlantDomain = src.getPlantAuthList();
            if( srcListPlantDomain != null) {
                List<W9005ListDomain> dstListPlantDomain = new ArrayList<W9005ListDomain>();
                for (W9004UserIdMaPlantAuthDomain srcPlant : srcListPlantDomain) {
                    W9005ListDomain dstPlant = new W9005ListDomain();
                    CommonUtil.copyPropertiesDomainToDomain(dstPlant, srcPlant);
                    dstListPlantDomain.add(dstPlant);
                }
                dst.setPlantListDomain(dstListPlantDomain);
            }
        }
        
        return dst;
    }
}