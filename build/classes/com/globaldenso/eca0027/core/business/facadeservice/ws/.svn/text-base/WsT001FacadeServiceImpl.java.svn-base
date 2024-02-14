/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsT001CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsCigmaComnAuxService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Resource implementation class for the Facade class service for overnight batch status notification.
 * <br />夜間バッチ状態通知に対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsT001FacadeServiceImpl extends AbstractUpdateFacadeService<ResultDomain, WsT001CriteriaDomain> {

    /**
     * Service of Web service to notify the CIGMA night batch state to NEXUS
     * <br />NEXUSへCIGMA夜間バッチ状態を通知するWebサービスのサービス
     */
    protected WsCigmaComnAuxService wsCigmaComnAuxService;
    
    /**
     * constructor.<br>
     * デフォルトコンストラクタです。
     */
    public WsT001FacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for wsCigmaComnAuxServce.
     *
     * @param wsCigmaComnAuxService Set for wsCigmaComnAuxService
     */
    public void setWsCigmaComnAuxService(WsCigmaComnAuxService wsCigmaComnAuxService) {
        this.wsCigmaComnAuxService = wsCigmaComnAuxService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * <br />処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WsT001CriteriaDomain filterDomain(WsT001CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteria;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WsT001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WsT001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WsT001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * Update the environment per unit.
     * <br />環境原単位を更新します。
     * <pre>
     * - Environmental basic unit update
     *   Set the request parameters to {@link WsCigmaComnAuxCriteriaDomain},
     *   Call {@link WsCigmaComnAuxService#updateNightBatStat(WsCigmaComnAuxCriteriaDomain)}.
     * </pre>
     * <pre>
     * ‐環境原単位更新
     *     {@link WsCigmaComnAuxCriteriaDomain}にリクエストパラメータを設定し、
     *     {@link WsCigmaComnAuxService#updateNightBatStat(WsCigmaComnAuxCriteriaDomain)}を呼出します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected ResultDomain callServices(WsT001CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {
        ResultDomain resultDomain = new ResultDomain(WS_RESULT_SUCCESS);
        
        // Setting of a registration parameter
        // 登録パラメータの設定
        WsCigmaComnAuxCriteriaDomain wsCigmaComnAuxCriteriaDomain = new WsCigmaComnAuxCriteriaDomain();
        wsCigmaComnAuxCriteriaDomain.setAccessibilityTyp(criteria.getAccessibilityTyp());
        wsCigmaComnAuxCriteriaDomain.setLib(criteria.getLib());
        wsCigmaComnAuxCriteriaDomain.setCompCd(criteria.getCompCd());
        // A Date type is declared and String is substituted to Date using SimpleDateFormat#parse.
        // Date型を宣言し、SimpleDateFormat#parseを使って、StringをDateへ代入
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        try {
            simpleDateFormat.setLenient(false);
            wsCigmaComnAuxCriteriaDomain.setCigmaAds(simpleDateFormat.parse(criteria.getCigmaAds()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Registration processing execution
        // 登録処理実行
        int result = wsCigmaComnAuxService.updateNightBatStat(wsCigmaComnAuxCriteriaDomain);
        
        if(result == 0){
            String[] params = {"NIGHT_ACCESS_CTL", criteria.getCompCd()} ;
            throw new GscmApplicationException(NXS_E1_0031, params);
        }
        return resultDomain;
    }
}
