/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9004DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * Action class for delete of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面の削除アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9004
 *     ‐"error": W9004
 *     ‐"W9004": /W9004Init.do
 * </pre>
 * @author $Author: 810833843 $
 * @version $Revision: 10049 $
 */
public class W9004DeleteAction extends W9004AbstractAction {

    /**
     * Delete Facade Service<br />
     * Delete Facadeサービス
     */
    protected DeleteFacadeService<Void, W9004UpdateDomain> w9004DeleteFacadeService;
    
    /**
     * Default constructor<br />
     * <br />デフォルトコンストラクタです。
     */
    public W9004DeleteAction() {
        super();
    }

    /**
     * Setter method for w9004DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9004DeleteFacadeService
     */
    public void setW9004DeleteFacadeService(
        DeleteFacadeService<Void, W9004UpdateDomain> deleteFacadeService) {
        w9004DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * -Set of mass update domain
     *   Set for {@link W9004UpdateDomain}
     * -Execution of the delete process
     *  Call {@link W9004DeleteFacadeServiceImpl}
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     {@link W9004UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9004DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form
        , HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9004ActionForm w9004Form = (W9004ActionForm) form;
        W9004CriteriaDomain w9004CriteriaDomain = w9004Form.getW9004CriteriaDomain();
        
        String selected = w9004CriteriaDomain.getSelected();
        int index = -1;
        if (selected != null) {
            index = Integer.parseInt(selected);
        }
        
        w9004Form.setCountPerPage(PAGE_MAX_COUNT);
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(w9004Form, mapping, request);
        w9004CriteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        W9004UpdateDomain updateDomain = prepareUpdateDomain(w9004Form, index);
        
        w9004DeleteFacadeService.delete(updateDomain);
        
        w9004CriteriaDomain.setSelected(null);
        addGlobalMessage(request, GSCM_I0_0007, updateDomain.getDeleteCount());

        return FORWARD_SUCCESS;
    }

    /**
     * 
     * Generate {@link W9004UpdateDomain}
     * <br />{@link W9004UpdateDomain}を作成します。
     *
     * @param form Action form of User ID MA Inquiryscreen<br />
     * User ID MA Inquiry画面のアクションフォーム
     * @param index Selected line number<br />
     * 選択行番号
     * @return  {@link W9004UpdateDomain} after generate<br />
     * 作成した{@link W9004UpdateDomain}
     */
    protected W9004UpdateDomain prepareUpdateDomain(W9004ActionForm form, int index) {
        W9004UpdateDomain updateDomain = new W9004UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        for (W9004ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
            listDomain.setTimeZone(updateDomain.getTimeZone());
        }
        
        updateDomain.setCriteriaDomain(form.getW9004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            if (i == index) {
                updateDomain.getListDomainList().get(i).setSelected(CHECK_ON);
            } else {
                updateDomain.getListDomainList().get(i).setSelected(CHECK_OFF);
            }
        }
        
        return updateDomain;
    }
}
