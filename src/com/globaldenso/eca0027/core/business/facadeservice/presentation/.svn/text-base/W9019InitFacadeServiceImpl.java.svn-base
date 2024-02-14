/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0075;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0076;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class of Facade service to initial action of Export Formalities by Item MA edit screen.
 * <br />Export Formalities by Item MA Edit画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9019InitFacadeServiceImpl extends AbstractSearchFacadeService<W9019CriteriaDomain, W9019CriteriaDomain> {
    
    /**
     * Service of Export Formalities by Item MA<br />
     * Export Formalities by Item MAのサービス
     */
    protected W9018ExpFmlByItemMaService w9018ExpFmlByItemMaService;

    /**
     * Common Service
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9019InitFacadeServiceImpl() {
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
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        if(MODE_NEW.equals(criteriaDomain.getMode())){
            Validator<W9019CriteriaDomain> valid = new Validator<W9019CriteriaDomain>(criteriaDomain, "w9019CriteriaDomain");

            List<String> propertyList = new ArrayList<String>();
            propertyList.add("compCd");
            propertyList.add("itemNo");
            propertyList.add("cigmaPrdctFlg");
            
            String[] properties = propertyList.toArray(new String[0]);

            valid.isValidateProperties(properties, SCREEN_ID_W9019);

            if (0 < valid.getErrList().size()) {
                List<MessageDomain> errorList = new ArrayList<MessageDomain>();
                for(MessageDomain msg : valid.getErrList()){
                    if("w9019CriteriaDomain.compCd".equals(msg.getProperty())){
                        errorList.add(new MessageDomain("w9018CriteriaDomain.compCd", msg.getKey(), msg.getParams()));
                    }
                    if("w9019CriteriaDomain.itemNo".equals(msg.getProperty())){
                        errorList.add(new MessageDomain("w9018CriteriaDomain.itemNo", msg.getKey(), msg.getParams()));
                    }
                    if("w9019CriteriaDomain.cigmaPrdctFlg".equals(msg.getProperty())){
                        errorList.add(new MessageDomain("w9018CriteriaDomain.cigmaPrdctFlg", msg.getKey(), msg.getParams()));
                    }
                }
                throw new ValidationException(errorList);
            }
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Shipper existence check.
     * </pre>
     * <pre>
     * Shipper存在チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        if (MODE_NEW.equals(criteriaDomain.getMode())) {
            // Check of shipper existence 
            // Shipper存在チェック
            if(!w9018ExpFmlByItemMaService.validateDatabaseShipper(criteriaDomain.getCompCd())){
                throw new ValidationException(Arrays.asList(new MessageDomain("w9018CriteriaDomain.compCd", NXS_E7_0111, null)));
            }
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
    protected W9019CriteriaDomain callServices(W9019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain expFmlCriteria = createExpShippingItemSpInfoMaCriteria(criteriaDomain);
        
        W9018ExpFmlByItemMaDomain expFmlByItemMaDomain = w9018ExpFmlByItemMaService.searchOnEditInit(expFmlCriteria);
        if (StringUtils.isNotEmpty(expFmlByItemMaDomain.getMsgId())) {
            String itemNoProperty;
            String companyProperty;
            if (MODE_NEW.equals(criteriaDomain.getMode())) {
                itemNoProperty = "w9018CriteriaDomain.itemNo";
                companyProperty = "w9018CriteriaDomain.compCd";
            } else {
                itemNoProperty = "listDomainList[" + criteriaDomain.getSelected() + "].itemNo";
                companyProperty = "listDomainList[" + criteriaDomain.getSelected() + "].compCd";
            }
            if (NXS_E7_0030.equals(expFmlByItemMaDomain.getMsgId())) {
                String[] params = {"(" + criteriaDomain.getItemNo() + ")"};
                throw new ValidationException(Arrays.asList(new MessageDomain(itemNoProperty, NXS_E7_0030, params)));
            } 
            if (NXS_E7_0076.equals(expFmlByItemMaDomain.getMsgId())) {
                throw new ValidationException(Arrays.asList(new MessageDomain(itemNoProperty, NXS_E7_0076, null)));
            }
            if (NXS_E1_0060.equals(expFmlByItemMaDomain.getMsgId())) {
                throw new ValidationException(Arrays.asList(new MessageDomain(companyProperty, NXS_E1_0060, null)));
            }
            if (NXS_E7_0075.equals(expFmlByItemMaDomain.getMsgId())) {
                throw new ValidationException(Arrays.asList(new MessageDomain(companyProperty, NXS_E7_0075, null)));
            }
        }
        return convertToCriteriaDomain(expFmlByItemMaDomain, criteriaDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of Export Formalities by Item MA Edit service<br />
     * Export Formalities by Item MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9018ExpFmlByItemMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9019CriteriaDomain criteriaDomain) {
        
        W9018ExpFmlByItemMaCriteriaDomain expFmlByItem = new W9018ExpFmlByItemMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(expFmlByItem, criteriaDomain, criteriaDomain.getScreenDateFormat());
        return expFmlByItem;
    }
    
    /**
     * Convert service domain(PL) to list domain of screen(PL)
     * <br />
     * サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     * 
     * @param srcDomain Service domain(BL)<br />
     * サービスドメイン(BL)
     * @param criteriaDomain criteriaDomain(Input)
     * @return Screen domain(PL)<br />
     * 画面のドメイン(PL)
     */
    protected W9019CriteriaDomain convertToCriteriaDomain(W9018ExpFmlByItemMaDomain srcDomain, W9019CriteriaDomain criteriaDomain) {

        W9019CriteriaDomain dstDomain = new W9019CriteriaDomain();
        if (srcDomain != null) {

            CommonUtil.copyPropertiesDomainToDomain(dstDomain, srcDomain, criteriaDomain.getScreenDateFormat());

            // Take over value 
            // 引継値
            dstDomain.setCompCd(criteriaDomain.getCompCd());
            dstDomain.setItemNo(criteriaDomain.getItemNo());
            dstDomain.setAplyStrtDt(criteriaDomain.getAplyStrtDt());
            
            // Free1 Not list Country of Origin on Invoice
            if(FLAG_Y.equals(srcDomain.getFree1OriginCntryFlg())){
                dstDomain.setFree1OriginCntryFlg(CHECK_ON);
            }else{
                dstDomain.setFree1OriginCntryFlg(CHECK_OFF);
            }
            // Free2 Not list Country of Origin on Invoice
            if(FLAG_Y.equals(srcDomain.getFree2OriginCntryFlg())){
                dstDomain.setFree2OriginCntryFlg(CHECK_ON);
            }else{
                dstDomain.setFree2OriginCntryFlg(CHECK_OFF);
            }
            // Free3 Not list Country of Origin on Invoice
            if(FLAG_Y.equals(srcDomain.getFree3OriginCntryFlg())){
                dstDomain.setFree3OriginCntryFlg(CHECK_ON);
            }else{
                dstDomain.setFree3OriginCntryFlg(CHECK_OFF);
            }
        }
        dstDomain.setMode(criteriaDomain.getMode());
        return dstDomain;
    }
}
