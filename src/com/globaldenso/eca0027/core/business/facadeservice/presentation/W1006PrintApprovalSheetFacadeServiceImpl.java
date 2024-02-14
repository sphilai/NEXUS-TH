/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;

import java.io.File;
import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.L1001ReportService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 *    This is an implement class of the Facade service to PrintApprove action of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Register画面のPrintApproveアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w1006PrintApproveFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintApprovalSheetFacadeServiceImpl extends AbstractUpdateFacadeService<File, W1006CriteriaDomain> {

    /**
     * L1001ReportService
     */
    protected L1001ReportService l1001ReportService;
    
    /**
     * TtExpRequestService
     */
    protected TtExpRequestService ttExpRequestService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintApprovalSheetFacadeServiceImpl() {
    }
    
    /**
     * Setter method for l1001ReportService.
     *
     * @param reportService Set for l1001ReportService
     */
    public void setL1001ReportService(L1001ReportService reportService) {
        l1001ReportService = reportService;
    }

    /**
     * 
     * Setter method for ttExpRequestService.
     *
     * @param ttExpRequestService Set for ttExpRequestService
     */
    public void setTtExpRequestService(TtExpRequestService ttExpRequestService) {
        this.ttExpRequestService = ttExpRequestService;
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
    protected W1006CriteriaDomain filterDomain(W1006CriteriaDomain criteriaDomain)
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
    protected void validateItems(W1006CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W1006CriteriaDomain criteriaDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        TtExpRequestCriteriaDomain criteria = new TtExpRequestCriteriaDomain();
        criteria.setExpRequestNo(criteriaDomain.getExpRequestNo());
        // Search by key
        String status = ttExpRequestService.searchByKey(criteria).getRequestStatus();
        if (Integer.parseInt(status) >= 90) {
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_3004, null)));
        }else if (Integer.parseInt(status) < 20){
            throw new ValidationException(Arrays.asList(new MessageDomain("", NXS_E1_3004, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W1006CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        TtExpRequestCriteriaDomain criteria = new TtExpRequestCriteriaDomain();
        criteria.setExpRequestNo(criteriaDomain.getExpRequestNo());
        // Search by key
        String status = ttExpRequestService.searchByKey(criteria).getRequestStatus();
        if (Integer.parseInt(status) < 30) {
            // Update Status
            TtExpRequestDomain expRequestDomain = new TtExpRequestDomain();
            expRequestDomain.setRequestStatus("30");
            ttExpRequestService.updateByCondition(expRequestDomain, criteria);
        }
        
        // A create of PDF list
        // PDF帳票の作成
        File pdfReport = l1001ReportService.searchExpRequestApproval(criteriaDomain.getExpRequestNo(), criteriaDomain.getScreenDateFormat(), criteriaDomain.getLanguageCd());
        
        return pdfReport;
    }
    
    /**
     * Convert W1006CriteriaDomain to TtExpRequestDomain
     *
     * @param criteriaDomain W1006CriteriaDomain Search-condition domain<br />検索条件ドメイン
     * @return Created expRequest TtExpRequestDomain
     */
    protected TtExpRequestDomain createExpRequest(W1006CriteriaDomain criteriaDomain) {
        TtExpRequestDomain expRequest = new TtExpRequestDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(expRequest, criteriaDomain);
        
        return expRequest;
    }
}
