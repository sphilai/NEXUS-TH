/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * 
 * The Facade service for Delete action of Shipping Actuality Register screen.
 * <br />船積実績Register画面のDeleteアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004DeleteFacadeServiceImpl extends AbstractDeleteFacadeService<W7004UpdateDomain, W7004UpdateDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004DeleteFacadeServiceImpl() {
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
     * - Line item selection check.
     * - All row selection check.
     * </pre>
     * <pre>
     * ‐明細行選択チェック
     * ‐全行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7004UpdateDomain filterDomain(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W7004ListDomain> listDomainList = updateDomain.getListDomainList();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Chosen domain storing list 
        // 選択済みListドメイン格納リスト
        List<W7004ListDomain> newListDomainList = new ArrayList<W7004ListDomain>();
        // Selected List domain is extracted. 
        // 選択されたListドメインを抽出
        for (W7004ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Check of detail line selection 
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            MessageDomain msg = new MessageDomain("", NXS_E7_0004, null);
            errorList.add(msg);
        }
        
        // All the deletion checks 
        // 全削除チェック
        if(StringUtils.isNotEmpty(criteriaDomain.getShippingActStatus()) && newListDomainList.size() == listDomainList.size()) {
            MessageDomain msg = new MessageDomain("", NXS_E7_0010, null);
            errorList.add(msg);
        }

        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
        
        // Only chosen data is stored. 
        // 選択済みのデータのみ格納する。
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
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
    protected void validateItems(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
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
    protected void validateConsistency(W7004UpdateDomain updateDomain)
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
    protected void validateDatabase(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Domain creation of conditions Shipping Actuality Service.
     *   Convert to the {@link W7001ShippingActCriteriaDomain} {@link W7004UpdateDomain}.
     * 
     * - DELETE FLAG update process of checking data.
     *   Call {@link W7001ShippingActService#deleteOnRegisterDelete}
     * 
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7004UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐チェックデータの削除フラグ更新処理
     *     {@link W7001ShippingActService#deleteOnRegisterDelete}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7004UpdateDomain callServices(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActDomain(updateDomain);
        
        W7001ShippingActDomain shippingAct = w7001ShippingActService
            .deleteOnRegisterDelete(updateDomain.getCriteriaDomain().getProcMode(), shippingActCriteria);
        
        return convertToListDomain(shippingAct, updateDomain);
    }
    
    /**
     * 
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Collectively specifying the domain of Shipping Actuality Create screen<br />
     * 船積実績Create画面の一括指定ドメイン
     * @return List of conditions domain of Shipping Actuality Service<br />
     * 船積実績サービスの条件ドメインのリスト
     */
    protected W7001ShippingActCriteriaDomain createShippingActDomain(W7004UpdateDomain updateDomain) {
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W7004ListDomain> listDomainList = updateDomain.getListDomainList();
        
        String dateFormat = criteriaDomain.getDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, dateFormat);
        
        for(W7004ListDomain listDomain : listDomainList) {
            W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, dateFormat);
            
            invoiceList.add(invoiceDomain);
        }
        shippingActCriteria.setShippingActInvoiceList(invoiceList);
        
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
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
    protected W7004UpdateDomain convertToListDomain(W7001ShippingActDomain shippingAct, W7004UpdateDomain inputDomain) {
        W7004CriteriaDomain criteriaDomain = new W7004CriteriaDomain();
        List<W7004ListDomain> listDomainList = new ArrayList<W7004ListDomain>();

        String dateFormat = inputDomain.getCriteriaDomain().getScreenDateFormat();

        if(MODE_NEW.equals(inputDomain.getCriteriaDomain().getProcMode())) {
            // Headder
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, inputDomain.getCriteriaDomain(), dateFormat);
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            criteriaDomain.setBilldUpdate(FLAG_N);
            // Register Date
            criteriaDomain.setRegisterDt("");
            
        } else {
            // Headder
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            if(null == shippingAct.getBilldFileId()) {
                criteriaDomain.setBilldUpdate(FLAG_N);
            } else {
                criteriaDomain.setBilldUpdate(FLAG_Y);
            }
            
            // Button depression propriety 
            // ボタン押下可否
            if (TRNS_CD_AIR.equals(criteriaDomain.getTrnsCd()) || FLAG_N.equals(criteriaDomain.getAutoInvoiceRegisterFlg())) {
                // Trans is Print CLP button non-activity, when 'A' or Auto Invoice Register is 'N'. 
                // Transが'A' または Auto Invoice Registerが'N'の場合「Print CLP」ボタン非活性
                criteriaDomain.setDisabledFlgForPrintClp(FLAG_Y);
            }
            if (PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(criteriaDomain.getShippingActStatus())) {
                // When Status is "20", it is 'Move to Other Doc. Upload' button non-activity. 
                // Statusが"20"のとき「Move to Other Doc. Upload」ボタン非活性
                criteriaDomain.setDisabledFlgForMoveToOtherDocUpload(FLAG_Y);
            }
            
        }
        // ATD
        criteriaDomain.setAtd(DateUtil.formatDate(shippingAct.getAtd(), dateFormat));
        // ETA
        criteriaDomain.setEta(DateUtil.formatDate(shippingAct.getEta(), dateFormat));
        // date format
        criteriaDomain.setScreenDateFormat(dateFormat);
        
        // Detailed part
        // 明細部分
        if (null != shippingAct.getShippingActInvoiceList()) {
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
        }
        criteriaDomain.setProcMode(inputDomain.getCriteriaDomain().getProcMode());
        
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        updateDomain.setUpdateCount(shippingAct.getUpdateCount());
        
        return updateDomain;
    }
}
