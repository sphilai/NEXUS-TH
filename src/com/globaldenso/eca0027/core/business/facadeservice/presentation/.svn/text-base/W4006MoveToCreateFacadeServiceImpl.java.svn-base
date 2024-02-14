/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4006;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Move to Create service facade implementation class of Staging Actuality Header screen
 * <br />山作り実績Header画面のMove to Create facadeサービス実装クラスです。
 * <pre>
 * bean id:w4006MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4006MoveToCreateFacadeServiceImpl extends
    AbstractSearchFacadeService<Void, W4006CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4006MoveToCreateFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w4005StgActService.
     *
     * @param stgActService Set for w4005StgActService
     */
    public void setW4005StgActService(W4005StgActService stgActService) {
        w4005StgActService = stgActService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4006CriteriaDomain filterDomain(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4006CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4006CriteriaDomain> valid
            = new Validator<W4006CriteriaDomain>(w4006CriteriaDomain, "w4006CriteriaDomain");

        String[] properties = {
            "whCompCd",             // 3 or 5 digit + required
            "whCd",                 // required
            "trnsCd",               // required
            "containerSortingKey",  // required
            "trnsTypCd",            // required
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4006);

        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - W / H Company, NEXUS W / H combination check
     *     Argument to W / H Company of w4006CriteriaDomain, the NEXUS W / H, and check by calling W4005StgActService.validateDatabaseWhCompanyWh
     *
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    w4006CriteriaDomainのW/H Company、NEXUS W/Hを引数に、W4005StgActService.validateDatabaseWhCompanyWhを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // When a combination W/H Company, of NEXUS W/H is not correct
        // W/H Company、NEXUS W/Hの組み合わせが正しくない場合
        if (!w4005StgActService.validateDatabaseWhCompanyWh(w4006CriteriaDomain.getWhCompCd(), w4006CriteriaDomain.getWhCd())) {
            Object[] params = {
                commonService.getResource(w4006CriteriaDomain.getLocale(), "label.whCompCd"),
                commonService.getResource(w4006CriteriaDomain.getLocale(), "label.whCd")
            };
            messageDomainList.add(new MessageDomain("w4006CriteriaDomain.whCompCd", GSCM_E0_0029, params));
            messageDomainList.add(new MessageDomain("w4006CriteriaDomain.whCd", null, null));
        }

        // When a combination Trans., of Trans. Type is not correct
        // Trans.、Trans. Typeの組み合わせが正しくない場合
        if (
            !w4005StgActService.validateDatabaseTmTrnsTyp(w4006CriteriaDomain.getTrnsCd(),
                w4006CriteriaDomain.getTrnsTypCd())
        )
        {
            Object[] params = {
                commonService.getResource(w4006CriteriaDomain.getLocale(), "label.trnsCd"),
                commonService.getResource(w4006CriteriaDomain.getLocale(), "label.trnsTypCd")
            };
            messageDomainList.add(new MessageDomain("w4006CriteriaDomain.trnsCd", GSCM_E0_0029, params));
            messageDomainList.add(new MessageDomain("w4006CriteriaDomain.trnsTypCd", null, null));
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}