/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * 
 * The service to the Facade Change Status action of Shipping Actuality Register screen.
 * <br />船積実績Register画面のChange Statusアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004ChangeStatusFacadeServiceImpl extends AbstractTransactFacadeService<W7004UpdateDomain, W7004UpdateDomain> {

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004ChangeStatusFacadeServiceImpl() {
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
    protected W7004UpdateDomain filterDomain(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No action
        // 処理なし
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
        // No action
        // 処理なし
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
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Shipping Actuality Rock & presence check.
     *   Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnRegisterChangeStatus}
     * 
     * - Invoice Rock & presence check.
     *   Call {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterChangeStatus}
     * 
     * </pre>
     * <pre>
     * ‐船積実績 ロック&存在チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnRegisterChangeStatus}を呼出す
     * 
     * ‐インボイス ロック&存在チェック
     *     {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterChangeStatus}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected void validateDatabase(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        int selectedRow = Integer.parseInt(criteriaDomain.getSelectedRow());
        
        W7001ShippingActCriteriaDomain serviceCriteria = new W7001ShippingActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(serviceCriteria, criteriaDomain);
        
        String shipperCd = criteriaDomain.getShipperCd();
        String invoiceNo = updateDomain.getListDomainList().get(selectedRow).getInvoiceNo();
        
        // lock of Shipping Actuality and Shipping Actuality existence check.
        // 船積実績 ロック&存在チェック
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnRegisterChangeStatus(serviceCriteria)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        updateDomain.setBuilldFileIdList(serviceCriteria.getBilldFileIdList());
        updateDomain.setClpGroup(serviceCriteria.getClpGroup());
        updateDomain.setContainerLooseTyp(serviceCriteria.getContainerLooseTyp());
        
        // lock of Invoice number and Invoice number existence check
        // インボイス ロック&存在チェック
        if (!w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterChangeStatus(shipperCd, invoiceNo)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Domain creation of conditions Shipping Actuality Service.
     *   Convert to the {@link W7001ShippingActCriteriaDomain} {@link W7004CriteriaDomain}.
     * 
     * - Update and re-search only STATUS Shipping Actuality.
     *   Call {@link W7001ShippingActService#transactOnRegisterChangeStatus}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7004CriteriaDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     *     
     * ‐船積実績のステータスの更新・再検索
     *     {@link W7001ShippingActService#transactOnRegisterChangeStatus}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7004UpdateDomain callServices(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        // Conditions domain creation of shipment service performance.
        // 船積実績サービスの条件ドメイン作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActDomain(updateDomain);
        
        // Update and re-search the status of Shipping Actuality.
        // 船積実績のステータスの更新・再検索
        W7001ShippingActDomain shippingAct = w7001ShippingActService.transactOnRegisterChangeStatus(shippingActCriteria);
        
        // Conversion to list domain.
        // リストドメインへの変換
        return convertToListDomain(shippingAct, updateDomain.getCriteriaDomain());
    }
    
    /**
     * 
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain 船積実績Create画面の一括指定ドメイン
     * @return 船積実績サービスの条件ドメインのリスト
     */
    protected W7001ShippingActCriteriaDomain createShippingActDomain(W7004UpdateDomain updateDomain) {
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        int selectedRow = Integer.parseInt(criteriaDomain.getSelectedRow());
        
        W7004ListDomain listDomain = updateDomain.getListDomainList().get(selectedRow);
        
        // Copy of the domain.
        // ドメインのコピー
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, updateDomain);
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain);

        // Set of DSC-ID.
        // DSC-IDの設定
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
        // Billd file ID.
        // BilldファイルID
        shippingActCriteria.setBilldFileIdList(updateDomain.getBuilldFileIdList());
        
        // The copy of the invoice domain the contents of the domain results.
        // 結果ドメインの内容をインボイスドメインのコピー
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
        CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, criteriaDomain.getScreenDateFormat());
        invoiceList.add(invoiceDomain);
        shippingActCriteria.setShippingActInvoiceList(invoiceList);
        
        // Setting for the maximum number of Get.
        // 最大件数取得のための設定
        shippingActCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        return shippingActCriteria;
    }
    
    /**
     * 
     * Convert to the mass update the domain Shipping Actuality domain.
     * <br />船積実績ドメインを一括更新ドメインに変換します。
     *
     * @param shippingAct Search results<br />
     * 検索結果
     * @param inputDomain Condition domain of a screen<br />
     * 画面の条件ドメイン
     * @return 変換結果
     */
    protected W7004UpdateDomain convertToListDomain(W7001ShippingActDomain shippingAct, W7004CriteriaDomain inputDomain) {
        
        W7004CriteriaDomain criteriaDomain = new W7004CriteriaDomain();
        List<W7004ListDomain> listDomainList = new ArrayList<W7004ListDomain>();

        // Date format conversion.
        // 日付変換フォーマット
        String dateFormat = inputDomain.getScreenDateFormat();

        if(MODE_NEW.equals(inputDomain.getProcMode())) {
            // Header part
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, inputDomain, dateFormat);
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            criteriaDomain.setBilldUpdate(FLAG_N);
            // Register Date
            criteriaDomain.setRegisterDt("");
            
        } else {
            // Header part
            // ヘッダ部分
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, shippingAct, dateFormat);
            // B/L Update
            if(null == shippingAct.getBilldFileId()) {
                criteriaDomain.setBilldUpdate(FLAG_N);
            } else {
                criteriaDomain.setBilldUpdate(FLAG_Y);
            }
            
            // Button press whether
            // ボタン押下可否
            if (TRNS_CD_AIR.equals(criteriaDomain.getTrnsCd()) || FLAG_N.equals(criteriaDomain.getAutoInvoiceRegisterFlg())) {
                // In the case of 'N' is Auto Invoice Register or 'A' is Trans "Print CLP" button inactive.
                // Transが'A' または Auto Invoice Registerが'N'の場合「Print CLP」ボタン非活性
                criteriaDomain.setDisabledFlgForPrintClp(FLAG_Y);
            }
            if (PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(criteriaDomain.getShippingActStatus())) {
                // When "20" is Status "Move to Other Doc. Upload" button inactive.
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
        criteriaDomain.setProcMode(inputDomain.getProcMode());
        
        // Details part
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
        updateDomain.setUpdateCount(shippingAct.getUpdateCount());
        
        return updateDomain;
    }
}
