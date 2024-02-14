/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2501ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Resource implementation class for the WS2501 
 * <br />ws2501のリソース実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501ResourceImpl extends AbstractResourceImpl implements Ws2501Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    protected SearchFacadeService<Ws2501ResultDomain, Ws2501CriteriaDomain> ws2501SearchFacadeService;

    /**
     * constructor.
     */
    public Ws2501ResourceImpl() {
    }

    /**
     * Setter method for ws2501SearchFacadeService.
     *
     * @param ws2501SearchFacadeService Set for ws2501SearchFacadeService
     */
    public void setWs2501SearchFacadeService(
        SearchFacadeService<Ws2501ResultDomain, Ws2501CriteriaDomain> ws2501SearchFacadeService) {
        this.ws2501SearchFacadeService = ws2501SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2501Resource#getPltzInstr(String)
     */
    
    public Ws2501ResultDomain getPltzInstr(String pltzInstrNo) throws AiwsApplicationException {
        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2501CriteriaDomain criteriaDomain = new Ws2501CriteriaDomain();
        criteriaDomain.setPltzInstrNo(pltzInstrNo);
        criteriaDomain.setLocale(new Locale(getLanguageCd()));
        
        // Generation of Result Domain
        // Result Domainの生成
        Ws2501ResultDomain resultDomain = new Ws2501ResultDomain();
        
        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            resultDomain = this.ws2501SearchFacadeService.search(criteriaDomain);
            
        } catch (ValidationException e) {
            resultDomain = new Ws2501ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws2501ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws2501ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
        }
        return resultDomain;
    }
}
