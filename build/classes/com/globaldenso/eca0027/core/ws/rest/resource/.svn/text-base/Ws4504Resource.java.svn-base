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
import com.globaldenso.eca0027.core.business.domain.Ws4504ProcessFacadeServiceResultDomain;

/**
 * <p>
 * Resource Class(WS4504)
 * WS4504のリソースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws4504")
public interface Ws4504Resource {
    /**
     * <p>
     * Output PDF of Staging Actuality to Printer
     * 山作り実績書のPDFを作成し、プリンタ出力する
     * </p>
     * 
     * @param dscId DSC-ID of BHT User BHT利用ユーザのDSC-ID
     * @param compCd Current Warehose Company Code (プリンタ保有)拠点間会社コード
     * @param printerId Printer ID プリンタID
     * @param stgActNo Staging Actuality No. 山作り実績NO
     * @param screenId Screen ID 画面ID
     * @return XML of Execution Result  実行結果xml
     * @throws AiwsApplicationException On Failure to Get Printer Information プリンタ情報取得に失敗した場合
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws4504ProcessFacadeServiceResultDomain printStagingActuality(
        @HeaderParam("X-DC-DSCID")String dscId, 
        @FormParam("compCd")String compCd, 
        @FormParam("printerId")String printerId, 
        @FormParam("stgActNo")String stgActNo,
        @FormParam("screenId")String screenId
        ) throws AiwsApplicationException;
}
