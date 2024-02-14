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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsT501CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of WsT501.<BR>
 * WsT501のリソース実装クラスです。
 * </p>
 *
 * @version 1.00
 */
public class WsT501ResourceImpl extends AbstractResourceImpl implements
        WsT501Resource {

    /**
     * <p>
     * FacadeService object of WsT501<BR>
     * WsT501のFacadeServiceオブジェクト
     * </p>
     */
    private SearchFacadeService<ResultDomain, WsT501CriteriaDomain> wsT501SearchFacadeService;

    /**
     * <p>
     * Constractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public WsT501ResourceImpl() {
    }

    /**
     * <p>
     * Setter method of FacadeService object of WsT501<BR>
     * WsT501のFacadeServiceオブジェクト のセッターメソッドです。
     * </p>
     *
     * @param wsT501SearchFacadeService
     *            WsT501のFacadeServiceオブジェクト に設定する
     */
    public void setWsT501SearchFacadeService(
            SearchFacadeService<ResultDomain, WsT501CriteriaDomain> wsT501SearchFacadeService) {
        this.wsT501SearchFacadeService = wsT501SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.bht.wT.WsT501Resource#checkUnlockBHT(
     *      java.lang.String, java.lang.String)
     */
    public ResultDomain checkUnlockBHT(String dscId, String mgrDscId)
        throws AiwsApplicationException {

        ResultDomain resultDomain = null;

        try {
            // 入力用ドメインの作成
            WsT501CriteriaDomain inputDomain = new WsT501CriteriaDomain(dscId,
                    mgrDscId);

            // ロケーションコードを設定
            inputDomain.setLanguageCd(super.getLanguageCd());

            // Facadeサービスの実行
            resultDomain = wsT501SearchFacadeService.search(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }
}