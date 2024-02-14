/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * This is an implement class of the Facade service to PrintCml action of a Multi Label Register Screen.
 * <br />Multi Label Register画面のPrintCmlアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id:W2020PrintCmlFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020PrintCmlFacadeServiceImpl extends AbstractSearchFacadeService<File, W2020CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * Palletize Service
     * <br />パレタイズ サービス
     */
    private TtPltzService ttPltzService;

    /**
     * constructor.
     */
    public W2020PrintCmlFacadeServiceImpl() {
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
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * <br />処理なし
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
     * 
     * <pre>
     * Check that there is a main mark specified.
     * メインマーク指定があることをチェックする。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W2020CriteriaDomain> valid
            = new Validator<W2020CriteriaDomain>(w2020CriteriaDomain, "w2020CriteriaDomain");

        String[] properties = {
            "fromMainMark",
            "toMainMark",
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2020);

        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}.
     *
     * Call the download file creation service
     * <br />ダウンロードファイル作成サービスを呼び出す。
     *
     * <pre>
     * - PL domain -> BL domain transfer
     * - Target main mark list specific
     * - Call the download file creation service
     * - PLドメイン→BLドメイン移送
     * - 対象メインマーク一覧特定
     * - ダウンロードファイル作成サービスを呼び出す。
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W2020CriteriaDomain w2020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W2009CmlCriteriaDomain cmlCriteriaDomain = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(cmlCriteriaDomain, w2020CriteriaDomain);

        // Target main mark list specific
        // 対象メインマーク一覧特定
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setMainMarkGreaterThanEqual(w2020CriteriaDomain.getFromMainMark());
        ttPltzCriteriaDomain.setMainMarkLessThanEqual(w2020CriteriaDomain.getToMainMark());
        ttPltzCriteriaDomain.setPreferredOrder("MAIN_MARK");
        List<TtPltzDomain> resultList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
        List<String> mainMarkList = new ArrayList<String>();
        for (TtPltzDomain result : resultList) {
            mainMarkList.add(result.getMainMark());
        }
        cmlCriteriaDomain.setMainMarkList(mainMarkList);

        // Call multi CML print service
        // 複数CML印刷サービス呼び出し
        return w2009CmlService.printMultiCml(cmlCriteriaDomain, w2020CriteriaDomain.getReportDateFormat());
    }
}
