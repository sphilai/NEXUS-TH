/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0109;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0133;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
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
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * 
 * The service for the Facade of Action Register Shipping Actuality Register screen.
 * <br />船積実績Register画面のRegisterアクションに対するFacadeサービスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13885 $
 */
public class W7004RegisterFacadeServiceImpl extends AbstractTransactFacadeService<W7004UpdateDomain, W7004UpdateDomain>{

    /**
     * Shipping Actuality Service.<br />
     * 船積実績サービス
     */
    protected W7001ShippingActService w7001ShippingActService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004RegisterFacadeServiceImpl() {
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
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking.
     * 
     * </pre>
     * <pre>
     * ‐共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        Validator<W7004CriteriaDomain> valid 
            = new Validator<W7004CriteriaDomain>(criteriaDomain, "w7004CriteriaDomain");
        
        String[] properties = {
            "atd",
            "eta",
            "carrierCompCd",
            "vessel",
            "billdNo",
            "containerLooseTyp"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W7004);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Check correlation.
     *   The check in date correlation of ETD and ATD.
     * </pre>
     * <pre>
     * ‐相関チェック
     *     ATDとETDの日付の相関チェックを行います。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        if(!w7001ShippingActService.validateConsistencyAtdEta(criteriaDomain.getAtd(), 
            DateUtil.addDate(criteriaDomain.getEta(), criteriaDomain.getScreenDateFormat(), 1),
            criteriaDomain.getScreenDateFormat())) {
            MessageDomain msg = new MessageDomain("w7004CriteriaDomain.eta", NXS_E7_0133, null);
            errorList.add(msg);
        }
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Presence check.
     *   Shipper presence check.
     *   Consignee presence check.
     *   NEXUS Ship to Com. Existence check.
     *   Carrier presence check.
     *
     * - Get the number of check.
     *   Shipping Actuality (correction mode).
     *   (If new mode) Invoice .
     *   (In the case of correction mode) Shipping Actuality Invoice Work.
     *   (In the case of correction mode) Invoice .
     *   (In the case of correction mode) Shipping Actuality Receive Order .
     *   (In the case of correction mode) Shipping Document .
     *   (In the case of correction mode) File Manage.
     * 
     * -CIGMA data check
     * 
     * </pre>
     * <pre>
     * ‐存在チェック
     *     Shipper存在チェック
     *     Consignee存在チェック
     *     NEXUS Ship to Com.存在チェック
     *     Carrier存在チェック
     * 
     * ‐取得件数チェック
     *     船積実績（修正モード時）
     *     インボイス（新規モードの場合）
     *     船積実績対象インボイスワーク（修正モードの場合）
     *     インボイス（修正モードの場合）
     *     船積実績対象品受注情報（修正モードの場合）
     *     船積書類（修正モードの場合）
     *     ファイル管理（修正モードの場合）
     * ‐CIGMAのデータチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W7004ListDomain> listDomainList = updateDomain.getListDomainList();
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Shipper existence check 
        // Shipper存在チェック
        if(!w7001ShippingActService.validateDatabaseShipper(criteriaDomain.getShipperCd())) {
            MessageDomain msgShipperCd = new MessageDomain("w7004CriteriaDomain.shipperCd", NXS_E7_0111, null);
            errorList.add(msgShipperCd);
        }
        
        // Consignee existence check 
        // Consignee存在チェック
        // UT280 Consigneeの入力があれば実施するように変更
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getConsigneeCd())) {
            if(!w7001ShippingActService.validateDatabaseConsignee(criteriaDomain.getConsigneeCd())) {
                MessageDomain msgConsigneeCd = new MessageDomain("w7004CriteriaDomain.consigneeCd", NXS_E7_0109, null);
                errorList.add(msgConsigneeCd);
            }
        }
        
        // NEXUS Ship to Com. existence check 
        // NEXUS Ship to Com.存在チェック
        if(!w7001ShippingActService.validateDatabaseCompCd(criteriaDomain.getShipToCompCd())) {
            MessageDomain msgShipToCompCd = new MessageDomain("w7004CriteriaDomain.shipToCompCd", NXS_E7_0071, null);
            errorList.add(msgShipToCompCd);
        }
        
        // Carrier existence check 
        // Carrier存在チェック
        if(!w7001ShippingActService.validateDatabaseCarrier(criteriaDomain.getCarrierCompCd())) {
            MessageDomain msgShipToCompCd = new MessageDomain("w7004CriteriaDomain.carrierCompCd", NXS_E7_0113, null);
            errorList.add(msgShipToCompCd);
        }
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
        
        //String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correction mode
        // 修正モード
        if(MODE_EDIT.equals(criteriaDomain.getProcMode())) {
            W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
            CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
            shippingActCriteria.setDscId(criteriaDomain.getLoginUserDscId());
            
            // Shipping Actuality status check 
            // 船積実績ステータスチェック
            String msgId = w7001ShippingActService.validateDatabaseTtShippingActOnUpdateRegister(shippingActCriteria);
            if(msgId != null) {
                throw new ValidationException(Arrays.asList(new MessageDomain("", msgId, null)));
            }
            
            // Shipping Actuality The lock & number check 
            // 船積実績取得 ロック＆件数チェック
            if(!w7001ShippingActService.validateDatabaseTtShippingActOnRegister(shippingActCriteria)) {
                throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
            }
            
            // Resets to UpdateDomain. 
            // UpdateDomainにセットしなおす
            updateDomain.setClpFileIdList(shippingActCriteria.getClpFileIdList());
            
            // Shipping Actuality Invoice Work
            // 船積実績対象インボイスワーク
            if(w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnRegister(shippingActCriteria)) { 
                // Processing in case the number of the acquisition results of Shipping Actuality Invoice Work is not zero
                // 船積実績対象インボイスワークの取得結果が0件ではない場合の処理
                
                List<W7004ListDomain> newListDomainList = new ArrayList<W7004ListDomain>();
                
                updateDomain.setFileIdList(new ArrayList<String>());
                updateDomain.setComUpdateTimeFileList(new ArrayList<Timestamp>());
                // acquired Shipping Actuality Invoice Work track record 
                // 取得した船積実績対象インボイスワーク
                for(W7001ShippingActInvoiceDomain twInvoice : shippingActCriteria.getShippingActInvoiceList()) {
                    String shipperCd = twInvoice.getShipperCd();
                    String invoiceNo = twInvoice.getInvoiceNo();
                    Date invoiceIssueDt = twInvoice.getInvoiceIssueDt();
                    String[] cmlTyp = new String[1];
                    String[] deleteFlag = new String[1];
                    
                    // Invoice The lock & number check 
                    // インボイス ロック＆件数チェック
                    if(!w7001ShippingActService.validateDatabaseTtInvoiceOnRegister(shipperCd, invoiceNo, invoiceIssueDt, cmlTyp)) {
                        throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                    }
                    // Acquired CML TYP is set up.
                    // 取得したCML TYPを設定
                    twInvoice.setCmlTyp(cmlTyp[0]);
                    
                    // Lock Shipping Actuality Receive Order
                    // 船積実績対象品受注情報 ロック
                    if(!w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegister(criteriaDomain.getShippingActNo(), shipperCd, invoiceNo, invoiceIssueDt, false, deleteFlag)) {
                        throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                    }
                    
                    // Lock Shipping Document
                    // 船積書類テーブル ロック
                    List<W7001ShippingActDocDomain> docDomainList = new ArrayList<W7001ShippingActDocDomain>();
                    if(!w7001ShippingActService.validateDatabaseTtShippingDocumentOnRegister(shipperCd, invoiceNo, invoiceIssueDt, docDomainList, false)) {
                        throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                    }
                    
                    List<String> fileIdList = new ArrayList<String>();
                    List<Timestamp> comUpdateTimeStampFileList = new ArrayList<Timestamp>();
                    // File Manager The lock & number check 
                    // ファイル管理 ロック＆取得件数チェック
                    for (W7001ShippingActDocDomain docDomain : docDomainList) {
                        if(!w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(docDomain)) {
                            throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                        }
                        // File ID for deletion is passed to callService. 
                        // 削除対象のファイルIDをcallServiceに渡す
                        if (FLAG_Y.equals(docDomain.getDeleteFlag())) {
                            fileIdList.add(docDomain.getFileId());
                            comUpdateTimeStampFileList.add(docDomain.getComUpdateTimestamp());
                        }
                    }
                    updateDomain.getFileIdList().addAll(fileIdList);
                    updateDomain.getComUpdateTimeFileList().addAll(comUpdateTimeStampFileList);
                    
                    // The data acquired from the invoice work for a loading track record is set as an argument, and is returned. 
                    // 船積実績対象インボイスワークから取得したデータを引数に設定して返す
                    W7004ListDomain listDomain = new W7004ListDomain();
                    listDomain.setShipperCd(shipperCd);
                    listDomain.setInvoiceNo(invoiceNo);
                    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
                    //listDomain.setInvoiceIssueDt(DateUtil.formatDate(invoiceIssueDt, dateFormat));
                    listDomain.setInvoiceIssueDt(invoiceIssueDt);
                    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
                    // CML TYP acquired from the invoice table 
                    // インボイステーブルから取得したCML TYP
                    listDomain.setCmlTyp(cmlTyp[0]);
                    // Shipping Actuality Receive Order The data flag for deletion 
                    // 船積実績対象品受注情報 削除対象データフラグ
                    listDomain.setDeleteFlagForOdr(deleteFlag[0]);
                    // Shipping document The data flag for deletion 
                    // 船積書類 削除対象データフラグ
                    if (docDomainList.size() > 0) {
                        // Data for deletion 
                        // 削除対象データ
                        listDomain.setDeleteFlagForDoc(FLAG_Y);
                    }
                    
                    newListDomainList.add(listDomain);
                }
                updateDomain.setListDomainList(newListDomainList);
            } else {
                updateDomain.setListDomainList(new ArrayList<W7004ListDomain>());
            }
        }
        
        // new mode
        // 新規モード
        if(MODE_NEW.equals(criteriaDomain.getProcMode())) {

            // UT456 ADD START
            // Palletize status check
            // パレタイズステータスチェック
            StringBuffer errorInvoiceNo = new StringBuffer();
            if (!w7001ShippingActService.validateDatabaseTtPltzOnRegister(criteriaDomain.getLoginUserDscId(), errorInvoiceNo)) {
                String[] params = {
                    errorInvoiceNo.toString(),
                };                
                throw new ValidationException(Arrays.asList(new MessageDomain(null, NXS_E1_0020, params)));
            }
            // UT456 ADD END

            String shipperCd = criteriaDomain.getShipperCd();
            
            for(W7004ListDomain listDomain : listDomainList) {
                String invoiceNo = listDomain.getInvoiceNo();
                // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
                //Date invoiceIssueDt = DateUtil.parseDate(listDomain.getInvoiceIssueDt(), dateFormat);
                Date invoiceIssueDt = listDomain.getInvoiceIssueDt();
                // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
                String[] cmlTyp = new String[1];
                
                // Lock invoice
                // インボイスをロック
                if(!w7001ShippingActService.validateDatabaseTtInvoiceOnRegister(shipperCd, invoiceNo, invoiceIssueDt, cmlTyp)) {
                    throw new ValidationException(Arrays.asList(new MessageDomain("", GSCM_E0_0010, null)));
                }
            }
        }
        
        // Data check of CIGMA 
        // CIGMAのデータチェック
        StringBuffer cigmaEdiStatus = new StringBuffer(); // output param.
        String msgId = w7001ShippingActService.validateDatabaseShippingActStatus(false, criteriaDomain.getShipperCd()
            , criteriaDomain.getTrnsCd(), criteriaDomain.getLoginUserDscId(), criteriaDomain.getProcMode(), cigmaEdiStatus);
        if(StringUtils.isNotEmpty(msgId)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", msgId, null)));
        }

        // Take over EDI status from CIGMA. To use update processing.
        // It has meaning only in the correction mode and it is used for branching by updating.
        // CIGMAから取得したEDI連係ステータスの値を引き継ぐ。修正モードの場合のみ意味を持ち更新で分岐に使用する。
        // 20170314 ADD
        criteriaDomain.setCigmaEdiStatus(cigmaEdiStatus.toString());
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Domain creation of conditions Shipping Actuality Service.
     *   Convert to the {@link W7004UpdateDomain}を{@link W7001ShippingActCriteriaDomain}
     * 
     * - Shipping Actuality table registration and update process.
     *   In the case of the new mode
     *     Call {@link W7001ShippingActService#transactOnRegisterByFromCreate}
     *   In the case of correction mode
     *     Call {@link W7001ShippingActService#transactOnRegisterByFromMain}
     * 
     * </pre>
     * <pre>
     * ‐船積実績サービスの条件ドメイン作成
     *     {@link W7004UpdateDomain}を{@link W7001ShippingActCriteriaDomain}に変換する
     *     
     * ‐船積実績テーブル登録・更新処理
     *     新規モードの場合
     *         {@link W7001ShippingActService#transactOnRegisterByFromCreate}を呼出す
     *     修正モードの場合
     *         {@link W7001ShippingActService#transactOnRegisterByFromMain}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7004UpdateDomain callServices(W7004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        W7001ShippingActCriteriaDomain shippingActCriteria = createShippingActDomain(updateDomain);
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        W7001ShippingActDomain shippingAct = null;
        if(MODE_NEW.equals(criteriaDomain.getProcMode())) {
            shippingAct = w7001ShippingActService.transactOnRegisterByFromCreate(shippingActCriteria, dateFormat);
        } else {
            shippingAct = w7001ShippingActService.transactOnRegisterByFromMain(shippingActCriteria, dateFormat);
        }
        
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
        
        // Screen domain
        // 画面ドメイン
        W7004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        List<? extends W7004ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // BL domain
        // BLドメイン
        W7001ShippingActCriteriaDomain shippingActCriteria = new W7001ShippingActCriteriaDomain();
        List<W7001ShippingActInvoiceDomain> invoiceList = new ArrayList<W7001ShippingActInvoiceDomain>();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Copy domain
        // ドメインのコピー
        CommonUtil.copyPropertiesDomainToDomain(shippingActCriteria, criteriaDomain, dateFormat);
        shippingActCriteria.setClpFileIdList(updateDomain.getClpFileIdList());
        
        // Search result
        // 検索結果
        String needOtherDocFlg = FLAG_N;
        for(W7004ListDomain listDomain : listDomainList) {
            W7001ShippingActInvoiceDomain invoiceDomain = new W7001ShippingActInvoiceDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(invoiceDomain, listDomain, dateFormat);
            
            invoiceList.add(invoiceDomain);
            
            if(FLAG_Y.equals(listDomain.getNeedOtherDocFlg())) {
                needOtherDocFlg = FLAG_Y;
            }
        }
        shippingActCriteria.setShippingActInvoiceList(invoiceList);
        shippingActCriteria.setNeedOtherDocFlg(needOtherDocFlg);
        
        // File ID for deletion 
        // 削除対象ファイルID
        List<W7001ShippingActDocDomain> docDomainList = new ArrayList<W7001ShippingActDocDomain>();
        if (updateDomain.getFileIdList() != null) {
            for (int i = 0; i < updateDomain.getFileIdList().size(); i++) {
                W7001ShippingActDocDomain docDomain = new W7001ShippingActDocDomain();
                
                docDomain.setFileId(updateDomain.getFileIdList().get(i));
                docDomain.setComUpdateTimestamp(updateDomain.getComUpdateTimeFileList().get(i));
                
                docDomainList.add(docDomain);
            }
        }
        shippingActCriteria.setShippingActDocList(docDomainList);
        
        // A setup for the maximum number acquisition 
        // 最大件数取得のための設定
        shippingActCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Login DSC-ID
        // ログインDSC-ID
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
    protected W7004UpdateDomain convertToListDomain(W7001ShippingActDomain shippingAct, W7004UpdateDomain inputDomain) {

        if (null == shippingAct) {
            return null;
        }
        
        W7004CriteriaDomain criteriaDomain = new W7004CriteriaDomain();
        List<W7004ListDomain> listDomainList = new ArrayList<W7004ListDomain>();

        String dateFormat = inputDomain.getCriteriaDomain().getScreenDateFormat();
        
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
            // Transが'A' または Auto Invoice Registerが'N'の場合「Print CLP」ボタン非活性
            criteriaDomain.setDisabledFlgForPrintClp(FLAG_Y);
        }
        if (PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT.equals(criteriaDomain.getShippingActStatus())) {
            // Statusが"20"のとき「Move to Other Doc. Upload」ボタン非活性
            criteriaDomain.setDisabledFlgForMoveToOtherDocUpload(FLAG_Y);
        }
        
        // ATD
        criteriaDomain.setAtd(DateUtil.formatDate(shippingAct.getAtd(), dateFormat));
        // ETA
        criteriaDomain.setEta(DateUtil.formatDate(shippingAct.getEta(), dateFormat));
        // date format
        criteriaDomain.setScreenDateFormat(dateFormat);
        // Processing mode 
        // 処理モード
        criteriaDomain.setProcMode(MODE_EDIT);
        
        // Detailed part
        // 明細部分
        if (shippingAct.getShippingActInvoiceList() != null) {
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
        
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        updateDomain.setUpdateCount(shippingAct.getUpdateCount());
        
        return updateDomain;
    }
}
