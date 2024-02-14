/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504ItemListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * <p>
 * The resource implementation class of Ws3504.<BR>
 * Ws3504のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 1 $
 */
public class Ws3504ResourceImpl extends AbstractResourceImpl implements
        Ws3504Resource {

    /**
     * <p>
     * FacadeService object of Ws3504<BR>
     * Ws3504のFacadeServiceオブジェクト
     * </p>
     */
    private TransactFacadeService<ResultDomain, Ws3504CriteriaDomain> ws3504TransactFacadeService;

    /**
     * <p>
     * Default Costractor
     * </p>
     */
    public Ws3504ResourceImpl() {
    }
    
    /**
     * <p>Getter method for ws3504TransactFacadeService.</p>
     *
     * @return the ws3504TransactFacadeService
     */
    public TransactFacadeService<ResultDomain, Ws3504CriteriaDomain> getWs3504TransactFacadeService() {
        return ws3504TransactFacadeService;
    }

    /**
     * <p>Setter method for ws3504TransactFacadeService.</p>
     *
     * @param ws3504TransactFacadeService Set for ws3504TransactFacadeService
     */
    public void setWs3504TransactFacadeService(
        TransactFacadeService<ResultDomain, Ws3504CriteriaDomain> ws3504TransactFacadeService) {
        this.ws3504TransactFacadeService = ws3504TransactFacadeService;
    }

    /**
     * <p>
     * Execute ws3504TransactFacadeService
     * </p>
     * 
     * @param dscId DSC-ID of BHT user
     * @param shipperCd Shipper CD
     * @param carryOutCompCd From W/H company Code
     * @param carryOutWhCd From W/H Code
     * @param carryInCompCd To W/H Company Code
     * @param carryInWhCd To W/H Code
     * @param itemNo Item No
     * @param pkgCd Package Code
     * @param carryOutQty Carry Out Quantity
     * @param carryOutCaseQty Carry Out Case Quantity
     * @param screenId Screen ID
     * @return Ws3504TransactFacadeServiceResultDomain
     * @throws AiwsApplicationException AiwsApplicationException
     */
    public Ws3504TransactFacadeServiceResultDomain createTransferListByItemNo(
        String dscId, String shipperCd, String carryOutCompCd,
        String carryOutWhCd, String carryInCompCd, String carryInWhCd,
        String itemNo, String pkgCd, String carryOutQty, String carryOutCaseQty, String screenId) throws AiwsApplicationException {
            
        
        
        // Initialize ResultDomain
        Ws3504TransactFacadeServiceResultDomain resultDomain = null;

        try {
            // Create input domain
            Ws3504CriteriaDomain inputDomain = new Ws3504CriteriaDomain();
            inputDomain.setDscId(dscId);
            inputDomain.setShipperCd(shipperCd);
            inputDomain.setCarryOutCompCd(carryOutCompCd);
            inputDomain.setCarryOutWhCd(carryOutWhCd);
            inputDomain.setCarryInCompCd(carryInCompCd);
            inputDomain.setCarryInWhCd(carryInWhCd);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else{
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }
            String[] itemNos = csvToArray(itemNo);
            String[] pkgCds = csvToArray(pkgCd);
            String[] carryOutQtys = csvToArray(carryOutQty);
            String[] carryOutCaseQtys = csvToArray(carryOutCaseQty);
            List<Ws3504ItemListDomain> ws3504ItemListDomainList = new ArrayList<Ws3504ItemListDomain>();
            for (int i = 0; i < itemNos.length; i++) {
                String itemNoValue = itemNos[i];
                String pkgCdValue = getAt(pkgCds, i);
                BigDecimal carryOutQtyValue = new BigDecimal(getAt(carryOutQtys, i));
                BigDecimal carryOutCaseQtyValue = new BigDecimal(getAt(carryOutCaseQtys, i));
                Ws3504ItemListDomain ws3504ItemListDomain = new Ws3504ItemListDomain();
                ws3504ItemListDomain.setItemNo(itemNoValue);
                ws3504ItemListDomain.setPkgCd(pkgCdValue);
                ws3504ItemListDomain.setCarryOutQty(carryOutQtyValue);
                ws3504ItemListDomain.setCarryOutCaseQty(carryOutCaseQtyValue);
                ws3504ItemListDomain.setLanguageCd(super.getLanguageCd());
                ws3504ItemListDomainList.add(ws3504ItemListDomain);
            }
            inputDomain.setItemNoList(ws3504ItemListDomainList);
            // Set language Code
            inputDomain.setLanguageCd(super.getLanguageCd());

            // execute FacadeService
            resultDomain = (Ws3504TransactFacadeServiceResultDomain)ws3504TransactFacadeService.transact(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws3504TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws3504TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws3504TransactFacadeServiceResultDomain(WS_RESULT_ERROR, super
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
    /**
     * Returns the string at the specified index
     *
     * @param array the array of strings
     * @param index index of the string to return
     * @return the string  at the specified index in the specified array, null if the index argument is negative or not less than the length of the array
     */
    protected String getAt(String[] array, int index) {

        if (array == null) {
            return null;
        }

        if (index < array.length) {
            return array[index];
        }
        return null;
    }
}
