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
import com.globaldenso.eca0027.core.business.domain.Ws3505TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3505CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <p>
 * The resource implementation class of Ws3505.<BR>
 * Ws3505のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3505ResourceImpl extends AbstractResourceImpl implements
        Ws3505Resource {

    /**
     * <p>
     * FacadeService object of Ws3505<BR>
     * Ws3505のFacadeServiceオブジェクト
     * </p>
     */
    private TransactFacadeService<Ws3505TransactFacadeServiceResultDomain, Ws3505CriteriaDomain> ws3505TransactFacadeService;

    /**
     * <p>
     * Default Constructor
     * </p>
     */
    public Ws3505ResourceImpl() {
    }
    
    /**
     * <p>Getter method for ws3505TransactFacadeService.</p>
     *
     * @return the ws3505TransactFacadeService
     */
    public TransactFacadeService<Ws3505TransactFacadeServiceResultDomain, Ws3505CriteriaDomain> getWs3505TransactFacadeService() {
        return ws3505TransactFacadeService;
    }

    /**
     * <p>Setter method for ws3505TransactFacadeService.</p>
     *
     * @param ws3505TransactFacadeService Set for ws3505TransactFacadeService
     */
    public void setWs3505TransactFacadeService(
        TransactFacadeService<Ws3505TransactFacadeServiceResultDomain, Ws3505CriteriaDomain> ws3505TransactFacadeService) {
        this.ws3505TransactFacadeService = ws3505TransactFacadeService;
    }

    /**
     * <p>
     * Execute ws3505TransactFacadeService
     * </p>
     * 
     * @param dscId DSC-ID
     * @param trNo Transfer No
     * @param editCnt Edit_Count
     * @param screenId Screen ID
     * @return Ws3505TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException application Error
     */
    public Ws3505TransactFacadeServiceResultDomain updateTrStatusActivate(String dscId, String trNo,
        String editCnt, String screenId) throws AiwsApplicationException {
        
        // Initialize ResultDomain
        Ws3505TransactFacadeServiceResultDomain resultDomain = null;

        try {
            // Create input domain
            Ws3505CriteriaDomain inputDomain = new Ws3505CriteriaDomain();
            inputDomain.setDscId(dscId);
            inputDomain.setTrNo(trNo);
            inputDomain.setEditCnt(editCnt);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else{
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3505TransactFacadeServiceResultDomain)ws3505TransactFacadeService.transact(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3505TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3505TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3505TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }

}
