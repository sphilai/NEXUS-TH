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

import com.globaldenso.eca0027.core.business.domain.W9005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9005ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action User ID MA Edit screen.
 * <br />User ID MA Edit画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9005ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9005CriteriaDomain w9005CriteriaDomain;
    
    /**
     * Local domain area of the screen
     * <br />画面の地域エリアドメイン
     */
    private W9005ListDomain areaDomain;
    
    /**
     * Company domain area of the screen
     * <br />画面の会社エリアドメイン
     */
    private List<? extends W9005ListDomain> compListDomain;

    /**
     * Factory area domain of the screen
     * <br />画面の工場エリアドメイン
     */
    private List<? extends W9005ListDomain> plantListDomain;

    /**
     * Company
     */
    private String compCd;
    
    /**
     * DSC-ID
     */
    private String dscId;
    
    /**
     * Name
     */
    private String usrNmEn;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;

    /**
     * User Auth List
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9005ActionForm() {
        w9005CriteriaDomain = new W9005CriteriaDomain();
        areaDomain = new W9005ListDomain();
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
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * Getter method for usrNmEn.
     *
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * Setter method for usrNmEn.
     *
     * @param usrNmEn Set for usrNmEn
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }


    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9005CriteriaDomain getW9005CriteriaDomain() {
        return w9005CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW9005CriteriaDomain(W9005CriteriaDomain criteriaDomain) {
        this.w9005CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for areaDomain.
     *
     * @return the areaDomain
     */
    public W9005ListDomain getAreaDomain() {
        if(areaDomain == null) {
            areaDomain = new W9005ListDomain();
        }
        return areaDomain;
    }

    /**
     * Setter method for areaDomain.
     *
     * @param areaDomain Set for areaDomain
     */
    public void setAreaDomain(W9005ListDomain areaDomain) {
        this.areaDomain = areaDomain;
    }

    /**
     * Getter method for compListDomain.
     *
     * @return the compListDomain
     */
    public List<? extends W9005ListDomain> getCompListDomain() {
        return compListDomain;
    }

    /**
     * Setter method for compListDomain.
     *
     * @param compListDomain Set for compListDomain
     */
    public void setCompListDomain(List<? extends W9005ListDomain> compListDomain) {
        this.compListDomain = compListDomain;
    }

    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W9005ListDomain getCompListDomain(int index) {
        if (compListDomain == null) {
            compListDomain = new ArrayList<W9005ListDomain>();
        }

        for (int i = compListDomain.size(); i <= index; i++) {
            compListDomain().add(new W9005ListDomain());
        }
        
        return compListDomain.get(index);
    }

    /**
     * Setter List for domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setCompListDomain(int index, W9005ListDomain listDomain) {
        if (compListDomain == null) {
            compListDomain = new ArrayList<W9005ListDomain>();
        }

        for (int i = compListDomain.size(); i < index; i++) {
            compListDomain().add(new W9005ListDomain());
        }
        
        compListDomain().add(listDomain);
    }

    /**
     * Getter method for plantListDomain.
     *
     * @return the plantListDomain
     */
    public List<? extends W9005ListDomain> getPlantListDomain() {
        return plantListDomain;
    }

    /**
     * Setter method for plantListDomain.
     *
     * @param plantListDomain Set for plantListDomain
     */
    public void setPlantListDomain(List<? extends W9005ListDomain> plantListDomain) {
        this.plantListDomain = plantListDomain;
    }

    /**
     * Getter List for domain list.
     * <br />ListドメインリストのGetterです。
     *
     * @param index Index <br />インデックス
     * @return List domain <br />Listドメイン
     */
    public W9005ListDomain getPlantListDomain(int index) {
        if (plantListDomain == null) {
            plantListDomain = new ArrayList<W9005ListDomain>();
        }

        for (int i = plantListDomain.size(); i <= index; i++) {
            plantListDomain().add(new W9005ListDomain());
        }
        
        return plantListDomain.get(index);
    }

    /**
     * Setter for List domain list.
     * <br />ListドメインリストのSetterです。
     *
     * @param index Index <br />インデックス
     * @param listDomain List domain <br />Listドメイン
     */
    public void setPlantListDomain(int index, W9005ListDomain listDomain) {
        if (plantListDomain == null) {
            plantListDomain = new ArrayList<W9005ListDomain>();
        }

        for (int i = plantListDomain.size(); i < index; i++) {
            plantListDomain().add(new W9005ListDomain());
        }
        
        plantListDomain().add(listDomain);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (areaDomain != null) {
            areaDomain.setRegAdmRole(null);
            areaDomain.setBrowseAllRole(null);
            areaDomain.setRegisterAllRole(null);
        }
        if (compListDomain != null) {
            for (W9005ListDomain comp : compListDomain) {
                comp.setComAdmRole(null);
                comp.setBhtLockAutRole(null);
                comp.setMaAgentBRole(null);
                comp.setMaAgentRRole(null);
                comp.setMaOtherBRole(null);
                comp.setMaOtherRRole(null);
                comp.setDocRRole(null);
                comp.setShipActRRole(null);
            }
        }
        if (plantListDomain != null) {
            for (W9005ListDomain plant : plantListDomain) {
                plant.setPlnAdmRole(null);
                plant.setExpReqBRole(null);
                plant.setExpReqRRole(null);
                plant.setReqPkgBRole(null);
                plant.setReqPkgRRole(null);
                plant.setErtBRole(null);
                plant.setErtRRole(null);
                plant.setOrderBRole(null);
                plant.setOrderRRole(null);
                plant.setPltInstrBRole(null);
                plant.setPltInstrRRole(null);
                plant.setMtagBRole(null);
                plant.setMtagRRole(null);
                plant.setCmlBRole(null);
                plant.setCmlRRole(null);
                plant.setXtagBRole(null);
                plant.setXtagRRole(null);
                plant.setCarryOutInBRole(null);
                plant.setCarryOutInRRole(null);
                plant.setStgInstrBRole(null);
                plant.setStgInstrRRole(null);
                plant.setStgActBRole(null);
                plant.setStgActRRole(null);
                plant.setShipCfrmBRole(null);
                plant.setShipCfrmRRole(null);
                plant.setPrgsCtrlBRole(null);
            }
        }
    }
   
    /**
     * userAuthList のゲッターメソッドです。
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * userAuthList のセッターメソッドです。
     *
     * @param userAuthList userAuthList に設定する
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }
    
    /**
     * Return {@link #compListDomain}. (Helper method for Generics)
     * <br />{@link #compListDomain}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W9005ListDomain
     * @return {@link #compListDomain}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> compListDomain() {
        return (List<T>) compListDomain;
    }
    
    /**
     * Return {@link #plantListDomain}. (Helper method for Generics)
     * <br />{@link #plantListDomain}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W9005ListDomain
     * @return {@link #plantListDomain}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> plantListDomain() {
        return (List<T>) plantListDomain;
    }
}
