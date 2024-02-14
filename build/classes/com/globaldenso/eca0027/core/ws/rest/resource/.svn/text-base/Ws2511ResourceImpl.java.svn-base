/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2511ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2511CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2511.
 * <br />ws2511のリソース実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
public class Ws2511ResourceImpl extends AbstractResourceImpl implements Ws2511Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    protected SearchFacadeService<Ws2511ResultDomain, Ws2511CriteriaDomain> ws2511SearchFacadeService;

    /**
     * constructor.
     */
    public Ws2511ResourceImpl() {

    }

    /**
     * Getter method for ws2511SearchFacadeService
     *
     * @return the ws2511SearchFacadeService
     */
    public SearchFacadeService<Ws2511ResultDomain, Ws2511CriteriaDomain> getWs2511SearchFacadeService() {
        return this.ws2511SearchFacadeService;
    }

    /**
     * Setter method for ws2511SearchFacadeService
     *
     * @param ws2511SearchFacadeService It sets to ws2511SearchFacadeService.<br />ws2511SearchFacadeService に設定する
     */
    public void setWs2511SearchFacadeService(
        SearchFacadeService<Ws2511ResultDomain, Ws2511CriteriaDomain> ws2511SearchFacadeService) {
        this.ws2511SearchFacadeService = ws2511SearchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2511Resource#printXtag(String, String, String, String, String)
     */
    public Ws2511ResultDomain printXtag(
        String dscId, 
        String compCd, 
        String printerId, 
        String xmainMark,
        String screenId) throws AiwsApplicationException {

        Ws2511ResultDomain resultDomain = new Ws2511ResultDomain();

        try {
            // Create of the domain for an input
            // 入力用ドメインの作成
            Ws2511CriteriaDomain inputDomain = createInputDomain(dscId, compCd, printerId, xmainMark);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else {
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }

            // Execution of FacadeService
            // FacadeServiceの実行
            resultDomain = this.ws2511SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws2511ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws2511ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws2511ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
        } 
        return resultDomain;
    
    }


    /**
     * 
     * Create Input domain from parameter of WebService.
     * <br />Webサービスのパラメータから入力用ドメインを作成します。
     *
     * @param dscId DSC-ID<br />DSC-ID
     * @param compCd COMPANY CD of Printer location.<br />(プリンタ保有)拠点間会社コード
     * @param printerId Printer ID<br />プリンタID
     * @param xmainMark X-MAIN MARK<br />まとめメインマーク
     * @return Input domain<br />入力用ドメイン
     */
    protected Ws2511CriteriaDomain createInputDomain(
        String dscId, 
        String compCd, 
        String printerId, 
        String xmainMark
    ) {

        Ws2511CriteriaDomain inputDomain = new Ws2511CriteriaDomain();
        // DSC-ID
        inputDomain.setLoginUserDscId(dscId);
        // COMPANY CODE between bases (printer possession)
        // (プリンタ保有)拠点間会社コード
        inputDomain.setCompCd(compCd);
        // PRINTER ID
        // プリンタID
        inputDomain.setPrinterId(printerId);
        // X-TAG
        // まとめメインマーク
        inputDomain.setXmainMark(xmainMark);

        inputDomain.setLanguageCd(getLanguageCd());
        inputDomain.setLocale(new Locale(getLanguageCd()));
        return inputDomain;
    }
    
}
