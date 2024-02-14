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

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4502UpdateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4502UpdateFacadeServiceInputDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Resource Implement Class(WS4502)
 * WS4502のリソース実装クラスです。
 * </p>
 * 
 * @version 1.00
 */
public class Ws4502ResourceImpl extends AbstractResourceImpl implements Ws4502Resource {

    /**
     * <p>
     * facadeserviceImple field(WS4502)
     * WS4502のfacadeserviceImpleのフィールドです
     * <p>
     */
    private UpdateFacadeService<Ws4502UpdateFacadeServiceResultDomain, Ws4502UpdateFacadeServiceInputDomain> ws4502UpdateFacadeService;

    /**
     * <p>
     * Constracta
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4502ResourceImpl() {
    }
    
    /**
     * <p>
     * Execute ws4502UpdateFacadeService
     * ws4502UpdateFacadeServiceを実行します
     * </p>
     * 
     * @param dscId DSC-ID of Login User ログインユーザーのDSC-ID
     * @param stgInstrNo Staging Instruction No. 荷揃え指示書NO
     * @param screenId 画面ID
     * @return result Execution Result 実行結果
     * @throws AiwsApplicationException アプリケーションエクセプション
     */
    public Ws4502UpdateFacadeServiceResultDomain getStagingInstruction(String dscId,
        String stgInstrNo, String screenId) throws AiwsApplicationException {
        Ws4502UpdateFacadeServiceResultDomain resultDomain = null;
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
            
            // 入力用ドメインの作成 Create Input Domain
            Ws4502UpdateFacadeServiceInputDomain inputDomain = createInputDomain(dscId, stgInstrNo, paramScreenId);

            // FacadeServiceの実行 Execute FacadeService
            resultDomain = ws4502UpdateFacadeService.update(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws4502UpdateFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws4502UpdateFacadeServiceResultDomain(WS_RESULT_ERROR, getErrorList(
                e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws4502UpdateFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getCode()));
        }
        return resultDomain;
    }

    /**
     * <p>
     * Create Input Domain from Parameter of WEB Service
     * Webサービスのパラメータから入力用ドメインを作成します。
     * </p>
     * 
     * @param dscId DHC-ID of BHT User BHTユーザのDHC-ID
     * @param stgInstrNo Staging Instruction No. 荷揃えNO
     * @param screenId 画面ID
     * @return inputDomain Input Domain 入力用ドメイン
     */
    private Ws4502UpdateFacadeServiceInputDomain createInputDomain(String dscId, String stgInstrNo, String screenId) {
        Ws4502UpdateFacadeServiceInputDomain inputDomain = new Ws4502UpdateFacadeServiceInputDomain();
        inputDomain.setDscId(dscId);
        inputDomain.setStgInstrNo(stgInstrNo);
        inputDomain.setScreenId(screenId);
        inputDomain.setLocale(DensoContext.get().getLocale());
        return inputDomain;
    }

    /**
     * <p>Setter method for Ws4502UpdateFacadeService</p>
     * 
     * @param ws4502UpdateFacadeService object of the ws4502UpdateFacadeService WS4502のFacadeServiceオブジェクト
     */
    public void setWs4502UpdateFacadeService(
        UpdateFacadeService<Ws4502UpdateFacadeServiceResultDomain, Ws4502UpdateFacadeServiceInputDomain> ws4502UpdateFacadeService) {
        this.ws4502UpdateFacadeService = ws4502UpdateFacadeService;
    }
}
