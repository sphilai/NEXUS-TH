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
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0503CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0503ResultDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws0503.<BR>
 * Ws0503のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class Ws0503ResourceImpl extends AbstractResourceImpl implements
        Ws0503Resource {

    /**
     * <p>
     * FacadeService object of Ws0503<BR>
     * Ws0503のFacadeServiceオブジェクト
     * </p>
     */
    private SearchFacadeService<Ws0503ResultDomain, Ws0503CriteriaDomain> ws0503SearchFacadeService;

    /**
     * <p>
     * Constractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws0503ResourceImpl() {
    }

    /**
     * <p>
     * Setter method of FacadeService object of Ws0503<BR>
     * Ws0503のFacadeServiceオブジェクト のセッターメソッドです。
     * </p>
     *
     * @param ws0503SearchFacadeService
     *            WS0503のFacadeServiceオブジェクト に設定する
     */
    public void setWs0503SearchFacadeService(
            SearchFacadeService<Ws0503ResultDomain, Ws0503CriteriaDomain> ws0503SearchFacadeService) {
        this.ws0503SearchFacadeService = ws0503SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws0503Resource#getQRCheckInformation(
     *      java.lang.String)
     */
    public Ws0503ResultDomain getQRCheckInformation(String dscId)
        throws AiwsApplicationException {

        Ws0503ResultDomain resultDomain = null;
        
        try {
            // 入力用ドメインの作成
            Ws0503CriteriaDomain inputDomain = new Ws0503CriteriaDomain(dscId);

            // ロケーションコードを設定
            inputDomain.setLanguageCd(super.getLanguageCd());

            // Facadeサービスの実行
            resultDomain = ws0503SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws0503ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws0503ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws0503ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }

}