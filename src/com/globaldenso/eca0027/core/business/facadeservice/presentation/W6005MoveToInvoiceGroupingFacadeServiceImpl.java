/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0122;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0140;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRNS_CD_AIR;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade MoveToInvoiceGrouping action of Documentation Shipping Information Input screen.
 * <br />通関書類作成業務 Shipping Information Input画面のMoveToInvoiceGroupingアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6005MoveToInvoiceGroupingFacadeService
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14770 $
 */
public class W6005MoveToInvoiceGroupingFacadeServiceImpl extends 
    AbstractUpdateFacadeService<Void, W6005CriteriaDomain> {
    
    /**
     * Common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6005MoveToInvoiceGroupingFacadeServiceImpl(){
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
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6005CriteriaDomain filterDomain(W6005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }
    
    /**
     * Check the single item.
     * <br />単項目チェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6005CriteriaDomain> valid = new Validator<W6005CriteriaDomain>(criteriaDomain, "criteriaDomain");

        // NL003 MOD START
        String[] properties = {
            "carrierCompCd"
            , "forwarderCompCd"
            , "fmCntryCd"
            , "loadingPortCd"
            , "toCntryCd"
            , "dischargePortCd"
            , "vessel"
            , "etd"
            , "eta"
            , "arrivalTime" // format check only.
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6005);

        // Added mandatory check of arrivalTime only for Air.
        // Airの場合のみarrivalTimeの必須チェックを追加。
        if (TRNS_CD_AIR.equals(criteriaDomain.getTrnsCd())){
            if (StringUtils.isEmpty(criteriaDomain.getArrivalTime())) {
                Object[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.arrivalTime")
                };
                MessageDomain md = new MessageDomain("criteriaDomain.arrivalTime", GSCM_E0_0011, params);
                valid.getErrList().add(md);
            }
        }
        // NL003 MOD END

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * Check the consistency.
     * <br />整合性チェックを行う。
     * {@inheritDoc}
     * <br />
     * <pre>
     * - Check the date correlation of ETA and ETD.
     * - Check the ETD past date.
     * </pre>
     * <pre>
     * - ETDとETAの日付相関チェックを行う
     * - ETD過去日チェックを行う
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Correlation check in date for ETD and ETA.
        // ETDとETAの日付相関チェック
        if (!w6001DocService.validateCorrelationDate(
            DateUtil.addDate(criteriaDomain.getEtd(), criteriaDomain.getScreenDateFormat(), -1)
            , criteriaDomain.getEta(), criteriaDomain.getScreenDateFormat())) {
            
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.eta"),
                commonService.getResource(criteriaDomain.getLocale(), "label.etd")
            };
            MessageDomain mdEtd = new MessageDomain("criteriaDomain.etd", NXS_E7_0140, params);
            MessageDomain mdEta = new MessageDomain("criteriaDomain.eta", null, null);
            errList.add(mdEtd);
            errList.add(mdEta);
        }
        
        // Past date Check for ETD
        // ETD過去日チェック
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getEtd())) {
            if (!w6001DocService.validateConsistencyEtdAfterDate(criteriaDomain.getEtd(), criteriaDomain.getScreenDateFormat(), criteriaDomain.getTimeZone())) { 
                Object[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.etd")
                };
                MessageDomain md = new MessageDomain("criteriaDomain.etd", NXS_E7_0070, params);
                errList.add(md);
            }
        }
        

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    
    /**
     * Check the database.
     * <br />データベースチェックを行う。
     * {@inheritDoc}
     * <br />
     * <pre>
     * - Check the Carrier, Company, Port existence.
     * - Carrier、Company、Port存在チェックを行う
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // Existence check Carrier
        // Carrier存在チェック
        if(!w6001DocService.validateDatabaseCarrier(criteriaDomain.getCarrierCompCd())) { 
            MessageDomain md = new MessageDomain("criteriaDomain.carrierCompCd", NXS_E7_0113, null);
            errList.add(md);
        }

        // Existence check Forwarder
        // Forwarder存在チェック
        // UT263 Forwarderの入力があれば実施するように変更
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getForwarderCompCd())) {
            if(!w6001DocService.validateDatabaseCompCd(criteriaDomain.getForwarderCompCd())) {
                MessageDomain md = new MessageDomain("criteriaDomain.forwarderCompCd", NXS_E7_0071, null);
                errList.add(md);
            }
        }
        
        // Existence check FM) Port of Load/FLT
        // FM) Port of Load/FLT存在チェック
        if (!w6001DocService.validateDatabasePort(criteriaDomain.getLoadingPortCd(), criteriaDomain.getFmCntryCd())) {
            errList.add(new MessageDomain("criteriaDomain.loadingPortCd", NXS_E7_0122, null));
            errList.add(new MessageDomain("criteriaDomain.fmCntryCd", null, null));
        }

        // Existence check TO) Port of Discharge/FLT
        // TO) Port of Discharge/FLT存在チェック
        if (!w6001DocService.validateDatabasePort(criteriaDomain.getDischargePortCd(), criteriaDomain.getToCntryCd())) {
            errList.add(new MessageDomain("criteriaDomain.dischargePortCd", NXS_E7_0122, null));
            errList.add(new MessageDomain("criteriaDomain.toCntryCd", null, null));
        }
        

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * {@inheritDoc}
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *     Create the {@link W6001DocCriteriaDomain}.
     * - Update the Invoide Palletize Work.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - インボイス作成対象パレタイズワークを更新する
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
    protected Void callServices(W6005CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteriaDomain);

        // Update Invoice Palletize Work
        // NEXUS会社原単位、港原単位を検索し、インボイス作成対象パレタイズワークを更新
        w6001DocService.updateOnShippingInfoInpMoveToInvoiceGrouping(docCriteriaDomain);
  
        return null;
    }

    /**
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param  criteriaDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6005CriteriaDomain criteriaDomain){
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        // DSC-ID
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteria;
    }
}
