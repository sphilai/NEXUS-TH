/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_1;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_2;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_4;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_5;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation of the Facade class service to Init action of Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6002InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11666 $
 */
public class W6002InitFacadeServiceImpl extends 
    AbstractSearchFacadeService<W6002CriteriaDomain, W6002CriteriaDomain>{
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002InitFacadeServiceImpl(){
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
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6002CriteriaDomain filterDomain(W6002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * Checking of the single item.
     * <br />単項目チェックを行う。
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Checking of the consistency.
     * <br />整合性チェックを行う。
     *
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Checking of the database.
     * <br />データベースチェックを行う。
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <pre>
     * - Create a search condition domain. 
     *     Create the {@link W6001DocInvoiceDomain}.
     * - Get the initial display data.
     * - Converted to upload domain acquired data.
     *     Converted to {@link W6002CriteriaDomain}.
     * </pre>
     * 
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocInvoiceDomain}を作成する
     * - 初期表示データ取得を行う
     * - 取得データをアップロードドメインに変換する
     *     {@link W6002CriteriaDomain}に変換する
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6002CriteriaDomain callServices(W6002CriteriaDomain w6002CriteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        String dateFormat = w6002CriteriaDomain.getScreenDateFormat();

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(w6002CriteriaDomain, dateFormat);
        
        // Search initial display data.
        // 初期表示データ取得
        W6001DocInvoiceDomain resultDomain = w6001DocService.searchOnUploadInit(docCriteriaDomain);

        return convertToDomain(w6002CriteriaDomain.getFunctionNo(), resultDomain, dateFormat);
    }
    
    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param  criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @param dateFormat Date format<br />
     * 日付書式
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6002CriteriaDomain criteriaDomain, String dateFormat){
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());

        docCriteriaDomain.setShipperCd(criteriaDomain.getTakeOverShipperCd());
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        docCriteriaDomain.setInvoiceNo(criteriaDomain.getTakeOverInvoiceNo());
        //Date invoiceIssueDt = DateUtil.parseDate(criteriaDomain.getTakeOverInvoiceIssueDt(), criteriaDomain.getScreenDateFormat());
        Date invoiceIssueDt = criteriaDomain.getTakeOverInvoiceIssueDt();
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        docCriteriaDomain.setInvoiceIssueDt(invoiceIssueDt);
        
        return docCriteriaDomain;
    }

    /**
     * Convert to upload domain.
     * <br />アップロードドメインに変換します。
     *
     * @param functionNo Function No
     * @param docDomain Manual invoice domain<br />
     * マニュアルインボイスドメイン
     * @param dateFormat Date format<br />
     * 日付書式
     * @return Conversion result<br />
     * 変換結果
     */
    protected W6002CriteriaDomain convertToDomain(String functionNo, W6001DocInvoiceDomain docDomain, String dateFormat){
        
        W6002CriteriaDomain w6002CriteriaDomain = new W6002CriteriaDomain();

        w6002CriteriaDomain.setCntryCd(docDomain.getCntryCd());
        
        //1 or 2 or 3 or 4
        if (W6002_FUNCTION_NO_1.equals(functionNo)
            || W6002_FUNCTION_NO_2.equals(functionNo)
            || W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setDocumentType("Normal Invoice");
        }
        //5
        else if (W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setDocumentType("Cancel Invoice");
        } 
        //1
        if (W6002_FUNCTION_NO_1.equals(functionNo)) {
            w6002CriteriaDomain.setTypeOfInv("3");
        }
        //2 or 4
        else if (W6002_FUNCTION_NO_2.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setTypeOfInv(docDomain.getManualTyp());
        } 
        //3
        else if (W6002_FUNCTION_NO_3.equals(functionNo)) {
            w6002CriteriaDomain.setTypeOfInv("2");
        } 
        //5
        else if (W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setTypeOfInv("1");
        }

        //2
        if (W6002_FUNCTION_NO_2.equals(functionNo)) {
            w6002CriteriaDomain.setClassOfInv("F");
        }
        //1 or 5
        else if (W6002_FUNCTION_NO_1.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setClassOfInv("M");
        } 
        //2 or 4
        else if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setClassOfInv(docDomain.getInvoiceClass());
        } 
        //2 or 3 or 4 or 5
        if (W6002_FUNCTION_NO_2.equals(functionNo)
            || W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setShipperCd(docDomain.getShipperCd());
            w6002CriteriaDomain.setConsigneeCd(docDomain.getConsigneeCd());
            w6002CriteriaDomain.setConsCompNm(docDomain.getCompNm2());
            w6002CriteriaDomain.setShipToCd(docDomain.getShipToCd());
            w6002CriteriaDomain.setShipToNm(docDomain.getShipToNm());
            w6002CriteriaDomain.setTrnsCd(docDomain.getTrnsCd());
            w6002CriteriaDomain.setRelateInvoiceNo(docDomain.getRelateInvoiceNo());
            w6002CriteriaDomain.setRelateInvoiceShipperCd(docDomain.getRelateInvoiceShipperCd());
        }
        //3 or 4 or 5
        // ST946 MANUAL SCREEN TRANSITION MOD if - delete function No.2
        if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setDlivPoint(docDomain.getDlivPoint());
            
            w6002CriteriaDomain.setRemBankNm(docDomain.getRemBankNm());
            w6002CriteriaDomain.setRemBankAddress1(docDomain.getRemBankAddress1());
            w6002CriteriaDomain.setRemBankAddress2(docDomain.getRemBankAddress2());
            w6002CriteriaDomain.setRemBankAddress3(docDomain.getRemBankAddress3());
            w6002CriteriaDomain.setRemBankAccountNo(docDomain.getRemBankAccountNo());
            w6002CriteriaDomain.setLcBank1(docDomain.getLcBankNm1());
            w6002CriteriaDomain.setLcBank2(docDomain.getLcBankNm2());
            w6002CriteriaDomain.setLcNo(docDomain.getLcNo());
            w6002CriteriaDomain.setLcDt(DateUtil.formatDate(docDomain.getLcDt(), dateFormat));
            
            if (docDomain.getNetAmount() != null) {
                w6002CriteriaDomain.setNetAmount(NumberUtil.format(docDomain.getNetAmount(), FORMAT_PRICE));
            }
        }
        //2 or 3 or 4 or 5
        if (W6002_FUNCTION_NO_2.equals(functionNo)
            || W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setCarrierCompCd(docDomain.getCarrierCompCd());
            w6002CriteriaDomain.setCarCompNm(docDomain.getCompNm3());
            w6002CriteriaDomain.setForwarderCompCd(docDomain.getForwarderCompCd());
            w6002CriteriaDomain.setForCompNm(docDomain.getCompNm4());
            w6002CriteriaDomain.setFmCntryCd(docDomain.getLPortCntryCd());
            w6002CriteriaDomain.setLoadingPortCd(docDomain.getLoadingPortCd());
            w6002CriteriaDomain.setPortNmFrom(docDomain.getPortNm1());
            w6002CriteriaDomain.setToCntryCd(docDomain.getDPortCntryCd());
            w6002CriteriaDomain.setDischargePortCd(docDomain.getDischargePortCd());
            w6002CriteriaDomain.setPortNmTo(docDomain.getPortNm2());
            w6002CriteriaDomain.setVessel(docDomain.getVessel());
            String etd = DateUtil.formatDate(docDomain.getEtd(), dateFormat);
            w6002CriteriaDomain.setEtd(etd);
            String eta = DateUtil.formatDate(docDomain.getEta(), dateFormat);
            w6002CriteriaDomain.setEta(eta);
            if (StringUtils.isNotEmpty(docDomain.getArrivalTime())) {
                String arrivalTime = String.format("%4s", docDomain.getArrivalTime()).replace(' ', '0');
                arrivalTime = arrivalTime.substring(0, 2).concat(":").concat(arrivalTime.substring(2, 4));
                w6002CriteriaDomain.setArrivalTime(arrivalTime);
            }
            w6002CriteriaDomain.setBookingNo(docDomain.getBookingNo());
            w6002CriteriaDomain.setComUpdateTimestamp(docDomain.getComUpdateTimestamp());
        }
        //2 or 3 or 4
        if (W6002_FUNCTION_NO_2.equals(functionNo)
            || W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setShipCompNm(docDomain.getCompNm1());
        }
        //5
        else if (W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setShipCompNm(docDomain.getCompNm5());
        } 
        
        //3 or 5
        if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setInvoiceNo(docDomain.getInvoiceNo());
        }
        // ST946 MANUAL SCREEN TRANSITION ADD START
        //2 
        if (W6002_FUNCTION_NO_2.equals(functionNo)) {
            w6002CriteriaDomain.setPriceTerms("");
        }
        // ST946 MANUAL SCREEN TRANSITION ADD END
        //3 or 4
        // or 5
        if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo) // ST948 ADD 5
        )
        {
            w6002CriteriaDomain.setPriceTerms(docDomain.getPriceTerms());
            w6002CriteriaDomain.setPaymentMethod(docDomain.getPayMeth());
            w6002CriteriaDomain.setPayTerms(docDomain.getPayTerms());
            
            w6002CriteriaDomain.setFreightRes(docDomain.getFreightResponsibleCd());
            
            w6002CriteriaDomain.setCurrCd(docDomain.getCurrCd());
            
            if (docDomain.getFreight() != null) {
                w6002CriteriaDomain.setFreight(NumberUtil.format(docDomain.getFreight(), FORMAT_PRICE));
            }
            if (docDomain.getInsurance() != null) {
                w6002CriteriaDomain.setInsurance(NumberUtil.format(docDomain.getInsurance(), FORMAT_PRICE));
            }
            if (docDomain.getSubTotal() != null) {
                w6002CriteriaDomain.setSubTotal(NumberUtil.format(docDomain.getSubTotal(), FORMAT_PRICE));
            }
            if (docDomain.getVatRatio() != null) {
                w6002CriteriaDomain.setVatRatio(NumberUtil.format(docDomain.getVatRatio(), FORMAT_RATIO));
            }
            if (docDomain.getVat() != null) {
                w6002CriteriaDomain.setVat(NumberUtil.format(docDomain.getVat(), FORMAT_PRICE));
            }
            if (docDomain.getHandlingCharge() != null) {
                w6002CriteriaDomain.setHandlingCharge(NumberUtil.format(docDomain.getHandlingCharge(), FORMAT_PRICE));
            }
            w6002CriteriaDomain.setAdditionalChargeNm(docDomain.getAdditionalChargeNm());
            if (docDomain.getAdditionalCharge() != null) {
                w6002CriteriaDomain.setAdditionalCharge(NumberUtil.format(docDomain.getAdditionalCharge(), FORMAT_PRICE));
            }
            if (docDomain.getTotalInvoiceAmount() != null) {
                w6002CriteriaDomain.setTotalInvoiceAmount(NumberUtil.format(docDomain.getTotalInvoiceAmount(), FORMAT_PRICE));
            }
            if (docDomain.getPltzItemQty() != null) {
                w6002CriteriaDomain.setPltzItemQty(docDomain.getPltzItemQty().toPlainString());
            }
            if (docDomain.getTotalVolume() != null) {
                w6002CriteriaDomain.setTotalVolume(NumberUtil.format(docDomain.getTotalVolume(), FORMAT_VOLUME));
            }
            w6002CriteriaDomain.setVolumeUnit(docDomain.getVolumeUnit());
            if (docDomain.getTotalNetWeight() != null) {
                w6002CriteriaDomain.setTotalNetWeight(NumberUtil.format(docDomain.getTotalNetWeight(), FORMAT_WEIGHT));
            }
            if (docDomain.getTotalGrossWeight() != null) {
                w6002CriteriaDomain.setTotalGrossWeight(NumberUtil.format(docDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
            }
            w6002CriteriaDomain.setWeightUnit(docDomain.getWeightUnit());
        }
        
        //3 or 4 or 5
        if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setTradeTerms(docDomain.getTradeTerms());
            w6002CriteriaDomain.setTermsPoint(docDomain.getTermsPoint());
        }

        //1
        if (W6002_FUNCTION_NO_1.equals(functionNo)) {
            w6002CriteriaDomain.setRemittanceOrLc("R");
        }
        //2 ST946 MANUAL SCREEN TRANSITION ADD START
        else if (W6002_FUNCTION_NO_2.equals(functionNo)) {
            w6002CriteriaDomain.setRemittanceOrLc("");
        }
        // ST946 MANUAL SCREEN TRANSITION ADD END
        //2 or 3 or 4 or 5
        // ST946 MANUAL SCREEN TRANSITION MOD if - delete function No.2
        else if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)
            || W6002_FUNCTION_NO_5.equals(functionNo)) {
            w6002CriteriaDomain.setRemittanceOrLc(docDomain.getRemLcTyp());
        } 
        
        //3 or 4
        if (W6002_FUNCTION_NO_3.equals(functionNo)
            || W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setInvoiceCtgry(docDomain.getInvoiceCtgry());
        }
        //2
        else if (W6002_FUNCTION_NO_2.equals(functionNo)) {
            w6002CriteriaDomain.setInvoiceCtgry("N");
        } 
        
        
        if (W6002_FUNCTION_NO_3.equals(functionNo)) {
            w6002CriteriaDomain.setOrgInvoiceNo(docDomain.getCancelInvoiceNo());
        }
        else if (W6002_FUNCTION_NO_4.equals(functionNo)) {
            w6002CriteriaDomain.setOrgInvoiceNo(docDomain.getInvoiceNo());
        } 
        
        return w6002CriteriaDomain;
    }    
}
