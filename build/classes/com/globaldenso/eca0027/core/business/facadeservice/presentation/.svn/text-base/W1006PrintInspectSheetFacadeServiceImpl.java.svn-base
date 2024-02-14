/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3000;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED_PACKING;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.L1002ReportService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 *    This is an implement class of the Facade service to PrintInspect action of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Register画面のPrintInspectアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w1006PrintInspectFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintInspectSheetFacadeServiceImpl extends AbstractProcessFacadeService<File, W1006CriteriaDomain> {
    /**
     * L1002Report service
     */
    protected L1002ReportService l1002ReportService;
    /**
     * TtExpRequest service
     */
    protected TtExpRequestService ttExpRequestService;
    /**
     * TmCd service.
     */
    protected TmCdService tmCdService;
    /**
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintInspectSheetFacadeServiceImpl() {
    }
    
    /**
     * <p>Setter method for ttExpRequestService.</p>
     *
     * @param ttExpRequestService Set for ttExpRequestService
     */
    public void setTtExpRequestService(TtExpRequestService ttExpRequestService) {
        this.ttExpRequestService = ttExpRequestService;
    }

    /**
     * <p>Setter method for l1002ReportService.</p>
     *
     * @param reportService Set for l1002ReportService
     */
    public void setL1002ReportService(L1002ReportService reportService) {
        l1002ReportService = reportService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
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
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        // Create criteria search
        TtExpRequestCriteriaDomain ttExpRequestCriteriaDomain = new TtExpRequestCriteriaDomain();
        ttExpRequestCriteriaDomain.setExpRequestNo(criteriaDomain.getExpRequestNo());
        // Search status exp request no
        TtExpRequestDomain result = ttExpRequestService.searchByKey(ttExpRequestCriteriaDomain);
        if(result != null && CANCEL.equals(result.getRequestStatus()))
        {
            // If Export Request was canceled. Status = '90' Move to Export Request Main screen and show error message
            Object [] param = new Object[1];
            param[0] = getMessageValue(CANCEL);
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3000, param);
            errList.add(msgUpdateStatus);
        }else if(result != null &&  Integer.parseInt(result.getRequestStatus()) < Integer.parseInt(NOT_RECEIVED_PACKING))
        {
            // If Export Request was < 30 and show error message
            Object [] param = new Object[1];
            param[0] = getMessageValue(result.getRequestStatus());
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3000, param);
            errList.add(msgUpdateStatus);
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
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
        
        // A create of PDF list
        // PDF帳票の作成
        File pdfReport = l1002ReportService.searchExpRequestInspect(criteriaDomain.getExpRequestNo(), criteriaDomain.getScreenDateFormat());
        
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
        // Copy properties domain to domain
        CommonUtil.copyPropertiesDomainToDomain(expRequest, criteriaDomain);
        
        return expRequest;
    }
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd ) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(CD_TYPE_STATUS);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return tmCdService.searchByKey(criteria).getValue();
    }
}
