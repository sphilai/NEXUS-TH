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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_RATIO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_E_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0078;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * 
 * An implementation class of service for the Facade Init action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13589 $
 */
public class W6009InitFacadeServiceImpl extends AbstractSearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain>{

    /**
     * Documentation Service<br />
     * Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009InitFacadeServiceImpl(){
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
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
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
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Creating the conditions domain
     * - Initial acquisition of the display data 
     *   [In the case of transition from the W6007, W6008]
     *       {@link W6001DocService#searchOnRegisterInitByFromDetail(W6001DocCriteriaDomain)}
     *            
     *   [In the case of transition from W6001]
     *       {@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}
     *   
     * - Returns the set to screen for the initial display domain data that is retrieved.
     * </pre>       
     * <pre>
     * ‐条件ドメインの作成
     * 
     * ‐初期表示データの取得
     *   [W6007、W6008からの遷移の場合]
     *       {@link W6001DocService#searchOnRegisterInitByFromDetail(W6001DocCriteriaDomain)}
     *     
     *   [W6001からの遷移の場合]
     *       {@link W6001DocService#searchOnRegisterInitByFromMain(W6001DocCriteriaDomain)}
     * 
     * ‐取得した初期表示データを画面用ドメインに設定して返す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W6009CriteriaDomain resultCriteria = null;
        
        // Processing branch by a changing agency.
        if (SCREEN_ID_W6007.equals(criteriaDomain.getOriginalScreenId()) 
            || SCREEN_ID_W6008.equals(criteriaDomain.getOriginalScreenId())) {
            // From Detail Screen(W6007, W6008)
            W6001DocCriteriaDomain docCriteria = prepareDocCriteriaDomain(criteriaDomain);
            
            List<? extends W6001DocInvoiceDomain> docList = w6001DocService.searchOnRegisterInitByFromDetail(docCriteria);
            
            resultCriteria = convertW6009CriteriaDomainByDetail(docList, criteriaDomain);

            // 2015/1/19 DNJP.Kawamura UT038対応 START >>>>>
            String dscId = docCriteria.getLoginUserDscId();
            
            // FRTの場合、FRTShipperを初期値としてセットする
            if (!"0".equals(resultCriteria.getGrpNo2())) {
                resultCriteria.setFrtShipperCd(docCriteria.getShipperCd());
                
                String grpNo1 = docCriteria.getGrpNo1();
                // Get FRT Consignee data.
                // FRT Consigneeの取得
                String frtConsignee = null;
                frtConsignee = w6001DocService.searchTwInvPltzOnRegisterByFrtConsigneeForDefault(dscId, grpNo1);
                
                resultCriteria.setFrtConsigneeCd(frtConsignee);
            }
            // 2015/1/19 DNJP.Kawamura UT038対応 END <<<<<

            // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
            // InvoiceTemplate,Free1,Free2,Free3,HS Code Flgの初期値をセットする
            // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
            String shipperCd = docCriteria.getShipperCd();
            String invoiceCtgry = docCriteria.getInvoiceCtgry();
            // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<
            String ownerCompCd = docCriteria.getOwnerCompCd();
            String shipToCd = docCriteria.getShipToCd();
            String cmlTyp = docCriteria.getCmlTyp();
            String frtShipperCd = resultCriteria.getFrtShipperCd();

            W6001DocDomain invTplDomain = null;

            // Mainの場合
            if ("0".equals(resultCriteria.getGrpNo2())) {
                // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) START >>>>>
//                invTplDomain = w6001DocService.searchTwInvOnRegisterByInvTmpNoForDefault(dscId, ownerCompCd, shipToCd, cmlTyp);
                invTplDomain = w6001DocService.searchTwInvOnRegisterByInvTmpNoForDefault(dscId, ownerCompCd, shipperCd, invoiceCtgry, shipToCd, cmlTyp);
                // 2015/3/13 DNJP.Kawamura 不具合対応(異なるShipper,InvoiceCategoryのInvTemplateが取得できてしまう場合がある) END <<<<<
            // FRTの場合
            } else {
                invTplDomain = w6001DocService.searchTwInvOnRegisterByInvTmpNoForFrtForDefault(dscId, ownerCompCd, frtShipperCd, shipToCd, cmlTyp);
            }
            if(invTplDomain == null) {
                throw new GscmApplicationException(NXS_E7_0078);
            }
            resultCriteria.setInvTplNo(invTplDomain.getDocNo());

            if (FLAG_Y.equals(invTplDomain.getFree1DispFlg())) {
                resultCriteria.setFree1DispFlg(CHECK_ON);
            } else {
                resultCriteria.setFree1DispFlg(CHECK_OFF);
            }

            if (FLAG_Y.equals(invTplDomain.getFree2DispFlg())) {
                resultCriteria.setFree2DispFlg(CHECK_ON);
            } else {
                resultCriteria.setFree2DispFlg(CHECK_OFF);
            }
            
            if (FLAG_Y.equals(invTplDomain.getFree3DispFlg())) {
                resultCriteria.setFree3DispFlg(CHECK_ON);
            } else {
                resultCriteria.setFree3DispFlg(CHECK_OFF);
            }

            if (FLAG_Y.equals(invTplDomain.getHsCdDispFlg())) {
                resultCriteria.setFree4DispFlg(CHECK_ON);
            } else {
                resultCriteria.setFree4DispFlg(CHECK_OFF);
            }
            // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
            
        } else {
            // From Main screen(6001)
            
            W6001DocCriteriaDomain docCriteria = prepareDocCriteriaDomain(criteriaDomain);
            
            W6001DocInvoiceDomain docInvoiceDomain = w6001DocService.searchOnRegisterInitByFromMain(docCriteria);
            
            resultCriteria = convertW6009CriteriaDomainByMain(docInvoiceDomain, criteriaDomain);
        }
        return resultCriteria;
    }
    
    /**
     * 
     * Convert to the BL domain search criteria domain of the screen.
     * <br />画面の検索条件ドメインをBLドメインに変換します。
     * 
     * @param criteriaDomain Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     * @return BL domain of converting<br />
     * 変換したBLドメイン
     */
    protected W6001DocCriteriaDomain prepareDocCriteriaDomain (W6009CriteriaDomain criteriaDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteria;
    }
    
    /**
     * 
     * (Transition from the Detail screen) Transform to the screen display data from the getting data.
     * <br />取得したデータを画面表示データに変換します（Detail画面から遷移時）
     * 
     * @param criteriaDomain Enter search criteria domain<br />
     * 入力検索条件ドメイン
     * @param docList List of BL layer domain that has been acquired<br />
     * 取得したBL層ドメインのリスト
     * @return Screen display search criteria domain<br />
     * 画面表示用検索条件ドメイン
     * @throws ApplicationException If unable to conversion process<br />
     * 変換処理ができない場合
     */
    protected W6009CriteriaDomain convertW6009CriteriaDomainByDetail (List<? extends W6001DocInvoiceDomain> docList, W6009CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        W6009CriteriaDomain resultDomain = new W6009CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, criteriaDomain);
        
        // Date format
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // ST959 UNIT CONVERSION DEL START
        //String weightUnit = commonService.searchWeightUnit(criteriaDomain.getShipperCd());
        //String volumeUnit = commonService.searchVolumeUnit(criteriaDomain.getShipperCd());
        // ST959 UNIT CONVERSION DEL END
        
        // Calculation of Net Amount 
        BigDecimal netAmount = convertNetAmount(docList);

        // Digit number below a decimal point 
        // 小数点以下の桁数
        resultDomain.setDigit(Integer.toString(netAmount.scale()));
        String formatPrice = getPriceFormat(netAmount.scale());
        
        // Calculation of No Charge
        BigDecimal noCharge = convertNoCharge(docList);
        
        // Calculation of Vat
        // 2014/11/25 DNJP.Kawamura 既存不具合対応 START >>>>>
//        BigDecimal vat = convertVat(docList, netAmount);
        BigDecimal vat = new BigDecimal("0");
        // 2014/11/25 DNJP.Kawamura 既存不具合対応 START >>>>>
        
        W6001DocInvoiceDomain invoiceDomain = docList.get(0);
        W6001DocPltzDomain pltzDomain = invoiceDomain.getDocPltzList().get(0);
        
        // Group No Sec
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            Date issueDt = DateUtil.convertTime(new Date(), commonService.searchTimezone(criteriaDomain.getShipperCd()));
            invoiceDomain.setInvoiceIssueDt(issueDt);
            invoiceDomain.setDispInvoiceIssueDt(issueDt);
        }
        
        CommonUtil.copyPropertiesDomainToDomain(resultDomain, invoiceDomain, dateFormat);
        
        // Case mark classification 
        // ケースマーク区分
        if (CML_TYPE_CIGMA.equals(criteriaDomain.getCmlTyp()) || CML_TYPE_ERT.equals(criteriaDomain.getCmlTyp())) {
            resultDomain.setShipperCompNm1(invoiceDomain.getPrintCompNm1Shipper());
            resultDomain.setShipperCompNm2(invoiceDomain.getPrintCompNm2Shipper());
            resultDomain.setConsigneeCompNm1(invoiceDomain.getPrintCompNm1Consignee());
            resultDomain.setConsigneeCompNm2(invoiceDomain.getPrintCompNm2Consignee());
            resultDomain.setShipToNm1(invoiceDomain.getPrintShipToNm1());
            resultDomain.setShipToNm2(invoiceDomain.getPrintShipToNm2());
        } else {
            resultDomain.setShipperCompNm1(pltzDomain.getShipperCompNm1());
            resultDomain.setShipperCompNm2(pltzDomain.getShipperCompNm2());
            resultDomain.setConsigneeCompNm1(pltzDomain.getConsigneeCompNm1());
            resultDomain.setConsigneeCompNm2(pltzDomain.getConsigneeCompNm2());
            resultDomain.setShipToNm1(pltzDomain.getShipToNm1());
            resultDomain.setShipToNm2(pltzDomain.getShipToNm2());
        }
        
        // Group No Sec
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            resultDomain.setFreightResponsibleNm(invoiceDomain.getC5());
            resultDomain.setPayMethNm(invoiceDomain.getC6());
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 START >>>>>
//            if (INVOICE_CTGRY_C.equals(invoiceDomain.getInvoiceCtgry())) {
            if (!INVOICE_CTGRY_N.equals(invoiceDomain.getInvoiceCtgry())) {
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 END <<<<<
                resultDomain.setRemLcTyp(REM_LC_TYP_REM);
                resultDomain.setRemBankNm(pltzDomain.getRemBankNm());
                resultDomain.setRemBankAddress1(pltzDomain.getRemBankAddr1());
                resultDomain.setRemBankAddress2(pltzDomain.getRemBankAddr2());
                resultDomain.setRemBankAddress3(pltzDomain.getRemBankAddr3());
                resultDomain.setRemBankAccountNo(pltzDomain.getRemBankAccountNo());
            } else {
                resultDomain.setRemLcTyp("");
                resultDomain.setRemBankNm("");
                resultDomain.setRemBankAddress1("");
                resultDomain.setRemBankAddress2("");
                resultDomain.setRemBankAddress3("");
                resultDomain.setRemBankAccountNo("");
            }
            // 2014/11/25 DNJP.Kawamura 既存不具合対応 START >>>>>
            vat = convertVat(docList, netAmount);
            // 2014/11/25 DNJP.Kawamura 既存不具合対応 END <<<<<
            resultDomain.setVat(NumberUtil.format(vat, formatPrice));
            resultDomain.setVatRatio(NumberUtil.format(pltzDomain.getVatRatio(), FORMAT_RATIO));
            
            int pltzItemQty = 0;
            for (W6001DocInvoiceDomain docDomain : docList) {
                pltzItemQty = pltzItemQty + docDomain.getDocPltzList().size();
            }
            resultDomain.setPltzItemQty(Integer.toString(pltzItemQty));
            // UT420 Start
            Map<String, Integer> map = new HashMap<String, Integer>();
            String pkgTyp;
            for (W6001DocInvoiceDomain docDomain : docList) {
                for (W6001DocPltzDomain docPltzDomain : docDomain.getDocPltzList()) {
                    pkgTyp = docPltzDomain.getC9();
                    if(pkgTyp == null) {
                        continue;
                    }
                    if(map.containsKey(pkgTyp)) {
                        map.put(pkgTyp, map.get(pkgTyp).intValue() + 1);
                    } else {
                        map.put(pkgTyp, 1);
                    }
                }
            }
            Iterator<String> iterator = map.keySet().iterator();
            String spInfo = "";
            while(iterator.hasNext()) {
                String key = iterator.next();
                Integer value = map.get(key);
                if(iterator.hasNext()) {
                    spInfo += value + key + ", ";
                } else {
                    spInfo += value + key;
                }
            }
            if(spInfo.length() > 150) {
                resultDomain.setSpInfo(spInfo.substring(0, 150));
            } else {
                resultDomain.setSpInfo(spInfo);
            }
            // UT420 End
            // Total Volume
            // ST959 UNIT CONVERSION MOD START
            //resultDomain.setVolumeUnit(volumeUnit);
            //resultDomain.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(volumeUnit));
            //BigDecimal totalVolume = commonService.convertVolumeUnit(getTwInvPltzByVolume(docList)
            //    , pltzDomain.getVolumeUnit(), volumeUnit);
            //// An error is made when the digit number of integer part exceeds a maximum.
            //// 整数部の桁数が上限を超えた場合はエラー
            //if (null == totalVolume) {
            //    Object[] params = { 
            //        commonService.getResource(criteriaDomain.getLocale(), "label.totalVolume") 
            //    };
            //    throw new GscmApplicationException(NXS_E7_0157, params);
            //}
            //resultDomain.setTotalVolume(NumberUtil.format(totalVolume, FORMAT_VOLUME));
            resultDomain.setVolumeUnit(invoiceDomain.getVolumeUnit());
            resultDomain.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(invoiceDomain.getVolumeUnit()));
            resultDomain.setTotalVolume(NumberUtil.format(invoiceDomain.getTotalVolume(), FORMAT_VOLUME));
            // ST959 UNIT CONVERSION MOD END
            
            // Total Gross Weight
            // ST959 UNIT CONVERSION MOD START
            //resultDomain.setWeightUnit(weightUnit);
            //resultDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(weightUnit));
            //BigDecimal totalGrossWeight = commonService.convertWeightUnit(getTwInvPltzByGrossWeight(docList
            //    , criteriaDomain.getGrpNo2()), pltzDomain.getWeightUnit(), weightUnit);
            //// An error is made when the digit number of integer part exceeds a maximum.
            //// 整数部の桁数が上限を超えた場合はエラー
            //if (null == totalGrossWeight) {
            //    Object[] params = { 
            //        commonService.getResource(criteriaDomain.getLocale(), "label.totalGrossWeight") 
            //    };
            //    throw new GscmApplicationException(NXS_E7_0157, params);
            //}
            //resultDomain.setTotalGrossWeight(NumberUtil.format(totalGrossWeight, FORMAT_WEIGHT));
            resultDomain.setWeightUnit(invoiceDomain.getWeightUnit());
            resultDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(invoiceDomain.getWeightUnit()));
            resultDomain.setTotalGrossWeight(NumberUtil.format(invoiceDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
            // ST959 UNIT CONVERSION MOD END
        } else {
            resultDomain.setInvoiceCtgry(FLAG_N);
            resultDomain.setFreightResponsibleCd(StringUtils.EMPTY);
            //resultDomain.setPriceTerms(StringUtils.EMPTY);
                // UT284 existing bug deal that was detected at the time of correspondence.
                // UT284対応時に検出した既存不具合対処
            resultDomain.setTradeTerms(StringUtils.EMPTY);
            resultDomain.setTermsPoint(StringUtils.EMPTY);
            resultDomain.setPayTerms(StringUtils.EMPTY);
            resultDomain.setPayMethNm(StringUtils.EMPTY);
            resultDomain.setPayMeth(StringUtils.EMPTY);
            resultDomain.setRemBankNm(StringUtils.EMPTY);
            resultDomain.setRemBankAddress1(StringUtils.EMPTY);
            resultDomain.setRemBankAddress2(StringUtils.EMPTY);
            resultDomain.setRemBankAddress3(StringUtils.EMPTY);
            resultDomain.setRemBankAccountNo(StringUtils.EMPTY);
            resultDomain.setVolumeUnit(StringUtils.EMPTY);
            resultDomain.setVolumeUnitDisp(StringUtils.EMPTY);
            resultDomain.setTotalVolume(StringUtils.EMPTY);
            resultDomain.setTotalGrossWeight(StringUtils.EMPTY);
            resultDomain.setVat(NumberUtil.format(0, formatPrice));
            resultDomain.setVatRatio(NumberUtil.format(0, FORMAT_RATIO));
            resultDomain.setPltzItemQty(getTwInvItemByQty(docList));
            // UT420 Start
            resultDomain.setSpInfo(StringUtils.EMPTY);
            // UT420 End
        }
        
        if (INVOICE_CTGRY_I.equals(invoiceDomain.getInvoiceCtgry())) {
            resultDomain.setNoCharge(NumberUtil.format(noCharge, formatPrice));
        } else {
            resultDomain.setNoCharge(NumberUtil.format(0, formatPrice));
        }
        
        resultDomain.setTrnsNm(invoiceDomain.getC1());
        resultDomain.setDocumentType(invoiceDomain.getC2());
        resultDomain.setClassOfInv(invoiceDomain.getC3());
        resultDomain.setInvoiceCtgryNm(invoiceDomain.getC4());

        resultDomain.setFrtShipperCd(StringUtils.EMPTY);
        resultDomain.setInvoiceNo(StringUtils.EMPTY);
        resultDomain.setEtd(DateUtil.formatDate(pltzDomain.getEtd(), dateFormat));
        resultDomain.setEta(DateUtil.formatDate(pltzDomain.getEta(), dateFormat));
        resultDomain.setDlivPoint(pltzDomain.getDlivPoint());
        
        resultDomain.setNetAmount(NumberUtil.format(netAmount, formatPrice));
        resultDomain.setSubTotal(NumberUtil.format(netAmount, formatPrice));
        resultDomain.setFreight(NumberUtil.format(0, formatPrice));
        resultDomain.setInsurance(NumberUtil.format(0, formatPrice));
        resultDomain.setHandlingCharge(NumberUtil.format(0, formatPrice));
        resultDomain.setAdditionalCharge(NumberUtil.format(0, formatPrice));
        resultDomain.setAdditionalChargeNm(StringUtils.EMPTY);
        resultDomain.setTotalInvoiceAmount(NumberUtil.format(netAmount.add(vat), formatPrice));
        
        // ST959 UNIT CONVERSION MOD START
        // Unit of Weight
        //resultDomain.setWeightUnit(weightUnit);
        //resultDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(weightUnit));
        // Total Net Weight
        //resultDomain.setTotalNetWeight(NumberUtil.format(getNetWeight(docList, criteriaDomain.getGrpNo2(), weightUnit), FORMAT_WEIGHT));
        resultDomain.setWeightUnit(invoiceDomain.getWeightUnit());
        resultDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(invoiceDomain.getWeightUnit()));
        resultDomain.setTotalNetWeight(NumberUtil.format(invoiceDomain.getTotalNetWeight(), FORMAT_WEIGHT));
        // ST959 UNIT CONVERSION MOD END
        
        resultDomain.setShipperCd(criteriaDomain.getShipperCd());
        resultDomain.setGrpNo1(criteriaDomain.getGrpNo1());
        resultDomain.setGrpNo2(criteriaDomain.getGrpNo2());
        resultDomain.setCmlTyp(criteriaDomain.getCmlTyp());
        resultDomain.setCustomerCd(criteriaDomain.getCustomerCd());
        
        return resultDomain;
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
    protected W6009CriteriaDomain convertW6009CriteriaDomainByMain (W6001DocInvoiceDomain invoiceDomain, W6009CriteriaDomain criteriaDomain) {
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, invoiceDomain, dateFormat);
        
        criteriaDomain.setDocumentType(invoiceDomain.getC2());
        criteriaDomain.setClassOfInv(invoiceDomain.getC3());
        
        // Format number
        criteriaDomain.setNetAmount(NumberUtil.format(invoiceDomain.getNetAmount(), FORMAT_PRICE));
        criteriaDomain.setFreight(NumberUtil.format(invoiceDomain.getFreight(), FORMAT_PRICE));
        criteriaDomain.setInsurance(NumberUtil.format(invoiceDomain.getInsurance(), FORMAT_PRICE));
        criteriaDomain.setSubTotal(NumberUtil.format(invoiceDomain.getSubTotal(), FORMAT_PRICE));
        criteriaDomain.setHandlingCharge(NumberUtil.format(invoiceDomain.getHandlingCharge(), FORMAT_PRICE));
        criteriaDomain.setAdditionalCharge(NumberUtil.format(invoiceDomain.getAdditionalCharge(), FORMAT_PRICE));
        criteriaDomain.setVat(NumberUtil.format(invoiceDomain.getVat(), FORMAT_PRICE));
        criteriaDomain.setVatRatio(NumberUtil.format(invoiceDomain.getVatRatio(), FORMAT_RATIO));
        criteriaDomain.setTotalInvoiceAmount(NumberUtil.format(invoiceDomain.getTotalInvoiceAmount(), FORMAT_PRICE));
        criteriaDomain.setNoCharge(NumberUtil.format(invoiceDomain.getNoCharge(), FORMAT_PRICE));
        
        criteriaDomain.setTotalVolume(NumberUtil.format(invoiceDomain.getTotalVolume(), FORMAT_VOLUME));
        criteriaDomain.setTotalNetWeight(NumberUtil.format(invoiceDomain.getTotalNetWeight(), FORMAT_WEIGHT));
        criteriaDomain.setTotalGrossWeight(NumberUtil.format(invoiceDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
        
        // Reference Inv. No.1
        if (INVOICE_CLASS_MAIN.equals(invoiceDomain.getInvoiceClass()) 
            || INVOICE_CLASS_E_RT.equals(invoiceDomain.getInvoiceClass())) {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
                // Display of the invoice before cancellation 
                // キャンセル前のインボイスを表示
                criteriaDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display of the re invoice
                // リインボイスを表示
                criteriaDomain.setRelateInvoiceNo1(invoiceDomain.getRelateInvoiceNo());
            }
        } else {
            if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
                // Display of the invoice before cancellation 
                // キャンセル前のインボイスを表示
                criteriaDomain.setRelateInvoiceNo1(invoiceDomain.getCancelInvoiceNo());
            } else {
                // Display of the main invoice
                // メインのインボイスを表示
                criteriaDomain.setRelateInvoiceNo1(invoiceDomain.getParInvoiceNo());
            }
        }
        
        // Reference Inv. No.2
        if (CANCEL_TYP_CANCEL.equals(criteriaDomain.getCancelTyp())) {
            // Display of the invoice before cancellation 
            // キャンセル前のインボイスを表示
            criteriaDomain.setRelateInvoiceNo2(invoiceDomain.getRelateInvoiceNo());
        } else {
            // Display of the main invoice
            // メインのインボイスを表示
            criteriaDomain.setRelateInvoiceNo2(StringUtils.EMPTY);
        }
        
        // Set check box
        // チェックボックスの設定
        if (FLAG_Y.equals(invoiceDomain.getFree1DispFlg())) {
            criteriaDomain.setFree1DispFlg(CHECK_ON);
        } else {
            criteriaDomain.setFree1DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree2DispFlg())) {
            criteriaDomain.setFree2DispFlg(CHECK_ON);
        } else {
            criteriaDomain.setFree2DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree3DispFlg())) {
            criteriaDomain.setFree3DispFlg(CHECK_ON);
        } else {
            criteriaDomain.setFree3DispFlg(CHECK_OFF);
        }
        if (FLAG_Y.equals(invoiceDomain.getFree4DispFlg())) {
            criteriaDomain.setFree4DispFlg(CHECK_ON);
        } else {
            criteriaDomain.setFree4DispFlg(CHECK_OFF);
        }
        
        return criteriaDomain;
    }
    
    /**
     * Calculate the effective amount of the Net Amount.
     * <br />
     * Net Amountの有効金額を算出します。
     * 
     * @param docList List of invoice group work domain that has been acquired<br />
     * 取得したインボイスグループワークドメインのリスト
     * @return Effective amount of Net Amount calculated<br />
     * 算出したNet Amountの有効金額
     * @throws ApplicationException If can not calculate the effective amount of Net Amount<br />
     * Net Amountの有効金額を算出できない場合
     */
    protected BigDecimal convertNetAmount(List<? extends W6001DocInvoiceDomain> docList) 
        throws ApplicationException {
        // Calculation of Net Amount 
        // Net Amountの算出
        BigDecimal netAmountBefore = BigDecimal.ZERO;
        for (W6001DocInvoiceDomain docInvoiceDomain : docList) {
            for (W6001DocPltzDomain docPltzDomain : docInvoiceDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain docItemDomain : docPltzDomain.getDocPltzItemList()) {
                    if (FLAG_Y.equals(docItemDomain.getParFlg())) {
                        // Effective amount of money of a parent number record is computed before calculation processing. 
                        // 親品番レコードの有効金額の計算処理前を算出します。
                        netAmountBefore = netAmountBefore.add(docItemDomain.getUnitPrice().multiply(docItemDomain.getQty()));
                    }
                }
            }
        }
        // Calculation of the effective amount of money 
        // 有効金額の算出
        W6001DocInvoiceDomain docInvDomain = docList.get(0);
        return commonService.searchEffectivePrice(docInvDomain.getShipperCd(), docInvDomain.getCurrCd(), netAmountBefore);
    }
 
    /**
     * Calculate the effective amount of No Charge.
     * <br />
     * No Chargeの有効金額を算出します。
     * 
     * @param docList List of invoice group work domain that has been acquired<br />
     * 取得したインボイスグループワークドメインのリスト
     * @return Effective amount of No Charge calculated<br />
     * 算出したNo Chargeの有効金額
     * @throws ApplicationException If can not calculate the effective amount of No Charge<br />
     * No Chargeの有効金額を算出できない場合
     */
    protected BigDecimal convertNoCharge(List<? extends W6001DocInvoiceDomain> docList)
        throws ApplicationException {
        // Calculation of the no Charge 
        // No Chargeの算出
        BigDecimal noChargeBefore = BigDecimal.ZERO;
        for (W6001DocInvoiceDomain docInvoiceDomain : docList) {
            if (INVOICE_CTGRY_I.equals(docInvoiceDomain.getInvoiceCtgry())) {
                for (W6001DocPltzDomain docPltzDomain : docInvoiceDomain.getDocPltzList()) {
                    for (W6001DocPltzItemDomain docItemDomain : docPltzDomain.getDocPltzItemList()) {
                        // Calculation of the amount of money of a KIT article and a child line.
                        // KIT品かつ子の行の金額を計算
                        if (FLAG_Y.equals(docItemDomain.getKitFlg()) && FLAG_N.equals(docItemDomain.getParFlg())) {
                            noChargeBefore = noChargeBefore.add(docItemDomain.getUnitPrice().multiply(docItemDomain.getQty()));
                        }
                    }
                }
            }
        }
        // Calculation of the effective amount of money 
        // 有効金額の算出
        W6001DocInvoiceDomain docInvDomain = docList.get(0);
        return commonService.searchEffectivePrice(docInvDomain.getShipperCd(), docInvDomain.getCurrCd(), noChargeBefore);
    }
    
    /**
     * 
     * Calculate the effective amount of Vat.
     * <br />Vatの有効金額を算出します。
     * 
     * @param docList List of invoice group work domain that has been acquired<br />
     * 取得したインボイスグループワークドメインのリスト
     * @param netAmount net Amount effective amount<br />
     * net Amount 有効金額
     * @return Effective amount of No Charge calculated<br />
     * 算出したNo Chargeの有効金額
     * @throws ApplicationException If the calculation of the effective amount can not be<br />
     * 有効金額の算出ができない場合
     */
    protected BigDecimal convertVat(List<? extends W6001DocInvoiceDomain> docList, BigDecimal netAmount) 
        throws ApplicationException {
        
        BigDecimal ratio = new BigDecimal("0.01");
        
        W6001DocInvoiceDomain docInvDomain = docList.get(0);

        // Calculation of the Vat
        // Vatの算出
        BigDecimal vatBefore = BigDecimal.ZERO;
        if (docInvDomain.getDocPltzList() != null && !docInvDomain.getDocPltzList().isEmpty()) {
            BigDecimal vatRatio = docInvDomain.getDocPltzList().get(0).getVatRatio();
            if (vatRatio != null) {
                vatBefore = netAmount.multiply(vatRatio.multiply(ratio));
            }
        }

        // Calculat Vat
        return commonService.searchEffectivePrice(docInvDomain.getShipperCd(), docInvDomain.getCurrCd(), vatBefore);
    }

    /**
     * 
     * Get the total value of the QTY of invoice created for Part Number work.<br />
     * インボイス作成対象品番ワークのQTYの合計値を取得
     * 
     * @param invoiceList Acquired data<br />
     * 取得データ
     * @return The total value of QTY<br />
     * QTYの合計値
     */
    protected String getTwInvItemByQty (List<? extends W6001DocInvoiceDomain> invoiceList) {
        
        BigDecimal qty = new BigDecimal("0");
        for (W6001DocInvoiceDomain invoiceDomain : invoiceList) {
            for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain itemDomain : pltzDomain.getDocPltzItemList()) {
                    qty = qty.add(itemDomain.getQty());
                }
            }
        }
        return qty.toPlainString();
    }
    
// ST959 UNIT CONVERSION DEL START
//    /**
//     * 
//     * Get the total value of the VOLUME of invoice created for palletizing work.<br />
//     * インボイス作成対象パレタイズワークのVOLUMEの合計値を取得
//     * 
//     * @param invoiceList Acquired data<br />
//     * 取得データ
//     * @return The total value of QTY<br />
//     * QTYの合計値
//     */
//    protected BigDecimal getTwInvPltzByVolume (List<? extends W6001DocInvoiceDomain> invoiceList) {
//        
//        BigDecimal volume = new BigDecimal("0");
//        for (W6001DocInvoiceDomain invoiceDomain : invoiceList) {
//            for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {
//                volume = volume.add(pltzDomain.getVolume());
//            }
//        }
//        return volume;
//    }
//    
//    /**
//     * 
//     * Total value acquisition of Total N / W
//     * <br />Total N/Wの合計値取得
//     * 
//     * @param invoiceList Acquired data<br />
//     * 取得データ
//     * @param grpNo2 Group No 2
//     * @param weightUnit Weight Unit
//     * @return Net The total value of the Net Weight<br />
//     * Net Weightの合計値
//     * @throws ApplicationException ApplicationException
//     */
//    protected BigDecimal getNetWeight(List<? extends W6001DocInvoiceDomain> invoiceList, String grpNo2, String weightUnit) 
//        throws ApplicationException {
//        BigDecimal netWeight = new BigDecimal("0");
//        
//        for (W6001DocInvoiceDomain invoiceDomain : invoiceList) {
//            for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {
//                if (GRP_NO2_MAIN.equals(grpNo2)) {
//                    netWeight = netWeight.add(pltzDomain.getNetWeight());
//                } else {
//                    for (W6001DocPltzItemDomain itemDomain : pltzDomain.getDocPltzItemList()) {
//                        BigDecimal itemWeight = commonService
//                            .convertWeightUnit(itemDomain.getNetWeight(), itemDomain.getWeightUnit(), weightUnit);
//                        // An error is made when the digit number of integer part exceeds a maximum.
//                        // 整数部の桁数が上限を超えた場合はエラー
//                        if (null == itemWeight) {
//                            Object[] params = { 
//                                commonService.getResource(null, "label.totalNetWeight") 
//                            };
//                            throw new GscmApplicationException(NXS_E7_0157, params);
//                        }
//                        netWeight = netWeight.add(itemWeight);
//                    }
//                }
//            }
//        }
//        if (GRP_NO2_MAIN.equals(grpNo2)) {
//            String weightUnitSrc = invoiceList.get(0).getDocPltzList().get(0).getWeightUnit();
//            BigDecimal itemWeight = commonService.convertWeightUnit(netWeight, weightUnitSrc, weightUnit);   
//            // An error is made when the digit number of integer part exceeds a maximum.
//            // 整数部の桁数が上限を超えた場合はエラー
//            if (null == itemWeight) {
//                Object[] params = { 
//                    commonService.getResource(null, "label.totalNetWeight") 
//                };
//                throw new GscmApplicationException(NXS_E7_0157, params);
//            }
//            return itemWeight;
//        } else {
//            return netWeight;
//        }
//    }
//    
//    /**
//     * 
//     * Get the total value of GrossWeight of Invoide Palletize Work.<br />
//     * インボイス作成対象パレタイズワークのGrossWeightの合計値を取得
//     * 
//     * @param invoiceList Acquired data<br />
//     * 取得データ
//     * @param grpNo2 Group No 2.
//     * @return The total value of QTY<br />
//     * QTYの合計値
//     */
//    protected BigDecimal getTwInvPltzByGrossWeight (List<? extends W6001DocInvoiceDomain> invoiceList, String grpNo2) {
//        
//        if (!GRP_NO2_MAIN.equals(grpNo2)) {
//            return BigDecimal.ZERO;
//        }
//        
//        BigDecimal grossWeight = BigDecimal.ZERO;
//        for (W6001DocInvoiceDomain invoiceDomain : invoiceList) {
//            for (W6001DocPltzDomain pltzDomain : invoiceDomain.getDocPltzList()) {
//                grossWeight = grossWeight.add(pltzDomain.getGrossWeight());
//            }
//        }
//        return grossWeight;
//    }
// ST959 UNIT CONVERSION DEL END
    
    /**
     * 
     * Get Price format
     * 
     * @param scale scale
     * @return price format
     */
    protected String getPriceFormat (int scale) {
        StringBuffer format = new StringBuffer();
        if (scale == 0) {
            format.append("0");
        } else {
            format.append("0.");
            for (int i = 0; i < scale; i++) {
                format.append("0");
            }
        }
        return format.toString();
    }
}

