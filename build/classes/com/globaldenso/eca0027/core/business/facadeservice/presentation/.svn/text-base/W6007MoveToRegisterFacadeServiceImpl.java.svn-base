/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0040;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0050;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0051;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.UNIT_PRICE_ERROR_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade MoveToRegister action of Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のMoveToRegisterアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6007MoveToRegisterFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10391 $
 */
public class W6007MoveToRegisterFacadeServiceImpl extends 
    AbstractUpdateFacadeService<Void, W6007CriteriaDomain> {
    
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007MoveToRegisterFacadeServiceImpl(){
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
    protected W6007CriteriaDomain filterDomain(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return criteriaDomain;
    }
     
    /**
     * {@inheritDoc}
     * Check the single item.
     * <br />単項目チェックを行う。
     * 
     * <pre>
     * Check the single item.
     * 単項目チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6007CriteriaDomain> valid = new Validator<W6007CriteriaDomain>(criteriaDomain, "w6007CriteriaDomain");
        
        String[] properties = {
            "dateShipped"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6007);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
     
    /**
     * {@inheritDoc}
     * Check the consistency.
     * <br />整合性チェックを行う。
     * 
     * <pre>
     * - Create the search condition domain. 
     *     Create the {@link W6007CriteriaDomain}.
     * - Check the transition.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6007CriteriaDomain}を作成する
     * - 遷移チェックをする
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        if (!w6001DocService.validateConsistencyHsCodeWarningIgnoreWarnings(
            criteriaDomain.getHsCodeWarning(), criteriaDomain.getIgnoreWarnings())) {
            
            MessageDomain md = new MessageDomain("", NXS_E7_0040, null);
            errList.add(md);
        }
        
        // Error is made when the screen is not being re-displayed after Date Shipped change(No16 on screen). 
        // 画面上の【16】:Date Shipped変更後に画面を再表示していない（=Refreshボタンを押していない）場合、エラー
        Date cnvDateShippedDt = DateUtil.parseDate(criteriaDomain.getDateShipped(), criteriaDomain.getScreenDateFormat());
        Date cnvHiddenDateShippedDt = DateUtil.parseDate(criteriaDomain.getHiddenDateShipped(), criteriaDomain.getScreenDateFormat());
        
        if (!w6001DocService.validateConsistencyRefreshed(cnvDateShippedDt, cnvHiddenDateShippedDt, true)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.dateShipped"),
                commonService.getResource(criteriaDomain.getLocale(), "button.refresh"),
            };
            
            MessageDomain md = new MessageDomain("w6007CriteriaDomain.dateShipped", NXS_E1_0050, params);
            errList.add(md);
        }
        
        // Error is made when it is going to change on the following screen in a currency code difference and a unit-price-less error. 
        // 通貨コード違い、単価なしエラーのまま次画面に遷移しようとした場合、エラー
        if (!w6001DocService.validateConsistencyUnitPriceError(criteriaDomain.getUnitPriceError())) {
            
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.unitPriceError"),
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(criteriaDomain.getLocale(), "label.unitPriceErrorList"),
                UNIT_PRICE_ERROR_LIST,
                commonService.getResource(criteriaDomain.getLocale(), "label.curr"),
                commonService.getResource(criteriaDomain.getLocale(), "label.unitPrice"),
            };
            
            MessageDomain md = new MessageDomain("w6007CriteriaDomain.unitPriceError", NXS_E1_0051, params);
            errList.add(md);
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}
     * Check the database.
     * <br />データベースチェックを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *      Create the {@link W6007CriteriaDomain}.
     * - Check the NIGHT BATCH CIGMA.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6007CriteriaDomain}を作成する
     * - CIGMA夜間バッチ中チェックをする
     * </pre>
     * 
     * No action
     * <br />処理なし
     * 
     * @throws GscmApplicationException GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // In CML TYPE="1", the company set to Shipper checks in the inside of a batch at night. 
        // CML TYPE= "1" の場合、CIGMA品であるため、Shipperにセットされている会社が夜間バッチ中か否かのチェックを行う
        String errCd = w6001DocService.validateDatabaseCigmaAvailable(
                criteriaDomain.getShipperCd(), criteriaDomain.getCmlTyp());
        if (errCd != null){
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", errCd, null));
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *     Create the {@link W6001DocCriteriaDomain}.
     * - Update the invoice group work.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - インボイスグループワークを更新
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6007CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteriaDomain);

        w6001DocService.updateOnDetailMoveToRegister(docCriteriaDomain);
        
        return null;
    }

    /**
     *
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * @param criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6007CriteriaDomain criteriaDomain)
        throws ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(
            docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteriaDomain;
    }
}

