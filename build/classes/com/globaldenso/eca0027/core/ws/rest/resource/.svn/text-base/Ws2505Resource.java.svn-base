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
import com.globaldenso.eca0027.core.business.domain.Ws2505ResultDomain;

/**
 * Resource implementation interface for the ws2505.
 * <br />ws2505のリソースインタフェースです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
@Path("ws2505")
public interface Ws2505Resource {

    /**
     * Register Package Specification Revision data to Package Specification Revision Master from BHT.
     * <br />BHTで読み込んだ包装仕様情報を元に包装仕様リビジョン情報を包装仕様有効リビジョンマスタに登録します。
     * 
     * <pre>
     * (1) Get Register or Update data of Package Specification Revision Master from HTTP Request parameter.
     * (2) Check, if exist Package Specification on PKG Specification MA(Detail).
     * (3) Register or Update Package Specification Revision Master. (before transaction, Register Package Specification Revision History Master.)
     * </pre>
     * <pre>
     * (1)HTTPリクエストのパラメタから、包装仕様有効リビジョン原単位の登録/更新情報を取得する。
     * (2)有効にする包装仕様が包装仕様原単位(明細)に存在することをチェックする。
     * (3)包装仕様有効リビジョン原単位を登録または更新し、包装仕様有効リビジョン原単位を更新する場合は更新前に包装仕様有効リビジョン履歴原単位を登録する。
     * ※登録、更新イメージについては別シート「補足」参照。
     * </pre>
     *
     * @param dscId login ID<br />ログインID
     * @param compCd OWNER COMPANY<br />責任会社
     * @param itemNo ITEM NO<br />品目番号
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param rev REVISION<br />リビジョン
     * @param nProc NEXT PROCESS<br />次区
     * @param screenId SCREEN ID<br />画面ID
     * @return Result domain<br />結果ドメイン
     * @throws AiwsApplicationException When an input value has a defect<br />入力値に不備がある場合
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws2505ResultDomain createPkgSpec(
        @HeaderParam("X-DC-DSCID")String dscId,
        @FormParam("compCd") String compCd, 
        @FormParam("itemNo") String itemNo, 
        @FormParam("pkgCd") String pkgCd, 
        @FormParam("trnsCd") String trnsCd, 
        @FormParam("rev") String rev, 
        @FormParam("nProc") String nProc,
        @FormParam("screenId") String screenId) throws AiwsApplicationException;
}