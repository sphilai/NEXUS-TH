/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * <p>
 * The resource interface class of WsT501.<BR>
 * WsT501のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("wst501")
public interface WsT501Resource {

    /**
     * <p>
     * Conducted a check of BHT unlock authority.<BR>
     * BHTロック解除権限のチェックを行います。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @param mgrDscId
     *            DSC-ID of user's manager   (マネージャのDSC-ID)
     * @return Authentication result of unlocked authority   (ロック解除権限の認証結果)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public ResultDomain checkUnlockBHT(@HeaderParam("X-DC-DSCID")
        String dscId, @QueryParam("dscid")
        String mgrDscId) throws AiwsApplicationException;

}
