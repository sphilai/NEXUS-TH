/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation of the Facade class service to Remove action of Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のRemoveアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6007RemoveFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6007RemoveFacadeServiceImpl extends 
    AbstractSearchFacadeService<W6007UpdateDomain, W6007UpdateDomain>{
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007RemoveFacadeServiceImpl(){
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
     * - Line item selection check 
     * - All REMOVE check
     * </pre>
     * <pre>
     * - 明細行選択チェック
     * - 全REMOVEチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6007UpdateDomain filterDomain(W6007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        List<W6007ListDomain> newListDomainList = new ArrayList<W6007ListDomain>();

        // The selected List domain is extracted. 
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W6007ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
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
        
        W6007UpdateDomain newUpdateDomain = new W6007UpdateDomain();
    
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        newUpdateDomain.setListDomainList(newListDomainList);

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
        return newUpdateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the consistency.
     * <br />整合性チェックを行う。
     * 
     * <br />
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * Check the database.
     * <br />データベースチェックを行う。
     * 
     * <br />
     * <pre>
     * - Check the NIGHT BATCH CIGMA.
     * - CIGMA夜間バッチ中チェックをする
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6007UpdateDomain updateDomain)
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
     * - Update the Invoide Palletize Work and Invoice Item No Work.
     * - Re-search.
     * </pre>
     * <pre>
     * - インボイス作成対象パレタイズワーク、インボイス作成対象品番ワークを更新する
     * - 再検索を行う
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
    protected W6007UpdateDomain callServices(W6007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(updateDomain);

        W6001DocInvoiceDomain docInvoiceDomain = w6001DocService.updateOnDetailRemove(docCriteriaDomain);
        
        return convertToDomain(docInvoiceDomain, updateDomain.getCriteriaDomain().getScreenDateFormat());
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
    protected W6001DocCriteriaDomain createDocCriteria(W6007UpdateDomain updateDomain)
        throws ApplicationException {
        
        String dateFormat = updateDomain.getCriteriaDomain().getScreenDateFormat();
        
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(
            docCriteriaDomain, updateDomain.getCriteriaDomain(), dateFormat);
        docCriteriaDomain.setDscId(updateDomain.getCriteriaDomain().getLoginUserDscId());
        
        List<W6001DocPltzDomain> docPltzList = new ArrayList<W6001DocPltzDomain>();
        for (W6007ListDomain listDomain : updateDomain.getListDomainList()) {
            W6001DocPltzDomain docPltz = new W6001DocPltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(docPltz, listDomain, dateFormat);
            docPltzList.add(docPltz);
        }
        docCriteriaDomain.setDocPltzList(docPltzList);
        
        return docCriteriaDomain;
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
     */
    protected W6007UpdateDomain convertToDomain(W6001DocInvoiceDomain srcDomain, String dateFormat) {

        W6007UpdateDomain dstDomain = new W6007UpdateDomain();
        dstDomain.setCriteriaDomain(new W6007CriteriaDomain());
        
        if (srcDomain != null) {
            CommonUtil.copyPropertiesDomainToDomain(dstDomain.getCriteriaDomain(), srcDomain, dateFormat);
            
            // Unit of Weight
            // 重量単位
            String weightUnit = "";
            if (dstDomain.getCriteriaDomain().getWeightUnit() != null) {
                weightUnit = dstDomain.getCriteriaDomain().getWeightUnit();
            }
            
            // Volume UNIT
            // 容積単位
            String volumeUnit = "";
            if (dstDomain.getCriteriaDomain().getVolumeUnit() != null) {
                volumeUnit = dstDomain.getCriteriaDomain().getVolumeUnit();
            }
            
            List<? extends W6001DocPltzDomain> docPltzList = srcDomain.getDocPltzList();
            if (docPltzList != null && !docPltzList.isEmpty()) {
                List<W6007ListDomain> listDomainList = new ArrayList<W6007ListDomain>();
                for (W6001DocPltzDomain docPltz : docPltzList) {
                    W6007ListDomain listDomain = new W6007ListDomain();
                    CommonUtil.copyPropertiesDomainToDomain(listDomain, docPltz, dateFormat);
                    listDomain.setGrossWeight(NumberUtil.format(docPltz.getGrossWeight(), FORMAT_WEIGHT));
                    listDomain.setVolume(NumberUtil.format(docPltz.getVolume(), FORMAT_VOLUME));
                    
                    // Control display for Check Box(Remove) 
                    if (FLAG_Y.equals(docPltz.getSplitShippingNgFlg())) {
                        listDomain.setDisabledFlg(FLAG_Y);
                    }
                    
                    listDomainList.add(listDomain);
                }
                dstDomain.setListDomainList(listDomainList);
                
                // Set Total CML QTY
                // Total CML QTY 設定
                dstDomain.getCriteriaDomain().setTotalCmlQty(
                    Integer.valueOf(docPltzList.size()).toString());
                
                // Set Total G/W
                // Total G/W 設定
                String totalGw = NumberUtil.format(0, FORMAT_WEIGHT);
                if (srcDomain.getTotalGrossWeight() != null) {
                    totalGw = NumberUtil.format(srcDomain.getTotalGrossWeight(), FORMAT_WEIGHT);
                }
                dstDomain.getCriteriaDomain().setTotalGw(totalGw + weightUnit);
                
                // Set Total Vol.
                // Total Vol. 設定
                String totalVolume = NumberUtil.format(0, FORMAT_VOLUME);
                if (srcDomain.getTotalVolume() != null) {
                    totalVolume = NumberUtil.format(srcDomain.getTotalVolume(), FORMAT_VOLUME);
                }
                dstDomain.getCriteriaDomain().setTotalVolume(totalVolume + volumeUnit);
                
            } else {
                dstDomain.getCriteriaDomain().setTotalCmlQty("0");
                dstDomain.getCriteriaDomain().setTotalGw(NumberUtil.format(0, FORMAT_WEIGHT) + weightUnit);
                dstDomain.getCriteriaDomain().setTotalVolume(NumberUtil.format(0, FORMAT_VOLUME) + volumeUnit);
            }
        }
        
        return dstDomain;
    }
}

