/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_MISCELLANEOUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * Service implementation class of Progress Control.
 * <br />Progress Controlのサービス実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10392 $
 */
public class W8001ProgCtrlServiceImpl implements W8001ProgCtrlService {
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * w8001ProgCtrlDao
     */
    protected W8001ProgCtrlDao w8001ProgCtrlDao;

    /**
     * Type in the functional overview of the constructor.
     */
    public W8001ProgCtrlServiceImpl() {
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
     * Setter method for w8001ProgCtrlDao.
     *
     * @param progCtrlDao Set for w8001ProgCtrlDao
     */
    public void setW8001ProgCtrlDao(W8001ProgCtrlDao progCtrlDao) {
        w8001ProgCtrlDao = progCtrlDao;
    }
    
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#validateConsistencyFmIssueDateToIssueDate(String, String, String)
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String fmIssueDate, String toIssueDate, String dateFormat) 
        throws ApplicationException {
        //W8001 6-1.2
        if ((fmIssueDate == null || fmIssueDate.length() == 0)
            || (toIssueDate == null || toIssueDate.length() == 0)) {
            return true;
        }
        // Check that the start date is earlier than the end date.
        // - 【9】:FM) Issue Dateと【11】:TO) Issue Dateの両方が入力された場合に実施
        //       機能仕様共通：日付 From - To の相関チェック
        return commonService.validateFromToDate(dateFormat, fmIssueDate, toIssueDate);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#validateConsistencyFmEtdToEtd(String, String, String)
     */
    public boolean validateConsistencyFmEtdToEtd(String fmEtd, String toEtd, String dateFormat)
        throws ApplicationException {
        //W8001 6-1.2
        if ((fmEtd == null || fmEtd.length() == 0)
            || (toEtd == null || toEtd.length() == 0)) {
            return true;
        }
        // Check that the start date is earlier than the end date.
        // - 【31】:FM) ETDと【33】:TO) ETDの両方が入力された場合に実施
        //   機能仕様共通：日付 From - To の相関チェック
        return commonService.validateFromToDate(dateFormat, fmEtd, toEtd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#validateConsistencyFmAtdToAtd(String, String, String)
     */
    public boolean validateConsistencyFmAtdToAtd(String fmAtd, String toAtd, String dateFormat)
        throws ApplicationException {
        //W8001 6-1.2
        if ((fmAtd == null || fmAtd.length() == 0)
            || (toAtd == null || toAtd.length() == 0)) {
            return true;
        }
        // Check that the start date is earlier than the end date.
        // - 【35】:FM) ATDと【37】:TO) ATDの両方が入力された場合に実施
        //   機能仕様共通：日付 From - To の相関チェック
        return commonService.validateFromToDate(dateFormat, fmAtd, toAtd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingOnMainSearch(W8001ProgCtrlCriteriaDomain criteria) 
        throws ApplicationException {
        
        List<? extends W8001ProgCtrlDomain> result = new ArrayList<W8001ProgCtrlDomain>();
        // Check the SelectCondition as 'searchItemNo'.
        //Search Item Noが選択されている
        if ("searchItemNo".equals(criteria.getSelectCondition())) {
            // Get the number of retrieved from the Progress Control information.
            // 検索データ件数の取得 ※品目番号検索時
            int count = w8001ProgCtrlDao.searchCountTtPltzByItemNo(criteria);

            // Get the Progress Control information corresponding to the search condition. 
            // <<ページング処理用>>品目番号検索時のデータ取得権限のあるデータに絞って表示
            result = w8001ProgCtrlDao.searchForPagingTtPltzByItemNo(criteria);
        }
        else { 
            // Get the number of retrieved from the Progress Control information.
            // 検索データ件数の取得 ※得意先PO検索時
            int count = w8001ProgCtrlDao.searchCountTtPltzByPoNo(criteria);

            // Get the Progress Control information corresponding to the search condition. 
            // <<ページング処理用>>得意先PO検索時のデータ取得権限のあるデータに絞って表示
            result = w8001ProgCtrlDao.searchForPagingTtPltzByPoNo(criteria);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#searchOnDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public W8001ProgCtrlDomain searchOnDetailInit(W8001ProgCtrlCriteriaDomain criteria) 
        throws ApplicationException {
        // Make Progress Control more information acquisition in the case mark the unit corresponding to the search criteria.
        W8001ProgCtrlDomain result = w8001ProgCtrlDao.searchTtPltz(criteria);
        if (result == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Get the weight unit of company.
        String weightUnit = commonService.searchWeightUnit(result.getShipperCd());
        
        // Get the volume unit of company.
        String volumeUnit = commonService.searchVolumeUnit(result.getShipperCd());
        
        // Check the difference of volume unit between display and database.
        if (!volumeUnit.equals(result.getTotalVolumeUnit())) {
            if (result.getTotalVolume() != null) {
                // Convert unit (for weight unit) .
                BigDecimal totalVolume = commonService.convertVolumeUnit(result.getTotalVolume(), result.getTotalVolumeUnit(), volumeUnit);
                if (totalVolume == null) {
                    Object[] params = { 
                        commonService.getResource(result.getLocale(), "label.totalVol") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params); 
                }
                result.setTotalVolume(totalVolume);
            }
        }
        
        // Check the difference of weight unit between display and database.
        if (!weightUnit.equals(result.getTotalWeightUnit())) {
            if (result.getTotalNetWeight() != null) {
                // Convert unit (for weight unit) .
                BigDecimal totalNetWeight = commonService.convertWeightUnit(result.getTotalNetWeight(), result.getTotalWeightUnit(), weightUnit);
                if (totalNetWeight == null) {
                    Object[] params = { 
                        commonService.getResource(result.getLocale(), "label.totalNw") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params); 
                }
                result.setTotalNetWeight(totalNetWeight);
            }
            if (result.getTotalGrossWeight() != null) {
                // Convert unit (for weight unit) .
                BigDecimal totalGrossWeight = commonService.convertWeightUnit(result.getTotalGrossWeight(), result.getTotalWeightUnit(), weightUnit);
                if (totalGrossWeight == null) {
                    Object[] params = { 
                        commonService.getResource(result.getLocale(), "label.totalGw") 
                    };
                    throw new GscmApplicationException(NXS_E7_0157, params); 
                }
                result.setTotalGrossWeight(totalGrossWeight);
            }
        }
        
        result.setTotalVolumeUnit(volumeUnit);
        result.setTotalWeightUnit(weightUnit);
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#searchForPagingOnCmlDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public List<? extends W8001ProgCtrlDomain> searchForPagingOnCmlDetailInit(W8001ProgCtrlCriteriaDomain criteria) 
        throws ApplicationException {
        
        List<? extends W8001ProgCtrlDomain> result = null;
        criteria.setSearchCountCheckFlg(false);
        if (CML_TYPE_CIGMA.equals(criteria.getCmlTyp())) {
            // Get the number of retrieved from the Progress Control ITEM NO information. 
            // 検索データ件数の取得
            if (w8001ProgCtrlDao.searchCountTtPltzItemByCigma(criteria) == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);   
            }
                
            // Get the Progress Control ITEM NO information corresponding to the search criteria. 
            // 製部品（CIGMA）に含まれる品目番号の取得 権限のないデータをマスキング
            result = w8001ProgCtrlDao.searchForPagingTtPltzItemByCigma(criteria);
        }
        else if (CML_TYPE_MISCELLANEOUS.equals(criteria.getCmlTyp())) {
            // Get the number of retrieved from Progress Control ITEM NO information. 
            // 検索データ件数の取得
            if (w8001ProgCtrlDao.searchCountTtPltzItemByMisc(criteria) == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            
            // Get the Progress Control ITEM NO information corresponding to the search criteria. 
            // 非製部品に含まれる品目番号の取得 権限のないデータをマスキング
            result = w8001ProgCtrlDao.searchForPagingTtPltzItemByMisc(criteria);
        } else {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#searchOnCmlDetailSort(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public List<? extends W8001ProgCtrlDomain> searchOnCmlDetailSort(W8001ProgCtrlCriteriaDomain criteria) 
        throws ApplicationException {
        criteria.setSearchCountCheckFlg(false);
        List<? extends W8001ProgCtrlDomain> result = new ArrayList<W8001ProgCtrlDomain>();
        if ("1".equals(criteria.getCmlTyp())) {
            // Get the number of retrieved from the Progress Control ITEM NO information. 
            // 検索データ件数の取得
            if (w8001ProgCtrlDao.searchCountTtPltzItemByCigma(criteria) == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            // Get the Progress Control ITEM NO information corresponding to the search criteria. 
            // 製部品（CIGMA）に含まれる品目番号の取得 権限のないデータをマスキング
            result = w8001ProgCtrlDao.searchForPagingTtPltzItemByCigmaSort(criteria);
        }
        else if ("3".equals(criteria.getCmlTyp())) {
            // Get the number of retrieved from the Progress Control ITEM NO information. 
            // 検索データ件数の取得
            if (w8001ProgCtrlDao.searchCountTtPltzItemByMisc(criteria) == 0) {
                throw new GscmApplicationException(GSCM_E0_0001);
            }
            // Get the Progress Control ITEM NO information corresponding to the search criteria. 
            // 非製部品に含まれる品目番号の取得 権限のないデータをマスキング
            result = w8001ProgCtrlDao.searchForPagingTtPltzItemByMiscSort(criteria);
        } else {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService#searchOnRtnInfoInit(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public List<? extends W8001ProgCtrlPltzItemDomain> searchOnRtnInfoInit(W8001ProgCtrlCriteriaDomain criteria) 
        throws ApplicationException {
        // Get the retrieved from the Progress Control RT material information. 
        //W8004 1-3
        // - 検索データ件数の取得
        criteria.setSearchCountCheckFlg(false);
        if ( w8001ProgCtrlDao.searchCountTtPltzItem(criteria) == 0) {
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        // Get the Progress Control RT material information corresponding to the search condition. 
        //W8004 1-4
        // - 検索結果データを取得
        return w8001ProgCtrlDao.searchForPagingTtPltzItem(criteria);
    }

}
