/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2509;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2509ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2509CriteriaDomain;
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
 * This is an implement class of the Facade service to ECA0027_WS_2509.
 * <br />ECA0027_WS_2509に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2509SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class Ws2509SearchFacadeServiceImpl extends AbstractSearchFacadeService<Ws2509ResultDomain, Ws2509CriteriaDomain>  {

    /**
     * WsBhtEisProductService service
     * <br />WsBhtEisProductServiceサービス
     */
    protected WsBhtEisProductService wsBhtEisProductService;
    
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2509SearchFacadeServiceImpl() {
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
    protected Ws2509CriteriaDomain filterDomain(Ws2509CriteriaDomain criteriaDomain)
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
    protected void validateItems(Ws2509CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<Ws2509CriteriaDomain> valid 
            = new Validator<Ws2509CriteriaDomain>(criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "compCd",
            "printerId"
        };
        valid.isValidateProperties(properties, WS_ID_WS2509);
        
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
     * The check of a Mix tag and an error report output flag setting pattern
     * <br />Mixタグ、エラーレポート出力フラグ設定パターンのチェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Ws2509CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // The check of a Mix tag and an error report output flag setting pattern
        // Mixタグ、エラーレポート出力フラグ設定パターンのチェック
        if (CheckUtil.isBlankOrNull(criteriaDomain.getMixTag())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())) {
            // Pattern 1 MIX tag x ERROR-CREATE-TIMESTAMP x
            // パターン1 MIXタグ× エラーレポート作成日時×
            // => checked result NG printing object does not exist, this is NG.
            // => チェック結果NG 印刷対象が存在しないためNG
            errorList.add(new MessageDomain("", NXS_E1_5016, null));
            throw new ValidationException(errorList);
            
        } else if (CheckUtil.isBlankOrNull(criteriaDomain.getMixTag())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())) {
            // Pattern 2 MIX tag x ERROR-CREATE-TIMESTAMP O
            // パターン2 MIXタグ× エラーレポート作成日時○
            // => checked result OK error report is printed.
            // = >チェック結果OK エラーレポートを印刷する
            criteriaDomain.setPrintMixTagFlg("");
            criteriaDomain.setErrorReportFlg("Y");
            
        } else if (!CheckUtil.isBlankOrNull(criteriaDomain.getMixTag())
                && CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())) {
            // Pattern 3 MIX tag O ERROR-CREATE-TIMESTAMP x
            // パターン3 MIXタグ○ エラーレポート作成日時×
            // => checked result OK Mix tag is printed.
            // => チェック結果OK Mixタグを印刷する
            criteriaDomain.setPrintMixTagFlg("Y");
            criteriaDomain.setErrorReportFlg("");
            
        } else if (!CheckUtil.isBlankOrNull(criteriaDomain.getMixTag())
                && !CheckUtil.isBlankOrNull(criteriaDomain.getErrorReportDt())) {
            // Pattern 4 MIX tag O ERROR-CREATE-TIMESTAMP O
            // パターン4 MIXタグ○ エラーレポート作成日時○
            // => checked result NG Mix tag is carrying out the employment limit which a continuation PKG business is not made.
            // => チェック結果NG Mixタグは連続梱包業務をさせない運用制限をしている。
            //    therefore, a Mix tag and an error report -- in order that the pattern both outputted may not occur -- NG
            //    そのため、Mixタグ、エラーレポート両方出力するパターンは起きないためNG
            errorList.add(new MessageDomain("", NXS_E1_5016, null));
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2509CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

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
     * @param criteriaDomain Conditions<br />条件
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2509ResultDomain callServices(Ws2509CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteriaDomain, criteriaDomain);

        // Setting of the domain for results
        // 結果用ドメインの設定
        Ws2509ResultDomain resultDomain = new Ws2509ResultDomain(WS_RESULT_SUCCESS);
        this.wsBhtEisProductService.searchOnPrintMixTag(wsBhtEisProductCriteriaDomain);
        
        return resultDomain;
    }

}
