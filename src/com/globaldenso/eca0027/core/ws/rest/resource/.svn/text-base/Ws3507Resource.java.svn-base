/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws3507TransactFacadeServiceResultDomain;

/**
 * <p>
 * The resource interface class of Ws3507.<BR>
 * Ws3507のリソースインターフェースクラスです。
 * </p>
 * 
 * @version 1.00
 */
@Path("ws3507")
public interface Ws3507Resource {

    /**
     * <p>
     * Call printing service based on Carry Out/In.<BR>
     * </p>
     * 
     * @param trNo Transfer Report No from the scanned QR code
     * @param trItemTyp TR Kind
     * @param compCd Company Code
     * @param printerId Printer ID
     * @param noOfPrint No of Print
     * @return Transfer Report status update result
     * @throws AiwsApplicationException Check the parameter input error
     */
    @POST
    @Produces(MediaType.APPLICATION_XML + "; charset=utf-8")
    public Ws3507TransactFacadeServiceResultDomain printTransferByMainMark(@FormParam("trNo")
        String trNo, @FormParam("trItemTyp")
        String trItemTyp, @FormParam("compCd")
        String compCd, @FormParam("printerId")
        String printerId, @FormParam("noOfPrint")
        String noOfPrint) throws AiwsApplicationException;
}
