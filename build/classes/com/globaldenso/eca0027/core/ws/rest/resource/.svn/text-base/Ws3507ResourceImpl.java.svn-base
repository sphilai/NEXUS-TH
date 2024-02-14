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
import com.globaldenso.eca0027.core.business.domain.Ws3507TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3507CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws3507.<BR>
 * Ws3507のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3507ResourceImpl extends AbstractResourceImpl implements
        Ws3507Resource {

    /**
     * <p>
     * FacadeService object of Ws3507<BR>
     * Ws3507のFacadeServiceオブジェクト
     * </p>
     */
    private TransactFacadeService<ResultDomain, Ws3507CriteriaDomain> ws3507TransactFacadeService;

    /**
     * <p>
     * Default Costractor
     * </p>
     */
    public Ws3507ResourceImpl() {
    }
    
    /**
     * <p>Getter method for ws3507TransactFacadeService.</p>
     *
     * @return the ws3507TransactFacadeService
     */
    public TransactFacadeService<ResultDomain, Ws3507CriteriaDomain> getWs3507TransactFacadeService() {
        return ws3507TransactFacadeService;
    }

    /**
     * <p>Setter method for ws3507TransactFacadeService.</p>
     *
     * @param ws3507TransactFacadeService Set for ws3507TransactFacadeService
     */
    public void setWs3507TransactFacadeService(
        TransactFacadeService<ResultDomain, Ws3507CriteriaDomain> ws3507TransactFacadeService) {
        this.ws3507TransactFacadeService = ws3507TransactFacadeService;
    }

    /**
     * <p>
     * Execute ws3507TransactFacadeService
     * </p>
     * 
     * @param trNo Transfer No
     * @param trItemTyp TR Kind
     * @param compCd Company Code
     * @param printerId Printer ID
     * @param noOfPrint No of Print
     * @return Ws3507TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException AiwsApplicationException
     */
    public Ws3507TransactFacadeServiceResultDomain printTransferByMainMark(String trNo, String trItemTyp, String compCd, String printerId, String noOfPrint) throws AiwsApplicationException {
        
        // Initialize ResultDomain
        Ws3507TransactFacadeServiceResultDomain resultDomain =  new Ws3507TransactFacadeServiceResultDomain();

        try {
            // Create input domain
            Ws3507CriteriaDomain inputDomain = new Ws3507CriteriaDomain();
            
            inputDomain.setTrNo(trNo);
            inputDomain.setTrItemTyp(trItemTyp);
            inputDomain.setPrinterId(printerId);
            inputDomain.setNoOfPrint(noOfPrint);
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3507TransactFacadeServiceResultDomain)ws3507TransactFacadeService.transact(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3507TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3507TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3507TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }

}
