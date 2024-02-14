/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2501ResultDomain;

/**
 * Resource implementation Interface for the WS2501
 * <br />ws2501のリソースインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@Path("ws2501")
public interface Ws2501Resource {

    /**
     * Get Palletize info of Palletize Instr, TR and Packaging Instruction info of Palletize TR by Palletize Instr. No from BHT.
     * <br />BHTで読み込んだ梱包指示書Noを元に梱包指示TR群、パレタイズTR群から梱包指示情報およびパレタイズ情報を取得します。
     * 
     * <pre>
     * (1) Get search conditions by parameter.
     * (2) Search Palletize Instr, TR.
     * (3) Get the search results and check the status of Palletize instruction table. Returns the search results in the case of Palletize instruction item. 
     * </pre>
     * <pre>
     * (1)パラメタから、検索条件を取得する。
     * (2)検索条件をセットして、梱包指示に関連する情報を取得する。
     * (3)検索結果を取得できた場合、梱包指示テーブルのステータスを確認し、梱包指示対象の場合のみ検索結果を返す。
     * </pre>
     *
     * @param pltzInstrNo Palletize Instr. No. <br />梱包指示No
     * @return Result domain <br />結果ドメイン
     * @throws AiwsApplicationException When an input value has a defect<br />入力値に不備がある場合
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2501ResultDomain getPltzInstr(
        @QueryParam("pltzInstrNo") String pltzInstrNo)  throws AiwsApplicationException;
}