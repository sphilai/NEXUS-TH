/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsT001CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsT001ResourceImpl extends AbstractResourceImpl implements WsT001Resource {
    
    /**
     * Ws7001FacadeService object
     * <br />Ws7001FacadeServiceオブジェクト
     */
    protected UpdateFacadeService<ResultDomain, WsT001CriteriaDomain> wsT001FacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsT001ResourceImpl() {
    }

    /**
     * Setter method for wsT001FacadeService.
     *
     * @param wsT001FacadeService Set for wsT001FacadeService
     */
    public void setWsT001FacadeService(UpdateFacadeService<ResultDomain, WsT001CriteriaDomain> wsT001FacadeService) {
        this.wsT001FacadeService = wsT001FacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.WsT001Resource#notifyNightBatStat(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public ResultDomain notifyNightBatStat(String lib, String companyCode, String accessibilityType, String cigmaAds)
        throws AiwsApplicationException {
        ResultDomain resultDomain = null;
        try {
            // Create of an input domain
            // <br />入力ドメインの作成
            WsT001CriteriaDomain inputDomain = createInputDomain(lib, companyCode, accessibilityType, cigmaAds);
            
            // Execution of FacadeService
            // <br />FacadeServiceの実行
            resultDomain = wsT001FacadeService.update(inputDomain);
    
        } catch (ValidationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, getErrorList(e.getCode()));
        } 
        return resultDomain;
    }
    
    /**
     * Create an input domain from a request parameter.
     * <br />リクエストパラメータから入力ドメインを作成します。
     *
     * @param lib Library name<br />ライブラリ名
     * @param companyCode COMPANY CODE<br />会社コード
     * @param accessibilityType Library type<br />ライブラリタイプ
     * @param cigmaAds CigmaAds
     * @return Input domain<br />入力ドメイン
     */
    protected WsT001CriteriaDomain createInputDomain(String lib, String companyCode, String accessibilityType, String cigmaAds) {
        WsT001CriteriaDomain inputDomain = new WsT001CriteriaDomain();
        inputDomain.setCompCd(companyCode);
        inputDomain.setAccessibilityTyp(accessibilityType);
        inputDomain.setCigmaAds(cigmaAds);
        inputDomain.setLib(lib);
        return inputDomain;
    }
}
