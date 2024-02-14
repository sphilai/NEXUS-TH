/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0046;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;

import java.io.File;
import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to PrintCml service of a CML Trans Revise screen.
 * <br />
 * CML Trans Revise画面のPrintCmlサービスに対するFacadeサービスの実装クラスです。
 * 
 * <pre>
 * bean id : w2019PrintCmlFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2019PrintCmlFacadeServiceImpl extends
    AbstractTransactFacadeService<File, W2019CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * constructor.
     */
    public W2019PrintCmlFacadeServiceImpl() {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2019CriteriaDomain filterDomain(
        W2019CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * Setter method for w2009CmlService.
     * 
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - unary eye check implementation
     * 
     * -単項目チェック実施
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W2019CriteriaDomain> valid = new Validator<W2019CriteriaDomain>(
            criteriaDomain, "criteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {"reviseFlg"};

        valid.isValidateProperties(properties, SCREEN_ID_W2019);

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
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - The check of PALLETIZE INSTRUCTION STATUS
     *       Palletize
     *       Packaging Instruction (=Pull)
     * 
     * - 梱包指示ステータスの確認
     *     パレタイズ
     *     梱包指示
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        boolean result = w2009CmlService.validateDatabaseTtPltzInstrOnTransRevisePrintCml(criteriaDomain.getMainMark());
        if (!result) {
            throw new ValidationException(Arrays.asList(new MessageDomain(null, NXS_E1_0046, null)));
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * - A create of PDF
     *     - Taking over VALUE
     *       - CML No.     [7] : CML No.
     *
     * - A create of PDF
     *     - Refer to list definition document_L2003.xls.
     * 
     * - PDFの作成
     *   - 引継値
     *     - CML No.   【7】:CML No.
     *     
     * - PDFの作成
     *   - 帳票定義書_L2003.xls参照
     *   
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);

        return w2009CmlService.printCml(criteria, criteriaDomain
            .getReportDateFormat());

    }

}
