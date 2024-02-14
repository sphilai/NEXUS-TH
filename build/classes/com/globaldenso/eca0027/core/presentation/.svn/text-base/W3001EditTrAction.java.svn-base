/*
 * Project : NEXUS_EXPORT
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDIT_FLG_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORWARD_SUCCESS_W3006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORWARD_SUCCESS_W3008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <p>
 * W3001 EditTr Action
 * </p>
 * 
 * @author chaiporn
 * @version 1.00
 */
public class W3001EditTrAction extends W3001AbstractAction {

    /**
     * <p>
     * implement W3001EditTrFacadeService
     * </p>
     */
    protected ProcessFacadeService<Void, W3001ListDomain> w3001EditTrFacadeService;

    /**
     * <p>
     * constructor.
     * </p>
     */
    public W3001EditTrAction() {
    }

    /**
     * <p>
     * Setter method for w3001EditTrFacadeService.
     * </p>
     * 
     * @param editTrFacadeService Set for w3001EditTrFacadeService
     */
    public void setW3001EditTrFacadeService(
        ProcessFacadeService<Void, W3001ListDomain> editTrFacadeService) {
        w3001EditTrFacadeService = editTrFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        W3001ActionForm form = (W3001ActionForm)actForm;

        W3001ListDomain w3001ListDomain = new W3001ListDomain();

        ActionUtil.prepareBusinessDomain(w3001ListDomain, form.getWindowId(),
            form.getScreenId());

        w3001ListDomain.setTrNo(form.getTrNo());
        // kimura add 20140724 set mode flag
        form.setEditFlg(EDIT_FLG_EDIT);
        // chaiporn add 20140808 set TR status into domain
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3001ListDomain listDomain : form.getW3001ListDomainList()) {
                if (form.getTrNo().equals(listDomain.getTrNo())) {
                    w3001ListDomain.setTrStatus(listDomain.getTrStatus());
                    w3001ListDomain.setTrItemTyp(listDomain.getTrItemTyp());
                  //Chairpon 20150120 Add user Authen list
                    if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
                        w3001ListDomain.setUserAuthList(null);
                    } else {
                        List<? extends UserAuthDomain> userAuthList = userAuthService
                        .getUserAuthList(PERMIT_FUNC_ID_W3001R, PERMIT_FUNC_ID_W3001B);
                        if (userAuthList.size() == 0) {
                            throw new GscmApplicationException(GSCM_I0_0009);
                        }
                        w3001ListDomain.setUserAuthList(userAuthList);
                    }
                }
            }
        }
        w3001EditTrFacadeService.process(w3001ListDomain);

        // kimura add 20140724 control forwarding path
        String forward = "";
        // Get TR information from the selected TR for update
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3001ListDomain listDomain : form.getW3001ListDomainList()) {
                // for (W3001ListDomain listDomain : form.getListDomainList()) {
                if (form.getTrNo().equals(listDomain.getTrNo())) {
                    if (TR_ITEM_TYP_CML.equals(listDomain.getTrItemTyp())) {
                        forward = FORWARD_SUCCESS_W3006;
                    } else if (TR_ITEM_TYP_PARTS.equals(listDomain
                        .getTrItemTyp())) {
                        forward = FORWARD_SUCCESS_W3008;
                    } else {
                        forward = FORWARD_ERROR;
                    }
                }
            }
        }
        return forward;
    }

}
