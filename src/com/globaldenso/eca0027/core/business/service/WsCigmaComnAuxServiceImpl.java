/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WsCigmaComnAuxDao;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WST001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REGISTNAME_CIGMA;

/**
 * Interface of the Service WsNotifyNightBatchStatus.
 * <br />NEXUSへCIGMA夜間バッチ状態を通知するWebサービスのService実装クラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 8014 $
 */
public class WsCigmaComnAuxServiceImpl implements WsCigmaComnAuxService { 

    /**
     * DAO of Web service to notify the CIGMA night batch state to NEXUS<br />
     * NEXUSへCIGMA夜間バッチ状態を通知するWebサービスのDAO
     */
    protected WsCigmaComnAuxDao wsCigmaComnAuxDao;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsCigmaComnAuxServiceImpl() {
    }

    /**
     * Setter method for wsCigmaComnAuxDao.
     *
     * @param wsCigmaComnAuxDao Set for wsCigmaComnAuxDao
     */
    public void setWsCigmaComnAuxDao(WsCigmaComnAuxDao wsCigmaComnAuxDao) {
        this.wsCigmaComnAuxDao = wsCigmaComnAuxDao;
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
     * @see WsCigmaComnAuxService#updateNightBatStat(WsCigmaComnAuxCriteriaDomain)
     */
    public int updateNightBatStat(WsCigmaComnAuxCriteriaDomain criteria) 
        throws ApplicationException {
        
        int result;
        try {
            criteria.setComUpdateFuncId(WS_ID_WST001);
            criteria.setComUpdateUserId(REGISTNAME_CIGMA);
            result = wsCigmaComnAuxDao.updateTmCigmaEnv(criteria);;
        } catch (ApplicationException e) {
            // Update counts if 0 Listings
            // 更新件数が0件の場合
            return 0;
        }
        return result;
    }
}
