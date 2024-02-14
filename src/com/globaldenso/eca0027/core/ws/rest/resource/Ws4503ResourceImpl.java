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

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4503CreateFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4503CreateFacadeServiceInputDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Resource Implement Class(Ws_4503)
 * Ws4503リソース実装クラスです。
 * </p>
 */
public class Ws4503ResourceImpl extends AbstractResourceImpl implements Ws4503Resource {
    /**
     * <p>
     * Field of WS4503
     * WS4503のFacadeServiceのフィールド
     * </p>
     */
    private TransactFacadeService<Ws4503CreateFacadeServiceResultDomain, Ws4503CreateFacadeServiceInputDomain> ws4503CreateFacadeService;

    /**
     * <p>
     * Default Costractor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4503ResourceImpl() {
    }

    /**
     * <p>
     * ws4503SearchFacadeServiceを実行します
     * </p>
     * 
     * @param dscId ユーザのDSC-ID
     * @param containerSortingKey コンテナ層別キー
     * @param trnsCd 輸送手段コード
     * @param containerLooseTyp コンテナルーズ区分
     * @param mainMark メインマークリスト(複数件)
     * @param transTypCd 輸送種別コード
     * @param curWhCompCd 現在倉庫会社コード
     * @param curWhCd 現在倉庫コード
     * @param screenId 画面ID
     * @return Ws4503SearchFacadeServiceResultDomain 出力結果
     * @throws AiwsApplicationException 山作り実績情報登録に失敗した場合
     */
    public Ws4503CreateFacadeServiceResultDomain createStagingActuality(String dscId,
        String containerSortingKey, String trnsCd, String containerLooseTyp, String mainMark,
        String transTypCd, String curWhCompCd, String curWhCd, String screenId) throws AiwsApplicationException {

        Ws4503CreateFacadeServiceResultDomain resultDomain = null;
        
        //BHTからのmainMark情報を','区切りで分割する
        List<String> mainMarkList = new ArrayList<String>();
        StringTokenizer mMList = new StringTokenizer(mainMark, ",");
        while (mMList.hasMoreTokens()) {
            mainMarkList.add(mMList.nextToken());
        }
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
            
            // 入力用ドメインの作成
            Ws4503CreateFacadeServiceInputDomain inputDomain = createInputDomain(dscId,
                containerSortingKey, trnsCd, containerLooseTyp, mainMarkList, transTypCd,
                curWhCompCd, curWhCd, paramScreenId);
            // FacadeServiceの実行
            resultDomain = ws4503CreateFacadeService.transact(inputDomain);

        } catch (ValidationException e) {
            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getErrors()));
        } catch (GscmApplicationException e) {
            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_ERROR, 
                getErrorList(e.getCode(), e.getArgs()));
        } catch (ApplicationException e) {
            resultDomain = new Ws4503CreateFacadeServiceResultDomain(WS_RESULT_ERROR,
                getErrorList(e.getCode()));
        }
        return resultDomain;
    }

    /**
     * <p>
     * Webサービスのパラメータから入力用ドメインを作成します。
     * </p>
     * 
     * @param dscId Webサービス呼出ユーザのDSC-ID
     * @param containerSortingKey コンテナ層別キー
     * @param trnsCd 輸送手段コード
     * @param containerLooseTyp コンテナルーズ区分
     * @param mainMark メインマークのリスト
     * @param transTypCd transTypCd輸送種別コード
     * @param curWhCompCd curWhCompC現在倉庫会社コード
     * @param curWhCd curWhCd現在倉庫コード
     * @param screenId 画面ID
     * @return Ws4503CreateFacadeServiceInputDomain facadeクラスへの入力ドメイン
     */
    private Ws4503CreateFacadeServiceInputDomain createInputDomain(String dscId,
        String containerSortingKey, String trnsCd, String containerLooseTyp, List<String> mainMark,
        String transTypCd, String curWhCompCd, String curWhCd, String screenId) {
        Ws4503CreateFacadeServiceInputDomain inputDomain = new Ws4503CreateFacadeServiceInputDomain();
        inputDomain.setDscId(dscId);
        inputDomain.setContainerSortingKey(containerSortingKey);
        inputDomain.setTrnsCd(trnsCd);
        inputDomain.setContainerLooseTyp(containerLooseTyp);
        inputDomain.setMainMark(mainMark);
        inputDomain.setTransTypCd(transTypCd);
        inputDomain.setCurWhCompCd(curWhCompCd);
        inputDomain.setCurWhCd(curWhCd);
        inputDomain.setScreenId(screenId);
        inputDomain.setLocale(DensoContext.get().getLocale());
        return inputDomain;
    }

    /**
     * <p>
     * Setter method for ws4503CreateFacadeService
     * WS4503のFacadeServiceのセッタ
     * </p>
     * 
     * @param ws4503CreateFacadeService ws4503CreateFacadeService
     */
    public void setWs4503CreateFacadeService(
        TransactFacadeService<Ws4503CreateFacadeServiceResultDomain, Ws4503CreateFacadeServiceInputDomain> ws4503CreateFacadeService) {
        this.ws4503CreateFacadeService = ws4503CreateFacadeService;
    }

}
