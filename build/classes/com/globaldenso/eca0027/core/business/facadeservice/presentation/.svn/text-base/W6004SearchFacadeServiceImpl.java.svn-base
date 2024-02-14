/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.DATE_STR;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
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
 * An implementation class of service for Search Facade of action Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6004SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10391 $
 */
public class W6004SearchFacadeServiceImpl extends 
    AbstractSearchFacadeService<List<? extends W6004ListDomain>, W6004CriteriaDomain> {

    /**
     * Common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004SearchFacadeServiceImpl(){
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
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6004CriteriaDomain filterDomain(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }
    
    /**
     * Check the single item.
     * <br />単項目チェックを行う。
     * 
     * <pre>
     * @param criteriaDomain criteriaDomain
     * @throws GscmApplicationException GscmApplicationException
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationException
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Validator<W6004CriteriaDomain> valid = new Validator<W6004CriteriaDomain>(criteriaDomain, "criteriaDomain");


        if (CUSTOM_TIMING_TYPE_A.equals(criteriaDomain.getCustomTimingTyp())) {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "shippingFirmNo",
                "fmWorkedDt",
                "toWorkedDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        } else if (CUSTOM_TIMING_TYPE_B.equals(criteriaDomain.getCustomTimingTyp())) {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "stgActNo",
                "fmStgActDt",
                "toStgActDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        } else if (CUSTOM_TIMING_TYPE_Z.equals(criteriaDomain.getCustomTimingTyp()))  {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "stgInstrNo",
                "fmWorkedDt",
                "toWorkedDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        }
        

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * Check the consistency.
     * <br />整合性チェックを行う。
     *
     * <br />
     * <pre>
     * - Create the search condition domain.
     *     Create the {@link W6004CriteriaDomain}.
     * - Check the correlation.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6004CriteriaDomain}を作成する
     * - 相関チェックを行う
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        // Correlation check in date.
        // 日付の相関チェック　（【8】:FM) ETD、【10】:TO) ETD）
        // 機能仕様共通：日付 From - To の相関チェック"
        if (!w6001DocService.validateCorrelationDate(criteriaDomain.getFmEtd(), criteriaDomain.getToEtd(), dateFormat)) {
            Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(criteriaDomain.getLocale(), "label.date")
                DATE_STR
            };
            MessageDomain msgToDate = new MessageDomain("criteriaDomain.fmEtd", GSCM_E0_0031, params);
            MessageDomain msgFmDate = new MessageDomain("criteriaDomain.toEtd", null, null);

            errorList.add(msgToDate);
            errorList.add(msgFmDate);
        }
        
        // Correlation check in date.
        // 日付の相関チェック　（【13】:FM) Operation Date、【15】:TO) Operation Date）
        // 機能仕様共通：日付 From - To の相関チェック"
        if (!w6001DocService.validateCorrelationDate(criteriaDomain.getFmWorkedDt(), criteriaDomain.getToWorkedDt(), dateFormat)) {
            Object[] params = {
// 2015.1.15 Change so as to hold in Constants by DNITS instructions
//                commonService.getResource(criteriaDomain.getLocale(), "label.date")
                DATE_STR
            };
            MessageDomain msgToDate = new MessageDomain("criteriaDomain.fmWorkedDt", GSCM_E0_0031, params);
            MessageDomain msgFmDate = new MessageDomain("criteriaDomain.toWorkedDt", null, null);

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
    protected void validateDatabase(W6004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *     Create the {@link W6001DocCriteriaDomain}.
     * - Get search results data.
     * - Convert to the list domain search results. 
     *     Convert to the {@link W6004ListDomain}.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - 検索結果データを取得
     * - 検索結果をリストドメインに変換する
     *     {@link W6004ListDomain}に変換する
     * </pre>
     * 
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @return List domain<br />
     * リストドメイン
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W6004ListDomain> callServices(W6004CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
 

        W6001DocCriteriaDomain docCriteriaDomain = createInvoiceCriteria(criteriaDomain);
        
        // For Paging.
        // <<ページング処理用>>検索結果データ取得
        //public List<? extends W6001DocPltzDomain> searchForPagingOnCreateSearch(W6001DocCriteriaDomain criteria)
        List<? extends W6001DocPltzDomain> docPltzList = w6001DocService.searchForPagingOnCreateSearch(docCriteriaDomain);

        return convertToListDomain(docPltzList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * Create the search criteria domain of invoice service.
     * <br />インボイスサービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search conditions domain of invoice service<br />
     * インボイスサービスの検索条件ドメイン
    */
    protected W6001DocCriteriaDomain createInvoiceCriteria(W6004CriteriaDomain criteriaDomain){
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();


        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        if (CUSTOM_TIMING_TYPE_B.equals(criteriaDomain.getCustomTimingTyp())) {
            docCriteriaDomain.setShippingFirmNo(criteriaDomain.getStgActNo());
            docCriteriaDomain.setFmWorkedDt(docCriteriaDomain.getFmStgActDt());
            docCriteriaDomain.setToWorkedDt(docCriteriaDomain.getToStgActDt());
        } else if (CUSTOM_TIMING_TYPE_Z.equals(criteriaDomain.getCustomTimingTyp())) {
            docCriteriaDomain.setShippingFirmNo(criteriaDomain.getStgInstrNo());
        }

        return docCriteriaDomain;
    }
    
    /**
     * Convert to list domain.
     * <br />リストドメインに変換します。
     *
     * @param list List of invoice domain<br />
     * インボイスドメインのリスト
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     */
    protected List<W6004ListDomain> convertToListDomain(List<? extends W6001DocPltzDomain> list, String dateFormat){
        List<W6004ListDomain> listDomain = new ArrayList<W6004ListDomain>();

        if (list != null) {
            for (W6001DocPltzDomain src : list) {
                

                W6004ListDomain dst = new W6004ListDomain();

                CommonUtil.copyPropertiesDomainToDomain(dst, src, dateFormat);

                // Control check box
                // チェックボックスの設定
                if (dst.getDscId() == null || "".equals(dst.getDscId())) {
                    dst.setSelected(CHECK_OFF);
                    dst.setDisabledFlg(false);
                    
                } else {
                    dst.setSelected(CHECK_ON);
                    dst.setDisabledFlg(true);
                }
                
                listDomain.add(dst);
            }
        }
        
        return listDomain;
    }
}
