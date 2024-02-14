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
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0501CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501ResultDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws0501.<BR>
 * Ws0501のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 10657 $
 */
public class Ws0501ResourceImpl extends AbstractResourceImpl implements
        Ws0501Resource {

    /**
     * <p>
     * FacadeService object of WS0501<BR>
     * Ws0501のFacadeServiceオブジェクト
     * </p>
     */
    private SearchFacadeService<Ws0501ResultDomain, Ws0501CriteriaDomain> ws0501SearchFacadeService;

    /**
     * <p>
     * Constractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws0501ResourceImpl() {
    }

    /**
     * <p>
     * Setter method of FacadeService object of Ws0501<BR>
     * Ws0501のFacadeServiceオブジェクト のセッターメソッドです。
     * </p>
     *
     * @param ws0501SearchFacadeService
     *            WS0501のFacadeServiceオブジェクト に設定する
     */
    public void setWs0501SearchFacadeService(
            SearchFacadeService<Ws0501ResultDomain, Ws0501CriteriaDomain> ws0501SearchFacadeService) {
        this.ws0501SearchFacadeService = ws0501SearchFacadeService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws0501Resource#getLoginInformation(
     *      java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String,
     *      java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws0501ResultDomain getLoginInformation(String dscId, String pinCode,
            String countryCode, String timezoneCode, 
            String deviceTypeId, String mainExeVersion,
            String palletizeDllVersion, String carryIODllVersion,
            String shippingDllVersion, String settingDllVersion,
            String commonDllVersion) throws AiwsApplicationException {

        Ws0501ResultDomain resultDomain = null;

        try {
            // 入力用ドメインの作成
            Ws0501CriteriaDomain inputDomain = new Ws0501CriteriaDomain(dscId,
                    pinCode, countryCode, timezoneCode, deviceTypeId,
                    mainExeVersion, palletizeDllVersion,
                    carryIODllVersion, shippingDllVersion, settingDllVersion,
                    commonDllVersion);
            // ロケーションコードを設定
            inputDomain.setLanguageCd(super.getLanguageCd());

            // Facadeサービスの実行
            resultDomain = ws0501SearchFacadeService.search(inputDomain);
        } catch (ValidationException e) {
            resultDomain = new Ws0501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws0501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws0501ResultDomain(WS_RESULT_ERROR, super
                    .getErrorList(e.getCode()));
        }

        return resultDomain;
    }
}