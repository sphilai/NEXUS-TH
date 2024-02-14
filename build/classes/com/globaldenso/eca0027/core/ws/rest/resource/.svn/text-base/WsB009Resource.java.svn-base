/*
 * Project : NEXUS_CIGMA
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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Resource implementation interface for the wsB009.
 * 
 * <br />WsB009のリソース・インタフェースです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
@Path("wsb009")
public interface WsB009Resource {
    /**
     * Execute JOB of EDI Customer Order Register.
     * <br />EDI受注登録ジョブを呼び出します。
     *
     * @param lib library name<br />ライブラリ名
     * @param receivingCompanyCode EIS Customer COMPANY CD<br />受注会社の拠点間会社コード
     * @param cigmaAds working day at CIGMA<br />CIGMA業務日付
     * @param callerJobId source job id<br />呼び出し元ジョブID
     * @return Result status of JOB of EDI Customer Order Register.<br />EDI受注登録ジョブ呼び出し結果
     * @throws AiwsApplicationException JOB failure. <br />EDI受注登録ジョブ呼び出し失敗したとき
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ResultDomain callEdiOdrEntryJob(
        @QueryParam("lib") String lib,
        @QueryParam("receivingCompanyCode") String receivingCompanyCode,
        @QueryParam("cigmaAds") String cigmaAds,
        @QueryParam("callerJobId") String callerJobId) throws AiwsApplicationException;
}
