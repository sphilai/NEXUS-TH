/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0052;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0053;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * An implementation class of service for the Facade MoveToRegister action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のMoveToRegisterアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6008MoveToRegisterFacadeService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14031 $
 */
// 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
//public class W6008MoveToRegisterFacadeServiceImpl extends 
//    AbstractProcessFacadeService<Void, W6008CriteriaDomain>{
public class W6008MoveToRegisterFacadeServiceImpl extends 
    AbstractUpdateFacadeService<Void, W6008CriteriaDomain>{
// 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<

    /**
     * Documentation Service
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008MoveToRegisterFacadeServiceImpl(){
    }

    /**
     * <br />Setter method for w6001DocService.
     *
     * @param w6001DocService  Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService w6001DocService) {
        this.w6001DocService = w6001DocService;
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
    protected W6008CriteriaDomain filterDomain(W6008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * Check the single item.
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
    protected void validateItems(W6008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the consistency.
     * <br />整合性チェックを行う。
     * 
     * <br />
     * <pre>
     * Warning confirmation check
     * Warning確認チェック
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        if (!w6001DocService.validateConsistencyHsCodeWarningIgnoreWarnings(
            criteriaDomain.getHsCodeWarning(), criteriaDomain.getIgnoreWarnings())) {
            
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0040, null));
            throw new ValidationException(errList);
        }
    }
    
    /**
     * {@inheritDoc}
     * Check the database.
     * <br />データベースチェックを行う。
     * 
     * No action
     * <br />処理なし
     * <pre>
     * - Check the NIGHT BATCH CIGMA. 
     * - Check the invoice group work.
     * </pre>
     * <pre>
     * - CIGMA夜間バッチ中チェックをする
     * - インボイスグループワークチェックをする
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // In CML TYPE="1", the company set to Shipper checks in the inside of a batch at night. 
        // CML TYPE= "1" の場合、CIGMA品であるため、Shipperにセットされている会社が夜間バッチ中か否かのチェックを行う
        if (CML_TYPE_CIGMA.equals(criteriaDomain.getCmlTyp())) {
            // Common:Behavior in a batch in the CIGMA night.
            // 機能仕様共通：CIGMA夜間バッチ中の振る舞い
            String errCd = w6001DocService.validateDatabaseCigmaAvailable(
                    criteriaDomain.getShipperCd(), criteriaDomain.getCmlTyp());
            if (errCd != null){
                MessageDomain md = new MessageDomain("", errCd, null);
                errList.add(md);
                throw new ValidationException(errList);
            }
        }
        
        // Search & Check Invoice Group Work
        // インボイスグループワークを検索しチェック
        if (!w6001DocService.validateDatabaseTwInvOnDetailFrtMoveToRegister(criteriaDomain)) {
            MessageDomain md = new MessageDomain("", NXS_E1_0053, null);
            errList.add(md);
        }
        
        // Error is made when it changes on the following screen in a unit-price-less error. 
        // 単価なしエラーのまま次画面に遷移しようとした場合、エラー
        if (!w6001DocService.validateConsistencyUnitPriceError(criteriaDomain.getUnitPriceError())) {
            MessageDomain md = new MessageDomain("", NXS_E1_0052, null);
            errList.add(md);
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6008CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteriaDomain);

        w6001DocService.updateOnDetailFrtMoveToRegister(docCriteriaDomain);
        // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<
        
        return null;
    }

    // 2014/11/25 DNJP.Kawamura UT149対応 START >>>>>
    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * @param criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6008CriteriaDomain criteriaDomain)
        throws ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(
            docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());

        return docCriteriaDomain;
    }
    // 2014/11/25 DNJP.Kawamura UT149対応 END <<<<<

}

