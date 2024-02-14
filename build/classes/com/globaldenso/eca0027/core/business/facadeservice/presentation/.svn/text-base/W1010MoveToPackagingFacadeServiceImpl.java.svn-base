/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PALLETIZE_INSTRUCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3000;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1010UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 *  An implementation class of facade service for edit or refer action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のEditOrReferアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1010MoveToPackagingFacadeServiceImpl extends AbstractProcessFacadeService<W1010UpdateDomain, W1010UpdateDomain> {

    /**
     * TmCd Service.
     */
    protected TmCdService tmCdService;
    
    /**
     * W1006ExpRequest service
     * <br />共通サービス
     */
    protected W1006ExpRequestService w1006ExpRequestService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1010MoveToPackagingFacadeServiceImpl() {
    }

    /**
     * <p>Getter method for tmCdService.</p>
     *
     * @return the tmCdService
     */
    public TmCdService getTmCdService() {
        return tmCdService;
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
     * <p>Setter method for w1006ExpRequestService.</p>
     *
     * @param expRequestService Set for w1006ExpRequestService
     */
    public void setW1006ExpRequestService(W1006ExpRequestService expRequestService) {
        w1006ExpRequestService = expRequestService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail line.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1010UpdateDomain filterDomain(W1010UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W1006ExpRequestCriteriaDomain expRequestCriteriaDomain = new W1006ExpRequestCriteriaDomain();
        expRequestCriteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        W1006ExpRequestDomain result = w1006ExpRequestService.searchByKey(expRequestCriteriaDomain);
        int status = Integer.parseInt(result.getRequestStatus());
        W1010CriteriaDomain domain = updateDomain.getCriteriaDomain();
        if(domain == null || (status < 30 || status == 90))
        {
            Object [] param = new Object[1];
            param[0] = getMessageValue(result.getRequestStatus() + "", FUNC_PALLETIZE_INSTRUCTION);
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_3000, param);
            errorList.add(msgUpdateStatus);
            throw new ValidationException(errorList);
        }
        updateDomain.setCriteriaDomain(domain);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1010UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1010UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1010UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1010UpdateDomain callServices(W1010UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @param cdType String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd , String cdType) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(cdType);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return cd + " : " + tmCdService.searchByKey(criteria).getValue();
    }
}
