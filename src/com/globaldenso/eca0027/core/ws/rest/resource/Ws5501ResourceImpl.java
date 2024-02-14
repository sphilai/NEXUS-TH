/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5501ResultDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws5501.<BR>
 * Ws5501のリソース実装クラスです。
 * </p>
 *
 * @version 1.00
 */
public class Ws5501ResourceImpl extends AbstractResourceImpl implements
        Ws5501Resource {

    /**
     * <p>
     * FacadeService object of Ws5501<BR>
     * Ws5501のFacadeServiceオブジェクト
     * </p>
     */
    private SearchFacadeService<Ws5501ResultDomain, Ws5501CriteriaDomain> ws5501SearchFacadeService;

    /**
     * <p>
     * Constractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws5501ResourceImpl() {
    }

    /**
     * <p>
     * Setter method of FacadeService object of Ws5501<BR>
     * Ws5501のFacadeServiceオブジェクト のセッターメソッドです。
     * </p>
     *
     * @param ws5501SearchFacadeService
     *            Ws5501のFacadeServiceオブジェクト に設定する
     */
    public void setWs5501SearchFacadeService(
            SearchFacadeService<Ws5501ResultDomain, Ws5501CriteriaDomain> ws5501SearchFacadeService) {
        this.ws5501SearchFacadeService = ws5501SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws5501Resource#getShippingConfirm(
     *      java.lang.String, java.lang.String)
     */
    public Ws5501ResultDomain getShippingConfirm(String dscId,
            String shippingConfirmNo) throws AiwsApplicationException {

        Ws5501ResultDomain resultDomain = null;

        try {
            // 入力用ドメインの作成
            Ws5501CriteriaDomain inputDomain = new Ws5501CriteriaDomain(dscId,
                    shippingConfirmNo);
            // ロケーションコードを設定
            inputDomain.setLanguageCd(super.getLanguageCd());

            // Facadeサービスの実行
            resultDomain = ws5501SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws5501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws5501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws5501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }
}