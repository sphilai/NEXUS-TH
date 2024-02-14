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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * 
 * A service for Facade ChangeStatus action of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のChangeStatusアクションに対するFacadeサービスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11614 $
 */
public class W7006ChangeStatusFacadeServiceImpl extends AbstractUpdateFacadeService<W7006UpdateDomain, W7006UpdateDomain> {

    /**
     * Shipping actuality service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7006ChangeStatusFacadeServiceImpl() {
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
     * - The shipping lock and acquisition track record number check .
     *     Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus}
     *     
     * - Invoice number lock and get check .
     *     Call {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegister(String, String, Date, String[])}
     * </pre>
     * <pre>
     * ‐船積実績 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus}を呼出す
     *     
     * ‐インボイス ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegister(String, String, Date, String[])}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        W7001ShippingActCriteriaDomain serviceCriteria = new W7001ShippingActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(serviceCriteria, criteriaDomain);
        
        String shipperCd = criteriaDomain.getShipperCd();
        String invoiceNo = criteriaDomain.getInvoiceNo();
        
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invoiceIssueDt = DateUtil.parseDate(criteriaDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
        Date invoiceIssueDt = criteriaDomain.getInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        String[] cmlTyp = new String[1];
        
        // Shipping actuality The lock & number check 
        // 船積実績 ロック＆存在チェック
        if (!w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(serviceCriteria)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        updateDomain.setBuilldFileIdList(serviceCriteria.getBilldFileIdList());
        updateDomain.setClpGroup(serviceCriteria.getClpGroup());
        updateDomain.setContainerLooseTyp(serviceCriteria.getContainerLooseTyp());
        
        // Invoice The lock & number check 
        // インボイス ロック＆存在チェック
        if (!w7001ShippingActService.validateDatabaseTtInvoiceOnRegister(shipperCd, invoiceNo, invoiceIssueDt, cmlTyp)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Conditions domain creation of shipping actuality service .
     *      Convert {@link W7006UpdateDomain}を{@link W7001ShippingActCriteriaDomain}
     *      
     * - Status update shipment record, invoice.
     *      Call {@link W7001ShippingActService#updateOnOtherDocUploadIndividualChangeStatus}
     * </pre>
     * 
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7006UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     * 
     * ‐船積実績、インボイスのステータス更新
     *     {@link W7001ShippingActService#updateOnOtherDocUploadIndividualChangeStatus}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7006UpdateDomain callServices(W7006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
     
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActCriteriaDomain(updateDomain);
        
        W7001ShippingActDomain shippingAct = w7001ShippingActService.updateOnOtherDocUploadIndividualChangeStatus(shippingActCriteria);
        
        return convertToCriteriaDomain(updateDomain, shippingAct);
    }

    /**
     * 
     * Create a condition of shipping actuality service domain.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Domain conditions of shipping actuality Main screen<br />
     * 船積実績Main画面の条件ドメイン
     * @return Conditions of shipping actuality service domain<br />
     * 船積実績サービスの条件ドメイン
     */
    protected W7001ShippingActCriteriaDomain createShippingActCriteriaDomain(W7006UpdateDomain updateDomain) {
        W7006CriteriaDomain criteriaDomain = updateDomain.getW7006CriteriaDomain();
        
        W7001ShippingActCriteriaDomain shippintActCriteria = new W7001ShippingActCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippintActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // Billd file ID.
        shippintActCriteria.setBilldFileIdList(updateDomain.getBuilldFileIdList());
        // CLP Group
        shippintActCriteria.setClpGroup(updateDomain.getClpGroup());
        // Container Loose type
        shippintActCriteria.setContainerLooseTyp(updateDomain.getContainerLooseTyp());
        
        W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
        invoiceDomain.setShippingActStatus(criteriaDomain.getShippingActStatus());
        invoiceDomain.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestampInvoice());
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        invoiceList.add(invoiceDomain);
        
        shippintActCriteria.setShippingActInvoiceList(invoiceList);
        
        return shippintActCriteria;
    }
    
    /**
     * Convert FacadeService domain to shipping actuality domain.
     * <br />船積実績ドメインをFacadeServiceドメインに変換します。
     *
     * @param updateDomain Search conditions domain passed from the screen<br />
     * 画面から渡された検索条件ドメイン
     * @param shippingActDomain Shipping actuality domain<br />
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
        
        // Display item initialization of file data 
        // ファイルデータの表示項目初期化
        criteriaDomain.setCoFileName(StringUtils.EMPTY);
        criteriaDomain.setNonWdFileName(StringUtils.EMPTY);
        
        // Shipping actuality & File management information
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
