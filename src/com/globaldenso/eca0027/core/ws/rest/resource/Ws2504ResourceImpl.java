/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2504ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504PkgItemNoCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2504
 * <br />ws2504のリソース実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class Ws2504ResourceImpl extends AbstractResourceImpl implements Ws2504Resource {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private CreateFacadeService<Ws2504ResultDomain, Ws2504CriteriaDomain> ws2504CreateFacadeService;

    /**
     * constructor.
     */
    public Ws2504ResourceImpl() {

    }

    /**
     * Setter method for ws2504CreateFacadeService.
     *
     * @param ws2504CreateFacadeService Set for ws2504CreateFacadeService
     */
    public void setWs2504CreateFacadeService(
        CreateFacadeService<Ws2504ResultDomain, Ws2504CriteriaDomain> ws2504CreateFacadeService) {
        this.ws2504CreateFacadeService = ws2504CreateFacadeService;
    }

    /**
     * 
     * {@inheritDoc}.
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2504Resource#createErtPltz(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2504ResultDomain createErtPltz(
        String dscId, 
        String languageCd,
        String shipperCd,
        String shipToCd,
        String loadingCd,
        String trnsCd,
        String payTerms,
        String plntCd,
        String whCompCd,
        String whCd,
        String priceTerms,
        String returnStyleCd,
        String pkgTyp,
        String cmlCreateQty,
        String weightUnit,
        String grossWeight,
        String lengthUnit,
        String length,
        String width,
        String height,
        String volumeUnit,
        String volume,
        String pkgItemNo,
        String pkgItemQty,
        String screenId
    ) {

        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2504CriteriaDomain criteriaDomain = new Ws2504CriteriaDomain();
        criteriaDomain.setLoginUserDscId(dscId);
        criteriaDomain.setLanguageCd(languageCd);
        criteriaDomain.setLocale(new Locale(getLanguageCd()));
        if (!CheckUtil.isBlankOrNull(screenId)) {
            criteriaDomain.setScreenId(screenId);
        } else {
            criteriaDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
        }
        
        criteriaDomain.setShipperCd(shipperCd);
        criteriaDomain.setShipToCd(shipToCd);
        criteriaDomain.setLoadingCd(loadingCd);
        criteriaDomain.setTrnsCd(trnsCd);
        criteriaDomain.setPayTerms(payTerms);
        criteriaDomain.setPlntCd(plntCd);
        criteriaDomain.setWhCompCd(whCompCd);
        criteriaDomain.setLgcyWhCd(whCd);
        criteriaDomain.setPriceTerms(priceTerms);
        criteriaDomain.setReturnStyleCd(returnStyleCd);
        criteriaDomain.setPkgTyp(pkgTyp);
        criteriaDomain.setCmlQty(cmlCreateQty);
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setGrossWeight(grossWeight);
        criteriaDomain.setLengthUnit(lengthUnit);
        criteriaDomain.setLength(length);
        criteriaDomain.setWidth(width);
        criteriaDomain.setHeight(height);
        criteriaDomain.setVolumeUnit(volumeUnit);
        criteriaDomain.setVolume(volume);

        String[] pkgItemNos = csvToArray(pkgItemNo);
        String[] pkgItemQtys = csvToArray(pkgItemQty);
        
        List<Ws2504PkgItemNoCriteriaDomain> pkgItemNoCriteriaList = new ArrayList<Ws2504PkgItemNoCriteriaDomain>();
        for (int i = 0; i < pkgItemNos.length; i++) {
            Ws2504PkgItemNoCriteriaDomain criteria = new Ws2504PkgItemNoCriteriaDomain();
            criteria.setPkgItemNo(pkgItemNos[i]);
            criteria.setPkgQty(getAt(pkgItemQtys, i));
            pkgItemNoCriteriaList.add(criteria);
        }
        criteriaDomain.setPkgItemNoCriteriaList(pkgItemNoCriteriaList);
        
        // Generation of Result Domain
        // Result Domainの生成
        Ws2504ResultDomain resultDomain = new Ws2504ResultDomain();
        
        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            resultDomain = this.ws2504CreateFacadeService.create(criteriaDomain);
            if (resultDomain.getResultCode() == null) {
                // When the error definition is not carried out by Facade, it processes as a normal end.
                // Facadeでエラー定義がされていない場合は正常終了として処理
                resultDomain.setResultCode(WS_RESULT_SUCCESS);
                resultDomain.setErrorList(new ArrayList<ErrorListItemDomain>());
            }
            
        } catch (ValidationException e) {
            resultDomain = new Ws2504ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws2504ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws2504ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
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
