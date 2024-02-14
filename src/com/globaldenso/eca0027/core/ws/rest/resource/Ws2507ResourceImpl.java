/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WEB_SERVICE_ERR_CREATE_TIMESTAMP_FORMAT;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2507ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2507CriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2507. 
 * <br />ws2507のリソース実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class Ws2507ResourceImpl extends AbstractResourceImpl implements Ws2507Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    protected SearchFacadeService<Ws2507ResultDomain, Ws2507CriteriaDomain> ws2507SearchFacadeService;

    /**
     * constructor.
     */
    public Ws2507ResourceImpl() {

    }

    /**
     * Setter method for ws2507SearchFacadeService.
     *
     * @param ws2507SearchFacadeService Set for ws2507SearchFacadeService
     */
    public void setWs2507SearchFacadeService(
        SearchFacadeService<Ws2507ResultDomain, Ws2507CriteriaDomain> ws2507SearchFacadeService) {
        this.ws2507SearchFacadeService = ws2507SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2507Resource#printCml(String, String, String, String, String, String, String)
     */
    public Ws2507ResultDomain printCml(
        String dscId,
        String compCd, 
        String printerId, 
        String cmlPrintNum,
        String pltzInstrNo,
        String mainMark, 
        String errCreateTimestamp,
        String screenId) throws AiwsApplicationException {

        try {
            // Create of the domain for an input
            // 入力用ドメインの作成
            Ws2507CriteriaDomain inputDomain = createInputDomain(dscId, compCd, printerId, cmlPrintNum, pltzInstrNo, mainMark, errCreateTimestamp);
            if (!CheckUtil.isBlankOrNull(screenId)) {
                inputDomain.setScreenId(screenId);
            } else {
                inputDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
            }

            // Execution of FacadeService
            // FacadeServiceの実行
            return this.ws2507SearchFacadeService.search(inputDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2507ResultDomain.class);
        } 
    }
    
    /**
     * 
     * Create Input domain by parameter of WebService.
     * <br />Webサービスのパラメータから入力用ドメインを作成します。
     * 
     * @param dscId DSC-I<br />DSC-ID
     * @param compCd EIS COMPANY CODE<br />拠点間会社コード
     * @param printerId Printer ID<br />プリンタID
     * @param cmlPrintNum CML print num<br />CML印刷枚数 UT300 ADD
     * @param pltzInstrNo Palletize Instr. No. <br />梱包指示No
     * @param mainMark MAIN MARK<br />メインマーク(複数件)
     * @param errCreateTimestamp date of create of error report<br />エラーレポート作成日時
     * @return Input domain <br /> 入力用ドメイン
     * @throws ValidationException When cannot parse.<br />変換できなかった場合
     */
    protected Ws2507CriteriaDomain createInputDomain(
        String dscId,
        String compCd, 
        String printerId, 
        String cmlPrintNum,
        String pltzInstrNo,
        String mainMark, 
        String errCreateTimestamp
    ) throws ValidationException {

        Ws2507CriteriaDomain inputDomain = new Ws2507CriteriaDomain();
        // DSC-ID
        // DSC-ID
        inputDomain.setDscId(dscId);
        inputDomain.setLoginUserDscId(dscId);
        // COMPANY CODE between bases
        // 拠点間会社コード
        inputDomain.setCompCd(compCd);
        // PRINTER ID
        // プリンタID
        inputDomain.setPrinterId(printerId);
        // CML PRINT NUM
        // CML印刷枚数
        inputDomain.setCmlPrintNum(cmlPrintNum);
        // Palletize Instr. No.
        // 梱包指示No
        inputDomain.setPltzInstrNo(pltzInstrNo);
        // MAIN MARK (two or more affairs)  
        // メインマーク（複数件）
        inputDomain.setMainMark(mainMark);
        if (!CheckUtil.isBlankOrNull(mainMark)) {
            // comma delimiter sequence is changed into a list.
            // カンマ区切り文字列をリストに変換する
            String[] mainMarks = mainMark.split(",");
            inputDomain.setMainMarkList(Arrays.asList(mainMarks));
        }
        // ERROR CREATE TIMESTAMP
        // エラーレポート作成日時
        inputDomain.setErrorReportDt(errCreateTimestamp);
        if (!CheckUtil.isBlankOrNull(errCreateTimestamp)) {
            inputDomain.setErrorReportTs(toTimestamp(errCreateTimestamp));
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
