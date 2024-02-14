/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0163;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W1001EditFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Move To Register action class of a Export Request Header screen.
 * <br />梱包指示Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W1008Init.do
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007MoveToCMLAction extends W1007AbstractAction {

    /**
     * W1008Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<W1007UpdateDomain, W1007UpdateDomain> w1007MoveToCMLFacadeService;
    /**
     * Constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1007MoveToCMLAction() {
        super();
    }

    /**
     * <p>Setter method for w1007MoveToCMLFacadeService.</p>
     *
     * @param moveToCMLFacadeService Set for w1007MoveToCMLFacadeService
     */
    public void setW1007MoveToCMLFacadeService(
        SearchFacadeService<W1007UpdateDomain, W1007UpdateDomain> moveToCMLFacadeService) {
        w1007MoveToCMLFacadeService = moveToCMLFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * - Line item selection check
     *     Call the {@link W1001EditFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W1001EditFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        W1007ActionForm w1007Form = (W1007ActionForm) form;
        boolean result = validateData(w1007Form.getW1007CriteriaDomain(), w1007Form.getListDomainList());
        if(!result){
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0163, null);
            errorList.add(msgUpdateStatus);
            throw new ValidationException(errorList);
        }
        // Setting of an update domain
        // 更新ドメインの設定
        W1007UpdateDomain w1007UpdateDomain = prepareUpdateDomain(w1007Form);
        w1007MoveToCMLFacadeService.search(w1007UpdateDomain);
        w1007Form.setListDomainList(w1007Form.getListDomainList());
        return FORWARD_SUCCESS;
    }
    
    /**
     *  Validate Data each items in grid
     *
     * @param list List<? extends W1007ListDomain>
     * @param criteria W1007CriteriaDomain
     * @return Boolean
     */
    protected boolean validateData(W1007CriteriaDomain criteria, List<? extends W1007ListDomain> list)
    {
        boolean isCML = false;
        for (W1007ListDomain domain : list) {
            // Have item to CML
            if(domain.isPalletTempFlag() && domain.getPalletNo() != null && domain.getPalletNo().trim().length() > 0 )
            {
                try{
                    int palletNo = Integer.parseInt(domain.getPalletNo().trim());
                    isCML = true;
                }catch (Exception e) {
                }
               
            }
        }
        return isCML;
    }
    /**
     *  Prepare Data to UpdateDomain
     *
     * @param form Action form<br />アクションフォーム
     * @return W1008UpdateDomain
     */
    protected W1007UpdateDomain prepareUpdateDomain(W1007ActionForm form) {
        W1007UpdateDomain updateDomain = new W1007UpdateDomain();

         // Setting of a screen common information
         // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

         // Setting of condition domain, and a List domain
         // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        return updateDomain;
    }
}
