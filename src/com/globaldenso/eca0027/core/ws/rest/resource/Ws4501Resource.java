/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4501SearchFacadeServiceResultDomain;

/**
 * <p>
 * Resource Class(WS4501)
 * WS4501のリソースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws4501")
public interface Ws4501Resource {

    /**
     * <p>
     * Search Staging Instruction Table, Palletize Table
     * 荷揃指示テーブル、パレタイズテーブルを検索する。
     * </p>
     * 
     * <pre>
     * 
     * 1)Get Search Condition from Parameter of HTTP Request
     * 2)Set Search Condition and Search Staging Instruction Table, Palletize Table.
     * 3)On Success to Get Search Result : 
     *   Check Status of Staging Instruction and Return It If It is Staging Instruction.
     *   
     * 1)HTTPリクエストのパラメタから、検索条件を取得する。
     * 2)検索条件をセットして、荷揃指示テーブル、パレタイズテーブルを検索する。
     * 3)検索結果を取得できた場合、荷揃え指示テーブルのステータスを確認し、荷揃え指示対象の場合のみ検索結果を返す。
     * </pre>
     * 
     * </p>
     * 
     * @version 1.00
     * @param dscId DSC-ID of BHT user BHT利用ユーザのDSC-ID
     * @param stgInstrNo Staging Instruction No. 荷揃指示書No
     * @param screenId Screen ID 画面ID
     * @return Ws4501SearchFacadeServiceResultDomain Processing Result 処理結果
     * @throws AiwsApplicationException Parameter Input Check Error パラメータ入力チェックエラー
     */

    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws4501SearchFacadeServiceResultDomain getStagingInstruction(
        @HeaderParam("X-DC-DSCID")String dscId,
        @QueryParam("stgInstrNo")String stgInstrNo,
        @QueryParam("screenId")String screenId
        ) throws AiwsApplicationException;
}
