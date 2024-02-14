/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001MigrationCaseMarkRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkItemCriteriaDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * I want to re-execute the received information that became the check error in the migration step 1
 * <br />移行ステップ1にてチェックエラーとなった受信情報を再実行する。
 * 
 * To leave the reception information in the work table even if the check error, can be re-executed from there.
 * チェックエラーになってもワークテーブルには受信情報を残すため、そこから再実行が可能。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9453 $
 */
public class MigRerunCml {

    /**
     * Constructor.
     */
    public MigRerunCml() {
    }

    /**
     * Main procedure.
     * 
     * This application does not advance to the DB access. Because of the simple program without design documents.
     * All arguments required to get set in hand.
     * 本アプリケーションは事前のDBアクセスはしない。設計書なしの簡易プログラムのため。
     * 必要な引数は全てハンドで設定してもらう。
     *
     * Parameter1: Request URL (with trailing slash) 
     *      ex: http://nexus-th-d.gscm.globaldenso.com/NEXUS_EXPORT/
     * Parameter2: Basic authentication user 
     * Parameter3: Basic authentication password 
     * Parameter4: Case mark No.
     * Parameter4: Case mark No.
     * ...
     * 
     * @param args parameter
     */
    public static void main(String[] args) {

        List<String> argList = Arrays.asList(args);
        if (argList.size() < 4) {
            System.out.println(
                "MigCmlRequestRerun <requestContextUrl> <basicAuthenticationUser> <basicAuthenticationPassword> <caseMarkNo> ..."
            );
            return;
        }
        String requestContextUrl = argList.get(0);
        String basicAuthenticationUser = argList.get(1);
        String basicAuthenticationPassword = argList.get(2);
        List<String> caseMarkNoList = argList.subList(3, argList.size());

        WebServiceCallerRestDomain callerRestDomain = new WebServiceCallerRestDomain();

        // Set of request information
        // リクエスト情報の設定
        callerRestDomain.setAddDensoContext(true);
        callerRestDomain.setUrl(requestContextUrl + "rest/wsr001");
        callerRestDomain.setUserName(basicAuthenticationUser);
        callerRestDomain.setPassword(basicAuthenticationPassword);
        DensoContext.set(new DensoContext("MIGRATION", null, null));
        callerRestDomain.setAddDensoContext(true);

        // Setting of the root domain
        // ルートドメインの設定
        WsR001MigrationCaseMarkRootCriteriaDomain rootDomain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        rootDomain.setRerunFlg("Y");
        List<WsR001migrationCaseMarkItemCriteriaDomain> caseMarkDomainList
            = new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();
        // Repeat number of cases mark No.
        // ケースマークNo.分繰り返し
        for (String caseMarkNo : caseMarkNoList) {
            WsR001migrationCaseMarkItemCriteriaDomain caseMarkDomain
                = new WsR001migrationCaseMarkItemCriteriaDomain();
            caseMarkDomain.setMainMark(caseMarkNo);
            caseMarkDomainList.add(caseMarkDomain);
        }
        rootDomain.setMigrationCaseMarkItemList(caseMarkDomainList);

        // Convert the root domain to XML
        // ルートドメインをXMLに変換
        String xml = XmlUtil.marshal(rootDomain);
        callerRestDomain.setParamMap("wsR001Criteria", xml);

        // Invocation of Web services
        // Webサービスの呼び出し
        try {
            WebServiceCallerRest.put(callerRestDomain, new GenericType<ResultDomain>(){});
        } catch (WebServiceCallerRestException e) {
            e.printStackTrace();
        }
    }
}

