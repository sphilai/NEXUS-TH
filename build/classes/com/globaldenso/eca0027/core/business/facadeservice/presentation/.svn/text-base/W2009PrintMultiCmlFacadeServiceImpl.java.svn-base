/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0046;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * This is an implement class of the Facade service to PrintMultiCml action of a CML Main Screen.
 * <br />CML Main Screen画面のPrintMultiCmlアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id:W2012PrintMultiCmlFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12605 $
 */
public class W2009PrintMultiCmlFacadeServiceImpl extends AbstractTransactFacadeService<File, W2009CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2009PrintMultiCmlFacadeServiceImpl() {
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
    protected W2009CriteriaDomain filterDomain(W2009CriteriaDomain criteriaDomain)
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
    protected void validateItems(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
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
    protected void validateConsistency(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
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
    protected void validateDatabase(W2009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<? extends W2009ListDomain> listDomainList = criteriaDomain.getListDomainList();
        if (listDomainList != null) {
            for (W2009ListDomain listDomain : listDomainList) {
                if (StringUtils.isNotEmpty(listDomain.getPltzInstrNo())) {
                    if (!w2009CmlService.validateDatabaseTtPltzInstrPrintCml(listDomain.getPltzInstrNo())) {           
                        throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_0046, null)));
                    }
                }
            }
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
    protected File callServices(W2009CriteriaDomain w2009CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W2009CmlCriteriaDomain cmlCriteriaDomain = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteriaDomain, w2009CriteriaDomain);
        List<? extends W2009ListDomain> listDomainList = w2009CriteriaDomain.getListDomainList();
        List<String> mainMarkList = new ArrayList<String>();
        if (listDomainList != null) {
            for (W2009ListDomain listDomain : listDomainList) {
                mainMarkList.add(listDomain.getMainMark());
            }
        }
        cmlCriteriaDomain.setMainMarkList(mainMarkList);

        // Call multi CML print service
        // 複数CML印刷サービス呼び出し
        return w2009CmlService.printMultiCml(cmlCriteriaDomain, w2009CriteriaDomain.getReportDateFormat());
    }

}
