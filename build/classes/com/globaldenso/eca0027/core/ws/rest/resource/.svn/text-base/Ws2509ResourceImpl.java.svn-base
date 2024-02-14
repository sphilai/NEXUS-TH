/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WEB_SERVICE_ERR_CREATE_TIMESTAMP_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2509ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2509CriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;


/**
 * Resource implementation class for the ws2509.
 * <br />ws2509のリソース実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7244 $
 */
public class Ws2509ResourceImpl extends AbstractResourceImpl implements Ws2509Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    protected SearchFacadeService<Ws2509ResultDomain, Ws2509CriteriaDomain> ws2509SearchFacadeService;

    /**
     * constructor.
     */
    public Ws2509ResourceImpl() {

    }

    /**
     * Getter method for ws2509SearchFacadeService.
     *
     * @return the ws2509SearchFacadeService
     */
    public SearchFacadeService<Ws2509ResultDomain, Ws2509CriteriaDomain> getWs2509SearchFacadeService() {
        return this.ws2509SearchFacadeService;
    }

    /**
     * Setter method for ws2509SearchFacadeService.
     *
     * @param ws2509SearchFacadeService  Set for ws2509SearchFacadeService
     */
    public void setWs2509SearchFacadeService(
        SearchFacadeService<Ws2509ResultDomain, Ws2509CriteriaDomain> ws2509SearchFacadeService) {
        this.ws2509SearchFacadeService = ws2509SearchFacadeService;
    }


    /**
     * 
     * {@inheritDoc}.
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2509Resource#printMixTag(String, String, String, String, String, String)
     */
    public Ws2509ResultDomain printMixTag(
        String dscId, 
        String compCd, 
        String printerId, 
        String mixTag,
        String errorReportDt,
        String screenId) throws AiwsApplicationException {

        Ws2509ResultDomain resultDomain = new Ws2509ResultDomain();

        try {
            // Create of the domain for an input
            // 入力用ドメインの作成
            Ws2509CriteriaDomain inputDomain = createInputDomain(dscId, compCd, printerId, mixTag, errorReportDt);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else {
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }

            // Execution of FacadeService
            // FacadeServiceの実行
            resultDomain = this.ws2509SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws2509ResultDomain(WS_RESULT_ERROR, getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws2509ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws2509ResultDomain(WS_RESULT_ERROR_SYSTEM, getErrorList(e.getCode()));
        } 
        
        return resultDomain;
    }

    /**
     * 
     * Create Input domain from parameter of WebService
     * <br />Webサービスのパラメータから入力用ドメインを作成します。
     *
     * @param dscId DSC-ID
     * @param compCd COMPANY CD of Printer location. <br />プリンタ保有会社コード
     * @param printerId Printer ID <br />プリンタID
     * @param mixTag MIX-TAG <br />MIXタグ
     * @param errorReportDt date of create of error report<br />エラーレポート作成日時
     * @return Input domain<br />入力用ドメイン
     * @throws ValidationException When cannot parse.<br />変換できなかった場合
     */
    protected Ws2509CriteriaDomain createInputDomain(
        String dscId, 
        String compCd, 
        String printerId, 
        String mixTag,
        String errorReportDt
    ) throws ValidationException {
        Ws2509CriteriaDomain inputDomain = new Ws2509CriteriaDomain();
        // DSC-ID
        inputDomain.setLoginUserDscId(dscId);
        // COMPANY CODE between bases
        // 拠点間会社コード
        inputDomain.setCompCd(compCd);
        // PRINTER ID
        // プリンタID
        inputDomain.setPrinterId(printerId);
        // MIX tag
        // MIXタグ
        inputDomain.setMixTag(mixTag);
        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        inputDomain.setErrorReportDt(errorReportDt);
        if (!CheckUtil.isBlankOrNull(errorReportDt)) {
            inputDomain.setErrorReportTs(toTimestamp(errorReportDt));
        }
        
        inputDomain.setLanguageCd(getLanguageCd());
        inputDomain.setLocale(new Locale(getLanguageCd()));
        
        return inputDomain;
    }
    
    /**
     * 
     * Convert String to Timestamp.
     * <br />Timestampに変換する。
     *
     * @param src Source string<br />文字列
     * @return Timestamp
     * @throws ValidationException When cannot convert.<br />変換できなかった場合
     */
    protected Timestamp toTimestamp(String src) throws ValidationException {

        if (CheckUtil.isBlankOrNull(src)) {
            return null;
        }
        
        try {
            src = StringUtils.substring(src + "000", 0, 23);
            String[] patterns = {WEB_SERVICE_ERR_CREATE_TIMESTAMP_FORMAT};
            return new Timestamp(DateUtils.parseDate(src, patterns).getTime());
        } catch (Exception e) {
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
            errorList.add(new MessageDomain("", NXS_E1_5016, null));
            throw new ValidationException(errorList);
        }
    }
    
}
