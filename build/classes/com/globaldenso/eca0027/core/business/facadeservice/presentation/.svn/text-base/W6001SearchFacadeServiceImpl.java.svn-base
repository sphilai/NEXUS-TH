/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_TYPE_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_TYPE_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DATE_STR;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for Search Facade of action Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6001SearchFacadeService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W6001SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W6001ListDomain>, W6001CriteriaDomain> {
    
    /**
     * Documentation Service.<br />
     * Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001SearchFacadeServiceImpl(){
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
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6001CriteriaDomain filterDomain(W6001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Checking of the single item.
     * 単項目チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6001CriteriaDomain> valid = new Validator<W6001CriteriaDomain>(criteriaDomain, "w6001CriteriaDomain");

        String[] properties = {
            "shipperCd",
            "consigneeCd",
            "shipToCd",
            "trnsCd",
            "invoiceNo",
            "fmDate",
            "toDate",
            "carrierCompCd",
            "forwarderCompCd",
            "stgInstrNo",
            "stgActNo",
            "shippingFirmNo"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W6001);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Checking of the date correlation.
     * 日付相関チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        if(!w6001DocService.validateCorrelationDate(criteriaDomain.getFmDate(), criteriaDomain.getToDate(), criteriaDomain.getScreenDateFormat())) {
            Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(criteriaDomain.getLocale(), "label.date")
                DATE_STR
            };
            MessageDomain msgToDate = new MessageDomain("w6001CriteriaDomain.toDate", GSCM_E0_0031, params);
            MessageDomain msgFmDate = new MessageDomain("w6001CriteriaDomain.fmDate", null, null);

            errorList.add(msgToDate);
            errorList.add(msgFmDate);
        }
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Data which coincides with the conditions specified as the search condition is acquired.
     * 検索条件に指定した条件に一致するデータを取得します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W6001ListDomain> callServices(W6001CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteria = createDocCriteria(criteriaDomain);

        List<? extends W6001DocInvoiceDomain> docInvoiceDomain = w6001DocService.searchForPagingOnMainSearch(docCriteria);

        return convertToListDomain(docInvoiceDomain, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * Convert the search criteria domain of service search criteria domain of the screen.
     * <br />画面の検索条件ドメインをサービスの検索条件ドメインに変換します。
     *
     * @param criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6001CriteriaDomain criteriaDomain){
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        return docCriteriaDomain;
    }
    
    /**
     * Convert to screen search results list the search results list of services.
     * <br />サービスの検索結果リストを画面検索結果リストに変換します。
     *
     * @param docInvoiceDomainList List of invoice domain<br />
     * インボイスドメインのリスト
     * @param dateFormat Date conversion format (screen display)<br />
     * 日付変換フォーマット（画面表示用）
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<? extends W6001ListDomain> convertToListDomain(List<? extends W6001DocInvoiceDomain> docInvoiceDomainList, String dateFormat){
        List<W6001ListDomain> listDomainList = new ArrayList<W6001ListDomain>();

        if (null != docInvoiceDomainList) {
            for (W6001DocInvoiceDomain invoiceDomain : docInvoiceDomainList) {

                W6001ListDomain listDomain = new W6001ListDomain();

                CommonUtil.copyPropertiesDomainToDomain(listDomain, invoiceDomain, dateFormat);
                
                // Invoice Type
                if (CANCEL_TYP_NORMAL.equals(invoiceDomain.getCancelTyp())) {
                    listDomain.setInvoiceTyp(INVOICE_TYPE_NORMAL);
                } else if (CANCEL_TYP_CANCEL.equals(invoiceDomain.getCancelTyp())) {
                    listDomain.setInvoiceTyp(INVOICE_TYPE_CANCEL);
                }


                // Re-Inv. Flg
                if (MANUAL_TYP_RE_INVOICE.equals(invoiceDomain.getManualTyp())) {
                    listDomain.setReInvFlg(FLAG_Y);
                } else {
                    listDomain.setReInvFlg(FLAG_N);
                }

                // FRT Contain Flg
                if (0 < invoiceDomain.getCountInvoiceNo()) {
                    listDomain.setFrtContainFlg(FLAG_Y);
                } else {
                    listDomain.setFrtContainFlg(FLAG_N);
                }
                
                // 2015/2/12 DNJP.Kawamura UT031対応 START >>>>>
                listDomain.setCancelRefNo(invoiceDomain.getCancelInvoiceNo());
                // 2015/2/12 DNJP.Kawamura UT031対応 END <<<<<
                
                listDomainList.add(listDomain);                
            }
        }
        return listDomainList;
    }
}
