/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.L1008ReportService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * This is an implement class of the Facade service to PrintCmlForInstr action of action Export Packaging Register screen.
 * <br />梱包指示Register画面のPrintCmlForInstrアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w1008PrintCmlFacadeService
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public class W1008PrintCmlFacadeServiceImpl extends AbstractSearchFacadeService<File, W1008CriteriaDomain> {

    /**
     * L1008Report service
     * 梱包指示サービス
     */
    protected L1008ReportService l1008ReportService;
    
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1008PrintCmlFacadeServiceImpl() {
    }
    
    /**
     * Setter method for l1008ReportService.
     *
     * @param reportService Set for l1008ReportService
     */
    public void setL1008ReportService(L1008ReportService reportService) {
        l1008ReportService = reportService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008CriteriaDomain filterDomain(W1008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
    * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A - select data's existence check, the check of a PALLETIZE INSTRUCTION STATUS
     *       It checks by calling {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(String)}.
     * 
     * - 選択データの存在チェック、梱包指示ステータスのチェック
     *     {@link W2001PltzInstrService#validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(String)}を呼出し、チェックを行う
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

//        String mainMark = criteriaDomain.getMainMark();
//        
//        // existence check, and the check of a PALLETIZE INSTRUCTION STATUS
//        // 存在チェックおよび梱包指示ステータスのチェック
//        String messageId = w2001PltzInstrService.validateDatabaseTtPltzInstrOnRegisterPrintCmlForInstr(mainMark);
//        
//        if (messageId != null) {
//            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", messageId, null));
//            
//            throw new ValidationException(errList);
//        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W1008CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        String reportDateFormat = criteriaDomain.getReportDateFormat();
//        String screenDateFormat = criteriaDomain.getScreenDateFormat();

        if(reportDateFormat == null)
        {
            reportDateFormat = "dd/MM/yyyy";
        }
        // A create of PDF list
        // PDF帳票の作成
        File pdfReport = l1008ReportService.searchCml(criteriaDomain.getExpRequestNo(), criteriaDomain.getMainMark(), reportDateFormat);
        
        // The update of PALLETIZE INSTRUCTION STATUS, and a CML printing day
        // 梱包指示ステータス、CML印刷日の更新
//        criteriaDomain.setPltzInstrStatus(pltzInstr.getPltzInstrStatus());
//        criteriaDomain.setCmlPrintOutDt(DateUtil.formatDate(pltzInstr.getCmlPrintOutDt(), screenDateFormat));
        
        return pdfReport;
    }

}
