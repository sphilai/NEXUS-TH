/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_WEIGHT_UNIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_DG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9025B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9025R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.business.domain.W9025ActualItemWeightDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9025ActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9001RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The service of W9025ActualItemWeightService
 * */
public class W9025ActualItemWeightServiceImpl implements 
    W9025ActualItemWeightService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Get Item Info(Master Maintenance) Service.
     * <br/>ws9001RestService
     */
    protected Ws9001RestService ws9001RestService;
    
    /**
     * Service of 'TmActualItemWeightMaster' <
     */
    protected TmActualItemWeightService tmActualItemWeightService;
    
    /**
     * Service of 'TmNxsCompService' <
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * Service of 'TmCdService' <
     */
    protected TmCdService tmCdService;
    
    /**
     * UserAuthService
     */
    protected UserAuthService userAuthService;
        
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     *
     */
    public W9025ActualItemWeightServiceImpl() {
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
     * <p>Setter method for ws9001RestService.</p>
     *
     * @param ws9001RestService Set for ws9001RestService
     */
    public void setWs9001RestService(Ws9001RestService ws9001RestService) {
        this.ws9001RestService = ws9001RestService;
    }

    /**
     * Setter method for tmActualItemWeightService
     *
     * @param tmActualItemWeightService Set for tmActualItemWeightService
     */
    
    public void setTmActualItemWeightService(
        TmActualItemWeightService tmActualItemWeightService) {
        this.tmActualItemWeightService = tmActualItemWeightService;
    }

    /**
     * <p>Setter method for tmNxsCompService.</p>
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    /**
     * <p>Setter method for userAuthService.</p>
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseOwnerComp(String ownerComp)
        throws ApplicationException {
        
        // Shipper existence check
        // Shipper存在チェック
        return commonService.validateShipper(ownerComp);
    }
    
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseUserAuthCompCd(java.lang.String)
     */
    public boolean validateDatabaseUserAuthOwnerComp(String ownerComp) throws ApplicationException {
        // Authority check
        // 権限チェック
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9025R, ownerComp) 
            || userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9025B, ownerComp);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9025ActualItemWeightService#searchOnRegisterAddOrRefer(W9025ActualItemWeightCriteriaDomain)
     */
    public W9025ActualItemWeightDomain searchOnRegisterAddOrRefer(W9025ActualItemWeightCriteriaDomain criteria) 
        throws ApplicationException {
 
        // Get the data to be retrieved
        // 検索対象を取得する
        TmActualItemWeightCriteriaDomain tmActItemWeightCriteria = new TmActualItemWeightCriteriaDomain();
        tmActItemWeightCriteria.setOwnerComp(criteria.getOwnerComp());
        tmActItemWeightCriteria.setItemNo(criteria.getItemNo());
        tmActItemWeightCriteria.setSearchCountCheckFlg(false);
        
        TmActualItemWeightDomain tmActualItemWeightResult = new TmActualItemWeightDomain(); 
        tmActualItemWeightResult = tmActualItemWeightService.searchByKey(tmActItemWeightCriteria);
        
        W9025ActualItemWeightDomain resultDomain = new W9025ActualItemWeightDomain();
        
        resultDomain.setOwnerComp(criteria.getOwnerComp());
        resultDomain.setItemNo(criteria.getItemNo());
        resultDomain.setViewOwnerComp(criteria.getOwnerComp());
        resultDomain.setViewItemNo(criteria.getItemNo());
        
        if (tmActualItemWeightResult == null) {
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd(criteria.getOwnerComp());
            
            TmNxsCompDomain tmNxsCompResult = new TmNxsCompDomain();
            tmNxsCompResult = tmNxsCompService.searchByKey(tmNxsCompCriteria);
            
            resultDomain.setOldWeightUnit("");
            resultDomain.setOldNetWeightA(null);
            resultDomain.setWeightUnit(tmNxsCompResult.getWeightUnit());
        } else {
            TmCdCriteriaDomain tmCdCriteria = new TmCdCriteriaDomain();
            tmCdCriteria.setCdTyp(CD_TYPE_WEIGHT_UNIT);
            tmCdCriteria.setLngCd(criteria.getLanguageCd());
            tmCdCriteria.setCd(tmActualItemWeightResult.getWeightUnit());
            
            TmCdDomain tmCdResult = new TmCdDomain();
            tmCdResult = tmCdService.searchByKey(tmCdCriteria);
            
            resultDomain.setOldWeightUnit(tmCdResult.getValue());
            resultDomain.setOldNetWeightA(tmActualItemWeightResult.getNetWeightA());
            resultDomain.setWeightUnit(tmActualItemWeightResult.getWeightUnit());
            resultDomain.setComUpdateTimestamp(tmActualItemWeightResult.getComUpdateTimestamp());
        }
        resultDomain.setNetWeightA(null);
                
        return resultDomain;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Web Service「ECA0027_WS_9001：Get Item Info call of (Master Maintenance) 」
     * - Webサービス「ECA0027_WS_9001：Get Item Info(Master Maintenance)」のコール
     * </pre>
     */
    public W9025ActualItemWeightDomain transactOnRegister(W9025ActualItemWeightCriteriaDomain criteria) throws ApplicationException {
        
        Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(
            criteria.getViewOwnerComp(), criteria.getViewItemNo(), null);
        if (!WS_RESULT_SUCCESS.equals(ws9001ResultDomain.getResultCode())) {
            if (ws9001ResultDomain.getErrorList().isEmpty()) {
                throw new SystemException(NXS_91_0001);
            } else {
                throw new GscmApplicationException(ws9001ResultDomain.getErrorList().get(0).getErrorCode());
            }
        }
        String itemNm = StringUtils.EMPTY;
        if (ws9001ResultDomain.getItemInfo() == null) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = { "(" + criteria.getViewItemNo() + ")" };
            errorList.add(new MessageDomain("w9025CriteriaDomain.viewItemNo", NXS_E7_0030, params));
            throw new ValidationException(errorList);
        } 
        itemNm = ws9001ResultDomain.getItemInfo().getItmNm();
        if (CheckUtil.isBlankOrNull(itemNm)) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            Object[] params = { "(" + criteria.getViewItemNo() + ")" };
            errorList.add(new MessageDomain("w9025CriteriaDomain.viewItemNo", NXS_E7_0030, params));
            throw new ValidationException(errorList);
        }
        
        // Create data of registration and update.
        // 登録・更新用のデータを作成
        TmActualItemWeightDomain domain = new TmActualItemWeightDomain();
        
        // The cast to String --> Decimal
        // String-->Decimalにキャスト
        BigDecimal decNetWeightA = new BigDecimal(0);
        if(criteria.getNetWeightA() != null){
            decNetWeightA = new BigDecimal(criteria.getNetWeightA());
        }
        
        int updateCount = 0;
        int createCount = 0;
        if(GSCM_I0_0004.equals(criteria.getConfirmMsgCd())){
            // update Actual Item Weight Master 
            domain.setWeightUnit(criteria.getWeightUnit());
            domain.setNetWeightA(decNetWeightA);

            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(domain, criteria.getScreenId());
            
            // Narrowing conditions
            // 絞込条件
            TmActualItemWeightCriteriaDomain updateCriteria = new TmActualItemWeightCriteriaDomain();
            updateCriteria.setOwnerComp(criteria.getViewOwnerComp());
            updateCriteria.setItemNo(criteria.getViewItemNo());
            updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
            
            // Update process
            // 更新処理
            updateCount += tmActualItemWeightService.updateByCondition(domain, updateCriteria);
        }else{
            // Register update Actual Item Weight Master 
            domain.setOwnerComp(criteria.getViewOwnerComp());
            domain.setItemNoGrp(ITEM_NO_GRP_DG);
            domain.setItemNo(criteria.getViewItemNo());
            domain.setWeightUnit(criteria.getWeightUnit());
            domain.setNetWeightA(decNetWeightA);
            
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(domain, criteria.getScreenId());
            tmActualItemWeightService.create(domain);
            createCount++;
        }
        
        // Re drawing
        // 再描画
        W9025ActualItemWeightDomain result = new W9025ActualItemWeightDomain();
        CommonUtil.copyPropertiesDomainToDomain(result, domain);
        
        TmCdCriteriaDomain tmCdCriteria = new TmCdCriteriaDomain();
        tmCdCriteria.setCdTyp(CD_TYPE_WEIGHT_UNIT);
        tmCdCriteria.setLngCd(criteria.getLanguageCd());
        tmCdCriteria.setCd(criteria.getWeightUnit());
        
        TmCdDomain tmCdResult = new TmCdDomain();
        tmCdResult = tmCdService.searchByKey(tmCdCriteria);
        
        result.setOldWeightUnit(tmCdResult.getValue());
        result.setOldNetWeightA(decNetWeightA);
        result.setWeightUnit(criteria.getWeightUnit());
        result.setNetWeightA(null);
        result.setUpdateCount(updateCount);
        result.setCreateCount(createCount);
        
        return result;
        
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseTmPkgSpecRev(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTmActualItemWeight(String OwnerComp, String itemNo)
        throws ApplicationException {
        // Set criteria domain.
        TmActualItemWeightCriteriaDomain tmActualItemWeightCriteria = new TmActualItemWeightCriteriaDomain();
        tmActualItemWeightCriteria.setOwnerComp(OwnerComp);
        tmActualItemWeightCriteria.setItemNo(itemNo);
        
        // Lock for Package Specification Revision Master.
        TmActualItemWeightDomain tmActualItemWeightDomain = tmActualItemWeightService.lockByKeyNoWait(tmActualItemWeightCriteria);

        return tmActualItemWeightDomain != null;
    }
}   

    
