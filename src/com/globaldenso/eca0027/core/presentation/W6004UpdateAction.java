/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *Class action Update of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のUpdateアクションクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004UpdateAction extends W6004AbstractAction {
    /**
     * W6004InitFacadeService
     */
    protected UpdateFacadeService<Integer, W6004UpdateDomain> w6004UpdateFacadeService;

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004UpdateAction() {
        super();
    }
  

    /**
     * Setter method for w6004UpdateFacadeService.
     *
     * @param updateFacadeService Set for w6004UpdateFacadeService
     */
    public void setW6004UpdateFacadeService(UpdateFacadeService<Integer, W6004UpdateDomain> updateFacadeService) {
        w6004UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Updated Invoide Palletize Work
     * </pre>
     * <pre>
     * インボイス作成対象パレタイズワークを更新
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {

        // Acquisition of form
        // フォームの取得
        W6004ActionForm w6004Form = (W6004ActionForm) form;

        // Setup of update domain
        // 更新用ドメインの設定
        W6004UpdateDomain updateDomain = prepareUpdateDomain(w6004Form);
        
        // Update process
        // 更新処理
        int updateCount = w6004UpdateFacadeService.update(updateDomain);
        
        // Updating completion message 
        // 更新完了メッセージ
        addGlobalMessage(request, GSCM_I0_0006, updateCount);
        
        // Renewal of a List domain 
        // Listドメインの更新
        updateListDomain(updateDomain.getListDomainList());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Update the List domain.
     * <br />Listドメインを更新します。
     *
     * @param listDomainList List domain<br />
     * Listドメイン
     */
    protected void updateListDomain(List<? extends W6004ListDomain> listDomainList) {
        for (W6004ListDomain listDomain : listDomainList) {
            // diableFlg of the data registered into the work is updated.
            // ワークに登録されたデータのdiableFlgを更新
            if (CHECK_ON.equals(listDomain.getSelected()) && !listDomain.isDisabledFlg()) {
                listDomain.setDisabledFlg(true);
            }
        }
    }
    
    /**
     * Set the update domain.
     * <br />更新用ドメインを設定します。
     * 
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException ApplicationException
     */
    protected W6004UpdateDomain prepareUpdateDomain(W6004ActionForm form) throws ApplicationException {
        
        // Acquisition of CriteriaDomain 
        // CriteriaDomainの取得
        W6004CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Acquisition of ListDomain 
        // ListDomainの取得
        List<? extends W6004ListDomain> listDomain = form.getListDomainList();
        for (int i = 0; i < listDomain.size(); i++) {
            if (CUSTOM_TIMING_TYPE_B.equals(criteriaDomain.getCustomTimingTyp())) {
                listDomain.get(i).setShippingFirmNo(listDomain.get(i).getStgActNo());
            } else if (CUSTOM_TIMING_TYPE_Z.equals(criteriaDomain.getCustomTimingTyp())) {
                listDomain.get(i).setShippingFirmNo(listDomain.get(i).getStgInstrNo());
            }
        }
        W6004UpdateDomain updateDomain = new W6004UpdateDomain();
        // Copy of a property 
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(updateDomain, criteriaDomain);
        updateDomain.setListDomainList(form.getListDomainList());
        updateDomain.setCriteriaDomain(form.getCriteriaDomain());
        // DSC_IDをセット
        String dscId = form.getCriteriaDomain().getLoginUserDscId();
        updateDomain.getCriteriaDomain().setDscId(dscId);
        
        return updateDomain;
    }
}
