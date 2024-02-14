package com.globaldenso.eca0027.asia.business.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2502ResultDomain;

/**
 * Resource implementation Interface for the WS2502
 * <br />ws2502(Asia固有機能)のリソースインタフェースです。
 * 
 */
@Path("ws2502Asia")
public interface Ws2502ResourceAsia {

    /**
     * Register Palletize data to transaction tables of Palletize from BHT.
     * <br />BHTで読み込んだパレタイズ情報を元に指示パレタイズ情報をパレタイズTR群に登録します。
     * 
     * <pre>
     * (1) Get Register data by HTTP Request parameter.
     * (2) Check Register data for parameter, Palletizing Instruction, Packing material and more.
     * (3) Register Palletize.
     * (4) Register Palletize Item.
     * (5) Register Palletize Item Receive Order.
     * (6) Register Palletize Item KANBAN.
     * (7) Update Mix Tag to packaged.
     * (8) Update Palletize Instruction to packaged.
     * (9) Update Palletize Instruction Item No to packaged.
     * </pre>
     * <pre>
     * (1) HTTPリクエストのパラメタから、登録情報を取得する。
     * (2) 登録情報をチェックする。
     *     パラメータエラー、梱包指示エラー、包装材エラー以外の異常が発生した場合はエラーリストを登録する。
     * (3) パレタイズ情報を登録する。
     * (4) パレタイズ対象品情報を登録する。
     * (5) パレタイズ対象品受注情報を登録する。
     * (6) パレタイズ対象品かんばん情報を登録する。
     * (7) MIXED現品票情報を梱包済みに更新する。
     * (8) 梱包指示情報を梱包済みに更新する。
     * (9) 梱包指示品目番号受注情報を更新する。
     * (10)生産性データ収集情報を登録する。
     * </pre>
     *
     * @param dscId login ID <br />ログインID
     * @param pltzInstrNo <br />梱包指示No
     * @param palletNo <br />パレットNo
     * @param itemNo <br />品目番号(スキャンした件数分)
     * @param pkgCd <br />包装コード(スキャンした件数分)
     * @param mixTagFlg <br />Mixタグフラグ(スキャンした件数分)
     * @param indusTypCd <br />産業別コード(スキャンした件数分)
     * @param kanbanTyp <br />かんばん種別(スキャンした件数分)
     * @param tagSeqNo <br />タグSEQ番号(スキャンした件数分)
     * @param kanbanQty <br />収容数(スキャンした件数分)
     * @param customerItemNo <br />得意先品目番号(スキャンした件数分)
     * @param customeTagSeqNo <br />得意先タグSEQ番号(スキャンした件数分)
     * @param productDate <br />Product date
     * @param orderNo <br />Order No
     * @param outerCd <br />外装記号(null)
     * @param outerCdFlg <br />外装記号フラグ('N'固定)
     * @param outerCdItemNo <br />包装材品番(null)
     * @param outerCdQty <br />数量(null)
     * @param workTimeStrt <br />業務開始日時
     * @param workTimeEnd <br />業務終了日時
     * @param errScreenId <br />エラー画面ID(エラーの件数分)
     * @param errMsgId <br />エラーメッセージID(エラーの件数分)
     * @param bhtUnlockAuthFlg <br />解除対象フラグ(エラーの件数分)
     * @param errWorkTimeStrt <br />作業開始時間(エラーの件数分)
     * @param errWorkTimeEnd <br />作業終了時間(エラーの件数分)
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain of ECA0027_WS_2502<br />ECA0027_WS_2502の結果ドメイン
     * @throws AiwsApplicationException In the case of BHT data error.<br />入力値に不備がある場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2502ResultDomain createInstrPltz(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("pltzInstrNo") String pltzInstrNo,
        @FormParam("palletNo") String palletNo,
        @FormParam("itemNo") String itemNo,
        @FormParam("pkgCd") String pkgCd,
        @FormParam("mixTagFlg") String mixTagFlg,
        @FormParam("indusTypCd") String indusTypCd,
        @FormParam("kanbanTyp") String kanbanTyp,
        @FormParam("tagSeqNo") String tagSeqNo,
        @FormParam("kanbanQty") String kanbanQty,
        @FormParam("customerItemNo") String customerItemNo,
        @FormParam("customeTagSeqNo") String customeTagSeqNo,
        @FormParam("productDate") String productDate,
        @FormParam("orderNo") String orderNo,
        @FormParam("outerCd") String outerCd,
        @FormParam("outerCdFlg") String outerCdFlg,
        @FormParam("outerCdItemNo") String outerCdItemNo,
        @FormParam("outerCdQty") String outerCdQty,
        @FormParam("workTimeStrt") String workTimeStrt,
        @FormParam("workTimeEnd") String workTimeEnd,
        @FormParam("errScreenId") String errScreenId,
        @FormParam("errMsgId") String errMsgId,
        @FormParam("bhtUnlockAuthFlg") String bhtUnlockAuthFlg,
        @FormParam("workTimeStrtErr") String errWorkTimeStrt,
        @FormParam("workTimeEndErr") String errWorkTimeEnd,
        @FormParam("screenId") String screenId
    ) throws AiwsApplicationException;
}
