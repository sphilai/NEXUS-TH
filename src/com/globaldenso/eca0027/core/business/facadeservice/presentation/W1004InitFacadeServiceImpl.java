/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Locale;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.business.domain.W1004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * The search service facade implementation class of Export Request Kit
 * <br />Export Request Kit画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W1004InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1004InitFacadeServiceImpl extends AbstractSearchFacadeService<W1004UpdateDomain, W1004UpdateDomain> {

    /**
     * w1001ExpRequestService service
     * <br />
     */
    protected W1001ExpRequestService w1001ExpRequestService;

    /**
     * ttExpRequestDtlService service
     * <br />
     */
    protected TtExpRequestDtlService ttExpRequestDtlService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W1004InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }
    
    /**
     * Setter method for ttExpRequestDtlService.
     *
     * @param expRequestDtlService Set for ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(TtExpRequestDtlService expRequestDtlService) {
        ttExpRequestDtlService = expRequestDtlService;
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
    protected W1004UpdateDomain filterDomain(W1004UpdateDomain criteriaDomain)
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
    protected void validateItems(W1004UpdateDomain criteriaDomain)
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
    protected void validateConsistency(W1004UpdateDomain criteriaDomain)
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
    protected void validateDatabase(W1004UpdateDomain criteriaDomain)
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
    protected W1004UpdateDomain callServices(W1004UpdateDomain w1004UpdateDomain) 
        throws GscmApplicationException, ApplicationException {

        
        TtExpRequestDtlCriteriaDomain expDtlCriteriaDomain = new TtExpRequestDtlCriteriaDomain();
        expDtlCriteriaDomain.setExpRequestNo(w1004UpdateDomain.getCriteriaDomain().getExpRequestNo());
        expDtlCriteriaDomain.setKitParFlg(FLAG_Y);
        expDtlCriteriaDomain.setLocale(new Locale(w1004UpdateDomain.getCriteriaDomain().getLanguageCd()));
        
        int count = ttExpRequestDtlService.searchCount(expDtlCriteriaDomain);
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(w1004UpdateDomain.getCriteriaDomain().getPageInfoCreator(), count, w1004UpdateDomain.getCriteriaDomain());
        
        W1004UpdateDomain resultDomain = w1001ExpRequestService.searchOnKitDetailInit(w1004UpdateDomain);

        return resultDomain;
    }
    
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param w1004CriteriaDomain The search-condition domain of Export Request service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W1004CriteriaDomain w1004CriteriaDomain) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, w1004CriteriaDomain.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        w1004CriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        w1004CriteriaDomain.setRowNumTo(pageInfoData.getToCount());
    }
}
