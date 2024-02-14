/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.util.Arrays;
import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2512ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2512CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2512.
 * <br />ws2512のリソース実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class Ws2512ResourceImpl extends AbstractResourceImpl implements Ws2512Resource  {

    /**
     * Facade service<br />Facadeサービス
     */
    protected SearchFacadeService<Ws2512ResultDomain, Ws2512CriteriaDomain> ws2512SearchFacadeService;

    /**
     * constructor.
     */
    public Ws2512ResourceImpl() {

    }

    /**
     * Getter method for ws2512SearchFacadeService.
     *
     * @return the ws2512SearchFacadeService
     */
    public SearchFacadeService<Ws2512ResultDomain, Ws2512CriteriaDomain> getWs2512SearchFacadeService() {
        return this.ws2512SearchFacadeService;
    }

    /**
     * Setter method for ws2512SearchFacadeService.
     *
     * @param ws2512SearchFacadeService  Set for ws2512SearchFacadeService
     */
    public void setWs2512SearchFacadeService(
        SearchFacadeService<Ws2512ResultDomain, Ws2512CriteriaDomain> ws2512SearchFacadeService) {
        this.ws2512SearchFacadeService = ws2512SearchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2512Resource#printErt(String, String, String, String)
     */
    public Ws2512ResultDomain printErt(
        String compCd, 
        String printerId, 
        String cmlPrintNum,
        String mainMark,
        String screenId
    ) throws AiwsApplicationException {

        Ws2512ResultDomain resultDomain = new Ws2512ResultDomain();

        try {
            // Create of the domain for an input<br />入力用ドメインの作成
            Ws2512CriteriaDomain inputDomain = createInputDomain(compCd, printerId, cmlPrintNum, mainMark);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else {
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }

            // Execution of FacadeService<br />FacadeServiceの実行
            resultDomain = this.ws2512SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws2512ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws2512ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws2512ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
        } 

        return resultDomain;
    }

    /**
     * Create Input domain from parameter of WebService.
     * <br />Webサービスのパラメータから入力用ドメインを作成します。
     *
     * @param compCd EIS COMPANY CD<br />拠点間会社コード
     * @param printerId Printer ID<br />プリンタID
     * @param cmlPrintNum CML print num<br />CML印刷枚数 UT300 ADD
     * @param mainMark MAIN MARK<br />メインマーク(複数件)
     * @return Input domain <br />入力用ドメイン
     */
    protected Ws2512CriteriaDomain createInputDomain(
        String compCd, 
        String printerId, 
        String cmlPrintNum,
        String mainMark
    ) {
        Ws2512CriteriaDomain inputDomain = new Ws2512CriteriaDomain();
        
        // EIS COMPANY CD<br />拠点間会社コード
        inputDomain.setCompCd(compCd);
        // Printer ID<br />プリンタID
        inputDomain.setPrinterId(printerId);
        // CML PRINT NUM<br />CML印刷枚数
        inputDomain.setCmlPrintNum(cmlPrintNum);

        // MAIN MARK<br />メインマーク（複数件）
        inputDomain.setMainMark(mainMark);
        if (!CheckUtil.isBlankOrNull(mainMark)) {
            // comma delimiter sequence is changed into a list.<br />カンマ区切り文字列をリストに変換する
            String[] mainMarks = mainMark.split(",");
            inputDomain.setMainMarkList(Arrays.asList(mainMarks));
        }

        inputDomain.setLanguageCd(getLanguageCd());
        inputDomain.setLocale(new Locale(getLanguageCd()));
        
        return inputDomain;
    }
}
