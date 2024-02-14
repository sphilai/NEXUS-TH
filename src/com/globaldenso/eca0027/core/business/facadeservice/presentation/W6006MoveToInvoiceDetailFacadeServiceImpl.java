/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0026;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ONE_MONTH_AGO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TWO_MONTH_LATER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6006UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade MoveToInvoiceDetail action of Documentation Invoice Grouping screen.
 * <br />通関書類作成業務 Invoice Grouping画面のMoveToInvoiceDetailアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6006MoveToInvoiceDetailFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W6006MoveToInvoiceDetailFacadeServiceImpl extends AbstractProcessFacadeService<Void, W6006UpdateDomain> {
    
    /**
     * Documentation Service
     */
    protected W6001DocService w6001DocService;

    /**
     * Common Service
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * デフォルトコンストラクタです。
     */
    public W6006MoveToInvoiceDetailFacadeServiceImpl(){
        super();
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
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
     * {@inheritDoc}
     * <pre>
     * - Line item selection check.
     * - 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6006UpdateDomain filterDomain(W6006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        // Line item selection check
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getW6006CriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // Stores the selected rows
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getW6006CriteriaDomain().getSelected());
        List<W6006ListDomain> listDomainList = new ArrayList<W6006ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Single item check.
     * - 単項目チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W6006CriteriaDomain> valid 
            = new Validator<W6006CriteriaDomain>(updateDomain.getW6006CriteriaDomain(), "w6006CriteriaDomain");

        String[] properties = {
            "shipperCd"
            , "dateShipped"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6006);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * DB integrity check .
     * - Night batch check
     * </pre>
     * <pre>
     * DB整合性チェック
     * - 夜間バッチ中チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        W6006CriteriaDomain criteriaDomain = updateDomain.getW6006CriteriaDomain();
        W6006ListDomain listDomain = updateDomain.getListDomainList().get(0);

        // CIGMA availability
        // 夜間バッチチェックを行う
        String errCd = w6001DocService.validateDatabaseCigmaAvailable(listDomain.getShipperCd(), listDomain.getCmlTyp());
        if (errCd != null){
            throw new ValidationException(Arrays.asList(new MessageDomain("w6006CriteriaDomain.shipperCd", errCd, null)));
        }

        // Input range check for Date Shipped.
        // Date Shippedの入力可能範囲チェック
        Date dateShipped = DateUtil.parseDate(criteriaDomain.getDateShipped(), criteriaDomain.getScreenDateFormat());
        if (!w6001DocService.validateDatabaseCigmaAds(criteriaDomain.getShipperCd(), dateShipped)) {
            String[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.dateShipped")
                , ONE_MONTH_AGO
                , TWO_MONTH_LATER
            };
            throw new ValidationException(Arrays.asList(new MessageDomain("w6006CriteriaDomain.dateShipped", GSCM_E0_0026, params)));
        }        
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6006UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}

