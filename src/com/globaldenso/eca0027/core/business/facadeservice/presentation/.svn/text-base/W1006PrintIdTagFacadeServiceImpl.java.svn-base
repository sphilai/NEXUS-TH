/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3000;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestService;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.eca0027.core.business.service.L1003ReportService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 *    This is an implement class of the Facade service to PrintIdTag action of a Export Request [Register & Print Request] Main screen.
 *  <br />梱包指示Register画面のPrintIdTagアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w1006PrintIdTagFacadeService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintIdTagFacadeServiceImpl extends AbstractProcessFacadeService<File, W1006UpdateDomain> {

    /**
     * L1003Report service
     * <br />梱包指示サービス
     */
    protected L1003ReportService l1003ReportService;
    /**
     * TtExpRequest service
     */
    protected TtExpRequestService ttExpRequestService;
    /**
     * TmCd service.
     */
    protected TmCdService tmCdService;
    
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintIdTagFacadeServiceImpl() {
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
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }


    /**
     * <p>Setter method for l1003ReportService.</p>
     *
     * @param reportService Set for l1003ReportService
     */
    public void setL1003ReportService(L1003ReportService reportService) {
        l1003ReportService = reportService;
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
    protected W1006UpdateDomain filterDomain(W1006UpdateDomain w1006UpdateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return w1006UpdateDomain;
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
    protected void validateItems(W1006UpdateDomain w1006UpdateDomain)
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
    protected void validateConsistency(W1006UpdateDomain w1006UpdateDomain)
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
    protected void validateDatabase(W1006UpdateDomain w1006UpdateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        boolean check = false;
        // Validate select checkbox
        for (W1006ListDomain listDomain : w1006UpdateDomain.getListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                check = true;
            }
        }
        if(!check)
        {
            //Setting error message
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_3007, null);
            errList.add(msgUpdateStatus);
        }else{
            // Create criteria search
            TtExpRequestCriteriaDomain ttExpRequestCriteriaDomain = new TtExpRequestCriteriaDomain();
            ttExpRequestCriteriaDomain.setExpRequestNo(w1006UpdateDomain.getCriteriaDomain().getExpRequestNo());
            // Search status exp request no
            TtExpRequestDomain result = ttExpRequestService.searchByKey(ttExpRequestCriteriaDomain);
            if(result != null && CANCEL.equals(result.getRequestStatus()))
            {
                // If Export Request was canceled. Status = '90' Move to Export Request Main screen and show error message
                Object [] param = new Object[1];
                param[0] = getMessageValue(CANCEL);
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3000, param);
                errList.add(msgUpdateStatus);
            }else if(result != null && Integer.parseInt(result.getRequestStatus()) < Integer.parseInt(NOT_RECEIVED_PACKING))
            {
                // If Export Request was < 30 and show error message
                Object [] param = new Object[1];
                param[0] = getMessageValue(result.getRequestStatus());
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3000, param);
                errList.add(msgUpdateStatus);
            }
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
    protected File callServices(W1006UpdateDomain w1006UpdateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A create of PDF list
        // PDF帳票の作成
        File pdfReport = l1003ReportService.searchExpRequestIdTag(w1006UpdateDomain, w1006UpdateDomain.getCriteriaDomain().getScreenDateFormat());
        
        return pdfReport;
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
