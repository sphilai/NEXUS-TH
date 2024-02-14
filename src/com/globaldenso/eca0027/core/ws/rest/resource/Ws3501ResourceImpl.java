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
import com.globaldenso.eca0027.core.business.domain.Ws3501SearchFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3501CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws3501.<BR>
 * Ws3501のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3501ResourceImpl extends AbstractResourceImpl implements
        Ws3501Resource {

    /**
     * <p>
     * FacadeService object of Ws3501<BR>
     * Ws3501のFacadeServiceオブジェクト
     * </p>
     */
    private SearchFacadeService<ResultDomain, Ws3501CriteriaDomain> ws3501SearchFacadeService;

    /**
     * <p>
     * Default Costractor
     * </p>
     */
    public Ws3501ResourceImpl() {
    }

    /**
     * <p>Getter method for ws3501SearchFacadeService.</p>
     *
     * @return the ws3501SearchFacadeService
     */
    public SearchFacadeService<ResultDomain, Ws3501CriteriaDomain> getWs3501SearchFacadeService() {
        return ws3501SearchFacadeService;
    }

    /**
     * <p>Setter method for ws3501SearchFacadeService.</p>
     *
     * @param ws3501SearchFacadeService Set for ws3501SearchFacadeService
     */
    public void setWs3501SearchFacadeService(
        SearchFacadeService<ResultDomain, Ws3501CriteriaDomain> ws3501SearchFacadeService) {
        this.ws3501SearchFacadeService = ws3501SearchFacadeService;
    }

    /**
     * <p>
     * Execute ws3501TransactFacadeService
     * </p>
     * 
     * @param dscId DSC-ID
     * @param trNo Transfer No
     * @param editCnt Edit Count
     * @param validEditCntFlg Edit Count Flag
     * @param trItemTyp TR Kind
     * @return Ws3501TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException AiwsApplicationException
     */
    public Ws3501SearchFacadeServiceResultDomain getTransferInfo(
        String dscId, String trNo, String validEditCntFlg, String editCnt, String trItemTyp)
        throws AiwsApplicationException {
        
        // Initialize ResultDomain
        Ws3501SearchFacadeServiceResultDomain resultDomain = new Ws3501SearchFacadeServiceResultDomain();
        
        try {
            // Create input domain
            Ws3501CriteriaDomain inputDomain = new Ws3501CriteriaDomain();
            inputDomain.setDscId(dscId);
            inputDomain.setTrNo(trNo);
            inputDomain.setValidEditCntFlg(validEditCntFlg);
            if("1".equals(inputDomain.getValidEditCntFlg())){
                inputDomain.setEditCnt(editCnt);
            }
            inputDomain.setTrItemTyp(trItemTyp);
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3501SearchFacadeServiceResultDomain)ws3501SearchFacadeService.search(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3501SearchFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3501SearchFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3501SearchFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }
        return resultDomain;
    }

}
