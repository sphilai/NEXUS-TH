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
import com.globaldenso.eca0027.core.business.domain.Ws2508ResultDomain;

/**
 * Resource implementation interface for ws2508.
 * <br />ws2508のリソースインタフェースです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
@Path("ws2508")
public interface Ws2508Resource {

    /**
     * <pre>
     * (1) Get Register data from parameters.
     * (2) Check Register data for parameter, Palletizing Instruction, Packing material and more.
     * (3) Register Mix Tag.
     * (4) Return the mixed label number.
     * </pre>
     * <pre>
     * (1) パラメタから、登録情報を取得する。
     * (2) 登録情報をチェックする。
     *  パラメータエラー、梱包指示エラー、包装材エラー以外の異常が発生した場合はエラーリストを登録する。
     * (3) MIXED現品票の登録を行う
     * (4) 生産性データ収集情報を登録する。
     * (5) 登録時に採番したMIXED現品票No.を返す
     * </pre>
     *
     * @param dscId login ID <br />ログインID
     * @param pltzInstrNo Palletize Instr. No.<br />梱包指示No
     * @param shipperCd Shipper CD<br />荷主コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo SHIP TO CODE<br />送荷先コード
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param plntCd Factory code (LEGACY)<br />工場コード(LEGACY)
     * @param lgcyWhCd W/H CD (LEGACY)<br />倉庫コード(LEGACY)
     * @param whComCd W/H Company CD (between bases)<br />倉庫会社コード(拠点間)
     * @param whCd W/H CD (between bases)<br />倉庫コード(拠点間)
     * @param whFlg NEXUS W/H flag<br />NEXUS倉庫フラグ
     * @param boxNo BoxNo<br />BoxNo
     * @param itemNo ITEM NO (a part for the scanned number of cases)<br />品目番号(スキャンした件数分)
     * @param pkgCd Packing CD (a part for the scanned number of cases)<br />包装コード(スキャンした件数分)
     * @param indusTypCd The CD according to industry (a part for the scanned number of cases)<br />産業別コード(スキャンした件数分)
     * @param kanbanTyp KANBAN classification (a part for the scanned number of cases)<br />かんばん種別(スキャンした件数分)
     * @param tagSeq Tag SEQ number (a part for the scanned number of cases)<br />タグSEQ番号(スキャンした件数分)
     * @param lotSize PACKAGE LOT SIZE (a part for the scanned number of cases)<br />収容数(スキャンした件数分)
     * @param customerItemNo CUSTOMER ITEM NO<br />得意先品目番号
     * @param customerTagSeq Customer tag SEQ number (a part for the scanned number of cases)<br />得意先タグSEQ番号(スキャンした件数分)
     * @param pkgItemNo PACKAGE ITEM NO (a part for the scanned number of cases)<br />包装材品番(スキャンした件数分)
     * @param pkgItemQty QUANTITY (a part for the scanned number of cases)<br />数量(スキャンした件数分)
     * @param workTimeStrt At the time of a business opening day<br />業務開始日時
     * @param workTimeEnd Business finishing time<br />業務終了日時
     * @param errScreenId Error SCREEN ID (a part for the error number)<br />エラー画面ID(エラー件数分)
     * @param errMsgId Error message ID (a part for the error number)<br />エラーメッセージID(エラー件数分)
     * @param bhtUnlockAuthFlg Release object flag (a part for the error number)<br />解除対象フラグ(エラー件数分)
     * @param errWorkTimeStrt WORK START TIME (a part for the error number)<br />作業開始時間(エラー件数分)
     * @param errWorkTimeEnd WORK END TIME (a part for the error number)<br />作業終了時間(エラー件数分)
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2508ResultDomain createMixTag(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("pltzInstrNo") String pltzInstrNo,
        @FormParam("shipperCd") String shipperCd,
        @FormParam("customerCd") String customerCd,
        @FormParam("lgcyShipTo") String lgcyShipTo,
        @FormParam("trnsCd") String trnsCd,
        @FormParam("plntCd") String plntCd,
        @FormParam("lgcyWhCd") String lgcyWhCd,
        @FormParam("whCompCd") String whComCd,
        @FormParam("whCd") String whCd,
        @FormParam("whFlg") String whFlg,
        @FormParam("boxNo") String boxNo,
        @FormParam("itemNo") String itemNo,
        @FormParam("pkgCd") String pkgCd,
        @FormParam("indusTypCd") String indusTypCd,
        @FormParam("kanbanTyp") String kanbanTyp,
        @FormParam("tagSeq") String tagSeq,
        @FormParam("lotSize") String lotSize,
        @FormParam("customerItemNo") String customerItemNo,
        @FormParam("customerTagSeq") String customerTagSeq,
        @FormParam("pkgItemNo") String pkgItemNo,
        @FormParam("pkgItemQty") String pkgItemQty,
        @FormParam("workTimeStrt") String workTimeStrt,
        @FormParam("workTimeEnd") String workTimeEnd,
        @FormParam("errScreenId") String errScreenId,
        @FormParam("errMsgId") String errMsgId,
        @FormParam("bhtUnlockAuthFlg") String bhtUnlockAuthFlg,
        @FormParam("workTimeStrtErr") String errWorkTimeStrt,
        @FormParam("workTimeEndErr") String errWorkTimeEnd,
        @FormParam("screenId") String screenId
        )  throws AiwsApplicationException;

}