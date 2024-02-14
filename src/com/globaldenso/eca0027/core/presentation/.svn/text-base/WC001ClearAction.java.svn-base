/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_ERT_TT_PLTZ_ITEM;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;

/**
 *    This is a Clear action class of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のClearアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WC001.jsp
 *     - "error":WC001.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class WC001ClearAction extends WC001AbstractAction {
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001ClearAction() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        WC001ActionForm wc001Form = (WC001ActionForm) form;

        // A setting of conditions, and a list domain
        // 条件、リストドメインの設定
        wc001Form.setCriteriaDomain(this.prepareCriteriaDomain(wc001Form.getCriteriaDomain()));
        wc001Form.setListDomainList(this.prepareListDomain());
        
        // Screen fields attributes
        // 画面表示制御
        wc001Form.setStrAfterRegist(FLAG_OFF);
        // Set screen button attributes. 
        // ボタンの活性・非活性制御
        controlDisplay(wc001Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set up a condition domain.
     * <br />条件ドメインを設定します。
     *
     * @param criteria Condition domain<br />条件ドメイン
     * @return Action form<br />アクションフォーム
     */
    protected WC001CriteriaDomain prepareCriteriaDomain(WC001CriteriaDomain criteria) {

        // It clears to the item of following.
        // 以下の項目に対し、クリアする
        criteria.setReturnStyleCd("");    // 【25】Return style CD
        criteria.setPalletQty("");        // 【26】Pallet Q'ty
        criteria.setLength("");           // 【27】Length
        criteria.setWidth("");            // 【28】Width
        criteria.setHeight("");           // 【29】Height
        criteria.setVolume("");           // 【30】Volume
        criteria.setNetWeight("");        // 【31】N/W
        criteria.setGrossWeight("");      // 【32】G/W
        criteria.setPalletCartonTyp("");  // Pallet/Carton Type UT420 ADD

        return criteria;
    }
    

    /**
     * Set up a list domain.
     * <br />リストドメインを設定します。
     *
     * @return Action form<br />アクションフォーム
     */
    protected List<WC001ListDomain> prepareListDomain() {

        List<WC001ListDomain> listDomainList = new ArrayList<WC001ListDomain>();
        for (int i = 0; i < MAX_ERT_TT_PLTZ_ITEM; i++) {
            WC001ListDomain domain = new WC001ListDomain();
            domain.setPltzItemNo("");
            domain.setModelCd("");
            domain.setQty("");
            listDomainList.add(domain);
        }
        return listDomainList;
    }
}
