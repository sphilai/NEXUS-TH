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
import com.globaldenso.eca0027.core.business.domain.Ws4504ProcessFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4504ProcessFacadeServiceInputDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Resource Implement Class(Ws_4504)
 * WS4504のリソース実装クラスです。
 * </p>
 * 
 * @version 1.00
 */
public class Ws4504ResourceImpl extends AbstractResourceImpl implements Ws4504Resource {
    /**
     * Ws4504UpdateFacadeServiceImplのフィールド
     */
    private ProcessFacadeService<Ws4504ProcessFacadeServiceResultDomain, Ws4504ProcessFacadeServiceInputDomain> ws4504ProcessFacadeService;
    /**
     * <p>
     * Constracta
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4504ResourceImpl() {
    }
    /**
     * <p>
     * ws4504UpdateFacadeServiceを実行します
     * </p>
     * 
     * @param dscId DSCID of User ユーザのDHCID
     * @param compCd Current Warehouse Compnany Code (プリンタ保有)拠点間会社コード
     * @param printerId Printer ID プリンタID
     * @param stgActNo Staging Actuality No. 山作り実績NO
     * @param screenId 画面ID
     * @return Ws4504UpdateFacadeServiceResultDomain Execution Result 実行結果
     * @throws AiwsApplicationException On Failure to Get Printer Information プリンタ情報取得に失敗した場合
     */
    public Ws4504ProcessFacadeServiceResultDomain printStagingActuality(String dscId,
        String compCd, String printerId, String stgActNo, String screenId) throws AiwsApplicationException {
        Ws4504ProcessFacadeServiceResultDomain resultDomain = new Ws4504ProcessFacadeServiceResultDomain();
        
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
            
            // Create Input Domain 入力用ドメインの作成
            Ws4504ProcessFacadeServiceInputDomain inputDomain = createInputDomain(dscId, compCd,
                printerId, stgActNo, paramScreenId);
            // Execute FacadeService FacadeServiceの実行
            resultDomain = ws4504ProcessFacadeService.process(inputDomain);
            
        } catch (ValidationException e) {
            resultDomain = new Ws4504ProcessFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws4504ProcessFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws4504ProcessFacadeServiceResultDomain(WS_RESULT_ERROR,
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
     * @param compCd company code 会社コード
     * @param printerId printer IDプリンタID
     * @param stgActNo Staging Actuality No. 山作り実績NO
     * @param screenId 画面ID
     * @return inputDomain input Domain入力用ドメイン
     */
    private Ws4504ProcessFacadeServiceInputDomain createInputDomain(String dscId, String compCd,
        String printerId, String stgActNo, String screenId) {
        Ws4504ProcessFacadeServiceInputDomain inputDomain = new Ws4504ProcessFacadeServiceInputDomain();
        inputDomain.setDscId(dscId);
        inputDomain.setCompCd(compCd);
        inputDomain.setPrinterId(printerId);
        inputDomain.setStgActNo(stgActNo);
        inputDomain.setScreenId(screenId);
        inputDomain.setLocale(DensoContext.get().getLocale());
        return inputDomain;
    }


    /**
     * <p>Setter method for Ws4504ProcessFacadeService</p>
     *
     * @param ws4504ProcessFacadeService Set for Ws4504ProcessFacadeService
     */
    public void setWs4504ProcessFacadeService(
        ProcessFacadeService<Ws4504ProcessFacadeServiceResultDomain, Ws4504ProcessFacadeServiceInputDomain> ws4504ProcessFacadeService) {
        this.ws4504ProcessFacadeService = ws4504ProcessFacadeService;
    }

}
