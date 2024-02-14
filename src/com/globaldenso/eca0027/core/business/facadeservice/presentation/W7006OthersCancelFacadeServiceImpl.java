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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_OTHERS_FILE;

import java.math.BigDecimal;
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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * A service for Facade OthersCancel action of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のOthersCancelアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11619 $
 */
public class W7006OthersCancelFacadeServiceImpl extends AbstractDeleteFacadeService<W7006UpdateDomain, W7006UpdateDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7006OthersCancelFacadeServiceImpl() {
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
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Shipping documents lock and get the number of check .
     *    Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel}
     *    
     * - File lock management and acquisition number check .
     *    Call {@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}
     * </pre>
     * <pre>
     * ‐船積書類 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel}を呼出す
     * 
     * ‐ファイル管理 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        String shipperCd = criteriaDomain.getShipperCd();
        String invoiceNo = criteriaDomain.getInvoiceNo();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invoiceIssueDt = DateUtil.parseDate(criteriaDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
        Date invoiceIssueDt = criteriaDomain.getInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        BigDecimal brch = new BigDecimal(updateDomain.getListDomainList().get(criteriaDomain.getSelectedRow()).getBrch());
        String[] fileId = new String[1];
        
        // Shipping document The lock & number check 
        // 船積書類 ロック＆取得件数チェック
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(shipperCd, invoiceNo, invoiceIssueDt, brch, fileId)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        
        // Acquired file ID is set as a search condition domain. (For update)
        // 取得したファイルIDを検索条件ドメインに設定（更新時に使用）
        criteriaDomain.setFileId(fileId[0]);
        
        // File manager The lock & number check 
        // ファイル管理 ロック＆取得件数チェック
        W7001ShippingActDocDomain docDomain = new W7001ShippingActDocDomain();
        docDomain.setFileId(fileId[0]);
        if (w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(docDomain)) {
            // Last update date used in order to delete the data of file ID from file management 
            // ファイル管理からファイルIDのデータを削除するために使用する最終更新日
            criteriaDomain.setComUpdateTimestampFile(docDomain.getComUpdateTimestamp());
        } else {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipment service performance .
     *     Convert to the {@link W7001ShippingActCriteriaDomain} {@link W7006UpdateDomain}
     *     
     * - Delete Lock the file upload, search 
     *     Call {@link W7001ShippingActService#deleteOnOtherDocUploadIndividualOthersCancel}
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7006UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐アップロードファイルをロックして削除、再検索
     *     {@link W7001ShippingActService#deleteOnOtherDocUploadIndividualOthersCancel}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7006UpdateDomain callServices(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // 船積実績サービスの条件ドメイン作成
        W7001ShippingActCriteriaDomain shippingActtCriteria = createShippingActCriteriaDomain(updateDomain);
        
        // 検索データの取得
        W7001ShippingActDomain shippingAct = w7001ShippingActService.deleteOnOtherDocUploadIndividualOthersCancel(shippingActtCriteria);
        
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
        
        // 条件ドメインの作成
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        
        // 条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // ファイル情報を書類情報ドメインに設定する
        List<W7001ShippingActDocDomain> docList = new ArrayList<W7001ShippingActDocDomain>();
        
        W7001ShippingActDocDomain docDomain = new W7001ShippingActDocDomain();
        CommonUtil.copyPropertiesDomainToDomain(docDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        docDomain.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestampFile());
        docList.add(docDomain);
        
        shippingActCriteria.setShippingActDocList(docList);
        
        // 選択行の枝番
        shippingActCriteria.setBrch(new BigDecimal(updateDomain.getListDomainList().get(criteriaDomain.getSelectedRow()).getBrch()));
        
        // ログインユーザーID
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
        return shippingActCriteria;
    }
    
    /**
     * Convert to FacadeService domain shipment performance domain.
     * <br />船積実績ドメインをFacadeServiceドメインに変換します。
     *
     * @param updateDomain Bulk domain conditions passed from the screen<br />
     * 画面から渡された一括条件ドメイン
     * @param shippingActDomain Shipping actuality domain<br />
     * 船積実績ドメイン
     * @return Conversion result<br />
     * 変換結果
     */
    protected W7006UpdateDomain convertToCriteriaDomain(W7006UpdateDomain updateDomain, W7001ShippingActDomain shippingActDomain) {
    
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        // 画面用ドメインに船積実績情報を設定
        criteriaDomain.setComUpdateTimestamp(shippingActDomain.getComUpdateTimestamp());
        
        // インボイス情報
        W7001ShippingActInvoiceDomain invoiceDomain = shippingActDomain.getShippingActInvoiceList().get(0);
        criteriaDomain.setShippingActStatus(invoiceDomain.getShippingActStatus());
        criteriaDomain.setComUpdateTimestampInvoice(invoiceDomain.getComUpdateTimestamp());
        
        // ファイルデータの表示項目初期化
        criteriaDomain.setCoFileName(StringUtils.EMPTY);
        criteriaDomain.setNonWdFileName(StringUtils.EMPTY);
        
        // 船積書類＆ファイル管理情報
        List<? extends W7001ShippingActDocDomain> shippingActDocList = shippingActDomain.getShippingActDocList();
        List<W7006ListDomain> othersFileList = new ArrayList<W7006ListDomain>();
        for(W7001ShippingActDocDomain docDomain : shippingActDocList) {
            // DOC_TYPが'1'のデータ
            if (DOC_TYP_CO.equals(docDomain.getDocTyp())) {
                if (StringUtils.isEmpty(criteriaDomain.getCoFileName())) {
                    criteriaDomain.setCoFileName(docDomain.getFileName());
                }
            } 
            // DOC_TYPが'2'のデータ
            else if (DOC_TYP_NON_WOODEN.equals(docDomain.getDocTyp())){
                if (StringUtils.isEmpty(criteriaDomain.getNonWdFileName())) {
                    criteriaDomain.setNonWdFileName(docDomain.getFileName());
                }
            }
            // DOC_TYPが'3'のデータ
            else if (DOC_TYP_OTHERS.equals(docDomain.getDocTyp())){
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
