/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3506CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
/**
 * <p>
 * The resource implementation class of Ws3506.<BR>
 * Ws3506のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3506ResourceImpl extends AbstractResourceImpl implements
        Ws3506Resource {

    /**
     * <p>
     * FacadeService object of Ws3506<BR>
     * Ws3506のFacadeServiceオブジェクト
     * </p>
     */
    private TransactFacadeService<ResultDomain, Ws3506CriteriaDomain> ws3506TransactFacadeService;

    /**
     * <p>
     * Default Costractor
     * </p>
     */
    public Ws3506ResourceImpl() {
    }

    /**
     * <p>Getter method for ws3506TransactFacadeService.</p>
     *
     * @return the ws3506TransactFacadeService
     */
    public TransactFacadeService<ResultDomain, Ws3506CriteriaDomain> getWs3506TransactFacadeService() {
        return ws3506TransactFacadeService;
    }

    /**
     * <p>Setter method for ws3506TransactFacadeService.</p>
     *
     * @param ws3506TransactFacadeService Set for ws3506TransactFacadeService
     */
    public void setWs3506TransactFacadeService(
        TransactFacadeService<ResultDomain, Ws3506CriteriaDomain> ws3506TransactFacadeService) {
        this.ws3506TransactFacadeService = ws3506TransactFacadeService;
    }

    /**
     * <p>
     * Execute ws3506TransactFacadeService
     * </p>
     * 
     * @param dscId DSC-ID
     * @param trNo Transfer No
     * @param trItemTyp Transfer Item Type
     * @param trRcvMethTyp Set at client side
     * @param editCnt editCnt
     * @param screenId Screen ID
     * @return Ws3506TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException application Error
     */
    public Ws3506TransactFacadeServiceResultDomain updateTransferStatusByCarryIn(
        String dscId, String trNo, String trItemTyp, String trRcvMethTyp, String editCnt, String screenId) throws AiwsApplicationException {
        
        // Initialize ResultDomain
        Ws3506TransactFacadeServiceResultDomain resultDomain =  new Ws3506TransactFacadeServiceResultDomain();

        try {
            // Create input domain
            Ws3506CriteriaDomain inputDomain = new Ws3506CriteriaDomain();
            inputDomain.setDscId(dscId);
            inputDomain.setTrNo(trNo);
            inputDomain.setTrItemTyp(trItemTyp);
            inputDomain.setTrRcvMethTyp(trRcvMethTyp);
            inputDomain.setEditCnt(editCnt);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else{
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3506TransactFacadeServiceResultDomain)ws3506TransactFacadeService.transact(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3506TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3506TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3506TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }

}
