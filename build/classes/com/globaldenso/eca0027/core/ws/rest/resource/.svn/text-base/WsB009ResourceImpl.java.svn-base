/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsB009CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Resource implementation interface for the wsB009.
 * <br />WsB009のリソースの実装インターフェースです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB009ResourceImpl extends AbstractResourceImpl implements WsB009Resource {

    /**
     * Facadeサービス
     */
    protected CreateFacadeService<ResultDomain, WsB009CriteriaDomain> wsB009FacadeService;

    /**
     * constructor.
     */
    public WsB009ResourceImpl() {
        super();
    }

    /**
     * Getter method for wsB009FacadeService.
     *
     * @return the wsB009FacadeService
     */
    public CreateFacadeService<ResultDomain, WsB009CriteriaDomain> getWsB009FacadeService() {
        return wsB009FacadeService;
    }

    /**
     * Setter method for wsB009FacadeService.
     *
     * @param wsB009FacadeService Set for wsB009FacadeService
     */
    public void setWsB009FacadeService(CreateFacadeService<ResultDomain, WsB009CriteriaDomain> wsB009FacadeService) {
        this.wsB009FacadeService = wsB009FacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * Execute JOB of EDI Customer Order Register.
     * <br />EDI受注登録ジョブを呼び出します。
     *
     * @param lib EIS COMPANY CD<br />拠点間会社コード
     * @param receivingCompanyCode Receiving Company Code<br />受注会社の拠点間会社コード
     * @param cigmaAds CIGMA ADS<br />CIGMA業務日付
     * @param callerJobId source job id<br />呼び出し元ジョブID
     * @return Result domain <br />結果用ドメイン
     * @throws AiwsApplicationException Error <br />処理に失敗した場合
     */
    public ResultDomain callEdiOdrEntryJob(String lib, String receivingCompanyCode, String cigmaAds, String callerJobId) 
        throws AiwsApplicationException {

        ResultDomain resultDomain = null;

        try {

            WsB009CriteriaDomain inputDomain = createInputDomain(lib, receivingCompanyCode, cigmaAds, callerJobId);


            resultDomain = wsB009FacadeService.create(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
        } 
        return resultDomain;
    }

    /**
     * Create Input domain from parameter of WebService.
     * <br />Webサービスのパラメータから入力用ドメインを作成します。
     *
     * @param lib EIS COMPANY CD<br />拠点間会社コード
     * @param receivingCompanyCode Printer ID<br />プリンタID
     * @param cigmaAds MAIN MARK<br />メインマーク(複数件)
     * @param callerJobId source job id<br />呼び出し元ジョブID
     * @return Input domain<br />入力用ドメイン
     */
    protected WsB009CriteriaDomain createInputDomain(String lib, String receivingCompanyCode, String cigmaAds, String callerJobId) {
        WsB009CriteriaDomain inputDomain = new WsB009CriteriaDomain();

        inputDomain.setLanguageCd(getLanguageCd());
        inputDomain.setLocale(new Locale(getLanguageCd()));
        inputDomain.setReceivingCompanyCode(receivingCompanyCode);
        inputDomain.setAds(cigmaAds);
        inputDomain.setCallerJobId(callerJobId);
        inputDomain.setLib(lib);
        
        return inputDomain;
    }
}
