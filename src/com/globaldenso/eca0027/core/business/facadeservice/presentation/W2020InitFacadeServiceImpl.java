/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The init service facade implementation class of Multi Label Register Screen
 * <br />Multi Label Register画面の初期表示facadeサービス実装クラスです。
 * <pre>
 * bean id:w2020SearchFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020InitFacadeServiceImpl extends
    AbstractSearchFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * Constructor.
     */
    public W2020InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2020CriteriaDomain filterDomain(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w2020CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     *
     * If return from the packaging material screen, call the service to get the G/W and RT flag.
     * <br />包装材画面からの戻る場合、G/WとRTフラグを取得するサービスを呼び出す。
     *
     * <pre>
     * - PL domain -> BL domain transfer
     * - Call the search service
     * - BL domain -> PL domain transfer.
     * - Temporarily to use the copyProperties order to perform the type conversion automatically.
     * - PLドメイン→BLドメイン移送
     * - 検索するサービス呼び出し
     * - BLドメイン→PLドメイン移送
     * - 型変換を自動で行うため一時的にcopyPropertiesを使用。
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2020CriteriaDomain callServices(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W2009CmlCriteriaDomain cmlCriteriaDomain = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteriaDomain,
            w2020CriteriaDomain, w2020CriteriaDomain.getScreenDateFormat());
        cmlCriteriaDomain.setLengthUnit(w2020CriteriaDomain.getShipperLengthUnit());
        cmlCriteriaDomain.setVolumeUnit(w2020CriteriaDomain.getShipperVolumeUnit());
        cmlCriteriaDomain.setWeightUnit(w2020CriteriaDomain.getShipperWeightUnit());

        W2009CmlDomain resultCmlDomain = w2009CmlService.searchOnMultiLabelPkgMaterialsReturn(cmlCriteriaDomain);

        // BL domain -> PL domain transfer.
        // Temporarily to use the copyProperties order to perform the type conversion automatically.
        // BLドメイン→PLドメイン移送
        // 型変換を自動で行うため一時的にcopyPropertiesを使用。
        W2020CriteriaDomain tempW2020CriteriaDomain = null;
        tempW2020CriteriaDomain = new W2020CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tempW2020CriteriaDomain,
            resultCmlDomain, w2020CriteriaDomain.getScreenDateFormat());
        w2020CriteriaDomain.setRtUseFlg(resultCmlDomain.getRtUseFlg());
        if (!FLAG_Y.equals(w2020CriteriaDomain.getManualRegFlg())) {
            w2020CriteriaDomain.setGrossWeight(tempW2020CriteriaDomain.getGrossWeight());
            w2020CriteriaDomain.setOverflowFieldList(resultCmlDomain.getOverflowFieldList());
        }

        return w2020CriteriaDomain;
    }
}
