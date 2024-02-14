/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9008ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W9008ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9008CriteriaDomain w9008CriteriaDomain;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W9008ListDomain> listDomainList;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;
    
    /**
     * Registration mode flag (for screen)
     * <br />登録モードフラグ (画面用)
     */
    private boolean registerFlg;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9008ActionForm() {
        w9008CriteriaDomain = new W9008CriteriaDomain();
    }

    /**
     * Getter method for w9008CriteriaDomain.
     *
     * @return the w9008CriteriaDomain
     */
    public W9008CriteriaDomain getW9008CriteriaDomain() {
        return w9008CriteriaDomain;
    }

    /**
     * Setter method for w9008CriteriaDomain.
     *
     * @param w9008CriteriaDomain Set for w9008CriteriaDomain
     */
    public void setW9008CriteriaDomain(W9008CriteriaDomain w9008CriteriaDomain) {
        this.w9008CriteriaDomain = w9008CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9008ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9008ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    /**
     * Getter List of domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W9008ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9008ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W9008ListDomain());
        }
        
        return listDomainList.get(index);
    }
    /**
     * Setter of the List domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setListDomainList(int index, W9008ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W9008ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W9008ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W9008ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
                listDomain.setFree1DispFlg(null);
                listDomain.setFree2DispFlg(null);
                listDomain.setFree3DispFlg(null);
                listDomain.setHsCdDispFlg(null);
            }
        }
    }
    
    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }

    /**
     * Getter method for registerFlg.
     *
     * @return the registerFlg
     */
    public boolean isRegisterFlg() {
        return registerFlg;
    }

    /**
     * Setter method for registerFlg.
     *
     * @param registerFlg Set for registerFlg
     */
    public void setRegisterFlg(boolean registerFlg) {
        this.registerFlg = registerFlg;
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W9008ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
