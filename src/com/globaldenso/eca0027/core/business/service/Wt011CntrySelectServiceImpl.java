/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.business.domain.Wt011CntrySelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt011CntrySelectCriteriaDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Country Search Sub Screen.
 * <br />国選択子画面のService実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt011CntrySelectServiceImpl implements Wt011CntrySelectService {

    /**
     * tmCntryService
     */
    private TmCntryService tmCntryService;

    /**
     * Default constructor.
     */
    public Wt011CntrySelectServiceImpl() {
    }

    /**
     * <p>Setter method for tmCntryService.</p>
     *
     * @param tmCntryService Set for tmCntryService
     */
    public void setTmCntryService(TmCntryService tmCntryService) {
        this.tmCntryService = tmCntryService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the country information.
     * 国情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from Wt011CntrySelectCriteriaDomain to TmCntryCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the results of the one page.
     *     Call tmCntryService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt011CntrySelectDomain), return it.
     *     - Transfer the results of countrySelectService.searchByConditionForPaging to the list of Wt011CntrySelectDomain.
     *     - Return the list of Wt011CntrySelectDomain.
     *
     * - 検索条件の移送
     *       Wt011CntrySelectCriteriaDomainよりTmCntryCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にtmCntryService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWt011CntrySelectDomainのリストを作成し、返却
     *       - tmCntryService.searchByConditionForPagingの呼び出し結果をWt011CntrySelectDomainのリストに移送
     *       - Wt011CntrySelectDomainのリストを返却
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmCntryCriteriaDomain)
     */
    public List<Wt011CntrySelectDomain> searchByConditionForPaging(
        Wt011CntrySelectCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmCntryCriteriaDomain tableCriteriaDomain = new TmCntryCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String cntryNm = tableCriteriaDomain.getCntryNm();
        if(cntryNm != null) {
            String escWhNm =
                cntryNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setCntryNm(escWhNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCntryCdLikeFront(criteria.getCntryCd());
        tableCriteriaDomain.setCntryCd(null);
        tableCriteriaDomain.setCntryNmLikeFront(tableCriteriaDomain.getCntryNm());
        tableCriteriaDomain.setCntryNm(null);

        // Get search results
        List<TmCntryDomain> tableResultDomainList = 
            tmCntryService.searchByConditionForPaging(tableCriteriaDomain);

        List<Wt011CntrySelectDomain> listDomainList = new ArrayList<Wt011CntrySelectDomain>();

        if (tableResultDomainList != null) {
            
            for (TmCntryDomain resultDomain : tableResultDomainList) {
                Wt011CntrySelectDomain listDomain = new Wt011CntrySelectDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search count for the country information.
     * 国情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from Wt011CntrySelectCriteriaDomain to TmCntryCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the number of search results.
     *     Call tmCntryService.searchCount with tableCriteriaDomain as an argument.
     *     Return of acquisition number
     * 
     * - 検索条件の移送
     *       Wt011CntrySelectCriteriaDomainよりTmCntryCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にtmCntryService.searchCountの呼び出し
     *       取得件数を返却
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TmCntryService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmCntryCriteriaDomain)
     */
    public int searchCount(Wt011CntrySelectCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmCntryCriteriaDomain tableCriteriaDomain = new TmCntryCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String cntryNm = tableCriteriaDomain.getCntryNm();
        if(cntryNm != null) {
            String escWhNm =
                cntryNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setCntryNm(escWhNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCntryCdLikeFront(criteria.getCntryCd());
        tableCriteriaDomain.setCntryCd(null);
        tableCriteriaDomain.setCntryNmLikeFront(tableCriteriaDomain.getCntryNm());
        tableCriteriaDomain.setCntryNm(null);

        // Call service get search count
        return tmCntryService.searchCount(tableCriteriaDomain);
    }

}
