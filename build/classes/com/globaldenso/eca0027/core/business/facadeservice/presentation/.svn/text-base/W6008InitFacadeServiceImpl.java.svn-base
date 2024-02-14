/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_UNIT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation class of service for the Facade Init action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6008InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11871 $
 */
public class W6008InitFacadeServiceImpl extends AbstractSearchFacadeService<W6008UpdateDomain, W6008CriteriaDomain>{
    /**
     * Documentation Service
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008InitFacadeServiceImpl(){
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
    protected W6008CriteriaDomain filterDomain(W6008CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return criteria;
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
    protected void validateItems(W6008CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the consistency.
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
    protected void validateConsistency(W6008CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the database.
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
    protected void validateDatabase(W6008CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <pre>
     * Retrieval data.
     * 検索データの取得
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected  W6008UpdateDomain callServices(W6008CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteria);

        // Get Invoice Group Work,Invoide Palletize Work
        // Get Number, Unit price error ,HS CODE warning information
        // インボイスグループワーク、インボイス作成対象パレタイズワークよりデータ取得
        // 品番情報取得、単価エラー情報、HS CODE 警告情報を取得"
        W6001DocInvoiceDomain resultDomain = w6001DocService.searchOnDetaiFrtlInit(docCriteriaDomain);
        
        return convertToDomain(resultDomain, criteria.getScreenDateFormat());
    }

    /**
     * Transform domain of the screen (PL) domain of the service (BL).
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     *
     * @param srcDomain Service domain (BL)<br />
     * サービスドメイン(BL)
     * @param dateFormat Date format<br />
     * 日付書式
     * @return Domain of the screen (PL)<br />
     * 画面のドメイン(PL)
     * @throws ApplicationException ApplicationException
     */
    protected W6008UpdateDomain convertToDomain(W6001DocInvoiceDomain srcDomain, String dateFormat) 
        throws ApplicationException {

        W6008UpdateDomain dstDomain = new W6008UpdateDomain();
        dstDomain.setCriteriaDomain(new W6008CriteriaDomain());
        
        if (srcDomain != null) {
            CommonUtil.copyPropertiesDomainToDomain(
                dstDomain.getCriteriaDomain(), srcDomain, dateFormat);
            
            List<? extends W6001DocPltzDomain> docPltzList = srcDomain.getDocPltzList();
            if (docPltzList != null && !docPltzList.isEmpty()) {
                                
                List<? extends W6001DocPltzItemDomain> docPltzItemList = docPltzList.get(0).getDocPltzItemList();
                
                if (docPltzItemList != null && !docPltzItemList.isEmpty()) {
                    List<W6008ListDomain> listDomainList = new ArrayList<W6008ListDomain>();
                    
                    for (W6001DocPltzItemDomain docPltzItem : docPltzItemList) {
                        W6008ListDomain listDomain = new W6008ListDomain();
                        CommonUtil.copyPropertiesDomainToDomain(listDomain, docPltzItem, dateFormat);
                        listDomain.setUnitPrice(NumberUtil.format(docPltzItem.getUnitPrice(), FORMAT_UNIT_PRICE));
                        
                        listDomainList.add(listDomain);
                    }
                    dstDomain.setListDomainList(listDomainList);

                    // Set Total QTY
                    dstDomain.getCriteriaDomain().setTotalQty(srcDomain.getPltzItemQty().toString());

                    // Unit of Weight
                    // 重量単位
                    //String weightUnitSrc = StringUtil.getEmptyToBlank(srcDomain.getWeightUnit());
                    String weightUnitDst = commonService.searchWeightUnit(srcDomain.getShipperCd());
                    
                    // Set Total N/W
                    String totalNw = null;
                    if (srcDomain.getTotalNetWeight() != null) {
                        // ST959 UNIT CONVERSION MOD START
                        //totalNw = NumberUtil.format(
                        //    commonService.convertWeightUnit(srcDomain.getTotalNetWeight(), weightUnitSrc, weightUnitDst)
                        //    , FORMAT_WEIGHT);
                        totalNw = NumberUtil.format(srcDomain.getTotalNetWeight(), FORMAT_WEIGHT);
                        // ST959 UNIT CONVERSION MOD END
                    } else {
                        totalNw = NumberUtil.format(0, FORMAT_WEIGHT);
                    }
                    // ST959 UNIT CONVERSION DEL START
                    //// An error is made when the digit number of integer part exceeds a maximum.
                    //// 整数部の桁数が上限を超えた場合はエラー
                    //if (!StringUtils.isNotEmpty(totalNw)) {
                    //    Object[] params = { 
                    //        commonService.getResource(null, "label.totalNetWeight") 
                    //    };
                    //    throw new GscmApplicationException(NXS_E7_0157, params);
                    //}
                    // ST959 UNIT CONVERSION DEL END
                    dstDomain.getCriteriaDomain().setTotalNw(totalNw + commonService.searchMeasureUnitDisp(weightUnitDst));
                }
                
            } else {
                dstDomain.setListDomainList(null);
            }
        }
        return dstDomain; 
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
    protected W6001DocCriteriaDomain createDocCriteria(W6008CriteriaDomain criteriaDomain){
       
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
       
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain);
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
       
        return docCriteria;
    }
}
