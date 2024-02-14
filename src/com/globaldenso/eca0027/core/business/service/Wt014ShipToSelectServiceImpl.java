/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TmNxsShipToDao;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt014ShipToSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt014ShipToSelectCriteriaDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The search service implementation class of Ship to Search Sub Screen. <br />
 * <br />送荷先選択子画面のService実装クラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15692 $
 */
public class Wt014ShipToSelectServiceImpl implements Wt014ShipToSelectService {

    /**
     * wt014ShipToSelectDao
     */
    private TmNxsShipToDao wt014ShipToSelectDao; // NL040 MOD

    /**
     * Default constructor.
     */
    public Wt014ShipToSelectServiceImpl() {
    }

    // NL040 MOD START
    /**
     * Setter method of wt014ShipToSelectDao.
     *
     * @param wt014ShipToSelectDao Value to be stored in wt014ShipToSelectDao.
     */
    public void setWt014ShipToSelectDao(TmNxsShipToDao wt014ShipToSelectDao) {
        this.wt014ShipToSelectDao = wt014ShipToSelectDao;
    }
    // NL040 MOD END

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Ship to information.
     * 送荷先情報の検索結果を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from Wt014ShipToSelectCriteriaDomain to TmNxsShipToCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the results of the one page.
     *     Call tmNxsShipToService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Set the value of a combination of PrintShipToNm1 - PrintShipToNm2 to PrintShipToNm.
     * - Set the value of a combination of PrintShipToAddr1 - PrintShipToAddr4  to PrintShipToAddr.
     * - Create a list of domain(ShipToSelectDomain), return it.
     *     - Transfer the results of shipToSelectService.searchByConditionForPaging to the list of ShipToSelectDomain.
     *     - Return the list of ShipToSelectDomain.
     * 
     * - 検索条件の移送
     *       Wt014ShipToSelectCriteriaDomainよりTmNxsShipToCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にtmNxsShipToService.searchByConditionForPagingの呼び出し
     * - PrintShipToNmにPrintShipToNm1～PrintShipToAddr4を結合した値を設定
     * - PrintShipToAddrにPrintShipToAddr1～PrintShipToAddr4を結合した値を設定
     * - 検索結果リストドメインShipToSelectDomainのリストを作成し、返却
     *       - tmNxsShipToService.searchByConditionForPagingの呼び出し結果をShipToSelectDomainのリストに移送
     *       - ShipToSelectDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToCriteriaDomain)
     */
    public List<Wt014ShipToSelectDomain> searchByConditionForPaging(
        Wt014ShipToSelectCriteriaDomain criteria) throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsShipToCriteriaDomain tableCriteriaDomain = new TmNxsShipToCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String shipToNm = tableCriteriaDomain.getShipToNm();
        String shipToNmAbb = tableCriteriaDomain.getShipToNmAbb();
        if(shipToNm != null) {
            String escShipToNm =
                shipToNm.replace("%", "\"%\"").replace("_", "\"_\"");
            tableCriteriaDomain.setShipToNm(escShipToNm);
        }
        if(shipToNmAbb != null) {
            String escShipToNmAbb =
                shipToNmAbb.replace("%", "\"%\"").replace("_", "\"_\"");
            tableCriteriaDomain.setShipToNmAbb(escShipToNmAbb);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setShipToCdLikeFront(criteria.getShipToCd());
        tableCriteriaDomain.setShipToCd(null);
        tableCriteriaDomain.setShipToNmLikeFront(tableCriteriaDomain.getShipToNm());
        tableCriteriaDomain.setShipToNm(null);
        tableCriteriaDomain.setShipToNmAbbLikeFront(tableCriteriaDomain.getShipToNmAbb());
        tableCriteriaDomain.setShipToNmAbb(null);

        // Call search service.
        List<TmNxsShipToDomain> tableResultDomainList = wt014ShipToSelectDao // NL040 MOD
            .searchByConditionForPaging(tableCriteriaDomain);

        List<Wt014ShipToSelectDomain> listDomainList = new ArrayList<Wt014ShipToSelectDomain>();

        if (tableResultDomainList != null) {

            for (TmNxsShipToDomain resultDomain : tableResultDomainList) {
                Wt014ShipToSelectDomain listDomain = new Wt014ShipToSelectDomain();

                // Copy from search results to displaying Domain on the
                // screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                // Set the value of a combination of PrintShipToNm1 - PrintShipToNm2 
                // to PrintShipToNm.
                if (listDomain.getPrintShipToNm1() == null){
                    listDomain.setPrintShipToNm1("");
                }
                if (listDomain.getPrintShipToNm2() == null){
                    listDomain.setPrintShipToNm2("");
                }
                listDomain.setPrintShipToNm(listDomain.getPrintShipToNm1()
                    + listDomain.getPrintShipToNm2());
                
                // Set the value of a combination of PrintShipToAddr1 - PrintShipToAddr4 
                // to PrintShipToAddr.
                if (listDomain.getPrintShipToAddr1() == null){
                    listDomain.setPrintShipToAddr1("");
                }
                if (listDomain.getPrintShipToAddr2() == null){
                    listDomain.setPrintShipToAddr2("");
                }
                if (listDomain.getPrintShipToAddr3() == null){
                    listDomain.setPrintShipToAddr3("");
                }
                if (listDomain.getPrintShipToAddr4() == null){
                    listDomain.setPrintShipToAddr4("");
                }
                listDomain.setPrintShipToAddr(listDomain.getPrintShipToAddr1()
                    + listDomain.getPrintShipToAddr2()
                    + listDomain.getPrintShipToAddr3()
                    + listDomain.getPrintShipToAddr4());
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search count for the Ship to information.
     * 送荷先情報の検索結果件数を取得するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from Wt014ShipToSelectCriteriaDomain to TmNxsShipToCriteriaDomain tableCriteriaDomain.
     * - To transfer individual items that can not be bulk copy.
     * - Get the number of search results.
     *     Call tmNxsShipToService.searchCount with tableCriteriaDomain as an argument.
     * 
     * - 検索条件の移送
     *       Wt014ShipToSelectCriteriaDomainよりTmNxsShipToCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 一括コピーできない項目を個別移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にtmNxsShipToService.searchCountの呼び出し
     * </pre>
     * @see com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToCriteriaDomain)
     * 
     */
    public int searchCount(Wt014ShipToSelectCriteriaDomain criteria)
        throws ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        TmNxsShipToCriteriaDomain tableCriteriaDomain = new TmNxsShipToCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteria);

        // Wild card Replace.
        String shipToNm = tableCriteriaDomain.getShipToNm();
        String shipToNmAbb = tableCriteriaDomain.getShipToNmAbb();
        if(shipToNm != null) {
            String escShipToNm =
                shipToNm.replace("%", "\"%\"").replace("_", "\"_\"");
            tableCriteriaDomain.setShipToNm(escShipToNm);
        }
        if(shipToNmAbb != null) {
            String escShipToNmAbb =
                shipToNmAbb.replace("%", "\"%\"").replace("_", "\"_\"");
            tableCriteriaDomain.setShipToNmAbb(escShipToNmAbb);
        }
        
        // To transfer individual items that can not be bulk copy.
        tableCriteriaDomain.setShipToCdLikeFront(criteria.getShipToCd());
        tableCriteriaDomain.setShipToCd(null);
        tableCriteriaDomain.setShipToNmLikeFront(tableCriteriaDomain.getShipToNm());
        tableCriteriaDomain.setShipToNm(null);
        tableCriteriaDomain.setShipToNmAbbLikeFront(tableCriteriaDomain.getShipToNmAbb());
        tableCriteriaDomain.setShipToNmAbb(null);

        return wt014ShipToSelectDao.searchCount(tableCriteriaDomain); // NL040 MOD
    }

}
