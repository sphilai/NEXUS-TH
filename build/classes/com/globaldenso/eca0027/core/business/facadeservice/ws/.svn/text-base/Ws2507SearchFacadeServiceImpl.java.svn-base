/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2507;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2507ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2507CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to ECA0027_WS_2507.
 * <br />ECA0027_WS_2507に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2507SearchFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class Ws2507SearchFacadeServiceImpl extends AbstractSearchFacadeService<Ws2507ResultDomain, Ws2507CriteriaDomain>  {

    /**
     * WsBhtEisProductService service
     * <br />WsBhtEisProductServiceサービス
     */
    protected WsBhtEisProductService wsBhtEisProductService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2507SearchFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2507CriteriaDomain filterDomain(Ws2507CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     * <br />- 共通エラーチェック
     *       "A screen item definition" is referred to for details.
     *       <br />詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2507CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<Ws2507CriteriaDomain> valid 
            = new Validator<Ws2507CriteriaDomain>(criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "compCd",
            "printerId"
        };
        valid.isValidateProperties(properties, WS_ID_WS2507);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - related check<br />
     * - 相関チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Ws2507CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // the check of Palletize Instr. No., MAIN-MARK list and ERROR-CREATE-TIMESTAMP setting pattern
        // 梱包指示No、メインマークリスト、エラーレポート作成日時設定パターンのチェック
        if (
            CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {

            // pattern 1 Palletize Instr. No. x MAIN-MARK list x ERROR-CREATE-TIMESTAMP x
            // パターン1 梱包指示No× メインマークリスト× エラーレポート作成日時×
            // => checked result NG
            // => チェック結果NG
            errList.add(new MessageDomain("", NXS_E1_5016, null));

        } else if (
            !CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {

            // pattern 2 Palletize Instr. No. O MAIN-MARK list x ERROR-CREATE-TIMESTAMP x
            // パターン2 梱包指示No○ メインマークリスト× エラーレポート作成日時×
            // => checked result NG
            // => チェック結果NG
            errList.add(new MessageDomain("", NXS_E1_5016, null));

        } else if (
            CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 3 Palletize Instr. No. x MAIN-MARK list O ERROR-CREATE-TIMESTAMP x
            // パターン3 梱包指示No× メインマークリスト○ エラーレポート作成日時×
            // => checked result OK CML is printed.
            // => チェック結果OK CMLを印刷する
            criteriaDomain.setCmlPrintFlg(FLAG_Y);
            criteriaDomain.setErrorReportFlg("");

        } else if (
            CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 4 Palletize Instr. No. x MAIN-MARK list x ERROR-CREATE-TIMESTAMP O
            // パターン4 梱包指示No× メインマークリスト× エラーレポート作成日時○
            // => checked result OK error report is printed.
            // => チェック結果OK エラーレポートを印刷する
            criteriaDomain.setCmlPrintFlg("");
            criteriaDomain.setErrorReportFlg(FLAG_Y);

        } else if (
            !CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 5 Palletize Instr. No. O MAIN-MARK list O ERROR-CREATE-TIMESTAMP x
            // パターン5 梱包指示No○ メインマークリスト○ エラーレポート作成日時×
            // => checked result OK CML is printed.
            // => チェック結果OK CMLを印刷する
            criteriaDomain.setCmlPrintFlg(FLAG_Y);
            criteriaDomain.setErrorReportFlg("");

        } else if (
            !CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 6 Palletize Instr. No. O MAIN-MARK list x ERROR-CREATE-TIMESTAMP O
            // パターン6 梱包指示No○ メインマークリスト× エラーレポート作成日時○
            // => checked result OK error report is printed.
            // => チェック結果OK エラーレポートを印刷する
            criteriaDomain.setCmlPrintFlg("");
            criteriaDomain.setErrorReportFlg(FLAG_Y);

        } else if (
            CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 7 Palletize Instr. No. x MAIN-MARK list O ERROR-CREATE-TIMESTAMP O
            // パターン7 梱包指示No× メインマークリスト○ エラーレポート作成日時○
            // => checked result OK CML and an error report are printed.
            // => チェック結果OK CML、エラーレポートを印刷する
            criteriaDomain.setCmlPrintFlg(FLAG_Y);
            criteriaDomain.setErrorReportFlg(FLAG_Y);

        } else if (
            !CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getMainMark())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())
        ) {
            // pattern 8 Palletize Instr. No. O MAIN-MARK list O ERROR-CREATE-TIMESTAMP O
            // パターン8 梱包指示No○ メインマークリスト○ エラーレポート作成日時○
            // => checked result OK error report is printed.
            // => チェック結果OK エラーレポートを印刷する
            criteriaDomain.setCmlPrintFlg("");
            criteriaDomain.setErrorReportFlg(FLAG_Y);

        }

        // UT300 ADD START
        // Although there are CML print instruction, if the cmlPrintNum is not set
        // CML印刷指示があるが、印刷部数が設定されていない場合
        if (FLAG_Y.equals(criteriaDomain.getCmlPrintFlg()) && CheckUtil.isBlankOrNull(criteriaDomain.getCmlPrintNum())) {
            errList.add(new MessageDomain("", NXS_E1_5016, null));
        }
        // UT300 ADD END

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2507CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Perform the invoke of the disposal of business affairs Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * A create of - BHT EisProduct condition domain
     * <br />- BHT EisProduct条件ドメインの作成
     *       {@link WsBhtEisProductCriteriaDomain} is created and the contents of {@link WsBhtEisProductCriteriaDomain} are set up.
     *       <br />{@link WsBhtEisProductCriteriaDomain}を作成し、{@link WsBhtEisProductCriteriaDomain}の内容を設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2507ResultDomain callServices(Ws2507CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteriaDomain, criteriaDomain);
        
        // Setting of the domain for results
        // 結果用ドメインの設定
        Ws2507ResultDomain resultDomain = new Ws2507ResultDomain(WS_RESULT_SUCCESS);
        this.wsBhtEisProductService.transactOnPrintCml(wsBhtEisProductCriteriaDomain);

        return resultDomain;
    }

}
