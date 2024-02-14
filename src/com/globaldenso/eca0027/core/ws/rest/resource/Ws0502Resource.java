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
 * The resource interface class of Ws0502.<BR>
 * Ws0502のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws0502")
public interface Ws0502Resource {

    /**
     * <p>
     * Change the Pin code for BHT.<BR>
     * BHT用PINコードを変更します。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (BHT利用ユーザのDSC-ID)
     * @param oldPinCode
     *            Pin code before the change   (変更前のPINコード)
     * @param newPinCode
     *            Pin code after the change   (変更後のPINコード)
     * @param screenId
     *            Screen ID    (画面ID)
     * @return PIN code change results   (PINコードの変更結果)
     * @throws AiwsApplicationException
     *             Check the parameter input error   (パラメータ入力チェックエラー)
     */
    @PUT
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public ResultDomain chnagePassword(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("beforePassword")
        String oldPinCode, @FormParam("afterPassword")
        String newPinCode, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;

}
