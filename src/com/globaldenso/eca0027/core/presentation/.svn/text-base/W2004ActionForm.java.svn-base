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

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The Action form class for Packagin Instruction Register Screen
 * <br />梱包指示Register画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Previous transition screen (W2001 or W2003)
     * <br />遷移元画面 (W2001 or W2003)
     */
    private String fromScreenId;
    
    /**
     * Packaging Instruction NO selected in the Main screen
     * <br />Main画面で選択された梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * Download flag (Instr)
     * <br />ダウンロードフラグ (Instr)
     */
    private boolean downloadInstr;
    
    /**
     * Download flag (CML)
     * <br />ダウンロードフラグ (CML)
     */
    private boolean downloadCmlForInstr;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2004CriteriaDomain w2004CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2004ListDomain> listDomainList;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2004ActionForm() {
        w2004CriteriaDomain = new W2004CriteriaDomain();
    }

    /**
     * Getter method for fromScreenId.
     *
     * @return the fromScreenId
     */
    public String getFromScreenId() {
        return fromScreenId;
    }

    /**
     * Setter method for fromScreenId.
     *
     * @param fromScreenId Set for fromScreenId
     */
    public void setFromScreenId(String fromScreenId) {
        this.fromScreenId = fromScreenId;
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W2004CriteriaDomain getW2004CriteriaDomain() {
        return w2004CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW2004CriteriaDomain(W2004CriteriaDomain criteriaDomain) {
        this.w2004CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }
    
    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2004ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2004ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2004ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, W2004ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2004ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2004ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * Getter method for downloadInstr.
     *
     * @return the downloadInstr
     */
    public boolean isDownloadInstr() {
        return downloadInstr;
    }

    /**
     * Setter method for downloadInstr.
     *
     * @param downloadInstr Set for downloadInstr
     */
    public void setDownloadInstr(boolean downloadInstr) {
        this.downloadInstr = downloadInstr;
    }

    /**
     * Getter method for downloadCmlForInstr.
     *
     * @return the downloadCmlForInstr
     */
    public boolean isDownloadCmlForInstr() {
        return downloadCmlForInstr;
    }

    /**
     * Setter method for downloadCmlForInstr.
     *
     * @param downloadCmlForInstr Set for downloadCmlForInstr
     */
    public void setDownloadCmlForInstr(boolean downloadCmlForInstr) {
        this.downloadCmlForInstr = downloadCmlForInstr;
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        // Clear checkbox
        // チェックボックスのクリア
        if (listDomainList != null) {
            for (W2004ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
        
        // Clear download flag
        // ダウンロードフラグのクリア
        downloadInstr = false;
        downloadCmlForInstr = false;
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
