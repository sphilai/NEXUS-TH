/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService;
import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1009UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service facade implementation class of Export Packaging Returnable PKG  Material
 * <br />Export Packaging Returnable PKG  Material画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W1009InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1009InitFacadeServiceImpl extends AbstractSearchFacadeService<W1009UpdateDomain, W1009UpdateDomain> {

    /**
     * twExpRequestPalletizeRtService
     * <br />
     */
    protected TwExpRequestPalletizeRtService twExpRequestPalletizeRtService;

    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W1009InitFacadeServiceImpl() {
    }

    /**
     * Setter method for twExpRequestPalletizeRtService.
     *
     * @param twExpRequestPalletizeRtService Set for twExpRequestPalletizeRtService
     */
    public void setTwExpRequestPalletizeRtService(
        TwExpRequestPalletizeRtService twExpRequestPalletizeRtService) {
        this.twExpRequestPalletizeRtService = twExpRequestPalletizeRtService;
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
    protected W1009UpdateDomain filterDomain(W1009UpdateDomain criteriaDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateConsistency(W1009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateDatabase(W1009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    /*protected W1009UpdateDomain callServices(W1009UpdateDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        TwExpRequestPalletizeRtCriteriaDomain expRequestPltzRtCriteria = new TwExpRequestPalletizeRtCriteriaDomain();
        expRequestPltzRtCriteria.setExpRequestNo(criteriaDomain.getCriteriaDomain().getExpRequestNo());
        expRequestPltzRtCriteria.setPalletNo(criteriaDomain.getCriteriaDomain().getPalletNo());
        
        List<TwExpRequestPalletizeRtDomain> resultList = twExpRequestPalletizeRtService.searchByCondition(expRequestPltzRtCriteria);

        List<W1009ListDomain> w1009List = new ArrayList<W1009ListDomain>();
        for (TwExpRequestPalletizeRtDomain listDomain : resultList) {
            W1009ListDomain w1009ListDomain = new W1009ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1009ListDomain, listDomain);
            w1009List.add(w1009ListDomain);
        }
        
        W1009UpdateDomain resultDomain = new W1009UpdateDomain();
        resultDomain.setListDomainList(w1009List);
        
        return resultDomain;
    }*/
    protected W1009UpdateDomain callServices(W1009UpdateDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
    
        TwExpRequestPalletizeRtCriteriaDomain expRequestPltzRtCriteria = new TwExpRequestPalletizeRtCriteriaDomain();
        expRequestPltzRtCriteria.setExpRequestNo(criteriaDomain.getCriteriaDomain().getExpRequestNo());
        expRequestPltzRtCriteria.setPalletNo(criteriaDomain.getCriteriaDomain().getPalletNo());
        expRequestPltzRtCriteria.setOwnerComp(criteriaDomain.getCriteriaDomain().getOwnerComp()); //for  searchPkgSetMaterialsNxsCompNm
        expRequestPltzRtCriteria.setOuterCd(criteriaDomain.getCriteriaDomain().getOuterPkgCd()); //for  searchPkgSetMaterialsNxsCompNm
        
        List<TwExpRequestPalletizeRtDomain> resultList = twExpRequestPalletizeRtService.searchByCondition(expRequestPltzRtCriteria);
        List<W1009ListDomain> w1009List = new ArrayList<W1009ListDomain>();
        if(resultList != null && resultList.size() > 0){ // Search result W1009
            
            for (TwExpRequestPalletizeRtDomain listDomain : resultList) {
                W1009ListDomain w1009ListDomain = new W1009ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(w1009ListDomain, listDomain);
                w1009List.add(w1009ListDomain);
            }
        }else if(criteriaDomain.getCriteriaDomain().getOuterPkgCd() != null){ //Get data from OuterCode 
            
            List<TwExpRequestPalletizeRtDomain> pkgSetMaterialsList = twExpRequestPalletizeRtService.searchPkgSetMaterialsNxsCompNm(expRequestPltzRtCriteria);
            for (TwExpRequestPalletizeRtDomain listDomain : pkgSetMaterialsList) {
                W1009ListDomain w1009ListDomain = new W1009ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(w1009ListDomain, listDomain);
                w1009ListDomain.setExpRequestNo(criteriaDomain.getCriteriaDomain().getExpRequestNo());
                w1009ListDomain.setPalletNo(criteriaDomain.getCriteriaDomain().getPalletNo());
                w1009ListDomain.setSelectPkgFlg("Y");
                w1009ListDomain.setWeightUnit(w1009ListDomain.getNetWeightUnit()); //ISSUE 111
                w1009ListDomain.setQtyUnit("EA");
                w1009ListDomain.setQty(""); //ISSUE DATE 31032016
                //w1009ListDomain.setQty(String.valueOf(listDomain.getQty()) );
                w1009List.add(w1009ListDomain);
            }
        }
        
        W1009UpdateDomain resultDomain = new W1009UpdateDomain();
        resultDomain.setListDomainList(w1009List);
        
        return resultDomain;
    }
}
