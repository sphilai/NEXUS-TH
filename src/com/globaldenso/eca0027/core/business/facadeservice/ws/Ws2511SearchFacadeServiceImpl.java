/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2511;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2511ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2511CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to ECA0027_WS_2511.
 * <br />ECA0027_WS_2511に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2511SearchFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7244 $
 */
public class Ws2511SearchFacadeServiceImpl extends AbstractSearchFacadeService<Ws2511ResultDomain, Ws2511CriteriaDomain> {

    /**
     * WsBhtEisProductService service
     * <br />WsBhtEisProductServiceサービス
     */
    protected WsBhtEisProductService wsBhtEisProductService;
    
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2511SearchFacadeServiceImpl() {
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
    protected Ws2511CriteriaDomain filterDomain(Ws2511CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     * <br />- 共通エラーチェック
     *     "A screen item definition" is referred to for details.
     *     <br />詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2511CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<Ws2511CriteriaDomain> valid 
            = new Validator<Ws2511CriteriaDomain>(criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "compCd",
            "printerId",
            "xmainMark"
        };
        
        valid.isValidateProperties(properties, WS_ID_WS2511);

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
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Ws2511CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Existing check for user info
     * - ユーザ情報存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2511CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Existing check for user info
        // ユーザ情報存在チェック
        if (!wsBhtEisProductService.validateDatabaseVmUserInfo(criteriaDomain.getLoginUserDscId())) {
            Object[] params = {criteriaDomain.getLoginUserDscId()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5031, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
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
     *     {@link WsBhtEisProductCriteriaDomain} is created and the contents of {@link WsBhtEisProductCriteriaDomain} are set up.
     *     <br />{@link WsBhtEisProductCriteriaDomain}を作成し、{@link WsBhtEisProductCriteriaDomain}の内容を設定
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2511ResultDomain callServices(Ws2511CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteriaDomain = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteriaDomain, criteriaDomain);
        
        // Setting of the domain for results
        // 結果用ドメインの設定
        Ws2511ResultDomain resultDomain = new Ws2511ResultDomain(WS_RESULT_SUCCESS);
        this.wsBhtEisProductService.searchOnPrintXtag(wsBhtEisProductCriteriaDomain);
        
        return resultDomain;
    }

}
