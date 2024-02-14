/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4503CreateFacadeServiceResultDomain;

/**
 * <p>
 * Resource Class(WS4503)
 * WS4503のリソースクラスです
 * </p>
 */
@Path("ws4503")
public interface Ws4503Resource {
    /**
     * <p>
     * Register Staging Actuality, and Update Palletize Information to Staging Actuality Complete
     * 山作り実績情報を登録し、パレタイズ情報を山作り実績済みに更新する。
     * </p>
     * 
     * <pre>
     * 1)Get Registartion Information from Parameter of HTTP Request
     * 2)Check Registration Information (Refer to the Following)
     * 3)Register Staging Actuality Information
     * 4)Update Palletize Information to Staging Complete
     * 5)On Success to Get Search Result : 
     *   Check Status of Staging Instruction and Return It If It is Staging Instruction.
     * 
     * 1)HTTPリクエストのパラメタから、登録情報を取得する。 
     * 2)登録情報をチェックする。(チェック内容は下記参照)   
     * 3)山作り実績情報を登録する。   
     * 4)パレタイズ情報を山作り実績済みに更新する。   
     * 5)取得できた場合、荷揃え指示テーブルのステータスを確認し、荷揃え指示対象の場合のみ検索結果を返す。
     * </pre>
     * 
     * @param dscId DSC-ID of BHT User BHT利用ユーザのDSC-ID
     * @param containerSortingKey ContainerSortingKey コンテナ層別キー
     * @param trnsCd TrnsCd輸送手段コード
     * @param containerLooseTyp ContainerLooseTyp コンテナルーズ区分
     * @param mainMark MainMark メインマークリスト(複数件)
     * @param transTypCd TransTypCd 輸送種別コード
     * @param curWhCompCd CurWhCompCd 現在倉庫会社コード
     * @param curWhCd CurWhCd 現在倉庫コード
     * @param screenId Screen ID 画面ID
     * @return Ws4503SearchFacadeServiceResultDomain result 出力結果
     * @throws AiwsApplicationException AiwsApplicationException
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws4503CreateFacadeServiceResultDomain createStagingActuality(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("containerSortingKey")String containerSortingKey, 
        @FormParam("trnsCd")String trnsCd, 
        @FormParam("containerLooseTyp")String containerLooseTyp, 
        @FormParam("mainMark")String mainMark, 
        @FormParam("trnsTypCd")String transTypCd, 
        @FormParam("curWhCompCd")String curWhCompCd, 
        @FormParam("curWhCd")String curWhCd,
        @FormParam("screenId")String screenId) 
        throws AiwsApplicationException;
}
