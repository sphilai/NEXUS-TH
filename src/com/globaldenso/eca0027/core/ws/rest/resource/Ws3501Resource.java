/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws3501SearchFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3501.<BR>
 * Ws3501のリソースインターフェースクラスです。
 * </p>
 *
 * @version 1.00
 */
@Path("ws3501")
public interface Ws3501Resource {

    /**
     * <p>
     * Get Transfer Report Information.<BR>
     * </p>
     *
     * @param dscId DSC-ID of BHT user
     * @param trNo Transfer Report No from the scanned QR code
     * @param editCnt Edit Count
     * @param validEditCntFlg Edit Count Flag
     * @param trItemTyp TR Kind
     * @return Transfer Information status get result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @GET
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3501SearchFacadeServiceResultDomain getTransferInfo(@HeaderParam("X-DC-DSCID")
        String dscId, @QueryParam("trNo")
        String trNo, @QueryParam("validEditCntFlg")
        String validEditCntFlg, @QueryParam("editCnt")
        String editCnt, @QueryParam("trItemTyp")
        String trItemTyp) throws AiwsApplicationException;
}
