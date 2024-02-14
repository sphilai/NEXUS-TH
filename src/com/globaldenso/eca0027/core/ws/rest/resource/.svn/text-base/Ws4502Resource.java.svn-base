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
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws4502UpdateFacadeServiceResultDomain;

/**
 * <p>
 * Resource Class(WS4502)
 * WS4502のリソースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws4502")
public interface Ws4502Resource {
    /**
     * <p>
     * Update Staging Instruction Table to Palletize Complete.
     * Update Palletize Table to Palletize Complete.
     * 荷揃え指示テーブルを荷揃え実績済みに更新する。パレタイズテーブルを荷揃え実績済みに更新する。
     * </p>
     * <p>
     * 
     * <pre>
     *  1)Get Update Information from Parameter of HTTP Request
     *  2)Get Setting Information(User Information, Current Date) 
     *  3)Check Update Information (Refer to the Following)
     *    ■Confirm Staging Instruction to Update
     *    ■Confirm Staging Instruction Status of Staging Instruction Table is 10(Issue List)
     *    ■Confirm Palletize Status of Palletize Table is 20(Staging Instruction)
     *     No Check Staging Instruction Status of Staging Instruction Table.
     *     (It is Included Palletize Status Check)"
     *  4)Update Staging Instruction Table to Palletize Complete.
     *  5)Update Palletize Table to Palletize Complete.
     *  
     * 1)HTTPリクエストのパラメタから、更新情報を取得する。     
     * 2)更新時設定情報(ユーザ情報、現在日付)を取得する。       
     * 3)更新情報をチェックする。(チェック内容は下記参照)       
     *   ■更新対象の荷揃え指示情報が存在すること。       
     *   ■荷揃え指示テーブルの荷揃え指示ステータスが'10'(Issue List)であること     
     *   ■パレタイズテーブルのパレタイズステータスが'20'(荷揃え指示)であること。     
     *   ※荷揃え指示テーブルの荷揃え指示ステータスは上記パレタイズステータスのチェックに包含できるためチェックしない。     
     * 4)荷揃え指示テーブルを荷揃え実績済みに更新する。     
     * 5)パレタイズテーブルを荷揃え実績済みに更新する。    
     * </pre>
     * 
     * </p>
     * 
     * @version 1.00
     * @param dscId DSC-ID of BHT User BHT利用ユーザのDSC-ID
     * @param stgInstrNo Staging Instruction No. 荷揃指示書No
     * @param screenId Screen ID 画面ID
     * @return Ws4502UpdateFacadeServiceResultDomain Output Result 出力結果
     * @throws AiwsApplicationException error エラー
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws4502UpdateFacadeServiceResultDomain getStagingInstruction(
        @HeaderParam("X-DC-DSCID")String dscId, 
        @FormParam("stgInstrNo")String stgInstrNo,
        @FormParam("screenId")String screenId
    ) throws AiwsApplicationException;
}
