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
import com.globaldenso.eca0027.core.business.domain.Ws3506TransactFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3506.<BR>
 * Ws3506のリソースインターフェースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws3506")
public interface Ws3506Resource {

    /**
     * <p>
     * Update Transfer Report Status Carry in.<BR>
     * </p>
     * 
     * @param dscId DSC-ID of BHT user
     * @param trNo Transfer Report No from the scanned QR code
     * @param trItemTyp Transfer Report Type from the scanned QR code
     * @param trRcvMethTyp Set at client side
     * @param editCnt editCnt
     * @param screenId Screen ID
     * @return Transfer Report status update result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3506TransactFacadeServiceResultDomain updateTransferStatusByCarryIn(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("trNo")
        String trNo, @FormParam("trItemTyp")
        String trItemTyp, @FormParam("trRcvMethTyp")
        String trRcvMethTyp, @FormParam("editCnt")
        String editCnt, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;
}
