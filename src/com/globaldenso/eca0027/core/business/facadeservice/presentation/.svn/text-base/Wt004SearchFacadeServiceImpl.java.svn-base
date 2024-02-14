/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt004ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt004PkgSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Package Search Sub
 * Screen. <br />
 * 包装材選択子画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt004SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<Wt004ListDomain>, Wt004CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CONDITION_PROPERTIES = {
        "pkgItemNo", "modelCd"};

    /**
     * wt004PkgSelectService
     */
    private Wt004PkgSelectService wt004PkgSelectService;

    /**
     * Default constructor.
     */
    public Wt004SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt004PkgSelectService.</p>
     *
     * @param wt004PkgSelectService Set for wt004PkgSelectService
     */
    public void setWt004PkgSelectService(Wt004PkgSelectService wt004PkgSelectService) {
        this.wt004PkgSelectService = wt004PkgSelectService;
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
    protected Wt004CriteriaDomain filterDomain(Wt004CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     * 
     * - 共通エラーチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        // Validate search criteria.
        Validator<Wt004CriteriaDomain> valid = new Validator<Wt004CriteriaDomain>(
            criteriaDomain, "wt004CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CONDITION_PROPERTIES,
            criteriaDomain.getScreenId());

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
    protected void validateConsistency(Wt004CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt004CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Package information.
     * 包装材情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt004PkgSelectCriteriaDomain tableCriteriaDomain.
     * - Set criteria(lngCdDefault) in the English .
     * - Get the number of search results.
     *     Call wt004PkgSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get &quot;from&quot; and &quot;to&quot; by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt004PkgSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WT004ListDomain), return it.
     *     - Transfer the results of wt004PkgSelectService.searchByConditionForPaging to the list of WT004ListDomain.
     *     - Return the list of WT004ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt004PkgSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索条件(lngCdDefault)に英語を設定
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt004PkgSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt004PkgSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWT004ListDomainのリストを作成し、返却
     *       - wt004PkgSelectService.searchByConditionForPagingの呼び出し結果をWT004ListDomainのリストに移送
     *       - WT004ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt004ListDomain> callServices(
        Wt004CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt004PkgSelectCriteriaDomain tableCriteriaDomain = new Wt004PkgSelectCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
            
        // Set criteria(lngCdDefault) in the English .
        tableCriteriaDomain.setLngCdDefault(Eca0027Constants.LANGUAGE_CD_ENGLISH);
        
        // Get the search results count.
        int totalCount = wt004PkgSelectService.searchCount(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(totalCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());
        
        // Call search service.
        List<Wt004PkgSelectDomain> tableResultDomainList = wt004PkgSelectService
            .searchByConditionForPaging(tableCriteriaDomain);

        List<Wt004ListDomain> listDomainList = new ArrayList<Wt004ListDomain>();
        if (tableResultDomainList != null) {
            for (Wt004PkgSelectDomain resultDomain : tableResultDomainList) {
                Wt004ListDomain listDomain = new Wt004ListDomain();
                
                String rtTyp = resultDomain.getRtTyp();
                if(Eca0027Constants.RT_TYP_1WAY .equals(rtTyp)) {
                    resultDomain.setRtTyp(Eca0027Constants.FLAG_N);
                } else if(Eca0027Constants.RT_TYP_DOMESTIC.equals(rtTyp)
                    || Eca0027Constants.RT_TYP_GLOBAL.equals(rtTyp)) {
                    resultDomain.setRtTyp(Eca0027Constants.FLAG_Y);
                }
                
                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}
