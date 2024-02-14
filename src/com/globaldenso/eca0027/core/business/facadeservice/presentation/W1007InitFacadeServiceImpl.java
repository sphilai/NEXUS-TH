/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * The Init service facade implementation class of Export Request Header screen
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w1007SearchFacadeService
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5446 $
 */
public class W1007InitFacadeServiceImpl extends AbstractSearchFacadeService<W1007UpdateDomain, W1007CriteriaDomain> {
    /**
     * W1007ExpRequest Service.
     */
    protected W1007ExpRequestService w1007ExpRequestService;
    /**
     * Constructor.
     */
    public W1007InitFacadeServiceImpl() {
    }
    
    /**
     * <p>Setter method for w1007ExpRequestService.</p>
     *
     * @param expRequestService Set for w1007ExpRequestService
     */
    public void setW1007ExpRequestService(W1007ExpRequestService expRequestService) {
        w1007ExpRequestService = expRequestService;
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
    protected W1007UpdateDomain callServices(W1007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // TODO Auto-generated method stub
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W1007ExpRequestCriteriaDomain criteria = createCriteria(criteriaDomain);
        
        W1007ExpRequestDomain domain = w1007ExpRequestService.searchByKey(criteria);
        
        
        // Converted in a list domain
        // リストドメインへの変換
        return convertCriteria(domain);
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
    protected W1007CriteriaDomain filterDomain(W1007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
    protected void validateConsistency(W1007CriteriaDomain filterDomain)
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
    protected void validateDatabase(W1007CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
       
    }
    /**
     * CreateCriteria
     *
     * @param criteriaDomain W1007CriteriaDomain
     * @return criteria W1007ExpRequestDtlCriteriaDomain
     */
    protected W1007ExpRequestCriteriaDomain createCriteria(W1007CriteriaDomain criteriaDomain) {
        W1007ExpRequestCriteriaDomain criteria = new W1007ExpRequestCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        //===Comment for ISSUE:186 ISSUE DATE : 01042016====
        //criteria.setScreenId(criteriaDomain.getScreenId());
        //criteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        //=== end comment ==================================================
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        
        return criteria;
    }
    /**
     * CreateCriteria
     *
     * @param criteriaDomain W1007CriteriaDomain
     * @return criteria W1007ExpRequestDtlCriteriaDomain
     */
    protected W1007UpdateDomain convertCriteria(W1007ExpRequestDomain criteriaDomain) {
        
        W1007CriteriaDomain criteria = new W1007CriteriaDomain();
        W1007UpdateDomain updateDomain = new W1007UpdateDomain();
        if(criteriaDomain != null){
            // A search condition is copied.
            // 検索条件をコピー
            CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
            
            updateDomain.setCriteriaDomain(criteria);
        }
        
        return updateDomain;
    }
}
