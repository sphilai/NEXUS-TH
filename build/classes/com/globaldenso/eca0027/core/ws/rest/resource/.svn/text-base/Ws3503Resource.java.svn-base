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
import com.globaldenso.eca0027.core.business.domain.Ws3503TransactFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3503.<BR>
 * Ws3503のリソースインターフェースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws3503")
public interface Ws3503Resource {

    /**
     * <p>
     * Update Transfer Report status and call WebService(WS3001).<BR>
     * </p>
     * 
     * @param dscId DSC-ID of BHT user
     * @param carryOutCompCd Fr) W/H Com CD
     * @param carryOutWhCd Fr) W/H CD
     * @param carryInCompCd To) W/H Com CD
     * @param carryInWhCd To) W/H CD
     * @param shipperCd Shipper CD
     * @param mainMark List of CML
     * @param screenId Screen ID
     * @return Transfer Report status update result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3503TransactFacadeServiceResultDomain createTransferListByCaseMark(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("carryOutCompCd")
        String carryOutCompCd, @FormParam("carryOutWhCd")
        String carryOutWhCd, @FormParam("carryInCompCd")
        String carryInCompCd, @FormParam("carryInWhCd")
        String carryInWhCd, @FormParam("shipperCd")
        String shipperCd, @FormParam("mainMark")
        String mainMark, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;
}
