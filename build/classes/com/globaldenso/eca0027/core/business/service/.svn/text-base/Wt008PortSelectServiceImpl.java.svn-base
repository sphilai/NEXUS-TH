/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmPortDao;
import com.globaldenso.eca0027.core.auto.business.domain.TmPortDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPortCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt008PortSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt008PortSelectCriteriaDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Port Search Sub Screen.
 * <br />港選択子画面のService実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15692 $
 */
public class Wt008PortSelectServiceImpl implements Wt008PortSelectService {

    /**
     * wt008PortSelectDao
     */
    private TmPortDao wt008PortSelectDao; // NL040 MOD

    /**
     * Default constructor.
     */
    public Wt008PortSelectServiceImpl() {
    }

    // NL040 MOD START
    /**
     * Setter method of wt008PortSelectDao.
     *
     * @param wt008PortSelectDao Value to be stored in wt008PortSelectDao.
     */
    public void setWt008PortSelectDao(TmPortDao wt008PortSelectDao) {
        this.wt008PortSelectDao = wt008PortSelectDao;
    }
    // NL040 MOD END

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Port information.
     * 港情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmPortCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the results of the one page.
     *     Call tmPortService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(PortSelectDomain), return it.
     *     - Transfer the results of portSelectService.searchByConditionForPaging to the list of PortSelectDomain.
     *     - Return the list of PortSelectDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりTmPortCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にtmPortService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインPortSelectDomainのリストを作成し、返却
     *       - tmPortService.searchByConditionForPagingの呼び出し結果をPortSelectDomainのリストに移送
     *       - PortSelectDomainのリストを返却
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmPortCriteriaDomain)
     */
    public List<Wt008PortSelectDomain> searchByConditionForPaging(
        Wt008PortSelectCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmPortCriteriaDomain tableCriteriaDomain = new TmPortCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String portNm = tableCriteriaDomain.getPortNm();
        
        if(portNm != null) {
            String escPortNm =
                portNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setPortNm(escPortNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setPortNmLikeFront(tableCriteriaDomain.getPortNm());
        tableCriteriaDomain.setPortNm(null);
        
        // Call search service.
        List<TmPortDomain> tableResultDomainList = 
            wt008PortSelectDao.searchByConditionForPaging(tableCriteriaDomain); // NL040 MOD

        List<Wt008PortSelectDomain> listDomainList = new ArrayList<Wt008PortSelectDomain>();
        if (tableResultDomainList != null) {
            
            for (TmPortDomain resultDomain : tableResultDomainList) {
                Wt008PortSelectDomain listDomain = new Wt008PortSelectDomain();

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
     * This method calls the service to search count for the Port information.
     * 港情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmPortCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the number of search results.
     *     Call tmPortService.searchCount with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTmPortCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にtmPortService.searchCountの呼び出し
     * </pre>
     *       
     * @see com.globaldenso.eca0027.core.auto.business.service.TmPortService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmPortCriteriaDomain)
     */
    public int searchCount(Wt008PortSelectCriteriaDomain criteria) throws ApplicationException {
        
        // Copy from the criteria on screen to a search criteria Domain.
        TmPortCriteriaDomain tableCriteriaDomain = new TmPortCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);
        
        // Wild card Replace.
        String portNm = tableCriteriaDomain.getPortNm();
        if(portNm != null) {
            String escPortNm =
                portNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setPortNm(escPortNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setPortNmLikeFront(tableCriteriaDomain.getPortNm());
        tableCriteriaDomain.setPortNm(null);
        
        return wt008PortSelectDao.searchCount(tableCriteriaDomain); // NL040 MOD
    }

}
