/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
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

/**
 * 
 * The service to its Cancel Facade action of Shipping Actuality Register screen.
 * <br />船積実績Register画面のCancelアクションに対するFacadeサービスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13994 $
 */
public class W7004CancelFacadeServiceImpl extends AbstractTransactFacadeService<Integer, W7004UpdateDomain> {

    /**
     * Shipping Actuality Service<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004CancelFacadeServiceImpl() {
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
     * - CIGMA data check.
     *   Call {@link W7001ShippingActService#validateDatabaseShippingActStatus}
     * 
     * - Shipping Actuality lock and get the number of check.
     *   Call {@link W7001ShippingActService#validateDatabaseTtShippingActOnRegisterCancel}
     * 
     * - Invoice number lock and get check
     *   Call {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterCancel}
     * 
     * - Shipping Actuality Receive Order lock
     *   Call {@link W7001ShippingActService#validateDatabaseTtShippingActOdrOnRegisterCancel}
     * 
     * - Shipping Document lock
     *   Call {@link W7001ShippingActService#validateDatabaseTtShippingDocumentOnRegister(String, String, Date, List, boolean)}
     * 
     * - File Manage lock and get the number of check
     *   Call{@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}
     * 
     * </pre>
     * <pre>
     * ‐CIGMAのデータチェック
     *     {@link W7001ShippingActService#validateDatabaseShippingActStatus}を呼出す。
     * 
     * ‐船積実績 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOnRegisterCancel}を呼出す。
     *     
     * ‐インボイス ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseTtInvoiceOnRegisterCancel}を呼出す。
     * 
     * ‐船積実績対象品受注情報 ロック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingActOdrOnRegisterCancel}を呼出す。
     *     
     * ‐船積書類 ロック
     *     {@link W7001ShippingActService#validateDatabaseTtShippingDocumentOnRegister(String, String, Date, List, boolean)}を呼出す。
     *     
     * ‐ファイル管理 ロック＆取得件数チェック
     *     {@link W7001ShippingActService#validateDatabaseLbFileManagerByShippingActDoc(W7001ShippingActDocDomain)}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        String dscId = updateDomain.getLoginUserDscId();
        String shipperCd = criteriaDomain.getShipperCd();
        String trnsCd = criteriaDomain.getTrnsCd();
        //String procMode = criteriaDomain.getProcMode();
        
        // It checks whether CIGMA data is already linked with EDI.
        // CIGMAのデータが既にEDI連携されているかかチェックを行います。
        String msgId = w7001ShippingActService.validateDatabaseShippingActStatusForCancel(false, shipperCd, trnsCd, dscId);
        if(StringUtils.isNotEmpty(msgId)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", msgId, null)));
        }
        
        W7001ShippingActCriteriaDomain serviceCriteria = new W7001ShippingActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(serviceCriteria, criteriaDomain);
        // lock of SHIPPING ACTUALITY and Get track record number check.
        // 船積実績 ロック＆取得件数チェック
        if(!w7001ShippingActService.validateDatabaseTtShippingActOnRegisterCancel(serviceCriteria)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        updateDomain.setBuilldFileIdList(serviceCriteria.getBilldFileIdList());
        updateDomain.setClpFileIdList(serviceCriteria.getClpFileIdList());
        
        // lock of Invoice number and Get the number of check.
        // インボイス ロック＆取得件数チェック
        if(!w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterCancel(serviceCriteria)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        // The set to the domain of the argument data obtained when locked.
        // ロック時に取得したデータを引数のドメインに設定
        List<W7004ListDomain> deleteList = new ArrayList<W7004ListDomain>();
        for (W7001ShippingActInvoiceDomain invoiceDomain : serviceCriteria.getShippingActInvoiceList()) {
            W7004ListDomain deleteDomain = new W7004ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(deleteDomain, invoiceDomain, criteriaDomain.getScreenDateFormat());
            deleteList.add(deleteDomain);
        }
        updateDomain.setDeleteList(deleteList);
        
        // Lock of Shipping Actuality Receive Order.
        // 船積実績対象品受注情報 ロック
        String[] lockFlagForOdr = new String[1];
        if(!w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegisterCancel(criteriaDomain.getShippingActNo(), false, lockFlagForOdr)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
        }
        criteriaDomain.setLockFlagForOdr(lockFlagForOdr[0]);
        
        List<W7004ListDomain> newListDomainList = new ArrayList<W7004ListDomain>();
        
        updateDomain.setFileIdList(new ArrayList<String>());
        updateDomain.setComUpdateTimeFileList(new ArrayList<Timestamp>());
        for (W7001ShippingActInvoiceDomain invoiceDomain : serviceCriteria.getShippingActInvoiceList()) {
            String invShipperCd = invoiceDomain.getShipperCd();
            String invInvoiceNo = invoiceDomain.getInvoiceNo();
            Date invInvoiceIssueDt = invoiceDomain.getInvoiceIssueDt();
            
            // Lock of Shipping Document.
            // 船積書類 ロック
            List<W7001ShippingActDocDomain> docDomainList = new ArrayList<W7001ShippingActDocDomain>();
            if(!w7001ShippingActService.validateDatabaseTtShippingDocumentOnRegister(invShipperCd, invInvoiceNo, invInvoiceIssueDt, docDomainList, false)) {
                throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
            }
            
            List<String> fileIdList = new ArrayList<String>();
            List<Timestamp> comUpdateTimeStampFileList = new ArrayList<Timestamp>();
            // Lock of File Management and Get the number of check.
            // ファイル管理 ロック＆取得件数チェック
            for (W7001ShippingActDocDomain docDomain : docDomainList) {
                if(!w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(docDomain)) {
                    throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                }
                
                // pass to callService the file ID to be deleted.
                // 削除対象のファイルIDをcallServiceに渡す
                if (FLAG_Y.equals(docDomain.getDeleteFlag())) {
                    fileIdList.add(docDomain.getFileId());
                    comUpdateTimeStampFileList.add(docDomain.getComUpdateTimestamp());
                }
            }
            
            // Returns by setting the argument data from actual Shipping Actuality Invoice Work.
            // 船積実績対象インボイスワークから取得したデータを引数に設定して返す
            W7004ListDomain listDomain = new W7004ListDomain();
            listDomain.setShipperCd(invShipperCd);
            listDomain.setInvoiceNo(invInvoiceNo);
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //listDomain.setInvoiceIssueDt(DateUtil.formatDate(invInvoiceIssueDt, criteriaDomain.getScreenDateFormat()));
            listDomain.setInvoiceIssueDt(invInvoiceIssueDt);
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            listDomain.setCmlTyp(invoiceDomain.getCmlTyp());
            // Shipping documents deleted data flag.
            // 船積書類 削除対象データフラグ
            if (docDomainList.size() > 0) {
                // Deleted data
                // 削除対象データ
                listDomain.setDeleteFlagForDoc(FLAG_Y);
            }
            newListDomainList.add(listDomain);
            
            updateDomain.getFileIdList().addAll(fileIdList);
            updateDomain.getComUpdateTimeFileList().addAll(comUpdateTimeStampFileList);
        }
        updateDomain.setListDomainList(newListDomainList);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Domain creation of conditions Shipping Actuality Service.
     *   Convert to the {@link W7001ShippingActCriteriaDomain} {@link W7004UpdateDomain}.
     * 
     * - Shipping Actuality table registration and update process.
     *   Call {@link W7001ShippingActService#transactOnRegisterCancel(W7001ShippingActCriteriaDomain)}
     *
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7004UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     *     
     * ‐船積実績テーブル登録・更新処理
     *     {@link W7001ShippingActService#transactOnRegisterCancel(W7001ShippingActCriteriaDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        // Conditions domain creation of shipment service performance.
        // 船積実績サービスの条件ドメイン作成
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActDomain(updateDomain);

        // The shipping record table registration and update process.
        // 船積実績テーブル登録・更新処理
        return w7001ShippingActService.transactOnRegisterCancel(shippingActCriteria);
    }
    
    /**
     * Create the condition of domain Shipping Actuality service.
     * <br />船積実績サービスの条件ドメインを作成します。
     *
     * @param updateDomain Mass update of domain Shipping Actuality Register screen<br />
     * 船積実績Register画面の一括更新ドメイン
     * @return List of conditions domain of Shipping Actuality Service<br />
     * 船積実績サービスの条件ドメインのリスト
     */
    protected W7001ShippingActCriteriaDomain createShippingActDomain(W7004UpdateDomain updateDomain) {
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();

        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Copy of the domain.
        // ドメインのコピー
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, updateDomain.getCriteriaDomain(), criteriaDomain.getScreenDateFormat());
        
        // Copy of the login DSC-ID.
        // ログインDSC-IDのコピー
        shippingActCriteria.setDscId(updateDomain.getLoginUserDscId());
        
        // Set the deleted invoice data.
        // 削除対象インボイスデータを設定
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        for (W7004ListDomain listDomain : updateDomain.getListDomainList()) {
            W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
            CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, criteriaDomain.getScreenDateFormat());
            invoiceList.add(invoiceDomain);
        }
        shippingActCriteria.setShippingActInvoiceList(invoiceList);
        
        // Billd file ID.
        // BilldファイルID
        shippingActCriteria.setBilldFileIdList(updateDomain.getBuilldFileIdList());
        
        // CLP file ID.
        // CLP ファイルID
        shippingActCriteria.setClpFileIdList(updateDomain.getClpFileIdList());
        
        // Deleted file ID.
        // 削除対象ファイルID
        List<W7001ShippingActDocDomain> docDomainList = new ArrayList<W7001ShippingActDocDomain>();
        for (int i = 0; i < updateDomain.getFileIdList().size(); i++) {
            W7001ShippingActDocDomain docDomain = new W7001ShippingActDocDomain();
            
            docDomain.setFileId(updateDomain.getFileIdList().get(i));
            docDomain.setComUpdateTimestamp(updateDomain.getComUpdateTimeFileList().get(i));
            
            docDomainList.add(docDomain);
        }
        shippingActCriteria.setShippingActDocList(docDomainList);
        
        return shippingActCriteria;
    }
}
