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
import com.globaldenso.eca0027.core.business.domain.Ws3504TransactFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3504.<BR>
 * Ws3504のリソースインターフェースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws3504")
public interface Ws3504Resource {

    /**
     * <p>
     * Create Transfer Report by List of Item No.<BR>
     * </p>
     * 
     * @param dscId DSC-ID of BHT user
     * @param shipperCd Shipper CD
     * @param carryOutCompCd From W/H company Code
     * @param carryOutWhCd From W/H Code
     * @param carryInCompCd To W/H Company Code
     * @param carryInWhCd To W/H Code
     * @param itemNo Item No
     * @param pkgCd Package Code
     * @param carryOutQty Carry Out Quantity
     * @param carryOutCaseQty Carry Out Case Quantity
     * @param screenId Screen ID
     * @return Transfer Report status update result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3504TransactFacadeServiceResultDomain createTransferListByItemNo(@HeaderParam("X-DC-DSCID")
        String dscId, @FormParam("shipperCd")
        String shipperCd, @FormParam("carryOutCompCd")
        String carryOutCompCd, @FormParam("carryOutWhCd")
        String carryOutWhCd, @FormParam("carryInCompCd")
        String carryInCompCd, @FormParam("carryInWhCd")
        String carryInWhCd, @FormParam("itemNo")
        String itemNo, @FormParam("pkgCd")
        String pkgCd, @FormParam("carryOutQty")
        String carryOutQty, @FormParam("carryoutCaseQty")
        String carryOutCaseQty, @FormParam("screenId")
        String screenId) throws AiwsApplicationException;
}
