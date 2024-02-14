/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsWhDao;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt010WhSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt010WhSelectCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Warehouse Search Sub Screen.
 * <br />
 * 倉庫選択子画面のService実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15692 $
 */
public class Wt010WhSelectServiceImpl implements Wt010WhSelectService {

    /**
     * tmNxsWhService
     */
    private TmNxsWhDao Wt010WhSelectDao; // NL040 MOD

    /**
     * Default constructor.
     */
    public Wt010WhSelectServiceImpl() {
    }

    // NL040 MOD START
    /**
     * Setter method of wt010WhSelectDao.
     *
     * @param wt010WhSelectDao Value to be stored in wt010WhSelectDao.
     */
    public void setWt010WhSelectDao(TmNxsWhDao wt010WhSelectDao) {
        Wt010WhSelectDao = wt010WhSelectDao;
    }
    // NL040 MOD END

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the warehouse information.
     * 倉庫情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmNxsWhCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the results of the one page.
     *     Call tmNxsWhService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WhSelectDomain), return it.
     *     - Transfer the results of whSelectService.searchByConditionForPaging to the list of WhSelectDomain.
     *     - Return the list of WhSelectDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTmNxsWhCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にtmNxsWhService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWhSelectDomainのリストを作成し、返却
     *       - tmNxsWhService.searchByConditionForPagingの呼び出し結果をWhSelectDomainのリストに移送
     *       - WhSelectDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhCriteriaDomain)
     */
    public List<Wt010WhSelectDomain> searchByConditionForPaging(
        Wt010WhSelectCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsWhCriteriaDomain tableCriteriaDomain = new TmNxsWhCriteriaDomain();
        BeanUtilsBean viewToDbBean = new BeanUtilsBean();
        viewToDbBean.getConvertUtils().register(
            new SqlTimestampConverter(null), Timestamp.class);

        try {
            viewToDbBean.copyProperties(tableCriteriaDomain, criteria);
        } catch (IllegalAccessException e) {
            throw new GscmApplicationException(e);
        } catch (InvocationTargetException e) {
            throw new GscmApplicationException(e);
        }

        // Wild card Replace.
        String whNm = tableCriteriaDomain.getWhNm();
        if(whNm != null) {
            String escWhNm =
                whNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setWhNm(escWhNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCompCdLikeFront(criteria.getCompCd());
        tableCriteriaDomain.setCompCd(null);
        tableCriteriaDomain.setWhCdLikeFront(criteria.getWhCd());
        tableCriteriaDomain.setWhCd(null);
        tableCriteriaDomain.setWhNmLikeFront(tableCriteriaDomain.getWhNm());
        tableCriteriaDomain.setWhNm(null);

        // Call search service.
        List<TmNxsWhDomain> tableResultDomainList = Wt010WhSelectDao // NL040 MOD
            .searchByConditionForPaging(tableCriteriaDomain);

        List<Wt010WhSelectDomain> listDomainList = new ArrayList<Wt010WhSelectDomain>();
        if (tableResultDomainList != null) {

            for (TmNxsWhDomain resultDomain : tableResultDomainList) {
                Wt010WhSelectDomain listDomain = new Wt010WhSelectDomain();

                // Copy from search results to displaying Domain on the
                // screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search count for the warehouse information.
     * 倉庫情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to TmNxsWhCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the number of search results.
     *     Call tmNxsWhService.searchCount with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりTmNxsWhCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にtmNxsWhService.searchCountの呼び出し
     * </pre>
     *       
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsWhService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhCriteriaDomain)
     * 
     */
    public int searchCount(Wt010WhSelectCriteriaDomain criteria)
        throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsWhCriteriaDomain tableCriteriaDomain = new TmNxsWhCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String whNm = tableCriteriaDomain.getWhNm();
        if(whNm != null) {
            String escWhNm =
                whNm.replace("%", "[%]").replace("_", "[_]");
            tableCriteriaDomain.setWhNm(escWhNm);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setCompCdLikeFront(criteria.getCompCd());
        tableCriteriaDomain.setCompCd(null);
        tableCriteriaDomain.setWhCdLikeFront(criteria.getWhCd());
        tableCriteriaDomain.setWhCd(null);
        tableCriteriaDomain.setWhNmLikeFront(tableCriteriaDomain.getWhNm());
        tableCriteriaDomain.setWhNm(null);

        return Wt010WhSelectDao.searchCount(tableCriteriaDomain); // NL040 MOD
    }

}
