/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3000;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0161;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED_EXP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PRINT_APPROVAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED_PACKING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROGRESS_PKG;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1006UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestDtlService;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The Register service facade implementation class of a Export Request [Register & Print Request] Main screen.
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W1006RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<W1006UpdateDomain, W1006UpdateDomain> {
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging instruction service.
     */
    /**
     * W1006ExpRequest service.
     */
    protected W1006ExpRequestService w1006ExpRequestService;
    /**
     * W1006ExpRequestDtl service.
     */
    protected W1006ExpRequestDtlService w1006ExpRequestDtlService; 
    /**
     * TmCd service.
     */
    protected TmCdService tmCdService;
    /**
     * Constructor.
     */
    public W1006RegisterFacadeServiceImpl() {
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
     * <p>Setter method for w1006ExpRequestDtlService.</p>
     *
     * @param expRequestDtlService Set for w1006ExpRequestDtlService
     */
    public void setW1006ExpRequestDtlService(W1006ExpRequestDtlService expRequestDtlService) {
        w1006ExpRequestDtlService = expRequestDtlService;
    }

    /**
     * <p>Setter method for w1006ExpRequestService.</p>
     *
     * @param expRequestService Set for w1006ExpRequestService
     */
    public void setW1006ExpRequestService(W1006ExpRequestService expRequestService) {
        w1006ExpRequestService = expRequestService;
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
    protected W1006UpdateDomain filterDomain(W1006UpdateDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        // TODO Auto-generated method stub
        return argDomain;
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
    protected void validateConsistency(W1006UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
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
    protected void validateDatabase(W1006UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        W1006ExpRequestCriteriaDomain criteriaDomain = new W1006ExpRequestCriteriaDomain();
        criteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
        // Search Exp Request
        W1006ExpRequestDomain w1006ExpRequestDomain = w1006ExpRequestService.searchByKey(criteriaDomain);
        if(w1006ExpRequestDomain == null || Integer.parseInt(w1006ExpRequestDomain.getRequestStatus()) >= 20)
        {
            Object [] param = new Object[1];
            if(w1006ExpRequestDomain != null && CANCEL.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(CANCEL);
            }else if(w1006ExpRequestDomain != null && NOT_PRINT_APPROVAL.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(NOT_PRINT_APPROVAL);
            }else if(w1006ExpRequestDomain != null && NOT_RECEIVED_PACKING.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(NOT_RECEIVED_PACKING);
            }else if(w1006ExpRequestDomain != null && NOT_PACKED_EXP.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(NOT_PACKED_EXP);
            }else if(w1006ExpRequestDomain != null && PROGRESS_PKG.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(PROGRESS_PKG);
            }else if(w1006ExpRequestDomain != null && ISSUE_CML.equals(w1006ExpRequestDomain.getRequestStatus())){
                param[0] = getMessageValue(ISSUE_CML);
            }else if(w1006ExpRequestDomain == null){
                param[0] = "";
            }
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1006UpdateDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        int count = 0;
        for(W1006ListDomain domain : filterDomain.getListDomainList())
        {
            if(domain.getStatus() != null && domain.getStatus().equalsIgnoreCase("parent") && domain.getKitParFlg() != null && domain.getKitParFlg().equalsIgnoreCase("Y")  )
            {
                int index = count + 1;
                if( filterDomain.getListDomainList().size() > index )
                {
                    W1006ListDomain child = filterDomain.getListDomainList().get(index);
                    if(child.getStatus() != null && child.getStatus().equalsIgnoreCase("parent") )
                    {
                        MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0161, null);
                        errList.add(msgUpdateStatus);
                        break;
                    }
                }else if(filterDomain.getListDomainList().size() == index){
                    MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0161, null);
                    errList.add(msgUpdateStatus);
                    break;
                }
            }
            count++ ;
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - retrieval-result-data acquisition
     * </pre>
     * <pre>
     * - 検索結果データ取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1006UpdateDomain callServices(W1006UpdateDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        // The information from a screen is set to criteria.
        // criteria に画面からの情報を設定する。
        W1006ExpRequestCriteriaDomain criteriaDomain = new W1006ExpRequestCriteriaDomain();
        criteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
        // Search Exp Request
        W1006ExpRequestDomain w1006ExpRequestDomain = w1006ExpRequestService.searchByKey(criteriaDomain);
        // Update Request status
        w1006ExpRequestDomain.setRequestStatus(NOT_PRINT_APPROVAL);
        w1006ExpRequestDomain.setComUpdateFuncId(filterDomain.getScreenId());
        w1006ExpRequestDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
        // Register 
        w1006ExpRequestService.update(w1006ExpRequestDomain);
        filterDomain.getCriteriaDomain().setRequestStatus(Integer.parseInt(NOT_PRINT_APPROVAL));
        return filterDomain;
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
