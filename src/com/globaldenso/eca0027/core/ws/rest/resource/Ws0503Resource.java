/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws0503ResultDomain;

/**
 * <p>
 * The resource interface class of Ws0503.<BR>
 * Ws0503のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws0503")
public interface Ws0503Resource {

    /**
     * <p>
     * Get check information of the QR code to read in the BHT.<BR>
     * BHTで読み取るQRコードのチェック情報を取得します。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @return QR code check information   (QRコードチェック情報)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws0503ResultDomain getQRCheckInformation(@HeaderParam("X-DC-DSCID")
        String dscId) throws AiwsApplicationException;

}
