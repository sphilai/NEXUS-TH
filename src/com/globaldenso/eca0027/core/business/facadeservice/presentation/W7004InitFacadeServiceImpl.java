/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_FULL_CONTAINER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * 
 * The Facade Service with respect to the initial display of action Shipping Actuality Register screen.
 * <br />船積実績Register画面の初期表示アクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004InitFacadeServiceImpl extends AbstractSearchFacadeService<W7004UpdateDomain, W7004CriteriaDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004InitFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w7001ShippingActService.
     *
     * @param shippingActService Set for w7001ShippingActService
     */
    public void setW7001ShippingActService(W7001ShippingActService shippingActService) {
        w7001ShippingActService = shippingActService;
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
    protected W7004CriteriaDomain filterDomain(W7004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateConsistency(W7004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Domain creation of conditions Shipping Actuality Service.
     *   Convert to the {@link W7001ShippingActCriteriaDomain} {@link W7004CriteriaDomain}.
     *   
     * - Search result data acquisition.
     *   If the correction mode, then call {@link W7001ShippingActService#searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}
     *   If new mode, then call {@link W7001ShippingActService#searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain)}
     * 
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7004CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐検索結果データ取得
     *     修正モードの場合、{@link W7001ShippingActService#searchOnRegisterInitByFromMain(W7001ShippingActCriteriaDomain)}を呼出す
     *     新規モードの場合、{@link W7001ShippingActService#searchOnRegisterInitByFromCreate(W7001ShippingActCriteriaDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7004UpdateDomain callServices(W7004CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActDomain(criteriaDomain);
        
        W7001ShippingActDomain shippingAct = null;
        if (MODE_EDIT.equals(criteriaDomain.getProcMode())) {
            // Changes from a Main screen (Correction mode)
            // Main画面からの遷移（修正モード）    
            shippingAct = w7001ShippingActService.searchOnRegisterInitByFromMain(shippingActCriteria);
        } else {
            // Changes from a Create screen (New mode )
            // Create画面からの遷移（新規モード）
            shippingAct = w7001ShippingActService.searchOnRegisterInitByFromCreate(shippingActCriteria);
        }
        
        // Changes into a mass update domain. 
        // 一括更新ドメインに変換します
        return convertToListDomain(shippingAct, criteriaDomain);
    }
    
    /**
     * 
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param criteriaDomain Search conditions domain of Shipping Actuality Create screen<br />
     * 船積実績Create画面の検索条件ドメイン
     * @return List of conditions domain of Shipping Actuality Service<br />
     * 船積実績サービスの条件ドメインのリスト
     */
    protected W7001ShippingActCriteriaDomain createShippingActDomain(W7004CriteriaDomain criteriaDomain) {
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, dateFormat);
        
        // Setup for the maximum number acquisition 
        // 最大件数取得のための設定
        shippingActCriteria.setLocale(criteriaDomain.getLocale());
        
        // Set DSC-ID
        // DSC-IDの設定
        shippingActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return shippingActCriteria;
    }
    
    /**
     * 
     * Convert to the mass update the domain Shipping Actuality domain.
     * <br />船積実績ドメインを一括更新ドメインに変換します。
     *
     * @param shippingAct Search result<br />
     * 検索結果
     * @param inputDomain Conditions domain of screen<br />
     * 画面の条件ドメイン
     * @return Conversion result<br />
     * 変換結果
     */
    protected W7004UpdateDomain convertToListDomain(W7001ShippingActDomain shippingAct, W7004CriteriaDomain inputDomain) {
        
        W7004CriteriaDomain criteriaDomain = new W7004CriteriaDomain();
        List<W7004ListDomain> listDomainList = new ArrayList<W7004ListDomain>();

        String dateFormat = inputDomain.getScreenDateFormat();
        if(shippingAct == null || shippingAct.getShippingActInvoiceList() == null){
            W7004UpdateDomain updateDomain = new W7004UpdateDomain();
            return updateDomain;
        }

        if(MODE_NEW.equals(inputDomain.getProcMode())) {
            // Headder
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, inputDomain, dateFormat);
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            criteriaDomain.setBilldUpdate(FLAG_N);
            // Register Date
            criteriaDomain.setRegisterDt("");
            
        } else {
            // Headder
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, inputDomain, dateFormat);
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            if(null == shippingAct.getBilldFileId()) {
                criteriaDomain.setBilldUpdate(FLAG_N);
            } else {
                criteriaDomain.setBilldUpdate(FLAG_Y);
            }
            
            // Button depression propriety 
            // ボタン押下可否
            if ( ! CONTAINER_LOOSE_TYP_FULL_CONTAINER.equals(criteriaDomain.getContainerLooseTyp())
                || ! FLAG_Y.equals(criteriaDomain.getAutoInvoiceRegisterFlg())) {
                // Print CLP button non-activity, when C/L is not 'C' or Auto Invoice Register is not 'Y'. 
                // C/L≠'C'、またはAuto Invoice Register≠'Y'の場合は「Print CLP」ボタン非活性
                criteriaDomain.setDisabledFlgForPrintClp(FLAG_Y);
            }
            if (PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(criteriaDomain.getShippingActStatus())) {
                // When Status is "20", it is 'Move to Other Doc. Upload' button non-activity. 
                // Statusが"20"のとき「Move to Other Doc. Upload」ボタン非活性
                criteriaDomain.setDisabledFlgForMoveToOtherDocUpload(FLAG_Y);
            }
            if (!PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(criteriaDomain.getShippingActStatus())) {
                // When Status is except "20", it is "Move to Other Doc. Upload" button activity. 
                // Statusが"20"以外のとき「Move to Other Doc. Upload」ボタン活性
                criteriaDomain.setDisabledFlgForMoveToOtherDocUpload(FLAG_N);
            }
            
        }
        // ATD
        criteriaDomain.setAtd(DateUtil.formatDate(shippingAct.getAtd(), dateFormat));
        // ETA
        criteriaDomain.setEta(DateUtil.formatDate(shippingAct.getEta(), dateFormat));
        
        // Detailed part
        // 明細部分
        for (W7001ShippingActInvoiceDomain invoiceDomain : shippingAct.getShippingActInvoiceList()) {
            W7004ListDomain listDomain = new W7004ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain, dateFormat);
            
            //Full RT Inv
            if(null == invoiceDomain.getParInvoiceNo()) {
                listDomain.setFullRtInv(FLAG_N);
            } else {
                listDomain.setFullRtInv(FLAG_Y);
            }
            
            listDomainList.add(listDomain);
        }
        
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }
}
