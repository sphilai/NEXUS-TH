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

import com.globaldenso.eca0027.core.business.domain.W1001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Export Request screen.
 * <br />船積実績Main画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1001ActionForm extends AbstractActionForm {

    /**
     * serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * conditions domain.<br />
     * 条件ドメイン
     */
    private W1001CriteriaDomain w1001CriteriaDomain;
    
    /**
     * list of search results domain.<br />
     * 検索結果ドメインのリスト
     */
    private List<? extends W1001ListDomain> listDomainList;
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * Export Request No
     */
    private String expRequestNo;
    
    /**
     * Apply Start Date
     */
    private String aplyStrtDt;

    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;

    /**
     * Search mode flag (for screen)
     * <br />検索モードフラグ (画面用)
     */
    private boolean searchFlg;
    
    /**
     * Row Num
     * 
     */
    private String rowNum;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1001ActionForm() {
        w1001CriteriaDomain = new W1001CriteriaDomain();
    }

    /**
     * Getter method for w1001CriteriaDomain.
     *
     * @return the w1001CriteriaDomain
     */
    public W1001CriteriaDomain getW1001CriteriaDomain() {
        return w1001CriteriaDomain;
    }

    /**
     * <p>Getter method for rowNum.</p>
     *
     * @return the rowNum
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * <p>Setter method for rowNum.</p>
     *
     * @param rowNum Set for rowNum
     */
    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    /**
     * Setter method for w1001CriteriaDomain.
     *
     * @param criteriaDomain Set for w1001CriteriaDomain
     */
    public void setW1001CriteriaDomain(W1001CriteriaDomain criteriaDomain) {
        w1001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W1001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W1001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for displayList.
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList.
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
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
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W1001ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1001ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W1001ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setListDomainList(int index, W1001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W1001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W1001ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * Getter method for searchFlg.
     *
     * @return the searchFlg
     */
    public boolean isSearchFlg() {
        return searchFlg;
    }

    /**
     * Setter method for searchFlg.
     *
     * @param searchFlg Set for searchFlg
     */
    public void setSearchFlg(boolean searchFlg) {
        this.searchFlg = searchFlg;
    }
    
    /**
     * Return {@link #listDomainList}. (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1001ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
