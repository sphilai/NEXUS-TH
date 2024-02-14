/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.Wt017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt017ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListBorderDateDomain;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt017ShippingActWarnListService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of Shipping Actuality Warning
 * List Sub Screen. <br />
 * <br />船積実績ワーニングリスト子画面の初期処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt017InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt017ListDomain>, Wt017CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt017ShippingActWarnListService
     */
    private Wt017ShippingActWarnListService wt017ShippingActWarnListService;

    /**
     * Default constructor.
     */
    public Wt017InitFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wt017ShippingActWarnListService.
     * </p>
     * 
     * @param wt017ShippingActWarnListService Set for
     *            wt017ShippingActWarnListService
     */
    public void setWt017ShippingActWarnListService(
        Wt017ShippingActWarnListService wt017ShippingActWarnListService) {
        this.wt017ShippingActWarnListService = wt017ShippingActWarnListService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected Wt017CriteriaDomain filterDomain(Wt017CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *     - Validate search criteria
     *     - If there is an error
     * 
     * - 共通エラーチェック
     *     - 検索条件を検証
     *     - エラーがある場合
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        // Validate search criteria.
        Validator<Wt017CriteriaDomain> valid = new Validator<Wt017CriteriaDomain>(
            criteriaDomain, "wt017CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT017);

        // Check error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Wt017CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#databaseCheck(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Wt017CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Shipping Actuality Warning information.
     * 船積実績ワーニング情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt017ShippingActWarnListCriteriaDomain tableCriteriaDomain.
     * - Get the number of NEXUS Company Master search results.
     *     Call wt017ShippingActWarnListService.searchCountTmNxsComp with tableCriteriaDomain as an argument.
     * - Get the data of NEXUS Company Master search results.
     *     Call wt017ShippingActWarnListService.searchByConditionTmNxsComp with tableCriteriaDomain as an argument.
     * - Clean the contents of the tableCriteriaDomain.etdBorderDateList.
     * - Get GMT date.
     * - Create a list of domain(Wt017ListDomain).
     *     - Transfer the results of wt017ShippingActWarnListService.searchByConditionForPaging to the list of Wt017ListDomain.
     * - Set etdBorderDate.
     * - Get the number of Invoice table search results.
     *     Call wt017ShippingActWarnListService.searchCountTtInvoice with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt017ShippingActWarnListService.searchByConditionForPagingTtInvoice with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt017ListDomain), return it.
     *     - Transfer the results of wt017ShippingActWarnListService.searchByConditionForPagingTtInvoice to the list of Wt017ListDomain.
     *     - Return the list of Wt017ListDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりWt017ShippingActWarnListCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - NEXUS会社原単位テーブルの検索件数を取得
     *       tableCriteriaDomainを引数にwt017ShippingActWarnListService.searchCountTmNxsCompの呼び出し
     * - NEXUS会社原単位テーブルの検索結果を取得
     *       tableCriteriaDomainを引数にwt017ShippingActWarnListService.searchByConditionTmNxsCompの呼び出し
     * - etdBorderDateListのクリア
     * - 世界標準日付を取得
     * - 検索結果リストドメインWt017ListDomainのリストを作成
     *       wt017ShippingActWarnListService.searchByConditionTmNxsCompの呼び出し結果をWt017ListDomainのリストに移送
     * - ETD境界日のセット
     * - インボイステーブルの検索件数を取得
     *       tableCriteriaDomainを引数にwt017ShippingActWarnListService.searchCountTtInvoiceの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - インボイステーブルの 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt017ShippingActWarnListService.searchByConditionForPagingTtInvoiceの呼び出し
     * - 検索結果リストドメインWt017ListDomainのリストを作成し、返却
     *       - wt017ShippingActWarnListService.searchByConditionForPagingTtInvoiceの呼び出し結果をWt017ListDomainのリストに移送
     *       - Wt017ListDomainのリストを返却
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.
     *      AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt017ListDomain> callServices(
        Wt017CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt017ShippingActWarnListCriteriaDomain tableCriteriaDomain = 
            new Wt017ShippingActWarnListCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        List<Wt017ShippingActWarnListBorderDateDomain> etdBorderDateList =
            new ArrayList<Wt017ShippingActWarnListBorderDateDomain>();

        // Get the search results count.
        wt017ShippingActWarnListService.searchCountTmNxsComp(tableCriteriaDomain);

        // Call search service.
        List<Wt017ShippingActWarnListDomain> tableResultDomainList = 
            wt017ShippingActWarnListService
            .searchByConditionTmNxsComp(tableCriteriaDomain);
        
        // Clean the contents of the tableCriteriaDomain.etdBorderDateList. 
        etdBorderDateList.clear();

        // Get GMT date.
        Calendar calendar = Calendar.getInstance();
        Date localeDate = calendar.getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat(Eca0027Constants.CONVERT_DATE_FORMAT);
        sdf1.setTimeZone(TimeZone.getTimeZone(Eca0027Constants.TIMEZONE_ID_GMT));
        String gmtString = sdf1.format(localeDate).toUpperCase();
        Date gmtDate;
        try {
            SimpleDateFormat sdf2 = new SimpleDateFormat(Eca0027Constants.CONVERT_DATE_FORMAT);
            gmtDate = sdf2.parse(gmtString);
        } catch (ParseException e) {
            throw new SystemException(Eca0027Constants.NXS_91_0001, e);
        }   
        
        if (tableResultDomainList != null) {
            for (Wt017ShippingActWarnListDomain resultDomain : tableResultDomainList) {
                Wt017ShippingActWarnListBorderDateDomain etdBorderDate = 
                    new Wt017ShippingActWarnListBorderDateDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(etdBorderDate, resultDomain);

                // Set etdBorderDate.
                Date shipperDate = 
                    DateUtil.convertTime(gmtDate, resultDomain.getTimezoneId());
                Calendar shipperCalendar = Calendar.getInstance();
                shipperCalendar.setTime(shipperDate);
                shipperCalendar.clear(Calendar.AM_PM);
                shipperCalendar.clear(Calendar.HOUR);
                shipperCalendar.clear(Calendar.HOUR_OF_DAY);
                shipperCalendar.clear(Calendar.MINUTE);
                shipperCalendar.clear(Calendar.SECOND);
                shipperCalendar.clear(Calendar.MILLISECOND);
                shipperCalendar.add(Calendar.DATE, -2);
                shipperDate = shipperCalendar.getTime();

                etdBorderDate.setEtdBorderDate(shipperDate);

                etdBorderDateList.add(etdBorderDate);
            }
        }
        tableCriteriaDomain.setEtdBorderDateList(etdBorderDateList);

        // Get the search results count.
        int totalCount = wt017ShippingActWarnListService
            .searchCountTtInvoice(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(totalCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Clean the contents of the criteria.
        tableResultDomainList = null ;

        // Call search service.
        tableResultDomainList = wt017ShippingActWarnListService
            .searchByConditionForPagingTtInvoice(tableCriteriaDomain);

        List<Wt017ListDomain> listDomainList = new ArrayList<Wt017ListDomain>();
        if (tableResultDomainList != null) {

            for (Wt017ShippingActWarnListDomain resultDomain : tableResultDomainList) {
                Wt017ListDomain listDomain = new Wt017ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(
                    listDomain, resultDomain, criteriaDomain.getScreenDateFormat());
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}