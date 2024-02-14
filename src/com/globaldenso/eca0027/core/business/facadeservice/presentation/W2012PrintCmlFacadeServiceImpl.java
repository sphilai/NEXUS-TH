/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0046;

import java.io.File;
import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * This is an implement class of the Facade service to PrintCml action of a CML Register screen.
 * <br />CML Register画面のPrintCmlアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id:W2012PrintCmlFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W2012PrintCmlFacadeServiceImpl extends AbstractTransactFacadeService<File, W2012CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2012PrintCmlFacadeServiceImpl() {
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
     * No Action
     * <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2012CriteriaDomain filterDomain(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Check of the Status of a Packaging Instruction (=Pull)
     * - 梱包指示のステータスの確認
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        boolean result = w2009CmlService.validateDatabaseTtPltzInstrPrintCml(criteriaDomain.getPltzInstrNo());
        if (!result) {           
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_0046, null)));
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - PDF
     *   - CML
     *
     * A create of - PDF
     *     - Refer to list definition document_L2003.xls.
     *
     * - PDFの作成
     *   - CML
     *     
     * - PDFの作成
     *   - 帳票定義書_L2003.xls参照
     *   
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);

        return w2009CmlService.printCml(criteria, criteriaDomain.getReportDateFormat());

    }

}
