/*
 * Project : NEXUS_EXPORT
 *
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORWARD_SUCCESS_W3006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORWARD_SUCCESS_W3008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EDIT_FLG_CONFIRM;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author Chaiporn
 * @version 1.00
 */
public class W3001ConfirmDetailAction extends W3001AbstractAction {

    /**
     * <p>Type in the role of the field.</p>
     */
    protected ProcessFacadeService<Void, W3001ListDomain> w3001ConfirmDetailFacadeService;

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public W3001ConfirmDetailAction() {
    }

    /**
     * <p>Setter method for w3001ConfirmDetailFacadeService.</p>
     *
     * @param confirmDetailFacadeService Set for w3001ConfirmDetailFacadeService
     */
    public void setW3001ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W3001ListDomain> confirmDetailFacadeService) {
        w3001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
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

        form.setEditFlg(EDIT_FLG_CONFIRM);

        w3001ConfirmDetailFacadeService.process(w3001ListDomain);

        String forward = "";
        //Get TR information from the selected TR for update  
        if (StringUtils.isNotEmpty(form.getTrNo())) {
            for (W3001ListDomain listDomain : form.getW3001ListDomainList()) {
                //for (W3001ListDomain listDomain : form.getListDomainList()) {
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
