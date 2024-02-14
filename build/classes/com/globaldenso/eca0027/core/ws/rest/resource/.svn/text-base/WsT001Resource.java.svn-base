/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Resource implementation interface for the wsT001. 
 * <br />WsT001のリソース・インタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@Path("wst001")
public interface WsT001Resource {
    /**
     * Notify status of night batch.
     * <br />夜間バッチ状態通知
     * 
     * @param lib library name <br />ライブラリ名
     * @param companyCode NEXUS COMPANY CD<br />NEXUS会社コード
     * @param accessibilityType Accessibility Type(1: normal , 2:not ready, 3:executing night batch)<br />（"1":通常稼動 "2":利用不可 "3":夜間バッチ中）
     * @param cigmaAds CIGMA ADS（YYYYMMDD）
     * @return result domain<br />結果用ドメイン
     * @throws AiwsApplicationException failure of Notify<br /> 夜間バッチ状態通知に失敗した場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML)
    public ResultDomain notifyNightBatStat(
        @FormParam("lib") String lib,
        @FormParam("companyCode") String companyCode,
        @FormParam("accessibilityType") String accessibilityType,
        @FormParam("cigmaAds") String cigmaAds) throws AiwsApplicationException;
}