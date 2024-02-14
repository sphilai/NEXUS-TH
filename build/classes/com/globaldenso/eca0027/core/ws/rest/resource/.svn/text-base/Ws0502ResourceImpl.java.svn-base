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
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0502CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * The resource implementation class of Ws0502.<BR>
 * Ws0502のリソース実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class Ws0502ResourceImpl extends AbstractResourceImpl implements
        Ws0502Resource {

    /**
     * <p>
     * FacadeService object of Ws0502<BR>
     * Ws0502のFacadeServiceオブジェクト
     * </p>
     */
    private UpdateFacadeService<ResultDomain, Ws0502CriteriaDomain> ws0502UpdateFacadeService;

    /**
     * <p>
     * Constractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws0502ResourceImpl() {
    }

    /**
     * <p>
     * Setter method of FacadeService object of Ws0502<BR>
     * Ws0502のFacadeServiceオブジェクト のセッターメソッドです。
     * </p>
     *
     * @param ws0502UpdateFacadeService
     *            WS0502のFacadeServiceオブジェクト に設定する
     */
    public void setWs0502UpdateFacadeService(
            UpdateFacadeService<ResultDomain, Ws0502CriteriaDomain> ws0502UpdateFacadeService) {
        this.ws0502UpdateFacadeService = ws0502UpdateFacadeService;
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws0502Resource#chnagePassword(
     *      java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public ResultDomain chnagePassword(String dscId, String oldPinCode,
            String newPinCode, String screenId) throws AiwsApplicationException {

        ResultDomain resultDomain = null;
        String paramScreenId;

        // 2014.08.10 パラメータに画面ID追加。画面IDがない場合は半角スペースを設定
        if((screenId == null) || screenId.equals(""))
        {
            paramScreenId = " ";
        }
        else
        {
            paramScreenId = screenId;
        }
        try {
            // 入力用ドメインの作成
            Ws0502CriteriaDomain inputDomain = new Ws0502CriteriaDomain(dscId,
                    oldPinCode, newPinCode, paramScreenId);
            // ロケーションコードを設定
            inputDomain.setLanguageCd(super.getLanguageCd());

            // Facadeサービスの実行
            resultDomain = ws0502UpdateFacadeService.update(inputDomain);

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