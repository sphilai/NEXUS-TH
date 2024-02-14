/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3011;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3009UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <p>
 * W3009 AbstractAction
 * </p>
 * 
 * @author DIAT Thalerngsak.p
 * @version 1.00
 */
public class W3009ConfirmAction extends W3009AbstractAction {
    /**
     * <p>
     * constructor
     * </p>
     */
    public W3009ConfirmAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W3009ActionForm w3009Form = (W3009ActionForm)form;
        // Prepare update domain
        W3009UpdateDomain w3009Update = prepareUpdateDomain(w3009Form);

        //validation
        if (StringUtils.isEmpty(w3009Update.getTrNo()))  {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }else{
            for (W3009ListDomain listDomain : w3009Update.getListDomainList()) {
                if (w3009Update.getTrNo().equals(listDomain.getTrNo())) {
                    if (listDomain.getTrItemTyp().equals("1")) {
                        return SCREEN_ID_W3010;
                    } else if (listDomain.getTrItemTyp().equals("2")) {
                        return SCREEN_ID_W3011;
                    }
                }
            }
        }
        
        return FORWARD_ERROR;
    }

    /**
     * Prepare Update domain for TR activate -Set of common information screen
     * -Get TR information from the selected TR for update -Set update list
     * domain
     * 
     * @param form form
     * @return updateDomain updateDomain
     */
    protected W3009UpdateDomain prepareUpdateDomain(W3009ActionForm form) {

        W3009UpdateDomain updateDomain = new W3009UpdateDomain();
        List<W3009ListDomain> listW3009 = new ArrayList<W3009ListDomain>();
        // Set of common information screen
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form
            .getScreenId());
        // Get TR information from the selected TR for update
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3009ListDomain listDomain : form.getW3009ListDomainList()) {
                // for (W3001ListDomain listDomain : form.getListDomainList()) {
                if (form.getTrNo().equals(listDomain.getTrNo())) {
                    listDomain.setLanguageCd(form.getLanguageCd());
                    listDomain.setLoginUserDscId(updateDomain
                        .getLoginUserDscId());
                    listW3009.add(listDomain);
                }
            }
        }
        // Set update list domain
        updateDomain.setTrNo(form.getTrNo());
        updateDomain.setListDomainList(listW3009);

        return updateDomain;
    }
}
