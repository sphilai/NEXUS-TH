/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.sun.jersey.api.client.GenericType;

/**
 * Implementation class to call WS3003
 * 
 * @author $Author: TIS Tanaka $
 * @version $Revision: $
 */
public class Ws3003RestServiceImpl implements Ws3003RestService {

    /**
     * CommonService
     */
    private CommonService commonService;

    /**
     * Constractor
     */
    public Ws3003RestServiceImpl() {
    }

    /**
     * commonService setter
     * 
     * @param commonService commonService set
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.ws.Ws3003RestService#getInventoryInfoFromWs(String,
     *      String, List, List)
     */
    public Ws3003ResultDomain getCigmaInventoryFromWs(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {

        String webServicePath = "ws3003";
        // set shipper and other common field
        WebServiceCallerRestDomain wsCallerRestDomain = commonService
            .searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        //set param with xml format
        wsCallerRestDomain.setParamMap("param", XmlUtil
            .marshal(ws3003ParamDomain));

        try {
            // Call web service
            Ws3003ResultDomain ws3003ResultDomain = WebServiceCallerRest.post(
                wsCallerRestDomain, new GenericType<Ws3003ResultDomain>() {
                });

            // if resultDomain contains errorList
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();
 
            // error list check
            if (ws3003ResultDomain.getErrorList().size() > 0) {
                // Error check.
                MessageDomain errMsg = new MessageDomain("", ws3003ResultDomain
                    .getErrorList().get(0).getErrorCode(), null);
                errorList.add(errMsg);
                throw new ValidationException(errorList);
            }
            return ws3003ResultDomain;
        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}
