/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * An implementation class of service for the Facade Skip action of Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のSkipアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6002SkipkipFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11668 $
 */
public class W6002SkipFacadeServiceImpl extends AbstractTransactFacadeService<W6002CriteriaDomain, W6002CriteriaDomain>{
    /**
     * Common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002SkipFacadeServiceImpl(){
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
    protected W6002CriteriaDomain filterDomain(W6002CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {

        return criteria;
    }
    
    /**
     * {@inheritDoc}
     * Checking the single item.
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
     * Checking the consistency.
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
     * Checking the database.
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
     * <br />
     * <pre>
     * - Create the search condition domain 
     *      Create the {@link W6001DocCriteriaDomain}.
     * - Checking the existence of the next FRT Invoice No.
     * - Convert to the list domain confirm the existence result 
     *      Converted to {@link TtInvoiceDomain}.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - 次のFRT Invoice No.の存在確認を行う
     * - 存在確認結果をリストドメインに変換する
     *     {@link TtInvoiceDomain}に変換する
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
    protected W6002CriteriaDomain callServices(W6002CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
    

//        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteriaDomain);;
//
//        // Search invoice(only FRT).
//        // インボイスを検索(FRTのみ)
//        List<? extends TtInvoiceDomain> ttInvoiceList = w6001DocService.searchOnUpdateSkip(docCriteriaDomain);
//
//
//        if (ttInvoiceList == null || ttInvoiceList.isEmpty()) {
//            return null;
//        }
//
//        int sortInvoice = Integer.parseInt(criteriaDomain.getSortInvoice());
//        if (ttInvoiceList.size() <= sortInvoice) {
//            return null;
//        }
//        W6002CriteriaDomain resultDomain = new W6002CriteriaDomain();
//        resultDomain.setTakeOverInvoiceNo(ttInvoiceList.get(sortInvoice).getInvoiceNo());
//        resultDomain.setTakeOverInvoiceIssueDt(DateUtil.formatDate(ttInvoiceList.get(sortInvoice)
//            .getInvoiceIssueDt(), criteriaDomain.getScreenDateFormat()));
//        return resultDomain;


        // ST946 MANUAL SCREEN TRANSITION ADD START

        // Get an invoice of the keys will be displayed next.
        // 次に表示するインボイスのキーを取得。

        W6001DocCriteriaDomain nextInvoiceCriteriaDomain = new W6001DocCriteriaDomain();
        // main invoice
        nextInvoiceCriteriaDomain.setTakeOverParInvoiceShipperCd(criteriaDomain.getTakeOverParInvoiceShipperCd());
        nextInvoiceCriteriaDomain.setTakeOverParInvoiceNo(criteriaDomain.getTakeOverParInvoiceNo());
        nextInvoiceCriteriaDomain.setTakeOverParInvoiceIssueDt(criteriaDomain.getTakeOverParInvoiceIssueDt());
        // current invoice
        nextInvoiceCriteriaDomain.setShipperCd(criteriaDomain.getTakeOverShipperCd());
        nextInvoiceCriteriaDomain.setInvoiceNo(criteriaDomain.getTakeOverInvoiceNo());
        nextInvoiceCriteriaDomain.setInvoiceIssueDt(criteriaDomain.getTakeOverInvoiceIssueDt());
        W6001DocInvoiceDomain nextInvoiceResultDomain = w6001DocService.searchNextInvoiceBySameParent(nextInvoiceCriteriaDomain);
        if (nextInvoiceResultDomain == null) {
            return null;
        }
        W6002CriteriaDomain nextInvoiceDomain = new W6002CriteriaDomain();
        nextInvoiceDomain.setTakeOverShipperCd(nextInvoiceResultDomain.getShipperCd());
        nextInvoiceDomain.setTakeOverInvoiceNo(nextInvoiceResultDomain.getInvoiceNo());
        nextInvoiceDomain.setTakeOverInvoiceIssueDt(nextInvoiceResultDomain.getInvoiceIssueDt());

        return nextInvoiceDomain;

        // ST946 MANUAL SCREEN TRANSITION ADD END
    }
    
// ST946 MANUAL SCREEN TRANSITION DEL START
//    /**
//     * Based on (PL) search criteria domain, create the search criteria domain (BL).
//     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
//     *
//     * @param  criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
//     * Invoice Main Screen画面の検索条件ドメイン(PL)
//     * @return Search conditions domain of Doc Service (BL)<br />
//     * Docサービスの検索条件ドメイン(BL)
//     */
//    protected W6001DocCriteriaDomain createDocCriteria(W6002CriteriaDomain criteriaDomain){
//        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
//
//        docCriteria.setShipperCd(criteriaDomain.getShipperCd());
//        docCriteria.setParInvoiceNo(criteriaDomain.getTakeOverParInvoiceNo());
//        
//        return docCriteria;
//    }
// ST946 MANUAL SCREEN TRANSITION DEL END
}
