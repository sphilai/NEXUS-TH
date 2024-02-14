/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6004UpdateDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Form of action Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のアクション・フォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004ActionForm  extends AbstractActionForm {
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     *  W6004 search criteria domain
     *  <br />W6004検索条件ドメイン
     */
    private W6004CriteriaDomain criteriaDomain;

    /**
     * List of search results W6004 domain
     * <br />W6004検索結果ドメインのリスト
     */
    private List<? extends W6004ListDomain> listDomainList;


    /**
     * W6004Update domain
     * <br />W6004Updateドメイン
     */
    private W6004UpdateDomain updateDomain;
    
    /**
     * Search results display area flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;

    /**
     * C/C TYPE
     */
    private String customTimingTyp;
    
    /**
     * DSC ID
     */
    private String dscId;
    
    /**
     * disabledFlg
     */
    private boolean disabledFlg;
    
    /**
     * Cont. Sort Key
     */
    private String containerSortingKey;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004ActionForm() {
        criteriaDomain = new W6004CriteriaDomain();
    }

    /**
     * Getter method of criteriaDomain.
     * <br />criteriaDomain のゲッターメソッドです。
     *
     * @return the criteriaDomain
     */
    public W6004CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method of criteriaDomain.
     * <br />criteriaDomain のセッターメソッドです。
     *
     * @param criteriaDomain criteriaDomain に設定する
     */
    public void setCriteriaDomain(W6004CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method of listDomainList.
     * <br />listDomainList のゲッターメソッドです。
     *
     * @return the listDomainList
     */
    public List<? extends W6004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method of listDomainList.
     * <br />listDomainList のセッターメソッドです。
     *
     * @param listDomainList listDomainList に設定する
     */
    public void setListDomainList(List<? extends W6004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method of displayList.
     * <br />displayList のゲッターメソッドです。
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method of displayList.
     * <br />displayList のセッターメソッドです。
     *
     * @param displayList displayList に設定する
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for updateDomain.
     *
     * @return the updateDomain
     */
    public W6004UpdateDomain getUpdateDomain() {
        return updateDomain;
    }

    /**
     * Setter method for updateDomain.
     *
     * @param updateDomain Set for updateDomain
     */
    public void setUpdateDomain(W6004UpdateDomain updateDomain) {
        this.updateDomain = updateDomain;
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * Getter method for disabledFlg.
     *
     * @return the disabledFlg
     */
    public boolean isDisabledFlg() {
        return disabledFlg;
    }

    /**
     * Setter method for disabledFlg.
     *
     * @param disabledFlg Set for disabledFlg
     */
    public void setDisabledFlg(boolean disabledFlg) {
        this.disabledFlg = disabledFlg;
    }
    
    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W6004ListDomain listDomain : listDomainList) {
                if (!listDomain.isDisabledFlg()) {
                    listDomain.setSelected(null);
                }
            }
        }
    }
}
