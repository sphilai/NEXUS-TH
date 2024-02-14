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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws5501ResultDomain;

/**
 * <p>
 * The resource interface class of Ws5501.<BR>
 * Ws5501のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws5501")
public interface Ws5501Resource {

    /**
     * <p>
     * Get shipment confirmation information.<BR>
     * 出荷確認情報を取得します。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @param shippingConfirmNo
     *            Shipment confirmation number   (出荷確認No)
     * @return Shipment confirmation information search results   (出荷確認情報検索結果)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws5501ResultDomain getShippingConfirm(@HeaderParam("X-DC-DSCID")
        String dscId, @QueryParam("shippingFirmNo")
        String shippingConfirmNo) throws AiwsApplicationException;
}
