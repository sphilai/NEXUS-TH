/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;


/**
 * This is an implement class of the Facade service to Init action of ordering registration header screen.
 * <br />受注登録ヘッダー画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 5759 $
 */
public class WB001InitFacadeServiceImpl extends AbstractSearchFacadeService<WB001CriteriaDomain, WB001CriteriaDomain> {
    
    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001InitFacadeServiceImpl() {
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
    protected WB001CriteriaDomain filterDomain(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * Setter method for WB001OdrRcvServic.
     *
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
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
    protected void validateConsistency(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving search-condition domain
     *       {@link WB001OdrRcvCriteriaDomain} is created and rcvOdrCompCd/RECEIVE ORDER COMPANY CODE is set up.
     *
     * - Today is acquired.
     *       This is a call about {@link WB001OdrRcvService#searchOnHeaderInit(WB001OdrRcvCriteriaDomain)}.
     * 
     * - Customer Order Receiving検索条件ドメインの作成
     *     {@link WB001OdrRcvCriteriaDomain}を作成し、rcvOdrCompCd/受注会社コードを設定
     * 
     * - 本日を取得
     *     {@link WB001OdrRcvService#searchOnHeaderInit(WB001OdrRcvCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB001CriteriaDomain callServices(WB001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        WB001OdrRcvCriteriaDomain criteria = new WB001OdrRcvCriteriaDomain();

        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        WB001OdrRcvDomain wB001OdrRcvDomain = wb001OdrRcvService.searchOnHeaderInit(criteria);

        // Converted of a domain
        // ドメインの変換
        WB001CriteriaDomain resultDomain = convertToResultDomain(wB001OdrRcvDomain, criteriaDomain.getScreenDateFormat());

        return resultDomain;
    }
    
    /**
     * Change an ordering business domain into a Criteria domain.
     * <br />
     * 受注業務ドメインをCriteriaドメインに変換します。
     * 
     * @param wB001OdrRcvDomain Ordering business domain<br />受注業務ドメイン
     * @param dateFormat Date format<br />日付フォーマット
     * @return Criteria domain<br />Criteriaドメイン
     */
    protected WB001CriteriaDomain convertToResultDomain(WB001OdrRcvDomain wB001OdrRcvDomain, String dateFormat) {
        
        WB001CriteriaDomain resultDomain = new WB001CriteriaDomain();
        
        // ETD DUE DATE
        // 船積期限
        Date etdDueDate = wB001OdrRcvDomain.getEtdDueDt();
        
        if (wB001OdrRcvDomain != null) {
            // Setting of an ETD DUE DATE
            // 船積期限の設定
            resultDomain.setEtdDueDt(DateUtil.formatDate(etdDueDate, dateFormat));
        } else {
            resultDomain.setEtdDueDt(null);
        }
        
        return resultDomain;
    }
}
