/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/22
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001CriteriaDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * service interface of CML printing for shift.
 * <br /> 移行用CML印刷のサービスインタフェースです。
 *
 * @version $Revision: 7416 $
 */
public interface WsR001MigCmlService {
    
    // ----------------------------------- Registration system method create -----------------------------------
    // ----------------------------------- 登録系メソッド create -----------------------------------
    
    /**
     * 
     * Perform registration processing.
     * <br />登録処理を行います。
     * <pre>
     * (1) The information on the case mark received with request parameter is kept to a temporary table.
     * (2) Since the information on two or more case marks is included in the information which carried out storage, the following processings are repeated in a case mark unit.
     * (3) The information on masters is combined and a Palletize check is performed.
     * (4) In the case of error detection, an invoke and an error report are printed for an error report output program with Palletize check.
     * (5) With Palletize check, when normal, an invoke and a case mark are printed for a case mark document output program after registering a Palletize information.
     * (1)リクエストパラメータで受け取ったケースマークの情報を一時テーブルに保管する。
     * (2)保管した情報には複数ケースマークの情報を含むため、ケースマーク単位で以下の処理を繰り返す。
     * (3)原単位の情報を結合し、パレタイズチェックを行う。
     * (4)パレタイズチェックでエラー検出の場合、エラーレポート出力プログラムを呼び出し、エラーレポートを印刷する。
     * (5)パレタイズチェックで正常の場合、パレタイズ情報を登録後、ケースマーク帳票出力プログラムを呼び出し、ケースマークを印刷する。
     * 
     * </pre>
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Error Mesage List<br />エラーメッセージリスト
     * @throws ValidationException When an exception occurs at the time of registration<br />登録時に例外が発生した場合
     * @throws ApplicationException When an exception occurs at the time of registration<br />登録時に例外が発生した場合
     */
    public List<String> createMigCml(WsR001CriteriaDomain criteria)
        throws ApplicationException, ValidationException;
}
