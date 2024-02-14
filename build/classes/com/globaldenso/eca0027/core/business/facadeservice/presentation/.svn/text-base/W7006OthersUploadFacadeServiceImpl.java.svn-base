/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_CO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_NON_WOODEN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DOC_TYP_OTHERS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_OTHERS_FILE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0067;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W7001ShippingActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * A service for Facade OthersUpload action of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のOthersUploadアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11620 $
 */
public class W7006OthersUploadFacadeServiceImpl extends AbstractCreateFacadeService<W7006UpdateDomain, W7006UpdateDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7006OthersUploadFacadeServiceImpl() {
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
    protected W7006UpdateDomain filterDomain(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
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
    protected void validateItems(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐ファイルパス入力チェック
     *     {@link W7001ShippingActService#validateConsistencyFilePathInput(String)}を呼出す
     * 
     * ‐ファイル存在チェック
     *     {@link W7001ShippingActService#validateConsistencyFileExistence(int)}を呼出す
     * 
     * ‐ファイルサイズチェック
     *     {@link W7001ShippingActService#validateConsistencyFileSize(int)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        // Selection line 
        // 選択行
        W7006ListDomain selected = updateDomain.getListDomainList().get(criteriaDomain.getSelectedRow());
        
        String property = String.format("listDomainList[%d].fileData", criteriaDomain.getSelectedRow());
        
        // Check of a input file path 
        // ファイルパス入力チェック
        if (!w7001ShippingActService.validateConsistencyFilePathInput(selected.getUploadFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(property, NXS_E7_0011, null)));
        }
        
        // Check of a File existence 
        // ファイル存在チェック
        if (!w7001ShippingActService.validateConsistencyFileExistence(selected.getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(property, GSCM_E0_0036, null)));
        }

        // Check of a File size
        // ファイルサイズチェック
        if (!w7001ShippingActService.validateConsistencyFileSize(selected.getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(property, NXS_E7_0057, null)));
        }
        
        // Check of a File name
        // ファイル名チェック
        if (!w7001ShippingActService.validateConsistencyFileName(selected.getUploadFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(property, NXS_E7_0067, null)));
        }
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
    protected void validateDatabase(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //if (!w7001ShippingActService
        //    .validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(criteriaDomain.getShipperCd()
        //        , criteriaDomain.getInvoiceNo()
        //        , DateUtil.parseDate(criteriaDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat()))) {
        //    throw new ValidationException(Arrays.asList(new MessageDomain(null, GSCM_E0_0010, null)));
        //}
        String shipperCd = criteriaDomain.getShipperCd();
        String invoiceNo = criteriaDomain.getInvoiceNo();
        Date invoiceIssueDt = criteriaDomain.getInvoiceIssueDt();
        if (
            !w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(
                shipperCd, invoiceNo, invoiceIssueDt)
        )
        {
            throw new ValidationException(Arrays.asList(new MessageDomain(null, GSCM_E0_0010, null)));
        }
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipment service performance .
     *    Convert {@link W7001ShippingActCriteriaDomain} a {@link W7006UpdateDomain}
     *    
     * - Upload and re-search about a file.
     *    Call {@link W7001ShippingActService#createOnOtherDocUploadIndividualOthersUpload}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7006UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐ファイルのアップロード、再検索
     *     {@link W7001ShippingActService#createOnOtherDocUploadIndividualOthersUpload}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7006UpdateDomain callServices(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(updateDomain);
        
        W7001ShippingActDomain shippingAct = w7001ShippingActService.createOnOtherDocUploadIndividualOthersUpload(shippingActCriteria);
        
        return convertToCriteriaDomain(updateDomain, shippingAct);
    }
    
    /**
     * 
     * Create a condition of shipment domain service performance.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Domain conditions of shipment performance Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipment domain service performance<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7006UpdateDomain updateDomain) {
        
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        // Selection line 
        // 選択行
        W7006ListDomain selected = updateDomain.getListDomainList().get(criteriaDomain.getSelectedRow());
        
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, updateDomain.getScreenDateFormat());
        
        // File data
        // ファイルデータ
        shippingActCriteria.setFileData(selected.getUploadFileData());
        
        // File name
        // ファイル名
        shippingActCriteria.setFileName(selected.getUploadFileName());
        
        // Login user ID
        // ログインユーザID
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
        return shippingActCriteria;
    }
    
    /**
     * Convert to FacadeService domain shipment performance domain.
     * <br />船積実績ドメインをFacadeServiceドメインに変換します。
     *
     * @param updateDomain Search conditions domain passed from the screen<br />
     * 画面から渡された検索条件ドメイン
     * @param shippingActDomain Shipment performance domain<br />
     * 船積実績ドメイン
     * @return Conversion result<br />
     * 変換結果
     */
    protected W7006UpdateDomain convertToCriteriaDomain(W7006UpdateDomain updateDomain, W7001ShippingActDomain shippingActDomain) {

        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        criteriaDomain.setComUpdateTimestamp(shippingActDomain.getComUpdateTimestamp());
        
        // Invoice information
        // インボイス情報
        W7001ShippingActInvoiceDomain invoiceDomain = shippingActDomain.getShippingActInvoiceList().get(0);
        criteriaDomain.setShippingActStatus(invoiceDomain.getShippingActStatus());
        criteriaDomain.setComUpdateTimestampInvoice(invoiceDomain.getComUpdateTimestamp());
        
        // Display item initialization of file data.
        // ファイルデータの表示項目初期化
        criteriaDomain.setCoFileName(StringUtils.EMPTY);
        criteriaDomain.setNonWdFileName(StringUtils.EMPTY);
        
        // Shipping document & File management information
        // 船積書類＆ファイル管理情報
        List<? extends W7001ShippingActDocDomain> shippingActDocList = shippingActDomain.getShippingActDocList();
        List<W7006ListDomain> othersFileList = new ArrayList<W7006ListDomain>();
        for(W7001ShippingActDocDomain docDomain : shippingActDocList) {
            // DOC_TYP is data of '1'. 
            // DOC_TYPが'1'のデータ
            if (DOC_TYP_CO.equals(docDomain.getDocTyp())) {
                if (StringUtils.isEmpty(criteriaDomain.getCoFileName())) {
                    criteriaDomain.setCoFileName(docDomain.getFileName());
                }
            } 
            // DOC_TYP is data of '2'. 
            // DOC_TYPが'2'のデータ
            else if (DOC_TYP_NON_WOODEN.equals(docDomain.getDocTyp())){
                if (StringUtils.isEmpty(criteriaDomain.getNonWdFileName())) {
                    criteriaDomain.setNonWdFileName(docDomain.getFileName());
                }
            }
            // DOC_TYP is data of '3'. 
            // DOC_TYPが'3'のデータ
            else if (DOC_TYP_OTHERS.equals(docDomain.getDocTyp())){
                // Others is a maximum of 10 affairs. 
                // Othersは最大10件まで
                if (othersFileList.size() >= MAX_OTHERS_FILE) {
                    continue;
                }
                W7006ListDomain othersFile = new W7006ListDomain();
 
                othersFile.setFileName(docDomain.getFileName());
                othersFile.setBrch(docDomain.getBrch().toPlainString());
                
                othersFileList.add(othersFile);
            }
        }
        // 10 or less cases use +one acquisition number. 
        // 10件以下の場合取得件数+1件にする
        if (MAX_OTHERS_FILE > othersFileList.size()) {
            othersFileList.add(new W7006ListDomain());
        }
        
        updateDomain.setW7006CriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(othersFileList);
        updateDomain.setUpdateCount(shippingActDomain.getUpdateCount());
        
        return updateDomain;
    }
}
