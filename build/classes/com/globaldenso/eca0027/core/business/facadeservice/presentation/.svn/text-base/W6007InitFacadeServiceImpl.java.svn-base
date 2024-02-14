/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation of the Facade class service to Init action of Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6007InitFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6007InitFacadeServiceImpl extends 
    AbstractSearchFacadeService<W6007UpdateDomain, W6007CriteriaDomain> {
    
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected  W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007InitFacadeServiceImpl(){
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6007CriteriaDomain filterDomain(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Check the single item.
     * 単項目チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W6007CriteriaDomain> valid = new Validator<W6007CriteriaDomain>(criteriaDomain, "w6007CriteriaDomain");
        
        String[] properties = {
            "dateShipped",
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6007);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <br />
     * <pre>
     * Retrieval data
     * 検索データの取得
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6007UpdateDomain callServices(W6007CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        W6001DocCriteriaDomain docCriteriaDomain = createDocCriteria(criteriaDomain);

        // Get Invoide Palletize Work,Invoice Group Work.
        // Number information acquisition of a CIGMA article and an ERT article. 
        // Currency of a CIGMA article, unit price information acquisition. (WS(Get Sales Prince Info))
        // HS CODE warning information of a CML multicurrency, unit price error information, a CIGMA article, and an ERT article is obtained. 
        // インボイスグループワーク、インボイス作成対象パレタイズワークよりデータ取得
        // CIGMA品、ERT品の品番情報取得
        // CIGMA品の通貨、単価情報取得(WS(Get Sales Prince Info))
        // CML複数通貨、単価エラー情報、CIGMA品、ERT品のHS CODE 警告情報を取得"
        W6001DocInvoiceDomain docInvoiceDomain = w6001DocService.searchOnDetailInit(docCriteriaDomain);
        
        return convertToDomain(docInvoiceDomain, criteriaDomain.getScreenDateFormat());
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

        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain);
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
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
            CommonUtil.copyPropertiesDomainToDomain(
                dstDomain.getCriteriaDomain(), srcDomain, dateFormat);
            
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
                
                // Total CML QTY 
                dstDomain.getCriteriaDomain().setTotalCmlQty(
                    Integer.valueOf(docPltzList.size()).toString());
                
                // Total G/W 
                String totalGw = NumberUtil.format(0, FORMAT_WEIGHT);
                if (srcDomain.getTotalGrossWeight() != null) {
                    totalGw = NumberUtil.format(srcDomain.getTotalGrossWeight(), FORMAT_WEIGHT);
                }
                dstDomain.getCriteriaDomain().setTotalGw(totalGw + weightUnit);
                
                // Total Vol.
                String totalVolume = NumberUtil.format(0, FORMAT_VOLUME);
                if (srcDomain.getTotalVolume() != null) {
                    totalVolume = NumberUtil.format(srcDomain.getTotalVolume(), FORMAT_VOLUME);
                }
                dstDomain.getCriteriaDomain().setTotalVolume(totalVolume + volumeUnit);
                
            } else {
                dstDomain.setListDomainList(null);
                dstDomain.getCriteriaDomain().setTotalCmlQty("0");
                dstDomain.getCriteriaDomain().setTotalGw(NumberUtil.format(0, FORMAT_WEIGHT) + weightUnit);
                dstDomain.getCriteriaDomain().setTotalVolume(NumberUtil.format(0, FORMAT_VOLUME) + volumeUnit);
            }
        }
        return dstDomain;
    }
}

