/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0067;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Facade service for Others Upload action of B/L upload.
 * <br />B/LアップロードのOthers Uploadアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11632 $
 */
public class W7007OthersUploadFacadeServiceImpl extends AbstractCreateFacadeService<W7007UpdateDomain, W7007UpdateDomain> {

    /**
     * Common service.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Shipping actuality service. <br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7007OthersUploadFacadeServiceImpl() {
        super();
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
     * - Check the line item selected.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7007UpdateDomain filterDomain(W7007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        // Check the line item selected.
        List<W7007ListDomain> newListDomainList = new ArrayList<W7007ListDomain>();
        for (W7007ListDomain listDomain : updateDomain.getListDomainList()) {
            if(CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        if (newListDomainList.isEmpty()) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E7_0004, null)));
        }
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
    * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - File path check.
     *  Call  {@link W7001ShippingActService#validateConsistencyFilePathInput(String)}.
     * - File existence check.
     *  Call  {@link W7001ShippingActService#validateConsistencyFileExistence(int)}.
     * - File size check.
     *  Call  {@link W7001ShippingActService#validateConsistencyFileSize(int)}.
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        if (!w7001ShippingActService.validateConsistencyFilePathInput(criteriaDomain.getUploadOthersFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("othersFileData", NXS_E7_0011, null)));
        }
        
        if (!w7001ShippingActService.validateConsistencyFileExistence(criteriaDomain.getUploadOthersFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("othersFileData", GSCM_E0_0036, null)));
        }

        if (!w7001ShippingActService.validateConsistencyFileSize(criteriaDomain.getUploadOthersFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("othersFileData", NXS_E7_0057, null)));
        }
        
        if (!w7001ShippingActService.validateConsistencyFileName(criteriaDomain.getUploadOthersFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("othersFileData", NXS_E7_0067, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Locking and get number check for invoice.
     * Call {@link W7001ShippingActService#validateDatabaseTtInvoice(String, String, Date)}.
     * - Shipping documents existence check.
     * Call {@link W7001ShippingActService#validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload}.
     * </pre>
     * <pre>
     * ‐インボイス ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtInvoice(String, String, Date)}を呼出す
     * 
     * ‐船積書類 存在チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
      
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        W7007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W7007ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // Shipper code of a screen 
        // 画面の荷主コード
        String shipperCd = criteriaDomain.getShipperCd();
        
        // The number-of-cases part check of select data is performed.
        // 選択データの件数分チェックを行う
        for (int i = 0; i < listDomainList.size(); i++) {
            W7007ListDomain selectedDomain = listDomainList.get(i);
            
            String invoiceNo = selectedDomain.getInvoiceNo();
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //Date invoiceIssueDt = DateUtil.parseDate(selectedDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
            Date invoiceIssueDt = selectedDomain.getInvoiceIssueDt();
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            
            // Invoice The lock & number check 
            // インボイス ロック＆取得件数チェック
            if (!w7001ShippingActService.validateDatabaseTtInvoice(shipperCd, invoiceNo, invoiceIssueDt)) {
                throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
            }
            
            //Shipping document existence check
            // 船積書類 存在チェック
            if (!w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(shipperCd, invoiceNo, invoiceIssueDt)) {
                Object[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.others")
                };
                MessageDomain msgInvoiceNo = new MessageDomain(String.format("listDomainList[%d].invoiceNo", selectedDomain.getIdxNo()), NXS_E1_0017, params);
                errorList.add(msgInvoiceNo);
            }
        }
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create criteria domain for shipping actuality service.
     * Convert to the {@link W7007UpdateDomain} {@link W7001ShippingActCriteriaDomain}.
     * - File upload and serach again.
     * Call {@link W7001ShippingActService#createOnOtherDocUploadSummaryOthersUpload}.
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7007UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐ファイルをアップロード、再検索
     *     {@link W7001ShippingActService#createOnOtherDocUploadSummaryOthersUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7007UpdateDomain callServices(W7007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(updateDomain);
        
        W7001ShippingActDomain shippingActDomain = w7001ShippingActService.createOnOtherDocUploadSummaryOthersUpload(shippingActCriteria);
        
        return convertToCriteriaDomain(shippingActDomain, updateDomain.getCriteriaDomain().getScreenDateFormat());
    }
    
    /**
     * Create criteria domain for shipping actuality service. 
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Mass update domain of shipping actuality main screen<br />
     * 船積実績Main画面の一括更新ドメイン
     * @return Criteria domain for shipping actuality service<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7007UpdateDomain updateDomain) {
        
        W7007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // Login DSC-ID
        // ログインDSC-ID
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
        // Upload File
        // アップロードするファイル
        shippingActCriteria.setFileData(criteriaDomain.getUploadOthersFileData());
        shippingActCriteria.setFileName(criteriaDomain.getUploadOthersFileName());
        
        // Storing of chosen data
        // 選択済みデータの格納
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        for(W7007ListDomain listDomain : updateDomain.getListDomainList()) {
            W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, criteriaDomain.getScreenDateFormat());
            
            invoiceList.add(invoiceDomain);
        }
        shippingActCriteria.setShippingActInvoiceList(invoiceList);
        
        return shippingActCriteria;
    }
    
    /**
    * Convert shipping actuality domain to facade service domain. 
     * <br />船積実績ドメインをFacadeServiceドメインに変換します。
     *
     * @param shippingActDomain shipping actuality domain
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Coversion result<br />
     * 変換結果
     */
    protected W7007UpdateDomain convertToCriteriaDomain(W7001ShippingActDomain shippingActDomain, String dateFormat) {
        List<W7007ListDomain> listDomainList = new ArrayList<W7007ListDomain>();
        
        for(W7001ShippingActInvoiceDomain invoiceDomain : shippingActDomain.getShippingActInvoiceList()) {
            W7007ListDomain listDomain = new W7007ListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain);
            
            // Invoice date of issue
            // インボイス発行日
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //listDomain.setInvoiceIssueDt(DateUtil.formatDate(invoiceDomain.getInvoiceIssueDt(), dateFormat));
            listDomain.setInvoiceIssueDt(invoiceDomain.getInvoiceIssueDt());
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            
            // When loading track record status is "20" (Complete Doc attach), it is check box non-activity. 
            // 船積実績ステータスが"20"(Complete Doc attach)の場合、チェックボックス非活性
            if (SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH.equals(listDomain.getShippingActStatus())) {
                listDomain.setDisabledFlg(FLAG_Y);
            }
            
            listDomainList.add(listDomain);
        }
        W7007UpdateDomain updateDomain = new W7007UpdateDomain();
        updateDomain.setListDomainList(listDomainList);
        updateDomain.setUpdateCount(shippingActDomain.getUpdateCount());
        
        return updateDomain;
    }
}
