/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2510ResultDomain;

/**
 * Resource implementation interface for the ws2510
 * <br />ws2510のリソースインタフェースです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7215 $
 */
@Path("ws2510")
public interface Ws2510Resource {

    /**
     * Register X-CML from BHT Palletize info.
     * <br />BHTで読み込んだまとめパレタイズ情報を元にまとめパレタイズTRを登録します。
     * 
     * <pre>
     * (1) Get Register info from parameter of HTTP request.
     * (2) Get Register info from USER info and Current date.
     * (3) Check of Register data below.
     *   a) exist CML items.
     *   b) unique check in X-CML.
     *      Cont Sort Key
     *      Transport CD
     *      NEXUS Ship to Company CD
     *      C/C Timing flag
     *      Current W/H Company CD
     *      Current W/H CD
     *   c) Check of L/D CD in X-CML.
     *      argument L/D CD  L/D CD in X-CML
     *      F)ree            F)ree
     *      D)oor            D)oor or F)ree
     *      B)ack            B)ack or F)ree
     *   d) CML TYPE = 1(CIGMA)
     *   e) staging instruction flag = N(success)
     *   f) Palletize status = 10(Palletize)
     *   g) last Carry-In/Carry-Out status = 10(Blank) or 40(Received at To)
     *   h) MIGRATION FLAG = N(Not Migration data)
     * (4) Register to X-CML table.
     * (5) Update Palletize table.
     * </pre>
     * <pre>
     * (1)HTTPリクエストのパラメタから、登録情報を取得する。
     * (2)登録時設定情報(ユーザ情報、現在日付)を取得する。
     * (3)登録情報をチェックする。(チェック内容は下記参照)
     *   ■ 対象のCMLが存在すること。
     *   ■ まとめパレタイズ内で以下が一意であること。
     *    ・ コンテナ層別キー
     *    ・ 輸送手段コード
     *    ・ 送荷先会社コード
     *    ・ 通関タイミング区分
     *    ・ 現在倉庫会社コード
     *    ・ 現在倉庫コード
     *   ■ まとめパレタイズ内で、荷積位置コードが以下通りになっていること。
     *    荷積位置コードの値(引数)           まとめパレタイズ内の荷積位置コード
     *    F(Free)           F(Free)であること
     *    D(Door)           D(Door)またはF(Free)であること
     *    B(Back)           B(Back)またはF(Free)であること
     *   ■ ケースマーク区分が'1'(CIGMA)であること。
     *   ■ 荷揃え指示フラグが'N'(成行)であること。
     *   ■ パレタイズステータスが'10'(パレタイズ)であること。
     *   ■ 最終搬出入ステータスが'10'(Blank)または'40'(Received at To)であること。
     *   ■ 移行フラグが'N'(移行データでない)であること。
     * (4)まとめパレタイズテーブルに登録する。
     * (5)パレタイズテーブルを更新する。
     * </pre>
     *
     * @param dscId login ID<br />ログインID
     * @param palletNo Pallete No, <br />パレットNO
     * @param containerSortingKey Cont Sort Key<br />コンテナ層別キー
     * @param trnsCd Transport CD<br />輸送手段コード
     * @param shipToCompCd NEXUS Ship to Company CD<br />送荷先会社コード
     * @param loadingCd L/D CD<br />荷積位置コード
     * @param customTimingTyp C/C Timing Flag<br />通関タイミング区分
     * @param mainMark MAIN MARK<br />メインマークリスト
     * @param outerPkgComCd Outer Package COMPANY CD<br />外装会社コード
     * @param outerPkgCd Outer Package CD<br />外装記号
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果ドメイン
     * @throws AiwsApplicationException mistaken input value.<br />入力値に不備がある場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2510ResultDomain createXtag(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("palletNo") String palletNo, 
        @FormParam("containerSortingKey") String containerSortingKey, 
        @FormParam("trnsCd") String trnsCd, 
        @FormParam("shipToCompCd") String shipToCompCd, 
        @FormParam("loadingCd") String loadingCd, 
        @FormParam("customTimingTyp") String customTimingTyp, 
        @FormParam("mainMark") String mainMark, 
        @FormParam("outerPkgComCd") String outerPkgComCd, 
        @FormParam("outerPkgCd") String outerPkgCd,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;

}