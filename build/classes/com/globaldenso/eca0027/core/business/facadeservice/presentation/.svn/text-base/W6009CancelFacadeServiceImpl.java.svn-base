/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;

import java.util.Arrays;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation of the Facade class service to its Cancel action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のCancelアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009CancelFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11654 $
 */
public class W6009CancelFacadeServiceImpl extends AbstractTransactFacadeService<W6009CriteriaDomain, W6009CriteriaDomain>{

    /**
     * Documentation Service<br />
     * Documentationサービス
     */
    protected W6001DocService w6001DocService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009CancelFacadeServiceImpl(){
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
    protected W6009CriteriaDomain filterDomain(W6009CriteriaDomain criteriaDomain)
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
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * DB integrity check
     * <br />DB整合性チェック
     * <pre>
     * - Night batch check 
     *     With the name of the shipper and Cml Typ code of search criteria domain,
     *      call the {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}.
     * -Cancel availability check
     *     An item as an argument of the following screen,
     *     Call the {@link W6001DocService#validateDatabaseTtInvoiceOnRegisterCancel(String, String, Date)}.
     *       - Shipper code 
     *       - No invoice 
     *       - Invoice date
     * </pre>
     * <pre>
     * ‐夜間バッチ中チェック
     *     検索条件ドメインの荷主コードとCml Typを引数にして、
     *     {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}を呼出します。
     *     
     * ‐キャンセル可否チェック
     *     画面の下記の項目を引数に
     *     {@link W6001DocService#validateDatabaseTtInvoiceOnRegisterCancel(String, String, Date)}を呼出します。
     *       ‐荷主コード
     *       ‐インボイスNo
     *       ‐インボイス発行日
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Check night batch.
        // 夜間バッチチェックを行う

        String errCd = w6001DocService.validateDatabaseCigmaAvailable(criteriaDomain.getShipperCd(), criteriaDomain.getCmlTyp());
        if (errCd != null){
            throw new ValidationException(Arrays.asList(new MessageDomain("", errCd, null)));
        }
        
        // Check cancellation propriety.
        // キャンセル可否チェック
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invoiceIssueDt = DateUtil.parseDate(criteriaDomain.getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
        Date invoiceIssueDt = criteriaDomain.getInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        String msgId = w6001DocService.validateDatabaseTtInvoiceOnRegisterCancel(criteriaDomain.getShipperCd(), criteriaDomain.getInvoiceNo(), invoiceIssueDt);
        if (StringUtils.isNotEmpty(msgId)) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", msgId, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     *  - Cancel the invoice. 
     *      Set the following items in the {@link W6001DocCriteriaDomain}, 
     *       Call the {@link W6001DocService#transactOnRegisterCancel(W6001DocCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐インボイスのキャンセル処理を行います。
     *     {@link W6001DocCriteriaDomain}に以下の項目を設定し、
     *     {@link W6001DocService#transactOnRegisterCancel(W6001DocCriteriaDomain)}を呼出します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
 
        W6001DocCriteriaDomain docCriteria = prepareCriteriaDomain(criteriaDomain);
        
        W6001DocInvoiceDomain docInvoiceDomain = w6001DocService.transactOnRegisterCancel(docCriteria);
        
        return convertW6009CriteriaDomain(docInvoiceDomain, criteriaDomain);
    }
    
    /**
     * 
     * Convert to BL layer from the screen for domain domain.
     * <br />画面用ドメインからBL層用ドメインに変換します。
     * 
     * @param criteriaDomain Screen for the search criteria domain<br />
     * 画面用検索条件ドメイン
     * @return BL layer search criteria domain<br />
     * BL層用検索条件ドメイン
     */
    protected W6001DocCriteriaDomain prepareCriteriaDomain (W6009CriteriaDomain criteriaDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, dateFormat);
        
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteria;
    }
    
    /**
     * 
     * (Transition from the Main screen) Transform to the screen display data from the getting data.
     * <br />取得したデータを画面表示データに変換します（Main画面から遷移時）
     * 
     * @param invoiceDomain Invoice domain of search results obtained<br />
     * 取得した検索結果のインボイスドメイン
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Screen display search criteria domain<br />
     * 画面表示用検索条件ドメイン
     */
    protected W6009CriteriaDomain convertW6009CriteriaDomain (W6001DocInvoiceDomain invoiceDomain, W6009CriteriaDomain criteriaDomain) {
        W6009CriteriaDomain resultDomain = new W6009CriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, invoiceDomain, dateFormat);
        
        resultDomain.setDocumentType(invoiceDomain.getC2());
        resultDomain.setClassOfInv(invoiceDomain.getC3());
        
        // Format number
        resultDomain.setNetAmount(NumberUtil.format(invoiceDomain.getNetAmount(), FORMAT_PRICE));
        resultDomain.setFreight(NumberUtil.format(invoiceDomain.getFreight(), FORMAT_PRICE));
        resultDomain.setInsurance(NumberUtil.format(invoiceDomain.getInsurance(), FORMAT_PRICE));
        resultDomain.setSubTotal(NumberUtil.format(invoiceDomain.getSubTotal(), FORMAT_PRICE));
        resultDomain.setHandlingCharge(NumberUtil.format(invoiceDomain.getHandlingCharge(), FORMAT_PRICE));
        resultDomain.setAdditionalCharge(NumberUtil.format(invoiceDomain.getAdditionalCharge(), FORMAT_PRICE));
        resultDomain.setVat(NumberUtil.format(invoiceDomain.getVat(), FORMAT_PRICE));
        resultDomain.setVatRatio(NumberUtil.format(invoiceDomain.getVatRatio(), FORMAT_RATIO));
        resultDomain.setTotalInvoiceAmount(NumberUtil.format(invoiceDomain.getTotalInvoiceAmount(), FORMAT_PRICE));
        resultDomain.setNoCharge(NumberUtil.format(invoiceDomain.getNoCharge(), FORMAT_PRICE));
        
        resultDomain.setTotalVolume(NumberUtil.format(invoiceDomain.getTotalVolume(), FORMAT_VOLUME));
        resultDomain.setTotalNetWeight(NumberUtil.format(invoiceDomain.getTotalNetWeight(), FORMAT_WEIGHT));
        resultDomain.setTotalGrossWeight(NumberUtil.format(invoiceDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
        
        // Reference Inv. No.1
        // 2015/3/31 DNJP.Kawamura UT210対応 START >>>>>
//        if (CML_TYPE_CIGMA.equals(criteriaDomain.getCmlTyp()) || CML_TYPE_ERT.equals(criteriaDomain.getCmlTyp())) {
//            if (CANCEL_TYP_CANCEL.equals(criteriaDomain.getCancelTyp())) {
        if (CML_TYPE_CIGMA.equals(invoiceDomain.getCmlTyp()) || CML_TYPE_ERT.equals(invoiceDomain.getCmlTyp())) {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
        // 2015/3/31 DNJP.Kawamura UT210対応 END <<<<<
                // Display invoice before cancellation. 
                // キャンセル前のインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display re invoice
                // リインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getRelateInvoiceNo());
            }
        } else {
            // 2015/3/31 DNJP.Kawamura UT210対応 START >>>>>
//            if (CANCEL_TYP_CANCEL.equals(criteriaDomain.getCancelTyp())) {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
            // 2015/3/31 DNJP.Kawamura UT210対応 END <<<<<

                // Display invoice before cancellation. 
                // キャンセル前のインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display main invoice
                // メインのインボイスを表示
                resultDomain.setRelateInvoiceNo1(invoiceDomain.getParInvoiceNo());
            }
        }
        
        // Reference Inv. No.2
        // 2015/3/31 DNJP.Kawamura UT210対応 START >>>>>
//        if (CANCEL_TYP_CANCEL.equals(criteriaDomain.getCancelTyp())) {
        if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
        // 2015/3/31 DNJP.Kawamura UT210対応 END <<<<<
            // Display invoice before cancellation. 
            // キャンセル前のインボイスを表示
            resultDomain.setRelateInvoiceNo2(invoiceDomain.getRelateInvoiceNo());
        } else {
            // Display main invoice
            // メインのインボイスを表示
            resultDomain.setRelateInvoiceNo2(StringUtils.EMPTY);
        }
        
        // Set check box
        // チェックボックスの設定
        if (FLAG_Y.equals(invoiceDomain.getFree1DispFlg())) {
            resultDomain.setFree1DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree1DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree2DispFlg())) {
            resultDomain.setFree2DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree2DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree3DispFlg())) {
            resultDomain.setFree3DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree3DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree4DispFlg())) {
            resultDomain.setFree4DispFlg(CHECK_ON);
        } else {
            resultDomain.setFree4DispFlg(CHECK_OFF);
        }
        
        resultDomain.setOriginalScreenId(criteriaDomain.getOriginalScreenId());
        
        return resultDomain;
    }
}
