/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB005ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB005UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of the Facade service to Init action of ordering search detailed screen.
 * <br />受注検索詳細画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 6774 $
 */
public class WB005InitFacadeServiceImpl extends
    AbstractSearchFacadeService<WB005UpdateDomain, WB005CriteriaDomain> {

    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB005InitFacadeServiceImpl() {
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB005CriteriaDomain filterDomain(
        WB005CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
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
    protected void validateItems(WB005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

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
    protected void validateDatabase(WB005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving search-condition domain
     *       {@link WB001OdrRcvCriteriaDomain} is created and the contents of {@link WB005CriteriaDomain} are set up.
     *
     * - Export-Receive-Order information retrieval
     *       This is an argument about created {@link WB001OdrRcvCriteriaDomain},
     *       This is a call about {@link WB001OdrRcvService#searchForPagingOnDetailInit (WB001OdrRcvCriteriaDomain)}.
     *
     * A create of - Update domain
     *       {@link WB005UpdateDomain} is created based on search results.
     *
     * A return of - Update domain
     * 
     * - Customer Order Receiving検索条件ドメインの作成
     *     {@link WB001OdrRcvCriteriaDomain}を作成し、{@link WB005CriteriaDomain}の内容を設定
     *     
     * - 輸出受注情報検索
     *     作成した{@link WB001OdrRcvCriteriaDomain}を引数に、
     *     {@link WB001OdrRcvService#searchForPagingOnDetailInit(WB001OdrRcvCriteriaDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     検索結果をもとに{@link WB005UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB005UpdateDomain callServices(WB005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Date format
        // 日付フォーマット
        String dateFormat = criteriaDomain.getScreenDateFormat();

        // BL domain -- repacking
        // BLドメインへの詰め替え
        WB001OdrRcvCriteriaDomain wB001OdrRcvCriteriaDomain = new WB001OdrRcvCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wB001OdrRcvCriteriaDomain, criteriaDomain);
        wB001OdrRcvCriteriaDomain.setPkgCd(convertBlankToSpace(criteriaDomain.getPkgCd()));
        wB001OdrRcvCriteriaDomain.setPageInfoCreator(criteriaDomain.getPageInfoCreator());

        // Retrieval processing
        // 検索処理
        List<? extends WB001OdrRcvDomain> resultList = wb001OdrRcvService
            .searchForPagingOnDetailInit(wB001OdrRcvCriteriaDomain);

        // Search results
        // 検索結果
        List<WB005ListDomain> listDomainList = new ArrayList<WB005ListDomain>();

        // header information
        // ヘッダ情報
        BigDecimal totalOrderQty = new BigDecimal(0);
        BigDecimal totalAllocQty = new BigDecimal(0);
        BigDecimal totalShippedQty = new BigDecimal(0);

        for (Iterator<? extends WB001OdrRcvDomain> i = resultList.iterator(); i
            .hasNext();) {
            WB001OdrRcvDomain odrRcvDomain = i.next();
            WB005ListDomain listDomain = new WB005ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(listDomain, odrRcvDomain);
            listDomain.setEtdDueDt(DateUtil.formatDate(odrRcvDomain
                .getEtdDueDt(), dateFormat));
            listDomain.setCustomerDueDt(DateUtil.formatDate(odrRcvDomain
                .getCustomerDueDt(), dateFormat));

            // The total of the information displayed on header
            // ヘッダに表示する情報の集計
            totalOrderQty = totalOrderQty.add(odrRcvDomain.getOdrQty());
            totalAllocQty = totalAllocQty.add(odrRcvDomain.getPltzAllocQty());
            totalShippedQty = totalShippedQty.add(odrRcvDomain.getShippedQty());

            listDomainList.add(listDomain);
        }

        WB005UpdateDomain updateDomain = new WB005UpdateDomain();

        // An information is set to header information area.
        // ヘッダ情報エリアに情報を設定
        criteriaDomain.setOdrQty(String.valueOf(totalOrderQty));
        criteriaDomain.setPltzAllocQty(String.valueOf(totalAllocQty));
        criteriaDomain.setShippedQty(String.valueOf(totalShippedQty));

        CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteriaDomain);

        updateDomain.setListDomainList(listDomainList);
        return updateDomain;
    }
    
    /**
     * When an argument is Blank, Space is returned, and in except, an argument is returned.
     * <br />引数がBlankの場合Spaceを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Blank, this is a VALUE of an argument except Space.<br />Blankの場合Space、以外は引数の値
     */
    protected String convertBlankToSpace(String val){
        if (StringUtils.isBlank(val)){
            return new String(" ");
        } else {
            return val;
        }
    }
}
