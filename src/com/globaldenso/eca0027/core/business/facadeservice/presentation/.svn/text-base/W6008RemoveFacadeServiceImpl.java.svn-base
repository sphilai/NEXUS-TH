/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_UNIT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0123;

import java.util.ArrayList;
import java.util.Arrays;
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
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation of the Facade class service to Remove action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のRemoveアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w60088RemoveFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11870 $
 */
public class W6008RemoveFacadeServiceImpl extends AbstractTransactFacadeService<W6008UpdateDomain, W6008UpdateDomain>{
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008RemoveFacadeServiceImpl(){
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
     * No action
     * <br />処理なし
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6008UpdateDomain filterDomain(W6008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        List<W6008ListDomain> newListDomainList = new ArrayList<W6008ListDomain>();

        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W6008ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Detail line selection check
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            MessageDomain md = new MessageDomain("", NXS_E7_0004, null);
            errList.add(md);
        }
        
        // All the Remove checks 
        // 全Removeチェック
        if (updateDomain.getListDomainList().size() == newListDomainList.size()){
            MessageDomain md = new MessageDomain("", NXS_E7_0123, null);
            errList.add(md);
        }
        
        W6008UpdateDomain newUpdateDomain = new W6008UpdateDomain();
    
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        newUpdateDomain.setListDomainList(newListDomainList);

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
        return newUpdateDomain;    
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
    protected void validateItems(W6008UpdateDomain updateDomain)
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
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the database.
     * <br />データベースチェックを行う。
     * 
     * <br />
     * <pre>
     * - Create the cord conditions domain. 
     *      Create the {@link W6008UpdateDomain}.
     * - Check the NIGHT BATCH CIGMA.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6008UpdateDomain}を作成する
     * - CIGMA夜間バッチ中チェックをする
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // In CML TYPE="1", the company set to Shipper checks in the inside of a batch at night. 
        // CML TYPE= "1" の場合、CIGMA品であるため、Shipperにセットされている会社が夜間バッチ中か否かのチェックを行う
        if (CML_TYPE_CIGMA.equals(updateDomain.getCriteriaDomain().getCmlTyp())) {
            // Common:Behavior in a batch in the CIGMA night.
            // 機能仕様共通：CIGMA夜間バッチ中の振る舞い
            String errCd = w6001DocService.validateDatabaseCigmaAvailable(
                updateDomain.getCriteriaDomain().getShipperCd(), updateDomain.getCriteriaDomain().getCmlTyp());
            if (errCd != null){
                List<MessageDomain> errList = Arrays.asList(new MessageDomain("", errCd, null));
                throw new ValidationException(errList);
            }
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
     * - Update the Invoice Item No Work.
     * - Get the data from Invoice Group Work, Invoide Palletize Work.
     * - Convert to the list domain acquired data. 
     *     Convert to the {@link W6001DocInvoiceDomain}.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - インボイス作成対象品番ワークを更新する
     * - インボイスグループワーク、インボイス作成対象パレタイズワークよりデータ取得する
     * - 取得データをリストドメインに変換する
     *     {@link W6001DocInvoiceDomain}に変換する
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception.....<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected  W6008UpdateDomain callServices(W6008UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(updateDomain);

        W6001DocInvoiceDomain resultDomain = w6001DocService.deleteOnDetailFrtRemove(docCriteriaDomain);
        
        return convertToDomain(resultDomain, docCriteriaDomain.getScreenDateFormat());
    }
    
    /**
     * Transform domain of the screen (PL) domain of the service (BL).
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     *
     * @param srcDomain Service domain (BL)<br />
     * サービスドメイン(BL)
     * @param dateFormat Date format<br />
     * 日付書式
     * @return Domain of the screen (PL)<br />画面のドメイン(PL)
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
                    // Total QTY 集計
                    dstDomain.getCriteriaDomain().setTotalQty(
                        srcDomain.getPltzItemQty().toString());

                    // Unit of Weight
                    // 重量単位
                    //String weightUnitSrc = StringUtil.getEmptyToBlank(srcDomain.getWeightUnit()); // ST959 UNIT CONVERSION DEL
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
     *
     * Based on (PL) search criteria domain, create the search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * @param updateDomain Search conditions domain of Invoice Main Screen screen (PL)<br />
     * Invoice Main Screen画面の検索条件ドメイン(PL)
     * @return Search conditions domain of Doc Service (BL)<br />
     * Docサービスの検索条件ドメイン(BL)
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     */
    protected W6001DocCriteriaDomain createDocCriteria(W6008UpdateDomain updateDomain)
        throws ApplicationException {
       
        String dateFormat = updateDomain.getCriteriaDomain().getScreenDateFormat();
        
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();
       
        CommonUtil.copyPropertiesDomainToDomain(
            docCriteriaDomain, updateDomain.getCriteriaDomain(), dateFormat);
        docCriteriaDomain.setDscId(updateDomain.getCriteriaDomain().getLoginUserDscId());
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        for (W6008ListDomain listDomain : updateDomain.getListDomainList()) {
            W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(docPltz, listDomain, dateFormat);
            docPltzList.add(docPltz);
        }
        docCriteriaDomain.setDocPltzList(docPltzList);
        
        return docCriteriaDomain;
    }
}
