/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of search results in User ID MA Edit screen.
 * <br />User ID MA Edit画面の検索結果ドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W9005ListDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Adm
     */
    private String regAdmRole;

    /**
     * Browse All
     */
    private String browseAllRole;

    /**
     * Register All
     */
    private String registerAllRole;

    /**
     * Company
     */
    private String compCd;

    /**
     * Adm
     */
    private String comAdmRole;

    /**
     * BHT Lock
     */
    private String bhtLockAutRole;

    /**
     * MA Agent B
     */
    private String maAgentBRole;

    /**
     * MA Agent R
     */
    private String maAgentRRole;

    /**
     * MA Other B
     */
    private String maOtherBRole;

    /**
     * MA Other R
     */
    private String maOtherRRole;

    /**
     * Doc.
     */
    private String docRRole;

    /**
     * Ship Act.
     */
    private String shipActRRole;

    /**
     * Company
     */
    private String nxsCompCd;

    /**
     * Plant CD
     */
    private String plantCd;

    /**
     * Adm
     */
    private String plnAdmRole;

    /**
     * Exp Req B
     */
    private String expReqBRole;

    /**
     * Exp Req R
     */
    private String expReqRRole;

    /**
     * Req PKG B
     */
    private String reqPkgBRole;

    /**
     * Req PKG R
     */
    private String reqPkgRRole;

    /**
     * ERT B
     */
    private String ertBRole;

    /**
     * ERT R
     */
    private String ertRRole;

    /**
     * Order B
     */
    private String orderBRole;

    /**
     * Order R
     */
    private String orderRRole;

    /**
     * Plt Instr. B
     */
    private String pltInstrBRole;

    /**
     * Plt Instr. R
     */
    private String pltInstrRRole;

    /**
     * M-TAG B
     */
    private String mtagBRole;

    /**
     * M-TAG R
     */
    private String mtagRRole;

    /**
     * CML B
     */
    private String cmlBRole;

    /**
     * CML R
     */
    private String cmlRRole;

    /**
     * X-TAG B
     */
    private String xtagBRole;

    /**
     * X-TAG R
     */
    private String xtagRRole;

    /**
     * Carry Out/In B
     */
    private String carryOutInBRole;

    /**
     * Carry Out/In R
     */
    private String carryOutInRRole;

    /**
     * Stg Instr. B
     */
    private String stgInstrBRole;

    /**
     * Stg Instr. R
     */
    private String stgInstrRRole;

    /**
     * Stg Act. B
     */
    private String stgActBRole;

    /**
     * Stg Act. R
     */
    private String stgActRRole;

    /**
     * Ship Cfrm B
     */
    private String shipCfrmBRole;

    /**
     * Ship Cfrm R
     */
    private String shipCfrmRRole;

    /**
     * PRGS Ctrl B
     */
    private String prgsCtrlBRole;

    /**
     * Active control Adm
     */
    private boolean enabledAdm;
    
    /**
     * Active control Browse All
     */
    private boolean enabledBrowseAll;
    
    /**
     * Active control Register All
     */
    private boolean enabledRegisterAll;

    /**
     * Active control Adm
     */
    private boolean enabledComAdm;

    /**
     * Active control bhtLockAut
     */
    private boolean enabledBhtLockAut;

    /**
     * Active control maAgentB
     */
    private boolean enabledMaAgentB;

    /**
     * Active control maAgentR
     */
    private boolean enabledMaAgentR;

    /**
     * Active control maOtherB
     */
    private boolean enabledMaOtherB;

    /**
     * Active control maOtherR
     */
    private boolean enabledMaOtherR;

    /**
     * Active control docR
     */
    private boolean enabledDocR;

    /**
     * Active control shipActR
     */
    private boolean enabledShipActR;

    /**
     * Active control Adm
     */
    private boolean enabledPlnAdm;

    /**
     * Active control Exp Req B
     */
    private boolean enabledExpreqB;

    /**
     * Active control Exp Req R
     */
    private boolean enabledExpreqR;

    /**
     * Active control Req PKG B
     */
    private boolean enabledReqPkgB;

    /**
     * Active control Req PKG R
     */
    private boolean enabledReqPkgR;

    /**
     * Active control ERT B
     */
    private boolean enabledErtB;

    /**
     * Active control ERT R
     */
    private boolean enabledErtR;

    /**
     * Active control Order B
     */
    private boolean enabledOrderB;

    /**
     * Active control Order R
     */
    private boolean enabledOrderR;

    /**
     * Active control Plt Instr. B
     */
    private boolean enabledPltInstrB;

    /**
     * Active control Plt Instr. R
     */
    private boolean enabledPltInstrR;

    /**
     * Active control M-TAG B
     */
    private boolean enabledMtagB;

    /**
     * Active control M-TAG R
     */
    private boolean enabledMtagR;

    /**
     * Active control CML B
     */
    private boolean enabledCmlB;

    /**
     * Active control CML R
     */
    private boolean enabledCmlR;

    /**
     * Active control X-TAG B
     */
    private boolean enabledXtagB;

    /**
     * Active control X-TAG R
     */
    private boolean enabledXtagR;

    /**
     * Active control Carry Out/In B
     */
    private boolean enabledCarryOutInB;

    /**
     * Active control Carry Out/In R
     */
    private boolean enabledCarryOutInR;

    /**
     * Active control Stg Instr. B
     */
    private boolean enabledStgInstrB;

    /**
     * Active control Stg Instr. R
     */
    private boolean enabledStgInstrR;

    /**
     * Active control Stg Act. B
     */
    private boolean enabledStgActB;

    /**
     * Active control Stg Act. R
     */
    private boolean enabledStgActR;

    /**
     * Active control Ship Cfrm B
     */
    private boolean enabledShipCfrmB;

    /**
     * Active control Ship Cfrm R
     */
    private boolean enabledShipCfrmR;

    /**
     * Active control PRGS Ctrl B
     */
    private boolean enabledPrgsCtrlB;

    /**
     * LAST UPDATE DATE
     * <br />最終更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9005ListDomain() {
    }

    /**
     * Getter method for regAdmRole.
     *
     * @return the regAdmRole
     */
    public String getRegAdmRole() {
        return regAdmRole;
    }

    /**
     * Setter method for regAdmRole.
     *
     * @param regAdmRole Set for regAdmRole
     */
    public void setRegAdmRole(String regAdmRole) {
        this.regAdmRole = regAdmRole;
    }

    /**
     * Getter method for browseAllRole.
     *
     * @return the browseAllRole
     */
    public String getBrowseAllRole() {
        return browseAllRole;
    }

    /**
     * Setter method for browseAllRole.
     *
     * @param browseAllRole Set for browseAllRole
     */
    public void setBrowseAllRole(String browseAllRole) {
        this.browseAllRole = browseAllRole;
    }

    /**
     * Getter method for registerAllRole.
     *
     * @return the registerAllRole
     */
    public String getRegisterAllRole() {
        return registerAllRole;
    }

    /**
     * Setter method for registerAllRole.
     *
     * @param registerAllRole Set for registerAllRole
     */
    public void setRegisterAllRole(String registerAllRole) {
        this.registerAllRole = registerAllRole;
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
     * Getter method for comAdmRole.
     *
     * @return the comAdmRole
     */
    public String getComAdmRole() {
        return comAdmRole;
    }

    /**
     * Setter method for comAdmRole.
     *
     * @param comAdmRole Set for comAdmRole
     */
    public void setComAdmRole(String comAdmRole) {
        this.comAdmRole = comAdmRole;
    }

    /**
     * Getter method for bhtLockAutRole.
     *
     * @return the bhtLockAutRole
     */
    public String getBhtLockAutRole() {
        return bhtLockAutRole;
    }

    /**
     * Setter method for bhtLockAutRole.
     *
     * @param bhtLockAutRole Set for bhtLockRole
     */
    public void setBhtLockAutRole(String bhtLockAutRole) {
        this.bhtLockAutRole = bhtLockAutRole;
    }

    /**
     * Getter method for maAgentBRole.
     *
     * @return the maAgentBRole
     */
    public String getMaAgentBRole() {
        return maAgentBRole;
    }

    /**
     * Setter method for maAgentBRole.
     *
     * @param maAgentBRole Set for maAgentBRole
     */
    public void setMaAgentBRole(String maAgentBRole) {
        this.maAgentBRole = maAgentBRole;
    }

    /**
     * Getter method for maAgentRRole.
     *
     * @return the maAgentRRole
     */
    public String getMaAgentRRole() {
        return maAgentRRole;
    }

    /**
     * Setter method for maAgentRRole.
     *
     * @param maAgentRRole Set for maAgentRRole
     */
    public void setMaAgentRRole(String maAgentRRole) {
        this.maAgentRRole = maAgentRRole;
    }

    /**
     * Getter method for maOtherBRole.
     *
     * @return the maOtherBRole
     */
    public String getMaOtherBRole() {
        return maOtherBRole;
    }

    /**
     * Setter method for maOtherBRole.
     *
     * @param maOtherBRole Set for maOtherBRole
     */
    public void setMaOtherBRole(String maOtherBRole) {
        this.maOtherBRole = maOtherBRole;
    }

    /**
     * Getter method for maOtherRRole.
     *
     * @return the maOtherRRole
     */
    public String getMaOtherRRole() {
        return maOtherRRole;
    }

    /**
     * Setter method for maOtherRRole.
     *
     * @param maOtherRRole Set for maOtherRRole
     */
    public void setMaOtherRRole(String maOtherRRole) {
        this.maOtherRRole = maOtherRRole;
    }

    /**
     * Getter method for docRRole.
     *
     * @return the docRRole
     */
    public String getDocRRole() {
        return docRRole;
    }

    /**
     * Setter method for docRRole.
     *
     * @param docRRole Set for docRRole
     */
    public void setDocRRole(String docRRole) {
        this.docRRole = docRRole;
    }

    /**
     * Getter method for shipActRRole.
     *
     * @return the shipActRRole
     */
    public String getShipActRRole() {
        return shipActRRole;
    }

    /**
     * Setter method for shipActRRole.
     *
     * @param shipActRRole Set for shipActRRole
     */
    public void setShipActRRole(String shipActRRole) {
        this.shipActRRole = shipActRRole;
    }

    /**
     * Getter method for nxsCompCd.
     *
     * @return the nxsCompCd
     */
    public String getNxsCompCd() {
        return nxsCompCd;
    }

    /**
     * Setter method for nxsCompCd.
     *
     * @param nxsCompCd Set for nxsCompCd
     */
    public void setNxsCompCd(String nxsCompCd) {
        this.nxsCompCd = nxsCompCd;
    }

    /**
     * Getter method for plantCd.
     *
     * @return the plantCd
     */
    public String getPlantCd() {
        return plantCd;
    }

    /**
     * Setter method for plantCd.
     *
     * @param plantCd Set for plantCd
     */
    public void setPlantCd(String plantCd) {
        this.plantCd = plantCd;
    }

    /**
     * Getter method for plnAdmRole.
     *
     * @return the plnAdmRole
     */
    public String getPlnAdmRole() {
        return plnAdmRole;
    }

    /**
     * Setter method for plnAdmRole.
     *
     * @param plnAdmRole Set for plnAdmRole
     */
    public void setPlnAdmRole(String plnAdmRole) {
        this.plnAdmRole = plnAdmRole;
    }

    /**
     * Getter method for expReqBRole.
     *
     * @return the expReqBRole
     */
    public String getExpReqBRole() {
        return expReqBRole;
    }

    /**
     * Setter method for expReqBRole.
     *
     * @param expReqBRole Set for expReqBRole
     */
    public void setExpReqBRole(String expReqBRole) {
        this.expReqBRole = expReqBRole;
    }

    /**
     * Getter method for expReqRRole.
     *
     * @return the expReqRRole
     */
    public String getExpReqRRole() {
        return expReqRRole;
    }

    /**
     * Setter method for expReqRRole.
     *
     * @param expReqRRole Set for expReqRRole
     */
    public void setExpReqRRole(String expReqRRole) {
        this.expReqRRole = expReqRRole;
    }

    /**
     * Getter method for reqPkgBRole.
     *
     * @return the reqPkgBRole
     */
    public String getReqPkgBRole() {
        return reqPkgBRole;
    }

    /**
     * Setter method for reqPkgBRole.
     *
     * @param reqPkgBRole Set for reqPkgBRole
     */
    public void setReqPkgBRole(String reqPkgBRole) {
        this.reqPkgBRole = reqPkgBRole;
    }

    /**
     * Getter method for reqPkgRRole.
     *
     * @return the reqPkgRRole
     */
    public String getReqPkgRRole() {
        return reqPkgRRole;
    }

    /**
     * Setter method for reqPkgRRole.
     *
     * @param reqPkgRRole Set for reqPkgRRole
     */
    public void setReqPkgRRole(String reqPkgRRole) {
        this.reqPkgRRole = reqPkgRRole;
    }

    /**
     * Getter method for ertBRole.
     *
     * @return the ertBRole
     */
    public String getErtBRole() {
        return ertBRole;
    }

    /**
     * Setter method for ertBRole.
     *
     * @param ertBRole Set for ertBRole
     */
    public void setErtBRole(String ertBRole) {
        this.ertBRole = ertBRole;
    }

    /**
     * Getter method for ertRRole.
     *
     * @return the ertRRole
     */
    public String getErtRRole() {
        return ertRRole;
    }

    /**
     * Setter method for ertRRole.
     *
     * @param ertRRole Set for ertRRole
     */
    public void setErtRRole(String ertRRole) {
        this.ertRRole = ertRRole;
    }

    /**
     * Getter method for orderBRole.
     *
     * @return the orderBRole
     */
    public String getOrderBRole() {
        return orderBRole;
    }

    /**
     * Setter method for orderBRole.
     *
     * @param orderBRole Set for orderBRole
     */
    public void setOrderBRole(String orderBRole) {
        this.orderBRole = orderBRole;
    }

    /**
     * Getter method for orderRRole.
     *
     * @return the orderRRole
     */
    public String getOrderRRole() {
        return orderRRole;
    }

    /**
     * Setter method for orderRRole.
     *
     * @param orderRRole Set for orderRRole
     */
    public void setOrderRRole(String orderRRole) {
        this.orderRRole = orderRRole;
    }

    /**
     * Getter method for pltInstrBRole.
     *
     * @return the pltInstrBRole
     */
    public String getPltInstrBRole() {
        return pltInstrBRole;
    }

    /**
     * Setter method for pltInstrBRole.
     *
     * @param pltInstrBRole Set for pltInstrBRole
     */
    public void setPltInstrBRole(String pltInstrBRole) {
        this.pltInstrBRole = pltInstrBRole;
    }

    /**
     * Getter method for pltInstrRRole.
     *
     * @return the pltInstrRRole
     */
    public String getPltInstrRRole() {
        return pltInstrRRole;
    }

    /**
     * Setter method for pltInstrRRole.
     *
     * @param pltInstrRRole Set for pltInstrRRole
     */
    public void setPltInstrRRole(String pltInstrRRole) {
        this.pltInstrRRole = pltInstrRRole;
    }

    /**
     * Getter method for mtagBRole.
     *
     * @return the mtagBRole
     */
    public String getMtagBRole() {
        return mtagBRole;
    }

    /**
     * Setter method for mtagBRole.
     *
     * @param mtagBRole Set for mtagBRole
     */
    public void setMtagBRole(String mtagBRole) {
        this.mtagBRole = mtagBRole;
    }

    /**
     * Getter method for mtagRRole.
     *
     * @return the mtagRRole
     */
    public String getMtagRRole() {
        return mtagRRole;
    }

    /**
     * Setter method for mtagRRole.
     *
     * @param mtagRRole Set for mtagRRole
     */
    public void setMtagRRole(String mtagRRole) {
        this.mtagRRole = mtagRRole;
    }

    /**
     * Getter method for cmlBRole.
     *
     * @return the cmlBRole
     */
    public String getCmlBRole() {
        return cmlBRole;
    }

    /**
     * Setter method for cmlBRole.
     *
     * @param cmlBRole Set for cmlBRole
     */
    public void setCmlBRole(String cmlBRole) {
        this.cmlBRole = cmlBRole;
    }

    /**
     * Getter method for cmlRRole.
     *
     * @return the cmlRRole
     */
    public String getCmlRRole() {
        return cmlRRole;
    }

    /**
     * Setter method for cmlRRole.
     *
     * @param cmlRRole Set for cmlRRole
     */
    public void setCmlRRole(String cmlRRole) {
        this.cmlRRole = cmlRRole;
    }

    /**
     * Getter method for xTagBRole.
     *
     * @return the xtagBRole
     */
    public String getXtagBRole() {
        return xtagBRole;
    }

    /**
     * Setter method for xTagBRole.
     *
     * @param xtagBRole Set for xtagBRole
     */
    public void setXtagBRole(String xtagBRole) {
        this.xtagBRole = xtagBRole;
    }

    /**
     * Getter method for xtagRRole.
     *
     * @return the xtagRRole
     */
    public String getXtagRRole() {
        return xtagRRole;
    }

    /**
     * Setter method for xtagRRole.
     *
     * @param xtagRRole Set for xtagRRole
     */
    public void setXtagRRole(String xtagRRole) {
        this.xtagRRole = xtagRRole;
    }

    /**
     * Getter method for carryOutInBRole.
     *
     * @return the carryOutInBRole
     */
    public String getCarryOutInBRole() {
        return carryOutInBRole;
    }

    /**
     * Setter method for carryOutInBRole.
     *
     * @param carryOutInBRole Set for carryOutInBRole
     */
    public void setCarryOutInBRole(String carryOutInBRole) {
        this.carryOutInBRole = carryOutInBRole;
    }

    /**
     * Getter method for carryOutInRRole.
     *
     * @return the carryOutInRRole
     */
    public String getCarryOutInRRole() {
        return carryOutInRRole;
    }

    /**
     * Setter method for carryOutInRRole.
     *
     * @param carryOutInRRole Set for carryOutInRRole
     */
    public void setCarryOutInRRole(String carryOutInRRole) {
        this.carryOutInRRole = carryOutInRRole;
    }

    /**
     * Getter method for stgInstrBRole.
     *
     * @return the stgInstrBRole
     */
    public String getStgInstrBRole() {
        return stgInstrBRole;
    }

    /**
     * Setter method for stgInstrBRole.
     *
     * @param stgInstrBRole Set for stgInstrBRole
     */
    public void setStgInstrBRole(String stgInstrBRole) {
        this.stgInstrBRole = stgInstrBRole;
    }

    /**
     * Getter method for stgInstrRRole.
     *
     * @return the stgInstrRRole
     */
    public String getStgInstrRRole() {
        return stgInstrRRole;
    }

    /**
     * Setter method for stgInstrRRole.
     *
     * @param stgInstrRRole Set for stgInstrRRole
     */
    public void setStgInstrRRole(String stgInstrRRole) {
        this.stgInstrRRole = stgInstrRRole;
    }

    /**
     * Getter method for stgActBRole.
     *
     * @return the stgActBRole
     */
    public String getStgActBRole() {
        return stgActBRole;
    }

    /**
     * Setter method for stgActBRole.
     *
     * @param stgActBRole Set for stgActBRole
     */
    public void setStgActBRole(String stgActBRole) {
        this.stgActBRole = stgActBRole;
    }

    /**
     * Getter method for stgActRRole.
     *
     * @return the stgActRRole
     */
    public String getStgActRRole() {
        return stgActRRole;
    }

    /**
     * Setter method for stgActRRole.
     *
     * @param stgActRRole Set for stgActRRole
     */
    public void setStgActRRole(String stgActRRole) {
        this.stgActRRole = stgActRRole;
    }

    /**
     * Getter method for shipCfrmBRole.
     *
     * @return the shipCfrmBRole
     */
    public String getShipCfrmBRole() {
        return shipCfrmBRole;
    }

    /**
     * Setter method for shipCfrmBRole.
     *
     * @param shipCfrmBRole Set for shipCfrmBRole
     */
    public void setShipCfrmBRole(String shipCfrmBRole) {
        this.shipCfrmBRole = shipCfrmBRole;
    }

    /**
     * Getter method for shipCfrmRRole.
     *
     * @return the shipCfrmRRole
     */
    public String getShipCfrmRRole() {
        return shipCfrmRRole;
    }

    /**
     * Setter method for shipCfrmRRole.
     *
     * @param shipCfrmRRole Set for shipCfrmRRole
     */
    public void setShipCfrmRRole(String shipCfrmRRole) {
        this.shipCfrmRRole = shipCfrmRRole;
    }

    /**
     * Getter method for prgsCtrlBRole.
     *
     * @return the prgsCtrlBRole
     */
    public String getPrgsCtrlBRole() {
        return prgsCtrlBRole;
    }

    /**
     * Setter method for prgsCtrlBRole.
     *
     * @param prgsCtrlBRole Set for prgsCtrlBRole
     */
    public void setPrgsCtrlBRole(String prgsCtrlBRole) {
        this.prgsCtrlBRole = prgsCtrlBRole;
    }

    /**
     * Getter method for enabledAdm.
     *
     * @return the enabledAdm
     */
    public boolean isEnabledAdm() {
        return enabledAdm;
    }

    /**
     * Setter method for enabledAdm.
     *
     * @param enabledAdm Set for enabledAdm
     */
    public void setEnabledAdm(boolean enabledAdm) {
        this.enabledAdm = enabledAdm;
    }

    /**
     * Getter method for enabledBrowseAll.
     *
     * @return the enabledBrowseAll
     */
    public boolean isEnabledBrowseAll() {
        return enabledBrowseAll;
    }

    /**
     * Setter method for enabledBrowseAll.
     *
     * @param enabledBrowseAll Set for enabledBrowseAll
     */
    public void setEnabledBrowseAll(boolean enabledBrowseAll) {
        this.enabledBrowseAll = enabledBrowseAll;
    }

    /**
     * Getter method for enabledRegisterAll.
     *
     * @return the enabledRegisterAll
     */
    public boolean isEnabledRegisterAll() {
        return enabledRegisterAll;
    }

    /**
     * Setter method for enabledRegisterAll.
     *
     * @param enabledRegisterAll Set for enabledRegisterAll
     */
    public void setEnabledRegisterAll(boolean enabledRegisterAll) {
        this.enabledRegisterAll = enabledRegisterAll;
    }

    /**
     * Getter method for enabledComAdm.
     *
     * @return the enabledComAdm
     */
    public boolean isEnabledComAdm() {
        return enabledComAdm;
    }

    /**
     * Setter method for enabledComAdm.
     *
     * @param enabledComAdm Set for enabledComAdm
     */
    public void setEnabledComAdm(boolean enabledComAdm) {
        this.enabledComAdm = enabledComAdm;
    }

    /**
     * Getter method for enabledBhtLockAut.
     *
     * @return the enabledBhtLockAut
     */
    public boolean isEnabledBhtLockAut() {
        return enabledBhtLockAut;
    }

    /**
     * Setter method for enabledBhtLockAut.
     *
     * @param enabledBhtLockAut Set for enabledBhtLockAut
     */
    public void setEnabledBhtLockAut(boolean enabledBhtLockAut) {
        this.enabledBhtLockAut = enabledBhtLockAut;
    }

    /**
     * Getter method for enabledMaAgentB.
     *
     * @return the enabledMaAgentB
     */
    public boolean isEnabledMaAgentB() {
        return enabledMaAgentB;
    }

    /**
     * Setter method for enabledMaAgentB.
     *
     * @param enabledMaAgentB Set for enabledMaAgentB
     */
    public void setEnabledMaAgentB(boolean enabledMaAgentB) {
        this.enabledMaAgentB = enabledMaAgentB;
    }

    /**
     * Getter method for enabledMaAgentR.
     *
     * @return the enabledMaAgentR
     */
    public boolean isEnabledMaAgentR() {
        return enabledMaAgentR;
    }

    /**
     * Setter method for enabledMaAgentR.
     *
     * @param enabledMaAgentR Set for enabledMaAgentR
     */
    public void setEnabledMaAgentR(boolean enabledMaAgentR) {
        this.enabledMaAgentR = enabledMaAgentR;
    }

    /**
     * Getter method for enabledMaOtherB.
     *
     * @return the enabledMaOtherB
     */
    public boolean isEnabledMaOtherB() {
        return enabledMaOtherB;
    }

    /**
     * Setter method for enabledMaOtherB.
     *
     * @param enabledMaOtherB Set for enabledMaOtherB
     */
    public void setEnabledMaOtherB(boolean enabledMaOtherB) {
        this.enabledMaOtherB = enabledMaOtherB;
    }

    /**
     * Getter method for enabledMaOtherR.
     *
     * @return the enabledMaOtherR
     */
    public boolean isEnabledMaOtherR() {
        return enabledMaOtherR;
    }

    /**
     * Setter method for enabledMaOtherR.
     *
     * @param enabledMaOtherR Set for enabledMaOtherR
     */
    public void setEnabledMaOtherR(boolean enabledMaOtherR) {
        this.enabledMaOtherR = enabledMaOtherR;
    }

    /**
     * Getter method for enabledDocR.
     *
     * @return the enabledDocR
     */
    public boolean isEnabledDocR() {
        return enabledDocR;
    }

    /**
     * Setter method for enabledDocR.
     *
     * @param enabledDocR Set for enabledDocR
     */
    public void setEnabledDocR(boolean enabledDocR) {
        this.enabledDocR = enabledDocR;
    }

    /**
     * Getter method for enabledShipActR.
     *
     * @return the enabledShipActR
     */
    public boolean isEnabledShipActR() {
        return enabledShipActR;
    }

    /**
     * Setter method for enabledShipActR.
     *
     * @param enabledShipActR Set for enabledShipActR
     */
    public void setEnabledShipActR(boolean enabledShipActR) {
        this.enabledShipActR = enabledShipActR;
    }

    /**
     * Getter method for enabledPlnAdm.
     *
     * @return the enabledPlnAdm
     */
    public boolean isEnabledPlnAdm() {
        return enabledPlnAdm;
    }

    /**
     * Setter method for enabledPlnAdm.
     *
     * @param enabledPlnAdm Set for enabledPlnAdm
     */
    public void setEnabledPlnAdm(boolean enabledPlnAdm) {
        this.enabledPlnAdm = enabledPlnAdm;
    }

    /**
     * Getter method for enabledExpreqB.
     *
     * @return the enabledExpreqB
     */
    public boolean isEnabledExpreqB() {
        return enabledExpreqB;
    }

    /**
     * Setter method for enabledExpreqB.
     *
     * @param enabledExpreqB Set for enabledExpreqB
     */
    public void setEnabledExpreqB(boolean enabledExpreqB) {
        this.enabledExpreqB = enabledExpreqB;
    }

    /**
     * Getter method for enabledExpreqR.
     *
     * @return the enabledExpreqR
     */
    public boolean isEnabledExpreqR() {
        return enabledExpreqR;
    }

    /**
     * Setter method for enabledExpreqR.
     *
     * @param enabledExpreqR Set for enabledExpreqR
     */
    public void setEnabledExpreqR(boolean enabledExpreqR) {
        this.enabledExpreqR = enabledExpreqR;
    }

    /**
     * Getter method for enabledReqPkgB.
     *
     * @return the enabledReqPkgB
     */
    public boolean isEnabledReqPkgB() {
        return enabledReqPkgB;
    }

    /**
     * Setter method for enabledReqPkgB.
     *
     * @param enabledReqPkgB Set for enabledReqPkgB
     */
    public void setEnabledReqPkgB(boolean enabledReqPkgB) {
        this.enabledReqPkgB = enabledReqPkgB;
    }

    /**
     * Getter method for enabledReqPkgR.
     *
     * @return the enabledReqPkgR
     */
    public boolean isEnabledReqPkgR() {
        return enabledReqPkgR;
    }

    /**
     * Setter method for enabledReqPkgR.
     *
     * @param enabledReqPkgR Set for enabledReqPkgR
     */
    public void setEnabledReqPkgR(boolean enabledReqPkgR) {
        this.enabledReqPkgR = enabledReqPkgR;
    }

    /**
     * Getter method for enabledErtB.
     *
     * @return the enabledErtB
     */
    public boolean isEnabledErtB() {
        return enabledErtB;
    }

    /**
     * Setter method for enabledErtB.
     *
     * @param enabledErtB Set for enabledErtB
     */
    public void setEnabledErtB(boolean enabledErtB) {
        this.enabledErtB = enabledErtB;
    }

    /**
     * Getter method for enabledErtR.
     *
     * @return the enabledErtR
     */
    public boolean isEnabledErtR() {
        return enabledErtR;
    }

    /**
     * Setter method for enabledErtR.
     *
     * @param enabledErtR Set for enabledErtR
     */
    public void setEnabledErtR(boolean enabledErtR) {
        this.enabledErtR = enabledErtR;
    }

    /**
     * Getter method for enabledOrderB.
     *
     * @return the enabledOrderB
     */
    public boolean isEnabledOrderB() {
        return enabledOrderB;
    }

    /**
     * Setter method for enabledOrderB.
     *
     * @param enabledOrderB Set for enabledOrderB
     */
    public void setEnabledOrderB(boolean enabledOrderB) {
        this.enabledOrderB = enabledOrderB;
    }

    /**
     * Getter method for enabledOrderR.
     *
     * @return the enabledOrderR
     */
    public boolean isEnabledOrderR() {
        return enabledOrderR;
    }

    /**
     * Setter method for enabledOrderR.
     *
     * @param enabledOrderR Set for enabledOrderR
     */
    public void setEnabledOrderR(boolean enabledOrderR) {
        this.enabledOrderR = enabledOrderR;
    }

    /**
     * Getter method for enabledPltInstrB.
     *
     * @return the enabledPltInstrB
     */
    public boolean isEnabledPltInstrB() {
        return enabledPltInstrB;
    }

    /**
     * Setter method for enabledPltInstrB.
     *
     * @param enabledPltInstrB Set for enabledPltInstrB
     */
    public void setEnabledPltInstrB(boolean enabledPltInstrB) {
        this.enabledPltInstrB = enabledPltInstrB;
    }

    /**
     * Getter method for enabledPltInstrR.
     *
     * @return the enabledPltInstrR
     */
    public boolean isEnabledPltInstrR() {
        return enabledPltInstrR;
    }

    /**
     * Setter method for enabledPltInstrR.
     *
     * @param enabledPltInstrR Set for enabledPltInstrR
     */
    public void setEnabledPltInstrR(boolean enabledPltInstrR) {
        this.enabledPltInstrR = enabledPltInstrR;
    }

    /**
     * Getter method for enabledMtagB.
     *
     * @return the enabledMtagB
     */
    public boolean isEnabledMtagB() {
        return enabledMtagB;
    }

    /**
     * Setter method for enabledMtagB.
     *
     * @param enabledMtagB Set for enabledMtagB
     */
    public void setEnabledMtagB(boolean enabledMtagB) {
        this.enabledMtagB = enabledMtagB;
    }

    /**
     * Getter method for enabledMtagR.
     *
     * @return the enabledMtagR
     */
    public boolean isEnabledMtagR() {
        return enabledMtagR;
    }

    /**
     * Setter method for enabledMtagR.
     *
     * @param enabledMtagR Set for enabledMtagR
     */
    public void setEnabledMtagR(boolean enabledMtagR) {
        this.enabledMtagR = enabledMtagR;
    }

    /**
     * Getter method for enabledCmlB.
     *
     * @return the enabledCmlB
     */
    public boolean isEnabledCmlB() {
        return enabledCmlB;
    }

    /**
     * Setter method for enabledCmlB.
     *
     * @param enabledCmlB Set for enabledCmlB
     */
    public void setEnabledCmlB(boolean enabledCmlB) {
        this.enabledCmlB = enabledCmlB;
    }

    /**
     * Getter method for enabledCmlR.
     *
     * @return the enabledCmlR
     */
    public boolean isEnabledCmlR() {
        return enabledCmlR;
    }

    /**
     * Setter method for enabledCmlR.
     *
     * @param enabledCmlR Set for enabledCmlR
     */
    public void setEnabledCmlR(boolean enabledCmlR) {
        this.enabledCmlR = enabledCmlR;
    }

    /**
     * Getter method for enabledXtagB.
     *
     * @return the enabledXtagB
     */
    public boolean isEnabledXtagB() {
        return enabledXtagB;
    }

    /**
     * Setter method for enabledXtagB.
     *
     * @param enabledXtagB Set for enabledXtagB
     */
    public void setEnabledXtagB(boolean enabledXtagB) {
        this.enabledXtagB = enabledXtagB;
    }

    /**
     * Getter method for enabledXtagR.
     *
     * @return the enabledXtagR
     */
    public boolean isEnabledXtagR() {
        return enabledXtagR;
    }

    /**
     * Setter method for enabledXtagR.
     *
     * @param enabledXtagR Set for enabledXtagR
     */
    public void setEnabledXtagR(boolean enabledXtagR) {
        this.enabledXtagR = enabledXtagR;
    }

    /**
     * Getter method for enabledCarryOutInB.
     *
     * @return the enabledCarryOutInB
     */
    public boolean isEnabledCarryOutInB() {
        return enabledCarryOutInB;
    }

    /**
     * Setter method for enabledCarryOutInB.
     *
     * @param enabledCarryOutInB Set for enabledCarryOutInB
     */
    public void setEnabledCarryOutInB(boolean enabledCarryOutInB) {
        this.enabledCarryOutInB = enabledCarryOutInB;
    }

    /**
     * Getter method for enabledCarryOutInR.
     *
     * @return the enabledCarryOutInR
     */
    public boolean isEnabledCarryOutInR() {
        return enabledCarryOutInR;
    }

    /**
     * Setter method for enabledCarryOutInR.
     *
     * @param enabledCarryOutInR Set for enabledCarryOutInR
     */
    public void setEnabledCarryOutInR(boolean enabledCarryOutInR) {
        this.enabledCarryOutInR = enabledCarryOutInR;
    }

    /**
     * Getter method for enabledStgInstrB.
     *
     * @return the enabledStgInstrB
     */
    public boolean isEnabledStgInstrB() {
        return enabledStgInstrB;
    }

    /**
     * Setter method for enabledStgInstrB.
     *
     * @param enabledStgInstrB Set for enabledStgInstrB
     */
    public void setEnabledStgInstrB(boolean enabledStgInstrB) {
        this.enabledStgInstrB = enabledStgInstrB;
    }

    /**
     * Getter method for enabledStgInstrR.
     *
     * @return the enabledStgInstrR
     */
    public boolean isEnabledStgInstrR() {
        return enabledStgInstrR;
    }

    /**
     * Setter method for enabledStgInstrR.
     *
     * @param enabledStgInstrR Set for enabledStgInstrR
     */
    public void setEnabledStgInstrR(boolean enabledStgInstrR) {
        this.enabledStgInstrR = enabledStgInstrR;
    }

    /**
     * Getter method for enabledStgActB.
     *
     * @return the enabledStgActB
     */
    public boolean isEnabledStgActB() {
        return enabledStgActB;
    }

    /**
     * Setter method for enabledStgActB.
     *
     * @param enabledStgActB Set for enabledStgActB
     */
    public void setEnabledStgActB(boolean enabledStgActB) {
        this.enabledStgActB = enabledStgActB;
    }

    /**
     * Getter method for enabledStgActR.
     *
     * @return the enabledStgActR
     */
    public boolean isEnabledStgActR() {
        return enabledStgActR;
    }

    /**
     * Setter method for enabledStgActR.
     *
     * @param enabledStgActR Set for enabledStgActR
     */
    public void setEnabledStgActR(boolean enabledStgActR) {
        this.enabledStgActR = enabledStgActR;
    }

    /**
     * Getter method for enabledShipCfrmB.
     *
     * @return the enabledShipCfrmB
     */
    public boolean isEnabledShipCfrmB() {
        return enabledShipCfrmB;
    }

    /**
     * Setter method for enabledShipCfrmB.
     *
     * @param enabledShipCfrmB Set for enabledShipCfrmB
     */
    public void setEnabledShipCfrmB(boolean enabledShipCfrmB) {
        this.enabledShipCfrmB = enabledShipCfrmB;
    }

    /**
     * Getter method for enabledShipCfrmR.
     *
     * @return the enabledShipCfrmR
     */
    public boolean isEnabledShipCfrmR() {
        return enabledShipCfrmR;
    }

    /**
     * Setter method for enabledShipCfrmR.
     *
     * @param enabledShipCfrmR Set for enabledShipCfrmR
     */
    public void setEnabledShipCfrmR(boolean enabledShipCfrmR) {
        this.enabledShipCfrmR = enabledShipCfrmR;
    }

    /**
     * Getter method for enabledPrgsCtrlB.
     *
     * @return the enabledPrgsCtrlB
     */
    public boolean isEnabledPrgsCtrlB() {
        return enabledPrgsCtrlB;
    }

    /**
     * Setter method for enabledPrgsCtrlB.
     *
     * @param enabledPrgsCtrlB Set for enabledPrgsCtrlB
     */
    public void setEnabledPrgsCtrlB(boolean enabledPrgsCtrlB) {
        this.enabledPrgsCtrlB = enabledPrgsCtrlB;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }
}
