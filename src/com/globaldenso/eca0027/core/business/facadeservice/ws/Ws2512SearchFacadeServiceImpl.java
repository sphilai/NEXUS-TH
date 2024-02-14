/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2512;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2512ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2512CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of the Facade service to ECA0027_WS_2512.
 * <br />ECA0027_WS_2512に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2512SearchFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class Ws2512SearchFacadeServiceImpl extends AbstractSearchFacadeService<Ws2512ResultDomain, Ws2512CriteriaDomain> {

    /**
     * WsBhtEisProductService service
     * <br />WsBhtEisProductServiceサービス
     */
    protected WsBhtEisProductService wsBhtEisProductService;
    
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2512SearchFacadeServiceImpl() {
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
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2512CriteriaDomain filterDomain(Ws2512CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       "A screen item definition" is referred to for details.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2512CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        Validator<Ws2512CriteriaDomain> valid 
            = new Validator<Ws2512CriteriaDomain>(criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "compCd",
            "printerId",
            "cmlPrintNum"
        };
        
        valid.isValidateProperties(properties, WS_ID_WS2512);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            errList.addAll(valid.getErrList());
        }

        // Check for Main Mark list
        // メインマークリストのチェック
        if (criteriaDomain.getMainMarkList() == null
            || criteriaDomain.getMainMarkList().isEmpty()) {
            errList.add(new MessageDomain("", NXS_E1_5016, null));
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Ws2512CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2512CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Perform the invoke of the disposal of business affairs Service.
     *
     * A create of - BHT EisProduct condition domain
     *       {@link WsBhtEisProductCriteriaDomain} is created and the contents of {@link WsBhtEisProductCriteriaDomain} are set up.
     * </pre>
     * <pre>
     * 業務処理Serviceの呼び出しを行う。
     * 
     * - BHT EisProduct条件ドメインの作成
     *     {@link WsBhtEisProductCriteriaDomain}を作成し、{@link WsBhtEisProductCriteriaDomain}の内容を設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2512ResultDomain callServices(Ws2512CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteriaDomain, criteriaDomain);
//        wsBhtEisProductCriteriaDomain.setCompCd(criteriaDomain.getCompCd());
//        wsBhtEisProductCriteriaDomain.setPrinterId(criteriaDomain.getPrinterId());
//        wsBhtEisProductCriteriaDomain.setMainMarkList(criteriaDomain.getMainMarkList());
//        wsBhtEisProductCriteriaDomain.setLocale(criteriaDomain.getLocale());
        
        // Setting of the domain for results
        // 結果用ドメインの設定
        Ws2512ResultDomain resultDomain = new Ws2512ResultDomain(WS_RESULT_SUCCESS);
        this.wsBhtEisProductService.searchOnPrintErt(wsBhtEisProductCriteriaDomain);

        return resultDomain;
    }

    
}
