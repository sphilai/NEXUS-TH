/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * <p>
 * The resource interface class of Ws5502.<BR>
 * Ws5502のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws5502")
public interface Ws5502Resource {

    /**
     * <p>
     * Update shipment confirmation information.<BR>
     * 出荷確認情報を更新します。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @param shippNo
     *            Shipment confirmation number   (出荷確認No.)
     * @param sdankubu
     *            Shipping action type   (実績手段区分)
     * @param screenId
     *            Screen ID   (画面ID)
     * @return Shipment confirmation information update result   (出荷確認情報更新結果)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public ResultDomain updateshpping(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("shippingFirmNo")
        String shippNo, @FormParam("shippingActTyp")
        String sdankubu, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;
}
