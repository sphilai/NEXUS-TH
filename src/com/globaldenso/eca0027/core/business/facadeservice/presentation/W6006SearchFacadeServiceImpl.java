/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TEMPORARY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for Search Facade of action Documentation Invoice Grouping screen.
 * <br />通関書類作成業務 Invoice Grouping画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6006SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6006SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W6006ListDomain>, W6006CriteriaDomain> {
    
    /**
     * Documentation Service
     */
    protected W6001DocService w6001DocService;

    /**
     * Default constructor.
     */
    public W6006SearchFacadeServiceImpl(){
        super();
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6006CriteriaDomain filterDomain(W6006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Single item check.
     * - 単項目チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6006CriteriaDomain> valid = new Validator<W6006CriteriaDomain>(criteriaDomain, "w6006CriteriaDomain");

        String[] properties = {
            "shipperCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6006);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * {@inheritDoc}
     * 
     * DB integrity check.
     * <br />DB整合性チェック
     * <pre>
     * - Night batch check
     * - 夜間バッチ中チェック
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        String dscId = criteriaDomain.getLoginUserDscId();
        String shipperCd = criteriaDomain.getShipperCd();
        
        // Searcd Invoice Item No Work, Invoide Palletize Work
        // インボイス作成対象品番ワーク、インボイス作成対象パレタイズワークを検索
        if(w6001DocService.validateDatabaseTwInvItemOnInvGroupSearch(dscId, shipperCd)) {
            criteriaDomain.setFirstTimeFlg(FLAG_Y);
            
            // Included check for CIGMA product and available check CIGMA product
            // CIGMA品が含まれているか、CIGMA品が利用可能かチェック
            String errCd = w6001DocService.validateDatabaseCigmaAvailable(dscId, shipperCd, null);
            if (errCd != null){
                throw new ValidationException(Arrays.asList(new MessageDomain("w6006CriteriaDomain.shipperCd", errCd, null)));
            }
           
        } else {
            criteriaDomain.setFirstTimeFlg(FLAG_N);
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W6006ListDomain> callServices(W6006CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        

        W6001DocCriteriaDomain docCriteria = createDocCriteriaDomain(criteriaDomain);
        try {
            List<? extends TwInvDomain> twInvList = w6001DocService.transactOnInvGroupSearch(docCriteria);
            return convertToListDomain(twInvList, criteriaDomain.getScreenDateFormat());
        } catch (GscmApplicationException e) {
            if (e.getCode().equals(NXS_E1_0060)){
                throw new ValidationException(Arrays.asList(new MessageDomain("w6006CriteriaDomain.shipperCd", NXS_E1_0060, null)));
            } 
            throw e;
        }
    }
    
    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return Search conditions domain of BL layer<br />
     * BL層の検索条件ドメイン
     */
    protected W6001DocCriteriaDomain createDocCriteriaDomain(W6006CriteriaDomain criteriaDomain){
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();


        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());

        // DSC-ID
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteriaDomain;
    }
    
    /**
     * Convert to the list domain.
     * <br />リストドメインに変換します。
     *
     * @param twInvList List of invoice group work domain that has been acquired<br />
     * 取得したインボイスグループワークドメインのリスト
     * @param dateFormat Screen for date format<br />
     * 画面用日付フォーマット
     * @return List domain list in the window that have been converted<br />変換した画面のリストドメインリスト
     * 
     */
    protected List<? extends W6006ListDomain> convertToListDomain(List<? extends TwInvDomain> twInvList, String dateFormat){
        List<W6006ListDomain> listDomainList = new ArrayList<W6006ListDomain>();

        if (twInvList != null) {
            String beforGrpNo1 = StringUtils.EMPTY;
            for (TwInvDomain twInvDomain : twInvList) {
                W6006ListDomain listDomain = new W6006ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(listDomain, twInvDomain, dateFormat);

                // CK
                listDomain.setSelected(CHECK_OFF);
                if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                    // Main
                    if (!FLAG_N.equals(twInvDomain.getDecisionFlg())) {
                        listDomain.setDisabledFlg(FLAG_Y);
                    }
                } else {
                    // FRT
                    if (FLAG_Y.equals(twInvDomain.getDecisionFlg())
                        || FLAG_N.equals(searchMainInvoiceDecisionFlg(twInvDomain.getGrpNo1(), twInvList))) {
                        listDomain.setDisabledFlg(FLAG_Y);
                    }
                }
                
                // Group No.first
                if (beforGrpNo1.equals(twInvDomain.getGrpNo1())) {
                    // 前の行と同じときは空白を設定する
                    listDomain.setViewGrpNo1(StringUtils.EMPTY);
                } else {
                    listDomain.setViewGrpNo1(twInvDomain.getGrpNo1());
                }
                
                // Invoice No
                if (FLAG_Y.equals(twInvDomain.getDecisionFlg())) {
                    if (StringUtils.isEmpty(twInvDomain.getInvoiceNo())) {
                        listDomain.setInvoiceNo(TEMPORARY);
                    }
                }
                
                beforGrpNo1 = twInvDomain.getGrpNo1();
                listDomainList.add(listDomain);
            }
        }
        return listDomainList;
    }
    
    /**
     * Get the DECISION_FLG of Group No.first main invoice.
     * <br />Group No.firstのメインインボイスのDECISION_FLGを取得します。
     * 
     * @param grpNo1 GRP_NO_1
     * @param twInvList インボイスグループワークのリスト(Group No.first, Group No.secの昇順に並んでいる)
     * @return メインインボイスのDECISION_FLG
     */
    protected String searchMainInvoiceDecisionFlg(String grpNo1, List<? extends TwInvDomain> twInvList) {
        boolean sameFlg = false;

        for (TwInvDomain twInvDomain : twInvList) {
            if (grpNo1.equals(twInvDomain.getGrpNo1())) {
                sameFlg = true;
                if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                    return twInvDomain.getDecisionFlg();
                }
            } else {
                if (sameFlg) {
                    break;
                }
            }
        }
        return null;
    }
}
