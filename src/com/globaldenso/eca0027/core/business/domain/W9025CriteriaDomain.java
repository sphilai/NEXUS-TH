/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of 
 * Actual Item Weight MA .
 * <br/>実測製品重量原単位画面の画面情報を保持するドメインです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025CriteriaDomain extends AbstractDomain{

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * OWNER COM./ 会社コード
     */
    private String ownerComp;

    /**
     * ITEM NO/ 品目番号
     */
    private String itemNo;
    
    /**
     * OWNER COM./ 会社コード
     */
    private String viewOwnerComp;

    /**
     * ITEM NO/ 品目番号
     */
    private String viewItemNo;
    
    /**
     * UNIT OF WEIGHT/ 重量単位
     */
    private String oldWeightUnit;

    /**
     * ACTUAL ITEM WEIGHT/ 実測製品重量
     */
    private String oldNetWeightA;
        
    /**
     * UNIT OF WEIGHT/ 重量単位
     */
    private String weightUnit;

    /**
     * ACTUAL ITEM WEIGHT/ 実測製品重量
     */
    private String netWeightA;
    
    /**
     *Ignore Warning
     */
    private boolean ignoreWarnings;
    
    /**
     * A confirmation dialog message.<br />
     * 確認ダイアログのメッセージ
     */
    private String confirmMsg = "";

    /**
     * Msg code
     */
    private String confirmMsgCd;
    
    /**
     * Update count
     */
    private int updateCount;
    
    /**
     * Update count
     */
    private int createCount;
    
    /**
     * Function Id
     */
    private String functionId;
    

    /**
     * (When the "Y", can handle and continue) treatment continuation flag<br />
     * 処理継続フラグ("Y"の時、継続して処理を行う)
     */
    private String continueFlag;
    
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Server ID<br />
     * サーバーID
     */
    private String serverId;
    
    /**
     * User authority list<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Input Company has auth
     */
    private boolean userAuthForComp;
    
    /**
     * If value is 'N', Register Area disabled.
     */
    private String enableRegister;
    
    /**
     * Item Group No
     */
    private String itemNoGrp;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9025CriteriaDomain() {
    }
    
    /**
     * Getter method for functionId
     * 
     * @return the functionId
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * Setter method for functionId
     *
     * @param functionId Set for functionId
     */
    
    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    /**
     * Getter method for ownerComp
     * 
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * Setter method for ownerComp
     *
     * @param ownerComp Set for ownerComp
     */
    
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * Getter method for itemNo
     * 
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo
     *
     * @param itemNo Set for itemNo
     */
    
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for viewOwnerComp.</p>
     *
     * @return the viewOwnerComp
     */
    public String getViewOwnerComp() {
        return viewOwnerComp;
    }

    /**
     * <p>Setter method for viewOwnerComp.</p>
     *
     * @param viewOwnerComp Set for viewOwnerComp
     */
    public void setViewOwnerComp(String viewOwnerComp) {
        this.viewOwnerComp = viewOwnerComp;
    }

    /**
     * <p>Getter method for viewItemNo.</p>
     *
     * @return the viewItemNo
     */
    public String getViewItemNo() {
        return viewItemNo;
    }

    /**
     * <p>Setter method for viewItemNo.</p>
     *
     * @param viewItemNo Set for viewItemNo
     */
    public void setViewItemNo(String viewItemNo) {
        this.viewItemNo = viewItemNo;
    }

    /**
     * <p>Getter method for oldWeightUnit.</p>
     *
     * @return the oldWeightUnit
     */
    public String getOldWeightUnit() {
        return oldWeightUnit;
    }

    /**
     * <p>Setter method for oldWeightUnit.</p>
     *
     * @param oldWeightUnit Set for oldWeightUnit
     */
    public void setOldWeightUnit(String oldWeightUnit) {
        this.oldWeightUnit = oldWeightUnit;
    }

    /**
     * <p>Getter method for oldNetWeightA.</p>
     *
     * @return the oldNetWeightA
     */
    public String getOldNetWeightA() {
        return oldNetWeightA;
    }

    /**
     * <p>Setter method for oldNetWeightA.</p>
     *
     * @param oldNetWeightA Set for oldNetWeightA
     */
    public void setOldNetWeightA(String oldNetWeightA) {
        this.oldNetWeightA = oldNetWeightA;
    }

    /**
     * Getter method for weightUnit
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit
     *
     * @param weightUnit Set for weightUnit
     */
    
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for netWeightA
     * 
     * @return the netWeightA
     */
    public String getNetWeightA() {
        return netWeightA;
    }

    /**
     * Setter method for netWeightA
     *
     * @param netWeightA Set for netWeightA
     */
    
    public void setNetWeightA(String netWeightA) {
        this.netWeightA = netWeightA;
    }

    /**
     * Getter method for confirmMsgCd
     * 
     * @return the confirmMsgCd
     */
    public String getConfirmMsgCd() {
        return confirmMsgCd;
    }

    /**
     * Setter method for confirmMsgCd
     *
     * @param confirmMsgCd Set for confirmMsgCd
     */
    
    public void setConfirmMsgCd(String confirmMsgCd) {
        this.confirmMsgCd = confirmMsgCd;
    }

    /**
     * Getter method for updateCount
     * 
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * Setter method for updateCount
     *
     * @param updateCount Set for updateCount
     */
    
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * Getter method for createCount
     * 
     * @return the createCount
     */
    public int getCreateCount() {
        return createCount;
    }

    /**
     * Setter method for createCount
     *
     * @param createCount Set for createCount
     */
    
    public void setCreateCount(int createCount) {
        this.createCount = createCount;
    }

    /**
     * Getter method for confirmMsg
     * 
     * @return the confirmMsg
     */
    public String getConfirmMsg() {
        return confirmMsg;
    }

    /**
     * Setter method for confirmMsg
     *
     * @param confirmMsg Set for confirmMsg
     */
    
    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    /**
     * <p>Getter method for ignoreWarnings.</p>
     *
     * @return the ignoreWarnings
     */
    public boolean isIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * <p>Setter method for ignoreWarnings.</p>
     *
     * @param ignoreWarnings Set for ignoreWarnings
     */
    public void setIgnoreWarnings(boolean ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Getter method for enableRegister.</p>
     *
     * @return the enableRegister
     */
    public String getEnableRegister() {
        return enableRegister;
    }

    /**
     * <p>Setter method for enableRegister.</p>
     *
     * @param enableRegister Set for enableRegister
     */
    public void setEnableRegister(String enableRegister) {
        this.enableRegister = enableRegister;
    }

    /**
     * <p>Getter method for continueFlag.</p>
     *
     * @return the continueFlag
     */
    public String getContinueFlag() {
        return continueFlag;
    }

    /**
     * <p>Setter method for continueFlag.</p>
     *
     * @param continueFlag Set for continueFlag
     */
    public void setContinueFlag(String continueFlag) {
        this.continueFlag = continueFlag;
    }

    /**
     * <p>Getter method for screenDateFormat.</p>
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * <p>Setter method for screenDateFormat.</p>
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * <p>Getter method for serverId.</p>
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>Setter method for serverId.</p>
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * <p>Getter method for userAuthForComp.</p>
     *
     * @return the userAuthForComp
     */
    public boolean isUserAuthForComp() {
        return userAuthForComp;
    }

    /**
     * <p>Setter method for userAuthForComp.</p>
     *
     * @param userAuthForComp Set for userAuthForComp
     */
    public void setUserAuthForComp(boolean userAuthForComp) {
        this.userAuthForComp = userAuthForComp;
    }

    /**
     * <p>Getter method for itemNoGrp.</p>
     *
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * <p>Setter method for itemNoGrp.</p>
     *
     * @param itemNoGrp Set for itemNoGrp
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

}