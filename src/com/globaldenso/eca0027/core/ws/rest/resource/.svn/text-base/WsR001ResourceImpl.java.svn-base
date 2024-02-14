/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.WsR001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001MigrationCaseMarkRootCriteriaDomain;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Resource implementation class for the wsR001.
 * <br />wsR001のリソース実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11994 $
 */
public class WsR001ResourceImpl extends AbstractResourceImpl implements WsR001Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private TransactFacadeService<WsR001ResultDomain, WsR001CriteriaDomain> wsR001FacadeService;

    /**
     * constructor.
     */
    public WsR001ResourceImpl() {

    }

    /**
     * Getter method for wsR001FacadeService.
     *
     * @return the wsR001FacadeService
     */
    public TransactFacadeService<WsR001ResultDomain, WsR001CriteriaDomain> getWsR001FacadeService() {
        return wsR001FacadeService;
    }
    
    /**
     * Setter method for wsR001FacadeService.
     *
     * @param wsR001FacadeService Set for wsR001FacadeService
     */
    public void setWsR001FacadeService(
        TransactFacadeService<WsR001ResultDomain, WsR001CriteriaDomain> wsR001FacadeService) {
        this.wsR001FacadeService = wsR001FacadeService;
    }

    /**
     * 
     * {@inheritDoc}.
     * 
     * <pre>
     * (1) Store Case Mark info to temporary table from parameter of request. 
     * (2) repeat the following process in the unit of case mark.
     * (3) join the master data after perform Palletize check.
     * (4) Print error report, if Palletize check error. 
     * (5) Register Palletize info and perform Case Mark print program.
     * </pre>
     * <pre>
     * (1) リクエストパラメータで受け取ったケースマークの情報を一時テーブルに保管する。
     * (2) 保管した情報には複数ケースマークの情報を含むため、ケースマーク単位で以下の処理を繰り返す。
     * (3) 原単位の情報を結合し、パレタイズチェックを行う。
     * (4) パレタイズチェックでエラー検出の場合、エラーレポート出力プログラムを呼び出し、エラーレポートを印刷する。
     * (5) パレタイズチェックで正常の場合、パレタイズ情報を登録後、ケースマーク帳票出力プログラムを呼び出し、ケースマークを印刷する。
     * </pre>
     *
     * @param wsR001Criteria parameter domain<br />パラメータドメイン
     * @return result domain<br />結果用ドメイン
     */
    public WsR001ResultDomain migrationCmlPrint(String wsR001Criteria) throws AiwsApplicationException {

        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        WsR001MigrationCaseMarkRootCriteriaDomain migrationCaseMarkItemDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        System.out.println(wsR001Criteria);
        migrationCaseMarkItemDomain = XmlUtil.unmarshal(WsR001MigrationCaseMarkRootCriteriaDomain.class, wsR001Criteria);
        
        WsR001CriteriaDomain criteriaDomain = new WsR001CriteriaDomain();
        criteriaDomain.setMigrationCaseMarkRoot(migrationCaseMarkItemDomain);

        // Generation of Result Domain
        // Result Domainの生成
        WsR001ResultDomain resultDomain = new WsR001ResultDomain();
        
        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            resultDomain = this.wsR001FacadeService.transact(criteriaDomain);
            
        } catch (ValidationException e) {
            List<String> errorList = new ArrayList<String>();
            if (e.getErrors() != null) {
                for (MessageDomain domain : e.getErrors()) {
                    if (domain.getParams() != null && domain.getParams().length > 0) {
                        errorList.add(domain.getParams()[0].toString());
                    }
                }
            }
            resultDomain = new WsR001ResultDomain(WS_RESULT_ERROR, errorList);
            
        // ST954 MOD START
        //} catch (GscmApplicationException e) {
        //    resultDomain = new WsR001ResultDomain(WS_RESULT_ERROR_SYSTEM, Arrays.asList(e.getCode()));
        //} catch (ApplicationException e) {
        //    resultDomain = new WsR001ResultDomain(WS_RESULT_ERROR_SYSTEM, Arrays.asList(e.getCode()));
        //}
        } catch (Exception e) {
            throw new SystemException(e);
        }
        // ST954 MOD END
        
        return resultDomain;
    }
}
