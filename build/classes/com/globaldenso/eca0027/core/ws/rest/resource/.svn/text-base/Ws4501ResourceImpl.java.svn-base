/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4501SearchFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4501SearchFacadeServiceInputDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Resource Implement Class(Ws_4501)
 * WS4501のリソース実装クラスです
 * </p>
 * 
 * @author DensoSI
 * @version 1.00
 */
public class Ws4501ResourceImpl extends AbstractResourceImpl implements Ws4501Resource {
    /**
     * <p>
     * field of WS4501SearchfacadeserviceImple
     * WS4501のfacadeserviceImpleのフィールドです
     * <p>
     */
    protected SearchFacadeService<Ws4501SearchFacadeServiceResultDomain, Ws4501SearchFacadeServiceInputDomain> ws4501SearchFacadeService;

    /**
     * <p>
     * Constracta
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4501ResourceImpl() {
    }

    /**
     * <p>
     * execute ws4501SearchFacadeService
     * ws4501SearchFacadeServiceを実行します
     * </p>
     * 
     * @param dscId DSC-ID of Login User ログインユーザーのDSC-ID
     * @param stgInstrNo 荷揃え指示書NO
     * @param screenId 画面ID
     * @return resultDomain 実行結果
     */
    public Ws4501SearchFacadeServiceResultDomain getStagingInstruction(String dscId, String stgInstrNo, String screenId) {

        Ws4501SearchFacadeServiceResultDomain resultDomain = new Ws4501SearchFacadeServiceResultDomain();

        try {
            
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
            
            // make inputDomain for Ws4501SearchFacadeService 入力用ドメインの作成 
            Ws4501SearchFacadeServiceInputDomain inputDomain = createInputDomain(dscId, stgInstrNo, paramScreenId);
            

            // execute FacadeService FacadeServiceの実行
            resultDomain = ws4501SearchFacadeService.search(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(WS_RESULT_ERROR, 
                getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getCode()));
        }
        return resultDomain;
    }

    /**
     * 
     * <p>
     * Setter method for Ws4501SearchFacadeService
     * </p>
     * 
     * 
     * @param ws4501SearchFacadeService set for Ws4501SearchFacadeService
     */
    public void setWs4501SearchFacadeService(
        SearchFacadeService<Ws4501SearchFacadeServiceResultDomain, Ws4501SearchFacadeServiceInputDomain> ws4501SearchFacadeService) {
        this.ws4501SearchFacadeService = ws4501SearchFacadeService;
    }

    /**
     * <p>
     * Webサービスのパラメータから入力用ドメインを作成します。
     * </p>
     * 
     * @param dscId DHC-ID of BHT User BHTユーザのDHC-ID
     * @param stgInstrNo 荷揃えNO
     * @param screenId 画面ID
     * @return inputDomain 入力用ドメイン
     */
    protected Ws4501SearchFacadeServiceInputDomain createInputDomain(String dscId, String stgInstrNo, String screenId) {
        Ws4501SearchFacadeServiceInputDomain inputDomain = new Ws4501SearchFacadeServiceInputDomain();
        inputDomain.setDscId(dscId);
        inputDomain.setStgInstrNo(stgInstrNo);
        inputDomain.setScreenId(screenId);
        inputDomain.setLocale(DensoContext.get().getLocale());
        return inputDomain;
    }
}
