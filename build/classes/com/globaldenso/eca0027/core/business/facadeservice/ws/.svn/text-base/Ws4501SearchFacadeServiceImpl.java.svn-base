/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS4501;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_STATUS_ISSUE_LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ECA0027_WS_4501Domain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws4501SearchFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws4501SearchFacadeServiceInputDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtStgService;

import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Implement Class of Facade Service(ECA0027_WS_4501)
 * ECA0027_WS_4501のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version 1.0
 */
public class Ws4501SearchFacadeServiceImpl
                extends AbstractSearchFacadeService<Ws4501SearchFacadeServiceResultDomain, Ws4501SearchFacadeServiceInputDomain> {

    /**
     * Field of WsGetStgInstrService
     * WsGetStgInstrServiceのフィールド
     */
    protected WsBhtStgService wsBhtStgService;

    /**
     * Default Constructor
     * デフォルトコンストラクタです。
     */
    public Ws4501SearchFacadeServiceImpl() {
        super();
    }

    /**
     * Setter Method of wsGetStgInstrService
     * WsBhtStgServiceのセッタメソッド
     * 
     * @param wsBhtStgService WsBhtStgService
     */
    public void setWsBhtStgService(WsBhtStgService wsBhtStgService) {
        this.wsBhtStgService = wsBhtStgService;
    }

    /**
     * <p>
     * Examine Domain Contents of Argument, and Specify Domain Necessary for Processing.
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     * 
     * <pre>
     * No Processing
     * </pre>
     * 
     * @param inputDomain Input Domain入力ドメイン
     * @return inputDomain Processing Result 処理結果
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected Ws4501SearchFacadeServiceInputDomain filterDomain(
        Ws4501SearchFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
    }

    /**
     * <p>
     * Single Item Check
     * 単項目チェックを行う。
     * </p>
     * 
     * <pre>
     * Using Common Function, Check Single Item of inputDomain
     * - 共通機能を利用して、inputDomainの単項目チェックを行う
     * </pre>
     * 
     * @param inputDomain InputDomain ドメイン
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ValidationException ValidationException 検証エラー
     * @throws ApplicationException error エラー
     * 
     */
    @Override
    protected void validateItems(Ws4501SearchFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<Ws4501SearchFacadeServiceInputDomain> valid = new Validator<Ws4501SearchFacadeServiceInputDomain>(
            inputDomain , "inputDomain");

        // Single Item Check 単項目チェック
        String[] properties = {"stgInstrNo"};
        // valid.isFill("stgInstrNo");
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS4501);

        // Error Check エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * Consistency Check
     * 整合性チェックを行う。
     * </p>
     * 
     * <pre>
     * No Processing
     * 現行では処理なし
     * </pre>
     * 
     * @param inputDomain InputDomain ドメイン
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ValidationException ValidationException 検証エラー
     * @throws ApplicationException ApplicationException エラー
     */
    @Override
    protected void validateConsistency(
        Ws4501SearchFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException,
    ApplicationException {
    }

    /**
     * <p>
     * Database Check
     * データベースチェックを行う。
     * </p>
     * 
     * <pre>
     * No Processing
     * 現行では処理なし
     * </pre>
     * 
     * @param inputDomain Input Domainドメイン
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ValidationException ValidationException 検証エラー
     * @throws ApplicationException error エラー
     */
    @Override
    protected void validateDatabase(
        Ws4501SearchFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ValidationException,
    ApplicationException {
    }

    /**
     * <p>
     * Call Business Processing Service
     * 業務処理Serviceの呼び出しを行う。
     * </p>
     * 
     * <pre>
     * 1)Get Search Condition from Parameter of HTTP Request
     * 2)Set Search Condition and Search Staging Instruction Table, Palletize Table.
     * 3)On Success to Get Search Result : 
     * Check Status of Staging Instruction and Return It If It Is Staging Instruction.
     * 
     * 1)HTTPリクエストのパラメタから、検索条件を取得する。
     * 2)検索条件をセットして、荷揃指示テーブル、パレタイズテーブルを検索する。
     * 3)検索結果を取得できた場合、荷揃え指示テーブルのステータスを確認し、荷揃え指示対象の場合のみ検索結果を返す。
     * </pre>
     * 
     * @param inputDomain WS4501InputDomainオブジェクト
     * @return Ws4501ResultDomain Ws4501ResultDomain Processing Result 処理結果
     * @throws GscmApplicationException GscmApplicationException 業務エラー
     * @throws ApplicationException ApplicationException エラー
     */
    @Override
    protected Ws4501SearchFacadeServiceResultDomain callServices(
        Ws4501SearchFacadeServiceInputDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        // Initialize Input Value 入力値の初期化
        ECA0027_WS_4501Domain tmpResult = null;
        List<String> mainMark = new ArrayList<String>();
        // Set Result Domain 結果用のドメインの設定
        Ws4501SearchFacadeServiceResultDomain resultDomain = null;

        // Domain to Store Search Result 検索結果格納ドメイン
        List<ECA0027_WS_4501Domain> searchList = new ArrayList<ECA0027_WS_4501Domain>();
        // Domain to Store Search Condition 検索条件格納ドメイン
        WS4501TtStgInstrByStgInstrNoCriteriaDomain vtStgInstrDomain = new WS4501TtStgInstrByStgInstrNoCriteriaDomain();
        // Numerical Value Set 数値セット
        vtStgInstrDomain.setStgInstrNo(inputDomain.getStgInstrNo());

        // Search Staging Instruction  荷揃を検索する
        searchList = wsBhtStgService.searchStgInstr(vtStgInstrDomain);

        // Judge Search Result 荷揃の検索結果の判定
        if (searchList.size() == 0) {
            // Judge Search Result : On Failure 失敗の場合: 失敗理由をセット
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(
                WS_RESULT_ERROR, getErrorList("NXS_E1_5032", inputDomain
                    .getStgInstrNo()));
        } else if (!searchList.get(0).getStgInstrStatus().equals(STG_INSTR_STATUS_ISSUE_LIST)) {
            // Judge Search Result : On Failure 失敗の場合 : 失敗理由をセット
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(
                WS_RESULT_ERROR, getErrorList("NXS_E1_5011", inputDomain
                    .getStgInstrNo()));
        } else {
            // Judge Search Result : On success 成功の場合： 成功であることをセット
            resultDomain = new Ws4501SearchFacadeServiceResultDomain(
                WS_RESULT_SUCCESS);
        }

        // Pass Main Mark List to Result 検索結果画面に使うメインマークをセット
        for (int i = 0; i < searchList.size(); i++ ) {
            tmpResult = searchList.get(i);
            mainMark.add(tmpResult.getMainMark());
        }

        // Set to Ws4501ResultDomain Ws4501ResultDomainにセット
        resultDomain.getWs4501ResultHeaderDomain().getWs4501ResultMainMarkDomain().setMainMark(mainMark);
        resultDomain.getWs4501ResultHeaderDomain().setStgInstrNo(inputDomain.getStgInstrNo());
        return resultDomain;
    }

    /**
     * <p>
     * Return Error Result Including Specified Contents
     * 指定された内容を含むエラー結果を返します。
     * </p>
     * 
     * @param errorCode Error Codeエラーコード
     * @param params Message params メッセージ・パラメータ
     * @return Error Result Domain エラー結果ドメイン
     */
    private List<ErrorListItemDomain> getErrorList(String errorCode,
        String... params) {
        return Arrays.asList(new ErrorListItemDomain(errorCode,
            getParamList(params)));
    }

    /**
     * <p>
     * Return Message Parameter List Including Specified Contents
     * 指定された値を含むメッセージ・パラメータのリストを返します。
     * </p>
     * 
     * @param params Message Parameter メッセージ・パラメータ
     * @return Message Parameter List メッセージ・パラメータのリスト
     */
    private List<ErrorParamListItemDomain> getParamList(String... params) {
        List<ErrorParamListItemDomain> paramList = new ArrayList<ErrorParamListItemDomain>();

        for (String param : params) {
            paramList.add(new ErrorParamListItemDomain(param));
        }

        return paramList;
    }
}