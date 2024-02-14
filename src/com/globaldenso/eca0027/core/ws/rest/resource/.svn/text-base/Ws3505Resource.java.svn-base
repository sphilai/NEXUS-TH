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
import com.globaldenso.eca0027.core.business.domain.Ws3505TransactFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3505.<BR>
 * Ws3505のリソースインターフェースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws3505")
public interface Ws3505Resource {

    /**
     * <p>
     * Update Transfer Report status and call WebService(WS3001).<BR>
     * </p>
     * 
     * @param dscId DSC-ID of BHT user
     * @param trNo Transfer Report No from the scanned QR code
     * @param editCnt Edit Count
     * @param screenId Screen ID of the client application
     * @return Transfer Report status update result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3505TransactFacadeServiceResultDomain updateTrStatusActivate(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("trNo")
        String trNo, @FormParam("editCnt")
        String editCnt, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;
}
