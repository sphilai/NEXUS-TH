/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3503TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3503CmlListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3503CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <p>
 * The resource implementation class of Ws3503.<BR>
 * Ws3503のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3503ResourceImpl extends AbstractResourceImpl implements
        Ws3503Resource {

    /**
     * <p>
     * FacadeService object of Ws3503<BR>
     * Ws3503のFacadeServiceオブジェクト
     * </p>
     */
    private TransactFacadeService<ResultDomain, Ws3503CriteriaDomain> ws3503TransactFacadeService;

    /**
     * <p>
     * Default Costractor
     * </p>
     */
    public Ws3503ResourceImpl() {
    }
    
    /**
     * <p>Getter method for ws3503TransactFacadeService.</p>
     *
     * @return the ws3503TransactFacadeService
     */
    public TransactFacadeService<ResultDomain, Ws3503CriteriaDomain> getWs3503TransactFacadeService() {
        return ws3503TransactFacadeService;
    }

    /**
     * <p>Setter method for ws3503TransactFacadeService.</p>
     *
     * @param ws3503TransactFacadeService Set for ws3503TransactFacadeService
     */
    public void setWs3503TransactFacadeService(
        TransactFacadeService<ResultDomain, Ws3503CriteriaDomain> ws3503TransactFacadeService) {
        this.ws3503TransactFacadeService = ws3503TransactFacadeService;
    }

    /**
     * 
     * <p>Execute ws3503TransactFacadeService</p>
     *
     * @param dscId DSC-ID
     * @param carryOutCompCd Fr) W/H Com CD
     * @param carryOutWhCd Fr) W/H CD
     * @param carryInCompCd To) W/H Com CD
     * @param carryInWhCd To) W/H CD
     * @param shipperCd Shipper CD
     * @param mainMark List of CML
     * @param screenId Screen ID
     * @return Ws3503TransactFacadeServiceResultDomain Ws3503TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException AiwsApplicationException
     */
    public Ws3503TransactFacadeServiceResultDomain createTransferListByCaseMark(
        String dscId, String carryOutCompCd, String carryOutWhCd,
        String carryInCompCd, String carryInWhCd, String shipperCd,
        String mainMark, String screenId) throws AiwsApplicationException {
        
        // Initialize ResultDomain
        Ws3503TransactFacadeServiceResultDomain resultDomain = new Ws3503TransactFacadeServiceResultDomain();

        try {
            // Create input domain
            Ws3503CriteriaDomain inputDomain = new Ws3503CriteriaDomain();
            inputDomain.setDscId(dscId);
            inputDomain.setCarryOutCompCd(carryOutCompCd);
            inputDomain.setCarryOutWhCd(carryOutWhCd);
            inputDomain.setCarryInCompCd(carryInCompCd);
            inputDomain.setCarryInWhCd(carryInWhCd);
            inputDomain.setShipperCd(shipperCd);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else{
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }
            String[] mainMarks = csvToArray(mainMark);
            List<Ws3503CmlListDomain> ws3503CmlDomainList = new ArrayList<Ws3503CmlListDomain>();
            for (int i = 0; i < mainMarks.length; i++) {
                String mainMarkElement = mainMarks[i];
                Ws3503CmlListDomain ws3503CmlDomain = new Ws3503CmlListDomain();
                ws3503CmlDomain.setMainMark(mainMarkElement);
                ws3503CmlDomain.setLanguageCd(super.getLanguageCd());
                ws3503CmlDomainList.add(ws3503CmlDomain);
            }
            inputDomain.setCml(ws3503CmlDomainList);
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3503TransactFacadeServiceResultDomain)ws3503TransactFacadeService.transact(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3503TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3503TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3503TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }
    /**
     * CSV String to String array
     * <br />カンマ区切りの文字列を文字列配列に変換する。
     * 
     * <pre>
     * Split the argument by "," and return the string array. (If the argument is null, replace it to empty string before split.)
     * 文字列をカンマで区切って配列にして返す。(引数がnullの場合は、空文字に置換えてから処理する。)
     * </pre>
     * 
     * @param csvSring CSV string<br />カンマ区切りの文字列
     * @return string array<br />文字列の配列
     */
    protected String[] csvToArray(String csvSring) {
        if (csvSring == null) {
            csvSring = "";
        }
        String[] result = csvSring.split(",", -1);
        return result;
    }
}
